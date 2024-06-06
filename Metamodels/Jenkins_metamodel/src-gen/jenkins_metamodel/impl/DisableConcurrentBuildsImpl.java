/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.DisableConcurrentBuilds;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disable Concurrent Builds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.DisableConcurrentBuildsImpl#isAbort <em>Abort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisableConcurrentBuildsImpl extends OptionImpl implements DisableConcurrentBuilds {
	/**
	 * The default value of the '{@link #isAbort() <em>Abort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbort() <em>Abort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbort()
	 * @generated
	 * @ordered
	 */
	protected boolean abort = ABORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisableConcurrentBuildsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.DISABLE_CONCURRENT_BUILDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbort() {
		return abort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbort(boolean newAbort) {
		boolean oldAbort = abort;
		abort = newAbort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS__ABORT, oldAbort, abort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS__ABORT:
			return isAbort();
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
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS__ABORT:
			setAbort((Boolean) newValue);
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
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS__ABORT:
			setAbort(ABORT_EDEFAULT);
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
		case Jenkins_metamodelPackage.DISABLE_CONCURRENT_BUILDS__ABORT:
			return abort != ABORT_EDEFAULT;
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
		result.append(" (abort: ");
		result.append(abort);
		result.append(')');
		return result.toString();
	}

} //DisableConcurrentBuildsImpl
