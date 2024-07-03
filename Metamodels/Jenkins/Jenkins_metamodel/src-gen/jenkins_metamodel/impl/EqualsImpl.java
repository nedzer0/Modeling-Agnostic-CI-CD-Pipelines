/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Equals;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.EqualsImpl#getExpected_val <em>Expected val</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.EqualsImpl#getActual_val <em>Actual val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqualsImpl extends WhenImpl implements Equals {
	/**
	 * The default value of the '{@link #getExpected_val() <em>Expected val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected_val()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected_val() <em>Expected val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected_val()
	 * @generated
	 * @ordered
	 */
	protected String expected_val = EXPECTED_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActual_val() <em>Actual val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_val()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActual_val() <em>Actual val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_val()
	 * @generated
	 * @ordered
	 */
	protected String actual_val = ACTUAL_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.EQUALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpected_val() {
		return expected_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpected_val(String newExpected_val) {
		String oldExpected_val = expected_val;
		expected_val = newExpected_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.EQUALS__EXPECTED_VAL,
					oldExpected_val, expected_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActual_val() {
		return actual_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActual_val(String newActual_val) {
		String oldActual_val = actual_val;
		actual_val = newActual_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.EQUALS__ACTUAL_VAL,
					oldActual_val, actual_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.EQUALS__EXPECTED_VAL:
			return getExpected_val();
		case Jenkins_metamodelPackage.EQUALS__ACTUAL_VAL:
			return getActual_val();
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
		case Jenkins_metamodelPackage.EQUALS__EXPECTED_VAL:
			setExpected_val((String) newValue);
			return;
		case Jenkins_metamodelPackage.EQUALS__ACTUAL_VAL:
			setActual_val((String) newValue);
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
		case Jenkins_metamodelPackage.EQUALS__EXPECTED_VAL:
			setExpected_val(EXPECTED_VAL_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.EQUALS__ACTUAL_VAL:
			setActual_val(ACTUAL_VAL_EDEFAULT);
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
		case Jenkins_metamodelPackage.EQUALS__EXPECTED_VAL:
			return EXPECTED_VAL_EDEFAULT == null ? expected_val != null : !EXPECTED_VAL_EDEFAULT.equals(expected_val);
		case Jenkins_metamodelPackage.EQUALS__ACTUAL_VAL:
			return ACTUAL_VAL_EDEFAULT == null ? actual_val != null : !ACTUAL_VAL_EDEFAULT.equals(actual_val);
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
		result.append(" (expected_val: ");
		result.append(expected_val);
		result.append(", actual_val: ");
		result.append(actual_val);
		result.append(')');
		return result.toString();
	}

} //EqualsImpl
