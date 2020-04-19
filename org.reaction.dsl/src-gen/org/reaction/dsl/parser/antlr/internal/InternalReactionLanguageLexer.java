package org.reaction.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReactionLanguageLexer extends Lexer {
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

    public InternalReactionLanguageLexer() {;} 
    public InternalReactionLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReactionLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReactionLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:11:7: ( ':' )
            // InternalReactionLanguage.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:12:7: ( ',' )
            // InternalReactionLanguage.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:13:7: ( 'agent' )
            // InternalReactionLanguage.g:13:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:14:7: ( ';' )
            // InternalReactionLanguage.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:15:7: ( '[' )
            // InternalReactionLanguage.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:16:7: ( ']' )
            // InternalReactionLanguage.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:17:7: ( '(' )
            // InternalReactionLanguage.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:18:7: ( ')' )
            // InternalReactionLanguage.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:19:7: ( 'complex' )
            // InternalReactionLanguage.g:19:9: 'complex'
            {
            match("complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:20:7: ( '{' )
            // InternalReactionLanguage.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:21:7: ( '}' )
            // InternalReactionLanguage.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:22:7: ( 'rule' )
            // InternalReactionLanguage.g:22:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:23:7: ( '@' )
            // InternalReactionLanguage.g:23:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:24:7: ( '_' )
            // InternalReactionLanguage.g:24:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:25:7: ( '.' )
            // InternalReactionLanguage.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:26:7: ( 'var' )
            // InternalReactionLanguage.g:26:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:27:7: ( '=' )
            // InternalReactionLanguage.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:28:7: ( 'init' )
            // InternalReactionLanguage.g:28:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:29:7: ( 'observe' )
            // InternalReactionLanguage.g:29:9: 'observe'
            {
            match("observe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:30:7: ( 'terminate' )
            // InternalReactionLanguage.g:30:9: 'terminate'
            {
            match("terminate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:31:7: ( 'time' )
            // InternalReactionLanguage.g:31:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:32:7: ( 'iterations' )
            // InternalReactionLanguage.g:32:9: 'iterations'
            {
            match("iterations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:33:7: ( 'matches' )
            // InternalReactionLanguage.g:33:9: 'matches'
            {
            match("matches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:34:7: ( '+' )
            // InternalReactionLanguage.g:34:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:35:7: ( '-' )
            // InternalReactionLanguage.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:36:7: ( '*' )
            // InternalReactionLanguage.g:36:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:37:7: ( '/' )
            // InternalReactionLanguage.g:37:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:38:7: ( '^' )
            // InternalReactionLanguage.g:38:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:39:7: ( 'E' )
            // InternalReactionLanguage.g:39:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:40:7: ( 'sqrt' )
            // InternalReactionLanguage.g:40:9: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:41:7: ( 'abs' )
            // InternalReactionLanguage.g:41:9: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:42:7: ( '=>' )
            // InternalReactionLanguage.g:42:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:43:7: ( '<=>' )
            // InternalReactionLanguage.g:43:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:44:7: ( '//' )
            // InternalReactionLanguage.g:44:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_ANYTHING"
    public final void mRULE_ANYTHING() throws RecognitionException {
        try {
            int _type = RULE_ANYTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3072:15: ( '?' )
            // InternalReactionLanguage.g:3072:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANYTHING"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3074:11: ( '0' )
            // InternalReactionLanguage.g:3074:13: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3076:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReactionLanguage.g:3076:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalReactionLanguage.g:3076:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReactionLanguage.g:3076:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalReactionLanguage.g:3076:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReactionLanguage.g:3076:40: ( '\\r' )? '\\n'
                    {
                    // InternalReactionLanguage.g:3076:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalReactionLanguage.g:3076:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3078:14: ( '\\n' )
            // InternalReactionLanguage.g:3078:16: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3080:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReactionLanguage.g:3080:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReactionLanguage.g:3080:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReactionLanguage.g:3080:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReactionLanguage.g:3080:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReactionLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3082:10: ( ( '0' .. '9' )+ )
            // InternalReactionLanguage.g:3082:12: ( '0' .. '9' )+
            {
            // InternalReactionLanguage.g:3082:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReactionLanguage.g:3082:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3084:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReactionLanguage.g:3084:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReactionLanguage.g:3084:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReactionLanguage.g:3084:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReactionLanguage.g:3084:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalReactionLanguage.g:3084:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionLanguage.g:3084:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalReactionLanguage.g:3084:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReactionLanguage.g:3084:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalReactionLanguage.g:3084:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReactionLanguage.g:3084:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3086:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReactionLanguage.g:3086:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReactionLanguage.g:3086:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReactionLanguage.g:3086:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3088:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReactionLanguage.g:3088:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReactionLanguage.g:3088:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReactionLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReactionLanguage.g:3090:16: ( . )
            // InternalReactionLanguage.g:3090:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalReactionLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_ANYTHING | RULE_NULL | RULE_SL_COMMENT | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=44;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalReactionLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalReactionLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalReactionLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalReactionLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalReactionLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalReactionLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalReactionLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalReactionLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalReactionLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalReactionLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalReactionLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalReactionLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalReactionLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalReactionLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalReactionLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalReactionLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalReactionLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalReactionLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalReactionLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalReactionLanguage.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalReactionLanguage.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalReactionLanguage.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalReactionLanguage.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalReactionLanguage.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalReactionLanguage.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalReactionLanguage.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalReactionLanguage.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalReactionLanguage.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalReactionLanguage.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalReactionLanguage.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalReactionLanguage.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalReactionLanguage.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalReactionLanguage.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalReactionLanguage.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalReactionLanguage.g:1:214: RULE_ANYTHING
                {
                mRULE_ANYTHING(); 

                }
                break;
            case 36 :
                // InternalReactionLanguage.g:1:228: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 37 :
                // InternalReactionLanguage.g:1:238: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalReactionLanguage.g:1:254: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 39 :
                // InternalReactionLanguage.g:1:267: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // InternalReactionLanguage.g:1:275: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalReactionLanguage.g:1:284: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalReactionLanguage.g:1:296: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalReactionLanguage.g:1:312: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalReactionLanguage.g:1:320: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\54\5\uffff\1\54\2\uffff\1\54\1\uffff\1\67\1\uffff\1\54\1\73\4\54\3\uffff\1\107\1\110\1\111\1\54\1\47\1\uffff\1\115\1\uffff\1\120\2\uffff\2\47\4\uffff\2\54\6\uffff\1\54\2\uffff\1\54\3\uffff\1\54\2\uffff\6\54\10\uffff\1\54\10\uffff\1\54\1\140\2\54\1\143\10\54\1\uffff\1\54\1\155\1\uffff\1\156\3\54\1\162\1\54\1\164\1\165\1\54\2\uffff\3\54\1\uffff\1\54\2\uffff\5\54\1\u0080\1\54\1\u0082\1\54\1\u0084\1\uffff\1\54\1\uffff\1\54\1\uffff\1\54\1\u0088\1\u0089\2\uffff";
    static final String DFA12_eofS =
        "\u008a\uffff";
    static final String DFA12_minS =
        "\1\0\2\uffff\1\142\5\uffff\1\157\2\uffff\1\165\1\uffff\1\60\1\uffff\1\141\1\76\1\156\1\142\1\145\1\141\3\uffff\1\52\1\101\1\60\1\161\1\75\1\uffff\1\60\1\uffff\1\11\2\uffff\2\0\4\uffff\1\145\1\163\6\uffff\1\155\2\uffff\1\154\3\uffff\1\162\2\uffff\1\151\1\145\1\163\1\162\1\155\1\164\10\uffff\1\162\10\uffff\1\156\1\60\1\160\1\145\1\60\1\164\1\162\1\145\1\155\1\145\1\143\2\164\1\uffff\1\154\1\60\1\uffff\1\60\1\141\1\162\1\151\1\60\1\150\2\60\1\145\2\uffff\1\164\1\166\1\156\1\uffff\1\145\2\uffff\1\170\1\151\1\145\1\141\1\163\1\60\1\157\1\60\1\164\1\60\1\uffff\1\156\1\uffff\1\145\1\uffff\1\163\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\uffff\1\147\5\uffff\1\157\2\uffff\1\165\1\uffff\1\172\1\uffff\1\141\1\76\1\164\1\142\1\151\1\141\3\uffff\1\57\2\172\1\161\1\75\1\uffff\1\71\1\uffff\1\40\2\uffff\2\uffff\4\uffff\1\145\1\163\6\uffff\1\155\2\uffff\1\154\3\uffff\1\162\2\uffff\1\151\1\145\1\163\1\162\1\155\1\164\10\uffff\1\162\10\uffff\1\156\1\172\1\160\1\145\1\172\1\164\1\162\1\145\1\155\1\145\1\143\2\164\1\uffff\1\154\1\172\1\uffff\1\172\1\141\1\162\1\151\1\172\1\150\2\172\1\145\2\uffff\1\164\1\166\1\156\1\uffff\1\145\2\uffff\1\170\1\151\1\145\1\141\1\163\1\172\1\157\1\172\1\164\1\172\1\uffff\1\156\1\uffff\1\145\1\uffff\1\163\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\uffff\1\15\1\uffff\1\17\6\uffff\1\30\1\31\1\32\5\uffff\1\43\1\uffff\1\45\1\uffff\1\47\1\50\2\uffff\1\53\1\54\1\1\1\2\2\uffff\1\47\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\uffff\1\15\1\16\1\17\1\uffff\1\40\1\21\6\uffff\1\30\1\31\1\32\1\42\1\52\1\33\1\34\1\35\1\uffff\1\41\1\43\1\44\1\50\1\45\1\46\1\53\1\51\15\uffff\1\37\2\uffff\1\20\11\uffff\1\14\1\22\3\uffff\1\25\1\uffff\1\36\1\3\12\uffff\1\11\1\uffff\1\23\1\uffff\1\27\3\uffff\1\24\1\26";
    static final String DFA12_specialS =
        "\1\2\43\uffff\1\1\1\0\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\1\46\1\41\2\47\1\46\22\47\1\46\1\47\1\44\1\40\3\47\1\45\1\7\1\10\1\30\1\26\1\2\1\27\1\17\1\31\1\37\11\43\1\1\1\4\1\35\1\21\1\47\1\36\1\15\4\42\1\33\25\42\1\5\1\47\1\6\1\32\1\16\1\47\1\3\1\42\1\11\5\42\1\22\3\42\1\25\1\42\1\23\2\42\1\14\1\34\1\24\1\42\1\20\4\42\1\12\1\47\1\13\uff82\47",
            "",
            "",
            "\1\53\4\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\65",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\71",
            "\1\72",
            "\1\74\5\uffff\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100",
            "\1\101",
            "",
            "",
            "",
            "\1\106\4\uffff\1\105",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\112",
            "\1\113",
            "",
            "\12\116",
            "",
            "\2\121\2\uffff\1\121\22\uffff\1\121",
            "",
            "",
            "\0\122",
            "\0\122",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\141",
            "\1\142",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\163",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\166",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0081",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0083",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_ANYTHING | RULE_NULL | RULE_SL_COMMENT | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 82;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==':') ) {s = 1;}

                        else if ( (LA12_0==',') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0==';') ) {s = 4;}

                        else if ( (LA12_0=='[') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='(') ) {s = 7;}

                        else if ( (LA12_0==')') ) {s = 8;}

                        else if ( (LA12_0=='c') ) {s = 9;}

                        else if ( (LA12_0=='{') ) {s = 10;}

                        else if ( (LA12_0=='}') ) {s = 11;}

                        else if ( (LA12_0=='r') ) {s = 12;}

                        else if ( (LA12_0=='@') ) {s = 13;}

                        else if ( (LA12_0=='_') ) {s = 14;}

                        else if ( (LA12_0=='.') ) {s = 15;}

                        else if ( (LA12_0=='v') ) {s = 16;}

                        else if ( (LA12_0=='=') ) {s = 17;}

                        else if ( (LA12_0=='i') ) {s = 18;}

                        else if ( (LA12_0=='o') ) {s = 19;}

                        else if ( (LA12_0=='t') ) {s = 20;}

                        else if ( (LA12_0=='m') ) {s = 21;}

                        else if ( (LA12_0=='+') ) {s = 22;}

                        else if ( (LA12_0=='-') ) {s = 23;}

                        else if ( (LA12_0=='*') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( (LA12_0=='E') ) {s = 27;}

                        else if ( (LA12_0=='s') ) {s = 28;}

                        else if ( (LA12_0=='<') ) {s = 29;}

                        else if ( (LA12_0=='?') ) {s = 30;}

                        else if ( (LA12_0=='0') ) {s = 31;}

                        else if ( (LA12_0=='#') ) {s = 32;}

                        else if ( (LA12_0=='\n') ) {s = 33;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='b'||(LA12_0>='d' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='q')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 34;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||LA12_0=='>'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}