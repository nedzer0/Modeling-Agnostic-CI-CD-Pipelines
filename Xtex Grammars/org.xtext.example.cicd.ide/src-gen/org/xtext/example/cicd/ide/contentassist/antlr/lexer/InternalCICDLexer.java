package org.xtext.example.cicd.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCICDLexer extends Lexer {
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

    public InternalCICDLexer() {;} 
    public InternalCICDLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCICDLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCICDLexer.g"; }

    // $ANTLR start "DockerContainer"
    public final void mDockerContainer() throws RecognitionException {
        try {
            int _type = DockerContainer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:14:17: ( 'DockerContainer' )
            // InternalCICDLexer.g:14:19: 'DockerContainer'
            {
            match("DockerContainer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DockerContainer"

    // $ANTLR start "ScheduleTrigger"
    public final void mScheduleTrigger() throws RecognitionException {
        try {
            int _type = ScheduleTrigger;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:16:17: ( 'ScheduleTrigger' )
            // InternalCICDLexer.g:16:19: 'ScheduleTrigger'
            {
            match("ScheduleTrigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScheduleTrigger"

    // $ANTLR start "AllowFaillure"
    public final void mAllowFaillure() throws RecognitionException {
        try {
            int _type = AllowFaillure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:18:15: ( 'allowFaillure' )
            // InternalCICDLexer.g:18:17: 'allowFaillure'
            {
            match("allowFaillure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AllowFaillure"

    // $ANTLR start "MatrixConfig"
    public final void mMatrixConfig() throws RecognitionException {
        try {
            int _type = MatrixConfig;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:20:14: ( 'MatrixConfig' )
            // InternalCICDLexer.g:20:16: 'MatrixConfig'
            {
            match("MatrixConfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MatrixConfig"

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:22:13: ( 'Environment' )
            // InternalCICDLexer.g:22:15: 'Environment'
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

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:24:13: ( 'description' )
            // InternalCICDLexer.g:24:15: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "RequireJobs"
    public final void mRequireJobs() throws RecognitionException {
        try {
            int _type = RequireJobs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:26:13: ( 'requireJobs' )
            // InternalCICDLexer.g:26:15: 'requireJobs'
            {
            match("requireJobs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RequireJobs"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:28:12: ( 'Parameters' )
            // InternalCICDLexer.g:28:14: 'Parameters'
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

    // $ANTLR start "Else_steps"
    public final void mElse_steps() throws RecognitionException {
        try {
            int _type = Else_steps;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:30:12: ( 'else_steps' )
            // InternalCICDLexer.g:30:14: 'else_steps'
            {
            match("else_steps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else_steps"

    // $ANTLR start "Condition"
    public final void mCondition() throws RecognitionException {
        try {
            int _type = Condition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:32:11: ( 'condition' )
            // InternalCICDLexer.g:32:13: 'condition'
            {
            match("condition"); 


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
            // InternalCICDLexer.g:34:11: ( 'parameter' )
            // InternalCICDLexer.g:34:13: 'parameter'
            {
            match("parameter"); 


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
            // InternalCICDLexer.g:36:10: ( 'Artifact' )
            // InternalCICDLexer.g:36:12: 'Artifact'
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

    // $ANTLR start "DOWNLOAD"
    public final void mDOWNLOAD() throws RecognitionException {
        try {
            int _type = DOWNLOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:38:10: ( 'DOWNLOAD' )
            // InternalCICDLexer.g:38:12: 'DOWNLOAD'
            {
            match("DOWNLOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOWNLOAD"

    // $ANTLR start "PASSWORD"
    public final void mPASSWORD() throws RecognitionException {
        try {
            int _type = PASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:40:10: ( 'PASSWORD' )
            // InternalCICDLexer.g:40:12: 'PASSWORD'
            {
            match("PASSWORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASSWORD"

    // $ANTLR start "Pipeline"
    public final void mPipeline() throws RecognitionException {
        try {
            int _type = Pipeline;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:42:10: ( 'Pipeline' )
            // InternalCICDLexer.g:42:12: 'Pipeline'
            {
            match("Pipeline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline"

    // $ANTLR start "If_steps"
    public final void mIf_steps() throws RecognitionException {
        try {
            int _type = If_steps;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:44:10: ( 'if_steps' )
            // InternalCICDLexer.g:44:12: 'if_steps'
            {
            match("if_steps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If_steps"

    // $ANTLR start "Parallel"
    public final void mParallel() throws RecognitionException {
        try {
            int _type = Parallel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:46:10: ( 'parallel' )
            // InternalCICDLexer.g:46:12: 'parallel'
            {
            match("parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parallel"

    // $ANTLR start "Password"
    public final void mPassword() throws RecognitionException {
        try {
            int _type = Password;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:48:10: ( 'password' )
            // InternalCICDLexer.g:48:12: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Password"

    // $ANTLR start "Username"
    public final void mUsername() throws RecognitionException {
        try {
            int _type = Username;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:50:10: ( 'username' )
            // InternalCICDLexer.g:50:12: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Username"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:52:9: ( 'BOOLEAN' )
            // InternalCICDLexer.g:52:11: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:54:9: ( 'Command' )
            // InternalCICDLexer.g:54:11: 'Command'
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

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:56:9: ( 'DEFAULT' )
            // InternalCICDLexer.g:56:11: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "EXCLUDE"
    public final void mEXCLUDE() throws RecognitionException {
        try {
            int _type = EXCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:58:9: ( 'EXCLUDE' )
            // InternalCICDLexer.g:58:11: 'EXCLUDE'
            {
            match("EXCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCLUDE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:60:9: ( 'INCLUDE' )
            // InternalCICDLexer.g:60:11: 'INCLUDE'
            {
            match("INCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:62:9: ( 'default' )
            // InternalCICDLexer.g:62:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:64:9: ( 'message' )
            // InternalCICDLexer.g:64:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "CHOICE"
    public final void mCHOICE() throws RecognitionException {
        try {
            int _type = CHOICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:66:8: ( 'CHOICE' )
            // InternalCICDLexer.g:66:10: 'CHOICE'
            {
            match("CHOICE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHOICE"

    // $ANTLR start "IfStep"
    public final void mIfStep() throws RecognitionException {
        try {
            int _type = IfStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:68:8: ( 'IfStep' )
            // InternalCICDLexer.g:68:10: 'IfStep'
            {
            match("IfStep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IfStep"

    // $ANTLR start "Matrix"
    public final void mMatrix() throws RecognitionException {
        try {
            int _type = Matrix;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:70:8: ( 'Matrix' )
            // InternalCICDLexer.g:70:10: 'Matrix'
            {
            match("Matrix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Matrix"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:72:8: ( 'NUMBER' )
            // InternalCICDLexer.g:72:10: 'NUMBER'
            {
            match("NUMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "Output"
    public final void mOutput() throws RecognitionException {
        try {
            int _type = Output;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:74:8: ( 'Output' )
            // InternalCICDLexer.g:74:10: 'Output'
            {
            match("Output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Output"

    // $ANTLR start "SECRET"
    public final void mSECRET() throws RecognitionException {
        try {
            int _type = SECRET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:76:8: ( 'SECRET' )
            // InternalCICDLexer.g:76:10: 'SECRET'
            {
            match("SECRET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECRET"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:78:8: ( 'STRING' )
            // InternalCICDLexer.g:78:10: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "UPLOAD"
    public final void mUPLOAD() throws RecognitionException {
        try {
            int _type = UPLOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:80:8: ( 'UPLOAD' )
            // InternalCICDLexer.g:80:10: 'UPLOAD'
            {
            match("UPLOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPLOAD"

    // $ANTLR start "Labels"
    public final void mLabels() throws RecognitionException {
        try {
            int _type = Labels;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:82:8: ( 'labels' )
            // InternalCICDLexer.g:82:10: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Labels"

    // $ANTLR start "Values"
    public final void mValues() throws RecognitionException {
        try {
            int _type = Values;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:84:8: ( 'values' )
            // InternalCICDLexer.g:84:10: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Values"

    // $ANTLR start "Agent"
    public final void mAgent() throws RecognitionException {
        try {
            int _type = Agent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:86:7: ( 'Agent' )
            // InternalCICDLexer.g:86:9: 'Agent'
            {
            match("Agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Agent"

    // $ANTLR start "Cache"
    public final void mCache() throws RecognitionException {
        try {
            int _type = Cache;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:88:7: ( 'Cache' )
            // InternalCICDLexer.g:88:9: 'Cache'
            {
            match("Cache"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cache"

    // $ANTLR start "Input"
    public final void mInput() throws RecognitionException {
        try {
            int _type = Input;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:90:7: ( 'Input' )
            // InternalCICDLexer.g:90:9: 'Input'
            {
            match("Input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Input"

    // $ANTLR start "STORE"
    public final void mSTORE() throws RecognitionException {
        try {
            int _type = STORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:92:7: ( 'STORE' )
            // InternalCICDLexer.g:92:9: 'STORE'
            {
            match("STORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORE"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:94:7: ( 'false' )
            // InternalCICDLexer.g:94:9: 'false'
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

    // $ANTLR start "Image"
    public final void mImage() throws RecognitionException {
        try {
            int _type = Image;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:96:7: ( 'image' )
            // InternalCICDLexer.g:96:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image"

    // $ANTLR start "Paths"
    public final void mPaths() throws RecognitionException {
        try {
            int _type = Paths;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:98:7: ( 'paths' )
            // InternalCICDLexer.g:98:9: 'paths'
            {
            match("paths"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Paths"

    // $ANTLR start "Timer"
    public final void mTimer() throws RecognitionException {
        try {
            int _type = Timer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:100:7: ( 'timer' )
            // InternalCICDLexer.g:100:9: 'timer'
            {
            match("timer"); 


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
            // InternalCICDLexer.g:102:7: ( 'value' )
            // InternalCICDLexer.g:102:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "BOTH"
    public final void mBOTH() throws RecognitionException {
        try {
            int _type = BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:104:6: ( 'BOTH' )
            // InternalCICDLexer.g:104:8: 'BOTH'
            {
            match("BOTH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOTH"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:106:6: ( 'LOAD' )
            // InternalCICDLexer.g:106:8: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "Step"
    public final void mStep() throws RecognitionException {
        try {
            int _type = Step;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:108:6: ( 'Step' )
            // InternalCICDLexer.g:108:8: 'Step'
            {
            match("Step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Step"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:110:6: ( 'TEXT' )
            // InternalCICDLexer.g:110:8: 'TEXT'
            {
            match("TEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "Keys"
    public final void mKeys() throws RecognitionException {
        try {
            int _type = Keys;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:112:6: ( 'keys' )
            // InternalCICDLexer.g:112:8: 'keys'
            {
            match("keys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Keys"

    // $ANTLR start "Mode"
    public final void mMode() throws RecognitionException {
        try {
            int _type = Mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:114:6: ( 'mode' )
            // InternalCICDLexer.g:114:8: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mode"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:116:6: ( 'name' )
            // InternalCICDLexer.g:116:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Path"
    public final void mPath() throws RecognitionException {
        try {
            int _type = Path;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:118:6: ( 'path' )
            // InternalCICDLexer.g:118:8: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Path"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:120:6: ( 'true' )
            // InternalCICDLexer.g:120:8: 'true'
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

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:122:6: ( 'type' )
            // InternalCICDLexer.g:122:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Job"
    public final void mJob() throws RecognitionException {
        try {
            int _type = Job;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:124:5: ( 'Job' )
            // InternalCICDLexer.g:124:7: 'Job'
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
            // InternalCICDLexer.g:126:5: ( 'key' )
            // InternalCICDLexer.g:126:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:128:7: ( ',' )
            // InternalCICDLexer.g:128:9: ','
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

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCICDLexer.g:130:14: ( ( '\\r' )? '\\n' )
            // InternalCICDLexer.g:130:16: ( '\\r' )? '\\n'
            {
            // InternalCICDLexer.g:130:16: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCICDLexer.g:130:16: '\\r'
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
            // InternalCICDLexer.g:132:21: ()
            // InternalCICDLexer.g:132:23: 
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
            // InternalCICDLexer.g:134:19: ()
            // InternalCICDLexer.g:134:21: 
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
            // InternalCICDLexer.g:136:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCICDLexer.g:136:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCICDLexer.g:136:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCICDLexer.g:136:11: '^'
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

            // InternalCICDLexer.g:136:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCICDLexer.g:
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
            	    break loop3;
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
            // InternalCICDLexer.g:138:10: ( ( '0' .. '9' )+ )
            // InternalCICDLexer.g:138:12: ( '0' .. '9' )+
            {
            // InternalCICDLexer.g:138:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCICDLexer.g:138:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalCICDLexer.g:140:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCICDLexer.g:140:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCICDLexer.g:140:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCICDLexer.g:140:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCICDLexer.g:140:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCICDLexer.g:140:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCICDLexer.g:140:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCICDLexer.g:140:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCICDLexer.g:140:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCICDLexer.g:140:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCICDLexer.g:140:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalCICDLexer.g:142:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCICDLexer.g:142:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCICDLexer.g:142:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCICDLexer.g:142:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalCICDLexer.g:144:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCICDLexer.g:144:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCICDLexer.g:144:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCICDLexer.g:144:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalCICDLexer.g:144:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCICDLexer.g:144:41: ( '\\r' )? '\\n'
                    {
                    // InternalCICDLexer.g:144:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCICDLexer.g:144:41: '\\r'
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
            // InternalCICDLexer.g:146:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCICDLexer.g:146:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCICDLexer.g:146:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCICDLexer.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalCICDLexer.g:148:16: ( . )
            // InternalCICDLexer.g:148:18: .
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
        // InternalCICDLexer.g:1:8: ( DockerContainer | ScheduleTrigger | AllowFaillure | MatrixConfig | Environment | Description | RequireJobs | Parameters | Else_steps | Condition | Parameter | Artifact | DOWNLOAD | PASSWORD | Pipeline | If_steps | Parallel | Password | Username | BOOLEAN | Command | DEFAULT | EXCLUDE | INCLUDE | Default | Message | CHOICE | IfStep | Matrix | NUMBER | Output | SECRET | STRING | UPLOAD | Labels | Values | Agent | Cache | Input | STORE | False | Image | Paths | Timer | Value | BOTH | LOAD | Step | TEXT | Keys | Mode | Name | Path | True | Type | Job | Key | Comma | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=66;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCICDLexer.g:1:10: DockerContainer
                {
                mDockerContainer(); 

                }
                break;
            case 2 :
                // InternalCICDLexer.g:1:26: ScheduleTrigger
                {
                mScheduleTrigger(); 

                }
                break;
            case 3 :
                // InternalCICDLexer.g:1:42: AllowFaillure
                {
                mAllowFaillure(); 

                }
                break;
            case 4 :
                // InternalCICDLexer.g:1:56: MatrixConfig
                {
                mMatrixConfig(); 

                }
                break;
            case 5 :
                // InternalCICDLexer.g:1:69: Environment
                {
                mEnvironment(); 

                }
                break;
            case 6 :
                // InternalCICDLexer.g:1:81: Description
                {
                mDescription(); 

                }
                break;
            case 7 :
                // InternalCICDLexer.g:1:93: RequireJobs
                {
                mRequireJobs(); 

                }
                break;
            case 8 :
                // InternalCICDLexer.g:1:105: Parameters
                {
                mParameters(); 

                }
                break;
            case 9 :
                // InternalCICDLexer.g:1:116: Else_steps
                {
                mElse_steps(); 

                }
                break;
            case 10 :
                // InternalCICDLexer.g:1:127: Condition
                {
                mCondition(); 

                }
                break;
            case 11 :
                // InternalCICDLexer.g:1:137: Parameter
                {
                mParameter(); 

                }
                break;
            case 12 :
                // InternalCICDLexer.g:1:147: Artifact
                {
                mArtifact(); 

                }
                break;
            case 13 :
                // InternalCICDLexer.g:1:156: DOWNLOAD
                {
                mDOWNLOAD(); 

                }
                break;
            case 14 :
                // InternalCICDLexer.g:1:165: PASSWORD
                {
                mPASSWORD(); 

                }
                break;
            case 15 :
                // InternalCICDLexer.g:1:174: Pipeline
                {
                mPipeline(); 

                }
                break;
            case 16 :
                // InternalCICDLexer.g:1:183: If_steps
                {
                mIf_steps(); 

                }
                break;
            case 17 :
                // InternalCICDLexer.g:1:192: Parallel
                {
                mParallel(); 

                }
                break;
            case 18 :
                // InternalCICDLexer.g:1:201: Password
                {
                mPassword(); 

                }
                break;
            case 19 :
                // InternalCICDLexer.g:1:210: Username
                {
                mUsername(); 

                }
                break;
            case 20 :
                // InternalCICDLexer.g:1:219: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 21 :
                // InternalCICDLexer.g:1:227: Command
                {
                mCommand(); 

                }
                break;
            case 22 :
                // InternalCICDLexer.g:1:235: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 23 :
                // InternalCICDLexer.g:1:243: EXCLUDE
                {
                mEXCLUDE(); 

                }
                break;
            case 24 :
                // InternalCICDLexer.g:1:251: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 25 :
                // InternalCICDLexer.g:1:259: Default
                {
                mDefault(); 

                }
                break;
            case 26 :
                // InternalCICDLexer.g:1:267: Message
                {
                mMessage(); 

                }
                break;
            case 27 :
                // InternalCICDLexer.g:1:275: CHOICE
                {
                mCHOICE(); 

                }
                break;
            case 28 :
                // InternalCICDLexer.g:1:282: IfStep
                {
                mIfStep(); 

                }
                break;
            case 29 :
                // InternalCICDLexer.g:1:289: Matrix
                {
                mMatrix(); 

                }
                break;
            case 30 :
                // InternalCICDLexer.g:1:296: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 31 :
                // InternalCICDLexer.g:1:303: Output
                {
                mOutput(); 

                }
                break;
            case 32 :
                // InternalCICDLexer.g:1:310: SECRET
                {
                mSECRET(); 

                }
                break;
            case 33 :
                // InternalCICDLexer.g:1:317: STRING
                {
                mSTRING(); 

                }
                break;
            case 34 :
                // InternalCICDLexer.g:1:324: UPLOAD
                {
                mUPLOAD(); 

                }
                break;
            case 35 :
                // InternalCICDLexer.g:1:331: Labels
                {
                mLabels(); 

                }
                break;
            case 36 :
                // InternalCICDLexer.g:1:338: Values
                {
                mValues(); 

                }
                break;
            case 37 :
                // InternalCICDLexer.g:1:345: Agent
                {
                mAgent(); 

                }
                break;
            case 38 :
                // InternalCICDLexer.g:1:351: Cache
                {
                mCache(); 

                }
                break;
            case 39 :
                // InternalCICDLexer.g:1:357: Input
                {
                mInput(); 

                }
                break;
            case 40 :
                // InternalCICDLexer.g:1:363: STORE
                {
                mSTORE(); 

                }
                break;
            case 41 :
                // InternalCICDLexer.g:1:369: False
                {
                mFalse(); 

                }
                break;
            case 42 :
                // InternalCICDLexer.g:1:375: Image
                {
                mImage(); 

                }
                break;
            case 43 :
                // InternalCICDLexer.g:1:381: Paths
                {
                mPaths(); 

                }
                break;
            case 44 :
                // InternalCICDLexer.g:1:387: Timer
                {
                mTimer(); 

                }
                break;
            case 45 :
                // InternalCICDLexer.g:1:393: Value
                {
                mValue(); 

                }
                break;
            case 46 :
                // InternalCICDLexer.g:1:399: BOTH
                {
                mBOTH(); 

                }
                break;
            case 47 :
                // InternalCICDLexer.g:1:404: LOAD
                {
                mLOAD(); 

                }
                break;
            case 48 :
                // InternalCICDLexer.g:1:409: Step
                {
                mStep(); 

                }
                break;
            case 49 :
                // InternalCICDLexer.g:1:414: TEXT
                {
                mTEXT(); 

                }
                break;
            case 50 :
                // InternalCICDLexer.g:1:419: Keys
                {
                mKeys(); 

                }
                break;
            case 51 :
                // InternalCICDLexer.g:1:424: Mode
                {
                mMode(); 

                }
                break;
            case 52 :
                // InternalCICDLexer.g:1:429: Name
                {
                mName(); 

                }
                break;
            case 53 :
                // InternalCICDLexer.g:1:434: Path
                {
                mPath(); 

                }
                break;
            case 54 :
                // InternalCICDLexer.g:1:439: True
                {
                mTrue(); 

                }
                break;
            case 55 :
                // InternalCICDLexer.g:1:444: Type
                {
                mType(); 

                }
                break;
            case 56 :
                // InternalCICDLexer.g:1:449: Job
                {
                mJob(); 

                }
                break;
            case 57 :
                // InternalCICDLexer.g:1:453: Key
                {
                mKey(); 

                }
                break;
            case 58 :
                // InternalCICDLexer.g:1:457: Comma
                {
                mComma(); 

                }
                break;
            case 59 :
                // InternalCICDLexer.g:1:463: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 60 :
                // InternalCICDLexer.g:1:476: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // InternalCICDLexer.g:1:484: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalCICDLexer.g:1:493: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // InternalCICDLexer.g:1:505: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // InternalCICDLexer.g:1:521: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // InternalCICDLexer.g:1:537: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalCICDLexer.g:1:545: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\36\55\1\uffff\1\133\1\135\1\51\2\uffff\3\51\2\uffff\3\55\1\uffff\54\55\2\uffff\1\135\5\uffff\61\55\1\u00c8\1\55\1\u00ca\7\55\1\u00d2\16\55\1\u00e3\6\55\1\u00ea\7\55\1\u00f2\7\55\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\uffff\1\u00ff\1\uffff\6\55\1\u0106\1\uffff\17\55\1\u0116\1\uffff\1\55\1\u0118\1\55\1\u011a\2\55\1\uffff\2\55\1\u011f\2\55\1\u0122\1\55\1\uffff\4\55\1\u0129\1\u012a\1\u012b\6\uffff\4\55\1\u0130\1\u0131\1\uffff\1\55\1\u0134\15\55\1\uffff\1\55\1\uffff\1\55\1\uffff\3\55\1\u0147\1\uffff\1\55\1\u0149\1\uffff\1\55\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\3\uffff\2\55\1\u0152\1\55\2\uffff\2\55\1\uffff\1\55\1\u0157\1\55\1\u0159\14\55\1\u0166\1\u0167\1\uffff\1\u0168\1\uffff\1\u0169\5\uffff\1\55\1\u016b\1\uffff\4\55\1\uffff\1\55\1\uffff\2\55\1\u0173\1\u0174\3\55\1\u0178\1\u0179\1\u017a\1\u017b\1\u017c\4\uffff\1\55\1\uffff\7\55\2\uffff\1\55\1\u0186\1\u0187\5\uffff\7\55\1\u018f\1\u0190\2\uffff\4\55\1\u0195\1\u0196\1\u0197\2\uffff\3\55\1\u019b\3\uffff\2\55\1\u019e\1\uffff\2\55\1\uffff\1\u01a1\1\u01a2\2\uffff";
    static final String DFA13_eofS =
        "\u01a3\uffff";
    static final String DFA13_minS =
        "\1\0\2\105\1\154\1\141\1\130\2\145\1\101\1\154\1\157\1\141\1\147\1\146\1\163\1\117\1\110\1\116\1\145\1\125\1\165\1\120\3\141\1\151\1\117\1\105\1\145\1\141\1\157\1\uffff\1\12\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\127\1\106\1\uffff\1\150\1\103\1\117\1\145\1\154\1\164\1\166\1\103\1\146\1\161\1\162\1\123\1\160\1\163\1\156\1\162\1\164\1\145\1\137\1\141\1\145\1\117\1\155\1\117\1\143\1\103\1\123\1\160\1\163\1\144\1\115\1\164\1\114\1\142\2\154\1\155\1\165\1\160\1\101\1\130\1\171\1\155\1\142\2\uffff\1\11\5\uffff\1\153\1\116\1\101\1\145\1\122\1\111\1\122\1\160\1\157\1\162\1\151\1\114\1\143\1\141\1\165\1\141\1\123\2\145\1\144\1\141\1\163\1\150\1\151\1\156\1\163\1\147\1\162\1\114\1\110\1\155\1\111\1\150\1\114\1\164\1\165\1\163\1\145\1\102\1\160\1\117\1\145\1\165\1\163\3\145\1\104\1\124\1\60\1\145\1\60\1\145\1\114\1\125\1\144\1\105\1\116\1\105\1\60\1\167\1\151\1\162\1\125\1\162\1\165\1\151\1\155\1\127\1\154\1\137\1\151\1\154\1\167\1\60\1\146\2\164\1\145\1\156\1\105\1\60\1\141\1\103\1\145\1\125\1\145\1\164\1\141\1\60\1\105\1\165\1\101\1\154\2\145\1\162\5\60\1\uffff\1\60\1\uffff\1\162\1\117\1\114\1\165\1\124\1\107\1\60\1\uffff\1\106\1\170\1\157\1\104\1\151\1\154\1\162\1\145\1\117\1\151\1\163\1\164\1\145\1\154\1\157\1\60\1\uffff\1\141\1\60\1\145\1\60\1\141\1\101\1\uffff\1\156\1\105\1\60\1\104\1\160\1\60\1\147\1\uffff\1\122\1\164\1\104\1\163\3\60\6\uffff\1\103\1\101\1\124\1\154\2\60\1\uffff\1\141\1\60\1\156\1\105\1\160\1\164\1\145\1\164\1\122\1\156\1\164\1\151\1\164\1\145\1\162\1\uffff\1\143\1\uffff\1\160\1\uffff\1\155\1\116\1\144\1\60\1\uffff\1\105\1\60\1\uffff\1\145\5\60\3\uffff\1\157\1\104\1\60\1\145\2\uffff\1\151\1\157\1\uffff\1\155\1\60\1\164\1\60\1\112\1\145\1\104\2\145\1\157\1\145\1\154\1\144\1\164\1\163\1\145\2\60\1\uffff\1\60\1\uffff\1\60\5\uffff\1\156\1\60\1\uffff\1\124\1\154\1\156\1\145\1\uffff\1\151\1\uffff\1\157\1\162\2\60\1\160\1\156\1\162\5\60\4\uffff\1\164\1\uffff\1\162\1\154\1\146\1\156\1\157\1\142\1\163\2\uffff\1\163\2\60\5\uffff\1\141\1\151\1\165\1\151\1\164\1\156\1\163\2\60\2\uffff\1\151\1\147\1\162\1\147\3\60\2\uffff\1\156\1\147\1\145\1\60\3\uffff\2\145\1\60\1\uffff\2\162\1\uffff\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\164\1\154\1\141\1\156\2\145\1\151\1\154\1\157\1\141\1\162\1\155\1\163\1\117\1\157\1\156\1\157\1\125\1\165\1\120\3\141\1\171\1\117\1\105\1\145\1\141\1\157\1\uffff\1\12\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\127\1\106\1\uffff\1\150\1\103\1\122\1\145\1\154\1\164\1\166\1\103\1\163\1\161\1\162\1\123\1\160\1\163\1\156\2\164\1\145\1\137\1\141\1\145\1\124\1\155\1\117\1\143\1\103\1\123\1\160\1\163\1\144\1\115\1\164\1\114\1\142\2\154\1\155\1\165\1\160\1\101\1\130\1\171\1\155\1\142\2\uffff\1\40\5\uffff\1\153\1\116\1\101\1\145\1\122\1\111\1\122\1\160\1\157\1\162\1\151\1\114\1\143\1\141\1\165\1\141\1\123\2\145\1\144\1\141\1\163\1\150\1\151\1\156\1\163\1\147\1\162\1\114\1\110\1\155\1\111\1\150\1\114\1\164\1\165\1\163\1\145\1\102\1\160\1\117\1\145\1\165\1\163\3\145\1\104\1\124\1\172\1\145\1\172\1\145\1\114\1\125\1\144\1\105\1\116\1\105\1\172\1\167\1\151\1\162\1\125\1\162\1\165\1\151\1\155\1\127\1\154\1\137\1\151\1\155\1\167\1\172\1\146\2\164\1\145\1\156\1\105\1\172\1\141\1\103\1\145\1\125\1\145\1\164\1\141\1\172\1\105\1\165\1\101\1\154\2\145\1\162\5\172\1\uffff\1\172\1\uffff\1\162\1\117\1\114\1\165\1\124\1\107\1\172\1\uffff\1\106\1\170\1\157\1\104\1\151\1\154\1\162\1\145\1\117\1\151\1\163\1\164\1\145\1\154\1\157\1\172\1\uffff\1\141\1\172\1\145\1\172\1\141\1\101\1\uffff\1\156\1\105\1\172\1\104\1\160\1\172\1\147\1\uffff\1\122\1\164\1\104\1\163\3\172\6\uffff\1\103\1\101\1\124\1\154\2\172\1\uffff\1\141\1\172\1\156\1\105\1\160\1\164\1\145\1\164\1\122\1\156\1\164\1\151\1\164\1\145\1\162\1\uffff\1\143\1\uffff\1\160\1\uffff\1\155\1\116\1\144\1\172\1\uffff\1\105\1\172\1\uffff\1\145\5\172\3\uffff\1\157\1\104\1\172\1\145\2\uffff\1\151\1\157\1\uffff\1\155\1\172\1\164\1\172\1\112\1\145\1\104\2\145\1\157\1\145\1\154\1\144\1\164\1\163\1\145\2\172\1\uffff\1\172\1\uffff\1\172\5\uffff\1\156\1\172\1\uffff\1\124\1\154\1\156\1\145\1\uffff\1\151\1\uffff\1\157\1\162\2\172\1\160\1\156\1\162\5\172\4\uffff\1\164\1\uffff\1\162\1\154\1\146\1\156\1\157\1\142\1\163\2\uffff\1\163\2\172\5\uffff\1\141\1\151\1\165\1\151\1\164\1\156\1\163\2\172\2\uffff\1\151\1\147\1\162\1\147\3\172\2\uffff\1\156\1\147\1\145\1\172\3\uffff\2\145\1\172\1\uffff\2\162\1\uffff\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\37\uffff\1\72\3\uffff\1\74\1\75\3\uffff\1\101\1\102\3\uffff\1\74\54\uffff\1\72\1\101\1\uffff\1\73\1\75\1\76\1\77\1\100\146\uffff\1\71\1\uffff\1\70\7\uffff\1\60\20\uffff\1\65\6\uffff\1\56\7\uffff\1\63\7\uffff\1\66\1\67\1\57\1\61\1\62\1\64\6\uffff\1\50\17\uffff\1\53\1\uffff\1\45\1\uffff\1\52\4\uffff\1\46\2\uffff\1\47\6\uffff\1\55\1\51\1\54\4\uffff\1\40\1\41\2\uffff\1\35\22\uffff\1\33\1\uffff\1\34\1\uffff\1\36\1\37\1\42\1\43\1\44\2\uffff\1\26\4\uffff\1\27\1\uffff\1\31\14\uffff\1\24\1\25\1\30\1\32\1\uffff\1\15\7\uffff\1\16\1\17\3\uffff\1\21\1\22\1\14\1\20\1\23\11\uffff\1\12\1\13\7\uffff\1\10\1\11\4\uffff\1\5\1\6\1\7\3\uffff\1\4\2\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\1\1\44\uffff\1\2\1\0\u017c\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\51\1\50\1\41\2\51\1\40\22\51\1\50\1\51\1\45\4\51\1\46\4\51\1\37\2\51\1\47\12\44\7\51\1\14\1\17\1\20\1\1\1\5\3\43\1\21\1\36\1\43\1\32\1\4\1\23\1\24\1\10\2\43\1\2\1\33\1\25\5\43\3\51\1\42\1\43\1\51\1\3\1\43\1\12\1\6\1\11\1\30\2\43\1\15\1\43\1\34\1\26\1\22\1\35\1\43\1\13\1\43\1\7\1\43\1\31\1\16\1\27\4\43\uff85\51",
            "\1\54\11\uffff\1\53\37\uffff\1\52",
            "\1\57\16\uffff\1\60\16\uffff\1\56\20\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\65\25\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\71\37\uffff\1\70\7\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\12\uffff\1\76",
            "\1\100\6\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\105\30\uffff\1\106\15\uffff\1\104",
            "\1\107\27\uffff\1\110\7\uffff\1\111",
            "\1\112\11\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\10\uffff\1\123\6\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\134",
            "\2\133\2\uffff\1\133\22\uffff\1\133",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\0\137",
            "\0\137",
            "\1\140\4\uffff\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\150\2\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\14\uffff\1\156",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166\1\167\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\4\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\2\133\2\uffff\1\133\22\uffff\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00c7\7\55",
            "\1\u00c9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00e0\1\u00df",
            "\1\u00e1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00e2\7\55",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0117",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0119",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0120",
            "\1\u0121",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0128\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0132",
            "\12\55\7\uffff\2\55\1\u0133\27\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0148",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u014a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0150",
            "\1\u0151",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0153",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0158",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\u016a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "",
            "\1\u0171",
            "\1\u0172",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "",
            "\1\u0185",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u019c",
            "\1\u019d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DockerContainer | ScheduleTrigger | AllowFaillure | MatrixConfig | Environment | Description | RequireJobs | Parameters | Else_steps | Condition | Parameter | Artifact | DOWNLOAD | PASSWORD | Pipeline | If_steps | Parallel | Password | Username | BOOLEAN | Command | DEFAULT | EXCLUDE | INCLUDE | Default | Message | CHOICE | IfStep | Matrix | NUMBER | Output | SECRET | STRING | UPLOAD | Labels | Values | Agent | Cache | Input | STORE | False | Image | Paths | Timer | Value | BOTH | LOAD | Step | TEXT | Keys | Mode | Name | Path | True | Type | Job | Key | Comma | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='D') ) {s = 1;}

                        else if ( (LA13_0=='S') ) {s = 2;}

                        else if ( (LA13_0=='a') ) {s = 3;}

                        else if ( (LA13_0=='M') ) {s = 4;}

                        else if ( (LA13_0=='E') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='r') ) {s = 7;}

                        else if ( (LA13_0=='P') ) {s = 8;}

                        else if ( (LA13_0=='e') ) {s = 9;}

                        else if ( (LA13_0=='c') ) {s = 10;}

                        else if ( (LA13_0=='p') ) {s = 11;}

                        else if ( (LA13_0=='A') ) {s = 12;}

                        else if ( (LA13_0=='i') ) {s = 13;}

                        else if ( (LA13_0=='u') ) {s = 14;}

                        else if ( (LA13_0=='B') ) {s = 15;}

                        else if ( (LA13_0=='C') ) {s = 16;}

                        else if ( (LA13_0=='I') ) {s = 17;}

                        else if ( (LA13_0=='m') ) {s = 18;}

                        else if ( (LA13_0=='N') ) {s = 19;}

                        else if ( (LA13_0=='O') ) {s = 20;}

                        else if ( (LA13_0=='U') ) {s = 21;}

                        else if ( (LA13_0=='l') ) {s = 22;}

                        else if ( (LA13_0=='v') ) {s = 23;}

                        else if ( (LA13_0=='f') ) {s = 24;}

                        else if ( (LA13_0=='t') ) {s = 25;}

                        else if ( (LA13_0=='L') ) {s = 26;}

                        else if ( (LA13_0=='T') ) {s = 27;}

                        else if ( (LA13_0=='k') ) {s = 28;}

                        else if ( (LA13_0=='n') ) {s = 29;}

                        else if ( (LA13_0=='J') ) {s = 30;}

                        else if ( (LA13_0==',') ) {s = 31;}

                        else if ( (LA13_0=='\r') ) {s = 32;}

                        else if ( (LA13_0=='\n') ) {s = 33;}

                        else if ( (LA13_0=='^') ) {s = 34;}

                        else if ( ((LA13_0>='F' && LA13_0<='H')||LA13_0=='K'||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='V' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='g' && LA13_0<='h')||LA13_0=='j'||LA13_0=='o'||LA13_0=='q'||LA13_0=='s'||(LA13_0>='w' && LA13_0<='z')) ) {s = 35;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 36;}

                        else if ( (LA13_0=='\"') ) {s = 37;}

                        else if ( (LA13_0=='\'') ) {s = 38;}

                        else if ( (LA13_0=='/') ) {s = 39;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 40;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}