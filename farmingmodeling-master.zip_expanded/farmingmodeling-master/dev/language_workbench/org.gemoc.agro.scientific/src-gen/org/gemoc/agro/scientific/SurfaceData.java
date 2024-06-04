/**
 */
package org.gemoc.agro.scientific;

import java.math.BigDecimal;
import org.eclipse.emf.ecore.EObject;

import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.Day;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getBiomass <em>Biomass</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getLAI <em>LAI</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getHydroDeficit <em>Hydro Deficit</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getExtraWater <em>Extra Water</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData()
 * @model
 * @generated
 */
public interface SurfaceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Biomass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biomass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biomass</em>' attribute.
	 * @see #setBiomass(BigDecimal)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_Biomass()
	 * @model
	 * @generated
	 */
	BigDecimal getBiomass();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getBiomass <em>Biomass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biomass</em>' attribute.
	 * @see #getBiomass()
	 * @generated
	 */
	void setBiomass(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>LAI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAI</em>' attribute.
	 * @see #setLAI(BigDecimal)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_LAI()
	 * @model
	 * @generated
	 */
	BigDecimal getLAI();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getLAI <em>LAI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAI</em>' attribute.
	 * @see #getLAI()
	 * @generated
	 */
	void setLAI(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Hydro Deficit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Deficit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Deficit</em>' attribute.
	 * @see #setHydroDeficit(double)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_HydroDeficit()
	 * @model
	 * @generated
	 */
	double getHydroDeficit();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getHydroDeficit <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Deficit</em>' attribute.
	 * @see #getHydroDeficit()
	 * @generated
	 */
	void setHydroDeficit(double value);

	/**
	 * Returns the value of the '<em><b>Extra Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Water</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Water</em>' attribute.
	 * @see #setExtraWater(double)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_ExtraWater()
	 * @model
	 * @generated
	 */
	double getExtraWater();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getExtraWater <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Water</em>' attribute.
	 * @see #getExtraWater()
	 * @generated
	 */
	void setExtraWater(double value);

	/**
	 * Returns the value of the '<em><b>Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' reference.
	 * @see #setSurface(Surface)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_Surface()
	 * @model
	 * @generated
	 */
	Surface getSurface();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getSurface <em>Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' reference.
	 * @see #getSurface()
	 * @generated
	 */
	void setSurface(Surface value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' reference.
	 * @see #setDay(Day)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_Day()
	 * @model
	 * @generated
	 */
	Day getDay();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getDay <em>Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Day value);

} // SurfaceData
