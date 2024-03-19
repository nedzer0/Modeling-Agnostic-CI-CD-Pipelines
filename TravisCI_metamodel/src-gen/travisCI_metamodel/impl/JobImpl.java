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
import travisCI_metamodel.Artifact;
import travisCI_metamodel.Deploy;
import travisCI_metamodel.Environment;
import travisCI_metamodel.If;
import travisCI_metamodel.JOB_TYPE;
import travisCI_metamodel.Job;
import travisCI_metamodel.Language;
import travisCI_metamodel.STAGE_TYPE;
import travisCI_metamodel.Script;
import travisCI_metamodel.Service;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#isFast_finish <em>Fast finish</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getStage_type <em>Stage type</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getService <em>Service</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getIf <em>If</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getJob_type <em>Job type</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.JobImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
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
	 * The default value of the '{@link #isFast_finish() <em>Fast finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFast_finish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAST_FINISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFast_finish() <em>Fast finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFast_finish()
	 * @generated
	 * @ordered
	 */
	protected boolean fast_finish = FAST_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStage_type() <em>Stage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage_type()
	 * @generated
	 * @ordered
	 */
	protected static final STAGE_TYPE STAGE_TYPE_EDEFAULT = STAGE_TYPE.NONE;

	/**
	 * The cached value of the '{@link #getStage_type() <em>Stage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage_type()
	 * @generated
	 * @ordered
	 */
	protected STAGE_TYPE stage_type = STAGE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifact;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected EList<Deploy> deploy;

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
	 * The default value of the '{@link #getJob_type() <em>Job type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_type()
	 * @generated
	 * @ordered
	 */
	protected static final JOB_TYPE JOB_TYPE_EDEFAULT = JOB_TYPE.INCLUDE;

	/**
	 * The cached value of the '{@link #getJob_type() <em>Job type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_type()
	 * @generated
	 * @ordered
	 */
	protected JOB_TYPE job_type = JOB_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> script;

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
		return TravisCI_metamodelPackage.Literals.JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFast_finish() {
		return fast_finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFast_finish(boolean newFast_finish) {
		boolean oldFast_finish = fast_finish;
		fast_finish = newFast_finish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__FAST_FINISH,
					oldFast_finish, fast_finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STAGE_TYPE getStage_type() {
		return stage_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage_type(STAGE_TYPE newStage_type) {
		STAGE_TYPE oldStage_type = stage_type;
		stage_type = newStage_type == null ? STAGE_TYPE_EDEFAULT : newStage_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__STAGE_TYPE,
					oldStage_type, stage_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, TravisCI_metamodelPackage.JOB__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentEList<Artifact>(Artifact.class, this,
					TravisCI_metamodelPackage.JOB__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					TravisCI_metamodelPackage.JOB__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deploy> getDeploy() {
		if (deploy == null) {
			deploy = new EObjectContainmentEList<Deploy>(Deploy.class, this, TravisCI_metamodelPackage.JOB__DEPLOY);
		}
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Script> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<Script>(Script.class, this, TravisCI_metamodelPackage.JOB__SCRIPT);
		}
		return script;
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
					TravisCI_metamodelPackage.JOB__IF, oldIf, newIf);
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
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.JOB__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.JOB__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JOB_TYPE getJob_type() {
		return job_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob_type(JOB_TYPE newJob_type) {
		JOB_TYPE oldJob_type = job_type;
		job_type = newJob_type == null ? JOB_TYPE_EDEFAULT : newJob_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__JOB_TYPE, oldJob_type,
					job_type));
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
					TravisCI_metamodelPackage.JOB__LANGUAGE, oldLanguage, newLanguage);
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
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.JOB__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject) newLanguage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.JOB__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.JOB__LANGUAGE, newLanguage,
					newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TravisCI_metamodelPackage.JOB__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
			return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.JOB__DEPLOY:
			return ((InternalEList<?>) getDeploy()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.JOB__IF:
			return basicSetIf(null, msgs);
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
			return basicSetLanguage(null, msgs);
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			return ((InternalEList<?>) getScript()).basicRemove(otherEnd, msgs);
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
		case TravisCI_metamodelPackage.JOB__NAME:
			return getName();
		case TravisCI_metamodelPackage.JOB__FAST_FINISH:
			return isFast_finish();
		case TravisCI_metamodelPackage.JOB__STAGE_TYPE:
			return getStage_type();
		case TravisCI_metamodelPackage.JOB__SERVICE:
			return getService();
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
			return getArtifact();
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
			return getEnvironment();
		case TravisCI_metamodelPackage.JOB__DEPLOY:
			return getDeploy();
		case TravisCI_metamodelPackage.JOB__IF:
			return getIf();
		case TravisCI_metamodelPackage.JOB__JOB_TYPE:
			return getJob_type();
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
			return getLanguage();
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			return getScript();
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
		case TravisCI_metamodelPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__FAST_FINISH:
			setFast_finish((Boolean) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__STAGE_TYPE:
			setStage_type((STAGE_TYPE) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
			getArtifact().clear();
			getArtifact().addAll((Collection<? extends Artifact>) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__DEPLOY:
			getDeploy().clear();
			getDeploy().addAll((Collection<? extends Deploy>) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__IF:
			setIf((If) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__JOB_TYPE:
			setJob_type((JOB_TYPE) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
			setLanguage((Language) newValue);
			return;
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			getScript().clear();
			getScript().addAll((Collection<? extends Script>) newValue);
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
		case TravisCI_metamodelPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.JOB__FAST_FINISH:
			setFast_finish(FAST_FINISH_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.JOB__STAGE_TYPE:
			setStage_type(STAGE_TYPE_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.JOB__SERVICE:
			getService().clear();
			return;
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
			getArtifact().clear();
			return;
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case TravisCI_metamodelPackage.JOB__DEPLOY:
			getDeploy().clear();
			return;
		case TravisCI_metamodelPackage.JOB__IF:
			setIf((If) null);
			return;
		case TravisCI_metamodelPackage.JOB__JOB_TYPE:
			setJob_type(JOB_TYPE_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
			setLanguage((Language) null);
			return;
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			getScript().clear();
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
		case TravisCI_metamodelPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TravisCI_metamodelPackage.JOB__FAST_FINISH:
			return fast_finish != FAST_FINISH_EDEFAULT;
		case TravisCI_metamodelPackage.JOB__STAGE_TYPE:
			return stage_type != STAGE_TYPE_EDEFAULT;
		case TravisCI_metamodelPackage.JOB__SERVICE:
			return service != null && !service.isEmpty();
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
			return artifact != null && !artifact.isEmpty();
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case TravisCI_metamodelPackage.JOB__DEPLOY:
			return deploy != null && !deploy.isEmpty();
		case TravisCI_metamodelPackage.JOB__IF:
			return if_ != null;
		case TravisCI_metamodelPackage.JOB__JOB_TYPE:
			return job_type != JOB_TYPE_EDEFAULT;
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
			return language != null;
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			return script != null && !script.isEmpty();
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
		result.append(", fast_finish: ");
		result.append(fast_finish);
		result.append(", stage_type: ");
		result.append(stage_type);
		result.append(", job_type: ");
		result.append(job_type);
		result.append(')');
		return result.toString();
	}

} //JobImpl
