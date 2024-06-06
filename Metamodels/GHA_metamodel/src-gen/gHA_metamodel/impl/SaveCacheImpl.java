/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.SaveCache;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Save Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.SaveCacheImpl#getUpload_chunk_size <em>Upload chunk size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaveCacheImpl extends CacheImpl implements SaveCache {
	/**
	 * The default value of the '{@link #getUpload_chunk_size() <em>Upload chunk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpload_chunk_size()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOAD_CHUNK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpload_chunk_size() <em>Upload chunk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpload_chunk_size()
	 * @generated
	 * @ordered
	 */
	protected String upload_chunk_size = UPLOAD_CHUNK_SIZE_EDEFAULT;

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
		return GHA_metamodelPackage.Literals.SAVE_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpload_chunk_size() {
		return upload_chunk_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpload_chunk_size(String newUpload_chunk_size) {
		String oldUpload_chunk_size = upload_chunk_size;
		upload_chunk_size = newUpload_chunk_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.SAVE_CACHE__UPLOAD_CHUNK_SIZE,
					oldUpload_chunk_size, upload_chunk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.SAVE_CACHE__UPLOAD_CHUNK_SIZE:
			return getUpload_chunk_size();
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
		case GHA_metamodelPackage.SAVE_CACHE__UPLOAD_CHUNK_SIZE:
			setUpload_chunk_size((String) newValue);
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
		case GHA_metamodelPackage.SAVE_CACHE__UPLOAD_CHUNK_SIZE:
			setUpload_chunk_size(UPLOAD_CHUNK_SIZE_EDEFAULT);
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
		case GHA_metamodelPackage.SAVE_CACHE__UPLOAD_CHUNK_SIZE:
			return UPLOAD_CHUNK_SIZE_EDEFAULT == null ? upload_chunk_size != null
					: !UPLOAD_CHUNK_SIZE_EDEFAULT.equals(upload_chunk_size);
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
		result.append(" (upload_chunk_size: ");
		result.append(upload_chunk_size);
		result.append(')');
		return result.toString();
	}

} //SaveCacheImpl
