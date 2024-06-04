/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Action;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.InputPair;
import gHA_metamodel.InputParams;
import gHA_metamodel.Step;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.ActionImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ActionImpl#getComposite_action <em>Composite action</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ActionImpl#getWith <em>With</em>}</li>
 *   <li>{@link gHA_metamodel.impl.ActionImpl#getWith_inputPair <em>With input Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected String uses = USES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposite_action() <em>Composite action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite_action()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> composite_action;

	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParams> with;

	/**
	 * The cached value of the '{@link #getWith_inputPair() <em>With input Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith_inputPair()
	 * @generated
	 * @ordered
	 */
	protected InputPair with_inputPair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUses(String newUses) {
		String oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.ACTION__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getComposite_action() {
		if (composite_action == null) {
			composite_action = new EObjectContainmentEList<Step>(Step.class, this,
					GHA_metamodelPackage.ACTION__COMPOSITE_ACTION);
		}
		return composite_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputParams> getWith() {
		if (with == null) {
			with = new EObjectContainmentEList<InputParams>(InputParams.class, this, GHA_metamodelPackage.ACTION__WITH);
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPair getWith_inputPair() {
		return with_inputPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWith_inputPair(InputPair newWith_inputPair, NotificationChain msgs) {
		InputPair oldWith_inputPair = with_inputPair;
		with_inputPair = newWith_inputPair;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR, oldWith_inputPair, newWith_inputPair);
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
	public void setWith_inputPair(InputPair newWith_inputPair) {
		if (newWith_inputPair != with_inputPair) {
			NotificationChain msgs = null;
			if (with_inputPair != null)
				msgs = ((InternalEObject) with_inputPair).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR, null, msgs);
			if (newWith_inputPair != null)
				msgs = ((InternalEObject) newWith_inputPair).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR, null, msgs);
			msgs = basicSetWith_inputPair(newWith_inputPair, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR,
					newWith_inputPair, newWith_inputPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.ACTION__COMPOSITE_ACTION:
			return ((InternalEList<?>) getComposite_action()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.ACTION__WITH:
			return ((InternalEList<?>) getWith()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR:
			return basicSetWith_inputPair(null, msgs);
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
		case GHA_metamodelPackage.ACTION__USES:
			return getUses();
		case GHA_metamodelPackage.ACTION__COMPOSITE_ACTION:
			return getComposite_action();
		case GHA_metamodelPackage.ACTION__WITH:
			return getWith();
		case GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR:
			return getWith_inputPair();
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
		case GHA_metamodelPackage.ACTION__USES:
			setUses((String) newValue);
			return;
		case GHA_metamodelPackage.ACTION__COMPOSITE_ACTION:
			getComposite_action().clear();
			getComposite_action().addAll((Collection<? extends Step>) newValue);
			return;
		case GHA_metamodelPackage.ACTION__WITH:
			getWith().clear();
			getWith().addAll((Collection<? extends InputParams>) newValue);
			return;
		case GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR:
			setWith_inputPair((InputPair) newValue);
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
		case GHA_metamodelPackage.ACTION__USES:
			setUses(USES_EDEFAULT);
			return;
		case GHA_metamodelPackage.ACTION__COMPOSITE_ACTION:
			getComposite_action().clear();
			return;
		case GHA_metamodelPackage.ACTION__WITH:
			getWith().clear();
			return;
		case GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR:
			setWith_inputPair((InputPair) null);
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
		case GHA_metamodelPackage.ACTION__USES:
			return USES_EDEFAULT == null ? uses != null : !USES_EDEFAULT.equals(uses);
		case GHA_metamodelPackage.ACTION__COMPOSITE_ACTION:
			return composite_action != null && !composite_action.isEmpty();
		case GHA_metamodelPackage.ACTION__WITH:
			return with != null && !with.isEmpty();
		case GHA_metamodelPackage.ACTION__WITH_INPUT_PAIR:
			return with_inputPair != null;
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
		result.append(" (uses: ");
		result.append(uses);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
