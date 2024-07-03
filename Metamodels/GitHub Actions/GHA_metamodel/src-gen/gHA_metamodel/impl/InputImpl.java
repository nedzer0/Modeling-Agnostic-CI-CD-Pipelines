/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.INPUT_TYPES;
import gHA_metamodel.Input;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link gHA_metamodel.impl.InputImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link gHA_metamodel.impl.InputImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link gHA_metamodel.impl.InputImpl#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.InputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gHA_metamodel.impl.InputImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final INPUT_TYPES TYPE_EDEFAULT = INPUT_TYPES.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected INPUT_TYPES type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> options;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INPUT_TYPES getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(INPUT_TYPES newType) {
		INPUT_TYPES oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.INPUT__IS_REQUIRED,
					oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<String>(String.class, this, GHA_metamodelPackage.INPUT__OPTIONS);
		}
		return options;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.INPUT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.INPUT__DEFAULT, oldDefault,
					default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GHA_metamodelPackage.INPUT__TYPE:
			return getType();
		case GHA_metamodelPackage.INPUT__IS_REQUIRED:
			return isIsRequired();
		case GHA_metamodelPackage.INPUT__OPTIONS:
			return getOptions();
		case GHA_metamodelPackage.INPUT__NAME:
			return getName();
		case GHA_metamodelPackage.INPUT__DESCRIPTION:
			return getDescription();
		case GHA_metamodelPackage.INPUT__DEFAULT:
			return getDefault();
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
		case GHA_metamodelPackage.INPUT__TYPE:
			setType((INPUT_TYPES) newValue);
			return;
		case GHA_metamodelPackage.INPUT__IS_REQUIRED:
			setIsRequired((Boolean) newValue);
			return;
		case GHA_metamodelPackage.INPUT__OPTIONS:
			getOptions().clear();
			getOptions().addAll((Collection<? extends String>) newValue);
			return;
		case GHA_metamodelPackage.INPUT__NAME:
			setName((String) newValue);
			return;
		case GHA_metamodelPackage.INPUT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GHA_metamodelPackage.INPUT__DEFAULT:
			setDefault((String) newValue);
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
		case GHA_metamodelPackage.INPUT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GHA_metamodelPackage.INPUT__IS_REQUIRED:
			setIsRequired(IS_REQUIRED_EDEFAULT);
			return;
		case GHA_metamodelPackage.INPUT__OPTIONS:
			getOptions().clear();
			return;
		case GHA_metamodelPackage.INPUT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.INPUT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GHA_metamodelPackage.INPUT__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
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
		case GHA_metamodelPackage.INPUT__TYPE:
			return type != TYPE_EDEFAULT;
		case GHA_metamodelPackage.INPUT__IS_REQUIRED:
			return isRequired != IS_REQUIRED_EDEFAULT;
		case GHA_metamodelPackage.INPUT__OPTIONS:
			return options != null && !options.isEmpty();
		case GHA_metamodelPackage.INPUT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GHA_metamodelPackage.INPUT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GHA_metamodelPackage.INPUT__DEFAULT:
			return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", options: ");
		result.append(options);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //InputImpl
