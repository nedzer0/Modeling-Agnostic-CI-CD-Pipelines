package org.gemoc.agro.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.ActivityResource;
import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.GrainIs;
import org.gemoc.agro.activitiesDSL.Model;
import org.gemoc.agro.activitiesDSL.NoRain;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.services.ActivitiesDSLGrammarAccess;

@SuppressWarnings("all")
public class ActivitiesDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivitiesDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivitiesDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivitiesDSLPackage.ACTIVITY_RESOURCE:
				if(context == grammarAccess.getActivityResourceRule()) {
					sequence_ActivityResource(context, (ActivityResource) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.CULTURE:
				if(context == grammarAccess.getCultureRule()) {
					sequence_Culture(context, (Culture) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.DELAY_SINCE_ACTIVY:
				if(context == grammarAccess.getDelaySinceActivyRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_DelaySinceActivy(context, (DelaySinceActivy) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.EXPLOITATION_ACTIVITY:
				if(context == grammarAccess.getExploitationActivityRule()) {
					sequence_ExploitationActivity(context, (ExploitationActivity) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.GRAIN_IS:
				if(context == grammarAccess.getGrainIsRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_GrainIs(context, (GrainIs) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.NO_RAIN:
				if(context == grammarAccess.getNoRainRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_NoRain(context, (NoRain) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.RESOURCE_KIND:
				if(context == grammarAccess.getResourceKindRule()) {
					sequence_ResourceKind(context, (ResourceKind) semanticObject); 
					return; 
				}
				else break;
			case ActivitiesDSLPackage.TEMP_OF_THE_DAY:
				if(context == grammarAccess.getPredicateRule() ||
				   context == grammarAccess.getTempOfTheDayRule()) {
					sequence_TempOfTheDay(context, (TempOfTheDay) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (quantity=INT resourceKind=[ResourceKind|ID])
	 */
	protected void sequence_ActivityResource(EObject context, ActivityResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.ACTIVITY_RESOURCE__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.ACTIVITY_RESOURCE__QUANTITY));
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.ACTIVITY_RESOURCE__RESOURCE_KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.ACTIVITY_RESOURCE__RESOURCE_KIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityResourceAccess().getQuantityINTTerminalRuleCall_0_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getActivityResourceAccess().getResourceKindResourceKindIDTerminalRuleCall_1_0_1(), semanticObject.getResourceKind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID activities+=ExploitationActivity*)
	 */
	protected void sequence_Culture(EObject context, Culture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (day=INT month=Month)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.DATE__DAY));
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.DATE__MONTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_1_0(), semanticObject.getMonth());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prerequisite=[ExploitationActivity|ID] days=INT?)
	 */
	protected void sequence_DelaySinceActivy(EObject context, DelaySinceActivy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         frequency=Frequency? 
	 *         (startDate=Date endDate=Date)? 
	 *         (predicates+=Predicate predicates+=Predicate*)? 
	 *         (uses+=ActivityResource uses+=ActivityResource*)?
	 *     )
	 */
	protected void sequence_ExploitationActivity(EObject context, ExploitationActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     state=STRING
	 */
	protected void sequence_GrainIs(EObject context, GrainIs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.GRAIN_IS__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.GRAIN_IS__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGrainIsAccess().getStateSTRINGTerminalRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cultures+=Culture* resourceKinds+=ResourceKind*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     days=INT
	 */
	protected void sequence_NoRain(EObject context, NoRain semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.NO_RAIN__DAYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.NO_RAIN__DAYS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoRainAccess().getDaysINTTerminalRuleCall_1_0(), semanticObject.getDays());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ResourceKind(EObject context, ResourceKind semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.RESOURCE_KIND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.RESOURCE_KIND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceKindAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comparison=Comp lowerTempBound=INT unit=TempUnit)
	 */
	protected void sequence_TempOfTheDay(EObject context, TempOfTheDay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__COMPARISON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__COMPARISON));
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__LOWER_TEMP_BOUND));
			if(transientValues.isValueTransient(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitiesDSLPackage.Literals.TEMP_OF_THE_DAY__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTempOfTheDayAccess().getComparisonCompEnumRuleCall_1_0(), semanticObject.getComparison());
		feeder.accept(grammarAccess.getTempOfTheDayAccess().getLowerTempBoundINTTerminalRuleCall_2_0(), semanticObject.getLowerTempBound());
		feeder.accept(grammarAccess.getTempOfTheDayAccess().getUnitTempUnitEnumRuleCall_3_0(), semanticObject.getUnit());
		feeder.finish();
	}
}
