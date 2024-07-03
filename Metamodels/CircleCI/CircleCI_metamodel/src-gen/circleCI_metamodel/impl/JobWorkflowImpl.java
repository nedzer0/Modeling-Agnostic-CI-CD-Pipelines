/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.Branch;
import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.JobWorkflow;
import circleCI_metamodel.Matrix;

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
 * An implementation of the model object '<em><b>Job Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#getContext <em>Context</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#isApprovalJob <em>Approval Job</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.JobWorkflowImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobWorkflowImpl extends MinimalEObjectImpl.Container implements JobWorkflow {
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
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requires;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> context;

	/**
	 * The default value of the '{@link #isApprovalJob() <em>Approval Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalJob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_JOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApprovalJob() <em>Approval Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalJob()
	 * @generated
	 * @ordered
	 */
	protected boolean approvalJob = APPROVAL_JOB_EDEFAULT;

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
	protected JobWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.JOB_WORKFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB_WORKFLOW__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequires() {
		if (requires == null) {
			requires = new EDataTypeUniqueEList<String>(String.class, this,
					CircleCI_metamodelPackage.JOB_WORKFLOW__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContext() {
		if (context == null) {
			context = new EDataTypeUniqueEList<String>(String.class, this,
					CircleCI_metamodelPackage.JOB_WORKFLOW__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApprovalJob() {
		return approvalJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalJob(boolean newApprovalJob) {
		boolean oldApprovalJob = approvalJob;
		approvalJob = newApprovalJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB_WORKFLOW__APPROVAL_JOB,
					oldApprovalJob, approvalJob));
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
					CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES);
		}
		return branches;
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
					CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX, oldMatrix, newMatrix);
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
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject) newMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX,
					newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX:
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
		case CircleCI_metamodelPackage.JOB_WORKFLOW__NAME:
			return getName();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__REQUIRES:
			return getRequires();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__CONTEXT:
			return getContext();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__APPROVAL_JOB:
			return isApprovalJob();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES:
			return getBranches();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX:
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
		case CircleCI_metamodelPackage.JOB_WORKFLOW__NAME:
			setName((String) newValue);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends String>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__CONTEXT:
			getContext().clear();
			getContext().addAll((Collection<? extends String>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__APPROVAL_JOB:
			setApprovalJob((Boolean) newValue);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Branch>) newValue);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX:
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
		case CircleCI_metamodelPackage.JOB_WORKFLOW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__REQUIRES:
			getRequires().clear();
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__CONTEXT:
			getContext().clear();
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__APPROVAL_JOB:
			setApprovalJob(APPROVAL_JOB_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES:
			getBranches().clear();
			return;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX:
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
		case CircleCI_metamodelPackage.JOB_WORKFLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCI_metamodelPackage.JOB_WORKFLOW__REQUIRES:
			return requires != null && !requires.isEmpty();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__CONTEXT:
			return context != null && !context.isEmpty();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__APPROVAL_JOB:
			return approvalJob != APPROVAL_JOB_EDEFAULT;
		case CircleCI_metamodelPackage.JOB_WORKFLOW__BRANCHES:
			return branches != null && !branches.isEmpty();
		case CircleCI_metamodelPackage.JOB_WORKFLOW__MATRIX:
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
		result.append(", requires: ");
		result.append(requires);
		result.append(", context: ");
		result.append(context);
		result.append(", approvalJob: ");
		result.append(approvalJob);
		result.append(')');
		return result.toString();
	}

} //JobWorkflowImpl
