/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.solver.ActivityWorkDifficultyComparator;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getOnSurface <em>On Surface</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getSchedulingFeedback <em>Scheduling Feedback</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork()
 * @model
 * @generated
 */
@PlanningEntity(difficultyComparatorClass = ActivityWorkDifficultyComparator.class)
public interface ActivityWork extends EObject {
	/**
   * Returns the value of the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' reference.
   * @see #setActivity(ExploitationActivity)
   * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_Activity()
   * @model required="true"
   * @generated
   */
	ExploitationActivity getActivity();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' reference.
   * @see #getActivity()
   * @generated
   */
	void setActivity(ExploitationActivity value);

	/**
   * Returns the value of the '<em><b>Scheduled On</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduled On</em>' reference.
   * @see #setScheduledOn(Day)
   * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_ScheduledOn()
   * @model
   * @generated
   */
	@PlanningVariable(valueRangeProviderRefs = {"days"})
	Day getScheduledOn();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getScheduledOn <em>Scheduled On</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduled On</em>' reference.
   * @see #getScheduledOn()
   * @generated
   */
	void setScheduledOn(Day value);

	/**
   * Returns the value of the '<em><b>On Surface</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>On Surface</em>' reference.
   * @see #setOnSurface(Surface)
   * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_OnSurface()
   * @model
   * @generated
   */
	Surface getOnSurface();

	/**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getOnSurface <em>On Surface</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Surface</em>' reference.
   * @see #getOnSurface()
   * @generated
   */
	void setOnSurface(Surface value);

	/**
   * Returns the value of the '<em><b>Scheduling Feedback</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.agro.simulation.SchedulingFeedback}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Feedback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduling Feedback</em>' containment reference list.
   * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_SchedulingFeedback()
   * @model containment="true"
   * @generated
   */
	EList<SchedulingFeedback> getSchedulingFeedback();

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_Duration()
   * @model default="1"
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

} // ActivityWork
