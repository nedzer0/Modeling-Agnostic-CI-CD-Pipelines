/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.SaveCache;
import circleCI_metamodel.WHEN_TYPE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Save Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.SaveCacheImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.SaveCacheImpl#getKey <em>Key</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.SaveCacheImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaveCacheImpl extends StepImpl implements SaveCache {
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
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final WHEN_TYPE WHEN_EDEFAULT = WHEN_TYPE.ON_SUCCESS;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected WHEN_TYPE when = WHEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaveCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.SAVE_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, CircleCI_metamodelPackage.SAVE_CACHE__PATHS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.SAVE_CACHE__KEY, oldKey,
					key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHEN_TYPE getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(WHEN_TYPE newWhen) {
		WHEN_TYPE oldWhen = when;
		when = newWhen == null ? WHEN_EDEFAULT : newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.SAVE_CACHE__WHEN, oldWhen,
					when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCI_metamodelPackage.SAVE_CACHE__PATHS:
			return getPaths();
		case CircleCI_metamodelPackage.SAVE_CACHE__KEY:
			return getKey();
		case CircleCI_metamodelPackage.SAVE_CACHE__WHEN:
			return getWhen();
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
		case CircleCI_metamodelPackage.SAVE_CACHE__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends String>) newValue);
			return;
		case CircleCI_metamodelPackage.SAVE_CACHE__KEY:
			setKey((String) newValue);
			return;
		case CircleCI_metamodelPackage.SAVE_CACHE__WHEN:
			setWhen((WHEN_TYPE) newValue);
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
		case CircleCI_metamodelPackage.SAVE_CACHE__PATHS:
			getPaths().clear();
			return;
		case CircleCI_metamodelPackage.SAVE_CACHE__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.SAVE_CACHE__WHEN:
			setWhen(WHEN_EDEFAULT);
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
		case CircleCI_metamodelPackage.SAVE_CACHE__PATHS:
			return paths != null && !paths.isEmpty();
		case CircleCI_metamodelPackage.SAVE_CACHE__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		case CircleCI_metamodelPackage.SAVE_CACHE__WHEN:
			return when != WHEN_EDEFAULT;
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
		result.append(" (paths: ");
		result.append(paths);
		result.append(", key: ");
		result.append(key);
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //SaveCacheImpl
