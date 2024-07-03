/**
 */
package jenkins_metamodel.impl;

import jenkins_metamodel.Dockerfile;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getAdditionalBuildArgs <em>Additional Build Args</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getRegistryUrl <em>Registry Url</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getCustomWorkspace <em>Custom Workspace</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getReuseNode <em>Reuse Node</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link jenkins_metamodel.impl.DockerfileImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerfileImpl extends AgentImpl implements Dockerfile {
	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected String dir = DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalBuildArgs() <em>Additional Build Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalBuildArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_BUILD_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalBuildArgs() <em>Additional Build Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalBuildArgs()
	 * @generated
	 * @ordered
	 */
	protected String additionalBuildArgs = ADDITIONAL_BUILD_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryUrl() <em>Registry Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryUrl() <em>Registry Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryUrl()
	 * @generated
	 * @ordered
	 */
	protected String registryUrl = REGISTRY_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_CREDENTIALS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected String registryCredentialsId = REGISTRY_CREDENTIALS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomWorkspace() <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomWorkspace()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_WORKSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomWorkspace() <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomWorkspace()
	 * @generated
	 * @ordered
	 */
	protected String customWorkspace = CUSTOM_WORKSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReuseNode() <em>Reuse Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseNode()
	 * @generated
	 * @ordered
	 */
	protected static final String REUSE_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReuseNode() <em>Reuse Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseNode()
	 * @generated
	 * @ordered
	 */
	protected String reuseNode = REUSE_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Jenkins_metamodelPackage.Literals.DOCKERFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(String newDir) {
		String oldDir = dir;
		dir = newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__DIR, oldDir,
					dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalBuildArgs() {
		return additionalBuildArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalBuildArgs(String newAdditionalBuildArgs) {
		String oldAdditionalBuildArgs = additionalBuildArgs;
		additionalBuildArgs = newAdditionalBuildArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS, oldAdditionalBuildArgs,
					additionalBuildArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryUrl() {
		return registryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryUrl(String newRegistryUrl) {
		String oldRegistryUrl = registryUrl;
		registryUrl = newRegistryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL,
					oldRegistryUrl, registryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryCredentialsId() {
		return registryCredentialsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryCredentialsId(String newRegistryCredentialsId) {
		String oldRegistryCredentialsId = registryCredentialsId;
		registryCredentialsId = newRegistryCredentialsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID, oldRegistryCredentialsId,
					registryCredentialsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomWorkspace() {
		return customWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomWorkspace(String newCustomWorkspace) {
		String oldCustomWorkspace = customWorkspace;
		customWorkspace = newCustomWorkspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE,
					oldCustomWorkspace, customWorkspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReuseNode() {
		return reuseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReuseNode(String newReuseNode) {
		String oldReuseNode = reuseNode;
		reuseNode = newReuseNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE,
					oldReuseNode, reuseNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__ARGS, oldArgs,
					args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Jenkins_metamodelPackage.DOCKERFILE__FILENAME,
					oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Jenkins_metamodelPackage.DOCKERFILE__DIR:
			return getDir();
		case Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS:
			return getAdditionalBuildArgs();
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL:
			return getRegistryUrl();
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID:
			return getRegistryCredentialsId();
		case Jenkins_metamodelPackage.DOCKERFILE__LABEL:
			return getLabel();
		case Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE:
			return getCustomWorkspace();
		case Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE:
			return getReuseNode();
		case Jenkins_metamodelPackage.DOCKERFILE__ARGS:
			return getArgs();
		case Jenkins_metamodelPackage.DOCKERFILE__FILENAME:
			return getFilename();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Jenkins_metamodelPackage.DOCKERFILE__DIR:
			setDir((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS:
			setAdditionalBuildArgs((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL:
			setRegistryUrl((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__LABEL:
			setLabel((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE:
			setCustomWorkspace((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE:
			setReuseNode((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__ARGS:
			setArgs((String) newValue);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__FILENAME:
			setFilename((String) newValue);
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
		case Jenkins_metamodelPackage.DOCKERFILE__DIR:
			setDir(DIR_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS:
			setAdditionalBuildArgs(ADDITIONAL_BUILD_ARGS_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL:
			setRegistryUrl(REGISTRY_URL_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId(REGISTRY_CREDENTIALS_ID_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE:
			setCustomWorkspace(CUSTOM_WORKSPACE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE:
			setReuseNode(REUSE_NODE_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__ARGS:
			setArgs(ARGS_EDEFAULT);
			return;
		case Jenkins_metamodelPackage.DOCKERFILE__FILENAME:
			setFilename(FILENAME_EDEFAULT);
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
		case Jenkins_metamodelPackage.DOCKERFILE__DIR:
			return DIR_EDEFAULT == null ? dir != null : !DIR_EDEFAULT.equals(dir);
		case Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS:
			return ADDITIONAL_BUILD_ARGS_EDEFAULT == null ? additionalBuildArgs != null
					: !ADDITIONAL_BUILD_ARGS_EDEFAULT.equals(additionalBuildArgs);
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL:
			return REGISTRY_URL_EDEFAULT == null ? registryUrl != null : !REGISTRY_URL_EDEFAULT.equals(registryUrl);
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID:
			return REGISTRY_CREDENTIALS_ID_EDEFAULT == null ? registryCredentialsId != null
					: !REGISTRY_CREDENTIALS_ID_EDEFAULT.equals(registryCredentialsId);
		case Jenkins_metamodelPackage.DOCKERFILE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE:
			return CUSTOM_WORKSPACE_EDEFAULT == null ? customWorkspace != null
					: !CUSTOM_WORKSPACE_EDEFAULT.equals(customWorkspace);
		case Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE:
			return REUSE_NODE_EDEFAULT == null ? reuseNode != null : !REUSE_NODE_EDEFAULT.equals(reuseNode);
		case Jenkins_metamodelPackage.DOCKERFILE__ARGS:
			return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
		case Jenkins_metamodelPackage.DOCKERFILE__FILENAME:
			return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
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
		result.append(" (dir: ");
		result.append(dir);
		result.append(", additionalBuildArgs: ");
		result.append(additionalBuildArgs);
		result.append(", registryUrl: ");
		result.append(registryUrl);
		result.append(", registryCredentialsId: ");
		result.append(registryCredentialsId);
		result.append(", label: ");
		result.append(label);
		result.append(", customWorkspace: ");
		result.append(customWorkspace);
		result.append(", reuseNode: ");
		result.append(reuseNode);
		result.append(", args: ");
		result.append(args);
		result.append(", filename: ");
		result.append(filename);
		result.append(')');
		return result.toString();
	}

} //DockerfileImpl
