/**
 */
package devOps.impl;

import devOps.Command;
import devOps.DevOpsPackage;
import devOps.IfThenElse;

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
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.IfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link devOps.impl.IfThenElseImpl#getIf <em>If</em>}</li>
 *   <li>{@link devOps.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 *   <li>{@link devOps.impl.IfThenElseImpl#getIfelse <em>Ifelse</em>}</li>
 *   <li>{@link devOps.impl.IfThenElseImpl#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfThenElseImpl extends MinimalEObjectImpl.Container implements IfThenElse {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> if_;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> else_;

	/**
	 * The cached value of the '{@link #getIfelse() <em>Ifelse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfelse()
	 * @generated
	 * @ordered
	 */
	protected EList<IfThenElse> ifelse;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected EList<IfThenElse> elseif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.IF_THEN_ELSE__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<Command>(Command.class, this, DevOpsPackage.IF_THEN_ELSE__IF);
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Command>(Command.class, this, DevOpsPackage.IF_THEN_ELSE__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfThenElse> getIfelse() {
		if (ifelse == null) {
			ifelse = new EObjectContainmentEList<IfThenElse>(IfThenElse.class, this,
					DevOpsPackage.IF_THEN_ELSE__IFELSE);
		}
		return ifelse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfThenElse> getElseif() {
		if (elseif == null) {
			elseif = new EObjectContainmentEList<IfThenElse>(IfThenElse.class, this,
					DevOpsPackage.IF_THEN_ELSE__ELSEIF);
		}
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevOpsPackage.IF_THEN_ELSE__IF:
			return ((InternalEList<?>) getIf()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.IF_THEN_ELSE__ELSE:
			return ((InternalEList<?>) getElse()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.IF_THEN_ELSE__IFELSE:
			return ((InternalEList<?>) getIfelse()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.IF_THEN_ELSE__ELSEIF:
			return ((InternalEList<?>) getElseif()).basicRemove(otherEnd, msgs);
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
		case DevOpsPackage.IF_THEN_ELSE__CONDITION:
			return getCondition();
		case DevOpsPackage.IF_THEN_ELSE__IF:
			return getIf();
		case DevOpsPackage.IF_THEN_ELSE__ELSE:
			return getElse();
		case DevOpsPackage.IF_THEN_ELSE__IFELSE:
			return getIfelse();
		case DevOpsPackage.IF_THEN_ELSE__ELSEIF:
			return getElseif();
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
		case DevOpsPackage.IF_THEN_ELSE__CONDITION:
			setCondition((String) newValue);
			return;
		case DevOpsPackage.IF_THEN_ELSE__IF:
			getIf().clear();
			getIf().addAll((Collection<? extends Command>) newValue);
			return;
		case DevOpsPackage.IF_THEN_ELSE__ELSE:
			getElse().clear();
			getElse().addAll((Collection<? extends Command>) newValue);
			return;
		case DevOpsPackage.IF_THEN_ELSE__IFELSE:
			getIfelse().clear();
			getIfelse().addAll((Collection<? extends IfThenElse>) newValue);
			return;
		case DevOpsPackage.IF_THEN_ELSE__ELSEIF:
			getElseif().clear();
			getElseif().addAll((Collection<? extends IfThenElse>) newValue);
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
		case DevOpsPackage.IF_THEN_ELSE__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case DevOpsPackage.IF_THEN_ELSE__IF:
			getIf().clear();
			return;
		case DevOpsPackage.IF_THEN_ELSE__ELSE:
			getElse().clear();
			return;
		case DevOpsPackage.IF_THEN_ELSE__IFELSE:
			getIfelse().clear();
			return;
		case DevOpsPackage.IF_THEN_ELSE__ELSEIF:
			getElseif().clear();
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
		case DevOpsPackage.IF_THEN_ELSE__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case DevOpsPackage.IF_THEN_ELSE__IF:
			return if_ != null && !if_.isEmpty();
		case DevOpsPackage.IF_THEN_ELSE__ELSE:
			return else_ != null && !else_.isEmpty();
		case DevOpsPackage.IF_THEN_ELSE__IFELSE:
			return ifelse != null && !ifelse.isEmpty();
		case DevOpsPackage.IF_THEN_ELSE__ELSEIF:
			return elseif != null && !elseif.isEmpty();
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
		result.append(" (Condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //IfThenElseImpl
