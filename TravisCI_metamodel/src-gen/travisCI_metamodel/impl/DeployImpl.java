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

import travisCI_metamodel.Deploy;
import travisCI_metamodel.On;
import travisCI_metamodel.Script;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.DeployImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.DeployImpl#getApi_key <em>Api key</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.DeployImpl#isSkip_cleanup <em>Skip cleanup</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.DeployImpl#getOn <em>On</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.DeployImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeployImpl extends MinimalEObjectImpl.Container implements Deploy {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected String api_key = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkip_cleanup() <em>Skip cleanup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip_cleanup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_CLEANUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkip_cleanup() <em>Skip cleanup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkip_cleanup()
	 * @generated
	 * @ordered
	 */
	protected boolean skip_cleanup = SKIP_CLEANUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList<On> on;

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
	protected DeployImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravisCI_metamodelPackage.Literals.DEPLOY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.DEPLOY__PROVIDER,
					oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApi_key() {
		return api_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApi_key(String newApi_key) {
		String oldApi_key = api_key;
		api_key = newApi_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.DEPLOY__API_KEY, oldApi_key,
					api_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSkip_cleanup() {
		return skip_cleanup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkip_cleanup(boolean newSkip_cleanup) {
		boolean oldSkip_cleanup = skip_cleanup;
		skip_cleanup = newSkip_cleanup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.DEPLOY__SKIP_CLEANUP,
					oldSkip_cleanup, skip_cleanup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Script> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<Script>(Script.class, this, TravisCI_metamodelPackage.DEPLOY__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<On> getOn() {
		if (on == null) {
			on = new EObjectContainmentEList<On>(On.class, this, TravisCI_metamodelPackage.DEPLOY__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TravisCI_metamodelPackage.DEPLOY__ON:
			return ((InternalEList<?>) getOn()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.DEPLOY__SCRIPT:
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
		case TravisCI_metamodelPackage.DEPLOY__PROVIDER:
			return getProvider();
		case TravisCI_metamodelPackage.DEPLOY__API_KEY:
			return getApi_key();
		case TravisCI_metamodelPackage.DEPLOY__SKIP_CLEANUP:
			return isSkip_cleanup();
		case TravisCI_metamodelPackage.DEPLOY__ON:
			return getOn();
		case TravisCI_metamodelPackage.DEPLOY__SCRIPT:
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
		case TravisCI_metamodelPackage.DEPLOY__PROVIDER:
			setProvider((String) newValue);
			return;
		case TravisCI_metamodelPackage.DEPLOY__API_KEY:
			setApi_key((String) newValue);
			return;
		case TravisCI_metamodelPackage.DEPLOY__SKIP_CLEANUP:
			setSkip_cleanup((Boolean) newValue);
			return;
		case TravisCI_metamodelPackage.DEPLOY__ON:
			getOn().clear();
			getOn().addAll((Collection<? extends On>) newValue);
			return;
		case TravisCI_metamodelPackage.DEPLOY__SCRIPT:
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
		case TravisCI_metamodelPackage.DEPLOY__PROVIDER:
			setProvider(PROVIDER_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.DEPLOY__API_KEY:
			setApi_key(API_KEY_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.DEPLOY__SKIP_CLEANUP:
			setSkip_cleanup(SKIP_CLEANUP_EDEFAULT);
			return;
		case TravisCI_metamodelPackage.DEPLOY__ON:
			getOn().clear();
			return;
		case TravisCI_metamodelPackage.DEPLOY__SCRIPT:
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
		case TravisCI_metamodelPackage.DEPLOY__PROVIDER:
			return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
		case TravisCI_metamodelPackage.DEPLOY__API_KEY:
			return API_KEY_EDEFAULT == null ? api_key != null : !API_KEY_EDEFAULT.equals(api_key);
		case TravisCI_metamodelPackage.DEPLOY__SKIP_CLEANUP:
			return skip_cleanup != SKIP_CLEANUP_EDEFAULT;
		case TravisCI_metamodelPackage.DEPLOY__ON:
			return on != null && !on.isEmpty();
		case TravisCI_metamodelPackage.DEPLOY__SCRIPT:
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", api_key: ");
		result.append(api_key);
		result.append(", skip_cleanup: ");
		result.append(skip_cleanup);
		result.append(')');
		return result.toString();
	}

} //DeployImpl
