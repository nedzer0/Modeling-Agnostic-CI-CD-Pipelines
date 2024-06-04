package org.gemoc.agro.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.gemoc.agro.services.ActivitiesDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivitiesDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jan'", "'feb'", "'mar'", "'apr'", "'may'", "'jun'", "'jul'", "'aug'", "'sept'", "'oct'", "'nov'", "'dec'", "'>'", "'<'", "'\\u00B0C'", "'\\u00B0F'", "'once'", "'daily'", "'weekly'", "'monthly'", "'quaterly'", "'yearly'", "'resource'", "'culture'", "'{'", "'}'", "'activity'", "'from '", "'to'", "'['", "']'", "'&&'", "'using'", "'and'", "'no rain since'", "'days'", "'temperature'", "'after'", "'is done since'", "'grain is'"
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
    public String getGrammarFileName() { return "../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g"; }


     
     	private ActivitiesDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActivitiesDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:61:1: ( ruleModel EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:76:1: ( rule__Model__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleResourceKind"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:88:1: entryRuleResourceKind : ruleResourceKind EOF ;
    public final void entryRuleResourceKind() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:89:1: ( ruleResourceKind EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:90:1: ruleResourceKind EOF
            {
             before(grammarAccess.getResourceKindRule()); 
            pushFollow(FOLLOW_ruleResourceKind_in_entryRuleResourceKind121);
            ruleResourceKind();

            state._fsp--;

             after(grammarAccess.getResourceKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceKind128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResourceKind"


    // $ANTLR start "ruleResourceKind"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:97:1: ruleResourceKind : ( ( rule__ResourceKind__Group__0 ) ) ;
    public final void ruleResourceKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:101:2: ( ( ( rule__ResourceKind__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:102:1: ( ( rule__ResourceKind__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:102:1: ( ( rule__ResourceKind__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:103:1: ( rule__ResourceKind__Group__0 )
            {
             before(grammarAccess.getResourceKindAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:104:1: ( rule__ResourceKind__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:104:2: rule__ResourceKind__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__0_in_ruleResourceKind154);
            rule__ResourceKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceKind"


    // $ANTLR start "entryRuleCulture"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:116:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:117:1: ( ruleCulture EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:118:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FOLLOW_ruleCulture_in_entryRuleCulture181);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCulture188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:125:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:129:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:130:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:130:1: ( ( rule__Culture__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:131:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:132:1: ( rule__Culture__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:132:2: rule__Culture__Group__0
            {
            pushFollow(FOLLOW_rule__Culture__Group__0_in_ruleCulture214);
            rule__Culture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCulture"


    // $ANTLR start "entryRuleExploitationActivity"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:144:1: entryRuleExploitationActivity : ruleExploitationActivity EOF ;
    public final void entryRuleExploitationActivity() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:145:1: ( ruleExploitationActivity EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:146:1: ruleExploitationActivity EOF
            {
             before(grammarAccess.getExploitationActivityRule()); 
            pushFollow(FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity241);
            ruleExploitationActivity();

            state._fsp--;

             after(grammarAccess.getExploitationActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploitationActivity248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExploitationActivity"


    // $ANTLR start "ruleExploitationActivity"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:153:1: ruleExploitationActivity : ( ( rule__ExploitationActivity__Group__0 ) ) ;
    public final void ruleExploitationActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:157:2: ( ( ( rule__ExploitationActivity__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:158:1: ( ( rule__ExploitationActivity__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:158:1: ( ( rule__ExploitationActivity__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:159:1: ( rule__ExploitationActivity__Group__0 )
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:160:1: ( rule__ExploitationActivity__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:160:2: rule__ExploitationActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__0_in_ruleExploitationActivity274);
            rule__ExploitationActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExploitationActivity"


    // $ANTLR start "entryRuleActivityResource"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:172:1: entryRuleActivityResource : ruleActivityResource EOF ;
    public final void entryRuleActivityResource() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:173:1: ( ruleActivityResource EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:174:1: ruleActivityResource EOF
            {
             before(grammarAccess.getActivityResourceRule()); 
            pushFollow(FOLLOW_ruleActivityResource_in_entryRuleActivityResource301);
            ruleActivityResource();

            state._fsp--;

             after(grammarAccess.getActivityResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityResource308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityResource"


    // $ANTLR start "ruleActivityResource"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:181:1: ruleActivityResource : ( ( rule__ActivityResource__Group__0 ) ) ;
    public final void ruleActivityResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:185:2: ( ( ( rule__ActivityResource__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:186:1: ( ( rule__ActivityResource__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:186:1: ( ( rule__ActivityResource__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:187:1: ( rule__ActivityResource__Group__0 )
            {
             before(grammarAccess.getActivityResourceAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:188:1: ( rule__ActivityResource__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:188:2: rule__ActivityResource__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityResource__Group__0_in_ruleActivityResource334);
            rule__ActivityResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityResource"


    // $ANTLR start "entryRulePredicate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:200:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:201:1: ( rulePredicate EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:202:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate361);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:209:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:213:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:214:1: ( ( rule__Predicate__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:214:1: ( ( rule__Predicate__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:215:1: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:216:1: ( rule__Predicate__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:216:2: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_rule__Predicate__Alternatives_in_rulePredicate394);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleNoRain"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:228:1: entryRuleNoRain : ruleNoRain EOF ;
    public final void entryRuleNoRain() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:229:1: ( ruleNoRain EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:230:1: ruleNoRain EOF
            {
             before(grammarAccess.getNoRainRule()); 
            pushFollow(FOLLOW_ruleNoRain_in_entryRuleNoRain421);
            ruleNoRain();

            state._fsp--;

             after(grammarAccess.getNoRainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRain428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoRain"


    // $ANTLR start "ruleNoRain"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:237:1: ruleNoRain : ( ( rule__NoRain__Group__0 ) ) ;
    public final void ruleNoRain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:241:2: ( ( ( rule__NoRain__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:242:1: ( ( rule__NoRain__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:242:1: ( ( rule__NoRain__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:243:1: ( rule__NoRain__Group__0 )
            {
             before(grammarAccess.getNoRainAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:244:1: ( rule__NoRain__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:244:2: rule__NoRain__Group__0
            {
            pushFollow(FOLLOW_rule__NoRain__Group__0_in_ruleNoRain454);
            rule__NoRain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoRain"


    // $ANTLR start "entryRuleTempOfTheDay"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:256:1: entryRuleTempOfTheDay : ruleTempOfTheDay EOF ;
    public final void entryRuleTempOfTheDay() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:257:1: ( ruleTempOfTheDay EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:258:1: ruleTempOfTheDay EOF
            {
             before(grammarAccess.getTempOfTheDayRule()); 
            pushFollow(FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay481);
            ruleTempOfTheDay();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTempOfTheDay488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTempOfTheDay"


    // $ANTLR start "ruleTempOfTheDay"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:265:1: ruleTempOfTheDay : ( ( rule__TempOfTheDay__Group__0 ) ) ;
    public final void ruleTempOfTheDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:269:2: ( ( ( rule__TempOfTheDay__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:270:1: ( ( rule__TempOfTheDay__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:270:1: ( ( rule__TempOfTheDay__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:271:1: ( rule__TempOfTheDay__Group__0 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:272:1: ( rule__TempOfTheDay__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:272:2: rule__TempOfTheDay__Group__0
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__0_in_ruleTempOfTheDay514);
            rule__TempOfTheDay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempOfTheDay"


    // $ANTLR start "entryRuleDelaySinceActivy"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:284:1: entryRuleDelaySinceActivy : ruleDelaySinceActivy EOF ;
    public final void entryRuleDelaySinceActivy() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:285:1: ( ruleDelaySinceActivy EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:286:1: ruleDelaySinceActivy EOF
            {
             before(grammarAccess.getDelaySinceActivyRule()); 
            pushFollow(FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy541);
            ruleDelaySinceActivy();

            state._fsp--;

             after(grammarAccess.getDelaySinceActivyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelaySinceActivy548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelaySinceActivy"


    // $ANTLR start "ruleDelaySinceActivy"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:293:1: ruleDelaySinceActivy : ( ( rule__DelaySinceActivy__Group__0 ) ) ;
    public final void ruleDelaySinceActivy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:297:2: ( ( ( rule__DelaySinceActivy__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:298:1: ( ( rule__DelaySinceActivy__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:298:1: ( ( rule__DelaySinceActivy__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:299:1: ( rule__DelaySinceActivy__Group__0 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:300:1: ( rule__DelaySinceActivy__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:300:2: rule__DelaySinceActivy__Group__0
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__0_in_ruleDelaySinceActivy574);
            rule__DelaySinceActivy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelaySinceActivy"


    // $ANTLR start "entryRuleGrainIs"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:312:1: entryRuleGrainIs : ruleGrainIs EOF ;
    public final void entryRuleGrainIs() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:313:1: ( ruleGrainIs EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:314:1: ruleGrainIs EOF
            {
             before(grammarAccess.getGrainIsRule()); 
            pushFollow(FOLLOW_ruleGrainIs_in_entryRuleGrainIs601);
            ruleGrainIs();

            state._fsp--;

             after(grammarAccess.getGrainIsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrainIs608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrainIs"


    // $ANTLR start "ruleGrainIs"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:321:1: ruleGrainIs : ( ( rule__GrainIs__Group__0 ) ) ;
    public final void ruleGrainIs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:325:2: ( ( ( rule__GrainIs__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:326:1: ( ( rule__GrainIs__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:326:1: ( ( rule__GrainIs__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:327:1: ( rule__GrainIs__Group__0 )
            {
             before(grammarAccess.getGrainIsAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:328:1: ( rule__GrainIs__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:328:2: rule__GrainIs__Group__0
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__0_in_ruleGrainIs634);
            rule__GrainIs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrainIsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrainIs"


    // $ANTLR start "entryRuleDate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:340:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:341:1: ( ruleDate EOF )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:342:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate661);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:349:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:353:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:354:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:354:1: ( ( rule__Date__Group__0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:355:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:356:1: ( rule__Date__Group__0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:356:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate694);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleMonth"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:369:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:373:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:374:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:374:1: ( ( rule__Month__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:375:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:376:1: ( rule__Month__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:376:2: rule__Month__Alternatives
            {
            pushFollow(FOLLOW_rule__Month__Alternatives_in_ruleMonth731);
            rule__Month__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleComp"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:388:1: ruleComp : ( ( rule__Comp__Alternatives ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:392:1: ( ( ( rule__Comp__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:393:1: ( ( rule__Comp__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:393:1: ( ( rule__Comp__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:394:1: ( rule__Comp__Alternatives )
            {
             before(grammarAccess.getCompAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:395:1: ( rule__Comp__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:395:2: rule__Comp__Alternatives
            {
            pushFollow(FOLLOW_rule__Comp__Alternatives_in_ruleComp767);
            rule__Comp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComp"


    // $ANTLR start "ruleTempUnit"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:407:1: ruleTempUnit : ( ( rule__TempUnit__Alternatives ) ) ;
    public final void ruleTempUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:411:1: ( ( ( rule__TempUnit__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:412:1: ( ( rule__TempUnit__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:412:1: ( ( rule__TempUnit__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:413:1: ( rule__TempUnit__Alternatives )
            {
             before(grammarAccess.getTempUnitAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:414:1: ( rule__TempUnit__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:414:2: rule__TempUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__TempUnit__Alternatives_in_ruleTempUnit803);
            rule__TempUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempUnit"


    // $ANTLR start "ruleFrequency"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:426:1: ruleFrequency : ( ( rule__Frequency__Alternatives ) ) ;
    public final void ruleFrequency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:430:1: ( ( ( rule__Frequency__Alternatives ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:431:1: ( ( rule__Frequency__Alternatives ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:431:1: ( ( rule__Frequency__Alternatives ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:432:1: ( rule__Frequency__Alternatives )
            {
             before(grammarAccess.getFrequencyAccess().getAlternatives()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:433:1: ( rule__Frequency__Alternatives )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:433:2: rule__Frequency__Alternatives
            {
            pushFollow(FOLLOW_rule__Frequency__Alternatives_in_ruleFrequency839);
            rule__Frequency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "rule__Predicate__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:444:1: rule__Predicate__Alternatives : ( ( ruleNoRain ) | ( ruleTempOfTheDay ) | ( ruleDelaySinceActivy ) | ( ruleGrainIs ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:448:1: ( ( ruleNoRain ) | ( ruleTempOfTheDay ) | ( ruleDelaySinceActivy ) | ( ruleGrainIs ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt1=1;
                }
                break;
            case 47:
                {
                alt1=2;
                }
                break;
            case 48:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:449:1: ( ruleNoRain )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:449:1: ( ruleNoRain )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:450:1: ruleNoRain
                    {
                     before(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives874);
                    ruleNoRain();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:455:6: ( ruleTempOfTheDay )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:455:6: ( ruleTempOfTheDay )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:456:1: ruleTempOfTheDay
                    {
                     before(grammarAccess.getPredicateAccess().getTempOfTheDayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTempOfTheDay_in_rule__Predicate__Alternatives891);
                    ruleTempOfTheDay();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getTempOfTheDayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:461:6: ( ruleDelaySinceActivy )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:461:6: ( ruleDelaySinceActivy )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:462:1: ruleDelaySinceActivy
                    {
                     before(grammarAccess.getPredicateAccess().getDelaySinceActivyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDelaySinceActivy_in_rule__Predicate__Alternatives908);
                    ruleDelaySinceActivy();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getDelaySinceActivyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:467:6: ( ruleGrainIs )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:467:6: ( ruleGrainIs )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:468:1: ruleGrainIs
                    {
                     before(grammarAccess.getPredicateAccess().getGrainIsParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGrainIs_in_rule__Predicate__Alternatives925);
                    ruleGrainIs();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getGrainIsParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__Month__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:478:1: rule__Month__Alternatives : ( ( ( 'jan' ) ) | ( ( 'feb' ) ) | ( ( 'mar' ) ) | ( ( 'apr' ) ) | ( ( 'may' ) ) | ( ( 'jun' ) ) | ( ( 'jul' ) ) | ( ( 'aug' ) ) | ( ( 'sept' ) ) | ( ( 'oct' ) ) | ( ( 'nov' ) ) | ( ( 'dec' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:482:1: ( ( ( 'jan' ) ) | ( ( 'feb' ) ) | ( ( 'mar' ) ) | ( ( 'apr' ) ) | ( ( 'may' ) ) | ( ( 'jun' ) ) | ( ( 'jul' ) ) | ( ( 'aug' ) ) | ( ( 'sept' ) ) | ( ( 'oct' ) ) | ( ( 'nov' ) ) | ( ( 'dec' ) ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:483:1: ( ( 'jan' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:483:1: ( ( 'jan' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:484:1: ( 'jan' )
                    {
                     before(grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:485:1: ( 'jan' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:485:3: 'jan'
                    {
                    match(input,11,FOLLOW_11_in_rule__Month__Alternatives958); 

                    }

                     after(grammarAccess.getMonthAccess().getJanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:490:6: ( ( 'feb' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:490:6: ( ( 'feb' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:491:1: ( 'feb' )
                    {
                     before(grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:492:1: ( 'feb' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:492:3: 'feb'
                    {
                    match(input,12,FOLLOW_12_in_rule__Month__Alternatives979); 

                    }

                     after(grammarAccess.getMonthAccess().getFebEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:497:6: ( ( 'mar' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:497:6: ( ( 'mar' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:498:1: ( 'mar' )
                    {
                     before(grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:499:1: ( 'mar' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:499:3: 'mar'
                    {
                    match(input,13,FOLLOW_13_in_rule__Month__Alternatives1000); 

                    }

                     after(grammarAccess.getMonthAccess().getMarEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:504:6: ( ( 'apr' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:504:6: ( ( 'apr' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:505:1: ( 'apr' )
                    {
                     before(grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:506:1: ( 'apr' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:506:3: 'apr'
                    {
                    match(input,14,FOLLOW_14_in_rule__Month__Alternatives1021); 

                    }

                     after(grammarAccess.getMonthAccess().getAprEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:511:6: ( ( 'may' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:511:6: ( ( 'may' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:512:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:513:1: ( 'may' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:513:3: 'may'
                    {
                    match(input,15,FOLLOW_15_in_rule__Month__Alternatives1042); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:518:6: ( ( 'jun' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:518:6: ( ( 'jun' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:519:1: ( 'jun' )
                    {
                     before(grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:520:1: ( 'jun' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:520:3: 'jun'
                    {
                    match(input,16,FOLLOW_16_in_rule__Month__Alternatives1063); 

                    }

                     after(grammarAccess.getMonthAccess().getJunEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:525:6: ( ( 'jul' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:525:6: ( ( 'jul' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:526:1: ( 'jul' )
                    {
                     before(grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:527:1: ( 'jul' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:527:3: 'jul'
                    {
                    match(input,17,FOLLOW_17_in_rule__Month__Alternatives1084); 

                    }

                     after(grammarAccess.getMonthAccess().getJulEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:532:6: ( ( 'aug' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:532:6: ( ( 'aug' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:533:1: ( 'aug' )
                    {
                     before(grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:534:1: ( 'aug' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:534:3: 'aug'
                    {
                    match(input,18,FOLLOW_18_in_rule__Month__Alternatives1105); 

                    }

                     after(grammarAccess.getMonthAccess().getAugEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:539:6: ( ( 'sept' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:539:6: ( ( 'sept' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:540:1: ( 'sept' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:541:1: ( 'sept' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:541:3: 'sept'
                    {
                    match(input,19,FOLLOW_19_in_rule__Month__Alternatives1126); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:546:6: ( ( 'oct' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:546:6: ( ( 'oct' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:547:1: ( 'oct' )
                    {
                     before(grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:548:1: ( 'oct' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:548:3: 'oct'
                    {
                    match(input,20,FOLLOW_20_in_rule__Month__Alternatives1147); 

                    }

                     after(grammarAccess.getMonthAccess().getOctEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:553:6: ( ( 'nov' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:553:6: ( ( 'nov' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:554:1: ( 'nov' )
                    {
                     before(grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:555:1: ( 'nov' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:555:3: 'nov'
                    {
                    match(input,21,FOLLOW_21_in_rule__Month__Alternatives1168); 

                    }

                     after(grammarAccess.getMonthAccess().getNovEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:560:6: ( ( 'dec' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:560:6: ( ( 'dec' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:561:1: ( 'dec' )
                    {
                     before(grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:562:1: ( 'dec' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:562:3: 'dec'
                    {
                    match(input,22,FOLLOW_22_in_rule__Month__Alternatives1189); 

                    }

                     after(grammarAccess.getMonthAccess().getDecEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Alternatives"


    // $ANTLR start "rule__Comp__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:572:1: rule__Comp__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) );
    public final void rule__Comp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:576:1: ( ( ( '>' ) ) | ( ( '<' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:577:1: ( ( '>' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:577:1: ( ( '>' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:578:1: ( '>' )
                    {
                     before(grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:579:1: ( '>' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:579:3: '>'
                    {
                    match(input,23,FOLLOW_23_in_rule__Comp__Alternatives1225); 

                    }

                     after(grammarAccess.getCompAccess().getMoreThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:584:6: ( ( '<' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:584:6: ( ( '<' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:585:1: ( '<' )
                    {
                     before(grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:586:1: ( '<' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:586:3: '<'
                    {
                    match(input,24,FOLLOW_24_in_rule__Comp__Alternatives1246); 

                    }

                     after(grammarAccess.getCompAccess().getLessThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comp__Alternatives"


    // $ANTLR start "rule__TempUnit__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:596:1: rule__TempUnit__Alternatives : ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) );
    public final void rule__TempUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:600:1: ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:601:1: ( ( '\\u00B0C' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:601:1: ( ( '\\u00B0C' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:602:1: ( '\\u00B0C' )
                    {
                     before(grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:603:1: ( '\\u00B0C' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:603:3: '\\u00B0C'
                    {
                    match(input,25,FOLLOW_25_in_rule__TempUnit__Alternatives1282); 

                    }

                     after(grammarAccess.getTempUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:608:6: ( ( '\\u00B0F' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:608:6: ( ( '\\u00B0F' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:609:1: ( '\\u00B0F' )
                    {
                     before(grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:610:1: ( '\\u00B0F' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:610:3: '\\u00B0F'
                    {
                    match(input,26,FOLLOW_26_in_rule__TempUnit__Alternatives1303); 

                    }

                     after(grammarAccess.getTempUnitAccess().getFarenheitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempUnit__Alternatives"


    // $ANTLR start "rule__Frequency__Alternatives"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:620:1: rule__Frequency__Alternatives : ( ( ( 'once' ) ) | ( ( 'daily' ) ) | ( ( 'weekly' ) ) | ( ( 'monthly' ) ) | ( ( 'quaterly' ) ) | ( ( 'yearly' ) ) );
    public final void rule__Frequency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:624:1: ( ( ( 'once' ) ) | ( ( 'daily' ) ) | ( ( 'weekly' ) ) | ( ( 'monthly' ) ) | ( ( 'quaterly' ) ) | ( ( 'yearly' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:625:1: ( ( 'once' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:625:1: ( ( 'once' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:626:1: ( 'once' )
                    {
                     before(grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:627:1: ( 'once' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:627:3: 'once'
                    {
                    match(input,27,FOLLOW_27_in_rule__Frequency__Alternatives1339); 

                    }

                     after(grammarAccess.getFrequencyAccess().getOnceEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:632:6: ( ( 'daily' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:632:6: ( ( 'daily' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:633:1: ( 'daily' )
                    {
                     before(grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:634:1: ( 'daily' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:634:3: 'daily'
                    {
                    match(input,28,FOLLOW_28_in_rule__Frequency__Alternatives1360); 

                    }

                     after(grammarAccess.getFrequencyAccess().getDailyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:639:6: ( ( 'weekly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:639:6: ( ( 'weekly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:640:1: ( 'weekly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:641:1: ( 'weekly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:641:3: 'weekly'
                    {
                    match(input,29,FOLLOW_29_in_rule__Frequency__Alternatives1381); 

                    }

                     after(grammarAccess.getFrequencyAccess().getWeeklyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:646:6: ( ( 'monthly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:646:6: ( ( 'monthly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:647:1: ( 'monthly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:648:1: ( 'monthly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:648:3: 'monthly'
                    {
                    match(input,30,FOLLOW_30_in_rule__Frequency__Alternatives1402); 

                    }

                     after(grammarAccess.getFrequencyAccess().getMonthlyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:653:6: ( ( 'quaterly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:653:6: ( ( 'quaterly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:654:1: ( 'quaterly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:655:1: ( 'quaterly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:655:3: 'quaterly'
                    {
                    match(input,31,FOLLOW_31_in_rule__Frequency__Alternatives1423); 

                    }

                     after(grammarAccess.getFrequencyAccess().getQuaterlyEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:660:6: ( ( 'yearly' ) )
                    {
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:660:6: ( ( 'yearly' ) )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:661:1: ( 'yearly' )
                    {
                     before(grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5()); 
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:662:1: ( 'yearly' )
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:662:3: 'yearly'
                    {
                    match(input,32,FOLLOW_32_in_rule__Frequency__Alternatives1444); 

                    }

                     after(grammarAccess.getFrequencyAccess().getYearlyEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:674:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:678:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:679:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01477);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01480);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:686:1: rule__Model__Group__0__Impl : ( ( rule__Model__CulturesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:690:1: ( ( ( rule__Model__CulturesAssignment_0 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:691:1: ( ( rule__Model__CulturesAssignment_0 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:691:1: ( ( rule__Model__CulturesAssignment_0 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:692:1: ( rule__Model__CulturesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getCulturesAssignment_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:693:1: ( rule__Model__CulturesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:693:2: rule__Model__CulturesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__CulturesAssignment_0_in_rule__Model__Group__0__Impl1507);
            	    rule__Model__CulturesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCulturesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:703:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:707:1: ( rule__Model__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:708:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11538);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:714:1: rule__Model__Group__1__Impl : ( ( rule__Model__ResourceKindsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:718:1: ( ( ( rule__Model__ResourceKindsAssignment_1 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:719:1: ( ( rule__Model__ResourceKindsAssignment_1 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:719:1: ( ( rule__Model__ResourceKindsAssignment_1 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:720:1: ( rule__Model__ResourceKindsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getResourceKindsAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:721:1: ( rule__Model__ResourceKindsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:721:2: rule__Model__ResourceKindsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ResourceKindsAssignment_1_in_rule__Model__Group__1__Impl1565);
            	    rule__Model__ResourceKindsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getResourceKindsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__ResourceKind__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:735:1: rule__ResourceKind__Group__0 : rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1 ;
    public final void rule__ResourceKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:739:1: ( rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:740:2: rule__ResourceKind__Group__0__Impl rule__ResourceKind__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__0__Impl_in_rule__ResourceKind__Group__01600);
            rule__ResourceKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceKind__Group__1_in_rule__ResourceKind__Group__01603);
            rule__ResourceKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__0"


    // $ANTLR start "rule__ResourceKind__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:747:1: rule__ResourceKind__Group__0__Impl : ( 'resource' ) ;
    public final void rule__ResourceKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:751:1: ( ( 'resource' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:752:1: ( 'resource' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:752:1: ( 'resource' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:753:1: 'resource'
            {
             before(grammarAccess.getResourceKindAccess().getResourceKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ResourceKind__Group__0__Impl1631); 
             after(grammarAccess.getResourceKindAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__0__Impl"


    // $ANTLR start "rule__ResourceKind__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:766:1: rule__ResourceKind__Group__1 : rule__ResourceKind__Group__1__Impl ;
    public final void rule__ResourceKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:770:1: ( rule__ResourceKind__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:771:2: rule__ResourceKind__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceKind__Group__1__Impl_in_rule__ResourceKind__Group__11662);
            rule__ResourceKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__1"


    // $ANTLR start "rule__ResourceKind__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:777:1: rule__ResourceKind__Group__1__Impl : ( ( rule__ResourceKind__NameAssignment_1 ) ) ;
    public final void rule__ResourceKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:781:1: ( ( ( rule__ResourceKind__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:782:1: ( ( rule__ResourceKind__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:782:1: ( ( rule__ResourceKind__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:783:1: ( rule__ResourceKind__NameAssignment_1 )
            {
             before(grammarAccess.getResourceKindAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:784:1: ( rule__ResourceKind__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:784:2: rule__ResourceKind__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceKind__NameAssignment_1_in_rule__ResourceKind__Group__1__Impl1689);
            rule__ResourceKind__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceKindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:798:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:802:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:803:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__01723);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__01726);
            rule__Culture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0"


    // $ANTLR start "rule__Culture__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:810:1: rule__Culture__Group__0__Impl : ( 'culture' ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:814:1: ( ( 'culture' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:815:1: ( 'culture' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:815:1: ( 'culture' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:816:1: 'culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Culture__Group__0__Impl1754); 
             after(grammarAccess.getCultureAccess().getCultureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0__Impl"


    // $ANTLR start "rule__Culture__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:829:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:833:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:834:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__11785);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__11788);
            rule__Culture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1"


    // $ANTLR start "rule__Culture__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:841:1: rule__Culture__Group__1__Impl : ( ( rule__Culture__NameAssignment_1 ) ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:845:1: ( ( ( rule__Culture__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:846:1: ( ( rule__Culture__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:846:1: ( ( rule__Culture__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:847:1: ( rule__Culture__NameAssignment_1 )
            {
             before(grammarAccess.getCultureAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:848:1: ( rule__Culture__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:848:2: rule__Culture__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Culture__NameAssignment_1_in_rule__Culture__Group__1__Impl1815);
            rule__Culture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:858:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:862:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:863:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__21845);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__21848);
            rule__Culture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2"


    // $ANTLR start "rule__Culture__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:870:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:874:1: ( ( '{' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:875:1: ( '{' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:875:1: ( '{' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:876:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Culture__Group__2__Impl1876); 
             after(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__2__Impl"


    // $ANTLR start "rule__Culture__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:889:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:893:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:894:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__31907);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__31910);
            rule__Culture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3"


    // $ANTLR start "rule__Culture__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:901:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__ActivitiesAssignment_3 )* ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:905:1: ( ( ( rule__Culture__ActivitiesAssignment_3 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:906:1: ( ( rule__Culture__ActivitiesAssignment_3 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:906:1: ( ( rule__Culture__ActivitiesAssignment_3 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:907:1: ( rule__Culture__ActivitiesAssignment_3 )*
            {
             before(grammarAccess.getCultureAccess().getActivitiesAssignment_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:908:1: ( rule__Culture__ActivitiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:908:2: rule__Culture__ActivitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Culture__ActivitiesAssignment_3_in_rule__Culture__Group__3__Impl1937);
            	    rule__Culture__ActivitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCultureAccess().getActivitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__3__Impl"


    // $ANTLR start "rule__Culture__Group__4"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:918:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:922:1: ( rule__Culture__Group__4__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:923:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__41968);
            rule__Culture__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4"


    // $ANTLR start "rule__Culture__Group__4__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:929:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:933:1: ( ( '}' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:934:1: ( '}' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:934:1: ( '}' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:935:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Culture__Group__4__Impl1996); 
             after(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__4__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:958:1: rule__ExploitationActivity__Group__0 : rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1 ;
    public final void rule__ExploitationActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:962:1: ( rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:963:2: rule__ExploitationActivity__Group__0__Impl rule__ExploitationActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__0__Impl_in_rule__ExploitationActivity__Group__02037);
            rule__ExploitationActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__1_in_rule__ExploitationActivity__Group__02040);
            rule__ExploitationActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__0"


    // $ANTLR start "rule__ExploitationActivity__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:970:1: rule__ExploitationActivity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__ExploitationActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:974:1: ( ( 'activity' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:975:1: ( 'activity' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:975:1: ( 'activity' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:976:1: 'activity'
            {
             before(grammarAccess.getExploitationActivityAccess().getActivityKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ExploitationActivity__Group__0__Impl2068); 
             after(grammarAccess.getExploitationActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:989:1: rule__ExploitationActivity__Group__1 : rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2 ;
    public final void rule__ExploitationActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:993:1: ( rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:994:2: rule__ExploitationActivity__Group__1__Impl rule__ExploitationActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__1__Impl_in_rule__ExploitationActivity__Group__12099);
            rule__ExploitationActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__2_in_rule__ExploitationActivity__Group__12102);
            rule__ExploitationActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__1"


    // $ANTLR start "rule__ExploitationActivity__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1001:1: rule__ExploitationActivity__Group__1__Impl : ( ( rule__ExploitationActivity__NameAssignment_1 ) ) ;
    public final void rule__ExploitationActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1005:1: ( ( ( rule__ExploitationActivity__NameAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1006:1: ( ( rule__ExploitationActivity__NameAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1006:1: ( ( rule__ExploitationActivity__NameAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1007:1: ( rule__ExploitationActivity__NameAssignment_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getNameAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1008:1: ( rule__ExploitationActivity__NameAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1008:2: rule__ExploitationActivity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__NameAssignment_1_in_rule__ExploitationActivity__Group__1__Impl2129);
            rule__ExploitationActivity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1018:1: rule__ExploitationActivity__Group__2 : rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3 ;
    public final void rule__ExploitationActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1022:1: ( rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1023:2: rule__ExploitationActivity__Group__2__Impl rule__ExploitationActivity__Group__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__2__Impl_in_rule__ExploitationActivity__Group__22159);
            rule__ExploitationActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__3_in_rule__ExploitationActivity__Group__22162);
            rule__ExploitationActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__2"


    // $ANTLR start "rule__ExploitationActivity__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1030:1: rule__ExploitationActivity__Group__2__Impl : ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? ) ;
    public final void rule__ExploitationActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1034:1: ( ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1035:1: ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1035:1: ( ( rule__ExploitationActivity__FrequencyAssignment_2 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1036:1: ( rule__ExploitationActivity__FrequencyAssignment_2 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getFrequencyAssignment_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1037:1: ( rule__ExploitationActivity__FrequencyAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=32)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1037:2: rule__ExploitationActivity__FrequencyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__FrequencyAssignment_2_in_rule__ExploitationActivity__Group__2__Impl2189);
                    rule__ExploitationActivity__FrequencyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getFrequencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1047:1: rule__ExploitationActivity__Group__3 : rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4 ;
    public final void rule__ExploitationActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1051:1: ( rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1052:2: rule__ExploitationActivity__Group__3__Impl rule__ExploitationActivity__Group__4
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__3__Impl_in_rule__ExploitationActivity__Group__32220);
            rule__ExploitationActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__4_in_rule__ExploitationActivity__Group__32223);
            rule__ExploitationActivity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__3"


    // $ANTLR start "rule__ExploitationActivity__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1059:1: rule__ExploitationActivity__Group__3__Impl : ( ( rule__ExploitationActivity__Group_3__0 )? ) ;
    public final void rule__ExploitationActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1063:1: ( ( ( rule__ExploitationActivity__Group_3__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1064:1: ( ( rule__ExploitationActivity__Group_3__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1064:1: ( ( rule__ExploitationActivity__Group_3__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1065:1: ( rule__ExploitationActivity__Group_3__0 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1066:1: ( rule__ExploitationActivity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1066:2: rule__ExploitationActivity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__0_in_rule__ExploitationActivity__Group__3__Impl2250);
                    rule__ExploitationActivity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__4"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1076:1: rule__ExploitationActivity__Group__4 : rule__ExploitationActivity__Group__4__Impl rule__ExploitationActivity__Group__5 ;
    public final void rule__ExploitationActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1080:1: ( rule__ExploitationActivity__Group__4__Impl rule__ExploitationActivity__Group__5 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1081:2: rule__ExploitationActivity__Group__4__Impl rule__ExploitationActivity__Group__5
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__4__Impl_in_rule__ExploitationActivity__Group__42281);
            rule__ExploitationActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group__5_in_rule__ExploitationActivity__Group__42284);
            rule__ExploitationActivity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__4"


    // $ANTLR start "rule__ExploitationActivity__Group__4__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1088:1: rule__ExploitationActivity__Group__4__Impl : ( ( rule__ExploitationActivity__Group_4__0 )? ) ;
    public final void rule__ExploitationActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1092:1: ( ( ( rule__ExploitationActivity__Group_4__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1093:1: ( ( rule__ExploitationActivity__Group_4__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1093:1: ( ( rule__ExploitationActivity__Group_4__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1094:1: ( rule__ExploitationActivity__Group_4__0 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_4()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1095:1: ( rule__ExploitationActivity__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1095:2: rule__ExploitationActivity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__0_in_rule__ExploitationActivity__Group__4__Impl2311);
                    rule__ExploitationActivity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__4__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group__5"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1105:1: rule__ExploitationActivity__Group__5 : rule__ExploitationActivity__Group__5__Impl ;
    public final void rule__ExploitationActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1109:1: ( rule__ExploitationActivity__Group__5__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1110:2: rule__ExploitationActivity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group__5__Impl_in_rule__ExploitationActivity__Group__52342);
            rule__ExploitationActivity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__5"


    // $ANTLR start "rule__ExploitationActivity__Group__5__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1116:1: rule__ExploitationActivity__Group__5__Impl : ( ( rule__ExploitationActivity__Group_5__0 )? ) ;
    public final void rule__ExploitationActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1120:1: ( ( ( rule__ExploitationActivity__Group_5__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1121:1: ( ( rule__ExploitationActivity__Group_5__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1121:1: ( ( rule__ExploitationActivity__Group_5__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1122:1: ( rule__ExploitationActivity__Group_5__0 )?
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_5()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1123:1: ( rule__ExploitationActivity__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1123:2: rule__ExploitationActivity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__0_in_rule__ExploitationActivity__Group__5__Impl2369);
                    rule__ExploitationActivity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExploitationActivityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group__5__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1145:1: rule__ExploitationActivity__Group_3__0 : rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1 ;
    public final void rule__ExploitationActivity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1149:1: ( rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1150:2: rule__ExploitationActivity__Group_3__0__Impl rule__ExploitationActivity__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__0__Impl_in_rule__ExploitationActivity__Group_3__02412);
            rule__ExploitationActivity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__1_in_rule__ExploitationActivity__Group_3__02415);
            rule__ExploitationActivity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__0"


    // $ANTLR start "rule__ExploitationActivity__Group_3__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1157:1: rule__ExploitationActivity__Group_3__0__Impl : ( 'from ' ) ;
    public final void rule__ExploitationActivity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1161:1: ( ( 'from ' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1162:1: ( 'from ' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1162:1: ( 'from ' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1163:1: 'from '
            {
             before(grammarAccess.getExploitationActivityAccess().getFromKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__ExploitationActivity__Group_3__0__Impl2443); 
             after(grammarAccess.getExploitationActivityAccess().getFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1176:1: rule__ExploitationActivity__Group_3__1 : rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2 ;
    public final void rule__ExploitationActivity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1180:1: ( rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1181:2: rule__ExploitationActivity__Group_3__1__Impl rule__ExploitationActivity__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__1__Impl_in_rule__ExploitationActivity__Group_3__12474);
            rule__ExploitationActivity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__2_in_rule__ExploitationActivity__Group_3__12477);
            rule__ExploitationActivity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__1"


    // $ANTLR start "rule__ExploitationActivity__Group_3__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1188:1: rule__ExploitationActivity__Group_3__1__Impl : ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) ) ;
    public final void rule__ExploitationActivity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1192:1: ( ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1193:1: ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1193:1: ( ( rule__ExploitationActivity__StartDateAssignment_3_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1194:1: ( rule__ExploitationActivity__StartDateAssignment_3_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getStartDateAssignment_3_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1195:1: ( rule__ExploitationActivity__StartDateAssignment_3_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1195:2: rule__ExploitationActivity__StartDateAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__StartDateAssignment_3_1_in_rule__ExploitationActivity__Group_3__1__Impl2504);
            rule__ExploitationActivity__StartDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getStartDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1205:1: rule__ExploitationActivity__Group_3__2 : rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3 ;
    public final void rule__ExploitationActivity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1209:1: ( rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1210:2: rule__ExploitationActivity__Group_3__2__Impl rule__ExploitationActivity__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__2__Impl_in_rule__ExploitationActivity__Group_3__22534);
            rule__ExploitationActivity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__3_in_rule__ExploitationActivity__Group_3__22537);
            rule__ExploitationActivity__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__2"


    // $ANTLR start "rule__ExploitationActivity__Group_3__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1217:1: rule__ExploitationActivity__Group_3__2__Impl : ( 'to' ) ;
    public final void rule__ExploitationActivity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1221:1: ( ( 'to' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1222:1: ( 'to' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1222:1: ( 'to' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1223:1: 'to'
            {
             before(grammarAccess.getExploitationActivityAccess().getToKeyword_3_2()); 
            match(input,39,FOLLOW_39_in_rule__ExploitationActivity__Group_3__2__Impl2565); 
             after(grammarAccess.getExploitationActivityAccess().getToKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_3__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1236:1: rule__ExploitationActivity__Group_3__3 : rule__ExploitationActivity__Group_3__3__Impl ;
    public final void rule__ExploitationActivity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1240:1: ( rule__ExploitationActivity__Group_3__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1241:2: rule__ExploitationActivity__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_3__3__Impl_in_rule__ExploitationActivity__Group_3__32596);
            rule__ExploitationActivity__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__3"


    // $ANTLR start "rule__ExploitationActivity__Group_3__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1247:1: rule__ExploitationActivity__Group_3__3__Impl : ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) ) ;
    public final void rule__ExploitationActivity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1251:1: ( ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1252:1: ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1252:1: ( ( rule__ExploitationActivity__EndDateAssignment_3_3 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1253:1: ( rule__ExploitationActivity__EndDateAssignment_3_3 )
            {
             before(grammarAccess.getExploitationActivityAccess().getEndDateAssignment_3_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1254:1: ( rule__ExploitationActivity__EndDateAssignment_3_3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1254:2: rule__ExploitationActivity__EndDateAssignment_3_3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__EndDateAssignment_3_3_in_rule__ExploitationActivity__Group_3__3__Impl2623);
            rule__ExploitationActivity__EndDateAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getEndDateAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_3__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1272:1: rule__ExploitationActivity__Group_4__0 : rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1 ;
    public final void rule__ExploitationActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1276:1: ( rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1277:2: rule__ExploitationActivity__Group_4__0__Impl rule__ExploitationActivity__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__0__Impl_in_rule__ExploitationActivity__Group_4__02661);
            rule__ExploitationActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__1_in_rule__ExploitationActivity__Group_4__02664);
            rule__ExploitationActivity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__0"


    // $ANTLR start "rule__ExploitationActivity__Group_4__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1284:1: rule__ExploitationActivity__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ExploitationActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1288:1: ( ( '[' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1289:1: ( '[' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1289:1: ( '[' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1290:1: '['
            {
             before(grammarAccess.getExploitationActivityAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__ExploitationActivity__Group_4__0__Impl2692); 
             after(grammarAccess.getExploitationActivityAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1303:1: rule__ExploitationActivity__Group_4__1 : rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2 ;
    public final void rule__ExploitationActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1307:1: ( rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1308:2: rule__ExploitationActivity__Group_4__1__Impl rule__ExploitationActivity__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__1__Impl_in_rule__ExploitationActivity__Group_4__12723);
            rule__ExploitationActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__2_in_rule__ExploitationActivity__Group_4__12726);
            rule__ExploitationActivity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__1"


    // $ANTLR start "rule__ExploitationActivity__Group_4__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1315:1: rule__ExploitationActivity__Group_4__1__Impl : ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) ) ;
    public final void rule__ExploitationActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1319:1: ( ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1320:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1320:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1321:1: ( rule__ExploitationActivity__PredicatesAssignment_4_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1322:1: ( rule__ExploitationActivity__PredicatesAssignment_4_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1322:2: rule__ExploitationActivity__PredicatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_1_in_rule__ExploitationActivity__Group_4__1__Impl2753);
            rule__ExploitationActivity__PredicatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1332:1: rule__ExploitationActivity__Group_4__2 : rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3 ;
    public final void rule__ExploitationActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1336:1: ( rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1337:2: rule__ExploitationActivity__Group_4__2__Impl rule__ExploitationActivity__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__2__Impl_in_rule__ExploitationActivity__Group_4__22783);
            rule__ExploitationActivity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__3_in_rule__ExploitationActivity__Group_4__22786);
            rule__ExploitationActivity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__2"


    // $ANTLR start "rule__ExploitationActivity__Group_4__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1344:1: rule__ExploitationActivity__Group_4__2__Impl : ( ( rule__ExploitationActivity__Group_4_2__0 )* ) ;
    public final void rule__ExploitationActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1348:1: ( ( ( rule__ExploitationActivity__Group_4_2__0 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1349:1: ( ( rule__ExploitationActivity__Group_4_2__0 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1349:1: ( ( rule__ExploitationActivity__Group_4_2__0 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1350:1: ( rule__ExploitationActivity__Group_4_2__0 )*
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_4_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1351:1: ( rule__ExploitationActivity__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1351:2: rule__ExploitationActivity__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__0_in_rule__ExploitationActivity__Group_4__2__Impl2813);
            	    rule__ExploitationActivity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExploitationActivityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1361:1: rule__ExploitationActivity__Group_4__3 : rule__ExploitationActivity__Group_4__3__Impl ;
    public final void rule__ExploitationActivity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1365:1: ( rule__ExploitationActivity__Group_4__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1366:2: rule__ExploitationActivity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4__3__Impl_in_rule__ExploitationActivity__Group_4__32844);
            rule__ExploitationActivity__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__3"


    // $ANTLR start "rule__ExploitationActivity__Group_4__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1372:1: rule__ExploitationActivity__Group_4__3__Impl : ( ']' ) ;
    public final void rule__ExploitationActivity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1376:1: ( ( ']' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1377:1: ( ']' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1377:1: ( ']' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1378:1: ']'
            {
             before(grammarAccess.getExploitationActivityAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,41,FOLLOW_41_in_rule__ExploitationActivity__Group_4__3__Impl2872); 
             after(grammarAccess.getExploitationActivityAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4__3__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1399:1: rule__ExploitationActivity__Group_4_2__0 : rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1 ;
    public final void rule__ExploitationActivity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1403:1: ( rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1404:2: rule__ExploitationActivity__Group_4_2__0__Impl rule__ExploitationActivity__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__0__Impl_in_rule__ExploitationActivity__Group_4_2__02911);
            rule__ExploitationActivity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__1_in_rule__ExploitationActivity__Group_4_2__02914);
            rule__ExploitationActivity__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__0"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1411:1: rule__ExploitationActivity__Group_4_2__0__Impl : ( '&&' ) ;
    public final void rule__ExploitationActivity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1415:1: ( ( '&&' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1416:1: ( '&&' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1416:1: ( '&&' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1417:1: '&&'
            {
             before(grammarAccess.getExploitationActivityAccess().getAmpersandAmpersandKeyword_4_2_0()); 
            match(input,42,FOLLOW_42_in_rule__ExploitationActivity__Group_4_2__0__Impl2942); 
             after(grammarAccess.getExploitationActivityAccess().getAmpersandAmpersandKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1430:1: rule__ExploitationActivity__Group_4_2__1 : rule__ExploitationActivity__Group_4_2__1__Impl ;
    public final void rule__ExploitationActivity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1434:1: ( rule__ExploitationActivity__Group_4_2__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1435:2: rule__ExploitationActivity__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_4_2__1__Impl_in_rule__ExploitationActivity__Group_4_2__12973);
            rule__ExploitationActivity__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__1"


    // $ANTLR start "rule__ExploitationActivity__Group_4_2__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1441:1: rule__ExploitationActivity__Group_4_2__1__Impl : ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) ) ;
    public final void rule__ExploitationActivity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1445:1: ( ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1446:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1446:1: ( ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1447:1: ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_2_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1448:1: ( rule__ExploitationActivity__PredicatesAssignment_4_2_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1448:2: rule__ExploitationActivity__PredicatesAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_2_1_in_rule__ExploitationActivity__Group_4_2__1__Impl3000);
            rule__ExploitationActivity__PredicatesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getPredicatesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_4_2__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_5__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1462:1: rule__ExploitationActivity__Group_5__0 : rule__ExploitationActivity__Group_5__0__Impl rule__ExploitationActivity__Group_5__1 ;
    public final void rule__ExploitationActivity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1466:1: ( rule__ExploitationActivity__Group_5__0__Impl rule__ExploitationActivity__Group_5__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1467:2: rule__ExploitationActivity__Group_5__0__Impl rule__ExploitationActivity__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__0__Impl_in_rule__ExploitationActivity__Group_5__03034);
            rule__ExploitationActivity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__1_in_rule__ExploitationActivity__Group_5__03037);
            rule__ExploitationActivity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__0"


    // $ANTLR start "rule__ExploitationActivity__Group_5__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1474:1: rule__ExploitationActivity__Group_5__0__Impl : ( 'using' ) ;
    public final void rule__ExploitationActivity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1478:1: ( ( 'using' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1479:1: ( 'using' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1479:1: ( 'using' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1480:1: 'using'
            {
             before(grammarAccess.getExploitationActivityAccess().getUsingKeyword_5_0()); 
            match(input,43,FOLLOW_43_in_rule__ExploitationActivity__Group_5__0__Impl3065); 
             after(grammarAccess.getExploitationActivityAccess().getUsingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_5__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1493:1: rule__ExploitationActivity__Group_5__1 : rule__ExploitationActivity__Group_5__1__Impl rule__ExploitationActivity__Group_5__2 ;
    public final void rule__ExploitationActivity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1497:1: ( rule__ExploitationActivity__Group_5__1__Impl rule__ExploitationActivity__Group_5__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1498:2: rule__ExploitationActivity__Group_5__1__Impl rule__ExploitationActivity__Group_5__2
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__1__Impl_in_rule__ExploitationActivity__Group_5__13096);
            rule__ExploitationActivity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__2_in_rule__ExploitationActivity__Group_5__13099);
            rule__ExploitationActivity__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__1"


    // $ANTLR start "rule__ExploitationActivity__Group_5__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1505:1: rule__ExploitationActivity__Group_5__1__Impl : ( ( rule__ExploitationActivity__UsesAssignment_5_1 ) ) ;
    public final void rule__ExploitationActivity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1509:1: ( ( ( rule__ExploitationActivity__UsesAssignment_5_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1510:1: ( ( rule__ExploitationActivity__UsesAssignment_5_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1510:1: ( ( rule__ExploitationActivity__UsesAssignment_5_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1511:1: ( rule__ExploitationActivity__UsesAssignment_5_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1512:1: ( rule__ExploitationActivity__UsesAssignment_5_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1512:2: rule__ExploitationActivity__UsesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__UsesAssignment_5_1_in_rule__ExploitationActivity__Group_5__1__Impl3126);
            rule__ExploitationActivity__UsesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__1__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_5__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1522:1: rule__ExploitationActivity__Group_5__2 : rule__ExploitationActivity__Group_5__2__Impl ;
    public final void rule__ExploitationActivity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1526:1: ( rule__ExploitationActivity__Group_5__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1527:2: rule__ExploitationActivity__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5__2__Impl_in_rule__ExploitationActivity__Group_5__23156);
            rule__ExploitationActivity__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__2"


    // $ANTLR start "rule__ExploitationActivity__Group_5__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1533:1: rule__ExploitationActivity__Group_5__2__Impl : ( ( rule__ExploitationActivity__Group_5_2__0 )* ) ;
    public final void rule__ExploitationActivity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1537:1: ( ( ( rule__ExploitationActivity__Group_5_2__0 )* ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1538:1: ( ( rule__ExploitationActivity__Group_5_2__0 )* )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1538:1: ( ( rule__ExploitationActivity__Group_5_2__0 )* )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1539:1: ( rule__ExploitationActivity__Group_5_2__0 )*
            {
             before(grammarAccess.getExploitationActivityAccess().getGroup_5_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1540:1: ( rule__ExploitationActivity__Group_5_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1540:2: rule__ExploitationActivity__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ExploitationActivity__Group_5_2__0_in_rule__ExploitationActivity__Group_5__2__Impl3183);
            	    rule__ExploitationActivity__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExploitationActivityAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5__2__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_5_2__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1556:1: rule__ExploitationActivity__Group_5_2__0 : rule__ExploitationActivity__Group_5_2__0__Impl rule__ExploitationActivity__Group_5_2__1 ;
    public final void rule__ExploitationActivity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1560:1: ( rule__ExploitationActivity__Group_5_2__0__Impl rule__ExploitationActivity__Group_5_2__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1561:2: rule__ExploitationActivity__Group_5_2__0__Impl rule__ExploitationActivity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5_2__0__Impl_in_rule__ExploitationActivity__Group_5_2__03220);
            rule__ExploitationActivity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5_2__1_in_rule__ExploitationActivity__Group_5_2__03223);
            rule__ExploitationActivity__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5_2__0"


    // $ANTLR start "rule__ExploitationActivity__Group_5_2__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1568:1: rule__ExploitationActivity__Group_5_2__0__Impl : ( 'and' ) ;
    public final void rule__ExploitationActivity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1572:1: ( ( 'and' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1573:1: ( 'and' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1573:1: ( 'and' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1574:1: 'and'
            {
             before(grammarAccess.getExploitationActivityAccess().getAndKeyword_5_2_0()); 
            match(input,44,FOLLOW_44_in_rule__ExploitationActivity__Group_5_2__0__Impl3251); 
             after(grammarAccess.getExploitationActivityAccess().getAndKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5_2__0__Impl"


    // $ANTLR start "rule__ExploitationActivity__Group_5_2__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1587:1: rule__ExploitationActivity__Group_5_2__1 : rule__ExploitationActivity__Group_5_2__1__Impl ;
    public final void rule__ExploitationActivity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1591:1: ( rule__ExploitationActivity__Group_5_2__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1592:2: rule__ExploitationActivity__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__Group_5_2__1__Impl_in_rule__ExploitationActivity__Group_5_2__13282);
            rule__ExploitationActivity__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5_2__1"


    // $ANTLR start "rule__ExploitationActivity__Group_5_2__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1598:1: rule__ExploitationActivity__Group_5_2__1__Impl : ( ( rule__ExploitationActivity__UsesAssignment_5_2_1 ) ) ;
    public final void rule__ExploitationActivity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1602:1: ( ( ( rule__ExploitationActivity__UsesAssignment_5_2_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1603:1: ( ( rule__ExploitationActivity__UsesAssignment_5_2_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1603:1: ( ( rule__ExploitationActivity__UsesAssignment_5_2_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1604:1: ( rule__ExploitationActivity__UsesAssignment_5_2_1 )
            {
             before(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_2_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1605:1: ( rule__ExploitationActivity__UsesAssignment_5_2_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1605:2: rule__ExploitationActivity__UsesAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__ExploitationActivity__UsesAssignment_5_2_1_in_rule__ExploitationActivity__Group_5_2__1__Impl3309);
            rule__ExploitationActivity__UsesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExploitationActivityAccess().getUsesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__Group_5_2__1__Impl"


    // $ANTLR start "rule__ActivityResource__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1619:1: rule__ActivityResource__Group__0 : rule__ActivityResource__Group__0__Impl rule__ActivityResource__Group__1 ;
    public final void rule__ActivityResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1623:1: ( rule__ActivityResource__Group__0__Impl rule__ActivityResource__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1624:2: rule__ActivityResource__Group__0__Impl rule__ActivityResource__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityResource__Group__0__Impl_in_rule__ActivityResource__Group__03343);
            rule__ActivityResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityResource__Group__1_in_rule__ActivityResource__Group__03346);
            rule__ActivityResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__Group__0"


    // $ANTLR start "rule__ActivityResource__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1631:1: rule__ActivityResource__Group__0__Impl : ( ( rule__ActivityResource__QuantityAssignment_0 ) ) ;
    public final void rule__ActivityResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1635:1: ( ( ( rule__ActivityResource__QuantityAssignment_0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1636:1: ( ( rule__ActivityResource__QuantityAssignment_0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1636:1: ( ( rule__ActivityResource__QuantityAssignment_0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1637:1: ( rule__ActivityResource__QuantityAssignment_0 )
            {
             before(grammarAccess.getActivityResourceAccess().getQuantityAssignment_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1638:1: ( rule__ActivityResource__QuantityAssignment_0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1638:2: rule__ActivityResource__QuantityAssignment_0
            {
            pushFollow(FOLLOW_rule__ActivityResource__QuantityAssignment_0_in_rule__ActivityResource__Group__0__Impl3373);
            rule__ActivityResource__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityResourceAccess().getQuantityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__Group__0__Impl"


    // $ANTLR start "rule__ActivityResource__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1648:1: rule__ActivityResource__Group__1 : rule__ActivityResource__Group__1__Impl ;
    public final void rule__ActivityResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1652:1: ( rule__ActivityResource__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1653:2: rule__ActivityResource__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActivityResource__Group__1__Impl_in_rule__ActivityResource__Group__13403);
            rule__ActivityResource__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__Group__1"


    // $ANTLR start "rule__ActivityResource__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1659:1: rule__ActivityResource__Group__1__Impl : ( ( rule__ActivityResource__ResourceKindAssignment_1 ) ) ;
    public final void rule__ActivityResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1663:1: ( ( ( rule__ActivityResource__ResourceKindAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1664:1: ( ( rule__ActivityResource__ResourceKindAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1664:1: ( ( rule__ActivityResource__ResourceKindAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1665:1: ( rule__ActivityResource__ResourceKindAssignment_1 )
            {
             before(grammarAccess.getActivityResourceAccess().getResourceKindAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1666:1: ( rule__ActivityResource__ResourceKindAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1666:2: rule__ActivityResource__ResourceKindAssignment_1
            {
            pushFollow(FOLLOW_rule__ActivityResource__ResourceKindAssignment_1_in_rule__ActivityResource__Group__1__Impl3430);
            rule__ActivityResource__ResourceKindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityResourceAccess().getResourceKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__Group__1__Impl"


    // $ANTLR start "rule__NoRain__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1680:1: rule__NoRain__Group__0 : rule__NoRain__Group__0__Impl rule__NoRain__Group__1 ;
    public final void rule__NoRain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1684:1: ( rule__NoRain__Group__0__Impl rule__NoRain__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1685:2: rule__NoRain__Group__0__Impl rule__NoRain__Group__1
            {
            pushFollow(FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__03464);
            rule__NoRain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__03467);
            rule__NoRain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__0"


    // $ANTLR start "rule__NoRain__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1692:1: rule__NoRain__Group__0__Impl : ( 'no rain since' ) ;
    public final void rule__NoRain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1696:1: ( ( 'no rain since' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1697:1: ( 'no rain since' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1697:1: ( 'no rain since' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1698:1: 'no rain since'
            {
             before(grammarAccess.getNoRainAccess().getNoRainSinceKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__NoRain__Group__0__Impl3495); 
             after(grammarAccess.getNoRainAccess().getNoRainSinceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__0__Impl"


    // $ANTLR start "rule__NoRain__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1711:1: rule__NoRain__Group__1 : rule__NoRain__Group__1__Impl rule__NoRain__Group__2 ;
    public final void rule__NoRain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1715:1: ( rule__NoRain__Group__1__Impl rule__NoRain__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1716:2: rule__NoRain__Group__1__Impl rule__NoRain__Group__2
            {
            pushFollow(FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__13526);
            rule__NoRain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__13529);
            rule__NoRain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__1"


    // $ANTLR start "rule__NoRain__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1723:1: rule__NoRain__Group__1__Impl : ( ( rule__NoRain__DaysAssignment_1 ) ) ;
    public final void rule__NoRain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1727:1: ( ( ( rule__NoRain__DaysAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1728:1: ( ( rule__NoRain__DaysAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1728:1: ( ( rule__NoRain__DaysAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1729:1: ( rule__NoRain__DaysAssignment_1 )
            {
             before(grammarAccess.getNoRainAccess().getDaysAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1730:1: ( rule__NoRain__DaysAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1730:2: rule__NoRain__DaysAssignment_1
            {
            pushFollow(FOLLOW_rule__NoRain__DaysAssignment_1_in_rule__NoRain__Group__1__Impl3556);
            rule__NoRain__DaysAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getDaysAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__1__Impl"


    // $ANTLR start "rule__NoRain__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1740:1: rule__NoRain__Group__2 : rule__NoRain__Group__2__Impl ;
    public final void rule__NoRain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1744:1: ( rule__NoRain__Group__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1745:2: rule__NoRain__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__23586);
            rule__NoRain__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__2"


    // $ANTLR start "rule__NoRain__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1751:1: rule__NoRain__Group__2__Impl : ( 'days' ) ;
    public final void rule__NoRain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1755:1: ( ( 'days' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1756:1: ( 'days' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1756:1: ( 'days' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1757:1: 'days'
            {
             before(grammarAccess.getNoRainAccess().getDaysKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__NoRain__Group__2__Impl3614); 
             after(grammarAccess.getNoRainAccess().getDaysKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__2__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1776:1: rule__TempOfTheDay__Group__0 : rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1 ;
    public final void rule__TempOfTheDay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1780:1: ( rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1781:2: rule__TempOfTheDay__Group__0__Impl rule__TempOfTheDay__Group__1
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__0__Impl_in_rule__TempOfTheDay__Group__03651);
            rule__TempOfTheDay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__1_in_rule__TempOfTheDay__Group__03654);
            rule__TempOfTheDay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__0"


    // $ANTLR start "rule__TempOfTheDay__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1788:1: rule__TempOfTheDay__Group__0__Impl : ( 'temperature' ) ;
    public final void rule__TempOfTheDay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1792:1: ( ( 'temperature' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1793:1: ( 'temperature' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1793:1: ( 'temperature' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1794:1: 'temperature'
            {
             before(grammarAccess.getTempOfTheDayAccess().getTemperatureKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__TempOfTheDay__Group__0__Impl3682); 
             after(grammarAccess.getTempOfTheDayAccess().getTemperatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__0__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1807:1: rule__TempOfTheDay__Group__1 : rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2 ;
    public final void rule__TempOfTheDay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1811:1: ( rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1812:2: rule__TempOfTheDay__Group__1__Impl rule__TempOfTheDay__Group__2
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__1__Impl_in_rule__TempOfTheDay__Group__13713);
            rule__TempOfTheDay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__2_in_rule__TempOfTheDay__Group__13716);
            rule__TempOfTheDay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__1"


    // $ANTLR start "rule__TempOfTheDay__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1819:1: rule__TempOfTheDay__Group__1__Impl : ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) ) ;
    public final void rule__TempOfTheDay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1823:1: ( ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1824:1: ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1824:1: ( ( rule__TempOfTheDay__ComparisonAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1825:1: ( rule__TempOfTheDay__ComparisonAssignment_1 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getComparisonAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1826:1: ( rule__TempOfTheDay__ComparisonAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1826:2: rule__TempOfTheDay__ComparisonAssignment_1
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__ComparisonAssignment_1_in_rule__TempOfTheDay__Group__1__Impl3743);
            rule__TempOfTheDay__ComparisonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getComparisonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__1__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1836:1: rule__TempOfTheDay__Group__2 : rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3 ;
    public final void rule__TempOfTheDay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1840:1: ( rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1841:2: rule__TempOfTheDay__Group__2__Impl rule__TempOfTheDay__Group__3
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__2__Impl_in_rule__TempOfTheDay__Group__23773);
            rule__TempOfTheDay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TempOfTheDay__Group__3_in_rule__TempOfTheDay__Group__23776);
            rule__TempOfTheDay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__2"


    // $ANTLR start "rule__TempOfTheDay__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1848:1: rule__TempOfTheDay__Group__2__Impl : ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) ) ;
    public final void rule__TempOfTheDay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1852:1: ( ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1853:1: ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1853:1: ( ( rule__TempOfTheDay__LowerTempBoundAssignment_2 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1854:1: ( rule__TempOfTheDay__LowerTempBoundAssignment_2 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundAssignment_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1855:1: ( rule__TempOfTheDay__LowerTempBoundAssignment_2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1855:2: rule__TempOfTheDay__LowerTempBoundAssignment_2
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__LowerTempBoundAssignment_2_in_rule__TempOfTheDay__Group__2__Impl3803);
            rule__TempOfTheDay__LowerTempBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__2__Impl"


    // $ANTLR start "rule__TempOfTheDay__Group__3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1865:1: rule__TempOfTheDay__Group__3 : rule__TempOfTheDay__Group__3__Impl ;
    public final void rule__TempOfTheDay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1869:1: ( rule__TempOfTheDay__Group__3__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1870:2: rule__TempOfTheDay__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__Group__3__Impl_in_rule__TempOfTheDay__Group__33833);
            rule__TempOfTheDay__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__3"


    // $ANTLR start "rule__TempOfTheDay__Group__3__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1876:1: rule__TempOfTheDay__Group__3__Impl : ( ( rule__TempOfTheDay__UnitAssignment_3 ) ) ;
    public final void rule__TempOfTheDay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1880:1: ( ( ( rule__TempOfTheDay__UnitAssignment_3 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1881:1: ( ( rule__TempOfTheDay__UnitAssignment_3 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1881:1: ( ( rule__TempOfTheDay__UnitAssignment_3 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1882:1: ( rule__TempOfTheDay__UnitAssignment_3 )
            {
             before(grammarAccess.getTempOfTheDayAccess().getUnitAssignment_3()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1883:1: ( rule__TempOfTheDay__UnitAssignment_3 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1883:2: rule__TempOfTheDay__UnitAssignment_3
            {
            pushFollow(FOLLOW_rule__TempOfTheDay__UnitAssignment_3_in_rule__TempOfTheDay__Group__3__Impl3860);
            rule__TempOfTheDay__UnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTempOfTheDayAccess().getUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__Group__3__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1901:1: rule__DelaySinceActivy__Group__0 : rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1 ;
    public final void rule__DelaySinceActivy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1905:1: ( rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1906:2: rule__DelaySinceActivy__Group__0__Impl rule__DelaySinceActivy__Group__1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__0__Impl_in_rule__DelaySinceActivy__Group__03898);
            rule__DelaySinceActivy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__1_in_rule__DelaySinceActivy__Group__03901);
            rule__DelaySinceActivy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__0"


    // $ANTLR start "rule__DelaySinceActivy__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1913:1: rule__DelaySinceActivy__Group__0__Impl : ( 'after' ) ;
    public final void rule__DelaySinceActivy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1917:1: ( ( 'after' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1918:1: ( 'after' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1918:1: ( 'after' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1919:1: 'after'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getAfterKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__DelaySinceActivy__Group__0__Impl3929); 
             after(grammarAccess.getDelaySinceActivyAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__0__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1932:1: rule__DelaySinceActivy__Group__1 : rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2 ;
    public final void rule__DelaySinceActivy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1936:1: ( rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1937:2: rule__DelaySinceActivy__Group__1__Impl rule__DelaySinceActivy__Group__2
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__1__Impl_in_rule__DelaySinceActivy__Group__13960);
            rule__DelaySinceActivy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__2_in_rule__DelaySinceActivy__Group__13963);
            rule__DelaySinceActivy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__1"


    // $ANTLR start "rule__DelaySinceActivy__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1944:1: rule__DelaySinceActivy__Group__1__Impl : ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) ) ;
    public final void rule__DelaySinceActivy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1948:1: ( ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1949:1: ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1949:1: ( ( rule__DelaySinceActivy__PrerequisiteAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1950:1: ( rule__DelaySinceActivy__PrerequisiteAssignment_1 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1951:1: ( rule__DelaySinceActivy__PrerequisiteAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1951:2: rule__DelaySinceActivy__PrerequisiteAssignment_1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__PrerequisiteAssignment_1_in_rule__DelaySinceActivy__Group__1__Impl3990);
            rule__DelaySinceActivy__PrerequisiteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__1__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1961:1: rule__DelaySinceActivy__Group__2 : rule__DelaySinceActivy__Group__2__Impl ;
    public final void rule__DelaySinceActivy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1965:1: ( rule__DelaySinceActivy__Group__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1966:2: rule__DelaySinceActivy__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group__2__Impl_in_rule__DelaySinceActivy__Group__24020);
            rule__DelaySinceActivy__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__2"


    // $ANTLR start "rule__DelaySinceActivy__Group__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1972:1: rule__DelaySinceActivy__Group__2__Impl : ( ( rule__DelaySinceActivy__Group_2__0 )? ) ;
    public final void rule__DelaySinceActivy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1976:1: ( ( ( rule__DelaySinceActivy__Group_2__0 )? ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1977:1: ( ( rule__DelaySinceActivy__Group_2__0 )? )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1977:1: ( ( rule__DelaySinceActivy__Group_2__0 )? )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1978:1: ( rule__DelaySinceActivy__Group_2__0 )?
            {
             before(grammarAccess.getDelaySinceActivyAccess().getGroup_2()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1979:1: ( rule__DelaySinceActivy__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1979:2: rule__DelaySinceActivy__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__0_in_rule__DelaySinceActivy__Group__2__Impl4047);
                    rule__DelaySinceActivy__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelaySinceActivyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group__2__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1995:1: rule__DelaySinceActivy__Group_2__0 : rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1 ;
    public final void rule__DelaySinceActivy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:1999:1: ( rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2000:2: rule__DelaySinceActivy__Group_2__0__Impl rule__DelaySinceActivy__Group_2__1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__0__Impl_in_rule__DelaySinceActivy__Group_2__04084);
            rule__DelaySinceActivy__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__1_in_rule__DelaySinceActivy__Group_2__04087);
            rule__DelaySinceActivy__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__0"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2007:1: rule__DelaySinceActivy__Group_2__0__Impl : ( 'is done since' ) ;
    public final void rule__DelaySinceActivy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2011:1: ( ( 'is done since' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2012:1: ( 'is done since' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2012:1: ( 'is done since' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2013:1: 'is done since'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getIsDoneSinceKeyword_2_0()); 
            match(input,49,FOLLOW_49_in_rule__DelaySinceActivy__Group_2__0__Impl4115); 
             after(grammarAccess.getDelaySinceActivyAccess().getIsDoneSinceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__0__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2026:1: rule__DelaySinceActivy__Group_2__1 : rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2 ;
    public final void rule__DelaySinceActivy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2030:1: ( rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2031:2: rule__DelaySinceActivy__Group_2__1__Impl rule__DelaySinceActivy__Group_2__2
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__1__Impl_in_rule__DelaySinceActivy__Group_2__14146);
            rule__DelaySinceActivy__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__2_in_rule__DelaySinceActivy__Group_2__14149);
            rule__DelaySinceActivy__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__1"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2038:1: rule__DelaySinceActivy__Group_2__1__Impl : ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) ) ;
    public final void rule__DelaySinceActivy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2042:1: ( ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2043:1: ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2043:1: ( ( rule__DelaySinceActivy__DaysAssignment_2_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2044:1: ( rule__DelaySinceActivy__DaysAssignment_2_1 )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysAssignment_2_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2045:1: ( rule__DelaySinceActivy__DaysAssignment_2_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2045:2: rule__DelaySinceActivy__DaysAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__DaysAssignment_2_1_in_rule__DelaySinceActivy__Group_2__1__Impl4176);
            rule__DelaySinceActivy__DaysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDelaySinceActivyAccess().getDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__1__Impl"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2055:1: rule__DelaySinceActivy__Group_2__2 : rule__DelaySinceActivy__Group_2__2__Impl ;
    public final void rule__DelaySinceActivy__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2059:1: ( rule__DelaySinceActivy__Group_2__2__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2060:2: rule__DelaySinceActivy__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DelaySinceActivy__Group_2__2__Impl_in_rule__DelaySinceActivy__Group_2__24206);
            rule__DelaySinceActivy__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__2"


    // $ANTLR start "rule__DelaySinceActivy__Group_2__2__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2066:1: rule__DelaySinceActivy__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__DelaySinceActivy__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2070:1: ( ( 'days' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2071:1: ( 'days' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2071:1: ( 'days' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2072:1: 'days'
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysKeyword_2_2()); 
            match(input,46,FOLLOW_46_in_rule__DelaySinceActivy__Group_2__2__Impl4234); 
             after(grammarAccess.getDelaySinceActivyAccess().getDaysKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__Group_2__2__Impl"


    // $ANTLR start "rule__GrainIs__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2091:1: rule__GrainIs__Group__0 : rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1 ;
    public final void rule__GrainIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2095:1: ( rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2096:2: rule__GrainIs__Group__0__Impl rule__GrainIs__Group__1
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__0__Impl_in_rule__GrainIs__Group__04271);
            rule__GrainIs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrainIs__Group__1_in_rule__GrainIs__Group__04274);
            rule__GrainIs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__0"


    // $ANTLR start "rule__GrainIs__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2103:1: rule__GrainIs__Group__0__Impl : ( 'grain is' ) ;
    public final void rule__GrainIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2107:1: ( ( 'grain is' ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2108:1: ( 'grain is' )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2108:1: ( 'grain is' )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2109:1: 'grain is'
            {
             before(grammarAccess.getGrainIsAccess().getGrainIsKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__GrainIs__Group__0__Impl4302); 
             after(grammarAccess.getGrainIsAccess().getGrainIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__0__Impl"


    // $ANTLR start "rule__GrainIs__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2122:1: rule__GrainIs__Group__1 : rule__GrainIs__Group__1__Impl ;
    public final void rule__GrainIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2126:1: ( rule__GrainIs__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2127:2: rule__GrainIs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GrainIs__Group__1__Impl_in_rule__GrainIs__Group__14333);
            rule__GrainIs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__1"


    // $ANTLR start "rule__GrainIs__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2133:1: rule__GrainIs__Group__1__Impl : ( ( rule__GrainIs__StateAssignment_1 ) ) ;
    public final void rule__GrainIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2137:1: ( ( ( rule__GrainIs__StateAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2138:1: ( ( rule__GrainIs__StateAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2138:1: ( ( rule__GrainIs__StateAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2139:1: ( rule__GrainIs__StateAssignment_1 )
            {
             before(grammarAccess.getGrainIsAccess().getStateAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2140:1: ( rule__GrainIs__StateAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2140:2: rule__GrainIs__StateAssignment_1
            {
            pushFollow(FOLLOW_rule__GrainIs__StateAssignment_1_in_rule__GrainIs__Group__1__Impl4360);
            rule__GrainIs__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrainIsAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2154:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2158:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2159:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04394);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04397);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2166:1: rule__Date__Group__0__Impl : ( ( rule__Date__DayAssignment_0 ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2170:1: ( ( ( rule__Date__DayAssignment_0 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2171:1: ( ( rule__Date__DayAssignment_0 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2171:1: ( ( rule__Date__DayAssignment_0 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2172:1: ( rule__Date__DayAssignment_0 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2173:1: ( rule__Date__DayAssignment_0 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2173:2: rule__Date__DayAssignment_0
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_0_in_rule__Date__Group__0__Impl4424);
            rule__Date__DayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2183:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2187:1: ( rule__Date__Group__1__Impl )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2188:2: rule__Date__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14454);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2194:1: rule__Date__Group__1__Impl : ( ( rule__Date__MonthAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2198:1: ( ( ( rule__Date__MonthAssignment_1 ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2199:1: ( ( rule__Date__MonthAssignment_1 ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2199:1: ( ( rule__Date__MonthAssignment_1 ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2200:1: ( rule__Date__MonthAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_1()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2201:1: ( rule__Date__MonthAssignment_1 )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2201:2: rule__Date__MonthAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_1_in_rule__Date__Group__1__Impl4481);
            rule__Date__MonthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Model__CulturesAssignment_0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2216:1: rule__Model__CulturesAssignment_0 : ( ruleCulture ) ;
    public final void rule__Model__CulturesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2220:1: ( ( ruleCulture ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2221:1: ( ruleCulture )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2221:1: ( ruleCulture )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2222:1: ruleCulture
            {
             before(grammarAccess.getModelAccess().getCulturesCultureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCulture_in_rule__Model__CulturesAssignment_04520);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCulturesCultureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CulturesAssignment_0"


    // $ANTLR start "rule__Model__ResourceKindsAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2231:1: rule__Model__ResourceKindsAssignment_1 : ( ruleResourceKind ) ;
    public final void rule__Model__ResourceKindsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2235:1: ( ( ruleResourceKind ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2236:1: ( ruleResourceKind )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2236:1: ( ruleResourceKind )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2237:1: ruleResourceKind
            {
             before(grammarAccess.getModelAccess().getResourceKindsResourceKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResourceKind_in_rule__Model__ResourceKindsAssignment_14551);
            ruleResourceKind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getResourceKindsResourceKindParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ResourceKindsAssignment_1"


    // $ANTLR start "rule__ResourceKind__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2246:1: rule__ResourceKind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResourceKind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2250:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2251:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2251:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2252:1: RULE_ID
            {
             before(grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceKind__NameAssignment_14582); 
             after(grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceKind__NameAssignment_1"


    // $ANTLR start "rule__Culture__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2261:1: rule__Culture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Culture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2265:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2266:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2266:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2267:1: RULE_ID
            {
             before(grammarAccess.getCultureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Culture__NameAssignment_14613); 
             after(grammarAccess.getCultureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__NameAssignment_1"


    // $ANTLR start "rule__Culture__ActivitiesAssignment_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2276:1: rule__Culture__ActivitiesAssignment_3 : ( ruleExploitationActivity ) ;
    public final void rule__Culture__ActivitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2280:1: ( ( ruleExploitationActivity ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2281:1: ( ruleExploitationActivity )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2281:1: ( ruleExploitationActivity )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2282:1: ruleExploitationActivity
            {
             before(grammarAccess.getCultureAccess().getActivitiesExploitationActivityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExploitationActivity_in_rule__Culture__ActivitiesAssignment_34644);
            ruleExploitationActivity();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getActivitiesExploitationActivityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__ActivitiesAssignment_3"


    // $ANTLR start "rule__ExploitationActivity__NameAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2291:1: rule__ExploitationActivity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExploitationActivity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2295:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2296:1: ( RULE_ID )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2296:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2297:1: RULE_ID
            {
             before(grammarAccess.getExploitationActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExploitationActivity__NameAssignment_14675); 
             after(grammarAccess.getExploitationActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__NameAssignment_1"


    // $ANTLR start "rule__ExploitationActivity__FrequencyAssignment_2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2306:1: rule__ExploitationActivity__FrequencyAssignment_2 : ( ruleFrequency ) ;
    public final void rule__ExploitationActivity__FrequencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2310:1: ( ( ruleFrequency ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2311:1: ( ruleFrequency )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2311:1: ( ruleFrequency )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2312:1: ruleFrequency
            {
             before(grammarAccess.getExploitationActivityAccess().getFrequencyFrequencyEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFrequency_in_rule__ExploitationActivity__FrequencyAssignment_24706);
            ruleFrequency();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getFrequencyFrequencyEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__FrequencyAssignment_2"


    // $ANTLR start "rule__ExploitationActivity__StartDateAssignment_3_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2321:1: rule__ExploitationActivity__StartDateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__ExploitationActivity__StartDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2325:1: ( ( ruleDate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2326:1: ( ruleDate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2326:1: ( ruleDate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2327:1: ruleDate
            {
             before(grammarAccess.getExploitationActivityAccess().getStartDateDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__ExploitationActivity__StartDateAssignment_3_14737);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getStartDateDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__StartDateAssignment_3_1"


    // $ANTLR start "rule__ExploitationActivity__EndDateAssignment_3_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2336:1: rule__ExploitationActivity__EndDateAssignment_3_3 : ( ruleDate ) ;
    public final void rule__ExploitationActivity__EndDateAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2340:1: ( ( ruleDate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2341:1: ( ruleDate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2341:1: ( ruleDate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2342:1: ruleDate
            {
             before(grammarAccess.getExploitationActivityAccess().getEndDateDateParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__ExploitationActivity__EndDateAssignment_3_34768);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getEndDateDateParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__EndDateAssignment_3_3"


    // $ANTLR start "rule__ExploitationActivity__PredicatesAssignment_4_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2351:1: rule__ExploitationActivity__PredicatesAssignment_4_1 : ( rulePredicate ) ;
    public final void rule__ExploitationActivity__PredicatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2355:1: ( ( rulePredicate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2356:1: ( rulePredicate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2356:1: ( rulePredicate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2357:1: rulePredicate
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_14799);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__PredicatesAssignment_4_1"


    // $ANTLR start "rule__ExploitationActivity__PredicatesAssignment_4_2_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2366:1: rule__ExploitationActivity__PredicatesAssignment_4_2_1 : ( rulePredicate ) ;
    public final void rule__ExploitationActivity__PredicatesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2370:1: ( ( rulePredicate ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2371:1: ( rulePredicate )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2371:1: ( rulePredicate )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2372:1: rulePredicate
            {
             before(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_2_14830);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getPredicatesPredicateParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__PredicatesAssignment_4_2_1"


    // $ANTLR start "rule__ExploitationActivity__UsesAssignment_5_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2381:1: rule__ExploitationActivity__UsesAssignment_5_1 : ( ruleActivityResource ) ;
    public final void rule__ExploitationActivity__UsesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2385:1: ( ( ruleActivityResource ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2386:1: ( ruleActivityResource )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2386:1: ( ruleActivityResource )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2387:1: ruleActivityResource
            {
             before(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleActivityResource_in_rule__ExploitationActivity__UsesAssignment_5_14861);
            ruleActivityResource();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__UsesAssignment_5_1"


    // $ANTLR start "rule__ExploitationActivity__UsesAssignment_5_2_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2396:1: rule__ExploitationActivity__UsesAssignment_5_2_1 : ( ruleActivityResource ) ;
    public final void rule__ExploitationActivity__UsesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2400:1: ( ( ruleActivityResource ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2401:1: ( ruleActivityResource )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2401:1: ( ruleActivityResource )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2402:1: ruleActivityResource
            {
             before(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleActivityResource_in_rule__ExploitationActivity__UsesAssignment_5_2_14892);
            ruleActivityResource();

            state._fsp--;

             after(grammarAccess.getExploitationActivityAccess().getUsesActivityResourceParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExploitationActivity__UsesAssignment_5_2_1"


    // $ANTLR start "rule__ActivityResource__QuantityAssignment_0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2411:1: rule__ActivityResource__QuantityAssignment_0 : ( RULE_INT ) ;
    public final void rule__ActivityResource__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2415:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2416:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2416:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2417:1: RULE_INT
            {
             before(grammarAccess.getActivityResourceAccess().getQuantityINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ActivityResource__QuantityAssignment_04923); 
             after(grammarAccess.getActivityResourceAccess().getQuantityINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__QuantityAssignment_0"


    // $ANTLR start "rule__ActivityResource__ResourceKindAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2426:1: rule__ActivityResource__ResourceKindAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActivityResource__ResourceKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2430:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2431:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2431:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2432:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityResourceAccess().getResourceKindResourceKindCrossReference_1_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2433:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2434:1: RULE_ID
            {
             before(grammarAccess.getActivityResourceAccess().getResourceKindResourceKindIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityResource__ResourceKindAssignment_14958); 
             after(grammarAccess.getActivityResourceAccess().getResourceKindResourceKindIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActivityResourceAccess().getResourceKindResourceKindCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityResource__ResourceKindAssignment_1"


    // $ANTLR start "rule__NoRain__DaysAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2445:1: rule__NoRain__DaysAssignment_1 : ( RULE_INT ) ;
    public final void rule__NoRain__DaysAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2449:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2450:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2450:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2451:1: RULE_INT
            {
             before(grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NoRain__DaysAssignment_14993); 
             after(grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__DaysAssignment_1"


    // $ANTLR start "rule__TempOfTheDay__ComparisonAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2460:1: rule__TempOfTheDay__ComparisonAssignment_1 : ( ruleComp ) ;
    public final void rule__TempOfTheDay__ComparisonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2464:1: ( ( ruleComp ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2465:1: ( ruleComp )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2465:1: ( ruleComp )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2466:1: ruleComp
            {
             before(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComp_in_rule__TempOfTheDay__ComparisonAssignment_15024);
            ruleComp();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__ComparisonAssignment_1"


    // $ANTLR start "rule__TempOfTheDay__LowerTempBoundAssignment_2"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2475:1: rule__TempOfTheDay__LowerTempBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__TempOfTheDay__LowerTempBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2479:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2480:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2480:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2481:1: RULE_INT
            {
             before(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TempOfTheDay__LowerTempBoundAssignment_25055); 
             after(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__LowerTempBoundAssignment_2"


    // $ANTLR start "rule__TempOfTheDay__UnitAssignment_3"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2490:1: rule__TempOfTheDay__UnitAssignment_3 : ( ruleTempUnit ) ;
    public final void rule__TempOfTheDay__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2494:1: ( ( ruleTempUnit ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2495:1: ( ruleTempUnit )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2495:1: ( ruleTempUnit )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2496:1: ruleTempUnit
            {
             before(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTempUnit_in_rule__TempOfTheDay__UnitAssignment_35086);
            ruleTempUnit();

            state._fsp--;

             after(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempOfTheDay__UnitAssignment_3"


    // $ANTLR start "rule__DelaySinceActivy__PrerequisiteAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2505:1: rule__DelaySinceActivy__PrerequisiteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DelaySinceActivy__PrerequisiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2509:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2510:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2510:1: ( ( RULE_ID ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2511:1: ( RULE_ID )
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityCrossReference_1_0()); 
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2512:1: ( RULE_ID )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2513:1: RULE_ID
            {
             before(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DelaySinceActivy__PrerequisiteAssignment_15121); 
             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDelaySinceActivyAccess().getPrerequisiteExploitationActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__PrerequisiteAssignment_1"


    // $ANTLR start "rule__DelaySinceActivy__DaysAssignment_2_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2524:1: rule__DelaySinceActivy__DaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__DelaySinceActivy__DaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2528:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2529:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2529:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2530:1: RULE_INT
            {
             before(grammarAccess.getDelaySinceActivyAccess().getDaysINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DelaySinceActivy__DaysAssignment_2_15156); 
             after(grammarAccess.getDelaySinceActivyAccess().getDaysINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelaySinceActivy__DaysAssignment_2_1"


    // $ANTLR start "rule__GrainIs__StateAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2539:1: rule__GrainIs__StateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GrainIs__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2543:1: ( ( RULE_STRING ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2544:1: ( RULE_STRING )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2544:1: ( RULE_STRING )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2545:1: RULE_STRING
            {
             before(grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GrainIs__StateAssignment_15187); 
             after(grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainIs__StateAssignment_1"


    // $ANTLR start "rule__Date__DayAssignment_0"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2554:1: rule__Date__DayAssignment_0 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2558:1: ( ( RULE_INT ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2559:1: ( RULE_INT )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2559:1: ( RULE_INT )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2560:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_05218); 
             after(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_0"


    // $ANTLR start "rule__Date__MonthAssignment_1"
    // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2569:1: rule__Date__MonthAssignment_1 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2573:1: ( ( ruleMonth ) )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2574:1: ( ruleMonth )
            {
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2574:1: ( ruleMonth )
            // ../org.gemoc.agro.activities.ui/src-gen/org/gemoc/agro/ui/contentassist/antlr/internal/InternalActivitiesDSL.g:2575:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_15249);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceKind_in_entryRuleResourceKind121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceKind128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__0_in_ruleResourceKind154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCulture188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_entryRuleExploitationActivity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploitationActivity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__0_in_ruleExploitationActivity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityResource_in_entryRuleActivityResource301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityResource308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityResource__Group__0_in_ruleActivityResource334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Alternatives_in_rulePredicate394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRain428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__0_in_ruleNoRain454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_entryRuleTempOfTheDay481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTempOfTheDay488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__0_in_ruleTempOfTheDay514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_entryRuleDelaySinceActivy541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelaySinceActivy548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__0_in_ruleDelaySinceActivy574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_entryRuleGrainIs601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrainIs608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__0_in_ruleGrainIs634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comp__Alternatives_in_ruleComp767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempUnit__Alternatives_in_ruleTempUnit803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Frequency__Alternatives_in_ruleFrequency839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempOfTheDay_in_rule__Predicate__Alternatives891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelaySinceActivy_in_rule__Predicate__Alternatives908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrainIs_in_rule__Predicate__Alternatives925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Month__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Month__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Month__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Month__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Month__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Month__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Month__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Month__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Month__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Month__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Month__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Month__Alternatives1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comp__Alternatives1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comp__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TempUnit__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TempUnit__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Frequency__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Frequency__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Frequency__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Frequency__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Frequency__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Frequency__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01477 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CulturesAssignment_0_in_rule__Model__Group__0__Impl1507 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ResourceKindsAssignment_1_in_rule__Model__Group__1__Impl1565 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__0__Impl_in_rule__ResourceKind__Group__01600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__1_in_rule__ResourceKind__Group__01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ResourceKind__Group__0__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__Group__1__Impl_in_rule__ResourceKind__Group__11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceKind__NameAssignment_1_in_rule__ResourceKind__Group__1__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__01723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Culture__Group__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__11785 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__NameAssignment_1_in_rule__Culture__Group__1__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__21845 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__21848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Culture__Group__2__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__31907 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__31910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Culture__ActivitiesAssignment_3_in_rule__Culture__Group__3__Impl1937 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__41968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Culture__Group__4__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__0__Impl_in_rule__ExploitationActivity__Group__02037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__1_in_rule__ExploitationActivity__Group__02040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExploitationActivity__Group__0__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__1__Impl_in_rule__ExploitationActivity__Group__12099 = new BitSet(new long[]{0x00000941F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__2_in_rule__ExploitationActivity__Group__12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__NameAssignment_1_in_rule__ExploitationActivity__Group__1__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__2__Impl_in_rule__ExploitationActivity__Group__22159 = new BitSet(new long[]{0x00000941F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__3_in_rule__ExploitationActivity__Group__22162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__FrequencyAssignment_2_in_rule__ExploitationActivity__Group__2__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__3__Impl_in_rule__ExploitationActivity__Group__32220 = new BitSet(new long[]{0x00000941F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__4_in_rule__ExploitationActivity__Group__32223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__0_in_rule__ExploitationActivity__Group__3__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__4__Impl_in_rule__ExploitationActivity__Group__42281 = new BitSet(new long[]{0x00000941F8000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__5_in_rule__ExploitationActivity__Group__42284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__0_in_rule__ExploitationActivity__Group__4__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group__5__Impl_in_rule__ExploitationActivity__Group__52342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__0_in_rule__ExploitationActivity__Group__5__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__0__Impl_in_rule__ExploitationActivity__Group_3__02412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__1_in_rule__ExploitationActivity__Group_3__02415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExploitationActivity__Group_3__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__1__Impl_in_rule__ExploitationActivity__Group_3__12474 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__2_in_rule__ExploitationActivity__Group_3__12477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__StartDateAssignment_3_1_in_rule__ExploitationActivity__Group_3__1__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__2__Impl_in_rule__ExploitationActivity__Group_3__22534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__3_in_rule__ExploitationActivity__Group_3__22537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExploitationActivity__Group_3__2__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_3__3__Impl_in_rule__ExploitationActivity__Group_3__32596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__EndDateAssignment_3_3_in_rule__ExploitationActivity__Group_3__3__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__0__Impl_in_rule__ExploitationActivity__Group_4__02661 = new BitSet(new long[]{0x0005A00000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__1_in_rule__ExploitationActivity__Group_4__02664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExploitationActivity__Group_4__0__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__1__Impl_in_rule__ExploitationActivity__Group_4__12723 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__2_in_rule__ExploitationActivity__Group_4__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_1_in_rule__ExploitationActivity__Group_4__1__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__2__Impl_in_rule__ExploitationActivity__Group_4__22783 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__3_in_rule__ExploitationActivity__Group_4__22786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__0_in_rule__ExploitationActivity__Group_4__2__Impl2813 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4__3__Impl_in_rule__ExploitationActivity__Group_4__32844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExploitationActivity__Group_4__3__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__0__Impl_in_rule__ExploitationActivity__Group_4_2__02911 = new BitSet(new long[]{0x0005A00000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__1_in_rule__ExploitationActivity__Group_4_2__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExploitationActivity__Group_4_2__0__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_4_2__1__Impl_in_rule__ExploitationActivity__Group_4_2__12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__PredicatesAssignment_4_2_1_in_rule__ExploitationActivity__Group_4_2__1__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__0__Impl_in_rule__ExploitationActivity__Group_5__03034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__1_in_rule__ExploitationActivity__Group_5__03037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExploitationActivity__Group_5__0__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__1__Impl_in_rule__ExploitationActivity__Group_5__13096 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__2_in_rule__ExploitationActivity__Group_5__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__UsesAssignment_5_1_in_rule__ExploitationActivity__Group_5__1__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5__2__Impl_in_rule__ExploitationActivity__Group_5__23156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5_2__0_in_rule__ExploitationActivity__Group_5__2__Impl3183 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5_2__0__Impl_in_rule__ExploitationActivity__Group_5_2__03220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5_2__1_in_rule__ExploitationActivity__Group_5_2__03223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExploitationActivity__Group_5_2__0__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__Group_5_2__1__Impl_in_rule__ExploitationActivity__Group_5_2__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExploitationActivity__UsesAssignment_5_2_1_in_rule__ExploitationActivity__Group_5_2__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityResource__Group__0__Impl_in_rule__ActivityResource__Group__03343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityResource__Group__1_in_rule__ActivityResource__Group__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityResource__QuantityAssignment_0_in_rule__ActivityResource__Group__0__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityResource__Group__1__Impl_in_rule__ActivityResource__Group__13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityResource__ResourceKindAssignment_1_in_rule__ActivityResource__Group__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__03464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__03467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NoRain__Group__0__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__13526 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__DaysAssignment_1_in_rule__NoRain__Group__1__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__23586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NoRain__Group__2__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__0__Impl_in_rule__TempOfTheDay__Group__03651 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__1_in_rule__TempOfTheDay__Group__03654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TempOfTheDay__Group__0__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__1__Impl_in_rule__TempOfTheDay__Group__13713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__2_in_rule__TempOfTheDay__Group__13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__ComparisonAssignment_1_in_rule__TempOfTheDay__Group__1__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__2__Impl_in_rule__TempOfTheDay__Group__23773 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__3_in_rule__TempOfTheDay__Group__23776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__LowerTempBoundAssignment_2_in_rule__TempOfTheDay__Group__2__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__Group__3__Impl_in_rule__TempOfTheDay__Group__33833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TempOfTheDay__UnitAssignment_3_in_rule__TempOfTheDay__Group__3__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__0__Impl_in_rule__DelaySinceActivy__Group__03898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__1_in_rule__DelaySinceActivy__Group__03901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DelaySinceActivy__Group__0__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__1__Impl_in_rule__DelaySinceActivy__Group__13960 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__2_in_rule__DelaySinceActivy__Group__13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__PrerequisiteAssignment_1_in_rule__DelaySinceActivy__Group__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group__2__Impl_in_rule__DelaySinceActivy__Group__24020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__0_in_rule__DelaySinceActivy__Group__2__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__0__Impl_in_rule__DelaySinceActivy__Group_2__04084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__1_in_rule__DelaySinceActivy__Group_2__04087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DelaySinceActivy__Group_2__0__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__1__Impl_in_rule__DelaySinceActivy__Group_2__14146 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__2_in_rule__DelaySinceActivy__Group_2__14149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__DaysAssignment_2_1_in_rule__DelaySinceActivy__Group_2__1__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelaySinceActivy__Group_2__2__Impl_in_rule__DelaySinceActivy__Group_2__24206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DelaySinceActivy__Group_2__2__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__0__Impl_in_rule__GrainIs__Group__04271 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__1_in_rule__GrainIs__Group__04274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__GrainIs__Group__0__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__Group__1__Impl_in_rule__GrainIs__Group__14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrainIs__StateAssignment_1_in_rule__GrainIs__Group__1__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04394 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_0_in_rule__Date__Group__0__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_1_in_rule__Date__Group__1__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCulture_in_rule__Model__CulturesAssignment_04520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceKind_in_rule__Model__ResourceKindsAssignment_14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceKind__NameAssignment_14582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Culture__NameAssignment_14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploitationActivity_in_rule__Culture__ActivitiesAssignment_34644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExploitationActivity__NameAssignment_14675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequency_in_rule__ExploitationActivity__FrequencyAssignment_24706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__ExploitationActivity__StartDateAssignment_3_14737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__ExploitationActivity__EndDateAssignment_3_34768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__ExploitationActivity__PredicatesAssignment_4_2_14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityResource_in_rule__ExploitationActivity__UsesAssignment_5_14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityResource_in_rule__ExploitationActivity__UsesAssignment_5_2_14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ActivityResource__QuantityAssignment_04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityResource__ResourceKindAssignment_14958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NoRain__DaysAssignment_14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComp_in_rule__TempOfTheDay__ComparisonAssignment_15024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TempOfTheDay__LowerTempBoundAssignment_25055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTempUnit_in_rule__TempOfTheDay__UnitAssignment_35086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DelaySinceActivy__PrerequisiteAssignment_15121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DelaySinceActivy__DaysAssignment_2_15156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GrainIs__StateAssignment_15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_05218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_15249 = new BitSet(new long[]{0x0000000000000002L});

}