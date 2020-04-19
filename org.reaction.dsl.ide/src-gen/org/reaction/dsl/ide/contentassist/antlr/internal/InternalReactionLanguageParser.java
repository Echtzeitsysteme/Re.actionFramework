package org.reaction.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.reaction.dsl.services.ReactionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_NULL", "RULE_SL_COMMENT", "RULE_NEWLINE", "RULE_ID", "RULE_ANYTHING", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'sqrt'", "'abs'", "'=>'", "'<=>'", "'//'", "':'", "','", "'agent'", "';'", "']'", "'('", "')'", "'complex'", "'{'", "'}'", "'rule'", "'@'", "'_'", "'.'", "'var'", "'='", "'init'", "'observe'", "'terminate'", "'time'", "'iterations'", "'matches'", "'*'", "'/'", "'^'", "'E'", "'['"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ANYTHING=9;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=10;
    public static final int RULE_NULL=5;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalReactionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReactionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReactionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReactionLanguage.g"; }


    	private ReactionLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReactionLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleReactionModel"
    // InternalReactionLanguage.g:53:1: entryRuleReactionModel : ruleReactionModel EOF ;
    public final void entryRuleReactionModel() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:54:1: ( ruleReactionModel EOF )
            // InternalReactionLanguage.g:55:1: ruleReactionModel EOF
            {
             before(grammarAccess.getReactionModelRule()); 
            pushFollow(FOLLOW_1);
            ruleReactionModel();

            state._fsp--;

             after(grammarAccess.getReactionModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReactionModel"


    // $ANTLR start "ruleReactionModel"
    // InternalReactionLanguage.g:62:1: ruleReactionModel : ( ( rule__ReactionModel__Group__0 )* ) ;
    public final void ruleReactionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:66:2: ( ( ( rule__ReactionModel__Group__0 )* ) )
            // InternalReactionLanguage.g:67:2: ( ( rule__ReactionModel__Group__0 )* )
            {
            // InternalReactionLanguage.g:67:2: ( ( rule__ReactionModel__Group__0 )* )
            // InternalReactionLanguage.g:68:3: ( rule__ReactionModel__Group__0 )*
            {
             before(grammarAccess.getReactionModelAccess().getGroup()); 
            // InternalReactionLanguage.g:69:3: ( rule__ReactionModel__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==28||LA1_0==31||LA1_0==35||(LA1_0>=37 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionLanguage.g:69:4: rule__ReactionModel__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ReactionModel__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReactionModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactionModel"


    // $ANTLR start "entryRuleComponent"
    // InternalReactionLanguage.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:79:1: ( ruleComponent EOF )
            // InternalReactionLanguage.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalReactionLanguage.g:87:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:91:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalReactionLanguage.g:92:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalReactionLanguage.g:92:2: ( ( rule__Component__Alternatives ) )
            // InternalReactionLanguage.g:93:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalReactionLanguage.g:94:3: ( rule__Component__Alternatives )
            // InternalReactionLanguage.g:94:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAgent"
    // InternalReactionLanguage.g:103:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:104:1: ( ruleAgent EOF )
            // InternalReactionLanguage.g:105:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalReactionLanguage.g:112:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:116:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalReactionLanguage.g:117:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalReactionLanguage.g:117:2: ( ( rule__Agent__Group__0 ) )
            // InternalReactionLanguage.g:118:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalReactionLanguage.g:119:3: ( rule__Agent__Group__0 )
            // InternalReactionLanguage.g:119:4: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleAgentDeclaration"
    // InternalReactionLanguage.g:128:1: entryRuleAgentDeclaration : ruleAgentDeclaration EOF ;
    public final void entryRuleAgentDeclaration() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:129:1: ( ruleAgentDeclaration EOF )
            // InternalReactionLanguage.g:130:1: ruleAgentDeclaration EOF
            {
             before(grammarAccess.getAgentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentDeclaration();

            state._fsp--;

             after(grammarAccess.getAgentDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgentDeclaration"


    // $ANTLR start "ruleAgentDeclaration"
    // InternalReactionLanguage.g:137:1: ruleAgentDeclaration : ( ( rule__AgentDeclaration__Group__0 ) ) ;
    public final void ruleAgentDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:141:2: ( ( ( rule__AgentDeclaration__Group__0 ) ) )
            // InternalReactionLanguage.g:142:2: ( ( rule__AgentDeclaration__Group__0 ) )
            {
            // InternalReactionLanguage.g:142:2: ( ( rule__AgentDeclaration__Group__0 ) )
            // InternalReactionLanguage.g:143:3: ( rule__AgentDeclaration__Group__0 )
            {
             before(grammarAccess.getAgentDeclarationAccess().getGroup()); 
            // InternalReactionLanguage.g:144:3: ( rule__AgentDeclaration__Group__0 )
            // InternalReactionLanguage.g:144:4: rule__AgentDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentDeclaration"


    // $ANTLR start "entryRuleAgentInstance"
    // InternalReactionLanguage.g:153:1: entryRuleAgentInstance : ruleAgentInstance EOF ;
    public final void entryRuleAgentInstance() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:154:1: ( ruleAgentInstance EOF )
            // InternalReactionLanguage.g:155:1: ruleAgentInstance EOF
            {
             before(grammarAccess.getAgentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleAgentInstance();

            state._fsp--;

             after(grammarAccess.getAgentInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgentInstance"


    // $ANTLR start "ruleAgentInstance"
    // InternalReactionLanguage.g:162:1: ruleAgentInstance : ( ( rule__AgentInstance__Group__0 ) ) ;
    public final void ruleAgentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:166:2: ( ( ( rule__AgentInstance__Group__0 ) ) )
            // InternalReactionLanguage.g:167:2: ( ( rule__AgentInstance__Group__0 ) )
            {
            // InternalReactionLanguage.g:167:2: ( ( rule__AgentInstance__Group__0 ) )
            // InternalReactionLanguage.g:168:3: ( rule__AgentInstance__Group__0 )
            {
             before(grammarAccess.getAgentInstanceAccess().getGroup()); 
            // InternalReactionLanguage.g:169:3: ( rule__AgentInstance__Group__0 )
            // InternalReactionLanguage.g:169:4: rule__AgentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentInstance"


    // $ANTLR start "entryRuleSite"
    // InternalReactionLanguage.g:178:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:179:1: ( ruleSite EOF )
            // InternalReactionLanguage.g:180:1: ruleSite EOF
            {
             before(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getSiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalReactionLanguage.g:187:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:191:2: ( ( ( rule__Site__Group__0 ) ) )
            // InternalReactionLanguage.g:192:2: ( ( rule__Site__Group__0 ) )
            {
            // InternalReactionLanguage.g:192:2: ( ( rule__Site__Group__0 ) )
            // InternalReactionLanguage.g:193:3: ( rule__Site__Group__0 )
            {
             before(grammarAccess.getSiteAccess().getGroup()); 
            // InternalReactionLanguage.g:194:3: ( rule__Site__Group__0 )
            // InternalReactionLanguage.g:194:4: rule__Site__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionLanguage.g:203:1: entryRuleSiteState : ruleSiteState EOF ;
    public final void entryRuleSiteState() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:204:1: ( ruleSiteState EOF )
            // InternalReactionLanguage.g:205:1: ruleSiteState EOF
            {
             before(grammarAccess.getSiteStateRule()); 
            pushFollow(FOLLOW_1);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSiteStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteState"


    // $ANTLR start "ruleSiteState"
    // InternalReactionLanguage.g:212:1: ruleSiteState : ( ( rule__SiteState__NameAssignment ) ) ;
    public final void ruleSiteState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:216:2: ( ( ( rule__SiteState__NameAssignment ) ) )
            // InternalReactionLanguage.g:217:2: ( ( rule__SiteState__NameAssignment ) )
            {
            // InternalReactionLanguage.g:217:2: ( ( rule__SiteState__NameAssignment ) )
            // InternalReactionLanguage.g:218:3: ( rule__SiteState__NameAssignment )
            {
             before(grammarAccess.getSiteStateAccess().getNameAssignment()); 
            // InternalReactionLanguage.g:219:3: ( rule__SiteState__NameAssignment )
            // InternalReactionLanguage.g:219:4: rule__SiteState__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SiteState__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSiteStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteState"


    // $ANTLR start "entryRuleComplex"
    // InternalReactionLanguage.g:228:1: entryRuleComplex : ruleComplex EOF ;
    public final void entryRuleComplex() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:229:1: ( ruleComplex EOF )
            // InternalReactionLanguage.g:230:1: ruleComplex EOF
            {
             before(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            ruleComplex();

            state._fsp--;

             after(grammarAccess.getComplexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalReactionLanguage.g:237:1: ruleComplex : ( ( rule__Complex__Group__0 ) ) ;
    public final void ruleComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:241:2: ( ( ( rule__Complex__Group__0 ) ) )
            // InternalReactionLanguage.g:242:2: ( ( rule__Complex__Group__0 ) )
            {
            // InternalReactionLanguage.g:242:2: ( ( rule__Complex__Group__0 ) )
            // InternalReactionLanguage.g:243:3: ( rule__Complex__Group__0 )
            {
             before(grammarAccess.getComplexAccess().getGroup()); 
            // InternalReactionLanguage.g:244:3: ( rule__Complex__Group__0 )
            // InternalReactionLanguage.g:244:4: rule__Complex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleComplexElement"
    // InternalReactionLanguage.g:253:1: entryRuleComplexElement : ruleComplexElement EOF ;
    public final void entryRuleComplexElement() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:254:1: ( ruleComplexElement EOF )
            // InternalReactionLanguage.g:255:1: ruleComplexElement EOF
            {
             before(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexElement();

            state._fsp--;

             after(grammarAccess.getComplexElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexElement"


    // $ANTLR start "ruleComplexElement"
    // InternalReactionLanguage.g:262:1: ruleComplexElement : ( ( rule__ComplexElement__Alternatives ) ) ;
    public final void ruleComplexElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:266:2: ( ( ( rule__ComplexElement__Alternatives ) ) )
            // InternalReactionLanguage.g:267:2: ( ( rule__ComplexElement__Alternatives ) )
            {
            // InternalReactionLanguage.g:267:2: ( ( rule__ComplexElement__Alternatives ) )
            // InternalReactionLanguage.g:268:3: ( rule__ComplexElement__Alternatives )
            {
             before(grammarAccess.getComplexElementAccess().getAlternatives()); 
            // InternalReactionLanguage.g:269:3: ( rule__ComplexElement__Alternatives )
            // InternalReactionLanguage.g:269:4: rule__ComplexElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexElement"


    // $ANTLR start "entryRuleSignature"
    // InternalReactionLanguage.g:278:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:279:1: ( ruleSignature EOF )
            // InternalReactionLanguage.g:280:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalReactionLanguage.g:287:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:291:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalReactionLanguage.g:292:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalReactionLanguage.g:292:2: ( ( rule__Signature__Group__0 ) )
            // InternalReactionLanguage.g:293:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalReactionLanguage.g:294:3: ( rule__Signature__Group__0 )
            // InternalReactionLanguage.g:294:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleRule"
    // InternalReactionLanguage.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:304:1: ( ruleRule EOF )
            // InternalReactionLanguage.g:305:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalReactionLanguage.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalReactionLanguage.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalReactionLanguage.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalReactionLanguage.g:318:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalReactionLanguage.g:319:3: ( rule__Rule__Group__0 )
            // InternalReactionLanguage.g:319:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleHead"
    // InternalReactionLanguage.g:328:1: entryRuleRuleHead : ruleRuleHead EOF ;
    public final void entryRuleRuleHead() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:329:1: ( ruleRuleHead EOF )
            // InternalReactionLanguage.g:330:1: ruleRuleHead EOF
            {
             before(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleHeadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleHead"


    // $ANTLR start "ruleRuleHead"
    // InternalReactionLanguage.g:337:1: ruleRuleHead : ( ( rule__RuleHead__Group__0 ) ) ;
    public final void ruleRuleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:341:2: ( ( ( rule__RuleHead__Group__0 ) ) )
            // InternalReactionLanguage.g:342:2: ( ( rule__RuleHead__Group__0 ) )
            {
            // InternalReactionLanguage.g:342:2: ( ( rule__RuleHead__Group__0 ) )
            // InternalReactionLanguage.g:343:3: ( rule__RuleHead__Group__0 )
            {
             before(grammarAccess.getRuleHeadAccess().getGroup()); 
            // InternalReactionLanguage.g:344:3: ( rule__RuleHead__Group__0 )
            // InternalReactionLanguage.g:344:4: rule__RuleHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleHeadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleHead"


    // $ANTLR start "entryRuleRuleBody"
    // InternalReactionLanguage.g:353:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:354:1: ( ruleRuleBody EOF )
            // InternalReactionLanguage.g:355:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalReactionLanguage.g:362:1: ruleRuleBody : ( ( rule__RuleBody__Group__0 ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:366:2: ( ( ( rule__RuleBody__Group__0 ) ) )
            // InternalReactionLanguage.g:367:2: ( ( rule__RuleBody__Group__0 ) )
            {
            // InternalReactionLanguage.g:367:2: ( ( rule__RuleBody__Group__0 ) )
            // InternalReactionLanguage.g:368:3: ( rule__RuleBody__Group__0 )
            {
             before(grammarAccess.getRuleBodyAccess().getGroup()); 
            // InternalReactionLanguage.g:369:3: ( rule__RuleBody__Group__0 )
            // InternalReactionLanguage.g:369:4: rule__RuleBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRates"
    // InternalReactionLanguage.g:378:1: entryRuleRates : ruleRates EOF ;
    public final void entryRuleRates() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:379:1: ( ruleRates EOF )
            // InternalReactionLanguage.g:380:1: ruleRates EOF
            {
             before(grammarAccess.getRatesRule()); 
            pushFollow(FOLLOW_1);
            ruleRates();

            state._fsp--;

             after(grammarAccess.getRatesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRates"


    // $ANTLR start "ruleRates"
    // InternalReactionLanguage.g:387:1: ruleRates : ( ( rule__Rates__Group__0 ) ) ;
    public final void ruleRates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:391:2: ( ( ( rule__Rates__Group__0 ) ) )
            // InternalReactionLanguage.g:392:2: ( ( rule__Rates__Group__0 ) )
            {
            // InternalReactionLanguage.g:392:2: ( ( rule__Rates__Group__0 ) )
            // InternalReactionLanguage.g:393:3: ( rule__Rates__Group__0 )
            {
             before(grammarAccess.getRatesAccess().getGroup()); 
            // InternalReactionLanguage.g:394:3: ( rule__Rates__Group__0 )
            // InternalReactionLanguage.g:394:4: rule__Rates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRates"


    // $ANTLR start "entryRulePattern"
    // InternalReactionLanguage.g:403:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:404:1: ( rulePattern EOF )
            // InternalReactionLanguage.g:405:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalReactionLanguage.g:412:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:416:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalReactionLanguage.g:417:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalReactionLanguage.g:417:2: ( ( rule__Pattern__Alternatives ) )
            // InternalReactionLanguage.g:418:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalReactionLanguage.g:419:3: ( rule__Pattern__Alternatives )
            // InternalReactionLanguage.g:419:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBonds"
    // InternalReactionLanguage.g:428:1: entryRuleBonds : ruleBonds EOF ;
    public final void entryRuleBonds() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:429:1: ( ruleBonds EOF )
            // InternalReactionLanguage.g:430:1: ruleBonds EOF
            {
             before(grammarAccess.getBondsRule()); 
            pushFollow(FOLLOW_1);
            ruleBonds();

            state._fsp--;

             after(grammarAccess.getBondsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBonds"


    // $ANTLR start "ruleBonds"
    // InternalReactionLanguage.g:437:1: ruleBonds : ( ( rule__Bonds__Group__0 ) ) ;
    public final void ruleBonds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:441:2: ( ( ( rule__Bonds__Group__0 ) ) )
            // InternalReactionLanguage.g:442:2: ( ( rule__Bonds__Group__0 ) )
            {
            // InternalReactionLanguage.g:442:2: ( ( rule__Bonds__Group__0 ) )
            // InternalReactionLanguage.g:443:3: ( rule__Bonds__Group__0 )
            {
             before(grammarAccess.getBondsAccess().getGroup()); 
            // InternalReactionLanguage.g:444:3: ( rule__Bonds__Group__0 )
            // InternalReactionLanguage.g:444:4: rule__Bonds__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bonds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBondsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBonds"


    // $ANTLR start "entryRuleBond"
    // InternalReactionLanguage.g:453:1: entryRuleBond : ruleBond EOF ;
    public final void entryRuleBond() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:454:1: ( ruleBond EOF )
            // InternalReactionLanguage.g:455:1: ruleBond EOF
            {
             before(grammarAccess.getBondRule()); 
            pushFollow(FOLLOW_1);
            ruleBond();

            state._fsp--;

             after(grammarAccess.getBondRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBond"


    // $ANTLR start "ruleBond"
    // InternalReactionLanguage.g:462:1: ruleBond : ( ( rule__Bond__Group__0 ) ) ;
    public final void ruleBond() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:466:2: ( ( ( rule__Bond__Group__0 ) ) )
            // InternalReactionLanguage.g:467:2: ( ( rule__Bond__Group__0 ) )
            {
            // InternalReactionLanguage.g:467:2: ( ( rule__Bond__Group__0 ) )
            // InternalReactionLanguage.g:468:3: ( rule__Bond__Group__0 )
            {
             before(grammarAccess.getBondAccess().getGroup()); 
            // InternalReactionLanguage.g:469:3: ( rule__Bond__Group__0 )
            // InternalReactionLanguage.g:469:4: rule__Bond__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bond__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBondAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBond"


    // $ANTLR start "entryRuleBondSideOrWildcard"
    // InternalReactionLanguage.g:478:1: entryRuleBondSideOrWildcard : ruleBondSideOrWildcard EOF ;
    public final void entryRuleBondSideOrWildcard() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:479:1: ( ruleBondSideOrWildcard EOF )
            // InternalReactionLanguage.g:480:1: ruleBondSideOrWildcard EOF
            {
             before(grammarAccess.getBondSideOrWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleBondSideOrWildcard();

            state._fsp--;

             after(grammarAccess.getBondSideOrWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBondSideOrWildcard"


    // $ANTLR start "ruleBondSideOrWildcard"
    // InternalReactionLanguage.g:487:1: ruleBondSideOrWildcard : ( ( rule__BondSideOrWildcard__Alternatives ) ) ;
    public final void ruleBondSideOrWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:491:2: ( ( ( rule__BondSideOrWildcard__Alternatives ) ) )
            // InternalReactionLanguage.g:492:2: ( ( rule__BondSideOrWildcard__Alternatives ) )
            {
            // InternalReactionLanguage.g:492:2: ( ( rule__BondSideOrWildcard__Alternatives ) )
            // InternalReactionLanguage.g:493:3: ( rule__BondSideOrWildcard__Alternatives )
            {
             before(grammarAccess.getBondSideOrWildcardAccess().getAlternatives()); 
            // InternalReactionLanguage.g:494:3: ( rule__BondSideOrWildcard__Alternatives )
            // InternalReactionLanguage.g:494:4: rule__BondSideOrWildcard__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BondSideOrWildcard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBondSideOrWildcardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBondSideOrWildcard"


    // $ANTLR start "entryRuleWildcard"
    // InternalReactionLanguage.g:503:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:504:1: ( ruleWildcard EOF )
            // InternalReactionLanguage.g:505:1: ruleWildcard EOF
            {
             before(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalReactionLanguage.g:512:1: ruleWildcard : ( ( rule__Wildcard__Alternatives ) ) ;
    public final void ruleWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:516:2: ( ( ( rule__Wildcard__Alternatives ) ) )
            // InternalReactionLanguage.g:517:2: ( ( rule__Wildcard__Alternatives ) )
            {
            // InternalReactionLanguage.g:517:2: ( ( rule__Wildcard__Alternatives ) )
            // InternalReactionLanguage.g:518:3: ( rule__Wildcard__Alternatives )
            {
             before(grammarAccess.getWildcardAccess().getAlternatives()); 
            // InternalReactionLanguage.g:519:3: ( rule__Wildcard__Alternatives )
            // InternalReactionLanguage.g:519:4: rule__Wildcard__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Wildcard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWildcardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleBondSide"
    // InternalReactionLanguage.g:528:1: entryRuleBondSide : ruleBondSide EOF ;
    public final void entryRuleBondSide() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:529:1: ( ruleBondSide EOF )
            // InternalReactionLanguage.g:530:1: ruleBondSide EOF
            {
             before(grammarAccess.getBondSideRule()); 
            pushFollow(FOLLOW_1);
            ruleBondSide();

            state._fsp--;

             after(grammarAccess.getBondSideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBondSide"


    // $ANTLR start "ruleBondSide"
    // InternalReactionLanguage.g:537:1: ruleBondSide : ( ( rule__BondSide__Group__0 ) ) ;
    public final void ruleBondSide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:541:2: ( ( ( rule__BondSide__Group__0 ) ) )
            // InternalReactionLanguage.g:542:2: ( ( rule__BondSide__Group__0 ) )
            {
            // InternalReactionLanguage.g:542:2: ( ( rule__BondSide__Group__0 ) )
            // InternalReactionLanguage.g:543:3: ( rule__BondSide__Group__0 )
            {
             before(grammarAccess.getBondSideAccess().getGroup()); 
            // InternalReactionLanguage.g:544:3: ( rule__BondSide__Group__0 )
            // InternalReactionLanguage.g:544:4: rule__BondSide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBondSideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBondSide"


    // $ANTLR start "entryRuleSiteInstance"
    // InternalReactionLanguage.g:553:1: entryRuleSiteInstance : ruleSiteInstance EOF ;
    public final void entryRuleSiteInstance() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:554:1: ( ruleSiteInstance EOF )
            // InternalReactionLanguage.g:555:1: ruleSiteInstance EOF
            {
             before(grammarAccess.getSiteInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleSiteInstance();

            state._fsp--;

             after(grammarAccess.getSiteInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteInstance"


    // $ANTLR start "ruleSiteInstance"
    // InternalReactionLanguage.g:562:1: ruleSiteInstance : ( ( rule__SiteInstance__Group__0 ) ) ;
    public final void ruleSiteInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:566:2: ( ( ( rule__SiteInstance__Group__0 ) ) )
            // InternalReactionLanguage.g:567:2: ( ( rule__SiteInstance__Group__0 ) )
            {
            // InternalReactionLanguage.g:567:2: ( ( rule__SiteInstance__Group__0 ) )
            // InternalReactionLanguage.g:568:3: ( rule__SiteInstance__Group__0 )
            {
             before(grammarAccess.getSiteInstanceAccess().getGroup()); 
            // InternalReactionLanguage.g:569:3: ( rule__SiteInstance__Group__0 )
            // InternalReactionLanguage.g:569:4: rule__SiteInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteInstance"


    // $ANTLR start "entryRuleSiteInstanceState"
    // InternalReactionLanguage.g:578:1: entryRuleSiteInstanceState : ruleSiteInstanceState EOF ;
    public final void entryRuleSiteInstanceState() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:579:1: ( ruleSiteInstanceState EOF )
            // InternalReactionLanguage.g:580:1: ruleSiteInstanceState EOF
            {
             before(grammarAccess.getSiteInstanceStateRule()); 
            pushFollow(FOLLOW_1);
            ruleSiteInstanceState();

            state._fsp--;

             after(grammarAccess.getSiteInstanceStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSiteInstanceState"


    // $ANTLR start "ruleSiteInstanceState"
    // InternalReactionLanguage.g:587:1: ruleSiteInstanceState : ( ( rule__SiteInstanceState__Group__0 ) ) ;
    public final void ruleSiteInstanceState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:591:2: ( ( ( rule__SiteInstanceState__Group__0 ) ) )
            // InternalReactionLanguage.g:592:2: ( ( rule__SiteInstanceState__Group__0 ) )
            {
            // InternalReactionLanguage.g:592:2: ( ( rule__SiteInstanceState__Group__0 ) )
            // InternalReactionLanguage.g:593:3: ( rule__SiteInstanceState__Group__0 )
            {
             before(grammarAccess.getSiteInstanceStateAccess().getGroup()); 
            // InternalReactionLanguage.g:594:3: ( rule__SiteInstanceState__Group__0 )
            // InternalReactionLanguage.g:594:4: rule__SiteInstanceState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstanceState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteInstanceStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSiteInstanceState"


    // $ANTLR start "entryRuleVariable"
    // InternalReactionLanguage.g:603:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:604:1: ( ruleVariable EOF )
            // InternalReactionLanguage.g:605:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalReactionLanguage.g:612:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:616:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalReactionLanguage.g:617:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalReactionLanguage.g:617:2: ( ( rule__Variable__Group__0 ) )
            // InternalReactionLanguage.g:618:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalReactionLanguage.g:619:3: ( rule__Variable__Group__0 )
            // InternalReactionLanguage.g:619:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInitialisation"
    // InternalReactionLanguage.g:628:1: entryRuleInitialisation : ruleInitialisation EOF ;
    public final void entryRuleInitialisation() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:629:1: ( ruleInitialisation EOF )
            // InternalReactionLanguage.g:630:1: ruleInitialisation EOF
            {
             before(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialisation();

            state._fsp--;

             after(grammarAccess.getInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalReactionLanguage.g:637:1: ruleInitialisation : ( ( rule__Initialisation__Group__0 ) ) ;
    public final void ruleInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:641:2: ( ( ( rule__Initialisation__Group__0 ) ) )
            // InternalReactionLanguage.g:642:2: ( ( rule__Initialisation__Group__0 ) )
            {
            // InternalReactionLanguage.g:642:2: ( ( rule__Initialisation__Group__0 ) )
            // InternalReactionLanguage.g:643:3: ( rule__Initialisation__Group__0 )
            {
             before(grammarAccess.getInitialisationAccess().getGroup()); 
            // InternalReactionLanguage.g:644:3: ( rule__Initialisation__Group__0 )
            // InternalReactionLanguage.g:644:4: rule__Initialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleInitialisationHead"
    // InternalReactionLanguage.g:653:1: entryRuleInitialisationHead : ruleInitialisationHead EOF ;
    public final void entryRuleInitialisationHead() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:654:1: ( ruleInitialisationHead EOF )
            // InternalReactionLanguage.g:655:1: ruleInitialisationHead EOF
            {
             before(grammarAccess.getInitialisationHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialisationHead();

            state._fsp--;

             after(grammarAccess.getInitialisationHeadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialisationHead"


    // $ANTLR start "ruleInitialisationHead"
    // InternalReactionLanguage.g:662:1: ruleInitialisationHead : ( ( rule__InitialisationHead__Group__0 ) ) ;
    public final void ruleInitialisationHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:666:2: ( ( ( rule__InitialisationHead__Group__0 ) ) )
            // InternalReactionLanguage.g:667:2: ( ( rule__InitialisationHead__Group__0 ) )
            {
            // InternalReactionLanguage.g:667:2: ( ( rule__InitialisationHead__Group__0 ) )
            // InternalReactionLanguage.g:668:3: ( rule__InitialisationHead__Group__0 )
            {
             before(grammarAccess.getInitialisationHeadAccess().getGroup()); 
            // InternalReactionLanguage.g:669:3: ( rule__InitialisationHead__Group__0 )
            // InternalReactionLanguage.g:669:4: rule__InitialisationHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationHeadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialisationHead"


    // $ANTLR start "entryRuleInitialisationBody"
    // InternalReactionLanguage.g:678:1: entryRuleInitialisationBody : ruleInitialisationBody EOF ;
    public final void entryRuleInitialisationBody() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:679:1: ( ruleInitialisationBody EOF )
            // InternalReactionLanguage.g:680:1: ruleInitialisationBody EOF
            {
             before(grammarAccess.getInitialisationBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialisationBody();

            state._fsp--;

             after(grammarAccess.getInitialisationBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialisationBody"


    // $ANTLR start "ruleInitialisationBody"
    // InternalReactionLanguage.g:687:1: ruleInitialisationBody : ( ( rule__InitialisationBody__Group__0 ) ) ;
    public final void ruleInitialisationBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:691:2: ( ( ( rule__InitialisationBody__Group__0 ) ) )
            // InternalReactionLanguage.g:692:2: ( ( rule__InitialisationBody__Group__0 ) )
            {
            // InternalReactionLanguage.g:692:2: ( ( rule__InitialisationBody__Group__0 ) )
            // InternalReactionLanguage.g:693:3: ( rule__InitialisationBody__Group__0 )
            {
             before(grammarAccess.getInitialisationBodyAccess().getGroup()); 
            // InternalReactionLanguage.g:694:3: ( rule__InitialisationBody__Group__0 )
            // InternalReactionLanguage.g:694:4: rule__InitialisationBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialisationBody"


    // $ANTLR start "entryRuleObservable"
    // InternalReactionLanguage.g:703:1: entryRuleObservable : ruleObservable EOF ;
    public final void entryRuleObservable() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:704:1: ( ruleObservable EOF )
            // InternalReactionLanguage.g:705:1: ruleObservable EOF
            {
             before(grammarAccess.getObservableRule()); 
            pushFollow(FOLLOW_1);
            ruleObservable();

            state._fsp--;

             after(grammarAccess.getObservableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObservable"


    // $ANTLR start "ruleObservable"
    // InternalReactionLanguage.g:712:1: ruleObservable : ( ( rule__Observable__Group__0 ) ) ;
    public final void ruleObservable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:716:2: ( ( ( rule__Observable__Group__0 ) ) )
            // InternalReactionLanguage.g:717:2: ( ( rule__Observable__Group__0 ) )
            {
            // InternalReactionLanguage.g:717:2: ( ( rule__Observable__Group__0 ) )
            // InternalReactionLanguage.g:718:3: ( rule__Observable__Group__0 )
            {
             before(grammarAccess.getObservableAccess().getGroup()); 
            // InternalReactionLanguage.g:719:3: ( rule__Observable__Group__0 )
            // InternalReactionLanguage.g:719:4: rule__Observable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObservableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObservable"


    // $ANTLR start "entryRuleObservableBody"
    // InternalReactionLanguage.g:728:1: entryRuleObservableBody : ruleObservableBody EOF ;
    public final void entryRuleObservableBody() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:729:1: ( ruleObservableBody EOF )
            // InternalReactionLanguage.g:730:1: ruleObservableBody EOF
            {
             before(grammarAccess.getObservableBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleObservableBody();

            state._fsp--;

             after(grammarAccess.getObservableBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObservableBody"


    // $ANTLR start "ruleObservableBody"
    // InternalReactionLanguage.g:737:1: ruleObservableBody : ( ruleObservablePattern ) ;
    public final void ruleObservableBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:741:2: ( ( ruleObservablePattern ) )
            // InternalReactionLanguage.g:742:2: ( ruleObservablePattern )
            {
            // InternalReactionLanguage.g:742:2: ( ruleObservablePattern )
            // InternalReactionLanguage.g:743:3: ruleObservablePattern
            {
             before(grammarAccess.getObservableBodyAccess().getObservablePatternParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleObservablePattern();

            state._fsp--;

             after(grammarAccess.getObservableBodyAccess().getObservablePatternParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObservableBody"


    // $ANTLR start "entryRuleObservablePattern"
    // InternalReactionLanguage.g:753:1: entryRuleObservablePattern : ruleObservablePattern EOF ;
    public final void entryRuleObservablePattern() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:754:1: ( ruleObservablePattern EOF )
            // InternalReactionLanguage.g:755:1: ruleObservablePattern EOF
            {
             before(grammarAccess.getObservablePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleObservablePattern();

            state._fsp--;

             after(grammarAccess.getObservablePatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObservablePattern"


    // $ANTLR start "ruleObservablePattern"
    // InternalReactionLanguage.g:762:1: ruleObservablePattern : ( ( rule__ObservablePattern__Group__0 ) ) ;
    public final void ruleObservablePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:766:2: ( ( ( rule__ObservablePattern__Group__0 ) ) )
            // InternalReactionLanguage.g:767:2: ( ( rule__ObservablePattern__Group__0 ) )
            {
            // InternalReactionLanguage.g:767:2: ( ( rule__ObservablePattern__Group__0 ) )
            // InternalReactionLanguage.g:768:3: ( rule__ObservablePattern__Group__0 )
            {
             before(grammarAccess.getObservablePatternAccess().getGroup()); 
            // InternalReactionLanguage.g:769:3: ( rule__ObservablePattern__Group__0 )
            // InternalReactionLanguage.g:769:4: rule__ObservablePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObservablePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObservablePatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObservablePattern"


    // $ANTLR start "entryRuleCommand"
    // InternalReactionLanguage.g:778:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:779:1: ( ruleCommand EOF )
            // InternalReactionLanguage.g:780:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalReactionLanguage.g:787:1: ruleCommand : ( ruleTerminateCommand ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:791:2: ( ( ruleTerminateCommand ) )
            // InternalReactionLanguage.g:792:2: ( ruleTerminateCommand )
            {
            // InternalReactionLanguage.g:792:2: ( ruleTerminateCommand )
            // InternalReactionLanguage.g:793:3: ruleTerminateCommand
            {
             before(grammarAccess.getCommandAccess().getTerminateCommandParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTerminateCommand();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getTerminateCommandParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleTerminateCommand"
    // InternalReactionLanguage.g:803:1: entryRuleTerminateCommand : ruleTerminateCommand EOF ;
    public final void entryRuleTerminateCommand() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:804:1: ( ruleTerminateCommand EOF )
            // InternalReactionLanguage.g:805:1: ruleTerminateCommand EOF
            {
             before(grammarAccess.getTerminateCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminateCommand();

            state._fsp--;

             after(grammarAccess.getTerminateCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminateCommand"


    // $ANTLR start "ruleTerminateCommand"
    // InternalReactionLanguage.g:812:1: ruleTerminateCommand : ( ( rule__TerminateCommand__Group__0 ) ) ;
    public final void ruleTerminateCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:816:2: ( ( ( rule__TerminateCommand__Group__0 ) ) )
            // InternalReactionLanguage.g:817:2: ( ( rule__TerminateCommand__Group__0 ) )
            {
            // InternalReactionLanguage.g:817:2: ( ( rule__TerminateCommand__Group__0 ) )
            // InternalReactionLanguage.g:818:3: ( rule__TerminateCommand__Group__0 )
            {
             before(grammarAccess.getTerminateCommandAccess().getGroup()); 
            // InternalReactionLanguage.g:819:3: ( rule__TerminateCommand__Group__0 )
            // InternalReactionLanguage.g:819:4: rule__TerminateCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminateCommand"


    // $ANTLR start "entryRuleTerminateBody"
    // InternalReactionLanguage.g:828:1: entryRuleTerminateBody : ruleTerminateBody EOF ;
    public final void entryRuleTerminateBody() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:829:1: ( ruleTerminateBody EOF )
            // InternalReactionLanguage.g:830:1: ruleTerminateBody EOF
            {
             before(grammarAccess.getTerminateBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminateBody();

            state._fsp--;

             after(grammarAccess.getTerminateBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminateBody"


    // $ANTLR start "ruleTerminateBody"
    // InternalReactionLanguage.g:837:1: ruleTerminateBody : ( ( rule__TerminateBody__Alternatives ) ) ;
    public final void ruleTerminateBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:841:2: ( ( ( rule__TerminateBody__Alternatives ) ) )
            // InternalReactionLanguage.g:842:2: ( ( rule__TerminateBody__Alternatives ) )
            {
            // InternalReactionLanguage.g:842:2: ( ( rule__TerminateBody__Alternatives ) )
            // InternalReactionLanguage.g:843:3: ( rule__TerminateBody__Alternatives )
            {
             before(grammarAccess.getTerminateBodyAccess().getAlternatives()); 
            // InternalReactionLanguage.g:844:3: ( rule__TerminateBody__Alternatives )
            // InternalReactionLanguage.g:844:4: rule__TerminateBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminateBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminateBodyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminateBody"


    // $ANTLR start "entryRuleTerminateTime"
    // InternalReactionLanguage.g:853:1: entryRuleTerminateTime : ruleTerminateTime EOF ;
    public final void entryRuleTerminateTime() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:854:1: ( ruleTerminateTime EOF )
            // InternalReactionLanguage.g:855:1: ruleTerminateTime EOF
            {
             before(grammarAccess.getTerminateTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminateTime();

            state._fsp--;

             after(grammarAccess.getTerminateTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminateTime"


    // $ANTLR start "ruleTerminateTime"
    // InternalReactionLanguage.g:862:1: ruleTerminateTime : ( ( rule__TerminateTime__Group__0 ) ) ;
    public final void ruleTerminateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:866:2: ( ( ( rule__TerminateTime__Group__0 ) ) )
            // InternalReactionLanguage.g:867:2: ( ( rule__TerminateTime__Group__0 ) )
            {
            // InternalReactionLanguage.g:867:2: ( ( rule__TerminateTime__Group__0 ) )
            // InternalReactionLanguage.g:868:3: ( rule__TerminateTime__Group__0 )
            {
             before(grammarAccess.getTerminateTimeAccess().getGroup()); 
            // InternalReactionLanguage.g:869:3: ( rule__TerminateTime__Group__0 )
            // InternalReactionLanguage.g:869:4: rule__TerminateTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminateTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminateTime"


    // $ANTLR start "entryRuleTerminateIterations"
    // InternalReactionLanguage.g:878:1: entryRuleTerminateIterations : ruleTerminateIterations EOF ;
    public final void entryRuleTerminateIterations() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:879:1: ( ruleTerminateIterations EOF )
            // InternalReactionLanguage.g:880:1: ruleTerminateIterations EOF
            {
             before(grammarAccess.getTerminateIterationsRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminateIterations();

            state._fsp--;

             after(grammarAccess.getTerminateIterationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminateIterations"


    // $ANTLR start "ruleTerminateIterations"
    // InternalReactionLanguage.g:887:1: ruleTerminateIterations : ( ( rule__TerminateIterations__Group__0 ) ) ;
    public final void ruleTerminateIterations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:891:2: ( ( ( rule__TerminateIterations__Group__0 ) ) )
            // InternalReactionLanguage.g:892:2: ( ( rule__TerminateIterations__Group__0 ) )
            {
            // InternalReactionLanguage.g:892:2: ( ( rule__TerminateIterations__Group__0 ) )
            // InternalReactionLanguage.g:893:3: ( rule__TerminateIterations__Group__0 )
            {
             before(grammarAccess.getTerminateIterationsAccess().getGroup()); 
            // InternalReactionLanguage.g:894:3: ( rule__TerminateIterations__Group__0 )
            // InternalReactionLanguage.g:894:4: rule__TerminateIterations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminateIterations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateIterationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminateIterations"


    // $ANTLR start "entryRuleTerminateCount"
    // InternalReactionLanguage.g:903:1: entryRuleTerminateCount : ruleTerminateCount EOF ;
    public final void entryRuleTerminateCount() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:904:1: ( ruleTerminateCount EOF )
            // InternalReactionLanguage.g:905:1: ruleTerminateCount EOF
            {
             before(grammarAccess.getTerminateCountRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminateCount();

            state._fsp--;

             after(grammarAccess.getTerminateCountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminateCount"


    // $ANTLR start "ruleTerminateCount"
    // InternalReactionLanguage.g:912:1: ruleTerminateCount : ( ( rule__TerminateCount__Group__0 ) ) ;
    public final void ruleTerminateCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:916:2: ( ( ( rule__TerminateCount__Group__0 ) ) )
            // InternalReactionLanguage.g:917:2: ( ( rule__TerminateCount__Group__0 ) )
            {
            // InternalReactionLanguage.g:917:2: ( ( rule__TerminateCount__Group__0 ) )
            // InternalReactionLanguage.g:918:3: ( rule__TerminateCount__Group__0 )
            {
             before(grammarAccess.getTerminateCountAccess().getGroup()); 
            // InternalReactionLanguage.g:919:3: ( rule__TerminateCount__Group__0 )
            // InternalReactionLanguage.g:919:4: rule__TerminateCount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateCountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminateCount"


    // $ANTLR start "entryRuleArithmeticExpr"
    // InternalReactionLanguage.g:928:1: entryRuleArithmeticExpr : ruleArithmeticExpr EOF ;
    public final void entryRuleArithmeticExpr() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:929:1: ( ruleArithmeticExpr EOF )
            // InternalReactionLanguage.g:930:1: ruleArithmeticExpr EOF
            {
             before(grammarAccess.getArithmeticExprRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getArithmeticExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticExpr"


    // $ANTLR start "ruleArithmeticExpr"
    // InternalReactionLanguage.g:937:1: ruleArithmeticExpr : ( ruleAddition ) ;
    public final void ruleArithmeticExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:941:2: ( ( ruleAddition ) )
            // InternalReactionLanguage.g:942:2: ( ruleAddition )
            {
            // InternalReactionLanguage.g:942:2: ( ruleAddition )
            // InternalReactionLanguage.g:943:3: ruleAddition
            {
             before(grammarAccess.getArithmeticExprAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getArithmeticExprAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticExpr"


    // $ANTLR start "entryRuleAddition"
    // InternalReactionLanguage.g:953:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:954:1: ( ruleAddition EOF )
            // InternalReactionLanguage.g:955:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalReactionLanguage.g:962:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:966:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalReactionLanguage.g:967:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalReactionLanguage.g:967:2: ( ( rule__Addition__Group__0 ) )
            // InternalReactionLanguage.g:968:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalReactionLanguage.g:969:3: ( rule__Addition__Group__0 )
            // InternalReactionLanguage.g:969:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalReactionLanguage.g:978:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:979:1: ( ruleMultiplication EOF )
            // InternalReactionLanguage.g:980:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalReactionLanguage.g:987:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:991:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalReactionLanguage.g:992:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalReactionLanguage.g:992:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalReactionLanguage.g:993:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalReactionLanguage.g:994:3: ( rule__Multiplication__Group__0 )
            // InternalReactionLanguage.g:994:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalReactionLanguage.g:1003:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1004:1: ( rulePrimaryExpr EOF )
            // InternalReactionLanguage.g:1005:1: rulePrimaryExpr EOF
            {
             before(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalReactionLanguage.g:1012:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Alternatives ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1016:2: ( ( ( rule__PrimaryExpr__Alternatives ) ) )
            // InternalReactionLanguage.g:1017:2: ( ( rule__PrimaryExpr__Alternatives ) )
            {
            // InternalReactionLanguage.g:1017:2: ( ( rule__PrimaryExpr__Alternatives ) )
            // InternalReactionLanguage.g:1018:3: ( rule__PrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrimaryExprAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1019:3: ( rule__PrimaryExpr__Alternatives )
            // InternalReactionLanguage.g:1019:4: rule__PrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleArithmeticType"
    // InternalReactionLanguage.g:1028:1: entryRuleArithmeticType : ruleArithmeticType EOF ;
    public final void entryRuleArithmeticType() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1029:1: ( ruleArithmeticType EOF )
            // InternalReactionLanguage.g:1030:1: ruleArithmeticType EOF
            {
             before(grammarAccess.getArithmeticTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticType();

            state._fsp--;

             after(grammarAccess.getArithmeticTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticType"


    // $ANTLR start "ruleArithmeticType"
    // InternalReactionLanguage.g:1037:1: ruleArithmeticType : ( ( rule__ArithmeticType__Alternatives ) ) ;
    public final void ruleArithmeticType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1041:2: ( ( ( rule__ArithmeticType__Alternatives ) ) )
            // InternalReactionLanguage.g:1042:2: ( ( rule__ArithmeticType__Alternatives ) )
            {
            // InternalReactionLanguage.g:1042:2: ( ( rule__ArithmeticType__Alternatives ) )
            // InternalReactionLanguage.g:1043:3: ( rule__ArithmeticType__Alternatives )
            {
             before(grammarAccess.getArithmeticTypeAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1044:3: ( rule__ArithmeticType__Alternatives )
            // InternalReactionLanguage.g:1044:4: rule__ArithmeticType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticType"


    // $ANTLR start "entryRuleSignedScientificDouble"
    // InternalReactionLanguage.g:1053:1: entryRuleSignedScientificDouble : ruleSignedScientificDouble EOF ;
    public final void entryRuleSignedScientificDouble() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1054:1: ( ruleSignedScientificDouble EOF )
            // InternalReactionLanguage.g:1055:1: ruleSignedScientificDouble EOF
            {
             before(grammarAccess.getSignedScientificDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedScientificDouble();

            state._fsp--;

             after(grammarAccess.getSignedScientificDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedScientificDouble"


    // $ANTLR start "ruleSignedScientificDouble"
    // InternalReactionLanguage.g:1062:1: ruleSignedScientificDouble : ( ( rule__SignedScientificDouble__Group__0 ) ) ;
    public final void ruleSignedScientificDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1066:2: ( ( ( rule__SignedScientificDouble__Group__0 ) ) )
            // InternalReactionLanguage.g:1067:2: ( ( rule__SignedScientificDouble__Group__0 ) )
            {
            // InternalReactionLanguage.g:1067:2: ( ( rule__SignedScientificDouble__Group__0 ) )
            // InternalReactionLanguage.g:1068:3: ( rule__SignedScientificDouble__Group__0 )
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getGroup()); 
            // InternalReactionLanguage.g:1069:3: ( rule__SignedScientificDouble__Group__0 )
            // InternalReactionLanguage.g:1069:4: rule__SignedScientificDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedScientificDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedScientificDouble"


    // $ANTLR start "entryRuleUnsignedScientificDouble"
    // InternalReactionLanguage.g:1078:1: entryRuleUnsignedScientificDouble : ruleUnsignedScientificDouble EOF ;
    public final void entryRuleUnsignedScientificDouble() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1079:1: ( ruleUnsignedScientificDouble EOF )
            // InternalReactionLanguage.g:1080:1: ruleUnsignedScientificDouble EOF
            {
             before(grammarAccess.getUnsignedScientificDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleUnsignedScientificDouble();

            state._fsp--;

             after(grammarAccess.getUnsignedScientificDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedScientificDouble"


    // $ANTLR start "ruleUnsignedScientificDouble"
    // InternalReactionLanguage.g:1087:1: ruleUnsignedScientificDouble : ( ( rule__UnsignedScientificDouble__Group__0 ) ) ;
    public final void ruleUnsignedScientificDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1091:2: ( ( ( rule__UnsignedScientificDouble__Group__0 ) ) )
            // InternalReactionLanguage.g:1092:2: ( ( rule__UnsignedScientificDouble__Group__0 ) )
            {
            // InternalReactionLanguage.g:1092:2: ( ( rule__UnsignedScientificDouble__Group__0 ) )
            // InternalReactionLanguage.g:1093:3: ( rule__UnsignedScientificDouble__Group__0 )
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getGroup()); 
            // InternalReactionLanguage.g:1094:3: ( rule__UnsignedScientificDouble__Group__0 )
            // InternalReactionLanguage.g:1094:4: rule__UnsignedScientificDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedScientificDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedScientificDouble"


    // $ANTLR start "entryRuleUnsignedInt"
    // InternalReactionLanguage.g:1103:1: entryRuleUnsignedInt : ruleUnsignedInt EOF ;
    public final void entryRuleUnsignedInt() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1104:1: ( ruleUnsignedInt EOF )
            // InternalReactionLanguage.g:1105:1: ruleUnsignedInt EOF
            {
             before(grammarAccess.getUnsignedIntRule()); 
            pushFollow(FOLLOW_1);
            ruleUnsignedInt();

            state._fsp--;

             after(grammarAccess.getUnsignedIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedInt"


    // $ANTLR start "ruleUnsignedInt"
    // InternalReactionLanguage.g:1112:1: ruleUnsignedInt : ( ( rule__UnsignedInt__Alternatives ) ) ;
    public final void ruleUnsignedInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1116:2: ( ( ( rule__UnsignedInt__Alternatives ) ) )
            // InternalReactionLanguage.g:1117:2: ( ( rule__UnsignedInt__Alternatives ) )
            {
            // InternalReactionLanguage.g:1117:2: ( ( rule__UnsignedInt__Alternatives ) )
            // InternalReactionLanguage.g:1118:3: ( rule__UnsignedInt__Alternatives )
            {
             before(grammarAccess.getUnsignedIntAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1119:3: ( rule__UnsignedInt__Alternatives )
            // InternalReactionLanguage.g:1119:4: rule__UnsignedInt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedInt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedIntAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedInt"


    // $ANTLR start "entryRuleSignedInt"
    // InternalReactionLanguage.g:1128:1: entryRuleSignedInt : ruleSignedInt EOF ;
    public final void entryRuleSignedInt() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1129:1: ( ruleSignedInt EOF )
            // InternalReactionLanguage.g:1130:1: ruleSignedInt EOF
            {
             before(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedInt();

            state._fsp--;

             after(grammarAccess.getSignedIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalReactionLanguage.g:1137:1: ruleSignedInt : ( ( rule__SignedInt__Group__0 ) ) ;
    public final void ruleSignedInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1141:2: ( ( ( rule__SignedInt__Group__0 ) ) )
            // InternalReactionLanguage.g:1142:2: ( ( rule__SignedInt__Group__0 ) )
            {
            // InternalReactionLanguage.g:1142:2: ( ( rule__SignedInt__Group__0 ) )
            // InternalReactionLanguage.g:1143:3: ( rule__SignedInt__Group__0 )
            {
             before(grammarAccess.getSignedIntAccess().getGroup()); 
            // InternalReactionLanguage.g:1144:3: ( rule__SignedInt__Group__0 )
            // InternalReactionLanguage.g:1144:4: rule__SignedInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleUnsignedDouble"
    // InternalReactionLanguage.g:1153:1: entryRuleUnsignedDouble : ruleUnsignedDouble EOF ;
    public final void entryRuleUnsignedDouble() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1154:1: ( ruleUnsignedDouble EOF )
            // InternalReactionLanguage.g:1155:1: ruleUnsignedDouble EOF
            {
             before(grammarAccess.getUnsignedDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleUnsignedDouble();

            state._fsp--;

             after(grammarAccess.getUnsignedDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedDouble"


    // $ANTLR start "ruleUnsignedDouble"
    // InternalReactionLanguage.g:1162:1: ruleUnsignedDouble : ( ( rule__UnsignedDouble__Group__0 ) ) ;
    public final void ruleUnsignedDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1166:2: ( ( ( rule__UnsignedDouble__Group__0 ) ) )
            // InternalReactionLanguage.g:1167:2: ( ( rule__UnsignedDouble__Group__0 ) )
            {
            // InternalReactionLanguage.g:1167:2: ( ( rule__UnsignedDouble__Group__0 ) )
            // InternalReactionLanguage.g:1168:3: ( rule__UnsignedDouble__Group__0 )
            {
             before(grammarAccess.getUnsignedDoubleAccess().getGroup()); 
            // InternalReactionLanguage.g:1169:3: ( rule__UnsignedDouble__Group__0 )
            // InternalReactionLanguage.g:1169:4: rule__UnsignedDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedDouble"


    // $ANTLR start "entryRuleSignedDouble"
    // InternalReactionLanguage.g:1178:1: entryRuleSignedDouble : ruleSignedDouble EOF ;
    public final void entryRuleSignedDouble() throws RecognitionException {
        try {
            // InternalReactionLanguage.g:1179:1: ( ruleSignedDouble EOF )
            // InternalReactionLanguage.g:1180:1: ruleSignedDouble EOF
            {
             before(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedDouble();

            state._fsp--;

             after(grammarAccess.getSignedDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedDouble"


    // $ANTLR start "ruleSignedDouble"
    // InternalReactionLanguage.g:1187:1: ruleSignedDouble : ( ( rule__SignedDouble__Group__0 ) ) ;
    public final void ruleSignedDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1191:2: ( ( ( rule__SignedDouble__Group__0 ) ) )
            // InternalReactionLanguage.g:1192:2: ( ( rule__SignedDouble__Group__0 ) )
            {
            // InternalReactionLanguage.g:1192:2: ( ( rule__SignedDouble__Group__0 ) )
            // InternalReactionLanguage.g:1193:3: ( rule__SignedDouble__Group__0 )
            {
             before(grammarAccess.getSignedDoubleAccess().getGroup()); 
            // InternalReactionLanguage.g:1194:3: ( rule__SignedDouble__Group__0 )
            // InternalReactionLanguage.g:1194:4: rule__SignedDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedDouble"


    // $ANTLR start "ruleMathFunc"
    // InternalReactionLanguage.g:1203:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1207:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalReactionLanguage.g:1208:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalReactionLanguage.g:1208:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalReactionLanguage.g:1209:3: ( rule__MathFunc__Alternatives )
            {
             before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1210:3: ( rule__MathFunc__Alternatives )
            // InternalReactionLanguage.g:1210:4: rule__MathFunc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathFunc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathFuncAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathFunc"


    // $ANTLR start "ruleRuleType"
    // InternalReactionLanguage.g:1219:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1223:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // InternalReactionLanguage.g:1224:2: ( ( rule__RuleType__Alternatives ) )
            {
            // InternalReactionLanguage.g:1224:2: ( ( rule__RuleType__Alternatives ) )
            // InternalReactionLanguage.g:1225:3: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1226:3: ( rule__RuleType__Alternatives )
            // InternalReactionLanguage.g:1226:4: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleBondType"
    // InternalReactionLanguage.g:1235:1: ruleBondType : ( ( rule__BondType__Alternatives ) ) ;
    public final void ruleBondType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1239:1: ( ( ( rule__BondType__Alternatives ) ) )
            // InternalReactionLanguage.g:1240:2: ( ( rule__BondType__Alternatives ) )
            {
            // InternalReactionLanguage.g:1240:2: ( ( rule__BondType__Alternatives ) )
            // InternalReactionLanguage.g:1241:3: ( rule__BondType__Alternatives )
            {
             before(grammarAccess.getBondTypeAccess().getAlternatives()); 
            // InternalReactionLanguage.g:1242:3: ( rule__BondType__Alternatives )
            // InternalReactionLanguage.g:1242:4: rule__BondType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BondType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBondTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBondType"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalReactionLanguage.g:1250:1: rule__Component__Alternatives : ( ( ruleAgentDeclaration ) | ( ruleRule ) | ( ruleComplex ) | ( ruleInitialisation ) | ( ruleObservable ) | ( ruleVariable ) | ( ruleCommand ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1254:1: ( ( ruleAgentDeclaration ) | ( ruleRule ) | ( ruleComplex ) | ( ruleInitialisation ) | ( ruleObservable ) | ( ruleVariable ) | ( ruleCommand ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 35:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReactionLanguage.g:1255:2: ( ruleAgentDeclaration )
                    {
                    // InternalReactionLanguage.g:1255:2: ( ruleAgentDeclaration )
                    // InternalReactionLanguage.g:1256:3: ruleAgentDeclaration
                    {
                     before(grammarAccess.getComponentAccess().getAgentDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAgentDeclaration();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getAgentDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1261:2: ( ruleRule )
                    {
                    // InternalReactionLanguage.g:1261:2: ( ruleRule )
                    // InternalReactionLanguage.g:1262:3: ruleRule
                    {
                     before(grammarAccess.getComponentAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1267:2: ( ruleComplex )
                    {
                    // InternalReactionLanguage.g:1267:2: ( ruleComplex )
                    // InternalReactionLanguage.g:1268:3: ruleComplex
                    {
                     before(grammarAccess.getComponentAccess().getComplexParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComplex();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getComplexParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:1273:2: ( ruleInitialisation )
                    {
                    // InternalReactionLanguage.g:1273:2: ( ruleInitialisation )
                    // InternalReactionLanguage.g:1274:3: ruleInitialisation
                    {
                     before(grammarAccess.getComponentAccess().getInitialisationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInitialisation();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getInitialisationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionLanguage.g:1279:2: ( ruleObservable )
                    {
                    // InternalReactionLanguage.g:1279:2: ( ruleObservable )
                    // InternalReactionLanguage.g:1280:3: ruleObservable
                    {
                     before(grammarAccess.getComponentAccess().getObservableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleObservable();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getObservableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReactionLanguage.g:1285:2: ( ruleVariable )
                    {
                    // InternalReactionLanguage.g:1285:2: ( ruleVariable )
                    // InternalReactionLanguage.g:1286:3: ruleVariable
                    {
                     before(grammarAccess.getComponentAccess().getVariableParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getVariableParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalReactionLanguage.g:1291:2: ( ruleCommand )
                    {
                    // InternalReactionLanguage.g:1291:2: ( ruleCommand )
                    // InternalReactionLanguage.g:1292:3: ruleCommand
                    {
                     before(grammarAccess.getComponentAccess().getCommandParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getCommandParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__ComplexElement__Alternatives"
    // InternalReactionLanguage.g:1301:1: rule__ComplexElement__Alternatives : ( ( ruleComplex ) | ( ruleRule ) | ( ruleVariable ) | ( ruleObservable ) );
    public final void rule__ComplexElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1305:1: ( ( ruleComplex ) | ( ruleRule ) | ( ruleVariable ) | ( ruleObservable ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReactionLanguage.g:1306:2: ( ruleComplex )
                    {
                    // InternalReactionLanguage.g:1306:2: ( ruleComplex )
                    // InternalReactionLanguage.g:1307:3: ruleComplex
                    {
                     before(grammarAccess.getComplexElementAccess().getComplexParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComplex();

                    state._fsp--;

                     after(grammarAccess.getComplexElementAccess().getComplexParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1312:2: ( ruleRule )
                    {
                    // InternalReactionLanguage.g:1312:2: ( ruleRule )
                    // InternalReactionLanguage.g:1313:3: ruleRule
                    {
                     before(grammarAccess.getComplexElementAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getComplexElementAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1318:2: ( ruleVariable )
                    {
                    // InternalReactionLanguage.g:1318:2: ( ruleVariable )
                    // InternalReactionLanguage.g:1319:3: ruleVariable
                    {
                     before(grammarAccess.getComplexElementAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getComplexElementAccess().getVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:1324:2: ( ruleObservable )
                    {
                    // InternalReactionLanguage.g:1324:2: ( ruleObservable )
                    // InternalReactionLanguage.g:1325:3: ruleObservable
                    {
                     before(grammarAccess.getComplexElementAccess().getObservableParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleObservable();

                    state._fsp--;

                     after(grammarAccess.getComplexElementAccess().getObservableParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalReactionLanguage.g:1334:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ruleBonds ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1338:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ruleBonds ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionLanguage.g:1339:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalReactionLanguage.g:1339:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalReactionLanguage.g:1340:3: ( rule__Pattern__Group_0__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_0()); 
                    // InternalReactionLanguage.g:1341:3: ( rule__Pattern__Group_0__0 )
                    // InternalReactionLanguage.g:1341:4: rule__Pattern__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1345:2: ( ruleBonds )
                    {
                    // InternalReactionLanguage.g:1345:2: ( ruleBonds )
                    // InternalReactionLanguage.g:1346:3: ruleBonds
                    {
                     before(grammarAccess.getPatternAccess().getBondsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBonds();

                    state._fsp--;

                     after(grammarAccess.getPatternAccess().getBondsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__BondSideOrWildcard__Alternatives"
    // InternalReactionLanguage.g:1355:1: rule__BondSideOrWildcard__Alternatives : ( ( ruleBondSide ) | ( ( rule__BondSideOrWildcard__WildcardAssignment_1 ) ) );
    public final void rule__BondSideOrWildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1359:1: ( ( ruleBondSide ) | ( ( rule__BondSideOrWildcard__WildcardAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NULL||LA5_0==RULE_ANYTHING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalReactionLanguage.g:1360:2: ( ruleBondSide )
                    {
                    // InternalReactionLanguage.g:1360:2: ( ruleBondSide )
                    // InternalReactionLanguage.g:1361:3: ruleBondSide
                    {
                     before(grammarAccess.getBondSideOrWildcardAccess().getBondSideParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBondSide();

                    state._fsp--;

                     after(grammarAccess.getBondSideOrWildcardAccess().getBondSideParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1366:2: ( ( rule__BondSideOrWildcard__WildcardAssignment_1 ) )
                    {
                    // InternalReactionLanguage.g:1366:2: ( ( rule__BondSideOrWildcard__WildcardAssignment_1 ) )
                    // InternalReactionLanguage.g:1367:3: ( rule__BondSideOrWildcard__WildcardAssignment_1 )
                    {
                     before(grammarAccess.getBondSideOrWildcardAccess().getWildcardAssignment_1()); 
                    // InternalReactionLanguage.g:1368:3: ( rule__BondSideOrWildcard__WildcardAssignment_1 )
                    // InternalReactionLanguage.g:1368:4: rule__BondSideOrWildcard__WildcardAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BondSideOrWildcard__WildcardAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBondSideOrWildcardAccess().getWildcardAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSideOrWildcard__Alternatives"


    // $ANTLR start "rule__Wildcard__Alternatives"
    // InternalReactionLanguage.g:1376:1: rule__Wildcard__Alternatives : ( ( ( rule__Wildcard__AnythingAssignment_0 ) ) | ( ( rule__Wildcard__NothingAssignment_1 ) ) );
    public final void rule__Wildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1380:1: ( ( ( rule__Wildcard__AnythingAssignment_0 ) ) | ( ( rule__Wildcard__NothingAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ANYTHING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NULL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionLanguage.g:1381:2: ( ( rule__Wildcard__AnythingAssignment_0 ) )
                    {
                    // InternalReactionLanguage.g:1381:2: ( ( rule__Wildcard__AnythingAssignment_0 ) )
                    // InternalReactionLanguage.g:1382:3: ( rule__Wildcard__AnythingAssignment_0 )
                    {
                     before(grammarAccess.getWildcardAccess().getAnythingAssignment_0()); 
                    // InternalReactionLanguage.g:1383:3: ( rule__Wildcard__AnythingAssignment_0 )
                    // InternalReactionLanguage.g:1383:4: rule__Wildcard__AnythingAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wildcard__AnythingAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWildcardAccess().getAnythingAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1387:2: ( ( rule__Wildcard__NothingAssignment_1 ) )
                    {
                    // InternalReactionLanguage.g:1387:2: ( ( rule__Wildcard__NothingAssignment_1 ) )
                    // InternalReactionLanguage.g:1388:3: ( rule__Wildcard__NothingAssignment_1 )
                    {
                     before(grammarAccess.getWildcardAccess().getNothingAssignment_1()); 
                    // InternalReactionLanguage.g:1389:3: ( rule__Wildcard__NothingAssignment_1 )
                    // InternalReactionLanguage.g:1389:4: rule__Wildcard__NothingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Wildcard__NothingAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWildcardAccess().getNothingAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Alternatives"


    // $ANTLR start "rule__TerminateBody__Alternatives"
    // InternalReactionLanguage.g:1397:1: rule__TerminateBody__Alternatives : ( ( ruleTerminateTime ) | ( ruleTerminateIterations ) | ( ruleTerminateCount ) );
    public final void rule__TerminateBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1401:1: ( ( ruleTerminateTime ) | ( ruleTerminateIterations ) | ( ruleTerminateCount ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case 26:
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalReactionLanguage.g:1402:2: ( ruleTerminateTime )
                    {
                    // InternalReactionLanguage.g:1402:2: ( ruleTerminateTime )
                    // InternalReactionLanguage.g:1403:3: ruleTerminateTime
                    {
                     before(grammarAccess.getTerminateBodyAccess().getTerminateTimeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminateTime();

                    state._fsp--;

                     after(grammarAccess.getTerminateBodyAccess().getTerminateTimeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1408:2: ( ruleTerminateIterations )
                    {
                    // InternalReactionLanguage.g:1408:2: ( ruleTerminateIterations )
                    // InternalReactionLanguage.g:1409:3: ruleTerminateIterations
                    {
                     before(grammarAccess.getTerminateBodyAccess().getTerminateIterationsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminateIterations();

                    state._fsp--;

                     after(grammarAccess.getTerminateBodyAccess().getTerminateIterationsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1414:2: ( ruleTerminateCount )
                    {
                    // InternalReactionLanguage.g:1414:2: ( ruleTerminateCount )
                    // InternalReactionLanguage.g:1415:3: ruleTerminateCount
                    {
                     before(grammarAccess.getTerminateBodyAccess().getTerminateCountParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminateCount();

                    state._fsp--;

                     after(grammarAccess.getTerminateBodyAccess().getTerminateCountParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateBody__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalReactionLanguage.g:1424:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1428:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionLanguage.g:1429:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalReactionLanguage.g:1429:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalReactionLanguage.g:1430:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalReactionLanguage.g:1431:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalReactionLanguage.g:1431:4: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1435:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalReactionLanguage.g:1435:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalReactionLanguage.g:1436:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalReactionLanguage.g:1437:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalReactionLanguage.g:1437:4: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalReactionLanguage.g:1445:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1449:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalReactionLanguage.g:1450:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalReactionLanguage.g:1450:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalReactionLanguage.g:1451:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalReactionLanguage.g:1452:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalReactionLanguage.g:1452:4: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1456:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalReactionLanguage.g:1456:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalReactionLanguage.g:1457:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalReactionLanguage.g:1458:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalReactionLanguage.g:1458:4: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1462:2: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    {
                    // InternalReactionLanguage.g:1462:2: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    // InternalReactionLanguage.g:1463:3: ( rule__Multiplication__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    // InternalReactionLanguage.g:1464:3: ( rule__Multiplication__Group_1_0_2__0 )
                    // InternalReactionLanguage.g:1464:4: rule__Multiplication__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpr__Alternatives"
    // InternalReactionLanguage.g:1472:1: rule__PrimaryExpr__Alternatives : ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ( rule__PrimaryExpr__Group_1__0 ) ) | ( ( rule__PrimaryExpr__Group_2__0 ) ) | ( ( rule__PrimaryExpr__Group_3__0 ) ) );
    public final void rule__PrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1476:1: ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ( rule__PrimaryExpr__Group_1__0 ) ) | ( ( rule__PrimaryExpr__Group_2__0 ) ) | ( ( rule__PrimaryExpr__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
            case RULE_NULL:
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
            case 17:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalReactionLanguage.g:1477:2: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    {
                    // InternalReactionLanguage.g:1477:2: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    // InternalReactionLanguage.g:1478:3: ( rule__PrimaryExpr__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExprAccess().getGroup_0()); 
                    // InternalReactionLanguage.g:1479:3: ( rule__PrimaryExpr__Group_0__0 )
                    // InternalReactionLanguage.g:1479:4: rule__PrimaryExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1483:2: ( ( rule__PrimaryExpr__Group_1__0 ) )
                    {
                    // InternalReactionLanguage.g:1483:2: ( ( rule__PrimaryExpr__Group_1__0 ) )
                    // InternalReactionLanguage.g:1484:3: ( rule__PrimaryExpr__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
                    // InternalReactionLanguage.g:1485:3: ( rule__PrimaryExpr__Group_1__0 )
                    // InternalReactionLanguage.g:1485:4: rule__PrimaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExprAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1489:2: ( ( rule__PrimaryExpr__Group_2__0 ) )
                    {
                    // InternalReactionLanguage.g:1489:2: ( ( rule__PrimaryExpr__Group_2__0 ) )
                    // InternalReactionLanguage.g:1490:3: ( rule__PrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExprAccess().getGroup_2()); 
                    // InternalReactionLanguage.g:1491:3: ( rule__PrimaryExpr__Group_2__0 )
                    // InternalReactionLanguage.g:1491:4: rule__PrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExprAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:1495:2: ( ( rule__PrimaryExpr__Group_3__0 ) )
                    {
                    // InternalReactionLanguage.g:1495:2: ( ( rule__PrimaryExpr__Group_3__0 ) )
                    // InternalReactionLanguage.g:1496:3: ( rule__PrimaryExpr__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExprAccess().getGroup_3()); 
                    // InternalReactionLanguage.g:1497:3: ( rule__PrimaryExpr__Group_3__0 )
                    // InternalReactionLanguage.g:1497:4: rule__PrimaryExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpr__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExprAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Alternatives"


    // $ANTLR start "rule__ArithmeticType__Alternatives"
    // InternalReactionLanguage.g:1505:1: rule__ArithmeticType__Alternatives : ( ( ruleUnsignedInt ) | ( ruleSignedInt ) | ( ruleUnsignedDouble ) | ( ruleSignedDouble ) | ( ruleUnsignedScientificDouble ) | ( ruleSignedScientificDouble ) );
    public final void rule__ArithmeticType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1509:1: ( ( ruleUnsignedInt ) | ( ruleSignedInt ) | ( ruleUnsignedDouble ) | ( ruleSignedDouble ) | ( ruleUnsignedScientificDouble ) | ( ruleSignedScientificDouble ) )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalReactionLanguage.g:1510:2: ( ruleUnsignedInt )
                    {
                    // InternalReactionLanguage.g:1510:2: ( ruleUnsignedInt )
                    // InternalReactionLanguage.g:1511:3: ruleUnsignedInt
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getUnsignedIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnsignedInt();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getUnsignedIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1516:2: ( ruleSignedInt )
                    {
                    // InternalReactionLanguage.g:1516:2: ( ruleSignedInt )
                    // InternalReactionLanguage.g:1517:3: ruleSignedInt
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getSignedIntParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSignedInt();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getSignedIntParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:1522:2: ( ruleUnsignedDouble )
                    {
                    // InternalReactionLanguage.g:1522:2: ( ruleUnsignedDouble )
                    // InternalReactionLanguage.g:1523:3: ruleUnsignedDouble
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getUnsignedDoubleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnsignedDouble();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getUnsignedDoubleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:1528:2: ( ruleSignedDouble )
                    {
                    // InternalReactionLanguage.g:1528:2: ( ruleSignedDouble )
                    // InternalReactionLanguage.g:1529:3: ruleSignedDouble
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getSignedDoubleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSignedDouble();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getSignedDoubleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReactionLanguage.g:1534:2: ( ruleUnsignedScientificDouble )
                    {
                    // InternalReactionLanguage.g:1534:2: ( ruleUnsignedScientificDouble )
                    // InternalReactionLanguage.g:1535:3: ruleUnsignedScientificDouble
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getUnsignedScientificDoubleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUnsignedScientificDouble();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getUnsignedScientificDoubleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReactionLanguage.g:1540:2: ( ruleSignedScientificDouble )
                    {
                    // InternalReactionLanguage.g:1540:2: ( ruleSignedScientificDouble )
                    // InternalReactionLanguage.g:1541:3: ruleSignedScientificDouble
                    {
                     before(grammarAccess.getArithmeticTypeAccess().getSignedScientificDoubleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSignedScientificDouble();

                    state._fsp--;

                     after(grammarAccess.getArithmeticTypeAccess().getSignedScientificDoubleParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticType__Alternatives"


    // $ANTLR start "rule__SignedScientificDouble__Alternatives_1"
    // InternalReactionLanguage.g:1550:1: rule__SignedScientificDouble__Alternatives_1 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__SignedScientificDouble__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1554:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_NULL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalReactionLanguage.g:1555:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1555:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1556:3: RULE_INT
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1561:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1561:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1562:3: RULE_NULL
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Alternatives_1"


    // $ANTLR start "rule__SignedScientificDouble__Alternatives_2_1"
    // InternalReactionLanguage.g:1571:1: rule__SignedScientificDouble__Alternatives_2_1 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__SignedScientificDouble__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1575:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_NULL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalReactionLanguage.g:1576:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1576:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1577:3: RULE_INT
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_2_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1582:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1582:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1583:3: RULE_NULL
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_2_1_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Alternatives_2_1"


    // $ANTLR start "rule__SignedScientificDouble__Alternatives_4"
    // InternalReactionLanguage.g:1592:1: rule__SignedScientificDouble__Alternatives_4 : ( ( '+' ) | ( '-' ) );
    public final void rule__SignedScientificDouble__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1596:1: ( ( '+' ) | ( '-' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionLanguage.g:1597:2: ( '+' )
                    {
                    // InternalReactionLanguage.g:1597:2: ( '+' )
                    // InternalReactionLanguage.g:1598:3: '+'
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getPlusSignKeyword_4_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getPlusSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1603:2: ( '-' )
                    {
                    // InternalReactionLanguage.g:1603:2: ( '-' )
                    // InternalReactionLanguage.g:1604:3: '-'
                    {
                     before(grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_4_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Alternatives_4"


    // $ANTLR start "rule__UnsignedScientificDouble__Alternatives_0"
    // InternalReactionLanguage.g:1613:1: rule__UnsignedScientificDouble__Alternatives_0 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__UnsignedScientificDouble__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1617:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_NULL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalReactionLanguage.g:1618:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1618:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1619:3: RULE_INT
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1624:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1624:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1625:3: RULE_NULL
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_0_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Alternatives_0"


    // $ANTLR start "rule__UnsignedScientificDouble__Alternatives_1_1"
    // InternalReactionLanguage.g:1634:1: rule__UnsignedScientificDouble__Alternatives_1_1 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__UnsignedScientificDouble__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1638:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_NULL) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionLanguage.g:1639:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1639:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1640:3: RULE_INT
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1645:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1645:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1646:3: RULE_NULL
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Alternatives_1_1"


    // $ANTLR start "rule__UnsignedScientificDouble__Alternatives_3"
    // InternalReactionLanguage.g:1655:1: rule__UnsignedScientificDouble__Alternatives_3 : ( ( '+' ) | ( '-' ) );
    public final void rule__UnsignedScientificDouble__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1659:1: ( ( '+' ) | ( '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalReactionLanguage.g:1660:2: ( '+' )
                    {
                    // InternalReactionLanguage.g:1660:2: ( '+' )
                    // InternalReactionLanguage.g:1661:3: '+'
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getPlusSignKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getPlusSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1666:2: ( '-' )
                    {
                    // InternalReactionLanguage.g:1666:2: ( '-' )
                    // InternalReactionLanguage.g:1667:3: '-'
                    {
                     before(grammarAccess.getUnsignedScientificDoubleAccess().getHyphenMinusKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getUnsignedScientificDoubleAccess().getHyphenMinusKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Alternatives_3"


    // $ANTLR start "rule__UnsignedInt__Alternatives"
    // InternalReactionLanguage.g:1676:1: rule__UnsignedInt__Alternatives : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__UnsignedInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1680:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_NULL) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionLanguage.g:1681:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1681:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1682:3: RULE_INT
                    {
                     before(grammarAccess.getUnsignedIntAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnsignedIntAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1687:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1687:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1688:3: RULE_NULL
                    {
                     before(grammarAccess.getUnsignedIntAccess().getNULLTerminalRuleCall_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getUnsignedIntAccess().getNULLTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedInt__Alternatives"


    // $ANTLR start "rule__SignedInt__Alternatives_1"
    // InternalReactionLanguage.g:1697:1: rule__SignedInt__Alternatives_1 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__SignedInt__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1701:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_NULL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionLanguage.g:1702:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1702:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1703:3: RULE_INT
                    {
                     before(grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1708:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1708:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1709:3: RULE_NULL
                    {
                     before(grammarAccess.getSignedIntAccess().getNULLTerminalRuleCall_1_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getSignedIntAccess().getNULLTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Alternatives_1"


    // $ANTLR start "rule__UnsignedDouble__Alternatives_0"
    // InternalReactionLanguage.g:1718:1: rule__UnsignedDouble__Alternatives_0 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__UnsignedDouble__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1722:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_NULL) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalReactionLanguage.g:1723:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1723:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1724:3: RULE_INT
                    {
                     before(grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1729:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1729:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1730:3: RULE_NULL
                    {
                     before(grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_0_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Alternatives_0"


    // $ANTLR start "rule__UnsignedDouble__Alternatives_2"
    // InternalReactionLanguage.g:1739:1: rule__UnsignedDouble__Alternatives_2 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__UnsignedDouble__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1743:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_NULL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionLanguage.g:1744:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1744:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1745:3: RULE_INT
                    {
                     before(grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_2_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1750:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1750:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1751:3: RULE_NULL
                    {
                     before(grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_2_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Alternatives_2"


    // $ANTLR start "rule__SignedDouble__Alternatives_1"
    // InternalReactionLanguage.g:1760:1: rule__SignedDouble__Alternatives_1 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__SignedDouble__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1764:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_NULL) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalReactionLanguage.g:1765:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1765:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1766:3: RULE_INT
                    {
                     before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1771:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1771:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1772:3: RULE_NULL
                    {
                     before(grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_1_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Alternatives_1"


    // $ANTLR start "rule__SignedDouble__Alternatives_3"
    // InternalReactionLanguage.g:1781:1: rule__SignedDouble__Alternatives_3 : ( ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__SignedDouble__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1785:1: ( ( RULE_INT ) | ( RULE_NULL ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_NULL) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionLanguage.g:1786:2: ( RULE_INT )
                    {
                    // InternalReactionLanguage.g:1786:2: ( RULE_INT )
                    // InternalReactionLanguage.g:1787:3: RULE_INT
                    {
                     before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1792:2: ( RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1792:2: ( RULE_NULL )
                    // InternalReactionLanguage.g:1793:3: RULE_NULL
                    {
                     before(grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_3_1()); 
                    match(input,RULE_NULL,FOLLOW_2); 
                     after(grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Alternatives_3"


    // $ANTLR start "rule__MathFunc__Alternatives"
    // InternalReactionLanguage.g:1802:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1806:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==17) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalReactionLanguage.g:1807:2: ( ( 'sqrt' ) )
                    {
                    // InternalReactionLanguage.g:1807:2: ( ( 'sqrt' ) )
                    // InternalReactionLanguage.g:1808:3: ( 'sqrt' )
                    {
                     before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    // InternalReactionLanguage.g:1809:3: ( 'sqrt' )
                    // InternalReactionLanguage.g:1809:4: 'sqrt'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1813:2: ( ( 'abs' ) )
                    {
                    // InternalReactionLanguage.g:1813:2: ( ( 'abs' ) )
                    // InternalReactionLanguage.g:1814:3: ( 'abs' )
                    {
                     before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    // InternalReactionLanguage.g:1815:3: ( 'abs' )
                    // InternalReactionLanguage.g:1815:4: 'abs'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFunc__Alternatives"


    // $ANTLR start "rule__RuleType__Alternatives"
    // InternalReactionLanguage.g:1823:1: rule__RuleType__Alternatives : ( ( ( '=>' ) ) | ( ( '<=>' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1827:1: ( ( ( '=>' ) ) | ( ( '<=>' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            else if ( (LA25_0==19) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalReactionLanguage.g:1828:2: ( ( '=>' ) )
                    {
                    // InternalReactionLanguage.g:1828:2: ( ( '=>' ) )
                    // InternalReactionLanguage.g:1829:3: ( '=>' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getUNIEnumLiteralDeclaration_0()); 
                    // InternalReactionLanguage.g:1830:3: ( '=>' )
                    // InternalReactionLanguage.g:1830:4: '=>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getUNIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1834:2: ( ( '<=>' ) )
                    {
                    // InternalReactionLanguage.g:1834:2: ( ( '<=>' ) )
                    // InternalReactionLanguage.g:1835:3: ( '<=>' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getBIEnumLiteralDeclaration_1()); 
                    // InternalReactionLanguage.g:1836:3: ( '<=>' )
                    // InternalReactionLanguage.g:1836:4: '<=>'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getBIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleType__Alternatives"


    // $ANTLR start "rule__BondType__Alternatives"
    // InternalReactionLanguage.g:1844:1: rule__BondType__Alternatives : ( ( ( '//' ) ) | ( ( '+' ) ) );
    public final void rule__BondType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1848:1: ( ( ( '//' ) ) | ( ( '+' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            else if ( (LA26_0==14) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalReactionLanguage.g:1849:2: ( ( '//' ) )
                    {
                    // InternalReactionLanguage.g:1849:2: ( ( '//' ) )
                    // InternalReactionLanguage.g:1850:3: ( '//' )
                    {
                     before(grammarAccess.getBondTypeAccess().getUNBOUNDEnumLiteralDeclaration_0()); 
                    // InternalReactionLanguage.g:1851:3: ( '//' )
                    // InternalReactionLanguage.g:1851:4: '//'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBondTypeAccess().getUNBOUNDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1855:2: ( ( '+' ) )
                    {
                    // InternalReactionLanguage.g:1855:2: ( ( '+' ) )
                    // InternalReactionLanguage.g:1856:3: ( '+' )
                    {
                     before(grammarAccess.getBondTypeAccess().getBOUNDEnumLiteralDeclaration_1()); 
                    // InternalReactionLanguage.g:1857:3: ( '+' )
                    // InternalReactionLanguage.g:1857:4: '+'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBondTypeAccess().getBOUNDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondType__Alternatives"


    // $ANTLR start "rule__ReactionModel__Group__0"
    // InternalReactionLanguage.g:1865:1: rule__ReactionModel__Group__0 : rule__ReactionModel__Group__0__Impl rule__ReactionModel__Group__1 ;
    public final void rule__ReactionModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1869:1: ( rule__ReactionModel__Group__0__Impl rule__ReactionModel__Group__1 )
            // InternalReactionLanguage.g:1870:2: rule__ReactionModel__Group__0__Impl rule__ReactionModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReactionModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__0"


    // $ANTLR start "rule__ReactionModel__Group__0__Impl"
    // InternalReactionLanguage.g:1877:1: rule__ReactionModel__Group__0__Impl : ( ( rule__ReactionModel__ElementsAssignment_0 ) ) ;
    public final void rule__ReactionModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1881:1: ( ( ( rule__ReactionModel__ElementsAssignment_0 ) ) )
            // InternalReactionLanguage.g:1882:1: ( ( rule__ReactionModel__ElementsAssignment_0 ) )
            {
            // InternalReactionLanguage.g:1882:1: ( ( rule__ReactionModel__ElementsAssignment_0 ) )
            // InternalReactionLanguage.g:1883:2: ( rule__ReactionModel__ElementsAssignment_0 )
            {
             before(grammarAccess.getReactionModelAccess().getElementsAssignment_0()); 
            // InternalReactionLanguage.g:1884:2: ( rule__ReactionModel__ElementsAssignment_0 )
            // InternalReactionLanguage.g:1884:3: rule__ReactionModel__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactionModel__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactionModelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__0__Impl"


    // $ANTLR start "rule__ReactionModel__Group__1"
    // InternalReactionLanguage.g:1892:1: rule__ReactionModel__Group__1 : rule__ReactionModel__Group__1__Impl rule__ReactionModel__Group__2 ;
    public final void rule__ReactionModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1896:1: ( rule__ReactionModel__Group__1__Impl rule__ReactionModel__Group__2 )
            // InternalReactionLanguage.g:1897:2: rule__ReactionModel__Group__1__Impl rule__ReactionModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReactionModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__1"


    // $ANTLR start "rule__ReactionModel__Group__1__Impl"
    // InternalReactionLanguage.g:1904:1: rule__ReactionModel__Group__1__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__ReactionModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1908:1: ( ( ( RULE_SL_COMMENT )? ) )
            // InternalReactionLanguage.g:1909:1: ( ( RULE_SL_COMMENT )? )
            {
            // InternalReactionLanguage.g:1909:1: ( ( RULE_SL_COMMENT )? )
            // InternalReactionLanguage.g:1910:2: ( RULE_SL_COMMENT )?
            {
             before(grammarAccess.getReactionModelAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // InternalReactionLanguage.g:1911:2: ( RULE_SL_COMMENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SL_COMMENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReactionLanguage.g:1911:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getReactionModelAccess().getSL_COMMENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__1__Impl"


    // $ANTLR start "rule__ReactionModel__Group__2"
    // InternalReactionLanguage.g:1919:1: rule__ReactionModel__Group__2 : rule__ReactionModel__Group__2__Impl ;
    public final void rule__ReactionModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1923:1: ( rule__ReactionModel__Group__2__Impl )
            // InternalReactionLanguage.g:1924:2: rule__ReactionModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactionModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__2"


    // $ANTLR start "rule__ReactionModel__Group__2__Impl"
    // InternalReactionLanguage.g:1930:1: rule__ReactionModel__Group__2__Impl : ( ( rule__ReactionModel__Group_2__0 )* ) ;
    public final void rule__ReactionModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1934:1: ( ( ( rule__ReactionModel__Group_2__0 )* ) )
            // InternalReactionLanguage.g:1935:1: ( ( rule__ReactionModel__Group_2__0 )* )
            {
            // InternalReactionLanguage.g:1935:1: ( ( rule__ReactionModel__Group_2__0 )* )
            // InternalReactionLanguage.g:1936:2: ( rule__ReactionModel__Group_2__0 )*
            {
             before(grammarAccess.getReactionModelAccess().getGroup_2()); 
            // InternalReactionLanguage.g:1937:2: ( rule__ReactionModel__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_NEWLINE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalReactionLanguage.g:1937:3: rule__ReactionModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ReactionModel__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getReactionModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group__2__Impl"


    // $ANTLR start "rule__ReactionModel__Group_2__0"
    // InternalReactionLanguage.g:1946:1: rule__ReactionModel__Group_2__0 : rule__ReactionModel__Group_2__0__Impl rule__ReactionModel__Group_2__1 ;
    public final void rule__ReactionModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1950:1: ( rule__ReactionModel__Group_2__0__Impl rule__ReactionModel__Group_2__1 )
            // InternalReactionLanguage.g:1951:2: rule__ReactionModel__Group_2__0__Impl rule__ReactionModel__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ReactionModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactionModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group_2__0"


    // $ANTLR start "rule__ReactionModel__Group_2__0__Impl"
    // InternalReactionLanguage.g:1958:1: rule__ReactionModel__Group_2__0__Impl : ( RULE_NEWLINE ) ;
    public final void rule__ReactionModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1962:1: ( ( RULE_NEWLINE ) )
            // InternalReactionLanguage.g:1963:1: ( RULE_NEWLINE )
            {
            // InternalReactionLanguage.g:1963:1: ( RULE_NEWLINE )
            // InternalReactionLanguage.g:1964:2: RULE_NEWLINE
            {
             before(grammarAccess.getReactionModelAccess().getNEWLINETerminalRuleCall_2_0()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getReactionModelAccess().getNEWLINETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group_2__0__Impl"


    // $ANTLR start "rule__ReactionModel__Group_2__1"
    // InternalReactionLanguage.g:1973:1: rule__ReactionModel__Group_2__1 : rule__ReactionModel__Group_2__1__Impl ;
    public final void rule__ReactionModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1977:1: ( rule__ReactionModel__Group_2__1__Impl )
            // InternalReactionLanguage.g:1978:2: rule__ReactionModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactionModel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group_2__1"


    // $ANTLR start "rule__ReactionModel__Group_2__1__Impl"
    // InternalReactionLanguage.g:1984:1: rule__ReactionModel__Group_2__1__Impl : ( ( rule__ReactionModel__ElementsAssignment_2_1 ) ) ;
    public final void rule__ReactionModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:1988:1: ( ( ( rule__ReactionModel__ElementsAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:1989:1: ( ( rule__ReactionModel__ElementsAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:1989:1: ( ( rule__ReactionModel__ElementsAssignment_2_1 ) )
            // InternalReactionLanguage.g:1990:2: ( rule__ReactionModel__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getReactionModelAccess().getElementsAssignment_2_1()); 
            // InternalReactionLanguage.g:1991:2: ( rule__ReactionModel__ElementsAssignment_2_1 )
            // InternalReactionLanguage.g:1991:3: rule__ReactionModel__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactionModel__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReactionModelAccess().getElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__Group_2__1__Impl"


    // $ANTLR start "rule__Agent__Group__0"
    // InternalReactionLanguage.g:2000:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2004:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalReactionLanguage.g:2005:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Agent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0"


    // $ANTLR start "rule__Agent__Group__0__Impl"
    // InternalReactionLanguage.g:2012:1: rule__Agent__Group__0__Impl : ( ( rule__Agent__NameAssignment_0 ) ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2016:1: ( ( ( rule__Agent__NameAssignment_0 ) ) )
            // InternalReactionLanguage.g:2017:1: ( ( rule__Agent__NameAssignment_0 ) )
            {
            // InternalReactionLanguage.g:2017:1: ( ( rule__Agent__NameAssignment_0 ) )
            // InternalReactionLanguage.g:2018:2: ( rule__Agent__NameAssignment_0 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_0()); 
            // InternalReactionLanguage.g:2019:2: ( rule__Agent__NameAssignment_0 )
            // InternalReactionLanguage.g:2019:3: rule__Agent__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Agent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0__Impl"


    // $ANTLR start "rule__Agent__Group__1"
    // InternalReactionLanguage.g:2027:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2031:1: ( rule__Agent__Group__1__Impl )
            // InternalReactionLanguage.g:2032:2: rule__Agent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1"


    // $ANTLR start "rule__Agent__Group__1__Impl"
    // InternalReactionLanguage.g:2038:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__Group_1__0 )? ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2042:1: ( ( ( rule__Agent__Group_1__0 )? ) )
            // InternalReactionLanguage.g:2043:1: ( ( rule__Agent__Group_1__0 )? )
            {
            // InternalReactionLanguage.g:2043:1: ( ( rule__Agent__Group_1__0 )? )
            // InternalReactionLanguage.g:2044:2: ( rule__Agent__Group_1__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_1()); 
            // InternalReactionLanguage.g:2045:2: ( rule__Agent__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalReactionLanguage.g:2045:3: rule__Agent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Agent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1__Impl"


    // $ANTLR start "rule__Agent__Group_1__0"
    // InternalReactionLanguage.g:2054:1: rule__Agent__Group_1__0 : rule__Agent__Group_1__0__Impl rule__Agent__Group_1__1 ;
    public final void rule__Agent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2058:1: ( rule__Agent__Group_1__0__Impl rule__Agent__Group_1__1 )
            // InternalReactionLanguage.g:2059:2: rule__Agent__Group_1__0__Impl rule__Agent__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Agent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__0"


    // $ANTLR start "rule__Agent__Group_1__0__Impl"
    // InternalReactionLanguage.g:2066:1: rule__Agent__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Agent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2070:1: ( ( ':' ) )
            // InternalReactionLanguage.g:2071:1: ( ':' )
            {
            // InternalReactionLanguage.g:2071:1: ( ':' )
            // InternalReactionLanguage.g:2072:2: ':'
            {
             before(grammarAccess.getAgentAccess().getColonKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__0__Impl"


    // $ANTLR start "rule__Agent__Group_1__1"
    // InternalReactionLanguage.g:2081:1: rule__Agent__Group_1__1 : rule__Agent__Group_1__1__Impl rule__Agent__Group_1__2 ;
    public final void rule__Agent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2085:1: ( rule__Agent__Group_1__1__Impl rule__Agent__Group_1__2 )
            // InternalReactionLanguage.g:2086:2: rule__Agent__Group_1__1__Impl rule__Agent__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Agent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__1"


    // $ANTLR start "rule__Agent__Group_1__1__Impl"
    // InternalReactionLanguage.g:2093:1: rule__Agent__Group_1__1__Impl : ( ( rule__Agent__SitesAssignment_1_1 ) ) ;
    public final void rule__Agent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2097:1: ( ( ( rule__Agent__SitesAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:2098:1: ( ( rule__Agent__SitesAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:2098:1: ( ( rule__Agent__SitesAssignment_1_1 ) )
            // InternalReactionLanguage.g:2099:2: ( rule__Agent__SitesAssignment_1_1 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_1_1()); 
            // InternalReactionLanguage.g:2100:2: ( rule__Agent__SitesAssignment_1_1 )
            // InternalReactionLanguage.g:2100:3: rule__Agent__SitesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Agent__SitesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getSitesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__1__Impl"


    // $ANTLR start "rule__Agent__Group_1__2"
    // InternalReactionLanguage.g:2108:1: rule__Agent__Group_1__2 : rule__Agent__Group_1__2__Impl ;
    public final void rule__Agent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2112:1: ( rule__Agent__Group_1__2__Impl )
            // InternalReactionLanguage.g:2113:2: rule__Agent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__2"


    // $ANTLR start "rule__Agent__Group_1__2__Impl"
    // InternalReactionLanguage.g:2119:1: rule__Agent__Group_1__2__Impl : ( ( rule__Agent__Group_1_2__0 )* ) ;
    public final void rule__Agent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2123:1: ( ( ( rule__Agent__Group_1_2__0 )* ) )
            // InternalReactionLanguage.g:2124:1: ( ( rule__Agent__Group_1_2__0 )* )
            {
            // InternalReactionLanguage.g:2124:1: ( ( rule__Agent__Group_1_2__0 )* )
            // InternalReactionLanguage.g:2125:2: ( rule__Agent__Group_1_2__0 )*
            {
             before(grammarAccess.getAgentAccess().getGroup_1_2()); 
            // InternalReactionLanguage.g:2126:2: ( rule__Agent__Group_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalReactionLanguage.g:2126:3: rule__Agent__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Agent__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1__2__Impl"


    // $ANTLR start "rule__Agent__Group_1_2__0"
    // InternalReactionLanguage.g:2135:1: rule__Agent__Group_1_2__0 : rule__Agent__Group_1_2__0__Impl rule__Agent__Group_1_2__1 ;
    public final void rule__Agent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2139:1: ( rule__Agent__Group_1_2__0__Impl rule__Agent__Group_1_2__1 )
            // InternalReactionLanguage.g:2140:2: rule__Agent__Group_1_2__0__Impl rule__Agent__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Agent__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1_2__0"


    // $ANTLR start "rule__Agent__Group_1_2__0__Impl"
    // InternalReactionLanguage.g:2147:1: rule__Agent__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Agent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2151:1: ( ( ',' ) )
            // InternalReactionLanguage.g:2152:1: ( ',' )
            {
            // InternalReactionLanguage.g:2152:1: ( ',' )
            // InternalReactionLanguage.g:2153:2: ','
            {
             before(grammarAccess.getAgentAccess().getCommaKeyword_1_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1_2__0__Impl"


    // $ANTLR start "rule__Agent__Group_1_2__1"
    // InternalReactionLanguage.g:2162:1: rule__Agent__Group_1_2__1 : rule__Agent__Group_1_2__1__Impl ;
    public final void rule__Agent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2166:1: ( rule__Agent__Group_1_2__1__Impl )
            // InternalReactionLanguage.g:2167:2: rule__Agent__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1_2__1"


    // $ANTLR start "rule__Agent__Group_1_2__1__Impl"
    // InternalReactionLanguage.g:2173:1: rule__Agent__Group_1_2__1__Impl : ( ( rule__Agent__SitesAssignment_1_2_1 ) ) ;
    public final void rule__Agent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2177:1: ( ( ( rule__Agent__SitesAssignment_1_2_1 ) ) )
            // InternalReactionLanguage.g:2178:1: ( ( rule__Agent__SitesAssignment_1_2_1 ) )
            {
            // InternalReactionLanguage.g:2178:1: ( ( rule__Agent__SitesAssignment_1_2_1 ) )
            // InternalReactionLanguage.g:2179:2: ( rule__Agent__SitesAssignment_1_2_1 )
            {
             before(grammarAccess.getAgentAccess().getSitesAssignment_1_2_1()); 
            // InternalReactionLanguage.g:2180:2: ( rule__Agent__SitesAssignment_1_2_1 )
            // InternalReactionLanguage.g:2180:3: rule__Agent__SitesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Agent__SitesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getSitesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group_1_2__1__Impl"


    // $ANTLR start "rule__AgentDeclaration__Group__0"
    // InternalReactionLanguage.g:2189:1: rule__AgentDeclaration__Group__0 : rule__AgentDeclaration__Group__0__Impl rule__AgentDeclaration__Group__1 ;
    public final void rule__AgentDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2193:1: ( rule__AgentDeclaration__Group__0__Impl rule__AgentDeclaration__Group__1 )
            // InternalReactionLanguage.g:2194:2: rule__AgentDeclaration__Group__0__Impl rule__AgentDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AgentDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__0"


    // $ANTLR start "rule__AgentDeclaration__Group__0__Impl"
    // InternalReactionLanguage.g:2201:1: rule__AgentDeclaration__Group__0__Impl : ( 'agent' ) ;
    public final void rule__AgentDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2205:1: ( ( 'agent' ) )
            // InternalReactionLanguage.g:2206:1: ( 'agent' )
            {
            // InternalReactionLanguage.g:2206:1: ( 'agent' )
            // InternalReactionLanguage.g:2207:2: 'agent'
            {
             before(grammarAccess.getAgentDeclarationAccess().getAgentKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAgentDeclarationAccess().getAgentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AgentDeclaration__Group__1"
    // InternalReactionLanguage.g:2216:1: rule__AgentDeclaration__Group__1 : rule__AgentDeclaration__Group__1__Impl rule__AgentDeclaration__Group__2 ;
    public final void rule__AgentDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2220:1: ( rule__AgentDeclaration__Group__1__Impl rule__AgentDeclaration__Group__2 )
            // InternalReactionLanguage.g:2221:2: rule__AgentDeclaration__Group__1__Impl rule__AgentDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AgentDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__1"


    // $ANTLR start "rule__AgentDeclaration__Group__1__Impl"
    // InternalReactionLanguage.g:2228:1: rule__AgentDeclaration__Group__1__Impl : ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 ) ) ;
    public final void rule__AgentDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2232:1: ( ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 ) ) )
            // InternalReactionLanguage.g:2233:1: ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 ) )
            {
            // InternalReactionLanguage.g:2233:1: ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 ) )
            // InternalReactionLanguage.g:2234:2: ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 )
            {
             before(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAssignment_1()); 
            // InternalReactionLanguage.g:2235:2: ( rule__AgentDeclaration__DeclaredAgentsAssignment_1 )
            // InternalReactionLanguage.g:2235:3: rule__AgentDeclaration__DeclaredAgentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__DeclaredAgentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AgentDeclaration__Group__2"
    // InternalReactionLanguage.g:2243:1: rule__AgentDeclaration__Group__2 : rule__AgentDeclaration__Group__2__Impl ;
    public final void rule__AgentDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2247:1: ( rule__AgentDeclaration__Group__2__Impl )
            // InternalReactionLanguage.g:2248:2: rule__AgentDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__2"


    // $ANTLR start "rule__AgentDeclaration__Group__2__Impl"
    // InternalReactionLanguage.g:2254:1: rule__AgentDeclaration__Group__2__Impl : ( ( rule__AgentDeclaration__Group_2__0 )* ) ;
    public final void rule__AgentDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2258:1: ( ( ( rule__AgentDeclaration__Group_2__0 )* ) )
            // InternalReactionLanguage.g:2259:1: ( ( rule__AgentDeclaration__Group_2__0 )* )
            {
            // InternalReactionLanguage.g:2259:1: ( ( rule__AgentDeclaration__Group_2__0 )* )
            // InternalReactionLanguage.g:2260:2: ( rule__AgentDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getAgentDeclarationAccess().getGroup_2()); 
            // InternalReactionLanguage.g:2261:2: ( rule__AgentDeclaration__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalReactionLanguage.g:2261:3: rule__AgentDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AgentDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAgentDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AgentDeclaration__Group_2__0"
    // InternalReactionLanguage.g:2270:1: rule__AgentDeclaration__Group_2__0 : rule__AgentDeclaration__Group_2__0__Impl rule__AgentDeclaration__Group_2__1 ;
    public final void rule__AgentDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2274:1: ( rule__AgentDeclaration__Group_2__0__Impl rule__AgentDeclaration__Group_2__1 )
            // InternalReactionLanguage.g:2275:2: rule__AgentDeclaration__Group_2__0__Impl rule__AgentDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__AgentDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group_2__0"


    // $ANTLR start "rule__AgentDeclaration__Group_2__0__Impl"
    // InternalReactionLanguage.g:2282:1: rule__AgentDeclaration__Group_2__0__Impl : ( ';' ) ;
    public final void rule__AgentDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2286:1: ( ( ';' ) )
            // InternalReactionLanguage.g:2287:1: ( ';' )
            {
            // InternalReactionLanguage.g:2287:1: ( ';' )
            // InternalReactionLanguage.g:2288:2: ';'
            {
             before(grammarAccess.getAgentDeclarationAccess().getSemicolonKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAgentDeclarationAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__AgentDeclaration__Group_2__1"
    // InternalReactionLanguage.g:2297:1: rule__AgentDeclaration__Group_2__1 : rule__AgentDeclaration__Group_2__1__Impl ;
    public final void rule__AgentDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2301:1: ( rule__AgentDeclaration__Group_2__1__Impl )
            // InternalReactionLanguage.g:2302:2: rule__AgentDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group_2__1"


    // $ANTLR start "rule__AgentDeclaration__Group_2__1__Impl"
    // InternalReactionLanguage.g:2308:1: rule__AgentDeclaration__Group_2__1__Impl : ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 ) ) ;
    public final void rule__AgentDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2312:1: ( ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:2313:1: ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:2313:1: ( ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 ) )
            // InternalReactionLanguage.g:2314:2: ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 )
            {
             before(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAssignment_2_1()); 
            // InternalReactionLanguage.g:2315:2: ( rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 )
            // InternalReactionLanguage.g:2315:3: rule__AgentDeclaration__DeclaredAgentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentDeclaration__DeclaredAgentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__AgentInstance__Group__0"
    // InternalReactionLanguage.g:2324:1: rule__AgentInstance__Group__0 : rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 ;
    public final void rule__AgentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2328:1: ( rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1 )
            // InternalReactionLanguage.g:2329:2: rule__AgentInstance__Group__0__Impl rule__AgentInstance__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AgentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__0"


    // $ANTLR start "rule__AgentInstance__Group__0__Impl"
    // InternalReactionLanguage.g:2336:1: rule__AgentInstance__Group__0__Impl : ( ( rule__AgentInstance__NameAssignment_0 ) ) ;
    public final void rule__AgentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2340:1: ( ( ( rule__AgentInstance__NameAssignment_0 ) ) )
            // InternalReactionLanguage.g:2341:1: ( ( rule__AgentInstance__NameAssignment_0 ) )
            {
            // InternalReactionLanguage.g:2341:1: ( ( rule__AgentInstance__NameAssignment_0 ) )
            // InternalReactionLanguage.g:2342:2: ( rule__AgentInstance__NameAssignment_0 )
            {
             before(grammarAccess.getAgentInstanceAccess().getNameAssignment_0()); 
            // InternalReactionLanguage.g:2343:2: ( rule__AgentInstance__NameAssignment_0 )
            // InternalReactionLanguage.g:2343:3: rule__AgentInstance__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__0__Impl"


    // $ANTLR start "rule__AgentInstance__Group__1"
    // InternalReactionLanguage.g:2351:1: rule__AgentInstance__Group__1 : rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 ;
    public final void rule__AgentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2355:1: ( rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2 )
            // InternalReactionLanguage.g:2356:2: rule__AgentInstance__Group__1__Impl rule__AgentInstance__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AgentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__1"


    // $ANTLR start "rule__AgentInstance__Group__1__Impl"
    // InternalReactionLanguage.g:2363:1: rule__AgentInstance__Group__1__Impl : ( ':' ) ;
    public final void rule__AgentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2367:1: ( ( ':' ) )
            // InternalReactionLanguage.g:2368:1: ( ':' )
            {
            // InternalReactionLanguage.g:2368:1: ( ':' )
            // InternalReactionLanguage.g:2369:2: ':'
            {
             before(grammarAccess.getAgentInstanceAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__1__Impl"


    // $ANTLR start "rule__AgentInstance__Group__2"
    // InternalReactionLanguage.g:2378:1: rule__AgentInstance__Group__2 : rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 ;
    public final void rule__AgentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2382:1: ( rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3 )
            // InternalReactionLanguage.g:2383:2: rule__AgentInstance__Group__2__Impl rule__AgentInstance__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AgentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__2"


    // $ANTLR start "rule__AgentInstance__Group__2__Impl"
    // InternalReactionLanguage.g:2390:1: rule__AgentInstance__Group__2__Impl : ( ( rule__AgentInstance__InstanceOfAssignment_2 ) ) ;
    public final void rule__AgentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2394:1: ( ( ( rule__AgentInstance__InstanceOfAssignment_2 ) ) )
            // InternalReactionLanguage.g:2395:1: ( ( rule__AgentInstance__InstanceOfAssignment_2 ) )
            {
            // InternalReactionLanguage.g:2395:1: ( ( rule__AgentInstance__InstanceOfAssignment_2 ) )
            // InternalReactionLanguage.g:2396:2: ( rule__AgentInstance__InstanceOfAssignment_2 )
            {
             before(grammarAccess.getAgentInstanceAccess().getInstanceOfAssignment_2()); 
            // InternalReactionLanguage.g:2397:2: ( rule__AgentInstance__InstanceOfAssignment_2 )
            // InternalReactionLanguage.g:2397:3: rule__AgentInstance__InstanceOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__InstanceOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getInstanceOfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__2__Impl"


    // $ANTLR start "rule__AgentInstance__Group__3"
    // InternalReactionLanguage.g:2405:1: rule__AgentInstance__Group__3 : rule__AgentInstance__Group__3__Impl ;
    public final void rule__AgentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2409:1: ( rule__AgentInstance__Group__3__Impl )
            // InternalReactionLanguage.g:2410:2: rule__AgentInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__3"


    // $ANTLR start "rule__AgentInstance__Group__3__Impl"
    // InternalReactionLanguage.g:2416:1: rule__AgentInstance__Group__3__Impl : ( ( rule__AgentInstance__Group_3__0 )? ) ;
    public final void rule__AgentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2420:1: ( ( ( rule__AgentInstance__Group_3__0 )? ) )
            // InternalReactionLanguage.g:2421:1: ( ( rule__AgentInstance__Group_3__0 )? )
            {
            // InternalReactionLanguage.g:2421:1: ( ( rule__AgentInstance__Group_3__0 )? )
            // InternalReactionLanguage.g:2422:2: ( rule__AgentInstance__Group_3__0 )?
            {
             before(grammarAccess.getAgentInstanceAccess().getGroup_3()); 
            // InternalReactionLanguage.g:2423:2: ( rule__AgentInstance__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalReactionLanguage.g:2423:3: rule__AgentInstance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AgentInstance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgentInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group__3__Impl"


    // $ANTLR start "rule__AgentInstance__Group_3__0"
    // InternalReactionLanguage.g:2432:1: rule__AgentInstance__Group_3__0 : rule__AgentInstance__Group_3__0__Impl rule__AgentInstance__Group_3__1 ;
    public final void rule__AgentInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2436:1: ( rule__AgentInstance__Group_3__0__Impl rule__AgentInstance__Group_3__1 )
            // InternalReactionLanguage.g:2437:2: rule__AgentInstance__Group_3__0__Impl rule__AgentInstance__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__AgentInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__0"


    // $ANTLR start "rule__AgentInstance__Group_3__0__Impl"
    // InternalReactionLanguage.g:2444:1: rule__AgentInstance__Group_3__0__Impl : ( ( rule__AgentInstance__ArrayAssignment_3_0 ) ) ;
    public final void rule__AgentInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2448:1: ( ( ( rule__AgentInstance__ArrayAssignment_3_0 ) ) )
            // InternalReactionLanguage.g:2449:1: ( ( rule__AgentInstance__ArrayAssignment_3_0 ) )
            {
            // InternalReactionLanguage.g:2449:1: ( ( rule__AgentInstance__ArrayAssignment_3_0 ) )
            // InternalReactionLanguage.g:2450:2: ( rule__AgentInstance__ArrayAssignment_3_0 )
            {
             before(grammarAccess.getAgentInstanceAccess().getArrayAssignment_3_0()); 
            // InternalReactionLanguage.g:2451:2: ( rule__AgentInstance__ArrayAssignment_3_0 )
            // InternalReactionLanguage.g:2451:3: rule__AgentInstance__ArrayAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__ArrayAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getArrayAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__0__Impl"


    // $ANTLR start "rule__AgentInstance__Group_3__1"
    // InternalReactionLanguage.g:2459:1: rule__AgentInstance__Group_3__1 : rule__AgentInstance__Group_3__1__Impl rule__AgentInstance__Group_3__2 ;
    public final void rule__AgentInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2463:1: ( rule__AgentInstance__Group_3__1__Impl rule__AgentInstance__Group_3__2 )
            // InternalReactionLanguage.g:2464:2: rule__AgentInstance__Group_3__1__Impl rule__AgentInstance__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__AgentInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__1"


    // $ANTLR start "rule__AgentInstance__Group_3__1__Impl"
    // InternalReactionLanguage.g:2471:1: rule__AgentInstance__Group_3__1__Impl : ( ( rule__AgentInstance__SizeAssignment_3_1 ) ) ;
    public final void rule__AgentInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2475:1: ( ( ( rule__AgentInstance__SizeAssignment_3_1 ) ) )
            // InternalReactionLanguage.g:2476:1: ( ( rule__AgentInstance__SizeAssignment_3_1 ) )
            {
            // InternalReactionLanguage.g:2476:1: ( ( rule__AgentInstance__SizeAssignment_3_1 ) )
            // InternalReactionLanguage.g:2477:2: ( rule__AgentInstance__SizeAssignment_3_1 )
            {
             before(grammarAccess.getAgentInstanceAccess().getSizeAssignment_3_1()); 
            // InternalReactionLanguage.g:2478:2: ( rule__AgentInstance__SizeAssignment_3_1 )
            // InternalReactionLanguage.g:2478:3: rule__AgentInstance__SizeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__SizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentInstanceAccess().getSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__1__Impl"


    // $ANTLR start "rule__AgentInstance__Group_3__2"
    // InternalReactionLanguage.g:2486:1: rule__AgentInstance__Group_3__2 : rule__AgentInstance__Group_3__2__Impl ;
    public final void rule__AgentInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2490:1: ( rule__AgentInstance__Group_3__2__Impl )
            // InternalReactionLanguage.g:2491:2: rule__AgentInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgentInstance__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__2"


    // $ANTLR start "rule__AgentInstance__Group_3__2__Impl"
    // InternalReactionLanguage.g:2497:1: rule__AgentInstance__Group_3__2__Impl : ( ']' ) ;
    public final void rule__AgentInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2501:1: ( ( ']' ) )
            // InternalReactionLanguage.g:2502:1: ( ']' )
            {
            // InternalReactionLanguage.g:2502:1: ( ']' )
            // InternalReactionLanguage.g:2503:2: ']'
            {
             before(grammarAccess.getAgentInstanceAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__Group_3__2__Impl"


    // $ANTLR start "rule__Site__Group__0"
    // InternalReactionLanguage.g:2513:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2517:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // InternalReactionLanguage.g:2518:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Site__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0"


    // $ANTLR start "rule__Site__Group__0__Impl"
    // InternalReactionLanguage.g:2525:1: rule__Site__Group__0__Impl : ( ( rule__Site__NameAssignment_0 ) ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2529:1: ( ( ( rule__Site__NameAssignment_0 ) ) )
            // InternalReactionLanguage.g:2530:1: ( ( rule__Site__NameAssignment_0 ) )
            {
            // InternalReactionLanguage.g:2530:1: ( ( rule__Site__NameAssignment_0 ) )
            // InternalReactionLanguage.g:2531:2: ( rule__Site__NameAssignment_0 )
            {
             before(grammarAccess.getSiteAccess().getNameAssignment_0()); 
            // InternalReactionLanguage.g:2532:2: ( rule__Site__NameAssignment_0 )
            // InternalReactionLanguage.g:2532:3: rule__Site__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Site__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0__Impl"


    // $ANTLR start "rule__Site__Group__1"
    // InternalReactionLanguage.g:2540:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2544:1: ( rule__Site__Group__1__Impl )
            // InternalReactionLanguage.g:2545:2: rule__Site__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1"


    // $ANTLR start "rule__Site__Group__1__Impl"
    // InternalReactionLanguage.g:2551:1: rule__Site__Group__1__Impl : ( ( rule__Site__Group_1__0 )? ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2555:1: ( ( ( rule__Site__Group_1__0 )? ) )
            // InternalReactionLanguage.g:2556:1: ( ( rule__Site__Group_1__0 )? )
            {
            // InternalReactionLanguage.g:2556:1: ( ( rule__Site__Group_1__0 )? )
            // InternalReactionLanguage.g:2557:2: ( rule__Site__Group_1__0 )?
            {
             before(grammarAccess.getSiteAccess().getGroup_1()); 
            // InternalReactionLanguage.g:2558:2: ( rule__Site__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalReactionLanguage.g:2558:3: rule__Site__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Site__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiteAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1__Impl"


    // $ANTLR start "rule__Site__Group_1__0"
    // InternalReactionLanguage.g:2567:1: rule__Site__Group_1__0 : rule__Site__Group_1__0__Impl rule__Site__Group_1__1 ;
    public final void rule__Site__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2571:1: ( rule__Site__Group_1__0__Impl rule__Site__Group_1__1 )
            // InternalReactionLanguage.g:2572:2: rule__Site__Group_1__0__Impl rule__Site__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Site__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__0"


    // $ANTLR start "rule__Site__Group_1__0__Impl"
    // InternalReactionLanguage.g:2579:1: rule__Site__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Site__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2583:1: ( ( '(' ) )
            // InternalReactionLanguage.g:2584:1: ( '(' )
            {
            // InternalReactionLanguage.g:2584:1: ( '(' )
            // InternalReactionLanguage.g:2585:2: '('
            {
             before(grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__0__Impl"


    // $ANTLR start "rule__Site__Group_1__1"
    // InternalReactionLanguage.g:2594:1: rule__Site__Group_1__1 : rule__Site__Group_1__1__Impl rule__Site__Group_1__2 ;
    public final void rule__Site__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2598:1: ( rule__Site__Group_1__1__Impl rule__Site__Group_1__2 )
            // InternalReactionLanguage.g:2599:2: rule__Site__Group_1__1__Impl rule__Site__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Site__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__1"


    // $ANTLR start "rule__Site__Group_1__1__Impl"
    // InternalReactionLanguage.g:2606:1: rule__Site__Group_1__1__Impl : ( ( rule__Site__StatesAssignment_1_1 ) ) ;
    public final void rule__Site__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2610:1: ( ( ( rule__Site__StatesAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:2611:1: ( ( rule__Site__StatesAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:2611:1: ( ( rule__Site__StatesAssignment_1_1 ) )
            // InternalReactionLanguage.g:2612:2: ( rule__Site__StatesAssignment_1_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1_1()); 
            // InternalReactionLanguage.g:2613:2: ( rule__Site__StatesAssignment_1_1 )
            // InternalReactionLanguage.g:2613:3: rule__Site__StatesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Site__StatesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getStatesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__1__Impl"


    // $ANTLR start "rule__Site__Group_1__2"
    // InternalReactionLanguage.g:2621:1: rule__Site__Group_1__2 : rule__Site__Group_1__2__Impl rule__Site__Group_1__3 ;
    public final void rule__Site__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2625:1: ( rule__Site__Group_1__2__Impl rule__Site__Group_1__3 )
            // InternalReactionLanguage.g:2626:2: rule__Site__Group_1__2__Impl rule__Site__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__Site__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__2"


    // $ANTLR start "rule__Site__Group_1__2__Impl"
    // InternalReactionLanguage.g:2633:1: rule__Site__Group_1__2__Impl : ( ( rule__Site__Group_1_2__0 )* ) ;
    public final void rule__Site__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2637:1: ( ( ( rule__Site__Group_1_2__0 )* ) )
            // InternalReactionLanguage.g:2638:1: ( ( rule__Site__Group_1_2__0 )* )
            {
            // InternalReactionLanguage.g:2638:1: ( ( rule__Site__Group_1_2__0 )* )
            // InternalReactionLanguage.g:2639:2: ( rule__Site__Group_1_2__0 )*
            {
             before(grammarAccess.getSiteAccess().getGroup_1_2()); 
            // InternalReactionLanguage.g:2640:2: ( rule__Site__Group_1_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalReactionLanguage.g:2640:3: rule__Site__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Site__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSiteAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__2__Impl"


    // $ANTLR start "rule__Site__Group_1__3"
    // InternalReactionLanguage.g:2648:1: rule__Site__Group_1__3 : rule__Site__Group_1__3__Impl ;
    public final void rule__Site__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2652:1: ( rule__Site__Group_1__3__Impl )
            // InternalReactionLanguage.g:2653:2: rule__Site__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__3"


    // $ANTLR start "rule__Site__Group_1__3__Impl"
    // InternalReactionLanguage.g:2659:1: rule__Site__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Site__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2663:1: ( ( ')' ) )
            // InternalReactionLanguage.g:2664:1: ( ')' )
            {
            // InternalReactionLanguage.g:2664:1: ( ')' )
            // InternalReactionLanguage.g:2665:2: ')'
            {
             before(grammarAccess.getSiteAccess().getRightParenthesisKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSiteAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1__3__Impl"


    // $ANTLR start "rule__Site__Group_1_2__0"
    // InternalReactionLanguage.g:2675:1: rule__Site__Group_1_2__0 : rule__Site__Group_1_2__0__Impl rule__Site__Group_1_2__1 ;
    public final void rule__Site__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2679:1: ( rule__Site__Group_1_2__0__Impl rule__Site__Group_1_2__1 )
            // InternalReactionLanguage.g:2680:2: rule__Site__Group_1_2__0__Impl rule__Site__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Site__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Site__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1_2__0"


    // $ANTLR start "rule__Site__Group_1_2__0__Impl"
    // InternalReactionLanguage.g:2687:1: rule__Site__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Site__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2691:1: ( ( ',' ) )
            // InternalReactionLanguage.g:2692:1: ( ',' )
            {
            // InternalReactionLanguage.g:2692:1: ( ',' )
            // InternalReactionLanguage.g:2693:2: ','
            {
             before(grammarAccess.getSiteAccess().getCommaKeyword_1_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSiteAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1_2__0__Impl"


    // $ANTLR start "rule__Site__Group_1_2__1"
    // InternalReactionLanguage.g:2702:1: rule__Site__Group_1_2__1 : rule__Site__Group_1_2__1__Impl ;
    public final void rule__Site__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2706:1: ( rule__Site__Group_1_2__1__Impl )
            // InternalReactionLanguage.g:2707:2: rule__Site__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Site__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1_2__1"


    // $ANTLR start "rule__Site__Group_1_2__1__Impl"
    // InternalReactionLanguage.g:2713:1: rule__Site__Group_1_2__1__Impl : ( ( rule__Site__StatesAssignment_1_2_1 ) ) ;
    public final void rule__Site__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2717:1: ( ( ( rule__Site__StatesAssignment_1_2_1 ) ) )
            // InternalReactionLanguage.g:2718:1: ( ( rule__Site__StatesAssignment_1_2_1 ) )
            {
            // InternalReactionLanguage.g:2718:1: ( ( rule__Site__StatesAssignment_1_2_1 ) )
            // InternalReactionLanguage.g:2719:2: ( rule__Site__StatesAssignment_1_2_1 )
            {
             before(grammarAccess.getSiteAccess().getStatesAssignment_1_2_1()); 
            // InternalReactionLanguage.g:2720:2: ( rule__Site__StatesAssignment_1_2_1 )
            // InternalReactionLanguage.g:2720:3: rule__Site__StatesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Site__StatesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getStatesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group_1_2__1__Impl"


    // $ANTLR start "rule__Complex__Group__0"
    // InternalReactionLanguage.g:2729:1: rule__Complex__Group__0 : rule__Complex__Group__0__Impl rule__Complex__Group__1 ;
    public final void rule__Complex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2733:1: ( rule__Complex__Group__0__Impl rule__Complex__Group__1 )
            // InternalReactionLanguage.g:2734:2: rule__Complex__Group__0__Impl rule__Complex__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Complex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0"


    // $ANTLR start "rule__Complex__Group__0__Impl"
    // InternalReactionLanguage.g:2741:1: rule__Complex__Group__0__Impl : ( 'complex' ) ;
    public final void rule__Complex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2745:1: ( ( 'complex' ) )
            // InternalReactionLanguage.g:2746:1: ( 'complex' )
            {
            // InternalReactionLanguage.g:2746:1: ( 'complex' )
            // InternalReactionLanguage.g:2747:2: 'complex'
            {
             before(grammarAccess.getComplexAccess().getComplexKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getComplexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__0__Impl"


    // $ANTLR start "rule__Complex__Group__1"
    // InternalReactionLanguage.g:2756:1: rule__Complex__Group__1 : rule__Complex__Group__1__Impl rule__Complex__Group__2 ;
    public final void rule__Complex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2760:1: ( rule__Complex__Group__1__Impl rule__Complex__Group__2 )
            // InternalReactionLanguage.g:2761:2: rule__Complex__Group__1__Impl rule__Complex__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Complex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1"


    // $ANTLR start "rule__Complex__Group__1__Impl"
    // InternalReactionLanguage.g:2768:1: rule__Complex__Group__1__Impl : ( ( rule__Complex__SignatureAssignment_1 ) ) ;
    public final void rule__Complex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2772:1: ( ( ( rule__Complex__SignatureAssignment_1 ) ) )
            // InternalReactionLanguage.g:2773:1: ( ( rule__Complex__SignatureAssignment_1 ) )
            {
            // InternalReactionLanguage.g:2773:1: ( ( rule__Complex__SignatureAssignment_1 ) )
            // InternalReactionLanguage.g:2774:2: ( rule__Complex__SignatureAssignment_1 )
            {
             before(grammarAccess.getComplexAccess().getSignatureAssignment_1()); 
            // InternalReactionLanguage.g:2775:2: ( rule__Complex__SignatureAssignment_1 )
            // InternalReactionLanguage.g:2775:3: rule__Complex__SignatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Complex__SignatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexAccess().getSignatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__1__Impl"


    // $ANTLR start "rule__Complex__Group__2"
    // InternalReactionLanguage.g:2783:1: rule__Complex__Group__2 : rule__Complex__Group__2__Impl rule__Complex__Group__3 ;
    public final void rule__Complex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2787:1: ( rule__Complex__Group__2__Impl rule__Complex__Group__3 )
            // InternalReactionLanguage.g:2788:2: rule__Complex__Group__2__Impl rule__Complex__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Complex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2"


    // $ANTLR start "rule__Complex__Group__2__Impl"
    // InternalReactionLanguage.g:2795:1: rule__Complex__Group__2__Impl : ( '{' ) ;
    public final void rule__Complex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2799:1: ( ( '{' ) )
            // InternalReactionLanguage.g:2800:1: ( '{' )
            {
            // InternalReactionLanguage.g:2800:1: ( '{' )
            // InternalReactionLanguage.g:2801:2: '{'
            {
             before(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__2__Impl"


    // $ANTLR start "rule__Complex__Group__3"
    // InternalReactionLanguage.g:2810:1: rule__Complex__Group__3 : rule__Complex__Group__3__Impl rule__Complex__Group__4 ;
    public final void rule__Complex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2814:1: ( rule__Complex__Group__3__Impl rule__Complex__Group__4 )
            // InternalReactionLanguage.g:2815:2: rule__Complex__Group__3__Impl rule__Complex__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Complex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complex__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3"


    // $ANTLR start "rule__Complex__Group__3__Impl"
    // InternalReactionLanguage.g:2822:1: rule__Complex__Group__3__Impl : ( ( rule__Complex__ElementsAssignment_3 )* ) ;
    public final void rule__Complex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2826:1: ( ( ( rule__Complex__ElementsAssignment_3 )* ) )
            // InternalReactionLanguage.g:2827:1: ( ( rule__Complex__ElementsAssignment_3 )* )
            {
            // InternalReactionLanguage.g:2827:1: ( ( rule__Complex__ElementsAssignment_3 )* )
            // InternalReactionLanguage.g:2828:2: ( rule__Complex__ElementsAssignment_3 )*
            {
             before(grammarAccess.getComplexAccess().getElementsAssignment_3()); 
            // InternalReactionLanguage.g:2829:2: ( rule__Complex__ElementsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28||LA35_0==31||LA35_0==35||LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalReactionLanguage.g:2829:3: rule__Complex__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Complex__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getComplexAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__3__Impl"


    // $ANTLR start "rule__Complex__Group__4"
    // InternalReactionLanguage.g:2837:1: rule__Complex__Group__4 : rule__Complex__Group__4__Impl ;
    public final void rule__Complex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2841:1: ( rule__Complex__Group__4__Impl )
            // InternalReactionLanguage.g:2842:2: rule__Complex__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complex__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4"


    // $ANTLR start "rule__Complex__Group__4__Impl"
    // InternalReactionLanguage.g:2848:1: rule__Complex__Group__4__Impl : ( '}' ) ;
    public final void rule__Complex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2852:1: ( ( '}' ) )
            // InternalReactionLanguage.g:2853:1: ( '}' )
            {
            // InternalReactionLanguage.g:2853:1: ( '}' )
            // InternalReactionLanguage.g:2854:2: '}'
            {
             before(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalReactionLanguage.g:2864:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2868:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalReactionLanguage.g:2869:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalReactionLanguage.g:2876:1: rule__Signature__Group__0__Impl : ( '(' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2880:1: ( ( '(' ) )
            // InternalReactionLanguage.g:2881:1: ( '(' )
            {
            // InternalReactionLanguage.g:2881:1: ( '(' )
            // InternalReactionLanguage.g:2882:2: '('
            {
             before(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalReactionLanguage.g:2891:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2895:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalReactionLanguage.g:2896:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalReactionLanguage.g:2903:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__InstancesAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2907:1: ( ( ( rule__Signature__InstancesAssignment_1 ) ) )
            // InternalReactionLanguage.g:2908:1: ( ( rule__Signature__InstancesAssignment_1 ) )
            {
            // InternalReactionLanguage.g:2908:1: ( ( rule__Signature__InstancesAssignment_1 ) )
            // InternalReactionLanguage.g:2909:2: ( rule__Signature__InstancesAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getInstancesAssignment_1()); 
            // InternalReactionLanguage.g:2910:2: ( rule__Signature__InstancesAssignment_1 )
            // InternalReactionLanguage.g:2910:3: rule__Signature__InstancesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__InstancesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getInstancesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalReactionLanguage.g:2918:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2922:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalReactionLanguage.g:2923:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalReactionLanguage.g:2930:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )* ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2934:1: ( ( ( rule__Signature__Group_2__0 )* ) )
            // InternalReactionLanguage.g:2935:1: ( ( rule__Signature__Group_2__0 )* )
            {
            // InternalReactionLanguage.g:2935:1: ( ( rule__Signature__Group_2__0 )* )
            // InternalReactionLanguage.g:2936:2: ( rule__Signature__Group_2__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalReactionLanguage.g:2937:2: ( rule__Signature__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==22) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalReactionLanguage.g:2937:3: rule__Signature__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Signature__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalReactionLanguage.g:2945:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2949:1: ( rule__Signature__Group__3__Impl )
            // InternalReactionLanguage.g:2950:2: rule__Signature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalReactionLanguage.g:2956:1: rule__Signature__Group__3__Impl : ( ')' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2960:1: ( ( ')' ) )
            // InternalReactionLanguage.g:2961:1: ( ')' )
            {
            // InternalReactionLanguage.g:2961:1: ( ')' )
            // InternalReactionLanguage.g:2962:2: ')'
            {
             before(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group_2__0"
    // InternalReactionLanguage.g:2972:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2976:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalReactionLanguage.g:2977:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0"


    // $ANTLR start "rule__Signature__Group_2__0__Impl"
    // InternalReactionLanguage.g:2984:1: rule__Signature__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:2988:1: ( ( ',' ) )
            // InternalReactionLanguage.g:2989:1: ( ',' )
            {
            // InternalReactionLanguage.g:2989:1: ( ',' )
            // InternalReactionLanguage.g:2990:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_2__1"
    // InternalReactionLanguage.g:2999:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3003:1: ( rule__Signature__Group_2__1__Impl )
            // InternalReactionLanguage.g:3004:2: rule__Signature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1"


    // $ANTLR start "rule__Signature__Group_2__1__Impl"
    // InternalReactionLanguage.g:3010:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__InstancesAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3014:1: ( ( ( rule__Signature__InstancesAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:3015:1: ( ( rule__Signature__InstancesAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:3015:1: ( ( rule__Signature__InstancesAssignment_2_1 ) )
            // InternalReactionLanguage.g:3016:2: ( rule__Signature__InstancesAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getInstancesAssignment_2_1()); 
            // InternalReactionLanguage.g:3017:2: ( rule__Signature__InstancesAssignment_2_1 )
            // InternalReactionLanguage.g:3017:3: rule__Signature__InstancesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__InstancesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getInstancesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalReactionLanguage.g:3026:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3030:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalReactionLanguage.g:3031:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalReactionLanguage.g:3038:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3042:1: ( ( 'rule' ) )
            // InternalReactionLanguage.g:3043:1: ( 'rule' )
            {
            // InternalReactionLanguage.g:3043:1: ( 'rule' )
            // InternalReactionLanguage.g:3044:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalReactionLanguage.g:3053:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3057:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalReactionLanguage.g:3058:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalReactionLanguage.g:3065:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__HeadAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3069:1: ( ( ( rule__Rule__HeadAssignment_1 ) ) )
            // InternalReactionLanguage.g:3070:1: ( ( rule__Rule__HeadAssignment_1 ) )
            {
            // InternalReactionLanguage.g:3070:1: ( ( rule__Rule__HeadAssignment_1 ) )
            // InternalReactionLanguage.g:3071:2: ( rule__Rule__HeadAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getHeadAssignment_1()); 
            // InternalReactionLanguage.g:3072:2: ( rule__Rule__HeadAssignment_1 )
            // InternalReactionLanguage.g:3072:3: rule__Rule__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getHeadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalReactionLanguage.g:3080:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3084:1: ( rule__Rule__Group__2__Impl )
            // InternalReactionLanguage.g:3085:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalReactionLanguage.g:3091:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__BodyAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3095:1: ( ( ( rule__Rule__BodyAssignment_2 ) ) )
            // InternalReactionLanguage.g:3096:1: ( ( rule__Rule__BodyAssignment_2 ) )
            {
            // InternalReactionLanguage.g:3096:1: ( ( rule__Rule__BodyAssignment_2 ) )
            // InternalReactionLanguage.g:3097:2: ( rule__Rule__BodyAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_2()); 
            // InternalReactionLanguage.g:3098:2: ( rule__Rule__BodyAssignment_2 )
            // InternalReactionLanguage.g:3098:3: rule__Rule__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__RuleHead__Group__0"
    // InternalReactionLanguage.g:3107:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3111:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // InternalReactionLanguage.g:3112:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleHead__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__0"


    // $ANTLR start "rule__RuleHead__Group__0__Impl"
    // InternalReactionLanguage.g:3119:1: rule__RuleHead__Group__0__Impl : ( ( rule__RuleHead__NameAssignment_0 ) ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3123:1: ( ( ( rule__RuleHead__NameAssignment_0 ) ) )
            // InternalReactionLanguage.g:3124:1: ( ( rule__RuleHead__NameAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3124:1: ( ( rule__RuleHead__NameAssignment_0 ) )
            // InternalReactionLanguage.g:3125:2: ( rule__RuleHead__NameAssignment_0 )
            {
             before(grammarAccess.getRuleHeadAccess().getNameAssignment_0()); 
            // InternalReactionLanguage.g:3126:2: ( rule__RuleHead__NameAssignment_0 )
            // InternalReactionLanguage.g:3126:3: rule__RuleHead__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleHead__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleHeadAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__0__Impl"


    // $ANTLR start "rule__RuleHead__Group__1"
    // InternalReactionLanguage.g:3134:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl rule__RuleHead__Group__2 ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3138:1: ( rule__RuleHead__Group__1__Impl rule__RuleHead__Group__2 )
            // InternalReactionLanguage.g:3139:2: rule__RuleHead__Group__1__Impl rule__RuleHead__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RuleHead__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleHead__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__1"


    // $ANTLR start "rule__RuleHead__Group__1__Impl"
    // InternalReactionLanguage.g:3146:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__SignatureAssignment_1 )? ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3150:1: ( ( ( rule__RuleHead__SignatureAssignment_1 )? ) )
            // InternalReactionLanguage.g:3151:1: ( ( rule__RuleHead__SignatureAssignment_1 )? )
            {
            // InternalReactionLanguage.g:3151:1: ( ( rule__RuleHead__SignatureAssignment_1 )? )
            // InternalReactionLanguage.g:3152:2: ( rule__RuleHead__SignatureAssignment_1 )?
            {
             before(grammarAccess.getRuleHeadAccess().getSignatureAssignment_1()); 
            // InternalReactionLanguage.g:3153:2: ( rule__RuleHead__SignatureAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalReactionLanguage.g:3153:3: rule__RuleHead__SignatureAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleHead__SignatureAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleHeadAccess().getSignatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__1__Impl"


    // $ANTLR start "rule__RuleHead__Group__2"
    // InternalReactionLanguage.g:3161:1: rule__RuleHead__Group__2 : rule__RuleHead__Group__2__Impl ;
    public final void rule__RuleHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3165:1: ( rule__RuleHead__Group__2__Impl )
            // InternalReactionLanguage.g:3166:2: rule__RuleHead__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleHead__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__2"


    // $ANTLR start "rule__RuleHead__Group__2__Impl"
    // InternalReactionLanguage.g:3172:1: rule__RuleHead__Group__2__Impl : ( ':' ) ;
    public final void rule__RuleHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3176:1: ( ( ':' ) )
            // InternalReactionLanguage.g:3177:1: ( ':' )
            {
            // InternalReactionLanguage.g:3177:1: ( ':' )
            // InternalReactionLanguage.g:3178:2: ':'
            {
             before(grammarAccess.getRuleHeadAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleHeadAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__2__Impl"


    // $ANTLR start "rule__RuleBody__Group__0"
    // InternalReactionLanguage.g:3188:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3192:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // InternalReactionLanguage.g:3193:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RuleBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0"


    // $ANTLR start "rule__RuleBody__Group__0__Impl"
    // InternalReactionLanguage.g:3200:1: rule__RuleBody__Group__0__Impl : ( ( rule__RuleBody__LhsAssignment_0 ) ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3204:1: ( ( ( rule__RuleBody__LhsAssignment_0 ) ) )
            // InternalReactionLanguage.g:3205:1: ( ( rule__RuleBody__LhsAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3205:1: ( ( rule__RuleBody__LhsAssignment_0 ) )
            // InternalReactionLanguage.g:3206:2: ( rule__RuleBody__LhsAssignment_0 )
            {
             before(grammarAccess.getRuleBodyAccess().getLhsAssignment_0()); 
            // InternalReactionLanguage.g:3207:2: ( rule__RuleBody__LhsAssignment_0 )
            // InternalReactionLanguage.g:3207:3: rule__RuleBody__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0__Impl"


    // $ANTLR start "rule__RuleBody__Group__1"
    // InternalReactionLanguage.g:3215:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3219:1: ( rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 )
            // InternalReactionLanguage.g:3220:2: rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RuleBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1"


    // $ANTLR start "rule__RuleBody__Group__1__Impl"
    // InternalReactionLanguage.g:3227:1: rule__RuleBody__Group__1__Impl : ( ( rule__RuleBody__RuleTypeAssignment_1 ) ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3231:1: ( ( ( rule__RuleBody__RuleTypeAssignment_1 ) ) )
            // InternalReactionLanguage.g:3232:1: ( ( rule__RuleBody__RuleTypeAssignment_1 ) )
            {
            // InternalReactionLanguage.g:3232:1: ( ( rule__RuleBody__RuleTypeAssignment_1 ) )
            // InternalReactionLanguage.g:3233:2: ( rule__RuleBody__RuleTypeAssignment_1 )
            {
             before(grammarAccess.getRuleBodyAccess().getRuleTypeAssignment_1()); 
            // InternalReactionLanguage.g:3234:2: ( rule__RuleBody__RuleTypeAssignment_1 )
            // InternalReactionLanguage.g:3234:3: rule__RuleBody__RuleTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__RuleTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getRuleTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1__Impl"


    // $ANTLR start "rule__RuleBody__Group__2"
    // InternalReactionLanguage.g:3242:1: rule__RuleBody__Group__2 : rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3 ;
    public final void rule__RuleBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3246:1: ( rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3 )
            // InternalReactionLanguage.g:3247:2: rule__RuleBody__Group__2__Impl rule__RuleBody__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__RuleBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2"


    // $ANTLR start "rule__RuleBody__Group__2__Impl"
    // InternalReactionLanguage.g:3254:1: rule__RuleBody__Group__2__Impl : ( ( rule__RuleBody__RhsAssignment_2 ) ) ;
    public final void rule__RuleBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3258:1: ( ( ( rule__RuleBody__RhsAssignment_2 ) ) )
            // InternalReactionLanguage.g:3259:1: ( ( rule__RuleBody__RhsAssignment_2 ) )
            {
            // InternalReactionLanguage.g:3259:1: ( ( rule__RuleBody__RhsAssignment_2 ) )
            // InternalReactionLanguage.g:3260:2: ( rule__RuleBody__RhsAssignment_2 )
            {
             before(grammarAccess.getRuleBodyAccess().getRhsAssignment_2()); 
            // InternalReactionLanguage.g:3261:2: ( rule__RuleBody__RhsAssignment_2 )
            // InternalReactionLanguage.g:3261:3: rule__RuleBody__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2__Impl"


    // $ANTLR start "rule__RuleBody__Group__3"
    // InternalReactionLanguage.g:3269:1: rule__RuleBody__Group__3 : rule__RuleBody__Group__3__Impl ;
    public final void rule__RuleBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3273:1: ( rule__RuleBody__Group__3__Impl )
            // InternalReactionLanguage.g:3274:2: rule__RuleBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__3"


    // $ANTLR start "rule__RuleBody__Group__3__Impl"
    // InternalReactionLanguage.g:3280:1: rule__RuleBody__Group__3__Impl : ( ( rule__RuleBody__RatesAssignment_3 ) ) ;
    public final void rule__RuleBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3284:1: ( ( ( rule__RuleBody__RatesAssignment_3 ) ) )
            // InternalReactionLanguage.g:3285:1: ( ( rule__RuleBody__RatesAssignment_3 ) )
            {
            // InternalReactionLanguage.g:3285:1: ( ( rule__RuleBody__RatesAssignment_3 ) )
            // InternalReactionLanguage.g:3286:2: ( rule__RuleBody__RatesAssignment_3 )
            {
             before(grammarAccess.getRuleBodyAccess().getRatesAssignment_3()); 
            // InternalReactionLanguage.g:3287:2: ( rule__RuleBody__RatesAssignment_3 )
            // InternalReactionLanguage.g:3287:3: rule__RuleBody__RatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__RatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getRatesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__3__Impl"


    // $ANTLR start "rule__Rates__Group__0"
    // InternalReactionLanguage.g:3296:1: rule__Rates__Group__0 : rule__Rates__Group__0__Impl rule__Rates__Group__1 ;
    public final void rule__Rates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3300:1: ( rule__Rates__Group__0__Impl rule__Rates__Group__1 )
            // InternalReactionLanguage.g:3301:2: rule__Rates__Group__0__Impl rule__Rates__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Rates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rates__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__0"


    // $ANTLR start "rule__Rates__Group__0__Impl"
    // InternalReactionLanguage.g:3308:1: rule__Rates__Group__0__Impl : ( '@' ) ;
    public final void rule__Rates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3312:1: ( ( '@' ) )
            // InternalReactionLanguage.g:3313:1: ( '@' )
            {
            // InternalReactionLanguage.g:3313:1: ( '@' )
            // InternalReactionLanguage.g:3314:2: '@'
            {
             before(grammarAccess.getRatesAccess().getCommercialAtKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRatesAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__0__Impl"


    // $ANTLR start "rule__Rates__Group__1"
    // InternalReactionLanguage.g:3323:1: rule__Rates__Group__1 : rule__Rates__Group__1__Impl rule__Rates__Group__2 ;
    public final void rule__Rates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3327:1: ( rule__Rates__Group__1__Impl rule__Rates__Group__2 )
            // InternalReactionLanguage.g:3328:2: rule__Rates__Group__1__Impl rule__Rates__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Rates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rates__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__1"


    // $ANTLR start "rule__Rates__Group__1__Impl"
    // InternalReactionLanguage.g:3335:1: rule__Rates__Group__1__Impl : ( ( rule__Rates__RateForwardAssignment_1 ) ) ;
    public final void rule__Rates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3339:1: ( ( ( rule__Rates__RateForwardAssignment_1 ) ) )
            // InternalReactionLanguage.g:3340:1: ( ( rule__Rates__RateForwardAssignment_1 ) )
            {
            // InternalReactionLanguage.g:3340:1: ( ( rule__Rates__RateForwardAssignment_1 ) )
            // InternalReactionLanguage.g:3341:2: ( rule__Rates__RateForwardAssignment_1 )
            {
             before(grammarAccess.getRatesAccess().getRateForwardAssignment_1()); 
            // InternalReactionLanguage.g:3342:2: ( rule__Rates__RateForwardAssignment_1 )
            // InternalReactionLanguage.g:3342:3: rule__Rates__RateForwardAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rates__RateForwardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRatesAccess().getRateForwardAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__1__Impl"


    // $ANTLR start "rule__Rates__Group__2"
    // InternalReactionLanguage.g:3350:1: rule__Rates__Group__2 : rule__Rates__Group__2__Impl ;
    public final void rule__Rates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3354:1: ( rule__Rates__Group__2__Impl )
            // InternalReactionLanguage.g:3355:2: rule__Rates__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rates__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__2"


    // $ANTLR start "rule__Rates__Group__2__Impl"
    // InternalReactionLanguage.g:3361:1: rule__Rates__Group__2__Impl : ( ( rule__Rates__Group_2__0 )? ) ;
    public final void rule__Rates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3365:1: ( ( ( rule__Rates__Group_2__0 )? ) )
            // InternalReactionLanguage.g:3366:1: ( ( rule__Rates__Group_2__0 )? )
            {
            // InternalReactionLanguage.g:3366:1: ( ( rule__Rates__Group_2__0 )? )
            // InternalReactionLanguage.g:3367:2: ( rule__Rates__Group_2__0 )?
            {
             before(grammarAccess.getRatesAccess().getGroup_2()); 
            // InternalReactionLanguage.g:3368:2: ( rule__Rates__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalReactionLanguage.g:3368:3: rule__Rates__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rates__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group__2__Impl"


    // $ANTLR start "rule__Rates__Group_2__0"
    // InternalReactionLanguage.g:3377:1: rule__Rates__Group_2__0 : rule__Rates__Group_2__0__Impl rule__Rates__Group_2__1 ;
    public final void rule__Rates__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3381:1: ( rule__Rates__Group_2__0__Impl rule__Rates__Group_2__1 )
            // InternalReactionLanguage.g:3382:2: rule__Rates__Group_2__0__Impl rule__Rates__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__Rates__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rates__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group_2__0"


    // $ANTLR start "rule__Rates__Group_2__0__Impl"
    // InternalReactionLanguage.g:3389:1: rule__Rates__Group_2__0__Impl : ( ( rule__Rates__RateBackwardSetAssignment_2_0 ) ) ;
    public final void rule__Rates__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3393:1: ( ( ( rule__Rates__RateBackwardSetAssignment_2_0 ) ) )
            // InternalReactionLanguage.g:3394:1: ( ( rule__Rates__RateBackwardSetAssignment_2_0 ) )
            {
            // InternalReactionLanguage.g:3394:1: ( ( rule__Rates__RateBackwardSetAssignment_2_0 ) )
            // InternalReactionLanguage.g:3395:2: ( rule__Rates__RateBackwardSetAssignment_2_0 )
            {
             before(grammarAccess.getRatesAccess().getRateBackwardSetAssignment_2_0()); 
            // InternalReactionLanguage.g:3396:2: ( rule__Rates__RateBackwardSetAssignment_2_0 )
            // InternalReactionLanguage.g:3396:3: rule__Rates__RateBackwardSetAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Rates__RateBackwardSetAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRatesAccess().getRateBackwardSetAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group_2__0__Impl"


    // $ANTLR start "rule__Rates__Group_2__1"
    // InternalReactionLanguage.g:3404:1: rule__Rates__Group_2__1 : rule__Rates__Group_2__1__Impl ;
    public final void rule__Rates__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3408:1: ( rule__Rates__Group_2__1__Impl )
            // InternalReactionLanguage.g:3409:2: rule__Rates__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rates__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group_2__1"


    // $ANTLR start "rule__Rates__Group_2__1__Impl"
    // InternalReactionLanguage.g:3415:1: rule__Rates__Group_2__1__Impl : ( ( rule__Rates__RateBackwardAssignment_2_1 ) ) ;
    public final void rule__Rates__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3419:1: ( ( ( rule__Rates__RateBackwardAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:3420:1: ( ( rule__Rates__RateBackwardAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:3420:1: ( ( rule__Rates__RateBackwardAssignment_2_1 ) )
            // InternalReactionLanguage.g:3421:2: ( rule__Rates__RateBackwardAssignment_2_1 )
            {
             before(grammarAccess.getRatesAccess().getRateBackwardAssignment_2_1()); 
            // InternalReactionLanguage.g:3422:2: ( rule__Rates__RateBackwardAssignment_2_1 )
            // InternalReactionLanguage.g:3422:3: rule__Rates__RateBackwardAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rates__RateBackwardAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRatesAccess().getRateBackwardAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_0__0"
    // InternalReactionLanguage.g:3431:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3435:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalReactionLanguage.g:3436:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__0"


    // $ANTLR start "rule__Pattern__Group_0__0__Impl"
    // InternalReactionLanguage.g:3443:1: rule__Pattern__Group_0__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3447:1: ( ( () ) )
            // InternalReactionLanguage.g:3448:1: ( () )
            {
            // InternalReactionLanguage.g:3448:1: ( () )
            // InternalReactionLanguage.g:3449:2: ()
            {
             before(grammarAccess.getPatternAccess().getBlankPatternAction_0_0()); 
            // InternalReactionLanguage.g:3450:2: ()
            // InternalReactionLanguage.g:3450:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getBlankPatternAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__0__Impl"


    // $ANTLR start "rule__Pattern__Group_0__1"
    // InternalReactionLanguage.g:3458:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3462:1: ( rule__Pattern__Group_0__1__Impl )
            // InternalReactionLanguage.g:3463:2: rule__Pattern__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__1"


    // $ANTLR start "rule__Pattern__Group_0__1__Impl"
    // InternalReactionLanguage.g:3469:1: rule__Pattern__Group_0__1__Impl : ( '_' ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3473:1: ( ( '_' ) )
            // InternalReactionLanguage.g:3474:1: ( '_' )
            {
            // InternalReactionLanguage.g:3474:1: ( '_' )
            // InternalReactionLanguage.g:3475:2: '_'
            {
             before(grammarAccess.getPatternAccess().get_Keyword_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().get_Keyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__1__Impl"


    // $ANTLR start "rule__Bonds__Group__0"
    // InternalReactionLanguage.g:3485:1: rule__Bonds__Group__0 : rule__Bonds__Group__0__Impl rule__Bonds__Group__1 ;
    public final void rule__Bonds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3489:1: ( rule__Bonds__Group__0__Impl rule__Bonds__Group__1 )
            // InternalReactionLanguage.g:3490:2: rule__Bonds__Group__0__Impl rule__Bonds__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Bonds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bonds__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group__0"


    // $ANTLR start "rule__Bonds__Group__0__Impl"
    // InternalReactionLanguage.g:3497:1: rule__Bonds__Group__0__Impl : ( ( rule__Bonds__BondsAssignment_0 ) ) ;
    public final void rule__Bonds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3501:1: ( ( ( rule__Bonds__BondsAssignment_0 ) ) )
            // InternalReactionLanguage.g:3502:1: ( ( rule__Bonds__BondsAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3502:1: ( ( rule__Bonds__BondsAssignment_0 ) )
            // InternalReactionLanguage.g:3503:2: ( rule__Bonds__BondsAssignment_0 )
            {
             before(grammarAccess.getBondsAccess().getBondsAssignment_0()); 
            // InternalReactionLanguage.g:3504:2: ( rule__Bonds__BondsAssignment_0 )
            // InternalReactionLanguage.g:3504:3: rule__Bonds__BondsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bonds__BondsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBondsAccess().getBondsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group__0__Impl"


    // $ANTLR start "rule__Bonds__Group__1"
    // InternalReactionLanguage.g:3512:1: rule__Bonds__Group__1 : rule__Bonds__Group__1__Impl ;
    public final void rule__Bonds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3516:1: ( rule__Bonds__Group__1__Impl )
            // InternalReactionLanguage.g:3517:2: rule__Bonds__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bonds__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group__1"


    // $ANTLR start "rule__Bonds__Group__1__Impl"
    // InternalReactionLanguage.g:3523:1: rule__Bonds__Group__1__Impl : ( ( rule__Bonds__Group_1__0 )* ) ;
    public final void rule__Bonds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3527:1: ( ( ( rule__Bonds__Group_1__0 )* ) )
            // InternalReactionLanguage.g:3528:1: ( ( rule__Bonds__Group_1__0 )* )
            {
            // InternalReactionLanguage.g:3528:1: ( ( rule__Bonds__Group_1__0 )* )
            // InternalReactionLanguage.g:3529:2: ( rule__Bonds__Group_1__0 )*
            {
             before(grammarAccess.getBondsAccess().getGroup_1()); 
            // InternalReactionLanguage.g:3530:2: ( rule__Bonds__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalReactionLanguage.g:3530:3: rule__Bonds__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Bonds__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getBondsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group__1__Impl"


    // $ANTLR start "rule__Bonds__Group_1__0"
    // InternalReactionLanguage.g:3539:1: rule__Bonds__Group_1__0 : rule__Bonds__Group_1__0__Impl rule__Bonds__Group_1__1 ;
    public final void rule__Bonds__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3543:1: ( rule__Bonds__Group_1__0__Impl rule__Bonds__Group_1__1 )
            // InternalReactionLanguage.g:3544:2: rule__Bonds__Group_1__0__Impl rule__Bonds__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Bonds__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bonds__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group_1__0"


    // $ANTLR start "rule__Bonds__Group_1__0__Impl"
    // InternalReactionLanguage.g:3551:1: rule__Bonds__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Bonds__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3555:1: ( ( ',' ) )
            // InternalReactionLanguage.g:3556:1: ( ',' )
            {
            // InternalReactionLanguage.g:3556:1: ( ',' )
            // InternalReactionLanguage.g:3557:2: ','
            {
             before(grammarAccess.getBondsAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBondsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group_1__0__Impl"


    // $ANTLR start "rule__Bonds__Group_1__1"
    // InternalReactionLanguage.g:3566:1: rule__Bonds__Group_1__1 : rule__Bonds__Group_1__1__Impl ;
    public final void rule__Bonds__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3570:1: ( rule__Bonds__Group_1__1__Impl )
            // InternalReactionLanguage.g:3571:2: rule__Bonds__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bonds__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group_1__1"


    // $ANTLR start "rule__Bonds__Group_1__1__Impl"
    // InternalReactionLanguage.g:3577:1: rule__Bonds__Group_1__1__Impl : ( ( rule__Bonds__BondsAssignment_1_1 ) ) ;
    public final void rule__Bonds__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3581:1: ( ( ( rule__Bonds__BondsAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:3582:1: ( ( rule__Bonds__BondsAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:3582:1: ( ( rule__Bonds__BondsAssignment_1_1 ) )
            // InternalReactionLanguage.g:3583:2: ( rule__Bonds__BondsAssignment_1_1 )
            {
             before(grammarAccess.getBondsAccess().getBondsAssignment_1_1()); 
            // InternalReactionLanguage.g:3584:2: ( rule__Bonds__BondsAssignment_1_1 )
            // InternalReactionLanguage.g:3584:3: rule__Bonds__BondsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Bonds__BondsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBondsAccess().getBondsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__Group_1__1__Impl"


    // $ANTLR start "rule__Bond__Group__0"
    // InternalReactionLanguage.g:3593:1: rule__Bond__Group__0 : rule__Bond__Group__0__Impl rule__Bond__Group__1 ;
    public final void rule__Bond__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3597:1: ( rule__Bond__Group__0__Impl rule__Bond__Group__1 )
            // InternalReactionLanguage.g:3598:2: rule__Bond__Group__0__Impl rule__Bond__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Bond__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bond__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group__0"


    // $ANTLR start "rule__Bond__Group__0__Impl"
    // InternalReactionLanguage.g:3605:1: rule__Bond__Group__0__Impl : ( ( rule__Bond__LeftAssignment_0 ) ) ;
    public final void rule__Bond__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3609:1: ( ( ( rule__Bond__LeftAssignment_0 ) ) )
            // InternalReactionLanguage.g:3610:1: ( ( rule__Bond__LeftAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3610:1: ( ( rule__Bond__LeftAssignment_0 ) )
            // InternalReactionLanguage.g:3611:2: ( rule__Bond__LeftAssignment_0 )
            {
             before(grammarAccess.getBondAccess().getLeftAssignment_0()); 
            // InternalReactionLanguage.g:3612:2: ( rule__Bond__LeftAssignment_0 )
            // InternalReactionLanguage.g:3612:3: rule__Bond__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bond__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBondAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group__0__Impl"


    // $ANTLR start "rule__Bond__Group__1"
    // InternalReactionLanguage.g:3620:1: rule__Bond__Group__1 : rule__Bond__Group__1__Impl ;
    public final void rule__Bond__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3624:1: ( rule__Bond__Group__1__Impl )
            // InternalReactionLanguage.g:3625:2: rule__Bond__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bond__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group__1"


    // $ANTLR start "rule__Bond__Group__1__Impl"
    // InternalReactionLanguage.g:3631:1: rule__Bond__Group__1__Impl : ( ( rule__Bond__Group_1__0 )? ) ;
    public final void rule__Bond__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3635:1: ( ( ( rule__Bond__Group_1__0 )? ) )
            // InternalReactionLanguage.g:3636:1: ( ( rule__Bond__Group_1__0 )? )
            {
            // InternalReactionLanguage.g:3636:1: ( ( rule__Bond__Group_1__0 )? )
            // InternalReactionLanguage.g:3637:2: ( rule__Bond__Group_1__0 )?
            {
             before(grammarAccess.getBondAccess().getGroup_1()); 
            // InternalReactionLanguage.g:3638:2: ( rule__Bond__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14||LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalReactionLanguage.g:3638:3: rule__Bond__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bond__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBondAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group__1__Impl"


    // $ANTLR start "rule__Bond__Group_1__0"
    // InternalReactionLanguage.g:3647:1: rule__Bond__Group_1__0 : rule__Bond__Group_1__0__Impl rule__Bond__Group_1__1 ;
    public final void rule__Bond__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3651:1: ( rule__Bond__Group_1__0__Impl rule__Bond__Group_1__1 )
            // InternalReactionLanguage.g:3652:2: rule__Bond__Group_1__0__Impl rule__Bond__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Bond__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bond__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group_1__0"


    // $ANTLR start "rule__Bond__Group_1__0__Impl"
    // InternalReactionLanguage.g:3659:1: rule__Bond__Group_1__0__Impl : ( ( rule__Bond__BondTypeAssignment_1_0 ) ) ;
    public final void rule__Bond__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3663:1: ( ( ( rule__Bond__BondTypeAssignment_1_0 ) ) )
            // InternalReactionLanguage.g:3664:1: ( ( rule__Bond__BondTypeAssignment_1_0 ) )
            {
            // InternalReactionLanguage.g:3664:1: ( ( rule__Bond__BondTypeAssignment_1_0 ) )
            // InternalReactionLanguage.g:3665:2: ( rule__Bond__BondTypeAssignment_1_0 )
            {
             before(grammarAccess.getBondAccess().getBondTypeAssignment_1_0()); 
            // InternalReactionLanguage.g:3666:2: ( rule__Bond__BondTypeAssignment_1_0 )
            // InternalReactionLanguage.g:3666:3: rule__Bond__BondTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Bond__BondTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBondAccess().getBondTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group_1__0__Impl"


    // $ANTLR start "rule__Bond__Group_1__1"
    // InternalReactionLanguage.g:3674:1: rule__Bond__Group_1__1 : rule__Bond__Group_1__1__Impl ;
    public final void rule__Bond__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3678:1: ( rule__Bond__Group_1__1__Impl )
            // InternalReactionLanguage.g:3679:2: rule__Bond__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bond__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group_1__1"


    // $ANTLR start "rule__Bond__Group_1__1__Impl"
    // InternalReactionLanguage.g:3685:1: rule__Bond__Group_1__1__Impl : ( ( rule__Bond__RightAssignment_1_1 ) ) ;
    public final void rule__Bond__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3689:1: ( ( ( rule__Bond__RightAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:3690:1: ( ( rule__Bond__RightAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:3690:1: ( ( rule__Bond__RightAssignment_1_1 ) )
            // InternalReactionLanguage.g:3691:2: ( rule__Bond__RightAssignment_1_1 )
            {
             before(grammarAccess.getBondAccess().getRightAssignment_1_1()); 
            // InternalReactionLanguage.g:3692:2: ( rule__Bond__RightAssignment_1_1 )
            // InternalReactionLanguage.g:3692:3: rule__Bond__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Bond__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBondAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__Group_1__1__Impl"


    // $ANTLR start "rule__BondSide__Group__0"
    // InternalReactionLanguage.g:3701:1: rule__BondSide__Group__0 : rule__BondSide__Group__0__Impl rule__BondSide__Group__1 ;
    public final void rule__BondSide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3705:1: ( rule__BondSide__Group__0__Impl rule__BondSide__Group__1 )
            // InternalReactionLanguage.g:3706:2: rule__BondSide__Group__0__Impl rule__BondSide__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BondSide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BondSide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__0"


    // $ANTLR start "rule__BondSide__Group__0__Impl"
    // InternalReactionLanguage.g:3713:1: rule__BondSide__Group__0__Impl : ( ( rule__BondSide__AbstractAgentAssignment_0 ) ) ;
    public final void rule__BondSide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3717:1: ( ( ( rule__BondSide__AbstractAgentAssignment_0 ) ) )
            // InternalReactionLanguage.g:3718:1: ( ( rule__BondSide__AbstractAgentAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3718:1: ( ( rule__BondSide__AbstractAgentAssignment_0 ) )
            // InternalReactionLanguage.g:3719:2: ( rule__BondSide__AbstractAgentAssignment_0 )
            {
             before(grammarAccess.getBondSideAccess().getAbstractAgentAssignment_0()); 
            // InternalReactionLanguage.g:3720:2: ( rule__BondSide__AbstractAgentAssignment_0 )
            // InternalReactionLanguage.g:3720:3: rule__BondSide__AbstractAgentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__AbstractAgentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBondSideAccess().getAbstractAgentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__0__Impl"


    // $ANTLR start "rule__BondSide__Group__1"
    // InternalReactionLanguage.g:3728:1: rule__BondSide__Group__1 : rule__BondSide__Group__1__Impl rule__BondSide__Group__2 ;
    public final void rule__BondSide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3732:1: ( rule__BondSide__Group__1__Impl rule__BondSide__Group__2 )
            // InternalReactionLanguage.g:3733:2: rule__BondSide__Group__1__Impl rule__BondSide__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__BondSide__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BondSide__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__1"


    // $ANTLR start "rule__BondSide__Group__1__Impl"
    // InternalReactionLanguage.g:3740:1: rule__BondSide__Group__1__Impl : ( ( rule__BondSide__Group_1__0 )? ) ;
    public final void rule__BondSide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3744:1: ( ( ( rule__BondSide__Group_1__0 )? ) )
            // InternalReactionLanguage.g:3745:1: ( ( rule__BondSide__Group_1__0 )? )
            {
            // InternalReactionLanguage.g:3745:1: ( ( rule__BondSide__Group_1__0 )? )
            // InternalReactionLanguage.g:3746:2: ( rule__BondSide__Group_1__0 )?
            {
             before(grammarAccess.getBondSideAccess().getGroup_1()); 
            // InternalReactionLanguage.g:3747:2: ( rule__BondSide__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalReactionLanguage.g:3747:3: rule__BondSide__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BondSide__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBondSideAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__1__Impl"


    // $ANTLR start "rule__BondSide__Group__2"
    // InternalReactionLanguage.g:3755:1: rule__BondSide__Group__2 : rule__BondSide__Group__2__Impl ;
    public final void rule__BondSide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3759:1: ( rule__BondSide__Group__2__Impl )
            // InternalReactionLanguage.g:3760:2: rule__BondSide__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__2"


    // $ANTLR start "rule__BondSide__Group__2__Impl"
    // InternalReactionLanguage.g:3766:1: rule__BondSide__Group__2__Impl : ( ( rule__BondSide__Group_2__0 )? ) ;
    public final void rule__BondSide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3770:1: ( ( ( rule__BondSide__Group_2__0 )? ) )
            // InternalReactionLanguage.g:3771:1: ( ( rule__BondSide__Group_2__0 )? )
            {
            // InternalReactionLanguage.g:3771:1: ( ( rule__BondSide__Group_2__0 )? )
            // InternalReactionLanguage.g:3772:2: ( rule__BondSide__Group_2__0 )?
            {
             before(grammarAccess.getBondSideAccess().getGroup_2()); 
            // InternalReactionLanguage.g:3773:2: ( rule__BondSide__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalReactionLanguage.g:3773:3: rule__BondSide__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BondSide__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBondSideAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group__2__Impl"


    // $ANTLR start "rule__BondSide__Group_1__0"
    // InternalReactionLanguage.g:3782:1: rule__BondSide__Group_1__0 : rule__BondSide__Group_1__0__Impl rule__BondSide__Group_1__1 ;
    public final void rule__BondSide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3786:1: ( rule__BondSide__Group_1__0__Impl rule__BondSide__Group_1__1 )
            // InternalReactionLanguage.g:3787:2: rule__BondSide__Group_1__0__Impl rule__BondSide__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__BondSide__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BondSide__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__0"


    // $ANTLR start "rule__BondSide__Group_1__0__Impl"
    // InternalReactionLanguage.g:3794:1: rule__BondSide__Group_1__0__Impl : ( ( rule__BondSide__ArrayAssignment_1_0 ) ) ;
    public final void rule__BondSide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3798:1: ( ( ( rule__BondSide__ArrayAssignment_1_0 ) ) )
            // InternalReactionLanguage.g:3799:1: ( ( rule__BondSide__ArrayAssignment_1_0 ) )
            {
            // InternalReactionLanguage.g:3799:1: ( ( rule__BondSide__ArrayAssignment_1_0 ) )
            // InternalReactionLanguage.g:3800:2: ( rule__BondSide__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getBondSideAccess().getArrayAssignment_1_0()); 
            // InternalReactionLanguage.g:3801:2: ( rule__BondSide__ArrayAssignment_1_0 )
            // InternalReactionLanguage.g:3801:3: rule__BondSide__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBondSideAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__0__Impl"


    // $ANTLR start "rule__BondSide__Group_1__1"
    // InternalReactionLanguage.g:3809:1: rule__BondSide__Group_1__1 : rule__BondSide__Group_1__1__Impl rule__BondSide__Group_1__2 ;
    public final void rule__BondSide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3813:1: ( rule__BondSide__Group_1__1__Impl rule__BondSide__Group_1__2 )
            // InternalReactionLanguage.g:3814:2: rule__BondSide__Group_1__1__Impl rule__BondSide__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__BondSide__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BondSide__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__1"


    // $ANTLR start "rule__BondSide__Group_1__1__Impl"
    // InternalReactionLanguage.g:3821:1: rule__BondSide__Group_1__1__Impl : ( ( rule__BondSide__IndexAssignment_1_1 ) ) ;
    public final void rule__BondSide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3825:1: ( ( ( rule__BondSide__IndexAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:3826:1: ( ( rule__BondSide__IndexAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:3826:1: ( ( rule__BondSide__IndexAssignment_1_1 ) )
            // InternalReactionLanguage.g:3827:2: ( rule__BondSide__IndexAssignment_1_1 )
            {
             before(grammarAccess.getBondSideAccess().getIndexAssignment_1_1()); 
            // InternalReactionLanguage.g:3828:2: ( rule__BondSide__IndexAssignment_1_1 )
            // InternalReactionLanguage.g:3828:3: rule__BondSide__IndexAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__IndexAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBondSideAccess().getIndexAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__1__Impl"


    // $ANTLR start "rule__BondSide__Group_1__2"
    // InternalReactionLanguage.g:3836:1: rule__BondSide__Group_1__2 : rule__BondSide__Group_1__2__Impl ;
    public final void rule__BondSide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3840:1: ( rule__BondSide__Group_1__2__Impl )
            // InternalReactionLanguage.g:3841:2: rule__BondSide__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__2"


    // $ANTLR start "rule__BondSide__Group_1__2__Impl"
    // InternalReactionLanguage.g:3847:1: rule__BondSide__Group_1__2__Impl : ( ']' ) ;
    public final void rule__BondSide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3851:1: ( ( ']' ) )
            // InternalReactionLanguage.g:3852:1: ( ']' )
            {
            // InternalReactionLanguage.g:3852:1: ( ']' )
            // InternalReactionLanguage.g:3853:2: ']'
            {
             before(grammarAccess.getBondSideAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBondSideAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_1__2__Impl"


    // $ANTLR start "rule__BondSide__Group_2__0"
    // InternalReactionLanguage.g:3863:1: rule__BondSide__Group_2__0 : rule__BondSide__Group_2__0__Impl rule__BondSide__Group_2__1 ;
    public final void rule__BondSide__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3867:1: ( rule__BondSide__Group_2__0__Impl rule__BondSide__Group_2__1 )
            // InternalReactionLanguage.g:3868:2: rule__BondSide__Group_2__0__Impl rule__BondSide__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__BondSide__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BondSide__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_2__0"


    // $ANTLR start "rule__BondSide__Group_2__0__Impl"
    // InternalReactionLanguage.g:3875:1: rule__BondSide__Group_2__0__Impl : ( '.' ) ;
    public final void rule__BondSide__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3879:1: ( ( '.' ) )
            // InternalReactionLanguage.g:3880:1: ( '.' )
            {
            // InternalReactionLanguage.g:3880:1: ( '.' )
            // InternalReactionLanguage.g:3881:2: '.'
            {
             before(grammarAccess.getBondSideAccess().getFullStopKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBondSideAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_2__0__Impl"


    // $ANTLR start "rule__BondSide__Group_2__1"
    // InternalReactionLanguage.g:3890:1: rule__BondSide__Group_2__1 : rule__BondSide__Group_2__1__Impl ;
    public final void rule__BondSide__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3894:1: ( rule__BondSide__Group_2__1__Impl )
            // InternalReactionLanguage.g:3895:2: rule__BondSide__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_2__1"


    // $ANTLR start "rule__BondSide__Group_2__1__Impl"
    // InternalReactionLanguage.g:3901:1: rule__BondSide__Group_2__1__Impl : ( ( rule__BondSide__SiteInstanceAssignment_2_1 ) ) ;
    public final void rule__BondSide__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3905:1: ( ( ( rule__BondSide__SiteInstanceAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:3906:1: ( ( rule__BondSide__SiteInstanceAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:3906:1: ( ( rule__BondSide__SiteInstanceAssignment_2_1 ) )
            // InternalReactionLanguage.g:3907:2: ( rule__BondSide__SiteInstanceAssignment_2_1 )
            {
             before(grammarAccess.getBondSideAccess().getSiteInstanceAssignment_2_1()); 
            // InternalReactionLanguage.g:3908:2: ( rule__BondSide__SiteInstanceAssignment_2_1 )
            // InternalReactionLanguage.g:3908:3: rule__BondSide__SiteInstanceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BondSide__SiteInstanceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBondSideAccess().getSiteInstanceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__Group_2__1__Impl"


    // $ANTLR start "rule__SiteInstance__Group__0"
    // InternalReactionLanguage.g:3917:1: rule__SiteInstance__Group__0 : rule__SiteInstance__Group__0__Impl rule__SiteInstance__Group__1 ;
    public final void rule__SiteInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3921:1: ( rule__SiteInstance__Group__0__Impl rule__SiteInstance__Group__1 )
            // InternalReactionLanguage.g:3922:2: rule__SiteInstance__Group__0__Impl rule__SiteInstance__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SiteInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__Group__0"


    // $ANTLR start "rule__SiteInstance__Group__0__Impl"
    // InternalReactionLanguage.g:3929:1: rule__SiteInstance__Group__0__Impl : ( ( rule__SiteInstance__SiteAssignment_0 ) ) ;
    public final void rule__SiteInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3933:1: ( ( ( rule__SiteInstance__SiteAssignment_0 ) ) )
            // InternalReactionLanguage.g:3934:1: ( ( rule__SiteInstance__SiteAssignment_0 ) )
            {
            // InternalReactionLanguage.g:3934:1: ( ( rule__SiteInstance__SiteAssignment_0 ) )
            // InternalReactionLanguage.g:3935:2: ( rule__SiteInstance__SiteAssignment_0 )
            {
             before(grammarAccess.getSiteInstanceAccess().getSiteAssignment_0()); 
            // InternalReactionLanguage.g:3936:2: ( rule__SiteInstance__SiteAssignment_0 )
            // InternalReactionLanguage.g:3936:3: rule__SiteInstance__SiteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstance__SiteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSiteInstanceAccess().getSiteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__Group__0__Impl"


    // $ANTLR start "rule__SiteInstance__Group__1"
    // InternalReactionLanguage.g:3944:1: rule__SiteInstance__Group__1 : rule__SiteInstance__Group__1__Impl ;
    public final void rule__SiteInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3948:1: ( rule__SiteInstance__Group__1__Impl )
            // InternalReactionLanguage.g:3949:2: rule__SiteInstance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__Group__1"


    // $ANTLR start "rule__SiteInstance__Group__1__Impl"
    // InternalReactionLanguage.g:3955:1: rule__SiteInstance__Group__1__Impl : ( ( rule__SiteInstance__SiteStateAssignment_1 )? ) ;
    public final void rule__SiteInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3959:1: ( ( ( rule__SiteInstance__SiteStateAssignment_1 )? ) )
            // InternalReactionLanguage.g:3960:1: ( ( rule__SiteInstance__SiteStateAssignment_1 )? )
            {
            // InternalReactionLanguage.g:3960:1: ( ( rule__SiteInstance__SiteStateAssignment_1 )? )
            // InternalReactionLanguage.g:3961:2: ( rule__SiteInstance__SiteStateAssignment_1 )?
            {
             before(grammarAccess.getSiteInstanceAccess().getSiteStateAssignment_1()); 
            // InternalReactionLanguage.g:3962:2: ( rule__SiteInstance__SiteStateAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalReactionLanguage.g:3962:3: rule__SiteInstance__SiteStateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SiteInstance__SiteStateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSiteInstanceAccess().getSiteStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__Group__1__Impl"


    // $ANTLR start "rule__SiteInstanceState__Group__0"
    // InternalReactionLanguage.g:3971:1: rule__SiteInstanceState__Group__0 : rule__SiteInstanceState__Group__0__Impl rule__SiteInstanceState__Group__1 ;
    public final void rule__SiteInstanceState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3975:1: ( rule__SiteInstanceState__Group__0__Impl rule__SiteInstanceState__Group__1 )
            // InternalReactionLanguage.g:3976:2: rule__SiteInstanceState__Group__0__Impl rule__SiteInstanceState__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SiteInstanceState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteInstanceState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__0"


    // $ANTLR start "rule__SiteInstanceState__Group__0__Impl"
    // InternalReactionLanguage.g:3983:1: rule__SiteInstanceState__Group__0__Impl : ( '(' ) ;
    public final void rule__SiteInstanceState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:3987:1: ( ( '(' ) )
            // InternalReactionLanguage.g:3988:1: ( '(' )
            {
            // InternalReactionLanguage.g:3988:1: ( '(' )
            // InternalReactionLanguage.g:3989:2: '('
            {
             before(grammarAccess.getSiteInstanceStateAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSiteInstanceStateAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__0__Impl"


    // $ANTLR start "rule__SiteInstanceState__Group__1"
    // InternalReactionLanguage.g:3998:1: rule__SiteInstanceState__Group__1 : rule__SiteInstanceState__Group__1__Impl rule__SiteInstanceState__Group__2 ;
    public final void rule__SiteInstanceState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4002:1: ( rule__SiteInstanceState__Group__1__Impl rule__SiteInstanceState__Group__2 )
            // InternalReactionLanguage.g:4003:2: rule__SiteInstanceState__Group__1__Impl rule__SiteInstanceState__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__SiteInstanceState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SiteInstanceState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__1"


    // $ANTLR start "rule__SiteInstanceState__Group__1__Impl"
    // InternalReactionLanguage.g:4010:1: rule__SiteInstanceState__Group__1__Impl : ( ( rule__SiteInstanceState__StateAssignment_1 ) ) ;
    public final void rule__SiteInstanceState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4014:1: ( ( ( rule__SiteInstanceState__StateAssignment_1 ) ) )
            // InternalReactionLanguage.g:4015:1: ( ( rule__SiteInstanceState__StateAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4015:1: ( ( rule__SiteInstanceState__StateAssignment_1 ) )
            // InternalReactionLanguage.g:4016:2: ( rule__SiteInstanceState__StateAssignment_1 )
            {
             before(grammarAccess.getSiteInstanceStateAccess().getStateAssignment_1()); 
            // InternalReactionLanguage.g:4017:2: ( rule__SiteInstanceState__StateAssignment_1 )
            // InternalReactionLanguage.g:4017:3: rule__SiteInstanceState__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstanceState__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSiteInstanceStateAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__1__Impl"


    // $ANTLR start "rule__SiteInstanceState__Group__2"
    // InternalReactionLanguage.g:4025:1: rule__SiteInstanceState__Group__2 : rule__SiteInstanceState__Group__2__Impl ;
    public final void rule__SiteInstanceState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4029:1: ( rule__SiteInstanceState__Group__2__Impl )
            // InternalReactionLanguage.g:4030:2: rule__SiteInstanceState__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SiteInstanceState__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__2"


    // $ANTLR start "rule__SiteInstanceState__Group__2__Impl"
    // InternalReactionLanguage.g:4036:1: rule__SiteInstanceState__Group__2__Impl : ( ')' ) ;
    public final void rule__SiteInstanceState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4040:1: ( ( ')' ) )
            // InternalReactionLanguage.g:4041:1: ( ')' )
            {
            // InternalReactionLanguage.g:4041:1: ( ')' )
            // InternalReactionLanguage.g:4042:2: ')'
            {
             before(grammarAccess.getSiteInstanceStateAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSiteInstanceStateAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalReactionLanguage.g:4052:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4056:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalReactionLanguage.g:4057:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalReactionLanguage.g:4064:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4068:1: ( ( 'var' ) )
            // InternalReactionLanguage.g:4069:1: ( 'var' )
            {
            // InternalReactionLanguage.g:4069:1: ( 'var' )
            // InternalReactionLanguage.g:4070:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalReactionLanguage.g:4079:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4083:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalReactionLanguage.g:4084:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalReactionLanguage.g:4091:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4095:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalReactionLanguage.g:4096:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4096:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalReactionLanguage.g:4097:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalReactionLanguage.g:4098:2: ( rule__Variable__NameAssignment_1 )
            // InternalReactionLanguage.g:4098:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalReactionLanguage.g:4106:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4110:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalReactionLanguage.g:4111:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalReactionLanguage.g:4118:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4122:1: ( ( '=' ) )
            // InternalReactionLanguage.g:4123:1: ( '=' )
            {
            // InternalReactionLanguage.g:4123:1: ( '=' )
            // InternalReactionLanguage.g:4124:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalReactionLanguage.g:4133:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4137:1: ( rule__Variable__Group__3__Impl )
            // InternalReactionLanguage.g:4138:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalReactionLanguage.g:4144:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ValueAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4148:1: ( ( ( rule__Variable__ValueAssignment_3 ) ) )
            // InternalReactionLanguage.g:4149:1: ( ( rule__Variable__ValueAssignment_3 ) )
            {
            // InternalReactionLanguage.g:4149:1: ( ( rule__Variable__ValueAssignment_3 ) )
            // InternalReactionLanguage.g:4150:2: ( rule__Variable__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_3()); 
            // InternalReactionLanguage.g:4151:2: ( rule__Variable__ValueAssignment_3 )
            // InternalReactionLanguage.g:4151:3: rule__Variable__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Initialisation__Group__0"
    // InternalReactionLanguage.g:4160:1: rule__Initialisation__Group__0 : rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 ;
    public final void rule__Initialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4164:1: ( rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 )
            // InternalReactionLanguage.g:4165:2: rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Initialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__0"


    // $ANTLR start "rule__Initialisation__Group__0__Impl"
    // InternalReactionLanguage.g:4172:1: rule__Initialisation__Group__0__Impl : ( ( rule__Initialisation__HeadAssignment_0 ) ) ;
    public final void rule__Initialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4176:1: ( ( ( rule__Initialisation__HeadAssignment_0 ) ) )
            // InternalReactionLanguage.g:4177:1: ( ( rule__Initialisation__HeadAssignment_0 ) )
            {
            // InternalReactionLanguage.g:4177:1: ( ( rule__Initialisation__HeadAssignment_0 ) )
            // InternalReactionLanguage.g:4178:2: ( rule__Initialisation__HeadAssignment_0 )
            {
             before(grammarAccess.getInitialisationAccess().getHeadAssignment_0()); 
            // InternalReactionLanguage.g:4179:2: ( rule__Initialisation__HeadAssignment_0 )
            // InternalReactionLanguage.g:4179:3: rule__Initialisation__HeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__HeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getHeadAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__0__Impl"


    // $ANTLR start "rule__Initialisation__Group__1"
    // InternalReactionLanguage.g:4187:1: rule__Initialisation__Group__1 : rule__Initialisation__Group__1__Impl ;
    public final void rule__Initialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4191:1: ( rule__Initialisation__Group__1__Impl )
            // InternalReactionLanguage.g:4192:2: rule__Initialisation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__1"


    // $ANTLR start "rule__Initialisation__Group__1__Impl"
    // InternalReactionLanguage.g:4198:1: rule__Initialisation__Group__1__Impl : ( ( rule__Initialisation__BodyAssignment_1 ) ) ;
    public final void rule__Initialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4202:1: ( ( ( rule__Initialisation__BodyAssignment_1 ) ) )
            // InternalReactionLanguage.g:4203:1: ( ( rule__Initialisation__BodyAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4203:1: ( ( rule__Initialisation__BodyAssignment_1 ) )
            // InternalReactionLanguage.g:4204:2: ( rule__Initialisation__BodyAssignment_1 )
            {
             before(grammarAccess.getInitialisationAccess().getBodyAssignment_1()); 
            // InternalReactionLanguage.g:4205:2: ( rule__Initialisation__BodyAssignment_1 )
            // InternalReactionLanguage.g:4205:3: rule__Initialisation__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__1__Impl"


    // $ANTLR start "rule__InitialisationHead__Group__0"
    // InternalReactionLanguage.g:4214:1: rule__InitialisationHead__Group__0 : rule__InitialisationHead__Group__0__Impl rule__InitialisationHead__Group__1 ;
    public final void rule__InitialisationHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4218:1: ( rule__InitialisationHead__Group__0__Impl rule__InitialisationHead__Group__1 )
            // InternalReactionLanguage.g:4219:2: rule__InitialisationHead__Group__0__Impl rule__InitialisationHead__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__InitialisationHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialisationHead__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationHead__Group__0"


    // $ANTLR start "rule__InitialisationHead__Group__0__Impl"
    // InternalReactionLanguage.g:4226:1: rule__InitialisationHead__Group__0__Impl : ( 'init' ) ;
    public final void rule__InitialisationHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4230:1: ( ( 'init' ) )
            // InternalReactionLanguage.g:4231:1: ( 'init' )
            {
            // InternalReactionLanguage.g:4231:1: ( 'init' )
            // InternalReactionLanguage.g:4232:2: 'init'
            {
             before(grammarAccess.getInitialisationHeadAccess().getInitKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInitialisationHeadAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationHead__Group__0__Impl"


    // $ANTLR start "rule__InitialisationHead__Group__1"
    // InternalReactionLanguage.g:4241:1: rule__InitialisationHead__Group__1 : rule__InitialisationHead__Group__1__Impl ;
    public final void rule__InitialisationHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4245:1: ( rule__InitialisationHead__Group__1__Impl )
            // InternalReactionLanguage.g:4246:2: rule__InitialisationHead__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationHead__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationHead__Group__1"


    // $ANTLR start "rule__InitialisationHead__Group__1__Impl"
    // InternalReactionLanguage.g:4252:1: rule__InitialisationHead__Group__1__Impl : ( ( rule__InitialisationHead__CntAssignment_1 ) ) ;
    public final void rule__InitialisationHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4256:1: ( ( ( rule__InitialisationHead__CntAssignment_1 ) ) )
            // InternalReactionLanguage.g:4257:1: ( ( rule__InitialisationHead__CntAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4257:1: ( ( rule__InitialisationHead__CntAssignment_1 ) )
            // InternalReactionLanguage.g:4258:2: ( rule__InitialisationHead__CntAssignment_1 )
            {
             before(grammarAccess.getInitialisationHeadAccess().getCntAssignment_1()); 
            // InternalReactionLanguage.g:4259:2: ( rule__InitialisationHead__CntAssignment_1 )
            // InternalReactionLanguage.g:4259:3: rule__InitialisationHead__CntAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationHead__CntAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationHeadAccess().getCntAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationHead__Group__1__Impl"


    // $ANTLR start "rule__InitialisationBody__Group__0"
    // InternalReactionLanguage.g:4268:1: rule__InitialisationBody__Group__0 : rule__InitialisationBody__Group__0__Impl rule__InitialisationBody__Group__1 ;
    public final void rule__InitialisationBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4272:1: ( rule__InitialisationBody__Group__0__Impl rule__InitialisationBody__Group__1 )
            // InternalReactionLanguage.g:4273:2: rule__InitialisationBody__Group__0__Impl rule__InitialisationBody__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__InitialisationBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialisationBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__0"


    // $ANTLR start "rule__InitialisationBody__Group__0__Impl"
    // InternalReactionLanguage.g:4280:1: rule__InitialisationBody__Group__0__Impl : ( ( rule__InitialisationBody__SignatureAssignment_0 )? ) ;
    public final void rule__InitialisationBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4284:1: ( ( ( rule__InitialisationBody__SignatureAssignment_0 )? ) )
            // InternalReactionLanguage.g:4285:1: ( ( rule__InitialisationBody__SignatureAssignment_0 )? )
            {
            // InternalReactionLanguage.g:4285:1: ( ( rule__InitialisationBody__SignatureAssignment_0 )? )
            // InternalReactionLanguage.g:4286:2: ( rule__InitialisationBody__SignatureAssignment_0 )?
            {
             before(grammarAccess.getInitialisationBodyAccess().getSignatureAssignment_0()); 
            // InternalReactionLanguage.g:4287:2: ( rule__InitialisationBody__SignatureAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalReactionLanguage.g:4287:3: rule__InitialisationBody__SignatureAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialisationBody__SignatureAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialisationBodyAccess().getSignatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__0__Impl"


    // $ANTLR start "rule__InitialisationBody__Group__1"
    // InternalReactionLanguage.g:4295:1: rule__InitialisationBody__Group__1 : rule__InitialisationBody__Group__1__Impl rule__InitialisationBody__Group__2 ;
    public final void rule__InitialisationBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4299:1: ( rule__InitialisationBody__Group__1__Impl rule__InitialisationBody__Group__2 )
            // InternalReactionLanguage.g:4300:2: rule__InitialisationBody__Group__1__Impl rule__InitialisationBody__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InitialisationBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialisationBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__1"


    // $ANTLR start "rule__InitialisationBody__Group__1__Impl"
    // InternalReactionLanguage.g:4307:1: rule__InitialisationBody__Group__1__Impl : ( ':' ) ;
    public final void rule__InitialisationBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4311:1: ( ( ':' ) )
            // InternalReactionLanguage.g:4312:1: ( ':' )
            {
            // InternalReactionLanguage.g:4312:1: ( ':' )
            // InternalReactionLanguage.g:4313:2: ':'
            {
             before(grammarAccess.getInitialisationBodyAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInitialisationBodyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__1__Impl"


    // $ANTLR start "rule__InitialisationBody__Group__2"
    // InternalReactionLanguage.g:4322:1: rule__InitialisationBody__Group__2 : rule__InitialisationBody__Group__2__Impl ;
    public final void rule__InitialisationBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4326:1: ( rule__InitialisationBody__Group__2__Impl )
            // InternalReactionLanguage.g:4327:2: rule__InitialisationBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__2"


    // $ANTLR start "rule__InitialisationBody__Group__2__Impl"
    // InternalReactionLanguage.g:4333:1: rule__InitialisationBody__Group__2__Impl : ( ( rule__InitialisationBody__PatternAssignment_2 ) ) ;
    public final void rule__InitialisationBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4337:1: ( ( ( rule__InitialisationBody__PatternAssignment_2 ) ) )
            // InternalReactionLanguage.g:4338:1: ( ( rule__InitialisationBody__PatternAssignment_2 ) )
            {
            // InternalReactionLanguage.g:4338:1: ( ( rule__InitialisationBody__PatternAssignment_2 ) )
            // InternalReactionLanguage.g:4339:2: ( rule__InitialisationBody__PatternAssignment_2 )
            {
             before(grammarAccess.getInitialisationBodyAccess().getPatternAssignment_2()); 
            // InternalReactionLanguage.g:4340:2: ( rule__InitialisationBody__PatternAssignment_2 )
            // InternalReactionLanguage.g:4340:3: rule__InitialisationBody__PatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialisationBody__PatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationBodyAccess().getPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__Group__2__Impl"


    // $ANTLR start "rule__Observable__Group__0"
    // InternalReactionLanguage.g:4349:1: rule__Observable__Group__0 : rule__Observable__Group__0__Impl rule__Observable__Group__1 ;
    public final void rule__Observable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4353:1: ( rule__Observable__Group__0__Impl rule__Observable__Group__1 )
            // InternalReactionLanguage.g:4354:2: rule__Observable__Group__0__Impl rule__Observable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Observable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__0"


    // $ANTLR start "rule__Observable__Group__0__Impl"
    // InternalReactionLanguage.g:4361:1: rule__Observable__Group__0__Impl : ( 'observe' ) ;
    public final void rule__Observable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4365:1: ( ( 'observe' ) )
            // InternalReactionLanguage.g:4366:1: ( 'observe' )
            {
            // InternalReactionLanguage.g:4366:1: ( 'observe' )
            // InternalReactionLanguage.g:4367:2: 'observe'
            {
             before(grammarAccess.getObservableAccess().getObserveKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObservableAccess().getObserveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__0__Impl"


    // $ANTLR start "rule__Observable__Group__1"
    // InternalReactionLanguage.g:4376:1: rule__Observable__Group__1 : rule__Observable__Group__1__Impl rule__Observable__Group__2 ;
    public final void rule__Observable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4380:1: ( rule__Observable__Group__1__Impl rule__Observable__Group__2 )
            // InternalReactionLanguage.g:4381:2: rule__Observable__Group__1__Impl rule__Observable__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Observable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__1"


    // $ANTLR start "rule__Observable__Group__1__Impl"
    // InternalReactionLanguage.g:4388:1: rule__Observable__Group__1__Impl : ( ( rule__Observable__NameAssignment_1 ) ) ;
    public final void rule__Observable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4392:1: ( ( ( rule__Observable__NameAssignment_1 ) ) )
            // InternalReactionLanguage.g:4393:1: ( ( rule__Observable__NameAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4393:1: ( ( rule__Observable__NameAssignment_1 ) )
            // InternalReactionLanguage.g:4394:2: ( rule__Observable__NameAssignment_1 )
            {
             before(grammarAccess.getObservableAccess().getNameAssignment_1()); 
            // InternalReactionLanguage.g:4395:2: ( rule__Observable__NameAssignment_1 )
            // InternalReactionLanguage.g:4395:3: rule__Observable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Observable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObservableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__1__Impl"


    // $ANTLR start "rule__Observable__Group__2"
    // InternalReactionLanguage.g:4403:1: rule__Observable__Group__2 : rule__Observable__Group__2__Impl ;
    public final void rule__Observable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4407:1: ( rule__Observable__Group__2__Impl )
            // InternalReactionLanguage.g:4408:2: rule__Observable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__2"


    // $ANTLR start "rule__Observable__Group__2__Impl"
    // InternalReactionLanguage.g:4414:1: rule__Observable__Group__2__Impl : ( ( rule__Observable__BodyAssignment_2 ) ) ;
    public final void rule__Observable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4418:1: ( ( ( rule__Observable__BodyAssignment_2 ) ) )
            // InternalReactionLanguage.g:4419:1: ( ( rule__Observable__BodyAssignment_2 ) )
            {
            // InternalReactionLanguage.g:4419:1: ( ( rule__Observable__BodyAssignment_2 ) )
            // InternalReactionLanguage.g:4420:2: ( rule__Observable__BodyAssignment_2 )
            {
             before(grammarAccess.getObservableAccess().getBodyAssignment_2()); 
            // InternalReactionLanguage.g:4421:2: ( rule__Observable__BodyAssignment_2 )
            // InternalReactionLanguage.g:4421:3: rule__Observable__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Observable__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObservableAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__Group__2__Impl"


    // $ANTLR start "rule__ObservablePattern__Group__0"
    // InternalReactionLanguage.g:4430:1: rule__ObservablePattern__Group__0 : rule__ObservablePattern__Group__0__Impl rule__ObservablePattern__Group__1 ;
    public final void rule__ObservablePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4434:1: ( rule__ObservablePattern__Group__0__Impl rule__ObservablePattern__Group__1 )
            // InternalReactionLanguage.g:4435:2: rule__ObservablePattern__Group__0__Impl rule__ObservablePattern__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ObservablePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObservablePattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__0"


    // $ANTLR start "rule__ObservablePattern__Group__0__Impl"
    // InternalReactionLanguage.g:4442:1: rule__ObservablePattern__Group__0__Impl : ( ( rule__ObservablePattern__SignatureAssignment_0 )? ) ;
    public final void rule__ObservablePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4446:1: ( ( ( rule__ObservablePattern__SignatureAssignment_0 )? ) )
            // InternalReactionLanguage.g:4447:1: ( ( rule__ObservablePattern__SignatureAssignment_0 )? )
            {
            // InternalReactionLanguage.g:4447:1: ( ( rule__ObservablePattern__SignatureAssignment_0 )? )
            // InternalReactionLanguage.g:4448:2: ( rule__ObservablePattern__SignatureAssignment_0 )?
            {
             before(grammarAccess.getObservablePatternAccess().getSignatureAssignment_0()); 
            // InternalReactionLanguage.g:4449:2: ( rule__ObservablePattern__SignatureAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalReactionLanguage.g:4449:3: rule__ObservablePattern__SignatureAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObservablePattern__SignatureAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObservablePatternAccess().getSignatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__0__Impl"


    // $ANTLR start "rule__ObservablePattern__Group__1"
    // InternalReactionLanguage.g:4457:1: rule__ObservablePattern__Group__1 : rule__ObservablePattern__Group__1__Impl rule__ObservablePattern__Group__2 ;
    public final void rule__ObservablePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4461:1: ( rule__ObservablePattern__Group__1__Impl rule__ObservablePattern__Group__2 )
            // InternalReactionLanguage.g:4462:2: rule__ObservablePattern__Group__1__Impl rule__ObservablePattern__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ObservablePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObservablePattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__1"


    // $ANTLR start "rule__ObservablePattern__Group__1__Impl"
    // InternalReactionLanguage.g:4469:1: rule__ObservablePattern__Group__1__Impl : ( ':' ) ;
    public final void rule__ObservablePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4473:1: ( ( ':' ) )
            // InternalReactionLanguage.g:4474:1: ( ':' )
            {
            // InternalReactionLanguage.g:4474:1: ( ':' )
            // InternalReactionLanguage.g:4475:2: ':'
            {
             before(grammarAccess.getObservablePatternAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObservablePatternAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__1__Impl"


    // $ANTLR start "rule__ObservablePattern__Group__2"
    // InternalReactionLanguage.g:4484:1: rule__ObservablePattern__Group__2 : rule__ObservablePattern__Group__2__Impl ;
    public final void rule__ObservablePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4488:1: ( rule__ObservablePattern__Group__2__Impl )
            // InternalReactionLanguage.g:4489:2: rule__ObservablePattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObservablePattern__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__2"


    // $ANTLR start "rule__ObservablePattern__Group__2__Impl"
    // InternalReactionLanguage.g:4495:1: rule__ObservablePattern__Group__2__Impl : ( ( rule__ObservablePattern__PatternAssignment_2 ) ) ;
    public final void rule__ObservablePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4499:1: ( ( ( rule__ObservablePattern__PatternAssignment_2 ) ) )
            // InternalReactionLanguage.g:4500:1: ( ( rule__ObservablePattern__PatternAssignment_2 ) )
            {
            // InternalReactionLanguage.g:4500:1: ( ( rule__ObservablePattern__PatternAssignment_2 ) )
            // InternalReactionLanguage.g:4501:2: ( rule__ObservablePattern__PatternAssignment_2 )
            {
             before(grammarAccess.getObservablePatternAccess().getPatternAssignment_2()); 
            // InternalReactionLanguage.g:4502:2: ( rule__ObservablePattern__PatternAssignment_2 )
            // InternalReactionLanguage.g:4502:3: rule__ObservablePattern__PatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObservablePattern__PatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObservablePatternAccess().getPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__Group__2__Impl"


    // $ANTLR start "rule__TerminateCommand__Group__0"
    // InternalReactionLanguage.g:4511:1: rule__TerminateCommand__Group__0 : rule__TerminateCommand__Group__0__Impl rule__TerminateCommand__Group__1 ;
    public final void rule__TerminateCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4515:1: ( rule__TerminateCommand__Group__0__Impl rule__TerminateCommand__Group__1 )
            // InternalReactionLanguage.g:4516:2: rule__TerminateCommand__Group__0__Impl rule__TerminateCommand__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__TerminateCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCommand__Group__0"


    // $ANTLR start "rule__TerminateCommand__Group__0__Impl"
    // InternalReactionLanguage.g:4523:1: rule__TerminateCommand__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__TerminateCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4527:1: ( ( 'terminate' ) )
            // InternalReactionLanguage.g:4528:1: ( 'terminate' )
            {
            // InternalReactionLanguage.g:4528:1: ( 'terminate' )
            // InternalReactionLanguage.g:4529:2: 'terminate'
            {
             before(grammarAccess.getTerminateCommandAccess().getTerminateKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTerminateCommandAccess().getTerminateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCommand__Group__0__Impl"


    // $ANTLR start "rule__TerminateCommand__Group__1"
    // InternalReactionLanguage.g:4538:1: rule__TerminateCommand__Group__1 : rule__TerminateCommand__Group__1__Impl ;
    public final void rule__TerminateCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4542:1: ( rule__TerminateCommand__Group__1__Impl )
            // InternalReactionLanguage.g:4543:2: rule__TerminateCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCommand__Group__1"


    // $ANTLR start "rule__TerminateCommand__Group__1__Impl"
    // InternalReactionLanguage.g:4549:1: rule__TerminateCommand__Group__1__Impl : ( ruleTerminateBody ) ;
    public final void rule__TerminateCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4553:1: ( ( ruleTerminateBody ) )
            // InternalReactionLanguage.g:4554:1: ( ruleTerminateBody )
            {
            // InternalReactionLanguage.g:4554:1: ( ruleTerminateBody )
            // InternalReactionLanguage.g:4555:2: ruleTerminateBody
            {
             before(grammarAccess.getTerminateCommandAccess().getTerminateBodyParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTerminateBody();

            state._fsp--;

             after(grammarAccess.getTerminateCommandAccess().getTerminateBodyParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCommand__Group__1__Impl"


    // $ANTLR start "rule__TerminateTime__Group__0"
    // InternalReactionLanguage.g:4565:1: rule__TerminateTime__Group__0 : rule__TerminateTime__Group__0__Impl rule__TerminateTime__Group__1 ;
    public final void rule__TerminateTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4569:1: ( rule__TerminateTime__Group__0__Impl rule__TerminateTime__Group__1 )
            // InternalReactionLanguage.g:4570:2: rule__TerminateTime__Group__0__Impl rule__TerminateTime__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TerminateTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__0"


    // $ANTLR start "rule__TerminateTime__Group__0__Impl"
    // InternalReactionLanguage.g:4577:1: rule__TerminateTime__Group__0__Impl : ( 'time' ) ;
    public final void rule__TerminateTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4581:1: ( ( 'time' ) )
            // InternalReactionLanguage.g:4582:1: ( 'time' )
            {
            // InternalReactionLanguage.g:4582:1: ( 'time' )
            // InternalReactionLanguage.g:4583:2: 'time'
            {
             before(grammarAccess.getTerminateTimeAccess().getTimeKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTerminateTimeAccess().getTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__0__Impl"


    // $ANTLR start "rule__TerminateTime__Group__1"
    // InternalReactionLanguage.g:4592:1: rule__TerminateTime__Group__1 : rule__TerminateTime__Group__1__Impl rule__TerminateTime__Group__2 ;
    public final void rule__TerminateTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4596:1: ( rule__TerminateTime__Group__1__Impl rule__TerminateTime__Group__2 )
            // InternalReactionLanguage.g:4597:2: rule__TerminateTime__Group__1__Impl rule__TerminateTime__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TerminateTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__1"


    // $ANTLR start "rule__TerminateTime__Group__1__Impl"
    // InternalReactionLanguage.g:4604:1: rule__TerminateTime__Group__1__Impl : ( '=' ) ;
    public final void rule__TerminateTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4608:1: ( ( '=' ) )
            // InternalReactionLanguage.g:4609:1: ( '=' )
            {
            // InternalReactionLanguage.g:4609:1: ( '=' )
            // InternalReactionLanguage.g:4610:2: '='
            {
             before(grammarAccess.getTerminateTimeAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTerminateTimeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__1__Impl"


    // $ANTLR start "rule__TerminateTime__Group__2"
    // InternalReactionLanguage.g:4619:1: rule__TerminateTime__Group__2 : rule__TerminateTime__Group__2__Impl ;
    public final void rule__TerminateTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4623:1: ( rule__TerminateTime__Group__2__Impl )
            // InternalReactionLanguage.g:4624:2: rule__TerminateTime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminateTime__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__2"


    // $ANTLR start "rule__TerminateTime__Group__2__Impl"
    // InternalReactionLanguage.g:4630:1: rule__TerminateTime__Group__2__Impl : ( ( rule__TerminateTime__TimeAssignment_2 ) ) ;
    public final void rule__TerminateTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4634:1: ( ( ( rule__TerminateTime__TimeAssignment_2 ) ) )
            // InternalReactionLanguage.g:4635:1: ( ( rule__TerminateTime__TimeAssignment_2 ) )
            {
            // InternalReactionLanguage.g:4635:1: ( ( rule__TerminateTime__TimeAssignment_2 ) )
            // InternalReactionLanguage.g:4636:2: ( rule__TerminateTime__TimeAssignment_2 )
            {
             before(grammarAccess.getTerminateTimeAccess().getTimeAssignment_2()); 
            // InternalReactionLanguage.g:4637:2: ( rule__TerminateTime__TimeAssignment_2 )
            // InternalReactionLanguage.g:4637:3: rule__TerminateTime__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminateTime__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminateTimeAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__Group__2__Impl"


    // $ANTLR start "rule__TerminateIterations__Group__0"
    // InternalReactionLanguage.g:4646:1: rule__TerminateIterations__Group__0 : rule__TerminateIterations__Group__0__Impl rule__TerminateIterations__Group__1 ;
    public final void rule__TerminateIterations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4650:1: ( rule__TerminateIterations__Group__0__Impl rule__TerminateIterations__Group__1 )
            // InternalReactionLanguage.g:4651:2: rule__TerminateIterations__Group__0__Impl rule__TerminateIterations__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TerminateIterations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateIterations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__0"


    // $ANTLR start "rule__TerminateIterations__Group__0__Impl"
    // InternalReactionLanguage.g:4658:1: rule__TerminateIterations__Group__0__Impl : ( 'iterations' ) ;
    public final void rule__TerminateIterations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4662:1: ( ( 'iterations' ) )
            // InternalReactionLanguage.g:4663:1: ( 'iterations' )
            {
            // InternalReactionLanguage.g:4663:1: ( 'iterations' )
            // InternalReactionLanguage.g:4664:2: 'iterations'
            {
             before(grammarAccess.getTerminateIterationsAccess().getIterationsKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTerminateIterationsAccess().getIterationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__0__Impl"


    // $ANTLR start "rule__TerminateIterations__Group__1"
    // InternalReactionLanguage.g:4673:1: rule__TerminateIterations__Group__1 : rule__TerminateIterations__Group__1__Impl rule__TerminateIterations__Group__2 ;
    public final void rule__TerminateIterations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4677:1: ( rule__TerminateIterations__Group__1__Impl rule__TerminateIterations__Group__2 )
            // InternalReactionLanguage.g:4678:2: rule__TerminateIterations__Group__1__Impl rule__TerminateIterations__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TerminateIterations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateIterations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__1"


    // $ANTLR start "rule__TerminateIterations__Group__1__Impl"
    // InternalReactionLanguage.g:4685:1: rule__TerminateIterations__Group__1__Impl : ( '=' ) ;
    public final void rule__TerminateIterations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4689:1: ( ( '=' ) )
            // InternalReactionLanguage.g:4690:1: ( '=' )
            {
            // InternalReactionLanguage.g:4690:1: ( '=' )
            // InternalReactionLanguage.g:4691:2: '='
            {
             before(grammarAccess.getTerminateIterationsAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTerminateIterationsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__1__Impl"


    // $ANTLR start "rule__TerminateIterations__Group__2"
    // InternalReactionLanguage.g:4700:1: rule__TerminateIterations__Group__2 : rule__TerminateIterations__Group__2__Impl ;
    public final void rule__TerminateIterations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4704:1: ( rule__TerminateIterations__Group__2__Impl )
            // InternalReactionLanguage.g:4705:2: rule__TerminateIterations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminateIterations__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__2"


    // $ANTLR start "rule__TerminateIterations__Group__2__Impl"
    // InternalReactionLanguage.g:4711:1: rule__TerminateIterations__Group__2__Impl : ( ( rule__TerminateIterations__IterationsAssignment_2 ) ) ;
    public final void rule__TerminateIterations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4715:1: ( ( ( rule__TerminateIterations__IterationsAssignment_2 ) ) )
            // InternalReactionLanguage.g:4716:1: ( ( rule__TerminateIterations__IterationsAssignment_2 ) )
            {
            // InternalReactionLanguage.g:4716:1: ( ( rule__TerminateIterations__IterationsAssignment_2 ) )
            // InternalReactionLanguage.g:4717:2: ( rule__TerminateIterations__IterationsAssignment_2 )
            {
             before(grammarAccess.getTerminateIterationsAccess().getIterationsAssignment_2()); 
            // InternalReactionLanguage.g:4718:2: ( rule__TerminateIterations__IterationsAssignment_2 )
            // InternalReactionLanguage.g:4718:3: rule__TerminateIterations__IterationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminateIterations__IterationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminateIterationsAccess().getIterationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__Group__2__Impl"


    // $ANTLR start "rule__TerminateCount__Group__0"
    // InternalReactionLanguage.g:4727:1: rule__TerminateCount__Group__0 : rule__TerminateCount__Group__0__Impl rule__TerminateCount__Group__1 ;
    public final void rule__TerminateCount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4731:1: ( rule__TerminateCount__Group__0__Impl rule__TerminateCount__Group__1 )
            // InternalReactionLanguage.g:4732:2: rule__TerminateCount__Group__0__Impl rule__TerminateCount__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__TerminateCount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__0"


    // $ANTLR start "rule__TerminateCount__Group__0__Impl"
    // InternalReactionLanguage.g:4739:1: rule__TerminateCount__Group__0__Impl : ( ( rule__TerminateCount__Group_0__0 )? ) ;
    public final void rule__TerminateCount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4743:1: ( ( ( rule__TerminateCount__Group_0__0 )? ) )
            // InternalReactionLanguage.g:4744:1: ( ( rule__TerminateCount__Group_0__0 )? )
            {
            // InternalReactionLanguage.g:4744:1: ( ( rule__TerminateCount__Group_0__0 )? )
            // InternalReactionLanguage.g:4745:2: ( rule__TerminateCount__Group_0__0 )?
            {
             before(grammarAccess.getTerminateCountAccess().getGroup_0()); 
            // InternalReactionLanguage.g:4746:2: ( rule__TerminateCount__Group_0__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalReactionLanguage.g:4746:3: rule__TerminateCount__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminateCount__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminateCountAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__0__Impl"


    // $ANTLR start "rule__TerminateCount__Group__1"
    // InternalReactionLanguage.g:4754:1: rule__TerminateCount__Group__1 : rule__TerminateCount__Group__1__Impl rule__TerminateCount__Group__2 ;
    public final void rule__TerminateCount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4758:1: ( rule__TerminateCount__Group__1__Impl rule__TerminateCount__Group__2 )
            // InternalReactionLanguage.g:4759:2: rule__TerminateCount__Group__1__Impl rule__TerminateCount__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__TerminateCount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__1"


    // $ANTLR start "rule__TerminateCount__Group__1__Impl"
    // InternalReactionLanguage.g:4766:1: rule__TerminateCount__Group__1__Impl : ( ( rule__TerminateCount__PatternAssignment_1 ) ) ;
    public final void rule__TerminateCount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4770:1: ( ( ( rule__TerminateCount__PatternAssignment_1 ) ) )
            // InternalReactionLanguage.g:4771:1: ( ( rule__TerminateCount__PatternAssignment_1 ) )
            {
            // InternalReactionLanguage.g:4771:1: ( ( rule__TerminateCount__PatternAssignment_1 ) )
            // InternalReactionLanguage.g:4772:2: ( rule__TerminateCount__PatternAssignment_1 )
            {
             before(grammarAccess.getTerminateCountAccess().getPatternAssignment_1()); 
            // InternalReactionLanguage.g:4773:2: ( rule__TerminateCount__PatternAssignment_1 )
            // InternalReactionLanguage.g:4773:3: rule__TerminateCount__PatternAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminateCountAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__1__Impl"


    // $ANTLR start "rule__TerminateCount__Group__2"
    // InternalReactionLanguage.g:4781:1: rule__TerminateCount__Group__2 : rule__TerminateCount__Group__2__Impl rule__TerminateCount__Group__3 ;
    public final void rule__TerminateCount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4785:1: ( rule__TerminateCount__Group__2__Impl rule__TerminateCount__Group__3 )
            // InternalReactionLanguage.g:4786:2: rule__TerminateCount__Group__2__Impl rule__TerminateCount__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__TerminateCount__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__2"


    // $ANTLR start "rule__TerminateCount__Group__2__Impl"
    // InternalReactionLanguage.g:4793:1: rule__TerminateCount__Group__2__Impl : ( 'matches' ) ;
    public final void rule__TerminateCount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4797:1: ( ( 'matches' ) )
            // InternalReactionLanguage.g:4798:1: ( 'matches' )
            {
            // InternalReactionLanguage.g:4798:1: ( 'matches' )
            // InternalReactionLanguage.g:4799:2: 'matches'
            {
             before(grammarAccess.getTerminateCountAccess().getMatchesKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTerminateCountAccess().getMatchesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__2__Impl"


    // $ANTLR start "rule__TerminateCount__Group__3"
    // InternalReactionLanguage.g:4808:1: rule__TerminateCount__Group__3 : rule__TerminateCount__Group__3__Impl rule__TerminateCount__Group__4 ;
    public final void rule__TerminateCount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4812:1: ( rule__TerminateCount__Group__3__Impl rule__TerminateCount__Group__4 )
            // InternalReactionLanguage.g:4813:2: rule__TerminateCount__Group__3__Impl rule__TerminateCount__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__TerminateCount__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__3"


    // $ANTLR start "rule__TerminateCount__Group__3__Impl"
    // InternalReactionLanguage.g:4820:1: rule__TerminateCount__Group__3__Impl : ( '=' ) ;
    public final void rule__TerminateCount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4824:1: ( ( '=' ) )
            // InternalReactionLanguage.g:4825:1: ( '=' )
            {
            // InternalReactionLanguage.g:4825:1: ( '=' )
            // InternalReactionLanguage.g:4826:2: '='
            {
             before(grammarAccess.getTerminateCountAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTerminateCountAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__3__Impl"


    // $ANTLR start "rule__TerminateCount__Group__4"
    // InternalReactionLanguage.g:4835:1: rule__TerminateCount__Group__4 : rule__TerminateCount__Group__4__Impl ;
    public final void rule__TerminateCount__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4839:1: ( rule__TerminateCount__Group__4__Impl )
            // InternalReactionLanguage.g:4840:2: rule__TerminateCount__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__4"


    // $ANTLR start "rule__TerminateCount__Group__4__Impl"
    // InternalReactionLanguage.g:4846:1: rule__TerminateCount__Group__4__Impl : ( ( rule__TerminateCount__CntAssignment_4 ) ) ;
    public final void rule__TerminateCount__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4850:1: ( ( ( rule__TerminateCount__CntAssignment_4 ) ) )
            // InternalReactionLanguage.g:4851:1: ( ( rule__TerminateCount__CntAssignment_4 ) )
            {
            // InternalReactionLanguage.g:4851:1: ( ( rule__TerminateCount__CntAssignment_4 ) )
            // InternalReactionLanguage.g:4852:2: ( rule__TerminateCount__CntAssignment_4 )
            {
             before(grammarAccess.getTerminateCountAccess().getCntAssignment_4()); 
            // InternalReactionLanguage.g:4853:2: ( rule__TerminateCount__CntAssignment_4 )
            // InternalReactionLanguage.g:4853:3: rule__TerminateCount__CntAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__CntAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminateCountAccess().getCntAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group__4__Impl"


    // $ANTLR start "rule__TerminateCount__Group_0__0"
    // InternalReactionLanguage.g:4862:1: rule__TerminateCount__Group_0__0 : rule__TerminateCount__Group_0__0__Impl rule__TerminateCount__Group_0__1 ;
    public final void rule__TerminateCount__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4866:1: ( rule__TerminateCount__Group_0__0__Impl rule__TerminateCount__Group_0__1 )
            // InternalReactionLanguage.g:4867:2: rule__TerminateCount__Group_0__0__Impl rule__TerminateCount__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TerminateCount__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group_0__0"


    // $ANTLR start "rule__TerminateCount__Group_0__0__Impl"
    // InternalReactionLanguage.g:4874:1: rule__TerminateCount__Group_0__0__Impl : ( ( rule__TerminateCount__SignatureAssignment_0_0 ) ) ;
    public final void rule__TerminateCount__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4878:1: ( ( ( rule__TerminateCount__SignatureAssignment_0_0 ) ) )
            // InternalReactionLanguage.g:4879:1: ( ( rule__TerminateCount__SignatureAssignment_0_0 ) )
            {
            // InternalReactionLanguage.g:4879:1: ( ( rule__TerminateCount__SignatureAssignment_0_0 ) )
            // InternalReactionLanguage.g:4880:2: ( rule__TerminateCount__SignatureAssignment_0_0 )
            {
             before(grammarAccess.getTerminateCountAccess().getSignatureAssignment_0_0()); 
            // InternalReactionLanguage.g:4881:2: ( rule__TerminateCount__SignatureAssignment_0_0 )
            // InternalReactionLanguage.g:4881:3: rule__TerminateCount__SignatureAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__SignatureAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminateCountAccess().getSignatureAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group_0__0__Impl"


    // $ANTLR start "rule__TerminateCount__Group_0__1"
    // InternalReactionLanguage.g:4889:1: rule__TerminateCount__Group_0__1 : rule__TerminateCount__Group_0__1__Impl ;
    public final void rule__TerminateCount__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4893:1: ( rule__TerminateCount__Group_0__1__Impl )
            // InternalReactionLanguage.g:4894:2: rule__TerminateCount__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminateCount__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group_0__1"


    // $ANTLR start "rule__TerminateCount__Group_0__1__Impl"
    // InternalReactionLanguage.g:4900:1: rule__TerminateCount__Group_0__1__Impl : ( ':' ) ;
    public final void rule__TerminateCount__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4904:1: ( ( ':' ) )
            // InternalReactionLanguage.g:4905:1: ( ':' )
            {
            // InternalReactionLanguage.g:4905:1: ( ':' )
            // InternalReactionLanguage.g:4906:2: ':'
            {
             before(grammarAccess.getTerminateCountAccess().getColonKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerminateCountAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__Group_0__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalReactionLanguage.g:4916:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4920:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalReactionLanguage.g:4921:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalReactionLanguage.g:4928:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4932:1: ( ( ruleMultiplication ) )
            // InternalReactionLanguage.g:4933:1: ( ruleMultiplication )
            {
            // InternalReactionLanguage.g:4933:1: ( ruleMultiplication )
            // InternalReactionLanguage.g:4934:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalReactionLanguage.g:4943:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4947:1: ( rule__Addition__Group__1__Impl )
            // InternalReactionLanguage.g:4948:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalReactionLanguage.g:4954:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4958:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalReactionLanguage.g:4959:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalReactionLanguage.g:4959:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalReactionLanguage.g:4960:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalReactionLanguage.g:4961:2: ( rule__Addition__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=14 && LA47_0<=15)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalReactionLanguage.g:4961:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalReactionLanguage.g:4970:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4974:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalReactionLanguage.g:4975:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalReactionLanguage.g:4982:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:4986:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalReactionLanguage.g:4987:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalReactionLanguage.g:4987:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalReactionLanguage.g:4988:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalReactionLanguage.g:4989:2: ( rule__Addition__Alternatives_1_0 )
            // InternalReactionLanguage.g:4989:3: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalReactionLanguage.g:4997:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5001:1: ( rule__Addition__Group_1__1__Impl )
            // InternalReactionLanguage.g:5002:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalReactionLanguage.g:5008:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5012:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:5013:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:5013:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalReactionLanguage.g:5014:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalReactionLanguage.g:5015:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalReactionLanguage.g:5015:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalReactionLanguage.g:5024:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5028:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalReactionLanguage.g:5029:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalReactionLanguage.g:5036:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5040:1: ( ( () ) )
            // InternalReactionLanguage.g:5041:1: ( () )
            {
            // InternalReactionLanguage.g:5041:1: ( () )
            // InternalReactionLanguage.g:5042:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalReactionLanguage.g:5043:2: ()
            // InternalReactionLanguage.g:5043:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalReactionLanguage.g:5051:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5055:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalReactionLanguage.g:5056:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalReactionLanguage.g:5062:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5066:1: ( ( '+' ) )
            // InternalReactionLanguage.g:5067:1: ( '+' )
            {
            // InternalReactionLanguage.g:5067:1: ( '+' )
            // InternalReactionLanguage.g:5068:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalReactionLanguage.g:5078:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5082:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalReactionLanguage.g:5083:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalReactionLanguage.g:5090:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5094:1: ( ( () ) )
            // InternalReactionLanguage.g:5095:1: ( () )
            {
            // InternalReactionLanguage.g:5095:1: ( () )
            // InternalReactionLanguage.g:5096:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalReactionLanguage.g:5097:2: ()
            // InternalReactionLanguage.g:5097:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalReactionLanguage.g:5105:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5109:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalReactionLanguage.g:5110:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalReactionLanguage.g:5116:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5120:1: ( ( '-' ) )
            // InternalReactionLanguage.g:5121:1: ( '-' )
            {
            // InternalReactionLanguage.g:5121:1: ( '-' )
            // InternalReactionLanguage.g:5122:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalReactionLanguage.g:5132:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5136:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalReactionLanguage.g:5137:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalReactionLanguage.g:5144:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5148:1: ( ( rulePrimaryExpr ) )
            // InternalReactionLanguage.g:5149:1: ( rulePrimaryExpr )
            {
            // InternalReactionLanguage.g:5149:1: ( rulePrimaryExpr )
            // InternalReactionLanguage.g:5150:2: rulePrimaryExpr
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalReactionLanguage.g:5159:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5163:1: ( rule__Multiplication__Group__1__Impl )
            // InternalReactionLanguage.g:5164:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalReactionLanguage.g:5170:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5174:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalReactionLanguage.g:5175:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalReactionLanguage.g:5175:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalReactionLanguage.g:5176:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalReactionLanguage.g:5177:2: ( rule__Multiplication__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=43 && LA48_0<=45)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalReactionLanguage.g:5177:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalReactionLanguage.g:5186:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5190:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalReactionLanguage.g:5191:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalReactionLanguage.g:5198:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5202:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalReactionLanguage.g:5203:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalReactionLanguage.g:5203:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalReactionLanguage.g:5204:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalReactionLanguage.g:5205:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalReactionLanguage.g:5205:3: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalReactionLanguage.g:5213:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5217:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalReactionLanguage.g:5218:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalReactionLanguage.g:5224:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5228:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:5229:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:5229:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalReactionLanguage.g:5230:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalReactionLanguage.g:5231:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalReactionLanguage.g:5231:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalReactionLanguage.g:5240:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5244:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalReactionLanguage.g:5245:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalReactionLanguage.g:5252:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5256:1: ( ( () ) )
            // InternalReactionLanguage.g:5257:1: ( () )
            {
            // InternalReactionLanguage.g:5257:1: ( () )
            // InternalReactionLanguage.g:5258:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalReactionLanguage.g:5259:2: ()
            // InternalReactionLanguage.g:5259:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalReactionLanguage.g:5267:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5271:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalReactionLanguage.g:5272:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalReactionLanguage.g:5278:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5282:1: ( ( '*' ) )
            // InternalReactionLanguage.g:5283:1: ( '*' )
            {
            // InternalReactionLanguage.g:5283:1: ( '*' )
            // InternalReactionLanguage.g:5284:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalReactionLanguage.g:5294:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5298:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalReactionLanguage.g:5299:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalReactionLanguage.g:5306:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5310:1: ( ( () ) )
            // InternalReactionLanguage.g:5311:1: ( () )
            {
            // InternalReactionLanguage.g:5311:1: ( () )
            // InternalReactionLanguage.g:5312:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalReactionLanguage.g:5313:2: ()
            // InternalReactionLanguage.g:5313:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalReactionLanguage.g:5321:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5325:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalReactionLanguage.g:5326:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalReactionLanguage.g:5332:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5336:1: ( ( '/' ) )
            // InternalReactionLanguage.g:5337:1: ( '/' )
            {
            // InternalReactionLanguage.g:5337:1: ( '/' )
            // InternalReactionLanguage.g:5338:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0"
    // InternalReactionLanguage.g:5348:1: rule__Multiplication__Group_1_0_2__0 : rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 ;
    public final void rule__Multiplication__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5352:1: ( rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 )
            // InternalReactionLanguage.g:5353:2: rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplication__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0__Impl"
    // InternalReactionLanguage.g:5360:1: rule__Multiplication__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5364:1: ( ( () ) )
            // InternalReactionLanguage.g:5365:1: ( () )
            {
            // InternalReactionLanguage.g:5365:1: ( () )
            // InternalReactionLanguage.g:5366:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getPowLeftAction_1_0_2_0()); 
            // InternalReactionLanguage.g:5367:2: ()
            // InternalReactionLanguage.g:5367:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getPowLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1"
    // InternalReactionLanguage.g:5375:1: rule__Multiplication__Group_1_0_2__1 : rule__Multiplication__Group_1_0_2__1__Impl ;
    public final void rule__Multiplication__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5379:1: ( rule__Multiplication__Group_1_0_2__1__Impl )
            // InternalReactionLanguage.g:5380:2: rule__Multiplication__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1__Impl"
    // InternalReactionLanguage.g:5386:1: rule__Multiplication__Group_1_0_2__1__Impl : ( '^' ) ;
    public final void rule__Multiplication__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5390:1: ( ( '^' ) )
            // InternalReactionLanguage.g:5391:1: ( '^' )
            {
            // InternalReactionLanguage.g:5391:1: ( '^' )
            // InternalReactionLanguage.g:5392:2: '^'
            {
             before(grammarAccess.getMultiplicationAccess().getCircumflexAccentKeyword_1_0_2_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getCircumflexAccentKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0"
    // InternalReactionLanguage.g:5402:1: rule__PrimaryExpr__Group_0__0 : rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 ;
    public final void rule__PrimaryExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5406:1: ( rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 )
            // InternalReactionLanguage.g:5407:2: rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__0"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0__Impl"
    // InternalReactionLanguage.g:5414:1: rule__PrimaryExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5418:1: ( ( '(' ) )
            // InternalReactionLanguage.g:5419:1: ( '(' )
            {
            // InternalReactionLanguage.g:5419:1: ( '(' )
            // InternalReactionLanguage.g:5420:2: '('
            {
             before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1"
    // InternalReactionLanguage.g:5429:1: rule__PrimaryExpr__Group_0__1 : rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2 ;
    public final void rule__PrimaryExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5433:1: ( rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2 )
            // InternalReactionLanguage.g:5434:2: rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__1"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1__Impl"
    // InternalReactionLanguage.g:5441:1: rule__PrimaryExpr__Group_0__1__Impl : ( ruleArithmeticExpr ) ;
    public final void rule__PrimaryExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5445:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:5446:1: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:5446:1: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:5447:2: ruleArithmeticExpr
            {
             before(grammarAccess.getPrimaryExprAccess().getArithmeticExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getArithmeticExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__2"
    // InternalReactionLanguage.g:5456:1: rule__PrimaryExpr__Group_0__2 : rule__PrimaryExpr__Group_0__2__Impl ;
    public final void rule__PrimaryExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5460:1: ( rule__PrimaryExpr__Group_0__2__Impl )
            // InternalReactionLanguage.g:5461:2: rule__PrimaryExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__2"


    // $ANTLR start "rule__PrimaryExpr__Group_0__2__Impl"
    // InternalReactionLanguage.g:5467:1: rule__PrimaryExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5471:1: ( ( ')' ) )
            // InternalReactionLanguage.g:5472:1: ( ')' )
            {
            // InternalReactionLanguage.g:5472:1: ( ')' )
            // InternalReactionLanguage.g:5473:2: ')'
            {
             before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0"
    // InternalReactionLanguage.g:5483:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5487:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalReactionLanguage.g:5488:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__PrimaryExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0__Impl"
    // InternalReactionLanguage.g:5495:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5499:1: ( ( () ) )
            // InternalReactionLanguage.g:5500:1: ( () )
            {
            // InternalReactionLanguage.g:5500:1: ( () )
            // InternalReactionLanguage.g:5501:2: ()
            {
             before(grammarAccess.getPrimaryExprAccess().getNumberLiteralAction_1_0()); 
            // InternalReactionLanguage.g:5502:2: ()
            // InternalReactionLanguage.g:5502:3: 
            {
            }

             after(grammarAccess.getPrimaryExprAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1"
    // InternalReactionLanguage.g:5510:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5514:1: ( rule__PrimaryExpr__Group_1__1__Impl )
            // InternalReactionLanguage.g:5515:2: rule__PrimaryExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1__Impl"
    // InternalReactionLanguage.g:5521:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5525:1: ( ( ( rule__PrimaryExpr__ValueAssignment_1_1 ) ) )
            // InternalReactionLanguage.g:5526:1: ( ( rule__PrimaryExpr__ValueAssignment_1_1 ) )
            {
            // InternalReactionLanguage.g:5526:1: ( ( rule__PrimaryExpr__ValueAssignment_1_1 ) )
            // InternalReactionLanguage.g:5527:2: ( rule__PrimaryExpr__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExprAccess().getValueAssignment_1_1()); 
            // InternalReactionLanguage.g:5528:2: ( rule__PrimaryExpr__ValueAssignment_1_1 )
            // InternalReactionLanguage.g:5528:3: rule__PrimaryExpr__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__0"
    // InternalReactionLanguage.g:5537:1: rule__PrimaryExpr__Group_2__0 : rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1 ;
    public final void rule__PrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5541:1: ( rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1 )
            // InternalReactionLanguage.g:5542:2: rule__PrimaryExpr__Group_2__0__Impl rule__PrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_43);
            rule__PrimaryExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__0"


    // $ANTLR start "rule__PrimaryExpr__Group_2__0__Impl"
    // InternalReactionLanguage.g:5549:1: rule__PrimaryExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5553:1: ( ( () ) )
            // InternalReactionLanguage.g:5554:1: ( () )
            {
            // InternalReactionLanguage.g:5554:1: ( () )
            // InternalReactionLanguage.g:5555:2: ()
            {
             before(grammarAccess.getPrimaryExprAccess().getFunctionCallAction_2_0()); 
            // InternalReactionLanguage.g:5556:2: ()
            // InternalReactionLanguage.g:5556:3: 
            {
            }

             after(grammarAccess.getPrimaryExprAccess().getFunctionCallAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__1"
    // InternalReactionLanguage.g:5564:1: rule__PrimaryExpr__Group_2__1 : rule__PrimaryExpr__Group_2__1__Impl rule__PrimaryExpr__Group_2__2 ;
    public final void rule__PrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5568:1: ( rule__PrimaryExpr__Group_2__1__Impl rule__PrimaryExpr__Group_2__2 )
            // InternalReactionLanguage.g:5569:2: rule__PrimaryExpr__Group_2__1__Impl rule__PrimaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__PrimaryExpr__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__1"


    // $ANTLR start "rule__PrimaryExpr__Group_2__1__Impl"
    // InternalReactionLanguage.g:5576:1: rule__PrimaryExpr__Group_2__1__Impl : ( ( rule__PrimaryExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5580:1: ( ( ( rule__PrimaryExpr__FuncAssignment_2_1 ) ) )
            // InternalReactionLanguage.g:5581:1: ( ( rule__PrimaryExpr__FuncAssignment_2_1 ) )
            {
            // InternalReactionLanguage.g:5581:1: ( ( rule__PrimaryExpr__FuncAssignment_2_1 ) )
            // InternalReactionLanguage.g:5582:2: ( rule__PrimaryExpr__FuncAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExprAccess().getFuncAssignment_2_1()); 
            // InternalReactionLanguage.g:5583:2: ( rule__PrimaryExpr__FuncAssignment_2_1 )
            // InternalReactionLanguage.g:5583:3: rule__PrimaryExpr__FuncAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__FuncAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getFuncAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__2"
    // InternalReactionLanguage.g:5591:1: rule__PrimaryExpr__Group_2__2 : rule__PrimaryExpr__Group_2__2__Impl rule__PrimaryExpr__Group_2__3 ;
    public final void rule__PrimaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5595:1: ( rule__PrimaryExpr__Group_2__2__Impl rule__PrimaryExpr__Group_2__3 )
            // InternalReactionLanguage.g:5596:2: rule__PrimaryExpr__Group_2__2__Impl rule__PrimaryExpr__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpr__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__2"


    // $ANTLR start "rule__PrimaryExpr__Group_2__2__Impl"
    // InternalReactionLanguage.g:5603:1: rule__PrimaryExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5607:1: ( ( '(' ) )
            // InternalReactionLanguage.g:5608:1: ( '(' )
            {
            // InternalReactionLanguage.g:5608:1: ( '(' )
            // InternalReactionLanguage.g:5609:2: '('
            {
             before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__3"
    // InternalReactionLanguage.g:5618:1: rule__PrimaryExpr__Group_2__3 : rule__PrimaryExpr__Group_2__3__Impl rule__PrimaryExpr__Group_2__4 ;
    public final void rule__PrimaryExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5622:1: ( rule__PrimaryExpr__Group_2__3__Impl rule__PrimaryExpr__Group_2__4 )
            // InternalReactionLanguage.g:5623:2: rule__PrimaryExpr__Group_2__3__Impl rule__PrimaryExpr__Group_2__4
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpr__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__3"


    // $ANTLR start "rule__PrimaryExpr__Group_2__3__Impl"
    // InternalReactionLanguage.g:5630:1: rule__PrimaryExpr__Group_2__3__Impl : ( ( rule__PrimaryExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__PrimaryExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5634:1: ( ( ( rule__PrimaryExpr__ExprAssignment_2_3 ) ) )
            // InternalReactionLanguage.g:5635:1: ( ( rule__PrimaryExpr__ExprAssignment_2_3 ) )
            {
            // InternalReactionLanguage.g:5635:1: ( ( rule__PrimaryExpr__ExprAssignment_2_3 ) )
            // InternalReactionLanguage.g:5636:2: ( rule__PrimaryExpr__ExprAssignment_2_3 )
            {
             before(grammarAccess.getPrimaryExprAccess().getExprAssignment_2_3()); 
            // InternalReactionLanguage.g:5637:2: ( rule__PrimaryExpr__ExprAssignment_2_3 )
            // InternalReactionLanguage.g:5637:3: rule__PrimaryExpr__ExprAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__ExprAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getExprAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__3__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_2__4"
    // InternalReactionLanguage.g:5645:1: rule__PrimaryExpr__Group_2__4 : rule__PrimaryExpr__Group_2__4__Impl ;
    public final void rule__PrimaryExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5649:1: ( rule__PrimaryExpr__Group_2__4__Impl )
            // InternalReactionLanguage.g:5650:2: rule__PrimaryExpr__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__4"


    // $ANTLR start "rule__PrimaryExpr__Group_2__4__Impl"
    // InternalReactionLanguage.g:5656:1: rule__PrimaryExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5660:1: ( ( ')' ) )
            // InternalReactionLanguage.g:5661:1: ( ')' )
            {
            // InternalReactionLanguage.g:5661:1: ( ')' )
            // InternalReactionLanguage.g:5662:2: ')'
            {
             before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_2_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_2__4__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_3__0"
    // InternalReactionLanguage.g:5672:1: rule__PrimaryExpr__Group_3__0 : rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1 ;
    public final void rule__PrimaryExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5676:1: ( rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1 )
            // InternalReactionLanguage.g:5677:2: rule__PrimaryExpr__Group_3__0__Impl rule__PrimaryExpr__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__0"


    // $ANTLR start "rule__PrimaryExpr__Group_3__0__Impl"
    // InternalReactionLanguage.g:5684:1: rule__PrimaryExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5688:1: ( ( () ) )
            // InternalReactionLanguage.g:5689:1: ( () )
            {
            // InternalReactionLanguage.g:5689:1: ( () )
            // InternalReactionLanguage.g:5690:2: ()
            {
             before(grammarAccess.getPrimaryExprAccess().getVarRefAction_3_0()); 
            // InternalReactionLanguage.g:5691:2: ()
            // InternalReactionLanguage.g:5691:3: 
            {
            }

             after(grammarAccess.getPrimaryExprAccess().getVarRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_3__1"
    // InternalReactionLanguage.g:5699:1: rule__PrimaryExpr__Group_3__1 : rule__PrimaryExpr__Group_3__1__Impl ;
    public final void rule__PrimaryExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5703:1: ( rule__PrimaryExpr__Group_3__1__Impl )
            // InternalReactionLanguage.g:5704:2: rule__PrimaryExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__1"


    // $ANTLR start "rule__PrimaryExpr__Group_3__1__Impl"
    // InternalReactionLanguage.g:5710:1: rule__PrimaryExpr__Group_3__1__Impl : ( ( rule__PrimaryExpr__RefAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5714:1: ( ( ( rule__PrimaryExpr__RefAssignment_3_1 ) ) )
            // InternalReactionLanguage.g:5715:1: ( ( rule__PrimaryExpr__RefAssignment_3_1 ) )
            {
            // InternalReactionLanguage.g:5715:1: ( ( rule__PrimaryExpr__RefAssignment_3_1 ) )
            // InternalReactionLanguage.g:5716:2: ( rule__PrimaryExpr__RefAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExprAccess().getRefAssignment_3_1()); 
            // InternalReactionLanguage.g:5717:2: ( rule__PrimaryExpr__RefAssignment_3_1 )
            // InternalReactionLanguage.g:5717:3: rule__PrimaryExpr__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_3__1__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__0"
    // InternalReactionLanguage.g:5726:1: rule__SignedScientificDouble__Group__0 : rule__SignedScientificDouble__Group__0__Impl rule__SignedScientificDouble__Group__1 ;
    public final void rule__SignedScientificDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5730:1: ( rule__SignedScientificDouble__Group__0__Impl rule__SignedScientificDouble__Group__1 )
            // InternalReactionLanguage.g:5731:2: rule__SignedScientificDouble__Group__0__Impl rule__SignedScientificDouble__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SignedScientificDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__0"


    // $ANTLR start "rule__SignedScientificDouble__Group__0__Impl"
    // InternalReactionLanguage.g:5738:1: rule__SignedScientificDouble__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedScientificDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5742:1: ( ( '-' ) )
            // InternalReactionLanguage.g:5743:1: ( '-' )
            {
            // InternalReactionLanguage.g:5743:1: ( '-' )
            // InternalReactionLanguage.g:5744:2: '-'
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__0__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__1"
    // InternalReactionLanguage.g:5753:1: rule__SignedScientificDouble__Group__1 : rule__SignedScientificDouble__Group__1__Impl rule__SignedScientificDouble__Group__2 ;
    public final void rule__SignedScientificDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5757:1: ( rule__SignedScientificDouble__Group__1__Impl rule__SignedScientificDouble__Group__2 )
            // InternalReactionLanguage.g:5758:2: rule__SignedScientificDouble__Group__1__Impl rule__SignedScientificDouble__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__SignedScientificDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__1"


    // $ANTLR start "rule__SignedScientificDouble__Group__1__Impl"
    // InternalReactionLanguage.g:5765:1: rule__SignedScientificDouble__Group__1__Impl : ( ( rule__SignedScientificDouble__Alternatives_1 ) ) ;
    public final void rule__SignedScientificDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5769:1: ( ( ( rule__SignedScientificDouble__Alternatives_1 ) ) )
            // InternalReactionLanguage.g:5770:1: ( ( rule__SignedScientificDouble__Alternatives_1 ) )
            {
            // InternalReactionLanguage.g:5770:1: ( ( rule__SignedScientificDouble__Alternatives_1 ) )
            // InternalReactionLanguage.g:5771:2: ( rule__SignedScientificDouble__Alternatives_1 )
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_1()); 
            // InternalReactionLanguage.g:5772:2: ( rule__SignedScientificDouble__Alternatives_1 )
            // InternalReactionLanguage.g:5772:3: rule__SignedScientificDouble__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__1__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__2"
    // InternalReactionLanguage.g:5780:1: rule__SignedScientificDouble__Group__2 : rule__SignedScientificDouble__Group__2__Impl rule__SignedScientificDouble__Group__3 ;
    public final void rule__SignedScientificDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5784:1: ( rule__SignedScientificDouble__Group__2__Impl rule__SignedScientificDouble__Group__3 )
            // InternalReactionLanguage.g:5785:2: rule__SignedScientificDouble__Group__2__Impl rule__SignedScientificDouble__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__SignedScientificDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__2"


    // $ANTLR start "rule__SignedScientificDouble__Group__2__Impl"
    // InternalReactionLanguage.g:5792:1: rule__SignedScientificDouble__Group__2__Impl : ( ( rule__SignedScientificDouble__Group_2__0 )? ) ;
    public final void rule__SignedScientificDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5796:1: ( ( ( rule__SignedScientificDouble__Group_2__0 )? ) )
            // InternalReactionLanguage.g:5797:1: ( ( rule__SignedScientificDouble__Group_2__0 )? )
            {
            // InternalReactionLanguage.g:5797:1: ( ( rule__SignedScientificDouble__Group_2__0 )? )
            // InternalReactionLanguage.g:5798:2: ( rule__SignedScientificDouble__Group_2__0 )?
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getGroup_2()); 
            // InternalReactionLanguage.g:5799:2: ( rule__SignedScientificDouble__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalReactionLanguage.g:5799:3: rule__SignedScientificDouble__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignedScientificDouble__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignedScientificDoubleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__2__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__3"
    // InternalReactionLanguage.g:5807:1: rule__SignedScientificDouble__Group__3 : rule__SignedScientificDouble__Group__3__Impl rule__SignedScientificDouble__Group__4 ;
    public final void rule__SignedScientificDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5811:1: ( rule__SignedScientificDouble__Group__3__Impl rule__SignedScientificDouble__Group__4 )
            // InternalReactionLanguage.g:5812:2: rule__SignedScientificDouble__Group__3__Impl rule__SignedScientificDouble__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__SignedScientificDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__3"


    // $ANTLR start "rule__SignedScientificDouble__Group__3__Impl"
    // InternalReactionLanguage.g:5819:1: rule__SignedScientificDouble__Group__3__Impl : ( 'E' ) ;
    public final void rule__SignedScientificDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5823:1: ( ( 'E' ) )
            // InternalReactionLanguage.g:5824:1: ( 'E' )
            {
            // InternalReactionLanguage.g:5824:1: ( 'E' )
            // InternalReactionLanguage.g:5825:2: 'E'
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getEKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSignedScientificDoubleAccess().getEKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__3__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__4"
    // InternalReactionLanguage.g:5834:1: rule__SignedScientificDouble__Group__4 : rule__SignedScientificDouble__Group__4__Impl rule__SignedScientificDouble__Group__5 ;
    public final void rule__SignedScientificDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5838:1: ( rule__SignedScientificDouble__Group__4__Impl rule__SignedScientificDouble__Group__5 )
            // InternalReactionLanguage.g:5839:2: rule__SignedScientificDouble__Group__4__Impl rule__SignedScientificDouble__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__SignedScientificDouble__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__4"


    // $ANTLR start "rule__SignedScientificDouble__Group__4__Impl"
    // InternalReactionLanguage.g:5846:1: rule__SignedScientificDouble__Group__4__Impl : ( ( rule__SignedScientificDouble__Alternatives_4 )? ) ;
    public final void rule__SignedScientificDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5850:1: ( ( ( rule__SignedScientificDouble__Alternatives_4 )? ) )
            // InternalReactionLanguage.g:5851:1: ( ( rule__SignedScientificDouble__Alternatives_4 )? )
            {
            // InternalReactionLanguage.g:5851:1: ( ( rule__SignedScientificDouble__Alternatives_4 )? )
            // InternalReactionLanguage.g:5852:2: ( rule__SignedScientificDouble__Alternatives_4 )?
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_4()); 
            // InternalReactionLanguage.g:5853:2: ( rule__SignedScientificDouble__Alternatives_4 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=14 && LA50_0<=15)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalReactionLanguage.g:5853:3: rule__SignedScientificDouble__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignedScientificDouble__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__4__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group__5"
    // InternalReactionLanguage.g:5861:1: rule__SignedScientificDouble__Group__5 : rule__SignedScientificDouble__Group__5__Impl ;
    public final void rule__SignedScientificDouble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5865:1: ( rule__SignedScientificDouble__Group__5__Impl )
            // InternalReactionLanguage.g:5866:2: rule__SignedScientificDouble__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__5"


    // $ANTLR start "rule__SignedScientificDouble__Group__5__Impl"
    // InternalReactionLanguage.g:5872:1: rule__SignedScientificDouble__Group__5__Impl : ( RULE_INT ) ;
    public final void rule__SignedScientificDouble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5876:1: ( ( RULE_INT ) )
            // InternalReactionLanguage.g:5877:1: ( RULE_INT )
            {
            // InternalReactionLanguage.g:5877:1: ( RULE_INT )
            // InternalReactionLanguage.g:5878:2: RULE_INT
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_5()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group__5__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group_2__0"
    // InternalReactionLanguage.g:5888:1: rule__SignedScientificDouble__Group_2__0 : rule__SignedScientificDouble__Group_2__0__Impl rule__SignedScientificDouble__Group_2__1 ;
    public final void rule__SignedScientificDouble__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5892:1: ( rule__SignedScientificDouble__Group_2__0__Impl rule__SignedScientificDouble__Group_2__1 )
            // InternalReactionLanguage.g:5893:2: rule__SignedScientificDouble__Group_2__0__Impl rule__SignedScientificDouble__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__SignedScientificDouble__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group_2__0"


    // $ANTLR start "rule__SignedScientificDouble__Group_2__0__Impl"
    // InternalReactionLanguage.g:5900:1: rule__SignedScientificDouble__Group_2__0__Impl : ( '.' ) ;
    public final void rule__SignedScientificDouble__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5904:1: ( ( '.' ) )
            // InternalReactionLanguage.g:5905:1: ( '.' )
            {
            // InternalReactionLanguage.g:5905:1: ( '.' )
            // InternalReactionLanguage.g:5906:2: '.'
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getFullStopKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSignedScientificDoubleAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group_2__0__Impl"


    // $ANTLR start "rule__SignedScientificDouble__Group_2__1"
    // InternalReactionLanguage.g:5915:1: rule__SignedScientificDouble__Group_2__1 : rule__SignedScientificDouble__Group_2__1__Impl ;
    public final void rule__SignedScientificDouble__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5919:1: ( rule__SignedScientificDouble__Group_2__1__Impl )
            // InternalReactionLanguage.g:5920:2: rule__SignedScientificDouble__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group_2__1"


    // $ANTLR start "rule__SignedScientificDouble__Group_2__1__Impl"
    // InternalReactionLanguage.g:5926:1: rule__SignedScientificDouble__Group_2__1__Impl : ( ( rule__SignedScientificDouble__Alternatives_2_1 ) ) ;
    public final void rule__SignedScientificDouble__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5930:1: ( ( ( rule__SignedScientificDouble__Alternatives_2_1 ) ) )
            // InternalReactionLanguage.g:5931:1: ( ( rule__SignedScientificDouble__Alternatives_2_1 ) )
            {
            // InternalReactionLanguage.g:5931:1: ( ( rule__SignedScientificDouble__Alternatives_2_1 ) )
            // InternalReactionLanguage.g:5932:2: ( rule__SignedScientificDouble__Alternatives_2_1 )
            {
             before(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_2_1()); 
            // InternalReactionLanguage.g:5933:2: ( rule__SignedScientificDouble__Alternatives_2_1 )
            // InternalReactionLanguage.g:5933:3: rule__SignedScientificDouble__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SignedScientificDouble__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedScientificDoubleAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedScientificDouble__Group_2__1__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__0"
    // InternalReactionLanguage.g:5942:1: rule__UnsignedScientificDouble__Group__0 : rule__UnsignedScientificDouble__Group__0__Impl rule__UnsignedScientificDouble__Group__1 ;
    public final void rule__UnsignedScientificDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5946:1: ( rule__UnsignedScientificDouble__Group__0__Impl rule__UnsignedScientificDouble__Group__1 )
            // InternalReactionLanguage.g:5947:2: rule__UnsignedScientificDouble__Group__0__Impl rule__UnsignedScientificDouble__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__UnsignedScientificDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__0"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__0__Impl"
    // InternalReactionLanguage.g:5954:1: rule__UnsignedScientificDouble__Group__0__Impl : ( ( rule__UnsignedScientificDouble__Alternatives_0 ) ) ;
    public final void rule__UnsignedScientificDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5958:1: ( ( ( rule__UnsignedScientificDouble__Alternatives_0 ) ) )
            // InternalReactionLanguage.g:5959:1: ( ( rule__UnsignedScientificDouble__Alternatives_0 ) )
            {
            // InternalReactionLanguage.g:5959:1: ( ( rule__UnsignedScientificDouble__Alternatives_0 ) )
            // InternalReactionLanguage.g:5960:2: ( rule__UnsignedScientificDouble__Alternatives_0 )
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_0()); 
            // InternalReactionLanguage.g:5961:2: ( rule__UnsignedScientificDouble__Alternatives_0 )
            // InternalReactionLanguage.g:5961:3: rule__UnsignedScientificDouble__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__0__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__1"
    // InternalReactionLanguage.g:5969:1: rule__UnsignedScientificDouble__Group__1 : rule__UnsignedScientificDouble__Group__1__Impl rule__UnsignedScientificDouble__Group__2 ;
    public final void rule__UnsignedScientificDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5973:1: ( rule__UnsignedScientificDouble__Group__1__Impl rule__UnsignedScientificDouble__Group__2 )
            // InternalReactionLanguage.g:5974:2: rule__UnsignedScientificDouble__Group__1__Impl rule__UnsignedScientificDouble__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__UnsignedScientificDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__1"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__1__Impl"
    // InternalReactionLanguage.g:5981:1: rule__UnsignedScientificDouble__Group__1__Impl : ( ( rule__UnsignedScientificDouble__Group_1__0 )? ) ;
    public final void rule__UnsignedScientificDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:5985:1: ( ( ( rule__UnsignedScientificDouble__Group_1__0 )? ) )
            // InternalReactionLanguage.g:5986:1: ( ( rule__UnsignedScientificDouble__Group_1__0 )? )
            {
            // InternalReactionLanguage.g:5986:1: ( ( rule__UnsignedScientificDouble__Group_1__0 )? )
            // InternalReactionLanguage.g:5987:2: ( rule__UnsignedScientificDouble__Group_1__0 )?
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getGroup_1()); 
            // InternalReactionLanguage.g:5988:2: ( rule__UnsignedScientificDouble__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalReactionLanguage.g:5988:3: rule__UnsignedScientificDouble__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnsignedScientificDouble__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnsignedScientificDoubleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__1__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__2"
    // InternalReactionLanguage.g:5996:1: rule__UnsignedScientificDouble__Group__2 : rule__UnsignedScientificDouble__Group__2__Impl rule__UnsignedScientificDouble__Group__3 ;
    public final void rule__UnsignedScientificDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6000:1: ( rule__UnsignedScientificDouble__Group__2__Impl rule__UnsignedScientificDouble__Group__3 )
            // InternalReactionLanguage.g:6001:2: rule__UnsignedScientificDouble__Group__2__Impl rule__UnsignedScientificDouble__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__UnsignedScientificDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__2"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__2__Impl"
    // InternalReactionLanguage.g:6008:1: rule__UnsignedScientificDouble__Group__2__Impl : ( 'E' ) ;
    public final void rule__UnsignedScientificDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6012:1: ( ( 'E' ) )
            // InternalReactionLanguage.g:6013:1: ( 'E' )
            {
            // InternalReactionLanguage.g:6013:1: ( 'E' )
            // InternalReactionLanguage.g:6014:2: 'E'
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getEKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUnsignedScientificDoubleAccess().getEKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__2__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__3"
    // InternalReactionLanguage.g:6023:1: rule__UnsignedScientificDouble__Group__3 : rule__UnsignedScientificDouble__Group__3__Impl rule__UnsignedScientificDouble__Group__4 ;
    public final void rule__UnsignedScientificDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6027:1: ( rule__UnsignedScientificDouble__Group__3__Impl rule__UnsignedScientificDouble__Group__4 )
            // InternalReactionLanguage.g:6028:2: rule__UnsignedScientificDouble__Group__3__Impl rule__UnsignedScientificDouble__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__UnsignedScientificDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__3"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__3__Impl"
    // InternalReactionLanguage.g:6035:1: rule__UnsignedScientificDouble__Group__3__Impl : ( ( rule__UnsignedScientificDouble__Alternatives_3 )? ) ;
    public final void rule__UnsignedScientificDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6039:1: ( ( ( rule__UnsignedScientificDouble__Alternatives_3 )? ) )
            // InternalReactionLanguage.g:6040:1: ( ( rule__UnsignedScientificDouble__Alternatives_3 )? )
            {
            // InternalReactionLanguage.g:6040:1: ( ( rule__UnsignedScientificDouble__Alternatives_3 )? )
            // InternalReactionLanguage.g:6041:2: ( rule__UnsignedScientificDouble__Alternatives_3 )?
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_3()); 
            // InternalReactionLanguage.g:6042:2: ( rule__UnsignedScientificDouble__Alternatives_3 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=14 && LA52_0<=15)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalReactionLanguage.g:6042:3: rule__UnsignedScientificDouble__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnsignedScientificDouble__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__3__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__4"
    // InternalReactionLanguage.g:6050:1: rule__UnsignedScientificDouble__Group__4 : rule__UnsignedScientificDouble__Group__4__Impl ;
    public final void rule__UnsignedScientificDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6054:1: ( rule__UnsignedScientificDouble__Group__4__Impl )
            // InternalReactionLanguage.g:6055:2: rule__UnsignedScientificDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__4"


    // $ANTLR start "rule__UnsignedScientificDouble__Group__4__Impl"
    // InternalReactionLanguage.g:6061:1: rule__UnsignedScientificDouble__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__UnsignedScientificDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6065:1: ( ( RULE_INT ) )
            // InternalReactionLanguage.g:6066:1: ( RULE_INT )
            {
            // InternalReactionLanguage.g:6066:1: ( RULE_INT )
            // InternalReactionLanguage.g:6067:2: RULE_INT
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group__4__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group_1__0"
    // InternalReactionLanguage.g:6077:1: rule__UnsignedScientificDouble__Group_1__0 : rule__UnsignedScientificDouble__Group_1__0__Impl rule__UnsignedScientificDouble__Group_1__1 ;
    public final void rule__UnsignedScientificDouble__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6081:1: ( rule__UnsignedScientificDouble__Group_1__0__Impl rule__UnsignedScientificDouble__Group_1__1 )
            // InternalReactionLanguage.g:6082:2: rule__UnsignedScientificDouble__Group_1__0__Impl rule__UnsignedScientificDouble__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__UnsignedScientificDouble__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group_1__0"


    // $ANTLR start "rule__UnsignedScientificDouble__Group_1__0__Impl"
    // InternalReactionLanguage.g:6089:1: rule__UnsignedScientificDouble__Group_1__0__Impl : ( '.' ) ;
    public final void rule__UnsignedScientificDouble__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6093:1: ( ( '.' ) )
            // InternalReactionLanguage.g:6094:1: ( '.' )
            {
            // InternalReactionLanguage.g:6094:1: ( '.' )
            // InternalReactionLanguage.g:6095:2: '.'
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUnsignedScientificDoubleAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group_1__0__Impl"


    // $ANTLR start "rule__UnsignedScientificDouble__Group_1__1"
    // InternalReactionLanguage.g:6104:1: rule__UnsignedScientificDouble__Group_1__1 : rule__UnsignedScientificDouble__Group_1__1__Impl ;
    public final void rule__UnsignedScientificDouble__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6108:1: ( rule__UnsignedScientificDouble__Group_1__1__Impl )
            // InternalReactionLanguage.g:6109:2: rule__UnsignedScientificDouble__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group_1__1"


    // $ANTLR start "rule__UnsignedScientificDouble__Group_1__1__Impl"
    // InternalReactionLanguage.g:6115:1: rule__UnsignedScientificDouble__Group_1__1__Impl : ( ( rule__UnsignedScientificDouble__Alternatives_1_1 ) ) ;
    public final void rule__UnsignedScientificDouble__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6119:1: ( ( ( rule__UnsignedScientificDouble__Alternatives_1_1 ) ) )
            // InternalReactionLanguage.g:6120:1: ( ( rule__UnsignedScientificDouble__Alternatives_1_1 ) )
            {
            // InternalReactionLanguage.g:6120:1: ( ( rule__UnsignedScientificDouble__Alternatives_1_1 ) )
            // InternalReactionLanguage.g:6121:2: ( rule__UnsignedScientificDouble__Alternatives_1_1 )
            {
             before(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_1_1()); 
            // InternalReactionLanguage.g:6122:2: ( rule__UnsignedScientificDouble__Alternatives_1_1 )
            // InternalReactionLanguage.g:6122:3: rule__UnsignedScientificDouble__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedScientificDouble__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedScientificDoubleAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedScientificDouble__Group_1__1__Impl"


    // $ANTLR start "rule__SignedInt__Group__0"
    // InternalReactionLanguage.g:6131:1: rule__SignedInt__Group__0 : rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 ;
    public final void rule__SignedInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6135:1: ( rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1 )
            // InternalReactionLanguage.g:6136:2: rule__SignedInt__Group__0__Impl rule__SignedInt__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SignedInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__0"


    // $ANTLR start "rule__SignedInt__Group__0__Impl"
    // InternalReactionLanguage.g:6143:1: rule__SignedInt__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6147:1: ( ( '-' ) )
            // InternalReactionLanguage.g:6148:1: ( '-' )
            {
            // InternalReactionLanguage.g:6148:1: ( '-' )
            // InternalReactionLanguage.g:6149:2: '-'
            {
             before(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__0__Impl"


    // $ANTLR start "rule__SignedInt__Group__1"
    // InternalReactionLanguage.g:6158:1: rule__SignedInt__Group__1 : rule__SignedInt__Group__1__Impl ;
    public final void rule__SignedInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6162:1: ( rule__SignedInt__Group__1__Impl )
            // InternalReactionLanguage.g:6163:2: rule__SignedInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__1"


    // $ANTLR start "rule__SignedInt__Group__1__Impl"
    // InternalReactionLanguage.g:6169:1: rule__SignedInt__Group__1__Impl : ( ( rule__SignedInt__Alternatives_1 ) ) ;
    public final void rule__SignedInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6173:1: ( ( ( rule__SignedInt__Alternatives_1 ) ) )
            // InternalReactionLanguage.g:6174:1: ( ( rule__SignedInt__Alternatives_1 ) )
            {
            // InternalReactionLanguage.g:6174:1: ( ( rule__SignedInt__Alternatives_1 ) )
            // InternalReactionLanguage.g:6175:2: ( rule__SignedInt__Alternatives_1 )
            {
             before(grammarAccess.getSignedIntAccess().getAlternatives_1()); 
            // InternalReactionLanguage.g:6176:2: ( rule__SignedInt__Alternatives_1 )
            // InternalReactionLanguage.g:6176:3: rule__SignedInt__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SignedInt__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInt__Group__1__Impl"


    // $ANTLR start "rule__UnsignedDouble__Group__0"
    // InternalReactionLanguage.g:6185:1: rule__UnsignedDouble__Group__0 : rule__UnsignedDouble__Group__0__Impl rule__UnsignedDouble__Group__1 ;
    public final void rule__UnsignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6189:1: ( rule__UnsignedDouble__Group__0__Impl rule__UnsignedDouble__Group__1 )
            // InternalReactionLanguage.g:6190:2: rule__UnsignedDouble__Group__0__Impl rule__UnsignedDouble__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__UnsignedDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__0"


    // $ANTLR start "rule__UnsignedDouble__Group__0__Impl"
    // InternalReactionLanguage.g:6197:1: rule__UnsignedDouble__Group__0__Impl : ( ( rule__UnsignedDouble__Alternatives_0 ) ) ;
    public final void rule__UnsignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6201:1: ( ( ( rule__UnsignedDouble__Alternatives_0 ) ) )
            // InternalReactionLanguage.g:6202:1: ( ( rule__UnsignedDouble__Alternatives_0 ) )
            {
            // InternalReactionLanguage.g:6202:1: ( ( rule__UnsignedDouble__Alternatives_0 ) )
            // InternalReactionLanguage.g:6203:2: ( rule__UnsignedDouble__Alternatives_0 )
            {
             before(grammarAccess.getUnsignedDoubleAccess().getAlternatives_0()); 
            // InternalReactionLanguage.g:6204:2: ( rule__UnsignedDouble__Alternatives_0 )
            // InternalReactionLanguage.g:6204:3: rule__UnsignedDouble__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedDoubleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__0__Impl"


    // $ANTLR start "rule__UnsignedDouble__Group__1"
    // InternalReactionLanguage.g:6212:1: rule__UnsignedDouble__Group__1 : rule__UnsignedDouble__Group__1__Impl rule__UnsignedDouble__Group__2 ;
    public final void rule__UnsignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6216:1: ( rule__UnsignedDouble__Group__1__Impl rule__UnsignedDouble__Group__2 )
            // InternalReactionLanguage.g:6217:2: rule__UnsignedDouble__Group__1__Impl rule__UnsignedDouble__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__UnsignedDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__1"


    // $ANTLR start "rule__UnsignedDouble__Group__1__Impl"
    // InternalReactionLanguage.g:6224:1: rule__UnsignedDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__UnsignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6228:1: ( ( '.' ) )
            // InternalReactionLanguage.g:6229:1: ( '.' )
            {
            // InternalReactionLanguage.g:6229:1: ( '.' )
            // InternalReactionLanguage.g:6230:2: '.'
            {
             before(grammarAccess.getUnsignedDoubleAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUnsignedDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__1__Impl"


    // $ANTLR start "rule__UnsignedDouble__Group__2"
    // InternalReactionLanguage.g:6239:1: rule__UnsignedDouble__Group__2 : rule__UnsignedDouble__Group__2__Impl ;
    public final void rule__UnsignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6243:1: ( rule__UnsignedDouble__Group__2__Impl )
            // InternalReactionLanguage.g:6244:2: rule__UnsignedDouble__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__2"


    // $ANTLR start "rule__UnsignedDouble__Group__2__Impl"
    // InternalReactionLanguage.g:6250:1: rule__UnsignedDouble__Group__2__Impl : ( ( rule__UnsignedDouble__Alternatives_2 ) ) ;
    public final void rule__UnsignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6254:1: ( ( ( rule__UnsignedDouble__Alternatives_2 ) ) )
            // InternalReactionLanguage.g:6255:1: ( ( rule__UnsignedDouble__Alternatives_2 ) )
            {
            // InternalReactionLanguage.g:6255:1: ( ( rule__UnsignedDouble__Alternatives_2 ) )
            // InternalReactionLanguage.g:6256:2: ( rule__UnsignedDouble__Alternatives_2 )
            {
             before(grammarAccess.getUnsignedDoubleAccess().getAlternatives_2()); 
            // InternalReactionLanguage.g:6257:2: ( rule__UnsignedDouble__Alternatives_2 )
            // InternalReactionLanguage.g:6257:3: rule__UnsignedDouble__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__UnsignedDouble__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getUnsignedDoubleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnsignedDouble__Group__2__Impl"


    // $ANTLR start "rule__SignedDouble__Group__0"
    // InternalReactionLanguage.g:6266:1: rule__SignedDouble__Group__0 : rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 ;
    public final void rule__SignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6270:1: ( rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 )
            // InternalReactionLanguage.g:6271:2: rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SignedDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__0"


    // $ANTLR start "rule__SignedDouble__Group__0__Impl"
    // InternalReactionLanguage.g:6278:1: rule__SignedDouble__Group__0__Impl : ( '-' ) ;
    public final void rule__SignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6282:1: ( ( '-' ) )
            // InternalReactionLanguage.g:6283:1: ( '-' )
            {
            // InternalReactionLanguage.g:6283:1: ( '-' )
            // InternalReactionLanguage.g:6284:2: '-'
            {
             before(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__0__Impl"


    // $ANTLR start "rule__SignedDouble__Group__1"
    // InternalReactionLanguage.g:6293:1: rule__SignedDouble__Group__1 : rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 ;
    public final void rule__SignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6297:1: ( rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 )
            // InternalReactionLanguage.g:6298:2: rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__SignedDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__1"


    // $ANTLR start "rule__SignedDouble__Group__1__Impl"
    // InternalReactionLanguage.g:6305:1: rule__SignedDouble__Group__1__Impl : ( ( rule__SignedDouble__Alternatives_1 ) ) ;
    public final void rule__SignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6309:1: ( ( ( rule__SignedDouble__Alternatives_1 ) ) )
            // InternalReactionLanguage.g:6310:1: ( ( rule__SignedDouble__Alternatives_1 ) )
            {
            // InternalReactionLanguage.g:6310:1: ( ( rule__SignedDouble__Alternatives_1 ) )
            // InternalReactionLanguage.g:6311:2: ( rule__SignedDouble__Alternatives_1 )
            {
             before(grammarAccess.getSignedDoubleAccess().getAlternatives_1()); 
            // InternalReactionLanguage.g:6312:2: ( rule__SignedDouble__Alternatives_1 )
            // InternalReactionLanguage.g:6312:3: rule__SignedDouble__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SignedDouble__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedDoubleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__1__Impl"


    // $ANTLR start "rule__SignedDouble__Group__2"
    // InternalReactionLanguage.g:6320:1: rule__SignedDouble__Group__2 : rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 ;
    public final void rule__SignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6324:1: ( rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 )
            // InternalReactionLanguage.g:6325:2: rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SignedDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__2"


    // $ANTLR start "rule__SignedDouble__Group__2__Impl"
    // InternalReactionLanguage.g:6332:1: rule__SignedDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__SignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6336:1: ( ( '.' ) )
            // InternalReactionLanguage.g:6337:1: ( '.' )
            {
            // InternalReactionLanguage.g:6337:1: ( '.' )
            // InternalReactionLanguage.g:6338:2: '.'
            {
             before(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__2__Impl"


    // $ANTLR start "rule__SignedDouble__Group__3"
    // InternalReactionLanguage.g:6347:1: rule__SignedDouble__Group__3 : rule__SignedDouble__Group__3__Impl ;
    public final void rule__SignedDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6351:1: ( rule__SignedDouble__Group__3__Impl )
            // InternalReactionLanguage.g:6352:2: rule__SignedDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedDouble__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__3"


    // $ANTLR start "rule__SignedDouble__Group__3__Impl"
    // InternalReactionLanguage.g:6358:1: rule__SignedDouble__Group__3__Impl : ( ( rule__SignedDouble__Alternatives_3 ) ) ;
    public final void rule__SignedDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6362:1: ( ( ( rule__SignedDouble__Alternatives_3 ) ) )
            // InternalReactionLanguage.g:6363:1: ( ( rule__SignedDouble__Alternatives_3 ) )
            {
            // InternalReactionLanguage.g:6363:1: ( ( rule__SignedDouble__Alternatives_3 ) )
            // InternalReactionLanguage.g:6364:2: ( rule__SignedDouble__Alternatives_3 )
            {
             before(grammarAccess.getSignedDoubleAccess().getAlternatives_3()); 
            // InternalReactionLanguage.g:6365:2: ( rule__SignedDouble__Alternatives_3 )
            // InternalReactionLanguage.g:6365:3: rule__SignedDouble__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__SignedDouble__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSignedDoubleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedDouble__Group__3__Impl"


    // $ANTLR start "rule__ReactionModel__ElementsAssignment_0"
    // InternalReactionLanguage.g:6374:1: rule__ReactionModel__ElementsAssignment_0 : ( ruleComponent ) ;
    public final void rule__ReactionModel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6378:1: ( ( ruleComponent ) )
            // InternalReactionLanguage.g:6379:2: ( ruleComponent )
            {
            // InternalReactionLanguage.g:6379:2: ( ruleComponent )
            // InternalReactionLanguage.g:6380:3: ruleComponent
            {
             before(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__ElementsAssignment_0"


    // $ANTLR start "rule__ReactionModel__ElementsAssignment_2_1"
    // InternalReactionLanguage.g:6389:1: rule__ReactionModel__ElementsAssignment_2_1 : ( ruleComponent ) ;
    public final void rule__ReactionModel__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6393:1: ( ( ruleComponent ) )
            // InternalReactionLanguage.g:6394:2: ( ruleComponent )
            {
            // InternalReactionLanguage.g:6394:2: ( ruleComponent )
            // InternalReactionLanguage.g:6395:3: ruleComponent
            {
             before(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactionModel__ElementsAssignment_2_1"


    // $ANTLR start "rule__Agent__NameAssignment_0"
    // InternalReactionLanguage.g:6404:1: rule__Agent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6408:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6409:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:6409:2: ( RULE_ID )
            // InternalReactionLanguage.g:6410:3: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__NameAssignment_0"


    // $ANTLR start "rule__Agent__SitesAssignment_1_1"
    // InternalReactionLanguage.g:6419:1: rule__Agent__SitesAssignment_1_1 : ( ruleSite ) ;
    public final void rule__Agent__SitesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6423:1: ( ( ruleSite ) )
            // InternalReactionLanguage.g:6424:2: ( ruleSite )
            {
            // InternalReactionLanguage.g:6424:2: ( ruleSite )
            // InternalReactionLanguage.g:6425:3: ruleSite
            {
             before(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__SitesAssignment_1_1"


    // $ANTLR start "rule__Agent__SitesAssignment_1_2_1"
    // InternalReactionLanguage.g:6434:1: rule__Agent__SitesAssignment_1_2_1 : ( ruleSite ) ;
    public final void rule__Agent__SitesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6438:1: ( ( ruleSite ) )
            // InternalReactionLanguage.g:6439:2: ( ruleSite )
            {
            // InternalReactionLanguage.g:6439:2: ( ruleSite )
            // InternalReactionLanguage.g:6440:3: ruleSite
            {
             before(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__SitesAssignment_1_2_1"


    // $ANTLR start "rule__AgentDeclaration__DeclaredAgentsAssignment_1"
    // InternalReactionLanguage.g:6449:1: rule__AgentDeclaration__DeclaredAgentsAssignment_1 : ( ruleAgent ) ;
    public final void rule__AgentDeclaration__DeclaredAgentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6453:1: ( ( ruleAgent ) )
            // InternalReactionLanguage.g:6454:2: ( ruleAgent )
            {
            // InternalReactionLanguage.g:6454:2: ( ruleAgent )
            // InternalReactionLanguage.g:6455:3: ruleAgent
            {
             before(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__DeclaredAgentsAssignment_1"


    // $ANTLR start "rule__AgentDeclaration__DeclaredAgentsAssignment_2_1"
    // InternalReactionLanguage.g:6464:1: rule__AgentDeclaration__DeclaredAgentsAssignment_2_1 : ( ruleAgent ) ;
    public final void rule__AgentDeclaration__DeclaredAgentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6468:1: ( ( ruleAgent ) )
            // InternalReactionLanguage.g:6469:2: ( ruleAgent )
            {
            // InternalReactionLanguage.g:6469:2: ( ruleAgent )
            // InternalReactionLanguage.g:6470:3: ruleAgent
            {
             before(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentDeclaration__DeclaredAgentsAssignment_2_1"


    // $ANTLR start "rule__AgentInstance__NameAssignment_0"
    // InternalReactionLanguage.g:6479:1: rule__AgentInstance__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AgentInstance__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6483:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6484:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:6484:2: ( RULE_ID )
            // InternalReactionLanguage.g:6485:3: RULE_ID
            {
             before(grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__NameAssignment_0"


    // $ANTLR start "rule__AgentInstance__InstanceOfAssignment_2"
    // InternalReactionLanguage.g:6494:1: rule__AgentInstance__InstanceOfAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AgentInstance__InstanceOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6498:1: ( ( ( RULE_ID ) ) )
            // InternalReactionLanguage.g:6499:2: ( ( RULE_ID ) )
            {
            // InternalReactionLanguage.g:6499:2: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6500:3: ( RULE_ID )
            {
             before(grammarAccess.getAgentInstanceAccess().getInstanceOfAgentCrossReference_2_0()); 
            // InternalReactionLanguage.g:6501:3: ( RULE_ID )
            // InternalReactionLanguage.g:6502:4: RULE_ID
            {
             before(grammarAccess.getAgentInstanceAccess().getInstanceOfAgentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getInstanceOfAgentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAgentInstanceAccess().getInstanceOfAgentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__InstanceOfAssignment_2"


    // $ANTLR start "rule__AgentInstance__ArrayAssignment_3_0"
    // InternalReactionLanguage.g:6513:1: rule__AgentInstance__ArrayAssignment_3_0 : ( ( '[' ) ) ;
    public final void rule__AgentInstance__ArrayAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6517:1: ( ( ( '[' ) ) )
            // InternalReactionLanguage.g:6518:2: ( ( '[' ) )
            {
            // InternalReactionLanguage.g:6518:2: ( ( '[' ) )
            // InternalReactionLanguage.g:6519:3: ( '[' )
            {
             before(grammarAccess.getAgentInstanceAccess().getArrayLeftSquareBracketKeyword_3_0_0()); 
            // InternalReactionLanguage.g:6520:3: ( '[' )
            // InternalReactionLanguage.g:6521:4: '['
            {
             before(grammarAccess.getAgentInstanceAccess().getArrayLeftSquareBracketKeyword_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getArrayLeftSquareBracketKeyword_3_0_0()); 

            }

             after(grammarAccess.getAgentInstanceAccess().getArrayLeftSquareBracketKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__ArrayAssignment_3_0"


    // $ANTLR start "rule__AgentInstance__SizeAssignment_3_1"
    // InternalReactionLanguage.g:6532:1: rule__AgentInstance__SizeAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AgentInstance__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6536:1: ( ( RULE_INT ) )
            // InternalReactionLanguage.g:6537:2: ( RULE_INT )
            {
            // InternalReactionLanguage.g:6537:2: ( RULE_INT )
            // InternalReactionLanguage.g:6538:3: RULE_INT
            {
             before(grammarAccess.getAgentInstanceAccess().getSizeINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAgentInstanceAccess().getSizeINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentInstance__SizeAssignment_3_1"


    // $ANTLR start "rule__Site__NameAssignment_0"
    // InternalReactionLanguage.g:6547:1: rule__Site__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Site__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6551:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6552:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:6552:2: ( RULE_ID )
            // InternalReactionLanguage.g:6553:3: RULE_ID
            {
             before(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__NameAssignment_0"


    // $ANTLR start "rule__Site__StatesAssignment_1_1"
    // InternalReactionLanguage.g:6562:1: rule__Site__StatesAssignment_1_1 : ( ruleSiteState ) ;
    public final void rule__Site__StatesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6566:1: ( ( ruleSiteState ) )
            // InternalReactionLanguage.g:6567:2: ( ruleSiteState )
            {
            // InternalReactionLanguage.g:6567:2: ( ruleSiteState )
            // InternalReactionLanguage.g:6568:3: ruleSiteState
            {
             before(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__StatesAssignment_1_1"


    // $ANTLR start "rule__Site__StatesAssignment_1_2_1"
    // InternalReactionLanguage.g:6577:1: rule__Site__StatesAssignment_1_2_1 : ( ruleSiteState ) ;
    public final void rule__Site__StatesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6581:1: ( ( ruleSiteState ) )
            // InternalReactionLanguage.g:6582:2: ( ruleSiteState )
            {
            // InternalReactionLanguage.g:6582:2: ( ruleSiteState )
            // InternalReactionLanguage.g:6583:3: ruleSiteState
            {
             before(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteState();

            state._fsp--;

             after(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__StatesAssignment_1_2_1"


    // $ANTLR start "rule__SiteState__NameAssignment"
    // InternalReactionLanguage.g:6592:1: rule__SiteState__NameAssignment : ( RULE_ID ) ;
    public final void rule__SiteState__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6596:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6597:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:6597:2: ( RULE_ID )
            // InternalReactionLanguage.g:6598:3: RULE_ID
            {
             before(grammarAccess.getSiteStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteState__NameAssignment"


    // $ANTLR start "rule__Complex__SignatureAssignment_1"
    // InternalReactionLanguage.g:6607:1: rule__Complex__SignatureAssignment_1 : ( ruleSignature ) ;
    public final void rule__Complex__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6611:1: ( ( ruleSignature ) )
            // InternalReactionLanguage.g:6612:2: ( ruleSignature )
            {
            // InternalReactionLanguage.g:6612:2: ( ruleSignature )
            // InternalReactionLanguage.g:6613:3: ruleSignature
            {
             before(grammarAccess.getComplexAccess().getSignatureSignatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getSignatureSignatureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__SignatureAssignment_1"


    // $ANTLR start "rule__Complex__ElementsAssignment_3"
    // InternalReactionLanguage.g:6622:1: rule__Complex__ElementsAssignment_3 : ( ruleComplexElement ) ;
    public final void rule__Complex__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6626:1: ( ( ruleComplexElement ) )
            // InternalReactionLanguage.g:6627:2: ( ruleComplexElement )
            {
            // InternalReactionLanguage.g:6627:2: ( ruleComplexElement )
            // InternalReactionLanguage.g:6628:3: ruleComplexElement
            {
             before(grammarAccess.getComplexAccess().getElementsComplexElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexElement();

            state._fsp--;

             after(grammarAccess.getComplexAccess().getElementsComplexElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complex__ElementsAssignment_3"


    // $ANTLR start "rule__Signature__InstancesAssignment_1"
    // InternalReactionLanguage.g:6637:1: rule__Signature__InstancesAssignment_1 : ( ruleAgentInstance ) ;
    public final void rule__Signature__InstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6641:1: ( ( ruleAgentInstance ) )
            // InternalReactionLanguage.g:6642:2: ( ruleAgentInstance )
            {
            // InternalReactionLanguage.g:6642:2: ( ruleAgentInstance )
            // InternalReactionLanguage.g:6643:3: ruleAgentInstance
            {
             before(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentInstance();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__InstancesAssignment_1"


    // $ANTLR start "rule__Signature__InstancesAssignment_2_1"
    // InternalReactionLanguage.g:6652:1: rule__Signature__InstancesAssignment_2_1 : ( ruleAgentInstance ) ;
    public final void rule__Signature__InstancesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6656:1: ( ( ruleAgentInstance ) )
            // InternalReactionLanguage.g:6657:2: ( ruleAgentInstance )
            {
            // InternalReactionLanguage.g:6657:2: ( ruleAgentInstance )
            // InternalReactionLanguage.g:6658:3: ruleAgentInstance
            {
             before(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAgentInstance();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__InstancesAssignment_2_1"


    // $ANTLR start "rule__Rule__HeadAssignment_1"
    // InternalReactionLanguage.g:6667:1: rule__Rule__HeadAssignment_1 : ( ruleRuleHead ) ;
    public final void rule__Rule__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6671:1: ( ( ruleRuleHead ) )
            // InternalReactionLanguage.g:6672:2: ( ruleRuleHead )
            {
            // InternalReactionLanguage.g:6672:2: ( ruleRuleHead )
            // InternalReactionLanguage.g:6673:3: ruleRuleHead
            {
             before(grammarAccess.getRuleAccess().getHeadRuleHeadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getHeadRuleHeadParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__HeadAssignment_1"


    // $ANTLR start "rule__Rule__BodyAssignment_2"
    // InternalReactionLanguage.g:6682:1: rule__Rule__BodyAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__Rule__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6686:1: ( ( ruleRuleBody ) )
            // InternalReactionLanguage.g:6687:2: ( ruleRuleBody )
            {
            // InternalReactionLanguage.g:6687:2: ( ruleRuleBody )
            // InternalReactionLanguage.g:6688:3: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BodyAssignment_2"


    // $ANTLR start "rule__RuleHead__NameAssignment_0"
    // InternalReactionLanguage.g:6697:1: rule__RuleHead__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RuleHead__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6701:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6702:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:6702:2: ( RULE_ID )
            // InternalReactionLanguage.g:6703:3: RULE_ID
            {
             before(grammarAccess.getRuleHeadAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleHeadAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__NameAssignment_0"


    // $ANTLR start "rule__RuleHead__SignatureAssignment_1"
    // InternalReactionLanguage.g:6712:1: rule__RuleHead__SignatureAssignment_1 : ( ruleSignature ) ;
    public final void rule__RuleHead__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6716:1: ( ( ruleSignature ) )
            // InternalReactionLanguage.g:6717:2: ( ruleSignature )
            {
            // InternalReactionLanguage.g:6717:2: ( ruleSignature )
            // InternalReactionLanguage.g:6718:3: ruleSignature
            {
             before(grammarAccess.getRuleHeadAccess().getSignatureSignatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getRuleHeadAccess().getSignatureSignatureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__SignatureAssignment_1"


    // $ANTLR start "rule__RuleBody__LhsAssignment_0"
    // InternalReactionLanguage.g:6727:1: rule__RuleBody__LhsAssignment_0 : ( rulePattern ) ;
    public final void rule__RuleBody__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6731:1: ( ( rulePattern ) )
            // InternalReactionLanguage.g:6732:2: ( rulePattern )
            {
            // InternalReactionLanguage.g:6732:2: ( rulePattern )
            // InternalReactionLanguage.g:6733:3: rulePattern
            {
             before(grammarAccess.getRuleBodyAccess().getLhsPatternParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getLhsPatternParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__LhsAssignment_0"


    // $ANTLR start "rule__RuleBody__RuleTypeAssignment_1"
    // InternalReactionLanguage.g:6742:1: rule__RuleBody__RuleTypeAssignment_1 : ( ruleRuleType ) ;
    public final void rule__RuleBody__RuleTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6746:1: ( ( ruleRuleType ) )
            // InternalReactionLanguage.g:6747:2: ( ruleRuleType )
            {
            // InternalReactionLanguage.g:6747:2: ( ruleRuleType )
            // InternalReactionLanguage.g:6748:3: ruleRuleType
            {
             before(grammarAccess.getRuleBodyAccess().getRuleTypeRuleTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleType();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getRuleTypeRuleTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__RuleTypeAssignment_1"


    // $ANTLR start "rule__RuleBody__RhsAssignment_2"
    // InternalReactionLanguage.g:6757:1: rule__RuleBody__RhsAssignment_2 : ( rulePattern ) ;
    public final void rule__RuleBody__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6761:1: ( ( rulePattern ) )
            // InternalReactionLanguage.g:6762:2: ( rulePattern )
            {
            // InternalReactionLanguage.g:6762:2: ( rulePattern )
            // InternalReactionLanguage.g:6763:3: rulePattern
            {
             before(grammarAccess.getRuleBodyAccess().getRhsPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getRhsPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__RhsAssignment_2"


    // $ANTLR start "rule__RuleBody__RatesAssignment_3"
    // InternalReactionLanguage.g:6772:1: rule__RuleBody__RatesAssignment_3 : ( ruleRates ) ;
    public final void rule__RuleBody__RatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6776:1: ( ( ruleRates ) )
            // InternalReactionLanguage.g:6777:2: ( ruleRates )
            {
            // InternalReactionLanguage.g:6777:2: ( ruleRates )
            // InternalReactionLanguage.g:6778:3: ruleRates
            {
             before(grammarAccess.getRuleBodyAccess().getRatesRatesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRates();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getRatesRatesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__RatesAssignment_3"


    // $ANTLR start "rule__Rates__RateForwardAssignment_1"
    // InternalReactionLanguage.g:6787:1: rule__Rates__RateForwardAssignment_1 : ( ruleArithmeticExpr ) ;
    public final void rule__Rates__RateForwardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6791:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:6792:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:6792:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:6793:3: ruleArithmeticExpr
            {
             before(grammarAccess.getRatesAccess().getRateForwardArithmeticExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getRatesAccess().getRateForwardArithmeticExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__RateForwardAssignment_1"


    // $ANTLR start "rule__Rates__RateBackwardSetAssignment_2_0"
    // InternalReactionLanguage.g:6802:1: rule__Rates__RateBackwardSetAssignment_2_0 : ( ( ',' ) ) ;
    public final void rule__Rates__RateBackwardSetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6806:1: ( ( ( ',' ) ) )
            // InternalReactionLanguage.g:6807:2: ( ( ',' ) )
            {
            // InternalReactionLanguage.g:6807:2: ( ( ',' ) )
            // InternalReactionLanguage.g:6808:3: ( ',' )
            {
             before(grammarAccess.getRatesAccess().getRateBackwardSetCommaKeyword_2_0_0()); 
            // InternalReactionLanguage.g:6809:3: ( ',' )
            // InternalReactionLanguage.g:6810:4: ','
            {
             before(grammarAccess.getRatesAccess().getRateBackwardSetCommaKeyword_2_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRatesAccess().getRateBackwardSetCommaKeyword_2_0_0()); 

            }

             after(grammarAccess.getRatesAccess().getRateBackwardSetCommaKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__RateBackwardSetAssignment_2_0"


    // $ANTLR start "rule__Rates__RateBackwardAssignment_2_1"
    // InternalReactionLanguage.g:6821:1: rule__Rates__RateBackwardAssignment_2_1 : ( ruleArithmeticExpr ) ;
    public final void rule__Rates__RateBackwardAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6825:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:6826:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:6826:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:6827:3: ruleArithmeticExpr
            {
             before(grammarAccess.getRatesAccess().getRateBackwardArithmeticExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getRatesAccess().getRateBackwardArithmeticExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rates__RateBackwardAssignment_2_1"


    // $ANTLR start "rule__Bonds__BondsAssignment_0"
    // InternalReactionLanguage.g:6836:1: rule__Bonds__BondsAssignment_0 : ( ruleBond ) ;
    public final void rule__Bonds__BondsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6840:1: ( ( ruleBond ) )
            // InternalReactionLanguage.g:6841:2: ( ruleBond )
            {
            // InternalReactionLanguage.g:6841:2: ( ruleBond )
            // InternalReactionLanguage.g:6842:3: ruleBond
            {
             before(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBond();

            state._fsp--;

             after(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__BondsAssignment_0"


    // $ANTLR start "rule__Bonds__BondsAssignment_1_1"
    // InternalReactionLanguage.g:6851:1: rule__Bonds__BondsAssignment_1_1 : ( ruleBond ) ;
    public final void rule__Bonds__BondsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6855:1: ( ( ruleBond ) )
            // InternalReactionLanguage.g:6856:2: ( ruleBond )
            {
            // InternalReactionLanguage.g:6856:2: ( ruleBond )
            // InternalReactionLanguage.g:6857:3: ruleBond
            {
             before(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBond();

            state._fsp--;

             after(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bonds__BondsAssignment_1_1"


    // $ANTLR start "rule__Bond__LeftAssignment_0"
    // InternalReactionLanguage.g:6866:1: rule__Bond__LeftAssignment_0 : ( ruleBondSide ) ;
    public final void rule__Bond__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6870:1: ( ( ruleBondSide ) )
            // InternalReactionLanguage.g:6871:2: ( ruleBondSide )
            {
            // InternalReactionLanguage.g:6871:2: ( ruleBondSide )
            // InternalReactionLanguage.g:6872:3: ruleBondSide
            {
             before(grammarAccess.getBondAccess().getLeftBondSideParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBondSide();

            state._fsp--;

             after(grammarAccess.getBondAccess().getLeftBondSideParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__LeftAssignment_0"


    // $ANTLR start "rule__Bond__BondTypeAssignment_1_0"
    // InternalReactionLanguage.g:6881:1: rule__Bond__BondTypeAssignment_1_0 : ( ruleBondType ) ;
    public final void rule__Bond__BondTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6885:1: ( ( ruleBondType ) )
            // InternalReactionLanguage.g:6886:2: ( ruleBondType )
            {
            // InternalReactionLanguage.g:6886:2: ( ruleBondType )
            // InternalReactionLanguage.g:6887:3: ruleBondType
            {
             before(grammarAccess.getBondAccess().getBondTypeBondTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBondType();

            state._fsp--;

             after(grammarAccess.getBondAccess().getBondTypeBondTypeEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__BondTypeAssignment_1_0"


    // $ANTLR start "rule__Bond__RightAssignment_1_1"
    // InternalReactionLanguage.g:6896:1: rule__Bond__RightAssignment_1_1 : ( ruleBondSideOrWildcard ) ;
    public final void rule__Bond__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6900:1: ( ( ruleBondSideOrWildcard ) )
            // InternalReactionLanguage.g:6901:2: ( ruleBondSideOrWildcard )
            {
            // InternalReactionLanguage.g:6901:2: ( ruleBondSideOrWildcard )
            // InternalReactionLanguage.g:6902:3: ruleBondSideOrWildcard
            {
             before(grammarAccess.getBondAccess().getRightBondSideOrWildcardParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBondSideOrWildcard();

            state._fsp--;

             after(grammarAccess.getBondAccess().getRightBondSideOrWildcardParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bond__RightAssignment_1_1"


    // $ANTLR start "rule__BondSideOrWildcard__WildcardAssignment_1"
    // InternalReactionLanguage.g:6911:1: rule__BondSideOrWildcard__WildcardAssignment_1 : ( ruleWildcard ) ;
    public final void rule__BondSideOrWildcard__WildcardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6915:1: ( ( ruleWildcard ) )
            // InternalReactionLanguage.g:6916:2: ( ruleWildcard )
            {
            // InternalReactionLanguage.g:6916:2: ( ruleWildcard )
            // InternalReactionLanguage.g:6917:3: ruleWildcard
            {
             before(grammarAccess.getBondSideOrWildcardAccess().getWildcardWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getBondSideOrWildcardAccess().getWildcardWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSideOrWildcard__WildcardAssignment_1"


    // $ANTLR start "rule__Wildcard__AnythingAssignment_0"
    // InternalReactionLanguage.g:6926:1: rule__Wildcard__AnythingAssignment_0 : ( RULE_ANYTHING ) ;
    public final void rule__Wildcard__AnythingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6930:1: ( ( RULE_ANYTHING ) )
            // InternalReactionLanguage.g:6931:2: ( RULE_ANYTHING )
            {
            // InternalReactionLanguage.g:6931:2: ( RULE_ANYTHING )
            // InternalReactionLanguage.g:6932:3: RULE_ANYTHING
            {
             before(grammarAccess.getWildcardAccess().getAnythingANYTHINGTerminalRuleCall_0_0()); 
            match(input,RULE_ANYTHING,FOLLOW_2); 
             after(grammarAccess.getWildcardAccess().getAnythingANYTHINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__AnythingAssignment_0"


    // $ANTLR start "rule__Wildcard__NothingAssignment_1"
    // InternalReactionLanguage.g:6941:1: rule__Wildcard__NothingAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Wildcard__NothingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6945:1: ( ( RULE_NULL ) )
            // InternalReactionLanguage.g:6946:2: ( RULE_NULL )
            {
            // InternalReactionLanguage.g:6946:2: ( RULE_NULL )
            // InternalReactionLanguage.g:6947:3: RULE_NULL
            {
             before(grammarAccess.getWildcardAccess().getNothingNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_2); 
             after(grammarAccess.getWildcardAccess().getNothingNULLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__NothingAssignment_1"


    // $ANTLR start "rule__BondSide__AbstractAgentAssignment_0"
    // InternalReactionLanguage.g:6956:1: rule__BondSide__AbstractAgentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BondSide__AbstractAgentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6960:1: ( ( ( RULE_ID ) ) )
            // InternalReactionLanguage.g:6961:2: ( ( RULE_ID ) )
            {
            // InternalReactionLanguage.g:6961:2: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:6962:3: ( RULE_ID )
            {
             before(grammarAccess.getBondSideAccess().getAbstractAgentAbstractAgentCrossReference_0_0()); 
            // InternalReactionLanguage.g:6963:3: ( RULE_ID )
            // InternalReactionLanguage.g:6964:4: RULE_ID
            {
             before(grammarAccess.getBondSideAccess().getAbstractAgentAbstractAgentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBondSideAccess().getAbstractAgentAbstractAgentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBondSideAccess().getAbstractAgentAbstractAgentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__AbstractAgentAssignment_0"


    // $ANTLR start "rule__BondSide__ArrayAssignment_1_0"
    // InternalReactionLanguage.g:6975:1: rule__BondSide__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__BondSide__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6979:1: ( ( ( '[' ) ) )
            // InternalReactionLanguage.g:6980:2: ( ( '[' ) )
            {
            // InternalReactionLanguage.g:6980:2: ( ( '[' ) )
            // InternalReactionLanguage.g:6981:3: ( '[' )
            {
             before(grammarAccess.getBondSideAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalReactionLanguage.g:6982:3: ( '[' )
            // InternalReactionLanguage.g:6983:4: '['
            {
             before(grammarAccess.getBondSideAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBondSideAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getBondSideAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__ArrayAssignment_1_0"


    // $ANTLR start "rule__BondSide__IndexAssignment_1_1"
    // InternalReactionLanguage.g:6994:1: rule__BondSide__IndexAssignment_1_1 : ( ruleUnsignedInt ) ;
    public final void rule__BondSide__IndexAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:6998:1: ( ( ruleUnsignedInt ) )
            // InternalReactionLanguage.g:6999:2: ( ruleUnsignedInt )
            {
            // InternalReactionLanguage.g:6999:2: ( ruleUnsignedInt )
            // InternalReactionLanguage.g:7000:3: ruleUnsignedInt
            {
             before(grammarAccess.getBondSideAccess().getIndexUnsignedIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnsignedInt();

            state._fsp--;

             after(grammarAccess.getBondSideAccess().getIndexUnsignedIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__IndexAssignment_1_1"


    // $ANTLR start "rule__BondSide__SiteInstanceAssignment_2_1"
    // InternalReactionLanguage.g:7009:1: rule__BondSide__SiteInstanceAssignment_2_1 : ( ruleSiteInstance ) ;
    public final void rule__BondSide__SiteInstanceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7013:1: ( ( ruleSiteInstance ) )
            // InternalReactionLanguage.g:7014:2: ( ruleSiteInstance )
            {
            // InternalReactionLanguage.g:7014:2: ( ruleSiteInstance )
            // InternalReactionLanguage.g:7015:3: ruleSiteInstance
            {
             before(grammarAccess.getBondSideAccess().getSiteInstanceSiteInstanceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteInstance();

            state._fsp--;

             after(grammarAccess.getBondSideAccess().getSiteInstanceSiteInstanceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BondSide__SiteInstanceAssignment_2_1"


    // $ANTLR start "rule__SiteInstance__SiteAssignment_0"
    // InternalReactionLanguage.g:7024:1: rule__SiteInstance__SiteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SiteInstance__SiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7028:1: ( ( ( RULE_ID ) ) )
            // InternalReactionLanguage.g:7029:2: ( ( RULE_ID ) )
            {
            // InternalReactionLanguage.g:7029:2: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:7030:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteInstanceAccess().getSiteSiteCrossReference_0_0()); 
            // InternalReactionLanguage.g:7031:3: ( RULE_ID )
            // InternalReactionLanguage.g:7032:4: RULE_ID
            {
             before(grammarAccess.getSiteInstanceAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteInstanceAccess().getSiteSiteIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSiteInstanceAccess().getSiteSiteCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__SiteAssignment_0"


    // $ANTLR start "rule__SiteInstance__SiteStateAssignment_1"
    // InternalReactionLanguage.g:7043:1: rule__SiteInstance__SiteStateAssignment_1 : ( ruleSiteInstanceState ) ;
    public final void rule__SiteInstance__SiteStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7047:1: ( ( ruleSiteInstanceState ) )
            // InternalReactionLanguage.g:7048:2: ( ruleSiteInstanceState )
            {
            // InternalReactionLanguage.g:7048:2: ( ruleSiteInstanceState )
            // InternalReactionLanguage.g:7049:3: ruleSiteInstanceState
            {
             before(grammarAccess.getSiteInstanceAccess().getSiteStateSiteInstanceStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSiteInstanceState();

            state._fsp--;

             after(grammarAccess.getSiteInstanceAccess().getSiteStateSiteInstanceStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstance__SiteStateAssignment_1"


    // $ANTLR start "rule__SiteInstanceState__StateAssignment_1"
    // InternalReactionLanguage.g:7058:1: rule__SiteInstanceState__StateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SiteInstanceState__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7062:1: ( ( ( RULE_ID ) ) )
            // InternalReactionLanguage.g:7063:2: ( ( RULE_ID ) )
            {
            // InternalReactionLanguage.g:7063:2: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:7064:3: ( RULE_ID )
            {
             before(grammarAccess.getSiteInstanceStateAccess().getStateSiteStateCrossReference_1_0()); 
            // InternalReactionLanguage.g:7065:3: ( RULE_ID )
            // InternalReactionLanguage.g:7066:4: RULE_ID
            {
             before(grammarAccess.getSiteInstanceStateAccess().getStateSiteStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSiteInstanceStateAccess().getStateSiteStateIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSiteInstanceStateAccess().getStateSiteStateCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SiteInstanceState__StateAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalReactionLanguage.g:7077:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7081:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:7082:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:7082:2: ( RULE_ID )
            // InternalReactionLanguage.g:7083:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3"
    // InternalReactionLanguage.g:7092:1: rule__Variable__ValueAssignment_3 : ( ruleArithmeticExpr ) ;
    public final void rule__Variable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7096:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7097:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7097:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7098:3: ruleArithmeticExpr
            {
             before(grammarAccess.getVariableAccess().getValueArithmeticExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueArithmeticExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_3"


    // $ANTLR start "rule__Initialisation__HeadAssignment_0"
    // InternalReactionLanguage.g:7107:1: rule__Initialisation__HeadAssignment_0 : ( ruleInitialisationHead ) ;
    public final void rule__Initialisation__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7111:1: ( ( ruleInitialisationHead ) )
            // InternalReactionLanguage.g:7112:2: ( ruleInitialisationHead )
            {
            // InternalReactionLanguage.g:7112:2: ( ruleInitialisationHead )
            // InternalReactionLanguage.g:7113:3: ruleInitialisationHead
            {
             before(grammarAccess.getInitialisationAccess().getHeadInitialisationHeadParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialisationHead();

            state._fsp--;

             after(grammarAccess.getInitialisationAccess().getHeadInitialisationHeadParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__HeadAssignment_0"


    // $ANTLR start "rule__Initialisation__BodyAssignment_1"
    // InternalReactionLanguage.g:7122:1: rule__Initialisation__BodyAssignment_1 : ( ruleInitialisationBody ) ;
    public final void rule__Initialisation__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7126:1: ( ( ruleInitialisationBody ) )
            // InternalReactionLanguage.g:7127:2: ( ruleInitialisationBody )
            {
            // InternalReactionLanguage.g:7127:2: ( ruleInitialisationBody )
            // InternalReactionLanguage.g:7128:3: ruleInitialisationBody
            {
             before(grammarAccess.getInitialisationAccess().getBodyInitialisationBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialisationBody();

            state._fsp--;

             after(grammarAccess.getInitialisationAccess().getBodyInitialisationBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__BodyAssignment_1"


    // $ANTLR start "rule__InitialisationHead__CntAssignment_1"
    // InternalReactionLanguage.g:7137:1: rule__InitialisationHead__CntAssignment_1 : ( ruleArithmeticExpr ) ;
    public final void rule__InitialisationHead__CntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7141:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7142:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7142:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7143:3: ruleArithmeticExpr
            {
             before(grammarAccess.getInitialisationHeadAccess().getCntArithmeticExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getInitialisationHeadAccess().getCntArithmeticExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationHead__CntAssignment_1"


    // $ANTLR start "rule__InitialisationBody__SignatureAssignment_0"
    // InternalReactionLanguage.g:7152:1: rule__InitialisationBody__SignatureAssignment_0 : ( ruleSignature ) ;
    public final void rule__InitialisationBody__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7156:1: ( ( ruleSignature ) )
            // InternalReactionLanguage.g:7157:2: ( ruleSignature )
            {
            // InternalReactionLanguage.g:7157:2: ( ruleSignature )
            // InternalReactionLanguage.g:7158:3: ruleSignature
            {
             before(grammarAccess.getInitialisationBodyAccess().getSignatureSignatureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInitialisationBodyAccess().getSignatureSignatureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__SignatureAssignment_0"


    // $ANTLR start "rule__InitialisationBody__PatternAssignment_2"
    // InternalReactionLanguage.g:7167:1: rule__InitialisationBody__PatternAssignment_2 : ( rulePattern ) ;
    public final void rule__InitialisationBody__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7171:1: ( ( rulePattern ) )
            // InternalReactionLanguage.g:7172:2: ( rulePattern )
            {
            // InternalReactionLanguage.g:7172:2: ( rulePattern )
            // InternalReactionLanguage.g:7173:3: rulePattern
            {
             before(grammarAccess.getInitialisationBodyAccess().getPatternPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getInitialisationBodyAccess().getPatternPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialisationBody__PatternAssignment_2"


    // $ANTLR start "rule__Observable__NameAssignment_1"
    // InternalReactionLanguage.g:7182:1: rule__Observable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Observable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7186:1: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:7187:2: ( RULE_ID )
            {
            // InternalReactionLanguage.g:7187:2: ( RULE_ID )
            // InternalReactionLanguage.g:7188:3: RULE_ID
            {
             before(grammarAccess.getObservableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObservableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__NameAssignment_1"


    // $ANTLR start "rule__Observable__BodyAssignment_2"
    // InternalReactionLanguage.g:7197:1: rule__Observable__BodyAssignment_2 : ( ruleObservableBody ) ;
    public final void rule__Observable__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7201:1: ( ( ruleObservableBody ) )
            // InternalReactionLanguage.g:7202:2: ( ruleObservableBody )
            {
            // InternalReactionLanguage.g:7202:2: ( ruleObservableBody )
            // InternalReactionLanguage.g:7203:3: ruleObservableBody
            {
             before(grammarAccess.getObservableAccess().getBodyObservableBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObservableBody();

            state._fsp--;

             after(grammarAccess.getObservableAccess().getBodyObservableBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observable__BodyAssignment_2"


    // $ANTLR start "rule__ObservablePattern__SignatureAssignment_0"
    // InternalReactionLanguage.g:7212:1: rule__ObservablePattern__SignatureAssignment_0 : ( ruleSignature ) ;
    public final void rule__ObservablePattern__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7216:1: ( ( ruleSignature ) )
            // InternalReactionLanguage.g:7217:2: ( ruleSignature )
            {
            // InternalReactionLanguage.g:7217:2: ( ruleSignature )
            // InternalReactionLanguage.g:7218:3: ruleSignature
            {
             before(grammarAccess.getObservablePatternAccess().getSignatureSignatureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getObservablePatternAccess().getSignatureSignatureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__SignatureAssignment_0"


    // $ANTLR start "rule__ObservablePattern__PatternAssignment_2"
    // InternalReactionLanguage.g:7227:1: rule__ObservablePattern__PatternAssignment_2 : ( rulePattern ) ;
    public final void rule__ObservablePattern__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7231:1: ( ( rulePattern ) )
            // InternalReactionLanguage.g:7232:2: ( rulePattern )
            {
            // InternalReactionLanguage.g:7232:2: ( rulePattern )
            // InternalReactionLanguage.g:7233:3: rulePattern
            {
             before(grammarAccess.getObservablePatternAccess().getPatternPatternParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getObservablePatternAccess().getPatternPatternParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObservablePattern__PatternAssignment_2"


    // $ANTLR start "rule__TerminateTime__TimeAssignment_2"
    // InternalReactionLanguage.g:7242:1: rule__TerminateTime__TimeAssignment_2 : ( ruleArithmeticExpr ) ;
    public final void rule__TerminateTime__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7246:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7247:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7247:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7248:3: ruleArithmeticExpr
            {
             before(grammarAccess.getTerminateTimeAccess().getTimeArithmeticExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getTerminateTimeAccess().getTimeArithmeticExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateTime__TimeAssignment_2"


    // $ANTLR start "rule__TerminateIterations__IterationsAssignment_2"
    // InternalReactionLanguage.g:7257:1: rule__TerminateIterations__IterationsAssignment_2 : ( ruleArithmeticExpr ) ;
    public final void rule__TerminateIterations__IterationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7261:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7262:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7262:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7263:3: ruleArithmeticExpr
            {
             before(grammarAccess.getTerminateIterationsAccess().getIterationsArithmeticExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getTerminateIterationsAccess().getIterationsArithmeticExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateIterations__IterationsAssignment_2"


    // $ANTLR start "rule__TerminateCount__SignatureAssignment_0_0"
    // InternalReactionLanguage.g:7272:1: rule__TerminateCount__SignatureAssignment_0_0 : ( ruleSignature ) ;
    public final void rule__TerminateCount__SignatureAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7276:1: ( ( ruleSignature ) )
            // InternalReactionLanguage.g:7277:2: ( ruleSignature )
            {
            // InternalReactionLanguage.g:7277:2: ( ruleSignature )
            // InternalReactionLanguage.g:7278:3: ruleSignature
            {
             before(grammarAccess.getTerminateCountAccess().getSignatureSignatureParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getTerminateCountAccess().getSignatureSignatureParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__SignatureAssignment_0_0"


    // $ANTLR start "rule__TerminateCount__PatternAssignment_1"
    // InternalReactionLanguage.g:7287:1: rule__TerminateCount__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__TerminateCount__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7291:1: ( ( rulePattern ) )
            // InternalReactionLanguage.g:7292:2: ( rulePattern )
            {
            // InternalReactionLanguage.g:7292:2: ( rulePattern )
            // InternalReactionLanguage.g:7293:3: rulePattern
            {
             before(grammarAccess.getTerminateCountAccess().getPatternPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getTerminateCountAccess().getPatternPatternParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__PatternAssignment_1"


    // $ANTLR start "rule__TerminateCount__CntAssignment_4"
    // InternalReactionLanguage.g:7302:1: rule__TerminateCount__CntAssignment_4 : ( ruleArithmeticExpr ) ;
    public final void rule__TerminateCount__CntAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7306:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7307:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7307:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7308:3: ruleArithmeticExpr
            {
             before(grammarAccess.getTerminateCountAccess().getCntArithmeticExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getTerminateCountAccess().getCntArithmeticExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminateCount__CntAssignment_4"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalReactionLanguage.g:7317:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7321:1: ( ( ruleMultiplication ) )
            // InternalReactionLanguage.g:7322:2: ( ruleMultiplication )
            {
            // InternalReactionLanguage.g:7322:2: ( ruleMultiplication )
            // InternalReactionLanguage.g:7323:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalReactionLanguage.g:7332:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpr ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7336:1: ( ( rulePrimaryExpr ) )
            // InternalReactionLanguage.g:7337:2: ( rulePrimaryExpr )
            {
            // InternalReactionLanguage.g:7337:2: ( rulePrimaryExpr )
            // InternalReactionLanguage.g:7338:3: rulePrimaryExpr
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpr__ValueAssignment_1_1"
    // InternalReactionLanguage.g:7347:1: rule__PrimaryExpr__ValueAssignment_1_1 : ( ruleArithmeticType ) ;
    public final void rule__PrimaryExpr__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7351:1: ( ( ruleArithmeticType ) )
            // InternalReactionLanguage.g:7352:2: ( ruleArithmeticType )
            {
            // InternalReactionLanguage.g:7352:2: ( ruleArithmeticType )
            // InternalReactionLanguage.g:7353:3: ruleArithmeticType
            {
             before(grammarAccess.getPrimaryExprAccess().getValueArithmeticTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticType();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getValueArithmeticTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpr__FuncAssignment_2_1"
    // InternalReactionLanguage.g:7362:1: rule__PrimaryExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__PrimaryExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7366:1: ( ( ruleMathFunc ) )
            // InternalReactionLanguage.g:7367:2: ( ruleMathFunc )
            {
            // InternalReactionLanguage.g:7367:2: ( ruleMathFunc )
            // InternalReactionLanguage.g:7368:3: ruleMathFunc
            {
             before(grammarAccess.getPrimaryExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathFunc();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__FuncAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpr__ExprAssignment_2_3"
    // InternalReactionLanguage.g:7377:1: rule__PrimaryExpr__ExprAssignment_2_3 : ( ruleArithmeticExpr ) ;
    public final void rule__PrimaryExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7381:1: ( ( ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:7382:2: ( ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:7382:2: ( ruleArithmeticExpr )
            // InternalReactionLanguage.g:7383:3: ruleArithmeticExpr
            {
             before(grammarAccess.getPrimaryExprAccess().getExprArithmeticExprParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getExprArithmeticExprParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__ExprAssignment_2_3"


    // $ANTLR start "rule__PrimaryExpr__RefAssignment_3_1"
    // InternalReactionLanguage.g:7392:1: rule__PrimaryExpr__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpr__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReactionLanguage.g:7396:1: ( ( ( RULE_ID ) ) )
            // InternalReactionLanguage.g:7397:2: ( ( RULE_ID ) )
            {
            // InternalReactionLanguage.g:7397:2: ( ( RULE_ID ) )
            // InternalReactionLanguage.g:7398:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExprAccess().getRefVariableCrossReference_3_1_0()); 
            // InternalReactionLanguage.g:7399:3: ( RULE_ID )
            // InternalReactionLanguage.g:7400:4: RULE_ID
            {
             before(grammarAccess.getPrimaryExprAccess().getRefVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExprAccess().getRefVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExprAccess().getRefVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__RefAssignment_3_1"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\uffff\2\6\4\uffff\2\15\2\16\4\uffff\2\21\1\uffff";
    static final String dfa_3s = "\1\4\2\6\2\4\2\uffff\4\6\1\4\3\uffff\2\6\1\uffff";
    static final String dfa_4s = "\1\17\2\56\2\5\2\uffff\4\56\1\5\3\uffff\2\56\1\uffff";
    static final String dfa_5s = "\5\uffff\1\5\1\1\5\uffff\1\6\1\2\1\3\2\uffff\1\4";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\11\uffff\1\3",
            "\2\6\6\uffff\2\6\5\uffff\3\6\2\uffff\3\6\1\uffff\2\6\2\uffff\1\4\1\6\1\uffff\3\6\3\uffff\3\6\1\5",
            "\2\6\6\uffff\2\6\5\uffff\3\6\2\uffff\3\6\1\uffff\2\6\2\uffff\1\4\1\6\1\uffff\3\6\3\uffff\3\6\1\5",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "\2\15\6\uffff\2\15\5\uffff\3\15\2\uffff\3\15\1\uffff\2\15\2\uffff\1\13\1\15\1\uffff\3\15\3\uffff\3\15\1\14",
            "\2\15\6\uffff\2\15\5\uffff\3\15\2\uffff\3\15\1\uffff\2\15\2\uffff\1\13\1\15\1\uffff\3\15\3\uffff\3\15\1\14",
            "\2\16\6\uffff\2\16\5\uffff\3\16\2\uffff\3\16\1\uffff\2\16\3\uffff\1\16\1\uffff\3\16\3\uffff\3\16\1\5",
            "\2\16\6\uffff\2\16\5\uffff\3\16\2\uffff\3\16\1\uffff\2\16\3\uffff\1\16\1\uffff\3\16\3\uffff\3\16\1\5",
            "\1\17\1\20",
            "",
            "",
            "",
            "\2\21\6\uffff\2\21\5\uffff\3\21\2\uffff\3\21\1\uffff\2\21\3\uffff\1\21\1\uffff\3\21\3\uffff\3\21\1\14",
            "\2\21\6\uffff\2\21\5\uffff\3\21\2\uffff\3\21\1\uffff\2\21\3\uffff\1\21\1\uffff\3\21\3\uffff\3\21\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1505:1: rule__ArithmeticType__Alternatives : ( ( ruleUnsignedInt ) | ( ruleSignedInt ) | ( ruleUnsignedDouble ) | ( ruleSignedDouble ) | ( ruleUnsignedScientificDouble ) | ( ruleSignedScientificDouble ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000E890800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000E890800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000048D0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004890000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004038130L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000320L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030204000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400400000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000000L});

}