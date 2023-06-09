/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.Extend#getExtendedUC <em>Extended UC</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.Extend#getExtPoint <em>Ext Point</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frsl.FrslPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended UC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended UC</em>' reference.
	 * @see #setExtendedUC(Usecase)
	 * @see org.eclipse.sme.frsl.FrslPackage#getExtend_ExtendedUC()
	 * @model required="true"
	 * @generated
	 */
	Usecase getExtendedUC();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frsl.Extend#getExtendedUC <em>Extended UC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended UC</em>' reference.
	 * @see #getExtendedUC()
	 * @generated
	 */
	void setExtendedUC(Usecase value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(Usecase)
	 * @see org.eclipse.sme.frsl.FrslPackage#getExtend_Extension()
	 * @model required="true"
	 * @generated
	 */
	Usecase getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frsl.Extend#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Usecase value);

	/**
	 * Returns the value of the '<em><b>Ext Point</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sme.frsl.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sme.frsl.ExtensionPoint#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Point</em>' reference list.
	 * @see org.eclipse.sme.frsl.FrslPackage#getExtend_ExtPoint()
	 * @see org.eclipse.sme.frsl.ExtensionPoint#getExtend
	 * @model opposite="extend" required="true"
	 * @generated
	 */
	EList<ExtensionPoint> getExtPoint();

} // Extend
