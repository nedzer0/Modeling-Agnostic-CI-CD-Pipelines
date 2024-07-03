/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Environment;
import circleCI_metamodel.Executor;
import circleCI_metamodel.Job;
import circleCI_metamodel.Parameter;
import circleCI_metamodel.Step;

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
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getReuseExecutor <em>Reuse Executor</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobImpl#getReuseCommand <em>Reuse Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
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
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final short PARALLELISM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected short parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getReuseExecutor() <em>Reuse Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseExecutor()
	 * @generated
	 * @ordered
	 */
	protected static final String REUSE_EXECUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReuseExecutor() <em>Reuse Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseExecutor()
	 * @generated
	 * @ordered
	 */
	protected String reuseExecutor = REUSE_EXECUTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutors() <em>Executors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor> executors;

	/**
	 * The default value of the '{@link #getReuseCommand() <em>Reuse Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String REUSE_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReuseCommand() <em>Reuse Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseCommand()
	 * @generated
	 * @ordered
	 */
	protected String reuseCommand = REUSE_COMMAND_EDEFAULT;

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
		return CircleCI_metamodelPackage.Literals.JOB;
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
					CircleCI_metamodelPackage.JOB__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, CircleCI_metamodelPackage.JOB__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					CircleCI_metamodelPackage.JOB__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelism(short newParallelism) {
		short oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB__PARALLELISM,
					oldParallelism, parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReuseExecutor() {
		return reuseExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReuseExecutor(String newReuseExecutor) {
		String oldReuseExecutor = reuseExecutor;
		reuseExecutor = newReuseExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR,
					oldReuseExecutor, reuseExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Executor> getExecutors() {
		if (executors == null) {
			executors = new EObjectContainmentEList<Executor>(Executor.class, this,
					CircleCI_metamodelPackage.JOB__EXECUTORS);
		}
		return executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReuseCommand() {
		return reuseCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReuseCommand(String newReuseCommand) {
		String oldReuseCommand = reuseCommand;
		reuseCommand = newReuseCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB__REUSE_COMMAND,
					oldReuseCommand, reuseCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
			return ((InternalEList<?>) getExecutors()).basicRemove(otherEnd, msgs);
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
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
			return getEnvironments();
		case CircleCI_metamodelPackage.JOB__STEPS:
			return getSteps();
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
			return getParameters();
		case CircleCI_metamodelPackage.JOB__NAME:
			return getName();
		case CircleCI_metamodelPackage.JOB__PARALLELISM:
			return getParallelism();
		case CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR:
			return getReuseExecutor();
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
			return getExecutors();
		case CircleCI_metamodelPackage.JOB__REUSE_COMMAND:
			return getReuseCommand();
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
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__PARALLELISM:
			setParallelism((Short) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR:
			setReuseExecutor((String) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
			getExecutors().clear();
			getExecutors().addAll((Collection<? extends Executor>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB__REUSE_COMMAND:
			setReuseCommand((String) newValue);
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
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case CircleCI_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			return;
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
			getParameters().clear();
			return;
		case CircleCI_metamodelPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.JOB__PARALLELISM:
			setParallelism(PARALLELISM_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR:
			setReuseExecutor(REUSE_EXECUTOR_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
			getExecutors().clear();
			return;
		case CircleCI_metamodelPackage.JOB__REUSE_COMMAND:
			setReuseCommand(REUSE_COMMAND_EDEFAULT);
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
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case CircleCI_metamodelPackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case CircleCI_metamodelPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCI_metamodelPackage.JOB__PARALLELISM:
			return parallelism != PARALLELISM_EDEFAULT;
		case CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR:
			return REUSE_EXECUTOR_EDEFAULT == null ? reuseExecutor != null
					: !REUSE_EXECUTOR_EDEFAULT.equals(reuseExecutor);
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
			return executors != null && !executors.isEmpty();
		case CircleCI_metamodelPackage.JOB__REUSE_COMMAND:
			return REUSE_COMMAND_EDEFAULT == null ? reuseCommand != null : !REUSE_COMMAND_EDEFAULT.equals(reuseCommand);
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
		result.append(", parallelism: ");
		result.append(parallelism);
		result.append(", reuseExecutor: ");
		result.append(reuseExecutor);
		result.append(", reuseCommand: ");
		result.append(reuseCommand);
		result.append(')');
		return result.toString();
	}

} //JobImpl
