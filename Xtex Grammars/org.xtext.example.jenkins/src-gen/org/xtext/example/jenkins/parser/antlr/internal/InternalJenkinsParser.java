package org.xtext.example.jenkins.parser.antlr.internal;

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
import org.xtext.example.jenkins.services.JenkinsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJenkinsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DisableConcurrentBuilds", "DisableRestartFromStage", "ParallelsAlwaysFailFast", "SkipStagesAfterUnstable", "CheckoutToSubdirectory", "OverrideIndexTriggers", "RegistryCredentialsId", "NewContainerPerStage", "SkipDefaultCheckout", "AdditionalBuildArgs", "SubmitterParameter", "AuthorDisplayName", "PreserveStashes", "CustomWorkspace", "BuildDiscarder", "Step_Parameter", "ChangeRequest", "DisableResume", "PasswordParam", "BooleanParam", "DefaultValue", "Expected_val", "NumToKeepStr", "Unsuccessful", "BuildingTag", "ChoiceParam", "Environment", "QuietPeriod", "StringParam", "TriggeredBy", "AuthorEmail", "Description", "RegistryUrl", "Dockerfile", "Expression", "Timestamps", "Actual_val", "AlwaysPull", "BuildCount", "Comparator", "Expression_1", "Regression", "ChangeSet", "Changelog", "TextParam", "Attribute", "Condition", "Directory", "Parameter", "ReuseNode", "Submitter", "Threshold", "Tool_name", "Pipeline", "Upstream", "When_Env", "FailFast", "Filename", "Override", "Parallel", "Unstable", "Command", "PollSCM", "Timeout", "Aborted", "Changed", "Choices", "Cleanup", "Exclude", "Failure", "Message", "Pattern", "Retries", "Success", "Branch", "Docker", "Equals", "Matrix", "Always", "Author", "Branch_1", "Equals_1", "Gradle", "Period", "Regexp", "Target", "Values", "AllOf", "AnyOf", "Input", "Label", "Retry", "Stage", "Abort", "False", "Fixed", "Image", "Label_1", "Maven", "Timer", "Title", "Value", "Axis", "Cron", "Node", "None", "Post", "Step", "Tool", "Args", "Fork", "Glob", "Jobs", "Name", "None_1", "Time", "Tool_1", "True", "Unit", "Any", "Not", "Tag", "Dir", "Jdk", "Key", "Url", "Id", "Ok", "Comma", "HyphenMinus", "RULE_NEWLINE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Maven=102;
    public static final int AnyOf=92;
    public static final int SkipStagesAfterUnstable=7;
    public static final int Node=108;
    public static final int Values=90;
    public static final int False=98;
    public static final int ChangeRequest=20;
    public static final int Image=100;
    public static final int Success=77;
    public static final int OverrideIndexTriggers=9;
    public static final int AuthorDisplayName=15;
    public static final int Actual_val=40;
    public static final int Matrix=81;
    public static final int Docker=79;
    public static final int Tool_name=56;
    public static final int CustomWorkspace=17;
    public static final int Stage=96;
    public static final int Failure=73;
    public static final int Threshold=55;
    public static final int DisableRestartFromStage=5;
    public static final int RULE_ID=137;
    public static final int SubmitterParameter=14;
    public static final int Filename=61;
    public static final int RegistryUrl=36;
    public static final int TriggeredBy=33;
    public static final int RULE_INT=138;
    public static final int RULE_ML_COMMENT=140;
    public static final int NumToKeepStr=26;
    public static final int Author=83;
    public static final int Always=82;
    public static final int Retry=95;
    public static final int Id=130;
    public static final int PollSCM=66;
    public static final int Key=128;
    public static final int Description=35;
    public static final int Attribute=49;
    public static final int Expression_1=44;
    public static final int RULE_NEWLINE=134;
    public static final int CheckoutToSubdirectory=8;
    public static final int Unstable=64;
    public static final int Url=129;
    public static final int Equals_1=85;
    public static final int Jdk=127;
    public static final int DefaultValue=24;
    public static final int Comma=132;
    public static final int Target=89;
    public static final int HyphenMinus=133;
    public static final int Jobs=116;
    public static final int BuildCount=42;
    public static final int StringParam=32;
    public static final int Changelog=47;
    public static final int ChangeSet=46;
    public static final int Directory=51;
    public static final int Fixed=99;
    public static final int Pattern=75;
    public static final int None_1=118;
    public static final int AdditionalBuildArgs=13;
    public static final int ParallelsAlwaysFailFast=6;
    public static final int Step_Parameter=19;
    public static final int Dir=126;
    public static final int BooleanParam=23;
    public static final int Pipeline=57;
    public static final int NewContainerPerStage=11;
    public static final int Expression=38;
    public static final int AlwaysPull=41;
    public static final int DisableConcurrentBuilds=4;
    public static final int Parameter=52;
    public static final int Tag=125;
    public static final int None=109;
    public static final int RULE_BEGIN=135;
    public static final int Regexp=88;
    public static final int QuietPeriod=31;
    public static final int Label=94;
    public static final int True=121;
    public static final int Parallel=63;
    public static final int Unit=122;
    public static final int Cron=107;
    public static final int Comparator=43;
    public static final int Name=117;
    public static final int Timestamps=39;
    public static final int Input=93;
    public static final int BuildDiscarder=18;
    public static final int Unsuccessful=27;
    public static final int Retries=76;
    public static final int ReuseNode=53;
    public static final int RegistryCredentialsId=10;
    public static final int Override=62;
    public static final int PreserveStashes=16;
    public static final int Expected_val=25;
    public static final int Tool=112;
    public static final int Branch_1=84;
    public static final int Timeout=67;
    public static final int Upstream=58;
    public static final int Period=87;
    public static final int Aborted=68;
    public static final int Not=124;
    public static final int FailFast=60;
    public static final int Value=105;
    public static final int Environment=30;
    public static final int Glob=115;
    public static final int PasswordParam=22;
    public static final int RULE_END=136;
    public static final int Exclude=72;
    public static final int Fork=114;
    public static final int Message=74;
    public static final int When_Env=59;
    public static final int Time=119;
    public static final int RULE_STRING=139;
    public static final int AuthorEmail=34;
    public static final int Step=111;
    public static final int Cleanup=71;
    public static final int Tool_1=120;
    public static final int Any=123;
    public static final int RULE_SL_COMMENT=141;
    public static final int Abort=97;
    public static final int Submitter=54;
    public static final int Choices=70;
    public static final int Branch=78;
    public static final int BuildingTag=28;
    public static final int Changed=69;
    public static final int EOF=-1;
    public static final int Axis=106;
    public static final int Condition=50;
    public static final int DisableResume=21;
    public static final int Args=113;
    public static final int ChoiceParam=29;
    public static final int RULE_WS=142;
    public static final int Post=110;
    public static final int Regression=45;
    public static final int Title=104;
    public static final int RULE_ANY_OTHER=143;
    public static final int Dockerfile=37;
    public static final int SkipDefaultCheckout=12;
    public static final int Equals=80;
    public static final int Label_1=101;
    public static final int Timer=103;
    public static final int Command=65;
    public static final int Gradle=86;
    public static final int Ok=131;
    public static final int TextParam=48;
    public static final int AllOf=91;

    // delegates
    // delegators


        public InternalJenkinsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJenkinsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJenkinsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJenkinsParser.g"; }



     	private JenkinsGrammarAccess grammarAccess;

        public InternalJenkinsParser(TokenStream input, JenkinsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected JenkinsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalJenkinsParser.g:58:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalJenkinsParser.g:58:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalJenkinsParser.g:59:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalJenkinsParser.g:65:1: rulePipeline returns [EObject current=null] : (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? ) ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )? ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )? ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? ) ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_NEWLINE_1=null;
        Token this_NEWLINE_3=null;
        Token this_NEWLINE_5=null;
        Token this_NEWLINE_7=null;
        Token this_NEWLINE_9=null;
        Token this_NEWLINE_11=null;
        Token this_NEWLINE_13=null;
        Token this_NEWLINE_15=null;
        Token this_NEWLINE_17=null;
        EObject lv_agents_2_0 = null;

        EObject lv_options_4_0 = null;

        EObject lv_triggers_6_0 = null;

        EObject lv_parameter_directives_8_0 = null;

        EObject lv_environments_10_0 = null;

        EObject lv_tools_12_0 = null;

        EObject lv_stages_14_0 = null;

        EObject lv_post_16_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:71:2: ( (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? ) ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )? ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )? ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? ) ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )? ) )
            // InternalJenkinsParser.g:72:2: (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? ) ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )? ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )? ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? ) ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )? )
            {
            // InternalJenkinsParser.g:72:2: (otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? ) ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )? ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )? ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? ) ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )? )
            // InternalJenkinsParser.g:73:3: otherlv_0= Pipeline this_NEWLINE_1= RULE_NEWLINE ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? ) ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )? ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )? ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )? ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )? ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )? ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? ) ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )?
            {
            otherlv_0=(Token)match(input,Pipeline,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getPipelineKeyword_0());
            		
            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            			newLeafNode(this_NEWLINE_1, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1());
            		
            // InternalJenkinsParser.g:81:3: ( ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )? )
            // InternalJenkinsParser.g:82:4: ( (lv_agents_2_0= ruleAgent ) )+ (this_NEWLINE_3= RULE_NEWLINE )?
            {
            // InternalJenkinsParser.g:82:4: ( (lv_agents_2_0= ruleAgent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Dockerfile||LA1_0==Docker||LA1_0==Label||(LA1_0>=Node && LA1_0<=None)||LA1_0==Any) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJenkinsParser.g:83:5: (lv_agents_2_0= ruleAgent )
            	    {
            	    // InternalJenkinsParser.g:83:5: (lv_agents_2_0= ruleAgent )
            	    // InternalJenkinsParser.g:84:6: lv_agents_2_0= ruleAgent
            	    {

            	    						newCompositeNode(grammarAccess.getPipelineAccess().getAgentsAgentParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_agents_2_0=ruleAgent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"agents",
            	    							lv_agents_2_0,
            	    							"org.xtext.example.jenkins.Jenkins.Agent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalJenkinsParser.g:101:4: (this_NEWLINE_3= RULE_NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJenkinsParser.g:102:5: this_NEWLINE_3= RULE_NEWLINE
                    {
                    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                    					newLeafNode(this_NEWLINE_3, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_2_1());
                    				

                    }
                    break;

            }


            }

            // InternalJenkinsParser.g:108:3: ( ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=DisableConcurrentBuilds && LA5_0<=OverrideIndexTriggers)||(LA5_0>=NewContainerPerStage && LA5_0<=SkipDefaultCheckout)||LA5_0==PreserveStashes||LA5_0==BuildDiscarder||LA5_0==DisableResume||LA5_0==QuietPeriod||LA5_0==Timestamps||LA5_0==Timeout||LA5_0==Retry) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJenkinsParser.g:109:4: ( (lv_options_4_0= ruleOption ) )+ (this_NEWLINE_5= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:109:4: ( (lv_options_4_0= ruleOption ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=DisableConcurrentBuilds && LA3_0<=OverrideIndexTriggers)||(LA3_0>=NewContainerPerStage && LA3_0<=SkipDefaultCheckout)||LA3_0==PreserveStashes||LA3_0==BuildDiscarder||LA3_0==DisableResume||LA3_0==QuietPeriod||LA3_0==Timestamps||LA3_0==Timeout||LA3_0==Retry) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:110:5: (lv_options_4_0= ruleOption )
                    	    {
                    	    // InternalJenkinsParser.g:110:5: (lv_options_4_0= ruleOption )
                    	    // InternalJenkinsParser.g:111:6: lv_options_4_0= ruleOption
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getOptionsOptionParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_options_4_0=ruleOption();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"options",
                    	    							lv_options_4_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Option");
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

                    // InternalJenkinsParser.g:128:4: (this_NEWLINE_5= RULE_NEWLINE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_NEWLINE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalJenkinsParser.g:129:5: this_NEWLINE_5= RULE_NEWLINE
                            {
                            this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                            					newLeafNode(this_NEWLINE_5, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_3_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:135:3: ( ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Upstream||LA8_0==PollSCM||LA8_0==Cron) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJenkinsParser.g:136:4: ( (lv_triggers_6_0= ruleTrigger ) )+ (this_NEWLINE_7= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:136:4: ( (lv_triggers_6_0= ruleTrigger ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Upstream||LA6_0==PollSCM||LA6_0==Cron) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:137:5: (lv_triggers_6_0= ruleTrigger )
                    	    {
                    	    // InternalJenkinsParser.g:137:5: (lv_triggers_6_0= ruleTrigger )
                    	    // InternalJenkinsParser.g:138:6: lv_triggers_6_0= ruleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getTriggersTriggerParserRuleCall_4_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_triggers_6_0=ruleTrigger();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"triggers",
                    	    							lv_triggers_6_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Trigger");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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

                    // InternalJenkinsParser.g:155:4: (this_NEWLINE_7= RULE_NEWLINE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_NEWLINE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalJenkinsParser.g:156:5: this_NEWLINE_7= RULE_NEWLINE
                            {
                            this_NEWLINE_7=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                            					newLeafNode(this_NEWLINE_7, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:162:3: ( ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=PasswordParam && LA11_0<=BooleanParam)||LA11_0==ChoiceParam||LA11_0==StringParam||LA11_0==TextParam) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJenkinsParser.g:163:4: ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+ (this_NEWLINE_9= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:163:4: ( (lv_parameter_directives_8_0= ruleParameter_Directive ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=PasswordParam && LA9_0<=BooleanParam)||LA9_0==ChoiceParam||LA9_0==StringParam||LA9_0==TextParam) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:164:5: (lv_parameter_directives_8_0= ruleParameter_Directive )
                    	    {
                    	    // InternalJenkinsParser.g:164:5: (lv_parameter_directives_8_0= ruleParameter_Directive )
                    	    // InternalJenkinsParser.g:165:6: lv_parameter_directives_8_0= ruleParameter_Directive
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getParameter_directivesParameter_DirectiveParserRuleCall_5_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_directives_8_0=ruleParameter_Directive();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameter_directives",
                    	    							lv_parameter_directives_8_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Parameter_Directive");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // InternalJenkinsParser.g:182:4: (this_NEWLINE_9= RULE_NEWLINE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_NEWLINE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalJenkinsParser.g:183:5: this_NEWLINE_9= RULE_NEWLINE
                            {
                            this_NEWLINE_9=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                            					newLeafNode(this_NEWLINE_9, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_5_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:189:3: ( ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Environment) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJenkinsParser.g:190:4: ( (lv_environments_10_0= ruleEnvironment ) )+ (this_NEWLINE_11= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:190:4: ( (lv_environments_10_0= ruleEnvironment ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Environment) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:191:5: (lv_environments_10_0= ruleEnvironment )
                    	    {
                    	    // InternalJenkinsParser.g:191:5: (lv_environments_10_0= ruleEnvironment )
                    	    // InternalJenkinsParser.g:192:6: lv_environments_10_0= ruleEnvironment
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getEnvironmentsEnvironmentParserRuleCall_6_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_environments_10_0=ruleEnvironment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"environments",
                    	    							lv_environments_10_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Environment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // InternalJenkinsParser.g:209:4: (this_NEWLINE_11= RULE_NEWLINE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_NEWLINE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalJenkinsParser.g:210:5: this_NEWLINE_11= RULE_NEWLINE
                            {
                            this_NEWLINE_11=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                            					newLeafNode(this_NEWLINE_11, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_6_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:216:3: ( ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Tool) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJenkinsParser.g:217:4: ( (lv_tools_12_0= ruleTool ) )+ (this_NEWLINE_13= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:217:4: ( (lv_tools_12_0= ruleTool ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Tool) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:218:5: (lv_tools_12_0= ruleTool )
                    	    {
                    	    // InternalJenkinsParser.g:218:5: (lv_tools_12_0= ruleTool )
                    	    // InternalJenkinsParser.g:219:6: lv_tools_12_0= ruleTool
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getToolsToolParserRuleCall_7_0_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_tools_12_0=ruleTool();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tools",
                    	    							lv_tools_12_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Tool");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // InternalJenkinsParser.g:236:4: (this_NEWLINE_13= RULE_NEWLINE )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_NEWLINE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalJenkinsParser.g:237:5: this_NEWLINE_13= RULE_NEWLINE
                            {
                            this_NEWLINE_13=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

                            					newLeafNode(this_NEWLINE_13, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_7_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:243:3: ( ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )? )
            // InternalJenkinsParser.g:244:4: ( (lv_stages_14_0= ruleStage ) )+ (this_NEWLINE_15= RULE_NEWLINE )?
            {
            // InternalJenkinsParser.g:244:4: ( (lv_stages_14_0= ruleStage ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Stage) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJenkinsParser.g:245:5: (lv_stages_14_0= ruleStage )
            	    {
            	    // InternalJenkinsParser.g:245:5: (lv_stages_14_0= ruleStage )
            	    // InternalJenkinsParser.g:246:6: lv_stages_14_0= ruleStage
            	    {

            	    						newCompositeNode(grammarAccess.getPipelineAccess().getStagesStageParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_stages_14_0=ruleStage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stages",
            	    							lv_stages_14_0,
            	    							"org.xtext.example.jenkins.Jenkins.Stage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalJenkinsParser.g:263:4: (this_NEWLINE_15= RULE_NEWLINE )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NEWLINE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJenkinsParser.g:264:5: this_NEWLINE_15= RULE_NEWLINE
                    {
                    this_NEWLINE_15=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

                    					newLeafNode(this_NEWLINE_15, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_8_1());
                    				

                    }
                    break;

            }


            }

            // InternalJenkinsParser.g:270:3: ( ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Post) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJenkinsParser.g:271:4: ( (lv_post_16_0= rulePost ) )+ (this_NEWLINE_17= RULE_NEWLINE )?
                    {
                    // InternalJenkinsParser.g:271:4: ( (lv_post_16_0= rulePost ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Post) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalJenkinsParser.g:272:5: (lv_post_16_0= rulePost )
                    	    {
                    	    // InternalJenkinsParser.g:272:5: (lv_post_16_0= rulePost )
                    	    // InternalJenkinsParser.g:273:6: lv_post_16_0= rulePost
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getPostPostParserRuleCall_9_0_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_post_16_0=rulePost();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"post",
                    	    							lv_post_16_0,
                    	    							"org.xtext.example.jenkins.Jenkins.Post");
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

                    // InternalJenkinsParser.g:290:4: (this_NEWLINE_17= RULE_NEWLINE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_NEWLINE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalJenkinsParser.g:291:5: this_NEWLINE_17= RULE_NEWLINE
                            {
                            this_NEWLINE_17=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                            					newLeafNode(this_NEWLINE_17, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_9_1());
                            				

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


    // $ANTLR start "entryRuleParameter_Directive"
    // InternalJenkinsParser.g:301:1: entryRuleParameter_Directive returns [EObject current=null] : iv_ruleParameter_Directive= ruleParameter_Directive EOF ;
    public final EObject entryRuleParameter_Directive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_Directive = null;


        try {
            // InternalJenkinsParser.g:301:60: (iv_ruleParameter_Directive= ruleParameter_Directive EOF )
            // InternalJenkinsParser.g:302:2: iv_ruleParameter_Directive= ruleParameter_Directive EOF
            {
             newCompositeNode(grammarAccess.getParameter_DirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter_Directive=ruleParameter_Directive();

            state._fsp--;

             current =iv_ruleParameter_Directive; 
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
    // $ANTLR end "entryRuleParameter_Directive"


    // $ANTLR start "ruleParameter_Directive"
    // InternalJenkinsParser.g:308:1: ruleParameter_Directive returns [EObject current=null] : (this_StringParam_0= ruleStringParam | this_TextParam_1= ruleTextParam | this_ChoiceParam_2= ruleChoiceParam | this_PasswordParam_3= rulePasswordParam | this_BooleanParam_4= ruleBooleanParam ) ;
    public final EObject ruleParameter_Directive() throws RecognitionException {
        EObject current = null;

        EObject this_StringParam_0 = null;

        EObject this_TextParam_1 = null;

        EObject this_ChoiceParam_2 = null;

        EObject this_PasswordParam_3 = null;

        EObject this_BooleanParam_4 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:314:2: ( (this_StringParam_0= ruleStringParam | this_TextParam_1= ruleTextParam | this_ChoiceParam_2= ruleChoiceParam | this_PasswordParam_3= rulePasswordParam | this_BooleanParam_4= ruleBooleanParam ) )
            // InternalJenkinsParser.g:315:2: (this_StringParam_0= ruleStringParam | this_TextParam_1= ruleTextParam | this_ChoiceParam_2= ruleChoiceParam | this_PasswordParam_3= rulePasswordParam | this_BooleanParam_4= ruleBooleanParam )
            {
            // InternalJenkinsParser.g:315:2: (this_StringParam_0= ruleStringParam | this_TextParam_1= ruleTextParam | this_ChoiceParam_2= ruleChoiceParam | this_PasswordParam_3= rulePasswordParam | this_BooleanParam_4= ruleBooleanParam )
            int alt23=5;
            switch ( input.LA(1) ) {
            case StringParam:
                {
                alt23=1;
                }
                break;
            case TextParam:
                {
                alt23=2;
                }
                break;
            case ChoiceParam:
                {
                alt23=3;
                }
                break;
            case PasswordParam:
                {
                alt23=4;
                }
                break;
            case BooleanParam:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalJenkinsParser.g:316:3: this_StringParam_0= ruleStringParam
                    {

                    			newCompositeNode(grammarAccess.getParameter_DirectiveAccess().getStringParamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringParam_0=ruleStringParam();

                    state._fsp--;


                    			current = this_StringParam_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:325:3: this_TextParam_1= ruleTextParam
                    {

                    			newCompositeNode(grammarAccess.getParameter_DirectiveAccess().getTextParamParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextParam_1=ruleTextParam();

                    state._fsp--;


                    			current = this_TextParam_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:334:3: this_ChoiceParam_2= ruleChoiceParam
                    {

                    			newCompositeNode(grammarAccess.getParameter_DirectiveAccess().getChoiceParamParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChoiceParam_2=ruleChoiceParam();

                    state._fsp--;


                    			current = this_ChoiceParam_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:343:3: this_PasswordParam_3= rulePasswordParam
                    {

                    			newCompositeNode(grammarAccess.getParameter_DirectiveAccess().getPasswordParamParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PasswordParam_3=rulePasswordParam();

                    state._fsp--;


                    			current = this_PasswordParam_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:352:3: this_BooleanParam_4= ruleBooleanParam
                    {

                    			newCompositeNode(grammarAccess.getParameter_DirectiveAccess().getBooleanParamParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanParam_4=ruleBooleanParam();

                    state._fsp--;


                    			current = this_BooleanParam_4;
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
    // $ANTLR end "ruleParameter_Directive"


    // $ANTLR start "entryRuleAgent"
    // InternalJenkinsParser.g:364:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalJenkinsParser.g:364:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalJenkinsParser.g:365:2: iv_ruleAgent= ruleAgent EOF
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
    // InternalJenkinsParser.g:371:1: ruleAgent returns [EObject current=null] : (this_Node_0= ruleNode | this_Any_1= ruleAny | this_None_2= ruleNone | this_Dockerfile_3= ruleDockerfile | this_Docker_4= ruleDocker | this_Label_5= ruleLabel ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Any_1 = null;

        EObject this_None_2 = null;

        EObject this_Dockerfile_3 = null;

        EObject this_Docker_4 = null;

        EObject this_Label_5 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:377:2: ( (this_Node_0= ruleNode | this_Any_1= ruleAny | this_None_2= ruleNone | this_Dockerfile_3= ruleDockerfile | this_Docker_4= ruleDocker | this_Label_5= ruleLabel ) )
            // InternalJenkinsParser.g:378:2: (this_Node_0= ruleNode | this_Any_1= ruleAny | this_None_2= ruleNone | this_Dockerfile_3= ruleDockerfile | this_Docker_4= ruleDocker | this_Label_5= ruleLabel )
            {
            // InternalJenkinsParser.g:378:2: (this_Node_0= ruleNode | this_Any_1= ruleAny | this_None_2= ruleNone | this_Dockerfile_3= ruleDockerfile | this_Docker_4= ruleDocker | this_Label_5= ruleLabel )
            int alt24=6;
            switch ( input.LA(1) ) {
            case Node:
                {
                alt24=1;
                }
                break;
            case Any:
                {
                alt24=2;
                }
                break;
            case None:
                {
                alt24=3;
                }
                break;
            case Dockerfile:
                {
                alt24=4;
                }
                break;
            case Docker:
                {
                alt24=5;
                }
                break;
            case Label:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalJenkinsParser.g:379:3: this_Node_0= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;


                    			current = this_Node_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:388:3: this_Any_1= ruleAny
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getAnyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Any_1=ruleAny();

                    state._fsp--;


                    			current = this_Any_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:397:3: this_None_2= ruleNone
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getNoneParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_None_2=ruleNone();

                    state._fsp--;


                    			current = this_None_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:406:3: this_Dockerfile_3= ruleDockerfile
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getDockerfileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dockerfile_3=ruleDockerfile();

                    state._fsp--;


                    			current = this_Dockerfile_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:415:3: this_Docker_4= ruleDocker
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getDockerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Docker_4=ruleDocker();

                    state._fsp--;


                    			current = this_Docker_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJenkinsParser.g:424:3: this_Label_5= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getLabelParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_5=ruleLabel();

                    state._fsp--;


                    			current = this_Label_5;
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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleTrigger"
    // InternalJenkinsParser.g:436:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalJenkinsParser.g:436:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalJenkinsParser.g:437:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalJenkinsParser.g:443:1: ruleTrigger returns [EObject current=null] : (this_Cron_0= ruleCron | this_PollSCM_1= rulePollSCM | this_Upstream_2= ruleUpstream ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_Cron_0 = null;

        EObject this_PollSCM_1 = null;

        EObject this_Upstream_2 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:449:2: ( (this_Cron_0= ruleCron | this_PollSCM_1= rulePollSCM | this_Upstream_2= ruleUpstream ) )
            // InternalJenkinsParser.g:450:2: (this_Cron_0= ruleCron | this_PollSCM_1= rulePollSCM | this_Upstream_2= ruleUpstream )
            {
            // InternalJenkinsParser.g:450:2: (this_Cron_0= ruleCron | this_PollSCM_1= rulePollSCM | this_Upstream_2= ruleUpstream )
            int alt25=3;
            switch ( input.LA(1) ) {
            case Cron:
                {
                alt25=1;
                }
                break;
            case PollSCM:
                {
                alt25=2;
                }
                break;
            case Upstream:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalJenkinsParser.g:451:3: this_Cron_0= ruleCron
                    {

                    			newCompositeNode(grammarAccess.getTriggerAccess().getCronParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cron_0=ruleCron();

                    state._fsp--;


                    			current = this_Cron_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:460:3: this_PollSCM_1= rulePollSCM
                    {

                    			newCompositeNode(grammarAccess.getTriggerAccess().getPollSCMParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PollSCM_1=rulePollSCM();

                    state._fsp--;


                    			current = this_PollSCM_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:469:3: this_Upstream_2= ruleUpstream
                    {

                    			newCompositeNode(grammarAccess.getTriggerAccess().getUpstreamParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Upstream_2=ruleUpstream();

                    state._fsp--;


                    			current = this_Upstream_2;
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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleOption"
    // InternalJenkinsParser.g:481:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalJenkinsParser.g:481:47: (iv_ruleOption= ruleOption EOF )
            // InternalJenkinsParser.g:482:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalJenkinsParser.g:488:1: ruleOption returns [EObject current=null] : (this_BuildDiscarder_0= ruleBuildDiscarder | this_CheckoutToSubdirectory_1= ruleCheckoutToSubdirectory | this_SkipStagesAfterUnstable_2= ruleSkipStagesAfterUnstable | this_SkipDefaultCheckout_3= ruleSkipDefaultCheckout | this_Retry_4= ruleRetry | this_QuietPeriod_5= ruleQuietPeriod | this_PreserveStashes_6= rulePreserveStashes | this_Timeout_7= ruleTimeout | this_ParallelsAlwaysFailFast_8= ruleParallelsAlwaysFailFast | this_Timestamps_9= ruleTimestamps | this_DisableRestartFromStage_10= ruleDisableRestartFromStage | this_DisableResume_11= ruleDisableResume | this_OverrideIndexTriggers_12= ruleOverrideIndexTriggers | this_NewContainerPerStage_13= ruleNewContainerPerStage | this_DisableConcurrentBuilds_14= ruleDisableConcurrentBuilds ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_BuildDiscarder_0 = null;

        EObject this_CheckoutToSubdirectory_1 = null;

        EObject this_SkipStagesAfterUnstable_2 = null;

        EObject this_SkipDefaultCheckout_3 = null;

        EObject this_Retry_4 = null;

        EObject this_QuietPeriod_5 = null;

        EObject this_PreserveStashes_6 = null;

        EObject this_Timeout_7 = null;

        EObject this_ParallelsAlwaysFailFast_8 = null;

        EObject this_Timestamps_9 = null;

        EObject this_DisableRestartFromStage_10 = null;

        EObject this_DisableResume_11 = null;

        EObject this_OverrideIndexTriggers_12 = null;

        EObject this_NewContainerPerStage_13 = null;

        EObject this_DisableConcurrentBuilds_14 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:494:2: ( (this_BuildDiscarder_0= ruleBuildDiscarder | this_CheckoutToSubdirectory_1= ruleCheckoutToSubdirectory | this_SkipStagesAfterUnstable_2= ruleSkipStagesAfterUnstable | this_SkipDefaultCheckout_3= ruleSkipDefaultCheckout | this_Retry_4= ruleRetry | this_QuietPeriod_5= ruleQuietPeriod | this_PreserveStashes_6= rulePreserveStashes | this_Timeout_7= ruleTimeout | this_ParallelsAlwaysFailFast_8= ruleParallelsAlwaysFailFast | this_Timestamps_9= ruleTimestamps | this_DisableRestartFromStage_10= ruleDisableRestartFromStage | this_DisableResume_11= ruleDisableResume | this_OverrideIndexTriggers_12= ruleOverrideIndexTriggers | this_NewContainerPerStage_13= ruleNewContainerPerStage | this_DisableConcurrentBuilds_14= ruleDisableConcurrentBuilds ) )
            // InternalJenkinsParser.g:495:2: (this_BuildDiscarder_0= ruleBuildDiscarder | this_CheckoutToSubdirectory_1= ruleCheckoutToSubdirectory | this_SkipStagesAfterUnstable_2= ruleSkipStagesAfterUnstable | this_SkipDefaultCheckout_3= ruleSkipDefaultCheckout | this_Retry_4= ruleRetry | this_QuietPeriod_5= ruleQuietPeriod | this_PreserveStashes_6= rulePreserveStashes | this_Timeout_7= ruleTimeout | this_ParallelsAlwaysFailFast_8= ruleParallelsAlwaysFailFast | this_Timestamps_9= ruleTimestamps | this_DisableRestartFromStage_10= ruleDisableRestartFromStage | this_DisableResume_11= ruleDisableResume | this_OverrideIndexTriggers_12= ruleOverrideIndexTriggers | this_NewContainerPerStage_13= ruleNewContainerPerStage | this_DisableConcurrentBuilds_14= ruleDisableConcurrentBuilds )
            {
            // InternalJenkinsParser.g:495:2: (this_BuildDiscarder_0= ruleBuildDiscarder | this_CheckoutToSubdirectory_1= ruleCheckoutToSubdirectory | this_SkipStagesAfterUnstable_2= ruleSkipStagesAfterUnstable | this_SkipDefaultCheckout_3= ruleSkipDefaultCheckout | this_Retry_4= ruleRetry | this_QuietPeriod_5= ruleQuietPeriod | this_PreserveStashes_6= rulePreserveStashes | this_Timeout_7= ruleTimeout | this_ParallelsAlwaysFailFast_8= ruleParallelsAlwaysFailFast | this_Timestamps_9= ruleTimestamps | this_DisableRestartFromStage_10= ruleDisableRestartFromStage | this_DisableResume_11= ruleDisableResume | this_OverrideIndexTriggers_12= ruleOverrideIndexTriggers | this_NewContainerPerStage_13= ruleNewContainerPerStage | this_DisableConcurrentBuilds_14= ruleDisableConcurrentBuilds )
            int alt26=15;
            switch ( input.LA(1) ) {
            case BuildDiscarder:
                {
                alt26=1;
                }
                break;
            case CheckoutToSubdirectory:
                {
                alt26=2;
                }
                break;
            case SkipStagesAfterUnstable:
                {
                alt26=3;
                }
                break;
            case SkipDefaultCheckout:
                {
                alt26=4;
                }
                break;
            case Retry:
                {
                alt26=5;
                }
                break;
            case QuietPeriod:
                {
                alt26=6;
                }
                break;
            case PreserveStashes:
                {
                alt26=7;
                }
                break;
            case Timeout:
                {
                alt26=8;
                }
                break;
            case ParallelsAlwaysFailFast:
                {
                alt26=9;
                }
                break;
            case Timestamps:
                {
                alt26=10;
                }
                break;
            case DisableRestartFromStage:
                {
                alt26=11;
                }
                break;
            case DisableResume:
                {
                alt26=12;
                }
                break;
            case OverrideIndexTriggers:
                {
                alt26=13;
                }
                break;
            case NewContainerPerStage:
                {
                alt26=14;
                }
                break;
            case DisableConcurrentBuilds:
                {
                alt26=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalJenkinsParser.g:496:3: this_BuildDiscarder_0= ruleBuildDiscarder
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getBuildDiscarderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildDiscarder_0=ruleBuildDiscarder();

                    state._fsp--;


                    			current = this_BuildDiscarder_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:505:3: this_CheckoutToSubdirectory_1= ruleCheckoutToSubdirectory
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getCheckoutToSubdirectoryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckoutToSubdirectory_1=ruleCheckoutToSubdirectory();

                    state._fsp--;


                    			current = this_CheckoutToSubdirectory_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:514:3: this_SkipStagesAfterUnstable_2= ruleSkipStagesAfterUnstable
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getSkipStagesAfterUnstableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkipStagesAfterUnstable_2=ruleSkipStagesAfterUnstable();

                    state._fsp--;


                    			current = this_SkipStagesAfterUnstable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:523:3: this_SkipDefaultCheckout_3= ruleSkipDefaultCheckout
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getSkipDefaultCheckoutParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkipDefaultCheckout_3=ruleSkipDefaultCheckout();

                    state._fsp--;


                    			current = this_SkipDefaultCheckout_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:532:3: this_Retry_4= ruleRetry
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getRetryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Retry_4=ruleRetry();

                    state._fsp--;


                    			current = this_Retry_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJenkinsParser.g:541:3: this_QuietPeriod_5= ruleQuietPeriod
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getQuietPeriodParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuietPeriod_5=ruleQuietPeriod();

                    state._fsp--;


                    			current = this_QuietPeriod_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJenkinsParser.g:550:3: this_PreserveStashes_6= rulePreserveStashes
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getPreserveStashesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PreserveStashes_6=rulePreserveStashes();

                    state._fsp--;


                    			current = this_PreserveStashes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJenkinsParser.g:559:3: this_Timeout_7= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getTimeoutParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_7=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJenkinsParser.g:568:3: this_ParallelsAlwaysFailFast_8= ruleParallelsAlwaysFailFast
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getParallelsAlwaysFailFastParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelsAlwaysFailFast_8=ruleParallelsAlwaysFailFast();

                    state._fsp--;


                    			current = this_ParallelsAlwaysFailFast_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJenkinsParser.g:577:3: this_Timestamps_9= ruleTimestamps
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getTimestampsParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timestamps_9=ruleTimestamps();

                    state._fsp--;


                    			current = this_Timestamps_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJenkinsParser.g:586:3: this_DisableRestartFromStage_10= ruleDisableRestartFromStage
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDisableRestartFromStageParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisableRestartFromStage_10=ruleDisableRestartFromStage();

                    state._fsp--;


                    			current = this_DisableRestartFromStage_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJenkinsParser.g:595:3: this_DisableResume_11= ruleDisableResume
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDisableResumeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisableResume_11=ruleDisableResume();

                    state._fsp--;


                    			current = this_DisableResume_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJenkinsParser.g:604:3: this_OverrideIndexTriggers_12= ruleOverrideIndexTriggers
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOverrideIndexTriggersParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_OverrideIndexTriggers_12=ruleOverrideIndexTriggers();

                    state._fsp--;


                    			current = this_OverrideIndexTriggers_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJenkinsParser.g:613:3: this_NewContainerPerStage_13= ruleNewContainerPerStage
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getNewContainerPerStageParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewContainerPerStage_13=ruleNewContainerPerStage();

                    state._fsp--;


                    			current = this_NewContainerPerStage_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJenkinsParser.g:622:3: this_DisableConcurrentBuilds_14= ruleDisableConcurrentBuilds
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDisableConcurrentBuildsParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisableConcurrentBuilds_14=ruleDisableConcurrentBuilds();

                    state._fsp--;


                    			current = this_DisableConcurrentBuilds_14;
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleWhen"
    // InternalJenkinsParser.g:634:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalJenkinsParser.g:634:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalJenkinsParser.g:635:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalJenkinsParser.g:641:1: ruleWhen returns [EObject current=null] : (this_BuildingTag_0= ruleBuildingTag | this_Branch_1= ruleBranch | this_Changelog_2= ruleChangelog | this_TriggeredBy_3= ruleTriggeredBy | this_Expression_4= ruleExpression | this_ChangeSet_5= ruleChangeSet | this_Not_6= ruleNot | this_AnyOf_7= ruleAnyOf | this_Tag_8= ruleTag | this_When_Env_9= ruleWhen_Env | this_AllOf_10= ruleAllOf | this_Equals_11= ruleEquals | this_ChangeRequest_12= ruleChangeRequest ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        EObject this_BuildingTag_0 = null;

        EObject this_Branch_1 = null;

        EObject this_Changelog_2 = null;

        EObject this_TriggeredBy_3 = null;

        EObject this_Expression_4 = null;

        EObject this_ChangeSet_5 = null;

        EObject this_Not_6 = null;

        EObject this_AnyOf_7 = null;

        EObject this_Tag_8 = null;

        EObject this_When_Env_9 = null;

        EObject this_AllOf_10 = null;

        EObject this_Equals_11 = null;

        EObject this_ChangeRequest_12 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:647:2: ( (this_BuildingTag_0= ruleBuildingTag | this_Branch_1= ruleBranch | this_Changelog_2= ruleChangelog | this_TriggeredBy_3= ruleTriggeredBy | this_Expression_4= ruleExpression | this_ChangeSet_5= ruleChangeSet | this_Not_6= ruleNot | this_AnyOf_7= ruleAnyOf | this_Tag_8= ruleTag | this_When_Env_9= ruleWhen_Env | this_AllOf_10= ruleAllOf | this_Equals_11= ruleEquals | this_ChangeRequest_12= ruleChangeRequest ) )
            // InternalJenkinsParser.g:648:2: (this_BuildingTag_0= ruleBuildingTag | this_Branch_1= ruleBranch | this_Changelog_2= ruleChangelog | this_TriggeredBy_3= ruleTriggeredBy | this_Expression_4= ruleExpression | this_ChangeSet_5= ruleChangeSet | this_Not_6= ruleNot | this_AnyOf_7= ruleAnyOf | this_Tag_8= ruleTag | this_When_Env_9= ruleWhen_Env | this_AllOf_10= ruleAllOf | this_Equals_11= ruleEquals | this_ChangeRequest_12= ruleChangeRequest )
            {
            // InternalJenkinsParser.g:648:2: (this_BuildingTag_0= ruleBuildingTag | this_Branch_1= ruleBranch | this_Changelog_2= ruleChangelog | this_TriggeredBy_3= ruleTriggeredBy | this_Expression_4= ruleExpression | this_ChangeSet_5= ruleChangeSet | this_Not_6= ruleNot | this_AnyOf_7= ruleAnyOf | this_Tag_8= ruleTag | this_When_Env_9= ruleWhen_Env | this_AllOf_10= ruleAllOf | this_Equals_11= ruleEquals | this_ChangeRequest_12= ruleChangeRequest )
            int alt27=13;
            switch ( input.LA(1) ) {
            case BuildingTag:
                {
                alt27=1;
                }
                break;
            case Branch:
                {
                alt27=2;
                }
                break;
            case Changelog:
                {
                alt27=3;
                }
                break;
            case TriggeredBy:
                {
                alt27=4;
                }
                break;
            case Expression:
                {
                alt27=5;
                }
                break;
            case ChangeSet:
                {
                alt27=6;
                }
                break;
            case Not:
                {
                alt27=7;
                }
                break;
            case AnyOf:
                {
                alt27=8;
                }
                break;
            case Tag:
                {
                alt27=9;
                }
                break;
            case When_Env:
                {
                alt27=10;
                }
                break;
            case AllOf:
                {
                alt27=11;
                }
                break;
            case Equals:
                {
                alt27=12;
                }
                break;
            case ChangeRequest:
                {
                alt27=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalJenkinsParser.g:649:3: this_BuildingTag_0= ruleBuildingTag
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getBuildingTagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildingTag_0=ruleBuildingTag();

                    state._fsp--;


                    			current = this_BuildingTag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:658:3: this_Branch_1= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getBranchParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_1=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:667:3: this_Changelog_2= ruleChangelog
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getChangelogParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Changelog_2=ruleChangelog();

                    state._fsp--;


                    			current = this_Changelog_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:676:3: this_TriggeredBy_3= ruleTriggeredBy
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getTriggeredByParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggeredBy_3=ruleTriggeredBy();

                    state._fsp--;


                    			current = this_TriggeredBy_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:685:3: this_Expression_4= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJenkinsParser.g:694:3: this_ChangeSet_5= ruleChangeSet
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getChangeSetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeSet_5=ruleChangeSet();

                    state._fsp--;


                    			current = this_ChangeSet_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJenkinsParser.g:703:3: this_Not_6= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getNotParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_6=ruleNot();

                    state._fsp--;


                    			current = this_Not_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJenkinsParser.g:712:3: this_AnyOf_7= ruleAnyOf
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getAnyOfParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyOf_7=ruleAnyOf();

                    state._fsp--;


                    			current = this_AnyOf_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJenkinsParser.g:721:3: this_Tag_8= ruleTag
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getTagParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tag_8=ruleTag();

                    state._fsp--;


                    			current = this_Tag_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJenkinsParser.g:730:3: this_When_Env_9= ruleWhen_Env
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getWhen_EnvParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_Env_9=ruleWhen_Env();

                    state._fsp--;


                    			current = this_When_Env_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJenkinsParser.g:739:3: this_AllOf_10= ruleAllOf
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getAllOfParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllOf_10=ruleAllOf();

                    state._fsp--;


                    			current = this_AllOf_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJenkinsParser.g:748:3: this_Equals_11= ruleEquals
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getEqualsParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equals_11=ruleEquals();

                    state._fsp--;


                    			current = this_Equals_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJenkinsParser.g:757:3: this_ChangeRequest_12= ruleChangeRequest
                    {

                    			newCompositeNode(grammarAccess.getWhenAccess().getChangeRequestParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRequest_12=ruleChangeRequest();

                    state._fsp--;


                    			current = this_ChangeRequest_12;
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleStageOption"
    // InternalJenkinsParser.g:769:1: entryRuleStageOption returns [EObject current=null] : iv_ruleStageOption= ruleStageOption EOF ;
    public final EObject entryRuleStageOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStageOption = null;


        try {
            // InternalJenkinsParser.g:769:52: (iv_ruleStageOption= ruleStageOption EOF )
            // InternalJenkinsParser.g:770:2: iv_ruleStageOption= ruleStageOption EOF
            {
             newCompositeNode(grammarAccess.getStageOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStageOption=ruleStageOption();

            state._fsp--;

             current =iv_ruleStageOption; 
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
    // $ANTLR end "entryRuleStageOption"


    // $ANTLR start "ruleStageOption"
    // InternalJenkinsParser.g:776:1: ruleStageOption returns [EObject current=null] : (this_SkipDefaultCheckout_0= ruleSkipDefaultCheckout | this_Retry_1= ruleRetry | this_Timeout_2= ruleTimeout | this_Timestamps_3= ruleTimestamps ) ;
    public final EObject ruleStageOption() throws RecognitionException {
        EObject current = null;

        EObject this_SkipDefaultCheckout_0 = null;

        EObject this_Retry_1 = null;

        EObject this_Timeout_2 = null;

        EObject this_Timestamps_3 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:782:2: ( (this_SkipDefaultCheckout_0= ruleSkipDefaultCheckout | this_Retry_1= ruleRetry | this_Timeout_2= ruleTimeout | this_Timestamps_3= ruleTimestamps ) )
            // InternalJenkinsParser.g:783:2: (this_SkipDefaultCheckout_0= ruleSkipDefaultCheckout | this_Retry_1= ruleRetry | this_Timeout_2= ruleTimeout | this_Timestamps_3= ruleTimestamps )
            {
            // InternalJenkinsParser.g:783:2: (this_SkipDefaultCheckout_0= ruleSkipDefaultCheckout | this_Retry_1= ruleRetry | this_Timeout_2= ruleTimeout | this_Timestamps_3= ruleTimestamps )
            int alt28=4;
            switch ( input.LA(1) ) {
            case SkipDefaultCheckout:
                {
                alt28=1;
                }
                break;
            case Retry:
                {
                alt28=2;
                }
                break;
            case Timeout:
                {
                alt28=3;
                }
                break;
            case Timestamps:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalJenkinsParser.g:784:3: this_SkipDefaultCheckout_0= ruleSkipDefaultCheckout
                    {

                    			newCompositeNode(grammarAccess.getStageOptionAccess().getSkipDefaultCheckoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkipDefaultCheckout_0=ruleSkipDefaultCheckout();

                    state._fsp--;


                    			current = this_SkipDefaultCheckout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:793:3: this_Retry_1= ruleRetry
                    {

                    			newCompositeNode(grammarAccess.getStageOptionAccess().getRetryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Retry_1=ruleRetry();

                    state._fsp--;


                    			current = this_Retry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:802:3: this_Timeout_2= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getStageOptionAccess().getTimeoutParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_2=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:811:3: this_Timestamps_3= ruleTimestamps
                    {

                    			newCompositeNode(grammarAccess.getStageOptionAccess().getTimestampsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timestamps_3=ruleTimestamps();

                    state._fsp--;


                    			current = this_Timestamps_3;
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
    // $ANTLR end "ruleStageOption"


    // $ANTLR start "entryRuleEnvironment"
    // InternalJenkinsParser.g:823:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalJenkinsParser.g:823:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalJenkinsParser.g:824:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalJenkinsParser.g:830:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
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
            // InternalJenkinsParser.g:836:2: ( (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:837:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:837:2: (otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:838:3: otherlv_0= Environment (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalJenkinsParser.g:842:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalJenkinsParser.g:843:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Key ( (lv_key_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEnvironmentAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Key,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getKeyKeyword_1_1());
            			
            // InternalJenkinsParser.g:851:4: ( (lv_key_3_0= ruleEString ) )
            // InternalJenkinsParser.g:852:5: (lv_key_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:852:5: (lv_key_3_0= ruleEString )
            // InternalJenkinsParser.g:853:6: lv_key_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_key_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"key",
            							lv_key_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getValueKeyword_1_3());
            			
            // InternalJenkinsParser.g:874:4: ( (lv_value_5_0= ruleEString ) )
            // InternalJenkinsParser.g:875:5: (lv_value_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:875:5: (lv_value_5_0= ruleEString )
            // InternalJenkinsParser.g:876:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_14);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
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


    // $ANTLR start "entryRuleStage"
    // InternalJenkinsParser.g:902:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalJenkinsParser.g:902:46: (iv_ruleStage= ruleStage EOF )
            // InternalJenkinsParser.g:903:2: iv_ruleStage= ruleStage EOF
            {
             newCompositeNode(grammarAccess.getStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStage=ruleStage();

            state._fsp--;

             current =iv_ruleStage; 
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
    // $ANTLR end "entryRuleStage"


    // $ANTLR start "ruleStage"
    // InternalJenkinsParser.g:909:1: ruleStage returns [EObject current=null] : (otherlv_0= Stage (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END ) ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_parallel_4_0=null;
        Token lv_failFast_5_0=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_stages_6_0 = null;

        EObject lv_agents_7_0 = null;

        EObject lv_steps_8_0 = null;

        EObject lv_environments_9_0 = null;

        EObject lv_inputs_10_0 = null;

        EObject lv_when_11_0 = null;

        EObject lv_stage_options_12_0 = null;

        EObject lv_matrix_13_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:915:2: ( (otherlv_0= Stage (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END ) ) )
            // InternalJenkinsParser.g:916:2: (otherlv_0= Stage (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END ) )
            {
            // InternalJenkinsParser.g:916:2: (otherlv_0= Stage (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END ) )
            // InternalJenkinsParser.g:917:3: otherlv_0= Stage (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END )
            {
            otherlv_0=(Token)match(input,Stage,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStageAccess().getStageKeyword_0());
            		
            // InternalJenkinsParser.g:921:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END )
            // InternalJenkinsParser.g:922:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) ( (lv_parallel_4_0= Parallel ) )? ( (lv_failFast_5_0= FailFast ) )? ( (lv_stages_6_0= ruleStage ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_steps_8_0= ruleStep ) )* ( (lv_environments_9_0= ruleEnvironment ) )* ( (lv_inputs_10_0= ruleInput ) )* ( (lv_when_11_0= ruleWhen ) )* ( (lv_stage_options_12_0= ruleStageOption ) )* ( (lv_matrix_13_0= ruleMatrix ) )? this_END_14= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getStageAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:930:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:931:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:931:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:932:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStageAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStageRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:949:4: ( (lv_parallel_4_0= Parallel ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Parallel) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJenkinsParser.g:950:5: (lv_parallel_4_0= Parallel )
                    {
                    // InternalJenkinsParser.g:950:5: (lv_parallel_4_0= Parallel )
                    // InternalJenkinsParser.g:951:6: lv_parallel_4_0= Parallel
                    {
                    lv_parallel_4_0=(Token)match(input,Parallel,FOLLOW_17); 

                    						newLeafNode(lv_parallel_4_0, grammarAccess.getStageAccess().getParallelParallelKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStageRule());
                    						}
                    						setWithLastConsumed(current, "parallel", lv_parallel_4_0 != null, "parallel");
                    					

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:963:4: ( (lv_failFast_5_0= FailFast ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==FailFast) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJenkinsParser.g:964:5: (lv_failFast_5_0= FailFast )
                    {
                    // InternalJenkinsParser.g:964:5: (lv_failFast_5_0= FailFast )
                    // InternalJenkinsParser.g:965:6: lv_failFast_5_0= FailFast
                    {
                    lv_failFast_5_0=(Token)match(input,FailFast,FOLLOW_18); 

                    						newLeafNode(lv_failFast_5_0, grammarAccess.getStageAccess().getFailFastFailFastKeyword_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStageRule());
                    						}
                    						setWithLastConsumed(current, "failFast", lv_failFast_5_0 != null, "failFast");
                    					

                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:977:4: ( (lv_stages_6_0= ruleStage ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Stage) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalJenkinsParser.g:978:5: (lv_stages_6_0= ruleStage )
            	    {
            	    // InternalJenkinsParser.g:978:5: (lv_stages_6_0= ruleStage )
            	    // InternalJenkinsParser.g:979:6: lv_stages_6_0= ruleStage
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getStagesStageParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_stages_6_0=ruleStage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stages",
            	    							lv_stages_6_0,
            	    							"org.xtext.example.jenkins.Jenkins.Stage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalJenkinsParser.g:996:4: ( (lv_agents_7_0= ruleAgent ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Dockerfile||LA32_0==Docker||LA32_0==Label||(LA32_0>=Node && LA32_0<=None)||LA32_0==Any) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJenkinsParser.g:997:5: (lv_agents_7_0= ruleAgent )
            	    {
            	    // InternalJenkinsParser.g:997:5: (lv_agents_7_0= ruleAgent )
            	    // InternalJenkinsParser.g:998:6: lv_agents_7_0= ruleAgent
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getAgentsAgentParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_agents_7_0=ruleAgent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"agents",
            	    							lv_agents_7_0,
            	    							"org.xtext.example.jenkins.Jenkins.Agent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalJenkinsParser.g:1015:4: ( (lv_steps_8_0= ruleStep ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Step) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalJenkinsParser.g:1016:5: (lv_steps_8_0= ruleStep )
            	    {
            	    // InternalJenkinsParser.g:1016:5: (lv_steps_8_0= ruleStep )
            	    // InternalJenkinsParser.g:1017:6: lv_steps_8_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getStepsStepParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_steps_8_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_8_0,
            	    							"org.xtext.example.jenkins.Jenkins.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalJenkinsParser.g:1034:4: ( (lv_environments_9_0= ruleEnvironment ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Environment) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalJenkinsParser.g:1035:5: (lv_environments_9_0= ruleEnvironment )
            	    {
            	    // InternalJenkinsParser.g:1035:5: (lv_environments_9_0= ruleEnvironment )
            	    // InternalJenkinsParser.g:1036:6: lv_environments_9_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getEnvironmentsEnvironmentParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_environments_9_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_9_0,
            	    							"org.xtext.example.jenkins.Jenkins.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalJenkinsParser.g:1053:4: ( (lv_inputs_10_0= ruleInput ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Input) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalJenkinsParser.g:1054:5: (lv_inputs_10_0= ruleInput )
            	    {
            	    // InternalJenkinsParser.g:1054:5: (lv_inputs_10_0= ruleInput )
            	    // InternalJenkinsParser.g:1055:6: lv_inputs_10_0= ruleInput
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getInputsInputParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_inputs_10_0=ruleInput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_10_0,
            	    							"org.xtext.example.jenkins.Jenkins.Input");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalJenkinsParser.g:1072:4: ( (lv_when_11_0= ruleWhen ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ChangeRequest||LA36_0==BuildingTag||LA36_0==TriggeredBy||LA36_0==Expression||(LA36_0>=ChangeSet && LA36_0<=Changelog)||LA36_0==When_Env||LA36_0==Branch||LA36_0==Equals||(LA36_0>=AllOf && LA36_0<=AnyOf)||(LA36_0>=Not && LA36_0<=Tag)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalJenkinsParser.g:1073:5: (lv_when_11_0= ruleWhen )
            	    {
            	    // InternalJenkinsParser.g:1073:5: (lv_when_11_0= ruleWhen )
            	    // InternalJenkinsParser.g:1074:6: lv_when_11_0= ruleWhen
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getWhenWhenParserRuleCall_1_10_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_when_11_0=ruleWhen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_11_0,
            	    							"org.xtext.example.jenkins.Jenkins.When");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalJenkinsParser.g:1091:4: ( (lv_stage_options_12_0= ruleStageOption ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==SkipDefaultCheckout||LA37_0==Timestamps||LA37_0==Timeout||LA37_0==Retry) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalJenkinsParser.g:1092:5: (lv_stage_options_12_0= ruleStageOption )
            	    {
            	    // InternalJenkinsParser.g:1092:5: (lv_stage_options_12_0= ruleStageOption )
            	    // InternalJenkinsParser.g:1093:6: lv_stage_options_12_0= ruleStageOption
            	    {

            	    						newCompositeNode(grammarAccess.getStageAccess().getStage_optionsStageOptionParserRuleCall_1_11_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_stage_options_12_0=ruleStageOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stage_options",
            	    							lv_stage_options_12_0,
            	    							"org.xtext.example.jenkins.Jenkins.StageOption");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalJenkinsParser.g:1110:4: ( (lv_matrix_13_0= ruleMatrix ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Matrix) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalJenkinsParser.g:1111:5: (lv_matrix_13_0= ruleMatrix )
                    {
                    // InternalJenkinsParser.g:1111:5: (lv_matrix_13_0= ruleMatrix )
                    // InternalJenkinsParser.g:1112:6: lv_matrix_13_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getStageAccess().getMatrixMatrixParserRuleCall_1_12_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_matrix_13_0=ruleMatrix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStageRule());
                    						}
                    						set(
                    							current,
                    							"matrix",
                    							lv_matrix_13_0,
                    							"org.xtext.example.jenkins.Jenkins.Matrix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_14, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_13());
            			

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
    // $ANTLR end "ruleStage"


    // $ANTLR start "entryRulePost"
    // InternalJenkinsParser.g:1138:1: entryRulePost returns [EObject current=null] : iv_rulePost= rulePost EOF ;
    public final EObject entryRulePost() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePost = null;


        try {
            // InternalJenkinsParser.g:1138:45: (iv_rulePost= rulePost EOF )
            // InternalJenkinsParser.g:1139:2: iv_rulePost= rulePost EOF
            {
             newCompositeNode(grammarAccess.getPostRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePost=rulePost();

            state._fsp--;

             current =iv_rulePost; 
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
    // $ANTLR end "entryRulePost"


    // $ANTLR start "rulePost"
    // InternalJenkinsParser.g:1145:1: rulePost returns [EObject current=null] : (otherlv_0= Post (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) ) ;
    public final EObject rulePost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_5=null;
        Enumerator lv_condition_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1151:2: ( (otherlv_0= Post (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) ) )
            // InternalJenkinsParser.g:1152:2: (otherlv_0= Post (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) )
            {
            // InternalJenkinsParser.g:1152:2: (otherlv_0= Post (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) )
            // InternalJenkinsParser.g:1153:3: otherlv_0= Post (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            {
            otherlv_0=(Token)match(input,Post,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPostAccess().getPostKeyword_0());
            		
            // InternalJenkinsParser.g:1157:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            // InternalJenkinsParser.g:1158:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Condition ( (lv_condition_3_0= rulePOST_TYPE ) ) ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPostAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Condition,FOLLOW_26); 

            				newLeafNode(otherlv_2, grammarAccess.getPostAccess().getConditionKeyword_1_1());
            			
            // InternalJenkinsParser.g:1166:4: ( (lv_condition_3_0= rulePOST_TYPE ) )
            // InternalJenkinsParser.g:1167:5: (lv_condition_3_0= rulePOST_TYPE )
            {
            // InternalJenkinsParser.g:1167:5: (lv_condition_3_0= rulePOST_TYPE )
            // InternalJenkinsParser.g:1168:6: lv_condition_3_0= rulePOST_TYPE
            {

            						newCompositeNode(grammarAccess.getPostAccess().getConditionPOST_TYPEEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_27);
            lv_condition_3_0=rulePOST_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPostRule());
            						}
            						set(
            							current,
            							"condition",
            							lv_condition_3_0,
            							"org.xtext.example.jenkins.Jenkins.POST_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:1185:4: ( (lv_steps_4_0= ruleStep ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Step) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalJenkinsParser.g:1186:5: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalJenkinsParser.g:1186:5: (lv_steps_4_0= ruleStep )
            	    // InternalJenkinsParser.g:1187:6: lv_steps_4_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getPostAccess().getStepsStepParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPostRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_4_0,
            	    							"org.xtext.example.jenkins.Jenkins.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_5, grammarAccess.getPostAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "rulePost"


    // $ANTLR start "entryRuleTool"
    // InternalJenkinsParser.g:1213:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalJenkinsParser.g:1213:45: (iv_ruleTool= ruleTool EOF )
            // InternalJenkinsParser.g:1214:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
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
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalJenkinsParser.g:1220:1: ruleTool returns [EObject current=null] : (otherlv_0= Tool (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        Enumerator lv_tool_3_0 = null;

        AntlrDatatypeRuleToken lv_tool_name_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1226:2: ( (otherlv_0= Tool (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:1227:2: (otherlv_0= Tool (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:1227:2: (otherlv_0= Tool (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:1228:3: otherlv_0= Tool (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Tool,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getToolAccess().getToolKeyword_0());
            		
            // InternalJenkinsParser.g:1232:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalJenkinsParser.g:1233:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Tool_1 ( (lv_tool_3_0= ruleTOOL_TYPE ) ) otherlv_4= Tool_name ( (lv_tool_name_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getToolAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Tool_1,FOLLOW_30); 

            				newLeafNode(otherlv_2, grammarAccess.getToolAccess().getToolKeyword_1_1());
            			
            // InternalJenkinsParser.g:1241:4: ( (lv_tool_3_0= ruleTOOL_TYPE ) )
            // InternalJenkinsParser.g:1242:5: (lv_tool_3_0= ruleTOOL_TYPE )
            {
            // InternalJenkinsParser.g:1242:5: (lv_tool_3_0= ruleTOOL_TYPE )
            // InternalJenkinsParser.g:1243:6: lv_tool_3_0= ruleTOOL_TYPE
            {

            						newCompositeNode(grammarAccess.getToolAccess().getToolTOOL_TYPEEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_31);
            lv_tool_3_0=ruleTOOL_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getToolRule());
            						}
            						set(
            							current,
            							"tool",
            							lv_tool_3_0,
            							"org.xtext.example.jenkins.Jenkins.TOOL_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Tool_name,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getToolAccess().getTool_nameKeyword_1_3());
            			
            // InternalJenkinsParser.g:1264:4: ( (lv_tool_name_5_0= ruleEString ) )
            // InternalJenkinsParser.g:1265:5: (lv_tool_name_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:1265:5: (lv_tool_name_5_0= ruleEString )
            // InternalJenkinsParser.g:1266:6: lv_tool_name_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getToolAccess().getTool_nameEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_14);
            lv_tool_name_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getToolRule());
            						}
            						set(
            							current,
            							"tool_name",
            							lv_tool_name_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getToolAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleEString"
    // InternalJenkinsParser.g:1292:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJenkinsParser.g:1292:47: (iv_ruleEString= ruleEString EOF )
            // InternalJenkinsParser.g:1293:2: iv_ruleEString= ruleEString EOF
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
    // InternalJenkinsParser.g:1299:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:1305:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJenkinsParser.g:1306:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJenkinsParser.g:1306:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalJenkinsParser.g:1307:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:1315:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleStep"
    // InternalJenkinsParser.g:1326:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalJenkinsParser.g:1326:45: (iv_ruleStep= ruleStep EOF )
            // InternalJenkinsParser.g:1327:2: iv_ruleStep= ruleStep EOF
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
    // InternalJenkinsParser.g:1333:1: ruleStep returns [EObject current=null] : (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_4=null;
        EObject lv_commands_2_0 = null;

        EObject lv_step_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1339:2: ( (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:1340:2: (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:1340:2: (otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:1341:3: otherlv_0= Step (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Step,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
            		
            // InternalJenkinsParser.g:1345:3: (this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END )
            // InternalJenkinsParser.g:1346:4: this_BEGIN_1= RULE_BEGIN ( (lv_commands_2_0= ruleCommand ) ) ( (lv_step_parameters_3_0= ruleStep_Parameter ) )* this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStepAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalJenkinsParser.g:1350:4: ( (lv_commands_2_0= ruleCommand ) )
            // InternalJenkinsParser.g:1351:5: (lv_commands_2_0= ruleCommand )
            {
            // InternalJenkinsParser.g:1351:5: (lv_commands_2_0= ruleCommand )
            // InternalJenkinsParser.g:1352:6: lv_commands_2_0= ruleCommand
            {

            						newCompositeNode(grammarAccess.getStepAccess().getCommandsCommandParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_33);
            lv_commands_2_0=ruleCommand();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStepRule());
            						}
            						set(
            							current,
            							"commands",
            							lv_commands_2_0,
            							"org.xtext.example.jenkins.Jenkins.Command");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:1369:4: ( (lv_step_parameters_3_0= ruleStep_Parameter ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Step_Parameter) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalJenkinsParser.g:1370:5: (lv_step_parameters_3_0= ruleStep_Parameter )
            	    {
            	    // InternalJenkinsParser.g:1370:5: (lv_step_parameters_3_0= ruleStep_Parameter )
            	    // InternalJenkinsParser.g:1371:6: lv_step_parameters_3_0= ruleStep_Parameter
            	    {

            	    						newCompositeNode(grammarAccess.getStepAccess().getStep_parametersStep_ParameterParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_step_parameters_3_0=ruleStep_Parameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"step_parameters",
            	    							lv_step_parameters_3_0,
            	    							"org.xtext.example.jenkins.Jenkins.Step_Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getStepAccess().getENDTerminalRuleCall_1_3());
            			

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


    // $ANTLR start "entryRuleInput"
    // InternalJenkinsParser.g:1397:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalJenkinsParser.g:1397:46: (iv_ruleInput= ruleInput EOF )
            // InternalJenkinsParser.g:1398:2: iv_ruleInput= ruleInput EOF
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
    // InternalJenkinsParser.g:1404:1: ruleInput returns [EObject current=null] : (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_message_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_ok_7_0 = null;

        AntlrDatatypeRuleToken lv_submitter_9_0 = null;

        AntlrDatatypeRuleToken lv_submitterParameter_11_0 = null;

        EObject lv_parameter_directives_12_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1410:2: ( (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END ) ) )
            // InternalJenkinsParser.g:1411:2: (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END ) )
            {
            // InternalJenkinsParser.g:1411:2: (otherlv_0= Input (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END ) )
            // InternalJenkinsParser.g:1412:3: otherlv_0= Input (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END )
            {
            otherlv_0=(Token)match(input,Input,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalJenkinsParser.g:1416:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END )
            // InternalJenkinsParser.g:1417:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Message ( (lv_message_3_0= ruleEString ) ) (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )? (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )? (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )? ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )* this_END_13= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getInputAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Message,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getInputAccess().getMessageKeyword_1_1());
            			
            // InternalJenkinsParser.g:1425:4: ( (lv_message_3_0= ruleEString ) )
            // InternalJenkinsParser.g:1426:5: (lv_message_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:1426:5: (lv_message_3_0= ruleEString )
            // InternalJenkinsParser.g:1427:6: lv_message_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getInputAccess().getMessageEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_35);
            lv_message_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInputRule());
            						}
            						set(
            							current,
            							"message",
            							lv_message_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:1444:4: (otherlv_4= Id ( (lv_id_5_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Id) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJenkinsParser.g:1445:5: otherlv_4= Id ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Id,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getInputAccess().getIdKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:1449:5: ( (lv_id_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:1450:6: (lv_id_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:1450:6: (lv_id_5_0= ruleEString )
                    // InternalJenkinsParser.g:1451:7: lv_id_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getIdEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_36);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"id",
                    								lv_id_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:1469:4: (otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Ok) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJenkinsParser.g:1470:5: otherlv_6= Ok ( (lv_ok_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Ok,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getInputAccess().getOkKeyword_1_4_0());
                    				
                    // InternalJenkinsParser.g:1474:5: ( (lv_ok_7_0= ruleEString ) )
                    // InternalJenkinsParser.g:1475:6: (lv_ok_7_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:1475:6: (lv_ok_7_0= ruleEString )
                    // InternalJenkinsParser.g:1476:7: lv_ok_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getOkEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_37);
                    lv_ok_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"ok",
                    								lv_ok_7_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:1494:4: (otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Submitter) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJenkinsParser.g:1495:5: otherlv_8= Submitter ( (lv_submitter_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Submitter,FOLLOW_12); 

                    					newLeafNode(otherlv_8, grammarAccess.getInputAccess().getSubmitterKeyword_1_5_0());
                    				
                    // InternalJenkinsParser.g:1499:5: ( (lv_submitter_9_0= ruleEString ) )
                    // InternalJenkinsParser.g:1500:6: (lv_submitter_9_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:1500:6: (lv_submitter_9_0= ruleEString )
                    // InternalJenkinsParser.g:1501:7: lv_submitter_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getSubmitterEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_submitter_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"submitter",
                    								lv_submitter_9_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:1519:4: (otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SubmitterParameter) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJenkinsParser.g:1520:5: otherlv_10= SubmitterParameter ( (lv_submitterParameter_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,SubmitterParameter,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSubmitterParameterKeyword_1_6_0());
                    				
                    // InternalJenkinsParser.g:1524:5: ( (lv_submitterParameter_11_0= ruleEString ) )
                    // InternalJenkinsParser.g:1525:6: (lv_submitterParameter_11_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:1525:6: (lv_submitterParameter_11_0= ruleEString )
                    // InternalJenkinsParser.g:1526:7: lv_submitterParameter_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getSubmitterParameterEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_39);
                    lv_submitterParameter_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"submitterParameter",
                    								lv_submitterParameter_11_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:1544:4: ( (lv_parameter_directives_12_0= ruleParameter_Directive ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=PasswordParam && LA46_0<=BooleanParam)||LA46_0==ChoiceParam||LA46_0==StringParam||LA46_0==TextParam) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalJenkinsParser.g:1545:5: (lv_parameter_directives_12_0= ruleParameter_Directive )
            	    {
            	    // InternalJenkinsParser.g:1545:5: (lv_parameter_directives_12_0= ruleParameter_Directive )
            	    // InternalJenkinsParser.g:1546:6: lv_parameter_directives_12_0= ruleParameter_Directive
            	    {

            	    						newCompositeNode(grammarAccess.getInputAccess().getParameter_directivesParameter_DirectiveParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_parameter_directives_12_0=ruleParameter_Directive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameter_directives",
            	    							lv_parameter_directives_12_0,
            	    							"org.xtext.example.jenkins.Jenkins.Parameter_Directive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_13, grammarAccess.getInputAccess().getENDTerminalRuleCall_1_8());
            			

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


    // $ANTLR start "entryRuleMatrix"
    // InternalJenkinsParser.g:1572:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalJenkinsParser.g:1572:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalJenkinsParser.g:1573:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalJenkinsParser.g:1579:1: ruleMatrix returns [EObject current=null] : (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END ) ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_11=null;
        EObject lv_axis_2_0 = null;

        EObject lv_stages_3_0 = null;

        EObject lv_inputs_4_0 = null;

        EObject lv_when_5_0 = null;

        EObject lv_environments_6_0 = null;

        EObject lv_agents_7_0 = null;

        EObject lv_tools_8_0 = null;

        EObject lv_post_9_0 = null;

        EObject lv_stage_options_10_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1585:2: ( (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END ) ) )
            // InternalJenkinsParser.g:1586:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END ) )
            {
            // InternalJenkinsParser.g:1586:2: (otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END ) )
            // InternalJenkinsParser.g:1587:3: otherlv_0= Matrix (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
            		
            // InternalJenkinsParser.g:1591:3: (this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END )
            // InternalJenkinsParser.g:1592:4: this_BEGIN_1= RULE_BEGIN ( (lv_axis_2_0= ruleAxis ) )+ ( (lv_stages_3_0= ruleStage ) )+ ( (lv_inputs_4_0= ruleInput ) )* ( (lv_when_5_0= ruleWhen ) )* ( (lv_environments_6_0= ruleEnvironment ) )* ( (lv_agents_7_0= ruleAgent ) )* ( (lv_tools_8_0= ruleTool ) )* ( (lv_post_9_0= rulePost ) )* ( (lv_stage_options_10_0= ruleStageOption ) )* this_END_11= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getMatrixAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalJenkinsParser.g:1596:4: ( (lv_axis_2_0= ruleAxis ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Axis) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalJenkinsParser.g:1597:5: (lv_axis_2_0= ruleAxis )
            	    {
            	    // InternalJenkinsParser.g:1597:5: (lv_axis_2_0= ruleAxis )
            	    // InternalJenkinsParser.g:1598:6: lv_axis_2_0= ruleAxis
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getAxisAxisParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_axis_2_0=ruleAxis();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"axis",
            	    							lv_axis_2_0,
            	    							"org.xtext.example.jenkins.Jenkins.Axis");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalJenkinsParser.g:1615:4: ( (lv_stages_3_0= ruleStage ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Stage) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalJenkinsParser.g:1616:5: (lv_stages_3_0= ruleStage )
            	    {
            	    // InternalJenkinsParser.g:1616:5: (lv_stages_3_0= ruleStage )
            	    // InternalJenkinsParser.g:1617:6: lv_stages_3_0= ruleStage
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getStagesStageParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_stages_3_0=ruleStage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stages",
            	    							lv_stages_3_0,
            	    							"org.xtext.example.jenkins.Jenkins.Stage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // InternalJenkinsParser.g:1634:4: ( (lv_inputs_4_0= ruleInput ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Input) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalJenkinsParser.g:1635:5: (lv_inputs_4_0= ruleInput )
            	    {
            	    // InternalJenkinsParser.g:1635:5: (lv_inputs_4_0= ruleInput )
            	    // InternalJenkinsParser.g:1636:6: lv_inputs_4_0= ruleInput
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getInputsInputParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_inputs_4_0=ruleInput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_4_0,
            	    							"org.xtext.example.jenkins.Jenkins.Input");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalJenkinsParser.g:1653:4: ( (lv_when_5_0= ruleWhen ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ChangeRequest||LA50_0==BuildingTag||LA50_0==TriggeredBy||LA50_0==Expression||(LA50_0>=ChangeSet && LA50_0<=Changelog)||LA50_0==When_Env||LA50_0==Branch||LA50_0==Equals||(LA50_0>=AllOf && LA50_0<=AnyOf)||(LA50_0>=Not && LA50_0<=Tag)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalJenkinsParser.g:1654:5: (lv_when_5_0= ruleWhen )
            	    {
            	    // InternalJenkinsParser.g:1654:5: (lv_when_5_0= ruleWhen )
            	    // InternalJenkinsParser.g:1655:6: lv_when_5_0= ruleWhen
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getWhenWhenParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_when_5_0=ruleWhen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_5_0,
            	    							"org.xtext.example.jenkins.Jenkins.When");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalJenkinsParser.g:1672:4: ( (lv_environments_6_0= ruleEnvironment ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Environment) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalJenkinsParser.g:1673:5: (lv_environments_6_0= ruleEnvironment )
            	    {
            	    // InternalJenkinsParser.g:1673:5: (lv_environments_6_0= ruleEnvironment )
            	    // InternalJenkinsParser.g:1674:6: lv_environments_6_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getEnvironmentsEnvironmentParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_environments_6_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environments",
            	    							lv_environments_6_0,
            	    							"org.xtext.example.jenkins.Jenkins.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalJenkinsParser.g:1691:4: ( (lv_agents_7_0= ruleAgent ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==Dockerfile||LA52_0==Docker||LA52_0==Label||(LA52_0>=Node && LA52_0<=None)||LA52_0==Any) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalJenkinsParser.g:1692:5: (lv_agents_7_0= ruleAgent )
            	    {
            	    // InternalJenkinsParser.g:1692:5: (lv_agents_7_0= ruleAgent )
            	    // InternalJenkinsParser.g:1693:6: lv_agents_7_0= ruleAgent
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getAgentsAgentParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_agents_7_0=ruleAgent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"agents",
            	    							lv_agents_7_0,
            	    							"org.xtext.example.jenkins.Jenkins.Agent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalJenkinsParser.g:1710:4: ( (lv_tools_8_0= ruleTool ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Tool) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalJenkinsParser.g:1711:5: (lv_tools_8_0= ruleTool )
            	    {
            	    // InternalJenkinsParser.g:1711:5: (lv_tools_8_0= ruleTool )
            	    // InternalJenkinsParser.g:1712:6: lv_tools_8_0= ruleTool
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getToolsToolParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_tools_8_0=ruleTool();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tools",
            	    							lv_tools_8_0,
            	    							"org.xtext.example.jenkins.Jenkins.Tool");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalJenkinsParser.g:1729:4: ( (lv_post_9_0= rulePost ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Post) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalJenkinsParser.g:1730:5: (lv_post_9_0= rulePost )
            	    {
            	    // InternalJenkinsParser.g:1730:5: (lv_post_9_0= rulePost )
            	    // InternalJenkinsParser.g:1731:6: lv_post_9_0= rulePost
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getPostPostParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_post_9_0=rulePost();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"post",
            	    							lv_post_9_0,
            	    							"org.xtext.example.jenkins.Jenkins.Post");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalJenkinsParser.g:1748:4: ( (lv_stage_options_10_0= ruleStageOption ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==SkipDefaultCheckout||LA55_0==Timestamps||LA55_0==Timeout||LA55_0==Retry) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalJenkinsParser.g:1749:5: (lv_stage_options_10_0= ruleStageOption )
            	    {
            	    // InternalJenkinsParser.g:1749:5: (lv_stage_options_10_0= ruleStageOption )
            	    // InternalJenkinsParser.g:1750:6: lv_stage_options_10_0= ruleStageOption
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixAccess().getStage_optionsStageOptionParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_stage_options_10_0=ruleStageOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stage_options",
            	    							lv_stage_options_10_0,
            	    							"org.xtext.example.jenkins.Jenkins.StageOption");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_11, grammarAccess.getMatrixAccess().getENDTerminalRuleCall_1_10());
            			

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
    // InternalJenkinsParser.g:1776:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalJenkinsParser.g:1776:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalJenkinsParser.g:1777:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalJenkinsParser.g:1783:1: ruleCommand returns [EObject current=null] : ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1789:2: ( ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            // InternalJenkinsParser.g:1790:2: ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            {
            // InternalJenkinsParser.g:1790:2: ( () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END ) )
            // InternalJenkinsParser.g:1791:3: () otherlv_1= Command (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            {
            // InternalJenkinsParser.g:1791:3: ()
            // InternalJenkinsParser.g:1792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Command,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
            		
            // InternalJenkinsParser.g:1802:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END )
            // InternalJenkinsParser.g:1803:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getNameKeyword_2_1());
            			
            // InternalJenkinsParser.g:1811:4: ( (lv_name_4_0= ruleEString ) )
            // InternalJenkinsParser.g:1812:5: (lv_name_4_0= ruleEString )
            {
            // InternalJenkinsParser.g:1812:5: (lv_name_4_0= ruleEString )
            // InternalJenkinsParser.g:1813:6: lv_name_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCommandRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_4_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
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


    // $ANTLR start "entryRuleStep_Parameter"
    // InternalJenkinsParser.g:1839:1: entryRuleStep_Parameter returns [EObject current=null] : iv_ruleStep_Parameter= ruleStep_Parameter EOF ;
    public final EObject entryRuleStep_Parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep_Parameter = null;


        try {
            // InternalJenkinsParser.g:1839:55: (iv_ruleStep_Parameter= ruleStep_Parameter EOF )
            // InternalJenkinsParser.g:1840:2: iv_ruleStep_Parameter= ruleStep_Parameter EOF
            {
             newCompositeNode(grammarAccess.getStep_ParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep_Parameter=ruleStep_Parameter();

            state._fsp--;

             current =iv_ruleStep_Parameter; 
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
    // $ANTLR end "entryRuleStep_Parameter"


    // $ANTLR start "ruleStep_Parameter"
    // InternalJenkinsParser.g:1846:1: ruleStep_Parameter returns [EObject current=null] : (otherlv_0= Step_Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleStep_Parameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1852:2: ( (otherlv_0= Step_Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:1853:2: (otherlv_0= Step_Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:1853:2: (otherlv_0= Step_Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:1854:3: otherlv_0= Step_Parameter (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Step_Parameter,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStep_ParameterAccess().getStep_ParameterKeyword_0());
            		
            // InternalJenkinsParser.g:1858:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:1859:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStep_ParameterAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Parameter,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getStep_ParameterAccess().getParameterKeyword_1_1());
            			
            // InternalJenkinsParser.g:1867:4: ( (lv_parameter_3_0= ruleEString ) )
            // InternalJenkinsParser.g:1868:5: (lv_parameter_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:1868:5: (lv_parameter_3_0= ruleEString )
            // InternalJenkinsParser.g:1869:6: lv_parameter_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStep_ParameterAccess().getParameterEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_parameter_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStep_ParameterRule());
            						}
            						set(
            							current,
            							"parameter",
            							lv_parameter_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getStep_ParameterAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleStep_Parameter"


    // $ANTLR start "entryRuleBuildingTag"
    // InternalJenkinsParser.g:1895:1: entryRuleBuildingTag returns [EObject current=null] : iv_ruleBuildingTag= ruleBuildingTag EOF ;
    public final EObject entryRuleBuildingTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildingTag = null;


        try {
            // InternalJenkinsParser.g:1895:52: (iv_ruleBuildingTag= ruleBuildingTag EOF )
            // InternalJenkinsParser.g:1896:2: iv_ruleBuildingTag= ruleBuildingTag EOF
            {
             newCompositeNode(grammarAccess.getBuildingTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildingTag=ruleBuildingTag();

            state._fsp--;

             current =iv_ruleBuildingTag; 
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
    // $ANTLR end "entryRuleBuildingTag"


    // $ANTLR start "ruleBuildingTag"
    // InternalJenkinsParser.g:1902:1: ruleBuildingTag returns [EObject current=null] : ( () otherlv_1= BuildingTag ) ;
    public final EObject ruleBuildingTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:1908:2: ( ( () otherlv_1= BuildingTag ) )
            // InternalJenkinsParser.g:1909:2: ( () otherlv_1= BuildingTag )
            {
            // InternalJenkinsParser.g:1909:2: ( () otherlv_1= BuildingTag )
            // InternalJenkinsParser.g:1910:3: () otherlv_1= BuildingTag
            {
            // InternalJenkinsParser.g:1910:3: ()
            // InternalJenkinsParser.g:1911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildingTagAccess().getBuildingTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,BuildingTag,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildingTagAccess().getBuildingTagKeyword_1());
            		

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
    // $ANTLR end "ruleBuildingTag"


    // $ANTLR start "entryRuleBranch"
    // InternalJenkinsParser.g:1925:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalJenkinsParser.g:1925:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalJenkinsParser.g:1926:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalJenkinsParser.g:1932:1: ruleBranch returns [EObject current=null] : (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_pattern_3_0 = null;

        Enumerator lv_comparator_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:1938:2: ( (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:1939:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:1939:2: (otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:1940:3: otherlv_0= Branch (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Branch,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            // InternalJenkinsParser.g:1944:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            // InternalJenkinsParser.g:1945:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBranchAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Pattern,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getPatternKeyword_1_1());
            			
            // InternalJenkinsParser.g:1953:4: ( (lv_pattern_3_0= ruleEString ) )
            // InternalJenkinsParser.g:1954:5: (lv_pattern_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:1954:5: (lv_pattern_3_0= ruleEString )
            // InternalJenkinsParser.g:1955:6: lv_pattern_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBranchAccess().getPatternEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_52);
            lv_pattern_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBranchRule());
            						}
            						set(
            							current,
            							"pattern",
            							lv_pattern_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:1972:4: (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Comparator) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJenkinsParser.g:1973:5: otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    {
                    otherlv_4=(Token)match(input,Comparator,FOLLOW_53); 

                    					newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getComparatorKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:1977:5: ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    // InternalJenkinsParser.g:1978:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    {
                    // InternalJenkinsParser.g:1978:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    // InternalJenkinsParser.g:1979:7: lv_comparator_5_0= ruleCOMPARATOR_TYPE
                    {

                    							newCompositeNode(grammarAccess.getBranchAccess().getComparatorCOMPARATOR_TYPEEnumRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_comparator_5_0=ruleCOMPARATOR_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    							}
                    							set(
                    								current,
                    								"comparator",
                    								lv_comparator_5_0,
                    								"org.xtext.example.jenkins.Jenkins.COMPARATOR_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getBranchAccess().getENDTerminalRuleCall_1_4());
            			

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


    // $ANTLR start "entryRuleChangelog"
    // InternalJenkinsParser.g:2006:1: entryRuleChangelog returns [EObject current=null] : iv_ruleChangelog= ruleChangelog EOF ;
    public final EObject entryRuleChangelog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangelog = null;


        try {
            // InternalJenkinsParser.g:2006:50: (iv_ruleChangelog= ruleChangelog EOF )
            // InternalJenkinsParser.g:2007:2: iv_ruleChangelog= ruleChangelog EOF
            {
             newCompositeNode(grammarAccess.getChangelogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangelog=ruleChangelog();

            state._fsp--;

             current =iv_ruleChangelog; 
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
    // $ANTLR end "entryRuleChangelog"


    // $ANTLR start "ruleChangelog"
    // InternalJenkinsParser.g:2013:1: ruleChangelog returns [EObject current=null] : (otherlv_0= Changelog (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleChangelog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2019:2: ( (otherlv_0= Changelog (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2020:2: (otherlv_0= Changelog (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2020:2: (otherlv_0= Changelog (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2021:3: otherlv_0= Changelog (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Changelog,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChangelogAccess().getChangelogKeyword_0());
            		
            // InternalJenkinsParser.g:2025:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:2026:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getChangelogAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Expression_1,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getChangelogAccess().getExpressionKeyword_1_1());
            			
            // InternalJenkinsParser.g:2034:4: ( (lv_expression_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2035:5: (lv_expression_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2035:5: (lv_expression_3_0= ruleEString )
            // InternalJenkinsParser.g:2036:6: lv_expression_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getChangelogAccess().getExpressionEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_expression_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChangelogRule());
            						}
            						set(
            							current,
            							"expression",
            							lv_expression_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getChangelogAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleChangelog"


    // $ANTLR start "entryRuleTriggeredBy"
    // InternalJenkinsParser.g:2062:1: entryRuleTriggeredBy returns [EObject current=null] : iv_ruleTriggeredBy= ruleTriggeredBy EOF ;
    public final EObject entryRuleTriggeredBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredBy = null;


        try {
            // InternalJenkinsParser.g:2062:52: (iv_ruleTriggeredBy= ruleTriggeredBy EOF )
            // InternalJenkinsParser.g:2063:2: iv_ruleTriggeredBy= ruleTriggeredBy EOF
            {
             newCompositeNode(grammarAccess.getTriggeredByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggeredBy=ruleTriggeredBy();

            state._fsp--;

             current =iv_ruleTriggeredBy; 
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
    // $ANTLR end "entryRuleTriggeredBy"


    // $ANTLR start "ruleTriggeredBy"
    // InternalJenkinsParser.g:2069:1: ruleTriggeredBy returns [EObject current=null] : (otherlv_0= TriggeredBy (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleTriggeredBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2075:2: ( (otherlv_0= TriggeredBy (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2076:2: (otherlv_0= TriggeredBy (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2076:2: (otherlv_0= TriggeredBy (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2077:3: otherlv_0= TriggeredBy (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,TriggeredBy,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggeredByAccess().getTriggeredByKeyword_0());
            		
            // InternalJenkinsParser.g:2081:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:2082:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Parameter ( (lv_parameter_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTriggeredByAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Parameter,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getTriggeredByAccess().getParameterKeyword_1_1());
            			
            // InternalJenkinsParser.g:2090:4: ( (lv_parameter_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2091:5: (lv_parameter_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2091:5: (lv_parameter_3_0= ruleEString )
            // InternalJenkinsParser.g:2092:6: lv_parameter_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTriggeredByAccess().getParameterEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_parameter_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTriggeredByRule());
            						}
            						set(
            							current,
            							"parameter",
            							lv_parameter_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getTriggeredByAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleTriggeredBy"


    // $ANTLR start "entryRuleExpression"
    // InternalJenkinsParser.g:2118:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJenkinsParser.g:2118:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJenkinsParser.g:2119:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJenkinsParser.g:2125:1: ruleExpression returns [EObject current=null] : (otherlv_0= Expression (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2131:2: ( (otherlv_0= Expression (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2132:2: (otherlv_0= Expression (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2132:2: (otherlv_0= Expression (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2133:3: otherlv_0= Expression (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Expression,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            // InternalJenkinsParser.g:2137:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:2138:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Expression_1 ( (lv_expression_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getExpressionAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Expression_1,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getExpressionKeyword_1_1());
            			
            // InternalJenkinsParser.g:2146:4: ( (lv_expression_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2147:5: (lv_expression_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2147:5: (lv_expression_3_0= ruleEString )
            // InternalJenkinsParser.g:2148:6: lv_expression_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_expression_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getExpressionRule());
            						}
            						set(
            							current,
            							"expression",
            							lv_expression_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getExpressionAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleChangeSet"
    // InternalJenkinsParser.g:2174:1: entryRuleChangeSet returns [EObject current=null] : iv_ruleChangeSet= ruleChangeSet EOF ;
    public final EObject entryRuleChangeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeSet = null;


        try {
            // InternalJenkinsParser.g:2174:50: (iv_ruleChangeSet= ruleChangeSet EOF )
            // InternalJenkinsParser.g:2175:2: iv_ruleChangeSet= ruleChangeSet EOF
            {
             newCompositeNode(grammarAccess.getChangeSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeSet=ruleChangeSet();

            state._fsp--;

             current =iv_ruleChangeSet; 
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
    // $ANTLR end "entryRuleChangeSet"


    // $ANTLR start "ruleChangeSet"
    // InternalJenkinsParser.g:2181:1: ruleChangeSet returns [EObject current=null] : (otherlv_0= ChangeSet (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) ;
    public final EObject ruleChangeSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_pattern_3_0 = null;

        Enumerator lv_comparator_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2187:2: ( (otherlv_0= ChangeSet (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:2188:2: (otherlv_0= ChangeSet (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:2188:2: (otherlv_0= ChangeSet (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:2189:3: otherlv_0= ChangeSet (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,ChangeSet,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeSetAccess().getChangeSetKeyword_0());
            		
            // InternalJenkinsParser.g:2193:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            // InternalJenkinsParser.g:2194:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getChangeSetAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Pattern,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getChangeSetAccess().getPatternKeyword_1_1());
            			
            // InternalJenkinsParser.g:2202:4: ( (lv_pattern_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2203:5: (lv_pattern_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2203:5: (lv_pattern_3_0= ruleEString )
            // InternalJenkinsParser.g:2204:6: lv_pattern_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getChangeSetAccess().getPatternEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_52);
            lv_pattern_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChangeSetRule());
            						}
            						set(
            							current,
            							"pattern",
            							lv_pattern_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:2221:4: (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Comparator) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJenkinsParser.g:2222:5: otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    {
                    otherlv_4=(Token)match(input,Comparator,FOLLOW_53); 

                    					newLeafNode(otherlv_4, grammarAccess.getChangeSetAccess().getComparatorKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:2226:5: ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    // InternalJenkinsParser.g:2227:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    {
                    // InternalJenkinsParser.g:2227:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    // InternalJenkinsParser.g:2228:7: lv_comparator_5_0= ruleCOMPARATOR_TYPE
                    {

                    							newCompositeNode(grammarAccess.getChangeSetAccess().getComparatorCOMPARATOR_TYPEEnumRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_comparator_5_0=ruleCOMPARATOR_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChangeSetRule());
                    							}
                    							set(
                    								current,
                    								"comparator",
                    								lv_comparator_5_0,
                    								"org.xtext.example.jenkins.Jenkins.COMPARATOR_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getChangeSetAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleChangeSet"


    // $ANTLR start "entryRuleNot"
    // InternalJenkinsParser.g:2255:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalJenkinsParser.g:2255:44: (iv_ruleNot= ruleNot EOF )
            // InternalJenkinsParser.g:2256:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalJenkinsParser.g:2262:1: ruleNot returns [EObject current=null] : ( () otherlv_1= Not (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_when_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2268:2: ( ( () otherlv_1= Not (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2269:2: ( () otherlv_1= Not (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2269:2: ( () otherlv_1= Not (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2270:3: () otherlv_1= Not (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END )
            {
            // InternalJenkinsParser.g:2270:3: ()
            // InternalJenkinsParser.g:2271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotAccess().getNotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Not,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_1());
            		
            // InternalJenkinsParser.g:2281:3: (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END )
            // InternalJenkinsParser.g:2282:4: this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getNotAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalJenkinsParser.g:2286:4: ( (lv_when_3_0= ruleWhen ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==ChangeRequest||LA58_0==BuildingTag||LA58_0==TriggeredBy||LA58_0==Expression||(LA58_0>=ChangeSet && LA58_0<=Changelog)||LA58_0==When_Env||LA58_0==Branch||LA58_0==Equals||(LA58_0>=AllOf && LA58_0<=AnyOf)||(LA58_0>=Not && LA58_0<=Tag)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalJenkinsParser.g:2287:5: (lv_when_3_0= ruleWhen )
            	    {
            	    // InternalJenkinsParser.g:2287:5: (lv_when_3_0= ruleWhen )
            	    // InternalJenkinsParser.g:2288:6: lv_when_3_0= ruleWhen
            	    {

            	    						newCompositeNode(grammarAccess.getNotAccess().getWhenWhenParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_when_3_0=ruleWhen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_3_0,
            	    							"org.xtext.example.jenkins.Jenkins.When");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getNotAccess().getENDTerminalRuleCall_2_2());
            			

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAnyOf"
    // InternalJenkinsParser.g:2314:1: entryRuleAnyOf returns [EObject current=null] : iv_ruleAnyOf= ruleAnyOf EOF ;
    public final EObject entryRuleAnyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyOf = null;


        try {
            // InternalJenkinsParser.g:2314:46: (iv_ruleAnyOf= ruleAnyOf EOF )
            // InternalJenkinsParser.g:2315:2: iv_ruleAnyOf= ruleAnyOf EOF
            {
             newCompositeNode(grammarAccess.getAnyOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyOf=ruleAnyOf();

            state._fsp--;

             current =iv_ruleAnyOf; 
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
    // $ANTLR end "entryRuleAnyOf"


    // $ANTLR start "ruleAnyOf"
    // InternalJenkinsParser.g:2321:1: ruleAnyOf returns [EObject current=null] : ( () otherlv_1= AnyOf (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) ) ;
    public final EObject ruleAnyOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_when_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2327:2: ( ( () otherlv_1= AnyOf (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2328:2: ( () otherlv_1= AnyOf (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2328:2: ( () otherlv_1= AnyOf (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2329:3: () otherlv_1= AnyOf (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END )
            {
            // InternalJenkinsParser.g:2329:3: ()
            // InternalJenkinsParser.g:2330:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnyOfAccess().getAnyOfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,AnyOf,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAnyOfAccess().getAnyOfKeyword_1());
            		
            // InternalJenkinsParser.g:2340:3: (this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END )
            // InternalJenkinsParser.g:2341:4: this_BEGIN_2= RULE_BEGIN ( (lv_when_3_0= ruleWhen ) )+ this_END_4= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getAnyOfAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalJenkinsParser.g:2345:4: ( (lv_when_3_0= ruleWhen ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ChangeRequest||LA59_0==BuildingTag||LA59_0==TriggeredBy||LA59_0==Expression||(LA59_0>=ChangeSet && LA59_0<=Changelog)||LA59_0==When_Env||LA59_0==Branch||LA59_0==Equals||(LA59_0>=AllOf && LA59_0<=AnyOf)||(LA59_0>=Not && LA59_0<=Tag)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalJenkinsParser.g:2346:5: (lv_when_3_0= ruleWhen )
            	    {
            	    // InternalJenkinsParser.g:2346:5: (lv_when_3_0= ruleWhen )
            	    // InternalJenkinsParser.g:2347:6: lv_when_3_0= ruleWhen
            	    {

            	    						newCompositeNode(grammarAccess.getAnyOfAccess().getWhenWhenParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_when_3_0=ruleWhen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAnyOfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_3_0,
            	    							"org.xtext.example.jenkins.Jenkins.When");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getAnyOfAccess().getENDTerminalRuleCall_2_2());
            			

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
    // $ANTLR end "ruleAnyOf"


    // $ANTLR start "entryRuleTag"
    // InternalJenkinsParser.g:2373:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalJenkinsParser.g:2373:44: (iv_ruleTag= ruleTag EOF )
            // InternalJenkinsParser.g:2374:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalJenkinsParser.g:2380:1: ruleTag returns [EObject current=null] : (otherlv_0= Tag (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_pattern_3_0 = null;

        Enumerator lv_comparator_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2386:2: ( (otherlv_0= Tag (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:2387:2: (otherlv_0= Tag (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:2387:2: (otherlv_0= Tag (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:2388:3: otherlv_0= Tag (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Tag,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getTagKeyword_0());
            		
            // InternalJenkinsParser.g:2392:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END )
            // InternalJenkinsParser.g:2393:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Pattern ( (lv_pattern_3_0= ruleEString ) ) (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )? this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTagAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Pattern,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getTagAccess().getPatternKeyword_1_1());
            			
            // InternalJenkinsParser.g:2401:4: ( (lv_pattern_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2402:5: (lv_pattern_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2402:5: (lv_pattern_3_0= ruleEString )
            // InternalJenkinsParser.g:2403:6: lv_pattern_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTagAccess().getPatternEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_52);
            lv_pattern_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTagRule());
            						}
            						set(
            							current,
            							"pattern",
            							lv_pattern_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:2420:4: (otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Comparator) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJenkinsParser.g:2421:5: otherlv_4= Comparator ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    {
                    otherlv_4=(Token)match(input,Comparator,FOLLOW_53); 

                    					newLeafNode(otherlv_4, grammarAccess.getTagAccess().getComparatorKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:2425:5: ( (lv_comparator_5_0= ruleCOMPARATOR_TYPE ) )
                    // InternalJenkinsParser.g:2426:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    {
                    // InternalJenkinsParser.g:2426:6: (lv_comparator_5_0= ruleCOMPARATOR_TYPE )
                    // InternalJenkinsParser.g:2427:7: lv_comparator_5_0= ruleCOMPARATOR_TYPE
                    {

                    							newCompositeNode(grammarAccess.getTagAccess().getComparatorCOMPARATOR_TYPEEnumRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_comparator_5_0=ruleCOMPARATOR_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTagRule());
                    							}
                    							set(
                    								current,
                    								"comparator",
                    								lv_comparator_5_0,
                    								"org.xtext.example.jenkins.Jenkins.COMPARATOR_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getTagAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleWhen_Env"
    // InternalJenkinsParser.g:2454:1: entryRuleWhen_Env returns [EObject current=null] : iv_ruleWhen_Env= ruleWhen_Env EOF ;
    public final EObject entryRuleWhen_Env() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen_Env = null;


        try {
            // InternalJenkinsParser.g:2454:49: (iv_ruleWhen_Env= ruleWhen_Env EOF )
            // InternalJenkinsParser.g:2455:2: iv_ruleWhen_Env= ruleWhen_Env EOF
            {
             newCompositeNode(grammarAccess.getWhen_EnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen_Env=ruleWhen_Env();

            state._fsp--;

             current =iv_ruleWhen_Env; 
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
    // $ANTLR end "entryRuleWhen_Env"


    // $ANTLR start "ruleWhen_Env"
    // InternalJenkinsParser.g:2461:1: ruleWhen_Env returns [EObject current=null] : (otherlv_0= When_Env (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleWhen_Env() throws RecognitionException {
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
            // InternalJenkinsParser.g:2467:2: ( (otherlv_0= When_Env (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:2468:2: (otherlv_0= When_Env (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:2468:2: (otherlv_0= When_Env (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:2469:3: otherlv_0= When_Env (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,When_Env,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWhen_EnvAccess().getWhen_EnvKeyword_0());
            		
            // InternalJenkinsParser.g:2473:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalJenkinsParser.g:2474:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getWhen_EnvAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getWhen_EnvAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:2482:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2483:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2483:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:2484:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWhen_EnvAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWhen_EnvRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getWhen_EnvAccess().getValueKeyword_1_3());
            			
            // InternalJenkinsParser.g:2505:4: ( (lv_value_5_0= ruleEString ) )
            // InternalJenkinsParser.g:2506:5: (lv_value_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:2506:5: (lv_value_5_0= ruleEString )
            // InternalJenkinsParser.g:2507:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getWhen_EnvAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_14);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWhen_EnvRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getWhen_EnvAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleWhen_Env"


    // $ANTLR start "entryRuleAllOf"
    // InternalJenkinsParser.g:2533:1: entryRuleAllOf returns [EObject current=null] : iv_ruleAllOf= ruleAllOf EOF ;
    public final EObject entryRuleAllOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllOf = null;


        try {
            // InternalJenkinsParser.g:2533:46: (iv_ruleAllOf= ruleAllOf EOF )
            // InternalJenkinsParser.g:2534:2: iv_ruleAllOf= ruleAllOf EOF
            {
             newCompositeNode(grammarAccess.getAllOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllOf=ruleAllOf();

            state._fsp--;

             current =iv_ruleAllOf; 
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
    // $ANTLR end "entryRuleAllOf"


    // $ANTLR start "ruleAllOf"
    // InternalJenkinsParser.g:2540:1: ruleAllOf returns [EObject current=null] : (otherlv_0= AllOf (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END ) ) ;
    public final EObject ruleAllOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_when_2_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2546:2: ( (otherlv_0= AllOf (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END ) ) )
            // InternalJenkinsParser.g:2547:2: (otherlv_0= AllOf (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END ) )
            {
            // InternalJenkinsParser.g:2547:2: (otherlv_0= AllOf (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END ) )
            // InternalJenkinsParser.g:2548:3: otherlv_0= AllOf (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END )
            {
            otherlv_0=(Token)match(input,AllOf,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAllOfAccess().getAllOfKeyword_0());
            		
            // InternalJenkinsParser.g:2552:3: (this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END )
            // InternalJenkinsParser.g:2553:4: this_BEGIN_1= RULE_BEGIN ( (lv_when_2_0= ruleWhen ) )+ this_END_3= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getAllOfAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalJenkinsParser.g:2557:4: ( (lv_when_2_0= ruleWhen ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==ChangeRequest||LA61_0==BuildingTag||LA61_0==TriggeredBy||LA61_0==Expression||(LA61_0>=ChangeSet && LA61_0<=Changelog)||LA61_0==When_Env||LA61_0==Branch||LA61_0==Equals||(LA61_0>=AllOf && LA61_0<=AnyOf)||(LA61_0>=Not && LA61_0<=Tag)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalJenkinsParser.g:2558:5: (lv_when_2_0= ruleWhen )
            	    {
            	    // InternalJenkinsParser.g:2558:5: (lv_when_2_0= ruleWhen )
            	    // InternalJenkinsParser.g:2559:6: lv_when_2_0= ruleWhen
            	    {

            	    						newCompositeNode(grammarAccess.getAllOfAccess().getWhenWhenParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_when_2_0=ruleWhen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAllOfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_2_0,
            	    							"org.xtext.example.jenkins.Jenkins.When");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_3, grammarAccess.getAllOfAccess().getENDTerminalRuleCall_1_2());
            			

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
    // $ANTLR end "ruleAllOf"


    // $ANTLR start "entryRuleEquals"
    // InternalJenkinsParser.g:2585:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalJenkinsParser.g:2585:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalJenkinsParser.g:2586:2: iv_ruleEquals= ruleEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquals=ruleEquals();

            state._fsp--;

             current =iv_ruleEquals; 
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
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalJenkinsParser.g:2592:1: ruleEquals returns [EObject current=null] : (otherlv_0= Equals (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_expected_val_3_0 = null;

        AntlrDatatypeRuleToken lv_actual_val_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2598:2: ( (otherlv_0= Equals (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:2599:2: (otherlv_0= Equals (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:2599:2: (otherlv_0= Equals (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:2600:3: otherlv_0= Equals (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Equals,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualsAccess().getEqualsKeyword_0());
            		
            // InternalJenkinsParser.g:2604:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalJenkinsParser.g:2605:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Expected_val ( (lv_expected_val_3_0= ruleEString ) ) otherlv_4= Actual_val ( (lv_actual_val_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEqualsAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Expected_val,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getEqualsAccess().getExpected_valKeyword_1_1());
            			
            // InternalJenkinsParser.g:2613:4: ( (lv_expected_val_3_0= ruleEString ) )
            // InternalJenkinsParser.g:2614:5: (lv_expected_val_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:2614:5: (lv_expected_val_3_0= ruleEString )
            // InternalJenkinsParser.g:2615:6: lv_expected_val_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEqualsAccess().getExpected_valEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_58);
            lv_expected_val_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEqualsRule());
            						}
            						set(
            							current,
            							"expected_val",
            							lv_expected_val_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Actual_val,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getEqualsAccess().getActual_valKeyword_1_3());
            			
            // InternalJenkinsParser.g:2636:4: ( (lv_actual_val_5_0= ruleEString ) )
            // InternalJenkinsParser.g:2637:5: (lv_actual_val_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:2637:5: (lv_actual_val_5_0= ruleEString )
            // InternalJenkinsParser.g:2638:6: lv_actual_val_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getEqualsAccess().getActual_valEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_14);
            lv_actual_val_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEqualsRule());
            						}
            						set(
            							current,
            							"actual_val",
            							lv_actual_val_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getEqualsAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleChangeRequest"
    // InternalJenkinsParser.g:2664:1: entryRuleChangeRequest returns [EObject current=null] : iv_ruleChangeRequest= ruleChangeRequest EOF ;
    public final EObject entryRuleChangeRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRequest = null;


        try {
            // InternalJenkinsParser.g:2664:54: (iv_ruleChangeRequest= ruleChangeRequest EOF )
            // InternalJenkinsParser.g:2665:2: iv_ruleChangeRequest= ruleChangeRequest EOF
            {
             newCompositeNode(grammarAccess.getChangeRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeRequest=ruleChangeRequest();

            state._fsp--;

             current =iv_ruleChangeRequest; 
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
    // $ANTLR end "entryRuleChangeRequest"


    // $ANTLR start "ruleChangeRequest"
    // InternalJenkinsParser.g:2671:1: ruleChangeRequest returns [EObject current=null] : (otherlv_0= ChangeRequest (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END ) ) ;
    public final EObject ruleChangeRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        Enumerator lv_attribute_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_comparator_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2677:2: ( (otherlv_0= ChangeRequest (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END ) ) )
            // InternalJenkinsParser.g:2678:2: (otherlv_0= ChangeRequest (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END ) )
            {
            // InternalJenkinsParser.g:2678:2: (otherlv_0= ChangeRequest (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END ) )
            // InternalJenkinsParser.g:2679:3: otherlv_0= ChangeRequest (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,ChangeRequest,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRequestAccess().getChangeRequestKeyword_0());
            		
            // InternalJenkinsParser.g:2683:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END )
            // InternalJenkinsParser.g:2684:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Attribute ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) ) otherlv_4= Value ( (lv_value_5_0= ruleEString ) ) (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )? this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_59); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getChangeRequestAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Attribute,FOLLOW_60); 

            				newLeafNode(otherlv_2, grammarAccess.getChangeRequestAccess().getAttributeKeyword_1_1());
            			
            // InternalJenkinsParser.g:2692:4: ( (lv_attribute_3_0= ruleATTRIBUTE_TYPE ) )
            // InternalJenkinsParser.g:2693:5: (lv_attribute_3_0= ruleATTRIBUTE_TYPE )
            {
            // InternalJenkinsParser.g:2693:5: (lv_attribute_3_0= ruleATTRIBUTE_TYPE )
            // InternalJenkinsParser.g:2694:6: lv_attribute_3_0= ruleATTRIBUTE_TYPE
            {

            						newCompositeNode(grammarAccess.getChangeRequestAccess().getAttributeATTRIBUTE_TYPEEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_attribute_3_0=ruleATTRIBUTE_TYPE();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChangeRequestRule());
            						}
            						set(
            							current,
            							"attribute",
            							lv_attribute_3_0,
            							"org.xtext.example.jenkins.Jenkins.ATTRIBUTE_TYPE");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Value,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getChangeRequestAccess().getValueKeyword_1_3());
            			
            // InternalJenkinsParser.g:2715:4: ( (lv_value_5_0= ruleEString ) )
            // InternalJenkinsParser.g:2716:5: (lv_value_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:2716:5: (lv_value_5_0= ruleEString )
            // InternalJenkinsParser.g:2717:6: lv_value_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getChangeRequestAccess().getValueEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_52);
            lv_value_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChangeRequestRule());
            						}
            						set(
            							current,
            							"value",
            							lv_value_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:2734:4: (otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Comparator) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalJenkinsParser.g:2735:5: otherlv_6= Comparator ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) )
                    {
                    otherlv_6=(Token)match(input,Comparator,FOLLOW_53); 

                    					newLeafNode(otherlv_6, grammarAccess.getChangeRequestAccess().getComparatorKeyword_1_5_0());
                    				
                    // InternalJenkinsParser.g:2739:5: ( (lv_comparator_7_0= ruleCOMPARATOR_TYPE ) )
                    // InternalJenkinsParser.g:2740:6: (lv_comparator_7_0= ruleCOMPARATOR_TYPE )
                    {
                    // InternalJenkinsParser.g:2740:6: (lv_comparator_7_0= ruleCOMPARATOR_TYPE )
                    // InternalJenkinsParser.g:2741:7: lv_comparator_7_0= ruleCOMPARATOR_TYPE
                    {

                    							newCompositeNode(grammarAccess.getChangeRequestAccess().getComparatorCOMPARATOR_TYPEEnumRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_comparator_7_0=ruleCOMPARATOR_TYPE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChangeRequestRule());
                    							}
                    							set(
                    								current,
                    								"comparator",
                    								lv_comparator_7_0,
                    								"org.xtext.example.jenkins.Jenkins.COMPARATOR_TYPE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getChangeRequestAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleChangeRequest"


    // $ANTLR start "entryRuleSkipDefaultCheckout"
    // InternalJenkinsParser.g:2768:1: entryRuleSkipDefaultCheckout returns [EObject current=null] : iv_ruleSkipDefaultCheckout= ruleSkipDefaultCheckout EOF ;
    public final EObject entryRuleSkipDefaultCheckout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipDefaultCheckout = null;


        try {
            // InternalJenkinsParser.g:2768:60: (iv_ruleSkipDefaultCheckout= ruleSkipDefaultCheckout EOF )
            // InternalJenkinsParser.g:2769:2: iv_ruleSkipDefaultCheckout= ruleSkipDefaultCheckout EOF
            {
             newCompositeNode(grammarAccess.getSkipDefaultCheckoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkipDefaultCheckout=ruleSkipDefaultCheckout();

            state._fsp--;

             current =iv_ruleSkipDefaultCheckout; 
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
    // $ANTLR end "entryRuleSkipDefaultCheckout"


    // $ANTLR start "ruleSkipDefaultCheckout"
    // InternalJenkinsParser.g:2775:1: ruleSkipDefaultCheckout returns [EObject current=null] : ( () otherlv_1= SkipDefaultCheckout ) ;
    public final EObject ruleSkipDefaultCheckout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:2781:2: ( ( () otherlv_1= SkipDefaultCheckout ) )
            // InternalJenkinsParser.g:2782:2: ( () otherlv_1= SkipDefaultCheckout )
            {
            // InternalJenkinsParser.g:2782:2: ( () otherlv_1= SkipDefaultCheckout )
            // InternalJenkinsParser.g:2783:3: () otherlv_1= SkipDefaultCheckout
            {
            // InternalJenkinsParser.g:2783:3: ()
            // InternalJenkinsParser.g:2784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipDefaultCheckoutAccess().getSkipDefaultCheckoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SkipDefaultCheckout,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSkipDefaultCheckoutAccess().getSkipDefaultCheckoutKeyword_1());
            		

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
    // $ANTLR end "ruleSkipDefaultCheckout"


    // $ANTLR start "entryRuleRetry"
    // InternalJenkinsParser.g:2798:1: entryRuleRetry returns [EObject current=null] : iv_ruleRetry= ruleRetry EOF ;
    public final EObject entryRuleRetry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetry = null;


        try {
            // InternalJenkinsParser.g:2798:46: (iv_ruleRetry= ruleRetry EOF )
            // InternalJenkinsParser.g:2799:2: iv_ruleRetry= ruleRetry EOF
            {
             newCompositeNode(grammarAccess.getRetryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetry=ruleRetry();

            state._fsp--;

             current =iv_ruleRetry; 
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
    // $ANTLR end "entryRuleRetry"


    // $ANTLR start "ruleRetry"
    // InternalJenkinsParser.g:2805:1: ruleRetry returns [EObject current=null] : (otherlv_0= Retry (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleRetry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_retries_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2811:2: ( (otherlv_0= Retry (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:2812:2: (otherlv_0= Retry (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:2812:2: (otherlv_0= Retry (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:2813:3: otherlv_0= Retry (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Retry,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRetryAccess().getRetryKeyword_0());
            		
            // InternalJenkinsParser.g:2817:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:2818:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Retries ( (lv_retries_3_0= ruleEShort ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_61); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getRetryAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Retries,FOLLOW_62); 

            				newLeafNode(otherlv_2, grammarAccess.getRetryAccess().getRetriesKeyword_1_1());
            			
            // InternalJenkinsParser.g:2826:4: ( (lv_retries_3_0= ruleEShort ) )
            // InternalJenkinsParser.g:2827:5: (lv_retries_3_0= ruleEShort )
            {
            // InternalJenkinsParser.g:2827:5: (lv_retries_3_0= ruleEShort )
            // InternalJenkinsParser.g:2828:6: lv_retries_3_0= ruleEShort
            {

            						newCompositeNode(grammarAccess.getRetryAccess().getRetriesEShortParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_retries_3_0=ruleEShort();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRetryRule());
            						}
            						set(
            							current,
            							"retries",
            							lv_retries_3_0,
            							"org.xtext.example.jenkins.Jenkins.EShort");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getRetryAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleRetry"


    // $ANTLR start "entryRuleTimeout"
    // InternalJenkinsParser.g:2854:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalJenkinsParser.g:2854:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalJenkinsParser.g:2855:2: iv_ruleTimeout= ruleTimeout EOF
            {
             newCompositeNode(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeout=ruleTimeout();

            state._fsp--;

             current =iv_ruleTimeout; 
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
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // InternalJenkinsParser.g:2861:1: ruleTimeout returns [EObject current=null] : (otherlv_0= Timeout (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END ) ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;

        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:2867:2: ( (otherlv_0= Timeout (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:2868:2: (otherlv_0= Timeout (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:2868:2: (otherlv_0= Timeout (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:2869:3: otherlv_0= Timeout (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Timeout,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            // InternalJenkinsParser.g:2873:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END )
            // InternalJenkinsParser.g:2874:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Time ( (lv_time_3_0= ruleEShort ) ) otherlv_4= Unit ( (lv_unit_5_0= ruleEString ) ) this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_63); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTimeoutAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Time,FOLLOW_62); 

            				newLeafNode(otherlv_2, grammarAccess.getTimeoutAccess().getTimeKeyword_1_1());
            			
            // InternalJenkinsParser.g:2882:4: ( (lv_time_3_0= ruleEShort ) )
            // InternalJenkinsParser.g:2883:5: (lv_time_3_0= ruleEShort )
            {
            // InternalJenkinsParser.g:2883:5: (lv_time_3_0= ruleEShort )
            // InternalJenkinsParser.g:2884:6: lv_time_3_0= ruleEShort
            {

            						newCompositeNode(grammarAccess.getTimeoutAccess().getTimeEShortParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_64);
            lv_time_3_0=ruleEShort();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTimeoutRule());
            						}
            						set(
            							current,
            							"time",
            							lv_time_3_0,
            							"org.xtext.example.jenkins.Jenkins.EShort");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Unit,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getTimeoutAccess().getUnitKeyword_1_3());
            			
            // InternalJenkinsParser.g:2905:4: ( (lv_unit_5_0= ruleEString ) )
            // InternalJenkinsParser.g:2906:5: (lv_unit_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:2906:5: (lv_unit_5_0= ruleEString )
            // InternalJenkinsParser.g:2907:6: lv_unit_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTimeoutAccess().getUnitEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_14);
            lv_unit_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTimeoutRule());
            						}
            						set(
            							current,
            							"unit",
            							lv_unit_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getTimeoutAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleTimestamps"
    // InternalJenkinsParser.g:2933:1: entryRuleTimestamps returns [EObject current=null] : iv_ruleTimestamps= ruleTimestamps EOF ;
    public final EObject entryRuleTimestamps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimestamps = null;


        try {
            // InternalJenkinsParser.g:2933:51: (iv_ruleTimestamps= ruleTimestamps EOF )
            // InternalJenkinsParser.g:2934:2: iv_ruleTimestamps= ruleTimestamps EOF
            {
             newCompositeNode(grammarAccess.getTimestampsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimestamps=ruleTimestamps();

            state._fsp--;

             current =iv_ruleTimestamps; 
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
    // $ANTLR end "entryRuleTimestamps"


    // $ANTLR start "ruleTimestamps"
    // InternalJenkinsParser.g:2940:1: ruleTimestamps returns [EObject current=null] : ( () otherlv_1= Timestamps ) ;
    public final EObject ruleTimestamps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:2946:2: ( ( () otherlv_1= Timestamps ) )
            // InternalJenkinsParser.g:2947:2: ( () otherlv_1= Timestamps )
            {
            // InternalJenkinsParser.g:2947:2: ( () otherlv_1= Timestamps )
            // InternalJenkinsParser.g:2948:3: () otherlv_1= Timestamps
            {
            // InternalJenkinsParser.g:2948:3: ()
            // InternalJenkinsParser.g:2949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimestampsAccess().getTimestampsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Timestamps,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTimestampsAccess().getTimestampsKeyword_1());
            		

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
    // $ANTLR end "ruleTimestamps"


    // $ANTLR start "entryRuleEShort"
    // InternalJenkinsParser.g:2963:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // InternalJenkinsParser.g:2963:46: (iv_ruleEShort= ruleEShort EOF )
            // InternalJenkinsParser.g:2964:2: iv_ruleEShort= ruleEShort EOF
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
    // InternalJenkinsParser.g:2970:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:2976:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalJenkinsParser.g:2977:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalJenkinsParser.g:2977:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalJenkinsParser.g:2978:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalJenkinsParser.g:2978:3: (kw= HyphenMinus )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==HyphenMinus) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalJenkinsParser.g:2979:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_65); 

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


    // $ANTLR start "entryRuleAxis"
    // InternalJenkinsParser.g:2996:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalJenkinsParser.g:2996:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalJenkinsParser.g:2997:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalJenkinsParser.g:3003:1: ruleAxis returns [EObject current=null] : (otherlv_0= Axis (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_exclude_8_0=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3009:2: ( (otherlv_0= Axis (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END ) ) )
            // InternalJenkinsParser.g:3010:2: (otherlv_0= Axis (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END ) )
            {
            // InternalJenkinsParser.g:3010:2: (otherlv_0= Axis (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END ) )
            // InternalJenkinsParser.g:3011:3: otherlv_0= Axis (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END )
            {
            otherlv_0=(Token)match(input,Axis,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            // InternalJenkinsParser.g:3015:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END )
            // InternalJenkinsParser.g:3016:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= Values ( (lv_values_5_0= ruleEString ) ) (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )* ( (lv_exclude_8_0= Exclude ) )? this_END_9= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getAxisAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3024:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3025:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3025:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3026:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAxisAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_66);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAxisRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_4=(Token)match(input,Values,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getValuesKeyword_1_3());
            			
            // InternalJenkinsParser.g:3047:4: ( (lv_values_5_0= ruleEString ) )
            // InternalJenkinsParser.g:3048:5: (lv_values_5_0= ruleEString )
            {
            // InternalJenkinsParser.g:3048:5: (lv_values_5_0= ruleEString )
            // InternalJenkinsParser.g:3049:6: lv_values_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAxisAccess().getValuesEStringParserRuleCall_1_4_0());
            					
            pushFollow(FOLLOW_67);
            lv_values_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAxisRule());
            						}
            						add(
            							current,
            							"values",
            							lv_values_5_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3066:4: (otherlv_6= Comma ( (lv_values_7_0= ruleEString ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Comma) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalJenkinsParser.g:3067:5: otherlv_6= Comma ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,Comma,FOLLOW_12); 

            	    					newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getCommaKeyword_1_5_0());
            	    				
            	    // InternalJenkinsParser.g:3071:5: ( (lv_values_7_0= ruleEString ) )
            	    // InternalJenkinsParser.g:3072:6: (lv_values_7_0= ruleEString )
            	    {
            	    // InternalJenkinsParser.g:3072:6: (lv_values_7_0= ruleEString )
            	    // InternalJenkinsParser.g:3073:7: lv_values_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getAxisAccess().getValuesEStringParserRuleCall_1_5_1_0());
            	    						
            	    pushFollow(FOLLOW_67);
            	    lv_values_7_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAxisRule());
            	    							}
            	    							add(
            	    								current,
            	    								"values",
            	    								lv_values_7_0,
            	    								"org.xtext.example.jenkins.Jenkins.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalJenkinsParser.g:3091:4: ( (lv_exclude_8_0= Exclude ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Exclude) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalJenkinsParser.g:3092:5: (lv_exclude_8_0= Exclude )
                    {
                    // InternalJenkinsParser.g:3092:5: (lv_exclude_8_0= Exclude )
                    // InternalJenkinsParser.g:3093:6: lv_exclude_8_0= Exclude
                    {
                    lv_exclude_8_0=(Token)match(input,Exclude,FOLLOW_14); 

                    						newLeafNode(lv_exclude_8_0, grammarAccess.getAxisAccess().getExcludeExcludeKeyword_1_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(current, "exclude", lv_exclude_8_0 != null, "exclude");
                    					

                    }


                    }
                    break;

            }

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_9, grammarAccess.getAxisAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleStringParam"
    // InternalJenkinsParser.g:3114:1: entryRuleStringParam returns [EObject current=null] : iv_ruleStringParam= ruleStringParam EOF ;
    public final EObject entryRuleStringParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParam = null;


        try {
            // InternalJenkinsParser.g:3114:52: (iv_ruleStringParam= ruleStringParam EOF )
            // InternalJenkinsParser.g:3115:2: iv_ruleStringParam= ruleStringParam EOF
            {
             newCompositeNode(grammarAccess.getStringParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringParam=ruleStringParam();

            state._fsp--;

             current =iv_ruleStringParam; 
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
    // $ANTLR end "entryRuleStringParam"


    // $ANTLR start "ruleStringParam"
    // InternalJenkinsParser.g:3121:1: ruleStringParam returns [EObject current=null] : (otherlv_0= StringParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) ;
    public final EObject ruleStringParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3127:2: ( (otherlv_0= StringParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) )
            // InternalJenkinsParser.g:3128:2: (otherlv_0= StringParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            {
            // InternalJenkinsParser.g:3128:2: (otherlv_0= StringParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            // InternalJenkinsParser.g:3129:3: otherlv_0= StringParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,StringParam,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStringParamAccess().getStringParamKeyword_0());
            		
            // InternalJenkinsParser.g:3133:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            // InternalJenkinsParser.g:3134:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStringParamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getStringParamAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3142:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3143:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3143:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3144:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStringParamAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_68);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringParamRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3161:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Description) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalJenkinsParser.g:3162:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getStringParamAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3166:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3167:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3167:6: (lv_description_5_0= ruleEString )
                    // InternalJenkinsParser.g:3168:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getStringParamAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_69);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStringParamRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,DefaultValue,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getStringParamAccess().getDefaultValueKeyword_1_4());
            			
            // InternalJenkinsParser.g:3190:4: ( (lv_defaultValue_7_0= ruleEString ) )
            // InternalJenkinsParser.g:3191:5: (lv_defaultValue_7_0= ruleEString )
            {
            // InternalJenkinsParser.g:3191:5: (lv_defaultValue_7_0= ruleEString )
            // InternalJenkinsParser.g:3192:6: lv_defaultValue_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStringParamAccess().getDefaultValueEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_14);
            lv_defaultValue_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringParamRule());
            						}
            						set(
            							current,
            							"defaultValue",
            							lv_defaultValue_7_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getStringParamAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleStringParam"


    // $ANTLR start "entryRuleTextParam"
    // InternalJenkinsParser.g:3218:1: entryRuleTextParam returns [EObject current=null] : iv_ruleTextParam= ruleTextParam EOF ;
    public final EObject entryRuleTextParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextParam = null;


        try {
            // InternalJenkinsParser.g:3218:50: (iv_ruleTextParam= ruleTextParam EOF )
            // InternalJenkinsParser.g:3219:2: iv_ruleTextParam= ruleTextParam EOF
            {
             newCompositeNode(grammarAccess.getTextParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextParam=ruleTextParam();

            state._fsp--;

             current =iv_ruleTextParam; 
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
    // $ANTLR end "entryRuleTextParam"


    // $ANTLR start "ruleTextParam"
    // InternalJenkinsParser.g:3225:1: ruleTextParam returns [EObject current=null] : (otherlv_0= TextParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) ;
    public final EObject ruleTextParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3231:2: ( (otherlv_0= TextParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) )
            // InternalJenkinsParser.g:3232:2: (otherlv_0= TextParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            {
            // InternalJenkinsParser.g:3232:2: (otherlv_0= TextParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            // InternalJenkinsParser.g:3233:3: otherlv_0= TextParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,TextParam,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTextParamAccess().getTextParamKeyword_0());
            		
            // InternalJenkinsParser.g:3237:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            // InternalJenkinsParser.g:3238:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getTextParamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getTextParamAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3246:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3247:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3247:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3248:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTextParamAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_68);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTextParamRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3265:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Description) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalJenkinsParser.g:3266:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getTextParamAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3270:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3271:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3271:6: (lv_description_5_0= ruleEString )
                    // InternalJenkinsParser.g:3272:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getTextParamAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_69);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTextParamRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,DefaultValue,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getTextParamAccess().getDefaultValueKeyword_1_4());
            			
            // InternalJenkinsParser.g:3294:4: ( (lv_defaultValue_7_0= ruleEString ) )
            // InternalJenkinsParser.g:3295:5: (lv_defaultValue_7_0= ruleEString )
            {
            // InternalJenkinsParser.g:3295:5: (lv_defaultValue_7_0= ruleEString )
            // InternalJenkinsParser.g:3296:6: lv_defaultValue_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTextParamAccess().getDefaultValueEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_14);
            lv_defaultValue_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTextParamRule());
            						}
            						set(
            							current,
            							"defaultValue",
            							lv_defaultValue_7_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getTextParamAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleTextParam"


    // $ANTLR start "entryRuleChoiceParam"
    // InternalJenkinsParser.g:3322:1: entryRuleChoiceParam returns [EObject current=null] : iv_ruleChoiceParam= ruleChoiceParam EOF ;
    public final EObject entryRuleChoiceParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceParam = null;


        try {
            // InternalJenkinsParser.g:3322:52: (iv_ruleChoiceParam= ruleChoiceParam EOF )
            // InternalJenkinsParser.g:3323:2: iv_ruleChoiceParam= ruleChoiceParam EOF
            {
             newCompositeNode(grammarAccess.getChoiceParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoiceParam=ruleChoiceParam();

            state._fsp--;

             current =iv_ruleChoiceParam; 
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
    // $ANTLR end "entryRuleChoiceParam"


    // $ANTLR start "ruleChoiceParam"
    // InternalJenkinsParser.g:3329:1: ruleChoiceParam returns [EObject current=null] : (otherlv_0= ChoiceParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) ;
    public final EObject ruleChoiceParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_choices_7_0 = null;

        AntlrDatatypeRuleToken lv_choices_9_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3335:2: ( (otherlv_0= ChoiceParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END ) ) )
            // InternalJenkinsParser.g:3336:2: (otherlv_0= ChoiceParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            {
            // InternalJenkinsParser.g:3336:2: (otherlv_0= ChoiceParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END ) )
            // InternalJenkinsParser.g:3337:3: otherlv_0= ChoiceParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            {
            otherlv_0=(Token)match(input,ChoiceParam,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceParamAccess().getChoiceParamKeyword_0());
            		
            // InternalJenkinsParser.g:3341:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END )
            // InternalJenkinsParser.g:3342:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= Choices ( (lv_choices_7_0= ruleEString ) ) (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )* this_END_10= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getChoiceParamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getChoiceParamAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3350:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3351:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3351:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3352:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getChoiceParamAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_70);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChoiceParamRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3369:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Description) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJenkinsParser.g:3370:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getChoiceParamAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3374:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3375:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3375:6: (lv_description_5_0= ruleEString )
                    // InternalJenkinsParser.g:3376:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getChoiceParamAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_71);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getChoiceParamRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Choices,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getChoiceParamAccess().getChoicesKeyword_1_4());
            			
            // InternalJenkinsParser.g:3398:4: ( (lv_choices_7_0= ruleEString ) )
            // InternalJenkinsParser.g:3399:5: (lv_choices_7_0= ruleEString )
            {
            // InternalJenkinsParser.g:3399:5: (lv_choices_7_0= ruleEString )
            // InternalJenkinsParser.g:3400:6: lv_choices_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getChoiceParamAccess().getChoicesEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_72);
            lv_choices_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getChoiceParamRule());
            						}
            						add(
            							current,
            							"choices",
            							lv_choices_7_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3417:4: (otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==Comma) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalJenkinsParser.g:3418:5: otherlv_8= Comma ( (lv_choices_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,Comma,FOLLOW_12); 

            	    					newLeafNode(otherlv_8, grammarAccess.getChoiceParamAccess().getCommaKeyword_1_6_0());
            	    				
            	    // InternalJenkinsParser.g:3422:5: ( (lv_choices_9_0= ruleEString ) )
            	    // InternalJenkinsParser.g:3423:6: (lv_choices_9_0= ruleEString )
            	    {
            	    // InternalJenkinsParser.g:3423:6: (lv_choices_9_0= ruleEString )
            	    // InternalJenkinsParser.g:3424:7: lv_choices_9_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getChoiceParamAccess().getChoicesEStringParserRuleCall_1_6_1_0());
            	    						
            	    pushFollow(FOLLOW_72);
            	    lv_choices_9_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getChoiceParamRule());
            	    							}
            	    							add(
            	    								current,
            	    								"choices",
            	    								lv_choices_9_0,
            	    								"org.xtext.example.jenkins.Jenkins.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_10, grammarAccess.getChoiceParamAccess().getENDTerminalRuleCall_1_7());
            			

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
    // $ANTLR end "ruleChoiceParam"


    // $ANTLR start "entryRulePasswordParam"
    // InternalJenkinsParser.g:3451:1: entryRulePasswordParam returns [EObject current=null] : iv_rulePasswordParam= rulePasswordParam EOF ;
    public final EObject entryRulePasswordParam() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePasswordParam = null;


        try {
            // InternalJenkinsParser.g:3451:54: (iv_rulePasswordParam= rulePasswordParam EOF )
            // InternalJenkinsParser.g:3452:2: iv_rulePasswordParam= rulePasswordParam EOF
            {
             newCompositeNode(grammarAccess.getPasswordParamRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePasswordParam=rulePasswordParam();

            state._fsp--;

             current =iv_rulePasswordParam; 
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
    // $ANTLR end "entryRulePasswordParam"


    // $ANTLR start "rulePasswordParam"
    // InternalJenkinsParser.g:3458:1: rulePasswordParam returns [EObject current=null] : (otherlv_0= PasswordParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) ;
    public final EObject rulePasswordParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3464:2: ( (otherlv_0= PasswordParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) ) )
            // InternalJenkinsParser.g:3465:2: (otherlv_0= PasswordParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            {
            // InternalJenkinsParser.g:3465:2: (otherlv_0= PasswordParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            // InternalJenkinsParser.g:3466:3: otherlv_0= PasswordParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,PasswordParam,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPasswordParamAccess().getPasswordParamKeyword_0());
            		
            // InternalJenkinsParser.g:3470:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END )
            // InternalJenkinsParser.g:3471:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= DefaultValue ( (lv_defaultValue_7_0= ruleEString ) ) this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPasswordParamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getPasswordParamAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3479:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3480:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3480:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3481:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPasswordParamAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_68);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPasswordParamRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3498:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Description) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJenkinsParser.g:3499:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getPasswordParamAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3503:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3504:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3504:6: (lv_description_5_0= ruleEString )
                    // InternalJenkinsParser.g:3505:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPasswordParamAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_69);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPasswordParamRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,DefaultValue,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getPasswordParamAccess().getDefaultValueKeyword_1_4());
            			
            // InternalJenkinsParser.g:3527:4: ( (lv_defaultValue_7_0= ruleEString ) )
            // InternalJenkinsParser.g:3528:5: (lv_defaultValue_7_0= ruleEString )
            {
            // InternalJenkinsParser.g:3528:5: (lv_defaultValue_7_0= ruleEString )
            // InternalJenkinsParser.g:3529:6: lv_defaultValue_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPasswordParamAccess().getDefaultValueEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_14);
            lv_defaultValue_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPasswordParamRule());
            						}
            						set(
            							current,
            							"defaultValue",
            							lv_defaultValue_7_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getPasswordParamAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "rulePasswordParam"


    // $ANTLR start "entryRuleBooleanParam"
    // InternalJenkinsParser.g:3555:1: entryRuleBooleanParam returns [EObject current=null] : iv_ruleBooleanParam= ruleBooleanParam EOF ;
    public final EObject entryRuleBooleanParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanParam = null;


        try {
            // InternalJenkinsParser.g:3555:53: (iv_ruleBooleanParam= ruleBooleanParam EOF )
            // InternalJenkinsParser.g:3556:2: iv_ruleBooleanParam= ruleBooleanParam EOF
            {
             newCompositeNode(grammarAccess.getBooleanParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanParam=ruleBooleanParam();

            state._fsp--;

             current =iv_ruleBooleanParam; 
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
    // $ANTLR end "entryRuleBooleanParam"


    // $ANTLR start "ruleBooleanParam"
    // InternalJenkinsParser.g:3562:1: ruleBooleanParam returns [EObject current=null] : (otherlv_0= BooleanParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END ) ) ;
    public final EObject ruleBooleanParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_defaultValue_6_0=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3568:2: ( (otherlv_0= BooleanParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END ) ) )
            // InternalJenkinsParser.g:3569:2: (otherlv_0= BooleanParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END ) )
            {
            // InternalJenkinsParser.g:3569:2: (otherlv_0= BooleanParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END ) )
            // InternalJenkinsParser.g:3570:3: otherlv_0= BooleanParam (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END )
            {
            otherlv_0=(Token)match(input,BooleanParam,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanParamAccess().getBooleanParamKeyword_0());
            		
            // InternalJenkinsParser.g:3574:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END )
            // InternalJenkinsParser.g:3575:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )? ( (lv_defaultValue_6_0= DefaultValue ) ) this_END_7= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBooleanParamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getBooleanParamAccess().getNameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3583:4: ( (lv_name_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3584:5: (lv_name_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3584:5: (lv_name_3_0= ruleEString )
            // InternalJenkinsParser.g:3585:6: lv_name_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBooleanParamAccess().getNameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_68);
            lv_name_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBooleanParamRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3602:4: (otherlv_4= Description ( (lv_description_5_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Description) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalJenkinsParser.g:3603:5: otherlv_4= Description ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getBooleanParamAccess().getDescriptionKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3607:5: ( (lv_description_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3608:6: (lv_description_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3608:6: (lv_description_5_0= ruleEString )
                    // InternalJenkinsParser.g:3609:7: lv_description_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getBooleanParamAccess().getDescriptionEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_69);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBooleanParamRule());
                    							}
                    							set(
                    								current,
                    								"description",
                    								lv_description_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3627:4: ( (lv_defaultValue_6_0= DefaultValue ) )
            // InternalJenkinsParser.g:3628:5: (lv_defaultValue_6_0= DefaultValue )
            {
            // InternalJenkinsParser.g:3628:5: (lv_defaultValue_6_0= DefaultValue )
            // InternalJenkinsParser.g:3629:6: lv_defaultValue_6_0= DefaultValue
            {
            lv_defaultValue_6_0=(Token)match(input,DefaultValue,FOLLOW_14); 

            						newLeafNode(lv_defaultValue_6_0, grammarAccess.getBooleanParamAccess().getDefaultValueDefaultValueKeyword_1_4_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBooleanParamRule());
            						}
            						setWithLastConsumed(current, "defaultValue", lv_defaultValue_6_0 != null, "defaultValue");
            					

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_7, grammarAccess.getBooleanParamAccess().getENDTerminalRuleCall_1_5());
            			

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
    // $ANTLR end "ruleBooleanParam"


    // $ANTLR start "entryRuleNode"
    // InternalJenkinsParser.g:3650:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalJenkinsParser.g:3650:45: (iv_ruleNode= ruleNode EOF )
            // InternalJenkinsParser.g:3651:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalJenkinsParser.g:3657:1: ruleNode returns [EObject current=null] : (otherlv_0= Node (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;

        AntlrDatatypeRuleToken lv_customWorkspace_5_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3663:2: ( (otherlv_0= Node (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END ) ) )
            // InternalJenkinsParser.g:3664:2: (otherlv_0= Node (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END ) )
            {
            // InternalJenkinsParser.g:3664:2: (otherlv_0= Node (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END ) )
            // InternalJenkinsParser.g:3665:3: otherlv_0= Node (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END )
            {
            otherlv_0=(Token)match(input,Node,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalJenkinsParser.g:3669:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END )
            // InternalJenkinsParser.g:3670:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )? this_END_6= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_73); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Label_1,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLabelKeyword_1_1());
            			
            // InternalJenkinsParser.g:3678:4: ( (lv_label_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3679:5: (lv_label_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3679:5: (lv_label_3_0= ruleEString )
            // InternalJenkinsParser.g:3680:6: lv_label_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getNodeAccess().getLabelEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_74);
            lv_label_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNodeRule());
            						}
            						set(
            							current,
            							"label",
            							lv_label_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3697:4: (otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==CustomWorkspace) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJenkinsParser.g:3698:5: otherlv_4= CustomWorkspace ( (lv_customWorkspace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,CustomWorkspace,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getCustomWorkspaceKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3702:5: ( (lv_customWorkspace_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3703:6: (lv_customWorkspace_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3703:6: (lv_customWorkspace_5_0= ruleEString )
                    // InternalJenkinsParser.g:3704:7: lv_customWorkspace_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getCustomWorkspaceEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_customWorkspace_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							set(
                    								current,
                    								"customWorkspace",
                    								lv_customWorkspace_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_6, grammarAccess.getNodeAccess().getENDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleAny"
    // InternalJenkinsParser.g:3731:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalJenkinsParser.g:3731:44: (iv_ruleAny= ruleAny EOF )
            // InternalJenkinsParser.g:3732:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // InternalJenkinsParser.g:3738:1: ruleAny returns [EObject current=null] : ( () otherlv_1= Any ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:3744:2: ( ( () otherlv_1= Any ) )
            // InternalJenkinsParser.g:3745:2: ( () otherlv_1= Any )
            {
            // InternalJenkinsParser.g:3745:2: ( () otherlv_1= Any )
            // InternalJenkinsParser.g:3746:3: () otherlv_1= Any
            {
            // InternalJenkinsParser.g:3746:3: ()
            // InternalJenkinsParser.g:3747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnyAccess().getAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Any,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
            		

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleNone"
    // InternalJenkinsParser.g:3761:1: entryRuleNone returns [EObject current=null] : iv_ruleNone= ruleNone EOF ;
    public final EObject entryRuleNone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNone = null;


        try {
            // InternalJenkinsParser.g:3761:45: (iv_ruleNone= ruleNone EOF )
            // InternalJenkinsParser.g:3762:2: iv_ruleNone= ruleNone EOF
            {
             newCompositeNode(grammarAccess.getNoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNone=ruleNone();

            state._fsp--;

             current =iv_ruleNone; 
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
    // $ANTLR end "entryRuleNone"


    // $ANTLR start "ruleNone"
    // InternalJenkinsParser.g:3768:1: ruleNone returns [EObject current=null] : ( () otherlv_1= None ) ;
    public final EObject ruleNone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:3774:2: ( ( () otherlv_1= None ) )
            // InternalJenkinsParser.g:3775:2: ( () otherlv_1= None )
            {
            // InternalJenkinsParser.g:3775:2: ( () otherlv_1= None )
            // InternalJenkinsParser.g:3776:3: () otherlv_1= None
            {
            // InternalJenkinsParser.g:3776:3: ()
            // InternalJenkinsParser.g:3777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoneAccess().getNoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,None,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNoneAccess().getNoneKeyword_1());
            		

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
    // $ANTLR end "ruleNone"


    // $ANTLR start "entryRuleDockerfile"
    // InternalJenkinsParser.g:3791:1: entryRuleDockerfile returns [EObject current=null] : iv_ruleDockerfile= ruleDockerfile EOF ;
    public final EObject entryRuleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerfile = null;


        try {
            // InternalJenkinsParser.g:3791:51: (iv_ruleDockerfile= ruleDockerfile EOF )
            // InternalJenkinsParser.g:3792:2: iv_ruleDockerfile= ruleDockerfile EOF
            {
             newCompositeNode(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerfile=ruleDockerfile();

            state._fsp--;

             current =iv_ruleDockerfile; 
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
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalJenkinsParser.g:3798:1: ruleDockerfile returns [EObject current=null] : (otherlv_0= Dockerfile (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END ) ) ;
    public final EObject ruleDockerfile() throws RecognitionException {
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
        Token this_END_20=null;
        AntlrDatatypeRuleToken lv_filename_3_0 = null;

        AntlrDatatypeRuleToken lv_dir_5_0 = null;

        AntlrDatatypeRuleToken lv_additionalBuildArgs_7_0 = null;

        AntlrDatatypeRuleToken lv_registryUrl_9_0 = null;

        AntlrDatatypeRuleToken lv_registryCredentialsId_11_0 = null;

        AntlrDatatypeRuleToken lv_label_13_0 = null;

        AntlrDatatypeRuleToken lv_customWorkspace_15_0 = null;

        AntlrDatatypeRuleToken lv_reuseNode_17_0 = null;

        AntlrDatatypeRuleToken lv_args_19_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:3804:2: ( (otherlv_0= Dockerfile (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END ) ) )
            // InternalJenkinsParser.g:3805:2: (otherlv_0= Dockerfile (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END ) )
            {
            // InternalJenkinsParser.g:3805:2: (otherlv_0= Dockerfile (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END ) )
            // InternalJenkinsParser.g:3806:3: otherlv_0= Dockerfile (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END )
            {
            otherlv_0=(Token)match(input,Dockerfile,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerfileAccess().getDockerfileKeyword_0());
            		
            // InternalJenkinsParser.g:3810:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END )
            // InternalJenkinsParser.g:3811:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Filename ( (lv_filename_3_0= ruleEString ) ) (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )? (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )? (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )? (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )? (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )? (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )? (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )? (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )? this_END_20= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_75); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDockerfileAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Filename,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getDockerfileAccess().getFilenameKeyword_1_1());
            			
            // InternalJenkinsParser.g:3819:4: ( (lv_filename_3_0= ruleEString ) )
            // InternalJenkinsParser.g:3820:5: (lv_filename_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:3820:5: (lv_filename_3_0= ruleEString )
            // InternalJenkinsParser.g:3821:6: lv_filename_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerfileAccess().getFilenameEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_76);
            lv_filename_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDockerfileRule());
            						}
            						set(
            							current,
            							"filename",
            							lv_filename_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:3838:4: (otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Dir) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalJenkinsParser.g:3839:5: otherlv_4= Dir ( (lv_dir_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Dir,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getDockerfileAccess().getDirKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:3843:5: ( (lv_dir_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:3844:6: (lv_dir_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3844:6: (lv_dir_5_0= ruleEString )
                    // InternalJenkinsParser.g:3845:7: lv_dir_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getDirEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_77);
                    lv_dir_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"dir",
                    								lv_dir_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3863:4: (otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==AdditionalBuildArgs) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalJenkinsParser.g:3864:5: otherlv_6= AdditionalBuildArgs ( (lv_additionalBuildArgs_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,AdditionalBuildArgs,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getDockerfileAccess().getAdditionalBuildArgsKeyword_1_4_0());
                    				
                    // InternalJenkinsParser.g:3868:5: ( (lv_additionalBuildArgs_7_0= ruleEString ) )
                    // InternalJenkinsParser.g:3869:6: (lv_additionalBuildArgs_7_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3869:6: (lv_additionalBuildArgs_7_0= ruleEString )
                    // InternalJenkinsParser.g:3870:7: lv_additionalBuildArgs_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getAdditionalBuildArgsEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_78);
                    lv_additionalBuildArgs_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"additionalBuildArgs",
                    								lv_additionalBuildArgs_7_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3888:4: (otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RegistryUrl) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalJenkinsParser.g:3889:5: otherlv_8= RegistryUrl ( (lv_registryUrl_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,RegistryUrl,FOLLOW_12); 

                    					newLeafNode(otherlv_8, grammarAccess.getDockerfileAccess().getRegistryUrlKeyword_1_5_0());
                    				
                    // InternalJenkinsParser.g:3893:5: ( (lv_registryUrl_9_0= ruleEString ) )
                    // InternalJenkinsParser.g:3894:6: (lv_registryUrl_9_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3894:6: (lv_registryUrl_9_0= ruleEString )
                    // InternalJenkinsParser.g:3895:7: lv_registryUrl_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getRegistryUrlEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_79);
                    lv_registryUrl_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"registryUrl",
                    								lv_registryUrl_9_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3913:4: (otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RegistryCredentialsId) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalJenkinsParser.g:3914:5: otherlv_10= RegistryCredentialsId ( (lv_registryCredentialsId_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,RegistryCredentialsId,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getDockerfileAccess().getRegistryCredentialsIdKeyword_1_6_0());
                    				
                    // InternalJenkinsParser.g:3918:5: ( (lv_registryCredentialsId_11_0= ruleEString ) )
                    // InternalJenkinsParser.g:3919:6: (lv_registryCredentialsId_11_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3919:6: (lv_registryCredentialsId_11_0= ruleEString )
                    // InternalJenkinsParser.g:3920:7: lv_registryCredentialsId_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getRegistryCredentialsIdEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_80);
                    lv_registryCredentialsId_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"registryCredentialsId",
                    								lv_registryCredentialsId_11_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3938:4: (otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Label_1) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalJenkinsParser.g:3939:5: otherlv_12= Label_1 ( (lv_label_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,Label_1,FOLLOW_12); 

                    					newLeafNode(otherlv_12, grammarAccess.getDockerfileAccess().getLabelKeyword_1_7_0());
                    				
                    // InternalJenkinsParser.g:3943:5: ( (lv_label_13_0= ruleEString ) )
                    // InternalJenkinsParser.g:3944:6: (lv_label_13_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3944:6: (lv_label_13_0= ruleEString )
                    // InternalJenkinsParser.g:3945:7: lv_label_13_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getLabelEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_81);
                    lv_label_13_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"label",
                    								lv_label_13_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3963:4: (otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CustomWorkspace) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalJenkinsParser.g:3964:5: otherlv_14= CustomWorkspace ( (lv_customWorkspace_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,CustomWorkspace,FOLLOW_12); 

                    					newLeafNode(otherlv_14, grammarAccess.getDockerfileAccess().getCustomWorkspaceKeyword_1_8_0());
                    				
                    // InternalJenkinsParser.g:3968:5: ( (lv_customWorkspace_15_0= ruleEString ) )
                    // InternalJenkinsParser.g:3969:6: (lv_customWorkspace_15_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3969:6: (lv_customWorkspace_15_0= ruleEString )
                    // InternalJenkinsParser.g:3970:7: lv_customWorkspace_15_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getCustomWorkspaceEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_82);
                    lv_customWorkspace_15_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"customWorkspace",
                    								lv_customWorkspace_15_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:3988:4: (otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ReuseNode) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalJenkinsParser.g:3989:5: otherlv_16= ReuseNode ( (lv_reuseNode_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,ReuseNode,FOLLOW_12); 

                    					newLeafNode(otherlv_16, grammarAccess.getDockerfileAccess().getReuseNodeKeyword_1_9_0());
                    				
                    // InternalJenkinsParser.g:3993:5: ( (lv_reuseNode_17_0= ruleEString ) )
                    // InternalJenkinsParser.g:3994:6: (lv_reuseNode_17_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:3994:6: (lv_reuseNode_17_0= ruleEString )
                    // InternalJenkinsParser.g:3995:7: lv_reuseNode_17_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getReuseNodeEStringParserRuleCall_1_9_1_0());
                    						
                    pushFollow(FOLLOW_83);
                    lv_reuseNode_17_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"reuseNode",
                    								lv_reuseNode_17_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4013:4: (otherlv_18= Args ( (lv_args_19_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Args) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalJenkinsParser.g:4014:5: otherlv_18= Args ( (lv_args_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,Args,FOLLOW_12); 

                    					newLeafNode(otherlv_18, grammarAccess.getDockerfileAccess().getArgsKeyword_1_10_0());
                    				
                    // InternalJenkinsParser.g:4018:5: ( (lv_args_19_0= ruleEString ) )
                    // InternalJenkinsParser.g:4019:6: (lv_args_19_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4019:6: (lv_args_19_0= ruleEString )
                    // InternalJenkinsParser.g:4020:7: lv_args_19_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerfileAccess().getArgsEStringParserRuleCall_1_10_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_args_19_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerfileRule());
                    							}
                    							set(
                    								current,
                    								"args",
                    								lv_args_19_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            this_END_20=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_20, grammarAccess.getDockerfileAccess().getENDTerminalRuleCall_1_11());
            			

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
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleDocker"
    // InternalJenkinsParser.g:4047:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;


        try {
            // InternalJenkinsParser.g:4047:47: (iv_ruleDocker= ruleDocker EOF )
            // InternalJenkinsParser.g:4048:2: iv_ruleDocker= ruleDocker EOF
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
    // InternalJenkinsParser.g:4054:1: ruleDocker returns [EObject current=null] : (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END ) ) ;
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
        Token lv_alwaysPull_16_0=null;
        Token this_END_17=null;
        AntlrDatatypeRuleToken lv_image_3_0 = null;

        AntlrDatatypeRuleToken lv_registryUrl_5_0 = null;

        AntlrDatatypeRuleToken lv_registryCredentialsId_7_0 = null;

        AntlrDatatypeRuleToken lv_label_9_0 = null;

        AntlrDatatypeRuleToken lv_customWorkspace_11_0 = null;

        AntlrDatatypeRuleToken lv_reuseNode_13_0 = null;

        AntlrDatatypeRuleToken lv_args_15_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4060:2: ( (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END ) ) )
            // InternalJenkinsParser.g:4061:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END ) )
            {
            // InternalJenkinsParser.g:4061:2: (otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END ) )
            // InternalJenkinsParser.g:4062:3: otherlv_0= Docker (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END )
            {
            otherlv_0=(Token)match(input,Docker,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerAccess().getDockerKeyword_0());
            		
            // InternalJenkinsParser.g:4066:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END )
            // InternalJenkinsParser.g:4067:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Image ( (lv_image_3_0= ruleEString ) ) (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )? (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )? (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )? (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )? (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )? ( (lv_alwaysPull_16_0= AlwaysPull ) )? this_END_17= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_84); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getDockerAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Image,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getDockerAccess().getImageKeyword_1_1());
            			
            // InternalJenkinsParser.g:4075:4: ( (lv_image_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4076:5: (lv_image_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4076:5: (lv_image_3_0= ruleEString )
            // InternalJenkinsParser.g:4077:6: lv_image_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDockerAccess().getImageEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_85);
            lv_image_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDockerRule());
            						}
            						set(
            							current,
            							"image",
            							lv_image_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:4094:4: (otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RegistryUrl) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalJenkinsParser.g:4095:5: otherlv_4= RegistryUrl ( (lv_registryUrl_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,RegistryUrl,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getDockerAccess().getRegistryUrlKeyword_1_3_0());
                    				
                    // InternalJenkinsParser.g:4099:5: ( (lv_registryUrl_5_0= ruleEString ) )
                    // InternalJenkinsParser.g:4100:6: (lv_registryUrl_5_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4100:6: (lv_registryUrl_5_0= ruleEString )
                    // InternalJenkinsParser.g:4101:7: lv_registryUrl_5_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getRegistryUrlEStringParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_86);
                    lv_registryUrl_5_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"registryUrl",
                    								lv_registryUrl_5_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4119:4: (otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RegistryCredentialsId) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalJenkinsParser.g:4120:5: otherlv_6= RegistryCredentialsId ( (lv_registryCredentialsId_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,RegistryCredentialsId,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getDockerAccess().getRegistryCredentialsIdKeyword_1_4_0());
                    				
                    // InternalJenkinsParser.g:4124:5: ( (lv_registryCredentialsId_7_0= ruleEString ) )
                    // InternalJenkinsParser.g:4125:6: (lv_registryCredentialsId_7_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4125:6: (lv_registryCredentialsId_7_0= ruleEString )
                    // InternalJenkinsParser.g:4126:7: lv_registryCredentialsId_7_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getRegistryCredentialsIdEStringParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_87);
                    lv_registryCredentialsId_7_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"registryCredentialsId",
                    								lv_registryCredentialsId_7_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4144:4: (otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Label_1) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalJenkinsParser.g:4145:5: otherlv_8= Label_1 ( (lv_label_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Label_1,FOLLOW_12); 

                    					newLeafNode(otherlv_8, grammarAccess.getDockerAccess().getLabelKeyword_1_5_0());
                    				
                    // InternalJenkinsParser.g:4149:5: ( (lv_label_9_0= ruleEString ) )
                    // InternalJenkinsParser.g:4150:6: (lv_label_9_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4150:6: (lv_label_9_0= ruleEString )
                    // InternalJenkinsParser.g:4151:7: lv_label_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getLabelEStringParserRuleCall_1_5_1_0());
                    						
                    pushFollow(FOLLOW_88);
                    lv_label_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"label",
                    								lv_label_9_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4169:4: (otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==CustomWorkspace) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalJenkinsParser.g:4170:5: otherlv_10= CustomWorkspace ( (lv_customWorkspace_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,CustomWorkspace,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getDockerAccess().getCustomWorkspaceKeyword_1_6_0());
                    				
                    // InternalJenkinsParser.g:4174:5: ( (lv_customWorkspace_11_0= ruleEString ) )
                    // InternalJenkinsParser.g:4175:6: (lv_customWorkspace_11_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4175:6: (lv_customWorkspace_11_0= ruleEString )
                    // InternalJenkinsParser.g:4176:7: lv_customWorkspace_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getCustomWorkspaceEStringParserRuleCall_1_6_1_0());
                    						
                    pushFollow(FOLLOW_89);
                    lv_customWorkspace_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"customWorkspace",
                    								lv_customWorkspace_11_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4194:4: (otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==ReuseNode) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalJenkinsParser.g:4195:5: otherlv_12= ReuseNode ( (lv_reuseNode_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,ReuseNode,FOLLOW_12); 

                    					newLeafNode(otherlv_12, grammarAccess.getDockerAccess().getReuseNodeKeyword_1_7_0());
                    				
                    // InternalJenkinsParser.g:4199:5: ( (lv_reuseNode_13_0= ruleEString ) )
                    // InternalJenkinsParser.g:4200:6: (lv_reuseNode_13_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4200:6: (lv_reuseNode_13_0= ruleEString )
                    // InternalJenkinsParser.g:4201:7: lv_reuseNode_13_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getReuseNodeEStringParserRuleCall_1_7_1_0());
                    						
                    pushFollow(FOLLOW_90);
                    lv_reuseNode_13_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"reuseNode",
                    								lv_reuseNode_13_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4219:4: (otherlv_14= Args ( (lv_args_15_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Args) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalJenkinsParser.g:4220:5: otherlv_14= Args ( (lv_args_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,Args,FOLLOW_12); 

                    					newLeafNode(otherlv_14, grammarAccess.getDockerAccess().getArgsKeyword_1_8_0());
                    				
                    // InternalJenkinsParser.g:4224:5: ( (lv_args_15_0= ruleEString ) )
                    // InternalJenkinsParser.g:4225:6: (lv_args_15_0= ruleEString )
                    {
                    // InternalJenkinsParser.g:4225:6: (lv_args_15_0= ruleEString )
                    // InternalJenkinsParser.g:4226:7: lv_args_15_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDockerAccess().getArgsEStringParserRuleCall_1_8_1_0());
                    						
                    pushFollow(FOLLOW_91);
                    lv_args_15_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDockerRule());
                    							}
                    							set(
                    								current,
                    								"args",
                    								lv_args_15_0,
                    								"org.xtext.example.jenkins.Jenkins.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalJenkinsParser.g:4244:4: ( (lv_alwaysPull_16_0= AlwaysPull ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==AlwaysPull) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalJenkinsParser.g:4245:5: (lv_alwaysPull_16_0= AlwaysPull )
                    {
                    // InternalJenkinsParser.g:4245:5: (lv_alwaysPull_16_0= AlwaysPull )
                    // InternalJenkinsParser.g:4246:6: lv_alwaysPull_16_0= AlwaysPull
                    {
                    lv_alwaysPull_16_0=(Token)match(input,AlwaysPull,FOLLOW_14); 

                    						newLeafNode(lv_alwaysPull_16_0, grammarAccess.getDockerAccess().getAlwaysPullAlwaysPullKeyword_1_9_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDockerRule());
                    						}
                    						setWithLastConsumed(current, "alwaysPull", lv_alwaysPull_16_0 != null, "alwaysPull");
                    					

                    }


                    }
                    break;

            }

            this_END_17=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_17, grammarAccess.getDockerAccess().getENDTerminalRuleCall_1_10());
            			

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


    // $ANTLR start "entryRuleLabel"
    // InternalJenkinsParser.g:4267:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalJenkinsParser.g:4267:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalJenkinsParser.g:4268:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalJenkinsParser.g:4274:1: ruleLabel returns [EObject current=null] : (otherlv_0= Label (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4280:2: ( (otherlv_0= Label (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4281:2: (otherlv_0= Label (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4281:2: (otherlv_0= Label (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4282:3: otherlv_0= Label (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Label,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            // InternalJenkinsParser.g:4286:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4287:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Label_1 ( (lv_label_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_73); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getLabelAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Label_1,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLabelKeyword_1_1());
            			
            // InternalJenkinsParser.g:4295:4: ( (lv_label_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4296:5: (lv_label_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4296:5: (lv_label_3_0= ruleEString )
            // InternalJenkinsParser.g:4297:6: lv_label_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getLabelAccess().getLabelEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_label_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLabelRule());
            						}
            						set(
            							current,
            							"label",
            							lv_label_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getLabelAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleCron"
    // InternalJenkinsParser.g:4323:1: entryRuleCron returns [EObject current=null] : iv_ruleCron= ruleCron EOF ;
    public final EObject entryRuleCron() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCron = null;


        try {
            // InternalJenkinsParser.g:4323:45: (iv_ruleCron= ruleCron EOF )
            // InternalJenkinsParser.g:4324:2: iv_ruleCron= ruleCron EOF
            {
             newCompositeNode(grammarAccess.getCronRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCron=ruleCron();

            state._fsp--;

             current =iv_ruleCron; 
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
    // $ANTLR end "entryRuleCron"


    // $ANTLR start "ruleCron"
    // InternalJenkinsParser.g:4330:1: ruleCron returns [EObject current=null] : (otherlv_0= Cron (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleCron() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_timer_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4336:2: ( (otherlv_0= Cron (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4337:2: (otherlv_0= Cron (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4337:2: (otherlv_0= Cron (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4338:3: otherlv_0= Cron (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Cron,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCronAccess().getCronKeyword_0());
            		
            // InternalJenkinsParser.g:4342:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4343:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_92); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getCronAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Timer,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getCronAccess().getTimerKeyword_1_1());
            			
            // InternalJenkinsParser.g:4351:4: ( (lv_timer_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4352:5: (lv_timer_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4352:5: (lv_timer_3_0= ruleEString )
            // InternalJenkinsParser.g:4353:6: lv_timer_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCronAccess().getTimerEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_timer_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCronRule());
            						}
            						set(
            							current,
            							"timer",
            							lv_timer_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getCronAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleCron"


    // $ANTLR start "entryRulePollSCM"
    // InternalJenkinsParser.g:4379:1: entryRulePollSCM returns [EObject current=null] : iv_rulePollSCM= rulePollSCM EOF ;
    public final EObject entryRulePollSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSCM = null;


        try {
            // InternalJenkinsParser.g:4379:48: (iv_rulePollSCM= rulePollSCM EOF )
            // InternalJenkinsParser.g:4380:2: iv_rulePollSCM= rulePollSCM EOF
            {
             newCompositeNode(grammarAccess.getPollSCMRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePollSCM=rulePollSCM();

            state._fsp--;

             current =iv_rulePollSCM; 
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
    // $ANTLR end "entryRulePollSCM"


    // $ANTLR start "rulePollSCM"
    // InternalJenkinsParser.g:4386:1: rulePollSCM returns [EObject current=null] : (otherlv_0= PollSCM (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject rulePollSCM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_timer_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4392:2: ( (otherlv_0= PollSCM (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4393:2: (otherlv_0= PollSCM (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4393:2: (otherlv_0= PollSCM (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4394:3: otherlv_0= PollSCM (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,PollSCM,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPollSCMAccess().getPollSCMKeyword_0());
            		
            // InternalJenkinsParser.g:4398:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4399:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Timer ( (lv_timer_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_92); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getPollSCMAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Timer,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getPollSCMAccess().getTimerKeyword_1_1());
            			
            // InternalJenkinsParser.g:4407:4: ( (lv_timer_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4408:5: (lv_timer_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4408:5: (lv_timer_3_0= ruleEString )
            // InternalJenkinsParser.g:4409:6: lv_timer_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPollSCMAccess().getTimerEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_timer_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPollSCMRule());
            						}
            						set(
            							current,
            							"timer",
            							lv_timer_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getPollSCMAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "rulePollSCM"


    // $ANTLR start "entryRuleUpstream"
    // InternalJenkinsParser.g:4435:1: entryRuleUpstream returns [EObject current=null] : iv_ruleUpstream= ruleUpstream EOF ;
    public final EObject entryRuleUpstream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpstream = null;


        try {
            // InternalJenkinsParser.g:4435:49: (iv_ruleUpstream= ruleUpstream EOF )
            // InternalJenkinsParser.g:4436:2: iv_ruleUpstream= ruleUpstream EOF
            {
             newCompositeNode(grammarAccess.getUpstreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpstream=ruleUpstream();

            state._fsp--;

             current =iv_ruleUpstream; 
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
    // $ANTLR end "entryRuleUpstream"


    // $ANTLR start "ruleUpstream"
    // InternalJenkinsParser.g:4442:1: ruleUpstream returns [EObject current=null] : (otherlv_0= Upstream (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END ) ) ;
    public final EObject ruleUpstream() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_jobs_3_0 = null;

        AntlrDatatypeRuleToken lv_jobs_5_0 = null;

        AntlrDatatypeRuleToken lv_threshold_7_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4448:2: ( (otherlv_0= Upstream (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END ) ) )
            // InternalJenkinsParser.g:4449:2: (otherlv_0= Upstream (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            {
            // InternalJenkinsParser.g:4449:2: (otherlv_0= Upstream (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END ) )
            // InternalJenkinsParser.g:4450:3: otherlv_0= Upstream (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END )
            {
            otherlv_0=(Token)match(input,Upstream,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpstreamAccess().getUpstreamKeyword_0());
            		
            // InternalJenkinsParser.g:4454:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END )
            // InternalJenkinsParser.g:4455:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Jobs ( (lv_jobs_3_0= ruleEString ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )* otherlv_6= Threshold ( (lv_threshold_7_0= ruleEString ) ) this_END_8= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_93); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getUpstreamAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Jobs,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getUpstreamAccess().getJobsKeyword_1_1());
            			
            // InternalJenkinsParser.g:4463:4: ( (lv_jobs_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4464:5: (lv_jobs_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4464:5: (lv_jobs_3_0= ruleEString )
            // InternalJenkinsParser.g:4465:6: lv_jobs_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getUpstreamAccess().getJobsEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_94);
            lv_jobs_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getUpstreamRule());
            						}
            						add(
            							current,
            							"jobs",
            							lv_jobs_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalJenkinsParser.g:4482:4: (otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==Comma) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalJenkinsParser.g:4483:5: otherlv_4= Comma ( (lv_jobs_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getUpstreamAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalJenkinsParser.g:4487:5: ( (lv_jobs_5_0= ruleEString ) )
            	    // InternalJenkinsParser.g:4488:6: (lv_jobs_5_0= ruleEString )
            	    {
            	    // InternalJenkinsParser.g:4488:6: (lv_jobs_5_0= ruleEString )
            	    // InternalJenkinsParser.g:4489:7: lv_jobs_5_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getUpstreamAccess().getJobsEStringParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_94);
            	    lv_jobs_5_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getUpstreamRule());
            	    							}
            	    							add(
            	    								current,
            	    								"jobs",
            	    								lv_jobs_5_0,
            	    								"org.xtext.example.jenkins.Jenkins.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_6=(Token)match(input,Threshold,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getUpstreamAccess().getThresholdKeyword_1_4());
            			
            // InternalJenkinsParser.g:4511:4: ( (lv_threshold_7_0= ruleEString ) )
            // InternalJenkinsParser.g:4512:5: (lv_threshold_7_0= ruleEString )
            {
            // InternalJenkinsParser.g:4512:5: (lv_threshold_7_0= ruleEString )
            // InternalJenkinsParser.g:4513:6: lv_threshold_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getUpstreamAccess().getThresholdEStringParserRuleCall_1_5_0());
            					
            pushFollow(FOLLOW_14);
            lv_threshold_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getUpstreamRule());
            						}
            						set(
            							current,
            							"threshold",
            							lv_threshold_7_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_8, grammarAccess.getUpstreamAccess().getENDTerminalRuleCall_1_6());
            			

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
    // $ANTLR end "ruleUpstream"


    // $ANTLR start "entryRuleBuildDiscarder"
    // InternalJenkinsParser.g:4539:1: entryRuleBuildDiscarder returns [EObject current=null] : iv_ruleBuildDiscarder= ruleBuildDiscarder EOF ;
    public final EObject entryRuleBuildDiscarder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildDiscarder = null;


        try {
            // InternalJenkinsParser.g:4539:55: (iv_ruleBuildDiscarder= ruleBuildDiscarder EOF )
            // InternalJenkinsParser.g:4540:2: iv_ruleBuildDiscarder= ruleBuildDiscarder EOF
            {
             newCompositeNode(grammarAccess.getBuildDiscarderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildDiscarder=ruleBuildDiscarder();

            state._fsp--;

             current =iv_ruleBuildDiscarder; 
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
    // $ANTLR end "entryRuleBuildDiscarder"


    // $ANTLR start "ruleBuildDiscarder"
    // InternalJenkinsParser.g:4546:1: ruleBuildDiscarder returns [EObject current=null] : (otherlv_0= BuildDiscarder (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleBuildDiscarder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_numToKeepStr_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4552:2: ( (otherlv_0= BuildDiscarder (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4553:2: (otherlv_0= BuildDiscarder (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4553:2: (otherlv_0= BuildDiscarder (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4554:3: otherlv_0= BuildDiscarder (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,BuildDiscarder,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildDiscarderAccess().getBuildDiscarderKeyword_0());
            		
            // InternalJenkinsParser.g:4558:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4559:4: this_BEGIN_1= RULE_BEGIN otherlv_2= NumToKeepStr ( (lv_numToKeepStr_3_0= ruleEShort ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_95); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBuildDiscarderAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,NumToKeepStr,FOLLOW_62); 

            				newLeafNode(otherlv_2, grammarAccess.getBuildDiscarderAccess().getNumToKeepStrKeyword_1_1());
            			
            // InternalJenkinsParser.g:4567:4: ( (lv_numToKeepStr_3_0= ruleEShort ) )
            // InternalJenkinsParser.g:4568:5: (lv_numToKeepStr_3_0= ruleEShort )
            {
            // InternalJenkinsParser.g:4568:5: (lv_numToKeepStr_3_0= ruleEShort )
            // InternalJenkinsParser.g:4569:6: lv_numToKeepStr_3_0= ruleEShort
            {

            						newCompositeNode(grammarAccess.getBuildDiscarderAccess().getNumToKeepStrEShortParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_numToKeepStr_3_0=ruleEShort();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBuildDiscarderRule());
            						}
            						set(
            							current,
            							"numToKeepStr",
            							lv_numToKeepStr_3_0,
            							"org.xtext.example.jenkins.Jenkins.EShort");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getBuildDiscarderAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleBuildDiscarder"


    // $ANTLR start "entryRuleCheckoutToSubdirectory"
    // InternalJenkinsParser.g:4595:1: entryRuleCheckoutToSubdirectory returns [EObject current=null] : iv_ruleCheckoutToSubdirectory= ruleCheckoutToSubdirectory EOF ;
    public final EObject entryRuleCheckoutToSubdirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckoutToSubdirectory = null;


        try {
            // InternalJenkinsParser.g:4595:63: (iv_ruleCheckoutToSubdirectory= ruleCheckoutToSubdirectory EOF )
            // InternalJenkinsParser.g:4596:2: iv_ruleCheckoutToSubdirectory= ruleCheckoutToSubdirectory EOF
            {
             newCompositeNode(grammarAccess.getCheckoutToSubdirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckoutToSubdirectory=ruleCheckoutToSubdirectory();

            state._fsp--;

             current =iv_ruleCheckoutToSubdirectory; 
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
    // $ANTLR end "entryRuleCheckoutToSubdirectory"


    // $ANTLR start "ruleCheckoutToSubdirectory"
    // InternalJenkinsParser.g:4602:1: ruleCheckoutToSubdirectory returns [EObject current=null] : (otherlv_0= CheckoutToSubdirectory (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleCheckoutToSubdirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_directory_3_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4608:2: ( (otherlv_0= CheckoutToSubdirectory (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4609:2: (otherlv_0= CheckoutToSubdirectory (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4609:2: (otherlv_0= CheckoutToSubdirectory (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4610:3: otherlv_0= CheckoutToSubdirectory (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,CheckoutToSubdirectory,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckoutToSubdirectoryAccess().getCheckoutToSubdirectoryKeyword_0());
            		
            // InternalJenkinsParser.g:4614:3: (this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4615:4: this_BEGIN_1= RULE_BEGIN otherlv_2= Directory ( (lv_directory_3_0= ruleEString ) ) this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_96); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getCheckoutToSubdirectoryAccess().getBEGINTerminalRuleCall_1_0());
            			
            otherlv_2=(Token)match(input,Directory,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getCheckoutToSubdirectoryAccess().getDirectoryKeyword_1_1());
            			
            // InternalJenkinsParser.g:4623:4: ( (lv_directory_3_0= ruleEString ) )
            // InternalJenkinsParser.g:4624:5: (lv_directory_3_0= ruleEString )
            {
            // InternalJenkinsParser.g:4624:5: (lv_directory_3_0= ruleEString )
            // InternalJenkinsParser.g:4625:6: lv_directory_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getCheckoutToSubdirectoryAccess().getDirectoryEStringParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_directory_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCheckoutToSubdirectoryRule());
            						}
            						set(
            							current,
            							"directory",
            							lv_directory_3_0,
            							"org.xtext.example.jenkins.Jenkins.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getCheckoutToSubdirectoryAccess().getENDTerminalRuleCall_1_3());
            			

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
    // $ANTLR end "ruleCheckoutToSubdirectory"


    // $ANTLR start "entryRuleSkipStagesAfterUnstable"
    // InternalJenkinsParser.g:4651:1: entryRuleSkipStagesAfterUnstable returns [EObject current=null] : iv_ruleSkipStagesAfterUnstable= ruleSkipStagesAfterUnstable EOF ;
    public final EObject entryRuleSkipStagesAfterUnstable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipStagesAfterUnstable = null;


        try {
            // InternalJenkinsParser.g:4651:64: (iv_ruleSkipStagesAfterUnstable= ruleSkipStagesAfterUnstable EOF )
            // InternalJenkinsParser.g:4652:2: iv_ruleSkipStagesAfterUnstable= ruleSkipStagesAfterUnstable EOF
            {
             newCompositeNode(grammarAccess.getSkipStagesAfterUnstableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkipStagesAfterUnstable=ruleSkipStagesAfterUnstable();

            state._fsp--;

             current =iv_ruleSkipStagesAfterUnstable; 
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
    // $ANTLR end "entryRuleSkipStagesAfterUnstable"


    // $ANTLR start "ruleSkipStagesAfterUnstable"
    // InternalJenkinsParser.g:4658:1: ruleSkipStagesAfterUnstable returns [EObject current=null] : ( () otherlv_1= SkipStagesAfterUnstable ) ;
    public final EObject ruleSkipStagesAfterUnstable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4664:2: ( ( () otherlv_1= SkipStagesAfterUnstable ) )
            // InternalJenkinsParser.g:4665:2: ( () otherlv_1= SkipStagesAfterUnstable )
            {
            // InternalJenkinsParser.g:4665:2: ( () otherlv_1= SkipStagesAfterUnstable )
            // InternalJenkinsParser.g:4666:3: () otherlv_1= SkipStagesAfterUnstable
            {
            // InternalJenkinsParser.g:4666:3: ()
            // InternalJenkinsParser.g:4667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipStagesAfterUnstableAccess().getSkipStagesAfterUnstableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SkipStagesAfterUnstable,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSkipStagesAfterUnstableAccess().getSkipStagesAfterUnstableKeyword_1());
            		

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
    // $ANTLR end "ruleSkipStagesAfterUnstable"


    // $ANTLR start "entryRuleQuietPeriod"
    // InternalJenkinsParser.g:4681:1: entryRuleQuietPeriod returns [EObject current=null] : iv_ruleQuietPeriod= ruleQuietPeriod EOF ;
    public final EObject entryRuleQuietPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuietPeriod = null;


        try {
            // InternalJenkinsParser.g:4681:52: (iv_ruleQuietPeriod= ruleQuietPeriod EOF )
            // InternalJenkinsParser.g:4682:2: iv_ruleQuietPeriod= ruleQuietPeriod EOF
            {
             newCompositeNode(grammarAccess.getQuietPeriodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuietPeriod=ruleQuietPeriod();

            state._fsp--;

             current =iv_ruleQuietPeriod; 
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
    // $ANTLR end "entryRuleQuietPeriod"


    // $ANTLR start "ruleQuietPeriod"
    // InternalJenkinsParser.g:4688:1: ruleQuietPeriod returns [EObject current=null] : ( () otherlv_1= QuietPeriod (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleQuietPeriod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_period_4_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4694:2: ( ( () otherlv_1= QuietPeriod (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END ) ) )
            // InternalJenkinsParser.g:4695:2: ( () otherlv_1= QuietPeriod (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END ) )
            {
            // InternalJenkinsParser.g:4695:2: ( () otherlv_1= QuietPeriod (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END ) )
            // InternalJenkinsParser.g:4696:3: () otherlv_1= QuietPeriod (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END )
            {
            // InternalJenkinsParser.g:4696:3: ()
            // InternalJenkinsParser.g:4697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuietPeriodAccess().getQuietPeriodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,QuietPeriod,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getQuietPeriodAccess().getQuietPeriodKeyword_1());
            		
            // InternalJenkinsParser.g:4707:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END )
            // InternalJenkinsParser.g:4708:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Period ( (lv_period_4_0= ruleEShort ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_97); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getQuietPeriodAccess().getBEGINTerminalRuleCall_2_0());
            			
            otherlv_3=(Token)match(input,Period,FOLLOW_62); 

            				newLeafNode(otherlv_3, grammarAccess.getQuietPeriodAccess().getPeriodKeyword_2_1());
            			
            // InternalJenkinsParser.g:4716:4: ( (lv_period_4_0= ruleEShort ) )
            // InternalJenkinsParser.g:4717:5: (lv_period_4_0= ruleEShort )
            {
            // InternalJenkinsParser.g:4717:5: (lv_period_4_0= ruleEShort )
            // InternalJenkinsParser.g:4718:6: lv_period_4_0= ruleEShort
            {

            						newCompositeNode(grammarAccess.getQuietPeriodAccess().getPeriodEShortParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_14);
            lv_period_4_0=ruleEShort();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getQuietPeriodRule());
            						}
            						set(
            							current,
            							"period",
            							lv_period_4_0,
            							"org.xtext.example.jenkins.Jenkins.EShort");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_5, grammarAccess.getQuietPeriodAccess().getENDTerminalRuleCall_2_3());
            			

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
    // $ANTLR end "ruleQuietPeriod"


    // $ANTLR start "entryRulePreserveStashes"
    // InternalJenkinsParser.g:4744:1: entryRulePreserveStashes returns [EObject current=null] : iv_rulePreserveStashes= rulePreserveStashes EOF ;
    public final EObject entryRulePreserveStashes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreserveStashes = null;


        try {
            // InternalJenkinsParser.g:4744:56: (iv_rulePreserveStashes= rulePreserveStashes EOF )
            // InternalJenkinsParser.g:4745:2: iv_rulePreserveStashes= rulePreserveStashes EOF
            {
             newCompositeNode(grammarAccess.getPreserveStashesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreserveStashes=rulePreserveStashes();

            state._fsp--;

             current =iv_rulePreserveStashes; 
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
    // $ANTLR end "entryRulePreserveStashes"


    // $ANTLR start "rulePreserveStashes"
    // InternalJenkinsParser.g:4751:1: rulePreserveStashes returns [EObject current=null] : ( () otherlv_1= PreserveStashes (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )? ) ;
    public final EObject rulePreserveStashes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_buildCount_4_0 = null;



        	enterRule();

        try {
            // InternalJenkinsParser.g:4757:2: ( ( () otherlv_1= PreserveStashes (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )? ) )
            // InternalJenkinsParser.g:4758:2: ( () otherlv_1= PreserveStashes (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )? )
            {
            // InternalJenkinsParser.g:4758:2: ( () otherlv_1= PreserveStashes (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )? )
            // InternalJenkinsParser.g:4759:3: () otherlv_1= PreserveStashes (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )?
            {
            // InternalJenkinsParser.g:4759:3: ()
            // InternalJenkinsParser.g:4760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreserveStashesAccess().getPreserveStashesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PreserveStashes,FOLLOW_98); 

            			newLeafNode(otherlv_1, grammarAccess.getPreserveStashesAccess().getPreserveStashesKeyword_1());
            		
            // InternalJenkinsParser.g:4770:3: (this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_BEGIN) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalJenkinsParser.g:4771:4: this_BEGIN_2= RULE_BEGIN (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )? this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_99); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getPreserveStashesAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalJenkinsParser.g:4775:4: (otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==BuildCount) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalJenkinsParser.g:4776:5: otherlv_3= BuildCount ( (lv_buildCount_4_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,BuildCount,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getPreserveStashesAccess().getBuildCountKeyword_2_1_0());
                            				
                            // InternalJenkinsParser.g:4780:5: ( (lv_buildCount_4_0= ruleEString ) )
                            // InternalJenkinsParser.g:4781:6: (lv_buildCount_4_0= ruleEString )
                            {
                            // InternalJenkinsParser.g:4781:6: (lv_buildCount_4_0= ruleEString )
                            // InternalJenkinsParser.g:4782:7: lv_buildCount_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getPreserveStashesAccess().getBuildCountEStringParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_buildCount_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPreserveStashesRule());
                            							}
                            							set(
                            								current,
                            								"buildCount",
                            								lv_buildCount_4_0,
                            								"org.xtext.example.jenkins.Jenkins.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getPreserveStashesAccess().getENDTerminalRuleCall_2_2());
                    			

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
    // $ANTLR end "rulePreserveStashes"


    // $ANTLR start "entryRuleParallelsAlwaysFailFast"
    // InternalJenkinsParser.g:4809:1: entryRuleParallelsAlwaysFailFast returns [EObject current=null] : iv_ruleParallelsAlwaysFailFast= ruleParallelsAlwaysFailFast EOF ;
    public final EObject entryRuleParallelsAlwaysFailFast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelsAlwaysFailFast = null;


        try {
            // InternalJenkinsParser.g:4809:64: (iv_ruleParallelsAlwaysFailFast= ruleParallelsAlwaysFailFast EOF )
            // InternalJenkinsParser.g:4810:2: iv_ruleParallelsAlwaysFailFast= ruleParallelsAlwaysFailFast EOF
            {
             newCompositeNode(grammarAccess.getParallelsAlwaysFailFastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelsAlwaysFailFast=ruleParallelsAlwaysFailFast();

            state._fsp--;

             current =iv_ruleParallelsAlwaysFailFast; 
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
    // $ANTLR end "entryRuleParallelsAlwaysFailFast"


    // $ANTLR start "ruleParallelsAlwaysFailFast"
    // InternalJenkinsParser.g:4816:1: ruleParallelsAlwaysFailFast returns [EObject current=null] : ( () otherlv_1= ParallelsAlwaysFailFast ) ;
    public final EObject ruleParallelsAlwaysFailFast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4822:2: ( ( () otherlv_1= ParallelsAlwaysFailFast ) )
            // InternalJenkinsParser.g:4823:2: ( () otherlv_1= ParallelsAlwaysFailFast )
            {
            // InternalJenkinsParser.g:4823:2: ( () otherlv_1= ParallelsAlwaysFailFast )
            // InternalJenkinsParser.g:4824:3: () otherlv_1= ParallelsAlwaysFailFast
            {
            // InternalJenkinsParser.g:4824:3: ()
            // InternalJenkinsParser.g:4825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelsAlwaysFailFastAccess().getParallelsAlwaysFailFastAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParallelsAlwaysFailFast,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelsAlwaysFailFastAccess().getParallelsAlwaysFailFastKeyword_1());
            		

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
    // $ANTLR end "ruleParallelsAlwaysFailFast"


    // $ANTLR start "entryRuleDisableRestartFromStage"
    // InternalJenkinsParser.g:4839:1: entryRuleDisableRestartFromStage returns [EObject current=null] : iv_ruleDisableRestartFromStage= ruleDisableRestartFromStage EOF ;
    public final EObject entryRuleDisableRestartFromStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisableRestartFromStage = null;


        try {
            // InternalJenkinsParser.g:4839:64: (iv_ruleDisableRestartFromStage= ruleDisableRestartFromStage EOF )
            // InternalJenkinsParser.g:4840:2: iv_ruleDisableRestartFromStage= ruleDisableRestartFromStage EOF
            {
             newCompositeNode(grammarAccess.getDisableRestartFromStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisableRestartFromStage=ruleDisableRestartFromStage();

            state._fsp--;

             current =iv_ruleDisableRestartFromStage; 
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
    // $ANTLR end "entryRuleDisableRestartFromStage"


    // $ANTLR start "ruleDisableRestartFromStage"
    // InternalJenkinsParser.g:4846:1: ruleDisableRestartFromStage returns [EObject current=null] : ( () otherlv_1= DisableRestartFromStage ) ;
    public final EObject ruleDisableRestartFromStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4852:2: ( ( () otherlv_1= DisableRestartFromStage ) )
            // InternalJenkinsParser.g:4853:2: ( () otherlv_1= DisableRestartFromStage )
            {
            // InternalJenkinsParser.g:4853:2: ( () otherlv_1= DisableRestartFromStage )
            // InternalJenkinsParser.g:4854:3: () otherlv_1= DisableRestartFromStage
            {
            // InternalJenkinsParser.g:4854:3: ()
            // InternalJenkinsParser.g:4855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisableRestartFromStageAccess().getDisableRestartFromStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DisableRestartFromStage,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDisableRestartFromStageAccess().getDisableRestartFromStageKeyword_1());
            		

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
    // $ANTLR end "ruleDisableRestartFromStage"


    // $ANTLR start "entryRuleDisableResume"
    // InternalJenkinsParser.g:4869:1: entryRuleDisableResume returns [EObject current=null] : iv_ruleDisableResume= ruleDisableResume EOF ;
    public final EObject entryRuleDisableResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisableResume = null;


        try {
            // InternalJenkinsParser.g:4869:54: (iv_ruleDisableResume= ruleDisableResume EOF )
            // InternalJenkinsParser.g:4870:2: iv_ruleDisableResume= ruleDisableResume EOF
            {
             newCompositeNode(grammarAccess.getDisableResumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisableResume=ruleDisableResume();

            state._fsp--;

             current =iv_ruleDisableResume; 
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
    // $ANTLR end "entryRuleDisableResume"


    // $ANTLR start "ruleDisableResume"
    // InternalJenkinsParser.g:4876:1: ruleDisableResume returns [EObject current=null] : ( () otherlv_1= DisableResume ) ;
    public final EObject ruleDisableResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4882:2: ( ( () otherlv_1= DisableResume ) )
            // InternalJenkinsParser.g:4883:2: ( () otherlv_1= DisableResume )
            {
            // InternalJenkinsParser.g:4883:2: ( () otherlv_1= DisableResume )
            // InternalJenkinsParser.g:4884:3: () otherlv_1= DisableResume
            {
            // InternalJenkinsParser.g:4884:3: ()
            // InternalJenkinsParser.g:4885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisableResumeAccess().getDisableResumeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DisableResume,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDisableResumeAccess().getDisableResumeKeyword_1());
            		

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
    // $ANTLR end "ruleDisableResume"


    // $ANTLR start "entryRuleOverrideIndexTriggers"
    // InternalJenkinsParser.g:4899:1: entryRuleOverrideIndexTriggers returns [EObject current=null] : iv_ruleOverrideIndexTriggers= ruleOverrideIndexTriggers EOF ;
    public final EObject entryRuleOverrideIndexTriggers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideIndexTriggers = null;


        try {
            // InternalJenkinsParser.g:4899:62: (iv_ruleOverrideIndexTriggers= ruleOverrideIndexTriggers EOF )
            // InternalJenkinsParser.g:4900:2: iv_ruleOverrideIndexTriggers= ruleOverrideIndexTriggers EOF
            {
             newCompositeNode(grammarAccess.getOverrideIndexTriggersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverrideIndexTriggers=ruleOverrideIndexTriggers();

            state._fsp--;

             current =iv_ruleOverrideIndexTriggers; 
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
    // $ANTLR end "entryRuleOverrideIndexTriggers"


    // $ANTLR start "ruleOverrideIndexTriggers"
    // InternalJenkinsParser.g:4906:1: ruleOverrideIndexTriggers returns [EObject current=null] : ( () otherlv_1= OverrideIndexTriggers (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleOverrideIndexTriggers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token lv_override_3_0=null;
        Token this_END_4=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4912:2: ( ( () otherlv_1= OverrideIndexTriggers (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4913:2: ( () otherlv_1= OverrideIndexTriggers (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4913:2: ( () otherlv_1= OverrideIndexTriggers (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4914:3: () otherlv_1= OverrideIndexTriggers (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END )
            {
            // InternalJenkinsParser.g:4914:3: ()
            // InternalJenkinsParser.g:4915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOverrideIndexTriggersAccess().getOverrideIndexTriggersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,OverrideIndexTriggers,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOverrideIndexTriggersAccess().getOverrideIndexTriggersKeyword_1());
            		
            // InternalJenkinsParser.g:4925:3: (this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:4926:4: this_BEGIN_2= RULE_BEGIN ( (lv_override_3_0= Override ) ) this_END_4= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_100); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getOverrideIndexTriggersAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalJenkinsParser.g:4930:4: ( (lv_override_3_0= Override ) )
            // InternalJenkinsParser.g:4931:5: (lv_override_3_0= Override )
            {
            // InternalJenkinsParser.g:4931:5: (lv_override_3_0= Override )
            // InternalJenkinsParser.g:4932:6: lv_override_3_0= Override
            {
            lv_override_3_0=(Token)match(input,Override,FOLLOW_14); 

            						newLeafNode(lv_override_3_0, grammarAccess.getOverrideIndexTriggersAccess().getOverrideOverrideKeyword_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getOverrideIndexTriggersRule());
            						}
            						setWithLastConsumed(current, "override", lv_override_3_0 != null, "override");
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getOverrideIndexTriggersAccess().getENDTerminalRuleCall_2_2());
            			

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
    // $ANTLR end "ruleOverrideIndexTriggers"


    // $ANTLR start "entryRuleNewContainerPerStage"
    // InternalJenkinsParser.g:4953:1: entryRuleNewContainerPerStage returns [EObject current=null] : iv_ruleNewContainerPerStage= ruleNewContainerPerStage EOF ;
    public final EObject entryRuleNewContainerPerStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContainerPerStage = null;


        try {
            // InternalJenkinsParser.g:4953:61: (iv_ruleNewContainerPerStage= ruleNewContainerPerStage EOF )
            // InternalJenkinsParser.g:4954:2: iv_ruleNewContainerPerStage= ruleNewContainerPerStage EOF
            {
             newCompositeNode(grammarAccess.getNewContainerPerStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewContainerPerStage=ruleNewContainerPerStage();

            state._fsp--;

             current =iv_ruleNewContainerPerStage; 
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
    // $ANTLR end "entryRuleNewContainerPerStage"


    // $ANTLR start "ruleNewContainerPerStage"
    // InternalJenkinsParser.g:4960:1: ruleNewContainerPerStage returns [EObject current=null] : ( () otherlv_1= NewContainerPerStage ) ;
    public final EObject ruleNewContainerPerStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4966:2: ( ( () otherlv_1= NewContainerPerStage ) )
            // InternalJenkinsParser.g:4967:2: ( () otherlv_1= NewContainerPerStage )
            {
            // InternalJenkinsParser.g:4967:2: ( () otherlv_1= NewContainerPerStage )
            // InternalJenkinsParser.g:4968:3: () otherlv_1= NewContainerPerStage
            {
            // InternalJenkinsParser.g:4968:3: ()
            // InternalJenkinsParser.g:4969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNewContainerPerStageAccess().getNewContainerPerStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,NewContainerPerStage,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNewContainerPerStageAccess().getNewContainerPerStageKeyword_1());
            		

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
    // $ANTLR end "ruleNewContainerPerStage"


    // $ANTLR start "entryRuleDisableConcurrentBuilds"
    // InternalJenkinsParser.g:4983:1: entryRuleDisableConcurrentBuilds returns [EObject current=null] : iv_ruleDisableConcurrentBuilds= ruleDisableConcurrentBuilds EOF ;
    public final EObject entryRuleDisableConcurrentBuilds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisableConcurrentBuilds = null;


        try {
            // InternalJenkinsParser.g:4983:64: (iv_ruleDisableConcurrentBuilds= ruleDisableConcurrentBuilds EOF )
            // InternalJenkinsParser.g:4984:2: iv_ruleDisableConcurrentBuilds= ruleDisableConcurrentBuilds EOF
            {
             newCompositeNode(grammarAccess.getDisableConcurrentBuildsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisableConcurrentBuilds=ruleDisableConcurrentBuilds();

            state._fsp--;

             current =iv_ruleDisableConcurrentBuilds; 
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
    // $ANTLR end "entryRuleDisableConcurrentBuilds"


    // $ANTLR start "ruleDisableConcurrentBuilds"
    // InternalJenkinsParser.g:4990:1: ruleDisableConcurrentBuilds returns [EObject current=null] : ( () otherlv_1= DisableConcurrentBuilds (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END ) ) ;
    public final EObject ruleDisableConcurrentBuilds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token lv_abort_3_0=null;
        Token this_END_4=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:4996:2: ( ( () otherlv_1= DisableConcurrentBuilds (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END ) ) )
            // InternalJenkinsParser.g:4997:2: ( () otherlv_1= DisableConcurrentBuilds (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END ) )
            {
            // InternalJenkinsParser.g:4997:2: ( () otherlv_1= DisableConcurrentBuilds (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END ) )
            // InternalJenkinsParser.g:4998:3: () otherlv_1= DisableConcurrentBuilds (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END )
            {
            // InternalJenkinsParser.g:4998:3: ()
            // InternalJenkinsParser.g:4999:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisableConcurrentBuildsAccess().getDisableConcurrentBuildsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DisableConcurrentBuilds,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDisableConcurrentBuildsAccess().getDisableConcurrentBuildsKeyword_1());
            		
            // InternalJenkinsParser.g:5009:3: (this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END )
            // InternalJenkinsParser.g:5010:4: this_BEGIN_2= RULE_BEGIN ( (lv_abort_3_0= Abort ) ) this_END_4= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_101); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getDisableConcurrentBuildsAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalJenkinsParser.g:5014:4: ( (lv_abort_3_0= Abort ) )
            // InternalJenkinsParser.g:5015:5: (lv_abort_3_0= Abort )
            {
            // InternalJenkinsParser.g:5015:5: (lv_abort_3_0= Abort )
            // InternalJenkinsParser.g:5016:6: lv_abort_3_0= Abort
            {
            lv_abort_3_0=(Token)match(input,Abort,FOLLOW_14); 

            						newLeafNode(lv_abort_3_0, grammarAccess.getDisableConcurrentBuildsAccess().getAbortAbortKeyword_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getDisableConcurrentBuildsRule());
            						}
            						setWithLastConsumed(current, "abort", lv_abort_3_0 != null, "abort");
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getDisableConcurrentBuildsAccess().getENDTerminalRuleCall_2_2());
            			

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
    // $ANTLR end "ruleDisableConcurrentBuilds"


    // $ANTLR start "ruleCOMPARATOR_TYPE"
    // InternalJenkinsParser.g:5037:1: ruleCOMPARATOR_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= None_1 ) | (enumLiteral_1= Glob ) | (enumLiteral_2= Regexp ) | (enumLiteral_3= Equals_1 ) ) ;
    public final Enumerator ruleCOMPARATOR_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:5043:2: ( ( (enumLiteral_0= None_1 ) | (enumLiteral_1= Glob ) | (enumLiteral_2= Regexp ) | (enumLiteral_3= Equals_1 ) ) )
            // InternalJenkinsParser.g:5044:2: ( (enumLiteral_0= None_1 ) | (enumLiteral_1= Glob ) | (enumLiteral_2= Regexp ) | (enumLiteral_3= Equals_1 ) )
            {
            // InternalJenkinsParser.g:5044:2: ( (enumLiteral_0= None_1 ) | (enumLiteral_1= Glob ) | (enumLiteral_2= Regexp ) | (enumLiteral_3= Equals_1 ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case None_1:
                {
                alt91=1;
                }
                break;
            case Glob:
                {
                alt91=2;
                }
                break;
            case Regexp:
                {
                alt91=3;
                }
                break;
            case Equals_1:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalJenkinsParser.g:5045:3: (enumLiteral_0= None_1 )
                    {
                    // InternalJenkinsParser.g:5045:3: (enumLiteral_0= None_1 )
                    // InternalJenkinsParser.g:5046:4: enumLiteral_0= None_1
                    {
                    enumLiteral_0=(Token)match(input,None_1,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATOR_TYPEAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARATOR_TYPEAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:5053:3: (enumLiteral_1= Glob )
                    {
                    // InternalJenkinsParser.g:5053:3: (enumLiteral_1= Glob )
                    // InternalJenkinsParser.g:5054:4: enumLiteral_1= Glob
                    {
                    enumLiteral_1=(Token)match(input,Glob,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATOR_TYPEAccess().getGlobEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARATOR_TYPEAccess().getGlobEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:5061:3: (enumLiteral_2= Regexp )
                    {
                    // InternalJenkinsParser.g:5061:3: (enumLiteral_2= Regexp )
                    // InternalJenkinsParser.g:5062:4: enumLiteral_2= Regexp
                    {
                    enumLiteral_2=(Token)match(input,Regexp,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATOR_TYPEAccess().getRegexpEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARATOR_TYPEAccess().getRegexpEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:5069:3: (enumLiteral_3= Equals_1 )
                    {
                    // InternalJenkinsParser.g:5069:3: (enumLiteral_3= Equals_1 )
                    // InternalJenkinsParser.g:5070:4: enumLiteral_3= Equals_1
                    {
                    enumLiteral_3=(Token)match(input,Equals_1,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATOR_TYPEAccess().getEqualsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARATOR_TYPEAccess().getEqualsEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCOMPARATOR_TYPE"


    // $ANTLR start "ruleATTRIBUTE_TYPE"
    // InternalJenkinsParser.g:5080:1: ruleATTRIBUTE_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Target ) | (enumLiteral_1= Branch_1 ) | (enumLiteral_2= Fork ) | (enumLiteral_3= Url ) | (enumLiteral_4= Title ) | (enumLiteral_5= Author ) | (enumLiteral_6= AuthorDisplayName ) | (enumLiteral_7= AuthorEmail ) | (enumLiteral_8= Id ) ) ;
    public final Enumerator ruleATTRIBUTE_TYPE() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalJenkinsParser.g:5086:2: ( ( (enumLiteral_0= Target ) | (enumLiteral_1= Branch_1 ) | (enumLiteral_2= Fork ) | (enumLiteral_3= Url ) | (enumLiteral_4= Title ) | (enumLiteral_5= Author ) | (enumLiteral_6= AuthorDisplayName ) | (enumLiteral_7= AuthorEmail ) | (enumLiteral_8= Id ) ) )
            // InternalJenkinsParser.g:5087:2: ( (enumLiteral_0= Target ) | (enumLiteral_1= Branch_1 ) | (enumLiteral_2= Fork ) | (enumLiteral_3= Url ) | (enumLiteral_4= Title ) | (enumLiteral_5= Author ) | (enumLiteral_6= AuthorDisplayName ) | (enumLiteral_7= AuthorEmail ) | (enumLiteral_8= Id ) )
            {
            // InternalJenkinsParser.g:5087:2: ( (enumLiteral_0= Target ) | (enumLiteral_1= Branch_1 ) | (enumLiteral_2= Fork ) | (enumLiteral_3= Url ) | (enumLiteral_4= Title ) | (enumLiteral_5= Author ) | (enumLiteral_6= AuthorDisplayName ) | (enumLiteral_7= AuthorEmail ) | (enumLiteral_8= Id ) )
            int alt92=9;
            switch ( input.LA(1) ) {
            case Target:
                {
                alt92=1;
                }
                break;
            case Branch_1:
                {
                alt92=2;
                }
                break;
            case Fork:
                {
                alt92=3;
                }
                break;
            case Url:
                {
                alt92=4;
                }
                break;
            case Title:
                {
                alt92=5;
                }
                break;
            case Author:
                {
                alt92=6;
                }
                break;
            case AuthorDisplayName:
                {
                alt92=7;
                }
                break;
            case AuthorEmail:
                {
                alt92=8;
                }
                break;
            case Id:
                {
                alt92=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalJenkinsParser.g:5088:3: (enumLiteral_0= Target )
                    {
                    // InternalJenkinsParser.g:5088:3: (enumLiteral_0= Target )
                    // InternalJenkinsParser.g:5089:4: enumLiteral_0= Target
                    {
                    enumLiteral_0=(Token)match(input,Target,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getTargetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getATTRIBUTE_TYPEAccess().getTargetEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:5096:3: (enumLiteral_1= Branch_1 )
                    {
                    // InternalJenkinsParser.g:5096:3: (enumLiteral_1= Branch_1 )
                    // InternalJenkinsParser.g:5097:4: enumLiteral_1= Branch_1
                    {
                    enumLiteral_1=(Token)match(input,Branch_1,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getBranchEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getATTRIBUTE_TYPEAccess().getBranchEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:5104:3: (enumLiteral_2= Fork )
                    {
                    // InternalJenkinsParser.g:5104:3: (enumLiteral_2= Fork )
                    // InternalJenkinsParser.g:5105:4: enumLiteral_2= Fork
                    {
                    enumLiteral_2=(Token)match(input,Fork,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getForkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getATTRIBUTE_TYPEAccess().getForkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:5112:3: (enumLiteral_3= Url )
                    {
                    // InternalJenkinsParser.g:5112:3: (enumLiteral_3= Url )
                    // InternalJenkinsParser.g:5113:4: enumLiteral_3= Url
                    {
                    enumLiteral_3=(Token)match(input,Url,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getUrlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getATTRIBUTE_TYPEAccess().getUrlEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:5120:3: (enumLiteral_4= Title )
                    {
                    // InternalJenkinsParser.g:5120:3: (enumLiteral_4= Title )
                    // InternalJenkinsParser.g:5121:4: enumLiteral_4= Title
                    {
                    enumLiteral_4=(Token)match(input,Title,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getTitleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getATTRIBUTE_TYPEAccess().getTitleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJenkinsParser.g:5128:3: (enumLiteral_5= Author )
                    {
                    // InternalJenkinsParser.g:5128:3: (enumLiteral_5= Author )
                    // InternalJenkinsParser.g:5129:4: enumLiteral_5= Author
                    {
                    enumLiteral_5=(Token)match(input,Author,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJenkinsParser.g:5136:3: (enumLiteral_6= AuthorDisplayName )
                    {
                    // InternalJenkinsParser.g:5136:3: (enumLiteral_6= AuthorDisplayName )
                    // InternalJenkinsParser.g:5137:4: enumLiteral_6= AuthorDisplayName
                    {
                    enumLiteral_6=(Token)match(input,AuthorDisplayName,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorDisplayNameEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorDisplayNameEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJenkinsParser.g:5144:3: (enumLiteral_7= AuthorEmail )
                    {
                    // InternalJenkinsParser.g:5144:3: (enumLiteral_7= AuthorEmail )
                    // InternalJenkinsParser.g:5145:4: enumLiteral_7= AuthorEmail
                    {
                    enumLiteral_7=(Token)match(input,AuthorEmail,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorEmailEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getATTRIBUTE_TYPEAccess().getAuthorEmailEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJenkinsParser.g:5152:3: (enumLiteral_8= Id )
                    {
                    // InternalJenkinsParser.g:5152:3: (enumLiteral_8= Id )
                    // InternalJenkinsParser.g:5153:4: enumLiteral_8= Id
                    {
                    enumLiteral_8=(Token)match(input,Id,FOLLOW_2); 

                    				current = grammarAccess.getATTRIBUTE_TYPEAccess().getIdEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getATTRIBUTE_TYPEAccess().getIdEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleATTRIBUTE_TYPE"


    // $ANTLR start "rulePOST_TYPE"
    // InternalJenkinsParser.g:5163:1: rulePOST_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Always ) | (enumLiteral_1= Changed ) | (enumLiteral_2= Fixed ) | (enumLiteral_3= Regression ) | (enumLiteral_4= Aborted ) | (enumLiteral_5= Failure ) | (enumLiteral_6= Success ) | (enumLiteral_7= Unstable ) | (enumLiteral_8= Unsuccessful ) | (enumLiteral_9= Cleanup ) ) ;
    public final Enumerator rulePOST_TYPE() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalJenkinsParser.g:5169:2: ( ( (enumLiteral_0= Always ) | (enumLiteral_1= Changed ) | (enumLiteral_2= Fixed ) | (enumLiteral_3= Regression ) | (enumLiteral_4= Aborted ) | (enumLiteral_5= Failure ) | (enumLiteral_6= Success ) | (enumLiteral_7= Unstable ) | (enumLiteral_8= Unsuccessful ) | (enumLiteral_9= Cleanup ) ) )
            // InternalJenkinsParser.g:5170:2: ( (enumLiteral_0= Always ) | (enumLiteral_1= Changed ) | (enumLiteral_2= Fixed ) | (enumLiteral_3= Regression ) | (enumLiteral_4= Aborted ) | (enumLiteral_5= Failure ) | (enumLiteral_6= Success ) | (enumLiteral_7= Unstable ) | (enumLiteral_8= Unsuccessful ) | (enumLiteral_9= Cleanup ) )
            {
            // InternalJenkinsParser.g:5170:2: ( (enumLiteral_0= Always ) | (enumLiteral_1= Changed ) | (enumLiteral_2= Fixed ) | (enumLiteral_3= Regression ) | (enumLiteral_4= Aborted ) | (enumLiteral_5= Failure ) | (enumLiteral_6= Success ) | (enumLiteral_7= Unstable ) | (enumLiteral_8= Unsuccessful ) | (enumLiteral_9= Cleanup ) )
            int alt93=10;
            switch ( input.LA(1) ) {
            case Always:
                {
                alt93=1;
                }
                break;
            case Changed:
                {
                alt93=2;
                }
                break;
            case Fixed:
                {
                alt93=3;
                }
                break;
            case Regression:
                {
                alt93=4;
                }
                break;
            case Aborted:
                {
                alt93=5;
                }
                break;
            case Failure:
                {
                alt93=6;
                }
                break;
            case Success:
                {
                alt93=7;
                }
                break;
            case Unstable:
                {
                alt93=8;
                }
                break;
            case Unsuccessful:
                {
                alt93=9;
                }
                break;
            case Cleanup:
                {
                alt93=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalJenkinsParser.g:5171:3: (enumLiteral_0= Always )
                    {
                    // InternalJenkinsParser.g:5171:3: (enumLiteral_0= Always )
                    // InternalJenkinsParser.g:5172:4: enumLiteral_0= Always
                    {
                    enumLiteral_0=(Token)match(input,Always,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getAlwaysEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPOST_TYPEAccess().getAlwaysEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:5179:3: (enumLiteral_1= Changed )
                    {
                    // InternalJenkinsParser.g:5179:3: (enumLiteral_1= Changed )
                    // InternalJenkinsParser.g:5180:4: enumLiteral_1= Changed
                    {
                    enumLiteral_1=(Token)match(input,Changed,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getChangedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPOST_TYPEAccess().getChangedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:5187:3: (enumLiteral_2= Fixed )
                    {
                    // InternalJenkinsParser.g:5187:3: (enumLiteral_2= Fixed )
                    // InternalJenkinsParser.g:5188:4: enumLiteral_2= Fixed
                    {
                    enumLiteral_2=(Token)match(input,Fixed,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPOST_TYPEAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJenkinsParser.g:5195:3: (enumLiteral_3= Regression )
                    {
                    // InternalJenkinsParser.g:5195:3: (enumLiteral_3= Regression )
                    // InternalJenkinsParser.g:5196:4: enumLiteral_3= Regression
                    {
                    enumLiteral_3=(Token)match(input,Regression,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getRegressionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPOST_TYPEAccess().getRegressionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJenkinsParser.g:5203:3: (enumLiteral_4= Aborted )
                    {
                    // InternalJenkinsParser.g:5203:3: (enumLiteral_4= Aborted )
                    // InternalJenkinsParser.g:5204:4: enumLiteral_4= Aborted
                    {
                    enumLiteral_4=(Token)match(input,Aborted,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getAbortedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPOST_TYPEAccess().getAbortedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJenkinsParser.g:5211:3: (enumLiteral_5= Failure )
                    {
                    // InternalJenkinsParser.g:5211:3: (enumLiteral_5= Failure )
                    // InternalJenkinsParser.g:5212:4: enumLiteral_5= Failure
                    {
                    enumLiteral_5=(Token)match(input,Failure,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getFailureEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPOST_TYPEAccess().getFailureEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJenkinsParser.g:5219:3: (enumLiteral_6= Success )
                    {
                    // InternalJenkinsParser.g:5219:3: (enumLiteral_6= Success )
                    // InternalJenkinsParser.g:5220:4: enumLiteral_6= Success
                    {
                    enumLiteral_6=(Token)match(input,Success,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getSuccessEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPOST_TYPEAccess().getSuccessEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJenkinsParser.g:5227:3: (enumLiteral_7= Unstable )
                    {
                    // InternalJenkinsParser.g:5227:3: (enumLiteral_7= Unstable )
                    // InternalJenkinsParser.g:5228:4: enumLiteral_7= Unstable
                    {
                    enumLiteral_7=(Token)match(input,Unstable,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getUnstableEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPOST_TYPEAccess().getUnstableEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJenkinsParser.g:5235:3: (enumLiteral_8= Unsuccessful )
                    {
                    // InternalJenkinsParser.g:5235:3: (enumLiteral_8= Unsuccessful )
                    // InternalJenkinsParser.g:5236:4: enumLiteral_8= Unsuccessful
                    {
                    enumLiteral_8=(Token)match(input,Unsuccessful,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getUnsuccessfulEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPOST_TYPEAccess().getUnsuccessfulEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalJenkinsParser.g:5243:3: (enumLiteral_9= Cleanup )
                    {
                    // InternalJenkinsParser.g:5243:3: (enumLiteral_9= Cleanup )
                    // InternalJenkinsParser.g:5244:4: enumLiteral_9= Cleanup
                    {
                    enumLiteral_9=(Token)match(input,Cleanup,FOLLOW_2); 

                    				current = grammarAccess.getPOST_TYPEAccess().getCleanupEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPOST_TYPEAccess().getCleanupEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "rulePOST_TYPE"


    // $ANTLR start "ruleTOOL_TYPE"
    // InternalJenkinsParser.g:5254:1: ruleTOOL_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= Maven ) | (enumLiteral_1= Jdk ) | (enumLiteral_2= Gradle ) ) ;
    public final Enumerator ruleTOOL_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJenkinsParser.g:5260:2: ( ( (enumLiteral_0= Maven ) | (enumLiteral_1= Jdk ) | (enumLiteral_2= Gradle ) ) )
            // InternalJenkinsParser.g:5261:2: ( (enumLiteral_0= Maven ) | (enumLiteral_1= Jdk ) | (enumLiteral_2= Gradle ) )
            {
            // InternalJenkinsParser.g:5261:2: ( (enumLiteral_0= Maven ) | (enumLiteral_1= Jdk ) | (enumLiteral_2= Gradle ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case Maven:
                {
                alt94=1;
                }
                break;
            case Jdk:
                {
                alt94=2;
                }
                break;
            case Gradle:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalJenkinsParser.g:5262:3: (enumLiteral_0= Maven )
                    {
                    // InternalJenkinsParser.g:5262:3: (enumLiteral_0= Maven )
                    // InternalJenkinsParser.g:5263:4: enumLiteral_0= Maven
                    {
                    enumLiteral_0=(Token)match(input,Maven,FOLLOW_2); 

                    				current = grammarAccess.getTOOL_TYPEAccess().getMavenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTOOL_TYPEAccess().getMavenEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJenkinsParser.g:5270:3: (enumLiteral_1= Jdk )
                    {
                    // InternalJenkinsParser.g:5270:3: (enumLiteral_1= Jdk )
                    // InternalJenkinsParser.g:5271:4: enumLiteral_1= Jdk
                    {
                    enumLiteral_1=(Token)match(input,Jdk,FOLLOW_2); 

                    				current = grammarAccess.getTOOL_TYPEAccess().getJdkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTOOL_TYPEAccess().getJdkEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJenkinsParser.g:5278:3: (enumLiteral_2= Gradle )
                    {
                    // InternalJenkinsParser.g:5278:3: (enumLiteral_2= Gradle )
                    // InternalJenkinsParser.g:5279:4: enumLiteral_2= Gradle
                    {
                    enumLiteral_2=(Token)match(input,Gradle,FOLLOW_2); 

                    				current = grammarAccess.getTOOL_TYPEAccess().getGradleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTOOL_TYPEAccess().getGradleEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTOOL_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000000L,0x0800300040008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x040100A1E0E51BF0L,0x08013801C000800CL,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x04010081E0E51BF0L,0x000108018000000CL,0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x04010081E0E51BF2L,0x000148018000000CL,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x9C01C0E3F0F51BF0L,0x3801B801F803C00CL,0x0000000000000140L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1C01C0E3F0F51BF0L,0x3801B801F803C00CL,0x0000000000000140L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0C01C0E3F0F51BF0L,0x3801B801F803C00CL,0x0000000000000140L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0800C0E250101000L,0x3800B000F803C008L,0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800C0C250101000L,0x30008000B8034008L,0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800C0C250101000L,0x30000000B8034008L,0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800C0C210101000L,0x30000000B8034008L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800C0C210101000L,0x3000000098034008L,0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000001000L,0x0000000080020008L,0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200008000000L,0x00000008000422B1L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x8000004000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0041000120C04000L,0x0000000000000000L,0x000000000000010CL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0041000120C04000L,0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0041000120C04000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000120C04000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000120C00000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x04010081E0E51BF0L,0x00010C018000000CL,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0C01C0E3F0F51BF0L,0x38017801F801C00CL,0x0000000000000140L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800C0E250101000L,0x38017000F801C008L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800C0E250101000L,0x38017000D801C008L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000A040001000L,0x08017000C0008008L,0x0000000000000100L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000A000001000L,0x08017000C0008008L,0x0000000000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000001000L,0x0001400080000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000001000L,0x0000400080000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000001000L,0x0000000080000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0048000001200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800C04210100000L,0x3000000018014000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800C04210100000L,0x3000000018014000L,0x0000000000000100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000400008000L,0x0004010002180000L,0x0000000000000006L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000000110L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0020001000022400L,0x4002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0020001000022400L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0020001000020400L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0020000000020400L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0020000000020000L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0020000000020000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0020000000000000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0020021000020400L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0020020000020400L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0020020000020000L,0x0002002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0020020000020000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0020020000000000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000020000000000L,0x0002000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});

}