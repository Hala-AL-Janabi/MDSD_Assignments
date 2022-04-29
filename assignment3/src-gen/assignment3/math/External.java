/**
 * generated by Xtext 2.25.0
 */
package assignment3.math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment3.math.External#getName <em>Name</em>}</li>
 *   <li>{@link assignment3.math.External#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see assignment3.math.MathPackage#getExternal()
 * @model
 * @generated
 */
public interface External extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see assignment3.math.MathPackage#getExternal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link assignment3.math.External#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' attribute list.
   * @see assignment3.math.MathPackage#getExternal_Types()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypes();

} // External