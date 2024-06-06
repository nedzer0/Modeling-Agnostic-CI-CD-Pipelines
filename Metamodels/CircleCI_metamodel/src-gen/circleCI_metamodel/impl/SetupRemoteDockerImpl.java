/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.SetupRemoteDocker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup Remote Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.SetupRemoteDockerImpl#isDocker_layer_caching <em>Docker layer caching</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.SetupRemoteDockerImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetupRemoteDockerImpl extends StepImpl implements SetupRemoteDocker {
	/**
	 * The default value of the '{@link #isDocker_layer_caching() <em>Docker layer caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDocker_layer_caching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOCKER_LAYER_CACHING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDocker_layer_caching() <em>Docker layer caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDocker_layer_caching()
	 * @generated
	 * @ordered
	 */
	protected boolean docker_layer_caching = DOCKER_LAYER_CACHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetupRemoteDockerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.SETUP_REMOTE_DOCKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDocker_layer_caching() {
		return docker_layer_caching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocker_layer_caching(boolean newDocker_layer_caching) {
		boolean oldDocker_layer_caching = docker_layer_caching;
		docker_layer_caching = newDocker_layer_caching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING, oldDocker_layer_caching,
					docker_layer_caching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING:
			return isDocker_layer_caching();
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__VERSION:
			return getVersion();
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
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING:
			setDocker_layer_caching((Boolean) newValue);
			return;
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__VERSION:
			setVersion((String) newValue);
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
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING:
			setDocker_layer_caching(DOCKER_LAYER_CACHING_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__VERSION:
			setVersion(VERSION_EDEFAULT);
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
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__DOCKER_LAYER_CACHING:
			return docker_layer_caching != DOCKER_LAYER_CACHING_EDEFAULT;
		case CircleCI_metamodelPackage.SETUP_REMOTE_DOCKER__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (docker_layer_caching: ");
		result.append(docker_layer_caching);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SetupRemoteDockerImpl
