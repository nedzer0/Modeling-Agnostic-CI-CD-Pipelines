/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Branch;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.WorkflowRunTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Run Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.WorkflowRunTriggerImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link gHA_metamodel.impl.WorkflowRunTriggerImpl#getType <em>Type</em>}</li>
 *   <li>{@link gHA_metamodel.impl.WorkflowRunTriggerImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowRunTriggerImpl extends TriggerImpl implements WorkflowRunTrigger {
	/**
	 * The default value of the '{@link #getWorkflow() <em>Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected String workflow = WORKFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRunTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.WORKFLOW_RUN_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflow(String newWorkflow) {
		String oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__WORKFLOW,
					oldWorkflow, workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__TYPE,
					oldType, type));
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
					GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
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
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__WORKFLOW:
			return getWorkflow();
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__TYPE:
			return getType();
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return getBranches();
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
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__WORKFLOW:
			setWorkflow((String) newValue);
			return;
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__TYPE:
			setType((String) newValue);
			return;
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Branch>) newValue);
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
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__WORKFLOW:
			setWorkflow(WORKFLOW_EDEFAULT);
			return;
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			getBranches().clear();
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
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__WORKFLOW:
			return WORKFLOW_EDEFAULT == null ? workflow != null : !WORKFLOW_EDEFAULT.equals(workflow);
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case GHA_metamodelPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return branches != null && !branches.isEmpty();
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
		result.append(" (workflow: ");
		result.append(workflow);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WorkflowRunTriggerImpl
