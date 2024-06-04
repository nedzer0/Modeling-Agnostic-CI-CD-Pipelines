package org.gemoc.agro.parser.antlr.internal; 

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
import org.gemoc.agro.services.ActivitiesDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivitiesDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'resource'", "'culture'", "'{'", "'}'", "'activity'", "'from '", "'to'", "'['", "'&&'", "']'", "'using'", "'and'", "'no rain since'", "'days'", "'temperature'", "'after'", "'is done since'", "'grain is'", "'jan'", "'feb'", "'mar'", "'apr'", "'may'", "'jun'", "'jul'", "'aug'", "'sept'", "'oct'", "'nov'", "'dec'", "'>'", "'<'", "'\\u00B0C'", "'\\u00B0F'", "'once'", "'daily'", "'weekly'", "'monthly'", "'quaterly'", "'yearly'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalActivitiesDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivitiesDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivitiesDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g"; }



     	private ActivitiesDSLGrammarAccess grammarAccess;
     	
        public InternalActivitiesDSLParser(TokenStream input, ActivitiesDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ActivitiesDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_cultures_0_0= ruleCulture ) )* ( (lv_resourceKinds_1_0= ruleResourceKind ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_cultures_0_0 = null;

        EObject lv_resourceKinds_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:80:28: ( ( ( (lv_cultures_0_0= ruleCulture ) )* ( (lv_resourceKinds_1_0= ruleResourceKind ) )* ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:81:1: ( ( (lv_cultures_0_0= ruleCulture ) )* ( (lv_resourceKinds_1_0= ruleResourceKind ) )* )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:81:1: ( ( (lv_cultures_0_0= ruleCulture ) )* ( (lv_resourceKinds_1_0= ruleResourceKind ) )* )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:81:2: ( (lv_cultures_0_0= ruleCulture ) )* ( (lv_resourceKinds_1_0= ruleResourceKind ) )*
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:81:2: ( (lv_cultures_0_0= ruleCulture ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:82:1: (lv_cultures_0_0= ruleCulture )
            	    {
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:82:1: (lv_cultures_0_0= ruleCulture )
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:83:3: lv_cultures_0_0= ruleCulture
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCulturesCultureParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCulture_in_ruleModel131);
            	    lv_cultures_0_0=ruleCulture();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cultures",
            	            		lv_cultures_0_0, 
            	            		"Culture");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:99:3: ( (lv_resourceKinds_1_0= ruleResourceKind ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:100:1: (lv_resourceKinds_1_0= ruleResourceKind )
            	    {
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:100:1: (lv_resourceKinds_1_0= ruleResourceKind )
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:101:3: lv_resourceKinds_1_0= ruleResourceKind
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getResourceKindsResourceKindParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceKind_in_ruleModel153);
            	    lv_resourceKinds_1_0=ruleResourceKind();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resourceKinds",
            	            		lv_resourceKinds_1_0, 
            	            		"ResourceKind");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleResourceKind"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:125:1: entryRuleResourceKind returns [EObject current=null] : iv_ruleResourceKind= ruleResourceKind EOF ;
    public final EObject entryRuleResourceKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceKind = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:126:2: (iv_ruleResourceKind= ruleResourceKind EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:127:2: iv_ruleResourceKind= ruleResourceKind EOF
            {
             newCompositeNode(grammarAccess.getResourceKindRule()); 
            pushFollow(FOLLOW_ruleResourceKind_in_entryRuleResourceKind190);
            iv_ruleResourceKind=ruleResourceKind();

            state._fsp--;

             current =iv_ruleResourceKind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceKind200); 

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
    // $ANTLR end "entryRuleResourceKind"


    // $ANTLR start "ruleResourceKind"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:134:1: ruleResourceKind returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResourceKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:137:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:138:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:138:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:138:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleResourceKind237); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceKindAccess().getResourceKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:143:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceKind254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleResourceKind"


    // $ANTLR start "entryRuleCulture"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:168:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:169:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:170:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FOLLOW_ruleCulture_in_entryRuleCulture295);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCulture305); 

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
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:177:1: ruleCulture returns [EObject current=null] : (otherlv_0= 'culture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleExploitationActivity ) )* otherlv_4= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_activities_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:180:28: ( (otherlv_0= 'culture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleExploitationActivity ) )* otherlv_4= '}' ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:181:1: (otherlv_0= 'culture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleExploitationActivity ) )* otherlv_4= '}' )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:181:1: (otherlv_0= 'culture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleExploitationActivity ) )* otherlv_4= '}' )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:181:3: otherlv_0= 'culture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_activities_3_0= ruleExploitationActivity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCulture342); 

                	newLeafNode(otherlv_0, grammarAccess.getCultureAccess().getCultureKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:186:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCulture359); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCultureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCultureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCulture376); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:207:1: ( (lv_activities_3_0= ruleExploitationActivity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:208:1: (lv_activities_3_0= ruleExploitationActivity )
            	    {
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:208:1: (lv_activities_3_0= ruleExploitationActivity )
            	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:209:3: lv_activities_3_0= ruleExploitationActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCultureAccess().getActivitiesExploitationActivityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExploitationActivity_in_ruleCulture397);
            	    lv_activities_3_0=ruleExploitationActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCultureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_3_0, 
            	            		"ExploitationActivity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCulture410); 

                	newLeafNode(otherlv_4, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCulture"


    // $ANTLR start "entryRuleExploitationActivity"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:237:1: entryRuleExploitationActivity returns [EObject current=null] : iv_ruleExploitationActivity= ruleExploitationActivity EOF ;
    public final EObject entryRuleExploitationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExploitationActivity = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:238:2: (iv_ruleExploitationActivity= ruleExploitationActivity EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:239:2: iv_ruleExploitationActivity= ruleExploitationActivity EOF
            {
             newCompositeNode(grammarAccess.getExploitationActivityRule()); 
            pushFollow(FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity446);
            iv_ruleExploitationActivity=ruleExploitationActivity();

            state._fsp--;

             current =iv_ruleExploitationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploitationActivity456); 

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
    // $ANTLR end "entryRuleExploitationActivity"


    // $ANTLR start "ruleExploitationActivity"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:246:1: ruleExploitationActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_frequency_2_0= ruleFrequency ) )? (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )? (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )? (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )? ) ;
    public final EObject ruleExploitationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_frequency_2_0 = null;

        EObject lv_startDate_4_0 = null;

        EObject lv_endDate_6_0 = null;

        EObject lv_predicates_8_0 = null;

        EObject lv_predicates_10_0 = null;

        EObject lv_uses_13_0 = null;

        EObject lv_uses_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:249:28: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_frequency_2_0= ruleFrequency ) )? (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )? (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )? (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )? ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:250:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_frequency_2_0= ruleFrequency ) )? (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )? (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )? (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )? )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:250:1: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_frequency_2_0= ruleFrequency ) )? (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )? (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )? (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )? )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:250:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_frequency_2_0= ruleFrequency ) )? (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )? (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )? (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExploitationActivity493); 

                	newLeafNode(otherlv_0, grammarAccess.getExploitationActivityAccess().getActivityKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:254:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:255:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:255:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:256:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploitationActivity510); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExploitationActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExploitationActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:272:2: ( (lv_frequency_2_0= ruleFrequency ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=45 && LA4_0<=50)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:273:1: (lv_frequency_2_0= ruleFrequency )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:273:1: (lv_frequency_2_0= ruleFrequency )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:274:3: lv_frequency_2_0= ruleFrequency
                    {
                     
                    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getFrequencyFrequencyEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFrequency_in_ruleExploitationActivity536);
                    lv_frequency_2_0=ruleFrequency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"frequency",
                            		lv_frequency_2_0, 
                            		"Frequency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:290:3: (otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:290:5: otherlv_3= 'from ' ( (lv_startDate_4_0= ruleDate ) ) otherlv_5= 'to' ( (lv_endDate_6_0= ruleDate ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleExploitationActivity550); 

                        	newLeafNode(otherlv_3, grammarAccess.getExploitationActivityAccess().getFromKeyword_3_0());
                        
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:294:1: ( (lv_startDate_4_0= ruleDate ) )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:295:1: (lv_startDate_4_0= ruleDate )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:295:1: (lv_startDate_4_0= ruleDate )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:296:3: lv_startDate_4_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getStartDateDateParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDate_in_ruleExploitationActivity571);
                    lv_startDate_4_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_4_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExploitationActivity583); 

                        	newLeafNode(otherlv_5, grammarAccess.getExploitationActivityAccess().getToKeyword_3_2());
                        
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:316:1: ( (lv_endDate_6_0= ruleDate ) )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:317:1: (lv_endDate_6_0= ruleDate )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:317:1: (lv_endDate_6_0= ruleDate )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:318:3: lv_endDate_6_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getEndDateDateParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDate_in_ruleExploitationActivity604);
                    lv_endDate_6_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_6_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:334:4: (otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:334:6: otherlv_7= '[' ( (lv_predicates_8_0= rulePredicate ) ) (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleExploitationActivity619); 

                        	newLeafNode(otherlv_7, grammarAccess.getExploitationActivityAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:338:1: ( (lv_predicates_8_0= rulePredicate ) )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:339:1: (lv_predicates_8_0= rulePredicate )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:339:1: (lv_predicates_8_0= rulePredicate )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:340:3: lv_predicates_8_0= rulePredicate
                    {
                     
                    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicate_in_ruleExploitationActivity640);
                    lv_predicates_8_0=rulePredicate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"predicates",
                            		lv_predicates_8_0, 
                            		"Predicate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:356:2: (otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:356:4: otherlv_9= '&&' ( (lv_predicates_10_0= rulePredicate ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleExploitationActivity653); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getExploitationActivityAccess().getAmpersandAmpersandKeyword_4_2_0());
                    	        
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:360:1: ( (lv_predicates_10_0= rulePredicate ) )
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:361:1: (lv_predicates_10_0= rulePredicate )
                    	    {
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:361:1: (lv_predicates_10_0= rulePredicate )
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:362:3: lv_predicates_10_0= rulePredicate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePredicate_in_ruleExploitationActivity674);
                    	    lv_predicates_10_0=rulePredicate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"predicates",
                    	            		lv_predicates_10_0, 
                    	            		"Predicate");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleExploitationActivity688); 

                        	newLeafNode(otherlv_11, grammarAccess.getExploitationActivityAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:382:3: (otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:382:5: otherlv_12= 'using' ( (lv_uses_13_0= ruleActivityResource ) ) (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleExploitationActivity703); 

                        	newLeafNode(otherlv_12, grammarAccess.getExploitationActivityAccess().getUsingKeyword_5_0());
                        
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:386:1: ( (lv_uses_13_0= ruleActivityResource ) )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:387:1: (lv_uses_13_0= ruleActivityResource )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:387:1: (lv_uses_13_0= ruleActivityResource )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:388:3: lv_uses_13_0= ruleActivityResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivityResource_in_ruleExploitationActivity724);
                    lv_uses_13_0=ruleActivityResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"uses",
                            		lv_uses_13_0, 
                            		"ActivityResource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:404:2: (otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:404:4: otherlv_14= 'and' ( (lv_uses_15_0= ruleActivityResource ) )
                    	    {
                    	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleExploitationActivity737); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getExploitationActivityAccess().getAndKeyword_5_2_0());
                    	        
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:408:1: ( (lv_uses_15_0= ruleActivityResource ) )
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:409:1: (lv_uses_15_0= ruleActivityResource )
                    	    {
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:409:1: (lv_uses_15_0= ruleActivityResource )
                    	    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:410:3: lv_uses_15_0= ruleActivityResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleActivityResource_in_ruleExploitationActivity758);
                    	    lv_uses_15_0=ruleActivityResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExploitationActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"uses",
                    	            		lv_uses_15_0, 
                    	            		"ActivityResource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
    // $ANTLR end "ruleExploitationActivity"


    // $ANTLR start "entryRuleActivityResource"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:434:1: entryRuleActivityResource returns [EObject current=null] : iv_ruleActivityResource= ruleActivityResource EOF ;
    public final EObject entryRuleActivityResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityResource = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:435:2: (iv_ruleActivityResource= ruleActivityResource EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:436:2: iv_ruleActivityResource= ruleActivityResource EOF
            {
             newCompositeNode(grammarAccess.getActivityResourceRule()); 
            pushFollow(FOLLOW_ruleActivityResource_in_entryRuleActivityResource798);
            iv_ruleActivityResource=ruleActivityResource();

            state._fsp--;

             current =iv_ruleActivityResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityResource808); 

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
    // $ANTLR end "entryRuleActivityResource"


    // $ANTLR start "ruleActivityResource"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:443:1: ruleActivityResource returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleActivityResource() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:446:28: ( ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:447:1: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:447:1: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:447:2: ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:447:2: ( (lv_quantity_0_0= RULE_INT ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:448:1: (lv_quantity_0_0= RULE_INT )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:448:1: (lv_quantity_0_0= RULE_INT )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:449:3: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivityResource850); 

            			newLeafNode(lv_quantity_0_0, grammarAccess.getActivityResourceAccess().getQuantityINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"quantity",
                    		lv_quantity_0_0, 
                    		"INT");
            	    

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:465:2: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:466:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:466:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:467:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityResourceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityResource875); 

            		newLeafNode(otherlv_1, grammarAccess.getActivityResourceAccess().getResourceKindResourceKindCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleActivityResource"


    // $ANTLR start "entryRulePredicate"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:486:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:487:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:488:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate911);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate921); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:495:1: rulePredicate returns [EObject current=null] : (this_NoRain_0= ruleNoRain | this_TempOfTheDay_1= ruleTempOfTheDay | this_DelaySinceActivy_2= ruleDelaySinceActivy | this_GrainIs_3= ruleGrainIs ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_NoRain_0 = null;

        EObject this_TempOfTheDay_1 = null;

        EObject this_DelaySinceActivy_2 = null;

        EObject this_GrainIs_3 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:498:28: ( (this_NoRain_0= ruleNoRain | this_TempOfTheDay_1= ruleTempOfTheDay | this_DelaySinceActivy_2= ruleDelaySinceActivy | this_GrainIs_3= ruleGrainIs ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:499:1: (this_NoRain_0= ruleNoRain | this_TempOfTheDay_1= ruleTempOfTheDay | this_DelaySinceActivy_2= ruleDelaySinceActivy | this_GrainIs_3= ruleGrainIs )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:499:1: (this_NoRain_0= ruleNoRain | this_TempOfTheDay_1= ruleTempOfTheDay | this_DelaySinceActivy_2= ruleDelaySinceActivy | this_GrainIs_3= ruleGrainIs )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 28:
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
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:500:5: this_NoRain_0= ruleNoRain
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNoRain_in_rulePredicate968);
                    this_NoRain_0=ruleNoRain();

                    state._fsp--;

                     
                            current = this_NoRain_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:510:5: this_TempOfTheDay_1= ruleTempOfTheDay
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getTempOfTheDayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTempOfTheDay_in_rulePredicate995);
                    this_TempOfTheDay_1=ruleTempOfTheDay();

                    state._fsp--;

                     
                            current = this_TempOfTheDay_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:520:5: this_DelaySinceActivy_2= ruleDelaySinceActivy
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getDelaySinceActivyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDelaySinceActivy_in_rulePredicate1022);
                    this_DelaySinceActivy_2=ruleDelaySinceActivy();

                    state._fsp--;

                     
                            current = this_DelaySinceActivy_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:530:5: this_GrainIs_3= ruleGrainIs
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getGrainIsParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGrainIs_in_rulePredicate1049);
                    this_GrainIs_3=ruleGrainIs();

                    state._fsp--;

                     
                            current = this_GrainIs_3; 
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleNoRain"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:546:1: entryRuleNoRain returns [EObject current=null] : iv_ruleNoRain= ruleNoRain EOF ;
    public final EObject entryRuleNoRain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRain = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:547:2: (iv_ruleNoRain= ruleNoRain EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:548:2: iv_ruleNoRain= ruleNoRain EOF
            {
             newCompositeNode(grammarAccess.getNoRainRule()); 
            pushFollow(FOLLOW_ruleNoRain_in_entryRuleNoRain1084);
            iv_ruleNoRain=ruleNoRain();

            state._fsp--;

             current =iv_ruleNoRain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRain1094); 

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
    // $ANTLR end "entryRuleNoRain"


    // $ANTLR start "ruleNoRain"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:555:1: ruleNoRain returns [EObject current=null] : (otherlv_0= 'no rain since' ( (lv_days_1_0= RULE_INT ) ) otherlv_2= 'days' ) ;
    public final EObject ruleNoRain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_days_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:558:28: ( (otherlv_0= 'no rain since' ( (lv_days_1_0= RULE_INT ) ) otherlv_2= 'days' ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:559:1: (otherlv_0= 'no rain since' ( (lv_days_1_0= RULE_INT ) ) otherlv_2= 'days' )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:559:1: (otherlv_0= 'no rain since' ( (lv_days_1_0= RULE_INT ) ) otherlv_2= 'days' )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:559:3: otherlv_0= 'no rain since' ( (lv_days_1_0= RULE_INT ) ) otherlv_2= 'days'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNoRain1131); 

                	newLeafNode(otherlv_0, grammarAccess.getNoRainAccess().getNoRainSinceKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:563:1: ( (lv_days_1_0= RULE_INT ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:564:1: (lv_days_1_0= RULE_INT )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:564:1: (lv_days_1_0= RULE_INT )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:565:3: lv_days_1_0= RULE_INT
            {
            lv_days_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNoRain1148); 

            			newLeafNode(lv_days_1_0, grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoRainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"days",
                    		lv_days_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleNoRain1165); 

                	newLeafNode(otherlv_2, grammarAccess.getNoRainAccess().getDaysKeyword_2());
                

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
    // $ANTLR end "ruleNoRain"


    // $ANTLR start "entryRuleTempOfTheDay"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:593:1: entryRuleTempOfTheDay returns [EObject current=null] : iv_ruleTempOfTheDay= ruleTempOfTheDay EOF ;
    public final EObject entryRuleTempOfTheDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempOfTheDay = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:594:2: (iv_ruleTempOfTheDay= ruleTempOfTheDay EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:595:2: iv_ruleTempOfTheDay= ruleTempOfTheDay EOF
            {
             newCompositeNode(grammarAccess.getTempOfTheDayRule()); 
            pushFollow(FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay1201);
            iv_ruleTempOfTheDay=ruleTempOfTheDay();

            state._fsp--;

             current =iv_ruleTempOfTheDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempOfTheDay1211); 

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
    // $ANTLR end "entryRuleTempOfTheDay"


    // $ANTLR start "ruleTempOfTheDay"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:602:1: ruleTempOfTheDay returns [EObject current=null] : (otherlv_0= 'temperature' ( (lv_comparison_1_0= ruleComp ) ) ( (lv_lowerTempBound_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTempUnit ) ) ) ;
    public final EObject ruleTempOfTheDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerTempBound_2_0=null;
        Enumerator lv_comparison_1_0 = null;

        Enumerator lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:605:28: ( (otherlv_0= 'temperature' ( (lv_comparison_1_0= ruleComp ) ) ( (lv_lowerTempBound_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTempUnit ) ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:606:1: (otherlv_0= 'temperature' ( (lv_comparison_1_0= ruleComp ) ) ( (lv_lowerTempBound_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTempUnit ) ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:606:1: (otherlv_0= 'temperature' ( (lv_comparison_1_0= ruleComp ) ) ( (lv_lowerTempBound_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTempUnit ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:606:3: otherlv_0= 'temperature' ( (lv_comparison_1_0= ruleComp ) ) ( (lv_lowerTempBound_2_0= RULE_INT ) ) ( (lv_unit_3_0= ruleTempUnit ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTempOfTheDay1248); 

                	newLeafNode(otherlv_0, grammarAccess.getTempOfTheDayAccess().getTemperatureKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:610:1: ( (lv_comparison_1_0= ruleComp ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:611:1: (lv_comparison_1_0= ruleComp )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:611:1: (lv_comparison_1_0= ruleComp )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:612:3: lv_comparison_1_0= ruleComp
            {
             
            	        newCompositeNode(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComp_in_ruleTempOfTheDay1269);
            lv_comparison_1_0=ruleComp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTempOfTheDayRule());
            	        }
                   		set(
                   			current, 
                   			"comparison",
                    		lv_comparison_1_0, 
                    		"Comp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:628:2: ( (lv_lowerTempBound_2_0= RULE_INT ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:629:1: (lv_lowerTempBound_2_0= RULE_INT )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:629:1: (lv_lowerTempBound_2_0= RULE_INT )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:630:3: lv_lowerTempBound_2_0= RULE_INT
            {
            lv_lowerTempBound_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTempOfTheDay1286); 

            			newLeafNode(lv_lowerTempBound_2_0, grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTempOfTheDayRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerTempBound",
                    		lv_lowerTempBound_2_0, 
                    		"INT");
            	    

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:646:2: ( (lv_unit_3_0= ruleTempUnit ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:647:1: (lv_unit_3_0= ruleTempUnit )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:647:1: (lv_unit_3_0= ruleTempUnit )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:648:3: lv_unit_3_0= ruleTempUnit
            {
             
            	        newCompositeNode(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTempUnit_in_ruleTempOfTheDay1312);
            lv_unit_3_0=ruleTempUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTempOfTheDayRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_3_0, 
                    		"TempUnit");
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
    // $ANTLR end "ruleTempOfTheDay"


    // $ANTLR start "entryRuleDelaySinceActivy"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:672:1: entryRuleDelaySinceActivy returns [EObject current=null] : iv_ruleDelaySinceActivy= ruleDelaySinceActivy EOF ;
    public final EObject entryRuleDelaySinceActivy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelaySinceActivy = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:673:2: (iv_ruleDelaySinceActivy= ruleDelaySinceActivy EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:674:2: iv_ruleDelaySinceActivy= ruleDelaySinceActivy EOF
            {
             newCompositeNode(grammarAccess.getDelaySinceActivyRule()); 
            pushFollow(FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy1348);
            iv_ruleDelaySinceActivy=ruleDelaySinceActivy();

            state._fsp--;

             current =iv_ruleDelaySinceActivy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelaySinceActivy1358); 

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
    // $ANTLR end "entryRuleDelaySinceActivy"


    // $ANTLR start "ruleDelaySinceActivy"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:681:1: ruleDelaySinceActivy returns [EObject current=null] : (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )? ) ;
    public final EObject ruleDelaySinceActivy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_days_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:684:28: ( (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )? ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:685:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )? )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:685:1: (otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )? )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:685:3: otherlv_0= 'after' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDelaySinceActivy1395); 

                	newLeafNode(otherlv_0, grammarAccess.getDelaySinceActivyAccess().getAfterKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:689:1: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:690:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:690:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:691:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDelaySinceActivyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelaySinceActivy1415); 

            		newLeafNode(otherlv_1, grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityCrossReference_1_0()); 
            	

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:702:2: (otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:702:4: otherlv_2= 'is done since' ( (lv_days_3_0= RULE_INT ) ) otherlv_4= 'days'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDelaySinceActivy1428); 

                        	newLeafNode(otherlv_2, grammarAccess.getDelaySinceActivyAccess().getIsDoneSinceKeyword_2_0());
                        
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:706:1: ( (lv_days_3_0= RULE_INT ) )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:707:1: (lv_days_3_0= RULE_INT )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:707:1: (lv_days_3_0= RULE_INT )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:708:3: lv_days_3_0= RULE_INT
                    {
                    lv_days_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDelaySinceActivy1445); 

                    			newLeafNode(lv_days_3_0, grammarAccess.getDelaySinceActivyAccess().getDaysINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDelaySinceActivyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"days",
                            		lv_days_3_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleDelaySinceActivy1462); 

                        	newLeafNode(otherlv_4, grammarAccess.getDelaySinceActivyAccess().getDaysKeyword_2_2());
                        

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
    // $ANTLR end "ruleDelaySinceActivy"


    // $ANTLR start "entryRuleGrainIs"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:736:1: entryRuleGrainIs returns [EObject current=null] : iv_ruleGrainIs= ruleGrainIs EOF ;
    public final EObject entryRuleGrainIs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrainIs = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:737:2: (iv_ruleGrainIs= ruleGrainIs EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:738:2: iv_ruleGrainIs= ruleGrainIs EOF
            {
             newCompositeNode(grammarAccess.getGrainIsRule()); 
            pushFollow(FOLLOW_ruleGrainIs_in_entryRuleGrainIs1500);
            iv_ruleGrainIs=ruleGrainIs();

            state._fsp--;

             current =iv_ruleGrainIs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrainIs1510); 

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
    // $ANTLR end "entryRuleGrainIs"


    // $ANTLR start "ruleGrainIs"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:745:1: ruleGrainIs returns [EObject current=null] : (otherlv_0= 'grain is' ( (lv_state_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGrainIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_state_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:748:28: ( (otherlv_0= 'grain is' ( (lv_state_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:749:1: (otherlv_0= 'grain is' ( (lv_state_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:749:1: (otherlv_0= 'grain is' ( (lv_state_1_0= RULE_STRING ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:749:3: otherlv_0= 'grain is' ( (lv_state_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGrainIs1547); 

                	newLeafNode(otherlv_0, grammarAccess.getGrainIsAccess().getGrainIsKeyword_0());
                
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:753:1: ( (lv_state_1_0= RULE_STRING ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:754:1: (lv_state_1_0= RULE_STRING )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:754:1: (lv_state_1_0= RULE_STRING )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:755:3: lv_state_1_0= RULE_STRING
            {
            lv_state_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGrainIs1564); 

            			newLeafNode(lv_state_1_0, grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGrainIsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"state",
                    		lv_state_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleGrainIs"


    // $ANTLR start "entryRuleDate"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:779:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:780:2: (iv_ruleDate= ruleDate EOF )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:781:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1605);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1615); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:788:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) ( (lv_month_1_0= ruleMonth ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Enumerator lv_month_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:791:28: ( ( ( (lv_day_0_0= RULE_INT ) ) ( (lv_month_1_0= ruleMonth ) ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:792:1: ( ( (lv_day_0_0= RULE_INT ) ) ( (lv_month_1_0= ruleMonth ) ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:792:1: ( ( (lv_day_0_0= RULE_INT ) ) ( (lv_month_1_0= ruleMonth ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:792:2: ( (lv_day_0_0= RULE_INT ) ) ( (lv_month_1_0= ruleMonth ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:792:2: ( (lv_day_0_0= RULE_INT ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:793:1: (lv_day_0_0= RULE_INT )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:793:1: (lv_day_0_0= RULE_INT )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:794:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1657); 

            			newLeafNode(lv_day_0_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_0_0, 
                    		"INT");
            	    

            }


            }

            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:810:2: ( (lv_month_1_0= ruleMonth ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:811:1: (lv_month_1_0= ruleMonth )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:811:1: (lv_month_1_0= ruleMonth )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:812:3: lv_month_1_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate1683);
            lv_month_1_0=ruleMonth();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"month",
                    		lv_month_1_0, 
                    		"Month");
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
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleMonth"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:836:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'jan' ) | (enumLiteral_1= 'feb' ) | (enumLiteral_2= 'mar' ) | (enumLiteral_3= 'apr' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'jun' ) | (enumLiteral_6= 'jul' ) | (enumLiteral_7= 'aug' ) | (enumLiteral_8= 'sept' ) | (enumLiteral_9= 'oct' ) | (enumLiteral_10= 'nov' ) | (enumLiteral_11= 'dec' ) ) ;
    public final Enumerator ruleMonth() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:838:28: ( ( (enumLiteral_0= 'jan' ) | (enumLiteral_1= 'feb' ) | (enumLiteral_2= 'mar' ) | (enumLiteral_3= 'apr' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'jun' ) | (enumLiteral_6= 'jul' ) | (enumLiteral_7= 'aug' ) | (enumLiteral_8= 'sept' ) | (enumLiteral_9= 'oct' ) | (enumLiteral_10= 'nov' ) | (enumLiteral_11= 'dec' ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:839:1: ( (enumLiteral_0= 'jan' ) | (enumLiteral_1= 'feb' ) | (enumLiteral_2= 'mar' ) | (enumLiteral_3= 'apr' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'jun' ) | (enumLiteral_6= 'jul' ) | (enumLiteral_7= 'aug' ) | (enumLiteral_8= 'sept' ) | (enumLiteral_9= 'oct' ) | (enumLiteral_10= 'nov' ) | (enumLiteral_11= 'dec' ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:839:1: ( (enumLiteral_0= 'jan' ) | (enumLiteral_1= 'feb' ) | (enumLiteral_2= 'mar' ) | (enumLiteral_3= 'apr' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'jun' ) | (enumLiteral_6= 'jul' ) | (enumLiteral_7= 'aug' ) | (enumLiteral_8= 'sept' ) | (enumLiteral_9= 'oct' ) | (enumLiteral_10= 'nov' ) | (enumLiteral_11= 'dec' ) )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            case 35:
                {
                alt12=7;
                }
                break;
            case 36:
                {
                alt12=8;
                }
                break;
            case 37:
                {
                alt12=9;
                }
                break;
            case 38:
                {
                alt12=10;
                }
                break;
            case 39:
                {
                alt12=11;
                }
                break;
            case 40:
                {
                alt12=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:839:2: (enumLiteral_0= 'jan' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:839:2: (enumLiteral_0= 'jan' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:839:4: enumLiteral_0= 'jan'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleMonth1733); 

                            current = grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:845:6: (enumLiteral_1= 'feb' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:845:6: (enumLiteral_1= 'feb' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:845:8: enumLiteral_1= 'feb'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleMonth1750); 

                            current = grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:851:6: (enumLiteral_2= 'mar' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:851:6: (enumLiteral_2= 'mar' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:851:8: enumLiteral_2= 'mar'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleMonth1767); 

                            current = grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:857:6: (enumLiteral_3= 'apr' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:857:6: (enumLiteral_3= 'apr' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:857:8: enumLiteral_3= 'apr'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleMonth1784); 

                            current = grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:863:6: (enumLiteral_4= 'may' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:863:6: (enumLiteral_4= 'may' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:863:8: enumLiteral_4= 'may'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_33_in_ruleMonth1801); 

                            current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:869:6: (enumLiteral_5= 'jun' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:869:6: (enumLiteral_5= 'jun' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:869:8: enumLiteral_5= 'jun'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_34_in_ruleMonth1818); 

                            current = grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:875:6: (enumLiteral_6= 'jul' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:875:6: (enumLiteral_6= 'jul' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:875:8: enumLiteral_6= 'jul'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_35_in_ruleMonth1835); 

                            current = grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:881:6: (enumLiteral_7= 'aug' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:881:6: (enumLiteral_7= 'aug' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:881:8: enumLiteral_7= 'aug'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_36_in_ruleMonth1852); 

                            current = grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:887:6: (enumLiteral_8= 'sept' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:887:6: (enumLiteral_8= 'sept' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:887:8: enumLiteral_8= 'sept'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_37_in_ruleMonth1869); 

                            current = grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:893:6: (enumLiteral_9= 'oct' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:893:6: (enumLiteral_9= 'oct' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:893:8: enumLiteral_9= 'oct'
                    {
                    enumLiteral_9=(Token)match(input,38,FOLLOW_38_in_ruleMonth1886); 

                            current = grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:899:6: (enumLiteral_10= 'nov' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:899:6: (enumLiteral_10= 'nov' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:899:8: enumLiteral_10= 'nov'
                    {
                    enumLiteral_10=(Token)match(input,39,FOLLOW_39_in_ruleMonth1903); 

                            current = grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:905:6: (enumLiteral_11= 'dec' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:905:6: (enumLiteral_11= 'dec' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:905:8: enumLiteral_11= 'dec'
                    {
                    enumLiteral_11=(Token)match(input,40,FOLLOW_40_in_ruleMonth1920); 

                            current = grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11()); 
                        

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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleComp"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:915:1: ruleComp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) ;
    public final Enumerator ruleComp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:917:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:918:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:918:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:918:2: (enumLiteral_0= '>' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:918:2: (enumLiteral_0= '>' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:918:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleComp1965); 

                            current = grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:924:6: (enumLiteral_1= '<' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:924:6: (enumLiteral_1= '<' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:924:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleComp1982); 

                            current = grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleComp"


    // $ANTLR start "ruleTempUnit"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:934:1: ruleTempUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) ;
    public final Enumerator ruleTempUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:936:28: ( ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:937:1: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:937:1: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==44) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:937:2: (enumLiteral_0= '\\u00B0C' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:937:2: (enumLiteral_0= '\\u00B0C' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:937:4: enumLiteral_0= '\\u00B0C'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleTempUnit2027); 

                            current = grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:943:6: (enumLiteral_1= '\\u00B0F' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:943:6: (enumLiteral_1= '\\u00B0F' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:943:8: enumLiteral_1= '\\u00B0F'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleTempUnit2044); 

                            current = grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleTempUnit"


    // $ANTLR start "ruleFrequency"
    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:953:1: ruleFrequency returns [Enumerator current=null] : ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'daily' ) | (enumLiteral_2= 'weekly' ) | (enumLiteral_3= 'monthly' ) | (enumLiteral_4= 'quaterly' ) | (enumLiteral_5= 'yearly' ) ) ;
    public final Enumerator ruleFrequency() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:955:28: ( ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'daily' ) | (enumLiteral_2= 'weekly' ) | (enumLiteral_3= 'monthly' ) | (enumLiteral_4= 'quaterly' ) | (enumLiteral_5= 'yearly' ) ) )
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:956:1: ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'daily' ) | (enumLiteral_2= 'weekly' ) | (enumLiteral_3= 'monthly' ) | (enumLiteral_4= 'quaterly' ) | (enumLiteral_5= 'yearly' ) )
            {
            // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:956:1: ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'daily' ) | (enumLiteral_2= 'weekly' ) | (enumLiteral_3= 'monthly' ) | (enumLiteral_4= 'quaterly' ) | (enumLiteral_5= 'yearly' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt15=1;
                }
                break;
            case 46:
                {
                alt15=2;
                }
                break;
            case 47:
                {
                alt15=3;
                }
                break;
            case 48:
                {
                alt15=4;
                }
                break;
            case 49:
                {
                alt15=5;
                }
                break;
            case 50:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:956:2: (enumLiteral_0= 'once' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:956:2: (enumLiteral_0= 'once' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:956:4: enumLiteral_0= 'once'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleFrequency2089); 

                            current = grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:962:6: (enumLiteral_1= 'daily' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:962:6: (enumLiteral_1= 'daily' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:962:8: enumLiteral_1= 'daily'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleFrequency2106); 

                            current = grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:968:6: (enumLiteral_2= 'weekly' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:968:6: (enumLiteral_2= 'weekly' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:968:8: enumLiteral_2= 'weekly'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleFrequency2123); 

                            current = grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:974:6: (enumLiteral_3= 'monthly' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:974:6: (enumLiteral_3= 'monthly' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:974:8: enumLiteral_3= 'monthly'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleFrequency2140); 

                            current = grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:980:6: (enumLiteral_4= 'quaterly' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:980:6: (enumLiteral_4= 'quaterly' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:980:8: enumLiteral_4= 'quaterly'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleFrequency2157); 

                            current = grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:986:6: (enumLiteral_5= 'yearly' )
                    {
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:986:6: (enumLiteral_5= 'yearly' )
                    // ../org.gemoc.agro.activities/src-gen/org/gemoc/agro/parser/antlr/internal/InternalActivitiesDSL.g:986:8: enumLiteral_5= 'yearly'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_50_in_ruleFrequency2174); 

                            current = grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleFrequency"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_ruleModel131 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleResourceKind_in_ruleModel153 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleResourceKind_in_entryRuleResourceKind190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceKind200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleResourceKind237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceKind254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCulture305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCulture342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCulture359 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCulture376 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_ruleCulture397 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCulture410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploitationActivity456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExploitationActivity493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploitationActivity510 = new BitSet(new long[]{0x0007E00000250002L});
    public static final BitSet FOLLOW_ruleFrequency_in_ruleExploitationActivity536 = new BitSet(new long[]{0x0000000000250002L});
    public static final BitSet FOLLOW_16_in_ruleExploitationActivity550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDate_in_ruleExploitationActivity571 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExploitationActivity583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDate_in_ruleExploitationActivity604 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_ruleExploitationActivity619 = new BitSet(new long[]{0x0000000016800000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleExploitationActivity640 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleExploitationActivity653 = new BitSet(new long[]{0x0000000016800000L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleExploitationActivity674 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleExploitationActivity688 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExploitationActivity703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleActivityResource_in_ruleExploitationActivity724 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleExploitationActivity737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleActivityResource_in_ruleExploitationActivity758 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleActivityResource_in_entryRuleActivityResource798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityResource808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivityResource850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityResource875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_rulePredicate968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_rulePredicate995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_rulePredicate1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_rulePredicate1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRain1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNoRain1131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNoRain1148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNoRain1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempOfTheDay1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTempOfTheDay1248 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ruleComp_in_ruleTempOfTheDay1269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTempOfTheDay1286 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleTempUnit_in_ruleTempOfTheDay1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy1348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelaySinceActivy1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDelaySinceActivy1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelaySinceActivy1415 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleDelaySinceActivy1428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDelaySinceActivy1445 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDelaySinceActivy1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_entryRuleGrainIs1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrainIs1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGrainIs1547 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGrainIs1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1657 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMonth1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMonth1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMonth1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMonth1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMonth1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMonth1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMonth1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMonth1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMonth1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMonth1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMonth1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMonth1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComp1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComp1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTempUnit2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTempUnit2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFrequency2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFrequency2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFrequency2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFrequency2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFrequency2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFrequency2174 = new BitSet(new long[]{0x0000000000000002L});

}