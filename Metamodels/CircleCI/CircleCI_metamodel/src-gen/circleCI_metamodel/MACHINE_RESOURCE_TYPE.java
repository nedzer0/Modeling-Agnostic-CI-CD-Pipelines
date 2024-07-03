/**
 */
package circleCI_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MACHINE RESOURCE TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMACHINE_RESOURCE_TYPE()
 * @model
 * @generated
 */
public enum MACHINE_RESOURCE_TYPE implements Enumerator {
	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(0, "MEDIUM", "medium"),

	/**
	 * The '<em><b>LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE(1, "LARGE", "large"),

	/**
	 * The '<em><b>XLARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE_VALUE
	 * @generated
	 * @ordered
	 */
	XLARGE(2, "XLARGE", "xlarge"),

	/**
	 * The '<em><b>TWO XLARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_XLARGE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_XLARGE(3, "TWO_XLARGE", "two_xlarge"),

	/**
	 * The '<em><b>TWO XLARGE PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_XLARGE_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_XLARGE_PLUS(4, "TWO_XLARGE_PLUS", "two_xlarge_plus");

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model literal="medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 0;

	/**
	 * The '<em><b>LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @model literal="large"
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_VALUE = 1;

	/**
	 * The '<em><b>XLARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLARGE
	 * @model literal="xlarge"
	 * @generated
	 * @ordered
	 */
	public static final int XLARGE_VALUE = 2;

	/**
	 * The '<em><b>TWO XLARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_XLARGE
	 * @model literal="two_xlarge"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_XLARGE_VALUE = 3;

	/**
	 * The '<em><b>TWO XLARGE PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_XLARGE_PLUS
	 * @model literal="two_xlarge_plus"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_XLARGE_PLUS_VALUE = 4;

	/**
	 * An array of all the '<em><b>MACHINE RESOURCE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MACHINE_RESOURCE_TYPE[] VALUES_ARRAY = new MACHINE_RESOURCE_TYPE[] { MEDIUM, LARGE, XLARGE,
			TWO_XLARGE, TWO_XLARGE_PLUS, };

	/**
	 * A public read-only list of all the '<em><b>MACHINE RESOURCE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MACHINE_RESOURCE_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MACHINE RESOURCE TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACHINE_RESOURCE_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACHINE_RESOURCE_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MACHINE RESOURCE TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACHINE_RESOURCE_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACHINE_RESOURCE_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MACHINE RESOURCE TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACHINE_RESOURCE_TYPE get(int value) {
		switch (value) {
		case MEDIUM_VALUE:
			return MEDIUM;
		case LARGE_VALUE:
			return LARGE;
		case XLARGE_VALUE:
			return XLARGE;
		case TWO_XLARGE_VALUE:
			return TWO_XLARGE;
		case TWO_XLARGE_PLUS_VALUE:
			return TWO_XLARGE_PLUS;
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
	private MACHINE_RESOURCE_TYPE(int value, String name, String literal) {
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

} //MACHINE_RESOURCE_TYPE
