/**
 */
package travisCI_metamodel.impl;

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

import travisCI_metamodel.Allow_Failure;
import travisCI_metamodel.Branch;
import travisCI_metamodel.Environment;
import travisCI_metamodel.If;
import travisCI_metamodel.Install;
import travisCI_metamodel.Job;
import travisCI_metamodel.Language;
import travisCI_metamodel.Pipeline;
import travisCI_metamodel.Service;
import travisCI_metamodel.Stage;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getInstall <em>Install</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getJob <em>Job</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getIf <em>If</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getService <em>Service</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.PipelineImpl#getAllow_failure <em>Allow failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getInstall() <em>Install</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstall()
	 * @generated
	 * @ordered
	 */
	protected EList<Install> install;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The cached value of the '{@link #getPipeline_environment() <em>Pipeline environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline_environment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> pipeline_environment;

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
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branch;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stage;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getAllow_failure() <em>Allow failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllow_failure()
	 * @generated
	 * @ordered
	 */
	protected Allow_Failure allow_failure;

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
		return TravisCI_metamodelPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Install> getInstall() {
		if (install == null) {
			install = new EObjectContainmentEList<Install>(Install.class, this,
					TravisCI_metamodelPackage.PIPELINE__INSTALL);
		}
		return install;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, TravisCI_metamodelPackage.PIPELINE__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Language newLanguage, NotificationChain msgs) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TravisCI_metamodelPackage.PIPELINE__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(Language newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject) language).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject) newLanguage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.PIPELINE__LANGUAGE,
					newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getPipeline_environment() {
		if (pipeline_environment == null) {
			pipeline_environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT);
		}
		return pipeline_environment;
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
					TravisCI_metamodelPackage.PIPELINE__IF, oldIf, newIf);
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
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.PIPELINE__IF, newIf,
					newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<Branch>(Branch.class, this,
					TravisCI_metamodelPackage.PIPELINE__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<Stage>(Stage.class, this, TravisCI_metamodelPackage.PIPELINE__STAGE);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this,
					TravisCI_metamodelPackage.PIPELINE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Allow_Failure getAllow_failure() {
		return allow_failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllow_failure(Allow_Failure newAllow_failure, NotificationChain msgs) {
		Allow_Failure oldAllow_failure = allow_failure;
		allow_failure = newAllow_failure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE, oldAllow_failure, newAllow_failure);
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
	public void setAllow_failure(Allow_Failure newAllow_failure) {
		if (newAllow_failure != allow_failure) {
			NotificationChain msgs = null;
			if (allow_failure != null)
				msgs = ((InternalEObject) allow_failure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE, null, msgs);
			if (newAllow_failure != null)
				msgs = ((InternalEObject) newAllow_failure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE, null, msgs);
			msgs = basicSetAllow_failure(newAllow_failure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE,
					newAllow_failure, newAllow_failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
			return ((InternalEList<?>) getInstall()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__JOB:
			return ((InternalEList<?>) getJob()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
			return basicSetLanguage(null, msgs);
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return ((InternalEList<?>) getPipeline_environment()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__IF:
			return basicSetIf(null, msgs);
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
			return ((InternalEList<?>) getBranch()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
			return ((InternalEList<?>) getStage()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
			return basicSetAllow_failure(null, msgs);
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
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
			return getInstall();
		case TravisCI_metamodelPackage.PIPELINE__JOB:
			return getJob();
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
			return getLanguage();
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return getPipeline_environment();
		case TravisCI_metamodelPackage.PIPELINE__IF:
			return getIf();
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
			return getBranch();
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
			return getStage();
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
			return getService();
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
			return getAllow_failure();
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
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
			getInstall().clear();
			getInstall().addAll((Collection<? extends Install>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__JOB:
			getJob().clear();
			getJob().addAll((Collection<? extends Job>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
			setLanguage((Language) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			getPipeline_environment().addAll((Collection<? extends Environment>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__IF:
			setIf((If) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
			getBranch().clear();
			getBranch().addAll((Collection<? extends Branch>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends Stage>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
			setAllow_failure((Allow_Failure) newValue);
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
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
			getInstall().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__JOB:
			getJob().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
			setLanguage((Language) null);
			return;
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__IF:
			setIf((If) null);
			return;
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
			getBranch().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
			getStage().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
			getService().clear();
			return;
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
			setAllow_failure((Allow_Failure) null);
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
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
			return install != null && !install.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__JOB:
			return job != null && !job.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
			return language != null;
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return pipeline_environment != null && !pipeline_environment.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__IF:
			return if_ != null;
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
			return branch != null && !branch.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
			return stage != null && !stage.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
			return service != null && !service.isEmpty();
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
			return allow_failure != null;
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
