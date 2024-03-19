/**
 */
package travisCI_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import travisCI_metamodel.Parameters;
import travisCI_metamodel.Script;
import travisCI_metamodel.Tool_Framework;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link travisCI_metamodel.impl.ScriptImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link travisCI_metamodel.impl.ScriptImpl#getTool_framework <em>Tool framework</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

	/**
	 * The cached value of the '{@link #getTool_framework() <em>Tool framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool_framework()
	 * @generated
	 * @ordered
	 */
	protected Tool_Framework tool_framework;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravisCI_metamodelPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool_Framework getTool_framework() {
		return tool_framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool_framework(Tool_Framework newTool_framework, NotificationChain msgs) {
		Tool_Framework oldTool_framework = tool_framework;
		tool_framework = newTool_framework;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK, oldTool_framework, newTool_framework);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTool_framework(Tool_Framework newTool_framework) {
		if (newTool_framework != tool_framework) {
			NotificationChain msgs = null;
			if (tool_framework != null)
				msgs = ((InternalEObject) tool_framework).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK, null, msgs);
			if (newTool_framework != null)
				msgs = ((InternalEObject) newTool_framework).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK, null, msgs);
			msgs = basicSetTool_framework(newTool_framework, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK,
					newTool_framework, newTool_framework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this,
					TravisCI_metamodelPackage.SCRIPT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TravisCI_metamodelPackage.SCRIPT__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK:
			return basicSetTool_framework(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TravisCI_metamodelPackage.SCRIPT__PARAMETERS:
			return getParameters();
		case TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK:
			return getTool_framework();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TravisCI_metamodelPackage.SCRIPT__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameters>) newValue);
			return;
		case TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK:
			setTool_framework((Tool_Framework) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TravisCI_metamodelPackage.SCRIPT__PARAMETERS:
			getParameters().clear();
			return;
		case TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK:
			setTool_framework((Tool_Framework) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TravisCI_metamodelPackage.SCRIPT__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case TravisCI_metamodelPackage.SCRIPT__TOOL_FRAMEWORK:
			return tool_framework != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
