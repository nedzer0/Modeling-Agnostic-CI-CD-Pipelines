/**
 */
package cICD_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>INPUT TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cICD_metamodel.CICD_metamodelPackage#getINPUT_TYPE()
 * @model
 * @generated
 */
public enum INPUT_TYPE implements Enumerator {
	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "STRING", "STRING"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(1, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(2, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>SECRET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET(4, "SECRET", "SECRET"),

	/**
	 * The '<em><b>CHOICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOICE(5, "CHOICE", "CHOICE"),

	/**
	 * The '<em><b>PASSWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	PASSWORD(6, "PASSWORD", "PASSWORD"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(7, "TEXT", "TEXT");

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 1;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 2;

	/**
	 * The '<em><b>SECRET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_VALUE = 4;

	/**
	 * The '<em><b>CHOICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE_VALUE = 5;

	/**
	 * The '<em><b>PASSWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSWORD_VALUE = 6;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 7;

	/**
	 * An array of all the '<em><b>INPUT TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final INPUT_TYPE[] VALUES_ARRAY = new INPUT_TYPE[] { STRING, NUMBER, BOOLEAN, SECRET, CHOICE,
			PASSWORD, TEXT, };

	/**
	 * A public read-only list of all the '<em><b>INPUT TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<INPUT_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>INPUT TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static INPUT_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INPUT_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INPUT TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static INPUT_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INPUT_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INPUT TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static INPUT_TYPE get(int value) {
		switch (value) {
		case STRING_VALUE:
			return STRING;
		case NUMBER_VALUE:
			return NUMBER;
		case BOOLEAN_VALUE:
			return BOOLEAN;
		case SECRET_VALUE:
			return SECRET;
		case CHOICE_VALUE:
			return CHOICE;
		case PASSWORD_VALUE:
			return PASSWORD;
		case TEXT_VALUE:
			return TEXT;
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
	private INPUT_TYPE(int value, String name, String literal) {
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

} //INPUT_TYPE
