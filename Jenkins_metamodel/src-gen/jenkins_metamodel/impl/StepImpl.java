/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Command;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Step;
import jenkins_metamodel.Step_Parameter;

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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.StepImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StepImpl#getStep_parameters <em>Step parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected Command commands;

	/**
	 * The cached value of the '{@link #getStep_parameters() <em>Step parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep_parameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Step_Parameter> step_parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command getCommands() {
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommands(Command newCommands, NotificationChain msgs) {
		Command oldCommands = commands;
		commands = newCommands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.STEP__COMMANDS, oldCommands, newCommands);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommands(Command newCommands) {
		if (newCommands != commands) {
			NotificationChain msgs = null;
			if (commands != null)
				msgs = ((InternalEObject) commands).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.STEP__COMMANDS, null, msgs);
			if (newCommands != null)
				msgs = ((InternalEObject) newCommands).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.STEP__COMMANDS, null, msgs);
			msgs = basicSetCommands(newCommands, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STEP__COMMANDS, newCommands,
					newCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step_Parameter> getStep_parameters() {
		if (step_parameters == null) {
			step_parameters = new EObjectContainmentEList<Step_Parameter>(Step_Parameter.class, this,
					Jenkins_metamodelPackage.STEP__STEP_PARAMETERS);
		}
		return step_parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.STEP__COMMANDS:
			return basicSetCommands(null, msgs);
		case Jenkins_metamodelPackage.STEP__STEP_PARAMETERS:
			return ((InternalEList<?>) getStep_parameters()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.STEP__COMMANDS:
			return getCommands();
		case Jenkins_metamodelPackage.STEP__STEP_PARAMETERS:
			return getStep_parameters();
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
		case Jenkins_metamodelPackage.STEP__COMMANDS:
			setCommands((Command) newValue);
			return;
		case Jenkins_metamodelPackage.STEP__STEP_PARAMETERS:
			getStep_parameters().clear();
			getStep_parameters().addAll((Collection<? extends Step_Parameter>) newValue);
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
		case Jenkins_metamodelPackage.STEP__COMMANDS:
			setCommands((Command) null);
			return;
		case Jenkins_metamodelPackage.STEP__STEP_PARAMETERS:
			getStep_parameters().clear();
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
		case Jenkins_metamodelPackage.STEP__COMMANDS:
			return commands != null;
		case Jenkins_metamodelPackage.STEP__STEP_PARAMETERS:
			return step_parameters != null && !step_parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepImpl
