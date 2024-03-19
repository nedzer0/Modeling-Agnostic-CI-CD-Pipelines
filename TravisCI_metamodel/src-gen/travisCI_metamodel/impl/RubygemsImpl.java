/**
 */
package travisCI_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import travisCI_metamodel.Rubygems;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rubygems</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.RubygemsImpl#getGem <em>Gem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RubygemsImpl extends DeployImpl implements Rubygems {
	/**
	 * The default value of the '{@link #getGem() <em>Gem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGem()
	 * @generated
	 * @ordered
	 */
	protected static final String GEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGem() <em>Gem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGem()
	 * @generated
	 * @ordered
	 */
	protected String gem = GEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RubygemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravisCI_metamodelPackage.Literals.RUBYGEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGem() {
		return gem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGem(String newGem) {
		String oldGem = gem;
		gem = newGem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.RUBYGEMS__GEM, oldGem,
					gem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TravisCI_metamodelPackage.RUBYGEMS__GEM:
			return getGem();
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
		case TravisCI_metamodelPackage.RUBYGEMS__GEM:
			setGem((String) newValue);
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
		case TravisCI_metamodelPackage.RUBYGEMS__GEM:
			setGem(GEM_EDEFAULT);
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
		case TravisCI_metamodelPackage.RUBYGEMS__GEM:
			return GEM_EDEFAULT == null ? gem != null : !GEM_EDEFAULT.equals(gem);
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
		result.append(" (gem: ");
		result.append(gem);
		result.append(')');
		return result.toString();
	}

} //RubygemsImpl
