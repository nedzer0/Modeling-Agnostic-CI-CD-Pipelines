/**
 */
package jenkins_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TOOL TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTOOL_TYPE()
 * @model
 * @generated
 */
public enum TOOL_TYPE implements Enumerator {
	/**
	 * The '<em><b>Maven</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN_VALUE
	 * @generated
	 * @ordered
	 */
	MAVEN(1, "maven", "maven"),

	/**
	 * The '<em><b>Jdk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDK_VALUE
	 * @generated
	 * @ordered
	 */
	JDK(0, "jdk", "jdk"),

	/**
	 * The '<em><b>Gradle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADLE_VALUE
	 * @generated
	 * @ordered
	 */
	GRADLE(0, "gradle", "gradle");

	/**
	 * The '<em><b>Maven</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN
	 * @model name="maven"
	 * @generated
	 * @ordered
	 */
	public static final int MAVEN_VALUE = 1;

	/**
	 * The '<em><b>Jdk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDK
	 * @model name="jdk"
	 * @generated
	 * @ordered
	 */
	public static final int JDK_VALUE = 0;

	/**
	 * The '<em><b>Gradle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADLE
	 * @model name="gradle"
	 * @generated
	 * @ordered
	 */
	public static final int GRADLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>TOOL TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TOOL_TYPE[] VALUES_ARRAY = new TOOL_TYPE[] { MAVEN, JDK, GRADLE, };

	/**
	 * A public read-only list of all the '<em><b>TOOL TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TOOL_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TOOL TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TOOL_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TOOL_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TOOL TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TOOL_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TOOL_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TOOL TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TOOL_TYPE get(int value) {
		switch (value) {
		case MAVEN_VALUE:
			return MAVEN;
		case JDK_VALUE:
			return JDK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TOOL_TYPE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TOOL_TYPE
