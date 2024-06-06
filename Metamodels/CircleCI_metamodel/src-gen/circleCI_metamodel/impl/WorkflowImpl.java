/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.Branch;
import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.JobWorkflow;
import circleCI_metamodel.Trigger;
import circleCI_metamodel.When_Unless;
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
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.WorkflowImpl#getJobworkflow <em>Jobworkflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * The cached value of the '{@link #getWhen_unless() <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_unless()
	 * @generated
	 * @ordered
	 */
	protected When_Unless when_unless;

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
	 * The cached value of the '{@link #getJobworkflow() <em>Jobworkflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobworkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<JobWorkflow> jobworkflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					CircleCI_metamodelPackage.WORKFLOW__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Branch>(Branch.class, this,
					CircleCI_metamodelPackage.WORKFLOW__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Unless getWhen_unless() {
		return when_unless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen_unless(When_Unless newWhen_unless, NotificationChain msgs) {
		When_Unless oldWhen_unless = when_unless;
		when_unless = newWhen_unless;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS, oldWhen_unless, newWhen_unless);
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
	public void setWhen_unless(When_Unless newWhen_unless) {
		if (newWhen_unless != when_unless) {
			NotificationChain msgs = null;
			if (when_unless != null)
				msgs = ((InternalEObject) when_unless).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS, null, msgs);
			if (newWhen_unless != null)
				msgs = ((InternalEObject) newWhen_unless).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS, null, msgs);
			msgs = basicSetWhen_unless(newWhen_unless, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS,
					newWhen_unless, newWhen_unless));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.WORKFLOW__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.WORKFLOW__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobWorkflow> getJobworkflow() {
		if (jobworkflow == null) {
			jobworkflow = new EObjectContainmentEList<JobWorkflow>(JobWorkflow.class, this,
					CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW);
		}
		return jobworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.WORKFLOW__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.WORKFLOW__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS:
			return basicSetWhen_unless(null, msgs);
		case CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW:
			return ((InternalEList<?>) getJobworkflow()).basicRemove(otherEnd, msgs);
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
		case CircleCI_metamodelPackage.WORKFLOW__TRIGGERS:
			return getTriggers();
		case CircleCI_metamodelPackage.WORKFLOW__BRANCHES:
			return getBranches();
		case CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS:
			return getWhen_unless();
		case CircleCI_metamodelPackage.WORKFLOW__NAME:
			return getName();
		case CircleCI_metamodelPackage.WORKFLOW__VERSION:
			return getVersion();
		case CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW:
			return getJobworkflow();
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
		case CircleCI_metamodelPackage.WORKFLOW__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Branch>) newValue);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS:
			setWhen_unless((When_Unless) newValue);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__NAME:
			setName((String) newValue);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__VERSION:
			setVersion((String) newValue);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW:
			getJobworkflow().clear();
			getJobworkflow().addAll((Collection<? extends JobWorkflow>) newValue);
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
		case CircleCI_metamodelPackage.WORKFLOW__TRIGGERS:
			getTriggers().clear();
			return;
		case CircleCI_metamodelPackage.WORKFLOW__BRANCHES:
			getBranches().clear();
			return;
		case CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS:
			setWhen_unless((When_Unless) null);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW:
			getJobworkflow().clear();
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
		case CircleCI_metamodelPackage.WORKFLOW__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case CircleCI_metamodelPackage.WORKFLOW__BRANCHES:
			return branches != null && !branches.isEmpty();
		case CircleCI_metamodelPackage.WORKFLOW__WHEN_UNLESS:
			return when_unless != null;
		case CircleCI_metamodelPackage.WORKFLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCI_metamodelPackage.WORKFLOW__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case CircleCI_metamodelPackage.WORKFLOW__JOBWORKFLOW:
			return jobworkflow != null && !jobworkflow.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
