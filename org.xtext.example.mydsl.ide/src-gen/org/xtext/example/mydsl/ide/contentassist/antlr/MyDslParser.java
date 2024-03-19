/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPipelineAccess().getAlternatives_2(), "rule__Pipeline__Alternatives_2");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_0(), "rule__Pipeline__Group_2_0__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_1(), "rule__Pipeline__Group_2_1__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_1_2(), "rule__Pipeline__Group_2_1_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_2(), "rule__Pipeline__Group_2_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_2_2(), "rule__Pipeline__Group_2_2_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_3(), "rule__Pipeline__Group_2_3__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_3_2(), "rule__Pipeline__Group_2_3_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_4(), "rule__Pipeline__Group_2_4__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_4_2(), "rule__Pipeline__Group_2_4_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_5(), "rule__Pipeline__Group_2_5__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_5_2(), "rule__Pipeline__Group_2_5_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_6(), "rule__Pipeline__Group_2_6__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_6_2(), "rule__Pipeline__Group_2_6_2__0");
			builder.put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
			builder.put(grammarAccess.getWhenAccess().getGroup_2(), "rule__When__Group_2__0");
			builder.put(grammarAccess.getWhenAccess().getGroup_3(), "rule__When__Group_3__0");
			builder.put(grammarAccess.getJobAccess().getGroup(), "rule__Job__Group__0");
			builder.put(grammarAccess.getJobAccess().getGroup_3(), "rule__Job__Group_3__0");
			builder.put(grammarAccess.getJobAccess().getGroup_4(), "rule__Job__Group_4__0");
			builder.put(grammarAccess.getJobAccess().getGroup_5(), "rule__Job__Group_5__0");
			builder.put(grammarAccess.getJobAccess().getGroup_5_3(), "rule__Job__Group_5_3__0");
			builder.put(grammarAccess.getJobAccess().getGroup_6(), "rule__Job__Group_6__0");
			builder.put(grammarAccess.getJobAccess().getGroup_6_2(), "rule__Job__Group_6_2__0");
			builder.put(grammarAccess.getJobAccess().getGroup_7(), "rule__Job__Group_7__0");
			builder.put(grammarAccess.getJobAccess().getGroup_7_2(), "rule__Job__Group_7_2__0");
			builder.put(grammarAccess.getJobAccess().getGroup_8(), "rule__Job__Group_8__0");
			builder.put(grammarAccess.getJobAccess().getGroup_8_2(), "rule__Job__Group_8_2__0");
			builder.put(grammarAccess.getJobAccess().getGroup_9(), "rule__Job__Group_9__0");
			builder.put(grammarAccess.getJobAccess().getGroup_9_2(), "rule__Job__Group_9_2__0");
			builder.put(grammarAccess.getJobAccess().getGroup_10(), "rule__Job__Group_10__0");
			builder.put(grammarAccess.getJobAccess().getGroup_10_2(), "rule__Job__Group_10_2__0");
			builder.put(grammarAccess.getJobAccess().getGroup_11(), "rule__Job__Group_11__0");
			builder.put(grammarAccess.getJobAccess().getGroup_11_2(), "rule__Job__Group_11_2__0");
			builder.put(grammarAccess.getTool_FrameworkAccess().getGroup(), "rule__Tool_Framework__Group__0");
			builder.put(grammarAccess.getTool_FrameworkAccess().getGroup_2(), "rule__Tool_Framework__Group_2__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_2(), "rule__Environment__Group_2__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_3(), "rule__Environment__Group_3__0");
			builder.put(grammarAccess.getPermissionAccess().getGroup(), "rule__Permission__Group__0");
			builder.put(grammarAccess.getPermissionAccess().getGroup_2(), "rule__Permission__Group_2__0");
			builder.put(grammarAccess.getPermissionAccess().getGroup_3(), "rule__Permission__Group_3__0");
			builder.put(grammarAccess.getParallelAccess().getGroup(), "rule__Parallel__Group__0");
			builder.put(grammarAccess.getParallelAccess().getGroup_2(), "rule__Parallel__Group_2__0");
			builder.put(grammarAccess.getParallelAccess().getGroup_2_2(), "rule__Parallel__Group_2_2__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup(), "rule__Artifact__Group__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_2(), "rule__Artifact__Group_2__0");
			builder.put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_2(), "rule__Command__Group_2__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_3(), "rule__Command__Group_3__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_4(), "rule__Command__Group_4__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_4_2(), "rule__Command__Group_4_2__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup(), "rule__IfThenElse__Group__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_2(), "rule__IfThenElse__Group_2__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_3(), "rule__IfThenElse__Group_3__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_3_2(), "rule__IfThenElse__Group_3_2__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_4(), "rule__IfThenElse__Group_4__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_4_2(), "rule__IfThenElse__Group_4_2__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_5(), "rule__IfThenElse__Group_5__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_5_2(), "rule__IfThenElse__Group_5_2__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_6(), "rule__IfThenElse__Group_6__0");
			builder.put(grammarAccess.getIfThenElseAccess().getGroup_6_2(), "rule__IfThenElse__Group_6_2__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_2(), "rule__Parameters__Group_2__0");
			builder.put(grammarAccess.getPipelineAccess().getName0Assignment_2_0_1(), "rule__Pipeline__Name0Assignment_2_0_1");
			builder.put(grammarAccess.getPipelineAccess().getWhenAssignment_2_1_1(), "rule__Pipeline__WhenAssignment_2_1_1");
			builder.put(grammarAccess.getPipelineAccess().getWhenAssignment_2_1_2_1(), "rule__Pipeline__WhenAssignment_2_1_2_1");
			builder.put(grammarAccess.getPipelineAccess().getJobAssignment_2_2_1(), "rule__Pipeline__JobAssignment_2_2_1");
			builder.put(grammarAccess.getPipelineAccess().getJobAssignment_2_2_2_1(), "rule__Pipeline__JobAssignment_2_2_2_1");
			builder.put(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkAssignment_2_3_1(), "rule__Pipeline__Pipeline_tool_frameworkAssignment_2_3_1");
			builder.put(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkAssignment_2_3_2_1(), "rule__Pipeline__Pipeline_tool_frameworkAssignment_2_3_2_1");
			builder.put(grammarAccess.getPipelineAccess().getPipeline_environmentAssignment_2_4_1(), "rule__Pipeline__Pipeline_environmentAssignment_2_4_1");
			builder.put(grammarAccess.getPipelineAccess().getPipeline_environmentAssignment_2_4_2_1(), "rule__Pipeline__Pipeline_environmentAssignment_2_4_2_1");
			builder.put(grammarAccess.getPipelineAccess().getPermissionAssignment_2_5_1(), "rule__Pipeline__PermissionAssignment_2_5_1");
			builder.put(grammarAccess.getPipelineAccess().getPermissionAssignment_2_5_2_1(), "rule__Pipeline__PermissionAssignment_2_5_2_1");
			builder.put(grammarAccess.getPipelineAccess().getParallelAssignment_2_6_1(), "rule__Pipeline__ParallelAssignment_2_6_1");
			builder.put(grammarAccess.getPipelineAccess().getParallelAssignment_2_6_2_1(), "rule__Pipeline__ParallelAssignment_2_6_2_1");
			builder.put(grammarAccess.getWhenAccess().getName4Assignment_1(), "rule__When__Name4Assignment_1");
			builder.put(grammarAccess.getWhenAccess().getTriggerAssignment_2_1(), "rule__When__TriggerAssignment_2_1");
			builder.put(grammarAccess.getWhenAccess().getTimerAssignment_3_1(), "rule__When__TimerAssignment_3_1");
			builder.put(grammarAccess.getJobAccess().getAllow_faillureAssignment_1(), "rule__Job__Allow_faillureAssignment_1");
			builder.put(grammarAccess.getJobAccess().getName1Assignment_3_1(), "rule__Job__Name1Assignment_3_1");
			builder.put(grammarAccess.getJobAccess().getDescription1Assignment_4_1(), "rule__Job__Description1Assignment_4_1");
			builder.put(grammarAccess.getJobAccess().getOutputAssignment_5_2(), "rule__Job__OutputAssignment_5_2");
			builder.put(grammarAccess.getJobAccess().getOutputAssignment_5_3_1(), "rule__Job__OutputAssignment_5_3_1");
			builder.put(grammarAccess.getJobAccess().getTool_framework_jobAssignment_6_1(), "rule__Job__Tool_framework_jobAssignment_6_1");
			builder.put(grammarAccess.getJobAccess().getTool_framework_jobAssignment_6_2_1(), "rule__Job__Tool_framework_jobAssignment_6_2_1");
			builder.put(grammarAccess.getJobAccess().getCommandAssignment_7_1(), "rule__Job__CommandAssignment_7_1");
			builder.put(grammarAccess.getJobAccess().getCommandAssignment_7_2_1(), "rule__Job__CommandAssignment_7_2_1");
			builder.put(grammarAccess.getJobAccess().getIfthenelseAssignment_8_1(), "rule__Job__IfthenelseAssignment_8_1");
			builder.put(grammarAccess.getJobAccess().getIfthenelseAssignment_8_2_1(), "rule__Job__IfthenelseAssignment_8_2_1");
			builder.put(grammarAccess.getJobAccess().getInputAssignment_9_1(), "rule__Job__InputAssignment_9_1");
			builder.put(grammarAccess.getJobAccess().getInputAssignment_9_2_1(), "rule__Job__InputAssignment_9_2_1");
			builder.put(grammarAccess.getJobAccess().getEnvironmentAssignment_10_1(), "rule__Job__EnvironmentAssignment_10_1");
			builder.put(grammarAccess.getJobAccess().getEnvironmentAssignment_10_2_1(), "rule__Job__EnvironmentAssignment_10_2_1");
			builder.put(grammarAccess.getJobAccess().getPermissionAssignment_11_1(), "rule__Job__PermissionAssignment_11_1");
			builder.put(grammarAccess.getJobAccess().getPermissionAssignment_11_2_1(), "rule__Job__PermissionAssignment_11_2_1");
			builder.put(grammarAccess.getTool_FrameworkAccess().getName5Assignment_2_1(), "rule__Tool_Framework__Name5Assignment_2_1");
			builder.put(grammarAccess.getEnvironmentAccess().getKeyAssignment_2_1(), "rule__Environment__KeyAssignment_2_1");
			builder.put(grammarAccess.getEnvironmentAccess().getValueAssignment_3_1(), "rule__Environment__ValueAssignment_3_1");
			builder.put(grammarAccess.getPermissionAccess().getKeyAssignment_2_1(), "rule__Permission__KeyAssignment_2_1");
			builder.put(grammarAccess.getPermissionAccess().getValueAssignment_3_1(), "rule__Permission__ValueAssignment_3_1");
			builder.put(grammarAccess.getParallelAccess().getJobAssignment_2_1(), "rule__Parallel__JobAssignment_2_1");
			builder.put(grammarAccess.getParallelAccess().getJobAssignment_2_2_1(), "rule__Parallel__JobAssignment_2_2_1");
			builder.put(grammarAccess.getArtifactAccess().getName3Assignment_2_1(), "rule__Artifact__Name3Assignment_2_1");
			builder.put(grammarAccess.getCommandAccess().getDescriptionAssignment_2_1(), "rule__Command__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getCommandAccess().getToolAssignment_3_1(), "rule__Command__ToolAssignment_3_1");
			builder.put(grammarAccess.getCommandAccess().getParametersAssignment_4_1(), "rule__Command__ParametersAssignment_4_1");
			builder.put(grammarAccess.getCommandAccess().getParametersAssignment_4_2_1(), "rule__Command__ParametersAssignment_4_2_1");
			builder.put(grammarAccess.getIfThenElseAccess().getConditionAssignment_2_1(), "rule__IfThenElse__ConditionAssignment_2_1");
			builder.put(grammarAccess.getIfThenElseAccess().getIfAssignment_3_1(), "rule__IfThenElse__IfAssignment_3_1");
			builder.put(grammarAccess.getIfThenElseAccess().getIfAssignment_3_2_1(), "rule__IfThenElse__IfAssignment_3_2_1");
			builder.put(grammarAccess.getIfThenElseAccess().getElseAssignment_4_1(), "rule__IfThenElse__ElseAssignment_4_1");
			builder.put(grammarAccess.getIfThenElseAccess().getElseAssignment_4_2_1(), "rule__IfThenElse__ElseAssignment_4_2_1");
			builder.put(grammarAccess.getIfThenElseAccess().getIfelseAssignment_5_1(), "rule__IfThenElse__IfelseAssignment_5_1");
			builder.put(grammarAccess.getIfThenElseAccess().getIfelseAssignment_5_2_1(), "rule__IfThenElse__IfelseAssignment_5_2_1");
			builder.put(grammarAccess.getIfThenElseAccess().getElseifAssignment_6_1(), "rule__IfThenElse__ElseifAssignment_6_1");
			builder.put(grammarAccess.getIfThenElseAccess().getElseifAssignment_6_2_1(), "rule__IfThenElse__ElseifAssignment_6_2_1");
			builder.put(grammarAccess.getParametersAccess().getParameterAssignment_2_1(), "rule__Parameters__ParameterAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MyDslTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
