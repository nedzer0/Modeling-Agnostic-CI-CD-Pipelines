/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Credentials;
import gHA_metamodel.Env;
import gHA_metamodel.GHA_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getCredential <em>Credential</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ContainerImpl#getEnvs <em>Envs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements gHA_metamodel.Container {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ports;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> volumes;

	/**
	 * The default value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected String options = OPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredential()
	 * @generated
	 * @ordered
	 */
	protected Credentials credential;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.CONTAINER__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPorts() {
		if (ports == null) {
			ports = new EDataTypeUniqueEList<String>(String.class, this, GHA_metamodelPackage.CONTAINER__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVolumes() {
		if (volumes == null) {
			volumes = new EDataTypeUniqueEList<String>(String.class, this, GHA_metamodelPackage.CONTAINER__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(String newOptions) {
		String oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.CONTAINER__OPTIONS, oldOptions,
					options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Credentials getCredential() {
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredential(Credentials newCredential, NotificationChain msgs) {
		Credentials oldCredential = credential;
		credential = newCredential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.CONTAINER__CREDENTIAL, oldCredential, newCredential);
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
	public void setCredential(Credentials newCredential) {
		if (newCredential != credential) {
			NotificationChain msgs = null;
			if (credential != null)
				msgs = ((InternalEObject) credential).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.CONTAINER__CREDENTIAL, null, msgs);
			if (newCredential != null)
				msgs = ((InternalEObject) newCredential).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.CONTAINER__CREDENTIAL, null, msgs);
			msgs = basicSetCredential(newCredential, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.CONTAINER__CREDENTIAL,
					newCredential, newCredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentEList<Env>(Env.class, this, GHA_metamodelPackage.CONTAINER__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.CONTAINER__CREDENTIAL:
			return basicSetCredential(null, msgs);
		case GHA_metamodelPackage.CONTAINER__ENVS:
			return ((InternalEList<?>) getEnvs()).basicRemove(otherEnd, msgs);
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
		case GHA_metamodelPackage.CONTAINER__IMAGE:
			return getImage();
		case GHA_metamodelPackage.CONTAINER__PORTS:
			return getPorts();
		case GHA_metamodelPackage.CONTAINER__VOLUMES:
			return getVolumes();
		case GHA_metamodelPackage.CONTAINER__OPTIONS:
			return getOptions();
		case GHA_metamodelPackage.CONTAINER__CREDENTIAL:
			return getCredential();
		case GHA_metamodelPackage.CONTAINER__ENVS:
			return getEnvs();
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
		case GHA_metamodelPackage.CONTAINER__IMAGE:
			setImage((String) newValue);
			return;
		case GHA_metamodelPackage.CONTAINER__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends String>) newValue);
			return;
		case GHA_metamodelPackage.CONTAINER__VOLUMES:
			getVolumes().clear();
			getVolumes().addAll((Collection<? extends String>) newValue);
			return;
		case GHA_metamodelPackage.CONTAINER__OPTIONS:
			setOptions((String) newValue);
			return;
		case GHA_metamodelPackage.CONTAINER__CREDENTIAL:
			setCredential((Credentials) newValue);
			return;
		case GHA_metamodelPackage.CONTAINER__ENVS:
			getEnvs().clear();
			getEnvs().addAll((Collection<? extends Env>) newValue);
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
		case GHA_metamodelPackage.CONTAINER__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case GHA_metamodelPackage.CONTAINER__PORTS:
			getPorts().clear();
			return;
		case GHA_metamodelPackage.CONTAINER__VOLUMES:
			getVolumes().clear();
			return;
		case GHA_metamodelPackage.CONTAINER__OPTIONS:
			setOptions(OPTIONS_EDEFAULT);
			return;
		case GHA_metamodelPackage.CONTAINER__CREDENTIAL:
			setCredential((Credentials) null);
			return;
		case GHA_metamodelPackage.CONTAINER__ENVS:
			getEnvs().clear();
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
		case GHA_metamodelPackage.CONTAINER__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case GHA_metamodelPackage.CONTAINER__PORTS:
			return ports != null && !ports.isEmpty();
		case GHA_metamodelPackage.CONTAINER__VOLUMES:
			return volumes != null && !volumes.isEmpty();
		case GHA_metamodelPackage.CONTAINER__OPTIONS:
			return OPTIONS_EDEFAULT == null ? options != null : !OPTIONS_EDEFAULT.equals(options);
		case GHA_metamodelPackage.CONTAINER__CREDENTIAL:
			return credential != null;
		case GHA_metamodelPackage.CONTAINER__ENVS:
			return envs != null && !envs.isEmpty();
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
		result.append(" (image: ");
		result.append(image);
		result.append(", ports: ");
		result.append(ports);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", options: ");
		result.append(options);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
