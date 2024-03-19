/**
 */
package travisCI_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import travisCI_metamodel.ENV_TYPE;
import travisCI_metamodel.Environment;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.EnvironmentImpl#getKey <em>Key</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.EnvironmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.EnvironmentImpl#getEnv_type <em>Env type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnv_type() <em>Env type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv_type()
	 * @generated
	 * @ordered
	 */
	protected static final ENV_TYPE ENV_TYPE_EDEFAULT = ENV_TYPE.DEFAULT;

	/**
	 * The cached value of the '{@link #getEnv_type() <em>Env type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv_type()
	 * @generated
	 * @ordered
	 */
	protected ENV_TYPE env_type = ENV_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravisCI_metamodelPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.ENVIRONMENT__KEY, oldKey,
					key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.ENVIRONMENT__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENV_TYPE getEnv_type() {
		return env_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnv_type(ENV_TYPE newEnv_type) {
		ENV_TYPE oldEnv_type = env_type;
		env_type = newEnv_type == null ? ENV_TYPE_EDEFAULT : newEnv_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.ENVIRONMENT__ENV_TYPE,
					oldEnv_type, env_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TravisCI_metamodelPackage.ENVIRONMENT__KEY:
			return getKey();
		case TravisCI_metamodelPackage.ENVIRONMENT__VALUE:
			return getValue();
		case TravisCI_metamodelPackage.ENVIRONMENT__ENV_TYPE:
			return getEnv_type();
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
		case TravisCI_metamodelPackage.ENVIRONMENT__KEY:
			setKey((String) newValue);
			return;
		case TravisCI_metamodelPackage.ENVIRONMENT__VALUE:
			setValue((String) newValue);
			return;
		case TravisCI_metamodelPackage.ENVIRONMENT__ENV_TYPE:
			setEnv_type((ENV_TYPE) newValue);
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
		case TravisCI_metamodelPackage.ENVIRONMENT__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.ENVIRONMENT__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.ENVIRONMENT__ENV_TYPE:
			setEnv_type(ENV_TYPE_EDEFAULT);
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
		case TravisCI_metamodelPackage.ENVIRONMENT__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		case TravisCI_metamodelPackage.ENVIRONMENT__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case TravisCI_metamodelPackage.ENVIRONMENT__ENV_TYPE:
			return env_type != ENV_TYPE_EDEFAULT;
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
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(", env_type: ");
		result.append(env_type);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
