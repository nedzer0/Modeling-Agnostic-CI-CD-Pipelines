/**
 */
package org.gemoc.agro.scientific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.scientific.BiomassModel;
import org.gemoc.agro.scientific.ScientificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biomass Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getEb <em>Eb</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getEimax <em>Eimax</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getK <em>K</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getLmax <em>Lmax</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getTI <em>TI</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getA <em>A</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getB <em>B</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.BiomassModelImpl#getCulture <em>Culture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BiomassModelImpl extends MinimalEObjectImpl.Container implements BiomassModel {
	/**
	 * The default value of the '{@link #getEb() <em>Eb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEb()
	 * @generated
	 * @ordered
	 */
	protected static final float EB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEb() <em>Eb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEb()
	 * @generated
	 * @ordered
	 */
	protected float eb = EB_EDEFAULT;

	/**
	 * The default value of the '{@link #getEimax() <em>Eimax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEimax()
	 * @generated
	 * @ordered
	 */
	protected static final float EIMAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEimax() <em>Eimax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEimax()
	 * @generated
	 * @ordered
	 */
	protected float eimax = EIMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final float K_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected float k = K_EDEFAULT;

	/**
	 * The default value of the '{@link #getLmax() <em>Lmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLmax()
	 * @generated
	 * @ordered
	 */
	protected static final float LMAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLmax() <em>Lmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLmax()
	 * @generated
	 * @ordered
	 */
	protected float lmax = LMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTI() <em>TI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTI()
	 * @generated
	 * @ordered
	 */
	protected static final float TI_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTI() <em>TI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTI()
	 * @generated
	 * @ordered
	 */
	protected float ti = TI_EDEFAULT;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final float A_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected float a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCulture() <em>Culture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulture()
	 * @generated
	 * @ordered
	 */
	protected Culture culture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiomassModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScientificPackage.Literals.BIOMASS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEb() {
		return eb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEb(float newEb) {
		float oldEb = eb;
		eb = newEb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__EB, oldEb, eb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEimax() {
		return eimax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEimax(float newEimax) {
		float oldEimax = eimax;
		eimax = newEimax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__EIMAX, oldEimax, eimax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK(float newK) {
		float oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLmax() {
		return lmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLmax(float newLmax) {
		float oldLmax = lmax;
		lmax = newLmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__LMAX, oldLmax, lmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTI() {
		return ti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTI(float newTI) {
		float oldTI = ti;
		ti = newTI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__TI, oldTI, ti));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(float newA) {
		float oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(float newB) {
		float oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Culture getCulture() {
		if (culture != null && culture.eIsProxy()) {
			InternalEObject oldCulture = (InternalEObject)culture;
			culture = (Culture)eResolveProxy(oldCulture);
			if (culture != oldCulture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScientificPackage.BIOMASS_MODEL__CULTURE, oldCulture, culture));
			}
		}
		return culture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Culture basicGetCulture() {
		return culture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCulture(Culture newCulture) {
		Culture oldCulture = culture;
		culture = newCulture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.BIOMASS_MODEL__CULTURE, oldCulture, culture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScientificPackage.BIOMASS_MODEL__EB:
				return getEb();
			case ScientificPackage.BIOMASS_MODEL__EIMAX:
				return getEimax();
			case ScientificPackage.BIOMASS_MODEL__K:
				return getK();
			case ScientificPackage.BIOMASS_MODEL__LMAX:
				return getLmax();
			case ScientificPackage.BIOMASS_MODEL__TI:
				return getTI();
			case ScientificPackage.BIOMASS_MODEL__A:
				return getA();
			case ScientificPackage.BIOMASS_MODEL__B:
				return getB();
			case ScientificPackage.BIOMASS_MODEL__CULTURE:
				if (resolve) return getCulture();
				return basicGetCulture();
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
			case ScientificPackage.BIOMASS_MODEL__EB:
				setEb((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__EIMAX:
				setEimax((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__K:
				setK((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__LMAX:
				setLmax((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__TI:
				setTI((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__A:
				setA((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__B:
				setB((Float)newValue);
				return;
			case ScientificPackage.BIOMASS_MODEL__CULTURE:
				setCulture((Culture)newValue);
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
			case ScientificPackage.BIOMASS_MODEL__EB:
				setEb(EB_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__EIMAX:
				setEimax(EIMAX_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__K:
				setK(K_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__LMAX:
				setLmax(LMAX_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__TI:
				setTI(TI_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__A:
				setA(A_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__B:
				setB(B_EDEFAULT);
				return;
			case ScientificPackage.BIOMASS_MODEL__CULTURE:
				setCulture((Culture)null);
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
			case ScientificPackage.BIOMASS_MODEL__EB:
				return eb != EB_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__EIMAX:
				return eimax != EIMAX_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__K:
				return k != K_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__LMAX:
				return lmax != LMAX_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__TI:
				return ti != TI_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__A:
				return a != A_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__B:
				return b != B_EDEFAULT;
			case ScientificPackage.BIOMASS_MODEL__CULTURE:
				return culture != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Eb: ");
		result.append(eb);
		result.append(", Eimax: ");
		result.append(eimax);
		result.append(", K: ");
		result.append(k);
		result.append(", Lmax: ");
		result.append(lmax);
		result.append(", TI: ");
		result.append(ti);
		result.append(", A: ");
		result.append(a);
		result.append(", B: ");
		result.append(b);
		result.append(')');
		return result.toString();
	}

} //BiomassModelImpl
