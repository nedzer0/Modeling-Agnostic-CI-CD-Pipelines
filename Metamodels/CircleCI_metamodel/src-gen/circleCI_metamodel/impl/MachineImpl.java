/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.MACHINE_RESOURCE_TYPE;
import circleCI_metamodel.Machine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.MachineImpl#getImage <em>Image</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.MachineImpl#isDocker_layer_caching <em>Docker layer caching</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.MachineImpl#getResourceClass <em>Resource Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends ExecutorImpl implements Machine {
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
	 * The default value of the '{@link #getResourceClass() <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClass()
	 * @generated
	 * @ordered
	 */
	protected static final MACHINE_RESOURCE_TYPE RESOURCE_CLASS_EDEFAULT = MACHINE_RESOURCE_TYPE.MEDIUM;

	/**
	 * The cached value of the '{@link #getResourceClass() <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClass()
	 * @generated
	 * @ordered
	 */
	protected MACHINE_RESOURCE_TYPE resourceClass = RESOURCE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.MACHINE__IMAGE, oldImage,
					image));
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
					CircleCI_metamodelPackage.MACHINE__DOCKER_LAYER_CACHING, oldDocker_layer_caching,
					docker_layer_caching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MACHINE_RESOURCE_TYPE getResourceClass() {
		return resourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceClass(MACHINE_RESOURCE_TYPE newResourceClass) {
		MACHINE_RESOURCE_TYPE oldResourceClass = resourceClass;
		resourceClass = newResourceClass == null ? RESOURCE_CLASS_EDEFAULT : newResourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.MACHINE__RESOURCE_CLASS,
					oldResourceClass, resourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCI_metamodelPackage.MACHINE__IMAGE:
			return getImage();
		case CircleCI_metamodelPackage.MACHINE__DOCKER_LAYER_CACHING:
			return isDocker_layer_caching();
		case CircleCI_metamodelPackage.MACHINE__RESOURCE_CLASS:
			return getResourceClass();
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
		case CircleCI_metamodelPackage.MACHINE__IMAGE:
			setImage((String) newValue);
			return;
		case CircleCI_metamodelPackage.MACHINE__DOCKER_LAYER_CACHING:
			setDocker_layer_caching((Boolean) newValue);
			return;
		case CircleCI_metamodelPackage.MACHINE__RESOURCE_CLASS:
			setResourceClass((MACHINE_RESOURCE_TYPE) newValue);
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
		case CircleCI_metamodelPackage.MACHINE__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.MACHINE__DOCKER_LAYER_CACHING:
			setDocker_layer_caching(DOCKER_LAYER_CACHING_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.MACHINE__RESOURCE_CLASS:
			setResourceClass(RESOURCE_CLASS_EDEFAULT);
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
		case CircleCI_metamodelPackage.MACHINE__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case CircleCI_metamodelPackage.MACHINE__DOCKER_LAYER_CACHING:
			return docker_layer_caching != DOCKER_LAYER_CACHING_EDEFAULT;
		case CircleCI_metamodelPackage.MACHINE__RESOURCE_CLASS:
			return resourceClass != RESOURCE_CLASS_EDEFAULT;
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
		result.append(", docker_layer_caching: ");
		result.append(docker_layer_caching);
		result.append(", resourceClass: ");
		result.append(resourceClass);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
