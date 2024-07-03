/**
 */
package circleCI_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MACOS RESOURCE TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see circleCI_metamodel.CircleCI_metamodelPackage#getMACOS_RESOURCE_TYPE()
 * @model
 * @generated
 */
public enum MACOS_RESOURCE_TYPE implements Enumerator {
	/**
	 * The '<em><b>MACOS X86 MEDIUM GEN2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_X86_MEDIUM_GEN2_VALUE
	 * @generated
	 * @ordered
	 */
	MACOS_X86_MEDIUM_GEN2(0, "MACOS_X86_MEDIUM_GEN2", "macos.x86.medium.gen2"),
	/**
	 * The '<em><b>MACOS M1 MEDIUM GEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MACOS_M1_MEDIUM_GEN_VALUE
	 * @generated
	 * @ordered
	 */
	MACOS_M1_MEDIUM_GEN(1, "MACOS_M1_MEDIUM_GEN", "macos.m1.medium.gen1"),

	/**
	 * The '<em><b>MACOS M1 LARGE GEN1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_M1_LARGE_GEN1_VALUE
	 * @generated
	 * @ordered
	 */
	MACOS_M1_LARGE_GEN1(2, "MACOS_M1_LARGE_GEN1", "macos.m1.large.gen1");

	/**
	 * The '<em><b>MACOS X86 MEDIUM GEN2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_X86_MEDIUM_GEN2
	 * @model literal="macos.x86.medium.gen2"
	 * @generated
	 * @ordered
	 */
	public static final int MACOS_X86_MEDIUM_GEN2_VALUE = 0;

	/**
	 * The '<em><b>MACOS M1 MEDIUM GEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_M1_MEDIUM_GEN
	 * @model literal="macos.m1.medium.gen1"
	 * @generated
	 * @ordered
	 */
	public static final int MACOS_M1_MEDIUM_GEN_VALUE = 1;

	/**
	 * The '<em><b>MACOS M1 LARGE GEN1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_M1_LARGE_GEN1
	 * @model literal="macos.m1.large.gen1"
	 * @generated
	 * @ordered
	 */
	public static final int MACOS_M1_LARGE_GEN1_VALUE = 2;

	/**
	 * An array of all the '<em><b>MACOS RESOURCE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MACOS_RESOURCE_TYPE[] VALUES_ARRAY = new MACOS_RESOURCE_TYPE[] { MACOS_X86_MEDIUM_GEN2,
			MACOS_M1_MEDIUM_GEN, MACOS_M1_LARGE_GEN1, };

	/**
	 * A public read-only list of all the '<em><b>MACOS RESOURCE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MACOS_RESOURCE_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MACOS RESOURCE TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACOS_RESOURCE_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACOS_RESOURCE_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MACOS RESOURCE TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACOS_RESOURCE_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MACOS_RESOURCE_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MACOS RESOURCE TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MACOS_RESOURCE_TYPE get(int value) {
		switch (value) {
		case MACOS_X86_MEDIUM_GEN2_VALUE:
			return MACOS_X86_MEDIUM_GEN2;
		case MACOS_M1_MEDIUM_GEN_VALUE:
			return MACOS_M1_MEDIUM_GEN;
		case MACOS_M1_LARGE_GEN1_VALUE:
			return MACOS_M1_LARGE_GEN1;
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
	private MACOS_RESOURCE_TYPE(int value, String name, String literal) {
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

} //MACOS_RESOURCE_TYPE
