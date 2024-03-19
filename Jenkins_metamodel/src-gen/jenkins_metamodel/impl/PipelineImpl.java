/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Agent;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Parameter_Directive;
import jenkins_metamodel.Pipeline;
import jenkins_metamodel.Post;
import jenkins_metamodel.Stage;
import jenkins_metamodel.Tool;
import jenkins_metamodel.Trigger;

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
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getParameter_directive <em>Parameter directive</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.PipelineImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> stage;

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
	 * The cached value of the '{@link #getParameter_directive() <em>Parameter directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_directive()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter_Directive> parameter_directive;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger trigger;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tool;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

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
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<Stage>(Stage.class, this, Jenkins_metamodelPackage.PIPELINE__STAGE);
		}
		return stage;
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
	public EList<Parameter_Directive> getParameter_directive() {
		if (parameter_directive == null) {
			parameter_directive = new EObjectContainmentEList<Parameter_Directive>(Parameter_Directive.class, this,
					Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE);
		}
		return parameter_directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs) {
		Trigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.PIPELINE__TRIGGER, oldTrigger, newTrigger);
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
	public void setTrigger(Trigger newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject) trigger).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.PIPELINE__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject) newTrigger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Jenkins_metamodelPackage.PIPELINE__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.PIPELINE__TRIGGER,
					newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTool() {
		if (tool == null) {
			tool = new EObjectContainmentEList<Tool>(Tool.class, this, Jenkins_metamodelPackage.PIPELINE__TOOL);
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<Agent>(Agent.class, this, Jenkins_metamodelPackage.PIPELINE__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
			return ((InternalEList<?>) getStage()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
			return ((InternalEList<?>) getParameter_directive()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
			return basicSetTrigger(null, msgs);
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
			return ((InternalEList<?>) getTool()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
			return ((InternalEList<?>) getAgent()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
			return getEnvironment();
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
			return getStage();
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return getPost();
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
			return getParameter_directive();
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
			return getTrigger();
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
			return getTool();
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
			return getAgent();
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends Stage>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Post>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
			getParameter_directive().clear();
			getParameter_directive().addAll((Collection<? extends Parameter_Directive>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
			setTrigger((Trigger) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
			getTool().clear();
			getTool().addAll((Collection<? extends Tool>) newValue);
			return;
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
			getAgent().clear();
			getAgent().addAll((Collection<? extends Agent>) newValue);
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
			getStage().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__POST:
			getPost().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
			getParameter_directive().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
			setTrigger((Trigger) null);
			return;
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
			getTool().clear();
			return;
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
			getAgent().clear();
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
			return stage != null && !stage.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__POST:
			return post != null && !post.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
			return parameter_directive != null && !parameter_directive.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
			return trigger != null;
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
			return tool != null && !tool.isEmpty();
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
			return agent != null && !agent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
