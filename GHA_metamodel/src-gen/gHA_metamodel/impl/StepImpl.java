/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Action;
import gHA_metamodel.Command;
import gHA_metamodel.Env;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.If;
import gHA_metamodel.Parameter;
import gHA_metamodel.Step;

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
 *   <li>{@link gHA_metamodel.impl.StepImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getIf <em>If</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getWorking_directory <em>Working directory</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#isContinue_on_error <em>Continue on error</em>}</li>
 *   <li>{@link gHA_metamodel.impl.StepImpl#getTimeout_minutes <em>Timeout minutes</em>}</li>
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
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getEnvs() <em>Envs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvs()
	 * @generated
	 * @ordered
	 */
	protected EList<Env> envs;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected If if_;

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
	 * The default value of the '{@link #getWorking_directory() <em>Working directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_directory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorking_directory() <em>Working directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_directory()
	 * @generated
	 * @ordered
	 */
	protected String working_directory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected static final String SHELL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected String shell = SHELL_EDEFAULT;

	/**
	 * The default value of the '{@link #isContinue_on_error() <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinue_on_error()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_ON_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinue_on_error() <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinue_on_error()
	 * @generated
	 * @ordered
	 */
	protected boolean continue_on_error = CONTINUE_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout_minutes() <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_minutes()
	 * @generated
	 * @ordered
	 */
	protected static final short TIMEOUT_MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout_minutes() <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_minutes()
	 * @generated
	 * @ordered
	 */
	protected short timeout_minutes = TIMEOUT_MINUTES_EDEFAULT;

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
		return GHA_metamodelPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, GHA_metamodelPackage.STEP__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					GHA_metamodelPackage.STEP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, GHA_metamodelPackage.STEP__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentEList<Env>(Env.class, this, GHA_metamodelPackage.STEP__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(If newIf, NotificationChain msgs) {
		If oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.STEP__IF, oldIf, newIf);
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
	public void setIf(If newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.STEP__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.STEP__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__IF, newIf, newIf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorking_directory() {
		return working_directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorking_directory(String newWorking_directory) {
		String oldWorking_directory = working_directory;
		working_directory = newWorking_directory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__WORKING_DIRECTORY,
					oldWorking_directory, working_directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(String newShell) {
		String oldShell = shell;
		shell = newShell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__SHELL, oldShell, shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContinue_on_error() {
		return continue_on_error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinue_on_error(boolean newContinue_on_error) {
		boolean oldContinue_on_error = continue_on_error;
		continue_on_error = newContinue_on_error;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR,
					oldContinue_on_error, continue_on_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getTimeout_minutes() {
		return timeout_minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout_minutes(short newTimeout_minutes) {
		short oldTimeout_minutes = timeout_minutes;
		timeout_minutes = newTimeout_minutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.STEP__TIMEOUT_MINUTES,
					oldTimeout_minutes, timeout_minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.STEP__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.STEP__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.STEP__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.STEP__ENVS:
			return ((InternalEList<?>) getEnvs()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.STEP__IF:
			return basicSetIf(null, msgs);
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
		case GHA_metamodelPackage.STEP__COMMANDS:
			return getCommands();
		case GHA_metamodelPackage.STEP__PARAMETERS:
			return getParameters();
		case GHA_metamodelPackage.STEP__ACTIONS:
			return getActions();
		case GHA_metamodelPackage.STEP__ENVS:
			return getEnvs();
		case GHA_metamodelPackage.STEP__IF:
			return getIf();
		case GHA_metamodelPackage.STEP__NAME:
			return getName();
		case GHA_metamodelPackage.STEP__WORKING_DIRECTORY:
			return getWorking_directory();
		case GHA_metamodelPackage.STEP__SHELL:
			return getShell();
		case GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR:
			return isContinue_on_error();
		case GHA_metamodelPackage.STEP__TIMEOUT_MINUTES:
			return getTimeout_minutes();
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
		case GHA_metamodelPackage.STEP__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case GHA_metamodelPackage.STEP__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case GHA_metamodelPackage.STEP__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case GHA_metamodelPackage.STEP__ENVS:
			getEnvs().clear();
			getEnvs().addAll((Collection<? extends Env>) newValue);
			return;
		case GHA_metamodelPackage.STEP__IF:
			setIf((If) newValue);
			return;
		case GHA_metamodelPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case GHA_metamodelPackage.STEP__WORKING_DIRECTORY:
			setWorking_directory((String) newValue);
			return;
		case GHA_metamodelPackage.STEP__SHELL:
			setShell((String) newValue);
			return;
		case GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR:
			setContinue_on_error((Boolean) newValue);
			return;
		case GHA_metamodelPackage.STEP__TIMEOUT_MINUTES:
			setTimeout_minutes((Short) newValue);
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
		case GHA_metamodelPackage.STEP__COMMANDS:
			getCommands().clear();
			return;
		case GHA_metamodelPackage.STEP__PARAMETERS:
			getParameters().clear();
			return;
		case GHA_metamodelPackage.STEP__ACTIONS:
			getActions().clear();
			return;
		case GHA_metamodelPackage.STEP__ENVS:
			getEnvs().clear();
			return;
		case GHA_metamodelPackage.STEP__IF:
			setIf((If) null);
			return;
		case GHA_metamodelPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.STEP__WORKING_DIRECTORY:
			setWorking_directory(WORKING_DIRECTORY_EDEFAULT);
			return;
		case GHA_metamodelPackage.STEP__SHELL:
			setShell(SHELL_EDEFAULT);
			return;
		case GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR:
			setContinue_on_error(CONTINUE_ON_ERROR_EDEFAULT);
			return;
		case GHA_metamodelPackage.STEP__TIMEOUT_MINUTES:
			setTimeout_minutes(TIMEOUT_MINUTES_EDEFAULT);
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
		case GHA_metamodelPackage.STEP__COMMANDS:
			return commands != null && !commands.isEmpty();
		case GHA_metamodelPackage.STEP__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case GHA_metamodelPackage.STEP__ACTIONS:
			return actions != null && !actions.isEmpty();
		case GHA_metamodelPackage.STEP__ENVS:
			return envs != null && !envs.isEmpty();
		case GHA_metamodelPackage.STEP__IF:
			return if_ != null;
		case GHA_metamodelPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GHA_metamodelPackage.STEP__WORKING_DIRECTORY:
			return WORKING_DIRECTORY_EDEFAULT == null ? working_directory != null
					: !WORKING_DIRECTORY_EDEFAULT.equals(working_directory);
		case GHA_metamodelPackage.STEP__SHELL:
			return SHELL_EDEFAULT == null ? shell != null : !SHELL_EDEFAULT.equals(shell);
		case GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR:
			return continue_on_error != CONTINUE_ON_ERROR_EDEFAULT;
		case GHA_metamodelPackage.STEP__TIMEOUT_MINUTES:
			return timeout_minutes != TIMEOUT_MINUTES_EDEFAULT;
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
		result.append(", working_directory: ");
		result.append(working_directory);
		result.append(", shell: ");
		result.append(shell);
		result.append(", continue_on_error: ");
		result.append(continue_on_error);
		result.append(", timeout_minutes: ");
		result.append(timeout_minutes);
		result.append(')');
		return result.toString();
	}

} //StepImpl
