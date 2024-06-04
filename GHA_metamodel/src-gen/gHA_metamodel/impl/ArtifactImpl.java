/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.ARTIFACT_TYPE;
import gHA_metamodel.Artifact;
import gHA_metamodel.GHA_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ArtifactImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ArtifactImpl#getRetention_days <em>Retention days</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ArtifactImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends ActionImpl implements Artifact {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getRetention_days() <em>Retention days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_days()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENTION_DAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetention_days() <em>Retention days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_days()
	 * @generated
	 * @ordered
	 */
	protected String retention_days = RETENTION_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ARTIFACT_TYPE TYPE_EDEFAULT = ARTIFACT_TYPE.UPLOAD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ARTIFACT_TYPE type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, GHA_metamodelPackage.ARTIFACT__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRetention_days() {
		return retention_days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetention_days(String newRetention_days) {
		String oldRetention_days = retention_days;
		retention_days = newRetention_days;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.ARTIFACT__RETENTION_DAYS,
					oldRetention_days, retention_days));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ARTIFACT_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ARTIFACT_TYPE newType) {
		ARTIFACT_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.ARTIFACT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.ARTIFACT__NAME:
			return getName();
		case GHA_metamodelPackage.ARTIFACT__PATHS:
			return getPaths();
		case GHA_metamodelPackage.ARTIFACT__RETENTION_DAYS:
			return getRetention_days();
		case GHA_metamodelPackage.ARTIFACT__TYPE:
			return getType();
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
		case GHA_metamodelPackage.ARTIFACT__NAME:
			setName((String) newValue);
			return;
		case GHA_metamodelPackage.ARTIFACT__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends String>) newValue);
			return;
		case GHA_metamodelPackage.ARTIFACT__RETENTION_DAYS:
			setRetention_days((String) newValue);
			return;
		case GHA_metamodelPackage.ARTIFACT__TYPE:
			setType((ARTIFACT_TYPE) newValue);
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
		case GHA_metamodelPackage.ARTIFACT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.ARTIFACT__PATHS:
			getPaths().clear();
			return;
		case GHA_metamodelPackage.ARTIFACT__RETENTION_DAYS:
			setRetention_days(RETENTION_DAYS_EDEFAULT);
			return;
		case GHA_metamodelPackage.ARTIFACT__TYPE:
			setType(TYPE_EDEFAULT);
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
		case GHA_metamodelPackage.ARTIFACT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GHA_metamodelPackage.ARTIFACT__PATHS:
			return paths != null && !paths.isEmpty();
		case GHA_metamodelPackage.ARTIFACT__RETENTION_DAYS:
			return RETENTION_DAYS_EDEFAULT == null ? retention_days != null
					: !RETENTION_DAYS_EDEFAULT.equals(retention_days);
		case GHA_metamodelPackage.ARTIFACT__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", paths: ");
		result.append(paths);
		result.append(", retention_days: ");
		result.append(retention_days);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
