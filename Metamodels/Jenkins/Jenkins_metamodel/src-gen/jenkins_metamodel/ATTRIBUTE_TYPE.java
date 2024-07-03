/**
 */
package jenkins_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ATTRIBUTE TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jenkins_metamodel.Jenkins_metamodelPackage#getATTRIBUTE_TYPE()
 * @model
 * @generated
 */
public enum ATTRIBUTE_TYPE implements Enumerator {
	/**
	 * The '<em><b>Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET(0, "target", "target"),

	/**
	 * The '<em><b>Branch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_VALUE
	 * @generated
	 * @ordered
	 */
	BRANCH(0, "branch", "branch"),

	/**
	 * The '<em><b>Fork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_VALUE
	 * @generated
	 * @ordered
	 */
	FORK(1, "fork", "fork"),

	/**
	 * The '<em><b>Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(1, "url", "url"),

	/**
	 * The '<em><b>Title</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(1, "title", "title"),

	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(1, "author", "author"),

	/**
	 * The '<em><b>Author Display Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_DISPLAY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_DISPLAY_NAME(1, "authorDisplayName", "authorDisplayName"),

	/**
	 * The '<em><b>Author Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_EMAIL(1, "authorEmail", "authorEmail"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(1, "id", "id");

	/**
	 * The '<em><b>Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET
	 * @model name="target"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_VALUE = 0;

	/**
	 * The '<em><b>Branch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH
	 * @model name="branch"
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_VALUE = 0;

	/**
	 * The '<em><b>Fork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @model name="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK_VALUE = 1;

	/**
	 * The '<em><b>Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model name="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 1;

	/**
	 * The '<em><b>Title</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model name="title"
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 1;

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 1;

	/**
	 * The '<em><b>Author Display Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_DISPLAY_NAME
	 * @model name="authorDisplayName"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_DISPLAY_NAME_VALUE = 1;

	/**
	 * The '<em><b>Author Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_EMAIL
	 * @model name="authorEmail"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_EMAIL_VALUE = 1;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 1;

	/**
	 * An array of all the '<em><b>ATTRIBUTE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ATTRIBUTE_TYPE[] VALUES_ARRAY = new ATTRIBUTE_TYPE[] { TARGET, BRANCH, FORK, URL, TITLE,
			AUTHOR, AUTHOR_DISPLAY_NAME, AUTHOR_EMAIL, ID, };

	/**
	 * A public read-only list of all the '<em><b>ATTRIBUTE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ATTRIBUTE_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ATTRIBUTE TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ATTRIBUTE_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ATTRIBUTE_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ATTRIBUTE TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ATTRIBUTE_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ATTRIBUTE_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ATTRIBUTE TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ATTRIBUTE_TYPE get(int value) {
		switch (value) {
		case TARGET_VALUE:
			return TARGET;
		case FORK_VALUE:
			return FORK;
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
	private ATTRIBUTE_TYPE(int value, String name, String literal) {
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

} //ATTRIBUTE_TYPE
