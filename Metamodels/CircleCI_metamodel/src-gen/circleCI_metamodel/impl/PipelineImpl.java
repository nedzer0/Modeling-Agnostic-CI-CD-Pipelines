/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Command;
import circleCI_metamodel.Executor;
import circleCI_metamodel.Job;
import circleCI_metamodel.Orb;
import circleCI_metamodel.Pipeline;
import circleCI_metamodel.Workflow;

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
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getOrbs <em>Orbs</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#isSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getOrbs() <em>Orbs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbs()
	 * @generated
	 * @ordered
	 */
	protected EList<Orb> orbs;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow workflow;

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
	 * The cached value of the '{@link #getExecutors() <em>Executors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor> executors;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSetup() <em>Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SETUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSetup() <em>Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetup()
	 * @generated
	 * @ordered
	 */
	protected boolean setup = SETUP_EDEFAULT;

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
		return CircleCI_metamodelPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Orb> getOrbs() {
		if (orbs == null) {
			orbs = new EObjectContainmentEList<Orb>(Orb.class, this, CircleCI_metamodelPackage.PIPELINE__ORBS);
		}
		return orbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this,
					CircleCI_metamodelPackage.PIPELINE__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(Workflow newWorkflow, NotificationChain msgs) {
		Workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.PIPELINE__WORKFLOW, oldWorkflow, newWorkflow);
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
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != workflow) {
			NotificationChain msgs = null;
			if (workflow != null)
				msgs = ((InternalEObject) workflow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.PIPELINE__WORKFLOW, null, msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject) newWorkflow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.PIPELINE__WORKFLOW, null, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.PIPELINE__WORKFLOW,
					newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, CircleCI_metamodelPackage.PIPELINE__JOBS);
		}
		return jobs;
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
					CircleCI_metamodelPackage.PIPELINE__EXECUTORS);
		}
		return executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.PIPELINE__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetup(boolean newSetup) {
		boolean oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.PIPELINE__SETUP, oldSetup,
					setup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.PIPELINE__ORBS:
			return ((InternalEList<?>) getOrbs()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.PIPELINE__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return basicSetWorkflow(null, msgs);
		case CircleCI_metamodelPackage.PIPELINE__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.PIPELINE__EXECUTORS:
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
		case CircleCI_metamodelPackage.PIPELINE__ORBS:
			return getOrbs();
		case CircleCI_metamodelPackage.PIPELINE__COMMANDS:
			return getCommands();
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return getWorkflow();
		case CircleCI_metamodelPackage.PIPELINE__JOBS:
			return getJobs();
		case CircleCI_metamodelPackage.PIPELINE__EXECUTORS:
			return getExecutors();
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			return getVersion();
		case CircleCI_metamodelPackage.PIPELINE__SETUP:
			return isSetup();
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
		case CircleCI_metamodelPackage.PIPELINE__ORBS:
			getOrbs().clear();
			getOrbs().addAll((Collection<? extends Orb>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			setWorkflow((Workflow) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__EXECUTORS:
			getExecutors().clear();
			getExecutors().addAll((Collection<? extends Executor>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			setVersion((String) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__SETUP:
			setSetup((Boolean) newValue);
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
		case CircleCI_metamodelPackage.PIPELINE__ORBS:
			getOrbs().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__COMMANDS:
			getCommands().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			setWorkflow((Workflow) null);
			return;
		case CircleCI_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__EXECUTORS:
			getExecutors().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.PIPELINE__SETUP:
			setSetup(SETUP_EDEFAULT);
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
		case CircleCI_metamodelPackage.PIPELINE__ORBS:
			return orbs != null && !orbs.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__COMMANDS:
			return commands != null && !commands.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return workflow != null;
		case CircleCI_metamodelPackage.PIPELINE__JOBS:
			return jobs != null && !jobs.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__EXECUTORS:
			return executors != null && !executors.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case CircleCI_metamodelPackage.PIPELINE__SETUP:
			return setup != SETUP_EDEFAULT;
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
		result.append(" (version: ");
		result.append(version);
		result.append(", setup: ");
		result.append(setup);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
