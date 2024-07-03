/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.PreserveStashes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preserve Stashes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.PreserveStashesImpl#getBuildCount <em>Build Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreserveStashesImpl extends OptionImpl implements PreserveStashes {
	/**
	 * The default value of the '{@link #getBuildCount() <em>Build Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildCount()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildCount() <em>Build Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildCount()
	 * @generated
	 * @ordered
	 */
	protected String buildCount = BUILD_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreserveStashesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.PRESERVE_STASHES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildCount() {
		return buildCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildCount(String newBuildCount) {
		String oldBuildCount = buildCount;
		buildCount = newBuildCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.PRESERVE_STASHES__BUILD_COUNT, oldBuildCount, buildCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.PRESERVE_STASHES__BUILD_COUNT:
			return getBuildCount();
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
		case Jenkins_metamodelPackage.PRESERVE_STASHES__BUILD_COUNT:
			setBuildCount((String) newValue);
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
		case Jenkins_metamodelPackage.PRESERVE_STASHES__BUILD_COUNT:
			setBuildCount(BUILD_COUNT_EDEFAULT);
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
		case Jenkins_metamodelPackage.PRESERVE_STASHES__BUILD_COUNT:
			return BUILD_COUNT_EDEFAULT == null ? buildCount != null : !BUILD_COUNT_EDEFAULT.equals(buildCount);
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
		result.append(" (buildCount: ");
		result.append(buildCount);
		result.append(')');
		return result.toString();
	}

} //PreserveStashesImpl
