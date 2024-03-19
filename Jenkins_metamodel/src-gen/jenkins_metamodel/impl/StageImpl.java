/**
 */
package jenkins_metamodel.impl;

import java.util.Collection;

import jenkins_metamodel.Agent;
import jenkins_metamodel.Environment;
import jenkins_metamodel.Input;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Post;
import jenkins_metamodel.Stage;
import jenkins_metamodel.Step;
import jenkins_metamodel.Tool;
import jenkins_metamodel.When;

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
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getName <em>Name</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getPost <em>Post</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getStep <em>Step</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getInput <em>Input</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#getWhen <em>When</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.StageImpl#isParallel <em>Parallel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

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
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

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
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tool;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

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
	 * The default value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_FAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected boolean failFast = FAIL_FAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getStage() {
		if (stage == null) {
			stage = new EObjectContainmentEList<Stage>(Stage.class, this, Jenkins_metamodelPackage.STAGE__STAGE);
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<Agent>(Agent.class, this, Jenkins_metamodelPackage.STAGE__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Post> getPost() {
		if (post == null) {
			post = new EObjectContainmentEList<Post>(Post.class, this, Jenkins_metamodelPackage.STAGE__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, Jenkins_metamodelPackage.STAGE__STEP);
		}
		return step;
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
					Jenkins_metamodelPackage.STAGE__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool> getTool() {
		if (tool == null) {
			tool = new EObjectContainmentEList<Tool>(Tool.class, this, Jenkins_metamodelPackage.STAGE__TOOL);
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this, Jenkins_metamodelPackage.STAGE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<When>(When.class, this, Jenkins_metamodelPackage.STAGE__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFailFast() {
		return failFast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailFast(boolean newFailFast) {
		boolean oldFailFast = failFast;
		failFast = newFailFast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__FAIL_FAST,
					oldFailFast, failFast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallel(boolean newParallel) {
		boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.STAGE__PARALLEL, oldParallel,
					parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Jenkins_metamodelPackage.STAGE__STAGE:
			return ((InternalEList<?>) getStage()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__AGENT:
			return ((InternalEList<?>) getAgent()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__POST:
			return ((InternalEList<?>) getPost()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__TOOL:
			return ((InternalEList<?>) getTool()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return ((InternalEList<?>) getWhen()).basicRemove(otherEnd, msgs);
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
		case Jenkins_metamodelPackage.STAGE__NAME:
			return getName();
		case Jenkins_metamodelPackage.STAGE__STAGE:
			return getStage();
		case Jenkins_metamodelPackage.STAGE__AGENT:
			return getAgent();
		case Jenkins_metamodelPackage.STAGE__POST:
			return getPost();
		case Jenkins_metamodelPackage.STAGE__STEP:
			return getStep();
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
			return getEnvironment();
		case Jenkins_metamodelPackage.STAGE__TOOL:
			return getTool();
		case Jenkins_metamodelPackage.STAGE__INPUT:
			return getInput();
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return getWhen();
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			return isFailFast();
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			return isParallel();
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
		case Jenkins_metamodelPackage.STAGE__NAME:
			setName((String) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__STAGE:
			getStage().clear();
			getStage().addAll((Collection<? extends Stage>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__AGENT:
			getAgent().clear();
			getAgent().addAll((Collection<? extends Agent>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__POST:
			getPost().clear();
			getPost().addAll((Collection<? extends Post>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__TOOL:
			getTool().clear();
			getTool().addAll((Collection<? extends Tool>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__WHEN:
			getWhen().clear();
			getWhen().addAll((Collection<? extends When>) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			setFailFast((Boolean) newValue);
			return;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			setParallel((Boolean) newValue);
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
		case Jenkins_metamodelPackage.STAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.STAGE__STAGE:
			getStage().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__AGENT:
			getAgent().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__POST:
			getPost().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__STEP:
			getStep().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__TOOL:
			getTool().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__INPUT:
			getInput().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__WHEN:
			getWhen().clear();
			return;
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			setFailFast(FAIL_FAST_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			setParallel(PARALLEL_EDEFAULT);
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
		case Jenkins_metamodelPackage.STAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Jenkins_metamodelPackage.STAGE__STAGE:
			return stage != null && !stage.isEmpty();
		case Jenkins_metamodelPackage.STAGE__AGENT:
			return agent != null && !agent.isEmpty();
		case Jenkins_metamodelPackage.STAGE__POST:
			return post != null && !post.isEmpty();
		case Jenkins_metamodelPackage.STAGE__STEP:
			return step != null && !step.isEmpty();
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case Jenkins_metamodelPackage.STAGE__TOOL:
			return tool != null && !tool.isEmpty();
		case Jenkins_metamodelPackage.STAGE__INPUT:
			return input != null && !input.isEmpty();
		case Jenkins_metamodelPackage.STAGE__WHEN:
			return when != null && !when.isEmpty();
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
			return failFast != FAIL_FAST_EDEFAULT;
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			return parallel != PARALLEL_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", failFast: ");
		result.append(failFast);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(')');
		return result.toString();
	}

} //StageImpl
