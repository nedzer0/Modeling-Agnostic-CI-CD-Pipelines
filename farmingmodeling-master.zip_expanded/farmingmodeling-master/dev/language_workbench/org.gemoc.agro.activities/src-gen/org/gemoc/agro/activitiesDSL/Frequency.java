/**
 */
package org.gemoc.agro.activitiesDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Frequency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getFrequency()
 * @model
 * @generated
 */
public enum Frequency implements Enumerator
{
  /**
	 * The '<em><b>Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ONCE_VALUE
	 * @generated
	 * @ordered
	 */
  ONCE(0, "once", "once"),

  /**
	 * The '<em><b>Daily</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DAILY_VALUE
	 * @generated
	 * @ordered
	 */
  DAILY(1, "daily", "daily"),

  /**
	 * The '<em><b>Weekly</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WEEKLY_VALUE
	 * @generated
	 * @ordered
	 */
  WEEKLY(2, "weekly", "weekly"),

  /**
	 * The '<em><b>Monthly</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MONTHLY_VALUE
	 * @generated
	 * @ordered
	 */
  MONTHLY(3, "monthly", "monthly"),

  /**
	 * The '<em><b>Quaterly</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #QUATERLY_VALUE
	 * @generated
	 * @ordered
	 */
  QUATERLY(4, "quaterly", "quaterly"),

  /**
	 * The '<em><b>Yearly</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #YEARLY_VALUE
	 * @generated
	 * @ordered
	 */
  YEARLY(5, "yearly", "yearly");

  /**
	 * The '<em><b>Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Once</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ONCE
	 * @model name="once"
	 * @generated
	 * @ordered
	 */
  public static final int ONCE_VALUE = 0;

  /**
	 * The '<em><b>Daily</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Daily</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DAILY
	 * @model name="daily"
	 * @generated
	 * @ordered
	 */
  public static final int DAILY_VALUE = 1;

  /**
	 * The '<em><b>Weekly</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Weekly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WEEKLY
	 * @model name="weekly"
	 * @generated
	 * @ordered
	 */
  public static final int WEEKLY_VALUE = 2;

  /**
	 * The '<em><b>Monthly</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Monthly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MONTHLY
	 * @model name="monthly"
	 * @generated
	 * @ordered
	 */
  public static final int MONTHLY_VALUE = 3;

  /**
	 * The '<em><b>Quaterly</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Quaterly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #QUATERLY
	 * @model name="quaterly"
	 * @generated
	 * @ordered
	 */
  public static final int QUATERLY_VALUE = 4;

  /**
	 * The '<em><b>Yearly</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Yearly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #YEARLY
	 * @model name="yearly"
	 * @generated
	 * @ordered
	 */
  public static final int YEARLY_VALUE = 5;

  /**
	 * An array of all the '<em><b>Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Frequency[] VALUES_ARRAY =
    new Frequency[] {
			ONCE,
			DAILY,
			WEEKLY,
			MONTHLY,
			QUATERLY,
			YEARLY,
		};

  /**
	 * A public read-only list of all the '<em><b>Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Frequency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Frequency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Frequency get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Frequency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Frequency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Frequency getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Frequency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Frequency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Frequency get(int value)
  {
		switch (value) {
			case ONCE_VALUE: return ONCE;
			case DAILY_VALUE: return DAILY;
			case WEEKLY_VALUE: return WEEKLY;
			case MONTHLY_VALUE: return MONTHLY;
			case QUATERLY_VALUE: return QUATERLY;
			case YEARLY_VALUE: return YEARLY;
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
  private Frequency(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //Frequency
