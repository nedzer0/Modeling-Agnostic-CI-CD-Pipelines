/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Agent;
import jenkins_metamodel.Axis;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Input;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Matrix;
import jenkins_metamodel.Post;
import jenkins_metamodel.Stage;
import jenkins_metamodel.StageOption;
import jenkins_metamodel.Tool;
import jenkins_metamodel.When;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.MatrixImpl#getStage_options <em>Stage options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<Axis> axis;

	/**
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stages;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

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
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> post;

	/**
	 * The cached value of the '{@link #getStage_options() <em>Stage options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage_options()
	 * @generated
	 * @ordered
	 */
	protected EList<StageOption> stage_options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Axis> getAxis() {
		if (axis == null) {
			axis = new EObjectContainmentEList<Axis>(Axis.class, this, Jenkins_metamodelPackage.MATRIX__AXIS);
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, Jenkins_metamodelPackage.MATRIX__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, Jenkins_metamodelPackage.MATRIX__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<When>(When.class, this, Jenkins_metamodelPackage.MATRIX__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this,
					Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, Jenkins_metamodelPackage.MATRIX__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, Jenkins_metamodelPackage.MATRIX__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Post> getPost() {
		if (post == null) {
			post = new EObjectContainmentEList<Post>(Post.class, this, Jenkins_metamodelPackage.MATRIX__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StageOption> getStage_options() {
		if (stage_options == null) {
			stage_options = new EObjectContainmentEList<StageOption>(StageOption.class, this,
					Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS);
		}
		return stage_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.MATRIX__AXIS:
			return ((InternalEList<?>) getAxis()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__STAGES:
			return ((InternalEList<?>) getStages()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__WHEN:
			return ((InternalEList<?>) getWhen()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
			return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
			return ((InternalEList<?>) getTools()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
			return ((InternalEList<?>) getStage_options()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.MATRIX__AXIS:
			return getAxis();
		case Jenkins_metamodelPackage.MATRIX__STAGES:
			return getStages();
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
			return getInputs();
		case Jenkins_metamodelPackage.MATRIX__WHEN:
			return getWhen();
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
			return getEnvironments();
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
			return getAgents();
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
			return getTools();
		case Jenkins_metamodelPackage.MATRIX__POST:
			return getPost();
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
			return getStage_options();
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
		case Jenkins_metamodelPackage.MATRIX__AXIS:
			getAxis().clear();
			getAxis().addAll((Collection<? extends Axis>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__STAGES:
			getStages().clear();
			getStages().addAll((Collection<? extends Stage>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__WHEN:
			getWhen().clear();
			getWhen().addAll((Collection<? extends When>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
			getAgents().clear();
			getAgents().addAll((Collection<? extends Agent>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
			getTools().clear();
			getTools().addAll((Collection<? extends Tool>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Post>) newValue);
			return;
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
			getStage_options().clear();
			getStage_options().addAll((Collection<? extends StageOption>) newValue);
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
		case Jenkins_metamodelPackage.MATRIX__AXIS:
			getAxis().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__STAGES:
			getStages().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
			getInputs().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__WHEN:
			getWhen().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
			getAgents().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
			getTools().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__POST:
			getPost().clear();
			return;
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
			getStage_options().clear();
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
		case Jenkins_metamodelPackage.MATRIX__AXIS:
			return axis != null && !axis.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__STAGES:
			return stages != null && !stages.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__WHEN:
			return when != null && !when.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
			return agents != null && !agents.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
			return tools != null && !tools.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__POST:
			return post != null && !post.isEmpty();
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
			return stage_options != null && !stage_options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatrixImpl
