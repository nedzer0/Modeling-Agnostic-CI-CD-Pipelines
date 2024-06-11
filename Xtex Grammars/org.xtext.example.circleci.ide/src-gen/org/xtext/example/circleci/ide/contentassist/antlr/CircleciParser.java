/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.circleci.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.circleci.ide.contentassist.antlr.internal.InternalCircleciParser;
import org.xtext.example.circleci.services.CircleciGrammarAccess;

public class CircleciParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CircleciGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CircleciGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExecutorAccess().getAlternatives(), "rule__Executor__Alternatives");
			builder.put(grammarAccess.getStepAccess().getAlternatives(), "rule__Step__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getMACHINE_RESOURCE_TYPEAccess().getAlternatives(), "rule__MACHINE_RESOURCE_TYPE__Alternatives");
			builder.put(grammarAccess.getMACOS_RESOURCE_TYPEAccess().getAlternatives(), "rule__MACOS_RESOURCE_TYPE__Alternatives");
			builder.put(grammarAccess.getDOCKER_RESOURCE_TYPEAccess().getAlternatives(), "rule__DOCKER_RESOURCE_TYPE__Alternatives");
			builder.put(grammarAccess.getWHEN_TYPEAccess().getAlternatives(), "rule__WHEN_TYPE__Alternatives");
			builder.put(grammarAccess.getPARAMETER_TYPESAccess().getAlternatives(), "rule__PARAMETER_TYPES__Alternatives");
			builder.put(grammarAccess.getBRANCH_TYPEAccess().getAlternatives(), "rule__BRANCH_TYPE__Alternatives");
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_0(), "rule__Pipeline__Group_0__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_1(), "rule__Pipeline__Group_1__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2(), "rule__Pipeline__Group_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_3(), "rule__Pipeline__Group_3__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_4(), "rule__Pipeline__Group_4__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_5(), "rule__Pipeline__Group_5__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_6(), "rule__Pipeline__Group_6__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_7(), "rule__Pipeline__Group_7__0");
			builder.put(grammarAccess.getOrbAccess().getGroup(), "rule__Orb__Group__0");
			builder.put(grammarAccess.getOrbAccess().getGroup_1(), "rule__Orb__Group_1__0");
			builder.put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_1_3(), "rule__Command__Group_1_3__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup(), "rule__Workflow__Group__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup_1(), "rule__Workflow__Group_1__0");
			builder.put(grammarAccess.getJobAccess().getGroup(), "rule__Job__Group__0");
			builder.put(grammarAccess.getJobAccess().getGroup_1(), "rule__Job__Group_1__0");
			builder.put(grammarAccess.getJobAccess().getGroup_1_1(), "rule__Job__Group_1_1__0");
			builder.put(grammarAccess.getJobAccess().getGroup_1_2(), "rule__Job__Group_1_2__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1(), "rule__Parameter__Group_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1_5(), "rule__Parameter__Group_1_5__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1_6(), "rule__Parameter__Group_1_6__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1_7(), "rule__Parameter__Group_1_7__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1_7_2(), "rule__Parameter__Group_1_7_2__0");
			builder.put(grammarAccess.getRunAccess().getGroup(), "rule__Run__Group__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1(), "rule__Run__Group_1__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1_1(), "rule__Run__Group_1_1__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1_3(), "rule__Run__Group_1_3__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1_4(), "rule__Run__Group_1_4__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1_5(), "rule__Run__Group_1_5__0");
			builder.put(grammarAccess.getRunAccess().getGroup_1_6(), "rule__Run__Group_1_6__0");
			builder.put(grammarAccess.getRestoreCacheAccess().getGroup(), "rule__RestoreCache__Group__0");
			builder.put(grammarAccess.getRestoreCacheAccess().getGroup_1(), "rule__RestoreCache__Group_1__0");
			builder.put(grammarAccess.getRestoreCacheAccess().getGroup_1_1(), "rule__RestoreCache__Group_1_1__0");
			builder.put(grammarAccess.getRestoreCacheAccess().getGroup_1_6(), "rule__RestoreCache__Group_1_6__0");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getGroup(), "rule__PersistToWorkspace__Group__0");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getGroup_1(), "rule__PersistToWorkspace__Group_1__0");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getGroup_1_1(), "rule__PersistToWorkspace__Group_1_1__0");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getGroup_1_6(), "rule__PersistToWorkspace__Group_1_6__0");
			builder.put(grammarAccess.getStoreArtifactAccess().getGroup(), "rule__StoreArtifact__Group__0");
			builder.put(grammarAccess.getStoreArtifactAccess().getGroup_1(), "rule__StoreArtifact__Group_1__0");
			builder.put(grammarAccess.getStoreArtifactAccess().getGroup_1_1(), "rule__StoreArtifact__Group_1_1__0");
			builder.put(grammarAccess.getStoreArtifactAccess().getGroup_1_4(), "rule__StoreArtifact__Group_1_4__0");
			builder.put(grammarAccess.getStoreTestResultsAccess().getGroup(), "rule__StoreTestResults__Group__0");
			builder.put(grammarAccess.getStoreTestResultsAccess().getGroup_1(), "rule__StoreTestResults__Group_1__0");
			builder.put(grammarAccess.getStoreTestResultsAccess().getGroup_1_1(), "rule__StoreTestResults__Group_1_1__0");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getGroup(), "rule__SetupRemoteDocker__Group__0");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getGroup_2(), "rule__SetupRemoteDocker__Group_2__0");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getGroup_2_1(), "rule__SetupRemoteDocker__Group_2_1__0");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getGroup_2_3(), "rule__SetupRemoteDocker__Group_2_3__0");
			builder.put(grammarAccess.getAddSSHKeysAccess().getGroup(), "rule__AddSSHKeys__Group__0");
			builder.put(grammarAccess.getAddSSHKeysAccess().getGroup_2(), "rule__AddSSHKeys__Group_2__0");
			builder.put(grammarAccess.getAddSSHKeysAccess().getGroup_2_1(), "rule__AddSSHKeys__Group_2_1__0");
			builder.put(grammarAccess.getAddSSHKeysAccess().getGroup_2_2(), "rule__AddSSHKeys__Group_2_2__0");
			builder.put(grammarAccess.getAddSSHKeysAccess().getGroup_2_2_2(), "rule__AddSSHKeys__Group_2_2_2__0");
			builder.put(grammarAccess.getSaveCacheAccess().getGroup(), "rule__SaveCache__Group__0");
			builder.put(grammarAccess.getSaveCacheAccess().getGroup_1(), "rule__SaveCache__Group_1__0");
			builder.put(grammarAccess.getSaveCacheAccess().getGroup_1_1(), "rule__SaveCache__Group_1_1__0");
			builder.put(grammarAccess.getSaveCacheAccess().getGroup_1_4(), "rule__SaveCache__Group_1_4__0");
			builder.put(grammarAccess.getSaveCacheAccess().getGroup_1_7(), "rule__SaveCache__Group_1_7__0");
			builder.put(grammarAccess.getAttachWorkspaceAccess().getGroup(), "rule__AttachWorkspace__Group__0");
			builder.put(grammarAccess.getAttachWorkspaceAccess().getGroup_1(), "rule__AttachWorkspace__Group_1__0");
			builder.put(grammarAccess.getAttachWorkspaceAccess().getGroup_1_1(), "rule__AttachWorkspace__Group_1_1__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup(), "rule__When_Unless__Group__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup_1(), "rule__When_Unless__Group_1__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup_1_1(), "rule__When_Unless__Group_1_1__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup_1_5(), "rule__When_Unless__Group_1_5__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup_1_6(), "rule__When_Unless__Group_1_6__0");
			builder.put(grammarAccess.getWhen_UnlessAccess().getGroup_1_6_1(), "rule__When_Unless__Group_1_6_1__0");
			builder.put(grammarAccess.getCheckoutAccess().getGroup(), "rule__Checkout__Group__0");
			builder.put(grammarAccess.getCheckoutAccess().getGroup_2(), "rule__Checkout__Group_2__0");
			builder.put(grammarAccess.getCheckoutAccess().getGroup_2_1(), "rule__Checkout__Group_2_1__0");
			builder.put(grammarAccess.getCheckoutAccess().getGroup_2_2(), "rule__Checkout__Group_2_2__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_1(), "rule__Environment__Group_1__0");
			builder.put(grammarAccess.getRunCommandAccess().getGroup(), "rule__RunCommand__Group__0");
			builder.put(grammarAccess.getRunCommandAccess().getGroup_2(), "rule__RunCommand__Group_2__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_1(), "rule__Trigger__Group_1__0");
			builder.put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup_1(), "rule__Branch__Group_1__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup(), "rule__JobWorkflow__Group__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup_2(), "rule__JobWorkflow__Group_2__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup_2_4(), "rule__JobWorkflow__Group_2_4__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup_2_4_2(), "rule__JobWorkflow__Group_2_4_2__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup_2_5(), "rule__JobWorkflow__Group_2_5__0");
			builder.put(grammarAccess.getJobWorkflowAccess().getGroup_2_5_2(), "rule__JobWorkflow__Group_2_5_2__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup(), "rule__Matrix__Group__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1(), "rule__Matrix__Group_1__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1_1(), "rule__Matrix__Group_1_1__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1_2(), "rule__Matrix__Group_1_2__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1_2_1(), "rule__Matrix__Group_1_2_1__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_1_4(), "rule__Matrix__Group_1_4__0");
			builder.put(grammarAccess.getMatrixParamsAccess().getGroup(), "rule__MatrixParams__Group__0");
			builder.put(grammarAccess.getMatrixParamsAccess().getGroup_1(), "rule__MatrixParams__Group_1__0");
			builder.put(grammarAccess.getMatrixParamsAccess().getGroup_1_5(), "rule__MatrixParams__Group_1_5__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEShortAccess().getGroup(), "rule__EShort__Group__0");
			builder.put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_1(), "rule__Machine__Group_1__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_1_8(), "rule__Machine__Group_1_8__0");
			builder.put(grammarAccess.getMachineAccess().getGroup_1_9(), "rule__Machine__Group_1_9__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup(), "rule__MacOs__Group__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup_1(), "rule__MacOs__Group_1__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup_1_3(), "rule__MacOs__Group_1_3__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup_1_4(), "rule__MacOs__Group_1_4__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup_1_5(), "rule__MacOs__Group_1_5__0");
			builder.put(grammarAccess.getMacOsAccess().getGroup_1_6(), "rule__MacOs__Group_1_6__0");
			builder.put(grammarAccess.getDockerAccess().getGroup(), "rule__Docker__Group__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1(), "rule__Docker__Group_1__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_7(), "rule__Docker__Group_1_7__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_8(), "rule__Docker__Group_1_8__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_9(), "rule__Docker__Group_1_9__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_9_2(), "rule__Docker__Group_1_9_2__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_10(), "rule__Docker__Group_1_10__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_10_2(), "rule__Docker__Group_1_10_2__0");
			builder.put(grammarAccess.getDockerAccess().getGroup_1_11(), "rule__Docker__Group_1_11__0");
			builder.put(grammarAccess.getDocker_AuthAccess().getGroup(), "rule__Docker_Auth__Group__0");
			builder.put(grammarAccess.getDocker_AuthAccess().getGroup_1(), "rule__Docker_Auth__Group_1__0");
			builder.put(grammarAccess.getDocker_Aws_AuthsAccess().getGroup(), "rule__Docker_Aws_Auths__Group__0");
			builder.put(grammarAccess.getDocker_Aws_AuthsAccess().getGroup_1(), "rule__Docker_Aws_Auths__Group_1__0");
			builder.put(grammarAccess.getPipelineAccess().getSetupAssignment_1_0(), "rule__Pipeline__SetupAssignment_1_0");
			builder.put(grammarAccess.getPipelineAccess().getVersionAssignment_2_1(), "rule__Pipeline__VersionAssignment_2_1");
			builder.put(grammarAccess.getPipelineAccess().getOrbsAssignment_3_0(), "rule__Pipeline__OrbsAssignment_3_0");
			builder.put(grammarAccess.getPipelineAccess().getCommandsAssignment_4_0(), "rule__Pipeline__CommandsAssignment_4_0");
			builder.put(grammarAccess.getPipelineAccess().getExecutorsAssignment_5_0(), "rule__Pipeline__ExecutorsAssignment_5_0");
			builder.put(grammarAccess.getPipelineAccess().getJobsAssignment_6_0(), "rule__Pipeline__JobsAssignment_6_0");
			builder.put(grammarAccess.getPipelineAccess().getWorkflowsAssignment_7_0(), "rule__Pipeline__WorkflowsAssignment_7_0");
			builder.put(grammarAccess.getOrbAccess().getKeyAssignment_1_2(), "rule__Orb__KeyAssignment_1_2");
			builder.put(grammarAccess.getOrbAccess().getValueAssignment_1_4(), "rule__Orb__ValueAssignment_1_4");
			builder.put(grammarAccess.getCommandAccess().getNameAssignment_1_2(), "rule__Command__NameAssignment_1_2");
			builder.put(grammarAccess.getCommandAccess().getDescriptionAssignment_1_3_1(), "rule__Command__DescriptionAssignment_1_3_1");
			builder.put(grammarAccess.getCommandAccess().getParametersAssignment_1_4(), "rule__Command__ParametersAssignment_1_4");
			builder.put(grammarAccess.getCommandAccess().getStepsAssignment_1_5(), "rule__Command__StepsAssignment_1_5");
			builder.put(grammarAccess.getWorkflowAccess().getNameAssignment_1_2(), "rule__Workflow__NameAssignment_1_2");
			builder.put(grammarAccess.getWorkflowAccess().getVersionAssignment_1_4(), "rule__Workflow__VersionAssignment_1_4");
			builder.put(grammarAccess.getWorkflowAccess().getTriggersAssignment_1_5(), "rule__Workflow__TriggersAssignment_1_5");
			builder.put(grammarAccess.getWorkflowAccess().getBranchesAssignment_1_6(), "rule__Workflow__BranchesAssignment_1_6");
			builder.put(grammarAccess.getWorkflowAccess().getWhen_unlessAssignment_1_7(), "rule__Workflow__When_unlessAssignment_1_7");
			builder.put(grammarAccess.getWorkflowAccess().getJobworkflowAssignment_1_8(), "rule__Workflow__JobworkflowAssignment_1_8");
			builder.put(grammarAccess.getJobAccess().getNameAssignment_1_1_1(), "rule__Job__NameAssignment_1_1_1");
			builder.put(grammarAccess.getJobAccess().getParallelismAssignment_1_2_1(), "rule__Job__ParallelismAssignment_1_2_1");
			builder.put(grammarAccess.getJobAccess().getReuseExecutorAssignment_1_4(), "rule__Job__ReuseExecutorAssignment_1_4");
			builder.put(grammarAccess.getJobAccess().getExecutorsAssignment_1_5(), "rule__Job__ExecutorsAssignment_1_5");
			builder.put(grammarAccess.getJobAccess().getEnvironmentsAssignment_1_6(), "rule__Job__EnvironmentsAssignment_1_6");
			builder.put(grammarAccess.getJobAccess().getStepsAssignment_1_7(), "rule__Job__StepsAssignment_1_7");
			builder.put(grammarAccess.getJobAccess().getParametersAssignment_1_8(), "rule__Job__ParametersAssignment_1_8");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1_2(), "rule__Parameter__NameAssignment_1_2");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_1_4(), "rule__Parameter__TypeAssignment_1_4");
			builder.put(grammarAccess.getParameterAccess().getDefaultAssignment_1_5_1(), "rule__Parameter__DefaultAssignment_1_5_1");
			builder.put(grammarAccess.getParameterAccess().getDescriptionAssignment_1_6_1(), "rule__Parameter__DescriptionAssignment_1_6_1");
			builder.put(grammarAccess.getParameterAccess().getEnumValuesAssignment_1_7_1(), "rule__Parameter__EnumValuesAssignment_1_7_1");
			builder.put(grammarAccess.getParameterAccess().getEnumValuesAssignment_1_7_2_1(), "rule__Parameter__EnumValuesAssignment_1_7_2_1");
			builder.put(grammarAccess.getRunAccess().getNameAssignment_1_1_1(), "rule__Run__NameAssignment_1_1_1");
			builder.put(grammarAccess.getRunAccess().getBackgroundAssignment_1_2(), "rule__Run__BackgroundAssignment_1_2");
			builder.put(grammarAccess.getRunAccess().getWhenAssignment_1_3_1(), "rule__Run__WhenAssignment_1_3_1");
			builder.put(grammarAccess.getRunAccess().getWorking_directoryAssignment_1_4_1(), "rule__Run__Working_directoryAssignment_1_4_1");
			builder.put(grammarAccess.getRunAccess().getNo_output_timeoutAssignment_1_5_1(), "rule__Run__No_output_timeoutAssignment_1_5_1");
			builder.put(grammarAccess.getRunAccess().getShellAssignment_1_6_1(), "rule__Run__ShellAssignment_1_6_1");
			builder.put(grammarAccess.getRunAccess().getEnvironmentsAssignment_1_7(), "rule__Run__EnvironmentsAssignment_1_7");
			builder.put(grammarAccess.getRunAccess().getRun_commandsAssignment_1_8(), "rule__Run__Run_commandsAssignment_1_8");
			builder.put(grammarAccess.getRunAccess().getParametersAssignment_1_9(), "rule__Run__ParametersAssignment_1_9");
			builder.put(grammarAccess.getRestoreCacheAccess().getNameAssignment_1_1_1(), "rule__RestoreCache__NameAssignment_1_1_1");
			builder.put(grammarAccess.getRestoreCacheAccess().getKeyAssignment_1_3(), "rule__RestoreCache__KeyAssignment_1_3");
			builder.put(grammarAccess.getRestoreCacheAccess().getKeysAssignment_1_5(), "rule__RestoreCache__KeysAssignment_1_5");
			builder.put(grammarAccess.getRestoreCacheAccess().getKeysAssignment_1_6_1(), "rule__RestoreCache__KeysAssignment_1_6_1");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getNameAssignment_1_1_1(), "rule__PersistToWorkspace__NameAssignment_1_1_1");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getRootAssignment_1_3(), "rule__PersistToWorkspace__RootAssignment_1_3");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getPathsAssignment_1_5(), "rule__PersistToWorkspace__PathsAssignment_1_5");
			builder.put(grammarAccess.getPersistToWorkspaceAccess().getPathsAssignment_1_6_1(), "rule__PersistToWorkspace__PathsAssignment_1_6_1");
			builder.put(grammarAccess.getStoreArtifactAccess().getNameAssignment_1_1_1(), "rule__StoreArtifact__NameAssignment_1_1_1");
			builder.put(grammarAccess.getStoreArtifactAccess().getPathAssignment_1_3(), "rule__StoreArtifact__PathAssignment_1_3");
			builder.put(grammarAccess.getStoreArtifactAccess().getDestinationAssignment_1_4_1(), "rule__StoreArtifact__DestinationAssignment_1_4_1");
			builder.put(grammarAccess.getStoreTestResultsAccess().getNameAssignment_1_1_1(), "rule__StoreTestResults__NameAssignment_1_1_1");
			builder.put(grammarAccess.getStoreTestResultsAccess().getPathAssignment_1_3(), "rule__StoreTestResults__PathAssignment_1_3");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getNameAssignment_2_1_1(), "rule__SetupRemoteDocker__NameAssignment_2_1_1");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getDocker_layer_cachingAssignment_2_2(), "rule__SetupRemoteDocker__Docker_layer_cachingAssignment_2_2");
			builder.put(grammarAccess.getSetupRemoteDockerAccess().getVersionAssignment_2_3_1(), "rule__SetupRemoteDocker__VersionAssignment_2_3_1");
			builder.put(grammarAccess.getAddSSHKeysAccess().getNameAssignment_2_1_1(), "rule__AddSSHKeys__NameAssignment_2_1_1");
			builder.put(grammarAccess.getAddSSHKeysAccess().getFingerprintsAssignment_2_2_1(), "rule__AddSSHKeys__FingerprintsAssignment_2_2_1");
			builder.put(grammarAccess.getAddSSHKeysAccess().getFingerprintsAssignment_2_2_2_1(), "rule__AddSSHKeys__FingerprintsAssignment_2_2_2_1");
			builder.put(grammarAccess.getSaveCacheAccess().getNameAssignment_1_1_1(), "rule__SaveCache__NameAssignment_1_1_1");
			builder.put(grammarAccess.getSaveCacheAccess().getPathsAssignment_1_3(), "rule__SaveCache__PathsAssignment_1_3");
			builder.put(grammarAccess.getSaveCacheAccess().getPathsAssignment_1_4_1(), "rule__SaveCache__PathsAssignment_1_4_1");
			builder.put(grammarAccess.getSaveCacheAccess().getKeyAssignment_1_6(), "rule__SaveCache__KeyAssignment_1_6");
			builder.put(grammarAccess.getSaveCacheAccess().getWhenAssignment_1_7_1(), "rule__SaveCache__WhenAssignment_1_7_1");
			builder.put(grammarAccess.getAttachWorkspaceAccess().getNameAssignment_1_1_1(), "rule__AttachWorkspace__NameAssignment_1_1_1");
			builder.put(grammarAccess.getAttachWorkspaceAccess().getAtAssignment_1_3(), "rule__AttachWorkspace__AtAssignment_1_3");
			builder.put(grammarAccess.getWhen_UnlessAccess().getNameAssignment_1_1_1(), "rule__When_Unless__NameAssignment_1_1_1");
			builder.put(grammarAccess.getWhen_UnlessAccess().getConditionAssignment_1_3(), "rule__When_Unless__ConditionAssignment_1_3");
			builder.put(grammarAccess.getWhen_UnlessAccess().getWhen_stepAssignment_1_5_1(), "rule__When_Unless__When_stepAssignment_1_5_1");
			builder.put(grammarAccess.getWhen_UnlessAccess().getUnless_stepAssignment_1_6_1_1(), "rule__When_Unless__Unless_stepAssignment_1_6_1_1");
			builder.put(grammarAccess.getCheckoutAccess().getNameAssignment_2_1_1(), "rule__Checkout__NameAssignment_2_1_1");
			builder.put(grammarAccess.getCheckoutAccess().getPathAssignment_2_2_1(), "rule__Checkout__PathAssignment_2_2_1");
			builder.put(grammarAccess.getEnvironmentAccess().getKeyAssignment_1_2(), "rule__Environment__KeyAssignment_1_2");
			builder.put(grammarAccess.getEnvironmentAccess().getValueAssignment_1_4(), "rule__Environment__ValueAssignment_1_4");
			builder.put(grammarAccess.getRunCommandAccess().getNameAssignment_2_2(), "rule__RunCommand__NameAssignment_2_2");
			builder.put(grammarAccess.getParametersAccess().getParameterAssignment_1_2(), "rule__Parameters__ParameterAssignment_1_2");
			builder.put(grammarAccess.getTriggerAccess().getCronAssignment_1_2(), "rule__Trigger__CronAssignment_1_2");
			builder.put(grammarAccess.getBranchAccess().getNameAssignment_1_2(), "rule__Branch__NameAssignment_1_2");
			builder.put(grammarAccess.getBranchAccess().getBranchAssignment_1_4(), "rule__Branch__BranchAssignment_1_4");
			builder.put(grammarAccess.getJobWorkflowAccess().getNameAssignment_2_2(), "rule__JobWorkflow__NameAssignment_2_2");
			builder.put(grammarAccess.getJobWorkflowAccess().getApprovalJobAssignment_2_3(), "rule__JobWorkflow__ApprovalJobAssignment_2_3");
			builder.put(grammarAccess.getJobWorkflowAccess().getRequiresAssignment_2_4_1(), "rule__JobWorkflow__RequiresAssignment_2_4_1");
			builder.put(grammarAccess.getJobWorkflowAccess().getRequiresAssignment_2_4_2_1(), "rule__JobWorkflow__RequiresAssignment_2_4_2_1");
			builder.put(grammarAccess.getJobWorkflowAccess().getContextAssignment_2_5_1(), "rule__JobWorkflow__ContextAssignment_2_5_1");
			builder.put(grammarAccess.getJobWorkflowAccess().getContextAssignment_2_5_2_1(), "rule__JobWorkflow__ContextAssignment_2_5_2_1");
			builder.put(grammarAccess.getJobWorkflowAccess().getBranchesAssignment_2_6(), "rule__JobWorkflow__BranchesAssignment_2_6");
			builder.put(grammarAccess.getJobWorkflowAccess().getMatrixAssignment_2_7(), "rule__JobWorkflow__MatrixAssignment_2_7");
			builder.put(grammarAccess.getMatrixAccess().getAliasAssignment_1_1_1(), "rule__Matrix__AliasAssignment_1_1_1");
			builder.put(grammarAccess.getMatrixAccess().getMatrix_excludeAssignment_1_2_1_1(), "rule__Matrix__Matrix_excludeAssignment_1_2_1_1");
			builder.put(grammarAccess.getMatrixAccess().getMatrix_paramsAssignment_1_4_1(), "rule__Matrix__Matrix_paramsAssignment_1_4_1");
			builder.put(grammarAccess.getMatrixParamsAccess().getKeyAssignment_1_2(), "rule__MatrixParams__KeyAssignment_1_2");
			builder.put(grammarAccess.getMatrixParamsAccess().getValuesAssignment_1_4(), "rule__MatrixParams__ValuesAssignment_1_4");
			builder.put(grammarAccess.getMatrixParamsAccess().getValuesAssignment_1_5_1(), "rule__MatrixParams__ValuesAssignment_1_5_1");
			builder.put(grammarAccess.getMachineAccess().getNameAssignment_1_2(), "rule__Machine__NameAssignment_1_2");
			builder.put(grammarAccess.getMachineAccess().getImageAssignment_1_4(), "rule__Machine__ImageAssignment_1_4");
			builder.put(grammarAccess.getMachineAccess().getDocker_layer_cachingAssignment_1_5(), "rule__Machine__Docker_layer_cachingAssignment_1_5");
			builder.put(grammarAccess.getMachineAccess().getResourceClassAssignment_1_7(), "rule__Machine__ResourceClassAssignment_1_7");
			builder.put(grammarAccess.getMachineAccess().getShellAssignment_1_8_1(), "rule__Machine__ShellAssignment_1_8_1");
			builder.put(grammarAccess.getMachineAccess().getWorking_directoryAssignment_1_9_1(), "rule__Machine__Working_directoryAssignment_1_9_1");
			builder.put(grammarAccess.getMachineAccess().getEnvironmentsAssignment_1_10(), "rule__Machine__EnvironmentsAssignment_1_10");
			builder.put(grammarAccess.getMacOsAccess().getNameAssignment_1_2(), "rule__MacOs__NameAssignment_1_2");
			builder.put(grammarAccess.getMacOsAccess().getXcodeAssignment_1_3_1(), "rule__MacOs__XcodeAssignment_1_3_1");
			builder.put(grammarAccess.getMacOsAccess().getResourceClassAssignment_1_4_1(), "rule__MacOs__ResourceClassAssignment_1_4_1");
			builder.put(grammarAccess.getMacOsAccess().getShellAssignment_1_5_1(), "rule__MacOs__ShellAssignment_1_5_1");
			builder.put(grammarAccess.getMacOsAccess().getWorking_directoryAssignment_1_6_1(), "rule__MacOs__Working_directoryAssignment_1_6_1");
			builder.put(grammarAccess.getMacOsAccess().getEnvironmentsAssignment_1_7(), "rule__MacOs__EnvironmentsAssignment_1_7");
			builder.put(grammarAccess.getDockerAccess().getNameAssignment_1_2(), "rule__Docker__NameAssignment_1_2");
			builder.put(grammarAccess.getDockerAccess().getImageAssignment_1_4(), "rule__Docker__ImageAssignment_1_4");
			builder.put(grammarAccess.getDockerAccess().getResourceClassAssignment_1_6(), "rule__Docker__ResourceClassAssignment_1_6");
			builder.put(grammarAccess.getDockerAccess().getShellAssignment_1_7_1(), "rule__Docker__ShellAssignment_1_7_1");
			builder.put(grammarAccess.getDockerAccess().getWorking_directoryAssignment_1_8_1(), "rule__Docker__Working_directoryAssignment_1_8_1");
			builder.put(grammarAccess.getDockerAccess().getEntrypointAssignment_1_9_1(), "rule__Docker__EntrypointAssignment_1_9_1");
			builder.put(grammarAccess.getDockerAccess().getEntrypointAssignment_1_9_2_1(), "rule__Docker__EntrypointAssignment_1_9_2_1");
			builder.put(grammarAccess.getDockerAccess().getCommandAssignment_1_10_1(), "rule__Docker__CommandAssignment_1_10_1");
			builder.put(grammarAccess.getDockerAccess().getCommandAssignment_1_10_2_1(), "rule__Docker__CommandAssignment_1_10_2_1");
			builder.put(grammarAccess.getDockerAccess().getUserAssignment_1_11_1(), "rule__Docker__UserAssignment_1_11_1");
			builder.put(grammarAccess.getDockerAccess().getEnvironmentsAssignment_1_12(), "rule__Docker__EnvironmentsAssignment_1_12");
			builder.put(grammarAccess.getDockerAccess().getDocker_authAssignment_1_13(), "rule__Docker__Docker_authAssignment_1_13");
			builder.put(grammarAccess.getDockerAccess().getDocker_aws_authAssignment_1_14(), "rule__Docker__Docker_aws_authAssignment_1_14");
			builder.put(grammarAccess.getDocker_AuthAccess().getUsernameAssignment_1_2(), "rule__Docker_Auth__UsernameAssignment_1_2");
			builder.put(grammarAccess.getDocker_AuthAccess().getPasswordAssignment_1_4(), "rule__Docker_Auth__PasswordAssignment_1_4");
			builder.put(grammarAccess.getDocker_Aws_AuthsAccess().getAws_access_key_idAssignment_1_2(), "rule__Docker_Aws_Auths__Aws_access_key_idAssignment_1_2");
			builder.put(grammarAccess.getDocker_Aws_AuthsAccess().getAws_secret_access_keyAssignment_1_4(), "rule__Docker_Aws_Auths__Aws_secret_access_keyAssignment_1_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CircleciGrammarAccess grammarAccess;

	@Override
	protected InternalCircleciParser createParser() {
		InternalCircleciParser result = new InternalCircleciParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new CircleciTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CircleciGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CircleciGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
