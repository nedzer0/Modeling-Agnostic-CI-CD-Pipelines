/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.BuildDiscarder;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Discarder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.BuildDiscarderImpl#getNumToKeepStr <em>Num To Keep Str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildDiscarderImpl extends OptionImpl implements BuildDiscarder {
	/**
	 * The default value of the '{@link #getNumToKeepStr() <em>Num To Keep Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumToKeepStr()
	 * @generated
	 * @ordered
	 */
	protected static final short NUM_TO_KEEP_STR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumToKeepStr() <em>Num To Keep Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumToKeepStr()
	 * @generated
	 * @ordered
	 */
	protected short numToKeepStr = NUM_TO_KEEP_STR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildDiscarderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.BUILD_DISCARDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getNumToKeepStr() {
		return numToKeepStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumToKeepStr(short newNumToKeepStr) {
		short oldNumToKeepStr = numToKeepStr;
		numToKeepStr = newNumToKeepStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.BUILD_DISCARDER__NUM_TO_KEEP_STR, oldNumToKeepStr, numToKeepStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.BUILD_DISCARDER__NUM_TO_KEEP_STR:
			return getNumToKeepStr();
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
		case Jenkins_metamodelPackage.BUILD_DISCARDER__NUM_TO_KEEP_STR:
			setNumToKeepStr((Short) newValue);
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
		case Jenkins_metamodelPackage.BUILD_DISCARDER__NUM_TO_KEEP_STR:
			setNumToKeepStr(NUM_TO_KEEP_STR_EDEFAULT);
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
		case Jenkins_metamodelPackage.BUILD_DISCARDER__NUM_TO_KEEP_STR:
			return numToKeepStr != NUM_TO_KEEP_STR_EDEFAULT;
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
		result.append(" (numToKeepStr: ");
		result.append(numToKeepStr);
		result.append(')');
		return result.toString();
	}

} //BuildDiscarderImpl
