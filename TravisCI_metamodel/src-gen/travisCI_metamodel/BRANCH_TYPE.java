/**
 */
package travisCI_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BRANCH TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see travisCI_metamodel.TravisCI_metamodelPackage#getBRANCH_TYPE()
 * @model
 * @generated
 */
public enum BRANCH_TYPE implements Enumerator {
	/**
	 * The '<em><b>SAFELIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFELIST_VALUE
	 * @generated
	 * @ordered
	 */
	SAFELIST(0, "SAFELIST", "SAFELIST"),

	/**
	 * The '<em><b>BLOCKLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKLIST_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKLIST(1, "BLOCKLIST", "BLOCKLIST");

	/**
	 * The '<em><b>SAFELIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFELIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAFELIST_VALUE = 0;

	/**
	 * The '<em><b>BLOCKLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKLIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKLIST_VALUE = 1;

	/**
	 * An array of all the '<em><b>BRANCH TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BRANCH_TYPE[] VALUES_ARRAY = new BRANCH_TYPE[] { SAFELIST, BLOCKLIST, };

	/**
	 * A public read-only list of all the '<em><b>BRANCH TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BRANCH_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BRANCH TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BRANCH_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BRANCH_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BRANCH TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BRANCH_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BRANCH_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BRANCH TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BRANCH_TYPE get(int value) {
		switch (value) {
		case SAFELIST_VALUE:
			return SAFELIST;
		case BLOCKLIST_VALUE:
			return BLOCKLIST;
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
	private BRANCH_TYPE(int value, String name, String literal) {
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

} //BRANCH_TYPE
