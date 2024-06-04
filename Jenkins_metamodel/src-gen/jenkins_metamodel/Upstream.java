/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.Upstream#getJobs <em>Jobs</em>}</li>
 *   <li>{@link jenkins_metamodel.Upstream#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getUpstream()
 * @model
 * @generated
 */
public interface Upstream extends Trigger {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' attribute list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getUpstream_Jobs()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getJobs();

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(String)
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getUpstream_Threshold()
	 * @model required="true"
	 * @generated
	 */
	String getThreshold();

	/**
	 * Sets the value of the '{@link jenkins_metamodel.Upstream#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(String value);

} // Upstream
