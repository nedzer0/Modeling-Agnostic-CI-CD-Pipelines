/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Upstream;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upstream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.UpstreamImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.UpstreamImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpstreamImpl extends TriggerImpl implements Upstream {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> jobs;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected String threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.UPSTREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getJobs() {
		if (jobs == null) {
			jobs = new EDataTypeUniqueEList<String>(String.class, this, Jenkins_metamodelPackage.UPSTREAM__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(String newThreshold) {
		String oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.UPSTREAM__THRESHOLD,
					oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.UPSTREAM__JOBS:
			return getJobs();
		case Jenkins_metamodelPackage.UPSTREAM__THRESHOLD:
			return getThreshold();
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
		case Jenkins_metamodelPackage.UPSTREAM__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends String>) newValue);
			return;
		case Jenkins_metamodelPackage.UPSTREAM__THRESHOLD:
			setThreshold((String) newValue);
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
		case Jenkins_metamodelPackage.UPSTREAM__JOBS:
			getJobs().clear();
			return;
		case Jenkins_metamodelPackage.UPSTREAM__THRESHOLD:
			setThreshold(THRESHOLD_EDEFAULT);
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
		case Jenkins_metamodelPackage.UPSTREAM__JOBS:
			return jobs != null && !jobs.isEmpty();
		case Jenkins_metamodelPackage.UPSTREAM__THRESHOLD:
			return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
		result.append(" (jobs: ");
		result.append(jobs);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

} //UpstreamImpl
