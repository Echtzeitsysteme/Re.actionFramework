package org.reaction.dsl.validation;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.reaction.dsl.reactionLanguage.Agent;
import org.reaction.dsl.reactionLanguage.impl.AbstractAgentImpl;
import org.reaction.dsl.reactionLanguage.impl.AgentInstanceImpl;
import org.reaction.dsl.scoping.ReactionLanguageQualifiedNameProvider;

import com.google.common.collect.Maps;

public class ReactionLanguageNamesAreUniqueValidationHelper extends NamesAreUniqueValidationHelper {

	private Map<QualifiedName, IEObjectDescription> nameToDescription;

	@Override
	protected void checkDescriptionForDuplicatedName(IEObjectDescription description,
			Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName,
			ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		QualifiedName qualifiedName = description.getName(); //ReactionLanguageQualifiedNameProvider.getQualifiedName(object); 
		if (nameToDescription == null) {
			nameToDescription = Maps.newHashMap();
		} else {
			boolean isAgentInstance = false;
			IEObjectDescription prevDescription = nameToDescription.get(qualifiedName);
			if (object instanceof AgentInstanceImpl) {
				isAgentInstance = true;
			}
			if (nameToDescription.containsKey(qualifiedName)) {
				EClass eClass = object.eClass();
				if (prevDescription != null) {
					EObject prevObject = prevDescription.getEObjectOrProxy();
					EClass prevEClass = prevObject.eClass();

					createDuplicateNameError(prevDescription, prevEClass, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, eClass, acceptor);
			} else {
				if (!isAgentInstance) {
					nameToDescription.put(qualifiedName, description);
				}
			}
		}
	}

	@Override
	/**
	 * Build the error message for duplicated names. The default implementation will
	 * provide error messages of this form:
	 * <ul>
	 * <li>Duplicate Entity 'Sample'</li>
	 * <li>Duplicate Property 'Sample' in Entity 'EntityName'</li>
	 * </ul>
	 * If the container information will be helpful to locate the error or to
	 * understand the error it will be used, otherwise only the simple format will
	 * be build. Clients may override different methods that influence the error
	 * message.
	 * 
	 * @see #getNameFeature(EObject)
	 * @see #getTypeLabel(EClass)
	 * @see #getContainerForErrorMessage(EObject)
	 * @see #isContainerInformationHelpful(IEObjectDescription, String)
	 * @see #isContainerInformationHelpful(IEObjectDescription, EObject, String,
	 *      EStructuralFeature)
	 */
	public String getDuplicateNameErrorMessage(IEObjectDescription description, EClass clusterType,
			EStructuralFeature feature) {
		EObject object = description.getEObjectOrProxy();
		String shortName = String.valueOf(feature != null ? object.eGet(feature) : "<unnamed>");
		StringBuilder result = new StringBuilder(64);
		result.append("Duplicate Reference to");
		result.append(" '");
		result.append(shortName);
		result.append("'");
		if (isContainerInformationHelpful(description, shortName)) {
			EObject container = getContainerForErrorMessage(object);
			if (container != null) {
				String containerTypeLabel = getTypeLabel(container.eClass());
				EStructuralFeature containerNameFeature = getNameFeature(container);
				if (isContainerInformationHelpful(description, container, containerTypeLabel, containerNameFeature)) {
					result.append(" in ");
					result.append(containerTypeLabel);
					if (containerNameFeature != null) {
						String containerName = String.valueOf(container.eGet(containerNameFeature));
						if (containerName != null) {
							result.append(" '");
							result.append(containerName);
							result.append("'");
						}
					}
				}
			}
		}
		return result.toString();
	}
}
