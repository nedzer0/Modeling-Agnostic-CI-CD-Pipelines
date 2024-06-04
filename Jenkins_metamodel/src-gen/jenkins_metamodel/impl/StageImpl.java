/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Agent;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Input;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Matrix;
import jenkins_metamodel.Stage;
import jenkins_metamodel.StageOption;
import jenkins_metamodel.Step;
import jenkins_metamodel.When;

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
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getName <em>Name</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#isParallel <em>Parallel</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getStage_options <em>Stage options</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stages;

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
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<When> when;

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
	 * The default value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_FAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected boolean failFast = FAIL_FAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStage_options() <em>Stage options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage_options()
	 * @generated
	 * @ordered
	 */
	protected EList<StageOption> stage_options;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, Jenkins_metamodelPackage.STAGE__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, Jenkins_metamodelPackage.STAGE__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, Jenkins_metamodelPackage.STAGE__STEPS);
		}
		return steps;
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
					Jenkins_metamodelPackage.STAGE__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, Jenkins_metamodelPackage.STAGE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<When>(When.class, this, Jenkins_metamodelPackage.STAGE__WHEN);
		}
		return when;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFailFast() {
		return failFast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailFast(boolean newFailFast) {
		boolean oldFailFast = failFast;
		failFast = newFailFast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__FAIL_FAST,
					oldFailFast, failFast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallel(boolean newParallel) {
		boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__PARALLEL, oldParallel,
					parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StageOption> getStage_options() {
		if (stage_options == null) {
			stage_options = new EObjectContainmentEList<StageOption>(StageOption.class, this,
					Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS);
		}
		return stage_options;
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
					Jenkins_metamodelPackage.STAGE__MATRIX, oldMatrix, newMatrix);
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
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.STAGE__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject) newMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.STAGE__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__MATRIX, newMatrix,
					newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.STAGE__STAGES:
			return ((InternalEList<?>) getStages()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__AGENTS:
			return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return ((InternalEList<?>) getWhen()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS:
			return ((InternalEList<?>) getStage_options()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__MATRIX:
			return basicSetMatrix(null, msgs);
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
		case Jenkins_metamodelPackage.STAGE__STAGES:
			return getStages();
		case Jenkins_metamodelPackage.STAGE__AGENTS:
			return getAgents();
		case Jenkins_metamodelPackage.STAGE__STEPS:
			return getSteps();
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENTS:
			return getEnvironments();
		case Jenkins_metamodelPackage.STAGE__INPUTS:
			return getInputs();
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return getWhen();
		case Jenkins_metamodelPackage.STAGE__NAME:
			return getName();
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			return isFailFast();
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			return isParallel();
		case Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS:
			return getStage_options();
		case Jenkins_metamodelPackage.STAGE__MATRIX:
			return getMatrix();
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
		case Jenkins_metamodelPackage.STAGE__STAGES:
			getStages().clear();
			getStages().addAll((Collection<? extends Stage>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__AGENTS:
			getAgents().clear();
			getAgents().addAll((Collection<? extends Agent>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__WHEN:
			getWhen().clear();
			getWhen().addAll((Collection<? extends When>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__NAME:
			setName((String) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			setFailFast((Boolean) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			setParallel((Boolean) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS:
			getStage_options().clear();
			getStage_options().addAll((Collection<? extends StageOption>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__MATRIX:
			setMatrix((Matrix) newValue);
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
		case Jenkins_metamodelPackage.STAGE__STAGES:
			getStages().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__AGENTS:
			getAgents().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__STEPS:
			getSteps().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__INPUTS:
			getInputs().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__WHEN:
			getWhen().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			setFailFast(FAIL_FAST_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			setParallel(PARALLEL_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS:
			getStage_options().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__MATRIX:
			setMatrix((Matrix) null);
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
		case Jenkins_metamodelPackage.STAGE__STAGES:
			return stages != null && !stages.isEmpty();
		case Jenkins_metamodelPackage.STAGE__AGENTS:
			return agents != null && !agents.isEmpty();
		case Jenkins_metamodelPackage.STAGE__STEPS:
			return steps != null && !steps.isEmpty();
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case Jenkins_metamodelPackage.STAGE__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return when != null && !when.isEmpty();
		case Jenkins_metamodelPackage.STAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			return failFast != FAIL_FAST_EDEFAULT;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			return parallel != PARALLEL_EDEFAULT;
		case Jenkins_metamodelPackage.STAGE__STAGE_OPTIONS:
			return stage_options != null && !stage_options.isEmpty();
		case Jenkins_metamodelPackage.STAGE__MATRIX:
			return matrix != null;
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
		result.append(", failFast: ");
		result.append(failFast);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(')');
		return result.toString();
	}

} //StageImpl
