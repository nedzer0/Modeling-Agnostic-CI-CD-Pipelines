/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.Environment;
import devOps.Job;
import devOps.Parallel;
import devOps.Permission;
import devOps.Pipeline;
import devOps.Tool_Framework;
import devOps.When;

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
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.PipelineImpl#getWhen <em>When</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getJob <em>Job</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getName0 <em>Name0</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getPipeline_tool_framework <em>Pipeline tool framework</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getPipeline_environment <em>Pipeline environment</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link devOps.impl.PipelineImpl#getParallel <em>Parallel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<When> when;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * The default value of the '{@link #getName0() <em>Name0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName0()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName0() <em>Name0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName0()
	 * @generated
	 * @ordered
	 */
	protected String name0 = NAME0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPipeline_tool_framework() <em>Pipeline tool framework</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline_tool_framework()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool_Framework> pipeline_tool_framework;

	/**
	 * The cached value of the '{@link #getPipeline_environment() <em>Pipeline environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline_environment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> pipeline_environment;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permission;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected EList<Parallel> parallel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<When>(When.class, this, DevOpsPackage.PIPELINE__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, DevOpsPackage.PIPELINE__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName0() {
		return name0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName0(String newName0) {
		String oldName0 = name0;
		name0 = newName0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.PIPELINE__NAME0, oldName0, name0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool_Framework> getPipeline_tool_framework() {
		if (pipeline_tool_framework == null) {
			pipeline_tool_framework = new EObjectContainmentEList<Tool_Framework>(Tool_Framework.class, this,
					DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK);
		}
		return pipeline_tool_framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getPipeline_environment() {
		if (pipeline_environment == null) {
			pipeline_environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT);
		}
		return pipeline_environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getPermission() {
		if (permission == null) {
			permission = new EObjectContainmentEList<Permission>(Permission.class, this,
					DevOpsPackage.PIPELINE__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parallel> getParallel() {
		if (parallel == null) {
			parallel = new EObjectContainmentEList<Parallel>(Parallel.class, this, DevOpsPackage.PIPELINE__PARALLEL);
		}
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevOpsPackage.PIPELINE__WHEN:
			return ((InternalEList<?>) getWhen()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.PIPELINE__JOB:
			return ((InternalEList<?>) getJob()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK:
			return ((InternalEList<?>) getPipeline_tool_framework()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return ((InternalEList<?>) getPipeline_environment()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.PIPELINE__PERMISSION:
			return ((InternalEList<?>) getPermission()).basicRemove(otherEnd, msgs);
		case DevOpsPackage.PIPELINE__PARALLEL:
			return ((InternalEList<?>) getParallel()).basicRemove(otherEnd, msgs);
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
		case DevOpsPackage.PIPELINE__WHEN:
			return getWhen();
		case DevOpsPackage.PIPELINE__JOB:
			return getJob();
		case DevOpsPackage.PIPELINE__NAME0:
			return getName0();
		case DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK:
			return getPipeline_tool_framework();
		case DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return getPipeline_environment();
		case DevOpsPackage.PIPELINE__PERMISSION:
			return getPermission();
		case DevOpsPackage.PIPELINE__PARALLEL:
			return getParallel();
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
		case DevOpsPackage.PIPELINE__WHEN:
			getWhen().clear();
			getWhen().addAll((Collection<? extends When>) newValue);
			return;
		case DevOpsPackage.PIPELINE__JOB:
			getJob().clear();
			getJob().addAll((Collection<? extends Job>) newValue);
			return;
		case DevOpsPackage.PIPELINE__NAME0:
			setName0((String) newValue);
			return;
		case DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK:
			getPipeline_tool_framework().clear();
			getPipeline_tool_framework().addAll((Collection<? extends Tool_Framework>) newValue);
			return;
		case DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			getPipeline_environment().addAll((Collection<? extends Environment>) newValue);
			return;
		case DevOpsPackage.PIPELINE__PERMISSION:
			getPermission().clear();
			getPermission().addAll((Collection<? extends Permission>) newValue);
			return;
		case DevOpsPackage.PIPELINE__PARALLEL:
			getParallel().clear();
			getParallel().addAll((Collection<? extends Parallel>) newValue);
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
		case DevOpsPackage.PIPELINE__WHEN:
			getWhen().clear();
			return;
		case DevOpsPackage.PIPELINE__JOB:
			getJob().clear();
			return;
		case DevOpsPackage.PIPELINE__NAME0:
			setName0(NAME0_EDEFAULT);
			return;
		case DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK:
			getPipeline_tool_framework().clear();
			return;
		case DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			getPipeline_environment().clear();
			return;
		case DevOpsPackage.PIPELINE__PERMISSION:
			getPermission().clear();
			return;
		case DevOpsPackage.PIPELINE__PARALLEL:
			getParallel().clear();
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
		case DevOpsPackage.PIPELINE__WHEN:
			return when != null && !when.isEmpty();
		case DevOpsPackage.PIPELINE__JOB:
			return job != null && !job.isEmpty();
		case DevOpsPackage.PIPELINE__NAME0:
			return NAME0_EDEFAULT == null ? name0 != null : !NAME0_EDEFAULT.equals(name0);
		case DevOpsPackage.PIPELINE__PIPELINE_TOOL_FRAMEWORK:
			return pipeline_tool_framework != null && !pipeline_tool_framework.isEmpty();
		case DevOpsPackage.PIPELINE__PIPELINE_ENVIRONMENT:
			return pipeline_environment != null && !pipeline_environment.isEmpty();
		case DevOpsPackage.PIPELINE__PERMISSION:
			return permission != null && !permission.isEmpty();
		case DevOpsPackage.PIPELINE__PARALLEL:
			return parallel != null && !parallel.isEmpty();
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
		result.append(" (Name0: ");
		result.append(name0);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
