/**
 */
package jenkins_metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.ChoiceParam#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChoiceParam()
 * @model
 * @generated
 */
public interface ChoiceParam extends Parameter_Directive {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' attribute list.
	 * @see jenkins_metamodel.Jenkins_metamodelPackage#getChoiceParam_Choices()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getChoices();

} // ChoiceParam
