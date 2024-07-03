/**
 */
package circleCI_metamodel.impl;

import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.MACOS_RESOURCE_TYPE;
import circleCI_metamodel.MacOs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mac Os</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circleCI_metamodel.impl.MacOsImpl#getXcode <em>Xcode</em>}</li>
 *   <li>{@link circleCI_metamodel.impl.MacOsImpl#getResourceClass <em>Resource Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacOsImpl extends ExecutorImpl implements MacOs {
	/**
	 * The default value of the '{@link #getXcode() <em>Xcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcode()
	 * @generated
	 * @ordered
	 */
	protected static final String XCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXcode() <em>Xcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXcode()
	 * @generated
	 * @ordered
	 */
	protected String xcode = XCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceClass() <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClass()
	 * @generated
	 * @ordered
	 */
	protected static final MACOS_RESOURCE_TYPE RESOURCE_CLASS_EDEFAULT = MACOS_RESOURCE_TYPE.MACOS_X86_MEDIUM_GEN2;

	/**
	 * The cached value of the '{@link #getResourceClass() <em>Resource Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClass()
	 * @generated
	 * @ordered
	 */
	protected MACOS_RESOURCE_TYPE resourceClass = RESOURCE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacOsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCI_metamodelPackage.Literals.MAC_OS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXcode() {
		return xcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXcode(String newXcode) {
		String oldXcode = xcode;
		xcode = newXcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.MAC_OS__XCODE, oldXcode,
					xcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MACOS_RESOURCE_TYPE getResourceClass() {
		return resourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceClass(MACOS_RESOURCE_TYPE newResourceClass) {
		MACOS_RESOURCE_TYPE oldResourceClass = resourceClass;
		resourceClass = newResourceClass == null ? RESOURCE_CLASS_EDEFAULT : newResourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCI_metamodelPackage.MAC_OS__RESOURCE_CLASS,
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
		case CircleCI_metamodelPackage.MAC_OS__XCODE:
			return getXcode();
		case CircleCI_metamodelPackage.MAC_OS__RESOURCE_CLASS:
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
		case CircleCI_metamodelPackage.MAC_OS__XCODE:
			setXcode((String) newValue);
			return;
		case CircleCI_metamodelPackage.MAC_OS__RESOURCE_CLASS:
			setResourceClass((MACOS_RESOURCE_TYPE) newValue);
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
		case CircleCI_metamodelPackage.MAC_OS__XCODE:
			setXcode(XCODE_EDEFAULT);
			return;
		case CircleCI_metamodelPackage.MAC_OS__RESOURCE_CLASS:
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
		case CircleCI_metamodelPackage.MAC_OS__XCODE:
			return XCODE_EDEFAULT == null ? xcode != null : !XCODE_EDEFAULT.equals(xcode);
		case CircleCI_metamodelPackage.MAC_OS__RESOURCE_CLASS:
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
		result.append(" (xcode: ");
		result.append(xcode);
		result.append(", resourceClass: ");
		result.append(resourceClass);
		result.append(')');
		return result.toString();
	}

} //MacOsImpl
