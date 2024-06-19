package org.xtext.example.circleci.parser.antlr.internal;

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
import org.xtext.example.circleci.services.CircleciGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCircleciParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ENVIRONMENT_VARIABLE_NAME", "MacosX86MediumGen2", "Aws_secret_access_key", "Docker_layer_caching", "MacosM1LargeGen1", "MacosM1MediumGen", "PersistToWorkspace", "SetupRemoteDocker", "Aws_access_key_id", "No_output_timeout", "Working_directory", "Docker_Aws_Auths", "StoreTestResults", "AttachWorkspace", "Matrix_exclude", "StoreArtifact", "Matrix_params", "ResourceClass", "ReuseExecutor", "MatrixParams", "RestoreCache", "Fingerprints", "Docker_Auth", "Environment", "JobWorkflow", "When_Unless", "ApprovalJob", "Description", "Destination", "Parallelism", "Unless_step", "AddSSHKeys", "Parameters", "RunCommand", "Background", "Entrypoint", "EnumValues", "On_success", "Parameter", "SaveCache", "Condition", "Parameter_1", "When_step", "Xlarge_2", "Checkout", "EXECUTOR", "Pipeline", "Workflow", "Password", "Requires", "Username", "Xlarge_1", "BOOLEAN", "Command", "INTEGER", "Machine", "Trigger", "Command_1", "Context", "Default", "Medium_1", "On_fail", "Version", "Branch", "Docker", "Matrix", "STRING", "Always", "Branch_1", "Ignore", "Medium", "Values", "Xlarge", "MacOs", "STEPS", "Alias", "False", "Image", "Large", "Paths", "Setup", "Shell", "Small", "Value", "Xcode", "ENUM", "Cron", "Keys", "Name", "Only", "Path", "Root", "True", "Type", "User", "When", "Job", "Orb", "Run", "Key", "At", "Comma", "HyphenMinus", "RULE_NEWLINE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Command_1=61;
    public static final int SetupRemoteDocker=11;
    public static final int AttachWorkspace=17;
    public static final int Values=75;
    public static final int False=80;
    public static final int RunCommand=37;
    public static final int Image=81;
    public static final int Aws_access_key_id=12;
    public static final int Checkout=48;
    public static final int Matrix=69;
    public static final int Docker=68;
    public static final int MacOs=77;
    public static final int ENUM=89;
    public static final int Parameters=36;
    public static final int Small=86;
    public static final int Background=38;
    public static final int Root=95;
    public static final int RULE_ID=110;
    public static final int When_step=46;
    public static final int Aws_secret_access_key=6;
    public static final int Workflow=51;
    public static final int MacosM1MediumGen=9;
    public static final int RestoreCache=24;
    public static final int Medium_1=64;
    public static final int RULE_INT=111;
    public static final int Keys=91;
    public static final int RULE_ML_COMMENT=113;
    public static final int Always=71;
    public static final int StoreTestResults=16;
    public static final int SaveCache=43;
    public static final int Key=103;
    public static final int Description=31;
    public static final int Xcode=88;
    public static final int Fingerprints=25;
    public static final int RULE_NEWLINE=107;
    public static final int Large=82;
    public static final int Machine=59;
    public static final int Xlarge_1=55;
    public static final int Comma=105;
    public static final int HyphenMinus=106;
    public static final int Xlarge_2=47;
    public static final int At=104;
    public static final int Unless_step=34;
    public static final int When_Unless=29;
    public static final int Paths=83;
    public static final int JobWorkflow=28;
    public static final int Context=62;
    public static final int Path=94;
    public static final int Matrix_params=20;
    public static final int Run=102;
    public static final int Default=63;
    public static final int Pipeline=50;
    public static final int Type=97;
    public static final int Docker_Aws_Auths=15;
    public static final int When=99;
    public static final int On_fail=65;
    public static final int ReuseExecutor=22;
    public static final int ApprovalJob=30;
    public static final int Parameter=42;
    public static final int STRING=70;
    public static final int Ignore=73;
    public static final int Docker_Auth=26;
    public static final int RULE_BEGIN=108;
    public static final int True=96;
    public static final int Cron=90;
    public static final int Name=92;
    public static final int Trigger=60;
    public static final int On_success=41;
    public static final int Version=66;
    public static final int No_output_timeout=13;
    public static final int Setup=84;
    public static final int Job=100;
    public static final int ResourceClass=21;
    public static final int INTEGER=58;
    public static final int Branch_1=72;
    public static final int Requires=53;
    public static final int MacosX86MediumGen2=5;
    public static final int Docker_layer_caching=7;
    public static final int Xlarge=76;
    public static final int BOOLEAN=56;
    public static final int Medium=74;
    public static final int EXECUTOR=49;
    public static final int Value=87;
    public static final int Environment=27;
    public static final int Parallelism=33;
    public static final int MacosM1LargeGen1=8;
    public static final int Orb=101;
    public static final int STEPS=78;
    public static final int Destination=32;
    public static final int RULE_END=109;
    public static final int User=98;
    public static final int StoreArtifact=19;
    public static final int Matrix_exclude=18;
    public static final int RULE_STRING=112;
    public static final int EnumValues=40;
    public static final int RULE_SL_COMMENT=114;
    public static final int Shell=85;
    public static final int Branch=67;
    public static final int EOF=-1;
    public static final int Password=52;
    public static final int ENVIRONMENT_VARIABLE_NAME=4;
    public static final int Condition=44;
    public static final int AddSSHKeys=35;
    public static final int Entrypoint=39;
    public static final int RULE_WS=115;
    public static final int PersistToWorkspace=10;
    public static final int Working_directory=14;
    public static final int MatrixParams=23;
    public static final int Only=93;
    public static final int RULE_ANY_OTHER=116;
    public static final int Parameter_1=45;
    public static final int Username=54;
    public static final int Command=57;
    public static final int Alias=79;

    // delegates
    // delegators


        public InternalCircleciParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCircleciParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCircleciParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCircleciParser.g"; }



     	private CircleciGrammarAccess grammarAccess;

        public InternalCircleciParser(TokenStream input, CircleciGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected CircleciGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalCircleciParser.g:58:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalCircleciParser.g:58:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalCircleciParser.g:59:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalCircleciParser.g:65:1: rulePipeline returns [EObject current=null] : (otherlv_0= Pipeline (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END ) ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? ) ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token lv_setup_2_0=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        Token this_NEWLINE_7=null;
        Token this_NEWLINE_9=null;
        Token this_NEWLINE_11=null;
        Token this_NEWLINE_13=null;
        Token this_NEWLINE_15=null;
        AntlrDatatypeRuleToken lv_version_4_0 = null;

        EObject lv_orbs_6_0 = null;

        EObject lv_commands_8_0 = null;

        EObject lv_executors_10_0 = null;

        EObject lv_jobs_12_0 = null;

        EObject lv_workflows_14_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:71:2: ( (otherlv_0= Pipeline (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END ) ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? ) ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )? ) )
            // InternalCircleciParser.g:72:2: (otherlv_0= Pipeline (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END ) ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? ) ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )? )
            {
            // InternalCircleciParser.g:72:2: (otherlv_0= Pipeline (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END ) ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? ) ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )? )
            // InternalCircleciParser.g:73:3: otherlv_0= Pipeline (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END ) ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? ) ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )?
            {
            otherlv_0=(Token)match(input,Pipeline,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getPipelineKeyword_0());
            		
            // InternalCircleciParser.g:77:3: (this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalCircleciParser.g:78:4: this_BEGIN_1= RULE_BEGIN ( (lv_setup_2_0= Setup ) )? otherlv_3= Version ( (lv_version_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:82:4: ( (lv_setup_2_0= Setup ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Setup) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCircleciParser.g:83:5: (lv_setup_2_0= Setup )
                    {
                    // InternalCircleciParser.g:83:5: (lv_setup_2_0= Setup )
                    // InternalCircleciParser.g:84:6: lv_setup_2_0= Setup
                    {
                    lv_setup_2_0=(Token)match(input,Setup,FOLLOW_5); 

                    						newLeafNode(lv_setup_2_0, grammarAccess.getPipelineAccess().getSetupSetupKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineRule());
                    						}
                    						setWithLastConsumed(current, "setup", lv_setup_2_0 != null, "setup");
                    					

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Version,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getVersionKeyword_1_2());
            			
            // InternalCircleciParser.g:100:4: ( (lv_version_4_0= ruleEString ) )
            // InternalCircleciParser.g:101:5: (lv_version_4_0= ruleEString )
            {
            // InternalCircleciParser.g:101:5: (lv_version_4_0= ruleEString )
            // InternalCircleciParser.g:102:6: lv_version_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPipelineAccess().getVersionEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_7);
            lv_version_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPipelineRule());
            						}
            						set(
            							current,
            							"version",
            							lv_version_4_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_8); 

            				newLeafNode(this_END_5, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_1_4());
            			

            }

            // InternalCircleciParser.g:124:3: ( ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Orb) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCircleciParser.g:125:4: ( (lv_orbs_6_0= ruleOrb ) )+ (this_NEWLINE_7= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:125:4: ( (lv_orbs_6_0= ruleOrb ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Orb) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCircleciParser.g:126:5: (lv_orbs_6_0= ruleOrb )
                    	    {
                    	    // InternalCircleciParser.g:126:5: (lv_orbs_6_0= ruleOrb )
                    	    // InternalCircleciParser.g:127:6: lv_orbs_6_0= ruleOrb
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getOrbsOrbParserRuleCall_2_0_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_orbs_6_0=ruleOrb();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orbs",
                    	    							lv_orbs_6_0,
                    	    							"org.xtext.example.circleci.Circleci.Orb");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    // InternalCircleciParser.g:144:4: (this_NEWLINE_7= RULE_NEWLINE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_NEWLINE) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCircleciParser.g:145:5: this_NEWLINE_7= RULE_NEWLINE
                            {
                            this_NEWLINE_7=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

                            					newLeafNode(this_NEWLINE_7, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:151:3: ( ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Command) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCircleciParser.g:152:4: ( (lv_commands_8_0= ruleCommand ) )+ (this_NEWLINE_9= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:152:4: ( (lv_commands_8_0= ruleCommand ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Command) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCircleciParser.g:153:5: (lv_commands_8_0= ruleCommand )
                    	    {
                    	    // InternalCircleciParser.g:153:5: (lv_commands_8_0= ruleCommand )
                    	    // InternalCircleciParser.g:154:6: lv_commands_8_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getCommandsCommandParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_commands_8_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_8_0,
                    	    							"org.xtext.example.circleci.Circleci.Command");
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

                    // InternalCircleciParser.g:171:4: (this_NEWLINE_9= RULE_NEWLINE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_NEWLINE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCircleciParser.g:172:5: this_NEWLINE_9= RULE_NEWLINE
                            {
                            this_NEWLINE_9=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

                            					newLeafNode(this_NEWLINE_9, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_3_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:178:3: ( ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Machine||LA10_0==Docker||LA10_0==MacOs) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCircleciParser.g:179:4: ( (lv_executors_10_0= ruleExecutor ) )+ (this_NEWLINE_11= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:179:4: ( (lv_executors_10_0= ruleExecutor ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Machine||LA8_0==Docker||LA8_0==MacOs) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCircleciParser.g:180:5: (lv_executors_10_0= ruleExecutor )
                    	    {
                    	    // InternalCircleciParser.g:180:5: (lv_executors_10_0= ruleExecutor )
                    	    // InternalCircleciParser.g:181:6: lv_executors_10_0= ruleExecutor
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getExecutorsExecutorParserRuleCall_4_0_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_executors_10_0=ruleExecutor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"executors",
                    	    							lv_executors_10_0,
                    	    							"org.xtext.example.circleci.Circleci.Executor");
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

                    // InternalCircleciParser.g:198:4: (this_NEWLINE_11= RULE_NEWLINE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_NEWLINE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCircleciParser.g:199:5: this_NEWLINE_11= RULE_NEWLINE
                            {
                            this_NEWLINE_11=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

                            					newLeafNode(this_NEWLINE_11, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:205:3: ( ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )
            // InternalCircleciParser.g:206:4: ( (lv_jobs_12_0= ruleJob ) )+ (this_NEWLINE_13= RULE_NEWLINE )?
            {
            // InternalCircleciParser.g:206:4: ( (lv_jobs_12_0= ruleJob ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Job) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCircleciParser.g:207:5: (lv_jobs_12_0= ruleJob )
            	    {
            	    // InternalCircleciParser.g:207:5: (lv_jobs_12_0= ruleJob )
            	    // InternalCircleciParser.g:208:6: lv_jobs_12_0= ruleJob
            	    {

            	    						newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_jobs_12_0=ruleJob();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobs",
            	    							lv_jobs_12_0,
            	    							"org.xtext.example.circleci.Circleci.Job");
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

            // InternalCircleciParser.g:225:4: (this_NEWLINE_13= RULE_NEWLINE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_NEWLINE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCircleciParser.g:226:5: this_NEWLINE_13= RULE_NEWLINE
                    {
                    this_NEWLINE_13=(Token)match(input,RULE_NEWLINE,FOLLOW_11); 

                    					newLeafNode(this_NEWLINE_13, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_5_1());
                    				

                    }
                    break;

            }


            }

            // InternalCircleciParser.g:232:3: ( ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Workflow) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCircleciParser.g:233:4: ( (lv_workflows_14_0= ruleWorkflow ) )+ (this_NEWLINE_15= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:233:4: ( (lv_workflows_14_0= ruleWorkflow ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Workflow) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCircleciParser.g:234:5: (lv_workflows_14_0= ruleWorkflow )
                    	    {
                    	    // InternalCircleciParser.g:234:5: (lv_workflows_14_0= ruleWorkflow )
                    	    // InternalCircleciParser.g:235:6: lv_workflows_14_0= ruleWorkflow
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getWorkflowsWorkflowParserRuleCall_6_0_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_workflows_14_0=ruleWorkflow();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"workflows",
                    	    							lv_workflows_14_0,
                    	    							"org.xtext.example.circleci.Circleci.Workflow");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // InternalCircleciParser.g:252:4: (this_NEWLINE_15= RULE_NEWLINE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_NEWLINE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCircleciParser.g:253:5: this_NEWLINE_15= RULE_NEWLINE
                            {
                            this_NEWLINE_15=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                            					newLeafNode(this_NEWLINE_15, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_6_1());
                            				

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


    // $ANTLR start "entryRuleExecutor"
    // InternalCircleciParser.g:263:1: entryRuleExecutor returns [EObject current=null] : iv_ruleExecutor= ruleExecutor EOF ;
    public final EObject entryRuleExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutor = null;


        try {
            // InternalCircleciParser.g:263:49: (iv_ruleExecutor= ruleExecutor EOF )
            // InternalCircleciParser.g:264:2: iv_ruleExecutor= ruleExecutor EOF
            {
             newCompositeNode(grammarAccess.getExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutor=ruleExecutor();

            state._fsp--;

             current =iv_ruleExecutor; 
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
    // $ANTLR end "entryRuleExecutor"


    // $ANTLR start "ruleExecutor"
    // InternalCircleciParser.g:270:1: ruleExecutor returns [EObject current=null] : (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker ) ;
    public final EObject ruleExecutor() throws RecognitionException {
        EObject current = null;

        EObject this_Machine_0 = null;

        EObject this_MacOs_1 = null;

        EObject this_Docker_2 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:276:2: ( (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker ) )
            // InternalCircleciParser.g:277:2: (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker )
            {
            // InternalCircleciParser.g:277:2: (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Machine:
                {
                alt16=1;
                }
                break;
            case MacOs:
                {
                alt16=2;
                }
                break;
            case Docker:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCircleciParser.g:278:3: this_Machine_0= ruleMachine
                    {

                    			newCompositeNode(grammarAccess.getExecutorAccess().getMachineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Machine_0=ruleMachine();

                    state._fsp--;


                    			current = this_Machine_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:287:3: this_MacOs_1= ruleMacOs
                    {

                    			newCompositeNode(grammarAccess.getExecutorAccess().getMacOsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MacOs_1=ruleMacOs();

                    state._fsp--;


                    			current = this_MacOs_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:296:3: this_Docker_2= ruleDocker
                    {

                    			newCompositeNode(grammarAccess.getExecutorAccess().getDockerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Docker_2=ruleDocker();

                    state._fsp--;


                    			current = this_Docker_2;
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
    // $ANTLR end "ruleExecutor"


    // $ANTLR start "entryRuleStep"
    // InternalCircleciParser.g:308:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCircleciParser.g:308:45: (iv_ruleStep= ruleStep EOF )
            // InternalCircleciParser.g:309:2: iv_ruleStep= ruleStep EOF
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
    // InternalCircleciParser.g:315:1: ruleStep returns [EObject current=null] : (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Run_0 = null;

        EObject this_RestoreCache_1 = null;

        EObject this_PersistToWorkspace_2 = null;

        EObject this_StoreArtifact_3 = null;

        EObject this_StoreTestResults_4 = null;

        EObject this_SetupRemoteDocker_5 = null;

        EObject this_AddSSHKeys_6 = null;

        EObject this_SaveCache_7 = null;

        EObject this_AttachWorkspace_8 = null;

        EObject this_When_Unless_9 = null;

        EObject this_Checkout_10 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:321:2: ( (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout ) )
            // InternalCircleciParser.g:322:2: (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout )
            {
            // InternalCircleciParser.g:322:2: (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout )
            int alt17=11;
            switch ( input.LA(1) ) {
            case Run:
                {
                alt17=1;
                }
                break;
            case RestoreCache:
                {
                alt17=2;
                }
                break;
            case PersistToWorkspace:
                {
                alt17=3;
                }
                break;
            case StoreArtifact:
                {
                alt17=4;
                }
                break;
            case StoreTestResults:
                {
                alt17=5;
                }
                break;
            case SetupRemoteDocker:
                {
                alt17=6;
                }
                break;
            case AddSSHKeys:
                {
                alt17=7;
                }
                break;
            case SaveCache:
                {
                alt17=8;
                }
                break;
            case AttachWorkspace:
                {
                alt17=9;
                }
                break;
            case When_Unless:
                {
                alt17=10;
                }
                break;
            case Checkout:
                {
                alt17=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCircleciParser.g:323:3: this_Run_0= ruleRun
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getRunParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Run_0=ruleRun();

                    state._fsp--;


                    			current = this_Run_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:332:3: this_RestoreCache_1= ruleRestoreCache
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getRestoreCacheParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestoreCache_1=ruleRestoreCache();

                    state._fsp--;


                    			current = this_RestoreCache_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:341:3: this_PersistToWorkspace_2= rulePersistToWorkspace
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getPersistToWorkspaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersistToWorkspace_2=rulePersistToWorkspace();

                    state._fsp--;


                    			current = this_PersistToWorkspace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:350:3: this_StoreArtifact_3= ruleStoreArtifact
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getStoreArtifactParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreArtifact_3=ruleStoreArtifact();

                    state._fsp--;


                    			current = this_StoreArtifact_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:359:3: this_StoreTestResults_4= ruleStoreTestResults
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getStoreTestResultsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreTestResults_4=ruleStoreTestResults();

                    state._fsp--;


                    			current = this_StoreTestResults_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCircleciParser.g:368:3: this_SetupRemoteDocker_5= ruleSetupRemoteDocker
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getSetupRemoteDockerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetupRemoteDocker_5=ruleSetupRemoteDocker();

                    state._fsp--;


                    			current = this_SetupRemoteDocker_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCircleciParser.g:377:3: this_AddSSHKeys_6= ruleAddSSHKeys
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAddSSHKeysParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddSSHKeys_6=ruleAddSSHKeys();

                    state._fsp--;


                    			current = this_AddSSHKeys_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCircleciParser.g:386:3: this_SaveCache_7= ruleSaveCache
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getSaveCacheParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SaveCache_7=ruleSaveCache();

                    state._fsp--;


                    			current = this_SaveCache_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCircleciParser.g:395:3: this_AttachWorkspace_8= ruleAttachWorkspace
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAttachWorkspaceParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttachWorkspace_8=ruleAttachWorkspace();

                    state._fsp--;


                    			current = this_AttachWorkspace_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCircleciParser.g:404:3: this_When_Unless_9= ruleWhen_Unless
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getWhen_UnlessParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_Unless_9=ruleWhen_Unless();

                    state._fsp--;


                    			current = this_When_Unless_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCircleciParser.g:413:3: this_Checkout_10= ruleCheckout
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getCheckoutParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkout_10=ruleCheckout();

                    state._fsp--;


                    			current = this_Checkout_10;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleOrb"
    // InternalCircleciParser.g:425:1: entryRuleOrb returns [EObject current=null] : iv_ruleOrb= ruleOrb EOF ;
    public final EObject entryRuleOrb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrb = null;


        try {
            // InternalCircleciParser.g:425:44: (iv_ruleOrb= ruleOrb EOF )
            // InternalCircleciParser.g:426:2: iv_ruleOrb= ruleOrb EOF
            {
             newCompositeNode(grammarAccess.getOrbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrb=ruleOrb();

            state._fsp--;

             current =iv_ruleOrb; 
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
    // $ANTLR end "entryRuleOrb"


    // $ANTLR start "ruleOrb"
    // InternalCircleciParser.g:432:1: ruleOrb returns [EObject current=null] : (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleOrb() throws RecognitionException {
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
            // InternalCircleciParser.g:438:2: ( (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:439:2: (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:439:2: (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:440:3: otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Orb,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOrbAccess().getOrbKeyword_0());
            		
            // InternalCircleciParser.g:444:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:445:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getOrbAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getOrbAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:453:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:454:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:454:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:455:6: lv_key_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOrbAccess().getKeyEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_key_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOrbRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getOrbAccess().getValueKeyword_1_3());
            			
            // InternalCircleciParser.g:476:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCircleciParser.g:477:5: (lv_value_5_0= ruleEString )
            {
            // InternalCircleciParser.g:477:5: (lv_value_5_0= ruleEString )
            // InternalCircleciParser.g:478:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOrbAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOrbRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getOrbAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleOrb"


    // $ANTLR start "entryRuleCommand"
    // InternalCircleciParser.g:504:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCircleciParser.g:504:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCircleciParser.g:505:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalCircleciParser.g:511:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_steps_7_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:517:2: ( (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:518:2: (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:518:2: (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) )
            // InternalCircleciParser.g:519:3: otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalCircleciParser.g:523:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END )
            // InternalCircleciParser.g:524:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:532:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:533:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:533:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:534:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCommandRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:551:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCircleciParser.g:552:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:556:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalCircleciParser.g:557:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalCircleciParser.g:557:6: (lv_description_5_0= ruleEString )
                    // InternalCircleciParser.g:558:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommandRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:576:4: ( (lv_parameters_6_0= ruleParameter ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Parameter) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCircleciParser.g:577:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCircleciParser.g:577:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalCircleciParser.g:578:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getCommandAccess().getParametersParameterParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.xtext.example.circleci.Circleci.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalCircleciParser.g:595:4: ( (lv_steps_7_0= ruleStep ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=PersistToWorkspace && LA20_0<=SetupRemoteDocker)||(LA20_0>=StoreTestResults && LA20_0<=AttachWorkspace)||LA20_0==StoreArtifact||LA20_0==RestoreCache||LA20_0==When_Unless||LA20_0==AddSSHKeys||LA20_0==SaveCache||LA20_0==Checkout||LA20_0==Run) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCircleciParser.g:596:5: (lv_steps_7_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:596:5: (lv_steps_7_0= ruleStep )
            	    // InternalCircleciParser.g:597:6: lv_steps_7_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getCommandAccess().getStepsStepParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_steps_7_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_7_0,
            	    							"org.xtext.example.circleci.Circleci.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getCommandAccess().getENDTerminalRuleCall_1_6());
            			

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


    // $ANTLR start "entryRuleWorkflow"
    // InternalCircleciParser.g:623:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalCircleciParser.g:623:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalCircleciParser.g:624:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
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
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalCircleciParser.g:630:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_triggers_6_0 = null;

        EObject lv_branches_7_0 = null;

        EObject lv_when_unless_8_0 = null;

        EObject lv_jobworkflow_9_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:636:2: ( (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) ) )
            // InternalCircleciParser.g:637:2: (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) )
            {
            // InternalCircleciParser.g:637:2: (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) )
            // InternalCircleciParser.g:638:3: otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,Workflow,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalCircleciParser.g:642:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END )
            // InternalCircleciParser.g:643:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getWorkflowAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:651:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:652:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:652:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:653:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWorkflowAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Version,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getVersionKeyword_1_3());
            			
            // InternalCircleciParser.g:674:4: ( (lv_version_5_0= ruleEString ) )
            // InternalCircleciParser.g:675:5: (lv_version_5_0= ruleEString )
            {
            // InternalCircleciParser.g:675:5: (lv_version_5_0= ruleEString )
            // InternalCircleciParser.g:676:6: lv_version_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWorkflowAccess().getVersionEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_18);
            lv_version_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            						}
            						set(
            							current,
            							"version",
            							lv_version_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:693:4: ( (lv_triggers_6_0= ruleTrigger ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Trigger) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCircleciParser.g:694:5: (lv_triggers_6_0= ruleTrigger )
            	    {
            	    // InternalCircleciParser.g:694:5: (lv_triggers_6_0= ruleTrigger )
            	    // InternalCircleciParser.g:695:6: lv_triggers_6_0= ruleTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getTriggersTriggerParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_triggers_6_0=ruleTrigger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggers",
            	    							lv_triggers_6_0,
            	    							"org.xtext.example.circleci.Circleci.Trigger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalCircleciParser.g:712:4: ( (lv_branches_7_0= ruleBranch ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Branch) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCircleciParser.g:713:5: (lv_branches_7_0= ruleBranch )
            	    {
            	    // InternalCircleciParser.g:713:5: (lv_branches_7_0= ruleBranch )
            	    // InternalCircleciParser.g:714:6: lv_branches_7_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getBranchesBranchParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_branches_7_0=ruleBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_7_0,
            	    							"org.xtext.example.circleci.Circleci.Branch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalCircleciParser.g:731:4: ( (lv_when_unless_8_0= ruleWhen_Unless ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==When_Unless) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCircleciParser.g:732:5: (lv_when_unless_8_0= ruleWhen_Unless )
                    {
                    // InternalCircleciParser.g:732:5: (lv_when_unless_8_0= ruleWhen_Unless )
                    // InternalCircleciParser.g:733:6: lv_when_unless_8_0= ruleWhen_Unless
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getWhen_unlessWhen_UnlessParserRuleCall_1_7_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_when_unless_8_0=ruleWhen_Unless();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						set(
                    							current,
                    							"when_unless",
                    							lv_when_unless_8_0,
                    							"org.xtext.example.circleci.Circleci.When_Unless");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:750:4: ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==JobWorkflow) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCircleciParser.g:751:5: (lv_jobworkflow_9_0= ruleJobWorkflow )
            	    {
            	    // InternalCircleciParser.g:751:5: (lv_jobworkflow_9_0= ruleJobWorkflow )
            	    // InternalCircleciParser.g:752:6: lv_jobworkflow_9_0= ruleJobWorkflow
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getJobworkflowJobWorkflowParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_jobworkflow_9_0=ruleJobWorkflow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobworkflow",
            	    							lv_jobworkflow_9_0,
            	    							"org.xtext.example.circleci.Circleci.JobWorkflow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_10, grammarAccess.getWorkflowAccess().getENDTerminalRuleCall_1_9());
            			

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
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleJob"
    // InternalCircleciParser.g:778:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalCircleciParser.g:778:44: (iv_ruleJob= ruleJob EOF )
            // InternalCircleciParser.g:779:2: iv_ruleJob= ruleJob EOF
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
    // InternalCircleciParser.g:785:1: ruleJob returns [EObject current=null] : (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_parallelism_5_0 = null;

        AntlrDatatypeRuleToken lv_reuseExecutor_7_0 = null;

        EObject lv_executors_8_0 = null;

        EObject lv_environments_9_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_steps_11_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:791:2: ( (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:792:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:792:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) )
            // InternalCircleciParser.g:793:3: otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,Job,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getJobKeyword_0());
            		
            // InternalCircleciParser.g:797:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END )
            // InternalCircleciParser.g:798:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:802:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )
            // InternalCircleciParser.g:803:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getJobAccess().getNameKeyword_1_1_0());
            				
            // InternalCircleciParser.g:807:5: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:808:6: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:808:6: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:809:7: lv_name_3_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_1_1_1_0());
            						
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleEString();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getJobRule());
            							}
            							set(
            								current,
            								"name",
            								lv_name_3_0,
            								"org.xtext.example.circleci.Circleci.EString");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalCircleciParser.g:827:4: (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Parallelism) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCircleciParser.g:828:5: otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) )
                    {
                    otherlv_4=(Token)match(input,Parallelism,FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getJobAccess().getParallelismKeyword_1_2_0());
                    				
                    // InternalCircleciParser.g:832:5: ( (lv_parallelism_5_0= ruleEShort ) )
                    // InternalCircleciParser.g:833:6: (lv_parallelism_5_0= ruleEShort )
                    {
                    // InternalCircleciParser.g:833:6: (lv_parallelism_5_0= ruleEShort )
                    // InternalCircleciParser.g:834:7: lv_parallelism_5_0= ruleEShort
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getParallelismEShortParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_parallelism_5_0=ruleEShort();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobRule());
                    							}
                    							set(
                    								current,
                    								"parallelism",
                    								lv_parallelism_5_0,
                    								"org.xtext.example.circleci.Circleci.EShort");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:852:4: (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReuseExecutor) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCircleciParser.g:853:5: otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,ReuseExecutor,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getJobAccess().getReuseExecutorKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:857:5: ( (lv_reuseExecutor_7_0= ruleEString ) )
                    // InternalCircleciParser.g:858:6: (lv_reuseExecutor_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:858:6: (lv_reuseExecutor_7_0= ruleEString )
                    // InternalCircleciParser.g:859:7: lv_reuseExecutor_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getReuseExecutorEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_reuseExecutor_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobRule());
                    							}
                    							set(
                    								current,
                    								"reuseExecutor",
                    								lv_reuseExecutor_7_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:877:4: ( (lv_executors_8_0= ruleExecutor ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Machine||LA27_0==Docker||LA27_0==MacOs) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCircleciParser.g:878:5: (lv_executors_8_0= ruleExecutor )
            	    {
            	    // InternalCircleciParser.g:878:5: (lv_executors_8_0= ruleExecutor )
            	    // InternalCircleciParser.g:879:6: lv_executors_8_0= ruleExecutor
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getExecutorsExecutorParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_executors_8_0=ruleExecutor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"executors",
            	    							lv_executors_8_0,
            	    							"org.xtext.example.circleci.Circleci.Executor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalCircleciParser.g:896:4: ( (lv_environments_9_0= ruleEnvironment ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Environment) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCircleciParser.g:897:5: (lv_environments_9_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:897:5: (lv_environments_9_0= ruleEnvironment )
            	    // InternalCircleciParser.g:898:6: lv_environments_9_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getEnvironmentsEnvironmentParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_environments_9_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_9_0,
            	    							"org.xtext.example.circleci.Circleci.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalCircleciParser.g:915:4: ( (lv_parameters_10_0= ruleParameter ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Parameter) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCircleciParser.g:916:5: (lv_parameters_10_0= ruleParameter )
            	    {
            	    // InternalCircleciParser.g:916:5: (lv_parameters_10_0= ruleParameter )
            	    // InternalCircleciParser.g:917:6: lv_parameters_10_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getParametersParameterParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_parameters_10_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_10_0,
            	    							"org.xtext.example.circleci.Circleci.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalCircleciParser.g:934:4: ( (lv_steps_11_0= ruleStep ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=PersistToWorkspace && LA30_0<=SetupRemoteDocker)||(LA30_0>=StoreTestResults && LA30_0<=AttachWorkspace)||LA30_0==StoreArtifact||LA30_0==RestoreCache||LA30_0==When_Unless||LA30_0==AddSSHKeys||LA30_0==SaveCache||LA30_0==Checkout||LA30_0==Run) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCircleciParser.g:935:5: (lv_steps_11_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:935:5: (lv_steps_11_0= ruleStep )
            	    // InternalCircleciParser.g:936:6: lv_steps_11_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_steps_11_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_11_0,
            	    							"org.xtext.example.circleci.Circleci.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_12, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_8());
            			

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


    // $ANTLR start "entryRuleEString"
    // InternalCircleciParser.g:962:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCircleciParser.g:962:47: (iv_ruleEString= ruleEString EOF )
            // InternalCircleciParser.g:963:2: iv_ruleEString= ruleEString EOF
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
    // InternalCircleciParser.g:969:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:975:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCircleciParser.g:976:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCircleciParser.g:976:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCircleciParser.g:977:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:985:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleParameter"
    // InternalCircleciParser.g:996:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCircleciParser.g:996:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCircleciParser.g:997:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCircleciParser.g:1003:1: ruleParameter returns [EObject current=null] : (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
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

        AntlrDatatypeRuleToken lv_enumValues_11_0 = null;

        AntlrDatatypeRuleToken lv_enumValues_13_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1009:2: ( (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:1010:2: (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:1010:2: (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            // InternalCircleciParser.g:1011:3: otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Parameter,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCircleciParser.g:1015:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            // InternalCircleciParser.g:1016:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:1024:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:1025:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:1025:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:1026:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_25);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getParameterRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Type,FOLLOW_26); 

            				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_1_3());
            			
            // InternalCircleciParser.g:1047:4: ( (lv_type_5_0= rulePARAMETER_TYPES ) )
            // InternalCircleciParser.g:1048:5: (lv_type_5_0= rulePARAMETER_TYPES )
            {
            // InternalCircleciParser.g:1048:5: (lv_type_5_0= rulePARAMETER_TYPES )
            // InternalCircleciParser.g:1049:6: lv_type_5_0= rulePARAMETER_TYPES
            {

            						newCompositeNode(grammarAccess.getParameterAccess().getTypePARAMETER_TYPESEnumRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_27);
            lv_type_5_0=rulePARAMETER_TYPES();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getParameterRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_5_0,
            							"org.xtext.example.circleci.Circleci.PARAMETER_TYPES");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:1066:4: (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCircleciParser.g:1067:5: otherlv_6= Default ( (lv_default_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Default,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getDefaultKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:1071:5: ( (lv_default_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1072:6: (lv_default_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1072:6: (lv_default_7_0= ruleEString )
                    // InternalCircleciParser.g:1073:7: lv_default_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_default_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    							}
                    							set(
                    								current,
                    								"default",
                    								lv_default_7_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1091:4: (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Description) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCircleciParser.g:1092:5: otherlv_8= Description ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Description,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getDescriptionKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:1096:5: ( (lv_description_9_0= ruleEString ) )
                    // InternalCircleciParser.g:1097:6: (lv_description_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1097:6: (lv_description_9_0= ruleEString )
                    // InternalCircleciParser.g:1098:7: lv_description_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_9_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1116:4: (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EnumValues) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCircleciParser.g:1117:5: otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,EnumValues,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getEnumValuesKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:1121:5: ( (lv_enumValues_11_0= ruleEString ) )
                    // InternalCircleciParser.g:1122:6: (lv_enumValues_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1122:6: (lv_enumValues_11_0= ruleEString )
                    // InternalCircleciParser.g:1123:7: lv_enumValues_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getEnumValuesEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_enumValues_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    							}
                    							add(
                    								current,
                    								"enumValues",
                    								lv_enumValues_11_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:1140:5: (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCircleciParser.g:1141:6: otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getCommaKeyword_1_7_2_0());
                    	    					
                    	    // InternalCircleciParser.g:1145:6: ( (lv_enumValues_13_0= ruleEString ) )
                    	    // InternalCircleciParser.g:1146:7: (lv_enumValues_13_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:1146:7: (lv_enumValues_13_0= ruleEString )
                    	    // InternalCircleciParser.g:1147:8: lv_enumValues_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getParameterAccess().getEnumValuesEStringParserRuleCall_1_7_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_30);
                    	    lv_enumValues_13_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"enumValues",
                    	    									lv_enumValues_13_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getParameterAccess().getENDTerminalRuleCall_1_8());
            			

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRun"
    // InternalCircleciParser.g:1175:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalCircleciParser.g:1175:44: (iv_ruleRun= ruleRun EOF )
            // InternalCircleciParser.g:1176:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalCircleciParser.g:1182:1: ruleRun returns [EObject current=null] : (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_background_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_when_6_0 = null;

        AntlrDatatypeRuleToken lv_working_directory_8_0 = null;

        AntlrDatatypeRuleToken lv_no_output_timeout_10_0 = null;

        AntlrDatatypeRuleToken lv_shell_12_0 = null;

        EObject lv_environments_13_0 = null;

        EObject lv_run_commands_14_0 = null;

        EObject lv_parameters_15_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1188:2: ( (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) ) )
            // InternalCircleciParser.g:1189:2: (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) )
            {
            // InternalCircleciParser.g:1189:2: (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) )
            // InternalCircleciParser.g:1190:3: otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END )
            {
            otherlv_0=(Token)match(input,Run,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
            		
            // InternalCircleciParser.g:1194:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END )
            // InternalCircleciParser.g:1195:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getRunAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1199:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Name) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCircleciParser.g:1200:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getRunAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1204:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1205:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1205:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1206:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRunRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1224:4: ( (lv_background_4_0= Background ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Background) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCircleciParser.g:1225:5: (lv_background_4_0= Background )
                    {
                    // InternalCircleciParser.g:1225:5: (lv_background_4_0= Background )
                    // InternalCircleciParser.g:1226:6: lv_background_4_0= Background
                    {
                    lv_background_4_0=(Token)match(input,Background,FOLLOW_31); 

                    						newLeafNode(lv_background_4_0, grammarAccess.getRunAccess().getBackgroundBackgroundKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunRule());
                    						}
                    						setWithLastConsumed(current, "background", lv_background_4_0 != null, "background");
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1238:4: (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==When) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCircleciParser.g:1239:5: otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) )
                    {
                    otherlv_5=(Token)match(input,When,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getRunAccess().getWhenKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:1243:5: ( (lv_when_6_0= ruleWHEN_TYPE ) )
                    // InternalCircleciParser.g:1244:6: (lv_when_6_0= ruleWHEN_TYPE )
                    {
                    // InternalCircleciParser.g:1244:6: (lv_when_6_0= ruleWHEN_TYPE )
                    // InternalCircleciParser.g:1245:7: lv_when_6_0= ruleWHEN_TYPE
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getWhenWHEN_TYPEEnumRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_when_6_0=ruleWHEN_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRunRule());
                    							}
                    							set(
                    								current,
                    								"when",
                    								lv_when_6_0,
                    								"org.xtext.example.circleci.Circleci.WHEN_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1263:4: (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Working_directory) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCircleciParser.g:1264:5: otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getRunAccess().getWorking_directoryKeyword_1_4_0());
                    				
                    // InternalCircleciParser.g:1268:5: ( (lv_working_directory_8_0= ruleEString ) )
                    // InternalCircleciParser.g:1269:6: (lv_working_directory_8_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1269:6: (lv_working_directory_8_0= ruleEString )
                    // InternalCircleciParser.g:1270:7: lv_working_directory_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getWorking_directoryEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_working_directory_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRunRule());
                    							}
                    							set(
                    								current,
                    								"working_directory",
                    								lv_working_directory_8_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1288:4: (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==No_output_timeout) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCircleciParser.g:1289:5: otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,No_output_timeout,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getRunAccess().getNo_output_timeoutKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:1293:5: ( (lv_no_output_timeout_10_0= ruleEString ) )
                    // InternalCircleciParser.g:1294:6: (lv_no_output_timeout_10_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1294:6: (lv_no_output_timeout_10_0= ruleEString )
                    // InternalCircleciParser.g:1295:7: lv_no_output_timeout_10_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getNo_output_timeoutEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_no_output_timeout_10_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRunRule());
                    							}
                    							set(
                    								current,
                    								"no_output_timeout",
                    								lv_no_output_timeout_10_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1313:4: (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Shell) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCircleciParser.g:1314:5: otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getRunAccess().getShellKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:1318:5: ( (lv_shell_12_0= ruleEString ) )
                    // InternalCircleciParser.g:1319:6: (lv_shell_12_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1319:6: (lv_shell_12_0= ruleEString )
                    // InternalCircleciParser.g:1320:7: lv_shell_12_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getShellEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_shell_12_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRunRule());
                    							}
                    							set(
                    								current,
                    								"shell",
                    								lv_shell_12_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1338:4: ( (lv_environments_13_0= ruleEnvironment ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Environment) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCircleciParser.g:1339:5: (lv_environments_13_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:1339:5: (lv_environments_13_0= ruleEnvironment )
            	    // InternalCircleciParser.g:1340:6: lv_environments_13_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getEnvironmentsEnvironmentParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_environments_13_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRunRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_13_0,
            	    							"org.xtext.example.circleci.Circleci.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalCircleciParser.g:1357:4: ( (lv_run_commands_14_0= ruleRunCommand ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RunCommand) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalCircleciParser.g:1358:5: (lv_run_commands_14_0= ruleRunCommand )
            	    {
            	    // InternalCircleciParser.g:1358:5: (lv_run_commands_14_0= ruleRunCommand )
            	    // InternalCircleciParser.g:1359:6: lv_run_commands_14_0= ruleRunCommand
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getRun_commandsRunCommandParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_run_commands_14_0=ruleRunCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRunRule());
            	    						}
            	    						add(
            	    							current,
            	    							"run_commands",
            	    							lv_run_commands_14_0,
            	    							"org.xtext.example.circleci.Circleci.RunCommand");
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

            // InternalCircleciParser.g:1376:4: ( (lv_parameters_15_0= ruleParameters ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Parameters) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCircleciParser.g:1377:5: (lv_parameters_15_0= ruleParameters )
            	    {
            	    // InternalCircleciParser.g:1377:5: (lv_parameters_15_0= ruleParameters )
            	    // InternalCircleciParser.g:1378:6: lv_parameters_15_0= ruleParameters
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getParametersParametersParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_parameters_15_0=ruleParameters();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRunRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_15_0,
            	    							"org.xtext.example.circleci.Circleci.Parameters");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_16, grammarAccess.getRunAccess().getENDTerminalRuleCall_1_10());
            			

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
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleRestoreCache"
    // InternalCircleciParser.g:1404:1: entryRuleRestoreCache returns [EObject current=null] : iv_ruleRestoreCache= ruleRestoreCache EOF ;
    public final EObject entryRuleRestoreCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestoreCache = null;


        try {
            // InternalCircleciParser.g:1404:53: (iv_ruleRestoreCache= ruleRestoreCache EOF )
            // InternalCircleciParser.g:1405:2: iv_ruleRestoreCache= ruleRestoreCache EOF
            {
             newCompositeNode(grammarAccess.getRestoreCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestoreCache=ruleRestoreCache();

            state._fsp--;

             current =iv_ruleRestoreCache; 
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
    // $ANTLR end "entryRuleRestoreCache"


    // $ANTLR start "ruleRestoreCache"
    // InternalCircleciParser.g:1411:1: ruleRestoreCache returns [EObject current=null] : ( () otherlv_1= RestoreCache (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END ) ) ;
    public final EObject ruleRestoreCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_key_6_0 = null;

        AntlrDatatypeRuleToken lv_keys_8_0 = null;

        AntlrDatatypeRuleToken lv_keys_10_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1417:2: ( ( () otherlv_1= RestoreCache (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END ) ) )
            // InternalCircleciParser.g:1418:2: ( () otherlv_1= RestoreCache (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END ) )
            {
            // InternalCircleciParser.g:1418:2: ( () otherlv_1= RestoreCache (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END ) )
            // InternalCircleciParser.g:1419:3: () otherlv_1= RestoreCache (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END )
            {
            // InternalCircleciParser.g:1419:3: ()
            // InternalCircleciParser.g:1420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestoreCacheAccess().getRestoreCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RestoreCache,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestoreCacheAccess().getRestoreCacheKeyword_1());
            		
            // InternalCircleciParser.g:1430:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END )
            // InternalCircleciParser.g:1431:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )? (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )? this_END_11= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getRestoreCacheAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCircleciParser.g:1435:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Name) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCircleciParser.g:1436:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getRestoreCacheAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCircleciParser.g:1440:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCircleciParser.g:1441:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1441:6: (lv_name_4_0= ruleEString )
                    // InternalCircleciParser.g:1442:7: lv_name_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRestoreCacheAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_36);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1460:4: (otherlv_5= Key ( (lv_key_6_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Key) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCircleciParser.g:1461:5: otherlv_5= Key ( (lv_key_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Key,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getRestoreCacheAccess().getKeyKeyword_2_2_0());
                    				
                    // InternalCircleciParser.g:1465:5: ( (lv_key_6_0= ruleEString ) )
                    // InternalCircleciParser.g:1466:6: (lv_key_6_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1466:6: (lv_key_6_0= ruleEString )
                    // InternalCircleciParser.g:1467:7: lv_key_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeyEStringParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_37);
                    lv_key_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
                    							}
                    							set(
                    								current,
                    								"key",
                    								lv_key_6_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1485:4: (otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Keys) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCircleciParser.g:1486:5: otherlv_7= Keys ( (lv_keys_8_0= ruleEString ) ) (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,Keys,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getRestoreCacheAccess().getKeysKeyword_2_3_0());
                    				
                    // InternalCircleciParser.g:1490:5: ( (lv_keys_8_0= ruleEString ) )
                    // InternalCircleciParser.g:1491:6: (lv_keys_8_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1491:6: (lv_keys_8_0= ruleEString )
                    // InternalCircleciParser.g:1492:7: lv_keys_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeysEStringParserRuleCall_2_3_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_keys_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
                    							}
                    							add(
                    								current,
                    								"keys",
                    								lv_keys_8_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:1509:5: (otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==Comma) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalCircleciParser.g:1510:6: otherlv_9= Comma ( (lv_keys_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getRestoreCacheAccess().getCommaKeyword_2_3_2_0());
                    	    					
                    	    // InternalCircleciParser.g:1514:6: ( (lv_keys_10_0= ruleEString ) )
                    	    // InternalCircleciParser.g:1515:7: (lv_keys_10_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:1515:7: (lv_keys_10_0= ruleEString )
                    	    // InternalCircleciParser.g:1516:8: lv_keys_10_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeysEStringParserRuleCall_2_3_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_30);
                    	    lv_keys_10_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"keys",
                    	    									lv_keys_10_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_11, grammarAccess.getRestoreCacheAccess().getENDTerminalRuleCall_2_4());
            			

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
    // $ANTLR end "ruleRestoreCache"


    // $ANTLR start "entryRulePersistToWorkspace"
    // InternalCircleciParser.g:1544:1: entryRulePersistToWorkspace returns [EObject current=null] : iv_rulePersistToWorkspace= rulePersistToWorkspace EOF ;
    public final EObject entryRulePersistToWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistToWorkspace = null;


        try {
            // InternalCircleciParser.g:1544:59: (iv_rulePersistToWorkspace= rulePersistToWorkspace EOF )
            // InternalCircleciParser.g:1545:2: iv_rulePersistToWorkspace= rulePersistToWorkspace EOF
            {
             newCompositeNode(grammarAccess.getPersistToWorkspaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistToWorkspace=rulePersistToWorkspace();

            state._fsp--;

             current =iv_rulePersistToWorkspace; 
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
    // $ANTLR end "entryRulePersistToWorkspace"


    // $ANTLR start "rulePersistToWorkspace"
    // InternalCircleciParser.g:1551:1: rulePersistToWorkspace returns [EObject current=null] : (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) ;
    public final EObject rulePersistToWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_root_5_0 = null;

        AntlrDatatypeRuleToken lv_paths_7_0 = null;

        AntlrDatatypeRuleToken lv_paths_9_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1557:2: ( (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) )
            // InternalCircleciParser.g:1558:2: (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            {
            // InternalCircleciParser.g:1558:2: (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            // InternalCircleciParser.g:1559:3: otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,PersistToWorkspace,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistToWorkspaceAccess().getPersistToWorkspaceKeyword_0());
            		
            // InternalCircleciParser.g:1563:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            // InternalCircleciParser.g:1564:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPersistToWorkspaceAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1568:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Name) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCircleciParser.g:1569:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getPersistToWorkspaceAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1573:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1574:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1574:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1575:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_39);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPersistToWorkspaceRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Root,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getPersistToWorkspaceAccess().getRootKeyword_1_2());
            			
            // InternalCircleciParser.g:1597:4: ( (lv_root_5_0= ruleEString ) )
            // InternalCircleciParser.g:1598:5: (lv_root_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1598:5: (lv_root_5_0= ruleEString )
            // InternalCircleciParser.g:1599:6: lv_root_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getRootEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_40);
            lv_root_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPersistToWorkspaceRule());
            						}
            						set(
            							current,
            							"root",
            							lv_root_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,Paths,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getPersistToWorkspaceAccess().getPathsKeyword_1_4());
            			
            // InternalCircleciParser.g:1620:4: ( (lv_paths_7_0= ruleEString ) )
            // InternalCircleciParser.g:1621:5: (lv_paths_7_0= ruleEString )
            {
            // InternalCircleciParser.g:1621:5: (lv_paths_7_0= ruleEString )
            // InternalCircleciParser.g:1622:6: lv_paths_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getPathsEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_30);
            lv_paths_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPersistToWorkspaceRule());
            						}
            						add(
            							current,
            							"paths",
            							lv_paths_7_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:1639:4: (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Comma) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCircleciParser.g:1640:5: otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getPersistToWorkspaceAccess().getCommaKeyword_1_6_0());
            	    				
            	    // InternalCircleciParser.g:1644:5: ( (lv_paths_9_0= ruleEString ) )
            	    // InternalCircleciParser.g:1645:6: (lv_paths_9_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:1645:6: (lv_paths_9_0= ruleEString )
            	    // InternalCircleciParser.g:1646:7: lv_paths_9_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getPathsEStringParserRuleCall_1_6_1_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_paths_9_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPersistToWorkspaceRule());
            	    							}
            	    							add(
            	    								current,
            	    								"paths",
            	    								lv_paths_9_0,
            	    								"org.xtext.example.circleci.Circleci.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_10, grammarAccess.getPersistToWorkspaceAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "rulePersistToWorkspace"


    // $ANTLR start "entryRuleStoreArtifact"
    // InternalCircleciParser.g:1673:1: entryRuleStoreArtifact returns [EObject current=null] : iv_ruleStoreArtifact= ruleStoreArtifact EOF ;
    public final EObject entryRuleStoreArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreArtifact = null;


        try {
            // InternalCircleciParser.g:1673:54: (iv_ruleStoreArtifact= ruleStoreArtifact EOF )
            // InternalCircleciParser.g:1674:2: iv_ruleStoreArtifact= ruleStoreArtifact EOF
            {
             newCompositeNode(grammarAccess.getStoreArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreArtifact=ruleStoreArtifact();

            state._fsp--;

             current =iv_ruleStoreArtifact; 
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
    // $ANTLR end "entryRuleStoreArtifact"


    // $ANTLR start "ruleStoreArtifact"
    // InternalCircleciParser.g:1680:1: ruleStoreArtifact returns [EObject current=null] : (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) ;
    public final EObject ruleStoreArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;

        AntlrDatatypeRuleToken lv_destination_7_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1686:2: ( (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:1687:2: (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:1687:2: (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            // InternalCircleciParser.g:1688:3: otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,StoreArtifact,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreArtifactAccess().getStoreArtifactKeyword_0());
            		
            // InternalCircleciParser.g:1692:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            // InternalCircleciParser.g:1693:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStoreArtifactAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1697:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Name) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCircleciParser.g:1698:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getStoreArtifactAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1702:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1703:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1703:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1704:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getStoreArtifactAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStoreArtifactRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Path,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getStoreArtifactAccess().getPathKeyword_1_2());
            			
            // InternalCircleciParser.g:1726:4: ( (lv_path_5_0= ruleEString ) )
            // InternalCircleciParser.g:1727:5: (lv_path_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1727:5: (lv_path_5_0= ruleEString )
            // InternalCircleciParser.g:1728:6: lv_path_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStoreArtifactAccess().getPathEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_43);
            lv_path_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStoreArtifactRule());
            						}
            						set(
            							current,
            							"path",
            							lv_path_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:1745:4: (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Destination) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCircleciParser.g:1746:5: otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Destination,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getStoreArtifactAccess().getDestinationKeyword_1_4_0());
                    				
                    // InternalCircleciParser.g:1750:5: ( (lv_destination_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1751:6: (lv_destination_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1751:6: (lv_destination_7_0= ruleEString )
                    // InternalCircleciParser.g:1752:7: lv_destination_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getStoreArtifactAccess().getDestinationEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_destination_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStoreArtifactRule());
                    							}
                    							set(
                    								current,
                    								"destination",
                    								lv_destination_7_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getStoreArtifactAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleStoreArtifact"


    // $ANTLR start "entryRuleStoreTestResults"
    // InternalCircleciParser.g:1779:1: entryRuleStoreTestResults returns [EObject current=null] : iv_ruleStoreTestResults= ruleStoreTestResults EOF ;
    public final EObject entryRuleStoreTestResults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreTestResults = null;


        try {
            // InternalCircleciParser.g:1779:57: (iv_ruleStoreTestResults= ruleStoreTestResults EOF )
            // InternalCircleciParser.g:1780:2: iv_ruleStoreTestResults= ruleStoreTestResults EOF
            {
             newCompositeNode(grammarAccess.getStoreTestResultsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreTestResults=ruleStoreTestResults();

            state._fsp--;

             current =iv_ruleStoreTestResults; 
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
    // $ANTLR end "entryRuleStoreTestResults"


    // $ANTLR start "ruleStoreTestResults"
    // InternalCircleciParser.g:1786:1: ruleStoreTestResults returns [EObject current=null] : (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleStoreTestResults() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1792:2: ( (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:1793:2: (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:1793:2: (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:1794:3: otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,StoreTestResults,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreTestResultsAccess().getStoreTestResultsKeyword_0());
            		
            // InternalCircleciParser.g:1798:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:1799:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStoreTestResultsAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1803:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Name) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCircleciParser.g:1804:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getStoreTestResultsAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1808:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1809:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1809:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1810:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getStoreTestResultsAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStoreTestResultsRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Path,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getStoreTestResultsAccess().getPathKeyword_1_2());
            			
            // InternalCircleciParser.g:1832:4: ( (lv_path_5_0= ruleEString ) )
            // InternalCircleciParser.g:1833:5: (lv_path_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1833:5: (lv_path_5_0= ruleEString )
            // InternalCircleciParser.g:1834:6: lv_path_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStoreTestResultsAccess().getPathEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_7);
            lv_path_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStoreTestResultsRule());
            						}
            						set(
            							current,
            							"path",
            							lv_path_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getStoreTestResultsAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleStoreTestResults"


    // $ANTLR start "entryRuleSetupRemoteDocker"
    // InternalCircleciParser.g:1860:1: entryRuleSetupRemoteDocker returns [EObject current=null] : iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF ;
    public final EObject entryRuleSetupRemoteDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetupRemoteDocker = null;


        try {
            // InternalCircleciParser.g:1860:58: (iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF )
            // InternalCircleciParser.g:1861:2: iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF
            {
             newCompositeNode(grammarAccess.getSetupRemoteDockerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetupRemoteDocker=ruleSetupRemoteDocker();

            state._fsp--;

             current =iv_ruleSetupRemoteDocker; 
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
    // $ANTLR end "entryRuleSetupRemoteDocker"


    // $ANTLR start "ruleSetupRemoteDocker"
    // InternalCircleciParser.g:1867:1: ruleSetupRemoteDocker returns [EObject current=null] : ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) ;
    public final EObject ruleSetupRemoteDocker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token lv_docker_layer_caching_5_0=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1873:2: ( ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:1874:2: ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:1874:2: ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            // InternalCircleciParser.g:1875:3: () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            {
            // InternalCircleciParser.g:1875:3: ()
            // InternalCircleciParser.g:1876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetupRemoteDockerAccess().getSetupRemoteDockerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SetupRemoteDocker,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetupRemoteDockerAccess().getSetupRemoteDockerKeyword_1());
            		
            // InternalCircleciParser.g:1886:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            // InternalCircleciParser.g:1887:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getSetupRemoteDockerAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCircleciParser.g:1891:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Name) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCircleciParser.g:1892:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getSetupRemoteDockerAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCircleciParser.g:1896:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCircleciParser.g:1897:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1897:6: (lv_name_4_0= ruleEString )
                    // InternalCircleciParser.g:1898:7: lv_name_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getSetupRemoteDockerAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_45);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSetupRemoteDockerRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1916:4: ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Docker_layer_caching) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCircleciParser.g:1917:5: (lv_docker_layer_caching_5_0= Docker_layer_caching )
                    {
                    // InternalCircleciParser.g:1917:5: (lv_docker_layer_caching_5_0= Docker_layer_caching )
                    // InternalCircleciParser.g:1918:6: lv_docker_layer_caching_5_0= Docker_layer_caching
                    {
                    lv_docker_layer_caching_5_0=(Token)match(input,Docker_layer_caching,FOLLOW_46); 

                    						newLeafNode(lv_docker_layer_caching_5_0, grammarAccess.getSetupRemoteDockerAccess().getDocker_layer_cachingDocker_layer_cachingKeyword_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetupRemoteDockerRule());
                    						}
                    						setWithLastConsumed(current, "docker_layer_caching", lv_docker_layer_caching_5_0 != null, "docker_layer_caching");
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1930:4: (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Version) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCircleciParser.g:1931:5: otherlv_6= Version ( (lv_version_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Version,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getSetupRemoteDockerAccess().getVersionKeyword_2_3_0());
                    				
                    // InternalCircleciParser.g:1935:5: ( (lv_version_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1936:6: (lv_version_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1936:6: (lv_version_7_0= ruleEString )
                    // InternalCircleciParser.g:1937:7: lv_version_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getSetupRemoteDockerAccess().getVersionEStringParserRuleCall_2_3_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_version_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSetupRemoteDockerRule());
                    							}
                    							set(
                    								current,
                    								"version",
                    								lv_version_7_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getSetupRemoteDockerAccess().getENDTerminalRuleCall_2_4());
            			

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
    // $ANTLR end "ruleSetupRemoteDocker"


    // $ANTLR start "entryRuleAddSSHKeys"
    // InternalCircleciParser.g:1964:1: entryRuleAddSSHKeys returns [EObject current=null] : iv_ruleAddSSHKeys= ruleAddSSHKeys EOF ;
    public final EObject entryRuleAddSSHKeys() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSSHKeys = null;


        try {
            // InternalCircleciParser.g:1964:51: (iv_ruleAddSSHKeys= ruleAddSSHKeys EOF )
            // InternalCircleciParser.g:1965:2: iv_ruleAddSSHKeys= ruleAddSSHKeys EOF
            {
             newCompositeNode(grammarAccess.getAddSSHKeysRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddSSHKeys=ruleAddSSHKeys();

            state._fsp--;

             current =iv_ruleAddSSHKeys; 
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
    // $ANTLR end "entryRuleAddSSHKeys"


    // $ANTLR start "ruleAddSSHKeys"
    // InternalCircleciParser.g:1971:1: ruleAddSSHKeys returns [EObject current=null] : ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) ) ;
    public final EObject ruleAddSSHKeys() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_fingerprints_6_0 = null;

        AntlrDatatypeRuleToken lv_fingerprints_8_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1977:2: ( ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) ) )
            // InternalCircleciParser.g:1978:2: ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) )
            {
            // InternalCircleciParser.g:1978:2: ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) )
            // InternalCircleciParser.g:1979:3: () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END )
            {
            // InternalCircleciParser.g:1979:3: ()
            // InternalCircleciParser.g:1980:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddSSHKeysAccess().getAddSSHKeysAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,AddSSHKeys,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAddSSHKeysAccess().getAddSSHKeysKeyword_1());
            		
            // InternalCircleciParser.g:1990:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END )
            // InternalCircleciParser.g:1991:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getAddSSHKeysAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCircleciParser.g:1995:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Name) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCircleciParser.g:1996:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getAddSSHKeysAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCircleciParser.g:2000:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCircleciParser.g:2001:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2001:6: (lv_name_4_0= ruleEString )
                    // InternalCircleciParser.g:2002:7: lv_name_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAddSSHKeysAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_48);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAddSSHKeysRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:2020:4: (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Fingerprints) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCircleciParser.g:2021:5: otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) )
                    {
                    otherlv_5=(Token)match(input,Fingerprints,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getAddSSHKeysAccess().getFingerprintsKeyword_2_2_0());
                    				
                    // InternalCircleciParser.g:2025:5: ( (lv_fingerprints_6_0= ruleEString ) )
                    // InternalCircleciParser.g:2026:6: (lv_fingerprints_6_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2026:6: (lv_fingerprints_6_0= ruleEString )
                    // InternalCircleciParser.g:2027:7: lv_fingerprints_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAddSSHKeysAccess().getFingerprintsEStringParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_49);
                    lv_fingerprints_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAddSSHKeysRule());
                    							}
                    							add(
                    								current,
                    								"fingerprints",
                    								lv_fingerprints_6_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:2044:5: (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) )
                    // InternalCircleciParser.g:2045:6: otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Comma,FOLLOW_6); 

                    						newLeafNode(otherlv_7, grammarAccess.getAddSSHKeysAccess().getCommaKeyword_2_2_2_0());
                    					
                    // InternalCircleciParser.g:2049:6: ( (lv_fingerprints_8_0= ruleEString ) )
                    // InternalCircleciParser.g:2050:7: (lv_fingerprints_8_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2050:7: (lv_fingerprints_8_0= ruleEString )
                    // InternalCircleciParser.g:2051:8: lv_fingerprints_8_0= ruleEString
                    {

                    								newCompositeNode(grammarAccess.getAddSSHKeysAccess().getFingerprintsEStringParserRuleCall_2_2_2_1_0());
                    							
                    pushFollow(FOLLOW_7);
                    lv_fingerprints_8_0=ruleEString();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getAddSSHKeysRule());
                    								}
                    								add(
                    									current,
                    									"fingerprints",
                    									lv_fingerprints_8_0,
                    									"org.xtext.example.circleci.Circleci.EString");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;

            }

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_9, grammarAccess.getAddSSHKeysAccess().getENDTerminalRuleCall_2_3());
            			

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
    // $ANTLR end "ruleAddSSHKeys"


    // $ANTLR start "entryRuleSaveCache"
    // InternalCircleciParser.g:2079:1: entryRuleSaveCache returns [EObject current=null] : iv_ruleSaveCache= ruleSaveCache EOF ;
    public final EObject entryRuleSaveCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaveCache = null;


        try {
            // InternalCircleciParser.g:2079:50: (iv_ruleSaveCache= ruleSaveCache EOF )
            // InternalCircleciParser.g:2080:2: iv_ruleSaveCache= ruleSaveCache EOF
            {
             newCompositeNode(grammarAccess.getSaveCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaveCache=ruleSaveCache();

            state._fsp--;

             current =iv_ruleSaveCache; 
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
    // $ANTLR end "entryRuleSaveCache"


    // $ANTLR start "ruleSaveCache"
    // InternalCircleciParser.g:2086:1: ruleSaveCache returns [EObject current=null] : (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) ) ;
    public final EObject ruleSaveCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_paths_5_0 = null;

        AntlrDatatypeRuleToken lv_paths_7_0 = null;

        AntlrDatatypeRuleToken lv_key_9_0 = null;

        Enumerator lv_when_11_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2092:2: ( (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:2093:2: (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:2093:2: (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) )
            // InternalCircleciParser.g:2094:3: otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,SaveCache,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveCacheAccess().getSaveCacheKeyword_0());
            		
            // InternalCircleciParser.g:2098:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END )
            // InternalCircleciParser.g:2099:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getSaveCacheAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2103:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Name) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCircleciParser.g:2104:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getSaveCacheAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2108:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2109:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2109:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2110:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getSaveCacheAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSaveCacheRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Paths,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getSaveCacheAccess().getPathsKeyword_1_2());
            			
            // InternalCircleciParser.g:2132:4: ( (lv_paths_5_0= ruleEString ) )
            // InternalCircleciParser.g:2133:5: (lv_paths_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2133:5: (lv_paths_5_0= ruleEString )
            // InternalCircleciParser.g:2134:6: lv_paths_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getSaveCacheAccess().getPathsEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_51);
            lv_paths_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSaveCacheRule());
            						}
            						add(
            							current,
            							"paths",
            							lv_paths_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:2151:4: (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalCircleciParser.g:2152:5: otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSaveCacheAccess().getCommaKeyword_1_4_0());
            	    				
            	    // InternalCircleciParser.g:2156:5: ( (lv_paths_7_0= ruleEString ) )
            	    // InternalCircleciParser.g:2157:6: (lv_paths_7_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:2157:6: (lv_paths_7_0= ruleEString )
            	    // InternalCircleciParser.g:2158:7: lv_paths_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getSaveCacheAccess().getPathsEStringParserRuleCall_1_4_1_0());
            	    						
            	    pushFollow(FOLLOW_51);
            	    lv_paths_7_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSaveCacheRule());
            	    							}
            	    							add(
            	    								current,
            	    								"paths",
            	    								lv_paths_7_0,
            	    								"org.xtext.example.circleci.Circleci.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_8=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getSaveCacheAccess().getKeyKeyword_1_5());
            			
            // InternalCircleciParser.g:2180:4: ( (lv_key_9_0= ruleEString ) )
            // InternalCircleciParser.g:2181:5: (lv_key_9_0= ruleEString )
            {
            // InternalCircleciParser.g:2181:5: (lv_key_9_0= ruleEString )
            // InternalCircleciParser.g:2182:6: lv_key_9_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getSaveCacheAccess().getKeyEStringParserRuleCall_1_6_0());
            					
            pushFollow(FOLLOW_52);
            lv_key_9_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSaveCacheRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_9_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:2199:4: (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==When) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCircleciParser.g:2200:5: otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) )
                    {
                    otherlv_10=(Token)match(input,When,FOLLOW_32); 

                    					newLeafNode(otherlv_10, grammarAccess.getSaveCacheAccess().getWhenKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:2204:5: ( (lv_when_11_0= ruleWHEN_TYPE ) )
                    // InternalCircleciParser.g:2205:6: (lv_when_11_0= ruleWHEN_TYPE )
                    {
                    // InternalCircleciParser.g:2205:6: (lv_when_11_0= ruleWHEN_TYPE )
                    // InternalCircleciParser.g:2206:7: lv_when_11_0= ruleWHEN_TYPE
                    {

                    							newCompositeNode(grammarAccess.getSaveCacheAccess().getWhenWHEN_TYPEEnumRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_when_11_0=ruleWHEN_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSaveCacheRule());
                    							}
                    							set(
                    								current,
                    								"when",
                    								lv_when_11_0,
                    								"org.xtext.example.circleci.Circleci.WHEN_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_12, grammarAccess.getSaveCacheAccess().getENDTerminalRuleCall_1_8());
            			

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
    // $ANTLR end "ruleSaveCache"


    // $ANTLR start "entryRuleAttachWorkspace"
    // InternalCircleciParser.g:2233:1: entryRuleAttachWorkspace returns [EObject current=null] : iv_ruleAttachWorkspace= ruleAttachWorkspace EOF ;
    public final EObject entryRuleAttachWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachWorkspace = null;


        try {
            // InternalCircleciParser.g:2233:56: (iv_ruleAttachWorkspace= ruleAttachWorkspace EOF )
            // InternalCircleciParser.g:2234:2: iv_ruleAttachWorkspace= ruleAttachWorkspace EOF
            {
             newCompositeNode(grammarAccess.getAttachWorkspaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttachWorkspace=ruleAttachWorkspace();

            state._fsp--;

             current =iv_ruleAttachWorkspace; 
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
    // $ANTLR end "entryRuleAttachWorkspace"


    // $ANTLR start "ruleAttachWorkspace"
    // InternalCircleciParser.g:2240:1: ruleAttachWorkspace returns [EObject current=null] : (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleAttachWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_at_5_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2246:2: ( (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2247:2: (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2247:2: (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2248:3: otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,AttachWorkspace,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttachWorkspaceAccess().getAttachWorkspaceKeyword_0());
            		
            // InternalCircleciParser.g:2252:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2253:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getAttachWorkspaceAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2257:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Name) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCircleciParser.g:2258:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getAttachWorkspaceAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2262:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2263:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2263:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2264:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttachWorkspaceAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_54);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAttachWorkspaceRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,At,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getAttachWorkspaceAccess().getAtKeyword_1_2());
            			
            // InternalCircleciParser.g:2286:4: ( (lv_at_5_0= ruleEString ) )
            // InternalCircleciParser.g:2287:5: (lv_at_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2287:5: (lv_at_5_0= ruleEString )
            // InternalCircleciParser.g:2288:6: lv_at_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAttachWorkspaceAccess().getAtEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_7);
            lv_at_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAttachWorkspaceRule());
            						}
            						set(
            							current,
            							"at",
            							lv_at_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getAttachWorkspaceAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleAttachWorkspace"


    // $ANTLR start "entryRuleWhen_Unless"
    // InternalCircleciParser.g:2314:1: entryRuleWhen_Unless returns [EObject current=null] : iv_ruleWhen_Unless= ruleWhen_Unless EOF ;
    public final EObject entryRuleWhen_Unless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen_Unless = null;


        try {
            // InternalCircleciParser.g:2314:52: (iv_ruleWhen_Unless= ruleWhen_Unless EOF )
            // InternalCircleciParser.g:2315:2: iv_ruleWhen_Unless= ruleWhen_Unless EOF
            {
             newCompositeNode(grammarAccess.getWhen_UnlessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen_Unless=ruleWhen_Unless();

            state._fsp--;

             current =iv_ruleWhen_Unless; 
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
    // $ANTLR end "entryRuleWhen_Unless"


    // $ANTLR start "ruleWhen_Unless"
    // InternalCircleciParser.g:2321:1: ruleWhen_Unless returns [EObject current=null] : (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) ) ;
    public final EObject ruleWhen_Unless() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_when_step_8_0 = null;

        EObject lv_unless_step_12_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2327:2: ( (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:2328:2: (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:2328:2: (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) )
            // InternalCircleciParser.g:2329:3: otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,When_Unless,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWhen_UnlessAccess().getWhen_UnlessKeyword_0());
            		
            // InternalCircleciParser.g:2333:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END )
            // InternalCircleciParser.g:2334:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2338:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Name) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCircleciParser.g:2339:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getWhen_UnlessAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2343:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2344:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2344:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2345:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getWhen_UnlessAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_56);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getWhen_UnlessRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Condition,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getWhen_UnlessAccess().getConditionKeyword_1_2());
            			
            // InternalCircleciParser.g:2367:4: ( (lv_condition_5_0= ruleEString ) )
            // InternalCircleciParser.g:2368:5: (lv_condition_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2368:5: (lv_condition_5_0= ruleEString )
            // InternalCircleciParser.g:2369:6: lv_condition_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWhen_UnlessAccess().getConditionEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_57);
            lv_condition_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWhen_UnlessRule());
            						}
            						set(
            							current,
            							"condition",
            							lv_condition_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,When_step,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getWhen_UnlessAccess().getWhen_stepKeyword_1_4());
            			
            // InternalCircleciParser.g:2390:4: (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END )
            // InternalCircleciParser.g:2391:5: this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END
            {
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            					newLeafNode(this_BEGIN_7, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_5_0());
            				
            // InternalCircleciParser.g:2395:5: ( (lv_when_step_8_0= ruleStep ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=PersistToWorkspace && LA64_0<=SetupRemoteDocker)||(LA64_0>=StoreTestResults && LA64_0<=AttachWorkspace)||LA64_0==StoreArtifact||LA64_0==RestoreCache||LA64_0==When_Unless||LA64_0==AddSSHKeys||LA64_0==SaveCache||LA64_0==Checkout||LA64_0==Run) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalCircleciParser.g:2396:6: (lv_when_step_8_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:2396:6: (lv_when_step_8_0= ruleStep )
            	    // InternalCircleciParser.g:2397:7: lv_when_step_8_0= ruleStep
            	    {

            	    							newCompositeNode(grammarAccess.getWhen_UnlessAccess().getWhen_stepStepParserRuleCall_1_5_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
            	    lv_when_step_8_0=ruleStep();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getWhen_UnlessRule());
            	    							}
            	    							add(
            	    								current,
            	    								"when_step",
            	    								lv_when_step_8_0,
            	    								"org.xtext.example.circleci.Circleci.Step");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_58); 

            					newLeafNode(this_END_9, grammarAccess.getWhen_UnlessAccess().getENDTerminalRuleCall_1_5_2());
            				

            }

            // InternalCircleciParser.g:2419:4: (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Unless_step) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCircleciParser.g:2420:5: otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END )
                    {
                    otherlv_10=(Token)match(input,Unless_step,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getWhen_UnlessAccess().getUnless_stepKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:2424:5: (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END )
                    // InternalCircleciParser.g:2425:6: this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END
                    {
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

                    						newLeafNode(this_BEGIN_11, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_6_1_0());
                    					
                    // InternalCircleciParser.g:2429:6: ( (lv_unless_step_12_0= ruleStep ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=PersistToWorkspace && LA65_0<=SetupRemoteDocker)||(LA65_0>=StoreTestResults && LA65_0<=AttachWorkspace)||LA65_0==StoreArtifact||LA65_0==RestoreCache||LA65_0==When_Unless||LA65_0==AddSSHKeys||LA65_0==SaveCache||LA65_0==Checkout||LA65_0==Run) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalCircleciParser.g:2430:7: (lv_unless_step_12_0= ruleStep )
                    	    {
                    	    // InternalCircleciParser.g:2430:7: (lv_unless_step_12_0= ruleStep )
                    	    // InternalCircleciParser.g:2431:8: lv_unless_step_12_0= ruleStep
                    	    {

                    	    								newCompositeNode(grammarAccess.getWhen_UnlessAccess().getUnless_stepStepParserRuleCall_1_6_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_17);
                    	    lv_unless_step_12_0=ruleStep();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getWhen_UnlessRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"unless_step",
                    	    									lv_unless_step_12_0,
                    	    									"org.xtext.example.circleci.Circleci.Step");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_7); 

                    						newLeafNode(this_END_13, grammarAccess.getWhen_UnlessAccess().getENDTerminalRuleCall_1_6_1_2());
                    					

                    }


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getWhen_UnlessAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "ruleWhen_Unless"


    // $ANTLR start "entryRuleCheckout"
    // InternalCircleciParser.g:2463:1: entryRuleCheckout returns [EObject current=null] : iv_ruleCheckout= ruleCheckout EOF ;
    public final EObject entryRuleCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckout = null;


        try {
            // InternalCircleciParser.g:2463:49: (iv_ruleCheckout= ruleCheckout EOF )
            // InternalCircleciParser.g:2464:2: iv_ruleCheckout= ruleCheckout EOF
            {
             newCompositeNode(grammarAccess.getCheckoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckout=ruleCheckout();

            state._fsp--;

             current =iv_ruleCheckout; 
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
    // $ANTLR end "entryRuleCheckout"


    // $ANTLR start "ruleCheckout"
    // InternalCircleciParser.g:2470:1: ruleCheckout returns [EObject current=null] : ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? ) ;
    public final EObject ruleCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_path_6_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2476:2: ( ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? ) )
            // InternalCircleciParser.g:2477:2: ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? )
            {
            // InternalCircleciParser.g:2477:2: ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? )
            // InternalCircleciParser.g:2478:3: () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )?
            {
            // InternalCircleciParser.g:2478:3: ()
            // InternalCircleciParser.g:2479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckoutAccess().getCheckoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Checkout,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckoutAccess().getCheckoutKeyword_1());
            		
            // InternalCircleciParser.g:2489:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_BEGIN) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCircleciParser.g:2490:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getCheckoutAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalCircleciParser.g:2494:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==Name) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalCircleciParser.g:2495:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getCheckoutAccess().getNameKeyword_2_1_0());
                            				
                            // InternalCircleciParser.g:2499:5: ( (lv_name_4_0= ruleEString ) )
                            // InternalCircleciParser.g:2500:6: (lv_name_4_0= ruleEString )
                            {
                            // InternalCircleciParser.g:2500:6: (lv_name_4_0= ruleEString )
                            // InternalCircleciParser.g:2501:7: lv_name_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getCheckoutAccess().getNameEStringParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_61);
                            lv_name_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCheckoutRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"org.xtext.example.circleci.Circleci.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalCircleciParser.g:2519:4: (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==Path) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalCircleciParser.g:2520:5: otherlv_5= Path ( (lv_path_6_0= ruleEString ) )
                            {
                            otherlv_5=(Token)match(input,Path,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getCheckoutAccess().getPathKeyword_2_2_0());
                            				
                            // InternalCircleciParser.g:2524:5: ( (lv_path_6_0= ruleEString ) )
                            // InternalCircleciParser.g:2525:6: (lv_path_6_0= ruleEString )
                            {
                            // InternalCircleciParser.g:2525:6: (lv_path_6_0= ruleEString )
                            // InternalCircleciParser.g:2526:7: lv_path_6_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getCheckoutAccess().getPathEStringParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_path_6_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCheckoutRule());
                            							}
                            							set(
                            								current,
                            								"path",
                            								lv_path_6_0,
                            								"org.xtext.example.circleci.Circleci.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_7, grammarAccess.getCheckoutAccess().getENDTerminalRuleCall_2_3());
                    			

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
    // $ANTLR end "ruleCheckout"


    // $ANTLR start "entryRuleEnvironment"
    // InternalCircleciParser.g:2553:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCircleciParser.g:2553:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCircleciParser.g:2554:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalCircleciParser.g:2560:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2566:2: ( (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2567:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2567:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2568:3: otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalCircleciParser.g:2572:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2573:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEnvironmentAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:2581:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:2582:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2582:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:2583:6: lv_key_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_key_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getValueKeyword_1_3());
            			
            // InternalCircleciParser.g:2604:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCircleciParser.g:2605:5: (lv_value_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2605:5: (lv_value_5_0= ruleEString )
            // InternalCircleciParser.g:2606:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
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


    // $ANTLR start "entryRuleRunCommand"
    // InternalCircleciParser.g:2632:1: entryRuleRunCommand returns [EObject current=null] : iv_ruleRunCommand= ruleRunCommand EOF ;
    public final EObject entryRuleRunCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunCommand = null;


        try {
            // InternalCircleciParser.g:2632:51: (iv_ruleRunCommand= ruleRunCommand EOF )
            // InternalCircleciParser.g:2633:2: iv_ruleRunCommand= ruleRunCommand EOF
            {
             newCompositeNode(grammarAccess.getRunCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunCommand=ruleRunCommand();

            state._fsp--;

             current =iv_ruleRunCommand; 
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
    // $ANTLR end "entryRuleRunCommand"


    // $ANTLR start "ruleRunCommand"
    // InternalCircleciParser.g:2639:1: ruleRunCommand returns [EObject current=null] : ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleRunCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2645:2: ( ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            // InternalCircleciParser.g:2646:2: ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            {
            // InternalCircleciParser.g:2646:2: ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            // InternalCircleciParser.g:2647:3: () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            {
            // InternalCircleciParser.g:2647:3: ()
            // InternalCircleciParser.g:2648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunCommandAccess().getRunCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RunCommand,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRunCommandAccess().getRunCommandKeyword_1());
            		
            // InternalCircleciParser.g:2658:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalCircleciParser.g:2659:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getRunCommandAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getRunCommandAccess().getNameKeyword_2_1());
            			
            // InternalCircleciParser.g:2667:4: ( (lv_name_4_0= ruleEString ) )
            // InternalCircleciParser.g:2668:5: (lv_name_4_0= ruleEString )
            {
            // InternalCircleciParser.g:2668:5: (lv_name_4_0= ruleEString )
            // InternalCircleciParser.g:2669:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRunCommandAccess().getNameEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRunCommandRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_5, grammarAccess.getRunCommandAccess().getENDTerminalRuleCall_2_3());
            			

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
    // $ANTLR end "ruleRunCommand"


    // $ANTLR start "entryRuleParameters"
    // InternalCircleciParser.g:2695:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalCircleciParser.g:2695:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalCircleciParser.g:2696:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalCircleciParser.g:2702:1: ruleParameters returns [EObject current=null] : (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2708:2: ( (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCircleciParser.g:2709:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCircleciParser.g:2709:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCircleciParser.g:2710:3: otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Parameters,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getParametersKeyword_0());
            		
            // InternalCircleciParser.g:2714:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCircleciParser.g:2715:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getParametersAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Parameter_1,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getParameterKeyword_1_1());
            			
            // InternalCircleciParser.g:2723:4: ( (lv_parameter_3_0= ruleEString ) )
            // InternalCircleciParser.g:2724:5: (lv_parameter_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2724:5: (lv_parameter_3_0= ruleEString )
            // InternalCircleciParser.g:2725:6: lv_parameter_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getParametersAccess().getParameterEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_parameter_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getParametersRule());
            						}
            						set(
            							current,
            							"parameter",
            							lv_parameter_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
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


    // $ANTLR start "entryRuleTrigger"
    // InternalCircleciParser.g:2751:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalCircleciParser.g:2751:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalCircleciParser.g:2752:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalCircleciParser.g:2758:1: ruleTrigger returns [EObject current=null] : (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_cron_3_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2764:2: ( (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCircleciParser.g:2765:2: (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCircleciParser.g:2765:2: (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCircleciParser.g:2766:3: otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Trigger,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalCircleciParser.g:2770:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCircleciParser.g:2771:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_63); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTriggerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Cron,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getCronKeyword_1_1());
            			
            // InternalCircleciParser.g:2779:4: ( (lv_cron_3_0= ruleEString ) )
            // InternalCircleciParser.g:2780:5: (lv_cron_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2780:5: (lv_cron_3_0= ruleEString )
            // InternalCircleciParser.g:2781:6: lv_cron_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTriggerAccess().getCronEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_cron_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTriggerRule());
            						}
            						set(
            							current,
            							"cron",
            							lv_cron_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getTriggerAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleBranch"
    // InternalCircleciParser.g:2807:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCircleciParser.g:2807:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCircleciParser.g:2808:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalCircleciParser.g:2814:1: ruleBranch returns [EObject current=null] : (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_branch_5_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2820:2: ( (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2821:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2821:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2822:3: otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Branch,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            // InternalCircleciParser.g:2826:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2827:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBranchAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:2835:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:2836:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2836:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:2837:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBranchAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_64);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBranchRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Branch_1,FOLLOW_65); 

            				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getBranchKeyword_1_3());
            			
            // InternalCircleciParser.g:2858:4: ( (lv_branch_5_0= ruleBRANCH_TYPE ) )
            // InternalCircleciParser.g:2859:5: (lv_branch_5_0= ruleBRANCH_TYPE )
            {
            // InternalCircleciParser.g:2859:5: (lv_branch_5_0= ruleBRANCH_TYPE )
            // InternalCircleciParser.g:2860:6: lv_branch_5_0= ruleBRANCH_TYPE
            {

            						newCompositeNode(grammarAccess.getBranchAccess().getBranchBRANCH_TYPEEnumRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_7);
            lv_branch_5_0=ruleBRANCH_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBranchRule());
            						}
            						set(
            							current,
            							"branch",
            							lv_branch_5_0,
            							"org.xtext.example.circleci.Circleci.BRANCH_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getBranchAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleJobWorkflow"
    // InternalCircleciParser.g:2886:1: entryRuleJobWorkflow returns [EObject current=null] : iv_ruleJobWorkflow= ruleJobWorkflow EOF ;
    public final EObject entryRuleJobWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobWorkflow = null;


        try {
            // InternalCircleciParser.g:2886:52: (iv_ruleJobWorkflow= ruleJobWorkflow EOF )
            // InternalCircleciParser.g:2887:2: iv_ruleJobWorkflow= ruleJobWorkflow EOF
            {
             newCompositeNode(grammarAccess.getJobWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobWorkflow=ruleJobWorkflow();

            state._fsp--;

             current =iv_ruleJobWorkflow; 
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
    // $ANTLR end "entryRuleJobWorkflow"


    // $ANTLR start "ruleJobWorkflow"
    // InternalCircleciParser.g:2893:1: ruleJobWorkflow returns [EObject current=null] : ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) ) ;
    public final EObject ruleJobWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token lv_approvalJob_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_requires_7_0 = null;

        AntlrDatatypeRuleToken lv_requires_9_0 = null;

        AntlrDatatypeRuleToken lv_context_11_0 = null;

        AntlrDatatypeRuleToken lv_context_13_0 = null;

        EObject lv_branches_14_0 = null;

        EObject lv_matrix_15_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2899:2: ( ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) ) )
            // InternalCircleciParser.g:2900:2: ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) )
            {
            // InternalCircleciParser.g:2900:2: ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) )
            // InternalCircleciParser.g:2901:3: () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END )
            {
            // InternalCircleciParser.g:2901:3: ()
            // InternalCircleciParser.g:2902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJobWorkflowAccess().getJobWorkflowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,JobWorkflow,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJobWorkflowAccess().getJobWorkflowKeyword_1());
            		
            // InternalCircleciParser.g:2912:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END )
            // InternalCircleciParser.g:2913:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getJobWorkflowAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getJobWorkflowAccess().getNameKeyword_2_1());
            			
            // InternalCircleciParser.g:2921:4: ( (lv_name_4_0= ruleEString ) )
            // InternalCircleciParser.g:2922:5: (lv_name_4_0= ruleEString )
            {
            // InternalCircleciParser.g:2922:5: (lv_name_4_0= ruleEString )
            // InternalCircleciParser.g:2923:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getJobWorkflowAccess().getNameEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_66);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:2940:4: ( (lv_approvalJob_5_0= ApprovalJob ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ApprovalJob) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCircleciParser.g:2941:5: (lv_approvalJob_5_0= ApprovalJob )
                    {
                    // InternalCircleciParser.g:2941:5: (lv_approvalJob_5_0= ApprovalJob )
                    // InternalCircleciParser.g:2942:6: lv_approvalJob_5_0= ApprovalJob
                    {
                    lv_approvalJob_5_0=(Token)match(input,ApprovalJob,FOLLOW_67); 

                    						newLeafNode(lv_approvalJob_5_0, grammarAccess.getJobWorkflowAccess().getApprovalJobApprovalJobKeyword_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobWorkflowRule());
                    						}
                    						setWithLastConsumed(current, "approvalJob", lv_approvalJob_5_0 != null, "approvalJob");
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:2954:4: (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Requires) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCircleciParser.g:2955:5: otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,Requires,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getJobWorkflowAccess().getRequiresKeyword_2_4_0());
                    				
                    // InternalCircleciParser.g:2959:5: ( (lv_requires_7_0= ruleEString ) )
                    // InternalCircleciParser.g:2960:6: (lv_requires_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2960:6: (lv_requires_7_0= ruleEString )
                    // InternalCircleciParser.g:2961:7: lv_requires_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobWorkflowAccess().getRequiresEStringParserRuleCall_2_4_1_0());
                    						
                    pushFollow(FOLLOW_68);
                    lv_requires_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
                    							}
                    							add(
                    								current,
                    								"requires",
                    								lv_requires_7_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:2978:5: (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==Comma) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalCircleciParser.g:2979:6: otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getJobWorkflowAccess().getCommaKeyword_2_4_2_0());
                    	    					
                    	    // InternalCircleciParser.g:2983:6: ( (lv_requires_9_0= ruleEString ) )
                    	    // InternalCircleciParser.g:2984:7: (lv_requires_9_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:2984:7: (lv_requires_9_0= ruleEString )
                    	    // InternalCircleciParser.g:2985:8: lv_requires_9_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getJobWorkflowAccess().getRequiresEStringParserRuleCall_2_4_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_68);
                    	    lv_requires_9_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"requires",
                    	    									lv_requires_9_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3004:4: (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Context) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCircleciParser.g:3005:5: otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,Context,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getJobWorkflowAccess().getContextKeyword_2_5_0());
                    				
                    // InternalCircleciParser.g:3009:5: ( (lv_context_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3010:6: (lv_context_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3010:6: (lv_context_11_0= ruleEString )
                    // InternalCircleciParser.g:3011:7: lv_context_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobWorkflowAccess().getContextEStringParserRuleCall_2_5_1_0());
                    						
                    pushFollow(FOLLOW_69);
                    lv_context_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
                    							}
                    							add(
                    								current,
                    								"context",
                    								lv_context_11_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:3028:5: (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==Comma) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3029:6: otherlv_12= Comma ( (lv_context_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getJobWorkflowAccess().getCommaKeyword_2_5_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3033:6: ( (lv_context_13_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3034:7: (lv_context_13_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3034:7: (lv_context_13_0= ruleEString )
                    	    // InternalCircleciParser.g:3035:8: lv_context_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getJobWorkflowAccess().getContextEStringParserRuleCall_2_5_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_69);
                    	    lv_context_13_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"context",
                    	    									lv_context_13_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3054:4: ( (lv_branches_14_0= ruleBranch ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==Branch) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalCircleciParser.g:3055:5: (lv_branches_14_0= ruleBranch )
            	    {
            	    // InternalCircleciParser.g:3055:5: (lv_branches_14_0= ruleBranch )
            	    // InternalCircleciParser.g:3056:6: lv_branches_14_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getJobWorkflowAccess().getBranchesBranchParserRuleCall_2_6_0());
            	    					
            	    pushFollow(FOLLOW_70);
            	    lv_branches_14_0=ruleBranch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branches",
            	    							lv_branches_14_0,
            	    							"org.xtext.example.circleci.Circleci.Branch");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // InternalCircleciParser.g:3073:4: ( (lv_matrix_15_0= ruleMatrix ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Matrix) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalCircleciParser.g:3074:5: (lv_matrix_15_0= ruleMatrix )
                    {
                    // InternalCircleciParser.g:3074:5: (lv_matrix_15_0= ruleMatrix )
                    // InternalCircleciParser.g:3075:6: lv_matrix_15_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getJobWorkflowAccess().getMatrixMatrixParserRuleCall_2_7_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_matrix_15_0=ruleMatrix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobWorkflowRule());
                    						}
                    						set(
                    							current,
                    							"matrix",
                    							lv_matrix_15_0,
                    							"org.xtext.example.circleci.Circleci.Matrix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_16, grammarAccess.getJobWorkflowAccess().getENDTerminalRuleCall_2_8());
            			

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
    // $ANTLR end "ruleJobWorkflow"


    // $ANTLR start "entryRuleMatrix"
    // InternalCircleciParser.g:3101:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalCircleciParser.g:3101:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalCircleciParser.g:3102:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalCircleciParser.g:3108:1: ruleMatrix returns [EObject current=null] : (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;

        EObject lv_matrix_exclude_6_0 = null;

        EObject lv_matrix_params_10_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:3114:2: ( (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:3115:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:3115:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) )
            // InternalCircleciParser.g:3116:3: otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
            		
            // InternalCircleciParser.g:3120:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END )
            // InternalCircleciParser.g:3121:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_71); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:3125:4: (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Alias) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCircleciParser.g:3126:5: otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Alias,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatrixAccess().getAliasKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:3130:5: ( (lv_alias_3_0= ruleEString ) )
                    // InternalCircleciParser.g:3131:6: (lv_alias_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3131:6: (lv_alias_3_0= ruleEString )
                    // InternalCircleciParser.g:3132:7: lv_alias_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMatrixAccess().getAliasEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_72);
                    lv_alias_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMatrixRule());
                    							}
                    							set(
                    								current,
                    								"alias",
                    								lv_alias_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3150:4: (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Matrix_exclude) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalCircleciParser.g:3151:5: otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Matrix_exclude,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getMatrix_excludeKeyword_1_2_0());
                    				
                    // InternalCircleciParser.g:3155:5: (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END )
                    // InternalCircleciParser.g:3156:6: this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_73); 

                    						newLeafNode(this_BEGIN_5, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    					
                    // InternalCircleciParser.g:3160:6: ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==MatrixParams) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3161:7: (lv_matrix_exclude_6_0= ruleMatrixParams )
                    	    {
                    	    // InternalCircleciParser.g:3161:7: (lv_matrix_exclude_6_0= ruleMatrixParams )
                    	    // InternalCircleciParser.g:3162:8: lv_matrix_exclude_6_0= ruleMatrixParams
                    	    {

                    	    								newCompositeNode(grammarAccess.getMatrixAccess().getMatrix_excludeMatrixParamsParserRuleCall_1_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_73);
                    	    lv_matrix_exclude_6_0=ruleMatrixParams();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getMatrixRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"matrix_exclude",
                    	    									lv_matrix_exclude_6_0,
                    	    									"org.xtext.example.circleci.Circleci.MatrixParams");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_74); 

                    						newLeafNode(this_END_7, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_2_1_2());
                    					

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Matrix_params,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getMatrixAccess().getMatrix_paramsKeyword_1_3());
            			
            // InternalCircleciParser.g:3189:4: (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END )
            // InternalCircleciParser.g:3190:5: this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END
            {
            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_75); 

            					newLeafNode(this_BEGIN_9, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_4_0());
            				
            // InternalCircleciParser.g:3194:5: ( (lv_matrix_params_10_0= ruleMatrixParams ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==MatrixParams) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalCircleciParser.g:3195:6: (lv_matrix_params_10_0= ruleMatrixParams )
            	    {
            	    // InternalCircleciParser.g:3195:6: (lv_matrix_params_10_0= ruleMatrixParams )
            	    // InternalCircleciParser.g:3196:7: lv_matrix_params_10_0= ruleMatrixParams
            	    {

            	    							newCompositeNode(grammarAccess.getMatrixAccess().getMatrix_paramsMatrixParamsParserRuleCall_1_4_1_0());
            	    						
            	    pushFollow(FOLLOW_73);
            	    lv_matrix_params_10_0=ruleMatrixParams();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    							}
            	    							add(
            	    								current,
            	    								"matrix_params",
            	    								lv_matrix_params_10_0,
            	    								"org.xtext.example.circleci.Circleci.MatrixParams");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            this_END_11=(Token)match(input,RULE_END,FOLLOW_7); 

            					newLeafNode(this_END_11, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_4_2());
            				

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_12, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_5());
            			

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


    // $ANTLR start "entryRuleMatrixParams"
    // InternalCircleciParser.g:3227:1: entryRuleMatrixParams returns [EObject current=null] : iv_ruleMatrixParams= ruleMatrixParams EOF ;
    public final EObject entryRuleMatrixParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixParams = null;


        try {
            // InternalCircleciParser.g:3227:53: (iv_ruleMatrixParams= ruleMatrixParams EOF )
            // InternalCircleciParser.g:3228:2: iv_ruleMatrixParams= ruleMatrixParams EOF
            {
             newCompositeNode(grammarAccess.getMatrixParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrixParams=ruleMatrixParams();

            state._fsp--;

             current =iv_ruleMatrixParams; 
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
    // $ANTLR end "entryRuleMatrixParams"


    // $ANTLR start "ruleMatrixParams"
    // InternalCircleciParser.g:3234:1: ruleMatrixParams returns [EObject current=null] : (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) ) ;
    public final EObject ruleMatrixParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:3240:2: ( (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:3241:2: (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:3241:2: (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) )
            // InternalCircleciParser.g:3242:3: otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,MatrixParams,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixParamsAccess().getMatrixParamsKeyword_0());
            		
            // InternalCircleciParser.g:3246:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END )
            // InternalCircleciParser.g:3247:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixParamsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getMatrixParamsAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:3255:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:3256:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:3256:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:3257:6: lv_key_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMatrixParamsAccess().getKeyEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_76);
            lv_key_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMatrixParamsRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Values,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getMatrixParamsAccess().getValuesKeyword_1_3());
            			
            // InternalCircleciParser.g:3278:4: ( (lv_values_5_0= ruleEString ) )
            // InternalCircleciParser.g:3279:5: (lv_values_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3279:5: (lv_values_5_0= ruleEString )
            // InternalCircleciParser.g:3280:6: lv_values_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMatrixParamsAccess().getValuesEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_30);
            lv_values_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMatrixParamsRule());
            						}
            						add(
            							current,
            							"values",
            							lv_values_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:3297:4: (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==Comma) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalCircleciParser.g:3298:5: otherlv_6= Comma ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getMatrixParamsAccess().getCommaKeyword_1_5_0());
            	    				
            	    // InternalCircleciParser.g:3302:5: ( (lv_values_7_0= ruleEString ) )
            	    // InternalCircleciParser.g:3303:6: (lv_values_7_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:3303:6: (lv_values_7_0= ruleEString )
            	    // InternalCircleciParser.g:3304:7: lv_values_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getMatrixParamsAccess().getValuesEStringParserRuleCall_1_5_1_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_values_7_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMatrixParamsRule());
            	    							}
            	    							add(
            	    								current,
            	    								"values",
            	    								lv_values_7_0,
            	    								"org.xtext.example.circleci.Circleci.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getMatrixParamsAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleMatrixParams"


    // $ANTLR start "entryRuleEShort"
    // InternalCircleciParser.g:3331:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // InternalCircleciParser.g:3331:46: (iv_ruleEShort= ruleEShort EOF )
            // InternalCircleciParser.g:3332:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
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
    // $ANTLR end "entryRuleEShort"


    // $ANTLR start "ruleEShort"
    // InternalCircleciParser.g:3338:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:3344:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalCircleciParser.g:3345:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalCircleciParser.g:3345:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalCircleciParser.g:3346:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalCircleciParser.g:3346:3: (kw= HyphenMinus )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==HyphenMinus) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalCircleciParser.g:3347:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_77); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEShortAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEShort"


    // $ANTLR start "entryRuleMachine"
    // InternalCircleciParser.g:3364:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalCircleciParser.g:3364:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalCircleciParser.g:3365:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalCircleciParser.g:3371:1: ruleMachine returns [EObject current=null] : (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_docker_layer_caching_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        Enumerator lv_resourceClass_8_0 = null;

        AntlrDatatypeRuleToken lv_shell_10_0 = null;

        AntlrDatatypeRuleToken lv_working_directory_12_0 = null;

        EObject lv_environments_13_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:3377:2: ( (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:3378:2: (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:3378:2: (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) )
            // InternalCircleciParser.g:3379:3: otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Machine,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalCircleciParser.g:3383:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END )
            // InternalCircleciParser.g:3384:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_78); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMachineAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:3388:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Name) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCircleciParser.g:3389:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:3393:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:3394:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3394:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:3395:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_79);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Image,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getImageKeyword_1_2());
            			
            // InternalCircleciParser.g:3417:4: ( (lv_image_5_0= ruleEString ) )
            // InternalCircleciParser.g:3418:5: (lv_image_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3418:5: (lv_image_5_0= ruleEString )
            // InternalCircleciParser.g:3419:6: lv_image_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMachineAccess().getImageEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_80);
            lv_image_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMachineRule());
            						}
            						set(
            							current,
            							"image",
            							lv_image_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:3436:4: ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==Docker_layer_caching) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalCircleciParser.g:3437:5: (lv_docker_layer_caching_6_0= Docker_layer_caching )
                    {
                    // InternalCircleciParser.g:3437:5: (lv_docker_layer_caching_6_0= Docker_layer_caching )
                    // InternalCircleciParser.g:3438:6: lv_docker_layer_caching_6_0= Docker_layer_caching
                    {
                    lv_docker_layer_caching_6_0=(Token)match(input,Docker_layer_caching,FOLLOW_81); 

                    						newLeafNode(lv_docker_layer_caching_6_0, grammarAccess.getMachineAccess().getDocker_layer_cachingDocker_layer_cachingKeyword_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    						setWithLastConsumed(current, "docker_layer_caching", lv_docker_layer_caching_6_0 != null, "docker_layer_caching");
                    					

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,ResourceClass,FOLLOW_82); 

            				newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getResourceClassKeyword_1_5());
            			
            // InternalCircleciParser.g:3454:4: ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3455:5: (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3455:5: (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE )
            // InternalCircleciParser.g:3456:6: lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE
            {

            						newCompositeNode(grammarAccess.getMachineAccess().getResourceClassMACHINE_RESOURCE_TYPEEnumRuleCall_1_6_0());
            					
            pushFollow(FOLLOW_83);
            lv_resourceClass_8_0=ruleMACHINE_RESOURCE_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMachineRule());
            						}
            						set(
            							current,
            							"resourceClass",
            							lv_resourceClass_8_0,
            							"org.xtext.example.circleci.Circleci.MACHINE_RESOURCE_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:3473:4: (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==Shell) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCircleciParser.g:3474:5: otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getShellKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:3478:5: ( (lv_shell_10_0= ruleEString ) )
                    // InternalCircleciParser.g:3479:6: (lv_shell_10_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3479:6: (lv_shell_10_0= ruleEString )
                    // InternalCircleciParser.g:3480:7: lv_shell_10_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMachineAccess().getShellEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_84);
                    lv_shell_10_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    							}
                    							set(
                    								current,
                    								"shell",
                    								lv_shell_10_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3498:4: (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Working_directory) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalCircleciParser.g:3499:5: otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getWorking_directoryKeyword_1_8_0());
                    				
                    // InternalCircleciParser.g:3503:5: ( (lv_working_directory_12_0= ruleEString ) )
                    // InternalCircleciParser.g:3504:6: (lv_working_directory_12_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3504:6: (lv_working_directory_12_0= ruleEString )
                    // InternalCircleciParser.g:3505:7: lv_working_directory_12_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMachineAccess().getWorking_directoryEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_85);
                    lv_working_directory_12_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMachineRule());
                    							}
                    							set(
                    								current,
                    								"working_directory",
                    								lv_working_directory_12_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3523:4: ( (lv_environments_13_0= ruleEnvironment ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==Environment) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalCircleciParser.g:3524:5: (lv_environments_13_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3524:5: (lv_environments_13_0= ruleEnvironment )
            	    // InternalCircleciParser.g:3525:6: lv_environments_13_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getEnvironmentsEnvironmentParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_85);
            	    lv_environments_13_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_13_0,
            	    							"org.xtext.example.circleci.Circleci.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getMachineAccess().getENDTerminalRuleCall_1_10());
            			

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMacOs"
    // InternalCircleciParser.g:3551:1: entryRuleMacOs returns [EObject current=null] : iv_ruleMacOs= ruleMacOs EOF ;
    public final EObject entryRuleMacOs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOs = null;


        try {
            // InternalCircleciParser.g:3551:46: (iv_ruleMacOs= ruleMacOs EOF )
            // InternalCircleciParser.g:3552:2: iv_ruleMacOs= ruleMacOs EOF
            {
             newCompositeNode(grammarAccess.getMacOsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacOs=ruleMacOs();

            state._fsp--;

             current =iv_ruleMacOs; 
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
    // $ANTLR end "entryRuleMacOs"


    // $ANTLR start "ruleMacOs"
    // InternalCircleciParser.g:3558:1: ruleMacOs returns [EObject current=null] : (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) ) ;
    public final EObject ruleMacOs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_xcode_5_0 = null;

        Enumerator lv_resourceClass_7_0 = null;

        AntlrDatatypeRuleToken lv_shell_9_0 = null;

        AntlrDatatypeRuleToken lv_working_directory_11_0 = null;

        EObject lv_environments_12_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:3564:2: ( (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) ) )
            // InternalCircleciParser.g:3565:2: (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) )
            {
            // InternalCircleciParser.g:3565:2: (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) )
            // InternalCircleciParser.g:3566:3: otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END )
            {
            otherlv_0=(Token)match(input,MacOs,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMacOsAccess().getMacOsKeyword_0());
            		
            // InternalCircleciParser.g:3570:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END )
            // InternalCircleciParser.g:3571:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_86); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMacOsAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:3575:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Name) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCircleciParser.g:3576:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getMacOsAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:3580:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:3581:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3581:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:3582:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMacOsAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_87);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMacOsRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3600:4: (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) )
            // InternalCircleciParser.g:3601:5: otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,Xcode,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getMacOsAccess().getXcodeKeyword_1_2_0());
            				
            // InternalCircleciParser.g:3605:5: ( (lv_xcode_5_0= ruleEString ) )
            // InternalCircleciParser.g:3606:6: (lv_xcode_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3606:6: (lv_xcode_5_0= ruleEString )
            // InternalCircleciParser.g:3607:7: lv_xcode_5_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getMacOsAccess().getXcodeEStringParserRuleCall_1_2_1_0());
            						
            pushFollow(FOLLOW_81);
            lv_xcode_5_0=ruleEString();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getMacOsRule());
            							}
            							set(
            								current,
            								"xcode",
            								lv_xcode_5_0,
            								"org.xtext.example.circleci.Circleci.EString");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalCircleciParser.g:3625:4: (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) )
            // InternalCircleciParser.g:3626:5: otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) )
            {
            otherlv_6=(Token)match(input,ResourceClass,FOLLOW_88); 

            					newLeafNode(otherlv_6, grammarAccess.getMacOsAccess().getResourceClassKeyword_1_3_0());
            				
            // InternalCircleciParser.g:3630:5: ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3631:6: (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3631:6: (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE )
            // InternalCircleciParser.g:3632:7: lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE
            {

            							newCompositeNode(grammarAccess.getMacOsAccess().getResourceClassMACOS_RESOURCE_TYPEEnumRuleCall_1_3_1_0());
            						
            pushFollow(FOLLOW_83);
            lv_resourceClass_7_0=ruleMACOS_RESOURCE_TYPE();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getMacOsRule());
            							}
            							set(
            								current,
            								"resourceClass",
            								lv_resourceClass_7_0,
            								"org.xtext.example.circleci.Circleci.MACOS_RESOURCE_TYPE");
            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalCircleciParser.g:3650:4: (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==Shell) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalCircleciParser.g:3651:5: otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getMacOsAccess().getShellKeyword_1_4_0());
                    				
                    // InternalCircleciParser.g:3655:5: ( (lv_shell_9_0= ruleEString ) )
                    // InternalCircleciParser.g:3656:6: (lv_shell_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3656:6: (lv_shell_9_0= ruleEString )
                    // InternalCircleciParser.g:3657:7: lv_shell_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMacOsAccess().getShellEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_84);
                    lv_shell_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMacOsRule());
                    							}
                    							set(
                    								current,
                    								"shell",
                    								lv_shell_9_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3675:4: (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==Working_directory) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalCircleciParser.g:3676:5: otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getMacOsAccess().getWorking_directoryKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:3680:5: ( (lv_working_directory_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3681:6: (lv_working_directory_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3681:6: (lv_working_directory_11_0= ruleEString )
                    // InternalCircleciParser.g:3682:7: lv_working_directory_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMacOsAccess().getWorking_directoryEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_85);
                    lv_working_directory_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMacOsRule());
                    							}
                    							set(
                    								current,
                    								"working_directory",
                    								lv_working_directory_11_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3700:4: ( (lv_environments_12_0= ruleEnvironment ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==Environment) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalCircleciParser.g:3701:5: (lv_environments_12_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3701:5: (lv_environments_12_0= ruleEnvironment )
            	    // InternalCircleciParser.g:3702:6: lv_environments_12_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getMacOsAccess().getEnvironmentsEnvironmentParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_85);
            	    lv_environments_12_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMacOsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_12_0,
            	    							"org.xtext.example.circleci.Circleci.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_13, grammarAccess.getMacOsAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "ruleMacOs"


    // $ANTLR start "entryRuleDocker"
    // InternalCircleciParser.g:3728:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;


        try {
            // InternalCircleciParser.g:3728:47: (iv_ruleDocker= ruleDocker EOF )
            // InternalCircleciParser.g:3729:2: iv_ruleDocker= ruleDocker EOF
            {
             newCompositeNode(grammarAccess.getDockerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocker=ruleDocker();

            state._fsp--;

             current =iv_ruleDocker; 
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
    // $ANTLR end "entryRuleDocker"


    // $ANTLR start "ruleDocker"
    // InternalCircleciParser.g:3735:1: ruleDocker returns [EObject current=null] : (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) ) ;
    public final EObject ruleDocker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_END_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        Enumerator lv_resourceClass_7_0 = null;

        AntlrDatatypeRuleToken lv_shell_9_0 = null;

        AntlrDatatypeRuleToken lv_working_directory_11_0 = null;

        AntlrDatatypeRuleToken lv_entrypoint_13_0 = null;

        AntlrDatatypeRuleToken lv_entrypoint_15_0 = null;

        AntlrDatatypeRuleToken lv_command_17_0 = null;

        AntlrDatatypeRuleToken lv_command_19_0 = null;

        AntlrDatatypeRuleToken lv_user_21_0 = null;

        EObject lv_environments_22_0 = null;

        EObject lv_docker_auth_23_0 = null;

        EObject lv_docker_aws_auth_24_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:3741:2: ( (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) ) )
            // InternalCircleciParser.g:3742:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) )
            {
            // InternalCircleciParser.g:3742:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) )
            // InternalCircleciParser.g:3743:3: otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerAccess().getDockerKeyword_0());
            		
            // InternalCircleciParser.g:3747:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END )
            // InternalCircleciParser.g:3748:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_78); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDockerAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:3752:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==Name) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalCircleciParser.g:3753:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getDockerAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:3757:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:3758:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3758:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:3759:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_79);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Image,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getDockerAccess().getImageKeyword_1_2());
            			
            // InternalCircleciParser.g:3781:4: ( (lv_image_5_0= ruleEString ) )
            // InternalCircleciParser.g:3782:5: (lv_image_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3782:5: (lv_image_5_0= ruleEString )
            // InternalCircleciParser.g:3783:6: lv_image_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getImageEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_81);
            lv_image_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDockerRule());
            						}
            						set(
            							current,
            							"image",
            							lv_image_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,ResourceClass,FOLLOW_89); 

            				newLeafNode(otherlv_6, grammarAccess.getDockerAccess().getResourceClassKeyword_1_4());
            			
            // InternalCircleciParser.g:3804:4: ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3805:5: (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3805:5: (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE )
            // InternalCircleciParser.g:3806:6: lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getResourceClassDOCKER_RESOURCE_TYPEEnumRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_90);
            lv_resourceClass_7_0=ruleDOCKER_RESOURCE_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDockerRule());
            						}
            						set(
            							current,
            							"resourceClass",
            							lv_resourceClass_7_0,
            							"org.xtext.example.circleci.Circleci.DOCKER_RESOURCE_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:3823:4: (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==Shell) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCircleciParser.g:3824:5: otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getDockerAccess().getShellKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:3828:5: ( (lv_shell_9_0= ruleEString ) )
                    // InternalCircleciParser.g:3829:6: (lv_shell_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3829:6: (lv_shell_9_0= ruleEString )
                    // InternalCircleciParser.g:3830:7: lv_shell_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getShellEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_91);
                    lv_shell_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"shell",
                    								lv_shell_9_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3848:4: (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==Working_directory) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalCircleciParser.g:3849:5: otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getDockerAccess().getWorking_directoryKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:3853:5: ( (lv_working_directory_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3854:6: (lv_working_directory_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3854:6: (lv_working_directory_11_0= ruleEString )
                    // InternalCircleciParser.g:3855:7: lv_working_directory_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getWorking_directoryEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_92);
                    lv_working_directory_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"working_directory",
                    								lv_working_directory_11_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3873:4: (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==Entrypoint) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalCircleciParser.g:3874:5: otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,Entrypoint,FOLLOW_6); 

                    					newLeafNode(otherlv_12, grammarAccess.getDockerAccess().getEntrypointKeyword_1_8_0());
                    				
                    // InternalCircleciParser.g:3878:5: ( (lv_entrypoint_13_0= ruleEString ) )
                    // InternalCircleciParser.g:3879:6: (lv_entrypoint_13_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3879:6: (lv_entrypoint_13_0= ruleEString )
                    // InternalCircleciParser.g:3880:7: lv_entrypoint_13_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getEntrypointEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_93);
                    lv_entrypoint_13_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							add(
                    								current,
                    								"entrypoint",
                    								lv_entrypoint_13_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:3897:5: (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==Comma) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3898:6: otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getDockerAccess().getCommaKeyword_1_8_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3902:6: ( (lv_entrypoint_15_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3903:7: (lv_entrypoint_15_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3903:7: (lv_entrypoint_15_0= ruleEString )
                    	    // InternalCircleciParser.g:3904:8: lv_entrypoint_15_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getDockerAccess().getEntrypointEStringParserRuleCall_1_8_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_93);
                    	    lv_entrypoint_15_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDockerRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"entrypoint",
                    	    									lv_entrypoint_15_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3923:4: (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==Command_1) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalCircleciParser.g:3924:5: otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,Command_1,FOLLOW_6); 

                    					newLeafNode(otherlv_16, grammarAccess.getDockerAccess().getCommandKeyword_1_9_0());
                    				
                    // InternalCircleciParser.g:3928:5: ( (lv_command_17_0= ruleEString ) )
                    // InternalCircleciParser.g:3929:6: (lv_command_17_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3929:6: (lv_command_17_0= ruleEString )
                    // InternalCircleciParser.g:3930:7: lv_command_17_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getCommandEStringParserRuleCall_1_9_1_0());
                    						
                    pushFollow(FOLLOW_94);
                    lv_command_17_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							add(
                    								current,
                    								"command",
                    								lv_command_17_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCircleciParser.g:3947:5: (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==Comma) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3948:6: otherlv_18= Comma ( (lv_command_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getDockerAccess().getCommaKeyword_1_9_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3952:6: ( (lv_command_19_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3953:7: (lv_command_19_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3953:7: (lv_command_19_0= ruleEString )
                    	    // InternalCircleciParser.g:3954:8: lv_command_19_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getDockerAccess().getCommandEStringParserRuleCall_1_9_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_94);
                    	    lv_command_19_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDockerRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"command",
                    	    									lv_command_19_0,
                    	    									"org.xtext.example.circleci.Circleci.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3973:4: (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==User) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalCircleciParser.g:3974:5: otherlv_20= User ( (lv_user_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,User,FOLLOW_6); 

                    					newLeafNode(otherlv_20, grammarAccess.getDockerAccess().getUserKeyword_1_10_0());
                    				
                    // InternalCircleciParser.g:3978:5: ( (lv_user_21_0= ruleEString ) )
                    // InternalCircleciParser.g:3979:6: (lv_user_21_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3979:6: (lv_user_21_0= ruleEString )
                    // InternalCircleciParser.g:3980:7: lv_user_21_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getUserEStringParserRuleCall_1_10_1_0());
                    						
                    pushFollow(FOLLOW_95);
                    lv_user_21_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"user",
                    								lv_user_21_0,
                    								"org.xtext.example.circleci.Circleci.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:3998:4: ( (lv_environments_22_0= ruleEnvironment ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==Environment) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalCircleciParser.g:3999:5: (lv_environments_22_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3999:5: (lv_environments_22_0= ruleEnvironment )
            	    // InternalCircleciParser.g:4000:6: lv_environments_22_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getDockerAccess().getEnvironmentsEnvironmentParserRuleCall_1_11_0());
            	    					
            	    pushFollow(FOLLOW_95);
            	    lv_environments_22_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_22_0,
            	    							"org.xtext.example.circleci.Circleci.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // InternalCircleciParser.g:4017:4: ( (lv_docker_auth_23_0= ruleDocker_Auth ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==Docker_Auth) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalCircleciParser.g:4018:5: (lv_docker_auth_23_0= ruleDocker_Auth )
                    {
                    // InternalCircleciParser.g:4018:5: (lv_docker_auth_23_0= ruleDocker_Auth )
                    // InternalCircleciParser.g:4019:6: lv_docker_auth_23_0= ruleDocker_Auth
                    {

                    						newCompositeNode(grammarAccess.getDockerAccess().getDocker_authDocker_AuthParserRuleCall_1_12_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_docker_auth_23_0=ruleDocker_Auth();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDockerRule());
                    						}
                    						set(
                    							current,
                    							"docker_auth",
                    							lv_docker_auth_23_0,
                    							"org.xtext.example.circleci.Circleci.Docker_Auth");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:4036:4: ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==Docker_Aws_Auths) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCircleciParser.g:4037:5: (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths )
                    {
                    // InternalCircleciParser.g:4037:5: (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths )
                    // InternalCircleciParser.g:4038:6: lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths
                    {

                    						newCompositeNode(grammarAccess.getDockerAccess().getDocker_aws_authDocker_Aws_AuthsParserRuleCall_1_13_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_docker_aws_auth_24_0=ruleDocker_Aws_Auths();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDockerRule());
                    						}
                    						set(
                    							current,
                    							"docker_aws_auth",
                    							lv_docker_aws_auth_24_0,
                    							"org.xtext.example.circleci.Circleci.Docker_Aws_Auths");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            this_END_25=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_25, grammarAccess.getDockerAccess().getENDTerminalRuleCall_1_14());
            			

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
    // $ANTLR end "ruleDocker"


    // $ANTLR start "entryRuleDocker_Auth"
    // InternalCircleciParser.g:4064:1: entryRuleDocker_Auth returns [EObject current=null] : iv_ruleDocker_Auth= ruleDocker_Auth EOF ;
    public final EObject entryRuleDocker_Auth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker_Auth = null;


        try {
            // InternalCircleciParser.g:4064:52: (iv_ruleDocker_Auth= ruleDocker_Auth EOF )
            // InternalCircleciParser.g:4065:2: iv_ruleDocker_Auth= ruleDocker_Auth EOF
            {
             newCompositeNode(grammarAccess.getDocker_AuthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocker_Auth=ruleDocker_Auth();

            state._fsp--;

             current =iv_ruleDocker_Auth; 
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
    // $ANTLR end "entryRuleDocker_Auth"


    // $ANTLR start "ruleDocker_Auth"
    // InternalCircleciParser.g:4071:1: ruleDocker_Auth returns [EObject current=null] : (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleDocker_Auth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_username_3_0 = null;

        AntlrDatatypeRuleToken lv_password_5_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:4077:2: ( (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:4078:2: (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:4078:2: (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:4079:3: otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker_Auth,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocker_AuthAccess().getDocker_AuthKeyword_0());
            		
            // InternalCircleciParser.g:4083:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:4084:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_97); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDocker_AuthAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Username,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getDocker_AuthAccess().getUsernameKeyword_1_1());
            			
            // InternalCircleciParser.g:4092:4: ( (lv_username_3_0= ruleEString ) )
            // InternalCircleciParser.g:4093:5: (lv_username_3_0= ruleEString )
            {
            // InternalCircleciParser.g:4093:5: (lv_username_3_0= ruleEString )
            // InternalCircleciParser.g:4094:6: lv_username_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_AuthAccess().getUsernameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_98);
            lv_username_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDocker_AuthRule());
            						}
            						set(
            							current,
            							"username",
            							lv_username_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Password,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getDocker_AuthAccess().getPasswordKeyword_1_3());
            			
            // InternalCircleciParser.g:4115:4: ( (lv_password_5_0= ruleEString ) )
            // InternalCircleciParser.g:4116:5: (lv_password_5_0= ruleEString )
            {
            // InternalCircleciParser.g:4116:5: (lv_password_5_0= ruleEString )
            // InternalCircleciParser.g:4117:6: lv_password_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_AuthAccess().getPasswordEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_7);
            lv_password_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDocker_AuthRule());
            						}
            						set(
            							current,
            							"password",
            							lv_password_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getDocker_AuthAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleDocker_Auth"


    // $ANTLR start "entryRuleDocker_Aws_Auths"
    // InternalCircleciParser.g:4143:1: entryRuleDocker_Aws_Auths returns [EObject current=null] : iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF ;
    public final EObject entryRuleDocker_Aws_Auths() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker_Aws_Auths = null;


        try {
            // InternalCircleciParser.g:4143:57: (iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF )
            // InternalCircleciParser.g:4144:2: iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF
            {
             newCompositeNode(grammarAccess.getDocker_Aws_AuthsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocker_Aws_Auths=ruleDocker_Aws_Auths();

            state._fsp--;

             current =iv_ruleDocker_Aws_Auths; 
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
    // $ANTLR end "entryRuleDocker_Aws_Auths"


    // $ANTLR start "ruleDocker_Aws_Auths"
    // InternalCircleciParser.g:4150:1: ruleDocker_Aws_Auths returns [EObject current=null] : (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleDocker_Aws_Auths() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_aws_access_key_id_3_0 = null;

        AntlrDatatypeRuleToken lv_aws_secret_access_key_5_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:4156:2: ( (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:4157:2: (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:4157:2: (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:4158:3: otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker_Aws_Auths,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocker_Aws_AuthsAccess().getDocker_Aws_AuthsKeyword_0());
            		
            // InternalCircleciParser.g:4162:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:4163:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_99); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDocker_Aws_AuthsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Aws_access_key_id,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getDocker_Aws_AuthsAccess().getAws_access_key_idKeyword_1_1());
            			
            // InternalCircleciParser.g:4171:4: ( (lv_aws_access_key_id_3_0= ruleEString ) )
            // InternalCircleciParser.g:4172:5: (lv_aws_access_key_id_3_0= ruleEString )
            {
            // InternalCircleciParser.g:4172:5: (lv_aws_access_key_id_3_0= ruleEString )
            // InternalCircleciParser.g:4173:6: lv_aws_access_key_id_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_Aws_AuthsAccess().getAws_access_key_idEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_100);
            lv_aws_access_key_id_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDocker_Aws_AuthsRule());
            						}
            						set(
            							current,
            							"aws_access_key_id",
            							lv_aws_access_key_id_3_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Aws_secret_access_key,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getDocker_Aws_AuthsAccess().getAws_secret_access_keyKeyword_1_3());
            			
            // InternalCircleciParser.g:4194:4: ( (lv_aws_secret_access_key_5_0= ruleEString ) )
            // InternalCircleciParser.g:4195:5: (lv_aws_secret_access_key_5_0= ruleEString )
            {
            // InternalCircleciParser.g:4195:5: (lv_aws_secret_access_key_5_0= ruleEString )
            // InternalCircleciParser.g:4196:6: lv_aws_secret_access_key_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_Aws_AuthsAccess().getAws_secret_access_keyEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_7);
            lv_aws_secret_access_key_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDocker_Aws_AuthsRule());
            						}
            						set(
            							current,
            							"aws_secret_access_key",
            							lv_aws_secret_access_key_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getDocker_Aws_AuthsAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleDocker_Aws_Auths"


    // $ANTLR start "ruleMACHINE_RESOURCE_TYPE"
    // InternalCircleciParser.g:4222:1: ruleMACHINE_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) ) ;
    public final Enumerator ruleMACHINE_RESOURCE_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4228:2: ( ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) ) )
            // InternalCircleciParser.g:4229:2: ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) )
            {
            // InternalCircleciParser.g:4229:2: ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) )
            int alt103=5;
            switch ( input.LA(1) ) {
            case Medium:
                {
                alt103=1;
                }
                break;
            case Large:
                {
                alt103=2;
                }
                break;
            case Xlarge:
                {
                alt103=3;
                }
                break;
            case Xlarge_1:
                {
                alt103=4;
                }
                break;
            case Xlarge_2:
                {
                alt103=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalCircleciParser.g:4230:3: (enumLiteral_0= Medium )
                    {
                    // InternalCircleciParser.g:4230:3: (enumLiteral_0= Medium )
                    // InternalCircleciParser.g:4231:4: enumLiteral_0= Medium
                    {
                    enumLiteral_0=(Token)match(input,Medium,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4238:3: (enumLiteral_1= Large )
                    {
                    // InternalCircleciParser.g:4238:3: (enumLiteral_1= Large )
                    // InternalCircleciParser.g:4239:4: enumLiteral_1= Large
                    {
                    enumLiteral_1=(Token)match(input,Large,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4246:3: (enumLiteral_2= Xlarge )
                    {
                    // InternalCircleciParser.g:4246:3: (enumLiteral_2= Xlarge )
                    // InternalCircleciParser.g:4247:4: enumLiteral_2= Xlarge
                    {
                    enumLiteral_2=(Token)match(input,Xlarge,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4254:3: (enumLiteral_3= Xlarge_1 )
                    {
                    // InternalCircleciParser.g:4254:3: (enumLiteral_3= Xlarge_1 )
                    // InternalCircleciParser.g:4255:4: enumLiteral_3= Xlarge_1
                    {
                    enumLiteral_3=(Token)match(input,Xlarge_1,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4262:3: (enumLiteral_4= Xlarge_2 )
                    {
                    // InternalCircleciParser.g:4262:3: (enumLiteral_4= Xlarge_2 )
                    // InternalCircleciParser.g:4263:4: enumLiteral_4= Xlarge_2
                    {
                    enumLiteral_4=(Token)match(input,Xlarge_2,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGE_PLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGE_PLUSEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleMACHINE_RESOURCE_TYPE"


    // $ANTLR start "ruleMACOS_RESOURCE_TYPE"
    // InternalCircleciParser.g:4273:1: ruleMACOS_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) ) ;
    public final Enumerator ruleMACOS_RESOURCE_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4279:2: ( ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) ) )
            // InternalCircleciParser.g:4280:2: ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) )
            {
            // InternalCircleciParser.g:4280:2: ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case MacosX86MediumGen2:
                {
                alt104=1;
                }
                break;
            case MacosM1MediumGen:
                {
                alt104=2;
                }
                break;
            case MacosM1LargeGen1:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalCircleciParser.g:4281:3: (enumLiteral_0= MacosX86MediumGen2 )
                    {
                    // InternalCircleciParser.g:4281:3: (enumLiteral_0= MacosX86MediumGen2 )
                    // InternalCircleciParser.g:4282:4: enumLiteral_0= MacosX86MediumGen2
                    {
                    enumLiteral_0=(Token)match(input,MacosX86MediumGen2,FOLLOW_2); 

                    				current = grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_X86_MEDIUM_GEN2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_X86_MEDIUM_GEN2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4289:3: (enumLiteral_1= MacosM1MediumGen )
                    {
                    // InternalCircleciParser.g:4289:3: (enumLiteral_1= MacosM1MediumGen )
                    // InternalCircleciParser.g:4290:4: enumLiteral_1= MacosM1MediumGen
                    {
                    enumLiteral_1=(Token)match(input,MacosM1MediumGen,FOLLOW_2); 

                    				current = grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_MEDIUM_GENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_MEDIUM_GENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4297:3: (enumLiteral_2= MacosM1LargeGen1 )
                    {
                    // InternalCircleciParser.g:4297:3: (enumLiteral_2= MacosM1LargeGen1 )
                    // InternalCircleciParser.g:4298:4: enumLiteral_2= MacosM1LargeGen1
                    {
                    enumLiteral_2=(Token)match(input,MacosM1LargeGen1,FOLLOW_2); 

                    				current = grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_LARGE_GEN1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_LARGE_GEN1EnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMACOS_RESOURCE_TYPE"


    // $ANTLR start "ruleDOCKER_RESOURCE_TYPE"
    // InternalCircleciParser.g:4308:1: ruleDOCKER_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) ) ;
    public final Enumerator ruleDOCKER_RESOURCE_TYPE() throws RecognitionException {
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
            // InternalCircleciParser.g:4314:2: ( ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) ) )
            // InternalCircleciParser.g:4315:2: ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) )
            {
            // InternalCircleciParser.g:4315:2: ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) )
            int alt105=7;
            switch ( input.LA(1) ) {
            case Small:
                {
                alt105=1;
                }
                break;
            case Medium:
                {
                alt105=2;
                }
                break;
            case Medium_1:
                {
                alt105=3;
                }
                break;
            case Large:
                {
                alt105=4;
                }
                break;
            case Xlarge:
                {
                alt105=5;
                }
                break;
            case Xlarge_1:
                {
                alt105=6;
                }
                break;
            case Xlarge_2:
                {
                alt105=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalCircleciParser.g:4316:3: (enumLiteral_0= Small )
                    {
                    // InternalCircleciParser.g:4316:3: (enumLiteral_0= Small )
                    // InternalCircleciParser.g:4317:4: enumLiteral_0= Small
                    {
                    enumLiteral_0=(Token)match(input,Small,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getSMALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getSMALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4324:3: (enumLiteral_1= Medium )
                    {
                    // InternalCircleciParser.g:4324:3: (enumLiteral_1= Medium )
                    // InternalCircleciParser.g:4325:4: enumLiteral_1= Medium
                    {
                    enumLiteral_1=(Token)match(input,Medium,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4332:3: (enumLiteral_2= Medium_1 )
                    {
                    // InternalCircleciParser.g:4332:3: (enumLiteral_2= Medium_1 )
                    // InternalCircleciParser.g:4333:4: enumLiteral_2= Medium_1
                    {
                    enumLiteral_2=(Token)match(input,Medium_1,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUM_PLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUM_PLUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4340:3: (enumLiteral_3= Large )
                    {
                    // InternalCircleciParser.g:4340:3: (enumLiteral_3= Large )
                    // InternalCircleciParser.g:4341:4: enumLiteral_3= Large
                    {
                    enumLiteral_3=(Token)match(input,Large,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4348:3: (enumLiteral_4= Xlarge )
                    {
                    // InternalCircleciParser.g:4348:3: (enumLiteral_4= Xlarge )
                    // InternalCircleciParser.g:4349:4: enumLiteral_4= Xlarge
                    {
                    enumLiteral_4=(Token)match(input,Xlarge,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCircleciParser.g:4356:3: (enumLiteral_5= Xlarge_1 )
                    {
                    // InternalCircleciParser.g:4356:3: (enumLiteral_5= Xlarge_1 )
                    // InternalCircleciParser.g:4357:4: enumLiteral_5= Xlarge_1
                    {
                    enumLiteral_5=(Token)match(input,Xlarge_1,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCircleciParser.g:4364:3: (enumLiteral_6= Xlarge_2 )
                    {
                    // InternalCircleciParser.g:4364:3: (enumLiteral_6= Xlarge_2 )
                    // InternalCircleciParser.g:4365:4: enumLiteral_6= Xlarge_2
                    {
                    enumLiteral_6=(Token)match(input,Xlarge_2,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGE_PLUSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGE_PLUSEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleDOCKER_RESOURCE_TYPE"


    // $ANTLR start "ruleWHEN_TYPE"
    // InternalCircleciParser.g:4375:1: ruleWHEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) ) ;
    public final Enumerator ruleWHEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4381:2: ( ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) ) )
            // InternalCircleciParser.g:4382:2: ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) )
            {
            // InternalCircleciParser.g:4382:2: ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case On_success:
                {
                alt106=1;
                }
                break;
            case Always:
                {
                alt106=2;
                }
                break;
            case On_fail:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalCircleciParser.g:4383:3: (enumLiteral_0= On_success )
                    {
                    // InternalCircleciParser.g:4383:3: (enumLiteral_0= On_success )
                    // InternalCircleciParser.g:4384:4: enumLiteral_0= On_success
                    {
                    enumLiteral_0=(Token)match(input,On_success,FOLLOW_2); 

                    				current = grammarAccess.getWHEN_TYPEAccess().getOn_successEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWHEN_TYPEAccess().getOn_successEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4391:3: (enumLiteral_1= Always )
                    {
                    // InternalCircleciParser.g:4391:3: (enumLiteral_1= Always )
                    // InternalCircleciParser.g:4392:4: enumLiteral_1= Always
                    {
                    enumLiteral_1=(Token)match(input,Always,FOLLOW_2); 

                    				current = grammarAccess.getWHEN_TYPEAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWHEN_TYPEAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4399:3: (enumLiteral_2= On_fail )
                    {
                    // InternalCircleciParser.g:4399:3: (enumLiteral_2= On_fail )
                    // InternalCircleciParser.g:4400:4: enumLiteral_2= On_fail
                    {
                    enumLiteral_2=(Token)match(input,On_fail,FOLLOW_2); 

                    				current = grammarAccess.getWHEN_TYPEAccess().getOn_failEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWHEN_TYPEAccess().getOn_failEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleWHEN_TYPE"


    // $ANTLR start "rulePARAMETER_TYPES"
    // InternalCircleciParser.g:4410:1: rulePARAMETER_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) ) ;
    public final Enumerator rulePARAMETER_TYPES() throws RecognitionException {
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
            // InternalCircleciParser.g:4416:2: ( ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) ) )
            // InternalCircleciParser.g:4417:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) )
            {
            // InternalCircleciParser.g:4417:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) )
            int alt107=7;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt107=1;
                }
                break;
            case BOOLEAN:
                {
                alt107=2;
                }
                break;
            case INTEGER:
                {
                alt107=3;
                }
                break;
            case ENUM:
                {
                alt107=4;
                }
                break;
            case EXECUTOR:
                {
                alt107=5;
                }
                break;
            case STEPS:
                {
                alt107=6;
                }
                break;
            case ENVIRONMENT_VARIABLE_NAME:
                {
                alt107=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalCircleciParser.g:4418:3: (enumLiteral_0= STRING )
                    {
                    // InternalCircleciParser.g:4418:3: (enumLiteral_0= STRING )
                    // InternalCircleciParser.g:4419:4: enumLiteral_0= STRING
                    {
                    enumLiteral_0=(Token)match(input,STRING,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPARAMETER_TYPESAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4426:3: (enumLiteral_1= BOOLEAN )
                    {
                    // InternalCircleciParser.g:4426:3: (enumLiteral_1= BOOLEAN )
                    // InternalCircleciParser.g:4427:4: enumLiteral_1= BOOLEAN
                    {
                    enumLiteral_1=(Token)match(input,BOOLEAN,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPARAMETER_TYPESAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4434:3: (enumLiteral_2= INTEGER )
                    {
                    // InternalCircleciParser.g:4434:3: (enumLiteral_2= INTEGER )
                    // InternalCircleciParser.g:4435:4: enumLiteral_2= INTEGER
                    {
                    enumLiteral_2=(Token)match(input,INTEGER,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPARAMETER_TYPESAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4442:3: (enumLiteral_3= ENUM )
                    {
                    // InternalCircleciParser.g:4442:3: (enumLiteral_3= ENUM )
                    // InternalCircleciParser.g:4443:4: enumLiteral_3= ENUM
                    {
                    enumLiteral_3=(Token)match(input,ENUM,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getENUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPARAMETER_TYPESAccess().getENUMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4450:3: (enumLiteral_4= EXECUTOR )
                    {
                    // InternalCircleciParser.g:4450:3: (enumLiteral_4= EXECUTOR )
                    // InternalCircleciParser.g:4451:4: enumLiteral_4= EXECUTOR
                    {
                    enumLiteral_4=(Token)match(input,EXECUTOR,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getEXECUTOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPARAMETER_TYPESAccess().getEXECUTOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCircleciParser.g:4458:3: (enumLiteral_5= STEPS )
                    {
                    // InternalCircleciParser.g:4458:3: (enumLiteral_5= STEPS )
                    // InternalCircleciParser.g:4459:4: enumLiteral_5= STEPS
                    {
                    enumLiteral_5=(Token)match(input,STEPS,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getSTEPSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPARAMETER_TYPESAccess().getSTEPSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCircleciParser.g:4466:3: (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME )
                    {
                    // InternalCircleciParser.g:4466:3: (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME )
                    // InternalCircleciParser.g:4467:4: enumLiteral_6= ENVIRONMENT_VARIABLE_NAME
                    {
                    enumLiteral_6=(Token)match(input,ENVIRONMENT_VARIABLE_NAME,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getENVIRONMENT_VARIABLE_NAMEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPARAMETER_TYPESAccess().getENVIRONMENT_VARIABLE_NAMEEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "rulePARAMETER_TYPES"


    // $ANTLR start "ruleBRANCH_TYPE"
    // InternalCircleciParser.g:4477:1: ruleBRANCH_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) ) ;
    public final Enumerator ruleBRANCH_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4483:2: ( ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) ) )
            // InternalCircleciParser.g:4484:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) )
            {
            // InternalCircleciParser.g:4484:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==Only) ) {
                alt108=1;
            }
            else if ( (LA108_0==Ignore) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalCircleciParser.g:4485:3: (enumLiteral_0= Only )
                    {
                    // InternalCircleciParser.g:4485:3: (enumLiteral_0= Only )
                    // InternalCircleciParser.g:4486:4: enumLiteral_0= Only
                    {
                    enumLiteral_0=(Token)match(input,Only,FOLLOW_2); 

                    				current = grammarAccess.getBRANCH_TYPEAccess().getOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBRANCH_TYPEAccess().getOnlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4493:3: (enumLiteral_1= Ignore )
                    {
                    // InternalCircleciParser.g:4493:3: (enumLiteral_1= Ignore )
                    // InternalCircleciParser.g:4494:4: enumLiteral_1= Ignore
                    {
                    enumLiteral_1=(Token)match(input,Ignore,FOLLOW_2); 

                    				current = grammarAccess.getBRANCH_TYPEAccess().getIgnoreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBRANCH_TYPEAccess().getIgnoreEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBRANCH_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0001400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0A00000000000000L,0x0000003000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0A00000000000000L,0x0000083000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0A08000000000002L,0x0000083000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00010C08A10B0C00L,0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00010C08A10B0C00L,0x0000204000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1000000030000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000030000000L,0x0000200000000008L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x08010C0AA94B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000840000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x08010C08A94B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x08010C08A90B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00010C08A90B0C00L,0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0502000000000010L,0x0000000002004040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000010080000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010080000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000220000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006008006000L,0x0000000810200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007008006000L,0x0000200810200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000208018000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000208008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000200008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000080L,0x0000200010000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L,0x0000200000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002000000L,0x0000200010000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000002000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000010080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000200800000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000010010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000100000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000400000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000200050000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000200040000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4020000040000000L,0x0000200000000028L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4020000000000000L,0x0000200000000028L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000000L,0x0000220000000028L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000220000000028L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000028L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000140000L,0x0000000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000800000L,0x0000200000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0080800000000000L,0x0000000000041400L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000008004000L,0x0000200000200000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000008004000L,0x0000200000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000008000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000011000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0080800000000000L,0x0000000000441401L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x200000800C00C000L,0x0000200400200000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x200000800C00C000L,0x0000200400000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x200000800C008000L,0x0000200400000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x200000000C008000L,0x0000220400000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x000000000C008000L,0x0000220400000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x000000000C008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000040L});

}