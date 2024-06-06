/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.PERMISSIONS;
import gHA_metamodel.PERMISSION_SCOPES;
import gHA_metamodel.Permission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.PermissionImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PermissionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PermissionImpl#isReadAll <em>Read All</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PermissionImpl#isWriteAll <em>Write All</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PermissionImpl#isDisableAll <em>Disable All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final PERMISSIONS PERMISSION_EDEFAULT = PERMISSIONS.READ;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected PERMISSIONS permission = PERMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final PERMISSION_SCOPES SCOPE_EDEFAULT = PERMISSION_SCOPES.ACTIONS;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected PERMISSION_SCOPES scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadAll() <em>Read All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadAll() <em>Read All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadAll()
	 * @generated
	 * @ordered
	 */
	protected boolean readAll = READ_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteAll() <em>Write All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteAll() <em>Write All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteAll()
	 * @generated
	 * @ordered
	 */
	protected boolean writeAll = WRITE_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisableAll() <em>Disable All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableAll() <em>Disable All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableAll()
	 * @generated
	 * @ordered
	 */
	protected boolean disableAll = DISABLE_ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PERMISSIONS getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermission(PERMISSIONS newPermission) {
		PERMISSIONS oldPermission = permission;
		permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PERMISSION__PERMISSION,
					oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PERMISSION_SCOPES getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(PERMISSION_SCOPES newScope) {
		PERMISSION_SCOPES oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PERMISSION__SCOPE, oldScope,
					scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadAll() {
		return readAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadAll(boolean newReadAll) {
		boolean oldReadAll = readAll;
		readAll = newReadAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PERMISSION__READ_ALL, oldReadAll,
					readAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWriteAll() {
		return writeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteAll(boolean newWriteAll) {
		boolean oldWriteAll = writeAll;
		writeAll = newWriteAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PERMISSION__WRITE_ALL,
					oldWriteAll, writeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisableAll() {
		return disableAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableAll(boolean newDisableAll) {
		boolean oldDisableAll = disableAll;
		disableAll = newDisableAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PERMISSION__DISABLE_ALL,
					oldDisableAll, disableAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.PERMISSION__PERMISSION:
			return getPermission();
		case GHA_metamodelPackage.PERMISSION__SCOPE:
			return getScope();
		case GHA_metamodelPackage.PERMISSION__READ_ALL:
			return isReadAll();
		case GHA_metamodelPackage.PERMISSION__WRITE_ALL:
			return isWriteAll();
		case GHA_metamodelPackage.PERMISSION__DISABLE_ALL:
			return isDisableAll();
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
		case GHA_metamodelPackage.PERMISSION__PERMISSION:
			setPermission((PERMISSIONS) newValue);
			return;
		case GHA_metamodelPackage.PERMISSION__SCOPE:
			setScope((PERMISSION_SCOPES) newValue);
			return;
		case GHA_metamodelPackage.PERMISSION__READ_ALL:
			setReadAll((Boolean) newValue);
			return;
		case GHA_metamodelPackage.PERMISSION__WRITE_ALL:
			setWriteAll((Boolean) newValue);
			return;
		case GHA_metamodelPackage.PERMISSION__DISABLE_ALL:
			setDisableAll((Boolean) newValue);
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
		case GHA_metamodelPackage.PERMISSION__PERMISSION:
			setPermission(PERMISSION_EDEFAULT);
			return;
		case GHA_metamodelPackage.PERMISSION__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case GHA_metamodelPackage.PERMISSION__READ_ALL:
			setReadAll(READ_ALL_EDEFAULT);
			return;
		case GHA_metamodelPackage.PERMISSION__WRITE_ALL:
			setWriteAll(WRITE_ALL_EDEFAULT);
			return;
		case GHA_metamodelPackage.PERMISSION__DISABLE_ALL:
			setDisableAll(DISABLE_ALL_EDEFAULT);
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
		case GHA_metamodelPackage.PERMISSION__PERMISSION:
			return permission != PERMISSION_EDEFAULT;
		case GHA_metamodelPackage.PERMISSION__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case GHA_metamodelPackage.PERMISSION__READ_ALL:
			return readAll != READ_ALL_EDEFAULT;
		case GHA_metamodelPackage.PERMISSION__WRITE_ALL:
			return writeAll != WRITE_ALL_EDEFAULT;
		case GHA_metamodelPackage.PERMISSION__DISABLE_ALL:
			return disableAll != DISABLE_ALL_EDEFAULT;
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
		result.append(" (permission: ");
		result.append(permission);
		result.append(", scope: ");
		result.append(scope);
		result.append(", readAll: ");
		result.append(readAll);
		result.append(", writeAll: ");
		result.append(writeAll);
		result.append(", disableAll: ");
		result.append(disableAll);
		result.append(')');
		return result.toString();
	}

} //PermissionImpl
