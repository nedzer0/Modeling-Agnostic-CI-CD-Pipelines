/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.Agent;
import cICD_metamodel.Artifact;
import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.Environment;
import cICD_metamodel.IfStep;
import cICD_metamodel.Job;
import cICD_metamodel.Matrix;
import cICD_metamodel.Output;
import cICD_metamodel.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getIfStep <em>If Step</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getAllowFaillure <em>Allow Faillure</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link cICD_metamodel.impl.JobImpl#getRequireJobs <em>Require Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getIfStep() <em>If Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfStep()
	 * @generated
	 * @ordered
	 */
	protected EList<IfStep> ifStep;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

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
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix matrix;

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
	 * The default value of the '{@link #getAllowFaillure() <em>Allow Faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowFaillure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_FAILLURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowFaillure() <em>Allow Faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowFaillure()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowFaillure = ALLOW_FAILLURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected String parallel = PARALLEL_EDEFAULT;

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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The cached value of the '{@link #getRequireJobs() <em>Require Jobs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requireJobs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICD_metamodelPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, CICD_metamodelPackage.JOB__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfStep> getIfStep() {
		if (ifStep == null) {
			ifStep = new EObjectContainmentEList<IfStep>(IfStep.class, this, CICD_metamodelPackage.JOB__IF_STEP);
		}
		return ifStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this,
					CICD_metamodelPackage.JOB__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					CICD_metamodelPackage.JOB__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, CICD_metamodelPackage.JOB__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(Matrix newMatrix, NotificationChain msgs) {
		Matrix oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICD_metamodelPackage.JOB__MATRIX, oldMatrix, newMatrix);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatrix(Matrix newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject) matrix).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICD_metamodelPackage.JOB__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject) newMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICD_metamodelPackage.JOB__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.JOB__MATRIX, newMatrix,
					newMatrix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowFaillure() {
		return allowFaillure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFaillure(Boolean newAllowFaillure) {
		Boolean oldAllowFaillure = allowFaillure;
		allowFaillure = newAllowFaillure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.JOB__ALLOW_FAILLURE,
					oldAllowFaillure, allowFaillure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallel(String newParallel) {
		String oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.JOB__PARALLEL, oldParallel,
					parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, CICD_metamodelPackage.JOB__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, CICD_metamodelPackage.JOB__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequireJobs() {
		if (requireJobs == null) {
			requireJobs = new EDataTypeUniqueEList<String>(String.class, this, CICD_metamodelPackage.JOB__REQUIRE_JOBS);
		}
		return requireJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICD_metamodelPackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__IF_STEP:
			return ((InternalEList<?>) getIfStep()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__MATRIX:
			return basicSetMatrix(null, msgs);
		case CICD_metamodelPackage.JOB__AGENTS:
			return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.JOB__OUTPUT:
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
		case CICD_metamodelPackage.JOB__STEPS:
			return getSteps();
		case CICD_metamodelPackage.JOB__IF_STEP:
			return getIfStep();
		case CICD_metamodelPackage.JOB__ARTIFACTS:
			return getArtifacts();
		case CICD_metamodelPackage.JOB__ENVIRONMENTS:
			return getEnvironments();
		case CICD_metamodelPackage.JOB__JOBS:
			return getJobs();
		case CICD_metamodelPackage.JOB__MATRIX:
			return getMatrix();
		case CICD_metamodelPackage.JOB__NAME:
			return getName();
		case CICD_metamodelPackage.JOB__ALLOW_FAILLURE:
			return getAllowFaillure();
		case CICD_metamodelPackage.JOB__PARALLEL:
			return getParallel();
		case CICD_metamodelPackage.JOB__AGENTS:
			return getAgents();
		case CICD_metamodelPackage.JOB__OUTPUT:
			return getOutput();
		case CICD_metamodelPackage.JOB__REQUIRE_JOBS:
			return getRequireJobs();
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
		case CICD_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case CICD_metamodelPackage.JOB__IF_STEP:
			getIfStep().clear();
			getIfStep().addAll((Collection<? extends IfStep>) newValue);
			return;
		case CICD_metamodelPackage.JOB__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case CICD_metamodelPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case CICD_metamodelPackage.JOB__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case CICD_metamodelPackage.JOB__MATRIX:
			setMatrix((Matrix) newValue);
			return;
		case CICD_metamodelPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case CICD_metamodelPackage.JOB__ALLOW_FAILLURE:
			setAllowFaillure((Boolean) newValue);
			return;
		case CICD_metamodelPackage.JOB__PARALLEL:
			setParallel((String) newValue);
			return;
		case CICD_metamodelPackage.JOB__AGENTS:
			getAgents().clear();
			getAgents().addAll((Collection<? extends Agent>) newValue);
			return;
		case CICD_metamodelPackage.JOB__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
			return;
		case CICD_metamodelPackage.JOB__REQUIRE_JOBS:
			getRequireJobs().clear();
			getRequireJobs().addAll((Collection<? extends String>) newValue);
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
		case CICD_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			return;
		case CICD_metamodelPackage.JOB__IF_STEP:
			getIfStep().clear();
			return;
		case CICD_metamodelPackage.JOB__ARTIFACTS:
			getArtifacts().clear();
			return;
		case CICD_metamodelPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case CICD_metamodelPackage.JOB__JOBS:
			getJobs().clear();
			return;
		case CICD_metamodelPackage.JOB__MATRIX:
			setMatrix((Matrix) null);
			return;
		case CICD_metamodelPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CICD_metamodelPackage.JOB__ALLOW_FAILLURE:
			setAllowFaillure(ALLOW_FAILLURE_EDEFAULT);
			return;
		case CICD_metamodelPackage.JOB__PARALLEL:
			setParallel(PARALLEL_EDEFAULT);
			return;
		case CICD_metamodelPackage.JOB__AGENTS:
			getAgents().clear();
			return;
		case CICD_metamodelPackage.JOB__OUTPUT:
			getOutput().clear();
			return;
		case CICD_metamodelPackage.JOB__REQUIRE_JOBS:
			getRequireJobs().clear();
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
		case CICD_metamodelPackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case CICD_metamodelPackage.JOB__IF_STEP:
			return ifStep != null && !ifStep.isEmpty();
		case CICD_metamodelPackage.JOB__ARTIFACTS:
			return artifacts != null && !artifacts.isEmpty();
		case CICD_metamodelPackage.JOB__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case CICD_metamodelPackage.JOB__JOBS:
			return jobs != null && !jobs.isEmpty();
		case CICD_metamodelPackage.JOB__MATRIX:
			return matrix != null;
		case CICD_metamodelPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CICD_metamodelPackage.JOB__ALLOW_FAILLURE:
			return ALLOW_FAILLURE_EDEFAULT == null ? allowFaillure != null
					: !ALLOW_FAILLURE_EDEFAULT.equals(allowFaillure);
		case CICD_metamodelPackage.JOB__PARALLEL:
			return PARALLEL_EDEFAULT == null ? parallel != null : !PARALLEL_EDEFAULT.equals(parallel);
		case CICD_metamodelPackage.JOB__AGENTS:
			return agents != null && !agents.isEmpty();
		case CICD_metamodelPackage.JOB__OUTPUT:
			return output != null && !output.isEmpty();
		case CICD_metamodelPackage.JOB__REQUIRE_JOBS:
			return requireJobs != null && !requireJobs.isEmpty();
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
		result.append(", allowFaillure: ");
		result.append(allowFaillure);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(", requireJobs: ");
		result.append(requireJobs);
		result.append(')');
		return result.toString();
	}

} //JobImpl
