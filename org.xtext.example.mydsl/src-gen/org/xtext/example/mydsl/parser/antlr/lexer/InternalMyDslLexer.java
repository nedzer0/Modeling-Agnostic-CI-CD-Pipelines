package org.xtext.example.mydsl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDslLexer.g"; }

    // $ANTLR start "Pipeline_tool_framework"
    public final void mPipeline_tool_framework() throws RecognitionException {
        try {
            int _type = Pipeline_tool_framework;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:14:25: ( 'pipeline_tool_framework' )
            // InternalMyDslLexer.g:14:27: 'pipeline_tool_framework'
            {
            match("pipeline_tool_framework"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline_tool_framework"

    // $ANTLR start "Pipeline_environment"
    public final void mPipeline_environment() throws RecognitionException {
        try {
            int _type = Pipeline_environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:16:22: ( 'pipeline_environment' )
            // InternalMyDslLexer.g:16:24: 'pipeline_environment'
            {
            match("pipeline_environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline_environment"

    // $ANTLR start "Tool_framework_job"
    public final void mTool_framework_job() throws RecognitionException {
        try {
            int _type = Tool_framework_job;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:18:20: ( 'tool_framework_job' )
            // InternalMyDslLexer.g:18:22: 'tool_framework_job'
            {
            match("tool_framework_job"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool_framework_job"

    // $ANTLR start "Allow_faillure"
    public final void mAllow_faillure() throws RecognitionException {
        try {
            int _type = Allow_faillure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:20:16: ( 'Allow_faillure' )
            // InternalMyDslLexer.g:20:18: 'Allow_faillure'
            {
            match("Allow_faillure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Allow_faillure"

    // $ANTLR start "Tool_Framework"
    public final void mTool_Framework() throws RecognitionException {
        try {
            int _type = Tool_Framework;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:22:16: ( 'Tool_Framework' )
            // InternalMyDslLexer.g:22:18: 'Tool_Framework'
            {
            match("Tool_Framework"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool_Framework"

    // $ANTLR start "Description1"
    public final void mDescription1() throws RecognitionException {
        try {
            int _type = Description1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:24:14: ( 'Description1' )
            // InternalMyDslLexer.g:24:16: 'Description1'
            {
            match("Description1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description1"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:26:13: ( 'Description' )
            // InternalMyDslLexer.g:26:15: 'Description'
            {
            match("Description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:28:13: ( 'Environment' )
            // InternalMyDslLexer.g:28:15: 'Environment'
            {
            match("Environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment"

    // $ANTLR start "Environment_1"
    public final void mEnvironment_1() throws RecognitionException {
        try {
            int _type = Environment_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:30:15: ( 'environment' )
            // InternalMyDslLexer.g:30:17: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment_1"

    // $ANTLR start "IfThenElse"
    public final void mIfThenElse() throws RecognitionException {
        try {
            int _type = IfThenElse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:32:12: ( 'IfThenElse' )
            // InternalMyDslLexer.g:32:14: 'IfThenElse'
            {
            match("IfThenElse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IfThenElse"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:34:12: ( 'Parameters' )
            // InternalMyDslLexer.g:34:14: 'Parameters'
            {
            match("Parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Permission"
    public final void mPermission() throws RecognitionException {
        try {
            int _type = Permission;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:36:12: ( 'Permission' )
            // InternalMyDslLexer.g:36:14: 'Permission'
            {
            match("Permission"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Permission"

    // $ANTLR start "Ifthenelse"
    public final void mIfthenelse() throws RecognitionException {
        try {
            int _type = Ifthenelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:38:12: ( 'ifthenelse' )
            // InternalMyDslLexer.g:38:14: 'ifthenelse'
            {
            match("ifthenelse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ifthenelse"

    // $ANTLR start "Parameters_1"
    public final void mParameters_1() throws RecognitionException {
        try {
            int _type = Parameters_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:40:14: ( 'parameters' )
            // InternalMyDslLexer.g:40:16: 'parameters'
            {
            match("parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters_1"

    // $ANTLR start "Permission_1"
    public final void mPermission_1() throws RecognitionException {
        try {
            int _type = Permission_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:42:14: ( 'permission' )
            // InternalMyDslLexer.g:42:16: 'permission'
            {
            match("permission"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Permission_1"

    // $ANTLR start "Condition"
    public final void mCondition() throws RecognitionException {
        try {
            int _type = Condition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:44:11: ( 'Condition' )
            // InternalMyDslLexer.g:44:13: 'Condition'
            {
            match("Condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Condition"

    // $ANTLR start "Parameter"
    public final void mParameter() throws RecognitionException {
        try {
            int _type = Parameter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:46:11: ( 'Parameter' )
            // InternalMyDslLexer.g:46:13: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameter"

    // $ANTLR start "Artifact"
    public final void mArtifact() throws RecognitionException {
        try {
            int _type = Artifact;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:48:10: ( 'Artifact' )
            // InternalMyDslLexer.g:48:12: 'Artifact'
            {
            match("Artifact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Artifact"

    // $ANTLR start "PIPELINE"
    public final void mPIPELINE() throws RecognitionException {
        try {
            int _type = PIPELINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:50:10: ( 'PIPELINE' )
            // InternalMyDslLexer.g:50:12: 'PIPELINE'
            {
            match("PIPELINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPELINE"

    // $ANTLR start "Parallel"
    public final void mParallel() throws RecognitionException {
        try {
            int _type = Parallel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:52:10: ( 'Parallel' )
            // InternalMyDslLexer.g:52:12: 'Parallel'
            {
            match("Parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parallel"

    // $ANTLR start "Parallel_1"
    public final void mParallel_1() throws RecognitionException {
        try {
            int _type = Parallel_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:54:12: ( 'parallel' )
            // InternalMyDslLexer.g:54:14: 'parallel'
            {
            match("parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parallel_1"

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:56:9: ( 'Command' )
            // InternalMyDslLexer.g:56:11: 'Command'
            {
            match("Command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command"

    // $ANTLR start "Trigger"
    public final void mTrigger() throws RecognitionException {
        try {
            int _type = Trigger;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:58:9: ( 'Trigger' )
            // InternalMyDslLexer.g:58:11: 'Trigger'
            {
            match("Trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Trigger"

    // $ANTLR start "Command_1"
    public final void mCommand_1() throws RecognitionException {
        try {
            int _type = Command_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:60:11: ( 'command' )
            // InternalMyDslLexer.g:60:13: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command_1"

    // $ANTLR start "Elseif"
    public final void mElseif() throws RecognitionException {
        try {
            int _type = Elseif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:62:8: ( 'elseif' )
            // InternalMyDslLexer.g:62:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elseif"

    // $ANTLR start "Ifelse"
    public final void mIfelse() throws RecognitionException {
        try {
            int _type = Ifelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:64:8: ( 'ifelse' )
            // InternalMyDslLexer.g:64:10: 'ifelse'
            {
            match("ifelse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ifelse"

    // $ANTLR start "Output"
    public final void mOutput() throws RecognitionException {
        try {
            int _type = Output;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:66:8: ( 'output' )
            // InternalMyDslLexer.g:66:10: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Output"

    // $ANTLR start "Name1"
    public final void mName1() throws RecognitionException {
        try {
            int _type = Name1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:68:7: ( 'Name1' )
            // InternalMyDslLexer.g:68:9: 'Name1'
            {
            match("Name1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name1"

    // $ANTLR start "Name3"
    public final void mName3() throws RecognitionException {
        try {
            int _type = Name3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:70:7: ( 'Name3' )
            // InternalMyDslLexer.g:70:9: 'Name3'
            {
            match("Name3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name3"

    // $ANTLR start "Name5"
    public final void mName5() throws RecognitionException {
        try {
            int _type = Name5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:72:7: ( 'Name5' )
            // InternalMyDslLexer.g:72:9: 'Name5'
            {
            match("Name5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name5"

    // $ANTLR start "Timer"
    public final void mTimer() throws RecognitionException {
        try {
            int _type = Timer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:74:7: ( 'Timer' )
            // InternalMyDslLexer.g:74:9: 'Timer'
            {
            match("Timer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timer"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:76:7: ( 'Value' )
            // InternalMyDslLexer.g:76:9: 'Value'
            {
            match("Value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:78:7: ( 'false' )
            // InternalMyDslLexer.g:78:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Input"
    public final void mInput() throws RecognitionException {
        try {
            int _type = Input;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:80:7: ( 'input' )
            // InternalMyDslLexer.g:80:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Input"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:82:6: ( 'else' )
            // InternalMyDslLexer.g:82:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Tool"
    public final void mTool() throws RecognitionException {
        try {
            int _type = Tool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:84:6: ( 'tool' )
            // InternalMyDslLexer.g:84:8: 'tool'
            {
            match("tool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:86:6: ( 'true' )
            // InternalMyDslLexer.g:86:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:88:6: ( 'when' )
            // InternalMyDslLexer.g:88:8: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "Job"
    public final void mJob() throws RecognitionException {
        try {
            int _type = Job;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:90:5: ( 'Job' )
            // InternalMyDslLexer.g:90:7: 'Job'
            {
            match("Job"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Job"

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:92:5: ( 'Key' )
            // InternalMyDslLexer.g:92:7: 'Key'
            {
            match("Key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Job_1"
    public final void mJob_1() throws RecognitionException {
        try {
            int _type = Job_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:94:7: ( 'job' )
            // InternalMyDslLexer.g:94:9: 'job'
            {
            match("job"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Job_1"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:96:4: ( 'if' )
            // InternalMyDslLexer.g:96:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:98:17: ( '(' )
            // InternalMyDslLexer.g:98:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:100:18: ( ')' )
            // InternalMyDslLexer.g:100:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:102:7: ( ',' )
            // InternalMyDslLexer.g:102:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:104:11: ( ( 'Name:' | 'name:' | '- name:' | '- name : ' | '- id:' ) )
            // InternalMyDslLexer.g:104:13: ( 'Name:' | 'name:' | '- name:' | '- name : ' | '- id:' )
            {
            // InternalMyDslLexer.g:104:13: ( 'Name:' | 'name:' | '- name:' | '- name : ' | '- id:' )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDslLexer.g:104:14: 'Name:'
                    {
                    match("Name:"); 


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:104:22: 'name:'
                    {
                    match("name:"); 


                    }
                    break;
                case 3 :
                    // InternalMyDslLexer.g:104:30: '- name:'
                    {
                    match("- name:"); 


                    }
                    break;
                case 4 :
                    // InternalMyDslLexer.g:104:40: '- name : '
                    {
                    match("- name : "); 


                    }
                    break;
                case 5 :
                    // InternalMyDslLexer.g:104:52: '- id:'
                    {
                    match("- id:"); 


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
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:106:14: ( ( '\\r' )? '\\n' )
            // InternalMyDslLexer.g:106:16: ( '\\r' )? '\\n'
            {
            // InternalMyDslLexer.g:106:16: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDslLexer.g:106:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:108:21: ()
            // InternalMyDslLexer.g:108:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:110:19: ()
            // InternalMyDslLexer.g:110:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:112:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDslLexer.g:112:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDslLexer.g:112:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDslLexer.g:112:11: '^'
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

            // InternalMyDslLexer.g:112:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDslLexer.g:
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
            	    break loop4;
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
            // InternalMyDslLexer.g:114:10: ( ( '0' .. '9' )+ )
            // InternalMyDslLexer.g:114:12: ( '0' .. '9' )+
            {
            // InternalMyDslLexer.g:114:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDslLexer.g:114:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalMyDslLexer.g:116:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDslLexer.g:116:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDslLexer.g:116:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDslLexer.g:116:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDslLexer.g:116:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:116:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:116:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:116:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDslLexer.g:116:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:116:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:116:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalMyDslLexer.g:118:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDslLexer.g:118:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDslLexer.g:118:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDslLexer.g:118:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:120:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDslLexer.g:120:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDslLexer.g:120:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDslLexer.g:120:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalMyDslLexer.g:120:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDslLexer.g:120:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDslLexer.g:120:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDslLexer.g:120:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:122:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDslLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDslLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDslLexer.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalMyDslLexer.g:124:16: ( . )
            // InternalMyDslLexer.g:124:18: .
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
        // InternalMyDslLexer.g:1:8: ( Pipeline_tool_framework | Pipeline_environment | Tool_framework_job | Allow_faillure | Tool_Framework | Description1 | Description | Environment | Environment_1 | IfThenElse | Parameters | Permission | Ifthenelse | Parameters_1 | Permission_1 | Condition | Parameter | Artifact | PIPELINE | Parallel | Parallel_1 | Command | Trigger | Command_1 | Elseif | Ifelse | Output | Name1 | Name3 | Name5 | Timer | Value | False | Input | Else | Tool | True | When | Job | Key | Job_1 | If | LeftParenthesis | RightParenthesis | Comma | RULE_NAME | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=54;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDslLexer.g:1:10: Pipeline_tool_framework
                {
                mPipeline_tool_framework(); 

                }
                break;
            case 2 :
                // InternalMyDslLexer.g:1:34: Pipeline_environment
                {
                mPipeline_environment(); 

                }
                break;
            case 3 :
                // InternalMyDslLexer.g:1:55: Tool_framework_job
                {
                mTool_framework_job(); 

                }
                break;
            case 4 :
                // InternalMyDslLexer.g:1:74: Allow_faillure
                {
                mAllow_faillure(); 

                }
                break;
            case 5 :
                // InternalMyDslLexer.g:1:89: Tool_Framework
                {
                mTool_Framework(); 

                }
                break;
            case 6 :
                // InternalMyDslLexer.g:1:104: Description1
                {
                mDescription1(); 

                }
                break;
            case 7 :
                // InternalMyDslLexer.g:1:117: Description
                {
                mDescription(); 

                }
                break;
            case 8 :
                // InternalMyDslLexer.g:1:129: Environment
                {
                mEnvironment(); 

                }
                break;
            case 9 :
                // InternalMyDslLexer.g:1:141: Environment_1
                {
                mEnvironment_1(); 

                }
                break;
            case 10 :
                // InternalMyDslLexer.g:1:155: IfThenElse
                {
                mIfThenElse(); 

                }
                break;
            case 11 :
                // InternalMyDslLexer.g:1:166: Parameters
                {
                mParameters(); 

                }
                break;
            case 12 :
                // InternalMyDslLexer.g:1:177: Permission
                {
                mPermission(); 

                }
                break;
            case 13 :
                // InternalMyDslLexer.g:1:188: Ifthenelse
                {
                mIfthenelse(); 

                }
                break;
            case 14 :
                // InternalMyDslLexer.g:1:199: Parameters_1
                {
                mParameters_1(); 

                }
                break;
            case 15 :
                // InternalMyDslLexer.g:1:212: Permission_1
                {
                mPermission_1(); 

                }
                break;
            case 16 :
                // InternalMyDslLexer.g:1:225: Condition
                {
                mCondition(); 

                }
                break;
            case 17 :
                // InternalMyDslLexer.g:1:235: Parameter
                {
                mParameter(); 

                }
                break;
            case 18 :
                // InternalMyDslLexer.g:1:245: Artifact
                {
                mArtifact(); 

                }
                break;
            case 19 :
                // InternalMyDslLexer.g:1:254: PIPELINE
                {
                mPIPELINE(); 

                }
                break;
            case 20 :
                // InternalMyDslLexer.g:1:263: Parallel
                {
                mParallel(); 

                }
                break;
            case 21 :
                // InternalMyDslLexer.g:1:272: Parallel_1
                {
                mParallel_1(); 

                }
                break;
            case 22 :
                // InternalMyDslLexer.g:1:283: Command
                {
                mCommand(); 

                }
                break;
            case 23 :
                // InternalMyDslLexer.g:1:291: Trigger
                {
                mTrigger(); 

                }
                break;
            case 24 :
                // InternalMyDslLexer.g:1:299: Command_1
                {
                mCommand_1(); 

                }
                break;
            case 25 :
                // InternalMyDslLexer.g:1:309: Elseif
                {
                mElseif(); 

                }
                break;
            case 26 :
                // InternalMyDslLexer.g:1:316: Ifelse
                {
                mIfelse(); 

                }
                break;
            case 27 :
                // InternalMyDslLexer.g:1:323: Output
                {
                mOutput(); 

                }
                break;
            case 28 :
                // InternalMyDslLexer.g:1:330: Name1
                {
                mName1(); 

                }
                break;
            case 29 :
                // InternalMyDslLexer.g:1:336: Name3
                {
                mName3(); 

                }
                break;
            case 30 :
                // InternalMyDslLexer.g:1:342: Name5
                {
                mName5(); 

                }
                break;
            case 31 :
                // InternalMyDslLexer.g:1:348: Timer
                {
                mTimer(); 

                }
                break;
            case 32 :
                // InternalMyDslLexer.g:1:354: Value
                {
                mValue(); 

                }
                break;
            case 33 :
                // InternalMyDslLexer.g:1:360: False
                {
                mFalse(); 

                }
                break;
            case 34 :
                // InternalMyDslLexer.g:1:366: Input
                {
                mInput(); 

                }
                break;
            case 35 :
                // InternalMyDslLexer.g:1:372: Else
                {
                mElse(); 

                }
                break;
            case 36 :
                // InternalMyDslLexer.g:1:377: Tool
                {
                mTool(); 

                }
                break;
            case 37 :
                // InternalMyDslLexer.g:1:382: True
                {
                mTrue(); 

                }
                break;
            case 38 :
                // InternalMyDslLexer.g:1:387: When
                {
                mWhen(); 

                }
                break;
            case 39 :
                // InternalMyDslLexer.g:1:392: Job
                {
                mJob(); 

                }
                break;
            case 40 :
                // InternalMyDslLexer.g:1:396: Key
                {
                mKey(); 

                }
                break;
            case 41 :
                // InternalMyDslLexer.g:1:400: Job_1
                {
                mJob_1(); 

                }
                break;
            case 42 :
                // InternalMyDslLexer.g:1:406: If
                {
                mIf(); 

                }
                break;
            case 43 :
                // InternalMyDslLexer.g:1:409: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 44 :
                // InternalMyDslLexer.g:1:425: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 45 :
                // InternalMyDslLexer.g:1:442: Comma
                {
                mComma(); 

                }
                break;
            case 46 :
                // InternalMyDslLexer.g:1:448: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 47 :
                // InternalMyDslLexer.g:1:458: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 48 :
                // InternalMyDslLexer.g:1:471: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // InternalMyDslLexer.g:1:479: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // InternalMyDslLexer.g:1:488: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // InternalMyDslLexer.g:1:500: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // InternalMyDslLexer.g:1:516: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // InternalMyDslLexer.g:1:532: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalMyDslLexer.g:1:540: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\55\2\uffff\1\40\1\151\1\141\1\uffff\1\155\1\145\1\40\2\uffff";
    static final String DFA1_maxS =
        "\1\156\2\uffff\1\40\1\156\1\141\1\uffff\1\155\1\145\1\72\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\5\3\uffff\1\3\1\4";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\40\uffff\1\1\37\uffff\1\2",
            "",
            "",
            "\1\4",
            "\1\6\4\uffff\1\5",
            "\1\7",
            "",
            "\1\10",
            "\1\11",
            "\1\13\31\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "104:13: ( 'Name:' | 'name:' | '- name:' | '- name : ' | '- id:' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\24\47\3\uffff\1\47\1\43\1\110\1\112\1\43\2\uffff\3\43\2\uffff\3\47\1\uffff\17\47\1\143\13\47\3\uffff\1\47\2\uffff\1\112\5\uffff\24\47\1\uffff\11\47\1\u008e\1\u008f\1\u0090\4\47\1\u0097\1\u0098\10\47\1\u00a2\16\47\1\u00b4\3\uffff\6\47\2\uffff\4\47\1\u00be\4\47\1\uffff\7\47\1\u00ca\4\47\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\uffff\11\47\1\uffff\3\47\1\u00e0\6\47\1\u00e7\1\uffff\3\47\1\u00eb\5\uffff\10\47\1\u00f4\3\47\1\uffff\6\47\1\uffff\1\47\1\u00ff\1\u0100\1\uffff\2\47\1\u0103\3\47\1\u0107\1\47\1\uffff\5\47\1\u010e\1\47\1\u0110\2\47\2\uffff\2\47\1\uffff\3\47\1\uffff\5\47\1\u011f\1\uffff\1\47\1\uffff\1\47\1\u0122\2\47\1\u0125\1\u0126\6\47\1\u012d\1\u012e\1\uffff\1\u012f\1\u0130\1\uffff\2\47\2\uffff\3\47\1\u0137\1\u0138\1\u0139\4\uffff\5\47\1\u013f\3\uffff\5\47\1\uffff\3\47\1\u0148\1\u0149\3\47\2\uffff\10\47\1\u0155\2\47\1\uffff\1\47\1\u0159\1\47\1\uffff\1\47\1\u015c\1\uffff";
    static final String DFA14_eofS =
        "\u015d\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\157\1\154\1\151\1\145\1\156\1\154\1\146\1\111\1\146\2\157\1\165\3\141\1\150\1\157\1\145\1\157\3\uffff\1\141\1\40\1\12\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\160\2\162\1\uffff\1\157\1\165\1\154\1\164\1\157\1\151\1\155\1\163\2\166\1\163\1\124\2\162\1\120\1\60\1\160\2\155\1\164\1\155\2\154\1\145\1\142\1\171\1\142\3\uffff\1\155\2\uffff\1\11\5\uffff\1\145\1\141\1\155\1\154\1\145\1\157\1\151\1\154\1\147\1\145\1\143\2\151\1\145\1\150\1\141\1\155\1\105\1\150\1\154\1\uffff\1\165\1\144\2\155\1\160\1\145\1\165\1\163\1\156\3\60\1\145\2\154\1\151\2\60\1\167\1\146\1\137\1\147\4\162\1\60\1\145\1\154\1\151\1\114\1\145\1\163\1\164\1\151\2\141\1\165\1\61\2\145\1\60\3\uffff\1\72\1\151\1\145\1\154\1\163\1\146\2\uffff\1\137\1\141\1\106\1\145\1\60\1\151\2\157\1\146\1\uffff\1\156\1\145\1\154\1\163\1\111\1\156\1\145\1\60\1\164\2\156\1\164\5\60\1\uffff\1\156\1\164\1\145\1\163\1\162\1\146\1\143\2\162\1\uffff\1\160\2\156\1\60\1\105\1\164\1\145\1\163\1\116\1\145\1\60\1\uffff\1\151\2\144\1\60\5\uffff\2\145\1\154\1\151\2\141\1\164\1\141\1\60\1\164\2\155\1\uffff\1\154\1\145\1\154\1\151\1\105\1\154\1\uffff\1\157\2\60\1\uffff\1\137\1\162\1\60\1\157\1\155\1\151\1\60\1\155\1\uffff\1\151\2\145\1\163\1\162\1\60\1\157\1\60\1\163\1\156\2\uffff\1\145\1\163\1\uffff\1\156\1\145\1\154\1\uffff\1\145\1\157\2\156\1\145\1\60\1\uffff\1\156\1\uffff\1\145\1\60\1\157\1\156\2\60\1\167\1\154\1\167\1\156\2\164\2\60\1\uffff\2\60\1\uffff\1\157\1\166\2\uffff\1\157\1\165\1\157\3\60\4\uffff\1\154\1\151\3\162\1\60\3\uffff\1\137\1\162\1\153\1\145\1\153\1\uffff\1\146\1\157\1\137\2\60\1\162\1\156\1\152\2\uffff\1\141\1\155\1\157\1\155\1\145\1\142\1\145\1\156\1\60\1\167\1\164\1\uffff\1\157\1\60\1\162\1\uffff\1\153\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\151\3\162\1\145\2\156\1\146\1\145\1\156\2\157\1\165\3\141\1\150\1\157\1\145\1\157\3\uffff\1\141\1\40\1\12\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\2\162\1\uffff\1\157\1\165\1\154\1\164\1\157\1\151\1\155\1\163\2\166\1\163\1\124\2\162\1\120\1\172\1\160\1\156\1\155\1\164\1\155\2\154\1\145\1\142\1\171\1\142\3\uffff\1\155\2\uffff\1\40\5\uffff\1\145\1\141\1\155\1\154\1\145\1\157\1\151\1\154\1\147\1\145\1\143\2\151\1\145\1\150\1\141\1\155\1\105\1\150\1\154\1\uffff\1\165\1\144\2\155\1\160\1\145\1\165\1\163\1\156\3\172\1\145\1\154\1\155\1\151\2\172\1\167\1\146\1\137\1\147\4\162\1\172\1\145\1\155\1\151\1\114\1\145\1\163\1\164\1\151\2\141\1\165\1\72\2\145\1\172\3\uffff\1\72\1\151\1\145\1\154\1\163\1\146\2\uffff\1\137\1\141\1\106\1\145\1\172\1\151\2\157\1\146\1\uffff\1\156\1\145\1\154\1\163\1\111\1\156\1\145\1\172\1\164\2\156\1\164\5\172\1\uffff\1\156\1\164\1\145\1\163\1\162\1\146\1\143\2\162\1\uffff\1\160\2\156\1\172\1\105\1\164\1\145\1\163\1\116\1\145\1\172\1\uffff\1\151\2\144\1\172\5\uffff\2\145\1\154\1\151\2\141\1\164\1\141\1\172\1\164\2\155\1\uffff\1\154\1\145\1\154\1\151\1\105\1\154\1\uffff\1\157\2\172\1\uffff\1\137\1\162\1\172\1\157\1\155\1\151\1\172\1\155\1\uffff\1\151\2\145\1\163\1\162\1\172\1\157\1\172\1\163\1\156\2\uffff\1\164\1\163\1\uffff\1\156\1\145\1\154\1\uffff\1\145\1\157\2\156\1\145\1\172\1\uffff\1\156\1\uffff\1\145\1\172\1\157\1\156\2\172\1\167\1\154\1\167\1\156\2\164\2\172\1\uffff\2\172\1\uffff\1\157\1\166\2\uffff\1\157\1\165\1\157\3\172\4\uffff\1\154\1\151\3\162\1\172\3\uffff\1\137\1\162\1\153\1\145\1\153\1\uffff\1\146\1\157\1\137\2\172\1\162\1\156\1\152\2\uffff\1\141\1\155\1\157\1\155\1\145\1\142\1\145\1\156\1\172\1\167\1\164\1\uffff\1\157\1\172\1\162\1\uffff\1\153\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\25\uffff\1\53\1\54\1\55\5\uffff\1\60\1\61\3\uffff\1\65\1\66\3\uffff\1\60\33\uffff\1\53\1\54\1\55\1\uffff\1\56\1\65\1\uffff\1\57\1\61\1\62\1\63\1\64\24\uffff\1\52\52\uffff\1\47\1\50\1\51\6\uffff\1\44\1\45\11\uffff\1\43\21\uffff\1\46\11\uffff\1\37\13\uffff\1\42\4\uffff\1\34\1\35\1\36\1\40\1\41\14\uffff\1\31\6\uffff\1\32\3\uffff\1\33\10\uffff\1\27\12\uffff\1\26\1\30\2\uffff\1\25\3\uffff\1\22\6\uffff\1\24\1\uffff\1\23\16\uffff\1\21\2\uffff\1\20\2\uffff\1\16\1\17\6\uffff\1\12\1\13\1\14\1\15\6\uffff\1\7\1\10\1\11\5\uffff\1\6\10\uffff\1\4\1\5\13\uffff\1\3\3\uffff\1\2\2\uffff\1\1";
    static final String DFA14_specialS =
        "\1\1\36\uffff\1\0\1\2\u013c\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\43\1\42\1\33\2\43\1\32\22\43\1\42\1\43\1\37\4\43\1\40\1\25\1\26\2\43\1\27\1\31\1\43\1\41\12\36\7\43\1\3\1\35\1\13\1\5\1\6\3\35\1\10\1\22\1\23\2\35\1\16\1\35\1\11\3\35\1\4\1\35\1\17\4\35\3\43\1\34\1\35\1\43\2\35\1\14\1\35\1\7\1\20\2\35\1\12\1\24\3\35\1\30\1\15\1\1\3\35\1\2\2\35\1\21\3\35\uff85\43",
            "\1\45\3\uffff\1\46\3\uffff\1\44",
            "\1\50\2\uffff\1\51",
            "\1\52\5\uffff\1\53",
            "\1\56\5\uffff\1\54\2\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\62\1\uffff\1\61",
            "\1\63",
            "\1\66\27\uffff\1\64\3\uffff\1\65",
            "\1\67\7\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\111",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\114",
            "\0\114",
            "\1\115\4\uffff\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\142\16\47\1\141\6\47",
            "\1\144",
            "\1\146\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "\1\160",
            "",
            "",
            "\2\110\2\uffff\1\110\22\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\1\u0093",
            "\1\u0095",
            "\12\47\7\uffff\32\47\4\uffff\1\u0096\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00a1\21\47",
            "\1\u00a3",
            "\1\u00a5\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\1\uffff\1\u00b0\1\uffff\1\u00b1\4\uffff\1\107",
            "\1\u00b2",
            "\1\u00b3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\107",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0101",
            "\1\u0102",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u010f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "\1\u0114\16\uffff\1\u0113",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u011e\7\47",
            "",
            "\1\u0120",
            "",
            "\1\u0121",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0123",
            "\1\u0124",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0131",
            "\1\u0132",
            "",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\47\1\u0136\10\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015a",
            "",
            "\1\u015b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Pipeline_tool_framework | Pipeline_environment | Tool_framework_job | Allow_faillure | Tool_Framework | Description1 | Description | Environment | Environment_1 | IfThenElse | Parameters | Permission | Ifthenelse | Parameters_1 | Permission_1 | Condition | Parameter | Artifact | PIPELINE | Parallel | Parallel_1 | Command | Trigger | Command_1 | Elseif | Ifelse | Output | Name1 | Name3 | Name5 | Timer | Value | False | Input | Else | Tool | True | When | Job | Key | Job_1 | If | LeftParenthesis | RightParenthesis | Comma | RULE_NAME | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='p') ) {s = 1;}

                        else if ( (LA14_0=='t') ) {s = 2;}

                        else if ( (LA14_0=='A') ) {s = 3;}

                        else if ( (LA14_0=='T') ) {s = 4;}

                        else if ( (LA14_0=='D') ) {s = 5;}

                        else if ( (LA14_0=='E') ) {s = 6;}

                        else if ( (LA14_0=='e') ) {s = 7;}

                        else if ( (LA14_0=='I') ) {s = 8;}

                        else if ( (LA14_0=='P') ) {s = 9;}

                        else if ( (LA14_0=='i') ) {s = 10;}

                        else if ( (LA14_0=='C') ) {s = 11;}

                        else if ( (LA14_0=='c') ) {s = 12;}

                        else if ( (LA14_0=='o') ) {s = 13;}

                        else if ( (LA14_0=='N') ) {s = 14;}

                        else if ( (LA14_0=='V') ) {s = 15;}

                        else if ( (LA14_0=='f') ) {s = 16;}

                        else if ( (LA14_0=='w') ) {s = 17;}

                        else if ( (LA14_0=='J') ) {s = 18;}

                        else if ( (LA14_0=='K') ) {s = 19;}

                        else if ( (LA14_0=='j') ) {s = 20;}

                        else if ( (LA14_0=='(') ) {s = 21;}

                        else if ( (LA14_0==')') ) {s = 22;}

                        else if ( (LA14_0==',') ) {s = 23;}

                        else if ( (LA14_0=='n') ) {s = 24;}

                        else if ( (LA14_0=='-') ) {s = 25;}

                        else if ( (LA14_0=='\r') ) {s = 26;}

                        else if ( (LA14_0=='\n') ) {s = 27;}

                        else if ( (LA14_0=='^') ) {s = 28;}

                        else if ( (LA14_0=='B'||(LA14_0>='F' && LA14_0<='H')||(LA14_0>='L' && LA14_0<='M')||LA14_0=='O'||(LA14_0>='Q' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||LA14_0=='d'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='k' && LA14_0<='m')||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 29;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 30;}

                        else if ( (LA14_0=='\"') ) {s = 31;}

                        else if ( (LA14_0=='\'') ) {s = 32;}

                        else if ( (LA14_0=='/') ) {s = 33;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 34;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='.'||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}