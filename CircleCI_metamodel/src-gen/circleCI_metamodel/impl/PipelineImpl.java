/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Command;
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
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getOrb <em>Orb</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.PipelineImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
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
	 * The cached value of the '{@link #getOrb() <em>Orb</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrb()
	 * @generated
	 * @ordered
	 */
	protected EList<Orb> orb;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

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
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

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
	public EList<Orb> getOrb() {
		if (orb == null) {
			orb = new EObjectContainmentEList<Orb>(Orb.class, this, CircleCI_metamodelPackage.PIPELINE__ORB);
		}
		return orb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this,
					CircleCI_metamodelPackage.PIPELINE__COMMAND);
		}
		return command;
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
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, CircleCI_metamodelPackage.PIPELINE__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.PIPELINE__ORB:
			return ((InternalEList<?>) getOrb()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.PIPELINE__COMMAND:
			return ((InternalEList<?>) getCommand()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return basicSetWorkflow(null, msgs);
		case CircleCI_metamodelPackage.PIPELINE__JOB:
			return ((InternalEList<?>) getJob()).basicRemove(otherEnd, msgs);
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
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			return getVersion();
		case CircleCI_metamodelPackage.PIPELINE__ORB:
			return getOrb();
		case CircleCI_metamodelPackage.PIPELINE__COMMAND:
			return getCommand();
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return getWorkflow();
		case CircleCI_metamodelPackage.PIPELINE__JOB:
			return getJob();
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
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			setVersion((String) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__ORB:
			getOrb().clear();
			getOrb().addAll((Collection<? extends Orb>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			setWorkflow((Workflow) newValue);
			return;
		case CircleCI_metamodelPackage.PIPELINE__JOB:
			getJob().clear();
			getJob().addAll((Collection<? extends Job>) newValue);
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
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.PIPELINE__ORB:
			getOrb().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__COMMAND:
			getCommand().clear();
			return;
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			setWorkflow((Workflow) null);
			return;
		case CircleCI_metamodelPackage.PIPELINE__JOB:
			getJob().clear();
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
		case CircleCI_metamodelPackage.PIPELINE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case CircleCI_metamodelPackage.PIPELINE__ORB:
			return orb != null && !orb.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__COMMAND:
			return command != null && !command.isEmpty();
		case CircleCI_metamodelPackage.PIPELINE__WORKFLOW:
			return workflow != null;
		case CircleCI_metamodelPackage.PIPELINE__JOB:
			return job != null && !job.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
