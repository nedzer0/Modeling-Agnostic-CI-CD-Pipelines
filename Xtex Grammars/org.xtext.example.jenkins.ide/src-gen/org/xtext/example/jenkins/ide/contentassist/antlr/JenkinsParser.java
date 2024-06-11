/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.jenkins.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.jenkins.ide.contentassist.antlr.internal.InternalJenkinsParser;
import org.xtext.example.jenkins.services.JenkinsGrammarAccess;

public class JenkinsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JenkinsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JenkinsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getParameter_DirectiveAccess().getAlternatives(), "rule__Parameter_Directive__Alternatives");
			builder.put(grammarAccess.getAgentAccess().getAlternatives(), "rule__Agent__Alternatives");
			builder.put(grammarAccess.getTriggerAccess().getAlternatives(), "rule__Trigger__Alternatives");
			builder.put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
			builder.put(grammarAccess.getWhenAccess().getAlternatives(), "rule__When__Alternatives");
			builder.put(grammarAccess.getStageOptionAccess().getAlternatives(), "rule__StageOption__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getCOMPARATOR_TYPEAccess().getAlternatives(), "rule__COMPARATOR_TYPE__Alternatives");
			builder.put(grammarAccess.getATTRIBUTE_TYPEAccess().getAlternatives(), "rule__ATTRIBUTE_TYPE__Alternatives");
			builder.put(grammarAccess.getPOST_TYPEAccess().getAlternatives(), "rule__POST_TYPE__Alternatives");
			builder.put(grammarAccess.getTOOL_TYPEAccess().getAlternatives(), "rule__TOOL_TYPE__Alternatives");
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2(), "rule__Pipeline__Group_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_3(), "rule__Pipeline__Group_3__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_4(), "rule__Pipeline__Group_4__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_5(), "rule__Pipeline__Group_5__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_6(), "rule__Pipeline__Group_6__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_7(), "rule__Pipeline__Group_7__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_8(), "rule__Pipeline__Group_8__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_9(), "rule__Pipeline__Group_9__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_1(), "rule__Environment__Group_1__0");
			builder.put(grammarAccess.getStageAccess().getGroup(), "rule__Stage__Group__0");
			builder.put(grammarAccess.getStageAccess().getGroup_1(), "rule__Stage__Group_1__0");
			builder.put(grammarAccess.getPostAccess().getGroup(), "rule__Post__Group__0");
			builder.put(grammarAccess.getPostAccess().getGroup_1(), "rule__Post__Group_1__0");
			builder.put(grammarAccess.getToolAccess().getGroup(), "rule__Tool__Group__0");
			builder.put(grammarAccess.getToolAccess().getGroup_1(), "rule__Tool__Group_1__0");
			builder.put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
			builder.put(grammarAccess.getStepAccess().getGroup_1(), "rule__Step__Group_1__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1_3(), "rule__Input__Group_1_3__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1_4(), "rule__Input__Group_1_4__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1_5(), "rule__Input__Group_1_5__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1_6(), "rule__Input__Group_1_6__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup(), "rule__Matrix__Group__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1(), "rule__Matrix__Group_1__0");
			builder.put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_2(), "rule__Command__Group_2__0");
			builder.put(grammarAccess.getStep_ParameterAccess().getGroup(), "rule__Step_Parameter__Group__0");
			builder.put(grammarAccess.getStep_ParameterAccess().getGroup_1(), "rule__Step_Parameter__Group_1__0");
			builder.put(grammarAccess.getBuildingTagAccess().getGroup(), "rule__BuildingTag__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup_1(), "rule__Branch__Group_1__0");
			builder.put(grammarAccess.getBranchAccess().getGroup_1_3(), "rule__Branch__Group_1_3__0");
			builder.put(grammarAccess.getChangelogAccess().getGroup(), "rule__Changelog__Group__0");
			builder.put(grammarAccess.getChangelogAccess().getGroup_1(), "rule__Changelog__Group_1__0");
			builder.put(grammarAccess.getTriggeredByAccess().getGroup(), "rule__TriggeredBy__Group__0");
			builder.put(grammarAccess.getTriggeredByAccess().getGroup_1(), "rule__TriggeredBy__Group_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getChangeSetAccess().getGroup(), "rule__ChangeSet__Group__0");
			builder.put(grammarAccess.getChangeSetAccess().getGroup_1(), "rule__ChangeSet__Group_1__0");
			builder.put(grammarAccess.getChangeSetAccess().getGroup_1_3(), "rule__ChangeSet__Group_1_3__0");
			builder.put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
			builder.put(grammarAccess.getNotAccess().getGroup_2(), "rule__Not__Group_2__0");
			builder.put(grammarAccess.getAnyOfAccess().getGroup(), "rule__AnyOf__Group__0");
			builder.put(grammarAccess.getAnyOfAccess().getGroup_2(), "rule__AnyOf__Group_2__0");
			builder.put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
			builder.put(grammarAccess.getTagAccess().getGroup_1(), "rule__Tag__Group_1__0");
			builder.put(grammarAccess.getTagAccess().getGroup_1_3(), "rule__Tag__Group_1_3__0");
			builder.put(grammarAccess.getWhen_EnvAccess().getGroup(), "rule__When_Env__Group__0");
			builder.put(grammarAccess.getWhen_EnvAccess().getGroup_1(), "rule__When_Env__Group_1__0");
			builder.put(grammarAccess.getAllOfAccess().getGroup(), "rule__AllOf__Group__0");
			builder.put(grammarAccess.getAllOfAccess().getGroup_1(), "rule__AllOf__Group_1__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
			builder.put(grammarAccess.getEqualsAccess().getGroup_1(), "rule__Equals__Group_1__0");
			builder.put(grammarAccess.getChangeRequestAccess().getGroup(), "rule__ChangeRequest__Group__0");
			builder.put(grammarAccess.getChangeRequestAccess().getGroup_1(), "rule__ChangeRequest__Group_1__0");
			builder.put(grammarAccess.getChangeRequestAccess().getGroup_1_5(), "rule__ChangeRequest__Group_1_5__0");
			builder.put(grammarAccess.getSkipDefaultCheckoutAccess().getGroup(), "rule__SkipDefaultCheckout__Group__0");
			builder.put(grammarAccess.getRetryAccess().getGroup(), "rule__Retry__Group__0");
			builder.put(grammarAccess.getRetryAccess().getGroup_1(), "rule__Retry__Group_1__0");
			builder.put(grammarAccess.getTimeoutAccess().getGroup(), "rule__Timeout__Group__0");
			builder.put(grammarAccess.getTimeoutAccess().getGroup_1(), "rule__Timeout__Group_1__0");
			builder.put(grammarAccess.getTimestampsAccess().getGroup(), "rule__Timestamps__Group__0");
			builder.put(grammarAccess.getEShortAccess().getGroup(), "rule__EShort__Group__0");
			builder.put(grammarAccess.getAxisAccess().getGroup(), "rule__Axis__Group__0");
			builder.put(grammarAccess.getAxisAccess().getGroup_1(), "rule__Axis__Group_1__0");
			builder.put(grammarAccess.getAxisAccess().getGroup_1_5(), "rule__Axis__Group_1_5__0");
			builder.put(grammarAccess.getStringParamAccess().getGroup(), "rule__StringParam__Group__0");
			builder.put(grammarAccess.getStringParamAccess().getGroup_1(), "rule__StringParam__Group_1__0");
			builder.put(grammarAccess.getStringParamAccess().getGroup_1_3(), "rule__StringParam__Group_1_3__0");
			builder.put(grammarAccess.getTextParamAccess().getGroup(), "rule__TextParam__Group__0");
			builder.put(grammarAccess.getTextParamAccess().getGroup_1(), "rule__TextParam__Group_1__0");
			builder.put(grammarAccess.getTextParamAccess().getGroup_1_3(), "rule__TextParam__Group_1_3__0");
			builder.put(grammarAccess.getChoiceParamAccess().getGroup(), "rule__ChoiceParam__Group__0");
			builder.put(grammarAccess.getChoiceParamAccess().getGroup_1(), "rule__ChoiceParam__Group_1__0");
			builder.put(grammarAccess.getChoiceParamAccess().getGroup_1_3(), "rule__ChoiceParam__Group_1_3__0");
			builder.put(grammarAccess.getChoiceParamAccess().getGroup_1_6(), "rule__ChoiceParam__Group_1_6__0");
			builder.put(grammarAccess.getPasswordParamAccess().getGroup(), "rule__PasswordParam__Group__0");
			builder.put(grammarAccess.getPasswordParamAccess().getGroup_1(), "rule__PasswordParam__Group_1__0");
			builder.put(grammarAccess.getPasswordParamAccess().getGroup_1_3(), "rule__PasswordParam__Group_1_3__0");
			builder.put(grammarAccess.getBooleanParamAccess().getGroup(), "rule__BooleanParam__Group__0");
			builder.put(grammarAccess.getBooleanParamAccess().getGroup_1(), "rule__BooleanParam__Group_1__0");
			builder.put(grammarAccess.getBooleanParamAccess().getGroup_1_3(), "rule__BooleanParam__Group_1_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_1(), "rule__Node__Group_1__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_1_3(), "rule__Node__Group_1_3__0");
			builder.put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
			builder.put(grammarAccess.getNoneAccess().getGroup(), "rule__None__Group__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup(), "rule__Dockerfile__Group__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1(), "rule__Dockerfile__Group_1__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_3(), "rule__Dockerfile__Group_1_3__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_4(), "rule__Dockerfile__Group_1_4__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_5(), "rule__Dockerfile__Group_1_5__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_6(), "rule__Dockerfile__Group_1_6__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_7(), "rule__Dockerfile__Group_1_7__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_8(), "rule__Dockerfile__Group_1_8__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_9(), "rule__Dockerfile__Group_1_9__0");
			builder.put(grammarAccess.getDockerfileAccess().getGroup_1_10(), "rule__Dockerfile__Group_1_10__0");
			builder.put(grammarAccess.getDockerAccess().getGroup(), "rule__Docker__Group__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1(), "rule__Docker__Group_1__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_3(), "rule__Docker__Group_1_3__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_4(), "rule__Docker__Group_1_4__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_5(), "rule__Docker__Group_1_5__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_6(), "rule__Docker__Group_1_6__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_7(), "rule__Docker__Group_1_7__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_8(), "rule__Docker__Group_1_8__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup_1(), "rule__Label__Group_1__0");
			builder.put(grammarAccess.getCronAccess().getGroup(), "rule__Cron__Group__0");
			builder.put(grammarAccess.getCronAccess().getGroup_1(), "rule__Cron__Group_1__0");
			builder.put(grammarAccess.getPollSCMAccess().getGroup(), "rule__PollSCM__Group__0");
			builder.put(grammarAccess.getPollSCMAccess().getGroup_1(), "rule__PollSCM__Group_1__0");
			builder.put(grammarAccess.getUpstreamAccess().getGroup(), "rule__Upstream__Group__0");
			builder.put(grammarAccess.getUpstreamAccess().getGroup_1(), "rule__Upstream__Group_1__0");
			builder.put(grammarAccess.getUpstreamAccess().getGroup_1_3(), "rule__Upstream__Group_1_3__0");
			builder.put(grammarAccess.getBuildDiscarderAccess().getGroup(), "rule__BuildDiscarder__Group__0");
			builder.put(grammarAccess.getBuildDiscarderAccess().getGroup_1(), "rule__BuildDiscarder__Group_1__0");
			builder.put(grammarAccess.getCheckoutToSubdirectoryAccess().getGroup(), "rule__CheckoutToSubdirectory__Group__0");
			builder.put(grammarAccess.getCheckoutToSubdirectoryAccess().getGroup_1(), "rule__CheckoutToSubdirectory__Group_1__0");
			builder.put(grammarAccess.getSkipStagesAfterUnstableAccess().getGroup(), "rule__SkipStagesAfterUnstable__Group__0");
			builder.put(grammarAccess.getQuietPeriodAccess().getGroup(), "rule__QuietPeriod__Group__0");
			builder.put(grammarAccess.getQuietPeriodAccess().getGroup_2(), "rule__QuietPeriod__Group_2__0");
			builder.put(grammarAccess.getPreserveStashesAccess().getGroup(), "rule__PreserveStashes__Group__0");
			builder.put(grammarAccess.getPreserveStashesAccess().getGroup_2(), "rule__PreserveStashes__Group_2__0");
			builder.put(grammarAccess.getPreserveStashesAccess().getGroup_2_1(), "rule__PreserveStashes__Group_2_1__0");
			builder.put(grammarAccess.getParallelsAlwaysFailFastAccess().getGroup(), "rule__ParallelsAlwaysFailFast__Group__0");
			builder.put(grammarAccess.getDisableRestartFromStageAccess().getGroup(), "rule__DisableRestartFromStage__Group__0");
			builder.put(grammarAccess.getDisableResumeAccess().getGroup(), "rule__DisableResume__Group__0");
			builder.put(grammarAccess.getOverrideIndexTriggersAccess().getGroup(), "rule__OverrideIndexTriggers__Group__0");
			builder.put(grammarAccess.getOverrideIndexTriggersAccess().getGroup_2(), "rule__OverrideIndexTriggers__Group_2__0");
			builder.put(grammarAccess.getNewContainerPerStageAccess().getGroup(), "rule__NewContainerPerStage__Group__0");
			builder.put(grammarAccess.getDisableConcurrentBuildsAccess().getGroup(), "rule__DisableConcurrentBuilds__Group__0");
			builder.put(grammarAccess.getDisableConcurrentBuildsAccess().getGroup_2(), "rule__DisableConcurrentBuilds__Group_2__0");
			builder.put(grammarAccess.getPipelineAccess().getAgentsAssignment_2_0(), "rule__Pipeline__AgentsAssignment_2_0");
			builder.put(grammarAccess.getPipelineAccess().getOptionsAssignment_3_0(), "rule__Pipeline__OptionsAssignment_3_0");
			builder.put(grammarAccess.getPipelineAccess().getTriggersAssignment_4_0(), "rule__Pipeline__TriggersAssignment_4_0");
			builder.put(grammarAccess.getPipelineAccess().getParameter_directivesAssignment_5_0(), "rule__Pipeline__Parameter_directivesAssignment_5_0");
			builder.put(grammarAccess.getPipelineAccess().getEnvironmentsAssignment_6_0(), "rule__Pipeline__EnvironmentsAssignment_6_0");
			builder.put(grammarAccess.getPipelineAccess().getToolsAssignment_7_0(), "rule__Pipeline__ToolsAssignment_7_0");
			builder.put(grammarAccess.getPipelineAccess().getStagesAssignment_8_0(), "rule__Pipeline__StagesAssignment_8_0");
			builder.put(grammarAccess.getPipelineAccess().getPostAssignment_9_0(), "rule__Pipeline__PostAssignment_9_0");
			builder.put(grammarAccess.getEnvironmentAccess().getKeyAssignment_1_2(), "rule__Environment__KeyAssignment_1_2");
			builder.put(grammarAccess.getEnvironmentAccess().getValueAssignment_1_4(), "rule__Environment__ValueAssignment_1_4");
			builder.put(grammarAccess.getStageAccess().getNameAssignment_1_2(), "rule__Stage__NameAssignment_1_2");
			builder.put(grammarAccess.getStageAccess().getParallelAssignment_1_3(), "rule__Stage__ParallelAssignment_1_3");
			builder.put(grammarAccess.getStageAccess().getFailFastAssignment_1_4(), "rule__Stage__FailFastAssignment_1_4");
			builder.put(grammarAccess.getStageAccess().getStagesAssignment_1_5(), "rule__Stage__StagesAssignment_1_5");
			builder.put(grammarAccess.getStageAccess().getAgentsAssignment_1_6(), "rule__Stage__AgentsAssignment_1_6");
			builder.put(grammarAccess.getStageAccess().getStepsAssignment_1_7(), "rule__Stage__StepsAssignment_1_7");
			builder.put(grammarAccess.getStageAccess().getEnvironmentsAssignment_1_8(), "rule__Stage__EnvironmentsAssignment_1_8");
			builder.put(grammarAccess.getStageAccess().getInputsAssignment_1_9(), "rule__Stage__InputsAssignment_1_9");
			builder.put(grammarAccess.getStageAccess().getWhenAssignment_1_10(), "rule__Stage__WhenAssignment_1_10");
			builder.put(grammarAccess.getStageAccess().getStage_optionsAssignment_1_11(), "rule__Stage__Stage_optionsAssignment_1_11");
			builder.put(grammarAccess.getStageAccess().getMatrixAssignment_1_12(), "rule__Stage__MatrixAssignment_1_12");
			builder.put(grammarAccess.getPostAccess().getConditionAssignment_1_2(), "rule__Post__ConditionAssignment_1_2");
			builder.put(grammarAccess.getPostAccess().getStepsAssignment_1_3(), "rule__Post__StepsAssignment_1_3");
			builder.put(grammarAccess.getToolAccess().getToolAssignment_1_2(), "rule__Tool__ToolAssignment_1_2");
			builder.put(grammarAccess.getToolAccess().getTool_nameAssignment_1_4(), "rule__Tool__Tool_nameAssignment_1_4");
			builder.put(grammarAccess.getStepAccess().getCommandsAssignment_1_1(), "rule__Step__CommandsAssignment_1_1");
			builder.put(grammarAccess.getStepAccess().getStep_parametersAssignment_1_2(), "rule__Step__Step_parametersAssignment_1_2");
			builder.put(grammarAccess.getInputAccess().getMessageAssignment_1_2(), "rule__Input__MessageAssignment_1_2");
			builder.put(grammarAccess.getInputAccess().getIdAssignment_1_3_1(), "rule__Input__IdAssignment_1_3_1");
			builder.put(grammarAccess.getInputAccess().getOkAssignment_1_4_1(), "rule__Input__OkAssignment_1_4_1");
			builder.put(grammarAccess.getInputAccess().getSubmitterAssignment_1_5_1(), "rule__Input__SubmitterAssignment_1_5_1");
			builder.put(grammarAccess.getInputAccess().getSubmitterParameterAssignment_1_6_1(), "rule__Input__SubmitterParameterAssignment_1_6_1");
			builder.put(grammarAccess.getInputAccess().getParameter_directivesAssignment_1_7(), "rule__Input__Parameter_directivesAssignment_1_7");
			builder.put(grammarAccess.getMatrixAccess().getAxisAssignment_1_1(), "rule__Matrix__AxisAssignment_1_1");
			builder.put(grammarAccess.getMatrixAccess().getStagesAssignment_1_2(), "rule__Matrix__StagesAssignment_1_2");
			builder.put(grammarAccess.getMatrixAccess().getInputsAssignment_1_3(), "rule__Matrix__InputsAssignment_1_3");
			builder.put(grammarAccess.getMatrixAccess().getWhenAssignment_1_4(), "rule__Matrix__WhenAssignment_1_4");
			builder.put(grammarAccess.getMatrixAccess().getEnvironmentsAssignment_1_5(), "rule__Matrix__EnvironmentsAssignment_1_5");
			builder.put(grammarAccess.getMatrixAccess().getAgentsAssignment_1_6(), "rule__Matrix__AgentsAssignment_1_6");
			builder.put(grammarAccess.getMatrixAccess().getToolsAssignment_1_7(), "rule__Matrix__ToolsAssignment_1_7");
			builder.put(grammarAccess.getMatrixAccess().getPostAssignment_1_8(), "rule__Matrix__PostAssignment_1_8");
			builder.put(grammarAccess.getMatrixAccess().getStage_optionsAssignment_1_9(), "rule__Matrix__Stage_optionsAssignment_1_9");
			builder.put(grammarAccess.getCommandAccess().getNameAssignment_2_2(), "rule__Command__NameAssignment_2_2");
			builder.put(grammarAccess.getStep_ParameterAccess().getParameterAssignment_1_2(), "rule__Step_Parameter__ParameterAssignment_1_2");
			builder.put(grammarAccess.getBranchAccess().getPatternAssignment_1_2(), "rule__Branch__PatternAssignment_1_2");
			builder.put(grammarAccess.getBranchAccess().getComparatorAssignment_1_3_1(), "rule__Branch__ComparatorAssignment_1_3_1");
			builder.put(grammarAccess.getChangelogAccess().getExpressionAssignment_1_2(), "rule__Changelog__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getTriggeredByAccess().getParameterAssignment_1_2(), "rule__TriggeredBy__ParameterAssignment_1_2");
			builder.put(grammarAccess.getExpressionAccess().getExpressionAssignment_1_2(), "rule__Expression__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getChangeSetAccess().getPatternAssignment_1_2(), "rule__ChangeSet__PatternAssignment_1_2");
			builder.put(grammarAccess.getChangeSetAccess().getComparatorAssignment_1_3_1(), "rule__ChangeSet__ComparatorAssignment_1_3_1");
			builder.put(grammarAccess.getNotAccess().getWhenAssignment_2_1(), "rule__Not__WhenAssignment_2_1");
			builder.put(grammarAccess.getAnyOfAccess().getWhenAssignment_2_1(), "rule__AnyOf__WhenAssignment_2_1");
			builder.put(grammarAccess.getTagAccess().getPatternAssignment_1_2(), "rule__Tag__PatternAssignment_1_2");
			builder.put(grammarAccess.getTagAccess().getComparatorAssignment_1_3_1(), "rule__Tag__ComparatorAssignment_1_3_1");
			builder.put(grammarAccess.getWhen_EnvAccess().getNameAssignment_1_2(), "rule__When_Env__NameAssignment_1_2");
			builder.put(grammarAccess.getWhen_EnvAccess().getValueAssignment_1_4(), "rule__When_Env__ValueAssignment_1_4");
			builder.put(grammarAccess.getAllOfAccess().getWhenAssignment_1_1(), "rule__AllOf__WhenAssignment_1_1");
			builder.put(grammarAccess.getEqualsAccess().getExpected_valAssignment_1_2(), "rule__Equals__Expected_valAssignment_1_2");
			builder.put(grammarAccess.getEqualsAccess().getActual_valAssignment_1_4(), "rule__Equals__Actual_valAssignment_1_4");
			builder.put(grammarAccess.getChangeRequestAccess().getAttributeAssignment_1_2(), "rule__ChangeRequest__AttributeAssignment_1_2");
			builder.put(grammarAccess.getChangeRequestAccess().getValueAssignment_1_4(), "rule__ChangeRequest__ValueAssignment_1_4");
			builder.put(grammarAccess.getChangeRequestAccess().getComparatorAssignment_1_5_1(), "rule__ChangeRequest__ComparatorAssignment_1_5_1");
			builder.put(grammarAccess.getRetryAccess().getRetriesAssignment_1_2(), "rule__Retry__RetriesAssignment_1_2");
			builder.put(grammarAccess.getTimeoutAccess().getTimeAssignment_1_2(), "rule__Timeout__TimeAssignment_1_2");
			builder.put(grammarAccess.getTimeoutAccess().getUnitAssignment_1_4(), "rule__Timeout__UnitAssignment_1_4");
			builder.put(grammarAccess.getAxisAccess().getNameAssignment_1_2(), "rule__Axis__NameAssignment_1_2");
			builder.put(grammarAccess.getAxisAccess().getValuesAssignment_1_4(), "rule__Axis__ValuesAssignment_1_4");
			builder.put(grammarAccess.getAxisAccess().getValuesAssignment_1_5_1(), "rule__Axis__ValuesAssignment_1_5_1");
			builder.put(grammarAccess.getAxisAccess().getExcludeAssignment_1_6(), "rule__Axis__ExcludeAssignment_1_6");
			builder.put(grammarAccess.getStringParamAccess().getNameAssignment_1_2(), "rule__StringParam__NameAssignment_1_2");
			builder.put(grammarAccess.getStringParamAccess().getDescriptionAssignment_1_3_1(), "rule__StringParam__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getStringParamAccess().getDefaultValueAssignment_1_5(), "rule__StringParam__DefaultValueAssignment_1_5");
			builder.put(grammarAccess.getTextParamAccess().getNameAssignment_1_2(), "rule__TextParam__NameAssignment_1_2");
			builder.put(grammarAccess.getTextParamAccess().getDescriptionAssignment_1_3_1(), "rule__TextParam__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getTextParamAccess().getDefaultValueAssignment_1_5(), "rule__TextParam__DefaultValueAssignment_1_5");
			builder.put(grammarAccess.getChoiceParamAccess().getNameAssignment_1_2(), "rule__ChoiceParam__NameAssignment_1_2");
			builder.put(grammarAccess.getChoiceParamAccess().getDescriptionAssignment_1_3_1(), "rule__ChoiceParam__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getChoiceParamAccess().getChoicesAssignment_1_5(), "rule__ChoiceParam__ChoicesAssignment_1_5");
			builder.put(grammarAccess.getChoiceParamAccess().getChoicesAssignment_1_6_1(), "rule__ChoiceParam__ChoicesAssignment_1_6_1");
			builder.put(grammarAccess.getPasswordParamAccess().getNameAssignment_1_2(), "rule__PasswordParam__NameAssignment_1_2");
			builder.put(grammarAccess.getPasswordParamAccess().getDescriptionAssignment_1_3_1(), "rule__PasswordParam__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getPasswordParamAccess().getDefaultValueAssignment_1_5(), "rule__PasswordParam__DefaultValueAssignment_1_5");
			builder.put(grammarAccess.getBooleanParamAccess().getNameAssignment_1_2(), "rule__BooleanParam__NameAssignment_1_2");
			builder.put(grammarAccess.getBooleanParamAccess().getDescriptionAssignment_1_3_1(), "rule__BooleanParam__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getBooleanParamAccess().getDefaultValueAssignment_1_4(), "rule__BooleanParam__DefaultValueAssignment_1_4");
			builder.put(grammarAccess.getNodeAccess().getLabelAssignment_1_2(), "rule__Node__LabelAssignment_1_2");
			builder.put(grammarAccess.getNodeAccess().getCustomWorkspaceAssignment_1_3_1(), "rule__Node__CustomWorkspaceAssignment_1_3_1");
			builder.put(grammarAccess.getDockerfileAccess().getFilenameAssignment_1_2(), "rule__Dockerfile__FilenameAssignment_1_2");
			builder.put(grammarAccess.getDockerfileAccess().getDirAssignment_1_3_1(), "rule__Dockerfile__DirAssignment_1_3_1");
			builder.put(grammarAccess.getDockerfileAccess().getAdditionalBuildArgsAssignment_1_4_1(), "rule__Dockerfile__AdditionalBuildArgsAssignment_1_4_1");
			builder.put(grammarAccess.getDockerfileAccess().getRegistryUrlAssignment_1_5_1(), "rule__Dockerfile__RegistryUrlAssignment_1_5_1");
			builder.put(grammarAccess.getDockerfileAccess().getRegistryCredentialsIdAssignment_1_6_1(), "rule__Dockerfile__RegistryCredentialsIdAssignment_1_6_1");
			builder.put(grammarAccess.getDockerfileAccess().getLabelAssignment_1_7_1(), "rule__Dockerfile__LabelAssignment_1_7_1");
			builder.put(grammarAccess.getDockerfileAccess().getCustomWorkspaceAssignment_1_8_1(), "rule__Dockerfile__CustomWorkspaceAssignment_1_8_1");
			builder.put(grammarAccess.getDockerfileAccess().getReuseNodeAssignment_1_9_1(), "rule__Dockerfile__ReuseNodeAssignment_1_9_1");
			builder.put(grammarAccess.getDockerfileAccess().getArgsAssignment_1_10_1(), "rule__Dockerfile__ArgsAssignment_1_10_1");
			builder.put(grammarAccess.getDockerAccess().getImageAssignment_1_2(), "rule__Docker__ImageAssignment_1_2");
			builder.put(grammarAccess.getDockerAccess().getRegistryUrlAssignment_1_3_1(), "rule__Docker__RegistryUrlAssignment_1_3_1");
			builder.put(grammarAccess.getDockerAccess().getRegistryCredentialsIdAssignment_1_4_1(), "rule__Docker__RegistryCredentialsIdAssignment_1_4_1");
			builder.put(grammarAccess.getDockerAccess().getLabelAssignment_1_5_1(), "rule__Docker__LabelAssignment_1_5_1");
			builder.put(grammarAccess.getDockerAccess().getCustomWorkspaceAssignment_1_6_1(), "rule__Docker__CustomWorkspaceAssignment_1_6_1");
			builder.put(grammarAccess.getDockerAccess().getReuseNodeAssignment_1_7_1(), "rule__Docker__ReuseNodeAssignment_1_7_1");
			builder.put(grammarAccess.getDockerAccess().getArgsAssignment_1_8_1(), "rule__Docker__ArgsAssignment_1_8_1");
			builder.put(grammarAccess.getDockerAccess().getAlwaysPullAssignment_1_9(), "rule__Docker__AlwaysPullAssignment_1_9");
			builder.put(grammarAccess.getLabelAccess().getLabelAssignment_1_2(), "rule__Label__LabelAssignment_1_2");
			builder.put(grammarAccess.getCronAccess().getTimerAssignment_1_2(), "rule__Cron__TimerAssignment_1_2");
			builder.put(grammarAccess.getPollSCMAccess().getTimerAssignment_1_2(), "rule__PollSCM__TimerAssignment_1_2");
			builder.put(grammarAccess.getUpstreamAccess().getJobsAssignment_1_2(), "rule__Upstream__JobsAssignment_1_2");
			builder.put(grammarAccess.getUpstreamAccess().getJobsAssignment_1_3_1(), "rule__Upstream__JobsAssignment_1_3_1");
			builder.put(grammarAccess.getUpstreamAccess().getThresholdAssignment_1_5(), "rule__Upstream__ThresholdAssignment_1_5");
			builder.put(grammarAccess.getBuildDiscarderAccess().getNumToKeepStrAssignment_1_2(), "rule__BuildDiscarder__NumToKeepStrAssignment_1_2");
			builder.put(grammarAccess.getCheckoutToSubdirectoryAccess().getDirectoryAssignment_1_2(), "rule__CheckoutToSubdirectory__DirectoryAssignment_1_2");
			builder.put(grammarAccess.getQuietPeriodAccess().getPeriodAssignment_2_2(), "rule__QuietPeriod__PeriodAssignment_2_2");
			builder.put(grammarAccess.getPreserveStashesAccess().getBuildCountAssignment_2_1_1(), "rule__PreserveStashes__BuildCountAssignment_2_1_1");
			builder.put(grammarAccess.getOverrideIndexTriggersAccess().getOverrideAssignment_2_1(), "rule__OverrideIndexTriggers__OverrideAssignment_2_1");
			builder.put(grammarAccess.getDisableConcurrentBuildsAccess().getAbortAssignment_2_1(), "rule__DisableConcurrentBuilds__AbortAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JenkinsGrammarAccess grammarAccess;

	@Override
	protected InternalJenkinsParser createParser() {
		InternalJenkinsParser result = new InternalJenkinsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new JenkinsTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JenkinsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JenkinsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}