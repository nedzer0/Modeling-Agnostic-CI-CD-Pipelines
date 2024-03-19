/**
 */
package travisCI_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see travisCI_metamodel.TravisCI_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface TravisCI_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "travisCI_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/travisCI_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "travisCI_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TravisCI_metamodelPackage eINSTANCE = travisCI_metamodel.impl.TravisCI_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.OnImpl <em>On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.OnImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getOn()
	 * @generated
	 */
	int ON = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__VALUE = 1;

	/**
	 * The number of structural features of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.BranchImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.DeployImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 15;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__API_KEY = 1;

	/**
	 * The feature id for the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__SKIP_CLEANUP = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__ON = 3;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__SCRIPT = 4;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.RubygemsImpl <em>Rubygems</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.RubygemsImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getRubygems()
	 * @generated
	 */
	int RUBYGEMS = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__PROVIDER = DEPLOY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__API_KEY = DEPLOY__API_KEY;

	/**
	 * The feature id for the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__SKIP_CLEANUP = DEPLOY__SKIP_CLEANUP;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__ON = DEPLOY__ON;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__SCRIPT = DEPLOY__SCRIPT;

	/**
	 * The feature id for the '<em><b>Gem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS__GEM = DEPLOY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rubygems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS_FEATURE_COUNT = DEPLOY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rubygems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBYGEMS_OPERATION_COUNT = DEPLOY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.GitHubImpl <em>Git Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.GitHubImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getGitHub()
	 * @generated
	 */
	int GIT_HUB = 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__PROVIDER = DEPLOY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__API_KEY = DEPLOY__API_KEY;

	/**
	 * The feature id for the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__SKIP_CLEANUP = DEPLOY__SKIP_CLEANUP;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__ON = DEPLOY__ON;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__SCRIPT = DEPLOY__SCRIPT;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__FILE = DEPLOY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_FEATURE_COUNT = DEPLOY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_OPERATION_COUNT = DEPLOY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.HerokuImpl <em>Heroku</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.HerokuImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getHeroku()
	 * @generated
	 */
	int HEROKU = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__PROVIDER = DEPLOY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__API_KEY = DEPLOY__API_KEY;

	/**
	 * The feature id for the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__SKIP_CLEANUP = DEPLOY__SKIP_CLEANUP;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__ON = DEPLOY__ON;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__SCRIPT = DEPLOY__SCRIPT;

	/**
	 * The feature id for the '<em><b>App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU__APP = DEPLOY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heroku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU_FEATURE_COUNT = DEPLOY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heroku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEROKU_OPERATION_COUNT = DEPLOY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.PipelineImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 5;

	/**
	 * The feature id for the '<em><b>Install</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__INSTALL = 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOB = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Pipeline environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__IF = 4;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__BRANCH = 5;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGE = 6;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Allow failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ALLOW_FAILURE = 8;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.EnvironmentImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Env type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ENV_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.Allow_FailureImpl <em>Allow Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.Allow_FailureImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getAllow_Failure()
	 * @generated
	 */
	int ALLOW_FAILURE = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE__IF = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>Allow Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Allow Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FAILURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.ScriptImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 19;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.InstallImpl <em>Install</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.InstallImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getInstall()
	 * @generated
	 */
	int INSTALL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Install</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Install</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.ArtifactImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.ServiceImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.JobImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fast finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FAST_FINISH = 1;

	/**
	 * The feature id for the '<em><b>Stage type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEPLOY = 6;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF = 7;

	/**
	 * The feature id for the '<em><b>Job type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SCRIPT = 10;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.NpmImpl <em>Npm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.NpmImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getNpm()
	 * @generated
	 */
	int NPM = 12;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM__PROVIDER = DEPLOY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM__API_KEY = DEPLOY__API_KEY;

	/**
	 * The feature id for the '<em><b>Skip cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM__SKIP_CLEANUP = DEPLOY__SKIP_CLEANUP;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM__ON = DEPLOY__ON;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM__SCRIPT = DEPLOY__SCRIPT;

	/**
	 * The number of structural features of the '<em>Npm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM_FEATURE_COUNT = DEPLOY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Npm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPM_OPERATION_COUNT = DEPLOY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.LanguageImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.Tool_FrameworkImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getTool_Framework()
	 * @generated
	 */
	int TOOL_FRAMEWORK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.IfImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getIf()
	 * @generated
	 */
	int IF = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.StageImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__IF = 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.impl.ParametersImpl
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 18;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Tool framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__TOOL_FRAMEWORK = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.BRANCH_TYPE
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getBRANCH_TYPE()
	 * @generated
	 */
	int BRANCH_TYPE = 20;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.ENV_TYPE <em>ENV TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.ENV_TYPE
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getENV_TYPE()
	 * @generated
	 */
	int ENV_TYPE = 21;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.STAGE_TYPE <em>STAGE TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.STAGE_TYPE
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getSTAGE_TYPE()
	 * @generated
	 */
	int STAGE_TYPE = 22;

	/**
	 * The meta object id for the '{@link travisCI_metamodel.JOB_TYPE <em>JOB TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see travisCI_metamodel.JOB_TYPE
	 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getJOB_TYPE()
	 * @generated
	 */
	int JOB_TYPE = 23;

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.On <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On</em>'.
	 * @see travisCI_metamodel.On
	 * @generated
	 */
	EClass getOn();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.On#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see travisCI_metamodel.On#getKey()
	 * @see #getOn()
	 * @generated
	 */
	EAttribute getOn_Key();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.On#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see travisCI_metamodel.On#getValue()
	 * @see #getOn()
	 * @generated
	 */
	EAttribute getOn_Value();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see travisCI_metamodel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Branch#getBranch_type <em>Branch type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch type</em>'.
	 * @see travisCI_metamodel.Branch#getBranch_type()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Branch_type();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Rubygems <em>Rubygems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rubygems</em>'.
	 * @see travisCI_metamodel.Rubygems
	 * @generated
	 */
	EClass getRubygems();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Rubygems#getGem <em>Gem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gem</em>'.
	 * @see travisCI_metamodel.Rubygems#getGem()
	 * @see #getRubygems()
	 * @generated
	 */
	EAttribute getRubygems_Gem();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.GitHub <em>Git Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub</em>'.
	 * @see travisCI_metamodel.GitHub
	 * @generated
	 */
	EClass getGitHub();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.GitHub#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see travisCI_metamodel.GitHub#getFile()
	 * @see #getGitHub()
	 * @generated
	 */
	EAttribute getGitHub_File();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Heroku <em>Heroku</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heroku</em>'.
	 * @see travisCI_metamodel.Heroku
	 * @generated
	 */
	EClass getHeroku();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Heroku#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App</em>'.
	 * @see travisCI_metamodel.Heroku#getApp()
	 * @see #getHeroku()
	 * @generated
	 */
	EAttribute getHeroku_App();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see travisCI_metamodel.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getInstall <em>Install</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Install</em>'.
	 * @see travisCI_metamodel.Pipeline#getInstall()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Install();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see travisCI_metamodel.Pipeline#getJob()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Job();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Pipeline#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see travisCI_metamodel.Pipeline#getLanguage()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getPipeline_environment <em>Pipeline environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipeline environment</em>'.
	 * @see travisCI_metamodel.Pipeline#getPipeline_environment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Pipeline_environment();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Pipeline#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see travisCI_metamodel.Pipeline#getIf()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_If();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see travisCI_metamodel.Pipeline#getBranch()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see travisCI_metamodel.Pipeline#getStage()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stage();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Pipeline#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see travisCI_metamodel.Pipeline#getService()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Service();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Pipeline#getAllow_failure <em>Allow failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allow failure</em>'.
	 * @see travisCI_metamodel.Pipeline#getAllow_failure()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Allow_failure();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see travisCI_metamodel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see travisCI_metamodel.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see travisCI_metamodel.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Environment#getEnv_type <em>Env type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env type</em>'.
	 * @see travisCI_metamodel.Environment#getEnv_type()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Env_type();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Allow_Failure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allow Failure</em>'.
	 * @see travisCI_metamodel.Allow_Failure
	 * @generated
	 */
	EClass getAllow_Failure();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Allow_Failure#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see travisCI_metamodel.Allow_Failure#getKey()
	 * @see #getAllow_Failure()
	 * @generated
	 */
	EAttribute getAllow_Failure_Key();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Allow_Failure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see travisCI_metamodel.Allow_Failure#getValue()
	 * @see #getAllow_Failure()
	 * @generated
	 */
	EAttribute getAllow_Failure_Value();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Allow_Failure#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see travisCI_metamodel.Allow_Failure#getIf()
	 * @see #getAllow_Failure()
	 * @generated
	 */
	EReference getAllow_Failure_If();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Allow_Failure#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see travisCI_metamodel.Allow_Failure#getEnvironment()
	 * @see #getAllow_Failure()
	 * @generated
	 */
	EReference getAllow_Failure_Environment();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see travisCI_metamodel.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Script#getTool_framework <em>Tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool framework</em>'.
	 * @see travisCI_metamodel.Script#getTool_framework()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Tool_framework();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Script#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see travisCI_metamodel.Script#getParameters()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Parameters();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Install <em>Install</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install</em>'.
	 * @see travisCI_metamodel.Install
	 * @generated
	 */
	EClass getInstall();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Install#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Install#getName()
	 * @see #getInstall()
	 * @generated
	 */
	EAttribute getInstall_Name();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see travisCI_metamodel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see travisCI_metamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see travisCI_metamodel.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Job#isFast_finish <em>Fast finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast finish</em>'.
	 * @see travisCI_metamodel.Job#isFast_finish()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Fast_finish();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Job#getStage_type <em>Stage type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage type</em>'.
	 * @see travisCI_metamodel.Job#getStage_type()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Stage_type();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Job#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see travisCI_metamodel.Job#getService()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Job#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see travisCI_metamodel.Job#getArtifact()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Artifact();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see travisCI_metamodel.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Job#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deploy</em>'.
	 * @see travisCI_metamodel.Job#getDeploy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Deploy();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Job#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see travisCI_metamodel.Job#getScript()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Script();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Job#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see travisCI_metamodel.Job#getIf()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_If();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Job#getJob_type <em>Job type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job type</em>'.
	 * @see travisCI_metamodel.Job#getJob_type()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Job_type();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Job#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see travisCI_metamodel.Job#getLanguage()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Language();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Npm <em>Npm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Npm</em>'.
	 * @see travisCI_metamodel.Npm
	 * @generated
	 */
	EClass getNpm();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see travisCI_metamodel.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Language#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see travisCI_metamodel.Language#getVersion()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Version();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Tool_Framework <em>Tool Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Framework</em>'.
	 * @see travisCI_metamodel.Tool_Framework
	 * @generated
	 */
	EClass getTool_Framework();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Tool_Framework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Tool_Framework#getName()
	 * @see #getTool_Framework()
	 * @generated
	 */
	EAttribute getTool_Framework_Name();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see travisCI_metamodel.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Deploy#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see travisCI_metamodel.Deploy#getProvider()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Provider();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Deploy#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see travisCI_metamodel.Deploy#getApi_key()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Deploy#isSkip_cleanup <em>Skip cleanup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip cleanup</em>'.
	 * @see travisCI_metamodel.Deploy#isSkip_cleanup()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Skip_cleanup();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Deploy#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script</em>'.
	 * @see travisCI_metamodel.Deploy#getScript()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Script();

	/**
	 * Returns the meta object for the containment reference list '{@link travisCI_metamodel.Deploy#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On</em>'.
	 * @see travisCI_metamodel.Deploy#getOn()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_On();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see travisCI_metamodel.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see travisCI_metamodel.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see travisCI_metamodel.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see travisCI_metamodel.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link travisCI_metamodel.Stage#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see travisCI_metamodel.Stage#getIf()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_If();

	/**
	 * Returns the meta object for class '{@link travisCI_metamodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see travisCI_metamodel.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link travisCI_metamodel.Parameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see travisCI_metamodel.Parameters#getParameter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Parameter();

	/**
	 * Returns the meta object for enum '{@link travisCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BRANCH TYPE</em>'.
	 * @see travisCI_metamodel.BRANCH_TYPE
	 * @generated
	 */
	EEnum getBRANCH_TYPE();

	/**
	 * Returns the meta object for enum '{@link travisCI_metamodel.ENV_TYPE <em>ENV TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENV TYPE</em>'.
	 * @see travisCI_metamodel.ENV_TYPE
	 * @generated
	 */
	EEnum getENV_TYPE();

	/**
	 * Returns the meta object for enum '{@link travisCI_metamodel.STAGE_TYPE <em>STAGE TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STAGE TYPE</em>'.
	 * @see travisCI_metamodel.STAGE_TYPE
	 * @generated
	 */
	EEnum getSTAGE_TYPE();

	/**
	 * Returns the meta object for enum '{@link travisCI_metamodel.JOB_TYPE <em>JOB TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JOB TYPE</em>'.
	 * @see travisCI_metamodel.JOB_TYPE
	 * @generated
	 */
	EEnum getJOB_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TravisCI_metamodelFactory getTravisCI_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.OnImpl <em>On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.OnImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getOn()
		 * @generated
		 */
		EClass ON = eINSTANCE.getOn();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON__KEY = eINSTANCE.getOn_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON__VALUE = eINSTANCE.getOn_Value();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.BranchImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Branch type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_TYPE = eINSTANCE.getBranch_Branch_type();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.RubygemsImpl <em>Rubygems</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.RubygemsImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getRubygems()
		 * @generated
		 */
		EClass RUBYGEMS = eINSTANCE.getRubygems();

		/**
		 * The meta object literal for the '<em><b>Gem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBYGEMS__GEM = eINSTANCE.getRubygems_Gem();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.GitHubImpl <em>Git Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.GitHubImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getGitHub()
		 * @generated
		 */
		EClass GIT_HUB = eINSTANCE.getGitHub();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB__FILE = eINSTANCE.getGitHub_File();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.HerokuImpl <em>Heroku</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.HerokuImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getHeroku()
		 * @generated
		 */
		EClass HEROKU = eINSTANCE.getHeroku();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEROKU__APP = eINSTANCE.getHeroku_App();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.PipelineImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Install</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__INSTALL = eINSTANCE.getPipeline_Install();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOB = eINSTANCE.getPipeline_Job();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__LANGUAGE = eINSTANCE.getPipeline_Language();

		/**
		 * The meta object literal for the '<em><b>Pipeline environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_ENVIRONMENT = eINSTANCE.getPipeline_Pipeline_environment();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__IF = eINSTANCE.getPipeline_If();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__BRANCH = eINSTANCE.getPipeline_Branch();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGE = eINSTANCE.getPipeline_Stage();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SERVICE = eINSTANCE.getPipeline_Service();

		/**
		 * The meta object literal for the '<em><b>Allow failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ALLOW_FAILURE = eINSTANCE.getPipeline_Allow_failure();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.EnvironmentImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__KEY = eINSTANCE.getEnvironment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__VALUE = eINSTANCE.getEnvironment_Value();

		/**
		 * The meta object literal for the '<em><b>Env type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__ENV_TYPE = eINSTANCE.getEnvironment_Env_type();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.Allow_FailureImpl <em>Allow Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.Allow_FailureImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getAllow_Failure()
		 * @generated
		 */
		EClass ALLOW_FAILURE = eINSTANCE.getAllow_Failure();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOW_FAILURE__KEY = eINSTANCE.getAllow_Failure_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOW_FAILURE__VALUE = eINSTANCE.getAllow_Failure_Value();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOW_FAILURE__IF = eINSTANCE.getAllow_Failure_If();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOW_FAILURE__ENVIRONMENT = eINSTANCE.getAllow_Failure_Environment();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.ScriptImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Tool framework</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__TOOL_FRAMEWORK = eINSTANCE.getScript_Tool_framework();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__PARAMETERS = eINSTANCE.getScript_Parameters();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.InstallImpl <em>Install</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.InstallImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getInstall()
		 * @generated
		 */
		EClass INSTALL = eINSTANCE.getInstall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALL__NAME = eINSTANCE.getInstall_Name();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.ArtifactImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.ServiceImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.JobImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Fast finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__FAST_FINISH = eINSTANCE.getJob_Fast_finish();

		/**
		 * The meta object literal for the '<em><b>Stage type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STAGE_TYPE = eINSTANCE.getJob_Stage_type();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SERVICE = eINSTANCE.getJob_Service();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ARTIFACT = eINSTANCE.getJob_Artifact();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEPLOY = eINSTANCE.getJob_Deploy();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SCRIPT = eINSTANCE.getJob_Script();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IF = eINSTANCE.getJob_If();

		/**
		 * The meta object literal for the '<em><b>Job type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_TYPE = eINSTANCE.getJob_Job_type();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__LANGUAGE = eINSTANCE.getJob_Language();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.NpmImpl <em>Npm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.NpmImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getNpm()
		 * @generated
		 */
		EClass NPM = eINSTANCE.getNpm();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.LanguageImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__VERSION = eINSTANCE.getLanguage_Version();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.Tool_FrameworkImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getTool_Framework()
		 * @generated
		 */
		EClass TOOL_FRAMEWORK = eINSTANCE.getTool_Framework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_FRAMEWORK__NAME = eINSTANCE.getTool_Framework_Name();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.DeployImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PROVIDER = eINSTANCE.getDeploy_Provider();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__API_KEY = eINSTANCE.getDeploy_Api_key();

		/**
		 * The meta object literal for the '<em><b>Skip cleanup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__SKIP_CLEANUP = eINSTANCE.getDeploy_Skip_cleanup();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__SCRIPT = eINSTANCE.getDeploy_Script();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__ON = eINSTANCE.getDeploy_On();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.IfImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.StageImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__IF = eINSTANCE.getStage_If();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.impl.ParametersImpl
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__PARAMETER = eINSTANCE.getParameters_Parameter();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.BRANCH_TYPE
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getBRANCH_TYPE()
		 * @generated
		 */
		EEnum BRANCH_TYPE = eINSTANCE.getBRANCH_TYPE();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.ENV_TYPE <em>ENV TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.ENV_TYPE
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getENV_TYPE()
		 * @generated
		 */
		EEnum ENV_TYPE = eINSTANCE.getENV_TYPE();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.STAGE_TYPE <em>STAGE TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.STAGE_TYPE
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getSTAGE_TYPE()
		 * @generated
		 */
		EEnum STAGE_TYPE = eINSTANCE.getSTAGE_TYPE();

		/**
		 * The meta object literal for the '{@link travisCI_metamodel.JOB_TYPE <em>JOB TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see travisCI_metamodel.JOB_TYPE
		 * @see travisCI_metamodel.impl.TravisCI_metamodelPackageImpl#getJOB_TYPE()
		 * @generated
		 */
		EEnum JOB_TYPE = eINSTANCE.getJOB_TYPE();

	}

} //TravisCI_metamodelPackage
