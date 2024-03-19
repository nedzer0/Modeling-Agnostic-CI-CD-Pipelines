package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Pipeline_tool_framework", "Pipeline_environment", "Tool_framework_job", "Allow_faillure", "Tool_Framework", "Description1", "Description", "Environment", "Environment_1", "IfThenElse", "Parameters", "Permission", "Ifthenelse", "Parameters_1", "Permission_1", "Condition", "Parameter", "Artifact", "PIPELINE", "Parallel", "Parallel_1", "Command", "Trigger", "Command_1", "Elseif", "Ifelse", "Output", "Name1", "Name3", "Name5", "Timer", "Value", "False", "Input", "Else", "Tool", "True", "When", "Job", "Key", "Job_1", "If", "LeftParenthesis", "RightParenthesis", "Comma", "RULE_NAME", "RULE_NEWLINE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Command_1=27;
    public static final int RULE_BEGIN=51;
    public static final int Parameters_1=17;
    public static final int True=40;
    public static final int Parallel=23;
    public static final int False=36;
    public static final int Name3=32;
    public static final int Name5=33;
    public static final int Input=37;
    public static final int Description1=9;
    public static final int Trigger=26;
    public static final int LeftParenthesis=46;
    public static final int Permission=15;
    public static final int Environment_1=12;
    public static final int Job=42;
    public static final int Name1=31;
    public static final int Tool=39;
    public static final int Parameters=14;
    public static final int RULE_ID=53;
    public static final int Ifelse=29;
    public static final int RightParenthesis=47;
    public static final int Pipeline_environment=5;
    public static final int RULE_INT=54;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=56;
    public static final int Environment=11;
    public static final int If=45;
    public static final int Key=43;
    public static final int RULE_END=52;
    public static final int Description=10;
    public static final int RULE_NEWLINE=50;
    public static final int RULE_NAME=49;
    public static final int Parallel_1=24;
    public static final int Job_1=44;
    public static final int RULE_STRING=55;
    public static final int Tool_framework_job=6;
    public static final int Tool_Framework=8;
    public static final int Ifthenelse=16;
    public static final int RULE_SL_COMMENT=57;
    public static final int Elseif=28;
    public static final int Comma=48;
    public static final int Output=30;
    public static final int PIPELINE=22;
    public static final int EOF=-1;
    public static final int Pipeline_tool_framework=4;
    public static final int Condition=19;
    public static final int RULE_WS=58;
    public static final int RULE_ANY_OTHER=59;
    public static final int Artifact=21;
    public static final int Allow_faillure=7;
    public static final int When=41;
    public static final int Timer=34;
    public static final int Command=25;
    public static final int Permission_1=18;
    public static final int Else=38;
    public static final int Parameter=20;
    public static final int IfThenElse=13;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDslParser.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalMyDslParser.g:57:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalMyDslParser.g:57:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalMyDslParser.g:58:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalMyDslParser.g:64:1: rulePipeline returns [EObject current=null] : ( () otherlv_1= PIPELINE ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? ) ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NAME_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_Name0_3_0 = null;

        EObject lv_when_5_0 = null;

        EObject lv_when_7_0 = null;

        EObject lv_job_9_0 = null;

        EObject lv_job_11_0 = null;

        EObject lv_pipeline_tool_framework_13_0 = null;

        EObject lv_pipeline_tool_framework_15_0 = null;

        EObject lv_pipeline_environment_17_0 = null;

        EObject lv_pipeline_environment_19_0 = null;

        EObject lv_permission_21_0 = null;

        EObject lv_permission_23_0 = null;

        EObject lv_parallel_25_0 = null;

        EObject lv_parallel_27_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:70:2: ( ( () otherlv_1= PIPELINE ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? ) ) )
            // InternalMyDslParser.g:71:2: ( () otherlv_1= PIPELINE ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? ) )
            {
            // InternalMyDslParser.g:71:2: ( () otherlv_1= PIPELINE ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? ) )
            // InternalMyDslParser.g:72:3: () otherlv_1= PIPELINE ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? )
            {
            // InternalMyDslParser.g:72:3: ()
            // InternalMyDslParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPipelineAccess().getPipelineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PIPELINE,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getPIPELINEKeyword_1());
            		
            // InternalMyDslParser.g:83:3: ( (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? ) | (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* ) | (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )? | (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )? | (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )? | (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )? | (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )? )
            int alt13=7;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt13=1;
                }
                break;
            case When:
                {
                alt13=2;
                }
                break;
            case Job_1:
                {
                alt13=3;
                }
                break;
            case EOF:
                {
                alt13=3;
                }
                break;
            case Pipeline_tool_framework:
                {
                alt13=4;
                }
                break;
            case Pipeline_environment:
                {
                alt13=5;
                }
                break;
            case Permission_1:
                {
                alt13=6;
                }
                break;
            case Parallel_1:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDslParser.g:84:4: (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? )
                    {
                    // InternalMyDslParser.g:84:4: (this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )? )
                    // InternalMyDslParser.g:85:5: this_NAME_2= RULE_NAME ( (lv_Name0_3_0= ruleEString ) )?
                    {
                    this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_4); 

                    					newLeafNode(this_NAME_2, grammarAccess.getPipelineAccess().getNAMETerminalRuleCall_2_0_0());
                    				
                    // InternalMyDslParser.g:89:5: ( (lv_Name0_3_0= ruleEString ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalMyDslParser.g:90:6: (lv_Name0_3_0= ruleEString )
                            {
                            // InternalMyDslParser.g:90:6: (lv_Name0_3_0= ruleEString )
                            // InternalMyDslParser.g:91:7: lv_Name0_3_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getName0EStringParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_Name0_3_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							set(
                            								current,
                            								"Name0",
                            								lv_Name0_3_0,
                            								"org.xtext.example.mydsl.MyDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:110:4: (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* )
                    {
                    // InternalMyDslParser.g:110:4: (otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )* )
                    // InternalMyDslParser.g:111:5: otherlv_4= When ( (lv_when_5_0= ruleWhen ) ) (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )*
                    {
                    otherlv_4=(Token)match(input,When,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getWhenKeyword_2_1_0());
                    				
                    // InternalMyDslParser.g:115:5: ( (lv_when_5_0= ruleWhen ) )
                    // InternalMyDslParser.g:116:6: (lv_when_5_0= ruleWhen )
                    {
                    // InternalMyDslParser.g:116:6: (lv_when_5_0= ruleWhen )
                    // InternalMyDslParser.g:117:7: lv_when_5_0= ruleWhen
                    {

                    							newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_when_5_0=ruleWhen();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPipelineRule());
                    							}
                    							add(
                    								current,
                    								"when",
                    								lv_when_5_0,
                    								"org.xtext.example.mydsl.MyDsl.When");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDslParser.g:134:5: (otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDslParser.g:135:6: otherlv_6= Comma ( (lv_when_7_0= ruleWhen ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_5); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalMyDslParser.g:139:6: ( (lv_when_7_0= ruleWhen ) )
                    	    // InternalMyDslParser.g:140:7: (lv_when_7_0= ruleWhen )
                    	    {
                    	    // InternalMyDslParser.g:140:7: (lv_when_7_0= ruleWhen )
                    	    // InternalMyDslParser.g:141:8: lv_when_7_0= ruleWhen
                    	    {

                    	    								newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_when_7_0=ruleWhen();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"when",
                    	    									lv_when_7_0,
                    	    									"org.xtext.example.mydsl.MyDsl.When");
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


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:161:4: (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )?
                    {
                    // InternalMyDslParser.g:161:4: (otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Job_1) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDslParser.g:162:5: otherlv_8= Job_1 ( (lv_job_9_0= ruleJob ) ) (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )*
                            {
                            otherlv_8=(Token)match(input,Job_1,FOLLOW_7); 

                            					newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getJobKeyword_2_2_0());
                            				
                            // InternalMyDslParser.g:166:5: ( (lv_job_9_0= ruleJob ) )
                            // InternalMyDslParser.g:167:6: (lv_job_9_0= ruleJob )
                            {
                            // InternalMyDslParser.g:167:6: (lv_job_9_0= ruleJob )
                            // InternalMyDslParser.g:168:7: lv_job_9_0= ruleJob
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_job_9_0=ruleJob();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"job",
                            								lv_job_9_0,
                            								"org.xtext.example.mydsl.MyDsl.Job");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:185:5: (otherlv_10= Comma ( (lv_job_11_0= ruleJob ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==Comma) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalMyDslParser.g:186:6: otherlv_10= Comma ( (lv_job_11_0= ruleJob ) )
                            	    {
                            	    otherlv_10=(Token)match(input,Comma,FOLLOW_7); 

                            	    						newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getCommaKeyword_2_2_2_0());
                            	    					
                            	    // InternalMyDslParser.g:190:6: ( (lv_job_11_0= ruleJob ) )
                            	    // InternalMyDslParser.g:191:7: (lv_job_11_0= ruleJob )
                            	    {
                            	    // InternalMyDslParser.g:191:7: (lv_job_11_0= ruleJob )
                            	    // InternalMyDslParser.g:192:8: lv_job_11_0= ruleJob
                            	    {

                            	    								newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_2_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_job_11_0=ruleJob();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"job",
                            	    									lv_job_11_0,
                            	    									"org.xtext.example.mydsl.MyDsl.Job");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDslParser.g:212:4: (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )?
                    {
                    // InternalMyDslParser.g:212:4: (otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Pipeline_tool_framework) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDslParser.g:213:5: otherlv_12= Pipeline_tool_framework ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) ) (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )*
                            {
                            otherlv_12=(Token)match(input,Pipeline_tool_framework,FOLLOW_8); 

                            					newLeafNode(otherlv_12, grammarAccess.getPipelineAccess().getPipeline_tool_frameworkKeyword_2_3_0());
                            				
                            // InternalMyDslParser.g:217:5: ( (lv_pipeline_tool_framework_13_0= ruleTool_Framework ) )
                            // InternalMyDslParser.g:218:6: (lv_pipeline_tool_framework_13_0= ruleTool_Framework )
                            {
                            // InternalMyDslParser.g:218:6: (lv_pipeline_tool_framework_13_0= ruleTool_Framework )
                            // InternalMyDslParser.g:219:7: lv_pipeline_tool_framework_13_0= ruleTool_Framework
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_FrameworkParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_pipeline_tool_framework_13_0=ruleTool_Framework();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"pipeline_tool_framework",
                            								lv_pipeline_tool_framework_13_0,
                            								"org.xtext.example.mydsl.MyDsl.Tool_Framework");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:236:5: (otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==Comma) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalMyDslParser.g:237:6: otherlv_14= Comma ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) )
                            	    {
                            	    otherlv_14=(Token)match(input,Comma,FOLLOW_8); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getPipelineAccess().getCommaKeyword_2_3_2_0());
                            	    					
                            	    // InternalMyDslParser.g:241:6: ( (lv_pipeline_tool_framework_15_0= ruleTool_Framework ) )
                            	    // InternalMyDslParser.g:242:7: (lv_pipeline_tool_framework_15_0= ruleTool_Framework )
                            	    {
                            	    // InternalMyDslParser.g:242:7: (lv_pipeline_tool_framework_15_0= ruleTool_Framework )
                            	    // InternalMyDslParser.g:243:8: lv_pipeline_tool_framework_15_0= ruleTool_Framework
                            	    {

                            	    								newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_FrameworkParserRuleCall_2_3_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_pipeline_tool_framework_15_0=ruleTool_Framework();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"pipeline_tool_framework",
                            	    									lv_pipeline_tool_framework_15_0,
                            	    									"org.xtext.example.mydsl.MyDsl.Tool_Framework");
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
                    break;
                case 5 :
                    // InternalMyDslParser.g:263:4: (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )?
                    {
                    // InternalMyDslParser.g:263:4: (otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Pipeline_environment) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDslParser.g:264:5: otherlv_16= Pipeline_environment ( (lv_pipeline_environment_17_0= ruleEnvironment ) ) (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )*
                            {
                            otherlv_16=(Token)match(input,Pipeline_environment,FOLLOW_9); 

                            					newLeafNode(otherlv_16, grammarAccess.getPipelineAccess().getPipeline_environmentKeyword_2_4_0());
                            				
                            // InternalMyDslParser.g:268:5: ( (lv_pipeline_environment_17_0= ruleEnvironment ) )
                            // InternalMyDslParser.g:269:6: (lv_pipeline_environment_17_0= ruleEnvironment )
                            {
                            // InternalMyDslParser.g:269:6: (lv_pipeline_environment_17_0= ruleEnvironment )
                            // InternalMyDslParser.g:270:7: lv_pipeline_environment_17_0= ruleEnvironment
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_environmentEnvironmentParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_pipeline_environment_17_0=ruleEnvironment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"pipeline_environment",
                            								lv_pipeline_environment_17_0,
                            								"org.xtext.example.mydsl.MyDsl.Environment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:287:5: (otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==Comma) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalMyDslParser.g:288:6: otherlv_18= Comma ( (lv_pipeline_environment_19_0= ruleEnvironment ) )
                            	    {
                            	    otherlv_18=(Token)match(input,Comma,FOLLOW_9); 

                            	    						newLeafNode(otherlv_18, grammarAccess.getPipelineAccess().getCommaKeyword_2_4_2_0());
                            	    					
                            	    // InternalMyDslParser.g:292:6: ( (lv_pipeline_environment_19_0= ruleEnvironment ) )
                            	    // InternalMyDslParser.g:293:7: (lv_pipeline_environment_19_0= ruleEnvironment )
                            	    {
                            	    // InternalMyDslParser.g:293:7: (lv_pipeline_environment_19_0= ruleEnvironment )
                            	    // InternalMyDslParser.g:294:8: lv_pipeline_environment_19_0= ruleEnvironment
                            	    {

                            	    								newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_environmentEnvironmentParserRuleCall_2_4_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_pipeline_environment_19_0=ruleEnvironment();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"pipeline_environment",
                            	    									lv_pipeline_environment_19_0,
                            	    									"org.xtext.example.mydsl.MyDsl.Environment");
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
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDslParser.g:314:4: (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )?
                    {
                    // InternalMyDslParser.g:314:4: (otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==Permission_1) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDslParser.g:315:5: otherlv_20= Permission_1 ( (lv_permission_21_0= rulePermission ) ) (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )*
                            {
                            otherlv_20=(Token)match(input,Permission_1,FOLLOW_10); 

                            					newLeafNode(otherlv_20, grammarAccess.getPipelineAccess().getPermissionKeyword_2_5_0());
                            				
                            // InternalMyDslParser.g:319:5: ( (lv_permission_21_0= rulePermission ) )
                            // InternalMyDslParser.g:320:6: (lv_permission_21_0= rulePermission )
                            {
                            // InternalMyDslParser.g:320:6: (lv_permission_21_0= rulePermission )
                            // InternalMyDslParser.g:321:7: lv_permission_21_0= rulePermission
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getPermissionPermissionParserRuleCall_2_5_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_permission_21_0=rulePermission();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"permission",
                            								lv_permission_21_0,
                            								"org.xtext.example.mydsl.MyDsl.Permission");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:338:5: (otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==Comma) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalMyDslParser.g:339:6: otherlv_22= Comma ( (lv_permission_23_0= rulePermission ) )
                            	    {
                            	    otherlv_22=(Token)match(input,Comma,FOLLOW_10); 

                            	    						newLeafNode(otherlv_22, grammarAccess.getPipelineAccess().getCommaKeyword_2_5_2_0());
                            	    					
                            	    // InternalMyDslParser.g:343:6: ( (lv_permission_23_0= rulePermission ) )
                            	    // InternalMyDslParser.g:344:7: (lv_permission_23_0= rulePermission )
                            	    {
                            	    // InternalMyDslParser.g:344:7: (lv_permission_23_0= rulePermission )
                            	    // InternalMyDslParser.g:345:8: lv_permission_23_0= rulePermission
                            	    {

                            	    								newCompositeNode(grammarAccess.getPipelineAccess().getPermissionPermissionParserRuleCall_2_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_permission_23_0=rulePermission();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"permission",
                            	    									lv_permission_23_0,
                            	    									"org.xtext.example.mydsl.MyDsl.Permission");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDslParser.g:365:4: (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )?
                    {
                    // InternalMyDslParser.g:365:4: (otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==Parallel_1) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDslParser.g:366:5: otherlv_24= Parallel_1 ( (lv_parallel_25_0= ruleParallel ) ) (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )*
                            {
                            otherlv_24=(Token)match(input,Parallel_1,FOLLOW_11); 

                            					newLeafNode(otherlv_24, grammarAccess.getPipelineAccess().getParallelKeyword_2_6_0());
                            				
                            // InternalMyDslParser.g:370:5: ( (lv_parallel_25_0= ruleParallel ) )
                            // InternalMyDslParser.g:371:6: (lv_parallel_25_0= ruleParallel )
                            {
                            // InternalMyDslParser.g:371:6: (lv_parallel_25_0= ruleParallel )
                            // InternalMyDslParser.g:372:7: lv_parallel_25_0= ruleParallel
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getParallelParallelParserRuleCall_2_6_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            lv_parallel_25_0=ruleParallel();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"parallel",
                            								lv_parallel_25_0,
                            								"org.xtext.example.mydsl.MyDsl.Parallel");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:389:5: (otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==Comma) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalMyDslParser.g:390:6: otherlv_26= Comma ( (lv_parallel_27_0= ruleParallel ) )
                            	    {
                            	    otherlv_26=(Token)match(input,Comma,FOLLOW_11); 

                            	    						newLeafNode(otherlv_26, grammarAccess.getPipelineAccess().getCommaKeyword_2_6_2_0());
                            	    					
                            	    // InternalMyDslParser.g:394:6: ( (lv_parallel_27_0= ruleParallel ) )
                            	    // InternalMyDslParser.g:395:7: (lv_parallel_27_0= ruleParallel )
                            	    {
                            	    // InternalMyDslParser.g:395:7: (lv_parallel_27_0= ruleParallel )
                            	    // InternalMyDslParser.g:396:8: lv_parallel_27_0= ruleParallel
                            	    {

                            	    								newCompositeNode(grammarAccess.getPipelineAccess().getParallelParallelParserRuleCall_2_6_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    lv_parallel_27_0=ruleParallel();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parallel",
                            	    									lv_parallel_27_0,
                            	    									"org.xtext.example.mydsl.MyDsl.Parallel");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


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


    // $ANTLR start "entryRuleWhen"
    // InternalMyDslParser.g:420:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalMyDslParser.g:420:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalMyDslParser.g:421:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalMyDslParser.g:427:1: ruleWhen returns [EObject current=null] : ( () ( (lv_Name4_1_0= ruleEString ) ) (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )? (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Name4_1_0 = null;

        AntlrDatatypeRuleToken lv_Trigger_3_0 = null;

        AntlrDatatypeRuleToken lv_Timer_5_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:433:2: ( ( () ( (lv_Name4_1_0= ruleEString ) ) (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )? (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:434:2: ( () ( (lv_Name4_1_0= ruleEString ) ) (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )? (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:434:2: ( () ( (lv_Name4_1_0= ruleEString ) ) (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )? (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:435:3: () ( (lv_Name4_1_0= ruleEString ) ) (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )? (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:435:3: ()
            // InternalMyDslParser.g:436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhenAccess().getWhenAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:442:3: ( (lv_Name4_1_0= ruleEString ) )
            // InternalMyDslParser.g:443:4: (lv_Name4_1_0= ruleEString )
            {
            // InternalMyDslParser.g:443:4: (lv_Name4_1_0= ruleEString )
            // InternalMyDslParser.g:444:5: lv_Name4_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getName4EStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_Name4_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"Name4",
            						lv_Name4_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDslParser.g:461:3: (otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Trigger) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDslParser.g:462:4: otherlv_2= Trigger ( (lv_Trigger_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Trigger,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getWhenAccess().getTriggerKeyword_2_0());
                    			
                    // InternalMyDslParser.g:466:4: ( (lv_Trigger_3_0= ruleEString ) )
                    // InternalMyDslParser.g:467:5: (lv_Trigger_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:467:5: (lv_Trigger_3_0= ruleEString )
                    // InternalMyDslParser.g:468:6: lv_Trigger_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTriggerEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_Trigger_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"Trigger",
                    							lv_Trigger_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:486:3: (otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Timer) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDslParser.g:487:4: otherlv_4= Timer ( (lv_Timer_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Timer,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getTimerKeyword_3_0());
                    			
                    // InternalMyDslParser.g:491:4: ( (lv_Timer_5_0= ruleEString ) )
                    // InternalMyDslParser.g:492:5: (lv_Timer_5_0= ruleEString )
                    {
                    // InternalMyDslParser.g:492:5: (lv_Timer_5_0= ruleEString )
                    // InternalMyDslParser.g:493:6: lv_Timer_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTimerEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Timer_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"Timer",
                    							lv_Timer_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleJob"
    // InternalMyDslParser.g:515:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDslParser.g:515:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDslParser.g:516:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDslParser.g:522:1: ruleJob returns [EObject current=null] : ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? otherlv_2= Job (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )? (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )? (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )? (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )? (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )? (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )? (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )? (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )? ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token lv_Allow_faillure_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_Name1_4_0 = null;

        AntlrDatatypeRuleToken lv_Description1_6_0 = null;

        EObject lv_tool_framework_job_14_0 = null;

        EObject lv_tool_framework_job_16_0 = null;

        EObject lv_command_18_0 = null;

        EObject lv_command_20_0 = null;

        EObject lv_ifthenelse_22_0 = null;

        EObject lv_ifthenelse_24_0 = null;

        EObject lv_input_26_0 = null;

        EObject lv_input_28_0 = null;

        EObject lv_environment_30_0 = null;

        EObject lv_environment_32_0 = null;

        EObject lv_permission_34_0 = null;

        EObject lv_permission_36_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:528:2: ( ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? otherlv_2= Job (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )? (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )? (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )? (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )? (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )? (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )? (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )? (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )? ) )
            // InternalMyDslParser.g:529:2: ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? otherlv_2= Job (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )? (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )? (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )? (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )? (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )? (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )? (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )? (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )? )
            {
            // InternalMyDslParser.g:529:2: ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? otherlv_2= Job (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )? (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )? (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )? (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )? (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )? (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )? (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )? (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )? )
            // InternalMyDslParser.g:530:3: () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? otherlv_2= Job (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )? (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )? (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )? (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )? (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )? (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )? (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )? (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )?
            {
            // InternalMyDslParser.g:530:3: ()
            // InternalMyDslParser.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJobAccess().getJobAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:537:3: ( (lv_Allow_faillure_1_0= Allow_faillure ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Allow_faillure) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDslParser.g:538:4: (lv_Allow_faillure_1_0= Allow_faillure )
                    {
                    // InternalMyDslParser.g:538:4: (lv_Allow_faillure_1_0= Allow_faillure )
                    // InternalMyDslParser.g:539:5: lv_Allow_faillure_1_0= Allow_faillure
                    {
                    lv_Allow_faillure_1_0=(Token)match(input,Allow_faillure,FOLLOW_14); 

                    					newLeafNode(lv_Allow_faillure_1_0, grammarAccess.getJobAccess().getAllow_faillureAllow_faillureKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJobRule());
                    					}
                    					setWithLastConsumed(current, "Allow_faillure", lv_Allow_faillure_1_0 != null, "Allow_faillure");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,Job,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getJobKeyword_2());
            		
            // InternalMyDslParser.g:555:3: (otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Name1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDslParser.g:556:4: otherlv_3= Name1 ( (lv_Name1_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name1,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getJobAccess().getName1Keyword_3_0());
                    			
                    // InternalMyDslParser.g:560:4: ( (lv_Name1_4_0= ruleEString ) )
                    // InternalMyDslParser.g:561:5: (lv_Name1_4_0= ruleEString )
                    {
                    // InternalMyDslParser.g:561:5: (lv_Name1_4_0= ruleEString )
                    // InternalMyDslParser.g:562:6: lv_Name1_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getName1EStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_Name1_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"Name1",
                    							lv_Name1_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:580:3: (otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDslParser.g:581:4: otherlv_5= Description1 ( (lv_Description1_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Description1,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getJobAccess().getDescription1Keyword_4_0());
                    			
                    // InternalMyDslParser.g:585:4: ( (lv_Description1_6_0= ruleEString ) )
                    // InternalMyDslParser.g:586:5: (lv_Description1_6_0= ruleEString )
                    {
                    // InternalMyDslParser.g:586:5: (lv_Description1_6_0= ruleEString )
                    // InternalMyDslParser.g:587:6: lv_Description1_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getDescription1EStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_Description1_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"Description1",
                    							lv_Description1_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:605:3: (otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Output) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDslParser.g:606:4: otherlv_7= Output otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,Output,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getJobAccess().getOutputKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getJobAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDslParser.g:614:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:615:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:615:5: ( ruleEString )
                    // InternalMyDslParser.g:616:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:630:4: (otherlv_10= Comma ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDslParser.g:631:5: otherlv_10= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getJobAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDslParser.g:635:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:636:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:636:6: ( ruleEString )
                    	    // InternalMyDslParser.g:637:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,RightParenthesis,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getJobAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:657:3: (otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Tool_framework_job) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDslParser.g:658:4: otherlv_13= Tool_framework_job ( (lv_tool_framework_job_14_0= ruleTool_Framework ) ) (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )*
                    {
                    otherlv_13=(Token)match(input,Tool_framework_job,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getTool_framework_jobKeyword_6_0());
                    			
                    // InternalMyDslParser.g:662:4: ( (lv_tool_framework_job_14_0= ruleTool_Framework ) )
                    // InternalMyDslParser.g:663:5: (lv_tool_framework_job_14_0= ruleTool_Framework )
                    {
                    // InternalMyDslParser.g:663:5: (lv_tool_framework_job_14_0= ruleTool_Framework )
                    // InternalMyDslParser.g:664:6: lv_tool_framework_job_14_0= ruleTool_Framework
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_FrameworkParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_tool_framework_job_14_0=ruleTool_Framework();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"tool_framework_job",
                    							lv_tool_framework_job_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Tool_Framework");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:681:4: (otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==Tool_Framework) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDslParser.g:682:5: otherlv_15= Comma ( (lv_tool_framework_job_16_0= ruleTool_Framework ) )
                    	    {
                    	    otherlv_15=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getJobAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDslParser.g:686:5: ( (lv_tool_framework_job_16_0= ruleTool_Framework ) )
                    	    // InternalMyDslParser.g:687:6: (lv_tool_framework_job_16_0= ruleTool_Framework )
                    	    {
                    	    // InternalMyDslParser.g:687:6: (lv_tool_framework_job_16_0= ruleTool_Framework )
                    	    // InternalMyDslParser.g:688:7: lv_tool_framework_job_16_0= ruleTool_Framework
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_FrameworkParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_tool_framework_job_16_0=ruleTool_Framework();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tool_framework_job",
                    	    								lv_tool_framework_job_16_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Tool_Framework");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslParser.g:707:3: (otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Command_1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDslParser.g:708:4: otherlv_17= Command_1 ( (lv_command_18_0= ruleCommand ) ) (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )*
                    {
                    otherlv_17=(Token)match(input,Command_1,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getJobAccess().getCommandKeyword_7_0());
                    			
                    // InternalMyDslParser.g:712:4: ( (lv_command_18_0= ruleCommand ) )
                    // InternalMyDslParser.g:713:5: (lv_command_18_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:713:5: (lv_command_18_0= ruleCommand )
                    // InternalMyDslParser.g:714:6: lv_command_18_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_command_18_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"command",
                    							lv_command_18_0,
                    							"org.xtext.example.mydsl.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:731:4: (otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==Command) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDslParser.g:732:5: otherlv_19= Comma ( (lv_command_20_0= ruleCommand ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Comma,FOLLOW_22); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getJobAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDslParser.g:736:5: ( (lv_command_20_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:737:6: (lv_command_20_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:737:6: (lv_command_20_0= ruleCommand )
                    	    // InternalMyDslParser.g:738:7: lv_command_20_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_command_20_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"command",
                    	    								lv_command_20_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslParser.g:757:3: (otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Ifthenelse) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDslParser.g:758:4: otherlv_21= Ifthenelse ( (lv_ifthenelse_22_0= ruleIfThenElse ) ) (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )*
                    {
                    otherlv_21=(Token)match(input,Ifthenelse,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getJobAccess().getIfthenelseKeyword_8_0());
                    			
                    // InternalMyDslParser.g:762:4: ( (lv_ifthenelse_22_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:763:5: (lv_ifthenelse_22_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:763:5: (lv_ifthenelse_22_0= ruleIfThenElse )
                    // InternalMyDslParser.g:764:6: lv_ifthenelse_22_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_ifthenelse_22_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"ifthenelse",
                    							lv_ifthenelse_22_0,
                    							"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:781:4: (otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==IfThenElse) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDslParser.g:782:5: otherlv_23= Comma ( (lv_ifthenelse_24_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_23=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getJobAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDslParser.g:786:5: ( (lv_ifthenelse_24_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:787:6: (lv_ifthenelse_24_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:787:6: (lv_ifthenelse_24_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:788:7: lv_ifthenelse_24_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_ifthenelse_24_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifthenelse",
                    	    								lv_ifthenelse_24_0,
                    	    								"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslParser.g:807:3: (otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Input) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDslParser.g:808:4: otherlv_25= Input ( (lv_input_26_0= ruleArtifact ) ) (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )*
                    {
                    otherlv_25=(Token)match(input,Input,FOLLOW_26); 

                    				newLeafNode(otherlv_25, grammarAccess.getJobAccess().getInputKeyword_9_0());
                    			
                    // InternalMyDslParser.g:812:4: ( (lv_input_26_0= ruleArtifact ) )
                    // InternalMyDslParser.g:813:5: (lv_input_26_0= ruleArtifact )
                    {
                    // InternalMyDslParser.g:813:5: (lv_input_26_0= ruleArtifact )
                    // InternalMyDslParser.g:814:6: lv_input_26_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_input_26_0=ruleArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_26_0,
                    							"org.xtext.example.mydsl.MyDsl.Artifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:831:4: (otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==Artifact) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDslParser.g:832:5: otherlv_27= Comma ( (lv_input_28_0= ruleArtifact ) )
                    	    {
                    	    otherlv_27=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getJobAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDslParser.g:836:5: ( (lv_input_28_0= ruleArtifact ) )
                    	    // InternalMyDslParser.g:837:6: (lv_input_28_0= ruleArtifact )
                    	    {
                    	    // InternalMyDslParser.g:837:6: (lv_input_28_0= ruleArtifact )
                    	    // InternalMyDslParser.g:838:7: lv_input_28_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_input_28_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_28_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslParser.g:857:3: (otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Environment_1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDslParser.g:858:4: otherlv_29= Environment_1 ( (lv_environment_30_0= ruleEnvironment ) ) (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )*
                    {
                    otherlv_29=(Token)match(input,Environment_1,FOLLOW_9); 

                    				newLeafNode(otherlv_29, grammarAccess.getJobAccess().getEnvironmentKeyword_10_0());
                    			
                    // InternalMyDslParser.g:862:4: ( (lv_environment_30_0= ruleEnvironment ) )
                    // InternalMyDslParser.g:863:5: (lv_environment_30_0= ruleEnvironment )
                    {
                    // InternalMyDslParser.g:863:5: (lv_environment_30_0= ruleEnvironment )
                    // InternalMyDslParser.g:864:6: lv_environment_30_0= ruleEnvironment
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_environment_30_0=ruleEnvironment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"environment",
                    							lv_environment_30_0,
                    							"org.xtext.example.mydsl.MyDsl.Environment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:881:4: (otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==Environment) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDslParser.g:882:5: otherlv_31= Comma ( (lv_environment_32_0= ruleEnvironment ) )
                    	    {
                    	    otherlv_31=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getJobAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalMyDslParser.g:886:5: ( (lv_environment_32_0= ruleEnvironment ) )
                    	    // InternalMyDslParser.g:887:6: (lv_environment_32_0= ruleEnvironment )
                    	    {
                    	    // InternalMyDslParser.g:887:6: (lv_environment_32_0= ruleEnvironment )
                    	    // InternalMyDslParser.g:888:7: lv_environment_32_0= ruleEnvironment
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_environment_32_0=ruleEnvironment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environment",
                    	    								lv_environment_32_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Environment");
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
                    break;

            }

            // InternalMyDslParser.g:907:3: (otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Permission_1) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDslParser.g:908:4: otherlv_33= Permission_1 ( (lv_permission_34_0= rulePermission ) ) (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )*
                    {
                    otherlv_33=(Token)match(input,Permission_1,FOLLOW_10); 

                    				newLeafNode(otherlv_33, grammarAccess.getJobAccess().getPermissionKeyword_11_0());
                    			
                    // InternalMyDslParser.g:912:4: ( (lv_permission_34_0= rulePermission ) )
                    // InternalMyDslParser.g:913:5: (lv_permission_34_0= rulePermission )
                    {
                    // InternalMyDslParser.g:913:5: (lv_permission_34_0= rulePermission )
                    // InternalMyDslParser.g:914:6: lv_permission_34_0= rulePermission
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getPermissionPermissionParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_permission_34_0=rulePermission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"permission",
                    							lv_permission_34_0,
                    							"org.xtext.example.mydsl.MyDsl.Permission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:931:4: (otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==Permission) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDslParser.g:932:5: otherlv_35= Comma ( (lv_permission_36_0= rulePermission ) )
                    	    {
                    	    otherlv_35=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getJobAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalMyDslParser.g:936:5: ( (lv_permission_36_0= rulePermission ) )
                    	    // InternalMyDslParser.g:937:6: (lv_permission_36_0= rulePermission )
                    	    {
                    	    // InternalMyDslParser.g:937:6: (lv_permission_36_0= rulePermission )
                    	    // InternalMyDslParser.g:938:7: lv_permission_36_0= rulePermission
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getPermissionPermissionParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_permission_36_0=rulePermission();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"permission",
                    	    								lv_permission_36_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Permission");
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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleEString"
    // InternalMyDslParser.g:961:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDslParser.g:961:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDslParser.g:962:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDslParser.g:968:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:974:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDslParser.g:975:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDslParser.g:975:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDslParser.g:976:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:984:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleTool_Framework"
    // InternalMyDslParser.g:995:1: entryRuleTool_Framework returns [EObject current=null] : iv_ruleTool_Framework= ruleTool_Framework EOF ;
    public final EObject entryRuleTool_Framework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool_Framework = null;


        try {
            // InternalMyDslParser.g:995:55: (iv_ruleTool_Framework= ruleTool_Framework EOF )
            // InternalMyDslParser.g:996:2: iv_ruleTool_Framework= ruleTool_Framework EOF
            {
             newCompositeNode(grammarAccess.getTool_FrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool_Framework=ruleTool_Framework();

            state._fsp--;

             current =iv_ruleTool_Framework; 
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
    // $ANTLR end "entryRuleTool_Framework"


    // $ANTLR start "ruleTool_Framework"
    // InternalMyDslParser.g:1002:1: ruleTool_Framework returns [EObject current=null] : ( () otherlv_1= Tool_Framework (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleTool_Framework() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Name5_3_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1008:2: ( ( () otherlv_1= Tool_Framework (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:1009:2: ( () otherlv_1= Tool_Framework (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:1009:2: ( () otherlv_1= Tool_Framework (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:1010:3: () otherlv_1= Tool_Framework (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:1010:3: ()
            // InternalMyDslParser.g:1011:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTool_FrameworkAccess().getTool_FrameworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Tool_Framework,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTool_FrameworkAccess().getTool_FrameworkKeyword_1());
            		
            // InternalMyDslParser.g:1021:3: (otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Name5) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDslParser.g:1022:4: otherlv_2= Name5 ( (lv_Name5_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name5,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTool_FrameworkAccess().getName5Keyword_2_0());
                    			
                    // InternalMyDslParser.g:1026:4: ( (lv_Name5_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1027:5: (lv_Name5_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1027:5: (lv_Name5_3_0= ruleEString )
                    // InternalMyDslParser.g:1028:6: lv_Name5_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTool_FrameworkAccess().getName5EStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Name5_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTool_FrameworkRule());
                    						}
                    						set(
                    							current,
                    							"Name5",
                    							lv_Name5_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleTool_Framework"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDslParser.g:1050:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDslParser.g:1050:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDslParser.g:1051:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDslParser.g:1057:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= Environment (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Key_3_0 = null;

        AntlrDatatypeRuleToken lv_Value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1063:2: ( ( () otherlv_1= Environment (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:1064:2: ( () otherlv_1= Environment (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:1064:2: ( () otherlv_1= Environment (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:1065:3: () otherlv_1= Environment (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:1065:3: ()
            // InternalMyDslParser.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Environment,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalMyDslParser.g:1076:3: (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Key) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDslParser.g:1077:4: otherlv_2= Key ( (lv_Key_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Key,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getKeyKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1081:4: ( (lv_Key_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1082:5: (lv_Key_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1082:5: (lv_Key_3_0= ruleEString )
                    // InternalMyDslParser.g:1083:6: lv_Key_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Key_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"Key",
                    							lv_Key_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1101:3: (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Value) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDslParser.g:1102:4: otherlv_4= Value ( (lv_Value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Value,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDslParser.g:1106:4: ( (lv_Value_5_0= ruleEString ) )
                    // InternalMyDslParser.g:1107:5: (lv_Value_5_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1107:5: (lv_Value_5_0= ruleEString )
                    // InternalMyDslParser.g:1108:6: lv_Value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRulePermission"
    // InternalMyDslParser.g:1130:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalMyDslParser.g:1130:51: (iv_rulePermission= rulePermission EOF )
            // InternalMyDslParser.g:1131:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // InternalMyDslParser.g:1137:1: rulePermission returns [EObject current=null] : ( () otherlv_1= Permission (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Key_3_0 = null;

        AntlrDatatypeRuleToken lv_Value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1143:2: ( ( () otherlv_1= Permission (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:1144:2: ( () otherlv_1= Permission (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:1144:2: ( () otherlv_1= Permission (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:1145:3: () otherlv_1= Permission (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )? (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:1145:3: ()
            // InternalMyDslParser.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionAccess().getPermissionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Permission,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissionAccess().getPermissionKeyword_1());
            		
            // InternalMyDslParser.g:1156:3: (otherlv_2= Key ( (lv_Key_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Key) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDslParser.g:1157:4: otherlv_2= Key ( (lv_Key_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Key,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPermissionAccess().getKeyKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1161:4: ( (lv_Key_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1162:5: (lv_Key_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1162:5: (lv_Key_3_0= ruleEString )
                    // InternalMyDslParser.g:1163:6: lv_Key_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPermissionAccess().getKeyEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Key_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPermissionRule());
                    						}
                    						set(
                    							current,
                    							"Key",
                    							lv_Key_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1181:3: (otherlv_4= Value ( (lv_Value_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Value) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDslParser.g:1182:4: otherlv_4= Value ( (lv_Value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Value,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPermissionAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDslParser.g:1186:4: ( (lv_Value_5_0= ruleEString ) )
                    // InternalMyDslParser.g:1187:5: (lv_Value_5_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1187:5: (lv_Value_5_0= ruleEString )
                    // InternalMyDslParser.g:1188:6: lv_Value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPermissionAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPermissionRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleParallel"
    // InternalMyDslParser.g:1210:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalMyDslParser.g:1210:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalMyDslParser.g:1211:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
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
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalMyDslParser.g:1217:1: ruleParallel returns [EObject current=null] : ( () otherlv_1= Parallel (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )? ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_job_3_0 = null;

        EObject lv_job_5_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1223:2: ( ( () otherlv_1= Parallel (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )? ) )
            // InternalMyDslParser.g:1224:2: ( () otherlv_1= Parallel (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )? )
            {
            // InternalMyDslParser.g:1224:2: ( () otherlv_1= Parallel (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )? )
            // InternalMyDslParser.g:1225:3: () otherlv_1= Parallel (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )?
            {
            // InternalMyDslParser.g:1225:3: ()
            // InternalMyDslParser.g:1226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParallelAccess().getParallelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Parallel,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParallelAccess().getParallelKeyword_1());
            		
            // InternalMyDslParser.g:1236:3: (otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Job_1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDslParser.g:1237:4: otherlv_2= Job_1 ( (lv_job_3_0= ruleJob ) ) (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )*
                    {
                    otherlv_2=(Token)match(input,Job_1,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getJobKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1241:4: ( (lv_job_3_0= ruleJob ) )
                    // InternalMyDslParser.g:1242:5: (lv_job_3_0= ruleJob )
                    {
                    // InternalMyDslParser.g:1242:5: (lv_job_3_0= ruleJob )
                    // InternalMyDslParser.g:1243:6: lv_job_3_0= ruleJob
                    {

                    						newCompositeNode(grammarAccess.getParallelAccess().getJobJobParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_job_3_0=ruleJob();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallelRule());
                    						}
                    						add(
                    							current,
                    							"job",
                    							lv_job_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Job");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1260:4: (otherlv_4= Comma ( (lv_job_5_0= ruleJob ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==Comma) ) {
                            int LA39_1 = input.LA(2);

                            if ( (LA39_1==Allow_faillure||LA39_1==Job) ) {
                                alt39=1;
                            }


                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1261:5: otherlv_4= Comma ( (lv_job_5_0= ruleJob ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1265:5: ( (lv_job_5_0= ruleJob ) )
                    	    // InternalMyDslParser.g:1266:6: (lv_job_5_0= ruleJob )
                    	    {
                    	    // InternalMyDslParser.g:1266:6: (lv_job_5_0= ruleJob )
                    	    // InternalMyDslParser.g:1267:7: lv_job_5_0= ruleJob
                    	    {

                    	    							newCompositeNode(grammarAccess.getParallelAccess().getJobJobParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_job_5_0=ruleJob();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParallelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"job",
                    	    								lv_job_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Job");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleArtifact"
    // InternalMyDslParser.g:1290:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalMyDslParser.g:1290:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalMyDslParser.g:1291:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalMyDslParser.g:1297:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= Artifact (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Name3_3_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1303:2: ( ( () otherlv_1= Artifact (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:1304:2: ( () otherlv_1= Artifact (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:1304:2: ( () otherlv_1= Artifact (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:1305:3: () otherlv_1= Artifact (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:1305:3: ()
            // InternalMyDslParser.g:1306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Artifact,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalMyDslParser.g:1316:3: (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Name3) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDslParser.g:1317:4: otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name3,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getName3Keyword_2_0());
                    			
                    // InternalMyDslParser.g:1321:4: ( (lv_Name3_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1322:5: (lv_Name3_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1322:5: (lv_Name3_3_0= ruleEString )
                    // InternalMyDslParser.g:1323:6: lv_Name3_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getName3EStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Name3_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"Name3",
                    							lv_Name3_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDslParser.g:1345:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDslParser.g:1345:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDslParser.g:1346:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDslParser.g:1352:1: ruleCommand returns [EObject current=null] : ( () otherlv_1= Command (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )? (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )? (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Description_3_0 = null;

        EObject lv_tool_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1358:2: ( ( () otherlv_1= Command (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )? (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )? (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )? ) )
            // InternalMyDslParser.g:1359:2: ( () otherlv_1= Command (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )? (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )? (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )? )
            {
            // InternalMyDslParser.g:1359:2: ( () otherlv_1= Command (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )? (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )? (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )? )
            // InternalMyDslParser.g:1360:3: () otherlv_1= Command (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )? (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )? (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )?
            {
            // InternalMyDslParser.g:1360:3: ()
            // InternalMyDslParser.g:1361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Command,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
            		
            // InternalMyDslParser.g:1371:3: (otherlv_2= Description ( (lv_Description_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Description) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDslParser.g:1372:4: otherlv_2= Description ( (lv_Description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Description,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1376:4: ( (lv_Description_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1377:5: (lv_Description_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1377:5: (lv_Description_3_0= ruleEString )
                    // InternalMyDslParser.g:1378:6: lv_Description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_Description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"Description",
                    							lv_Description_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1396:3: (otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Tool) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDslParser.g:1397:4: otherlv_4= Tool ( (lv_tool_5_0= ruleTool_Framework ) )
                    {
                    otherlv_4=(Token)match(input,Tool,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getToolKeyword_3_0());
                    			
                    // InternalMyDslParser.g:1401:4: ( (lv_tool_5_0= ruleTool_Framework ) )
                    // InternalMyDslParser.g:1402:5: (lv_tool_5_0= ruleTool_Framework )
                    {
                    // InternalMyDslParser.g:1402:5: (lv_tool_5_0= ruleTool_Framework )
                    // InternalMyDslParser.g:1403:6: lv_tool_5_0= ruleTool_Framework
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getToolTool_FrameworkParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_tool_5_0=ruleTool_Framework();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"tool",
                    							lv_tool_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Tool_Framework");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1421:3: (otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Parameters_1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDslParser.g:1422:4: otherlv_6= Parameters_1 ( (lv_parameters_7_0= ruleParameters ) ) (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )*
                    {
                    otherlv_6=(Token)match(input,Parameters_1,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getParametersKeyword_4_0());
                    			
                    // InternalMyDslParser.g:1426:4: ( (lv_parameters_7_0= ruleParameters ) )
                    // InternalMyDslParser.g:1427:5: (lv_parameters_7_0= ruleParameters )
                    {
                    // InternalMyDslParser.g:1427:5: (lv_parameters_7_0= ruleParameters )
                    // InternalMyDslParser.g:1428:6: lv_parameters_7_0= ruleParameters
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getParametersParametersParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_7_0=ruleParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Parameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1445:4: (otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==Parameters) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1446:5: otherlv_8= Comma ( (lv_parameters_9_0= ruleParameters ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_37); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1450:5: ( (lv_parameters_9_0= ruleParameters ) )
                    	    // InternalMyDslParser.g:1451:6: (lv_parameters_9_0= ruleParameters )
                    	    {
                    	    // InternalMyDslParser.g:1451:6: (lv_parameters_9_0= ruleParameters )
                    	    // InternalMyDslParser.g:1452:7: lv_parameters_9_0= ruleParameters
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandAccess().getParametersParametersParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_9_0=ruleParameters();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Parameters");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalMyDslParser.g:1475:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalMyDslParser.g:1475:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalMyDslParser.g:1476:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalMyDslParser.g:1482:1: ruleIfThenElse returns [EObject current=null] : ( () otherlv_1= IfThenElse (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )? (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )? (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )? (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )? (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_Condition_3_0 = null;

        EObject lv_if_5_0 = null;

        EObject lv_if_7_0 = null;

        EObject lv_else_9_0 = null;

        EObject lv_else_11_0 = null;

        EObject lv_ifelse_13_0 = null;

        EObject lv_ifelse_15_0 = null;

        EObject lv_elseif_17_0 = null;

        EObject lv_elseif_19_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1488:2: ( ( () otherlv_1= IfThenElse (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )? (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )? (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )? (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )? (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )? ) )
            // InternalMyDslParser.g:1489:2: ( () otherlv_1= IfThenElse (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )? (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )? (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )? (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )? (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )? )
            {
            // InternalMyDslParser.g:1489:2: ( () otherlv_1= IfThenElse (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )? (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )? (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )? (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )? (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )? )
            // InternalMyDslParser.g:1490:3: () otherlv_1= IfThenElse (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )? (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )? (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )? (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )? (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )?
            {
            // InternalMyDslParser.g:1490:3: ()
            // InternalMyDslParser.g:1491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfThenElseAccess().getIfThenElseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,IfThenElse,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_1());
            		
            // InternalMyDslParser.g:1501:3: (otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Condition) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDslParser.g:1502:4: otherlv_2= Condition ( (lv_Condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Condition,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getConditionKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1506:4: ( (lv_Condition_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1507:5: (lv_Condition_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1507:5: (lv_Condition_3_0= ruleEString )
                    // InternalMyDslParser.g:1508:6: lv_Condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_Condition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						set(
                    							current,
                    							"Condition",
                    							lv_Condition_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1526:3: (otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==If) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDslParser.g:1527:4: otherlv_4= If ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )*
                    {
                    otherlv_4=(Token)match(input,If,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getIfKeyword_3_0());
                    			
                    // InternalMyDslParser.g:1531:4: ( (lv_if_5_0= ruleCommand ) )
                    // InternalMyDslParser.g:1532:5: (lv_if_5_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1532:5: (lv_if_5_0= ruleCommand )
                    // InternalMyDslParser.g:1533:6: lv_if_5_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_if_5_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"if",
                    							lv_if_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1550:4: (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==Comma) ) {
                            int LA47_2 = input.LA(2);

                            if ( (LA47_2==Command) ) {
                                alt47=1;
                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1551:5: otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_22); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1555:5: ( (lv_if_7_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1556:6: (lv_if_7_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1556:6: (lv_if_7_0= ruleCommand )
                    	    // InternalMyDslParser.g:1557:7: lv_if_7_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_if_7_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"if",
                    	    								lv_if_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Command");
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

            // InternalMyDslParser.g:1576:3: (otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Else) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDslParser.g:1577:4: otherlv_8= Else ( (lv_else_9_0= ruleCommand ) ) (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )*
                    {
                    otherlv_8=(Token)match(input,Else,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfThenElseAccess().getElseKeyword_4_0());
                    			
                    // InternalMyDslParser.g:1581:4: ( (lv_else_9_0= ruleCommand ) )
                    // InternalMyDslParser.g:1582:5: (lv_else_9_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1582:5: (lv_else_9_0= ruleCommand )
                    // InternalMyDslParser.g:1583:6: lv_else_9_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_else_9_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_9_0,
                    							"org.xtext.example.mydsl.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1600:4: (otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Comma) ) {
                            int LA49_2 = input.LA(2);

                            if ( (LA49_2==Command) ) {
                                alt49=1;
                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1601:5: otherlv_10= Comma ( (lv_else_11_0= ruleCommand ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_22); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getIfThenElseAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1605:5: ( (lv_else_11_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1606:6: (lv_else_11_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1606:6: (lv_else_11_0= ruleCommand )
                    	    // InternalMyDslParser.g:1607:7: lv_else_11_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_else_11_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else",
                    	    								lv_else_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Command");
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

            // InternalMyDslParser.g:1626:3: (otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Ifelse) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDslParser.g:1627:4: otherlv_12= Ifelse ( (lv_ifelse_13_0= ruleIfThenElse ) ) (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )*
                    {
                    otherlv_12=(Token)match(input,Ifelse,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfThenElseAccess().getIfelseKeyword_5_0());
                    			
                    // InternalMyDslParser.g:1631:4: ( (lv_ifelse_13_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1632:5: (lv_ifelse_13_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1632:5: (lv_ifelse_13_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1633:6: lv_ifelse_13_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_ifelse_13_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"ifelse",
                    							lv_ifelse_13_0,
                    							"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1650:4: (otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Comma) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1651:5: otherlv_14= Comma ( (lv_ifelse_15_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getIfThenElseAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1655:5: ( (lv_ifelse_15_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1656:6: (lv_ifelse_15_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1656:6: (lv_ifelse_15_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1657:7: lv_ifelse_15_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_ifelse_15_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifelse",
                    	    								lv_ifelse_15_0,
                    	    								"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDslParser.g:1676:3: (otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Elseif) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDslParser.g:1677:4: otherlv_16= Elseif ( (lv_elseif_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )*
                    {
                    otherlv_16=(Token)match(input,Elseif,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getIfThenElseAccess().getElseifKeyword_6_0());
                    			
                    // InternalMyDslParser.g:1681:4: ( (lv_elseif_17_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1682:5: (lv_elseif_17_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1682:5: (lv_elseif_17_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1683:6: lv_elseif_17_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_elseif_17_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"elseif",
                    							lv_elseif_17_0,
                    							"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1700:4: (otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Comma) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1701:5: otherlv_18= Comma ( (lv_elseif_19_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getIfThenElseAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDslParser.g:1705:5: ( (lv_elseif_19_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1706:6: (lv_elseif_19_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1706:6: (lv_elseif_19_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1707:7: lv_elseif_19_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elseif_19_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elseif",
                    	    								lv_elseif_19_0,
                    	    								"org.xtext.example.mydsl.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
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
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleParameters"
    // InternalMyDslParser.g:1730:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalMyDslParser.g:1730:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalMyDslParser.g:1731:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalMyDslParser.g:1737:1: ruleParameters returns [EObject current=null] : ( () otherlv_1= Parameters (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Parameter_3_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1743:2: ( ( () otherlv_1= Parameters (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )? ) )
            // InternalMyDslParser.g:1744:2: ( () otherlv_1= Parameters (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )? )
            {
            // InternalMyDslParser.g:1744:2: ( () otherlv_1= Parameters (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )? )
            // InternalMyDslParser.g:1745:3: () otherlv_1= Parameters (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )?
            {
            // InternalMyDslParser.g:1745:3: ()
            // InternalMyDslParser.g:1746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersAccess().getParametersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Parameters,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getParametersKeyword_1());
            		
            // InternalMyDslParser.g:1756:3: (otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Parameter) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDslParser.g:1757:4: otherlv_2= Parameter ( (lv_Parameter_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Parameter,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getParameterKeyword_2_0());
                    			
                    // InternalMyDslParser.g:1761:4: ( (lv_Parameter_3_0= ruleEString ) )
                    // InternalMyDslParser.g:1762:5: (lv_Parameter_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1762:5: (lv_Parameter_3_0= ruleEString )
                    // InternalMyDslParser.g:1763:6: lv_Parameter_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParametersAccess().getParameterEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Parameter_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametersRule());
                    						}
                    						set(
                    							current,
                    							"Parameter",
                    							lv_Parameter_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleParameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002120001040032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000404000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000020C8051242L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002048051242L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002048051042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002008051042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001002008051002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001002000051002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001002000041002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000041002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000040002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000020402L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000020002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000204030080002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000204030000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001004030000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000030000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000010000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000100002L});

}