/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Matrix;
import circleCI_metamodel.MatrixParams;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.MatrixImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.MatrixImpl#getMatrix_exclude <em>Matrix exclude</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.MatrixImpl#getMatrix_params <em>Matrix params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrix_exclude() <em>Matrix exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix_exclude()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixParams> matrix_exclude;

	/**
	 * The cached value of the '{@link #getMatrix_params() <em>Matrix params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix_params()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixParams> matrix_params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.MATRIX__ALIAS, oldAlias,
					alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixParams> getMatrix_exclude() {
		if (matrix_exclude == null) {
			matrix_exclude = new EObjectContainmentEList<MatrixParams>(MatrixParams.class, this,
					CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE);
		}
		return matrix_exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixParams> getMatrix_params() {
		if (matrix_params == null) {
			matrix_params = new EObjectContainmentEList<MatrixParams>(MatrixParams.class, this,
					CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS);
		}
		return matrix_params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE:
			return ((InternalEList<?>) getMatrix_exclude()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS:
			return ((InternalEList<?>) getMatrix_params()).basicRemove(otherEnd, msgs);
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
		case CircleCI_metamodelPackage.MATRIX__ALIAS:
			return getAlias();
		case CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE:
			return getMatrix_exclude();
		case CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS:
			return getMatrix_params();
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
		case CircleCI_metamodelPackage.MATRIX__ALIAS:
			setAlias((String) newValue);
			return;
		case CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE:
			getMatrix_exclude().clear();
			getMatrix_exclude().addAll((Collection<? extends MatrixParams>) newValue);
			return;
		case CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS:
			getMatrix_params().clear();
			getMatrix_params().addAll((Collection<? extends MatrixParams>) newValue);
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
		case CircleCI_metamodelPackage.MATRIX__ALIAS:
			setAlias(ALIAS_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE:
			getMatrix_exclude().clear();
			return;
		case CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS:
			getMatrix_params().clear();
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
		case CircleCI_metamodelPackage.MATRIX__ALIAS:
			return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
		case CircleCI_metamodelPackage.MATRIX__MATRIX_EXCLUDE:
			return matrix_exclude != null && !matrix_exclude.isEmpty();
		case CircleCI_metamodelPackage.MATRIX__MATRIX_PARAMS:
			return matrix_params != null && !matrix_params.isEmpty();
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //MatrixImpl
