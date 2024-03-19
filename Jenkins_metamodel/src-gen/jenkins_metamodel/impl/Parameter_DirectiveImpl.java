/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Param_Value;
import jenkins_metamodel.Parameter_Directive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.Parameter_DirectiveImpl#getParam_type <em>Param type</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.Parameter_DirectiveImpl#getParam_value <em>Param value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parameter_DirectiveImpl extends MinimalEObjectImpl.Container implements Parameter_Directive {
	/**
	 * The default value of the '{@link #getParam_type() <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParam_type() <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_type()
	 * @generated
	 * @ordered
	 */
	protected String param_type = PARAM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParam_value() <em>Param value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_value()
	 * @generated
	 * @ordered
	 */
	protected EList<Param_Value> param_value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parameter_DirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.PARAMETER_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParam_type() {
		return param_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParam_type(String newParam_type) {
		String oldParam_type = param_type;
		param_type = newParam_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_TYPE, oldParam_type, param_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Param_Value> getParam_value() {
		if (param_value == null) {
			param_value = new EObjectContainmentEList<Param_Value>(Param_Value.class, this,
					Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE);
		}
		return param_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE:
			return ((InternalEList<?>) getParam_value()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_TYPE:
			return getParam_type();
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE:
			return getParam_value();
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
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_TYPE:
			setParam_type((String) newValue);
			return;
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE:
			getParam_value().clear();
			getParam_value().addAll((Collection<? extends Param_Value>) newValue);
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
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_TYPE:
			setParam_type(PARAM_TYPE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE:
			getParam_value().clear();
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
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_TYPE:
			return PARAM_TYPE_EDEFAULT == null ? param_type != null : !PARAM_TYPE_EDEFAULT.equals(param_type);
		case Jenkins_metamodelPackage.PARAMETER_DIRECTIVE__PARAM_VALUE:
			return param_value != null && !param_value.isEmpty();
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
		result.append(" (param_type: ");
		result.append(param_type);
		result.append(')');
		return result.toString();
	}

} //Parameter_DirectiveImpl
