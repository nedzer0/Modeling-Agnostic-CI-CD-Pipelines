/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.CACHE_MODE;
import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.Cache;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.CacheImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link cICD_metamodel.impl.CacheImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link cICD_metamodel.impl.CacheImpl#getKey <em>Key</em>}</li>
 *   <li>{@link cICD_metamodel.impl.CacheImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheImpl extends MinimalEObjectImpl.Container implements Cache {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final CACHE_MODE MODE_EDEFAULT = CACHE_MODE.STORE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected CACHE_MODE mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paths;

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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICD_metamodelPackage.Literals.CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CACHE_MODE getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(CACHE_MODE newMode) {
		CACHE_MODE oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.CACHE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, CICD_metamodelPackage.CACHE__PATHS);
		}
		return paths;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.CACHE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKeys() {
		if (keys == null) {
			keys = new EDataTypeUniqueEList<String>(String.class, this, CICD_metamodelPackage.CACHE__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CICD_metamodelPackage.CACHE__MODE:
			return getMode();
		case CICD_metamodelPackage.CACHE__PATHS:
			return getPaths();
		case CICD_metamodelPackage.CACHE__KEY:
			return getKey();
		case CICD_metamodelPackage.CACHE__KEYS:
			return getKeys();
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
		case CICD_metamodelPackage.CACHE__MODE:
			setMode((CACHE_MODE) newValue);
			return;
		case CICD_metamodelPackage.CACHE__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends String>) newValue);
			return;
		case CICD_metamodelPackage.CACHE__KEY:
			setKey((String) newValue);
			return;
		case CICD_metamodelPackage.CACHE__KEYS:
			getKeys().clear();
			getKeys().addAll((Collection<? extends String>) newValue);
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
		case CICD_metamodelPackage.CACHE__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case CICD_metamodelPackage.CACHE__PATHS:
			getPaths().clear();
			return;
		case CICD_metamodelPackage.CACHE__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case CICD_metamodelPackage.CACHE__KEYS:
			getKeys().clear();
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
		case CICD_metamodelPackage.CACHE__MODE:
			return mode != MODE_EDEFAULT;
		case CICD_metamodelPackage.CACHE__PATHS:
			return paths != null && !paths.isEmpty();
		case CICD_metamodelPackage.CACHE__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		case CICD_metamodelPackage.CACHE__KEYS:
			return keys != null && !keys.isEmpty();
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", paths: ");
		result.append(paths);
		result.append(", key: ");
		result.append(key);
		result.append(", keys: ");
		result.append(keys);
		result.append(')');
		return result.toString();
	}

} //CacheImpl
