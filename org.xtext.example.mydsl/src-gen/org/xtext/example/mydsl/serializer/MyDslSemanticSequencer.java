/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import devOps.Artifact;
import devOps.Command;
import devOps.DevOpsPackage;
import devOps.Environment;
import devOps.IfThenElse;
import devOps.Job;
import devOps.Parallel;
import devOps.Parameters;
import devOps.Permission;
import devOps.Pipeline;
import devOps.Tool_Framework;
import devOps.When;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DevOpsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DevOpsPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case DevOpsPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case DevOpsPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case DevOpsPackage.IF_THEN_ELSE:
				sequence_IfThenElse(context, (IfThenElse) semanticObject); 
				return; 
			case DevOpsPackage.JOB:
				sequence_Job(context, (Job) semanticObject); 
				return; 
			case DevOpsPackage.PARALLEL:
				sequence_Parallel(context, (Parallel) semanticObject); 
				return; 
			case DevOpsPackage.PARAMETERS:
				sequence_Parameters(context, (Parameters) semanticObject); 
				return; 
			case DevOpsPackage.PERMISSION:
				sequence_Permission(context, (Permission) semanticObject); 
				return; 
			case DevOpsPackage.PIPELINE:
				sequence_Pipeline(context, (Pipeline) semanticObject); 
				return; 
			case DevOpsPackage.TOOL_FRAMEWORK:
				sequence_Tool_Framework(context, (Tool_Framework) semanticObject); 
				return; 
			case DevOpsPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     Name3=EString?
	 * </pre>
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (Description=EString? tool=Tool_Framework? (parameters+=Parameters parameters+=Parameters*)?)
	 * </pre>
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (Key=EString? Value=EString?)
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IfThenElse returns IfThenElse
	 *
	 * Constraint:
	 *     (
	 *         Condition=EString? 
	 *         (if+=Command if+=Command*)? 
	 *         (else+=Command else+=Command*)? 
	 *         (ifelse+=IfThenElse ifelse+=IfThenElse*)? 
	 *         (elseif+=IfThenElse elseif+=IfThenElse*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_IfThenElse(ISerializationContext context, IfThenElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Job returns Job
	 *
	 * Constraint:
	 *     (
	 *         Allow_faillure?='Allow_faillure'? 
	 *         Name1=EString? 
	 *         Description1=EString? 
	 *         (output+=[Artifact|EString] output+=[Artifact|EString]*)? 
	 *         (tool_framework_job+=Tool_Framework tool_framework_job+=Tool_Framework*)? 
	 *         (command+=Command command+=Command*)? 
	 *         (ifthenelse+=IfThenElse ifthenelse+=IfThenElse*)? 
	 *         (input+=Artifact input+=Artifact*)? 
	 *         (environment+=Environment environment+=Environment*)? 
	 *         (permission+=Permission permission+=Permission*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Job(ISerializationContext context, Job semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parallel returns Parallel
	 *
	 * Constraint:
	 *     (job+=Job job+=Job*)?
	 * </pre>
	 */
	protected void sequence_Parallel(ISerializationContext context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameters returns Parameters
	 *
	 * Constraint:
	 *     Parameter=EString?
	 * </pre>
	 */
	protected void sequence_Parameters(ISerializationContext context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Permission returns Permission
	 *
	 * Constraint:
	 *     (Key=EString? Value=EString?)
	 * </pre>
	 */
	protected void sequence_Permission(ISerializationContext context, Permission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pipeline returns Pipeline
	 *
	 * Constraint:
	 *     (
	 *         Name0=EString | 
	 *         (when+=When when+=When*) | 
	 *         (job+=Job job+=Job*) | 
	 *         (pipeline_tool_framework+=Tool_Framework pipeline_tool_framework+=Tool_Framework*) | 
	 *         (pipeline_environment+=Environment pipeline_environment+=Environment*) | 
	 *         (permission+=Permission permission+=Permission*) | 
	 *         (parallel+=Parallel parallel+=Parallel*)
	 *     )?
	 * </pre>
	 */
	protected void sequence_Pipeline(ISerializationContext context, Pipeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Tool_Framework returns Tool_Framework
	 *
	 * Constraint:
	 *     Name5=EString?
	 * </pre>
	 */
	protected void sequence_Tool_Framework(ISerializationContext context, Tool_Framework semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     (Name4=EString Trigger=EString? Timer=EString?)
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
