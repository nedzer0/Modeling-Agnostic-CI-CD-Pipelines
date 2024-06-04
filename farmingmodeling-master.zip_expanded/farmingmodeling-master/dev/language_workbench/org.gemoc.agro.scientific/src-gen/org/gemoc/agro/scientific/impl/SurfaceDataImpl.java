/**
 */
package org.gemoc.agro.scientific.impl;

import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.agro.exploitation.Surface;

import org.gemoc.agro.scientific.ScientificPackage;
import org.gemoc.agro.scientific.SurfaceData;
import org.gemoc.agro.simulation.Day;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getBiomass <em>Biomass</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getLAI <em>LAI</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getHydroDeficit <em>Hydro Deficit</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getExtraWater <em>Extra Water</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceDataImpl extends MinimalEObjectImpl.Container implements SurfaceData {
	/**
	 * The default value of the '{@link #getBiomass() <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiomass()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIOMASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBiomass() <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiomass()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal biomass = BIOMASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLAI() <em>LAI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAI()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LAI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLAI() <em>LAI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAI()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lai = LAI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHydroDeficit() <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroDeficit()
	 * @generated
	 * @ordered
	 */
	protected static final double HYDRO_DEFICIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHydroDeficit() <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroDeficit()
	 * @generated
	 * @ordered
	 */
	protected double hydroDeficit = HYDRO_DEFICIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraWater() <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWater()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTRA_WATER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtraWater() <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWater()
	 * @generated
	 * @ordered
	 */
	protected double extraWater = EXTRA_WATER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurface() <em>Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected Surface surface;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Day day;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScientificPackage.Literals.SURFACE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBiomass() {
		return biomass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiomass(BigDecimal newBiomass) {
		BigDecimal oldBiomass = biomass;
		biomass = newBiomass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__BIOMASS, oldBiomass, biomass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLAI() {
		return lai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLAI(BigDecimal newLAI) {
		BigDecimal oldLAI = lai;
		lai = newLAI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__LAI, oldLAI, lai));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHydroDeficit() {
		return hydroDeficit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroDeficit(double newHydroDeficit) {
		double oldHydroDeficit = hydroDeficit;
		hydroDeficit = newHydroDeficit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT, oldHydroDeficit, hydroDeficit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtraWater() {
		return extraWater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraWater(double newExtraWater) {
		double oldExtraWater = extraWater;
		extraWater = newExtraWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__EXTRA_WATER, oldExtraWater, extraWater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface getSurface() {
		if (surface != null && surface.eIsProxy()) {
			InternalEObject oldSurface = (InternalEObject)surface;
			surface = (Surface)eResolveProxy(oldSurface);
			if (surface != oldSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScientificPackage.SURFACE_DATA__SURFACE, oldSurface, surface));
			}
		}
		return surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface basicGetSurface() {
		return surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurface(Surface newSurface) {
		Surface oldSurface = surface;
		surface = newSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__SURFACE, oldSurface, surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day getDay() {
		if (day != null && day.eIsProxy()) {
			InternalEObject oldDay = (InternalEObject)day;
			day = (Day)eResolveProxy(oldDay);
			if (day != oldDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScientificPackage.SURFACE_DATA__DAY, oldDay, day));
			}
		}
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day basicGetDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(Day newDay) {
		Day oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScientificPackage.SURFACE_DATA__BIOMASS:
				return getBiomass();
			case ScientificPackage.SURFACE_DATA__LAI:
				return getLAI();
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				return getHydroDeficit();
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				return getExtraWater();
			case ScientificPackage.SURFACE_DATA__SURFACE:
				if (resolve) return getSurface();
				return basicGetSurface();
			case ScientificPackage.SURFACE_DATA__DAY:
				if (resolve) return getDay();
				return basicGetDay();
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
			case ScientificPackage.SURFACE_DATA__BIOMASS:
				setBiomass((BigDecimal)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__LAI:
				setLAI((BigDecimal)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				setHydroDeficit((Double)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				setExtraWater((Double)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				setSurface((Surface)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__DAY:
				setDay((Day)newValue);
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
			case ScientificPackage.SURFACE_DATA__BIOMASS:
				setBiomass(BIOMASS_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__LAI:
				setLAI(LAI_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				setHydroDeficit(HYDRO_DEFICIT_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				setExtraWater(EXTRA_WATER_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				setSurface((Surface)null);
				return;
			case ScientificPackage.SURFACE_DATA__DAY:
				setDay((Day)null);
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
			case ScientificPackage.SURFACE_DATA__BIOMASS:
				return BIOMASS_EDEFAULT == null ? biomass != null : !BIOMASS_EDEFAULT.equals(biomass);
			case ScientificPackage.SURFACE_DATA__LAI:
				return LAI_EDEFAULT == null ? lai != null : !LAI_EDEFAULT.equals(lai);
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				return hydroDeficit != HYDRO_DEFICIT_EDEFAULT;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				return extraWater != EXTRA_WATER_EDEFAULT;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				return surface != null;
			case ScientificPackage.SURFACE_DATA__DAY:
				return day != null;
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
		result.append(" (biomass: ");
		result.append(biomass);
		result.append(", LAI: ");
		result.append(lai);
		result.append(", hydroDeficit: ");
		result.append(hydroDeficit);
		result.append(", extraWater: ");
		result.append(extraWater);
		result.append(')');
		return result.toString();
	}

} //SurfaceDataImpl
