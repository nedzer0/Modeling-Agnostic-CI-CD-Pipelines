/**
 */
package gHA_metamodel.impl;

import gHA_metamodel.Branch;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.Path;
import gHA_metamodel.PushTrigger;
import gHA_metamodel.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gHA_metamodel.impl.PushTriggerImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PushTriggerImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link gHA_metamodel.impl.PushTriggerImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushTriggerImpl extends TriggerImpl implements PushTrigger {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHA_metamodelPackage.Literals.PUSH_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Branch>(Branch.class, this,
					GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, GHA_metamodelPackage.PUSH_TRIGGER__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Path>(Path.class, this, GHA_metamodelPackage.PUSH_TRIGGER__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PUSH_TRIGGER__TAGS:
			return ((InternalEList<?>) getTags()).basicRemove(otherEnd, msgs);
		case GHA_metamodelPackage.PUSH_TRIGGER__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
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
		case GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES:
			return getBranches();
		case GHA_metamodelPackage.PUSH_TRIGGER__TAGS:
			return getTags();
		case GHA_metamodelPackage.PUSH_TRIGGER__PATHS:
			return getPaths();
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
		case GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Branch>) newValue);
			return;
		case GHA_metamodelPackage.PUSH_TRIGGER__TAGS:
			getTags().clear();
			getTags().addAll((Collection<? extends Tag>) newValue);
			return;
		case GHA_metamodelPackage.PUSH_TRIGGER__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends Path>) newValue);
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
		case GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES:
			getBranches().clear();
			return;
		case GHA_metamodelPackage.PUSH_TRIGGER__TAGS:
			getTags().clear();
			return;
		case GHA_metamodelPackage.PUSH_TRIGGER__PATHS:
			getPaths().clear();
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
		case GHA_metamodelPackage.PUSH_TRIGGER__BRANCHES:
			return branches != null && !branches.isEmpty();
		case GHA_metamodelPackage.PUSH_TRIGGER__TAGS:
			return tags != null && !tags.isEmpty();
		case GHA_metamodelPackage.PUSH_TRIGGER__PATHS:
			return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PushTriggerImpl
