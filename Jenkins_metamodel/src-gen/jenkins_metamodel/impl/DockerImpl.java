/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Docker;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.DockerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerImpl#getRegistryUrl <em>Registry Url</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerImpl#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImpl extends AgentImpl implements Docker {
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
	 * The default value of the '{@link #getRegistryUrl() <em>Registry Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryUrl() <em>Registry Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryUrl()
	 * @generated
	 * @ordered
	 */
	protected String registryUrl = REGISTRY_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_CREDENTIALS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected String registryCredentialsId = REGISTRY_CREDENTIALS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.DOCKER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKER__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryUrl() {
		return registryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryUrl(String newRegistryUrl) {
		String oldRegistryUrl = registryUrl;
		registryUrl = newRegistryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKER__REGISTRY_URL,
					oldRegistryUrl, registryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryCredentialsId() {
		return registryCredentialsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryCredentialsId(String newRegistryCredentialsId) {
		String oldRegistryCredentialsId = registryCredentialsId;
		registryCredentialsId = newRegistryCredentialsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.DOCKER__REGISTRY_CREDENTIALS_ID, oldRegistryCredentialsId,
					registryCredentialsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.DOCKER__IMAGE:
			return getImage();
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_URL:
			return getRegistryUrl();
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_CREDENTIALS_ID:
			return getRegistryCredentialsId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Jenkins_metamodelPackage.DOCKER__IMAGE:
			setImage((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_URL:
			setRegistryUrl((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId((String) newValue);
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
		case Jenkins_metamodelPackage.DOCKER__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_URL:
			setRegistryUrl(REGISTRY_URL_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId(REGISTRY_CREDENTIALS_ID_EDEFAULT);
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
		case Jenkins_metamodelPackage.DOCKER__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_URL:
			return REGISTRY_URL_EDEFAULT == null ? registryUrl != null : !REGISTRY_URL_EDEFAULT.equals(registryUrl);
		case Jenkins_metamodelPackage.DOCKER__REGISTRY_CREDENTIALS_ID:
			return REGISTRY_CREDENTIALS_ID_EDEFAULT == null ? registryCredentialsId != null
					: !REGISTRY_CREDENTIALS_ID_EDEFAULT.equals(registryCredentialsId);
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
		result.append(", registryUrl: ");
		result.append(registryUrl);
		result.append(", registryCredentialsId: ");
		result.append(registryCredentialsId);
		result.append(')');
		return result.toString();
	}

} //DockerImpl
