package org.xtext.example.cicd.parser.antlr.internal;

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
import org.xtext.example.cicd.services.CICDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCICDParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DockerContainer", "ScheduleTrigger", "AllowFaillure", "MatrixConfig", "Environment", "Description", "RequireJobs", "Parameters", "Else_steps", "Condition", "Parameter", "Artifact", "DOWNLOAD", "PASSWORD", "Pipeline", "If_steps", "Parallel", "Password", "Username", "BOOLEAN", "Command", "DEFAULT", "EXCLUDE", "INCLUDE", "Default", "Message", "CHOICE", "IfStep", "Matrix", "NUMBER", "Output", "SECRET", "STRING", "UPLOAD", "Labels", "Values", "Agent", "Cache", "Input", "STORE", "False", "Image", "Paths", "Timer", "Value", "BOTH", "LOAD", "Step", "TEXT", "Keys", "Mode", "Name", "Path", "True", "Type", "Job", "Key", "Comma", "RULE_NEWLINE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=63;
    public static final int Values=39;
    public static final int True=57;
    public static final int TEXT=52;
    public static final int Parallel=20;
    public static final int False=44;
    public static final int Image=45;
    public static final int Else_steps=12;
    public static final int Name=55;
    public static final int Input=42;
    public static final int Matrix=32;
    public static final int UPLOAD=37;
    public static final int AllowFaillure=6;
    public static final int INCLUDE=27;
    public static final int Job=59;
    public static final int BOTH=49;
    public static final int Agent=40;
    public static final int NUMBER=33;
    public static final int Parameters=11;
    public static final int RULE_ID=65;
    public static final int Labels=38;
    public static final int BOOLEAN=23;
    public static final int PASSWORD=17;
    public static final int EXCLUDE=26;
    public static final int RULE_INT=66;
    public static final int Keys=53;
    public static final int Value=48;
    public static final int RULE_ML_COMMENT=68;
    public static final int Environment=8;
    public static final int RequireJobs=10;
    public static final int If_steps=19;
    public static final int SECRET=35;
    public static final int Key=60;
    public static final int Cache=41;
    public static final int MatrixConfig=7;
    public static final int RULE_END=64;
    public static final int Description=9;
    public static final int Message=29;
    public static final int LOAD=50;
    public static final int RULE_NEWLINE=62;
    public static final int DOWNLOAD=16;
    public static final int RULE_STRING=67;
    public static final int Step=51;
    public static final int RULE_SL_COMMENT=69;
    public static final int CHOICE=30;
    public static final int Comma=61;
    public static final int Output=34;
    public static final int Paths=46;
    public static final int EOF=-1;
    public static final int Password=21;
    public static final int ScheduleTrigger=5;
    public static final int Condition=13;
    public static final int Path=56;
    public static final int DockerContainer=4;
    public static final int RULE_WS=70;
    public static final int Mode=54;
    public static final int RULE_ANY_OTHER=71;
    public static final int Default=28;
    public static final int Artifact=15;
    public static final int Pipeline=18;
    public static final int Type=58;
    public static final int Timer=47;
    public static final int Username=22;
    public static final int Command=24;
    public static final int STORE=43;
    public static final int Parameter=14;
    public static final int STRING=36;
    public static final int DEFAULT=25;
    public static final int IfStep=31;

    // delegates
    // delegators


        public InternalCICDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCICDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCICDParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCICDParser.g"; }



     	private CICDGrammarAccess grammarAccess;

        public InternalCICDParser(TokenStream input, CICDGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected CICDGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalCICDParser.g:58:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalCICDParser.g:58:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalCICDParser.g:59:2: iv_rulePipeline= rulePipeline EOF
            {
             newCompositeNode(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipeline=rulePipeline();

            state._fsp--;

             current =iv_rulePipeline; 
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
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalCICDParser.g:65:1: rulePipeline returns [EObject current=null] : (otherlv_0= Pipeline (this_NEWLINE_1= RULE_NEWLINE )? (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )? ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? ) ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )? ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_NEWLINE_1=null;
        Token otherlv_2=null;
        Token this_NEWLINE_4=null;
        Token this_NEWLINE_6=null;
        Token this_NEWLINE_8=null;
        Token this_NEWLINE_10=null;
        Token this_NEWLINE_12=null;
        Token this_NEWLINE_14=null;
        Token this_NEWLINE_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_jobs_5_0 = null;

        EObject lv_pipeline_environment_7_0 = null;

        EObject lv_triggers_9_0 = null;

        EObject lv_agents_11_0 = null;

        EObject lv_inputs_13_0 = null;

        EObject lv_output_15_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:71:2: ( (otherlv_0= Pipeline (this_NEWLINE_1= RULE_NEWLINE )? (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )? ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? ) ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )? ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? ) )
            // InternalCICDParser.g:72:2: (otherlv_0= Pipeline (this_NEWLINE_1= RULE_NEWLINE )? (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )? ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? ) ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )? ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? )
            {
            // InternalCICDParser.g:72:2: (otherlv_0= Pipeline (this_NEWLINE_1= RULE_NEWLINE )? (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )? ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? ) ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )? ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? )
            // InternalCICDParser.g:73:3: otherlv_0= Pipeline (this_NEWLINE_1= RULE_NEWLINE )? (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )? ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? ) ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )? ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )?
            {
            otherlv_0=(Token)match(input,Pipeline,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getPipelineKeyword_0());
            		
            // InternalCICDParser.g:77:3: (this_NEWLINE_1= RULE_NEWLINE )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NEWLINE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCICDParser.g:78:4: this_NEWLINE_1= RULE_NEWLINE
                    {
                    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_3); 

                    				newLeafNode(this_NEWLINE_1, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalCICDParser.g:83:3: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Name) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCICDParser.g:84:4: otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_NEWLINE_4= RULE_NEWLINE
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPipelineAccess().getNameKeyword_2_0());
                    			
                    // InternalCICDParser.g:88:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalCICDParser.g:89:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalCICDParser.g:89:5: (lv_name_3_0= ruleEString )
                    // InternalCICDParser.g:90:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.xtext.example.cicd.CICD.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_3); 

                    				newLeafNode(this_NEWLINE_4, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalCICDParser.g:112:3: ( ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )? )
            // InternalCICDParser.g:113:4: ( (lv_jobs_5_0= ruleJob ) )+ (this_NEWLINE_6= RULE_NEWLINE )?
            {
            // InternalCICDParser.g:113:4: ( (lv_jobs_5_0= ruleJob ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Job) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCICDParser.g:114:5: (lv_jobs_5_0= ruleJob )
            	    {
            	    // InternalCICDParser.g:114:5: (lv_jobs_5_0= ruleJob )
            	    // InternalCICDParser.g:115:6: lv_jobs_5_0= ruleJob
            	    {

            	    						newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_jobs_5_0=ruleJob();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobs",
            	    							lv_jobs_5_0,
            	    							"org.xtext.example.cicd.CICD.Job");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalCICDParser.g:132:4: (this_NEWLINE_6= RULE_NEWLINE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NEWLINE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCICDParser.g:133:5: this_NEWLINE_6= RULE_NEWLINE
                    {
                    this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_7); 

                    					newLeafNode(this_NEWLINE_6, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_3_1());
                    				

                    }
                    break;

            }


            }

            // InternalCICDParser.g:139:3: ( ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Environment) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCICDParser.g:140:4: ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+ (this_NEWLINE_8= RULE_NEWLINE )?
                    {
                    // InternalCICDParser.g:140:4: ( (lv_pipeline_environment_7_0= ruleEnvironment ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Environment) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCICDParser.g:141:5: (lv_pipeline_environment_7_0= ruleEnvironment )
                    	    {
                    	    // InternalCICDParser.g:141:5: (lv_pipeline_environment_7_0= ruleEnvironment )
                    	    // InternalCICDParser.g:142:6: lv_pipeline_environment_7_0= ruleEnvironment
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_environmentEnvironmentParserRuleCall_4_0_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_pipeline_environment_7_0=ruleEnvironment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"pipeline_environment",
                    	    							lv_pipeline_environment_7_0,
                    	    							"org.xtext.example.cicd.CICD.Environment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // InternalCICDParser.g:159:4: (this_NEWLINE_8= RULE_NEWLINE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_NEWLINE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCICDParser.g:160:5: this_NEWLINE_8= RULE_NEWLINE
                            {
                            this_NEWLINE_8=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

                            					newLeafNode(this_NEWLINE_8, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:166:3: ( ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ScheduleTrigger) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCICDParser.g:167:4: ( (lv_triggers_9_0= ruleScheduleTrigger ) )+ (this_NEWLINE_10= RULE_NEWLINE )?
                    {
                    // InternalCICDParser.g:167:4: ( (lv_triggers_9_0= ruleScheduleTrigger ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ScheduleTrigger) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCICDParser.g:168:5: (lv_triggers_9_0= ruleScheduleTrigger )
                    	    {
                    	    // InternalCICDParser.g:168:5: (lv_triggers_9_0= ruleScheduleTrigger )
                    	    // InternalCICDParser.g:169:6: lv_triggers_9_0= ruleScheduleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getTriggersScheduleTriggerParserRuleCall_5_0_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_triggers_9_0=ruleScheduleTrigger();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"triggers",
                    	    							lv_triggers_9_0,
                    	    							"org.xtext.example.cicd.CICD.ScheduleTrigger");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // InternalCICDParser.g:186:4: (this_NEWLINE_10= RULE_NEWLINE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_NEWLINE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCICDParser.g:187:5: this_NEWLINE_10= RULE_NEWLINE
                            {
                            this_NEWLINE_10=(Token)match(input,RULE_NEWLINE,FOLLOW_11); 

                            					newLeafNode(this_NEWLINE_10, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_5_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:193:3: ( ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Agent) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCICDParser.g:194:4: ( (lv_agents_11_0= ruleAgent ) )+ (this_NEWLINE_12= RULE_NEWLINE )?
                    {
                    // InternalCICDParser.g:194:4: ( (lv_agents_11_0= ruleAgent ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Agent) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCICDParser.g:195:5: (lv_agents_11_0= ruleAgent )
                    	    {
                    	    // InternalCICDParser.g:195:5: (lv_agents_11_0= ruleAgent )
                    	    // InternalCICDParser.g:196:6: lv_agents_11_0= ruleAgent
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getAgentsAgentParserRuleCall_6_0_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_agents_11_0=ruleAgent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"agents",
                    	    							lv_agents_11_0,
                    	    							"org.xtext.example.cicd.CICD.Agent");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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

                    // InternalCICDParser.g:213:4: (this_NEWLINE_12= RULE_NEWLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_NEWLINE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCICDParser.g:214:5: this_NEWLINE_12= RULE_NEWLINE
                            {
                            this_NEWLINE_12=(Token)match(input,RULE_NEWLINE,FOLLOW_13); 

                            					newLeafNode(this_NEWLINE_12, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_6_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:220:3: ( ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Input) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCICDParser.g:221:4: ( (lv_inputs_13_0= ruleInput ) )+ (this_NEWLINE_14= RULE_NEWLINE )?
                    {
                    // InternalCICDParser.g:221:4: ( (lv_inputs_13_0= ruleInput ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Input) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCICDParser.g:222:5: (lv_inputs_13_0= ruleInput )
                    	    {
                    	    // InternalCICDParser.g:222:5: (lv_inputs_13_0= ruleInput )
                    	    // InternalCICDParser.g:223:6: lv_inputs_13_0= ruleInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getInputsInputParserRuleCall_7_0_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputs_13_0=ruleInput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_13_0,
                    	    							"org.xtext.example.cicd.CICD.Input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // InternalCICDParser.g:240:4: (this_NEWLINE_14= RULE_NEWLINE )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_NEWLINE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCICDParser.g:241:5: this_NEWLINE_14= RULE_NEWLINE
                            {
                            this_NEWLINE_14=(Token)match(input,RULE_NEWLINE,FOLLOW_15); 

                            					newLeafNode(this_NEWLINE_14, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_7_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:247:3: ( ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Output) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCICDParser.g:248:4: ( (lv_output_15_0= ruleOutput ) )+ (this_NEWLINE_16= RULE_NEWLINE )?
                    {
                    // InternalCICDParser.g:248:4: ( (lv_output_15_0= ruleOutput ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Output) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCICDParser.g:249:5: (lv_output_15_0= ruleOutput )
                    	    {
                    	    // InternalCICDParser.g:249:5: (lv_output_15_0= ruleOutput )
                    	    // InternalCICDParser.g:250:6: lv_output_15_0= ruleOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getOutputOutputParserRuleCall_8_0_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_output_15_0=ruleOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"output",
                    	    							lv_output_15_0,
                    	    							"org.xtext.example.cicd.CICD.Output");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // InternalCICDParser.g:267:4: (this_NEWLINE_16= RULE_NEWLINE )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_NEWLINE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalCICDParser.g:268:5: this_NEWLINE_16= RULE_NEWLINE
                            {
                            this_NEWLINE_16=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                            					newLeafNode(this_NEWLINE_16, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_8_1());
                            				

                            }
                            break;

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
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleJob"
    // InternalCICDParser.g:278:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalCICDParser.g:278:44: (iv_ruleJob= ruleJob EOF )
            // InternalCICDParser.g:279:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
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
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalCICDParser.g:285:1: ruleJob returns [EObject current=null] : (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_allowFaillure_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_parallel_6_0 = null;

        AntlrDatatypeRuleToken lv_requireJobs_8_0 = null;

        AntlrDatatypeRuleToken lv_requireJobs_10_0 = null;

        EObject lv_steps_11_0 = null;

        EObject lv_IfStep_12_0 = null;

        EObject lv_artifacts_13_0 = null;

        EObject lv_environments_14_0 = null;

        EObject lv_jobs_15_0 = null;

        EObject lv_matrix_16_0 = null;

        EObject lv_agents_17_0 = null;

        EObject lv_output_18_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:291:2: ( (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END ) ) )
            // InternalCICDParser.g:292:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END ) )
            {
            // InternalCICDParser.g:292:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END ) )
            // InternalCICDParser.g:293:3: otherlv_0= Job (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END )
            {
            otherlv_0=(Token)match(input,Job,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getJobKeyword_0());
            		
            // InternalCICDParser.g:297:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END )
            // InternalCICDParser.g:298:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_allowFaillure_4_0= AllowFaillure ) )? (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )? (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )? ( (lv_steps_11_0= ruleStep ) )* ( (lv_IfStep_12_0= ruleIfStep ) )* ( (lv_artifacts_13_0= ruleArtifact ) )* ( (lv_environments_14_0= ruleEnvironment ) )* ( (lv_jobs_15_0= ruleJob ) )* ( (lv_matrix_16_0= ruleMatrix ) )? ( (lv_agents_17_0= ruleAgent ) )* ( (lv_output_18_0= ruleOutput ) )* this_END_19= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getJobAccess().getNameKeyword_1_1());
            			
            // InternalCICDParser.g:306:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCICDParser.g:307:5: (lv_name_3_0= ruleEString )
            {
            // InternalCICDParser.g:307:5: (lv_name_3_0= ruleEString )
            // InternalCICDParser.g:308:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_19);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:325:4: ( (lv_allowFaillure_4_0= AllowFaillure ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==AllowFaillure) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCICDParser.g:326:5: (lv_allowFaillure_4_0= AllowFaillure )
                    {
                    // InternalCICDParser.g:326:5: (lv_allowFaillure_4_0= AllowFaillure )
                    // InternalCICDParser.g:327:6: lv_allowFaillure_4_0= AllowFaillure
                    {
                    lv_allowFaillure_4_0=(Token)match(input,AllowFaillure,FOLLOW_20); 

                    						newLeafNode(lv_allowFaillure_4_0, grammarAccess.getJobAccess().getAllowFaillureAllowFaillureKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    						setWithLastConsumed(current, "allowFaillure", lv_allowFaillure_4_0 != null, "allowFaillure");
                    					

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:339:4: (otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Parallel) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCICDParser.g:340:5: otherlv_5= Parallel ( (lv_parallel_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Parallel,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getJobAccess().getParallelKeyword_1_4_0());
                    				
                    // InternalCICDParser.g:344:5: ( (lv_parallel_6_0= ruleEString ) )
                    // InternalCICDParser.g:345:6: (lv_parallel_6_0= ruleEString )
                    {
                    // InternalCICDParser.g:345:6: (lv_parallel_6_0= ruleEString )
                    // InternalCICDParser.g:346:7: lv_parallel_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getParallelEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_parallel_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobRule());
                    							}
                    							set(
                    								current,
                    								"parallel",
                    								lv_parallel_6_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:364:4: (otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RequireJobs) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCICDParser.g:365:5: otherlv_7= RequireJobs ( (lv_requireJobs_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,RequireJobs,FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRequireJobsKeyword_1_5_0());
                    				
                    // InternalCICDParser.g:369:5: ( (lv_requireJobs_8_0= ruleEString ) )
                    // InternalCICDParser.g:370:6: (lv_requireJobs_8_0= ruleEString )
                    {
                    // InternalCICDParser.g:370:6: (lv_requireJobs_8_0= ruleEString )
                    // InternalCICDParser.g:371:7: lv_requireJobs_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getRequireJobsEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_requireJobs_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobRule());
                    							}
                    							add(
                    								current,
                    								"requireJobs",
                    								lv_requireJobs_8_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCICDParser.g:388:5: (otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCICDParser.g:389:6: otherlv_9= Comma ( (lv_requireJobs_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getJobAccess().getCommaKeyword_1_5_2_0());
                    	    					
                    	    // InternalCICDParser.g:393:6: ( (lv_requireJobs_10_0= ruleEString ) )
                    	    // InternalCICDParser.g:394:7: (lv_requireJobs_10_0= ruleEString )
                    	    {
                    	    // InternalCICDParser.g:394:7: (lv_requireJobs_10_0= ruleEString )
                    	    // InternalCICDParser.g:395:8: lv_requireJobs_10_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getJobAccess().getRequireJobsEStringParserRuleCall_1_5_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_22);
                    	    lv_requireJobs_10_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJobRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"requireJobs",
                    	    									lv_requireJobs_10_0,
                    	    									"org.xtext.example.cicd.CICD.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCICDParser.g:414:4: ( (lv_steps_11_0= ruleStep ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Step) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCICDParser.g:415:5: (lv_steps_11_0= ruleStep )
            	    {
            	    // InternalCICDParser.g:415:5: (lv_steps_11_0= ruleStep )
            	    // InternalCICDParser.g:416:6: lv_steps_11_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_steps_11_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_11_0,
            	    							"org.xtext.example.cicd.CICD.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalCICDParser.g:433:4: ( (lv_IfStep_12_0= ruleIfStep ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IfStep) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCICDParser.g:434:5: (lv_IfStep_12_0= ruleIfStep )
            	    {
            	    // InternalCICDParser.g:434:5: (lv_IfStep_12_0= ruleIfStep )
            	    // InternalCICDParser.g:435:6: lv_IfStep_12_0= ruleIfStep
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getIfStepIfStepParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_IfStep_12_0=ruleIfStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"IfStep",
            	    							lv_IfStep_12_0,
            	    							"org.xtext.example.cicd.CICD.IfStep");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalCICDParser.g:452:4: ( (lv_artifacts_13_0= ruleArtifact ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Artifact) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCICDParser.g:453:5: (lv_artifacts_13_0= ruleArtifact )
            	    {
            	    // InternalCICDParser.g:453:5: (lv_artifacts_13_0= ruleArtifact )
            	    // InternalCICDParser.g:454:6: lv_artifacts_13_0= ruleArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getArtifactsArtifactParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_artifacts_13_0=ruleArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"artifacts",
            	    							lv_artifacts_13_0,
            	    							"org.xtext.example.cicd.CICD.Artifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalCICDParser.g:471:4: ( (lv_environments_14_0= ruleEnvironment ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Environment) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCICDParser.g:472:5: (lv_environments_14_0= ruleEnvironment )
            	    {
            	    // InternalCICDParser.g:472:5: (lv_environments_14_0= ruleEnvironment )
            	    // InternalCICDParser.g:473:6: lv_environments_14_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getEnvironmentsEnvironmentParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_environments_14_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_14_0,
            	    							"org.xtext.example.cicd.CICD.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalCICDParser.g:490:4: ( (lv_jobs_15_0= ruleJob ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Job) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCICDParser.g:491:5: (lv_jobs_15_0= ruleJob )
            	    {
            	    // InternalCICDParser.g:491:5: (lv_jobs_15_0= ruleJob )
            	    // InternalCICDParser.g:492:6: lv_jobs_15_0= ruleJob
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getJobsJobParserRuleCall_1_10_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_jobs_15_0=ruleJob();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobs",
            	    							lv_jobs_15_0,
            	    							"org.xtext.example.cicd.CICD.Job");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalCICDParser.g:509:4: ( (lv_matrix_16_0= ruleMatrix ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Matrix) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCICDParser.g:510:5: (lv_matrix_16_0= ruleMatrix )
                    {
                    // InternalCICDParser.g:510:5: (lv_matrix_16_0= ruleMatrix )
                    // InternalCICDParser.g:511:6: lv_matrix_16_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getMatrixMatrixParserRuleCall_1_11_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_matrix_16_0=ruleMatrix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"matrix",
                    							lv_matrix_16_0,
                    							"org.xtext.example.cicd.CICD.Matrix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:528:4: ( (lv_agents_17_0= ruleAgent ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Agent) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCICDParser.g:529:5: (lv_agents_17_0= ruleAgent )
            	    {
            	    // InternalCICDParser.g:529:5: (lv_agents_17_0= ruleAgent )
            	    // InternalCICDParser.g:530:6: lv_agents_17_0= ruleAgent
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getAgentsAgentParserRuleCall_1_12_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_agents_17_0=ruleAgent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"agents",
            	    							lv_agents_17_0,
            	    							"org.xtext.example.cicd.CICD.Agent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalCICDParser.g:547:4: ( (lv_output_18_0= ruleOutput ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Output) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCICDParser.g:548:5: (lv_output_18_0= ruleOutput )
            	    {
            	    // InternalCICDParser.g:548:5: (lv_output_18_0= ruleOutput )
            	    // InternalCICDParser.g:549:6: lv_output_18_0= ruleOutput
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getOutputOutputParserRuleCall_1_13_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_output_18_0=ruleOutput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_18_0,
            	    							"org.xtext.example.cicd.CICD.Output");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_19, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_14());
            			

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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleEnvironment"
    // InternalCICDParser.g:575:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCICDParser.g:575:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCICDParser.g:576:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalCICDParser.g:582:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:588:2: ( (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCICDParser.g:589:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCICDParser.g:589:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCICDParser.g:590:3: otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalCICDParser.g:594:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCICDParser.g:595:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEnvironmentAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getKeyKeyword_1_1());
            			
            // InternalCICDParser.g:603:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCICDParser.g:604:5: (lv_key_3_0= ruleEString )
            {
            // InternalCICDParser.g:604:5: (lv_key_3_0= ruleEString )
            // InternalCICDParser.g:605:6: lv_key_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_31);
            lv_key_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getValueKeyword_1_3());
            			
            // InternalCICDParser.g:626:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCICDParser.g:627:5: (lv_value_5_0= ruleEString )
            {
            // InternalCICDParser.g:627:5: (lv_value_5_0= ruleEString )
            // InternalCICDParser.g:628:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_32);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getEnvironmentAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleScheduleTrigger"
    // InternalCICDParser.g:654:1: entryRuleScheduleTrigger returns [EObject current=null] : iv_ruleScheduleTrigger= ruleScheduleTrigger EOF ;
    public final EObject entryRuleScheduleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleTrigger = null;


        try {
            // InternalCICDParser.g:654:56: (iv_ruleScheduleTrigger= ruleScheduleTrigger EOF )
            // InternalCICDParser.g:655:2: iv_ruleScheduleTrigger= ruleScheduleTrigger EOF
            {
             newCompositeNode(grammarAccess.getScheduleTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleTrigger=ruleScheduleTrigger();

            state._fsp--;

             current =iv_ruleScheduleTrigger; 
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
    // $ANTLR end "entryRuleScheduleTrigger"


    // $ANTLR start "ruleScheduleTrigger"
    // InternalCICDParser.g:661:1: ruleScheduleTrigger returns [EObject current=null] : (otherlv_0= ScheduleTrigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleScheduleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_timer_3_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:667:2: ( (otherlv_0= ScheduleTrigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCICDParser.g:668:2: (otherlv_0= ScheduleTrigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCICDParser.g:668:2: (otherlv_0= ScheduleTrigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCICDParser.g:669:3: otherlv_0= ScheduleTrigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,ScheduleTrigger,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleTriggerAccess().getScheduleTriggerKeyword_0());
            		
            // InternalCICDParser.g:673:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCICDParser.g:674:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getScheduleTriggerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Timer,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getScheduleTriggerAccess().getTimerKeyword_1_1());
            			
            // InternalCICDParser.g:682:4: ( (lv_timer_3_0= ruleEString ) )
            // InternalCICDParser.g:683:5: (lv_timer_3_0= ruleEString )
            {
            // InternalCICDParser.g:683:5: (lv_timer_3_0= ruleEString )
            // InternalCICDParser.g:684:6: lv_timer_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getScheduleTriggerAccess().getTimerEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_32);
            lv_timer_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getScheduleTriggerRule());
            						}
            						set(
            							current,
            							"timer",
            							lv_timer_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getScheduleTriggerAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleScheduleTrigger"


    // $ANTLR start "entryRuleAgent"
    // InternalCICDParser.g:710:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalCICDParser.g:710:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalCICDParser.g:711:2: iv_ruleAgent= ruleAgent EOF
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
    // InternalCICDParser.g:717:1: ruleAgent returns [EObject current=null] : ( () otherlv_1= Agent (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_labels_4_0 = null;

        AntlrDatatypeRuleToken lv_labels_6_0 = null;

        EObject lv_container_7_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:723:2: ( ( () otherlv_1= Agent (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END ) ) )
            // InternalCICDParser.g:724:2: ( () otherlv_1= Agent (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END ) )
            {
            // InternalCICDParser.g:724:2: ( () otherlv_1= Agent (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END ) )
            // InternalCICDParser.g:725:3: () otherlv_1= Agent (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END )
            {
            // InternalCICDParser.g:725:3: ()
            // InternalCICDParser.g:726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAgentAccess().getAgentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Agent,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAgentAccess().getAgentKeyword_1());
            		
            // InternalCICDParser.g:736:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END )
            // InternalCICDParser.g:737:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )? ( (lv_container_7_0= ruleDockerContainer ) )? this_END_8= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getAgentAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCICDParser.g:741:4: (otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Labels) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCICDParser.g:742:5: otherlv_3= Labels ( (lv_labels_4_0= ruleEString ) ) (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,Labels,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getLabelsKeyword_2_1_0());
                    				
                    // InternalCICDParser.g:746:5: ( (lv_labels_4_0= ruleEString ) )
                    // InternalCICDParser.g:747:6: (lv_labels_4_0= ruleEString )
                    {
                    // InternalCICDParser.g:747:6: (lv_labels_4_0= ruleEString )
                    // InternalCICDParser.g:748:7: lv_labels_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAgentAccess().getLabelsEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_35);
                    lv_labels_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAgentRule());
                    							}
                    							add(
                    								current,
                    								"labels",
                    								lv_labels_4_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCICDParser.g:765:5: (otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalCICDParser.g:766:6: otherlv_5= Comma ( (lv_labels_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_4); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getAgentAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalCICDParser.g:770:6: ( (lv_labels_6_0= ruleEString ) )
                    	    // InternalCICDParser.g:771:7: (lv_labels_6_0= ruleEString )
                    	    {
                    	    // InternalCICDParser.g:771:7: (lv_labels_6_0= ruleEString )
                    	    // InternalCICDParser.g:772:8: lv_labels_6_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getAgentAccess().getLabelsEStringParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_35);
                    	    lv_labels_6_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"labels",
                    	    									lv_labels_6_0,
                    	    									"org.xtext.example.cicd.CICD.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCICDParser.g:791:4: ( (lv_container_7_0= ruleDockerContainer ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DockerContainer) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCICDParser.g:792:5: (lv_container_7_0= ruleDockerContainer )
                    {
                    // InternalCICDParser.g:792:5: (lv_container_7_0= ruleDockerContainer )
                    // InternalCICDParser.g:793:6: lv_container_7_0= ruleDockerContainer
                    {

                    						newCompositeNode(grammarAccess.getAgentAccess().getContainerDockerContainerParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_container_7_0=ruleDockerContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentRule());
                    						}
                    						set(
                    							current,
                    							"container",
                    							lv_container_7_0,
                    							"org.xtext.example.cicd.CICD.DockerContainer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getAgentAccess().getENDTerminalRuleCall_2_3());
            			

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


    // $ANTLR start "entryRuleEString"
    // InternalCICDParser.g:819:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCICDParser.g:819:47: (iv_ruleEString= ruleEString EOF )
            // InternalCICDParser.g:820:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCICDParser.g:826:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCICDParser.g:832:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCICDParser.g:833:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCICDParser.g:833:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalCICDParser.g:834:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCICDParser.g:842:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInput"
    // InternalCICDParser.g:853:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalCICDParser.g:853:46: (iv_ruleInput= ruleInput EOF )
            // InternalCICDParser.g:854:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalCICDParser.g:860:1: ruleInput returns [EObject current=null] : (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_values_11_0 = null;

        AntlrDatatypeRuleToken lv_values_13_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:866:2: ( (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) )
            // InternalCICDParser.g:867:2: (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            {
            // InternalCICDParser.g:867:2: (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            // InternalCICDParser.g:868:3: otherlv_0= Input (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Input,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalCICDParser.g:872:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            // InternalCICDParser.g:873:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getInputAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCICDParser.g:877:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )
            // InternalCICDParser.g:878:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,Name,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getInputAccess().getNameKeyword_1_1_0());
            				
            // InternalCICDParser.g:882:5: ( (lv_name_3_0= ruleEString ) )
            // InternalCICDParser.g:883:6: (lv_name_3_0= ruleEString )
            {
            // InternalCICDParser.g:883:6: (lv_name_3_0= ruleEString )
            // InternalCICDParser.g:884:7: lv_name_3_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getInputAccess().getNameEStringParserRuleCall_1_1_1_0());
            						
            pushFollow(FOLLOW_36);
            lv_name_3_0=ruleEString();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getInputRule());
            							}
            							set(
            								current,
            								"name",
            								lv_name_3_0,
            								"org.xtext.example.cicd.CICD.EString");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalCICDParser.g:902:4: (otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) ) )
            // InternalCICDParser.g:903:5: otherlv_4= Type ( (lv_type_5_0= ruleINPUT_TYPE ) )
            {
            otherlv_4=(Token)match(input,Type,FOLLOW_37); 

            					newLeafNode(otherlv_4, grammarAccess.getInputAccess().getTypeKeyword_1_2_0());
            				
            // InternalCICDParser.g:907:5: ( (lv_type_5_0= ruleINPUT_TYPE ) )
            // InternalCICDParser.g:908:6: (lv_type_5_0= ruleINPUT_TYPE )
            {
            // InternalCICDParser.g:908:6: (lv_type_5_0= ruleINPUT_TYPE )
            // InternalCICDParser.g:909:7: lv_type_5_0= ruleINPUT_TYPE
            {

            							newCompositeNode(grammarAccess.getInputAccess().getTypeINPUT_TYPEEnumRuleCall_1_2_1_0());
            						
            pushFollow(FOLLOW_38);
            lv_type_5_0=ruleINPUT_TYPE();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getInputRule());
            							}
            							set(
            								current,
            								"type",
            								lv_type_5_0,
            								"org.xtext.example.cicd.CICD.INPUT_TYPE");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalCICDParser.g:927:4: (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Default) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCICDParser.g:928:5: otherlv_6= Default ( (lv_default_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Default,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getInputAccess().getDefaultKeyword_1_3_0());
                    				
                    // InternalCICDParser.g:932:5: ( (lv_default_7_0= ruleEString ) )
                    // InternalCICDParser.g:933:6: (lv_default_7_0= ruleEString )
                    {
                    // InternalCICDParser.g:933:6: (lv_default_7_0= ruleEString )
                    // InternalCICDParser.g:934:7: lv_default_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getDefaultEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_39);
                    lv_default_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"default",
                    								lv_default_7_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:952:4: (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Description) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCICDParser.g:953:5: otherlv_8= Description ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Description,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getInputAccess().getDescriptionKeyword_1_4_0());
                    				
                    // InternalCICDParser.g:957:5: ( (lv_description_9_0= ruleEString ) )
                    // InternalCICDParser.g:958:6: (lv_description_9_0= ruleEString )
                    {
                    // InternalCICDParser.g:958:6: (lv_description_9_0= ruleEString )
                    // InternalCICDParser.g:959:7: lv_description_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getDescriptionEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_9_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:977:4: (otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Values) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCICDParser.g:978:5: otherlv_10= Values ( (lv_values_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,Values,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getInputAccess().getValuesKeyword_1_5_0());
                    				
                    // InternalCICDParser.g:982:5: ( (lv_values_11_0= ruleEString ) )
                    // InternalCICDParser.g:983:6: (lv_values_11_0= ruleEString )
                    {
                    // InternalCICDParser.g:983:6: (lv_values_11_0= ruleEString )
                    // InternalCICDParser.g:984:7: lv_values_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getValuesEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_values_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							add(
                    								current,
                    								"values",
                    								lv_values_11_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCICDParser.g:1001:5: (otherlv_12= Comma ( (lv_values_13_0= ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCICDParser.g:1002:6: otherlv_12= Comma ( (lv_values_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_4); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getInputAccess().getCommaKeyword_1_5_2_0());
                    	    					
                    	    // InternalCICDParser.g:1006:6: ( (lv_values_13_0= ruleEString ) )
                    	    // InternalCICDParser.g:1007:7: (lv_values_13_0= ruleEString )
                    	    {
                    	    // InternalCICDParser.g:1007:7: (lv_values_13_0= ruleEString )
                    	    // InternalCICDParser.g:1008:8: lv_values_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getInputAccess().getValuesEStringParserRuleCall_1_5_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
                    	    lv_values_13_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getInputRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"values",
                    	    									lv_values_13_0,
                    	    									"org.xtext.example.cicd.CICD.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getInputAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalCICDParser.g:1036:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalCICDParser.g:1036:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalCICDParser.g:1037:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalCICDParser.g:1043:1: ruleOutput returns [EObject current=null] : (otherlv_0= Output (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1049:2: ( (otherlv_0= Output (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCICDParser.g:1050:2: (otherlv_0= Output (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCICDParser.g:1050:2: (otherlv_0= Output (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCICDParser.g:1051:3: otherlv_0= Output (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Output,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalCICDParser.g:1055:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCICDParser.g:1056:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getOutputAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getNameKeyword_1_1());
            			
            // InternalCICDParser.g:1064:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCICDParser.g:1065:5: (lv_name_3_0= ruleEString )
            {
            // InternalCICDParser.g:1065:5: (lv_name_3_0= ruleEString )
            // InternalCICDParser.g:1066:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_31);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOutputRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getValueKeyword_1_3());
            			
            // InternalCICDParser.g:1087:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCICDParser.g:1088:5: (lv_value_5_0= ruleEString )
            {
            // InternalCICDParser.g:1088:5: (lv_value_5_0= ruleEString )
            // InternalCICDParser.g:1089:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOutputAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_32);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOutputRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getOutputAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleStep"
    // InternalCICDParser.g:1115:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCICDParser.g:1115:45: (iv_ruleStep= ruleStep EOF )
            // InternalCICDParser.g:1116:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCICDParser.g:1122:1: ruleStep returns [EObject current=null] : (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_7=null;
        EObject lv_cache_2_0 = null;

        EObject lv_environments_3_0 = null;

        EObject lv_IfStep_4_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1128:2: ( (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END ) ) )
            // InternalCICDParser.g:1129:2: (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END ) )
            {
            // InternalCICDParser.g:1129:2: (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END ) )
            // InternalCICDParser.g:1130:3: otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END )
            {
            otherlv_0=(Token)match(input,Step,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
            		
            // InternalCICDParser.g:1134:3: (this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END )
            // InternalCICDParser.g:1135:4: this_BEGIN_1= RULE_BEGIN ( (lv_cache_2_0= ruleCache ) )* ( (lv_environments_3_0= ruleEnvironment ) )* ( (lv_IfStep_4_0= ruleIfStep ) )? ( (lv_commands_5_0= ruleCommand ) )+ ( (lv_parameters_6_0= ruleParameters ) )* this_END_7= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStepAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCICDParser.g:1139:4: ( (lv_cache_2_0= ruleCache ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Cache) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCICDParser.g:1140:5: (lv_cache_2_0= ruleCache )
            	    {
            	    // InternalCICDParser.g:1140:5: (lv_cache_2_0= ruleCache )
            	    // InternalCICDParser.g:1141:6: lv_cache_2_0= ruleCache
            	    {

            	    						newCompositeNode(grammarAccess.getStepAccess().getCacheCacheParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_cache_2_0=ruleCache();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cache",
            	    							lv_cache_2_0,
            	    							"org.xtext.example.cicd.CICD.Cache");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalCICDParser.g:1158:4: ( (lv_environments_3_0= ruleEnvironment ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Environment) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCICDParser.g:1159:5: (lv_environments_3_0= ruleEnvironment )
            	    {
            	    // InternalCICDParser.g:1159:5: (lv_environments_3_0= ruleEnvironment )
            	    // InternalCICDParser.g:1160:6: lv_environments_3_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getStepAccess().getEnvironmentsEnvironmentParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_environments_3_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_3_0,
            	    							"org.xtext.example.cicd.CICD.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalCICDParser.g:1177:4: ( (lv_IfStep_4_0= ruleIfStep ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==IfStep) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCICDParser.g:1178:5: (lv_IfStep_4_0= ruleIfStep )
                    {
                    // InternalCICDParser.g:1178:5: (lv_IfStep_4_0= ruleIfStep )
                    // InternalCICDParser.g:1179:6: lv_IfStep_4_0= ruleIfStep
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getIfStepIfStepParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_IfStep_4_0=ruleIfStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"IfStep",
                    							lv_IfStep_4_0,
                    							"org.xtext.example.cicd.CICD.IfStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalCICDParser.g:1196:4: ( (lv_commands_5_0= ruleCommand ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Command) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCICDParser.g:1197:5: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalCICDParser.g:1197:5: (lv_commands_5_0= ruleCommand )
            	    // InternalCICDParser.g:1198:6: lv_commands_5_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getStepAccess().getCommandsCommandParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_5_0,
            	    							"org.xtext.example.cicd.CICD.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // InternalCICDParser.g:1215:4: ( (lv_parameters_6_0= ruleParameters ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Parameters) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCICDParser.g:1216:5: (lv_parameters_6_0= ruleParameters )
            	    {
            	    // InternalCICDParser.g:1216:5: (lv_parameters_6_0= ruleParameters )
            	    // InternalCICDParser.g:1217:6: lv_parameters_6_0= ruleParameters
            	    {

            	    						newCompositeNode(grammarAccess.getStepAccess().getParametersParametersParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_parameters_6_0=ruleParameters();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.xtext.example.cicd.CICD.Parameters");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_7, grammarAccess.getStepAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleIfStep"
    // InternalCICDParser.g:1243:1: entryRuleIfStep returns [EObject current=null] : iv_ruleIfStep= ruleIfStep EOF ;
    public final EObject entryRuleIfStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStep = null;


        try {
            // InternalCICDParser.g:1243:47: (iv_ruleIfStep= ruleIfStep EOF )
            // InternalCICDParser.g:1244:2: iv_ruleIfStep= ruleIfStep EOF
            {
             newCompositeNode(grammarAccess.getIfStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStep=ruleIfStep();

            state._fsp--;

             current =iv_ruleIfStep; 
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
    // $ANTLR end "entryRuleIfStep"


    // $ANTLR start "ruleIfStep"
    // InternalCICDParser.g:1250:1: ruleIfStep returns [EObject current=null] : (otherlv_0= IfStep (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END ) ) ;
    public final EObject ruleIfStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        EObject lv_if_steps_5_0 = null;

        EObject lv_else_steps_7_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1256:2: ( (otherlv_0= IfStep (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END ) ) )
            // InternalCICDParser.g:1257:2: (otherlv_0= IfStep (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END ) )
            {
            // InternalCICDParser.g:1257:2: (otherlv_0= IfStep (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END ) )
            // InternalCICDParser.g:1258:3: otherlv_0= IfStep (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,IfStep,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStepAccess().getIfStepKeyword_0());
            		
            // InternalCICDParser.g:1262:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END )
            // InternalCICDParser.g:1263:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= ruleEString ) ) (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )* (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )* this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getIfStepAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Condition,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getIfStepAccess().getConditionKeyword_1_1());
            			
            // InternalCICDParser.g:1271:4: ( (lv_condition_3_0= ruleEString ) )
            // InternalCICDParser.g:1272:5: (lv_condition_3_0= ruleEString )
            {
            // InternalCICDParser.g:1272:5: (lv_condition_3_0= ruleEString )
            // InternalCICDParser.g:1273:6: lv_condition_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getIfStepAccess().getConditionEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_46);
            lv_condition_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIfStepRule());
            						}
            						set(
            							current,
            							"condition",
            							lv_condition_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:1290:4: (otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==If_steps) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCICDParser.g:1291:5: otherlv_4= If_steps ( (lv_if_steps_5_0= ruleStep ) )
            	    {
            	    otherlv_4=(Token)match(input,If_steps,FOLLOW_47); 

            	    					newLeafNode(otherlv_4, grammarAccess.getIfStepAccess().getIf_stepsKeyword_1_3_0());
            	    				
            	    // InternalCICDParser.g:1295:5: ( (lv_if_steps_5_0= ruleStep ) )
            	    // InternalCICDParser.g:1296:6: (lv_if_steps_5_0= ruleStep )
            	    {
            	    // InternalCICDParser.g:1296:6: (lv_if_steps_5_0= ruleStep )
            	    // InternalCICDParser.g:1297:7: lv_if_steps_5_0= ruleStep
            	    {

            	    							newCompositeNode(grammarAccess.getIfStepAccess().getIf_stepsStepParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_46);
            	    lv_if_steps_5_0=ruleStep();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIfStepRule());
            	    							}
            	    							add(
            	    								current,
            	    								"if_steps",
            	    								lv_if_steps_5_0,
            	    								"org.xtext.example.cicd.CICD.Step");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalCICDParser.g:1315:4: (otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Else_steps) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCICDParser.g:1316:5: otherlv_6= Else_steps ( (lv_else_steps_7_0= ruleStep ) )
            	    {
            	    otherlv_6=(Token)match(input,Else_steps,FOLLOW_47); 

            	    					newLeafNode(otherlv_6, grammarAccess.getIfStepAccess().getElse_stepsKeyword_1_4_0());
            	    				
            	    // InternalCICDParser.g:1320:5: ( (lv_else_steps_7_0= ruleStep ) )
            	    // InternalCICDParser.g:1321:6: (lv_else_steps_7_0= ruleStep )
            	    {
            	    // InternalCICDParser.g:1321:6: (lv_else_steps_7_0= ruleStep )
            	    // InternalCICDParser.g:1322:7: lv_else_steps_7_0= ruleStep
            	    {

            	    							newCompositeNode(grammarAccess.getIfStepAccess().getElse_stepsStepParserRuleCall_1_4_1_0());
            	    						
            	    pushFollow(FOLLOW_48);
            	    lv_else_steps_7_0=ruleStep();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIfStepRule());
            	    							}
            	    							add(
            	    								current,
            	    								"else_steps",
            	    								lv_else_steps_7_0,
            	    								"org.xtext.example.cicd.CICD.Step");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getIfStepAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleIfStep"


    // $ANTLR start "entryRuleArtifact"
    // InternalCICDParser.g:1349:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalCICDParser.g:1349:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalCICDParser.g:1350:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalCICDParser.g:1356:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= Artifact (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_message_6_0 = null;

        AntlrDatatypeRuleToken lv_path_8_0 = null;

        AntlrDatatypeRuleToken lv_path_10_0 = null;

        Enumerator lv_type_12_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1362:2: ( ( () otherlv_1= Artifact (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END ) ) )
            // InternalCICDParser.g:1363:2: ( () otherlv_1= Artifact (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END ) )
            {
            // InternalCICDParser.g:1363:2: ( () otherlv_1= Artifact (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END ) )
            // InternalCICDParser.g:1364:3: () otherlv_1= Artifact (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END )
            {
            // InternalCICDParser.g:1364:3: ()
            // InternalCICDParser.g:1365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Artifact,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalCICDParser.g:1375:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END )
            // InternalCICDParser.g:1376:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )? (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )? (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )? this_END_13= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCICDParser.g:1380:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Name) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCICDParser.g:1381:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCICDParser.g:1385:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCICDParser.g:1386:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCICDParser.g:1386:6: (lv_name_4_0= ruleEString )
                    // InternalCICDParser.g:1387:7: lv_name_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_50);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getArtifactRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:1405:4: (otherlv_5= Message ( (lv_message_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Message) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCICDParser.g:1406:5: otherlv_5= Message ( (lv_message_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Message,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getMessageKeyword_2_2_0());
                    				
                    // InternalCICDParser.g:1410:5: ( (lv_message_6_0= ruleEString ) )
                    // InternalCICDParser.g:1411:6: (lv_message_6_0= ruleEString )
                    {
                    // InternalCICDParser.g:1411:6: (lv_message_6_0= ruleEString )
                    // InternalCICDParser.g:1412:7: lv_message_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getMessageEStringParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_51);
                    lv_message_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getArtifactRule());
                    							}
                    							set(
                    								current,
                    								"message",
                    								lv_message_6_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:1430:4: (otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Path) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCICDParser.g:1431:5: otherlv_7= Path ( (lv_path_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,Path,FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getArtifactAccess().getPathKeyword_2_3_0());
                    				
                    // InternalCICDParser.g:1435:5: ( (lv_path_8_0= ruleEString ) )
                    // InternalCICDParser.g:1436:6: (lv_path_8_0= ruleEString )
                    {
                    // InternalCICDParser.g:1436:6: (lv_path_8_0= ruleEString )
                    // InternalCICDParser.g:1437:7: lv_path_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getPathEStringParserRuleCall_2_3_1_0());
                    						
                    pushFollow(FOLLOW_52);
                    lv_path_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getArtifactRule());
                    							}
                    							add(
                    								current,
                    								"path",
                    								lv_path_8_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCICDParser.g:1454:5: (otherlv_9= Comma ( (lv_path_10_0= ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Comma) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalCICDParser.g:1455:6: otherlv_9= Comma ( (lv_path_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0());
                    	    					
                    	    // InternalCICDParser.g:1459:6: ( (lv_path_10_0= ruleEString ) )
                    	    // InternalCICDParser.g:1460:7: (lv_path_10_0= ruleEString )
                    	    {
                    	    // InternalCICDParser.g:1460:7: (lv_path_10_0= ruleEString )
                    	    // InternalCICDParser.g:1461:8: lv_path_10_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getArtifactAccess().getPathEStringParserRuleCall_2_3_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_52);
                    	    lv_path_10_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getArtifactRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"path",
                    	    									lv_path_10_0,
                    	    									"org.xtext.example.cicd.CICD.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCICDParser.g:1480:4: (otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Type) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCICDParser.g:1481:5: otherlv_11= Type ( (lv_type_12_0= ruleARTIFACT_TYPE ) )
                    {
                    otherlv_11=(Token)match(input,Type,FOLLOW_53); 

                    					newLeafNode(otherlv_11, grammarAccess.getArtifactAccess().getTypeKeyword_2_4_0());
                    				
                    // InternalCICDParser.g:1485:5: ( (lv_type_12_0= ruleARTIFACT_TYPE ) )
                    // InternalCICDParser.g:1486:6: (lv_type_12_0= ruleARTIFACT_TYPE )
                    {
                    // InternalCICDParser.g:1486:6: (lv_type_12_0= ruleARTIFACT_TYPE )
                    // InternalCICDParser.g:1487:7: lv_type_12_0= ruleARTIFACT_TYPE
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getTypeARTIFACT_TYPEEnumRuleCall_2_4_1_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_type_12_0=ruleARTIFACT_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getArtifactRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_12_0,
                    								"org.xtext.example.cicd.CICD.ARTIFACT_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_13, grammarAccess.getArtifactAccess().getENDTerminalRuleCall_2_5());
            			

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleMatrix"
    // InternalCICDParser.g:1514:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalCICDParser.g:1514:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalCICDParser.g:1515:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalCICDParser.g:1521:1: ruleMatrix returns [EObject current=null] : (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END ) ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_steps_4_0 = null;

        EObject lv_jobs_5_0 = null;

        EObject lv_configs_6_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1527:2: ( (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END ) ) )
            // InternalCICDParser.g:1528:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END ) )
            {
            // InternalCICDParser.g:1528:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END ) )
            // InternalCICDParser.g:1529:3: otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
            		
            // InternalCICDParser.g:1533:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END )
            // InternalCICDParser.g:1534:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_steps_4_0= ruleStep ) )* ( (lv_jobs_5_0= ruleJob ) )* ( (lv_configs_6_0= ruleMatrixConfig ) )+ this_END_7= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCICDParser.g:1538:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Name) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCICDParser.g:1539:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatrixAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCICDParser.g:1543:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCICDParser.g:1544:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCICDParser.g:1544:6: (lv_name_3_0= ruleEString )
                    // InternalCICDParser.g:1545:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMatrixAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_54);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMatrixRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:1563:4: ( (lv_steps_4_0= ruleStep ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Step) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalCICDParser.g:1564:5: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalCICDParser.g:1564:5: (lv_steps_4_0= ruleStep )
            	    // InternalCICDParser.g:1565:6: lv_steps_4_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getStepsStepParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_4_0,
            	    							"org.xtext.example.cicd.CICD.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalCICDParser.g:1582:4: ( (lv_jobs_5_0= ruleJob ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Job) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCICDParser.g:1583:5: (lv_jobs_5_0= ruleJob )
            	    {
            	    // InternalCICDParser.g:1583:5: (lv_jobs_5_0= ruleJob )
            	    // InternalCICDParser.g:1584:6: lv_jobs_5_0= ruleJob
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getJobsJobParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_jobs_5_0=ruleJob();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobs",
            	    							lv_jobs_5_0,
            	    							"org.xtext.example.cicd.CICD.Job");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalCICDParser.g:1601:4: ( (lv_configs_6_0= ruleMatrixConfig ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==MatrixConfig) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalCICDParser.g:1602:5: (lv_configs_6_0= ruleMatrixConfig )
            	    {
            	    // InternalCICDParser.g:1602:5: (lv_configs_6_0= ruleMatrixConfig )
            	    // InternalCICDParser.g:1603:6: lv_configs_6_0= ruleMatrixConfig
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getConfigsMatrixConfigParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_55);
            	    lv_configs_6_0=ruleMatrixConfig();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"configs",
            	    							lv_configs_6_0,
            	    							"org.xtext.example.cicd.CICD.MatrixConfig");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_7, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleCommand"
    // InternalCICDParser.g:1629:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCICDParser.g:1629:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCICDParser.g:1630:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalCICDParser.g:1636:1: ruleCommand returns [EObject current=null] : ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1642:2: ( ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            // InternalCICDParser.g:1643:2: ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            {
            // InternalCICDParser.g:1643:2: ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            // InternalCICDParser.g:1644:3: () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            {
            // InternalCICDParser.g:1644:3: ()
            // InternalCICDParser.g:1645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Command,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
            		
            // InternalCICDParser.g:1655:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalCICDParser.g:1656:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getNameKeyword_2_1());
            			
            // InternalCICDParser.g:1664:4: ( (lv_name_4_0= ruleEString ) )
            // InternalCICDParser.g:1665:5: (lv_name_4_0= ruleEString )
            {
            // InternalCICDParser.g:1665:5: (lv_name_4_0= ruleEString )
            // InternalCICDParser.g:1666:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_32);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCommandRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_5, grammarAccess.getCommandAccess().getENDTerminalRuleCall_2_3());
            			

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleParameters"
    // InternalCICDParser.g:1692:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalCICDParser.g:1692:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalCICDParser.g:1693:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalCICDParser.g:1699:1: ruleParameters returns [EObject current=null] : (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1705:2: ( (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCICDParser.g:1706:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCICDParser.g:1706:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCICDParser.g:1707:3: otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Parameters,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getParametersKeyword_0());
            		
            // InternalCICDParser.g:1711:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCICDParser.g:1712:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getParametersAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Parameter,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getParameterKeyword_1_1());
            			
            // InternalCICDParser.g:1720:4: ( (lv_parameter_3_0= ruleEString ) )
            // InternalCICDParser.g:1721:5: (lv_parameter_3_0= ruleEString )
            {
            // InternalCICDParser.g:1721:5: (lv_parameter_3_0= ruleEString )
            // InternalCICDParser.g:1722:6: lv_parameter_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getParametersAccess().getParameterEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_32);
            lv_parameter_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getParametersRule());
            						}
            						set(
            							current,
            							"parameter",
            							lv_parameter_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getParametersAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleCache"
    // InternalCICDParser.g:1748:1: entryRuleCache returns [EObject current=null] : iv_ruleCache= ruleCache EOF ;
    public final EObject entryRuleCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCache = null;


        try {
            // InternalCICDParser.g:1748:46: (iv_ruleCache= ruleCache EOF )
            // InternalCICDParser.g:1749:2: iv_ruleCache= ruleCache EOF
            {
             newCompositeNode(grammarAccess.getCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCache=ruleCache();

            state._fsp--;

             current =iv_ruleCache; 
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
    // $ANTLR end "entryRuleCache"


    // $ANTLR start "ruleCache"
    // InternalCICDParser.g:1755:1: ruleCache returns [EObject current=null] : (otherlv_0= Cache (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) ;
    public final EObject ruleCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        Enumerator lv_mode_3_0 = null;

        AntlrDatatypeRuleToken lv_paths_5_0 = null;

        AntlrDatatypeRuleToken lv_paths_7_0 = null;

        AntlrDatatypeRuleToken lv_key_9_0 = null;

        AntlrDatatypeRuleToken lv_keys_11_0 = null;

        AntlrDatatypeRuleToken lv_keys_13_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1761:2: ( (otherlv_0= Cache (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) )
            // InternalCICDParser.g:1762:2: (otherlv_0= Cache (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            {
            // InternalCICDParser.g:1762:2: (otherlv_0= Cache (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            // InternalCICDParser.g:1763:3: otherlv_0= Cache (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Cache,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCacheAccess().getCacheKeyword_0());
            		
            // InternalCICDParser.g:1767:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            // InternalCICDParser.g:1768:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Mode ( (lv_mode_3_0= ruleCACHE_MODE ) ) (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* ) otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getCacheAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Mode,FOLLOW_58); 

            				newLeafNode(otherlv_2, grammarAccess.getCacheAccess().getModeKeyword_1_1());
            			
            // InternalCICDParser.g:1776:4: ( (lv_mode_3_0= ruleCACHE_MODE ) )
            // InternalCICDParser.g:1777:5: (lv_mode_3_0= ruleCACHE_MODE )
            {
            // InternalCICDParser.g:1777:5: (lv_mode_3_0= ruleCACHE_MODE )
            // InternalCICDParser.g:1778:6: lv_mode_3_0= ruleCACHE_MODE
            {

            						newCompositeNode(grammarAccess.getCacheAccess().getModeCACHE_MODEEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_59);
            lv_mode_3_0=ruleCACHE_MODE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCacheRule());
            						}
            						set(
            							current,
            							"mode",
            							lv_mode_3_0,
            							"org.xtext.example.cicd.CICD.CACHE_MODE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:1795:4: (otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* )
            // InternalCICDParser.g:1796:5: otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )*
            {
            otherlv_4=(Token)match(input,Paths,FOLLOW_4); 

            					newLeafNode(otherlv_4, grammarAccess.getCacheAccess().getPathsKeyword_1_3_0());
            				
            // InternalCICDParser.g:1800:5: ( (lv_paths_5_0= ruleEString ) )
            // InternalCICDParser.g:1801:6: (lv_paths_5_0= ruleEString )
            {
            // InternalCICDParser.g:1801:6: (lv_paths_5_0= ruleEString )
            // InternalCICDParser.g:1802:7: lv_paths_5_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getCacheAccess().getPathsEStringParserRuleCall_1_3_1_0());
            						
            pushFollow(FOLLOW_60);
            lv_paths_5_0=ruleEString();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getCacheRule());
            							}
            							add(
            								current,
            								"paths",
            								lv_paths_5_0,
            								"org.xtext.example.cicd.CICD.EString");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            // InternalCICDParser.g:1819:5: (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==Comma) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCICDParser.g:1820:6: otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_4); 

            	    						newLeafNode(otherlv_6, grammarAccess.getCacheAccess().getCommaKeyword_1_3_2_0());
            	    					
            	    // InternalCICDParser.g:1824:6: ( (lv_paths_7_0= ruleEString ) )
            	    // InternalCICDParser.g:1825:7: (lv_paths_7_0= ruleEString )
            	    {
            	    // InternalCICDParser.g:1825:7: (lv_paths_7_0= ruleEString )
            	    // InternalCICDParser.g:1826:8: lv_paths_7_0= ruleEString
            	    {

            	    								newCompositeNode(grammarAccess.getCacheAccess().getPathsEStringParserRuleCall_1_3_2_1_0());
            	    							
            	    pushFollow(FOLLOW_60);
            	    lv_paths_7_0=ruleEString();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getCacheRule());
            	    								}
            	    								add(
            	    									current,
            	    									"paths",
            	    									lv_paths_7_0,
            	    									"org.xtext.example.cicd.CICD.EString");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,Key,FOLLOW_4); 

            				newLeafNode(otherlv_8, grammarAccess.getCacheAccess().getKeyKeyword_1_4());
            			
            // InternalCICDParser.g:1849:4: ( (lv_key_9_0= ruleEString ) )
            // InternalCICDParser.g:1850:5: (lv_key_9_0= ruleEString )
            {
            // InternalCICDParser.g:1850:5: (lv_key_9_0= ruleEString )
            // InternalCICDParser.g:1851:6: lv_key_9_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCacheAccess().getKeyEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_61);
            lv_key_9_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCacheRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_9_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:1868:4: (otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Keys) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCICDParser.g:1869:5: otherlv_10= Keys ( (lv_keys_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,Keys,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getCacheAccess().getKeysKeyword_1_6_0());
                    				
                    // InternalCICDParser.g:1873:5: ( (lv_keys_11_0= ruleEString ) )
                    // InternalCICDParser.g:1874:6: (lv_keys_11_0= ruleEString )
                    {
                    // InternalCICDParser.g:1874:6: (lv_keys_11_0= ruleEString )
                    // InternalCICDParser.g:1875:7: lv_keys_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getCacheAccess().getKeysEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_keys_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCacheRule());
                    							}
                    							add(
                    								current,
                    								"keys",
                    								lv_keys_11_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCICDParser.g:1892:5: (otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==Comma) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalCICDParser.g:1893:6: otherlv_12= Comma ( (lv_keys_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_4); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getCacheAccess().getCommaKeyword_1_6_2_0());
                    	    					
                    	    // InternalCICDParser.g:1897:6: ( (lv_keys_13_0= ruleEString ) )
                    	    // InternalCICDParser.g:1898:7: (lv_keys_13_0= ruleEString )
                    	    {
                    	    // InternalCICDParser.g:1898:7: (lv_keys_13_0= ruleEString )
                    	    // InternalCICDParser.g:1899:8: lv_keys_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getCacheAccess().getKeysEStringParserRuleCall_1_6_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
                    	    lv_keys_13_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCacheRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"keys",
                    	    									lv_keys_13_0,
                    	    									"org.xtext.example.cicd.CICD.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getCacheAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "ruleCache"


    // $ANTLR start "entryRuleMatrixConfig"
    // InternalCICDParser.g:1927:1: entryRuleMatrixConfig returns [EObject current=null] : iv_ruleMatrixConfig= ruleMatrixConfig EOF ;
    public final EObject entryRuleMatrixConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixConfig = null;


        try {
            // InternalCICDParser.g:1927:53: (iv_ruleMatrixConfig= ruleMatrixConfig EOF )
            // InternalCICDParser.g:1928:2: iv_ruleMatrixConfig= ruleMatrixConfig EOF
            {
             newCompositeNode(grammarAccess.getMatrixConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrixConfig=ruleMatrixConfig();

            state._fsp--;

             current =iv_ruleMatrixConfig; 
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
    // $ANTLR end "entryRuleMatrixConfig"


    // $ANTLR start "ruleMatrixConfig"
    // InternalCICDParser.g:1934:1: ruleMatrixConfig returns [EObject current=null] : (otherlv_0= MatrixConfig (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END ) ) ;
    public final EObject ruleMatrixConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:1940:2: ( (otherlv_0= MatrixConfig (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END ) ) )
            // InternalCICDParser.g:1941:2: (otherlv_0= MatrixConfig (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END ) )
            {
            // InternalCICDParser.g:1941:2: (otherlv_0= MatrixConfig (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END ) )
            // InternalCICDParser.g:1942:3: otherlv_0= MatrixConfig (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,MatrixConfig,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixConfigAccess().getMatrixConfigKeyword_0());
            		
            // InternalCICDParser.g:1946:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END )
            // InternalCICDParser.g:1947:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ) otherlv_8= Type ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) ) this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixConfigAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getMatrixConfigAccess().getNameKeyword_1_1());
            			
            // InternalCICDParser.g:1955:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCICDParser.g:1956:5: (lv_name_3_0= ruleEString )
            {
            // InternalCICDParser.g:1956:5: (lv_name_3_0= ruleEString )
            // InternalCICDParser.g:1957:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMatrixConfigAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_62);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMatrixConfigRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:1974:4: (otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* )
            // InternalCICDParser.g:1975:5: otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_4=(Token)match(input,Values,FOLLOW_4); 

            					newLeafNode(otherlv_4, grammarAccess.getMatrixConfigAccess().getValuesKeyword_1_3_0());
            				
            // InternalCICDParser.g:1979:5: ( (lv_values_5_0= ruleEString ) )
            // InternalCICDParser.g:1980:6: (lv_values_5_0= ruleEString )
            {
            // InternalCICDParser.g:1980:6: (lv_values_5_0= ruleEString )
            // InternalCICDParser.g:1981:7: lv_values_5_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getMatrixConfigAccess().getValuesEStringParserRuleCall_1_3_1_0());
            						
            pushFollow(FOLLOW_63);
            lv_values_5_0=ruleEString();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getMatrixConfigRule());
            							}
            							add(
            								current,
            								"values",
            								lv_values_5_0,
            								"org.xtext.example.cicd.CICD.EString");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            // InternalCICDParser.g:1998:5: (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==Comma) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCICDParser.g:1999:6: otherlv_6= Comma ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_4); 

            	    						newLeafNode(otherlv_6, grammarAccess.getMatrixConfigAccess().getCommaKeyword_1_3_2_0());
            	    					
            	    // InternalCICDParser.g:2003:6: ( (lv_values_7_0= ruleEString ) )
            	    // InternalCICDParser.g:2004:7: (lv_values_7_0= ruleEString )
            	    {
            	    // InternalCICDParser.g:2004:7: (lv_values_7_0= ruleEString )
            	    // InternalCICDParser.g:2005:8: lv_values_7_0= ruleEString
            	    {

            	    								newCompositeNode(grammarAccess.getMatrixConfigAccess().getValuesEStringParserRuleCall_1_3_2_1_0());
            	    							
            	    pushFollow(FOLLOW_63);
            	    lv_values_7_0=ruleEString();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getMatrixConfigRule());
            	    								}
            	    								add(
            	    									current,
            	    									"values",
            	    									lv_values_7_0,
            	    									"org.xtext.example.cicd.CICD.EString");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,Type,FOLLOW_64); 

            				newLeafNode(otherlv_8, grammarAccess.getMatrixConfigAccess().getTypeKeyword_1_4());
            			
            // InternalCICDParser.g:2028:4: ( (lv_type_9_0= ruleMATRIX_CONFIG_TYPE ) )
            // InternalCICDParser.g:2029:5: (lv_type_9_0= ruleMATRIX_CONFIG_TYPE )
            {
            // InternalCICDParser.g:2029:5: (lv_type_9_0= ruleMATRIX_CONFIG_TYPE )
            // InternalCICDParser.g:2030:6: lv_type_9_0= ruleMATRIX_CONFIG_TYPE
            {

            						newCompositeNode(grammarAccess.getMatrixConfigAccess().getTypeMATRIX_CONFIG_TYPEEnumRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_32);
            lv_type_9_0=ruleMATRIX_CONFIG_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMatrixConfigRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_9_0,
            							"org.xtext.example.cicd.CICD.MATRIX_CONFIG_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_10, grammarAccess.getMatrixConfigAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleMatrixConfig"


    // $ANTLR start "entryRuleDockerContainer"
    // InternalCICDParser.g:2056:1: entryRuleDockerContainer returns [EObject current=null] : iv_ruleDockerContainer= ruleDockerContainer EOF ;
    public final EObject entryRuleDockerContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerContainer = null;


        try {
            // InternalCICDParser.g:2056:56: (iv_ruleDockerContainer= ruleDockerContainer EOF )
            // InternalCICDParser.g:2057:2: iv_ruleDockerContainer= ruleDockerContainer EOF
            {
             newCompositeNode(grammarAccess.getDockerContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerContainer=ruleDockerContainer();

            state._fsp--;

             current =iv_ruleDockerContainer; 
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
    // $ANTLR end "entryRuleDockerContainer"


    // $ANTLR start "ruleDockerContainer"
    // InternalCICDParser.g:2063:1: ruleDockerContainer returns [EObject current=null] : (otherlv_0= DockerContainer (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END ) ) ;
    public final EObject ruleDockerContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_image_3_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        EObject lv_environments_8_0 = null;



        	enterRule();

        try {
            // InternalCICDParser.g:2069:2: ( (otherlv_0= DockerContainer (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END ) ) )
            // InternalCICDParser.g:2070:2: (otherlv_0= DockerContainer (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END ) )
            {
            // InternalCICDParser.g:2070:2: (otherlv_0= DockerContainer (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END ) )
            // InternalCICDParser.g:2071:3: otherlv_0= DockerContainer (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END )
            {
            otherlv_0=(Token)match(input,DockerContainer,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerContainerAccess().getDockerContainerKeyword_0());
            		
            // InternalCICDParser.g:2075:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END )
            // InternalCICDParser.g:2076:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )? ( (lv_environments_8_0= ruleEnvironment ) )* this_END_9= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_65); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDockerContainerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Image,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getDockerContainerAccess().getImageKeyword_1_1());
            			
            // InternalCICDParser.g:2084:4: ( (lv_image_3_0= ruleEString ) )
            // InternalCICDParser.g:2085:5: (lv_image_3_0= ruleEString )
            {
            // InternalCICDParser.g:2085:5: (lv_image_3_0= ruleEString )
            // InternalCICDParser.g:2086:6: lv_image_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerContainerAccess().getImageEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_66);
            lv_image_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDockerContainerRule());
            						}
            						set(
            							current,
            							"image",
            							lv_image_3_0,
            							"org.xtext.example.cicd.CICD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCICDParser.g:2103:4: (otherlv_4= Username ( (lv_username_5_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Username) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCICDParser.g:2104:5: otherlv_4= Username ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Username,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getDockerContainerAccess().getUsernameKeyword_1_3_0());
                    				
                    // InternalCICDParser.g:2108:5: ( (lv_username_5_0= ruleEString ) )
                    // InternalCICDParser.g:2109:6: (lv_username_5_0= ruleEString )
                    {
                    // InternalCICDParser.g:2109:6: (lv_username_5_0= ruleEString )
                    // InternalCICDParser.g:2110:7: lv_username_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerContainerAccess().getUsernameEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_67);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerContainerRule());
                    							}
                    							set(
                    								current,
                    								"username",
                    								lv_username_5_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:2128:4: (otherlv_6= Password ( (lv_password_7_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Password) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCICDParser.g:2129:5: otherlv_6= Password ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Password,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getDockerContainerAccess().getPasswordKeyword_1_4_0());
                    				
                    // InternalCICDParser.g:2133:5: ( (lv_password_7_0= ruleEString ) )
                    // InternalCICDParser.g:2134:6: (lv_password_7_0= ruleEString )
                    {
                    // InternalCICDParser.g:2134:6: (lv_password_7_0= ruleEString )
                    // InternalCICDParser.g:2135:7: lv_password_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerContainerAccess().getPasswordEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_68);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerContainerRule());
                    							}
                    							set(
                    								current,
                    								"password",
                    								lv_password_7_0,
                    								"org.xtext.example.cicd.CICD.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCICDParser.g:2153:4: ( (lv_environments_8_0= ruleEnvironment ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==Environment) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCICDParser.g:2154:5: (lv_environments_8_0= ruleEnvironment )
            	    {
            	    // InternalCICDParser.g:2154:5: (lv_environments_8_0= ruleEnvironment )
            	    // InternalCICDParser.g:2155:6: lv_environments_8_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getDockerContainerAccess().getEnvironmentsEnvironmentParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_environments_8_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_8_0,
            	    							"org.xtext.example.cicd.CICD.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_9, grammarAccess.getDockerContainerAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleDockerContainer"


    // $ANTLR start "ruleCACHE_MODE"
    // InternalCICDParser.g:2181:1: ruleCACHE_MODE returns [Enumerator current=null] : ( (enumLiteral_0= STORE ) | (enumLiteral_1= LOAD ) | (enumLiteral_2= BOTH ) ) ;
    public final Enumerator ruleCACHE_MODE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCICDParser.g:2187:2: ( ( (enumLiteral_0= STORE ) | (enumLiteral_1= LOAD ) | (enumLiteral_2= BOTH ) ) )
            // InternalCICDParser.g:2188:2: ( (enumLiteral_0= STORE ) | (enumLiteral_1= LOAD ) | (enumLiteral_2= BOTH ) )
            {
            // InternalCICDParser.g:2188:2: ( (enumLiteral_0= STORE ) | (enumLiteral_1= LOAD ) | (enumLiteral_2= BOTH ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case STORE:
                {
                alt63=1;
                }
                break;
            case LOAD:
                {
                alt63=2;
                }
                break;
            case BOTH:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalCICDParser.g:2189:3: (enumLiteral_0= STORE )
                    {
                    // InternalCICDParser.g:2189:3: (enumLiteral_0= STORE )
                    // InternalCICDParser.g:2190:4: enumLiteral_0= STORE
                    {
                    enumLiteral_0=(Token)match(input,STORE,FOLLOW_2); 

                    				current = grammarAccess.getCACHE_MODEAccess().getSTOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCACHE_MODEAccess().getSTOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCICDParser.g:2197:3: (enumLiteral_1= LOAD )
                    {
                    // InternalCICDParser.g:2197:3: (enumLiteral_1= LOAD )
                    // InternalCICDParser.g:2198:4: enumLiteral_1= LOAD
                    {
                    enumLiteral_1=(Token)match(input,LOAD,FOLLOW_2); 

                    				current = grammarAccess.getCACHE_MODEAccess().getLOADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCACHE_MODEAccess().getLOADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCICDParser.g:2205:3: (enumLiteral_2= BOTH )
                    {
                    // InternalCICDParser.g:2205:3: (enumLiteral_2= BOTH )
                    // InternalCICDParser.g:2206:4: enumLiteral_2= BOTH
                    {
                    enumLiteral_2=(Token)match(input,BOTH,FOLLOW_2); 

                    				current = grammarAccess.getCACHE_MODEAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCACHE_MODEAccess().getBOTHEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCACHE_MODE"


    // $ANTLR start "ruleARTIFACT_TYPE"
    // InternalCICDParser.g:2216:1: ruleARTIFACT_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= UPLOAD ) | (enumLiteral_1= DOWNLOAD ) ) ;
    public final Enumerator ruleARTIFACT_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCICDParser.g:2222:2: ( ( (enumLiteral_0= UPLOAD ) | (enumLiteral_1= DOWNLOAD ) ) )
            // InternalCICDParser.g:2223:2: ( (enumLiteral_0= UPLOAD ) | (enumLiteral_1= DOWNLOAD ) )
            {
            // InternalCICDParser.g:2223:2: ( (enumLiteral_0= UPLOAD ) | (enumLiteral_1= DOWNLOAD ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==UPLOAD) ) {
                alt64=1;
            }
            else if ( (LA64_0==DOWNLOAD) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalCICDParser.g:2224:3: (enumLiteral_0= UPLOAD )
                    {
                    // InternalCICDParser.g:2224:3: (enumLiteral_0= UPLOAD )
                    // InternalCICDParser.g:2225:4: enumLiteral_0= UPLOAD
                    {
                    enumLiteral_0=(Token)match(input,UPLOAD,FOLLOW_2); 

                    				current = grammarAccess.getARTIFACT_TYPEAccess().getUPLOADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getARTIFACT_TYPEAccess().getUPLOADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCICDParser.g:2232:3: (enumLiteral_1= DOWNLOAD )
                    {
                    // InternalCICDParser.g:2232:3: (enumLiteral_1= DOWNLOAD )
                    // InternalCICDParser.g:2233:4: enumLiteral_1= DOWNLOAD
                    {
                    enumLiteral_1=(Token)match(input,DOWNLOAD,FOLLOW_2); 

                    				current = grammarAccess.getARTIFACT_TYPEAccess().getDOWNLOADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getARTIFACT_TYPEAccess().getDOWNLOADEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleARTIFACT_TYPE"


    // $ANTLR start "ruleMATRIX_CONFIG_TYPE"
    // InternalCICDParser.g:2243:1: ruleMATRIX_CONFIG_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= INCLUDE ) | (enumLiteral_2= EXCLUDE ) ) ;
    public final Enumerator ruleMATRIX_CONFIG_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCICDParser.g:2249:2: ( ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= INCLUDE ) | (enumLiteral_2= EXCLUDE ) ) )
            // InternalCICDParser.g:2250:2: ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= INCLUDE ) | (enumLiteral_2= EXCLUDE ) )
            {
            // InternalCICDParser.g:2250:2: ( (enumLiteral_0= DEFAULT ) | (enumLiteral_1= INCLUDE ) | (enumLiteral_2= EXCLUDE ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt65=1;
                }
                break;
            case INCLUDE:
                {
                alt65=2;
                }
                break;
            case EXCLUDE:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalCICDParser.g:2251:3: (enumLiteral_0= DEFAULT )
                    {
                    // InternalCICDParser.g:2251:3: (enumLiteral_0= DEFAULT )
                    // InternalCICDParser.g:2252:4: enumLiteral_0= DEFAULT
                    {
                    enumLiteral_0=(Token)match(input,DEFAULT,FOLLOW_2); 

                    				current = grammarAccess.getMATRIX_CONFIG_TYPEAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMATRIX_CONFIG_TYPEAccess().getDEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCICDParser.g:2259:3: (enumLiteral_1= INCLUDE )
                    {
                    // InternalCICDParser.g:2259:3: (enumLiteral_1= INCLUDE )
                    // InternalCICDParser.g:2260:4: enumLiteral_1= INCLUDE
                    {
                    enumLiteral_1=(Token)match(input,INCLUDE,FOLLOW_2); 

                    				current = grammarAccess.getMATRIX_CONFIG_TYPEAccess().getINCLUDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMATRIX_CONFIG_TYPEAccess().getINCLUDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCICDParser.g:2267:3: (enumLiteral_2= EXCLUDE )
                    {
                    // InternalCICDParser.g:2267:3: (enumLiteral_2= EXCLUDE )
                    // InternalCICDParser.g:2268:4: enumLiteral_2= EXCLUDE
                    {
                    enumLiteral_2=(Token)match(input,EXCLUDE,FOLLOW_2); 

                    				current = grammarAccess.getMATRIX_CONFIG_TYPEAccess().getEXCLUDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMATRIX_CONFIG_TYPEAccess().getEXCLUDEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMATRIX_CONFIG_TYPE"


    // $ANTLR start "ruleINPUT_TYPE"
    // InternalCICDParser.g:2278:1: ruleINPUT_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= STRING ) | (enumLiteral_1= NUMBER ) | (enumLiteral_2= BOOLEAN ) | (enumLiteral_3= SECRET ) | (enumLiteral_4= CHOICE ) | (enumLiteral_5= PASSWORD ) | (enumLiteral_6= TEXT ) ) ;
    public final Enumerator ruleINPUT_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalCICDParser.g:2284:2: ( ( (enumLiteral_0= STRING ) | (enumLiteral_1= NUMBER ) | (enumLiteral_2= BOOLEAN ) | (enumLiteral_3= SECRET ) | (enumLiteral_4= CHOICE ) | (enumLiteral_5= PASSWORD ) | (enumLiteral_6= TEXT ) ) )
            // InternalCICDParser.g:2285:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= NUMBER ) | (enumLiteral_2= BOOLEAN ) | (enumLiteral_3= SECRET ) | (enumLiteral_4= CHOICE ) | (enumLiteral_5= PASSWORD ) | (enumLiteral_6= TEXT ) )
            {
            // InternalCICDParser.g:2285:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= NUMBER ) | (enumLiteral_2= BOOLEAN ) | (enumLiteral_3= SECRET ) | (enumLiteral_4= CHOICE ) | (enumLiteral_5= PASSWORD ) | (enumLiteral_6= TEXT ) )
            int alt66=7;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt66=1;
                }
                break;
            case NUMBER:
                {
                alt66=2;
                }
                break;
            case BOOLEAN:
                {
                alt66=3;
                }
                break;
            case SECRET:
                {
                alt66=4;
                }
                break;
            case CHOICE:
                {
                alt66=5;
                }
                break;
            case PASSWORD:
                {
                alt66=6;
                }
                break;
            case TEXT:
                {
                alt66=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalCICDParser.g:2286:3: (enumLiteral_0= STRING )
                    {
                    // InternalCICDParser.g:2286:3: (enumLiteral_0= STRING )
                    // InternalCICDParser.g:2287:4: enumLiteral_0= STRING
                    {
                    enumLiteral_0=(Token)match(input,STRING,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getINPUT_TYPEAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCICDParser.g:2294:3: (enumLiteral_1= NUMBER )
                    {
                    // InternalCICDParser.g:2294:3: (enumLiteral_1= NUMBER )
                    // InternalCICDParser.g:2295:4: enumLiteral_1= NUMBER
                    {
                    enumLiteral_1=(Token)match(input,NUMBER,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getINPUT_TYPEAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCICDParser.g:2302:3: (enumLiteral_2= BOOLEAN )
                    {
                    // InternalCICDParser.g:2302:3: (enumLiteral_2= BOOLEAN )
                    // InternalCICDParser.g:2303:4: enumLiteral_2= BOOLEAN
                    {
                    enumLiteral_2=(Token)match(input,BOOLEAN,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getINPUT_TYPEAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCICDParser.g:2310:3: (enumLiteral_3= SECRET )
                    {
                    // InternalCICDParser.g:2310:3: (enumLiteral_3= SECRET )
                    // InternalCICDParser.g:2311:4: enumLiteral_3= SECRET
                    {
                    enumLiteral_3=(Token)match(input,SECRET,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getSECRETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getINPUT_TYPEAccess().getSECRETEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCICDParser.g:2318:3: (enumLiteral_4= CHOICE )
                    {
                    // InternalCICDParser.g:2318:3: (enumLiteral_4= CHOICE )
                    // InternalCICDParser.g:2319:4: enumLiteral_4= CHOICE
                    {
                    enumLiteral_4=(Token)match(input,CHOICE,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getCHOICEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getINPUT_TYPEAccess().getCHOICEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCICDParser.g:2326:3: (enumLiteral_5= PASSWORD )
                    {
                    // InternalCICDParser.g:2326:3: (enumLiteral_5= PASSWORD )
                    // InternalCICDParser.g:2327:4: enumLiteral_5= PASSWORD
                    {
                    enumLiteral_5=(Token)match(input,PASSWORD,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getPASSWORDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getINPUT_TYPEAccess().getPASSWORDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCICDParser.g:2334:3: (enumLiteral_6= TEXT )
                    {
                    // InternalCICDParser.g:2334:3: (enumLiteral_6= TEXT )
                    // InternalCICDParser.g:2335:4: enumLiteral_6= TEXT
                    {
                    enumLiteral_6=(Token)match(input,TEXT,FOLLOW_2); 

                    				current = grammarAccess.getINPUT_TYPEAccess().getTEXTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getINPUT_TYPEAccess().getTEXTEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleINPUT_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4880000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4880050400000122L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000050400000122L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000050400000122L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000050400000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4000050400000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000050400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4000050400000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x4000040400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4888010580108540L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4888010580108500L,0x0000000000000001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x4888010580008500L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x6888010580008100L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4888010580008100L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4880010580008100L,0x0000000000000001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4880010500008100L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4880010500000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4880010500000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010001A40820000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008010000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020081000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020081000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000081000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0580000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0500000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0500000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4888000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4888000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0006080000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000600100L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000200100L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});

}