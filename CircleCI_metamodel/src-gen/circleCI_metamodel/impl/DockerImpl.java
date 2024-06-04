/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Docker;
import circleCI_metamodel.Docker_Auth;
import circleCI_metamodel.Docker_Aws_Auths;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getDocker_auth <em>Docker auth</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getDocker_aws_auth <em>Docker aws auth</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.DockerImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImpl extends ExecutorImpl implements Docker {
	/**
	 * The cached value of the '{@link #getDocker_auth() <em>Docker auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_auth()
	 * @generated
	 * @ordered
	 */
	protected Docker_Auth docker_auth;

	/**
	 * The cached value of the '{@link #getDocker_aws_auth() <em>Docker aws auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_aws_auth()
	 * @generated
	 * @ordered
	 */
	protected Docker_Aws_Auths docker_aws_auth;

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
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entrypoint;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> command;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

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
		return CircleCI_metamodelPackage.Literals.DOCKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Docker_Auth getDocker_auth() {
		return docker_auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocker_auth(Docker_Auth newDocker_auth, NotificationChain msgs) {
		Docker_Auth oldDocker_auth = docker_auth;
		docker_auth = newDocker_auth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH, oldDocker_auth, newDocker_auth);
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
	public void setDocker_auth(Docker_Auth newDocker_auth) {
		if (newDocker_auth != docker_auth) {
			NotificationChain msgs = null;
			if (docker_auth != null)
				msgs = ((InternalEObject) docker_auth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH, null, msgs);
			if (newDocker_auth != null)
				msgs = ((InternalEObject) newDocker_auth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH, null, msgs);
			msgs = basicSetDocker_auth(newDocker_auth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH,
					newDocker_auth, newDocker_auth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Docker_Aws_Auths getDocker_aws_auth() {
		return docker_aws_auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocker_aws_auth(Docker_Aws_Auths newDocker_aws_auth, NotificationChain msgs) {
		Docker_Aws_Auths oldDocker_aws_auth = docker_aws_auth;
		docker_aws_auth = newDocker_aws_auth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH, oldDocker_aws_auth, newDocker_aws_auth);
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
	public void setDocker_aws_auth(Docker_Aws_Auths newDocker_aws_auth) {
		if (newDocker_aws_auth != docker_aws_auth) {
			NotificationChain msgs = null;
			if (docker_aws_auth != null)
				msgs = ((InternalEObject) docker_aws_auth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH, null, msgs);
			if (newDocker_aws_auth != null)
				msgs = ((InternalEObject) newDocker_aws_auth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH, null, msgs);
			msgs = basicSetDocker_aws_auth(newDocker_aws_auth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH,
					newDocker_aws_auth, newDocker_aws_auth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.DOCKER__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEntrypoint() {
		if (entrypoint == null) {
			entrypoint = new EDataTypeUniqueEList<String>(String.class, this,
					CircleCI_metamodelPackage.DOCKER__ENTRYPOINT);
		}
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommand() {
		if (command == null) {
			command = new EDataTypeUniqueEList<String>(String.class, this, CircleCI_metamodelPackage.DOCKER__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.DOCKER__USER, oldUser,
					user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH:
			return basicSetDocker_auth(null, msgs);
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH:
			return basicSetDocker_aws_auth(null, msgs);
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
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH:
			return getDocker_auth();
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH:
			return getDocker_aws_auth();
		case CircleCI_metamodelPackage.DOCKER__IMAGE:
			return getImage();
		case CircleCI_metamodelPackage.DOCKER__ENTRYPOINT:
			return getEntrypoint();
		case CircleCI_metamodelPackage.DOCKER__COMMAND:
			return getCommand();
		case CircleCI_metamodelPackage.DOCKER__USER:
			return getUser();
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
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH:
			setDocker_auth((Docker_Auth) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH:
			setDocker_aws_auth((Docker_Aws_Auths) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER__IMAGE:
			setImage((String) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER__ENTRYPOINT:
			getEntrypoint().clear();
			getEntrypoint().addAll((Collection<? extends String>) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends String>) newValue);
			return;
		case CircleCI_metamodelPackage.DOCKER__USER:
			setUser((String) newValue);
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
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH:
			setDocker_auth((Docker_Auth) null);
			return;
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH:
			setDocker_aws_auth((Docker_Aws_Auths) null);
			return;
		case CircleCI_metamodelPackage.DOCKER__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.DOCKER__ENTRYPOINT:
			getEntrypoint().clear();
			return;
		case CircleCI_metamodelPackage.DOCKER__COMMAND:
			getCommand().clear();
			return;
		case CircleCI_metamodelPackage.DOCKER__USER:
			setUser(USER_EDEFAULT);
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
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AUTH:
			return docker_auth != null;
		case CircleCI_metamodelPackage.DOCKER__DOCKER_AWS_AUTH:
			return docker_aws_auth != null;
		case CircleCI_metamodelPackage.DOCKER__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case CircleCI_metamodelPackage.DOCKER__ENTRYPOINT:
			return entrypoint != null && !entrypoint.isEmpty();
		case CircleCI_metamodelPackage.DOCKER__COMMAND:
			return command != null && !command.isEmpty();
		case CircleCI_metamodelPackage.DOCKER__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", command: ");
		result.append(command);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //DockerImpl
