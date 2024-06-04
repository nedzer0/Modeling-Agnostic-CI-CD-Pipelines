/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.solver.ResourceAllocationDifficultyComparator;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.ResourceAllocation#getWork <em>Work</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ResourceAllocation#getResource <em>Resource</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ResourceAllocation#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getResourceAllocation()
 * @model
 * @generated
 */
@PlanningEntity(difficultyComparatorClass = ResourceAllocationDifficultyComparator.class)
public interface ResourceAllocation extends EObject {
	/**
   * Returns the value of the '<em><b>Work</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Work</em>' reference.
   * @see #setWork(ActivityWork)
   * @see org.gemoc.agro.simulation.SimulationPackage#getResourceAllocation_Work()
   * @model required="true"
   * @generated
   */
	ActivityWork getWork();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ResourceAllocation#getWork <em>Work</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work</em>' reference.
   * @see #getWork()
   * @generated
   */
	void setWork(ActivityWork value);

	/**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see org.gemoc.agro.simulation.SimulationPackage#getResourceAllocation_Resource()
   * @model required="true"
   * @generated
   */
	@PlanningVariable(valueRangeProviderRefs = {"resources"})
	Resource getResource();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ResourceAllocation#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
	void setResource(Resource value);

	/**
   * Returns the value of the '<em><b>Kind</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' reference.
   * @see #setKind(ResourceKind)
   * @see org.gemoc.agro.simulation.SimulationPackage#getResourceAllocation_Kind()
   * @model required="true"
   * @generated
   */
	ResourceKind getKind();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ResourceAllocation#getKind <em>Kind</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' reference.
   * @see #getKind()
   * @generated
   */
	void setKind(ResourceKind value);

} // ResourceAllocation
