/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.MatrixConfig;
import gHA_metamodel.Strategy;

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
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.StrategyImpl#isFail_fast <em>Fail fast</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StrategyImpl#getMax_parallel <em>Max parallel</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StrategyImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy {
	/**
	 * The default value of the '{@link #isFail_fast() <em>Fail fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFail_fast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_FAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFail_fast() <em>Fail fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFail_fast()
	 * @generated
	 * @ordered
	 */
	protected boolean fail_fast = FAIL_FAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_parallel() <em>Max parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_parallel()
	 * @generated
	 * @ordered
	 */
	protected static final short MAX_PARALLEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_parallel() <em>Max parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_parallel()
	 * @generated
	 * @ordered
	 */
	protected short max_parallel = MAX_PARALLEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixConfig> configs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFail_fast() {
		return fail_fast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFail_fast(boolean newFail_fast) {
		boolean oldFail_fast = fail_fast;
		fail_fast = newFail_fast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STRATEGY__FAIL_FAST,
					oldFail_fast, fail_fast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getMax_parallel() {
		return max_parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_parallel(short newMax_parallel) {
		short oldMax_parallel = max_parallel;
		max_parallel = newMax_parallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STRATEGY__MAX_PARALLEL,
					oldMax_parallel, max_parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixConfig> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<MatrixConfig>(MatrixConfig.class, this,
					GHA_metamodelPackage.STRATEGY__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.STRATEGY__CONFIGS:
			return ((InternalEList<?>) getConfigs()).basicRemove(otherEnd, msgs);
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
		case GHA_metamodelPackage.STRATEGY__FAIL_FAST:
			return isFail_fast();
		case GHA_metamodelPackage.STRATEGY__MAX_PARALLEL:
			return getMax_parallel();
		case GHA_metamodelPackage.STRATEGY__CONFIGS:
			return getConfigs();
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
		case GHA_metamodelPackage.STRATEGY__FAIL_FAST:
			setFail_fast((Boolean) newValue);
			return;
		case GHA_metamodelPackage.STRATEGY__MAX_PARALLEL:
			setMax_parallel((Short) newValue);
			return;
		case GHA_metamodelPackage.STRATEGY__CONFIGS:
			getConfigs().clear();
			getConfigs().addAll((Collection<? extends MatrixConfig>) newValue);
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
		case GHA_metamodelPackage.STRATEGY__FAIL_FAST:
			setFail_fast(FAIL_FAST_EDEFAULT);
			return;
		case GHA_metamodelPackage.STRATEGY__MAX_PARALLEL:
			setMax_parallel(MAX_PARALLEL_EDEFAULT);
			return;
		case GHA_metamodelPackage.STRATEGY__CONFIGS:
			getConfigs().clear();
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
		case GHA_metamodelPackage.STRATEGY__FAIL_FAST:
			return fail_fast != FAIL_FAST_EDEFAULT;
		case GHA_metamodelPackage.STRATEGY__MAX_PARALLEL:
			return max_parallel != MAX_PARALLEL_EDEFAULT;
		case GHA_metamodelPackage.STRATEGY__CONFIGS:
			return configs != null && !configs.isEmpty();
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
		result.append(" (fail_fast: ");
		result.append(fail_fast);
		result.append(", max_parallel: ");
		result.append(max_parallel);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
