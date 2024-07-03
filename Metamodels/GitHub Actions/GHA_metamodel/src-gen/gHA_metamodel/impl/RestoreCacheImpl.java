/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.RestoreCache;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restore Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.RestoreCacheImpl#getRestore_keys <em>Restore keys</em>}</li>
 *   <li>{@link gHA_metamodel.impl.RestoreCacheImpl#isLookup_only <em>Lookup only</em>}</li>
 *   <li>{@link gHA_metamodel.impl.RestoreCacheImpl#isFail_on_cache_miss <em>Fail on cache miss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestoreCacheImpl extends CacheImpl implements RestoreCache {
	/**
	 * The cached value of the '{@link #getRestore_keys() <em>Restore keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestore_keys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> restore_keys;

	/**
	 * The default value of the '{@link #isLookup_only() <em>Lookup only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLookup_only()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOKUP_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLookup_only() <em>Lookup only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLookup_only()
	 * @generated
	 * @ordered
	 */
	protected boolean lookup_only = LOOKUP_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFail_on_cache_miss() <em>Fail on cache miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFail_on_cache_miss()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_ON_CACHE_MISS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFail_on_cache_miss() <em>Fail on cache miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFail_on_cache_miss()
	 * @generated
	 * @ordered
	 */
	protected boolean fail_on_cache_miss = FAIL_ON_CACHE_MISS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestoreCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.RESTORE_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRestore_keys() {
		if (restore_keys == null) {
			restore_keys = new EDataTypeUniqueEList<String>(String.class, this,
					GHA_metamodelPackage.RESTORE_CACHE__RESTORE_KEYS);
		}
		return restore_keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLookup_only() {
		return lookup_only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookup_only(boolean newLookup_only) {
		boolean oldLookup_only = lookup_only;
		lookup_only = newLookup_only;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.RESTORE_CACHE__LOOKUP_ONLY,
					oldLookup_only, lookup_only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFail_on_cache_miss() {
		return fail_on_cache_miss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFail_on_cache_miss(boolean newFail_on_cache_miss) {
		boolean oldFail_on_cache_miss = fail_on_cache_miss;
		fail_on_cache_miss = newFail_on_cache_miss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.RESTORE_CACHE__FAIL_ON_CACHE_MISS, oldFail_on_cache_miss, fail_on_cache_miss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.RESTORE_CACHE__RESTORE_KEYS:
			return getRestore_keys();
		case GHA_metamodelPackage.RESTORE_CACHE__LOOKUP_ONLY:
			return isLookup_only();
		case GHA_metamodelPackage.RESTORE_CACHE__FAIL_ON_CACHE_MISS:
			return isFail_on_cache_miss();
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
		case GHA_metamodelPackage.RESTORE_CACHE__RESTORE_KEYS:
			getRestore_keys().clear();
			getRestore_keys().addAll((Collection<? extends String>) newValue);
			return;
		case GHA_metamodelPackage.RESTORE_CACHE__LOOKUP_ONLY:
			setLookup_only((Boolean) newValue);
			return;
		case GHA_metamodelPackage.RESTORE_CACHE__FAIL_ON_CACHE_MISS:
			setFail_on_cache_miss((Boolean) newValue);
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
		case GHA_metamodelPackage.RESTORE_CACHE__RESTORE_KEYS:
			getRestore_keys().clear();
			return;
		case GHA_metamodelPackage.RESTORE_CACHE__LOOKUP_ONLY:
			setLookup_only(LOOKUP_ONLY_EDEFAULT);
			return;
		case GHA_metamodelPackage.RESTORE_CACHE__FAIL_ON_CACHE_MISS:
			setFail_on_cache_miss(FAIL_ON_CACHE_MISS_EDEFAULT);
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
		case GHA_metamodelPackage.RESTORE_CACHE__RESTORE_KEYS:
			return restore_keys != null && !restore_keys.isEmpty();
		case GHA_metamodelPackage.RESTORE_CACHE__LOOKUP_ONLY:
			return lookup_only != LOOKUP_ONLY_EDEFAULT;
		case GHA_metamodelPackage.RESTORE_CACHE__FAIL_ON_CACHE_MISS:
			return fail_on_cache_miss != FAIL_ON_CACHE_MISS_EDEFAULT;
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
		result.append(" (restore_keys: ");
		result.append(restore_keys);
		result.append(", lookup_only: ");
		result.append(lookup_only);
		result.append(", fail_on_cache_miss: ");
		result.append(fail_on_cache_miss);
		result.append(')');
		return result.toString();
	}

} //RestoreCacheImpl
