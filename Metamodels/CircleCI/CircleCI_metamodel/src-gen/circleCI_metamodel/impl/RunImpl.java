/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Environment;
import circleCI_metamodel.Parameters;
import circleCI_metamodel.Run;
import circleCI_metamodel.RunCommand;
import circleCI_metamodel.WHEN_TYPE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getWhen <em>When</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#isBackground <em>Background</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getWorking_directory <em>Working directory</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getNo_output_timeout <em>No output timeout</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getRun_commands <em>Run commands</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.RunImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunImpl extends StepImpl implements Run {
	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final WHEN_TYPE WHEN_EDEFAULT = WHEN_TYPE.ON_SUCCESS;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected WHEN_TYPE when = WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorking_directory() <em>Working directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_directory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = ".";

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
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The default value of the '{@link #getNo_output_timeout() <em>No output timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_output_timeout()
	 * @generated
	 * @ordered
	 */
	protected static final String NO_OUTPUT_TIMEOUT_EDEFAULT = "10m";

	/**
	 * The cached value of the '{@link #getNo_output_timeout() <em>No output timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_output_timeout()
	 * @generated
	 * @ordered
	 */
	protected String no_output_timeout = NO_OUTPUT_TIMEOUT_EDEFAULT;

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
	 * The cached value of the '{@link #getRun_commands() <em>Run commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_commands()
	 * @generated
	 * @ordered
	 */
	protected EList<RunCommand> run_commands;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.RUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHEN_TYPE getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(WHEN_TYPE newWhen) {
		WHEN_TYPE oldWhen = when;
		when = newWhen == null ? WHEN_EDEFAULT : newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.RUN__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(boolean newBackground) {
		boolean oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.RUN__BACKGROUND,
					oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY,
					oldWorking_directory, working_directory));
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
					CircleCI_metamodelPackage.RUN__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNo_output_timeout() {
		return no_output_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNo_output_timeout(String newNo_output_timeout) {
		String oldNo_output_timeout = no_output_timeout;
		no_output_timeout = newNo_output_timeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT,
					oldNo_output_timeout, no_output_timeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.RUN__SHELL, oldShell,
					shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunCommand> getRun_commands() {
		if (run_commands == null) {
			run_commands = new EObjectContainmentEList<RunCommand>(RunCommand.class, this,
					CircleCI_metamodelPackage.RUN__RUN_COMMANDS);
		}
		return run_commands;
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
					CircleCI_metamodelPackage.RUN__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
			return ((InternalEList<?>) getRun_commands()).basicRemove(otherEnd, msgs);
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case CircleCI_metamodelPackage.RUN__WHEN:
			return getWhen();
		case CircleCI_metamodelPackage.RUN__BACKGROUND:
			return isBackground();
		case CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY:
			return getWorking_directory();
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
			return getEnvironments();
		case CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT:
			return getNo_output_timeout();
		case CircleCI_metamodelPackage.RUN__SHELL:
			return getShell();
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
			return getRun_commands();
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
			return getParameters();
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
		case CircleCI_metamodelPackage.RUN__WHEN:
			setWhen((WHEN_TYPE) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__BACKGROUND:
			setBackground((Boolean) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY:
			setWorking_directory((String) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT:
			setNo_output_timeout((String) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__SHELL:
			setShell((String) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
			getRun_commands().clear();
			getRun_commands().addAll((Collection<? extends RunCommand>) newValue);
			return;
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameters>) newValue);
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
		case CircleCI_metamodelPackage.RUN__WHEN:
			setWhen(WHEN_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.RUN__BACKGROUND:
			setBackground(BACKGROUND_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY:
			setWorking_directory(WORKING_DIRECTORY_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT:
			setNo_output_timeout(NO_OUTPUT_TIMEOUT_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.RUN__SHELL:
			setShell(SHELL_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
			getRun_commands().clear();
			return;
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
			getParameters().clear();
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
		case CircleCI_metamodelPackage.RUN__WHEN:
			return when != WHEN_EDEFAULT;
		case CircleCI_metamodelPackage.RUN__BACKGROUND:
			return background != BACKGROUND_EDEFAULT;
		case CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY:
			return WORKING_DIRECTORY_EDEFAULT == null ? working_directory != null
					: !WORKING_DIRECTORY_EDEFAULT.equals(working_directory);
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT:
			return NO_OUTPUT_TIMEOUT_EDEFAULT == null ? no_output_timeout != null
					: !NO_OUTPUT_TIMEOUT_EDEFAULT.equals(no_output_timeout);
		case CircleCI_metamodelPackage.RUN__SHELL:
			return SHELL_EDEFAULT == null ? shell != null : !SHELL_EDEFAULT.equals(shell);
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
			return run_commands != null && !run_commands.isEmpty();
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
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
		result.append(" (when: ");
		result.append(when);
		result.append(", background: ");
		result.append(background);
		result.append(", working_directory: ");
		result.append(working_directory);
		result.append(", no_output_timeout: ");
		result.append(no_output_timeout);
		result.append(", shell: ");
		result.append(shell);
		result.append(')');
		return result.toString();
	}

} //RunImpl
