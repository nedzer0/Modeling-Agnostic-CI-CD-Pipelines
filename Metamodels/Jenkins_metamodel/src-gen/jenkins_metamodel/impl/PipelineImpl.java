/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Agent;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Option;
import jenkins_metamodel.Parameter_Directive;
import jenkins_metamodel.Pipeline;
import jenkins_metamodel.Post;
import jenkins_metamodel.Stage;
import jenkins_metamodel.Tool;
import jenkins_metamodel.Trigger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getStages <em>Stages</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getParameter_directives <em>Parameter directives</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
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
	 * The cached value of the '{@link #getStages() <em>Stages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stages;

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
	 * The cached value of the '{@link #getParameter_directives() <em>Parameter directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_directives()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter_Directive> parameter_directives;

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
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

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
		return Jenkins_metamodelPackage.Literals.PIPELINE;
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
					Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStages() {
		if (stages == null) {
			stages = new EObjectContainmentEList<Stage>(Stage.class, this, Jenkins_metamodelPackage.PIPELINE__STAGES);
		}
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Post> getPost() {
		if (post == null) {
			post = new EObjectContainmentEList<Post>(Post.class, this, Jenkins_metamodelPackage.PIPELINE__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter_Directive> getParameter_directives() {
		if (parameter_directives == null) {
			parameter_directives = new EObjectContainmentEList<Parameter_Directive>(Parameter_Directive.class, this,
					Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES);
		}
		return parameter_directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, Jenkins_metamodelPackage.PIPELINE__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, Jenkins_metamodelPackage.PIPELINE__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					Jenkins_metamodelPackage.PIPELINE__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this,
					Jenkins_metamodelPackage.PIPELINE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS:
			return ((InternalEList<?>) getEnvironments()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__STAGES:
			return ((InternalEList<?>) getStages()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES:
			return ((InternalEList<?>) getParameter_directives()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__TOOLS:
			return ((InternalEList<?>) getTools()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__AGENTS:
			return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__OPTIONS:
			return ((InternalEList<?>) getOptions()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS:
			return getEnvironments();
		case Jenkins_metamodelPackage.PIPELINE__STAGES:
			return getStages();
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return getPost();
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES:
			return getParameter_directives();
		case Jenkins_metamodelPackage.PIPELINE__TOOLS:
			return getTools();
		case Jenkins_metamodelPackage.PIPELINE__AGENTS:
			return getAgents();
		case Jenkins_metamodelPackage.PIPELINE__TRIGGERS:
			return getTriggers();
		case Jenkins_metamodelPackage.PIPELINE__OPTIONS:
			return getOptions();
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS:
			getEnvironments().clear();
			getEnvironments().addAll((Collection<? extends Environment>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__STAGES:
			getStages().clear();
			getStages().addAll((Collection<? extends Stage>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Post>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES:
			getParameter_directives().clear();
			getParameter_directives().addAll((Collection<? extends Parameter_Directive>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__TOOLS:
			getTools().clear();
			getTools().addAll((Collection<? extends Tool>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__AGENTS:
			getAgents().clear();
			getAgents().addAll((Collection<? extends Agent>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__OPTIONS:
			getOptions().clear();
			getOptions().addAll((Collection<? extends Option>) newValue);
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS:
			getEnvironments().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__STAGES:
			getStages().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__POST:
			getPost().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES:
			getParameter_directives().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__TOOLS:
			getTools().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__AGENTS:
			getAgents().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__TRIGGERS:
			getTriggers().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__OPTIONS:
			getOptions().clear();
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENTS:
			return environments != null && !environments.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__STAGES:
			return stages != null && !stages.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return post != null && !post.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVES:
			return parameter_directives != null && !parameter_directives.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__TOOLS:
			return tools != null && !tools.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__AGENTS:
			return agents != null && !agents.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__OPTIONS:
			return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
