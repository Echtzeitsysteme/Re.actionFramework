package org.reaction.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.reaction.dsl.services.ReactionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_NEWLINE", "RULE_ID", "RULE_INT", "RULE_ANYTHING", "RULE_NULL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "','", "'agent'", "';'", "'['", "']'", "'('", "')'", "'complex'", "'{'", "'}'", "'rule'", "'@'", "'_'", "'.'", "'var'", "'='", "'init'", "'observe'", "'terminate'", "'time'", "'iterations'", "'matches'", "'+'", "'-'", "'*'", "'/'", "'^'", "'E'", "'sqrt'", "'abs'", "'=>'", "'<=>'", "'//'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ANYTHING=8;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=5;
    public static final int RULE_STRING=10;
    public static final int RULE_NULL=9;
    public static final int RULE_SL_COMMENT=4;
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

        public InternalReactionLanguageParser(TokenStream input, ReactionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReactionModel";
       	}

       	@Override
       	protected ReactionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReactionModel"
    // InternalReactionLanguage.g:65:1: entryRuleReactionModel returns [EObject current=null] : iv_ruleReactionModel= ruleReactionModel EOF ;
    public final EObject entryRuleReactionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionModel = null;


        try {
            // InternalReactionLanguage.g:65:54: (iv_ruleReactionModel= ruleReactionModel EOF )
            // InternalReactionLanguage.g:66:2: iv_ruleReactionModel= ruleReactionModel EOF
            {
             newCompositeNode(grammarAccess.getReactionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactionModel=ruleReactionModel();

            state._fsp--;

             current =iv_ruleReactionModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionModel"


    // $ANTLR start "ruleReactionModel"
    // InternalReactionLanguage.g:72:1: ruleReactionModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleComponent ) ) (this_SL_COMMENT_1= RULE_SL_COMMENT )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )* )* ;
    public final EObject ruleReactionModel() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token this_NEWLINE_2=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:78:2: ( ( ( (lv_elements_0_0= ruleComponent ) ) (this_SL_COMMENT_1= RULE_SL_COMMENT )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )* )* )
            // InternalReactionLanguage.g:79:2: ( ( (lv_elements_0_0= ruleComponent ) ) (this_SL_COMMENT_1= RULE_SL_COMMENT )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )* )*
            {
            // InternalReactionLanguage.g:79:2: ( ( (lv_elements_0_0= ruleComponent ) ) (this_SL_COMMENT_1= RULE_SL_COMMENT )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==22||LA3_0==25||LA3_0==29||(LA3_0>=31 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReactionLanguage.g:80:3: ( (lv_elements_0_0= ruleComponent ) ) (this_SL_COMMENT_1= RULE_SL_COMMENT )? (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )*
            	    {
            	    // InternalReactionLanguage.g:80:3: ( (lv_elements_0_0= ruleComponent ) )
            	    // InternalReactionLanguage.g:81:4: (lv_elements_0_0= ruleComponent )
            	    {
            	    // InternalReactionLanguage.g:81:4: (lv_elements_0_0= ruleComponent )
            	    // InternalReactionLanguage.g:82:5: lv_elements_0_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactionModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.reaction.dsl.ReactionLanguage.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalReactionLanguage.g:99:3: (this_SL_COMMENT_1= RULE_SL_COMMENT )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_SL_COMMENT) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalReactionLanguage.g:100:4: this_SL_COMMENT_1= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); 

            	            				newLeafNode(this_SL_COMMENT_1, grammarAccess.getReactionModelAccess().getSL_COMMENTTerminalRuleCall_1());
            	            			

            	            }
            	            break;

            	    }

            	    // InternalReactionLanguage.g:105:3: (this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_NEWLINE) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalReactionLanguage.g:106:4: this_NEWLINE_2= RULE_NEWLINE ( (lv_elements_3_0= ruleComponent ) )
            	    	    {
            	    	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	    	    				newLeafNode(this_NEWLINE_2, grammarAccess.getReactionModelAccess().getNEWLINETerminalRuleCall_2_0());
            	    	    			
            	    	    // InternalReactionLanguage.g:110:4: ( (lv_elements_3_0= ruleComponent ) )
            	    	    // InternalReactionLanguage.g:111:5: (lv_elements_3_0= ruleComponent )
            	    	    {
            	    	    // InternalReactionLanguage.g:111:5: (lv_elements_3_0= ruleComponent )
            	    	    // InternalReactionLanguage.g:112:6: lv_elements_3_0= ruleComponent
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getReactionModelAccess().getElementsComponentParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_elements_3_0=ruleComponent();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getReactionModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"elements",
            	    	    							lv_elements_3_0,
            	    	    							"org.reaction.dsl.ReactionLanguage.Component");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionModel"


    // $ANTLR start "entryRuleComponent"
    // InternalReactionLanguage.g:134:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalReactionLanguage.g:134:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalReactionLanguage.g:135:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalReactionLanguage.g:141:1: ruleComponent returns [EObject current=null] : (this_AgentDeclaration_0= ruleAgentDeclaration | this_Rule_1= ruleRule | this_Complex_2= ruleComplex | this_Initialisation_3= ruleInitialisation | this_Observable_4= ruleObservable | this_Variable_5= ruleVariable | this_Command_6= ruleCommand ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_AgentDeclaration_0 = null;

        EObject this_Rule_1 = null;

        EObject this_Complex_2 = null;

        EObject this_Initialisation_3 = null;

        EObject this_Observable_4 = null;

        EObject this_Variable_5 = null;

        EObject this_Command_6 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:147:2: ( (this_AgentDeclaration_0= ruleAgentDeclaration | this_Rule_1= ruleRule | this_Complex_2= ruleComplex | this_Initialisation_3= ruleInitialisation | this_Observable_4= ruleObservable | this_Variable_5= ruleVariable | this_Command_6= ruleCommand ) )
            // InternalReactionLanguage.g:148:2: (this_AgentDeclaration_0= ruleAgentDeclaration | this_Rule_1= ruleRule | this_Complex_2= ruleComplex | this_Initialisation_3= ruleInitialisation | this_Observable_4= ruleObservable | this_Variable_5= ruleVariable | this_Command_6= ruleCommand )
            {
            // InternalReactionLanguage.g:148:2: (this_AgentDeclaration_0= ruleAgentDeclaration | this_Rule_1= ruleRule | this_Complex_2= ruleComplex | this_Initialisation_3= ruleInitialisation | this_Observable_4= ruleObservable | this_Variable_5= ruleVariable | this_Command_6= ruleCommand )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 29:
                {
                alt4=6;
                }
                break;
            case 33:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalReactionLanguage.g:149:3: this_AgentDeclaration_0= ruleAgentDeclaration
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getAgentDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AgentDeclaration_0=ruleAgentDeclaration();

                    state._fsp--;


                    			current = this_AgentDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:158:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:167:3: this_Complex_2= ruleComplex
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComplexParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Complex_2=ruleComplex();

                    state._fsp--;


                    			current = this_Complex_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:176:3: this_Initialisation_3= ruleInitialisation
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getInitialisationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initialisation_3=ruleInitialisation();

                    state._fsp--;


                    			current = this_Initialisation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalReactionLanguage.g:185:3: this_Observable_4= ruleObservable
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getObservableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Observable_4=ruleObservable();

                    state._fsp--;


                    			current = this_Observable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalReactionLanguage.g:194:3: this_Variable_5= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getVariableParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_5=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalReactionLanguage.g:203:3: this_Command_6= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCommandParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_6=ruleCommand();

                    state._fsp--;


                    			current = this_Command_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAgent"
    // InternalReactionLanguage.g:215:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalReactionLanguage.g:215:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalReactionLanguage.g:216:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalReactionLanguage.g:222:1: ruleAgent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )? ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sites_2_0 = null;

        EObject lv_sites_4_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:228:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )? ) )
            // InternalReactionLanguage.g:229:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )? )
            {
            // InternalReactionLanguage.g:229:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )? )
            // InternalReactionLanguage.g:230:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )?
            {
            // InternalReactionLanguage.g:230:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionLanguage.g:231:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionLanguage.g:231:4: (lv_name_0_0= RULE_ID )
            // InternalReactionLanguage.g:232:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionLanguage.g:248:3: (otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReactionLanguage.g:249:4: otherlv_1= ':' ( (lv_sites_2_0= ruleSite ) ) (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAgentAccess().getColonKeyword_1_0());
                    			
                    // InternalReactionLanguage.g:253:4: ( (lv_sites_2_0= ruleSite ) )
                    // InternalReactionLanguage.g:254:5: (lv_sites_2_0= ruleSite )
                    {
                    // InternalReactionLanguage.g:254:5: (lv_sites_2_0= ruleSite )
                    // InternalReactionLanguage.g:255:6: lv_sites_2_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sites_2_0=ruleSite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentRule());
                    						}
                    						add(
                    							current,
                    							"sites",
                    							lv_sites_2_0,
                    							"org.reaction.dsl.ReactionLanguage.Site");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionLanguage.g:272:4: (otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReactionLanguage.g:273:5: otherlv_3= ',' ( (lv_sites_4_0= ruleSite ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionLanguage.g:277:5: ( (lv_sites_4_0= ruleSite ) )
                    	    // InternalReactionLanguage.g:278:6: (lv_sites_4_0= ruleSite )
                    	    {
                    	    // InternalReactionLanguage.g:278:6: (lv_sites_4_0= ruleSite )
                    	    // InternalReactionLanguage.g:279:7: lv_sites_4_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getAgentAccess().getSitesSiteParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sites_4_0=ruleSite();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sites",
                    	    								lv_sites_4_0,
                    	    								"org.reaction.dsl.ReactionLanguage.Site");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleAgentDeclaration"
    // InternalReactionLanguage.g:302:1: entryRuleAgentDeclaration returns [EObject current=null] : iv_ruleAgentDeclaration= ruleAgentDeclaration EOF ;
    public final EObject entryRuleAgentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentDeclaration = null;


        try {
            // InternalReactionLanguage.g:302:57: (iv_ruleAgentDeclaration= ruleAgentDeclaration EOF )
            // InternalReactionLanguage.g:303:2: iv_ruleAgentDeclaration= ruleAgentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAgentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentDeclaration=ruleAgentDeclaration();

            state._fsp--;

             current =iv_ruleAgentDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentDeclaration"


    // $ANTLR start "ruleAgentDeclaration"
    // InternalReactionLanguage.g:309:1: ruleAgentDeclaration returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_declaredAgents_1_0= ruleAgent ) ) (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )* ) ;
    public final EObject ruleAgentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_declaredAgents_1_0 = null;

        EObject lv_declaredAgents_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:315:2: ( (otherlv_0= 'agent' ( (lv_declaredAgents_1_0= ruleAgent ) ) (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )* ) )
            // InternalReactionLanguage.g:316:2: (otherlv_0= 'agent' ( (lv_declaredAgents_1_0= ruleAgent ) ) (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )* )
            {
            // InternalReactionLanguage.g:316:2: (otherlv_0= 'agent' ( (lv_declaredAgents_1_0= ruleAgent ) ) (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )* )
            // InternalReactionLanguage.g:317:3: otherlv_0= 'agent' ( (lv_declaredAgents_1_0= ruleAgent ) ) (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentDeclarationAccess().getAgentKeyword_0());
            		
            // InternalReactionLanguage.g:321:3: ( (lv_declaredAgents_1_0= ruleAgent ) )
            // InternalReactionLanguage.g:322:4: (lv_declaredAgents_1_0= ruleAgent )
            {
            // InternalReactionLanguage.g:322:4: (lv_declaredAgents_1_0= ruleAgent )
            // InternalReactionLanguage.g:323:5: lv_declaredAgents_1_0= ruleAgent
            {

            					newCompositeNode(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_declaredAgents_1_0=ruleAgent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentDeclarationRule());
            					}
            					add(
            						current,
            						"declaredAgents",
            						lv_declaredAgents_1_0,
            						"org.reaction.dsl.ReactionLanguage.Agent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:340:3: (otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReactionLanguage.g:341:4: otherlv_2= ';' ( (lv_declaredAgents_3_0= ruleAgent ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAgentDeclarationAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalReactionLanguage.g:345:4: ( (lv_declaredAgents_3_0= ruleAgent ) )
            	    // InternalReactionLanguage.g:346:5: (lv_declaredAgents_3_0= ruleAgent )
            	    {
            	    // InternalReactionLanguage.g:346:5: (lv_declaredAgents_3_0= ruleAgent )
            	    // InternalReactionLanguage.g:347:6: lv_declaredAgents_3_0= ruleAgent
            	    {

            	    						newCompositeNode(grammarAccess.getAgentDeclarationAccess().getDeclaredAgentsAgentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_declaredAgents_3_0=ruleAgent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAgentDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declaredAgents",
            	    							lv_declaredAgents_3_0,
            	    							"org.reaction.dsl.ReactionLanguage.Agent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentDeclaration"


    // $ANTLR start "entryRuleAgentInstance"
    // InternalReactionLanguage.g:369:1: entryRuleAgentInstance returns [EObject current=null] : iv_ruleAgentInstance= ruleAgentInstance EOF ;
    public final EObject entryRuleAgentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentInstance = null;


        try {
            // InternalReactionLanguage.g:369:54: (iv_ruleAgentInstance= ruleAgentInstance EOF )
            // InternalReactionLanguage.g:370:2: iv_ruleAgentInstance= ruleAgentInstance EOF
            {
             newCompositeNode(grammarAccess.getAgentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentInstance=ruleAgentInstance();

            state._fsp--;

             current =iv_ruleAgentInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentInstance"


    // $ANTLR start "ruleAgentInstance"
    // InternalReactionLanguage.g:376:1: ruleAgentInstance returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleAgentInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_array_3_0=null;
        Token lv_size_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:382:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )? ) )
            // InternalReactionLanguage.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )? )
            {
            // InternalReactionLanguage.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )? )
            // InternalReactionLanguage.g:384:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )?
            {
            // InternalReactionLanguage.g:384:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionLanguage.g:385:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionLanguage.g:385:4: (lv_name_0_0= RULE_ID )
            // InternalReactionLanguage.g:386:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAgentInstanceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAgentInstanceAccess().getColonKeyword_1());
            		
            // InternalReactionLanguage.g:406:3: ( (otherlv_2= RULE_ID ) )
            // InternalReactionLanguage.g:407:4: (otherlv_2= RULE_ID )
            {
            // InternalReactionLanguage.g:407:4: (otherlv_2= RULE_ID )
            // InternalReactionLanguage.g:408:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentInstanceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAgentInstanceAccess().getInstanceOfAgentCrossReference_2_0());
            				

            }


            }

            // InternalReactionLanguage.g:419:3: ( ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReactionLanguage.g:420:4: ( (lv_array_3_0= '[' ) ) ( (lv_size_4_0= RULE_INT ) ) otherlv_5= ']'
                    {
                    // InternalReactionLanguage.g:420:4: ( (lv_array_3_0= '[' ) )
                    // InternalReactionLanguage.g:421:5: (lv_array_3_0= '[' )
                    {
                    // InternalReactionLanguage.g:421:5: (lv_array_3_0= '[' )
                    // InternalReactionLanguage.g:422:6: lv_array_3_0= '['
                    {
                    lv_array_3_0=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_array_3_0, grammarAccess.getAgentInstanceAccess().getArrayLeftSquareBracketKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAgentInstanceRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalReactionLanguage.g:434:4: ( (lv_size_4_0= RULE_INT ) )
                    // InternalReactionLanguage.g:435:5: (lv_size_4_0= RULE_INT )
                    {
                    // InternalReactionLanguage.g:435:5: (lv_size_4_0= RULE_INT )
                    // InternalReactionLanguage.g:436:6: lv_size_4_0= RULE_INT
                    {
                    lv_size_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_size_4_0, grammarAccess.getAgentInstanceAccess().getSizeINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAgentInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAgentInstanceAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentInstance"


    // $ANTLR start "entryRuleSite"
    // InternalReactionLanguage.g:461:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalReactionLanguage.g:461:45: (iv_ruleSite= ruleSite EOF )
            // InternalReactionLanguage.g:462:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalReactionLanguage.g:468:1: ruleSite returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_states_2_0 = null;

        EObject lv_states_4_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:474:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )? ) )
            // InternalReactionLanguage.g:475:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )? )
            {
            // InternalReactionLanguage.g:475:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )? )
            // InternalReactionLanguage.g:476:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )?
            {
            // InternalReactionLanguage.g:476:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionLanguage.g:477:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionLanguage.g:477:4: (lv_name_0_0= RULE_ID )
            // InternalReactionLanguage.g:478:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionLanguage.g:494:3: (otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReactionLanguage.g:495:4: otherlv_1= '(' ( (lv_states_2_0= ruleSiteState ) ) (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalReactionLanguage.g:499:4: ( (lv_states_2_0= ruleSiteState ) )
                    // InternalReactionLanguage.g:500:5: (lv_states_2_0= ruleSiteState )
                    {
                    // InternalReactionLanguage.g:500:5: (lv_states_2_0= ruleSiteState )
                    // InternalReactionLanguage.g:501:6: lv_states_2_0= ruleSiteState
                    {

                    						newCompositeNode(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_states_2_0=ruleSiteState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSiteRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_2_0,
                    							"org.reaction.dsl.ReactionLanguage.SiteState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionLanguage.g:518:4: (otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalReactionLanguage.g:519:5: otherlv_3= ',' ( (lv_states_4_0= ruleSiteState ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSiteAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalReactionLanguage.g:523:5: ( (lv_states_4_0= ruleSiteState ) )
                    	    // InternalReactionLanguage.g:524:6: (lv_states_4_0= ruleSiteState )
                    	    {
                    	    // InternalReactionLanguage.g:524:6: (lv_states_4_0= ruleSiteState )
                    	    // InternalReactionLanguage.g:525:7: lv_states_4_0= ruleSiteState
                    	    {

                    	    							newCompositeNode(grammarAccess.getSiteAccess().getStatesSiteStateParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_states_4_0=ruleSiteState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSiteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_4_0,
                    	    								"org.reaction.dsl.ReactionLanguage.SiteState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSiteAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleSiteState"
    // InternalReactionLanguage.g:552:1: entryRuleSiteState returns [EObject current=null] : iv_ruleSiteState= ruleSiteState EOF ;
    public final EObject entryRuleSiteState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteState = null;


        try {
            // InternalReactionLanguage.g:552:50: (iv_ruleSiteState= ruleSiteState EOF )
            // InternalReactionLanguage.g:553:2: iv_ruleSiteState= ruleSiteState EOF
            {
             newCompositeNode(grammarAccess.getSiteStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteState=ruleSiteState();

            state._fsp--;

             current =iv_ruleSiteState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteState"


    // $ANTLR start "ruleSiteState"
    // InternalReactionLanguage.g:559:1: ruleSiteState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSiteState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:565:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalReactionLanguage.g:566:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalReactionLanguage.g:566:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionLanguage.g:567:3: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionLanguage.g:567:3: (lv_name_0_0= RULE_ID )
            // InternalReactionLanguage.g:568:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSiteStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSiteStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteState"


    // $ANTLR start "entryRuleComplex"
    // InternalReactionLanguage.g:587:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalReactionLanguage.g:587:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalReactionLanguage.g:588:2: iv_ruleComplex= ruleComplex EOF
            {
             newCompositeNode(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplex=ruleComplex();

            state._fsp--;

             current =iv_ruleComplex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalReactionLanguage.g:594:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'complex' ( (lv_signature_1_0= ruleSignature ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleComplexElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:600:2: ( (otherlv_0= 'complex' ( (lv_signature_1_0= ruleSignature ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleComplexElement ) )* otherlv_4= '}' ) )
            // InternalReactionLanguage.g:601:2: (otherlv_0= 'complex' ( (lv_signature_1_0= ruleSignature ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleComplexElement ) )* otherlv_4= '}' )
            {
            // InternalReactionLanguage.g:601:2: (otherlv_0= 'complex' ( (lv_signature_1_0= ruleSignature ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleComplexElement ) )* otherlv_4= '}' )
            // InternalReactionLanguage.g:602:3: otherlv_0= 'complex' ( (lv_signature_1_0= ruleSignature ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleComplexElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalReactionLanguage.g:606:3: ( (lv_signature_1_0= ruleSignature ) )
            // InternalReactionLanguage.g:607:4: (lv_signature_1_0= ruleSignature )
            {
            // InternalReactionLanguage.g:607:4: (lv_signature_1_0= ruleSignature )
            // InternalReactionLanguage.g:608:5: lv_signature_1_0= ruleSignature
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getSignatureSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_signature_1_0=ruleSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_1_0,
            						"org.reaction.dsl.ReactionLanguage.Signature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalReactionLanguage.g:629:3: ( (lv_elements_3_0= ruleComplexElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||LA11_0==25||LA11_0==29||LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionLanguage.g:630:4: (lv_elements_3_0= ruleComplexElement )
            	    {
            	    // InternalReactionLanguage.g:630:4: (lv_elements_3_0= ruleComplexElement )
            	    // InternalReactionLanguage.g:631:5: lv_elements_3_0= ruleComplexElement
            	    {

            	    					newCompositeNode(grammarAccess.getComplexAccess().getElementsComplexElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_elements_3_0=ruleComplexElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.reaction.dsl.ReactionLanguage.ComplexElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleComplexElement"
    // InternalReactionLanguage.g:656:1: entryRuleComplexElement returns [EObject current=null] : iv_ruleComplexElement= ruleComplexElement EOF ;
    public final EObject entryRuleComplexElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexElement = null;


        try {
            // InternalReactionLanguage.g:656:55: (iv_ruleComplexElement= ruleComplexElement EOF )
            // InternalReactionLanguage.g:657:2: iv_ruleComplexElement= ruleComplexElement EOF
            {
             newCompositeNode(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexElement=ruleComplexElement();

            state._fsp--;

             current =iv_ruleComplexElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexElement"


    // $ANTLR start "ruleComplexElement"
    // InternalReactionLanguage.g:663:1: ruleComplexElement returns [EObject current=null] : (this_Complex_0= ruleComplex | this_Rule_1= ruleRule | this_Variable_2= ruleVariable | this_Observable_3= ruleObservable ) ;
    public final EObject ruleComplexElement() throws RecognitionException {
        EObject current = null;

        EObject this_Complex_0 = null;

        EObject this_Rule_1 = null;

        EObject this_Variable_2 = null;

        EObject this_Observable_3 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:669:2: ( (this_Complex_0= ruleComplex | this_Rule_1= ruleRule | this_Variable_2= ruleVariable | this_Observable_3= ruleObservable ) )
            // InternalReactionLanguage.g:670:2: (this_Complex_0= ruleComplex | this_Rule_1= ruleRule | this_Variable_2= ruleVariable | this_Observable_3= ruleObservable )
            {
            // InternalReactionLanguage.g:670:2: (this_Complex_0= ruleComplex | this_Rule_1= ruleRule | this_Variable_2= ruleVariable | this_Observable_3= ruleObservable )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalReactionLanguage.g:671:3: this_Complex_0= ruleComplex
                    {

                    			newCompositeNode(grammarAccess.getComplexElementAccess().getComplexParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Complex_0=ruleComplex();

                    state._fsp--;


                    			current = this_Complex_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:680:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getComplexElementAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:689:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getComplexElementAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:698:3: this_Observable_3= ruleObservable
                    {

                    			newCompositeNode(grammarAccess.getComplexElementAccess().getObservableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Observable_3=ruleObservable();

                    state._fsp--;


                    			current = this_Observable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexElement"


    // $ANTLR start "entryRuleSignature"
    // InternalReactionLanguage.g:710:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalReactionLanguage.g:710:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalReactionLanguage.g:711:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalReactionLanguage.g:717:1: ruleSignature returns [EObject current=null] : (otherlv_0= '(' ( (lv_instances_1_0= ruleAgentInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instances_1_0 = null;

        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:723:2: ( (otherlv_0= '(' ( (lv_instances_1_0= ruleAgentInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )* otherlv_4= ')' ) )
            // InternalReactionLanguage.g:724:2: (otherlv_0= '(' ( (lv_instances_1_0= ruleAgentInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )* otherlv_4= ')' )
            {
            // InternalReactionLanguage.g:724:2: (otherlv_0= '(' ( (lv_instances_1_0= ruleAgentInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )* otherlv_4= ')' )
            // InternalReactionLanguage.g:725:3: otherlv_0= '(' ( (lv_instances_1_0= ruleAgentInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalReactionLanguage.g:729:3: ( (lv_instances_1_0= ruleAgentInstance ) )
            // InternalReactionLanguage.g:730:4: (lv_instances_1_0= ruleAgentInstance )
            {
            // InternalReactionLanguage.g:730:4: (lv_instances_1_0= ruleAgentInstance )
            // InternalReactionLanguage.g:731:5: lv_instances_1_0= ruleAgentInstance
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_instances_1_0=ruleAgentInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					add(
            						current,
            						"instances",
            						lv_instances_1_0,
            						"org.reaction.dsl.ReactionLanguage.AgentInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:748:3: (otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalReactionLanguage.g:749:4: otherlv_2= ',' ( (lv_instances_3_0= ruleAgentInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalReactionLanguage.g:753:4: ( (lv_instances_3_0= ruleAgentInstance ) )
            	    // InternalReactionLanguage.g:754:5: (lv_instances_3_0= ruleAgentInstance )
            	    {
            	    // InternalReactionLanguage.g:754:5: (lv_instances_3_0= ruleAgentInstance )
            	    // InternalReactionLanguage.g:755:6: lv_instances_3_0= ruleAgentInstance
            	    {

            	    						newCompositeNode(grammarAccess.getSignatureAccess().getInstancesAgentInstanceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_instances_3_0=ruleAgentInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSignatureRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instances",
            	    							lv_instances_3_0,
            	    							"org.reaction.dsl.ReactionLanguage.AgentInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleRule"
    // InternalReactionLanguage.g:781:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalReactionLanguage.g:781:45: (iv_ruleRule= ruleRule EOF )
            // InternalReactionLanguage.g:782:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalReactionLanguage.g:788:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_head_1_0= ruleRuleHead ) ) ( (lv_body_2_0= ruleRuleBody ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:794:2: ( (otherlv_0= 'rule' ( (lv_head_1_0= ruleRuleHead ) ) ( (lv_body_2_0= ruleRuleBody ) ) ) )
            // InternalReactionLanguage.g:795:2: (otherlv_0= 'rule' ( (lv_head_1_0= ruleRuleHead ) ) ( (lv_body_2_0= ruleRuleBody ) ) )
            {
            // InternalReactionLanguage.g:795:2: (otherlv_0= 'rule' ( (lv_head_1_0= ruleRuleHead ) ) ( (lv_body_2_0= ruleRuleBody ) ) )
            // InternalReactionLanguage.g:796:3: otherlv_0= 'rule' ( (lv_head_1_0= ruleRuleHead ) ) ( (lv_body_2_0= ruleRuleBody ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalReactionLanguage.g:800:3: ( (lv_head_1_0= ruleRuleHead ) )
            // InternalReactionLanguage.g:801:4: (lv_head_1_0= ruleRuleHead )
            {
            // InternalReactionLanguage.g:801:4: (lv_head_1_0= ruleRuleHead )
            // InternalReactionLanguage.g:802:5: lv_head_1_0= ruleRuleHead
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getHeadRuleHeadParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_head_1_0=ruleRuleHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.reaction.dsl.ReactionLanguage.RuleHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:819:3: ( (lv_body_2_0= ruleRuleBody ) )
            // InternalReactionLanguage.g:820:4: (lv_body_2_0= ruleRuleBody )
            {
            // InternalReactionLanguage.g:820:4: (lv_body_2_0= ruleRuleBody )
            // InternalReactionLanguage.g:821:5: lv_body_2_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"org.reaction.dsl.ReactionLanguage.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleHead"
    // InternalReactionLanguage.g:842:1: entryRuleRuleHead returns [EObject current=null] : iv_ruleRuleHead= ruleRuleHead EOF ;
    public final EObject entryRuleRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleHead = null;


        try {
            // InternalReactionLanguage.g:842:49: (iv_ruleRuleHead= ruleRuleHead EOF )
            // InternalReactionLanguage.g:843:2: iv_ruleRuleHead= ruleRuleHead EOF
            {
             newCompositeNode(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleHead=ruleRuleHead();

            state._fsp--;

             current =iv_ruleRuleHead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleHead"


    // $ANTLR start "ruleRuleHead"
    // InternalReactionLanguage.g:849:1: ruleRuleHead returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_signature_1_0= ruleSignature ) )? otherlv_2= ':' ) ;
    public final EObject ruleRuleHead() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_signature_1_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:855:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_signature_1_0= ruleSignature ) )? otherlv_2= ':' ) )
            // InternalReactionLanguage.g:856:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_signature_1_0= ruleSignature ) )? otherlv_2= ':' )
            {
            // InternalReactionLanguage.g:856:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_signature_1_0= ruleSignature ) )? otherlv_2= ':' )
            // InternalReactionLanguage.g:857:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_signature_1_0= ruleSignature ) )? otherlv_2= ':'
            {
            // InternalReactionLanguage.g:857:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReactionLanguage.g:858:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReactionLanguage.g:858:4: (lv_name_0_0= RULE_ID )
            // InternalReactionLanguage.g:859:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRuleHeadAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleHeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionLanguage.g:875:3: ( (lv_signature_1_0= ruleSignature ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReactionLanguage.g:876:4: (lv_signature_1_0= ruleSignature )
                    {
                    // InternalReactionLanguage.g:876:4: (lv_signature_1_0= ruleSignature )
                    // InternalReactionLanguage.g:877:5: lv_signature_1_0= ruleSignature
                    {

                    					newCompositeNode(grammarAccess.getRuleHeadAccess().getSignatureSignatureParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_signature_1_0=ruleSignature();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleHeadRule());
                    					}
                    					set(
                    						current,
                    						"signature",
                    						lv_signature_1_0,
                    						"org.reaction.dsl.ReactionLanguage.Signature");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleHeadAccess().getColonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleHead"


    // $ANTLR start "entryRuleRuleBody"
    // InternalReactionLanguage.g:902:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalReactionLanguage.g:902:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalReactionLanguage.g:903:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalReactionLanguage.g:909:1: ruleRuleBody returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePattern ) ) ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_rhs_2_0= rulePattern ) ) ( (lv_rates_3_0= ruleRates ) ) ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_ruleType_1_0 = null;

        EObject lv_rhs_2_0 = null;

        EObject lv_rates_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:915:2: ( ( ( (lv_lhs_0_0= rulePattern ) ) ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_rhs_2_0= rulePattern ) ) ( (lv_rates_3_0= ruleRates ) ) ) )
            // InternalReactionLanguage.g:916:2: ( ( (lv_lhs_0_0= rulePattern ) ) ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_rhs_2_0= rulePattern ) ) ( (lv_rates_3_0= ruleRates ) ) )
            {
            // InternalReactionLanguage.g:916:2: ( ( (lv_lhs_0_0= rulePattern ) ) ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_rhs_2_0= rulePattern ) ) ( (lv_rates_3_0= ruleRates ) ) )
            // InternalReactionLanguage.g:917:3: ( (lv_lhs_0_0= rulePattern ) ) ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_rhs_2_0= rulePattern ) ) ( (lv_rates_3_0= ruleRates ) )
            {
            // InternalReactionLanguage.g:917:3: ( (lv_lhs_0_0= rulePattern ) )
            // InternalReactionLanguage.g:918:4: (lv_lhs_0_0= rulePattern )
            {
            // InternalReactionLanguage.g:918:4: (lv_lhs_0_0= rulePattern )
            // InternalReactionLanguage.g:919:5: lv_lhs_0_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getLhsPatternParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_lhs_0_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.reaction.dsl.ReactionLanguage.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:936:3: ( (lv_ruleType_1_0= ruleRuleType ) )
            // InternalReactionLanguage.g:937:4: (lv_ruleType_1_0= ruleRuleType )
            {
            // InternalReactionLanguage.g:937:4: (lv_ruleType_1_0= ruleRuleType )
            // InternalReactionLanguage.g:938:5: lv_ruleType_1_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleTypeRuleTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_ruleType_1_0=ruleRuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"ruleType",
            						lv_ruleType_1_0,
            						"org.reaction.dsl.ReactionLanguage.RuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:955:3: ( (lv_rhs_2_0= rulePattern ) )
            // InternalReactionLanguage.g:956:4: (lv_rhs_2_0= rulePattern )
            {
            // InternalReactionLanguage.g:956:4: (lv_rhs_2_0= rulePattern )
            // InternalReactionLanguage.g:957:5: lv_rhs_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getRhsPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_rhs_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"org.reaction.dsl.ReactionLanguage.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:974:3: ( (lv_rates_3_0= ruleRates ) )
            // InternalReactionLanguage.g:975:4: (lv_rates_3_0= ruleRates )
            {
            // InternalReactionLanguage.g:975:4: (lv_rates_3_0= ruleRates )
            // InternalReactionLanguage.g:976:5: lv_rates_3_0= ruleRates
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getRatesRatesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rates_3_0=ruleRates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"rates",
            						lv_rates_3_0,
            						"org.reaction.dsl.ReactionLanguage.Rates");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRates"
    // InternalReactionLanguage.g:997:1: entryRuleRates returns [EObject current=null] : iv_ruleRates= ruleRates EOF ;
    public final EObject entryRuleRates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRates = null;


        try {
            // InternalReactionLanguage.g:997:46: (iv_ruleRates= ruleRates EOF )
            // InternalReactionLanguage.g:998:2: iv_ruleRates= ruleRates EOF
            {
             newCompositeNode(grammarAccess.getRatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRates=ruleRates();

            state._fsp--;

             current =iv_ruleRates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRates"


    // $ANTLR start "ruleRates"
    // InternalReactionLanguage.g:1004:1: ruleRates returns [EObject current=null] : (otherlv_0= '@' ( (lv_rateForward_1_0= ruleArithmeticExpr ) ) ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )? ) ;
    public final EObject ruleRates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rateBackwardSet_2_0=null;
        EObject lv_rateForward_1_0 = null;

        EObject lv_rateBackward_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1010:2: ( (otherlv_0= '@' ( (lv_rateForward_1_0= ruleArithmeticExpr ) ) ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )? ) )
            // InternalReactionLanguage.g:1011:2: (otherlv_0= '@' ( (lv_rateForward_1_0= ruleArithmeticExpr ) ) ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )? )
            {
            // InternalReactionLanguage.g:1011:2: (otherlv_0= '@' ( (lv_rateForward_1_0= ruleArithmeticExpr ) ) ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )? )
            // InternalReactionLanguage.g:1012:3: otherlv_0= '@' ( (lv_rateForward_1_0= ruleArithmeticExpr ) ) ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRatesAccess().getCommercialAtKeyword_0());
            		
            // InternalReactionLanguage.g:1016:3: ( (lv_rateForward_1_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:1017:4: (lv_rateForward_1_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:1017:4: (lv_rateForward_1_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:1018:5: lv_rateForward_1_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getRatesAccess().getRateForwardArithmeticExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_rateForward_1_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRatesRule());
            					}
            					set(
            						current,
            						"rateForward",
            						lv_rateForward_1_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:1035:3: ( ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReactionLanguage.g:1036:4: ( (lv_rateBackwardSet_2_0= ',' ) ) ( (lv_rateBackward_3_0= ruleArithmeticExpr ) )
                    {
                    // InternalReactionLanguage.g:1036:4: ( (lv_rateBackwardSet_2_0= ',' ) )
                    // InternalReactionLanguage.g:1037:5: (lv_rateBackwardSet_2_0= ',' )
                    {
                    // InternalReactionLanguage.g:1037:5: (lv_rateBackwardSet_2_0= ',' )
                    // InternalReactionLanguage.g:1038:6: lv_rateBackwardSet_2_0= ','
                    {
                    lv_rateBackwardSet_2_0=(Token)match(input,15,FOLLOW_22); 

                    						newLeafNode(lv_rateBackwardSet_2_0, grammarAccess.getRatesAccess().getRateBackwardSetCommaKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRatesRule());
                    						}
                    						setWithLastConsumed(current, "rateBackwardSet", true, ",");
                    					

                    }


                    }

                    // InternalReactionLanguage.g:1050:4: ( (lv_rateBackward_3_0= ruleArithmeticExpr ) )
                    // InternalReactionLanguage.g:1051:5: (lv_rateBackward_3_0= ruleArithmeticExpr )
                    {
                    // InternalReactionLanguage.g:1051:5: (lv_rateBackward_3_0= ruleArithmeticExpr )
                    // InternalReactionLanguage.g:1052:6: lv_rateBackward_3_0= ruleArithmeticExpr
                    {

                    						newCompositeNode(grammarAccess.getRatesAccess().getRateBackwardArithmeticExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rateBackward_3_0=ruleArithmeticExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRatesRule());
                    						}
                    						set(
                    							current,
                    							"rateBackward",
                    							lv_rateBackward_3_0,
                    							"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRates"


    // $ANTLR start "entryRulePattern"
    // InternalReactionLanguage.g:1074:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalReactionLanguage.g:1074:48: (iv_rulePattern= rulePattern EOF )
            // InternalReactionLanguage.g:1075:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalReactionLanguage.g:1081:1: rulePattern returns [EObject current=null] : ( ( () otherlv_1= '_' ) | this_Bonds_2= ruleBonds ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Bonds_2 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1087:2: ( ( ( () otherlv_1= '_' ) | this_Bonds_2= ruleBonds ) )
            // InternalReactionLanguage.g:1088:2: ( ( () otherlv_1= '_' ) | this_Bonds_2= ruleBonds )
            {
            // InternalReactionLanguage.g:1088:2: ( ( () otherlv_1= '_' ) | this_Bonds_2= ruleBonds )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalReactionLanguage.g:1089:3: ( () otherlv_1= '_' )
                    {
                    // InternalReactionLanguage.g:1089:3: ( () otherlv_1= '_' )
                    // InternalReactionLanguage.g:1090:4: () otherlv_1= '_'
                    {
                    // InternalReactionLanguage.g:1090:4: ()
                    // InternalReactionLanguage.g:1091:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getBlankPatternAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternAccess().get_Keyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1103:3: this_Bonds_2= ruleBonds
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getBondsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bonds_2=ruleBonds();

                    state._fsp--;


                    			current = this_Bonds_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBonds"
    // InternalReactionLanguage.g:1115:1: entryRuleBonds returns [EObject current=null] : iv_ruleBonds= ruleBonds EOF ;
    public final EObject entryRuleBonds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBonds = null;


        try {
            // InternalReactionLanguage.g:1115:46: (iv_ruleBonds= ruleBonds EOF )
            // InternalReactionLanguage.g:1116:2: iv_ruleBonds= ruleBonds EOF
            {
             newCompositeNode(grammarAccess.getBondsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBonds=ruleBonds();

            state._fsp--;

             current =iv_ruleBonds; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBonds"


    // $ANTLR start "ruleBonds"
    // InternalReactionLanguage.g:1122:1: ruleBonds returns [EObject current=null] : ( ( (lv_bonds_0_0= ruleBond ) ) (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )* ) ;
    public final EObject ruleBonds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bonds_0_0 = null;

        EObject lv_bonds_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1128:2: ( ( ( (lv_bonds_0_0= ruleBond ) ) (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )* ) )
            // InternalReactionLanguage.g:1129:2: ( ( (lv_bonds_0_0= ruleBond ) ) (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )* )
            {
            // InternalReactionLanguage.g:1129:2: ( ( (lv_bonds_0_0= ruleBond ) ) (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )* )
            // InternalReactionLanguage.g:1130:3: ( (lv_bonds_0_0= ruleBond ) ) (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )*
            {
            // InternalReactionLanguage.g:1130:3: ( (lv_bonds_0_0= ruleBond ) )
            // InternalReactionLanguage.g:1131:4: (lv_bonds_0_0= ruleBond )
            {
            // InternalReactionLanguage.g:1131:4: (lv_bonds_0_0= ruleBond )
            // InternalReactionLanguage.g:1132:5: lv_bonds_0_0= ruleBond
            {

            					newCompositeNode(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_bonds_0_0=ruleBond();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBondsRule());
            					}
            					add(
            						current,
            						"bonds",
            						lv_bonds_0_0,
            						"org.reaction.dsl.ReactionLanguage.Bond");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:1149:3: (otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReactionLanguage.g:1150:4: otherlv_1= ',' ( (lv_bonds_2_0= ruleBond ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBondsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalReactionLanguage.g:1154:4: ( (lv_bonds_2_0= ruleBond ) )
            	    // InternalReactionLanguage.g:1155:5: (lv_bonds_2_0= ruleBond )
            	    {
            	    // InternalReactionLanguage.g:1155:5: (lv_bonds_2_0= ruleBond )
            	    // InternalReactionLanguage.g:1156:6: lv_bonds_2_0= ruleBond
            	    {

            	    						newCompositeNode(grammarAccess.getBondsAccess().getBondsBondParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_bonds_2_0=ruleBond();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBondsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bonds",
            	    							lv_bonds_2_0,
            	    							"org.reaction.dsl.ReactionLanguage.Bond");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBonds"


    // $ANTLR start "entryRuleBond"
    // InternalReactionLanguage.g:1178:1: entryRuleBond returns [EObject current=null] : iv_ruleBond= ruleBond EOF ;
    public final EObject entryRuleBond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBond = null;


        try {
            // InternalReactionLanguage.g:1178:45: (iv_ruleBond= ruleBond EOF )
            // InternalReactionLanguage.g:1179:2: iv_ruleBond= ruleBond EOF
            {
             newCompositeNode(grammarAccess.getBondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBond=ruleBond();

            state._fsp--;

             current =iv_ruleBond; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBond"


    // $ANTLR start "ruleBond"
    // InternalReactionLanguage.g:1185:1: ruleBond returns [EObject current=null] : ( ( (lv_left_0_0= ruleBondSide ) ) ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )? ) ;
    public final EObject ruleBond() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_bondType_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1191:2: ( ( ( (lv_left_0_0= ruleBondSide ) ) ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )? ) )
            // InternalReactionLanguage.g:1192:2: ( ( (lv_left_0_0= ruleBondSide ) ) ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )? )
            {
            // InternalReactionLanguage.g:1192:2: ( ( (lv_left_0_0= ruleBondSide ) ) ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )? )
            // InternalReactionLanguage.g:1193:3: ( (lv_left_0_0= ruleBondSide ) ) ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )?
            {
            // InternalReactionLanguage.g:1193:3: ( (lv_left_0_0= ruleBondSide ) )
            // InternalReactionLanguage.g:1194:4: (lv_left_0_0= ruleBondSide )
            {
            // InternalReactionLanguage.g:1194:4: (lv_left_0_0= ruleBondSide )
            // InternalReactionLanguage.g:1195:5: lv_left_0_0= ruleBondSide
            {

            					newCompositeNode(grammarAccess.getBondAccess().getLeftBondSideParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_left_0_0=ruleBondSide();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBondRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.reaction.dsl.ReactionLanguage.BondSide");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:1212:3: ( ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37||LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReactionLanguage.g:1213:4: ( (lv_bondType_1_0= ruleBondType ) ) ( (lv_right_2_0= ruleBondSideOrWildcard ) )
                    {
                    // InternalReactionLanguage.g:1213:4: ( (lv_bondType_1_0= ruleBondType ) )
                    // InternalReactionLanguage.g:1214:5: (lv_bondType_1_0= ruleBondType )
                    {
                    // InternalReactionLanguage.g:1214:5: (lv_bondType_1_0= ruleBondType )
                    // InternalReactionLanguage.g:1215:6: lv_bondType_1_0= ruleBondType
                    {

                    						newCompositeNode(grammarAccess.getBondAccess().getBondTypeBondTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_bondType_1_0=ruleBondType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBondRule());
                    						}
                    						set(
                    							current,
                    							"bondType",
                    							lv_bondType_1_0,
                    							"org.reaction.dsl.ReactionLanguage.BondType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReactionLanguage.g:1232:4: ( (lv_right_2_0= ruleBondSideOrWildcard ) )
                    // InternalReactionLanguage.g:1233:5: (lv_right_2_0= ruleBondSideOrWildcard )
                    {
                    // InternalReactionLanguage.g:1233:5: (lv_right_2_0= ruleBondSideOrWildcard )
                    // InternalReactionLanguage.g:1234:6: lv_right_2_0= ruleBondSideOrWildcard
                    {

                    						newCompositeNode(grammarAccess.getBondAccess().getRightBondSideOrWildcardParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleBondSideOrWildcard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBondRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.reaction.dsl.ReactionLanguage.BondSideOrWildcard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBond"


    // $ANTLR start "entryRuleBondSideOrWildcard"
    // InternalReactionLanguage.g:1256:1: entryRuleBondSideOrWildcard returns [EObject current=null] : iv_ruleBondSideOrWildcard= ruleBondSideOrWildcard EOF ;
    public final EObject entryRuleBondSideOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBondSideOrWildcard = null;


        try {
            // InternalReactionLanguage.g:1256:59: (iv_ruleBondSideOrWildcard= ruleBondSideOrWildcard EOF )
            // InternalReactionLanguage.g:1257:2: iv_ruleBondSideOrWildcard= ruleBondSideOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getBondSideOrWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBondSideOrWildcard=ruleBondSideOrWildcard();

            state._fsp--;

             current =iv_ruleBondSideOrWildcard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBondSideOrWildcard"


    // $ANTLR start "ruleBondSideOrWildcard"
    // InternalReactionLanguage.g:1263:1: ruleBondSideOrWildcard returns [EObject current=null] : (this_BondSide_0= ruleBondSide | ( (lv_wildcard_1_0= ruleWildcard ) ) ) ;
    public final EObject ruleBondSideOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject this_BondSide_0 = null;

        EObject lv_wildcard_1_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1269:2: ( (this_BondSide_0= ruleBondSide | ( (lv_wildcard_1_0= ruleWildcard ) ) ) )
            // InternalReactionLanguage.g:1270:2: (this_BondSide_0= ruleBondSide | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            {
            // InternalReactionLanguage.g:1270:2: (this_BondSide_0= ruleBondSide | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ANYTHING && LA19_0<=RULE_NULL)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalReactionLanguage.g:1271:3: this_BondSide_0= ruleBondSide
                    {

                    			newCompositeNode(grammarAccess.getBondSideOrWildcardAccess().getBondSideParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BondSide_0=ruleBondSide();

                    state._fsp--;


                    			current = this_BondSide_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1280:3: ( (lv_wildcard_1_0= ruleWildcard ) )
                    {
                    // InternalReactionLanguage.g:1280:3: ( (lv_wildcard_1_0= ruleWildcard ) )
                    // InternalReactionLanguage.g:1281:4: (lv_wildcard_1_0= ruleWildcard )
                    {
                    // InternalReactionLanguage.g:1281:4: (lv_wildcard_1_0= ruleWildcard )
                    // InternalReactionLanguage.g:1282:5: lv_wildcard_1_0= ruleWildcard
                    {

                    					newCompositeNode(grammarAccess.getBondSideOrWildcardAccess().getWildcardWildcardParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wildcard_1_0=ruleWildcard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBondSideOrWildcardRule());
                    					}
                    					set(
                    						current,
                    						"wildcard",
                    						lv_wildcard_1_0,
                    						"org.reaction.dsl.ReactionLanguage.Wildcard");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBondSideOrWildcard"


    // $ANTLR start "entryRuleWildcard"
    // InternalReactionLanguage.g:1303:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalReactionLanguage.g:1303:49: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalReactionLanguage.g:1304:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalReactionLanguage.g:1310:1: ruleWildcard returns [EObject current=null] : ( ( (lv_anything_0_0= RULE_ANYTHING ) ) | ( (lv_nothing_1_0= RULE_NULL ) ) ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_anything_0_0=null;
        Token lv_nothing_1_0=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:1316:2: ( ( ( (lv_anything_0_0= RULE_ANYTHING ) ) | ( (lv_nothing_1_0= RULE_NULL ) ) ) )
            // InternalReactionLanguage.g:1317:2: ( ( (lv_anything_0_0= RULE_ANYTHING ) ) | ( (lv_nothing_1_0= RULE_NULL ) ) )
            {
            // InternalReactionLanguage.g:1317:2: ( ( (lv_anything_0_0= RULE_ANYTHING ) ) | ( (lv_nothing_1_0= RULE_NULL ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ANYTHING) ) {
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
                    // InternalReactionLanguage.g:1318:3: ( (lv_anything_0_0= RULE_ANYTHING ) )
                    {
                    // InternalReactionLanguage.g:1318:3: ( (lv_anything_0_0= RULE_ANYTHING ) )
                    // InternalReactionLanguage.g:1319:4: (lv_anything_0_0= RULE_ANYTHING )
                    {
                    // InternalReactionLanguage.g:1319:4: (lv_anything_0_0= RULE_ANYTHING )
                    // InternalReactionLanguage.g:1320:5: lv_anything_0_0= RULE_ANYTHING
                    {
                    lv_anything_0_0=(Token)match(input,RULE_ANYTHING,FOLLOW_2); 

                    					newLeafNode(lv_anything_0_0, grammarAccess.getWildcardAccess().getAnythingANYTHINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWildcardRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"anything",
                    						true,
                    						"org.reaction.dsl.ReactionLanguage.ANYTHING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1337:3: ( (lv_nothing_1_0= RULE_NULL ) )
                    {
                    // InternalReactionLanguage.g:1337:3: ( (lv_nothing_1_0= RULE_NULL ) )
                    // InternalReactionLanguage.g:1338:4: (lv_nothing_1_0= RULE_NULL )
                    {
                    // InternalReactionLanguage.g:1338:4: (lv_nothing_1_0= RULE_NULL )
                    // InternalReactionLanguage.g:1339:5: lv_nothing_1_0= RULE_NULL
                    {
                    lv_nothing_1_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_nothing_1_0, grammarAccess.getWildcardAccess().getNothingNULLTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWildcardRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"nothing",
                    						true,
                    						"org.reaction.dsl.ReactionLanguage.NULL");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleBondSide"
    // InternalReactionLanguage.g:1359:1: entryRuleBondSide returns [EObject current=null] : iv_ruleBondSide= ruleBondSide EOF ;
    public final EObject entryRuleBondSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBondSide = null;


        try {
            // InternalReactionLanguage.g:1359:49: (iv_ruleBondSide= ruleBondSide EOF )
            // InternalReactionLanguage.g:1360:2: iv_ruleBondSide= ruleBondSide EOF
            {
             newCompositeNode(grammarAccess.getBondSideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBondSide=ruleBondSide();

            state._fsp--;

             current =iv_ruleBondSide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBondSide"


    // $ANTLR start "ruleBondSide"
    // InternalReactionLanguage.g:1366:1: ruleBondSide returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )? ) ;
    public final EObject ruleBondSide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_index_2_0 = null;

        EObject lv_siteInstance_5_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1372:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )? ) )
            // InternalReactionLanguage.g:1373:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )? )
            {
            // InternalReactionLanguage.g:1373:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )? )
            // InternalReactionLanguage.g:1374:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )?
            {
            // InternalReactionLanguage.g:1374:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionLanguage.g:1375:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionLanguage.g:1375:4: (otherlv_0= RULE_ID )
            // InternalReactionLanguage.g:1376:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBondSideRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getBondSideAccess().getAbstractAgentAbstractAgentCrossReference_0_0());
            				

            }


            }

            // InternalReactionLanguage.g:1387:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReactionLanguage.g:1388:4: ( (lv_array_1_0= '[' ) ) ( (lv_index_2_0= ruleUnsignedInt ) ) otherlv_3= ']'
                    {
                    // InternalReactionLanguage.g:1388:4: ( (lv_array_1_0= '[' ) )
                    // InternalReactionLanguage.g:1389:5: (lv_array_1_0= '[' )
                    {
                    // InternalReactionLanguage.g:1389:5: (lv_array_1_0= '[' )
                    // InternalReactionLanguage.g:1390:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,18,FOLLOW_26); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getBondSideAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBondSideRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalReactionLanguage.g:1402:4: ( (lv_index_2_0= ruleUnsignedInt ) )
                    // InternalReactionLanguage.g:1403:5: (lv_index_2_0= ruleUnsignedInt )
                    {
                    // InternalReactionLanguage.g:1403:5: (lv_index_2_0= ruleUnsignedInt )
                    // InternalReactionLanguage.g:1404:6: lv_index_2_0= ruleUnsignedInt
                    {

                    						newCompositeNode(grammarAccess.getBondSideAccess().getIndexUnsignedIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_index_2_0=ruleUnsignedInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBondSideRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.reaction.dsl.ReactionLanguage.UnsignedInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getBondSideAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalReactionLanguage.g:1426:3: (otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalReactionLanguage.g:1427:4: otherlv_4= '.' ( (lv_siteInstance_5_0= ruleSiteInstance ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getBondSideAccess().getFullStopKeyword_2_0());
                    			
                    // InternalReactionLanguage.g:1431:4: ( (lv_siteInstance_5_0= ruleSiteInstance ) )
                    // InternalReactionLanguage.g:1432:5: (lv_siteInstance_5_0= ruleSiteInstance )
                    {
                    // InternalReactionLanguage.g:1432:5: (lv_siteInstance_5_0= ruleSiteInstance )
                    // InternalReactionLanguage.g:1433:6: lv_siteInstance_5_0= ruleSiteInstance
                    {

                    						newCompositeNode(grammarAccess.getBondSideAccess().getSiteInstanceSiteInstanceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_siteInstance_5_0=ruleSiteInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBondSideRule());
                    						}
                    						set(
                    							current,
                    							"siteInstance",
                    							lv_siteInstance_5_0,
                    							"org.reaction.dsl.ReactionLanguage.SiteInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBondSide"


    // $ANTLR start "entryRuleSiteInstance"
    // InternalReactionLanguage.g:1455:1: entryRuleSiteInstance returns [EObject current=null] : iv_ruleSiteInstance= ruleSiteInstance EOF ;
    public final EObject entryRuleSiteInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteInstance = null;


        try {
            // InternalReactionLanguage.g:1455:53: (iv_ruleSiteInstance= ruleSiteInstance EOF )
            // InternalReactionLanguage.g:1456:2: iv_ruleSiteInstance= ruleSiteInstance EOF
            {
             newCompositeNode(grammarAccess.getSiteInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteInstance=ruleSiteInstance();

            state._fsp--;

             current =iv_ruleSiteInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteInstance"


    // $ANTLR start "ruleSiteInstance"
    // InternalReactionLanguage.g:1462:1: ruleSiteInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteInstanceState ) )? ) ;
    public final EObject ruleSiteInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_siteState_1_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1468:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteInstanceState ) )? ) )
            // InternalReactionLanguage.g:1469:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteInstanceState ) )? )
            {
            // InternalReactionLanguage.g:1469:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteInstanceState ) )? )
            // InternalReactionLanguage.g:1470:3: ( (otherlv_0= RULE_ID ) ) ( (lv_siteState_1_0= ruleSiteInstanceState ) )?
            {
            // InternalReactionLanguage.g:1470:3: ( (otherlv_0= RULE_ID ) )
            // InternalReactionLanguage.g:1471:4: (otherlv_0= RULE_ID )
            {
            // InternalReactionLanguage.g:1471:4: (otherlv_0= RULE_ID )
            // InternalReactionLanguage.g:1472:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getSiteInstanceAccess().getSiteSiteCrossReference_0_0());
            				

            }


            }

            // InternalReactionLanguage.g:1483:3: ( (lv_siteState_1_0= ruleSiteInstanceState ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReactionLanguage.g:1484:4: (lv_siteState_1_0= ruleSiteInstanceState )
                    {
                    // InternalReactionLanguage.g:1484:4: (lv_siteState_1_0= ruleSiteInstanceState )
                    // InternalReactionLanguage.g:1485:5: lv_siteState_1_0= ruleSiteInstanceState
                    {

                    					newCompositeNode(grammarAccess.getSiteInstanceAccess().getSiteStateSiteInstanceStateParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_siteState_1_0=ruleSiteInstanceState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSiteInstanceRule());
                    					}
                    					set(
                    						current,
                    						"siteState",
                    						lv_siteState_1_0,
                    						"org.reaction.dsl.ReactionLanguage.SiteInstanceState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteInstance"


    // $ANTLR start "entryRuleSiteInstanceState"
    // InternalReactionLanguage.g:1506:1: entryRuleSiteInstanceState returns [EObject current=null] : iv_ruleSiteInstanceState= ruleSiteInstanceState EOF ;
    public final EObject entryRuleSiteInstanceState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteInstanceState = null;


        try {
            // InternalReactionLanguage.g:1506:58: (iv_ruleSiteInstanceState= ruleSiteInstanceState EOF )
            // InternalReactionLanguage.g:1507:2: iv_ruleSiteInstanceState= ruleSiteInstanceState EOF
            {
             newCompositeNode(grammarAccess.getSiteInstanceStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteInstanceState=ruleSiteInstanceState();

            state._fsp--;

             current =iv_ruleSiteInstanceState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteInstanceState"


    // $ANTLR start "ruleSiteInstanceState"
    // InternalReactionLanguage.g:1513:1: ruleSiteInstanceState returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleSiteInstanceState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:1519:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalReactionLanguage.g:1520:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalReactionLanguage.g:1520:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // InternalReactionLanguage.g:1521:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteInstanceStateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalReactionLanguage.g:1525:3: ( (otherlv_1= RULE_ID ) )
            // InternalReactionLanguage.g:1526:4: (otherlv_1= RULE_ID )
            {
            // InternalReactionLanguage.g:1526:4: (otherlv_1= RULE_ID )
            // InternalReactionLanguage.g:1527:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteInstanceStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getSiteInstanceStateAccess().getStateSiteStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteInstanceStateAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteInstanceState"


    // $ANTLR start "entryRuleVariable"
    // InternalReactionLanguage.g:1546:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalReactionLanguage.g:1546:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalReactionLanguage.g:1547:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalReactionLanguage.g:1553:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticExpr ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1559:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticExpr ) ) ) )
            // InternalReactionLanguage.g:1560:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticExpr ) ) )
            {
            // InternalReactionLanguage.g:1560:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticExpr ) ) )
            // InternalReactionLanguage.g:1561:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleArithmeticExpr ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalReactionLanguage.g:1565:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionLanguage.g:1566:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionLanguage.g:1566:4: (lv_name_1_0= RULE_ID )
            // InternalReactionLanguage.g:1567:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalReactionLanguage.g:1587:3: ( (lv_value_3_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:1588:4: (lv_value_3_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:1588:4: (lv_value_3_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:1589:5: lv_value_3_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValueArithmeticExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInitialisation"
    // InternalReactionLanguage.g:1610:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // InternalReactionLanguage.g:1610:55: (iv_ruleInitialisation= ruleInitialisation EOF )
            // InternalReactionLanguage.g:1611:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalReactionLanguage.g:1617:1: ruleInitialisation returns [EObject current=null] : ( ( (lv_head_0_0= ruleInitialisationHead ) ) ( (lv_body_1_0= ruleInitialisationBody ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject lv_head_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1623:2: ( ( ( (lv_head_0_0= ruleInitialisationHead ) ) ( (lv_body_1_0= ruleInitialisationBody ) ) ) )
            // InternalReactionLanguage.g:1624:2: ( ( (lv_head_0_0= ruleInitialisationHead ) ) ( (lv_body_1_0= ruleInitialisationBody ) ) )
            {
            // InternalReactionLanguage.g:1624:2: ( ( (lv_head_0_0= ruleInitialisationHead ) ) ( (lv_body_1_0= ruleInitialisationBody ) ) )
            // InternalReactionLanguage.g:1625:3: ( (lv_head_0_0= ruleInitialisationHead ) ) ( (lv_body_1_0= ruleInitialisationBody ) )
            {
            // InternalReactionLanguage.g:1625:3: ( (lv_head_0_0= ruleInitialisationHead ) )
            // InternalReactionLanguage.g:1626:4: (lv_head_0_0= ruleInitialisationHead )
            {
            // InternalReactionLanguage.g:1626:4: (lv_head_0_0= ruleInitialisationHead )
            // InternalReactionLanguage.g:1627:5: lv_head_0_0= ruleInitialisationHead
            {

            					newCompositeNode(grammarAccess.getInitialisationAccess().getHeadInitialisationHeadParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_head_0_0=ruleInitialisationHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialisationRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_0_0,
            						"org.reaction.dsl.ReactionLanguage.InitialisationHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReactionLanguage.g:1644:3: ( (lv_body_1_0= ruleInitialisationBody ) )
            // InternalReactionLanguage.g:1645:4: (lv_body_1_0= ruleInitialisationBody )
            {
            // InternalReactionLanguage.g:1645:4: (lv_body_1_0= ruleInitialisationBody )
            // InternalReactionLanguage.g:1646:5: lv_body_1_0= ruleInitialisationBody
            {

            					newCompositeNode(grammarAccess.getInitialisationAccess().getBodyInitialisationBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleInitialisationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialisationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.reaction.dsl.ReactionLanguage.InitialisationBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleInitialisationHead"
    // InternalReactionLanguage.g:1667:1: entryRuleInitialisationHead returns [EObject current=null] : iv_ruleInitialisationHead= ruleInitialisationHead EOF ;
    public final EObject entryRuleInitialisationHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisationHead = null;


        try {
            // InternalReactionLanguage.g:1667:59: (iv_ruleInitialisationHead= ruleInitialisationHead EOF )
            // InternalReactionLanguage.g:1668:2: iv_ruleInitialisationHead= ruleInitialisationHead EOF
            {
             newCompositeNode(grammarAccess.getInitialisationHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisationHead=ruleInitialisationHead();

            state._fsp--;

             current =iv_ruleInitialisationHead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialisationHead"


    // $ANTLR start "ruleInitialisationHead"
    // InternalReactionLanguage.g:1674:1: ruleInitialisationHead returns [EObject current=null] : (otherlv_0= 'init' ( (lv_cnt_1_0= ruleArithmeticExpr ) ) ) ;
    public final EObject ruleInitialisationHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cnt_1_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1680:2: ( (otherlv_0= 'init' ( (lv_cnt_1_0= ruleArithmeticExpr ) ) ) )
            // InternalReactionLanguage.g:1681:2: (otherlv_0= 'init' ( (lv_cnt_1_0= ruleArithmeticExpr ) ) )
            {
            // InternalReactionLanguage.g:1681:2: (otherlv_0= 'init' ( (lv_cnt_1_0= ruleArithmeticExpr ) ) )
            // InternalReactionLanguage.g:1682:3: otherlv_0= 'init' ( (lv_cnt_1_0= ruleArithmeticExpr ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialisationHeadAccess().getInitKeyword_0());
            		
            // InternalReactionLanguage.g:1686:3: ( (lv_cnt_1_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:1687:4: (lv_cnt_1_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:1687:4: (lv_cnt_1_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:1688:5: lv_cnt_1_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getInitialisationHeadAccess().getCntArithmeticExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cnt_1_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialisationHeadRule());
            					}
            					set(
            						current,
            						"cnt",
            						lv_cnt_1_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialisationHead"


    // $ANTLR start "entryRuleInitialisationBody"
    // InternalReactionLanguage.g:1709:1: entryRuleInitialisationBody returns [EObject current=null] : iv_ruleInitialisationBody= ruleInitialisationBody EOF ;
    public final EObject entryRuleInitialisationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisationBody = null;


        try {
            // InternalReactionLanguage.g:1709:59: (iv_ruleInitialisationBody= ruleInitialisationBody EOF )
            // InternalReactionLanguage.g:1710:2: iv_ruleInitialisationBody= ruleInitialisationBody EOF
            {
             newCompositeNode(grammarAccess.getInitialisationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisationBody=ruleInitialisationBody();

            state._fsp--;

             current =iv_ruleInitialisationBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialisationBody"


    // $ANTLR start "ruleInitialisationBody"
    // InternalReactionLanguage.g:1716:1: ruleInitialisationBody returns [EObject current=null] : ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) ) ;
    public final EObject ruleInitialisationBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_signature_0_0 = null;

        EObject lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1722:2: ( ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) ) )
            // InternalReactionLanguage.g:1723:2: ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) )
            {
            // InternalReactionLanguage.g:1723:2: ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) )
            // InternalReactionLanguage.g:1724:3: ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) )
            {
            // InternalReactionLanguage.g:1724:3: ( (lv_signature_0_0= ruleSignature ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalReactionLanguage.g:1725:4: (lv_signature_0_0= ruleSignature )
                    {
                    // InternalReactionLanguage.g:1725:4: (lv_signature_0_0= ruleSignature )
                    // InternalReactionLanguage.g:1726:5: lv_signature_0_0= ruleSignature
                    {

                    					newCompositeNode(grammarAccess.getInitialisationBodyAccess().getSignatureSignatureParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_signature_0_0=ruleSignature();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInitialisationBodyRule());
                    					}
                    					set(
                    						current,
                    						"signature",
                    						lv_signature_0_0,
                    						"org.reaction.dsl.ReactionLanguage.Signature");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialisationBodyAccess().getColonKeyword_1());
            		
            // InternalReactionLanguage.g:1747:3: ( (lv_pattern_2_0= rulePattern ) )
            // InternalReactionLanguage.g:1748:4: (lv_pattern_2_0= rulePattern )
            {
            // InternalReactionLanguage.g:1748:4: (lv_pattern_2_0= rulePattern )
            // InternalReactionLanguage.g:1749:5: lv_pattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getInitialisationBodyAccess().getPatternPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialisationBodyRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"org.reaction.dsl.ReactionLanguage.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialisationBody"


    // $ANTLR start "entryRuleObservable"
    // InternalReactionLanguage.g:1770:1: entryRuleObservable returns [EObject current=null] : iv_ruleObservable= ruleObservable EOF ;
    public final EObject entryRuleObservable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservable = null;


        try {
            // InternalReactionLanguage.g:1770:51: (iv_ruleObservable= ruleObservable EOF )
            // InternalReactionLanguage.g:1771:2: iv_ruleObservable= ruleObservable EOF
            {
             newCompositeNode(grammarAccess.getObservableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservable=ruleObservable();

            state._fsp--;

             current =iv_ruleObservable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObservable"


    // $ANTLR start "ruleObservable"
    // InternalReactionLanguage.g:1777:1: ruleObservable returns [EObject current=null] : (otherlv_0= 'observe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleObservableBody ) ) ) ;
    public final EObject ruleObservable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1783:2: ( (otherlv_0= 'observe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleObservableBody ) ) ) )
            // InternalReactionLanguage.g:1784:2: (otherlv_0= 'observe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleObservableBody ) ) )
            {
            // InternalReactionLanguage.g:1784:2: (otherlv_0= 'observe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleObservableBody ) ) )
            // InternalReactionLanguage.g:1785:3: otherlv_0= 'observe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleObservableBody ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObservableAccess().getObserveKeyword_0());
            		
            // InternalReactionLanguage.g:1789:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReactionLanguage.g:1790:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReactionLanguage.g:1790:4: (lv_name_1_0= RULE_ID )
            // InternalReactionLanguage.g:1791:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObservableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObservableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReactionLanguage.g:1807:3: ( (lv_body_2_0= ruleObservableBody ) )
            // InternalReactionLanguage.g:1808:4: (lv_body_2_0= ruleObservableBody )
            {
            // InternalReactionLanguage.g:1808:4: (lv_body_2_0= ruleObservableBody )
            // InternalReactionLanguage.g:1809:5: lv_body_2_0= ruleObservableBody
            {

            					newCompositeNode(grammarAccess.getObservableAccess().getBodyObservableBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleObservableBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObservableRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"org.reaction.dsl.ReactionLanguage.ObservableBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObservable"


    // $ANTLR start "entryRuleObservableBody"
    // InternalReactionLanguage.g:1830:1: entryRuleObservableBody returns [EObject current=null] : iv_ruleObservableBody= ruleObservableBody EOF ;
    public final EObject entryRuleObservableBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservableBody = null;


        try {
            // InternalReactionLanguage.g:1830:55: (iv_ruleObservableBody= ruleObservableBody EOF )
            // InternalReactionLanguage.g:1831:2: iv_ruleObservableBody= ruleObservableBody EOF
            {
             newCompositeNode(grammarAccess.getObservableBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservableBody=ruleObservableBody();

            state._fsp--;

             current =iv_ruleObservableBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObservableBody"


    // $ANTLR start "ruleObservableBody"
    // InternalReactionLanguage.g:1837:1: ruleObservableBody returns [EObject current=null] : this_ObservablePattern_0= ruleObservablePattern ;
    public final EObject ruleObservableBody() throws RecognitionException {
        EObject current = null;

        EObject this_ObservablePattern_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1843:2: (this_ObservablePattern_0= ruleObservablePattern )
            // InternalReactionLanguage.g:1844:2: this_ObservablePattern_0= ruleObservablePattern
            {

            		newCompositeNode(grammarAccess.getObservableBodyAccess().getObservablePatternParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ObservablePattern_0=ruleObservablePattern();

            state._fsp--;


            		current = this_ObservablePattern_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObservableBody"


    // $ANTLR start "entryRuleObservablePattern"
    // InternalReactionLanguage.g:1855:1: entryRuleObservablePattern returns [EObject current=null] : iv_ruleObservablePattern= ruleObservablePattern EOF ;
    public final EObject entryRuleObservablePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservablePattern = null;


        try {
            // InternalReactionLanguage.g:1855:58: (iv_ruleObservablePattern= ruleObservablePattern EOF )
            // InternalReactionLanguage.g:1856:2: iv_ruleObservablePattern= ruleObservablePattern EOF
            {
             newCompositeNode(grammarAccess.getObservablePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservablePattern=ruleObservablePattern();

            state._fsp--;

             current =iv_ruleObservablePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObservablePattern"


    // $ANTLR start "ruleObservablePattern"
    // InternalReactionLanguage.g:1862:1: ruleObservablePattern returns [EObject current=null] : ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) ) ;
    public final EObject ruleObservablePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_signature_0_0 = null;

        EObject lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1868:2: ( ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) ) )
            // InternalReactionLanguage.g:1869:2: ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) )
            {
            // InternalReactionLanguage.g:1869:2: ( ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) ) )
            // InternalReactionLanguage.g:1870:3: ( (lv_signature_0_0= ruleSignature ) )? otherlv_1= ':' ( (lv_pattern_2_0= rulePattern ) )
            {
            // InternalReactionLanguage.g:1870:3: ( (lv_signature_0_0= ruleSignature ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalReactionLanguage.g:1871:4: (lv_signature_0_0= ruleSignature )
                    {
                    // InternalReactionLanguage.g:1871:4: (lv_signature_0_0= ruleSignature )
                    // InternalReactionLanguage.g:1872:5: lv_signature_0_0= ruleSignature
                    {

                    					newCompositeNode(grammarAccess.getObservablePatternAccess().getSignatureSignatureParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_signature_0_0=ruleSignature();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObservablePatternRule());
                    					}
                    					set(
                    						current,
                    						"signature",
                    						lv_signature_0_0,
                    						"org.reaction.dsl.ReactionLanguage.Signature");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getObservablePatternAccess().getColonKeyword_1());
            		
            // InternalReactionLanguage.g:1893:3: ( (lv_pattern_2_0= rulePattern ) )
            // InternalReactionLanguage.g:1894:4: (lv_pattern_2_0= rulePattern )
            {
            // InternalReactionLanguage.g:1894:4: (lv_pattern_2_0= rulePattern )
            // InternalReactionLanguage.g:1895:5: lv_pattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getObservablePatternAccess().getPatternPatternParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObservablePatternRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"org.reaction.dsl.ReactionLanguage.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObservablePattern"


    // $ANTLR start "entryRuleCommand"
    // InternalReactionLanguage.g:1916:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalReactionLanguage.g:1916:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalReactionLanguage.g:1917:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalReactionLanguage.g:1923:1: ruleCommand returns [EObject current=null] : this_TerminateCommand_0= ruleTerminateCommand ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_TerminateCommand_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1929:2: (this_TerminateCommand_0= ruleTerminateCommand )
            // InternalReactionLanguage.g:1930:2: this_TerminateCommand_0= ruleTerminateCommand
            {

            		newCompositeNode(grammarAccess.getCommandAccess().getTerminateCommandParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TerminateCommand_0=ruleTerminateCommand();

            state._fsp--;


            		current = this_TerminateCommand_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleTerminateCommand"
    // InternalReactionLanguage.g:1941:1: entryRuleTerminateCommand returns [EObject current=null] : iv_ruleTerminateCommand= ruleTerminateCommand EOF ;
    public final EObject entryRuleTerminateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminateCommand = null;


        try {
            // InternalReactionLanguage.g:1941:57: (iv_ruleTerminateCommand= ruleTerminateCommand EOF )
            // InternalReactionLanguage.g:1942:2: iv_ruleTerminateCommand= ruleTerminateCommand EOF
            {
             newCompositeNode(grammarAccess.getTerminateCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminateCommand=ruleTerminateCommand();

            state._fsp--;

             current =iv_ruleTerminateCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminateCommand"


    // $ANTLR start "ruleTerminateCommand"
    // InternalReactionLanguage.g:1948:1: ruleTerminateCommand returns [EObject current=null] : (otherlv_0= 'terminate' this_TerminateBody_1= ruleTerminateBody ) ;
    public final EObject ruleTerminateCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TerminateBody_1 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1954:2: ( (otherlv_0= 'terminate' this_TerminateBody_1= ruleTerminateBody ) )
            // InternalReactionLanguage.g:1955:2: (otherlv_0= 'terminate' this_TerminateBody_1= ruleTerminateBody )
            {
            // InternalReactionLanguage.g:1955:2: (otherlv_0= 'terminate' this_TerminateBody_1= ruleTerminateBody )
            // InternalReactionLanguage.g:1956:3: otherlv_0= 'terminate' this_TerminateBody_1= ruleTerminateBody
            {
            otherlv_0=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminateCommandAccess().getTerminateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTerminateCommandAccess().getTerminateBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_TerminateBody_1=ruleTerminateBody();

            state._fsp--;


            			current = this_TerminateBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminateCommand"


    // $ANTLR start "entryRuleTerminateBody"
    // InternalReactionLanguage.g:1972:1: entryRuleTerminateBody returns [EObject current=null] : iv_ruleTerminateBody= ruleTerminateBody EOF ;
    public final EObject entryRuleTerminateBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminateBody = null;


        try {
            // InternalReactionLanguage.g:1972:54: (iv_ruleTerminateBody= ruleTerminateBody EOF )
            // InternalReactionLanguage.g:1973:2: iv_ruleTerminateBody= ruleTerminateBody EOF
            {
             newCompositeNode(grammarAccess.getTerminateBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminateBody=ruleTerminateBody();

            state._fsp--;

             current =iv_ruleTerminateBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminateBody"


    // $ANTLR start "ruleTerminateBody"
    // InternalReactionLanguage.g:1979:1: ruleTerminateBody returns [EObject current=null] : (this_TerminateTime_0= ruleTerminateTime | this_TerminateIterations_1= ruleTerminateIterations | this_TerminateCount_2= ruleTerminateCount ) ;
    public final EObject ruleTerminateBody() throws RecognitionException {
        EObject current = null;

        EObject this_TerminateTime_0 = null;

        EObject this_TerminateIterations_1 = null;

        EObject this_TerminateCount_2 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:1985:2: ( (this_TerminateTime_0= ruleTerminateTime | this_TerminateIterations_1= ruleTerminateIterations | this_TerminateCount_2= ruleTerminateCount ) )
            // InternalReactionLanguage.g:1986:2: (this_TerminateTime_0= ruleTerminateTime | this_TerminateIterations_1= ruleTerminateIterations | this_TerminateCount_2= ruleTerminateCount )
            {
            // InternalReactionLanguage.g:1986:2: (this_TerminateTime_0= ruleTerminateTime | this_TerminateIterations_1= ruleTerminateIterations | this_TerminateCount_2= ruleTerminateCount )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
            case 20:
            case 27:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalReactionLanguage.g:1987:3: this_TerminateTime_0= ruleTerminateTime
                    {

                    			newCompositeNode(grammarAccess.getTerminateBodyAccess().getTerminateTimeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminateTime_0=ruleTerminateTime();

                    state._fsp--;


                    			current = this_TerminateTime_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:1996:3: this_TerminateIterations_1= ruleTerminateIterations
                    {

                    			newCompositeNode(grammarAccess.getTerminateBodyAccess().getTerminateIterationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminateIterations_1=ruleTerminateIterations();

                    state._fsp--;


                    			current = this_TerminateIterations_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:2005:3: this_TerminateCount_2= ruleTerminateCount
                    {

                    			newCompositeNode(grammarAccess.getTerminateBodyAccess().getTerminateCountParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminateCount_2=ruleTerminateCount();

                    state._fsp--;


                    			current = this_TerminateCount_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminateBody"


    // $ANTLR start "entryRuleTerminateTime"
    // InternalReactionLanguage.g:2017:1: entryRuleTerminateTime returns [EObject current=null] : iv_ruleTerminateTime= ruleTerminateTime EOF ;
    public final EObject entryRuleTerminateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminateTime = null;


        try {
            // InternalReactionLanguage.g:2017:54: (iv_ruleTerminateTime= ruleTerminateTime EOF )
            // InternalReactionLanguage.g:2018:2: iv_ruleTerminateTime= ruleTerminateTime EOF
            {
             newCompositeNode(grammarAccess.getTerminateTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminateTime=ruleTerminateTime();

            state._fsp--;

             current =iv_ruleTerminateTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminateTime"


    // $ANTLR start "ruleTerminateTime"
    // InternalReactionLanguage.g:2024:1: ruleTerminateTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= '=' ( (lv_time_2_0= ruleArithmeticExpr ) ) ) ;
    public final EObject ruleTerminateTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2030:2: ( (otherlv_0= 'time' otherlv_1= '=' ( (lv_time_2_0= ruleArithmeticExpr ) ) ) )
            // InternalReactionLanguage.g:2031:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_time_2_0= ruleArithmeticExpr ) ) )
            {
            // InternalReactionLanguage.g:2031:2: (otherlv_0= 'time' otherlv_1= '=' ( (lv_time_2_0= ruleArithmeticExpr ) ) )
            // InternalReactionLanguage.g:2032:3: otherlv_0= 'time' otherlv_1= '=' ( (lv_time_2_0= ruleArithmeticExpr ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminateTimeAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminateTimeAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionLanguage.g:2040:3: ( (lv_time_2_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:2041:4: (lv_time_2_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:2041:4: (lv_time_2_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:2042:5: lv_time_2_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getTerminateTimeAccess().getTimeArithmeticExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_2_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminateTimeRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminateTime"


    // $ANTLR start "entryRuleTerminateIterations"
    // InternalReactionLanguage.g:2063:1: entryRuleTerminateIterations returns [EObject current=null] : iv_ruleTerminateIterations= ruleTerminateIterations EOF ;
    public final EObject entryRuleTerminateIterations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminateIterations = null;


        try {
            // InternalReactionLanguage.g:2063:60: (iv_ruleTerminateIterations= ruleTerminateIterations EOF )
            // InternalReactionLanguage.g:2064:2: iv_ruleTerminateIterations= ruleTerminateIterations EOF
            {
             newCompositeNode(grammarAccess.getTerminateIterationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminateIterations=ruleTerminateIterations();

            state._fsp--;

             current =iv_ruleTerminateIterations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminateIterations"


    // $ANTLR start "ruleTerminateIterations"
    // InternalReactionLanguage.g:2070:1: ruleTerminateIterations returns [EObject current=null] : (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_iterations_2_0= ruleArithmeticExpr ) ) ) ;
    public final EObject ruleTerminateIterations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_iterations_2_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2076:2: ( (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_iterations_2_0= ruleArithmeticExpr ) ) ) )
            // InternalReactionLanguage.g:2077:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_iterations_2_0= ruleArithmeticExpr ) ) )
            {
            // InternalReactionLanguage.g:2077:2: (otherlv_0= 'iterations' otherlv_1= '=' ( (lv_iterations_2_0= ruleArithmeticExpr ) ) )
            // InternalReactionLanguage.g:2078:3: otherlv_0= 'iterations' otherlv_1= '=' ( (lv_iterations_2_0= ruleArithmeticExpr ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminateIterationsAccess().getIterationsKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminateIterationsAccess().getEqualsSignKeyword_1());
            		
            // InternalReactionLanguage.g:2086:3: ( (lv_iterations_2_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:2087:4: (lv_iterations_2_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:2087:4: (lv_iterations_2_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:2088:5: lv_iterations_2_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getTerminateIterationsAccess().getIterationsArithmeticExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_iterations_2_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminateIterationsRule());
            					}
            					set(
            						current,
            						"iterations",
            						lv_iterations_2_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminateIterations"


    // $ANTLR start "entryRuleTerminateCount"
    // InternalReactionLanguage.g:2109:1: entryRuleTerminateCount returns [EObject current=null] : iv_ruleTerminateCount= ruleTerminateCount EOF ;
    public final EObject entryRuleTerminateCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminateCount = null;


        try {
            // InternalReactionLanguage.g:2109:55: (iv_ruleTerminateCount= ruleTerminateCount EOF )
            // InternalReactionLanguage.g:2110:2: iv_ruleTerminateCount= ruleTerminateCount EOF
            {
             newCompositeNode(grammarAccess.getTerminateCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminateCount=ruleTerminateCount();

            state._fsp--;

             current =iv_ruleTerminateCount; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminateCount"


    // $ANTLR start "ruleTerminateCount"
    // InternalReactionLanguage.g:2116:1: ruleTerminateCount returns [EObject current=null] : ( ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )? ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= 'matches' otherlv_4= '=' ( (lv_cnt_5_0= ruleArithmeticExpr ) ) ) ;
    public final EObject ruleTerminateCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_signature_0_0 = null;

        EObject lv_pattern_2_0 = null;

        EObject lv_cnt_5_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2122:2: ( ( ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )? ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= 'matches' otherlv_4= '=' ( (lv_cnt_5_0= ruleArithmeticExpr ) ) ) )
            // InternalReactionLanguage.g:2123:2: ( ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )? ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= 'matches' otherlv_4= '=' ( (lv_cnt_5_0= ruleArithmeticExpr ) ) )
            {
            // InternalReactionLanguage.g:2123:2: ( ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )? ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= 'matches' otherlv_4= '=' ( (lv_cnt_5_0= ruleArithmeticExpr ) ) )
            // InternalReactionLanguage.g:2124:3: ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )? ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= 'matches' otherlv_4= '=' ( (lv_cnt_5_0= ruleArithmeticExpr ) )
            {
            // InternalReactionLanguage.g:2124:3: ( ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReactionLanguage.g:2125:4: ( (lv_signature_0_0= ruleSignature ) ) otherlv_1= ':'
                    {
                    // InternalReactionLanguage.g:2125:4: ( (lv_signature_0_0= ruleSignature ) )
                    // InternalReactionLanguage.g:2126:5: (lv_signature_0_0= ruleSignature )
                    {
                    // InternalReactionLanguage.g:2126:5: (lv_signature_0_0= ruleSignature )
                    // InternalReactionLanguage.g:2127:6: lv_signature_0_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getTerminateCountAccess().getSignatureSignatureParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_signature_0_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminateCountRule());
                    						}
                    						set(
                    							current,
                    							"signature",
                    							lv_signature_0_0,
                    							"org.reaction.dsl.ReactionLanguage.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getTerminateCountAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalReactionLanguage.g:2149:3: ( (lv_pattern_2_0= rulePattern ) )
            // InternalReactionLanguage.g:2150:4: (lv_pattern_2_0= rulePattern )
            {
            // InternalReactionLanguage.g:2150:4: (lv_pattern_2_0= rulePattern )
            // InternalReactionLanguage.g:2151:5: lv_pattern_2_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getTerminateCountAccess().getPatternPatternParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_pattern_2_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminateCountRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"org.reaction.dsl.ReactionLanguage.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getTerminateCountAccess().getMatchesKeyword_2());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminateCountAccess().getEqualsSignKeyword_3());
            		
            // InternalReactionLanguage.g:2176:3: ( (lv_cnt_5_0= ruleArithmeticExpr ) )
            // InternalReactionLanguage.g:2177:4: (lv_cnt_5_0= ruleArithmeticExpr )
            {
            // InternalReactionLanguage.g:2177:4: (lv_cnt_5_0= ruleArithmeticExpr )
            // InternalReactionLanguage.g:2178:5: lv_cnt_5_0= ruleArithmeticExpr
            {

            					newCompositeNode(grammarAccess.getTerminateCountAccess().getCntArithmeticExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_cnt_5_0=ruleArithmeticExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminateCountRule());
            					}
            					set(
            						current,
            						"cnt",
            						lv_cnt_5_0,
            						"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminateCount"


    // $ANTLR start "entryRuleArithmeticExpr"
    // InternalReactionLanguage.g:2199:1: entryRuleArithmeticExpr returns [EObject current=null] : iv_ruleArithmeticExpr= ruleArithmeticExpr EOF ;
    public final EObject entryRuleArithmeticExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpr = null;


        try {
            // InternalReactionLanguage.g:2199:55: (iv_ruleArithmeticExpr= ruleArithmeticExpr EOF )
            // InternalReactionLanguage.g:2200:2: iv_ruleArithmeticExpr= ruleArithmeticExpr EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpr=ruleArithmeticExpr();

            state._fsp--;

             current =iv_ruleArithmeticExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpr"


    // $ANTLR start "ruleArithmeticExpr"
    // InternalReactionLanguage.g:2206:1: ruleArithmeticExpr returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2212:2: (this_Addition_0= ruleAddition )
            // InternalReactionLanguage.g:2213:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getArithmeticExprAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpr"


    // $ANTLR start "entryRuleAddition"
    // InternalReactionLanguage.g:2224:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalReactionLanguage.g:2224:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalReactionLanguage.g:2225:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalReactionLanguage.g:2231:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2237:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalReactionLanguage.g:2238:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalReactionLanguage.g:2238:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalReactionLanguage.g:2239:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalReactionLanguage.g:2247:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalReactionLanguage.g:2248:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalReactionLanguage.g:2248:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==37) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==38) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalReactionLanguage.g:2249:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalReactionLanguage.g:2249:5: ( () otherlv_2= '+' )
            	            // InternalReactionLanguage.g:2250:6: () otherlv_2= '+'
            	            {
            	            // InternalReactionLanguage.g:2250:6: ()
            	            // InternalReactionLanguage.g:2251:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,37,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalReactionLanguage.g:2263:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalReactionLanguage.g:2263:5: ( () otherlv_4= '-' )
            	            // InternalReactionLanguage.g:2264:6: () otherlv_4= '-'
            	            {
            	            // InternalReactionLanguage.g:2264:6: ()
            	            // InternalReactionLanguage.g:2265:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,38,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalReactionLanguage.g:2277:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalReactionLanguage.g:2278:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalReactionLanguage.g:2278:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalReactionLanguage.g:2279:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.reaction.dsl.ReactionLanguage.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalReactionLanguage.g:2301:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalReactionLanguage.g:2301:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalReactionLanguage.g:2302:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalReactionLanguage.g:2308:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PrimaryExpr_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2314:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )* ) )
            // InternalReactionLanguage.g:2315:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )* )
            {
            // InternalReactionLanguage.g:2315:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )* )
            // InternalReactionLanguage.g:2316:3: this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;


            			current = this_PrimaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalReactionLanguage.g:2324:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=39 && LA31_0<=41)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalReactionLanguage.g:2325:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) ) ( (lv_right_7_0= rulePrimaryExpr ) )
            	    {
            	    // InternalReactionLanguage.g:2325:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '^' ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // InternalReactionLanguage.g:2326:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalReactionLanguage.g:2326:5: ( () otherlv_2= '*' )
            	            // InternalReactionLanguage.g:2327:6: () otherlv_2= '*'
            	            {
            	            // InternalReactionLanguage.g:2327:6: ()
            	            // InternalReactionLanguage.g:2328:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalReactionLanguage.g:2340:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalReactionLanguage.g:2340:5: ( () otherlv_4= '/' )
            	            // InternalReactionLanguage.g:2341:6: () otherlv_4= '/'
            	            {
            	            // InternalReactionLanguage.g:2341:6: ()
            	            // InternalReactionLanguage.g:2342:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalReactionLanguage.g:2354:5: ( () otherlv_6= '^' )
            	            {
            	            // InternalReactionLanguage.g:2354:5: ( () otherlv_6= '^' )
            	            // InternalReactionLanguage.g:2355:6: () otherlv_6= '^'
            	            {
            	            // InternalReactionLanguage.g:2355:6: ()
            	            // InternalReactionLanguage.g:2356:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getPowLeftAction_1_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_6=(Token)match(input,41,FOLLOW_22); 

            	            						newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getCircumflexAccentKeyword_1_0_2_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalReactionLanguage.g:2368:4: ( (lv_right_7_0= rulePrimaryExpr ) )
            	    // InternalReactionLanguage.g:2369:5: (lv_right_7_0= rulePrimaryExpr )
            	    {
            	    // InternalReactionLanguage.g:2369:5: (lv_right_7_0= rulePrimaryExpr )
            	    // InternalReactionLanguage.g:2370:6: lv_right_7_0= rulePrimaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_7_0=rulePrimaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_7_0,
            	    							"org.reaction.dsl.ReactionLanguage.PrimaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalReactionLanguage.g:2392:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalReactionLanguage.g:2392:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalReactionLanguage.g:2393:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalReactionLanguage.g:2399:1: rulePrimaryExpr returns [EObject current=null] : ( (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleArithmeticType ) ) ) | ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' ) | ( () ( (otherlv_11= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_ArithmeticExpr_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_func_6_0 = null;

        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2405:2: ( ( (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleArithmeticType ) ) ) | ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' ) | ( () ( (otherlv_11= RULE_ID ) ) ) ) )
            // InternalReactionLanguage.g:2406:2: ( (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleArithmeticType ) ) ) | ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' ) | ( () ( (otherlv_11= RULE_ID ) ) ) )
            {
            // InternalReactionLanguage.g:2406:2: ( (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleArithmeticType ) ) ) | ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' ) | ( () ( (otherlv_11= RULE_ID ) ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
            case RULE_NULL:
            case 38:
                {
                alt32=2;
                }
                break;
            case 43:
            case 44:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalReactionLanguage.g:2407:3: (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' )
                    {
                    // InternalReactionLanguage.g:2407:3: (otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')' )
                    // InternalReactionLanguage.g:2408:4: otherlv_0= '(' this_ArithmeticExpr_1= ruleArithmeticExpr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getArithmeticExprParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_ArithmeticExpr_1=ruleArithmeticExpr();

                    state._fsp--;


                    				current = this_ArithmeticExpr_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2426:3: ( () ( (lv_value_4_0= ruleArithmeticType ) ) )
                    {
                    // InternalReactionLanguage.g:2426:3: ( () ( (lv_value_4_0= ruleArithmeticType ) ) )
                    // InternalReactionLanguage.g:2427:4: () ( (lv_value_4_0= ruleArithmeticType ) )
                    {
                    // InternalReactionLanguage.g:2427:4: ()
                    // InternalReactionLanguage.g:2428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExprAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalReactionLanguage.g:2434:4: ( (lv_value_4_0= ruleArithmeticType ) )
                    // InternalReactionLanguage.g:2435:5: (lv_value_4_0= ruleArithmeticType )
                    {
                    // InternalReactionLanguage.g:2435:5: (lv_value_4_0= ruleArithmeticType )
                    // InternalReactionLanguage.g:2436:6: lv_value_4_0= ruleArithmeticType
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getValueArithmeticTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleArithmeticType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.reaction.dsl.ReactionLanguage.ArithmeticType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:2455:3: ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' )
                    {
                    // InternalReactionLanguage.g:2455:3: ( () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')' )
                    // InternalReactionLanguage.g:2456:4: () ( (lv_func_6_0= ruleMathFunc ) ) otherlv_7= '(' ( (lv_expr_8_0= ruleArithmeticExpr ) ) otherlv_9= ')'
                    {
                    // InternalReactionLanguage.g:2456:4: ()
                    // InternalReactionLanguage.g:2457:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExprAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalReactionLanguage.g:2463:4: ( (lv_func_6_0= ruleMathFunc ) )
                    // InternalReactionLanguage.g:2464:5: (lv_func_6_0= ruleMathFunc )
                    {
                    // InternalReactionLanguage.g:2464:5: (lv_func_6_0= ruleMathFunc )
                    // InternalReactionLanguage.g:2465:6: lv_func_6_0= ruleMathFunc
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getFuncMathFuncEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_func_6_0=ruleMathFunc();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"func",
                    							lv_func_6_0,
                    							"org.reaction.dsl.ReactionLanguage.MathFunc");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalReactionLanguage.g:2486:4: ( (lv_expr_8_0= ruleArithmeticExpr ) )
                    // InternalReactionLanguage.g:2487:5: (lv_expr_8_0= ruleArithmeticExpr )
                    {
                    // InternalReactionLanguage.g:2487:5: (lv_expr_8_0= ruleArithmeticExpr )
                    // InternalReactionLanguage.g:2488:6: lv_expr_8_0= ruleArithmeticExpr
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getExprArithmeticExprParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_expr_8_0=ruleArithmeticExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_8_0,
                    							"org.reaction.dsl.ReactionLanguage.ArithmeticExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:2511:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalReactionLanguage.g:2511:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    // InternalReactionLanguage.g:2512:4: () ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalReactionLanguage.g:2512:4: ()
                    // InternalReactionLanguage.g:2513:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExprAccess().getVarRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalReactionLanguage.g:2519:4: ( (otherlv_11= RULE_ID ) )
                    // InternalReactionLanguage.g:2520:5: (otherlv_11= RULE_ID )
                    {
                    // InternalReactionLanguage.g:2520:5: (otherlv_11= RULE_ID )
                    // InternalReactionLanguage.g:2521:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExprRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_11, grammarAccess.getPrimaryExprAccess().getRefVariableCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleArithmeticType"
    // InternalReactionLanguage.g:2537:1: entryRuleArithmeticType returns [String current=null] : iv_ruleArithmeticType= ruleArithmeticType EOF ;
    public final String entryRuleArithmeticType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticType = null;


        try {
            // InternalReactionLanguage.g:2537:54: (iv_ruleArithmeticType= ruleArithmeticType EOF )
            // InternalReactionLanguage.g:2538:2: iv_ruleArithmeticType= ruleArithmeticType EOF
            {
             newCompositeNode(grammarAccess.getArithmeticTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticType=ruleArithmeticType();

            state._fsp--;

             current =iv_ruleArithmeticType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticType"


    // $ANTLR start "ruleArithmeticType"
    // InternalReactionLanguage.g:2544:1: ruleArithmeticType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnsignedInt_0= ruleUnsignedInt | this_SignedInt_1= ruleSignedInt | this_UnsignedDouble_2= ruleUnsignedDouble | this_SignedDouble_3= ruleSignedDouble | this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble | this_SignedScientificDouble_5= ruleSignedScientificDouble ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnsignedInt_0 = null;

        AntlrDatatypeRuleToken this_SignedInt_1 = null;

        AntlrDatatypeRuleToken this_UnsignedDouble_2 = null;

        AntlrDatatypeRuleToken this_SignedDouble_3 = null;

        AntlrDatatypeRuleToken this_UnsignedScientificDouble_4 = null;

        AntlrDatatypeRuleToken this_SignedScientificDouble_5 = null;



        	enterRule();

        try {
            // InternalReactionLanguage.g:2550:2: ( (this_UnsignedInt_0= ruleUnsignedInt | this_SignedInt_1= ruleSignedInt | this_UnsignedDouble_2= ruleUnsignedDouble | this_SignedDouble_3= ruleSignedDouble | this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble | this_SignedScientificDouble_5= ruleSignedScientificDouble ) )
            // InternalReactionLanguage.g:2551:2: (this_UnsignedInt_0= ruleUnsignedInt | this_SignedInt_1= ruleSignedInt | this_UnsignedDouble_2= ruleUnsignedDouble | this_SignedDouble_3= ruleSignedDouble | this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble | this_SignedScientificDouble_5= ruleSignedScientificDouble )
            {
            // InternalReactionLanguage.g:2551:2: (this_UnsignedInt_0= ruleUnsignedInt | this_SignedInt_1= ruleSignedInt | this_UnsignedDouble_2= ruleUnsignedDouble | this_SignedDouble_3= ruleSignedDouble | this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble | this_SignedScientificDouble_5= ruleSignedScientificDouble )
            int alt33=6;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalReactionLanguage.g:2552:3: this_UnsignedInt_0= ruleUnsignedInt
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getUnsignedIntParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsignedInt_0=ruleUnsignedInt();

                    state._fsp--;


                    			current.merge(this_UnsignedInt_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2563:3: this_SignedInt_1= ruleSignedInt
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getSignedIntParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SignedInt_1=ruleSignedInt();

                    state._fsp--;


                    			current.merge(this_SignedInt_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReactionLanguage.g:2574:3: this_UnsignedDouble_2= ruleUnsignedDouble
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getUnsignedDoubleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsignedDouble_2=ruleUnsignedDouble();

                    state._fsp--;


                    			current.merge(this_UnsignedDouble_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReactionLanguage.g:2585:3: this_SignedDouble_3= ruleSignedDouble
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getSignedDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SignedDouble_3=ruleSignedDouble();

                    state._fsp--;


                    			current.merge(this_SignedDouble_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalReactionLanguage.g:2596:3: this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getUnsignedScientificDoubleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsignedScientificDouble_4=ruleUnsignedScientificDouble();

                    state._fsp--;


                    			current.merge(this_UnsignedScientificDouble_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalReactionLanguage.g:2607:3: this_SignedScientificDouble_5= ruleSignedScientificDouble
                    {

                    			newCompositeNode(grammarAccess.getArithmeticTypeAccess().getSignedScientificDoubleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SignedScientificDouble_5=ruleSignedScientificDouble();

                    state._fsp--;


                    			current.merge(this_SignedScientificDouble_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticType"


    // $ANTLR start "entryRuleSignedScientificDouble"
    // InternalReactionLanguage.g:2621:1: entryRuleSignedScientificDouble returns [String current=null] : iv_ruleSignedScientificDouble= ruleSignedScientificDouble EOF ;
    public final String entryRuleSignedScientificDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedScientificDouble = null;


        try {
            // InternalReactionLanguage.g:2621:62: (iv_ruleSignedScientificDouble= ruleSignedScientificDouble EOF )
            // InternalReactionLanguage.g:2622:2: iv_ruleSignedScientificDouble= ruleSignedScientificDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedScientificDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedScientificDouble=ruleSignedScientificDouble();

            state._fsp--;

             current =iv_ruleSignedScientificDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedScientificDouble"


    // $ANTLR start "ruleSignedScientificDouble"
    // InternalReactionLanguage.g:2628:1: ruleSignedScientificDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedScientificDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_NULL_2=null;
        Token this_INT_4=null;
        Token this_NULL_5=null;
        Token this_INT_9=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2634:2: ( (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // InternalReactionLanguage.g:2635:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // InternalReactionLanguage.g:2635:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // InternalReactionLanguage.g:2636:3: kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_0());
            		
            // InternalReactionLanguage.g:2641:3: (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_NULL) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalReactionLanguage.g:2642:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_34); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2650:4: this_NULL_2= RULE_NULL
                    {
                    this_NULL_2=(Token)match(input,RULE_NULL,FOLLOW_34); 

                    				current.merge(this_NULL_2);
                    			

                    				newLeafNode(this_NULL_2, grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalReactionLanguage.g:2658:3: (kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalReactionLanguage.g:2659:4: kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL )
                    {
                    kw=(Token)match(input,28,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedScientificDoubleAccess().getFullStopKeyword_2_0());
                    			
                    // InternalReactionLanguage.g:2664:4: (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_INT) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_NULL) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalReactionLanguage.g:2665:5: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_35); 

                            					current.merge(this_INT_4);
                            				

                            					newLeafNode(this_INT_4, grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalReactionLanguage.g:2673:5: this_NULL_5= RULE_NULL
                            {
                            this_NULL_5=(Token)match(input,RULE_NULL,FOLLOW_35); 

                            					current.merge(this_NULL_5);
                            				

                            					newLeafNode(this_NULL_5, grammarAccess.getSignedScientificDoubleAccess().getNULLTerminalRuleCall_2_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,42,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedScientificDoubleAccess().getEKeyword_3());
            		
            // InternalReactionLanguage.g:2687:3: (kw= '+' | kw= '-' )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            else if ( (LA37_0==38) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalReactionLanguage.g:2688:4: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedScientificDoubleAccess().getPlusSignKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2694:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedScientificDoubleAccess().getHyphenMinusKeyword_4_1());
                    			

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_9);
            		

            			newLeafNode(this_INT_9, grammarAccess.getSignedScientificDoubleAccess().getINTTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedScientificDouble"


    // $ANTLR start "entryRuleUnsignedScientificDouble"
    // InternalReactionLanguage.g:2711:1: entryRuleUnsignedScientificDouble returns [String current=null] : iv_ruleUnsignedScientificDouble= ruleUnsignedScientificDouble EOF ;
    public final String entryRuleUnsignedScientificDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedScientificDouble = null;


        try {
            // InternalReactionLanguage.g:2711:64: (iv_ruleUnsignedScientificDouble= ruleUnsignedScientificDouble EOF )
            // InternalReactionLanguage.g:2712:2: iv_ruleUnsignedScientificDouble= ruleUnsignedScientificDouble EOF
            {
             newCompositeNode(grammarAccess.getUnsignedScientificDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsignedScientificDouble=ruleUnsignedScientificDouble();

            state._fsp--;

             current =iv_ruleUnsignedScientificDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedScientificDouble"


    // $ANTLR start "ruleUnsignedScientificDouble"
    // InternalReactionLanguage.g:2718:1: ruleUnsignedScientificDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_8= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleUnsignedScientificDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_NULL_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_NULL_4=null;
        Token this_INT_8=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2724:2: ( ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_8= RULE_INT ) )
            // InternalReactionLanguage.g:2725:2: ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )
            {
            // InternalReactionLanguage.g:2725:2: ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_8= RULE_INT )
            // InternalReactionLanguage.g:2726:3: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )? kw= 'E' (kw= '+' | kw= '-' )? this_INT_8= RULE_INT
            {
            // InternalReactionLanguage.g:2726:3: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_NULL) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalReactionLanguage.g:2727:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2735:4: this_NULL_1= RULE_NULL
                    {
                    this_NULL_1=(Token)match(input,RULE_NULL,FOLLOW_34); 

                    				current.merge(this_NULL_1);
                    			

                    				newLeafNode(this_NULL_1, grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalReactionLanguage.g:2743:3: (kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalReactionLanguage.g:2744:4: kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL )
                    {
                    kw=(Token)match(input,28,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnsignedScientificDoubleAccess().getFullStopKeyword_1_0());
                    			
                    // InternalReactionLanguage.g:2749:4: (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_INT) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_NULL) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalReactionLanguage.g:2750:5: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_35); 

                            					current.merge(this_INT_3);
                            				

                            					newLeafNode(this_INT_3, grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalReactionLanguage.g:2758:5: this_NULL_4= RULE_NULL
                            {
                            this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_35); 

                            					current.merge(this_NULL_4);
                            				

                            					newLeafNode(this_NULL_4, grammarAccess.getUnsignedScientificDoubleAccess().getNULLTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,42,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUnsignedScientificDoubleAccess().getEKeyword_2());
            		
            // InternalReactionLanguage.g:2772:3: (kw= '+' | kw= '-' )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            else if ( (LA41_0==38) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // InternalReactionLanguage.g:2773:4: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnsignedScientificDoubleAccess().getPlusSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2779:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnsignedScientificDoubleAccess().getHyphenMinusKeyword_3_1());
                    			

                    }
                    break;

            }

            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_8);
            		

            			newLeafNode(this_INT_8, grammarAccess.getUnsignedScientificDoubleAccess().getINTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedScientificDouble"


    // $ANTLR start "entryRuleUnsignedInt"
    // InternalReactionLanguage.g:2796:1: entryRuleUnsignedInt returns [String current=null] : iv_ruleUnsignedInt= ruleUnsignedInt EOF ;
    public final String entryRuleUnsignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedInt = null;


        try {
            // InternalReactionLanguage.g:2796:51: (iv_ruleUnsignedInt= ruleUnsignedInt EOF )
            // InternalReactionLanguage.g:2797:2: iv_ruleUnsignedInt= ruleUnsignedInt EOF
            {
             newCompositeNode(grammarAccess.getUnsignedIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsignedInt=ruleUnsignedInt();

            state._fsp--;

             current =iv_ruleUnsignedInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedInt"


    // $ANTLR start "ruleUnsignedInt"
    // InternalReactionLanguage.g:2803:1: ruleUnsignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken ruleUnsignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_NULL_1=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2809:2: ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) )
            // InternalReactionLanguage.g:2810:2: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL )
            {
            // InternalReactionLanguage.g:2810:2: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_NULL) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalReactionLanguage.g:2811:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUnsignedIntAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2819:3: this_NULL_1= RULE_NULL
                    {
                    this_NULL_1=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    			current.merge(this_NULL_1);
                    		

                    			newLeafNode(this_NULL_1, grammarAccess.getUnsignedIntAccess().getNULLTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedInt"


    // $ANTLR start "entryRuleSignedInt"
    // InternalReactionLanguage.g:2830:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalReactionLanguage.g:2830:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalReactionLanguage.g:2831:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalReactionLanguage.g:2837:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_NULL_2=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2843:2: ( (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) ) )
            // InternalReactionLanguage.g:2844:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) )
            {
            // InternalReactionLanguage.g:2844:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) )
            // InternalReactionLanguage.g:2845:3: kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL )
            {
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0());
            		
            // InternalReactionLanguage.g:2850:3: (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_NULL) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalReactionLanguage.g:2851:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2859:4: this_NULL_2= RULE_NULL
                    {
                    this_NULL_2=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    				current.merge(this_NULL_2);
                    			

                    				newLeafNode(this_NULL_2, grammarAccess.getSignedIntAccess().getNULLTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleUnsignedDouble"
    // InternalReactionLanguage.g:2871:1: entryRuleUnsignedDouble returns [String current=null] : iv_ruleUnsignedDouble= ruleUnsignedDouble EOF ;
    public final String entryRuleUnsignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedDouble = null;


        try {
            // InternalReactionLanguage.g:2871:54: (iv_ruleUnsignedDouble= ruleUnsignedDouble EOF )
            // InternalReactionLanguage.g:2872:2: iv_ruleUnsignedDouble= ruleUnsignedDouble EOF
            {
             newCompositeNode(grammarAccess.getUnsignedDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsignedDouble=ruleUnsignedDouble();

            state._fsp--;

             current =iv_ruleUnsignedDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedDouble"


    // $ANTLR start "ruleUnsignedDouble"
    // InternalReactionLanguage.g:2878:1: ruleUnsignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) ) ;
    public final AntlrDatatypeRuleToken ruleUnsignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_NULL_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_NULL_4=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2884:2: ( ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) ) )
            // InternalReactionLanguage.g:2885:2: ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )
            {
            // InternalReactionLanguage.g:2885:2: ( (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL ) )
            // InternalReactionLanguage.g:2886:3: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL ) kw= '.' (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL )
            {
            // InternalReactionLanguage.g:2886:3: (this_INT_0= RULE_INT | this_NULL_1= RULE_NULL )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_NULL) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalReactionLanguage.g:2887:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2895:4: this_NULL_1= RULE_NULL
                    {
                    this_NULL_1=(Token)match(input,RULE_NULL,FOLLOW_37); 

                    				current.merge(this_NULL_1);
                    			

                    				newLeafNode(this_NULL_1, grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getUnsignedDoubleAccess().getFullStopKeyword_1());
            		
            // InternalReactionLanguage.g:2908:3: (this_INT_3= RULE_INT | this_NULL_4= RULE_NULL )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_NULL) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalReactionLanguage.g:2909:4: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getUnsignedDoubleAccess().getINTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2917:4: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    				current.merge(this_NULL_4);
                    			

                    				newLeafNode(this_NULL_4, grammarAccess.getUnsignedDoubleAccess().getNULLTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedDouble"


    // $ANTLR start "entryRuleSignedDouble"
    // InternalReactionLanguage.g:2929:1: entryRuleSignedDouble returns [String current=null] : iv_ruleSignedDouble= ruleSignedDouble EOF ;
    public final String entryRuleSignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedDouble = null;


        try {
            // InternalReactionLanguage.g:2929:52: (iv_ruleSignedDouble= ruleSignedDouble EOF )
            // InternalReactionLanguage.g:2930:2: iv_ruleSignedDouble= ruleSignedDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedDouble=ruleSignedDouble();

            state._fsp--;

             current =iv_ruleSignedDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedDouble"


    // $ANTLR start "ruleSignedDouble"
    // InternalReactionLanguage.g:2936:1: ruleSignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) ) ;
    public final AntlrDatatypeRuleToken ruleSignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_NULL_2=null;
        Token this_INT_4=null;
        Token this_NULL_5=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2942:2: ( (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) ) )
            // InternalReactionLanguage.g:2943:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )
            {
            // InternalReactionLanguage.g:2943:2: (kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL ) )
            // InternalReactionLanguage.g:2944:3: kw= '-' (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL ) kw= '.' (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL )
            {
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0());
            		
            // InternalReactionLanguage.g:2949:3: (this_INT_1= RULE_INT | this_NULL_2= RULE_NULL )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_NULL) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalReactionLanguage.g:2950:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_37); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2958:4: this_NULL_2= RULE_NULL
                    {
                    this_NULL_2=(Token)match(input,RULE_NULL,FOLLOW_37); 

                    				current.merge(this_NULL_2);
                    			

                    				newLeafNode(this_NULL_2, grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2());
            		
            // InternalReactionLanguage.g:2971:3: (this_INT_4= RULE_INT | this_NULL_5= RULE_NULL )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_NULL) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalReactionLanguage.g:2972:4: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:2980:4: this_NULL_5= RULE_NULL
                    {
                    this_NULL_5=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    				current.merge(this_NULL_5);
                    			

                    				newLeafNode(this_NULL_5, grammarAccess.getSignedDoubleAccess().getNULLTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedDouble"


    // $ANTLR start "ruleMathFunc"
    // InternalReactionLanguage.g:2992:1: ruleMathFunc returns [Enumerator current=null] : ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) ;
    public final Enumerator ruleMathFunc() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:2998:2: ( ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) )
            // InternalReactionLanguage.g:2999:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            {
            // InternalReactionLanguage.g:2999:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            else if ( (LA48_0==44) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalReactionLanguage.g:3000:3: (enumLiteral_0= 'sqrt' )
                    {
                    // InternalReactionLanguage.g:3000:3: (enumLiteral_0= 'sqrt' )
                    // InternalReactionLanguage.g:3001:4: enumLiteral_0= 'sqrt'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:3008:3: (enumLiteral_1= 'abs' )
                    {
                    // InternalReactionLanguage.g:3008:3: (enumLiteral_1= 'abs' )
                    // InternalReactionLanguage.g:3009:4: enumLiteral_1= 'abs'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathFunc"


    // $ANTLR start "ruleRuleType"
    // InternalReactionLanguage.g:3019:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '<=>' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:3025:2: ( ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '<=>' ) ) )
            // InternalReactionLanguage.g:3026:2: ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '<=>' ) )
            {
            // InternalReactionLanguage.g:3026:2: ( (enumLiteral_0= '=>' ) | (enumLiteral_1= '<=>' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            else if ( (LA49_0==46) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalReactionLanguage.g:3027:3: (enumLiteral_0= '=>' )
                    {
                    // InternalReactionLanguage.g:3027:3: (enumLiteral_0= '=>' )
                    // InternalReactionLanguage.g:3028:4: enumLiteral_0= '=>'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getUNIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getUNIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:3035:3: (enumLiteral_1= '<=>' )
                    {
                    // InternalReactionLanguage.g:3035:3: (enumLiteral_1= '<=>' )
                    // InternalReactionLanguage.g:3036:4: enumLiteral_1= '<=>'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getBIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getBIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleBondType"
    // InternalReactionLanguage.g:3046:1: ruleBondType returns [Enumerator current=null] : ( (enumLiteral_0= '//' ) | (enumLiteral_1= '+' ) ) ;
    public final Enumerator ruleBondType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReactionLanguage.g:3052:2: ( ( (enumLiteral_0= '//' ) | (enumLiteral_1= '+' ) ) )
            // InternalReactionLanguage.g:3053:2: ( (enumLiteral_0= '//' ) | (enumLiteral_1= '+' ) )
            {
            // InternalReactionLanguage.g:3053:2: ( (enumLiteral_0= '//' ) | (enumLiteral_1= '+' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            else if ( (LA50_0==37) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalReactionLanguage.g:3054:3: (enumLiteral_0= '//' )
                    {
                    // InternalReactionLanguage.g:3054:3: (enumLiteral_0= '//' )
                    // InternalReactionLanguage.g:3055:4: enumLiteral_0= '//'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBondTypeAccess().getUNBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBondTypeAccess().getUNBOUNDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:3062:3: (enumLiteral_1= '+' )
                    {
                    // InternalReactionLanguage.g:3062:3: (enumLiteral_1= '+' )
                    // InternalReactionLanguage.g:3063:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBondTypeAccess().getBOUNDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBondTypeAccess().getBOUNDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBondType"

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\uffff\2\6\4\uffff\2\13\2\16\4\uffff\2\21\1\uffff";
    static final String dfa_3s = "\1\7\2\4\2\7\2\uffff\4\4\1\uffff\1\7\2\uffff\2\4\1\uffff";
    static final String dfa_4s = "\1\46\2\52\2\11\2\uffff\4\52\1\uffff\1\11\2\uffff\2\52\1\uffff";
    static final String dfa_5s = "\5\uffff\1\5\1\1\4\uffff\1\2\1\uffff\1\6\1\3\2\uffff\1\4";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\34\uffff\1\3",
            "\2\6\10\uffff\3\6\3\uffff\3\6\1\uffff\2\6\2\uffff\1\4\1\6\1\uffff\3\6\3\uffff\5\6\1\5",
            "\2\6\10\uffff\3\6\3\uffff\3\6\1\uffff\2\6\2\uffff\1\4\1\6\1\uffff\3\6\3\uffff\5\6\1\5",
            "\1\7\1\uffff\1\10",
            "\1\11\1\uffff\1\12",
            "",
            "",
            "\2\13\10\uffff\3\13\3\uffff\3\13\1\uffff\2\13\2\uffff\1\14\1\13\1\uffff\3\13\3\uffff\5\13\1\15",
            "\2\13\10\uffff\3\13\3\uffff\3\13\1\uffff\2\13\2\uffff\1\14\1\13\1\uffff\3\13\3\uffff\5\13\1\15",
            "\2\16\10\uffff\3\16\3\uffff\3\16\1\uffff\2\16\3\uffff\1\16\1\uffff\3\16\3\uffff\5\16\1\5",
            "\2\16\10\uffff\3\16\3\uffff\3\16\1\uffff\2\16\3\uffff\1\16\1\uffff\3\16\3\uffff\5\16\1\5",
            "",
            "\1\17\1\uffff\1\20",
            "",
            "",
            "\2\21\10\uffff\3\21\3\uffff\3\21\1\uffff\2\21\3\uffff\1\21\1\uffff\3\21\3\uffff\5\21\1\15",
            "\2\21\10\uffff\3\21\3\uffff\3\21\1\uffff\2\21\3\uffff\1\21\1\uffff\3\21\3\uffff\5\21\1\15",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2551:2: (this_UnsignedInt_0= ruleUnsignedInt | this_SignedInt_1= ruleSignedInt | this_UnsignedDouble_2= ruleUnsignedDouble | this_SignedDouble_3= ruleSignedDouble | this_UnsignedScientificDouble_4= ruleUnsignedScientificDouble | this_SignedScientificDouble_5= ruleSignedScientificDouble )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003A2410032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000003A2410030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000123400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001840001002C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000340L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C08100040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000000L});

}