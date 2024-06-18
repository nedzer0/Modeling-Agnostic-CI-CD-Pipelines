/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.cicd.serializer;

import cICD_metamodel.Agent;
import cICD_metamodel.Artifact;
import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.Cache;
import cICD_metamodel.Command;
import cICD_metamodel.DockerContainer;
import cICD_metamodel.Environment;
import cICD_metamodel.IfStep;
import cICD_metamodel.Input;
import cICD_metamodel.Job;
import cICD_metamodel.Matrix;
import cICD_metamodel.MatrixConfig;
import cICD_metamodel.Output;
import cICD_metamodel.Parameters;
import cICD_metamodel.Pipeline;
import cICD_metamodel.ScheduleTrigger;
import cICD_metamodel.Step;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.cicd.services.CICDGrammarAccess;

@SuppressWarnings("all")
public class CICDSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CICDGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CICD_metamodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CICD_metamodelPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case CICD_metamodelPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case CICD_metamodelPackage.CACHE:
				sequence_Cache(context, (Cache) semanticObject); 
				return; 
			case CICD_metamodelPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case CICD_metamodelPackage.DOCKER_CONTAINER:
				sequence_DockerContainer(context, (DockerContainer) semanticObject); 
				return; 
			case CICD_metamodelPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case CICD_metamodelPackage.IF_STEP:
				sequence_IfStep(context, (IfStep) semanticObject); 
				return; 
			case CICD_metamodelPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case CICD_metamodelPackage.JOB:
				sequence_Job(context, (Job) semanticObject); 
				return; 
			case CICD_metamodelPackage.MATRIX:
				sequence_Matrix(context, (Matrix) semanticObject); 
				return; 
			case CICD_metamodelPackage.MATRIX_CONFIG:
				sequence_MatrixConfig(context, (MatrixConfig) semanticObject); 
				return; 
			case CICD_metamodelPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case CICD_metamodelPackage.PARAMETERS:
				sequence_Parameters(context, (Parameters) semanticObject); 
				return; 
			case CICD_metamodelPackage.PIPELINE:
				sequence_Pipeline(context, (Pipeline) semanticObject); 
				return; 
			case CICD_metamodelPackage.SCHEDULE_TRIGGER:
				sequence_ScheduleTrigger(context, (ScheduleTrigger) semanticObject); 
				return; 
			case CICD_metamodelPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Agent returns Agent
	 *
	 * Constraint:
	 *     ((labels+=EString labels+=EString*)? container=DockerContainer?)
	 * </pre>
	 */
	protected void sequence_Agent(ISerializationContext context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     (name=EString? message=EString? (path+=EString path+=EString*)? type=ARTIFACT_TYPE?)
	 * </pre>
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cache returns Cache
	 *
	 * Constraint:
	 *     (mode=CACHE_MODE (paths+=EString paths+=EString*)? key=EString? (keys+=EString keys+=EString*)?)
	 * </pre>
	 */
	protected void sequence_Cache(ISerializationContext context, Cache semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.COMMAND__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_2_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DockerContainer returns DockerContainer
	 *
	 * Constraint:
	 *     (image=EString username=EString? password=EString? environments+=Environment*)
	 * </pre>
	 */
	protected void sequence_DockerContainer(ISerializationContext context, DockerContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (key=EString value=EString)
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.ENVIRONMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.ENVIRONMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.ENVIRONMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.ENVIRONMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_1_2_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_1_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IfStep returns IfStep
	 *
	 * Constraint:
	 *     (condition=EString if_steps+=Step* else_steps+=Step*)
	 * </pre>
	 */
	protected void sequence_IfStep(ISerializationContext context, IfStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (name=EString type=INPUT_TYPE default=EString? description=EString? (values+=EString values+=EString*)?)
	 * </pre>
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Job returns Job
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         allowFaillure?='allowFaillure'? 
	 *         parallel=EString? 
	 *         (requireJobs+=EString requireJobs+=EString*)? 
	 *         IfStep+=IfStep* 
	 *         artifacts+=Artifact* 
	 *         environments+=Environment* 
	 *         jobs+=Job* 
	 *         matrix=Matrix? 
	 *         agents+=Agent* 
	 *         output+=Output* 
	 *         steps+=Step*
	 *     )
	 * </pre>
	 */
	protected void sequence_Job(ISerializationContext context, Job semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MatrixConfig returns MatrixConfig
	 *
	 * Constraint:
	 *     (name=EString values+=EString values+=EString* type=MATRIX_CONFIG_TYPE)
	 * </pre>
	 */
	protected void sequence_MatrixConfig(ISerializationContext context, MatrixConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Matrix returns Matrix
	 *
	 * Constraint:
	 *     (name=EString? steps+=Step* jobs+=Job* configs+=MatrixConfig+)
	 * </pre>
	 */
	protected void sequence_Matrix(ISerializationContext context, Matrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 * </pre>
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.OUTPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.OUTPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.OUTPUT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.OUTPUT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOutputAccess().getValueEStringParserRuleCall_1_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameters returns Parameters
	 *
	 * Constraint:
	 *     parameter=EString
	 * </pre>
	 */
	protected void sequence_Parameters(ISerializationContext context, Parameters semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.PARAMETERS__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.PARAMETERS__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParametersAccess().getParameterEStringParserRuleCall_1_2_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pipeline returns Pipeline
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         jobs+=Job+ 
	 *         pipeline_environment+=Environment* 
	 *         triggers+=ScheduleTrigger* 
	 *         agents+=Agent* 
	 *         inputs+=Input* 
	 *         output+=Output*
	 *     )
	 * </pre>
	 */
	protected void sequence_Pipeline(ISerializationContext context, Pipeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScheduleTrigger returns ScheduleTrigger
	 *
	 * Constraint:
	 *     timer=EString
	 * </pre>
	 */
	protected void sequence_ScheduleTrigger(ISerializationContext context, ScheduleTrigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CICD_metamodelPackage.Literals.SCHEDULE_TRIGGER__TIMER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CICD_metamodelPackage.Literals.SCHEDULE_TRIGGER__TIMER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScheduleTriggerAccess().getTimerEStringParserRuleCall_1_2_0(), semanticObject.getTimer());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (cache+=Cache* environments+=Environment* IfStep=IfStep? commands+=Command+ parameters+=Parameters*)
	 * </pre>
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
