/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Docker_Aws_Auths;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Aws Auths</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.Docker_Aws_AuthsImpl#getAws_access_key_id <em>Aws access key id</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.Docker_Aws_AuthsImpl#getAws_secret_access_key <em>Aws secret access key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Docker_Aws_AuthsImpl extends MinimalEObjectImpl.Container implements Docker_Aws_Auths {
	/**
	 * The default value of the '{@link #getAws_access_key_id() <em>Aws access key id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_access_key_id()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_ACCESS_KEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAws_access_key_id() <em>Aws access key id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_access_key_id()
	 * @generated
	 * @ordered
	 */
	protected String aws_access_key_id = AWS_ACCESS_KEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAws_secret_access_key() <em>Aws secret access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_secret_access_key()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_SECRET_ACCESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAws_secret_access_key() <em>Aws secret access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_secret_access_key()
	 * @generated
	 * @ordered
	 */
	protected String aws_secret_access_key = AWS_SECRET_ACCESS_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Docker_Aws_AuthsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.DOCKER_AWS_AUTHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAws_access_key_id() {
		return aws_access_key_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_access_key_id(String newAws_access_key_id) {
		String oldAws_access_key_id = aws_access_key_id;
		aws_access_key_id = newAws_access_key_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID, oldAws_access_key_id,
					aws_access_key_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAws_secret_access_key() {
		return aws_secret_access_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_secret_access_key(String newAws_secret_access_key) {
		String oldAws_secret_access_key = aws_secret_access_key;
		aws_secret_access_key = newAws_secret_access_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY, oldAws_secret_access_key,
					aws_secret_access_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID:
			return getAws_access_key_id();
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY:
			return getAws_secret_access_key();
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
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID:
			setAws_access_key_id((String) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY:
			setAws_secret_access_key((String) newValue);
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
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID:
			setAws_access_key_id(AWS_ACCESS_KEY_ID_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY:
			setAws_secret_access_key(AWS_SECRET_ACCESS_KEY_EDEFAULT);
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
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_ACCESS_KEY_ID:
			return AWS_ACCESS_KEY_ID_EDEFAULT == null ? aws_access_key_id != null
					: !AWS_ACCESS_KEY_ID_EDEFAULT.equals(aws_access_key_id);
		case CircleCI_metamodelPackage.DOCKER_AWS_AUTHS__AWS_SECRET_ACCESS_KEY:
			return AWS_SECRET_ACCESS_KEY_EDEFAULT == null ? aws_secret_access_key != null
					: !AWS_SECRET_ACCESS_KEY_EDEFAULT.equals(aws_secret_access_key);
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
		result.append(" (aws_access_key_id: ");
		result.append(aws_access_key_id);
		result.append(", aws_secret_access_key: ");
		result.append(aws_secret_access_key);
		result.append(')');
		return result.toString();
	}

} //Docker_Aws_AuthsImpl
