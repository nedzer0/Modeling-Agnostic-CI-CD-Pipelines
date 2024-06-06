/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Action;
import gHA_metamodel.Concurrency;
import gHA_metamodel.DefaultSetting;
import gHA_metamodel.Env;
import gHA_metamodel.Environment;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.If;
import gHA_metamodel.Job;
import gHA_metamodel.Need;
import gHA_metamodel.Output;
import gHA_metamodel.Permission;
import gHA_metamodel.Runs_On;
import gHA_metamodel.Secret;
import gHA_metamodel.Service;
import gHA_metamodel.Step;
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
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getIf <em>If</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getDefaultsetting <em>Defaultsetting</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getTimeout_minutes <em>Timeout minutes</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getContinue_on_error <em>Continue on error</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getServices <em>Services</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getRunner <em>Runner</em>}</li>
 *   <li>{@link gHA_metamodel.impl.JobImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected If if_;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Strategy strategy;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected Concurrency concurrency;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getDefaultsetting() <em>Defaultsetting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultsetting()
	 * @generated
	 * @ordered
	 */
	protected DefaultSetting defaultsetting;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

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
	 * The cached value of the '{@link #getNeed() <em>Need</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected Need need;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The default value of the '{@link #getTimeout_minutes() <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_minutes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_MINUTES_EDEFAULT = 360;

	/**
	 * The cached value of the '{@link #getTimeout_minutes() <em>Timeout minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_minutes()
	 * @generated
	 * @ordered
	 */
	protected int timeout_minutes = TIMEOUT_MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getContinue_on_error() <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_on_error()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTINUE_ON_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinue_on_error() <em>Continue on error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_on_error()
	 * @generated
	 * @ordered
	 */
	protected String continue_on_error = CONTINUE_ON_ERROR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<Secret> secrets;

	/**
	 * The cached value of the '{@link #getRunner() <em>Runner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected Runs_On runner;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected gHA_metamodel.Container container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, GHA_metamodelPackage.JOB__STEPS);
		}
		return steps;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__IF,
					oldIf, newIf);
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
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs) {
		Strategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__STRATEGY, oldStrategy, newStrategy);
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
	public void setStrategy(Strategy newStrategy) {
		if (newStrategy != strategy) {
			NotificationChain msgs = null;
			if (strategy != null)
				msgs = ((InternalEObject) strategy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__STRATEGY, null, msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject) newStrategy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__STRATEGY, null, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__STRATEGY, newStrategy,
					newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrency(Concurrency newConcurrency, NotificationChain msgs) {
		Concurrency oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__CONCURRENCY, oldConcurrency, newConcurrency);
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
	public void setConcurrency(Concurrency newConcurrency) {
		if (newConcurrency != concurrency) {
			NotificationChain msgs = null;
			if (concurrency != null)
				msgs = ((InternalEObject) concurrency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__CONCURRENCY, null, msgs);
			if (newConcurrency != null)
				msgs = ((InternalEObject) newConcurrency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__CONCURRENCY, null, msgs);
			msgs = basicSetConcurrency(newConcurrency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__CONCURRENCY, newConcurrency,
					newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__ENVIRONMENT, newEnvironment,
					newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultSetting getDefaultsetting() {
		return defaultsetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultsetting(DefaultSetting newDefaultsetting, NotificationChain msgs) {
		DefaultSetting oldDefaultsetting = defaultsetting;
		defaultsetting = newDefaultsetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__DEFAULTSETTING, oldDefaultsetting, newDefaultsetting);
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
	public void setDefaultsetting(DefaultSetting newDefaultsetting) {
		if (newDefaultsetting != defaultsetting) {
			NotificationChain msgs = null;
			if (defaultsetting != null)
				msgs = ((InternalEObject) defaultsetting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__DEFAULTSETTING, null, msgs);
			if (newDefaultsetting != null)
				msgs = ((InternalEObject) newDefaultsetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__DEFAULTSETTING, null, msgs);
			msgs = basicSetDefaultsetting(newDefaultsetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__DEFAULTSETTING,
					newDefaultsetting, newDefaultsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permission>(Permission.class, this,
					GHA_metamodelPackage.JOB__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentEList<Env>(Env.class, this, GHA_metamodelPackage.JOB__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Need getNeed() {
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeed(Need newNeed, NotificationChain msgs) {
		Need oldNeed = need;
		need = newNeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__NEED, oldNeed, newNeed);
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
	public void setNeed(Need newNeed) {
		if (newNeed != need) {
			NotificationChain msgs = null;
			if (need != null)
				msgs = ((InternalEObject) need).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__NEED, null, msgs);
			if (newNeed != null)
				msgs = ((InternalEObject) newNeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__NEED, null, msgs);
			msgs = basicSetNeed(newNeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__NEED, newNeed, newNeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, GHA_metamodelPackage.JOB__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout_minutes() {
		return timeout_minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout_minutes(int newTimeout_minutes) {
		int oldTimeout_minutes = timeout_minutes;
		timeout_minutes = newTimeout_minutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__TIMEOUT_MINUTES,
					oldTimeout_minutes, timeout_minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContinue_on_error() {
		return continue_on_error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinue_on_error(String newContinue_on_error) {
		String oldContinue_on_error = continue_on_error;
		continue_on_error = newContinue_on_error;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR,
					oldContinue_on_error, continue_on_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, GHA_metamodelPackage.JOB__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, GHA_metamodelPackage.JOB__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Secret> getSecrets() {
		if (secrets == null) {
			secrets = new EObjectContainmentEList<Secret>(Secret.class, this, GHA_metamodelPackage.JOB__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runs_On getRunner() {
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunner(Runs_On newRunner, NotificationChain msgs) {
		Runs_On oldRunner = runner;
		runner = newRunner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__RUNNER, oldRunner, newRunner);
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
	public void setRunner(Runs_On newRunner) {
		if (newRunner != runner) {
			NotificationChain msgs = null;
			if (runner != null)
				msgs = ((InternalEObject) runner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__RUNNER, null, msgs);
			if (newRunner != null)
				msgs = ((InternalEObject) newRunner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__RUNNER, null, msgs);
			msgs = basicSetRunner(newRunner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__RUNNER, newRunner,
					newRunner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gHA_metamodel.Container getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(gHA_metamodel.Container newContainer, NotificationChain msgs) {
		gHA_metamodel.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.JOB__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(gHA_metamodel.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject) container).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.JOB__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.JOB__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__IF:
			return basicSetIf(null, msgs);
		case GHA_metamodelPackage.JOB__STRATEGY:
			return basicSetStrategy(null, msgs);
		case GHA_metamodelPackage.JOB__CONCURRENCY:
			return basicSetConcurrency(null, msgs);
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
			return basicSetDefaultsetting(null, msgs);
		case GHA_metamodelPackage.JOB__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__ENVS:
			return ((InternalEList<?>) getEnvs()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__NEED:
			return basicSetNeed(null, msgs);
		case GHA_metamodelPackage.JOB__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__SECRETS:
			return ((InternalEList<?>) getSecrets()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.JOB__RUNNER:
			return basicSetRunner(null, msgs);
		case GHA_metamodelPackage.JOB__CONTAINER:
			return basicSetContainer(null, msgs);
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
		case GHA_metamodelPackage.JOB__STEPS:
			return getSteps();
		case GHA_metamodelPackage.JOB__NAME:
			return getName();
		case GHA_metamodelPackage.JOB__IF:
			return getIf();
		case GHA_metamodelPackage.JOB__STRATEGY:
			return getStrategy();
		case GHA_metamodelPackage.JOB__CONCURRENCY:
			return getConcurrency();
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
			return getEnvironment();
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
			return getDefaultsetting();
		case GHA_metamodelPackage.JOB__PERMISSIONS:
			return getPermissions();
		case GHA_metamodelPackage.JOB__ENVS:
			return getEnvs();
		case GHA_metamodelPackage.JOB__NEED:
			return getNeed();
		case GHA_metamodelPackage.JOB__OUTPUTS:
			return getOutputs();
		case GHA_metamodelPackage.JOB__TIMEOUT_MINUTES:
			return getTimeout_minutes();
		case GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR:
			return getContinue_on_error();
		case GHA_metamodelPackage.JOB__SERVICES:
			return getServices();
		case GHA_metamodelPackage.JOB__ACTIONS:
			return getActions();
		case GHA_metamodelPackage.JOB__SECRETS:
			return getSecrets();
		case GHA_metamodelPackage.JOB__RUNNER:
			return getRunner();
		case GHA_metamodelPackage.JOB__CONTAINER:
			return getContainer();
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
		case GHA_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case GHA_metamodelPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case GHA_metamodelPackage.JOB__IF:
			setIf((If) newValue);
			return;
		case GHA_metamodelPackage.JOB__STRATEGY:
			setStrategy((Strategy) newValue);
			return;
		case GHA_metamodelPackage.JOB__CONCURRENCY:
			setConcurrency((Concurrency) newValue);
			return;
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) newValue);
			return;
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
			setDefaultsetting((DefaultSetting) newValue);
			return;
		case GHA_metamodelPackage.JOB__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permission>) newValue);
			return;
		case GHA_metamodelPackage.JOB__ENVS:
			getEnvs().clear();
			getEnvs().addAll((Collection<? extends Env>) newValue);
			return;
		case GHA_metamodelPackage.JOB__NEED:
			setNeed((Need) newValue);
			return;
		case GHA_metamodelPackage.JOB__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case GHA_metamodelPackage.JOB__TIMEOUT_MINUTES:
			setTimeout_minutes((Integer) newValue);
			return;
		case GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR:
			setContinue_on_error((String) newValue);
			return;
		case GHA_metamodelPackage.JOB__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case GHA_metamodelPackage.JOB__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case GHA_metamodelPackage.JOB__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends Secret>) newValue);
			return;
		case GHA_metamodelPackage.JOB__RUNNER:
			setRunner((Runs_On) newValue);
			return;
		case GHA_metamodelPackage.JOB__CONTAINER:
			setContainer((gHA_metamodel.Container) newValue);
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
		case GHA_metamodelPackage.JOB__STEPS:
			getSteps().clear();
			return;
		case GHA_metamodelPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.JOB__IF:
			setIf((If) null);
			return;
		case GHA_metamodelPackage.JOB__STRATEGY:
			setStrategy((Strategy) null);
			return;
		case GHA_metamodelPackage.JOB__CONCURRENCY:
			setConcurrency((Concurrency) null);
			return;
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) null);
			return;
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
			setDefaultsetting((DefaultSetting) null);
			return;
		case GHA_metamodelPackage.JOB__PERMISSIONS:
			getPermissions().clear();
			return;
		case GHA_metamodelPackage.JOB__ENVS:
			getEnvs().clear();
			return;
		case GHA_metamodelPackage.JOB__NEED:
			setNeed((Need) null);
			return;
		case GHA_metamodelPackage.JOB__OUTPUTS:
			getOutputs().clear();
			return;
		case GHA_metamodelPackage.JOB__TIMEOUT_MINUTES:
			setTimeout_minutes(TIMEOUT_MINUTES_EDEFAULT);
			return;
		case GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR:
			setContinue_on_error(CONTINUE_ON_ERROR_EDEFAULT);
			return;
		case GHA_metamodelPackage.JOB__SERVICES:
			getServices().clear();
			return;
		case GHA_metamodelPackage.JOB__ACTIONS:
			getActions().clear();
			return;
		case GHA_metamodelPackage.JOB__SECRETS:
			getSecrets().clear();
			return;
		case GHA_metamodelPackage.JOB__RUNNER:
			setRunner((Runs_On) null);
			return;
		case GHA_metamodelPackage.JOB__CONTAINER:
			setContainer((gHA_metamodel.Container) null);
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
		case GHA_metamodelPackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case GHA_metamodelPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GHA_metamodelPackage.JOB__IF:
			return if_ != null;
		case GHA_metamodelPackage.JOB__STRATEGY:
			return strategy != null;
		case GHA_metamodelPackage.JOB__CONCURRENCY:
			return concurrency != null;
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
			return environment != null;
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
			return defaultsetting != null;
		case GHA_metamodelPackage.JOB__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case GHA_metamodelPackage.JOB__ENVS:
			return envs != null && !envs.isEmpty();
		case GHA_metamodelPackage.JOB__NEED:
			return need != null;
		case GHA_metamodelPackage.JOB__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case GHA_metamodelPackage.JOB__TIMEOUT_MINUTES:
			return timeout_minutes != TIMEOUT_MINUTES_EDEFAULT;
		case GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR:
			return CONTINUE_ON_ERROR_EDEFAULT == null ? continue_on_error != null
					: !CONTINUE_ON_ERROR_EDEFAULT.equals(continue_on_error);
		case GHA_metamodelPackage.JOB__SERVICES:
			return services != null && !services.isEmpty();
		case GHA_metamodelPackage.JOB__ACTIONS:
			return actions != null && !actions.isEmpty();
		case GHA_metamodelPackage.JOB__SECRETS:
			return secrets != null && !secrets.isEmpty();
		case GHA_metamodelPackage.JOB__RUNNER:
			return runner != null;
		case GHA_metamodelPackage.JOB__CONTAINER:
			return container != null;
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
		result.append(", timeout_minutes: ");
		result.append(timeout_minutes);
		result.append(", continue_on_error: ");
		result.append(continue_on_error);
		result.append(')');
		return result.toString();
	}

} //JobImpl
