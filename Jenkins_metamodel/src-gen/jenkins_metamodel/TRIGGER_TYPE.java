/**
 */
package jenkins_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TRIGGER TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getTRIGGER_TYPE()
 * @model
 * @generated
 */
public enum TRIGGER_TYPE implements Enumerator {
	/**
	 * The '<em><b>Cron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRON_VALUE
	 * @generated
	 * @ordered
	 */
	CRON(1, "cron", "cron"),

	/**
	 * The '<em><b>Poll SCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_SCM_VALUE
	 * @generated
	 * @ordered
	 */
	POLL_SCM(0, "pollSCM", "pollSCM"),

	/**
	 * The '<em><b>Upstream</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	UPSTREAM(0, "upstream", "upstream");

	/**
	 * The '<em><b>Cron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRON
	 * @model name="cron"
	 * @generated
	 * @ordered
	 */
	public static final int CRON_VALUE = 1;

	/**
	 * The '<em><b>Poll SCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_SCM
	 * @model name="pollSCM"
	 * @generated
	 * @ordered
	 */
	public static final int POLL_SCM_VALUE = 0;

	/**
	 * The '<em><b>Upstream</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPSTREAM
	 * @model name="upstream"
	 * @generated
	 * @ordered
	 */
	public static final int UPSTREAM_VALUE = 0;

	/**
	 * An array of all the '<em><b>TRIGGER TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TRIGGER_TYPE[] VALUES_ARRAY = new TRIGGER_TYPE[] { CRON, POLL_SCM, UPSTREAM, };

	/**
	 * A public read-only list of all the '<em><b>TRIGGER TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TRIGGER_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TRIGGER TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRIGGER_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRIGGER_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRIGGER TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRIGGER_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRIGGER_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRIGGER TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TRIGGER_TYPE get(int value) {
		switch (value) {
		case CRON_VALUE:
			return CRON;
		case POLL_SCM_VALUE:
			return POLL_SCM;
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
	private TRIGGER_TYPE(int value, String name, String literal) {
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

} //TRIGGER_TYPE
