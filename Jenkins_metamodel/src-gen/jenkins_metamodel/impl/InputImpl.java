/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Input;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Parameter_Directive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getId <em>Id</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getOk <em>Ok</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getSubmitterParameter <em>Submitter Parameter</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.InputImpl#getParameter_directive <em>Parameter directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOk() <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOk()
	 * @generated
	 * @ordered
	 */
	protected static final String OK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOk() <em>Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOk()
	 * @generated
	 * @ordered
	 */
	protected String ok = OK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitter() <em>Submitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitter() <em>Submitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected String submitter = SUBMITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitterParameter() <em>Submitter Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMITTER_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitterParameter() <em>Submitter Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitterParameter()
	 * @generated
	 * @ordered
	 */
	protected String submitterParameter = SUBMITTER_PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter_directive() <em>Parameter directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_directive()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter_Directive> parameter_directive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.INPUT__MESSAGE, oldMessage,
					message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.INPUT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOk() {
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOk(String newOk) {
		String oldOk = ok;
		ok = newOk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.INPUT__OK, oldOk, ok));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmitter() {
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitter(String newSubmitter) {
		String oldSubmitter = submitter;
		submitter = newSubmitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.INPUT__SUBMITTER,
					oldSubmitter, submitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmitterParameter() {
		return submitterParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitterParameter(String newSubmitterParameter) {
		String oldSubmitterParameter = submitterParameter;
		submitterParameter = newSubmitterParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.INPUT__SUBMITTER_PARAMETER,
					oldSubmitterParameter, submitterParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter_Directive> getParameter_directive() {
		if (parameter_directive == null) {
			parameter_directive = new EObjectContainmentEList<Parameter_Directive>(Parameter_Directive.class, this,
					Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE);
		}
		return parameter_directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE:
			return ((InternalEList<?>) getParameter_directive()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.INPUT__MESSAGE:
			return getMessage();
		case Jenkins_metamodelPackage.INPUT__ID:
			return getId();
		case Jenkins_metamodelPackage.INPUT__OK:
			return getOk();
		case Jenkins_metamodelPackage.INPUT__SUBMITTER:
			return getSubmitter();
		case Jenkins_metamodelPackage.INPUT__SUBMITTER_PARAMETER:
			return getSubmitterParameter();
		case Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE:
			return getParameter_directive();
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
		case Jenkins_metamodelPackage.INPUT__MESSAGE:
			setMessage((String) newValue);
			return;
		case Jenkins_metamodelPackage.INPUT__ID:
			setId((String) newValue);
			return;
		case Jenkins_metamodelPackage.INPUT__OK:
			setOk((String) newValue);
			return;
		case Jenkins_metamodelPackage.INPUT__SUBMITTER:
			setSubmitter((String) newValue);
			return;
		case Jenkins_metamodelPackage.INPUT__SUBMITTER_PARAMETER:
			setSubmitterParameter((String) newValue);
			return;
		case Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE:
			getParameter_directive().clear();
			getParameter_directive().addAll((Collection<? extends Parameter_Directive>) newValue);
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
		case Jenkins_metamodelPackage.INPUT__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.INPUT__ID:
			setId(ID_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.INPUT__OK:
			setOk(OK_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.INPUT__SUBMITTER:
			setSubmitter(SUBMITTER_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.INPUT__SUBMITTER_PARAMETER:
			setSubmitterParameter(SUBMITTER_PARAMETER_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE:
			getParameter_directive().clear();
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
		case Jenkins_metamodelPackage.INPUT__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case Jenkins_metamodelPackage.INPUT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Jenkins_metamodelPackage.INPUT__OK:
			return OK_EDEFAULT == null ? ok != null : !OK_EDEFAULT.equals(ok);
		case Jenkins_metamodelPackage.INPUT__SUBMITTER:
			return SUBMITTER_EDEFAULT == null ? submitter != null : !SUBMITTER_EDEFAULT.equals(submitter);
		case Jenkins_metamodelPackage.INPUT__SUBMITTER_PARAMETER:
			return SUBMITTER_PARAMETER_EDEFAULT == null ? submitterParameter != null
					: !SUBMITTER_PARAMETER_EDEFAULT.equals(submitterParameter);
		case Jenkins_metamodelPackage.INPUT__PARAMETER_DIRECTIVE:
			return parameter_directive != null && !parameter_directive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (message: ");
		result.append(message);
		result.append(", id: ");
		result.append(id);
		result.append(", ok: ");
		result.append(ok);
		result.append(", submitter: ");
		result.append(submitter);
		result.append(", submitterParameter: ");
		result.append(submitterParameter);
		result.append(')');
		return result.toString();
	}

} //InputImpl
