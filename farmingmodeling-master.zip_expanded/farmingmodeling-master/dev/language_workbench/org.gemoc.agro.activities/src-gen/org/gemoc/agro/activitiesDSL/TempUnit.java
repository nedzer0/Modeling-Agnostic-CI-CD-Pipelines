/**
 */
package org.gemoc.agro.activitiesDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temp Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage#getTempUnit()
 * @model
 * @generated
 */
public enum TempUnit implements Enumerator
{
  /**
	 * The '<em><b>Celsius</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
  CELSIUS(0, "celsius", "\u00b0C"),

  /**
	 * The '<em><b>Farenheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FARENHEIT_VALUE
	 * @generated
	 * @ordered
	 */
  FARENHEIT(1, "farenheit", "\u00b0F");

  /**
	 * The '<em><b>Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Celsius</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CELSIUS
	 * @model name="celsius" literal="\260C"
	 * @generated
	 * @ordered
	 */
  public static final int CELSIUS_VALUE = 0;

  /**
	 * The '<em><b>Farenheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Farenheit</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FARENHEIT
	 * @model name="farenheit" literal="\260F"
	 * @generated
	 * @ordered
	 */
  public static final int FARENHEIT_VALUE = 1;

  /**
	 * An array of all the '<em><b>Temp Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final TempUnit[] VALUES_ARRAY =
    new TempUnit[] {
			CELSIUS,
			FARENHEIT,
		};

  /**
	 * A public read-only list of all the '<em><b>Temp Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<TempUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Temp Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static TempUnit get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TempUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Temp Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static TempUnit getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TempUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Temp Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static TempUnit get(int value)
  {
		switch (value) {
			case CELSIUS_VALUE: return CELSIUS;
			case FARENHEIT_VALUE: return FARENHEIT;
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
  private TempUnit(int value, String name, String literal)
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
  
} //TempUnit
