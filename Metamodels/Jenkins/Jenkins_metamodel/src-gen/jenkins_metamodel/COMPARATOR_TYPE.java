/**
 */
package jenkins_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COMPARATOR TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getCOMPARATOR_TYPE()
 * @model
 * @generated
 */
public enum COMPARATOR_TYPE implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "none", "none"),

	/**
	 * The '<em><b>Glob</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOB_VALUE
	 * @generated
	 * @ordered
	 */
	GLOB(0, "glob", "glob"),

	/**
	 * The '<em><b>Regexp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP_VALUE
	 * @generated
	 * @ordered
	 */
	REGEXP(0, "regexp", "regexp"),

	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(1, "equals", "equals");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Glob</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOB
	 * @model name="glob"
	 * @generated
	 * @ordered
	 */
	public static final int GLOB_VALUE = 0;

	/**
	 * The '<em><b>Regexp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP
	 * @model name="regexp"
	 * @generated
	 * @ordered
	 */
	public static final int REGEXP_VALUE = 0;

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 1;

	/**
	 * An array of all the '<em><b>COMPARATOR TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COMPARATOR_TYPE[] VALUES_ARRAY = new COMPARATOR_TYPE[] { NONE, GLOB, REGEXP, EQUALS, };

	/**
	 * A public read-only list of all the '<em><b>COMPARATOR TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COMPARATOR_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COMPARATOR TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATOR_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COMPARATOR_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COMPARATOR TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATOR_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COMPARATOR_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COMPARATOR TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATOR_TYPE get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case GLOB_VALUE:
			return GLOB;
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
	private COMPARATOR_TYPE(int value, String name, String literal) {
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

} //COMPARATOR_TYPE
