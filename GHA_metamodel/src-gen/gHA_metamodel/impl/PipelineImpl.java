/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Concurrency;
import gHA_metamodel.DefaultSetting;
import gHA_metamodel.Env;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.Job;
import gHA_metamodel.Permission;
import gHA_metamodel.Pipeline;
import gHA_metamodel.Trigger;

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
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getRun_name <em>Run name</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PipelineImpl#getDefaultsetting <em>Defaultsetting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

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
	 * The default value of the '{@link #getRun_name() <em>Run name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_name()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRun_name() <em>Run name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_name()
	 * @generated
	 * @ordered
	 */
	protected String run_name = RUN_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected Concurrency concurrency;

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
	 * The cached value of the '{@link #getDefaultsetting() <em>Defaultsetting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultsetting()
	 * @generated
	 * @ordered
	 */
	protected DefaultSetting defaultsetting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					GHA_metamodelPackage.PIPELINE__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, GHA_metamodelPackage.PIPELINE__JOBS);
		}
		return jobs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PIPELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRun_name() {
		return run_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRun_name(String newRun_name) {
		String oldRun_name = run_name;
		run_name = newRun_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PIPELINE__RUN_NAME, oldRun_name,
					run_name));
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
					GHA_metamodelPackage.PIPELINE__PERMISSIONS);
		}
		return permissions;
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
					GHA_metamodelPackage.PIPELINE__CONCURRENCY, oldConcurrency, newConcurrency);
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
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.PIPELINE__CONCURRENCY, null, msgs);
			if (newConcurrency != null)
				msgs = ((InternalEObject) newConcurrency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.PIPELINE__CONCURRENCY, null, msgs);
			msgs = basicSetConcurrency(newConcurrency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PIPELINE__CONCURRENCY,
					newConcurrency, newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentEList<Env>(Env.class, this, GHA_metamodelPackage.PIPELINE__ENVS);
		}
		return envs;
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
					GHA_metamodelPackage.PIPELINE__DEFAULTSETTING, oldDefaultsetting, newDefaultsetting);
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
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.PIPELINE__DEFAULTSETTING, null, msgs);
			if (newDefaultsetting != null)
				msgs = ((InternalEObject) newDefaultsetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.PIPELINE__DEFAULTSETTING, null, msgs);
			msgs = basicSetDefaultsetting(newDefaultsetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.PIPELINE__DEFAULTSETTING,
					newDefaultsetting, newDefaultsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PIPELINE__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
			return basicSetConcurrency(null, msgs);
		case GHA_metamodelPackage.PIPELINE__ENVS:
			return ((InternalEList<?>) getEnvs()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
			return basicSetDefaultsetting(null, msgs);
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
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
			return getTriggers();
		case GHA_metamodelPackage.PIPELINE__JOBS:
			return getJobs();
		case GHA_metamodelPackage.PIPELINE__NAME:
			return getName();
		case GHA_metamodelPackage.PIPELINE__RUN_NAME:
			return getRun_name();
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
			return getPermissions();
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
			return getConcurrency();
		case GHA_metamodelPackage.PIPELINE__ENVS:
			return getEnvs();
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
			return getDefaultsetting();
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
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__NAME:
			setName((String) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__RUN_NAME:
			setRun_name((String) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
			getPermissions().clear();
			getPermissions().addAll((Collection<? extends Permission>) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
			setConcurrency((Concurrency) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__ENVS:
			getEnvs().clear();
			getEnvs().addAll((Collection<? extends Env>) newValue);
			return;
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
			setDefaultsetting((DefaultSetting) newValue);
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
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			return;
		case GHA_metamodelPackage.PIPELINE__JOBS:
			getJobs().clear();
			return;
		case GHA_metamodelPackage.PIPELINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.PIPELINE__RUN_NAME:
			setRun_name(RUN_NAME_EDEFAULT);
			return;
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
			getPermissions().clear();
			return;
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
			setConcurrency((Concurrency) null);
			return;
		case GHA_metamodelPackage.PIPELINE__ENVS:
			getEnvs().clear();
			return;
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
			setDefaultsetting((DefaultSetting) null);
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
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case GHA_metamodelPackage.PIPELINE__JOBS:
			return jobs != null && !jobs.isEmpty();
		case GHA_metamodelPackage.PIPELINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GHA_metamodelPackage.PIPELINE__RUN_NAME:
			return RUN_NAME_EDEFAULT == null ? run_name != null : !RUN_NAME_EDEFAULT.equals(run_name);
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
			return concurrency != null;
		case GHA_metamodelPackage.PIPELINE__ENVS:
			return envs != null && !envs.isEmpty();
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
			return defaultsetting != null;
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
		result.append(", run_name: ");
		result.append(run_name);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
