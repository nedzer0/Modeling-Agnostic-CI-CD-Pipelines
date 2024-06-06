/**
 */
package cICD_metamodel.impl;

import cICD_metamodel.CICD_metamodelPackage;
import cICD_metamodel.Cache;
import cICD_metamodel.Command;
import cICD_metamodel.Environment;
import cICD_metamodel.IfStep;
import cICD_metamodel.Parameters;
import cICD_metamodel.Step;

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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cICD_metamodel.impl.StepImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link cICD_metamodel.impl.StepImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link cICD_metamodel.impl.StepImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link cICD_metamodel.impl.StepImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link cICD_metamodel.impl.StepImpl#getIfStep <em>If Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> cache;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getIfStep() <em>If Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfStep()
	 * @generated
	 * @ordered
	 */
	protected IfStep ifStep;

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
		return CICD_metamodelPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, CICD_metamodelPackage.STEP__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this,
					CICD_metamodelPackage.STEP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cache> getCache() {
		if (cache == null) {
			cache = new EObjectContainmentEList<Cache>(Cache.class, this, CICD_metamodelPackage.STEP__CACHE);
		}
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					CICD_metamodelPackage.STEP__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStep getIfStep() {
		return ifStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfStep(IfStep newIfStep, NotificationChain msgs) {
		IfStep oldIfStep = ifStep;
		ifStep = newIfStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICD_metamodelPackage.STEP__IF_STEP, oldIfStep, newIfStep);
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
	public void setIfStep(IfStep newIfStep) {
		if (newIfStep != ifStep) {
			NotificationChain msgs = null;
			if (ifStep != null)
				msgs = ((InternalEObject) ifStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICD_metamodelPackage.STEP__IF_STEP, null, msgs);
			if (newIfStep != null)
				msgs = ((InternalEObject) newIfStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICD_metamodelPackage.STEP__IF_STEP, null, msgs);
			msgs = basicSetIfStep(newIfStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICD_metamodelPackage.STEP__IF_STEP, newIfStep,
					newIfStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICD_metamodelPackage.STEP__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.STEP__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.STEP__CACHE:
			return ((InternalEList<?>) getCache()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.STEP__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case CICD_metamodelPackage.STEP__IF_STEP:
			return basicSetIfStep(null, msgs);
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
		case CICD_metamodelPackage.STEP__COMMANDS:
			return getCommands();
		case CICD_metamodelPackage.STEP__PARAMETERS:
			return getParameters();
		case CICD_metamodelPackage.STEP__CACHE:
			return getCache();
		case CICD_metamodelPackage.STEP__ENVIRONMENTS:
			return getEnvironments();
		case CICD_metamodelPackage.STEP__IF_STEP:
			return getIfStep();
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
		case CICD_metamodelPackage.STEP__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case CICD_metamodelPackage.STEP__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameters>) newValue);
			return;
		case CICD_metamodelPackage.STEP__CACHE:
			getCache().clear();
			getCache().addAll((Collection<? extends Cache>) newValue);
			return;
		case CICD_metamodelPackage.STEP__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case CICD_metamodelPackage.STEP__IF_STEP:
			setIfStep((IfStep) newValue);
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
		case CICD_metamodelPackage.STEP__COMMANDS:
			getCommands().clear();
			return;
		case CICD_metamodelPackage.STEP__PARAMETERS:
			getParameters().clear();
			return;
		case CICD_metamodelPackage.STEP__CACHE:
			getCache().clear();
			return;
		case CICD_metamodelPackage.STEP__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case CICD_metamodelPackage.STEP__IF_STEP:
			setIfStep((IfStep) null);
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
		case CICD_metamodelPackage.STEP__COMMANDS:
			return commands != null && !commands.isEmpty();
		case CICD_metamodelPackage.STEP__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case CICD_metamodelPackage.STEP__CACHE:
			return cache != null && !cache.isEmpty();
		case CICD_metamodelPackage.STEP__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case CICD_metamodelPackage.STEP__IF_STEP:
			return ifStep != null;
		}
		return super.eIsSet(featureID);
	}

} //StepImpl
