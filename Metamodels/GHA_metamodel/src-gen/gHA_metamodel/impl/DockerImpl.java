/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Docker;
import gHA_metamodel.Env;
import gHA_metamodel.GHA_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getPre_entrypoint <em>Pre entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getPost_entrypoint <em>Post entrypoint</em>}</li>
 *   <li>{@link gHA_metamodel.impl.DockerImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImpl extends ActionImpl implements Docker {
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
	 * The default value of the '{@link #getPre_entrypoint() <em>Pre entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre_entrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPre_entrypoint() <em>Pre entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre_entrypoint()
	 * @generated
	 * @ordered
	 */
	protected String pre_entrypoint = PRE_ENTRYPOINT_EDEFAULT;

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
	 * The default value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected String entrypoint = ENTRYPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPost_entrypoint() <em>Post entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost_entrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPost_entrypoint() <em>Post entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost_entrypoint()
	 * @generated
	 * @ordered
	 */
	protected String post_entrypoint = POST_ENTRYPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

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
		return GHA_metamodelPackage.Literals.DOCKER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.DOCKER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPre_entrypoint() {
		return pre_entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPre_entrypoint(String newPre_entrypoint) {
		String oldPre_entrypoint = pre_entrypoint;
		pre_entrypoint = newPre_entrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.DOCKER__PRE_ENTRYPOINT,
					oldPre_entrypoint, pre_entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentEList<Env>(Env.class, this, GHA_metamodelPackage.DOCKER__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntrypoint(String newEntrypoint) {
		String oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.DOCKER__ENTRYPOINT,
					oldEntrypoint, entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPost_entrypoint() {
		return post_entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPost_entrypoint(String newPost_entrypoint) {
		String oldPost_entrypoint = post_entrypoint;
		post_entrypoint = newPost_entrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.DOCKER__POST_ENTRYPOINT,
					oldPost_entrypoint, post_entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, GHA_metamodelPackage.DOCKER__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.DOCKER__ENVS:
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
		case GHA_metamodelPackage.DOCKER__IMAGE:
			return getImage();
		case GHA_metamodelPackage.DOCKER__PRE_ENTRYPOINT:
			return getPre_entrypoint();
		case GHA_metamodelPackage.DOCKER__ENVS:
			return getEnvs();
		case GHA_metamodelPackage.DOCKER__ENTRYPOINT:
			return getEntrypoint();
		case GHA_metamodelPackage.DOCKER__POST_ENTRYPOINT:
			return getPost_entrypoint();
		case GHA_metamodelPackage.DOCKER__ARGS:
			return getArgs();
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
		case GHA_metamodelPackage.DOCKER__IMAGE:
			setImage((String) newValue);
			return;
		case GHA_metamodelPackage.DOCKER__PRE_ENTRYPOINT:
			setPre_entrypoint((String) newValue);
			return;
		case GHA_metamodelPackage.DOCKER__ENVS:
			getEnvs().clear();
			getEnvs().addAll((Collection<? extends Env>) newValue);
			return;
		case GHA_metamodelPackage.DOCKER__ENTRYPOINT:
			setEntrypoint((String) newValue);
			return;
		case GHA_metamodelPackage.DOCKER__POST_ENTRYPOINT:
			setPost_entrypoint((String) newValue);
			return;
		case GHA_metamodelPackage.DOCKER__ARGS:
			getArgs().clear();
			getArgs().addAll((Collection<? extends String>) newValue);
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
		case GHA_metamodelPackage.DOCKER__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case GHA_metamodelPackage.DOCKER__PRE_ENTRYPOINT:
			setPre_entrypoint(PRE_ENTRYPOINT_EDEFAULT);
			return;
		case GHA_metamodelPackage.DOCKER__ENVS:
			getEnvs().clear();
			return;
		case GHA_metamodelPackage.DOCKER__ENTRYPOINT:
			setEntrypoint(ENTRYPOINT_EDEFAULT);
			return;
		case GHA_metamodelPackage.DOCKER__POST_ENTRYPOINT:
			setPost_entrypoint(POST_ENTRYPOINT_EDEFAULT);
			return;
		case GHA_metamodelPackage.DOCKER__ARGS:
			getArgs().clear();
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
		case GHA_metamodelPackage.DOCKER__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case GHA_metamodelPackage.DOCKER__PRE_ENTRYPOINT:
			return PRE_ENTRYPOINT_EDEFAULT == null ? pre_entrypoint != null
					: !PRE_ENTRYPOINT_EDEFAULT.equals(pre_entrypoint);
		case GHA_metamodelPackage.DOCKER__ENVS:
			return envs != null && !envs.isEmpty();
		case GHA_metamodelPackage.DOCKER__ENTRYPOINT:
			return ENTRYPOINT_EDEFAULT == null ? entrypoint != null : !ENTRYPOINT_EDEFAULT.equals(entrypoint);
		case GHA_metamodelPackage.DOCKER__POST_ENTRYPOINT:
			return POST_ENTRYPOINT_EDEFAULT == null ? post_entrypoint != null
					: !POST_ENTRYPOINT_EDEFAULT.equals(post_entrypoint);
		case GHA_metamodelPackage.DOCKER__ARGS:
			return args != null && !args.isEmpty();
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
		result.append(", pre_entrypoint: ");
		result.append(pre_entrypoint);
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", post_entrypoint: ");
		result.append(post_entrypoint);
		result.append(", args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //DockerImpl
