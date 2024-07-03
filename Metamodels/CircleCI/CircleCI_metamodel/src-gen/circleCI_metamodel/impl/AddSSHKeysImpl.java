/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.AddSSHKeys;
import circleCI_metamodel.CircleCI_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add SSH Keys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.AddSSHKeysImpl#getFingerprints <em>Fingerprints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSSHKeysImpl extends StepImpl implements AddSSHKeys {
	/**
	 * The cached value of the '{@link #getFingerprints() <em>Fingerprints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fingerprints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSSHKeysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.ADD_SSH_KEYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFingerprints() {
		if (fingerprints == null) {
			fingerprints = new EDataTypeUniqueEList<String>(String.class, this,
					CircleCI_metamodelPackage.ADD_SSH_KEYS__FINGERPRINTS);
		}
		return fingerprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCI_metamodelPackage.ADD_SSH_KEYS__FINGERPRINTS:
			return getFingerprints();
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
		case CircleCI_metamodelPackage.ADD_SSH_KEYS__FINGERPRINTS:
			getFingerprints().clear();
			getFingerprints().addAll((Collection<? extends String>) newValue);
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
		case CircleCI_metamodelPackage.ADD_SSH_KEYS__FINGERPRINTS:
			getFingerprints().clear();
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
		case CircleCI_metamodelPackage.ADD_SSH_KEYS__FINGERPRINTS:
			return fingerprints != null && !fingerprints.isEmpty();
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
		result.append(" (fingerprints: ");
		result.append(fingerprints);
		result.append(')');
		return result.toString();
	}

} //AddSSHKeysImpl
