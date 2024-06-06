/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.Agent;
import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.Environment;
import cICD_metamodel.Input;
import cICD_metamodel.Job;
import cICD_metamodel.Output;
import cICD_metamodel.Pipeline;
import cICD_metamodel.ScheduleTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cICD_metamodel.impl.PipelineImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

	/**
	 * The cached value of the '{@link #getPipeline_environment() <em>Pipeline environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline_environment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> pipeline_environment;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleTrigger> triggers;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICD_metamodelPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, CICD_metamodelPackage.PIPELINE__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getPipeline_environment() {
		if (pipeline_environment == null) {
			pipeline_environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT);
		}
		return pipeline_environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScheduleTrigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<ScheduleTrigger>(ScheduleTrigger.class, this,
					CICD_metamodelPackage.PIPELINE__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, CICD_metamodelPackage.PIPELINE__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.PIPELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, CICD_metamodelPackage.PIPELINE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, CICD_metamodelPackage.PIPELINE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICD_metamodelPackage.PIPELINE__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return ((InternalEList<?>) getPipeline_environment()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.PIPELINE__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.PIPELINE__AGENTS:
			return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.PIPELINE__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.PIPELINE__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CICD_metamodelPackage.PIPELINE__JOBS:
			return getJobs();
		case CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return getPipeline_environment();
		case CICD_metamodelPackage.PIPELINE__TRIGGERS:
			return getTriggers();
		case CICD_metamodelPackage.PIPELINE__AGENTS:
			return getAgents();
		case CICD_metamodelPackage.PIPELINE__NAME:
			return getName();
		case CICD_metamodelPackage.PIPELINE__INPUTS:
			return getInputs();
		case CICD_metamodelPackage.PIPELINE__OUTPUT:
			return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CICD_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			getPipeline_environment().addAll((Collection<? extends Environment>) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends ScheduleTrigger>) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__AGENTS:
			getAgents().clear();
			getAgents().addAll((Collection<? extends Agent>) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__NAME:
			setName((String) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
			return;
		case CICD_metamodelPackage.PIPELINE__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CICD_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			return;
		case CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			return;
		case CICD_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			return;
		case CICD_metamodelPackage.PIPELINE__AGENTS:
			getAgents().clear();
			return;
		case CICD_metamodelPackage.PIPELINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CICD_metamodelPackage.PIPELINE__INPUTS:
			getInputs().clear();
			return;
		case CICD_metamodelPackage.PIPELINE__OUTPUT:
			getOutput().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CICD_metamodelPackage.PIPELINE__JOBS:
			return jobs != null && !jobs.isEmpty();
		case CICD_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return pipeline_environment != null && !pipeline_environment.isEmpty();
		case CICD_metamodelPackage.PIPELINE__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case CICD_metamodelPackage.PIPELINE__AGENTS:
			return agents != null && !agents.isEmpty();
		case CICD_metamodelPackage.PIPELINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CICD_metamodelPackage.PIPELINE__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case CICD_metamodelPackage.PIPELINE__OUTPUT:
			return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
