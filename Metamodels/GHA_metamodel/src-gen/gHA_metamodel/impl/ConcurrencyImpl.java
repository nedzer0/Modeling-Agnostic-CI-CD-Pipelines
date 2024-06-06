/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Concurrency;
import gHA_metamodel.GHA_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.ConcurrencyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ConcurrencyImpl#isCancel_in_progress <em>Cancel in progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyImpl extends MinimalEObjectImpl.Container implements Concurrency {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancel_in_progress() <em>Cancel in progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancel_in_progress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCEL_IN_PROGRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancel_in_progress() <em>Cancel in progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancel_in_progress()
	 * @generated
	 * @ordered
	 */
	protected boolean cancel_in_progress = CANCEL_IN_PROGRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.CONCURRENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.CONCURRENCY__GROUP, oldGroup,
					group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCancel_in_progress() {
		return cancel_in_progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancel_in_progress(boolean newCancel_in_progress) {
		boolean oldCancel_in_progress = cancel_in_progress;
		cancel_in_progress = newCancel_in_progress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.CONCURRENCY__CANCEL_IN_PROGRESS,
					oldCancel_in_progress, cancel_in_progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.CONCURRENCY__GROUP:
			return getGroup();
		case GHA_metamodelPackage.CONCURRENCY__CANCEL_IN_PROGRESS:
			return isCancel_in_progress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GHA_metamodelPackage.CONCURRENCY__GROUP:
			setGroup((String) newValue);
			return;
		case GHA_metamodelPackage.CONCURRENCY__CANCEL_IN_PROGRESS:
			setCancel_in_progress((Boolean) newValue);
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
		case GHA_metamodelPackage.CONCURRENCY__GROUP:
			setGroup(GROUP_EDEFAULT);
			return;
		case GHA_metamodelPackage.CONCURRENCY__CANCEL_IN_PROGRESS:
			setCancel_in_progress(CANCEL_IN_PROGRESS_EDEFAULT);
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
		case GHA_metamodelPackage.CONCURRENCY__GROUP:
			return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
		case GHA_metamodelPackage.CONCURRENCY__CANCEL_IN_PROGRESS:
			return cancel_in_progress != CANCEL_IN_PROGRESS_EDEFAULT;
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
		result.append(" (group: ");
		result.append(group);
		result.append(", cancel_in_progress: ");
		result.append(cancel_in_progress);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyImpl
