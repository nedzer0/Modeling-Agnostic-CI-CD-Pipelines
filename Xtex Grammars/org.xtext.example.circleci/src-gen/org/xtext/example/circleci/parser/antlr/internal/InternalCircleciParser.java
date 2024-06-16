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
    // InternalCircleciParser.g:65:1: rulePipeline returns [EObject current=null] : ( (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ) ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )? (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE ) ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? ) ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_NEWLINE_1=null;
        Token lv_setup_2_0=null;
        Token this_NEWLINE_3=null;
        Token otherlv_4=null;
        Token this_NEWLINE_6=null;
        Token this_NEWLINE_8=null;
        Token this_NEWLINE_10=null;
        Token this_NEWLINE_12=null;
        Token this_NEWLINE_14=null;
        Token this_NEWLINE_16=null;
        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_orbs_7_0 = null;

        EObject lv_commands_9_0 = null;

        EObject lv_executors_11_0 = null;

        EObject lv_jobs_13_0 = null;

        EObject lv_workflows_15_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:71:2: ( ( (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ) ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )? (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE ) ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? ) ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? ) )
            // InternalCircleciParser.g:72:2: ( (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ) ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )? (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE ) ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? ) ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? )
            {
            // InternalCircleciParser.g:72:2: ( (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ) ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )? (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE ) ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? ) ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )? )
            // InternalCircleciParser.g:73:3: (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ) ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )? (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE ) ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )? ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )? ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )? ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? ) ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )?
            {
            // InternalCircleciParser.g:73:3: (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE )
            // InternalCircleciParser.g:74:4: otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE
            {
            otherlv_0=(Token)match(input,Pipeline,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getPipelineKeyword_0_0());
            			
            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            				newLeafNode(this_NEWLINE_1, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_0_1());
            			

            }

            // InternalCircleciParser.g:83:3: ( ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Setup) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCircleciParser.g:84:4: ( (lv_setup_2_0= Setup ) ) this_NEWLINE_3= RULE_NEWLINE
                    {
                    // InternalCircleciParser.g:84:4: ( (lv_setup_2_0= Setup ) )
                    // InternalCircleciParser.g:85:5: (lv_setup_2_0= Setup )
                    {
                    // InternalCircleciParser.g:85:5: (lv_setup_2_0= Setup )
                    // InternalCircleciParser.g:86:6: lv_setup_2_0= Setup
                    {
                    lv_setup_2_0=(Token)match(input,Setup,FOLLOW_3); 

                    						newLeafNode(lv_setup_2_0, grammarAccess.getPipelineAccess().getSetupSetupKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineRule());
                    						}
                    						setWithLastConsumed(current, "setup", lv_setup_2_0 != null, "setup");
                    					

                    }


                    }

                    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_5); 

                    				newLeafNode(this_NEWLINE_3, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalCircleciParser.g:103:3: (otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE )
            // InternalCircleciParser.g:104:4: otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) this_NEWLINE_6= RULE_NEWLINE
            {
            otherlv_4=(Token)match(input,Version,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getVersionKeyword_2_0());
            			
            // InternalCircleciParser.g:108:4: ( (lv_version_5_0= ruleEString ) )
            // InternalCircleciParser.g:109:5: (lv_version_5_0= ruleEString )
            {
            // InternalCircleciParser.g:109:5: (lv_version_5_0= ruleEString )
            // InternalCircleciParser.g:110:6: lv_version_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPipelineAccess().getVersionEStringParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_3);
            lv_version_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPipelineRule());
            						}
            						set(
            							current,
            							"version",
            							lv_version_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_7); 

            				newLeafNode(this_NEWLINE_6, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_2_2());
            			

            }

            // InternalCircleciParser.g:132:3: ( ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Orb) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCircleciParser.g:133:4: ( (lv_orbs_7_0= ruleOrb ) )+ (this_NEWLINE_8= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:133:4: ( (lv_orbs_7_0= ruleOrb ) )+
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
                    	    // InternalCircleciParser.g:134:5: (lv_orbs_7_0= ruleOrb )
                    	    {
                    	    // InternalCircleciParser.g:134:5: (lv_orbs_7_0= ruleOrb )
                    	    // InternalCircleciParser.g:135:6: lv_orbs_7_0= ruleOrb
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getOrbsOrbParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_orbs_7_0=ruleOrb();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"orbs",
                    	    							lv_orbs_7_0,
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

                    // InternalCircleciParser.g:152:4: (this_NEWLINE_8= RULE_NEWLINE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_NEWLINE) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCircleciParser.g:153:5: this_NEWLINE_8= RULE_NEWLINE
                            {
                            this_NEWLINE_8=(Token)match(input,RULE_NEWLINE,FOLLOW_7); 

                            					newLeafNode(this_NEWLINE_8, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_3_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:159:3: ( ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Command) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCircleciParser.g:160:4: ( (lv_commands_9_0= ruleCommand ) )+ (this_NEWLINE_10= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:160:4: ( (lv_commands_9_0= ruleCommand ) )+
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
                    	    // InternalCircleciParser.g:161:5: (lv_commands_9_0= ruleCommand )
                    	    {
                    	    // InternalCircleciParser.g:161:5: (lv_commands_9_0= ruleCommand )
                    	    // InternalCircleciParser.g:162:6: lv_commands_9_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getCommandsCommandParserRuleCall_4_0_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_commands_9_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commands",
                    	    							lv_commands_9_0,
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

                    // InternalCircleciParser.g:179:4: (this_NEWLINE_10= RULE_NEWLINE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_NEWLINE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCircleciParser.g:180:5: this_NEWLINE_10= RULE_NEWLINE
                            {
                            this_NEWLINE_10=(Token)match(input,RULE_NEWLINE,FOLLOW_7); 

                            					newLeafNode(this_NEWLINE_10, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:186:3: ( ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Machine||LA10_0==Docker||LA10_0==MacOs) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCircleciParser.g:187:4: ( (lv_executors_11_0= ruleExecutor ) )+ (this_NEWLINE_12= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:187:4: ( (lv_executors_11_0= ruleExecutor ) )+
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
                    	    // InternalCircleciParser.g:188:5: (lv_executors_11_0= ruleExecutor )
                    	    {
                    	    // InternalCircleciParser.g:188:5: (lv_executors_11_0= ruleExecutor )
                    	    // InternalCircleciParser.g:189:6: lv_executors_11_0= ruleExecutor
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getExecutorsExecutorParserRuleCall_5_0_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_executors_11_0=ruleExecutor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"executors",
                    	    							lv_executors_11_0,
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

                    // InternalCircleciParser.g:206:4: (this_NEWLINE_12= RULE_NEWLINE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_NEWLINE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCircleciParser.g:207:5: this_NEWLINE_12= RULE_NEWLINE
                            {
                            this_NEWLINE_12=(Token)match(input,RULE_NEWLINE,FOLLOW_7); 

                            					newLeafNode(this_NEWLINE_12, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_5_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:213:3: ( ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )? )
            // InternalCircleciParser.g:214:4: ( (lv_jobs_13_0= ruleJob ) )+ (this_NEWLINE_14= RULE_NEWLINE )?
            {
            // InternalCircleciParser.g:214:4: ( (lv_jobs_13_0= ruleJob ) )+
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
            	    // InternalCircleciParser.g:215:5: (lv_jobs_13_0= ruleJob )
            	    {
            	    // InternalCircleciParser.g:215:5: (lv_jobs_13_0= ruleJob )
            	    // InternalCircleciParser.g:216:6: lv_jobs_13_0= ruleJob
            	    {

            	    						newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_jobs_13_0=ruleJob();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobs",
            	    							lv_jobs_13_0,
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

            // InternalCircleciParser.g:233:4: (this_NEWLINE_14= RULE_NEWLINE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_NEWLINE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCircleciParser.g:234:5: this_NEWLINE_14= RULE_NEWLINE
                    {
                    this_NEWLINE_14=(Token)match(input,RULE_NEWLINE,FOLLOW_10); 

                    					newLeafNode(this_NEWLINE_14, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_6_1());
                    				

                    }
                    break;

            }


            }

            // InternalCircleciParser.g:240:3: ( ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Workflow) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCircleciParser.g:241:4: ( (lv_workflows_15_0= ruleWorkflow ) )+ (this_NEWLINE_16= RULE_NEWLINE )?
                    {
                    // InternalCircleciParser.g:241:4: ( (lv_workflows_15_0= ruleWorkflow ) )+
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
                    	    // InternalCircleciParser.g:242:5: (lv_workflows_15_0= ruleWorkflow )
                    	    {
                    	    // InternalCircleciParser.g:242:5: (lv_workflows_15_0= ruleWorkflow )
                    	    // InternalCircleciParser.g:243:6: lv_workflows_15_0= ruleWorkflow
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getWorkflowsWorkflowParserRuleCall_7_0_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_workflows_15_0=ruleWorkflow();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"workflows",
                    	    							lv_workflows_15_0,
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

                    // InternalCircleciParser.g:260:4: (this_NEWLINE_16= RULE_NEWLINE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_NEWLINE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCircleciParser.g:261:5: this_NEWLINE_16= RULE_NEWLINE
                            {
                            this_NEWLINE_16=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                            					newLeafNode(this_NEWLINE_16, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_7_1());
                            				

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
    // InternalCircleciParser.g:271:1: entryRuleExecutor returns [EObject current=null] : iv_ruleExecutor= ruleExecutor EOF ;
    public final EObject entryRuleExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutor = null;


        try {
            // InternalCircleciParser.g:271:49: (iv_ruleExecutor= ruleExecutor EOF )
            // InternalCircleciParser.g:272:2: iv_ruleExecutor= ruleExecutor EOF
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
    // InternalCircleciParser.g:278:1: ruleExecutor returns [EObject current=null] : (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker ) ;
    public final EObject ruleExecutor() throws RecognitionException {
        EObject current = null;

        EObject this_Machine_0 = null;

        EObject this_MacOs_1 = null;

        EObject this_Docker_2 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:284:2: ( (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker ) )
            // InternalCircleciParser.g:285:2: (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker )
            {
            // InternalCircleciParser.g:285:2: (this_Machine_0= ruleMachine | this_MacOs_1= ruleMacOs | this_Docker_2= ruleDocker )
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
                    // InternalCircleciParser.g:286:3: this_Machine_0= ruleMachine
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
                    // InternalCircleciParser.g:295:3: this_MacOs_1= ruleMacOs
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
                    // InternalCircleciParser.g:304:3: this_Docker_2= ruleDocker
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
    // InternalCircleciParser.g:316:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalCircleciParser.g:316:45: (iv_ruleStep= ruleStep EOF )
            // InternalCircleciParser.g:317:2: iv_ruleStep= ruleStep EOF
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
    // InternalCircleciParser.g:323:1: ruleStep returns [EObject current=null] : (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout ) ;
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
            // InternalCircleciParser.g:329:2: ( (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout ) )
            // InternalCircleciParser.g:330:2: (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout )
            {
            // InternalCircleciParser.g:330:2: (this_Run_0= ruleRun | this_RestoreCache_1= ruleRestoreCache | this_PersistToWorkspace_2= rulePersistToWorkspace | this_StoreArtifact_3= ruleStoreArtifact | this_StoreTestResults_4= ruleStoreTestResults | this_SetupRemoteDocker_5= ruleSetupRemoteDocker | this_AddSSHKeys_6= ruleAddSSHKeys | this_SaveCache_7= ruleSaveCache | this_AttachWorkspace_8= ruleAttachWorkspace | this_When_Unless_9= ruleWhen_Unless | this_Checkout_10= ruleCheckout )
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
                    // InternalCircleciParser.g:331:3: this_Run_0= ruleRun
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
                    // InternalCircleciParser.g:340:3: this_RestoreCache_1= ruleRestoreCache
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
                    // InternalCircleciParser.g:349:3: this_PersistToWorkspace_2= rulePersistToWorkspace
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
                    // InternalCircleciParser.g:358:3: this_StoreArtifact_3= ruleStoreArtifact
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
                    // InternalCircleciParser.g:367:3: this_StoreTestResults_4= ruleStoreTestResults
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
                    // InternalCircleciParser.g:376:3: this_SetupRemoteDocker_5= ruleSetupRemoteDocker
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
                    // InternalCircleciParser.g:385:3: this_AddSSHKeys_6= ruleAddSSHKeys
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
                    // InternalCircleciParser.g:394:3: this_SaveCache_7= ruleSaveCache
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
                    // InternalCircleciParser.g:403:3: this_AttachWorkspace_8= ruleAttachWorkspace
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
                    // InternalCircleciParser.g:412:3: this_When_Unless_9= ruleWhen_Unless
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
                    // InternalCircleciParser.g:421:3: this_Checkout_10= ruleCheckout
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
    // InternalCircleciParser.g:433:1: entryRuleOrb returns [EObject current=null] : iv_ruleOrb= ruleOrb EOF ;
    public final EObject entryRuleOrb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrb = null;


        try {
            // InternalCircleciParser.g:433:44: (iv_ruleOrb= ruleOrb EOF )
            // InternalCircleciParser.g:434:2: iv_ruleOrb= ruleOrb EOF
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
    // InternalCircleciParser.g:440:1: ruleOrb returns [EObject current=null] : (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:446:2: ( (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:447:2: (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:447:2: (otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:448:3: otherlv_0= Orb (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Orb,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOrbAccess().getOrbKeyword_0());
            		
            // InternalCircleciParser.g:452:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:453:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getOrbAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getOrbAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:461:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:462:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:462:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:463:6: lv_key_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:484:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCircleciParser.g:485:5: (lv_value_5_0= ruleEString )
            {
            // InternalCircleciParser.g:485:5: (lv_value_5_0= ruleEString )
            // InternalCircleciParser.g:486:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOrbAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:512:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCircleciParser.g:512:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCircleciParser.g:513:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalCircleciParser.g:519:1: ruleCommand returns [EObject current=null] : (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) ) ;
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
            // InternalCircleciParser.g:525:2: ( (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:526:2: (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:526:2: (otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END ) )
            // InternalCircleciParser.g:527:3: otherlv_0= Command (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalCircleciParser.g:531:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END )
            // InternalCircleciParser.g:532:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_parameters_6_0= ruleParameter ) )* ( (lv_steps_7_0= ruleStep ) )+ this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:540:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:541:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:541:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:542:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_17);
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

            // InternalCircleciParser.g:559:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCircleciParser.g:560:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:564:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalCircleciParser.g:565:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalCircleciParser.g:565:6: (lv_description_5_0= ruleEString )
                    // InternalCircleciParser.g:566:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_17);
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

            // InternalCircleciParser.g:584:4: ( (lv_parameters_6_0= ruleParameter ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Parameter) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCircleciParser.g:585:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalCircleciParser.g:585:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalCircleciParser.g:586:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getCommandAccess().getParametersParameterParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            // InternalCircleciParser.g:603:4: ( (lv_steps_7_0= ruleStep ) )+
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
            	    // InternalCircleciParser.g:604:5: (lv_steps_7_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:604:5: (lv_steps_7_0= ruleStep )
            	    // InternalCircleciParser.g:605:6: lv_steps_7_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getCommandAccess().getStepsStepParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // InternalCircleciParser.g:631:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalCircleciParser.g:631:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalCircleciParser.g:632:2: iv_ruleWorkflow= ruleWorkflow EOF
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
    // InternalCircleciParser.g:638:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) ) ;
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
            // InternalCircleciParser.g:644:2: ( (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) ) )
            // InternalCircleciParser.g:645:2: (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) )
            {
            // InternalCircleciParser.g:645:2: (otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END ) )
            // InternalCircleciParser.g:646:3: otherlv_0= Workflow (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,Workflow,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalCircleciParser.g:650:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END )
            // InternalCircleciParser.g:651:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ( (lv_triggers_6_0= ruleTrigger ) )* ( (lv_branches_7_0= ruleBranch ) )* ( (lv_when_unless_8_0= ruleWhen_Unless ) )? ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+ this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getWorkflowAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:659:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:660:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:660:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:661:6: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:682:4: ( (lv_version_5_0= ruleEString ) )
            // InternalCircleciParser.g:683:5: (lv_version_5_0= ruleEString )
            {
            // InternalCircleciParser.g:683:5: (lv_version_5_0= ruleEString )
            // InternalCircleciParser.g:684:6: lv_version_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWorkflowAccess().getVersionEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_19);
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

            // InternalCircleciParser.g:701:4: ( (lv_triggers_6_0= ruleTrigger ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Trigger) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCircleciParser.g:702:5: (lv_triggers_6_0= ruleTrigger )
            	    {
            	    // InternalCircleciParser.g:702:5: (lv_triggers_6_0= ruleTrigger )
            	    // InternalCircleciParser.g:703:6: lv_triggers_6_0= ruleTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getTriggersTriggerParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_19);
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

            // InternalCircleciParser.g:720:4: ( (lv_branches_7_0= ruleBranch ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Branch) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCircleciParser.g:721:5: (lv_branches_7_0= ruleBranch )
            	    {
            	    // InternalCircleciParser.g:721:5: (lv_branches_7_0= ruleBranch )
            	    // InternalCircleciParser.g:722:6: lv_branches_7_0= ruleBranch
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getBranchesBranchParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_19);
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

            // InternalCircleciParser.g:739:4: ( (lv_when_unless_8_0= ruleWhen_Unless ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==When_Unless) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCircleciParser.g:740:5: (lv_when_unless_8_0= ruleWhen_Unless )
                    {
                    // InternalCircleciParser.g:740:5: (lv_when_unless_8_0= ruleWhen_Unless )
                    // InternalCircleciParser.g:741:6: lv_when_unless_8_0= ruleWhen_Unless
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getWhen_unlessWhen_UnlessParserRuleCall_1_7_0());
                    					
                    pushFollow(FOLLOW_19);
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

            // InternalCircleciParser.g:758:4: ( (lv_jobworkflow_9_0= ruleJobWorkflow ) )+
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
            	    // InternalCircleciParser.g:759:5: (lv_jobworkflow_9_0= ruleJobWorkflow )
            	    {
            	    // InternalCircleciParser.g:759:5: (lv_jobworkflow_9_0= ruleJobWorkflow )
            	    // InternalCircleciParser.g:760:6: lv_jobworkflow_9_0= ruleJobWorkflow
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getJobworkflowJobWorkflowParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // InternalCircleciParser.g:786:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalCircleciParser.g:786:44: (iv_ruleJob= ruleJob EOF )
            // InternalCircleciParser.g:787:2: iv_ruleJob= ruleJob EOF
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
    // InternalCircleciParser.g:793:1: ruleJob returns [EObject current=null] : (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) ) ;
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
            // InternalCircleciParser.g:799:2: ( (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:800:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:800:2: (otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END ) )
            // InternalCircleciParser.g:801:3: otherlv_0= Job (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,Job,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getJobKeyword_0());
            		
            // InternalCircleciParser.g:805:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END )
            // InternalCircleciParser.g:806:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ) (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )? (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )? ( (lv_executors_8_0= ruleExecutor ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_parameters_10_0= ruleParameter ) )* ( (lv_steps_11_0= ruleStep ) )+ this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:810:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )
            // InternalCircleciParser.g:811:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getJobAccess().getNameKeyword_1_1_0());
            				
            // InternalCircleciParser.g:815:5: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:816:6: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:816:6: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:817:7: lv_name_3_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_1_1_1_0());
            						
            pushFollow(FOLLOW_21);
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

            // InternalCircleciParser.g:835:4: (otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Parallelism) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCircleciParser.g:836:5: otherlv_4= Parallelism ( (lv_parallelism_5_0= ruleEShort ) )
                    {
                    otherlv_4=(Token)match(input,Parallelism,FOLLOW_22); 

                    					newLeafNode(otherlv_4, grammarAccess.getJobAccess().getParallelismKeyword_1_2_0());
                    				
                    // InternalCircleciParser.g:840:5: ( (lv_parallelism_5_0= ruleEShort ) )
                    // InternalCircleciParser.g:841:6: (lv_parallelism_5_0= ruleEShort )
                    {
                    // InternalCircleciParser.g:841:6: (lv_parallelism_5_0= ruleEShort )
                    // InternalCircleciParser.g:842:7: lv_parallelism_5_0= ruleEShort
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getParallelismEShortParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_23);
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

            // InternalCircleciParser.g:860:4: (otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ReuseExecutor) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCircleciParser.g:861:5: otherlv_6= ReuseExecutor ( (lv_reuseExecutor_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,ReuseExecutor,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getJobAccess().getReuseExecutorKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:865:5: ( (lv_reuseExecutor_7_0= ruleEString ) )
                    // InternalCircleciParser.g:866:6: (lv_reuseExecutor_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:866:6: (lv_reuseExecutor_7_0= ruleEString )
                    // InternalCircleciParser.g:867:7: lv_reuseExecutor_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getJobAccess().getReuseExecutorEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_24);
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

            // InternalCircleciParser.g:885:4: ( (lv_executors_8_0= ruleExecutor ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Machine||LA27_0==Docker||LA27_0==MacOs) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCircleciParser.g:886:5: (lv_executors_8_0= ruleExecutor )
            	    {
            	    // InternalCircleciParser.g:886:5: (lv_executors_8_0= ruleExecutor )
            	    // InternalCircleciParser.g:887:6: lv_executors_8_0= ruleExecutor
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getExecutorsExecutorParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            // InternalCircleciParser.g:904:4: ( (lv_environments_9_0= ruleEnvironment ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Environment) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCircleciParser.g:905:5: (lv_environments_9_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:905:5: (lv_environments_9_0= ruleEnvironment )
            	    // InternalCircleciParser.g:906:6: lv_environments_9_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getEnvironmentsEnvironmentParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_25);
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

            // InternalCircleciParser.g:923:4: ( (lv_parameters_10_0= ruleParameter ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Parameter) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCircleciParser.g:924:5: (lv_parameters_10_0= ruleParameter )
            	    {
            	    // InternalCircleciParser.g:924:5: (lv_parameters_10_0= ruleParameter )
            	    // InternalCircleciParser.g:925:6: lv_parameters_10_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getParametersParameterParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            // InternalCircleciParser.g:942:4: ( (lv_steps_11_0= ruleStep ) )+
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
            	    // InternalCircleciParser.g:943:5: (lv_steps_11_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:943:5: (lv_steps_11_0= ruleStep )
            	    // InternalCircleciParser.g:944:6: lv_steps_11_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // InternalCircleciParser.g:970:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCircleciParser.g:970:47: (iv_ruleEString= ruleEString EOF )
            // InternalCircleciParser.g:971:2: iv_ruleEString= ruleEString EOF
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
    // InternalCircleciParser.g:977:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:983:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCircleciParser.g:984:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCircleciParser.g:984:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalCircleciParser.g:985:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:993:3: this_ID_1= RULE_ID
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
    // InternalCircleciParser.g:1004:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCircleciParser.g:1004:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCircleciParser.g:1005:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCircleciParser.g:1011:1: ruleParameter returns [EObject current=null] : (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1017:2: ( (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:1018:2: (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:1018:2: (otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END ) )
            // InternalCircleciParser.g:1019:3: otherlv_0= Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Parameter,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCircleciParser.g:1023:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END )
            // InternalCircleciParser.g:1024:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Type ( (lv_type_5_0= rulePARAMETER_TYPES ) ) (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )? (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:1032:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:1033:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:1033:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:1034:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,Type,FOLLOW_27); 

            				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_1_3());
            			
            // InternalCircleciParser.g:1055:4: ( (lv_type_5_0= rulePARAMETER_TYPES ) )
            // InternalCircleciParser.g:1056:5: (lv_type_5_0= rulePARAMETER_TYPES )
            {
            // InternalCircleciParser.g:1056:5: (lv_type_5_0= rulePARAMETER_TYPES )
            // InternalCircleciParser.g:1057:6: lv_type_5_0= rulePARAMETER_TYPES
            {

            						newCompositeNode(grammarAccess.getParameterAccess().getTypePARAMETER_TYPESEnumRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_28);
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

            // InternalCircleciParser.g:1074:4: (otherlv_6= Default ( (lv_default_7_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCircleciParser.g:1075:5: otherlv_6= Default ( (lv_default_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Default,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getDefaultKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:1079:5: ( (lv_default_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1080:6: (lv_default_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1080:6: (lv_default_7_0= ruleEString )
                    // InternalCircleciParser.g:1081:7: lv_default_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_29);
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

            // InternalCircleciParser.g:1099:4: (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Description) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCircleciParser.g:1100:5: otherlv_8= Description ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Description,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getDescriptionKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:1104:5: ( (lv_description_9_0= ruleEString ) )
                    // InternalCircleciParser.g:1105:6: (lv_description_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1105:6: (lv_description_9_0= ruleEString )
                    // InternalCircleciParser.g:1106:7: lv_description_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getDescriptionEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_30);
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

            // InternalCircleciParser.g:1124:4: (otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EnumValues) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCircleciParser.g:1125:5: otherlv_10= EnumValues ( (lv_enumValues_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,EnumValues,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getEnumValuesKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:1129:5: ( (lv_enumValues_11_0= ruleEString ) )
                    // InternalCircleciParser.g:1130:6: (lv_enumValues_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1130:6: (lv_enumValues_11_0= ruleEString )
                    // InternalCircleciParser.g:1131:7: lv_enumValues_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getEnumValuesEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_31);
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

                    // InternalCircleciParser.g:1148:5: (otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCircleciParser.g:1149:6: otherlv_12= Comma ( (lv_enumValues_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getCommaKeyword_1_7_2_0());
                    	    					
                    	    // InternalCircleciParser.g:1153:6: ( (lv_enumValues_13_0= ruleEString ) )
                    	    // InternalCircleciParser.g:1154:7: (lv_enumValues_13_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:1154:7: (lv_enumValues_13_0= ruleEString )
                    	    // InternalCircleciParser.g:1155:8: lv_enumValues_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getParameterAccess().getEnumValuesEStringParserRuleCall_1_7_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_31);
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
    // InternalCircleciParser.g:1183:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalCircleciParser.g:1183:44: (iv_ruleRun= ruleRun EOF )
            // InternalCircleciParser.g:1184:2: iv_ruleRun= ruleRun EOF
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
    // InternalCircleciParser.g:1190:1: ruleRun returns [EObject current=null] : (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1196:2: ( (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) ) )
            // InternalCircleciParser.g:1197:2: (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) )
            {
            // InternalCircleciParser.g:1197:2: (otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END ) )
            // InternalCircleciParser.g:1198:3: otherlv_0= Run (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END )
            {
            otherlv_0=(Token)match(input,Run,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
            		
            // InternalCircleciParser.g:1202:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END )
            // InternalCircleciParser.g:1203:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? ( (lv_background_4_0= Background ) )? (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )? (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )? (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )? (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* ( (lv_run_commands_14_0= ruleRunCommand ) )+ ( (lv_parameters_15_0= ruleParameters ) )* this_END_16= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getRunAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1207:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Name) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCircleciParser.g:1208:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getRunAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1212:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1213:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1213:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1214:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1232:4: ( (lv_background_4_0= Background ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Background) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCircleciParser.g:1233:5: (lv_background_4_0= Background )
                    {
                    // InternalCircleciParser.g:1233:5: (lv_background_4_0= Background )
                    // InternalCircleciParser.g:1234:6: lv_background_4_0= Background
                    {
                    lv_background_4_0=(Token)match(input,Background,FOLLOW_32); 

                    						newLeafNode(lv_background_4_0, grammarAccess.getRunAccess().getBackgroundBackgroundKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunRule());
                    						}
                    						setWithLastConsumed(current, "background", lv_background_4_0 != null, "background");
                    					

                    }


                    }
                    break;

            }

            // InternalCircleciParser.g:1246:4: (otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==When) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCircleciParser.g:1247:5: otherlv_5= When ( (lv_when_6_0= ruleWHEN_TYPE ) )
                    {
                    otherlv_5=(Token)match(input,When,FOLLOW_33); 

                    					newLeafNode(otherlv_5, grammarAccess.getRunAccess().getWhenKeyword_1_3_0());
                    				
                    // InternalCircleciParser.g:1251:5: ( (lv_when_6_0= ruleWHEN_TYPE ) )
                    // InternalCircleciParser.g:1252:6: (lv_when_6_0= ruleWHEN_TYPE )
                    {
                    // InternalCircleciParser.g:1252:6: (lv_when_6_0= ruleWHEN_TYPE )
                    // InternalCircleciParser.g:1253:7: lv_when_6_0= ruleWHEN_TYPE
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getWhenWHEN_TYPEEnumRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1271:4: (otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Working_directory) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCircleciParser.g:1272:5: otherlv_7= Working_directory ( (lv_working_directory_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getRunAccess().getWorking_directoryKeyword_1_4_0());
                    				
                    // InternalCircleciParser.g:1276:5: ( (lv_working_directory_8_0= ruleEString ) )
                    // InternalCircleciParser.g:1277:6: (lv_working_directory_8_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1277:6: (lv_working_directory_8_0= ruleEString )
                    // InternalCircleciParser.g:1278:7: lv_working_directory_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getWorking_directoryEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1296:4: (otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==No_output_timeout) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCircleciParser.g:1297:5: otherlv_9= No_output_timeout ( (lv_no_output_timeout_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,No_output_timeout,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getRunAccess().getNo_output_timeoutKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:1301:5: ( (lv_no_output_timeout_10_0= ruleEString ) )
                    // InternalCircleciParser.g:1302:6: (lv_no_output_timeout_10_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1302:6: (lv_no_output_timeout_10_0= ruleEString )
                    // InternalCircleciParser.g:1303:7: lv_no_output_timeout_10_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getNo_output_timeoutEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1321:4: (otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Shell) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCircleciParser.g:1322:5: otherlv_11= Shell ( (lv_shell_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getRunAccess().getShellKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:1326:5: ( (lv_shell_12_0= ruleEString ) )
                    // InternalCircleciParser.g:1327:6: (lv_shell_12_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1327:6: (lv_shell_12_0= ruleEString )
                    // InternalCircleciParser.g:1328:7: lv_shell_12_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRunAccess().getShellEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1346:4: ( (lv_environments_13_0= ruleEnvironment ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Environment) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCircleciParser.g:1347:5: (lv_environments_13_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:1347:5: (lv_environments_13_0= ruleEnvironment )
            	    // InternalCircleciParser.g:1348:6: lv_environments_13_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getEnvironmentsEnvironmentParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_32);
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

            // InternalCircleciParser.g:1365:4: ( (lv_run_commands_14_0= ruleRunCommand ) )+
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
            	    // InternalCircleciParser.g:1366:5: (lv_run_commands_14_0= ruleRunCommand )
            	    {
            	    // InternalCircleciParser.g:1366:5: (lv_run_commands_14_0= ruleRunCommand )
            	    // InternalCircleciParser.g:1367:6: lv_run_commands_14_0= ruleRunCommand
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getRun_commandsRunCommandParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_34);
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

            // InternalCircleciParser.g:1384:4: ( (lv_parameters_15_0= ruleParameters ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Parameters) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCircleciParser.g:1385:5: (lv_parameters_15_0= ruleParameters )
            	    {
            	    // InternalCircleciParser.g:1385:5: (lv_parameters_15_0= ruleParameters )
            	    // InternalCircleciParser.g:1386:6: lv_parameters_15_0= ruleParameters
            	    {

            	    						newCompositeNode(grammarAccess.getRunAccess().getParametersParametersParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalCircleciParser.g:1412:1: entryRuleRestoreCache returns [EObject current=null] : iv_ruleRestoreCache= ruleRestoreCache EOF ;
    public final EObject entryRuleRestoreCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestoreCache = null;


        try {
            // InternalCircleciParser.g:1412:53: (iv_ruleRestoreCache= ruleRestoreCache EOF )
            // InternalCircleciParser.g:1413:2: iv_ruleRestoreCache= ruleRestoreCache EOF
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
    // InternalCircleciParser.g:1419:1: ruleRestoreCache returns [EObject current=null] : (otherlv_0= RestoreCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) ;
    public final EObject ruleRestoreCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_key_5_0 = null;

        AntlrDatatypeRuleToken lv_keys_7_0 = null;

        AntlrDatatypeRuleToken lv_keys_9_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:1425:2: ( (otherlv_0= RestoreCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) )
            // InternalCircleciParser.g:1426:2: (otherlv_0= RestoreCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            {
            // InternalCircleciParser.g:1426:2: (otherlv_0= RestoreCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            // InternalCircleciParser.g:1427:3: otherlv_0= RestoreCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,RestoreCache,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRestoreCacheAccess().getRestoreCacheKeyword_0());
            		
            // InternalCircleciParser.g:1431:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            // InternalCircleciParser.g:1432:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Key ( (lv_key_5_0= ruleEString ) ) otherlv_6= Keys ( (lv_keys_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )* this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getRestoreCacheAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1436:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Name) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCircleciParser.g:1437:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getRestoreCacheAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1441:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1442:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1442:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1443:7: lv_name_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRestoreCacheAccess().getNameEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
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

            otherlv_4=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getRestoreCacheAccess().getKeyKeyword_1_2());
            			
            // InternalCircleciParser.g:1465:4: ( (lv_key_5_0= ruleEString ) )
            // InternalCircleciParser.g:1466:5: (lv_key_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1466:5: (lv_key_5_0= ruleEString )
            // InternalCircleciParser.g:1467:6: lv_key_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeyEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_37);
            lv_key_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_5_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,Keys,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getRestoreCacheAccess().getKeysKeyword_1_4());
            			
            // InternalCircleciParser.g:1488:4: ( (lv_keys_7_0= ruleEString ) )
            // InternalCircleciParser.g:1489:5: (lv_keys_7_0= ruleEString )
            {
            // InternalCircleciParser.g:1489:5: (lv_keys_7_0= ruleEString )
            // InternalCircleciParser.g:1490:6: lv_keys_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeysEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_31);
            lv_keys_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
            						}
            						add(
            							current,
            							"keys",
            							lv_keys_7_0,
            							"org.xtext.example.circleci.Circleci.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCircleciParser.g:1507:4: (otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Comma) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCircleciParser.g:1508:5: otherlv_8= Comma ( (lv_keys_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getRestoreCacheAccess().getCommaKeyword_1_6_0());
            	    				
            	    // InternalCircleciParser.g:1512:5: ( (lv_keys_9_0= ruleEString ) )
            	    // InternalCircleciParser.g:1513:6: (lv_keys_9_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:1513:6: (lv_keys_9_0= ruleEString )
            	    // InternalCircleciParser.g:1514:7: lv_keys_9_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getRestoreCacheAccess().getKeysEStringParserRuleCall_1_6_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
            	    lv_keys_9_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRestoreCacheRule());
            	    							}
            	    							add(
            	    								current,
            	    								"keys",
            	    								lv_keys_9_0,
            	    								"org.xtext.example.circleci.Circleci.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_10, grammarAccess.getRestoreCacheAccess().getENDTerminalRuleCall_1_7());
            			

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
    // InternalCircleciParser.g:1541:1: entryRulePersistToWorkspace returns [EObject current=null] : iv_rulePersistToWorkspace= rulePersistToWorkspace EOF ;
    public final EObject entryRulePersistToWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistToWorkspace = null;


        try {
            // InternalCircleciParser.g:1541:59: (iv_rulePersistToWorkspace= rulePersistToWorkspace EOF )
            // InternalCircleciParser.g:1542:2: iv_rulePersistToWorkspace= rulePersistToWorkspace EOF
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
    // InternalCircleciParser.g:1548:1: rulePersistToWorkspace returns [EObject current=null] : (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1554:2: ( (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) )
            // InternalCircleciParser.g:1555:2: (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            {
            // InternalCircleciParser.g:1555:2: (otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            // InternalCircleciParser.g:1556:3: otherlv_0= PersistToWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,PersistToWorkspace,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistToWorkspaceAccess().getPersistToWorkspaceKeyword_0());
            		
            // InternalCircleciParser.g:1560:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            // InternalCircleciParser.g:1561:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Root ( (lv_root_5_0= ruleEString ) ) otherlv_6= Paths ( (lv_paths_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )* this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPersistToWorkspaceAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1565:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Name) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCircleciParser.g:1566:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getPersistToWorkspaceAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1570:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1571:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1571:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1572:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:1594:4: ( (lv_root_5_0= ruleEString ) )
            // InternalCircleciParser.g:1595:5: (lv_root_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1595:5: (lv_root_5_0= ruleEString )
            // InternalCircleciParser.g:1596:6: lv_root_5_0= ruleEString
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
            			
            // InternalCircleciParser.g:1617:4: ( (lv_paths_7_0= ruleEString ) )
            // InternalCircleciParser.g:1618:5: (lv_paths_7_0= ruleEString )
            {
            // InternalCircleciParser.g:1618:5: (lv_paths_7_0= ruleEString )
            // InternalCircleciParser.g:1619:6: lv_paths_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getPathsEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_31);
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

            // InternalCircleciParser.g:1636:4: (otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Comma) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCircleciParser.g:1637:5: otherlv_8= Comma ( (lv_paths_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getPersistToWorkspaceAccess().getCommaKeyword_1_6_0());
            	    				
            	    // InternalCircleciParser.g:1641:5: ( (lv_paths_9_0= ruleEString ) )
            	    // InternalCircleciParser.g:1642:6: (lv_paths_9_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:1642:6: (lv_paths_9_0= ruleEString )
            	    // InternalCircleciParser.g:1643:7: lv_paths_9_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getPersistToWorkspaceAccess().getPathsEStringParserRuleCall_1_6_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
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
            	    break loop48;
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
    // InternalCircleciParser.g:1670:1: entryRuleStoreArtifact returns [EObject current=null] : iv_ruleStoreArtifact= ruleStoreArtifact EOF ;
    public final EObject entryRuleStoreArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreArtifact = null;


        try {
            // InternalCircleciParser.g:1670:54: (iv_ruleStoreArtifact= ruleStoreArtifact EOF )
            // InternalCircleciParser.g:1671:2: iv_ruleStoreArtifact= ruleStoreArtifact EOF
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
    // InternalCircleciParser.g:1677:1: ruleStoreArtifact returns [EObject current=null] : (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1683:2: ( (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:1684:2: (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:1684:2: (otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            // InternalCircleciParser.g:1685:3: otherlv_0= StoreArtifact (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,StoreArtifact,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreArtifactAccess().getStoreArtifactKeyword_0());
            		
            // InternalCircleciParser.g:1689:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            // InternalCircleciParser.g:1690:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )? this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStoreArtifactAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1694:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Name) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCircleciParser.g:1695:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getStoreArtifactAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1699:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1700:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1700:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1701:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:1723:4: ( (lv_path_5_0= ruleEString ) )
            // InternalCircleciParser.g:1724:5: (lv_path_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1724:5: (lv_path_5_0= ruleEString )
            // InternalCircleciParser.g:1725:6: lv_path_5_0= ruleEString
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

            // InternalCircleciParser.g:1742:4: (otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Destination) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCircleciParser.g:1743:5: otherlv_6= Destination ( (lv_destination_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Destination,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getStoreArtifactAccess().getDestinationKeyword_1_4_0());
                    				
                    // InternalCircleciParser.g:1747:5: ( (lv_destination_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1748:6: (lv_destination_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1748:6: (lv_destination_7_0= ruleEString )
                    // InternalCircleciParser.g:1749:7: lv_destination_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getStoreArtifactAccess().getDestinationEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:1776:1: entryRuleStoreTestResults returns [EObject current=null] : iv_ruleStoreTestResults= ruleStoreTestResults EOF ;
    public final EObject entryRuleStoreTestResults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreTestResults = null;


        try {
            // InternalCircleciParser.g:1776:57: (iv_ruleStoreTestResults= ruleStoreTestResults EOF )
            // InternalCircleciParser.g:1777:2: iv_ruleStoreTestResults= ruleStoreTestResults EOF
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
    // InternalCircleciParser.g:1783:1: ruleStoreTestResults returns [EObject current=null] : (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1789:2: ( (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:1790:2: (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:1790:2: (otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:1791:3: otherlv_0= StoreTestResults (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,StoreTestResults,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreTestResultsAccess().getStoreTestResultsKeyword_0());
            		
            // InternalCircleciParser.g:1795:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:1796:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Path ( (lv_path_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStoreTestResultsAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:1800:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Name) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCircleciParser.g:1801:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getStoreTestResultsAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:1805:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:1806:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1806:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:1807:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:1829:4: ( (lv_path_5_0= ruleEString ) )
            // InternalCircleciParser.g:1830:5: (lv_path_5_0= ruleEString )
            {
            // InternalCircleciParser.g:1830:5: (lv_path_5_0= ruleEString )
            // InternalCircleciParser.g:1831:6: lv_path_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStoreTestResultsAccess().getPathEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:1857:1: entryRuleSetupRemoteDocker returns [EObject current=null] : iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF ;
    public final EObject entryRuleSetupRemoteDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetupRemoteDocker = null;


        try {
            // InternalCircleciParser.g:1857:58: (iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF )
            // InternalCircleciParser.g:1858:2: iv_ruleSetupRemoteDocker= ruleSetupRemoteDocker EOF
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
    // InternalCircleciParser.g:1864:1: ruleSetupRemoteDocker returns [EObject current=null] : ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1870:2: ( ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:1871:2: ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:1871:2: ( () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END ) )
            // InternalCircleciParser.g:1872:3: () otherlv_1= SetupRemoteDocker (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            {
            // InternalCircleciParser.g:1872:3: ()
            // InternalCircleciParser.g:1873:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetupRemoteDockerAccess().getSetupRemoteDockerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SetupRemoteDocker,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSetupRemoteDockerAccess().getSetupRemoteDockerKeyword_1());
            		
            // InternalCircleciParser.g:1883:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END )
            // InternalCircleciParser.g:1884:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )? (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )? this_END_8= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getSetupRemoteDockerAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCircleciParser.g:1888:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Name) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCircleciParser.g:1889:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getSetupRemoteDockerAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCircleciParser.g:1893:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCircleciParser.g:1894:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1894:6: (lv_name_4_0= ruleEString )
                    // InternalCircleciParser.g:1895:7: lv_name_4_0= ruleEString
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

            // InternalCircleciParser.g:1913:4: ( (lv_docker_layer_caching_5_0= Docker_layer_caching ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Docker_layer_caching) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCircleciParser.g:1914:5: (lv_docker_layer_caching_5_0= Docker_layer_caching )
                    {
                    // InternalCircleciParser.g:1914:5: (lv_docker_layer_caching_5_0= Docker_layer_caching )
                    // InternalCircleciParser.g:1915:6: lv_docker_layer_caching_5_0= Docker_layer_caching
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

            // InternalCircleciParser.g:1927:4: (otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Version) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCircleciParser.g:1928:5: otherlv_6= Version ( (lv_version_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Version,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getSetupRemoteDockerAccess().getVersionKeyword_2_3_0());
                    				
                    // InternalCircleciParser.g:1932:5: ( (lv_version_7_0= ruleEString ) )
                    // InternalCircleciParser.g:1933:6: (lv_version_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1933:6: (lv_version_7_0= ruleEString )
                    // InternalCircleciParser.g:1934:7: lv_version_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getSetupRemoteDockerAccess().getVersionEStringParserRuleCall_2_3_1_0());
                    						
                    pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:1961:1: entryRuleAddSSHKeys returns [EObject current=null] : iv_ruleAddSSHKeys= ruleAddSSHKeys EOF ;
    public final EObject entryRuleAddSSHKeys() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddSSHKeys = null;


        try {
            // InternalCircleciParser.g:1961:51: (iv_ruleAddSSHKeys= ruleAddSSHKeys EOF )
            // InternalCircleciParser.g:1962:2: iv_ruleAddSSHKeys= ruleAddSSHKeys EOF
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
    // InternalCircleciParser.g:1968:1: ruleAddSSHKeys returns [EObject current=null] : ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) ) ;
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
            // InternalCircleciParser.g:1974:2: ( ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) ) )
            // InternalCircleciParser.g:1975:2: ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) )
            {
            // InternalCircleciParser.g:1975:2: ( () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END ) )
            // InternalCircleciParser.g:1976:3: () otherlv_1= AddSSHKeys (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END )
            {
            // InternalCircleciParser.g:1976:3: ()
            // InternalCircleciParser.g:1977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddSSHKeysAccess().getAddSSHKeysAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,AddSSHKeys,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAddSSHKeysAccess().getAddSSHKeysKeyword_1());
            		
            // InternalCircleciParser.g:1987:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END )
            // InternalCircleciParser.g:1988:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )? this_END_9= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_47); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getAddSSHKeysAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalCircleciParser.g:1992:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Name) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCircleciParser.g:1993:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getAddSSHKeysAccess().getNameKeyword_2_1_0());
                    				
                    // InternalCircleciParser.g:1997:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalCircleciParser.g:1998:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalCircleciParser.g:1998:6: (lv_name_4_0= ruleEString )
                    // InternalCircleciParser.g:1999:7: lv_name_4_0= ruleEString
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

            // InternalCircleciParser.g:2017:4: (otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Fingerprints) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCircleciParser.g:2018:5: otherlv_5= Fingerprints ( (lv_fingerprints_6_0= ruleEString ) ) (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) )
                    {
                    otherlv_5=(Token)match(input,Fingerprints,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getAddSSHKeysAccess().getFingerprintsKeyword_2_2_0());
                    				
                    // InternalCircleciParser.g:2022:5: ( (lv_fingerprints_6_0= ruleEString ) )
                    // InternalCircleciParser.g:2023:6: (lv_fingerprints_6_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2023:6: (lv_fingerprints_6_0= ruleEString )
                    // InternalCircleciParser.g:2024:7: lv_fingerprints_6_0= ruleEString
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

                    // InternalCircleciParser.g:2041:5: (otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) ) )
                    // InternalCircleciParser.g:2042:6: otherlv_7= Comma ( (lv_fingerprints_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Comma,FOLLOW_6); 

                    						newLeafNode(otherlv_7, grammarAccess.getAddSSHKeysAccess().getCommaKeyword_2_2_2_0());
                    					
                    // InternalCircleciParser.g:2046:6: ( (lv_fingerprints_8_0= ruleEString ) )
                    // InternalCircleciParser.g:2047:7: (lv_fingerprints_8_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2047:7: (lv_fingerprints_8_0= ruleEString )
                    // InternalCircleciParser.g:2048:8: lv_fingerprints_8_0= ruleEString
                    {

                    								newCompositeNode(grammarAccess.getAddSSHKeysAccess().getFingerprintsEStringParserRuleCall_2_2_2_1_0());
                    							
                    pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2076:1: entryRuleSaveCache returns [EObject current=null] : iv_ruleSaveCache= ruleSaveCache EOF ;
    public final EObject entryRuleSaveCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaveCache = null;


        try {
            // InternalCircleciParser.g:2076:50: (iv_ruleSaveCache= ruleSaveCache EOF )
            // InternalCircleciParser.g:2077:2: iv_ruleSaveCache= ruleSaveCache EOF
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
    // InternalCircleciParser.g:2083:1: ruleSaveCache returns [EObject current=null] : (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2089:2: ( (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:2090:2: (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:2090:2: (otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END ) )
            // InternalCircleciParser.g:2091:3: otherlv_0= SaveCache (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,SaveCache,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveCacheAccess().getSaveCacheKeyword_0());
            		
            // InternalCircleciParser.g:2095:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END )
            // InternalCircleciParser.g:2096:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Paths ( (lv_paths_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )* otherlv_8= Key ( (lv_key_9_0= ruleEString ) ) (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )? this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getSaveCacheAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2100:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Name) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCircleciParser.g:2101:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getSaveCacheAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2105:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2106:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2106:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2107:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:2129:4: ( (lv_paths_5_0= ruleEString ) )
            // InternalCircleciParser.g:2130:5: (lv_paths_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2130:5: (lv_paths_5_0= ruleEString )
            // InternalCircleciParser.g:2131:6: lv_paths_5_0= ruleEString
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

            // InternalCircleciParser.g:2148:4: (otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Comma) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCircleciParser.g:2149:5: otherlv_6= Comma ( (lv_paths_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSaveCacheAccess().getCommaKeyword_1_4_0());
            	    				
            	    // InternalCircleciParser.g:2153:5: ( (lv_paths_7_0= ruleEString ) )
            	    // InternalCircleciParser.g:2154:6: (lv_paths_7_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:2154:6: (lv_paths_7_0= ruleEString )
            	    // InternalCircleciParser.g:2155:7: lv_paths_7_0= ruleEString
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
            	    break loop58;
                }
            } while (true);

            otherlv_8=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getSaveCacheAccess().getKeyKeyword_1_5());
            			
            // InternalCircleciParser.g:2177:4: ( (lv_key_9_0= ruleEString ) )
            // InternalCircleciParser.g:2178:5: (lv_key_9_0= ruleEString )
            {
            // InternalCircleciParser.g:2178:5: (lv_key_9_0= ruleEString )
            // InternalCircleciParser.g:2179:6: lv_key_9_0= ruleEString
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

            // InternalCircleciParser.g:2196:4: (otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==When) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCircleciParser.g:2197:5: otherlv_10= When ( (lv_when_11_0= ruleWHEN_TYPE ) )
                    {
                    otherlv_10=(Token)match(input,When,FOLLOW_33); 

                    					newLeafNode(otherlv_10, grammarAccess.getSaveCacheAccess().getWhenKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:2201:5: ( (lv_when_11_0= ruleWHEN_TYPE ) )
                    // InternalCircleciParser.g:2202:6: (lv_when_11_0= ruleWHEN_TYPE )
                    {
                    // InternalCircleciParser.g:2202:6: (lv_when_11_0= ruleWHEN_TYPE )
                    // InternalCircleciParser.g:2203:7: lv_when_11_0= ruleWHEN_TYPE
                    {

                    							newCompositeNode(grammarAccess.getSaveCacheAccess().getWhenWHEN_TYPEEnumRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2230:1: entryRuleAttachWorkspace returns [EObject current=null] : iv_ruleAttachWorkspace= ruleAttachWorkspace EOF ;
    public final EObject entryRuleAttachWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachWorkspace = null;


        try {
            // InternalCircleciParser.g:2230:56: (iv_ruleAttachWorkspace= ruleAttachWorkspace EOF )
            // InternalCircleciParser.g:2231:2: iv_ruleAttachWorkspace= ruleAttachWorkspace EOF
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
    // InternalCircleciParser.g:2237:1: ruleAttachWorkspace returns [EObject current=null] : (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2243:2: ( (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2244:2: (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2244:2: (otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2245:3: otherlv_0= AttachWorkspace (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,AttachWorkspace,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAttachWorkspaceAccess().getAttachWorkspaceKeyword_0());
            		
            // InternalCircleciParser.g:2249:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2250:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= At ( (lv_at_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getAttachWorkspaceAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2254:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Name) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCircleciParser.g:2255:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getAttachWorkspaceAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2259:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2260:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2260:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2261:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:2283:4: ( (lv_at_5_0= ruleEString ) )
            // InternalCircleciParser.g:2284:5: (lv_at_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2284:5: (lv_at_5_0= ruleEString )
            // InternalCircleciParser.g:2285:6: lv_at_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAttachWorkspaceAccess().getAtEStringParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2311:1: entryRuleWhen_Unless returns [EObject current=null] : iv_ruleWhen_Unless= ruleWhen_Unless EOF ;
    public final EObject entryRuleWhen_Unless() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen_Unless = null;


        try {
            // InternalCircleciParser.g:2311:52: (iv_ruleWhen_Unless= ruleWhen_Unless EOF )
            // InternalCircleciParser.g:2312:2: iv_ruleWhen_Unless= ruleWhen_Unless EOF
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
    // InternalCircleciParser.g:2318:1: ruleWhen_Unless returns [EObject current=null] : (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2324:2: ( (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:2325:2: (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:2325:2: (otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END ) )
            // InternalCircleciParser.g:2326:3: otherlv_0= When_Unless (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,When_Unless,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWhen_UnlessAccess().getWhen_UnlessKeyword_0());
            		
            // InternalCircleciParser.g:2330:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END )
            // InternalCircleciParser.g:2331:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= Condition ( (lv_condition_5_0= ruleEString ) ) otherlv_6= When_step (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END ) (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:2335:4: (otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Name) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCircleciParser.g:2336:5: otherlv_2= Name ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getWhen_UnlessAccess().getNameKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:2340:5: ( (lv_name_3_0= ruleEString ) )
                    // InternalCircleciParser.g:2341:6: (lv_name_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2341:6: (lv_name_3_0= ruleEString )
                    // InternalCircleciParser.g:2342:7: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:2364:4: ( (lv_condition_5_0= ruleEString ) )
            // InternalCircleciParser.g:2365:5: (lv_condition_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2365:5: (lv_condition_5_0= ruleEString )
            // InternalCircleciParser.g:2366:6: lv_condition_5_0= ruleEString
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

            otherlv_6=(Token)match(input,When_step,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getWhen_UnlessAccess().getWhen_stepKeyword_1_4());
            			
            // InternalCircleciParser.g:2387:4: (this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END )
            // InternalCircleciParser.g:2388:5: this_BEGIN_7= RULE_BEGIN ( (lv_when_step_8_0= ruleStep ) )+ this_END_9= RULE_END
            {
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            					newLeafNode(this_BEGIN_7, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_5_0());
            				
            // InternalCircleciParser.g:2392:5: ( (lv_when_step_8_0= ruleStep ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=PersistToWorkspace && LA62_0<=SetupRemoteDocker)||(LA62_0>=StoreTestResults && LA62_0<=AttachWorkspace)||LA62_0==StoreArtifact||LA62_0==RestoreCache||LA62_0==When_Unless||LA62_0==AddSSHKeys||LA62_0==SaveCache||LA62_0==Checkout||LA62_0==Run) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCircleciParser.g:2393:6: (lv_when_step_8_0= ruleStep )
            	    {
            	    // InternalCircleciParser.g:2393:6: (lv_when_step_8_0= ruleStep )
            	    // InternalCircleciParser.g:2394:7: lv_when_step_8_0= ruleStep
            	    {

            	    							newCompositeNode(grammarAccess.getWhen_UnlessAccess().getWhen_stepStepParserRuleCall_1_5_1_0());
            	    						
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_58); 

            					newLeafNode(this_END_9, grammarAccess.getWhen_UnlessAccess().getENDTerminalRuleCall_1_5_2());
            				

            }

            // InternalCircleciParser.g:2416:4: (otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Unless_step) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCircleciParser.g:2417:5: otherlv_10= Unless_step (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END )
                    {
                    otherlv_10=(Token)match(input,Unless_step,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getWhen_UnlessAccess().getUnless_stepKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:2421:5: (this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END )
                    // InternalCircleciParser.g:2422:6: this_BEGIN_11= RULE_BEGIN ( (lv_unless_step_12_0= ruleStep ) )+ this_END_13= RULE_END
                    {
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    						newLeafNode(this_BEGIN_11, grammarAccess.getWhen_UnlessAccess().getBEGINTerminalRuleCall_1_6_1_0());
                    					
                    // InternalCircleciParser.g:2426:6: ( (lv_unless_step_12_0= ruleStep ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=PersistToWorkspace && LA63_0<=SetupRemoteDocker)||(LA63_0>=StoreTestResults && LA63_0<=AttachWorkspace)||LA63_0==StoreArtifact||LA63_0==RestoreCache||LA63_0==When_Unless||LA63_0==AddSSHKeys||LA63_0==SaveCache||LA63_0==Checkout||LA63_0==Run) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalCircleciParser.g:2427:7: (lv_unless_step_12_0= ruleStep )
                    	    {
                    	    // InternalCircleciParser.g:2427:7: (lv_unless_step_12_0= ruleStep )
                    	    // InternalCircleciParser.g:2428:8: lv_unless_step_12_0= ruleStep
                    	    {

                    	    								newCompositeNode(grammarAccess.getWhen_UnlessAccess().getUnless_stepStepParserRuleCall_1_6_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
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
                    	    if ( cnt63 >= 1 ) break loop63;
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_15); 

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
    // InternalCircleciParser.g:2460:1: entryRuleCheckout returns [EObject current=null] : iv_ruleCheckout= ruleCheckout EOF ;
    public final EObject entryRuleCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckout = null;


        try {
            // InternalCircleciParser.g:2460:49: (iv_ruleCheckout= ruleCheckout EOF )
            // InternalCircleciParser.g:2461:2: iv_ruleCheckout= ruleCheckout EOF
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
    // InternalCircleciParser.g:2467:1: ruleCheckout returns [EObject current=null] : ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? ) ;
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
            // InternalCircleciParser.g:2473:2: ( ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? ) )
            // InternalCircleciParser.g:2474:2: ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? )
            {
            // InternalCircleciParser.g:2474:2: ( () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )? )
            // InternalCircleciParser.g:2475:3: () otherlv_1= Checkout (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )?
            {
            // InternalCircleciParser.g:2475:3: ()
            // InternalCircleciParser.g:2476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckoutAccess().getCheckoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Checkout,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckoutAccess().getCheckoutKeyword_1());
            		
            // InternalCircleciParser.g:2486:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_BEGIN) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCircleciParser.g:2487:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )? this_END_7= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getCheckoutAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalCircleciParser.g:2491:4: (otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==Name) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalCircleciParser.g:2492:5: otherlv_3= Name ( (lv_name_4_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getCheckoutAccess().getNameKeyword_2_1_0());
                            				
                            // InternalCircleciParser.g:2496:5: ( (lv_name_4_0= ruleEString ) )
                            // InternalCircleciParser.g:2497:6: (lv_name_4_0= ruleEString )
                            {
                            // InternalCircleciParser.g:2497:6: (lv_name_4_0= ruleEString )
                            // InternalCircleciParser.g:2498:7: lv_name_4_0= ruleEString
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

                    // InternalCircleciParser.g:2516:4: (otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==Path) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalCircleciParser.g:2517:5: otherlv_5= Path ( (lv_path_6_0= ruleEString ) )
                            {
                            otherlv_5=(Token)match(input,Path,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getCheckoutAccess().getPathKeyword_2_2_0());
                            				
                            // InternalCircleciParser.g:2521:5: ( (lv_path_6_0= ruleEString ) )
                            // InternalCircleciParser.g:2522:6: (lv_path_6_0= ruleEString )
                            {
                            // InternalCircleciParser.g:2522:6: (lv_path_6_0= ruleEString )
                            // InternalCircleciParser.g:2523:7: lv_path_6_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getCheckoutAccess().getPathEStringParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2550:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCircleciParser.g:2550:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCircleciParser.g:2551:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalCircleciParser.g:2557:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2563:2: ( (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2564:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2564:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2565:3: otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalCircleciParser.g:2569:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2570:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEnvironmentAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:2578:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:2579:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2579:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:2580:6: lv_key_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:2601:4: ( (lv_value_5_0= ruleEString ) )
            // InternalCircleciParser.g:2602:5: (lv_value_5_0= ruleEString )
            {
            // InternalCircleciParser.g:2602:5: (lv_value_5_0= ruleEString )
            // InternalCircleciParser.g:2603:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2629:1: entryRuleRunCommand returns [EObject current=null] : iv_ruleRunCommand= ruleRunCommand EOF ;
    public final EObject entryRuleRunCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunCommand = null;


        try {
            // InternalCircleciParser.g:2629:51: (iv_ruleRunCommand= ruleRunCommand EOF )
            // InternalCircleciParser.g:2630:2: iv_ruleRunCommand= ruleRunCommand EOF
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
    // InternalCircleciParser.g:2636:1: ruleRunCommand returns [EObject current=null] : ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleRunCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2642:2: ( ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            // InternalCircleciParser.g:2643:2: ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            {
            // InternalCircleciParser.g:2643:2: ( () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            // InternalCircleciParser.g:2644:3: () otherlv_1= RunCommand (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            {
            // InternalCircleciParser.g:2644:3: ()
            // InternalCircleciParser.g:2645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunCommandAccess().getRunCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RunCommand,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRunCommandAccess().getRunCommandKeyword_1());
            		
            // InternalCircleciParser.g:2655:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalCircleciParser.g:2656:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getRunCommandAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getRunCommandAccess().getNameKeyword_2_1());
            			
            // InternalCircleciParser.g:2664:4: ( (lv_name_4_0= ruleEString ) )
            // InternalCircleciParser.g:2665:5: (lv_name_4_0= ruleEString )
            {
            // InternalCircleciParser.g:2665:5: (lv_name_4_0= ruleEString )
            // InternalCircleciParser.g:2666:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRunCommandAccess().getNameEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2692:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalCircleciParser.g:2692:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalCircleciParser.g:2693:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalCircleciParser.g:2699:1: ruleParameters returns [EObject current=null] : (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2705:2: ( (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCircleciParser.g:2706:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCircleciParser.g:2706:2: (otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCircleciParser.g:2707:3: otherlv_0= Parameters (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Parameters,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getParametersKeyword_0());
            		
            // InternalCircleciParser.g:2711:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCircleciParser.g:2712:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter_1 ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getParametersAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Parameter_1,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getParameterKeyword_1_1());
            			
            // InternalCircleciParser.g:2720:4: ( (lv_parameter_3_0= ruleEString ) )
            // InternalCircleciParser.g:2721:5: (lv_parameter_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2721:5: (lv_parameter_3_0= ruleEString )
            // InternalCircleciParser.g:2722:6: lv_parameter_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getParametersAccess().getParameterEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2748:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalCircleciParser.g:2748:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalCircleciParser.g:2749:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalCircleciParser.g:2755:1: ruleTrigger returns [EObject current=null] : (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_cron_3_0 = null;



        	enterRule();

        try {
            // InternalCircleciParser.g:2761:2: ( (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalCircleciParser.g:2762:2: (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalCircleciParser.g:2762:2: (otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalCircleciParser.g:2763:3: otherlv_0= Trigger (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Trigger,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalCircleciParser.g:2767:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalCircleciParser.g:2768:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Cron ( (lv_cron_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_63); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTriggerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Cron,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getCronKeyword_1_1());
            			
            // InternalCircleciParser.g:2776:4: ( (lv_cron_3_0= ruleEString ) )
            // InternalCircleciParser.g:2777:5: (lv_cron_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2777:5: (lv_cron_3_0= ruleEString )
            // InternalCircleciParser.g:2778:6: lv_cron_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTriggerAccess().getCronEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2804:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCircleciParser.g:2804:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCircleciParser.g:2805:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCircleciParser.g:2811:1: ruleBranch returns [EObject current=null] : (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2817:2: ( (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:2818:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:2818:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:2819:3: otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Branch,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            // InternalCircleciParser.g:2823:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:2824:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Branch_1 ( (lv_branch_5_0= ruleBRANCH_TYPE ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBranchAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:2832:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:2833:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:2833:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:2834:6: lv_name_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:2855:4: ( (lv_branch_5_0= ruleBRANCH_TYPE ) )
            // InternalCircleciParser.g:2856:5: (lv_branch_5_0= ruleBRANCH_TYPE )
            {
            // InternalCircleciParser.g:2856:5: (lv_branch_5_0= ruleBRANCH_TYPE )
            // InternalCircleciParser.g:2857:6: lv_branch_5_0= ruleBRANCH_TYPE
            {

            						newCompositeNode(grammarAccess.getBranchAccess().getBranchBRANCH_TYPEEnumRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:2883:1: entryRuleJobWorkflow returns [EObject current=null] : iv_ruleJobWorkflow= ruleJobWorkflow EOF ;
    public final EObject entryRuleJobWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobWorkflow = null;


        try {
            // InternalCircleciParser.g:2883:52: (iv_ruleJobWorkflow= ruleJobWorkflow EOF )
            // InternalCircleciParser.g:2884:2: iv_ruleJobWorkflow= ruleJobWorkflow EOF
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
    // InternalCircleciParser.g:2890:1: ruleJobWorkflow returns [EObject current=null] : ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) ) ;
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
            // InternalCircleciParser.g:2896:2: ( ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) ) )
            // InternalCircleciParser.g:2897:2: ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) )
            {
            // InternalCircleciParser.g:2897:2: ( () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END ) )
            // InternalCircleciParser.g:2898:3: () otherlv_1= JobWorkflow (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END )
            {
            // InternalCircleciParser.g:2898:3: ()
            // InternalCircleciParser.g:2899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJobWorkflowAccess().getJobWorkflowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,JobWorkflow,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getJobWorkflowAccess().getJobWorkflowKeyword_1());
            		
            // InternalCircleciParser.g:2909:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END )
            // InternalCircleciParser.g:2910:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) ( (lv_approvalJob_5_0= ApprovalJob ) )? (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )? (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )? ( (lv_branches_14_0= ruleBranch ) )* ( (lv_matrix_15_0= ruleMatrix ) )? this_END_16= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getJobWorkflowAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getJobWorkflowAccess().getNameKeyword_2_1());
            			
            // InternalCircleciParser.g:2918:4: ( (lv_name_4_0= ruleEString ) )
            // InternalCircleciParser.g:2919:5: (lv_name_4_0= ruleEString )
            {
            // InternalCircleciParser.g:2919:5: (lv_name_4_0= ruleEString )
            // InternalCircleciParser.g:2920:6: lv_name_4_0= ruleEString
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

            // InternalCircleciParser.g:2937:4: ( (lv_approvalJob_5_0= ApprovalJob ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ApprovalJob) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCircleciParser.g:2938:5: (lv_approvalJob_5_0= ApprovalJob )
                    {
                    // InternalCircleciParser.g:2938:5: (lv_approvalJob_5_0= ApprovalJob )
                    // InternalCircleciParser.g:2939:6: lv_approvalJob_5_0= ApprovalJob
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

            // InternalCircleciParser.g:2951:4: (otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Requires) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCircleciParser.g:2952:5: otherlv_6= Requires ( (lv_requires_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,Requires,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getJobWorkflowAccess().getRequiresKeyword_2_4_0());
                    				
                    // InternalCircleciParser.g:2956:5: ( (lv_requires_7_0= ruleEString ) )
                    // InternalCircleciParser.g:2957:6: (lv_requires_7_0= ruleEString )
                    {
                    // InternalCircleciParser.g:2957:6: (lv_requires_7_0= ruleEString )
                    // InternalCircleciParser.g:2958:7: lv_requires_7_0= ruleEString
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

                    // InternalCircleciParser.g:2975:5: (otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==Comma) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalCircleciParser.g:2976:6: otherlv_8= Comma ( (lv_requires_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getJobWorkflowAccess().getCommaKeyword_2_4_2_0());
                    	    					
                    	    // InternalCircleciParser.g:2980:6: ( (lv_requires_9_0= ruleEString ) )
                    	    // InternalCircleciParser.g:2981:7: (lv_requires_9_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:2981:7: (lv_requires_9_0= ruleEString )
                    	    // InternalCircleciParser.g:2982:8: lv_requires_9_0= ruleEString
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3001:4: (otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Context) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCircleciParser.g:3002:5: otherlv_10= Context ( (lv_context_11_0= ruleEString ) ) (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,Context,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getJobWorkflowAccess().getContextKeyword_2_5_0());
                    				
                    // InternalCircleciParser.g:3006:5: ( (lv_context_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3007:6: (lv_context_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3007:6: (lv_context_11_0= ruleEString )
                    // InternalCircleciParser.g:3008:7: lv_context_11_0= ruleEString
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

                    // InternalCircleciParser.g:3025:5: (otherlv_12= Comma ( (lv_context_13_0= ruleEString ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==Comma) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3026:6: otherlv_12= Comma ( (lv_context_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getJobWorkflowAccess().getCommaKeyword_2_5_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3030:6: ( (lv_context_13_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3031:7: (lv_context_13_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3031:7: (lv_context_13_0= ruleEString )
                    	    // InternalCircleciParser.g:3032:8: lv_context_13_0= ruleEString
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
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3051:4: ( (lv_branches_14_0= ruleBranch ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==Branch) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalCircleciParser.g:3052:5: (lv_branches_14_0= ruleBranch )
            	    {
            	    // InternalCircleciParser.g:3052:5: (lv_branches_14_0= ruleBranch )
            	    // InternalCircleciParser.g:3053:6: lv_branches_14_0= ruleBranch
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
            	    break loop73;
                }
            } while (true);

            // InternalCircleciParser.g:3070:4: ( (lv_matrix_15_0= ruleMatrix ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Matrix) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCircleciParser.g:3071:5: (lv_matrix_15_0= ruleMatrix )
                    {
                    // InternalCircleciParser.g:3071:5: (lv_matrix_15_0= ruleMatrix )
                    // InternalCircleciParser.g:3072:6: lv_matrix_15_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getJobWorkflowAccess().getMatrixMatrixParserRuleCall_2_7_0());
                    					
                    pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:3098:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalCircleciParser.g:3098:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalCircleciParser.g:3099:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalCircleciParser.g:3105:1: ruleMatrix returns [EObject current=null] : (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) ) ;
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
            // InternalCircleciParser.g:3111:2: ( (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) ) )
            // InternalCircleciParser.g:3112:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) )
            {
            // InternalCircleciParser.g:3112:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END ) )
            // InternalCircleciParser.g:3113:3: otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
            		
            // InternalCircleciParser.g:3117:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END )
            // InternalCircleciParser.g:3118:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )? otherlv_8= Matrix_params (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END ) this_END_12= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_71); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalCircleciParser.g:3122:4: (otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Alias) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCircleciParser.g:3123:5: otherlv_2= Alias ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Alias,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getMatrixAccess().getAliasKeyword_1_1_0());
                    				
                    // InternalCircleciParser.g:3127:5: ( (lv_alias_3_0= ruleEString ) )
                    // InternalCircleciParser.g:3128:6: (lv_alias_3_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3128:6: (lv_alias_3_0= ruleEString )
                    // InternalCircleciParser.g:3129:7: lv_alias_3_0= ruleEString
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

            // InternalCircleciParser.g:3147:4: (otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Matrix_exclude) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCircleciParser.g:3148:5: otherlv_4= Matrix_exclude (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Matrix_exclude,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getMatrix_excludeKeyword_1_2_0());
                    				
                    // InternalCircleciParser.g:3152:5: (this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END )
                    // InternalCircleciParser.g:3153:6: this_BEGIN_5= RULE_BEGIN ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_73); 

                    						newLeafNode(this_BEGIN_5, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    					
                    // InternalCircleciParser.g:3157:6: ( (lv_matrix_exclude_6_0= ruleMatrixParams ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==MatrixParams) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3158:7: (lv_matrix_exclude_6_0= ruleMatrixParams )
                    	    {
                    	    // InternalCircleciParser.g:3158:7: (lv_matrix_exclude_6_0= ruleMatrixParams )
                    	    // InternalCircleciParser.g:3159:8: lv_matrix_exclude_6_0= ruleMatrixParams
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
                    	    break loop76;
                        }
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_74); 

                    						newLeafNode(this_END_7, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_2_1_2());
                    					

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Matrix_params,FOLLOW_12); 

            				newLeafNode(otherlv_8, grammarAccess.getMatrixAccess().getMatrix_paramsKeyword_1_3());
            			
            // InternalCircleciParser.g:3186:4: (this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END )
            // InternalCircleciParser.g:3187:5: this_BEGIN_9= RULE_BEGIN ( (lv_matrix_params_10_0= ruleMatrixParams ) )+ this_END_11= RULE_END
            {
            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_75); 

            					newLeafNode(this_BEGIN_9, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_4_0());
            				
            // InternalCircleciParser.g:3191:5: ( (lv_matrix_params_10_0= ruleMatrixParams ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==MatrixParams) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalCircleciParser.g:3192:6: (lv_matrix_params_10_0= ruleMatrixParams )
            	    {
            	    // InternalCircleciParser.g:3192:6: (lv_matrix_params_10_0= ruleMatrixParams )
            	    // InternalCircleciParser.g:3193:7: lv_matrix_params_10_0= ruleMatrixParams
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
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);

            this_END_11=(Token)match(input,RULE_END,FOLLOW_15); 

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
    // InternalCircleciParser.g:3224:1: entryRuleMatrixParams returns [EObject current=null] : iv_ruleMatrixParams= ruleMatrixParams EOF ;
    public final EObject entryRuleMatrixParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixParams = null;


        try {
            // InternalCircleciParser.g:3224:53: (iv_ruleMatrixParams= ruleMatrixParams EOF )
            // InternalCircleciParser.g:3225:2: iv_ruleMatrixParams= ruleMatrixParams EOF
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
    // InternalCircleciParser.g:3231:1: ruleMatrixParams returns [EObject current=null] : (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) ) ;
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
            // InternalCircleciParser.g:3237:2: ( (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) ) )
            // InternalCircleciParser.g:3238:2: (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) )
            {
            // InternalCircleciParser.g:3238:2: (otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END ) )
            // InternalCircleciParser.g:3239:3: otherlv_0= MatrixParams (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,MatrixParams,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixParamsAccess().getMatrixParamsKeyword_0());
            		
            // InternalCircleciParser.g:3243:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END )
            // InternalCircleciParser.g:3244:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixParamsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getMatrixParamsAccess().getKeyKeyword_1_1());
            			
            // InternalCircleciParser.g:3252:4: ( (lv_key_3_0= ruleEString ) )
            // InternalCircleciParser.g:3253:5: (lv_key_3_0= ruleEString )
            {
            // InternalCircleciParser.g:3253:5: (lv_key_3_0= ruleEString )
            // InternalCircleciParser.g:3254:6: lv_key_3_0= ruleEString
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
            			
            // InternalCircleciParser.g:3275:4: ( (lv_values_5_0= ruleEString ) )
            // InternalCircleciParser.g:3276:5: (lv_values_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3276:5: (lv_values_5_0= ruleEString )
            // InternalCircleciParser.g:3277:6: lv_values_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMatrixParamsAccess().getValuesEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_31);
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

            // InternalCircleciParser.g:3294:4: (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==Comma) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalCircleciParser.g:3295:5: otherlv_6= Comma ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getMatrixParamsAccess().getCommaKeyword_1_5_0());
            	    				
            	    // InternalCircleciParser.g:3299:5: ( (lv_values_7_0= ruleEString ) )
            	    // InternalCircleciParser.g:3300:6: (lv_values_7_0= ruleEString )
            	    {
            	    // InternalCircleciParser.g:3300:6: (lv_values_7_0= ruleEString )
            	    // InternalCircleciParser.g:3301:7: lv_values_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getMatrixParamsAccess().getValuesEStringParserRuleCall_1_5_1_0());
            	    						
            	    pushFollow(FOLLOW_31);
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
            	    break loop79;
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
    // InternalCircleciParser.g:3328:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // InternalCircleciParser.g:3328:46: (iv_ruleEShort= ruleEShort EOF )
            // InternalCircleciParser.g:3329:2: iv_ruleEShort= ruleEShort EOF
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
    // InternalCircleciParser.g:3335:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:3341:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalCircleciParser.g:3342:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalCircleciParser.g:3342:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalCircleciParser.g:3343:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalCircleciParser.g:3343:3: (kw= HyphenMinus )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==HyphenMinus) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalCircleciParser.g:3344:4: kw= HyphenMinus
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
    // InternalCircleciParser.g:3361:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalCircleciParser.g:3361:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalCircleciParser.g:3362:2: iv_ruleMachine= ruleMachine EOF
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
    // InternalCircleciParser.g:3368:1: ruleMachine returns [EObject current=null] : (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) ) ;
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
            // InternalCircleciParser.g:3374:2: ( (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) ) )
            // InternalCircleciParser.g:3375:2: (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) )
            {
            // InternalCircleciParser.g:3375:2: (otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END ) )
            // InternalCircleciParser.g:3376:3: otherlv_0= Machine (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Machine,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalCircleciParser.g:3380:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END )
            // InternalCircleciParser.g:3381:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )? otherlv_7= ResourceClass ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) ) (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )? (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )? ( (lv_environments_13_0= ruleEnvironment ) )* this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMachineAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:3389:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:3390:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:3390:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:3391:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_78);
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

            otherlv_4=(Token)match(input,Image,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getImageKeyword_1_3());
            			
            // InternalCircleciParser.g:3412:4: ( (lv_image_5_0= ruleEString ) )
            // InternalCircleciParser.g:3413:5: (lv_image_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3413:5: (lv_image_5_0= ruleEString )
            // InternalCircleciParser.g:3414:6: lv_image_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMachineAccess().getImageEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_79);
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

            // InternalCircleciParser.g:3431:4: ( (lv_docker_layer_caching_6_0= Docker_layer_caching ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Docker_layer_caching) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalCircleciParser.g:3432:5: (lv_docker_layer_caching_6_0= Docker_layer_caching )
                    {
                    // InternalCircleciParser.g:3432:5: (lv_docker_layer_caching_6_0= Docker_layer_caching )
                    // InternalCircleciParser.g:3433:6: lv_docker_layer_caching_6_0= Docker_layer_caching
                    {
                    lv_docker_layer_caching_6_0=(Token)match(input,Docker_layer_caching,FOLLOW_80); 

                    						newLeafNode(lv_docker_layer_caching_6_0, grammarAccess.getMachineAccess().getDocker_layer_cachingDocker_layer_cachingKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    						setWithLastConsumed(current, "docker_layer_caching", lv_docker_layer_caching_6_0 != null, "docker_layer_caching");
                    					

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,ResourceClass,FOLLOW_81); 

            				newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getResourceClassKeyword_1_6());
            			
            // InternalCircleciParser.g:3449:4: ( (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3450:5: (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3450:5: (lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE )
            // InternalCircleciParser.g:3451:6: lv_resourceClass_8_0= ruleMACHINE_RESOURCE_TYPE
            {

            						newCompositeNode(grammarAccess.getMachineAccess().getResourceClassMACHINE_RESOURCE_TYPEEnumRuleCall_1_7_0());
            					
            pushFollow(FOLLOW_82);
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

            // InternalCircleciParser.g:3468:4: (otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==Shell) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalCircleciParser.g:3469:5: otherlv_9= Shell ( (lv_shell_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getShellKeyword_1_8_0());
                    				
                    // InternalCircleciParser.g:3473:5: ( (lv_shell_10_0= ruleEString ) )
                    // InternalCircleciParser.g:3474:6: (lv_shell_10_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3474:6: (lv_shell_10_0= ruleEString )
                    // InternalCircleciParser.g:3475:7: lv_shell_10_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMachineAccess().getShellEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_83);
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

            // InternalCircleciParser.g:3493:4: (otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Working_directory) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCircleciParser.g:3494:5: otherlv_11= Working_directory ( (lv_working_directory_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getWorking_directoryKeyword_1_9_0());
                    				
                    // InternalCircleciParser.g:3498:5: ( (lv_working_directory_12_0= ruleEString ) )
                    // InternalCircleciParser.g:3499:6: (lv_working_directory_12_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3499:6: (lv_working_directory_12_0= ruleEString )
                    // InternalCircleciParser.g:3500:7: lv_working_directory_12_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMachineAccess().getWorking_directoryEStringParserRuleCall_1_9_1_0());
                    						
                    pushFollow(FOLLOW_84);
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

            // InternalCircleciParser.g:3518:4: ( (lv_environments_13_0= ruleEnvironment ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==Environment) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalCircleciParser.g:3519:5: (lv_environments_13_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3519:5: (lv_environments_13_0= ruleEnvironment )
            	    // InternalCircleciParser.g:3520:6: lv_environments_13_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getEnvironmentsEnvironmentParserRuleCall_1_10_0());
            	    					
            	    pushFollow(FOLLOW_84);
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
            	    break loop84;
                }
            } while (true);

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getMachineAccess().getENDTerminalRuleCall_1_11());
            			

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
    // InternalCircleciParser.g:3546:1: entryRuleMacOs returns [EObject current=null] : iv_ruleMacOs= ruleMacOs EOF ;
    public final EObject entryRuleMacOs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOs = null;


        try {
            // InternalCircleciParser.g:3546:46: (iv_ruleMacOs= ruleMacOs EOF )
            // InternalCircleciParser.g:3547:2: iv_ruleMacOs= ruleMacOs EOF
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
    // InternalCircleciParser.g:3553:1: ruleMacOs returns [EObject current=null] : (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) ) ;
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
            // InternalCircleciParser.g:3559:2: ( (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) ) )
            // InternalCircleciParser.g:3560:2: (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) )
            {
            // InternalCircleciParser.g:3560:2: (otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END ) )
            // InternalCircleciParser.g:3561:3: otherlv_0= MacOs (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END )
            {
            otherlv_0=(Token)match(input,MacOs,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMacOsAccess().getMacOsKeyword_0());
            		
            // InternalCircleciParser.g:3565:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END )
            // InternalCircleciParser.g:3566:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) ) (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? ( (lv_environments_12_0= ruleEnvironment ) )* this_END_13= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMacOsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getMacOsAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:3574:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:3575:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:3575:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:3576:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getMacOsAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_85);
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

            // InternalCircleciParser.g:3593:4: (otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) ) )
            // InternalCircleciParser.g:3594:5: otherlv_4= Xcode ( (lv_xcode_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,Xcode,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getMacOsAccess().getXcodeKeyword_1_3_0());
            				
            // InternalCircleciParser.g:3598:5: ( (lv_xcode_5_0= ruleEString ) )
            // InternalCircleciParser.g:3599:6: (lv_xcode_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3599:6: (lv_xcode_5_0= ruleEString )
            // InternalCircleciParser.g:3600:7: lv_xcode_5_0= ruleEString
            {

            							newCompositeNode(grammarAccess.getMacOsAccess().getXcodeEStringParserRuleCall_1_3_1_0());
            						
            pushFollow(FOLLOW_80);
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

            // InternalCircleciParser.g:3618:4: (otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) ) )
            // InternalCircleciParser.g:3619:5: otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) )
            {
            otherlv_6=(Token)match(input,ResourceClass,FOLLOW_86); 

            					newLeafNode(otherlv_6, grammarAccess.getMacOsAccess().getResourceClassKeyword_1_4_0());
            				
            // InternalCircleciParser.g:3623:5: ( (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3624:6: (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3624:6: (lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE )
            // InternalCircleciParser.g:3625:7: lv_resourceClass_7_0= ruleMACOS_RESOURCE_TYPE
            {

            							newCompositeNode(grammarAccess.getMacOsAccess().getResourceClassMACOS_RESOURCE_TYPEEnumRuleCall_1_4_1_0());
            						
            pushFollow(FOLLOW_82);
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

            // InternalCircleciParser.g:3643:4: (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==Shell) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCircleciParser.g:3644:5: otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getMacOsAccess().getShellKeyword_1_5_0());
                    				
                    // InternalCircleciParser.g:3648:5: ( (lv_shell_9_0= ruleEString ) )
                    // InternalCircleciParser.g:3649:6: (lv_shell_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3649:6: (lv_shell_9_0= ruleEString )
                    // InternalCircleciParser.g:3650:7: lv_shell_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMacOsAccess().getShellEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_83);
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

            // InternalCircleciParser.g:3668:4: (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Working_directory) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalCircleciParser.g:3669:5: otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getMacOsAccess().getWorking_directoryKeyword_1_6_0());
                    				
                    // InternalCircleciParser.g:3673:5: ( (lv_working_directory_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3674:6: (lv_working_directory_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3674:6: (lv_working_directory_11_0= ruleEString )
                    // InternalCircleciParser.g:3675:7: lv_working_directory_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getMacOsAccess().getWorking_directoryEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_84);
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

            // InternalCircleciParser.g:3693:4: ( (lv_environments_12_0= ruleEnvironment ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==Environment) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalCircleciParser.g:3694:5: (lv_environments_12_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3694:5: (lv_environments_12_0= ruleEnvironment )
            	    // InternalCircleciParser.g:3695:6: lv_environments_12_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getMacOsAccess().getEnvironmentsEnvironmentParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_84);
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
            	    break loop87;
                }
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_13, grammarAccess.getMacOsAccess().getENDTerminalRuleCall_1_8());
            			

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
    // InternalCircleciParser.g:3721:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;


        try {
            // InternalCircleciParser.g:3721:47: (iv_ruleDocker= ruleDocker EOF )
            // InternalCircleciParser.g:3722:2: iv_ruleDocker= ruleDocker EOF
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
    // InternalCircleciParser.g:3728:1: ruleDocker returns [EObject current=null] : (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) ) ;
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
            // InternalCircleciParser.g:3734:2: ( (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) ) )
            // InternalCircleciParser.g:3735:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) )
            {
            // InternalCircleciParser.g:3735:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END ) )
            // InternalCircleciParser.g:3736:3: otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerAccess().getDockerKeyword_0());
            		
            // InternalCircleciParser.g:3740:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END )
            // InternalCircleciParser.g:3741:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Image ( (lv_image_5_0= ruleEString ) ) otherlv_6= ResourceClass ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) ) (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )? (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )? (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )? (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )? (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )? ( (lv_environments_22_0= ruleEnvironment ) )* ( (lv_docker_auth_23_0= ruleDocker_Auth ) )? ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )? this_END_25= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDockerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getDockerAccess().getNameKeyword_1_1());
            			
            // InternalCircleciParser.g:3749:4: ( (lv_name_3_0= ruleEString ) )
            // InternalCircleciParser.g:3750:5: (lv_name_3_0= ruleEString )
            {
            // InternalCircleciParser.g:3750:5: (lv_name_3_0= ruleEString )
            // InternalCircleciParser.g:3751:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_78);
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

            otherlv_4=(Token)match(input,Image,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getDockerAccess().getImageKeyword_1_3());
            			
            // InternalCircleciParser.g:3772:4: ( (lv_image_5_0= ruleEString ) )
            // InternalCircleciParser.g:3773:5: (lv_image_5_0= ruleEString )
            {
            // InternalCircleciParser.g:3773:5: (lv_image_5_0= ruleEString )
            // InternalCircleciParser.g:3774:6: lv_image_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getImageEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_80);
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

            otherlv_6=(Token)match(input,ResourceClass,FOLLOW_87); 

            				newLeafNode(otherlv_6, grammarAccess.getDockerAccess().getResourceClassKeyword_1_5());
            			
            // InternalCircleciParser.g:3795:4: ( (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE ) )
            // InternalCircleciParser.g:3796:5: (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE )
            {
            // InternalCircleciParser.g:3796:5: (lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE )
            // InternalCircleciParser.g:3797:6: lv_resourceClass_7_0= ruleDOCKER_RESOURCE_TYPE
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getResourceClassDOCKER_RESOURCE_TYPEEnumRuleCall_1_6_0());
            					
            pushFollow(FOLLOW_88);
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

            // InternalCircleciParser.g:3814:4: (otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Shell) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCircleciParser.g:3815:5: otherlv_8= Shell ( (lv_shell_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Shell,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getDockerAccess().getShellKeyword_1_7_0());
                    				
                    // InternalCircleciParser.g:3819:5: ( (lv_shell_9_0= ruleEString ) )
                    // InternalCircleciParser.g:3820:6: (lv_shell_9_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3820:6: (lv_shell_9_0= ruleEString )
                    // InternalCircleciParser.g:3821:7: lv_shell_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getShellEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_89);
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

            // InternalCircleciParser.g:3839:4: (otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==Working_directory) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalCircleciParser.g:3840:5: otherlv_10= Working_directory ( (lv_working_directory_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,Working_directory,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getDockerAccess().getWorking_directoryKeyword_1_8_0());
                    				
                    // InternalCircleciParser.g:3844:5: ( (lv_working_directory_11_0= ruleEString ) )
                    // InternalCircleciParser.g:3845:6: (lv_working_directory_11_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3845:6: (lv_working_directory_11_0= ruleEString )
                    // InternalCircleciParser.g:3846:7: lv_working_directory_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getWorking_directoryEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_90);
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

            // InternalCircleciParser.g:3864:4: (otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )* )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==Entrypoint) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalCircleciParser.g:3865:5: otherlv_12= Entrypoint ( (lv_entrypoint_13_0= ruleEString ) ) (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )*
                    {
                    otherlv_12=(Token)match(input,Entrypoint,FOLLOW_6); 

                    					newLeafNode(otherlv_12, grammarAccess.getDockerAccess().getEntrypointKeyword_1_9_0());
                    				
                    // InternalCircleciParser.g:3869:5: ( (lv_entrypoint_13_0= ruleEString ) )
                    // InternalCircleciParser.g:3870:6: (lv_entrypoint_13_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3870:6: (lv_entrypoint_13_0= ruleEString )
                    // InternalCircleciParser.g:3871:7: lv_entrypoint_13_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getEntrypointEStringParserRuleCall_1_9_1_0());
                    						
                    pushFollow(FOLLOW_91);
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

                    // InternalCircleciParser.g:3888:5: (otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==Comma) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3889:6: otherlv_14= Comma ( (lv_entrypoint_15_0= ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getDockerAccess().getCommaKeyword_1_9_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3893:6: ( (lv_entrypoint_15_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3894:7: (lv_entrypoint_15_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3894:7: (lv_entrypoint_15_0= ruleEString )
                    	    // InternalCircleciParser.g:3895:8: lv_entrypoint_15_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getDockerAccess().getEntrypointEStringParserRuleCall_1_9_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_91);
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
                    	    break loop90;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3914:4: (otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==Command_1) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCircleciParser.g:3915:5: otherlv_16= Command_1 ( (lv_command_17_0= ruleEString ) ) (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )*
                    {
                    otherlv_16=(Token)match(input,Command_1,FOLLOW_6); 

                    					newLeafNode(otherlv_16, grammarAccess.getDockerAccess().getCommandKeyword_1_10_0());
                    				
                    // InternalCircleciParser.g:3919:5: ( (lv_command_17_0= ruleEString ) )
                    // InternalCircleciParser.g:3920:6: (lv_command_17_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3920:6: (lv_command_17_0= ruleEString )
                    // InternalCircleciParser.g:3921:7: lv_command_17_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getCommandEStringParserRuleCall_1_10_1_0());
                    						
                    pushFollow(FOLLOW_92);
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

                    // InternalCircleciParser.g:3938:5: (otherlv_18= Comma ( (lv_command_19_0= ruleEString ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==Comma) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalCircleciParser.g:3939:6: otherlv_18= Comma ( (lv_command_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_6); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getDockerAccess().getCommaKeyword_1_10_2_0());
                    	    					
                    	    // InternalCircleciParser.g:3943:6: ( (lv_command_19_0= ruleEString ) )
                    	    // InternalCircleciParser.g:3944:7: (lv_command_19_0= ruleEString )
                    	    {
                    	    // InternalCircleciParser.g:3944:7: (lv_command_19_0= ruleEString )
                    	    // InternalCircleciParser.g:3945:8: lv_command_19_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getDockerAccess().getCommandEStringParserRuleCall_1_10_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_92);
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
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCircleciParser.g:3964:4: (otherlv_20= User ( (lv_user_21_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==User) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalCircleciParser.g:3965:5: otherlv_20= User ( (lv_user_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,User,FOLLOW_6); 

                    					newLeafNode(otherlv_20, grammarAccess.getDockerAccess().getUserKeyword_1_11_0());
                    				
                    // InternalCircleciParser.g:3969:5: ( (lv_user_21_0= ruleEString ) )
                    // InternalCircleciParser.g:3970:6: (lv_user_21_0= ruleEString )
                    {
                    // InternalCircleciParser.g:3970:6: (lv_user_21_0= ruleEString )
                    // InternalCircleciParser.g:3971:7: lv_user_21_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getUserEStringParserRuleCall_1_11_1_0());
                    						
                    pushFollow(FOLLOW_93);
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

            // InternalCircleciParser.g:3989:4: ( (lv_environments_22_0= ruleEnvironment ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==Environment) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalCircleciParser.g:3990:5: (lv_environments_22_0= ruleEnvironment )
            	    {
            	    // InternalCircleciParser.g:3990:5: (lv_environments_22_0= ruleEnvironment )
            	    // InternalCircleciParser.g:3991:6: lv_environments_22_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getDockerAccess().getEnvironmentsEnvironmentParserRuleCall_1_12_0());
            	    					
            	    pushFollow(FOLLOW_93);
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
            	    break loop95;
                }
            } while (true);

            // InternalCircleciParser.g:4008:4: ( (lv_docker_auth_23_0= ruleDocker_Auth ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==Docker_Auth) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalCircleciParser.g:4009:5: (lv_docker_auth_23_0= ruleDocker_Auth )
                    {
                    // InternalCircleciParser.g:4009:5: (lv_docker_auth_23_0= ruleDocker_Auth )
                    // InternalCircleciParser.g:4010:6: lv_docker_auth_23_0= ruleDocker_Auth
                    {

                    						newCompositeNode(grammarAccess.getDockerAccess().getDocker_authDocker_AuthParserRuleCall_1_13_0());
                    					
                    pushFollow(FOLLOW_94);
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

            // InternalCircleciParser.g:4027:4: ( (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==Docker_Aws_Auths) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalCircleciParser.g:4028:5: (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths )
                    {
                    // InternalCircleciParser.g:4028:5: (lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths )
                    // InternalCircleciParser.g:4029:6: lv_docker_aws_auth_24_0= ruleDocker_Aws_Auths
                    {

                    						newCompositeNode(grammarAccess.getDockerAccess().getDocker_aws_authDocker_Aws_AuthsParserRuleCall_1_14_0());
                    					
                    pushFollow(FOLLOW_15);
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

            				newLeafNode(this_END_25, grammarAccess.getDockerAccess().getENDTerminalRuleCall_1_15());
            			

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
    // InternalCircleciParser.g:4055:1: entryRuleDocker_Auth returns [EObject current=null] : iv_ruleDocker_Auth= ruleDocker_Auth EOF ;
    public final EObject entryRuleDocker_Auth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker_Auth = null;


        try {
            // InternalCircleciParser.g:4055:52: (iv_ruleDocker_Auth= ruleDocker_Auth EOF )
            // InternalCircleciParser.g:4056:2: iv_ruleDocker_Auth= ruleDocker_Auth EOF
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
    // InternalCircleciParser.g:4062:1: ruleDocker_Auth returns [EObject current=null] : (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:4068:2: ( (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:4069:2: (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:4069:2: (otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:4070:3: otherlv_0= Docker_Auth (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker_Auth,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDocker_AuthAccess().getDocker_AuthKeyword_0());
            		
            // InternalCircleciParser.g:4074:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:4075:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Username ( (lv_username_3_0= ruleEString ) ) otherlv_4= Password ( (lv_password_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_95); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDocker_AuthAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Username,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getDocker_AuthAccess().getUsernameKeyword_1_1());
            			
            // InternalCircleciParser.g:4083:4: ( (lv_username_3_0= ruleEString ) )
            // InternalCircleciParser.g:4084:5: (lv_username_3_0= ruleEString )
            {
            // InternalCircleciParser.g:4084:5: (lv_username_3_0= ruleEString )
            // InternalCircleciParser.g:4085:6: lv_username_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_AuthAccess().getUsernameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_96);
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
            			
            // InternalCircleciParser.g:4106:4: ( (lv_password_5_0= ruleEString ) )
            // InternalCircleciParser.g:4107:5: (lv_password_5_0= ruleEString )
            {
            // InternalCircleciParser.g:4107:5: (lv_password_5_0= ruleEString )
            // InternalCircleciParser.g:4108:6: lv_password_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_AuthAccess().getPasswordEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:4134:1: entryRuleDocker_Aws_Auths returns [EObject current=null] : iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF ;
    public final EObject entryRuleDocker_Aws_Auths() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker_Aws_Auths = null;


        try {
            // InternalCircleciParser.g:4134:57: (iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF )
            // InternalCircleciParser.g:4135:2: iv_ruleDocker_Aws_Auths= ruleDocker_Aws_Auths EOF
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
    // InternalCircleciParser.g:4141:1: ruleDocker_Aws_Auths returns [EObject current=null] : (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalCircleciParser.g:4147:2: ( (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalCircleciParser.g:4148:2: (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalCircleciParser.g:4148:2: (otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalCircleciParser.g:4149:3: otherlv_0= Docker_Aws_Auths (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker_Aws_Auths,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDocker_Aws_AuthsAccess().getDocker_Aws_AuthsKeyword_0());
            		
            // InternalCircleciParser.g:4153:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalCircleciParser.g:4154:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Aws_access_key_id ( (lv_aws_access_key_id_3_0= ruleEString ) ) otherlv_4= Aws_secret_access_key ( (lv_aws_secret_access_key_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_97); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDocker_Aws_AuthsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Aws_access_key_id,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getDocker_Aws_AuthsAccess().getAws_access_key_idKeyword_1_1());
            			
            // InternalCircleciParser.g:4162:4: ( (lv_aws_access_key_id_3_0= ruleEString ) )
            // InternalCircleciParser.g:4163:5: (lv_aws_access_key_id_3_0= ruleEString )
            {
            // InternalCircleciParser.g:4163:5: (lv_aws_access_key_id_3_0= ruleEString )
            // InternalCircleciParser.g:4164:6: lv_aws_access_key_id_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_Aws_AuthsAccess().getAws_access_key_idEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_98);
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
            			
            // InternalCircleciParser.g:4185:4: ( (lv_aws_secret_access_key_5_0= ruleEString ) )
            // InternalCircleciParser.g:4186:5: (lv_aws_secret_access_key_5_0= ruleEString )
            {
            // InternalCircleciParser.g:4186:5: (lv_aws_secret_access_key_5_0= ruleEString )
            // InternalCircleciParser.g:4187:6: lv_aws_secret_access_key_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDocker_Aws_AuthsAccess().getAws_secret_access_keyEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_15);
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
    // InternalCircleciParser.g:4213:1: ruleMACHINE_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) ) ;
    public final Enumerator ruleMACHINE_RESOURCE_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4219:2: ( ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) ) )
            // InternalCircleciParser.g:4220:2: ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) )
            {
            // InternalCircleciParser.g:4220:2: ( (enumLiteral_0= Medium ) | (enumLiteral_1= Large ) | (enumLiteral_2= Xlarge ) | (enumLiteral_3= Xlarge_1 ) | (enumLiteral_4= Xlarge_2 ) )
            int alt98=5;
            switch ( input.LA(1) ) {
            case Medium:
                {
                alt98=1;
                }
                break;
            case Large:
                {
                alt98=2;
                }
                break;
            case Xlarge:
                {
                alt98=3;
                }
                break;
            case Xlarge_1:
                {
                alt98=4;
                }
                break;
            case Xlarge_2:
                {
                alt98=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalCircleciParser.g:4221:3: (enumLiteral_0= Medium )
                    {
                    // InternalCircleciParser.g:4221:3: (enumLiteral_0= Medium )
                    // InternalCircleciParser.g:4222:4: enumLiteral_0= Medium
                    {
                    enumLiteral_0=(Token)match(input,Medium,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4229:3: (enumLiteral_1= Large )
                    {
                    // InternalCircleciParser.g:4229:3: (enumLiteral_1= Large )
                    // InternalCircleciParser.g:4230:4: enumLiteral_1= Large
                    {
                    enumLiteral_1=(Token)match(input,Large,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4237:3: (enumLiteral_2= Xlarge )
                    {
                    // InternalCircleciParser.g:4237:3: (enumLiteral_2= Xlarge )
                    // InternalCircleciParser.g:4238:4: enumLiteral_2= Xlarge
                    {
                    enumLiteral_2=(Token)match(input,Xlarge,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4245:3: (enumLiteral_3= Xlarge_1 )
                    {
                    // InternalCircleciParser.g:4245:3: (enumLiteral_3= Xlarge_1 )
                    // InternalCircleciParser.g:4246:4: enumLiteral_3= Xlarge_1
                    {
                    enumLiteral_3=(Token)match(input,Xlarge_1,FOLLOW_2); 

                    				current = grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4253:3: (enumLiteral_4= Xlarge_2 )
                    {
                    // InternalCircleciParser.g:4253:3: (enumLiteral_4= Xlarge_2 )
                    // InternalCircleciParser.g:4254:4: enumLiteral_4= Xlarge_2
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
    // InternalCircleciParser.g:4264:1: ruleMACOS_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) ) ;
    public final Enumerator ruleMACOS_RESOURCE_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4270:2: ( ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) ) )
            // InternalCircleciParser.g:4271:2: ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) )
            {
            // InternalCircleciParser.g:4271:2: ( (enumLiteral_0= MacosX86MediumGen2 ) | (enumLiteral_1= MacosM1MediumGen ) | (enumLiteral_2= MacosM1LargeGen1 ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case MacosX86MediumGen2:
                {
                alt99=1;
                }
                break;
            case MacosM1MediumGen:
                {
                alt99=2;
                }
                break;
            case MacosM1LargeGen1:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalCircleciParser.g:4272:3: (enumLiteral_0= MacosX86MediumGen2 )
                    {
                    // InternalCircleciParser.g:4272:3: (enumLiteral_0= MacosX86MediumGen2 )
                    // InternalCircleciParser.g:4273:4: enumLiteral_0= MacosX86MediumGen2
                    {
                    enumLiteral_0=(Token)match(input,MacosX86MediumGen2,FOLLOW_2); 

                    				current = grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_X86_MEDIUM_GEN2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_X86_MEDIUM_GEN2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4280:3: (enumLiteral_1= MacosM1MediumGen )
                    {
                    // InternalCircleciParser.g:4280:3: (enumLiteral_1= MacosM1MediumGen )
                    // InternalCircleciParser.g:4281:4: enumLiteral_1= MacosM1MediumGen
                    {
                    enumLiteral_1=(Token)match(input,MacosM1MediumGen,FOLLOW_2); 

                    				current = grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_MEDIUM_GENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMACOS_RESOURCE_TYPEAccess().getMACOS_M1_MEDIUM_GENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4288:3: (enumLiteral_2= MacosM1LargeGen1 )
                    {
                    // InternalCircleciParser.g:4288:3: (enumLiteral_2= MacosM1LargeGen1 )
                    // InternalCircleciParser.g:4289:4: enumLiteral_2= MacosM1LargeGen1
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
    // InternalCircleciParser.g:4299:1: ruleDOCKER_RESOURCE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) ) ;
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
            // InternalCircleciParser.g:4305:2: ( ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) ) )
            // InternalCircleciParser.g:4306:2: ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) )
            {
            // InternalCircleciParser.g:4306:2: ( (enumLiteral_0= Small ) | (enumLiteral_1= Medium ) | (enumLiteral_2= Medium_1 ) | (enumLiteral_3= Large ) | (enumLiteral_4= Xlarge ) | (enumLiteral_5= Xlarge_1 ) | (enumLiteral_6= Xlarge_2 ) )
            int alt100=7;
            switch ( input.LA(1) ) {
            case Small:
                {
                alt100=1;
                }
                break;
            case Medium:
                {
                alt100=2;
                }
                break;
            case Medium_1:
                {
                alt100=3;
                }
                break;
            case Large:
                {
                alt100=4;
                }
                break;
            case Xlarge:
                {
                alt100=5;
                }
                break;
            case Xlarge_1:
                {
                alt100=6;
                }
                break;
            case Xlarge_2:
                {
                alt100=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalCircleciParser.g:4307:3: (enumLiteral_0= Small )
                    {
                    // InternalCircleciParser.g:4307:3: (enumLiteral_0= Small )
                    // InternalCircleciParser.g:4308:4: enumLiteral_0= Small
                    {
                    enumLiteral_0=(Token)match(input,Small,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getSMALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getSMALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4315:3: (enumLiteral_1= Medium )
                    {
                    // InternalCircleciParser.g:4315:3: (enumLiteral_1= Medium )
                    // InternalCircleciParser.g:4316:4: enumLiteral_1= Medium
                    {
                    enumLiteral_1=(Token)match(input,Medium,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4323:3: (enumLiteral_2= Medium_1 )
                    {
                    // InternalCircleciParser.g:4323:3: (enumLiteral_2= Medium_1 )
                    // InternalCircleciParser.g:4324:4: enumLiteral_2= Medium_1
                    {
                    enumLiteral_2=(Token)match(input,Medium_1,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUM_PLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getMEDIUM_PLUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4331:3: (enumLiteral_3= Large )
                    {
                    // InternalCircleciParser.g:4331:3: (enumLiteral_3= Large )
                    // InternalCircleciParser.g:4332:4: enumLiteral_3= Large
                    {
                    enumLiteral_3=(Token)match(input,Large,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4339:3: (enumLiteral_4= Xlarge )
                    {
                    // InternalCircleciParser.g:4339:3: (enumLiteral_4= Xlarge )
                    // InternalCircleciParser.g:4340:4: enumLiteral_4= Xlarge
                    {
                    enumLiteral_4=(Token)match(input,Xlarge,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getXLARGEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCircleciParser.g:4347:3: (enumLiteral_5= Xlarge_1 )
                    {
                    // InternalCircleciParser.g:4347:3: (enumLiteral_5= Xlarge_1 )
                    // InternalCircleciParser.g:4348:4: enumLiteral_5= Xlarge_1
                    {
                    enumLiteral_5=(Token)match(input,Xlarge_1,FOLLOW_2); 

                    				current = grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getTWO_XLARGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCircleciParser.g:4355:3: (enumLiteral_6= Xlarge_2 )
                    {
                    // InternalCircleciParser.g:4355:3: (enumLiteral_6= Xlarge_2 )
                    // InternalCircleciParser.g:4356:4: enumLiteral_6= Xlarge_2
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
    // InternalCircleciParser.g:4366:1: ruleWHEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) ) ;
    public final Enumerator ruleWHEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4372:2: ( ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) ) )
            // InternalCircleciParser.g:4373:2: ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) )
            {
            // InternalCircleciParser.g:4373:2: ( (enumLiteral_0= On_success ) | (enumLiteral_1= Always ) | (enumLiteral_2= On_fail ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case On_success:
                {
                alt101=1;
                }
                break;
            case Always:
                {
                alt101=2;
                }
                break;
            case On_fail:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalCircleciParser.g:4374:3: (enumLiteral_0= On_success )
                    {
                    // InternalCircleciParser.g:4374:3: (enumLiteral_0= On_success )
                    // InternalCircleciParser.g:4375:4: enumLiteral_0= On_success
                    {
                    enumLiteral_0=(Token)match(input,On_success,FOLLOW_2); 

                    				current = grammarAccess.getWHEN_TYPEAccess().getOn_successEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWHEN_TYPEAccess().getOn_successEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4382:3: (enumLiteral_1= Always )
                    {
                    // InternalCircleciParser.g:4382:3: (enumLiteral_1= Always )
                    // InternalCircleciParser.g:4383:4: enumLiteral_1= Always
                    {
                    enumLiteral_1=(Token)match(input,Always,FOLLOW_2); 

                    				current = grammarAccess.getWHEN_TYPEAccess().getAlwaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWHEN_TYPEAccess().getAlwaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4390:3: (enumLiteral_2= On_fail )
                    {
                    // InternalCircleciParser.g:4390:3: (enumLiteral_2= On_fail )
                    // InternalCircleciParser.g:4391:4: enumLiteral_2= On_fail
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
    // InternalCircleciParser.g:4401:1: rulePARAMETER_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) ) ;
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
            // InternalCircleciParser.g:4407:2: ( ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) ) )
            // InternalCircleciParser.g:4408:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) )
            {
            // InternalCircleciParser.g:4408:2: ( (enumLiteral_0= STRING ) | (enumLiteral_1= BOOLEAN ) | (enumLiteral_2= INTEGER ) | (enumLiteral_3= ENUM ) | (enumLiteral_4= EXECUTOR ) | (enumLiteral_5= STEPS ) | (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME ) )
            int alt102=7;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt102=1;
                }
                break;
            case BOOLEAN:
                {
                alt102=2;
                }
                break;
            case INTEGER:
                {
                alt102=3;
                }
                break;
            case ENUM:
                {
                alt102=4;
                }
                break;
            case EXECUTOR:
                {
                alt102=5;
                }
                break;
            case STEPS:
                {
                alt102=6;
                }
                break;
            case ENVIRONMENT_VARIABLE_NAME:
                {
                alt102=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalCircleciParser.g:4409:3: (enumLiteral_0= STRING )
                    {
                    // InternalCircleciParser.g:4409:3: (enumLiteral_0= STRING )
                    // InternalCircleciParser.g:4410:4: enumLiteral_0= STRING
                    {
                    enumLiteral_0=(Token)match(input,STRING,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPARAMETER_TYPESAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4417:3: (enumLiteral_1= BOOLEAN )
                    {
                    // InternalCircleciParser.g:4417:3: (enumLiteral_1= BOOLEAN )
                    // InternalCircleciParser.g:4418:4: enumLiteral_1= BOOLEAN
                    {
                    enumLiteral_1=(Token)match(input,BOOLEAN,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPARAMETER_TYPESAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCircleciParser.g:4425:3: (enumLiteral_2= INTEGER )
                    {
                    // InternalCircleciParser.g:4425:3: (enumLiteral_2= INTEGER )
                    // InternalCircleciParser.g:4426:4: enumLiteral_2= INTEGER
                    {
                    enumLiteral_2=(Token)match(input,INTEGER,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPARAMETER_TYPESAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCircleciParser.g:4433:3: (enumLiteral_3= ENUM )
                    {
                    // InternalCircleciParser.g:4433:3: (enumLiteral_3= ENUM )
                    // InternalCircleciParser.g:4434:4: enumLiteral_3= ENUM
                    {
                    enumLiteral_3=(Token)match(input,ENUM,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getENUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPARAMETER_TYPESAccess().getENUMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCircleciParser.g:4441:3: (enumLiteral_4= EXECUTOR )
                    {
                    // InternalCircleciParser.g:4441:3: (enumLiteral_4= EXECUTOR )
                    // InternalCircleciParser.g:4442:4: enumLiteral_4= EXECUTOR
                    {
                    enumLiteral_4=(Token)match(input,EXECUTOR,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getEXECUTOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPARAMETER_TYPESAccess().getEXECUTOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCircleciParser.g:4449:3: (enumLiteral_5= STEPS )
                    {
                    // InternalCircleciParser.g:4449:3: (enumLiteral_5= STEPS )
                    // InternalCircleciParser.g:4450:4: enumLiteral_5= STEPS
                    {
                    enumLiteral_5=(Token)match(input,STEPS,FOLLOW_2); 

                    				current = grammarAccess.getPARAMETER_TYPESAccess().getSTEPSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPARAMETER_TYPESAccess().getSTEPSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCircleciParser.g:4457:3: (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME )
                    {
                    // InternalCircleciParser.g:4457:3: (enumLiteral_6= ENVIRONMENT_VARIABLE_NAME )
                    // InternalCircleciParser.g:4458:4: enumLiteral_6= ENVIRONMENT_VARIABLE_NAME
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
    // InternalCircleciParser.g:4468:1: ruleBRANCH_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) ) ;
    public final Enumerator ruleBRANCH_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCircleciParser.g:4474:2: ( ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) ) )
            // InternalCircleciParser.g:4475:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) )
            {
            // InternalCircleciParser.g:4475:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Ignore ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==Only) ) {
                alt103=1;
            }
            else if ( (LA103_0==Ignore) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalCircleciParser.g:4476:3: (enumLiteral_0= Only )
                    {
                    // InternalCircleciParser.g:4476:3: (enumLiteral_0= Only )
                    // InternalCircleciParser.g:4477:4: enumLiteral_0= Only
                    {
                    enumLiteral_0=(Token)match(input,Only,FOLLOW_2); 

                    				current = grammarAccess.getBRANCH_TYPEAccess().getOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBRANCH_TYPEAccess().getOnlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCircleciParser.g:4484:3: (enumLiteral_1= Ignore )
                    {
                    // InternalCircleciParser.g:4484:3: (enumLiteral_1= Ignore )
                    // InternalCircleciParser.g:4485:4: enumLiteral_1= Ignore
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0001400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0A00000000000000L,0x0000003000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0A00000000000000L,0x0000083000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0A08000000000002L,0x0000083000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00010C08A10B0C00L,0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00010C08A10B0C00L,0x0000204000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000030000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000000030000000L,0x0000200000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x08010C0AA94B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000840000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x08010C08A94B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x08010C08A90B0C00L,0x0000004000002010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00010C08A90B0C00L,0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0502000000000010L,0x0000000002004040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000010080000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010080000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000220000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006008006000L,0x0000000810200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007008006000L,0x0000200810200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000008010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
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
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0080800000000000L,0x0000000000041400L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000008004000L,0x0000200000200000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000008004000L,0x0000200000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000008000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0080800000000000L,0x0000000000441401L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x200000800C00C000L,0x0000200400200000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x200000800C00C000L,0x0000200400000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x200000800C008000L,0x0000200400000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x200000000C008000L,0x0000220400000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x000000000C008000L,0x0000220400000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x000000000C008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000008000L,0x0000200000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000040L});

}