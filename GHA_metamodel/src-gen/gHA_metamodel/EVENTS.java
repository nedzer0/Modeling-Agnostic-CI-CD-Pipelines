/**
 */
package gHA_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EVENTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gHA_metamodel.GHA_metamodelPackage#getEVENTS()
 * @model
 * @generated
 */
public enum EVENTS implements Enumerator {
	/**
	 * The '<em><b>BRANCH PROTECTION RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_PROTECTION_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	BRANCH_PROTECTION_RULE(0, "BRANCH_PROTECTION_RULE", "branch_protection_rule"),

	/**
	 * The '<em><b>CHECK RUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_RUN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_RUN(1, "CHECK_RUN", "check_run"),

	/**
	 * The '<em><b>CHECK SUITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_SUITE_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_SUITE(2, "CHECK_SUITE", "check_suite"),

	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(3, "CREATE", "create"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(4, "DELETE", "delete"),

	/**
	 * The '<em><b>DEPLOYMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(5, "DEPLOYMENT", "deployment"),

	/**
	 * The '<em><b>DEPLOYMENT STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_STATUS(6, "DEPLOYMENT_STATUS", "deployment_status"),

	/**
	 * The '<em><b>DISCUSSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION_VALUE
	 * @generated
	 * @ordered
	 */
	DISCUSSION(7, "DISCUSSION", "discussion"),

	/**
	 * The '<em><b>DISCUSSION COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCUSSION_COMMENT(8, "DISCUSSION_COMMENT", "discussion_comment"),

	/**
	 * The '<em><b>FORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_VALUE
	 * @generated
	 * @ordered
	 */
	FORK(9, "FORK", "fork"),

	/**
	 * The '<em><b>GOLLUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLLUM_VALUE
	 * @generated
	 * @ordered
	 */
	GOLLUM(10, "GOLLUM", "gollum"),

	/**
	 * The '<em><b>ISSUE COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUE_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUE_COMMENT(11, "ISSUE_COMMENT", "issue_comment"),

	/**
	 * The '<em><b>ISSUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUES_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUES(12, "ISSUES", "issues"),

	/**
	 * The '<em><b>LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(13, "LABEL", "label"),

	/**
	 * The '<em><b>MERGE GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_GROUP(14, "MERGE_GROUP", "merge_group"),

	/**
	 * The '<em><b>MILESTONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONE_VALUE
	 * @generated
	 * @ordered
	 */
	MILESTONE(15, "MILESTONE", "milestone"),

	/**
	 * The '<em><b>PAGE BUILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_BUILD(16, "PAGE_BUILD", "page_build"),

	/**
	 * The '<em><b>PROJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT(17, "PROJECT", "project"),

	/**
	 * The '<em><b>PROJECT CARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT_CARD(18, "PROJECT_CARD", "project_card"),

	/**
	 * The '<em><b>PROJECT COLUMN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT_COLUMN(19, "PROJECT_COLUMN", "project_column"),

	/**
	 * The '<em><b>PUBLIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(20, "PUBLIC", "public"),

	/**
	 * The '<em><b>PULL REQUEST REVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_REQUEST_REVIEW(21, "PULL_REQUEST_REVIEW", "pull_request_review"),

	/**
	 * The '<em><b>PULL REQUEST REVIEW COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_REQUEST_REVIEW_COMMENT(22, "PULL_REQUEST_REVIEW_COMMENT", "pull_request_review_comment"),

	/**
	 * The '<em><b>REGISTRY PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTRY_PACKAGE(23, "REGISTRY_PACKAGE", "registry_package"),

	/**
	 * The '<em><b>RELEASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE(24, "RELEASE", "release"),

	/**
	 * The '<em><b>REPOSITORY DISPATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_DISPATCH_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY_DISPATCH(25, "REPOSITORY_DISPATCH", "repository_dispatch"),

	/**
	 * The '<em><b>STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS(26, "STATUS", "status"),

	/**
	 * The '<em><b>WATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATCH_VALUE
	 * @generated
	 * @ordered
	 */
	WATCH(27, "WATCH", "watch"),

	/**
	 * The '<em><b>BRANCH PROTECTION CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_PROTECTION_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	BRANCH_PROTECTION_CONFIGURATION(28, "BRANCH_PROTECTION_CONFIGURATION", "branch_protection_configuration"),

	/**
	 * The '<em><b>CODE SCANNING ALERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SCANNING_ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SCANNING_ALERT(29, "CODE_SCANNING_ALERT", "code_scanning_alert"),

	/**
	 * The '<em><b>COMMIT COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMIT_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMIT_COMMENT(30, "COMMIT_COMMENT", "commit_comment"),

	/**
	 * The '<em><b>CUSTOM PROPERTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_PROPERTY(31, "CUSTOM_PROPERTY", "custom_property"),

	/**
	 * The '<em><b>CUSTOM PROPERTY VALUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROPERTY_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_PROPERTY_VALUES(32, "CUSTOM_PROPERTY_VALUES", "custom_property_values"),

	/**
	 * The '<em><b>DEPENDABOT ALERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDABOT_ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDABOT_ALERT(33, "DEPENDABOT_ALERT", "dependabot_alert"),

	/**
	 * The '<em><b>DEPLOY KEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOY_KEY(34, "DEPLOY_KEY", "deploy_key"),

	/**
	 * The '<em><b>DEPLOYMENT PROTECTION RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_PROTECTION_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_PROTECTION_RULE(35, "DEPLOYMENT_PROTECTION_RULE", "deployment_protection_rule"),

	/**
	 * The '<em><b>DEPLOYMENT REVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_REVIEW(36, "DEPLOYMENT_REVIEW", "deployment_review"),

	/**
	 * The '<em><b>GITHUB APP AUTHORIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITHUB_APP_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	GITHUB_APP_AUTHORIZATION(38, "GITHUB_APP_AUTHORIZATION", "github_app_authorization"),

	/**
	 * The '<em><b>INSTALLATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION(39, "INSTALLATION", "installation"),

	/**
	 * The '<em><b>INSTALLATION REPOSITORIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_REPOSITORIES_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION_REPOSITORIES(40, "INSTALLATION_REPOSITORIES", "installation_repositories"),

	/**
	 * The '<em><b>INSTALLATION TARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION_TARGET(41, "INSTALLATION_TARGET", "installation_target"),

	/**
	 * The '<em><b>MARKETPLACE PURCHASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETPLACE_PURCHASE_VALUE
	 * @generated
	 * @ordered
	 */
	MARKETPLACE_PURCHASE(42, "MARKETPLACE_PURCHASE", "marketplace_purchase"),

	/**
	 * The '<em><b>MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER(43, "MEMBER", "member"),

	/**
	 * The '<em><b>MEMBERSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP(44, "MEMBERSHIP", "membership"),

	/**
	 * The '<em><b>META</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(45, "META", "meta"),

	/**
	 * The '<em><b>ORG BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORG_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	ORG_BLOCK(46, "ORG_BLOCK", "org_block"),

	/**
	 * The '<em><b>ORGANIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(47, "ORGANIZATION", "organization"),

	/**
	 * The '<em><b>PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE(48, "PACKAGE", "package"),

	/**
	 * The '<em><b>PERSONAL ACCESS TOKEN REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACCESS_TOKEN_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_ACCESS_TOKEN_REQUEST(50, "PERSONAL_ACCESS_TOKEN_REQUEST", "personal_access_token_request"),

	/**
	 * The '<em><b>PING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PING_VALUE
	 * @generated
	 * @ordered
	 */
	PING(51, "PING", "ping"),

	/**
	 * The '<em><b>PROJECTS V2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTS_V2_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECTS_V2(52, "PROJECTS_V2", "projects_v2"),

	/**
	 * The '<em><b>PROJECTS V2 ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTS_V2_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECTS_V2_ITEM(53, "PROJECTS_V2_ITEM", "projects_v2_item"),

	/**
	 * The '<em><b>PULL REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_REQUEST(54, "PULL_REQUEST", "pull_request"),

	/**
	 * The '<em><b>PULL REQUEST REVIEW THREAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW_THREAD_VALUE
	 * @generated
	 * @ordered
	 */
	PULL_REQUEST_REVIEW_THREAD(55, "PULL_REQUEST_REVIEW_THREAD", "pull_request_review_thread"),

	/**
	 * The '<em><b>PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(56, "PUSH", "push"),

	/**
	 * The '<em><b>REPOSITORY ADVISORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_ADVISORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY_ADVISORY(57, "REPOSITORY_ADVISORY", "repository_advisory"),

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY(58, "REPOSITORY", "repository"),

	/**
	 * The '<em><b>REPOSITORY IMPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY_IMPORT(59, "REPOSITORY_IMPORT", "repository_import"),

	/**
	 * The '<em><b>REPOSITORY RULESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_RULESET_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY_RULESET(60, "REPOSITORY_RULESET", "repository_ruleset"),

	/**
	 * The '<em><b>REPOSITORY VULNERABILITY ALERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_VULNERABILITY_ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY_VULNERABILITY_ALERT(61, "REPOSITORY_VULNERABILITY_ALERT", "repository_vulnerability_alert"),

	/**
	 * The '<em><b>SECRET SCANNING ALERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_SCANNING_ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET_SCANNING_ALERT(62, "SECRET_SCANNING_ALERT", "secret_scanning_alert"),

	/**
	 * The '<em><b>SECRET SCANNING ALERT LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_SCANNING_ALERT_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET_SCANNING_ALERT_LOCATION(63, "SECRET_SCANNING_ALERT_LOCATION", "secret_scanning_alert_location"),

	/**
	 * The '<em><b>SECURITY ADVISORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_ADVISORY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_ADVISORY(64, "SECURITY_ADVISORY", "security_advisory"),

	/**
	 * The '<em><b>SECURITY AND ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_AND_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_AND_ANALYSIS(65, "SECURITY_AND_ANALYSIS", "security_and_analysis"),

	/**
	 * The '<em><b>SPONSORSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONSORSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SPONSORSHIP(66, "SPONSORSHIP", "sponsorship"),

	/**
	 * The '<em><b>STAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR_VALUE
	 * @generated
	 * @ordered
	 */
	STAR(67, "STAR", "star"),

	/**
	 * The '<em><b>TEAM ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	TEAM_ADD(68, "TEAM_ADD", "team_add"),

	/**
	 * The '<em><b>TEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	TEAM(69, "TEAM", "team"),

	/**
	 * The '<em><b>WORKFLOW JOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_JOB_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_JOB(70, "WORKFLOW_JOB", "workflow_job");

	/**
	 * The '<em><b>BRANCH PROTECTION RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_PROTECTION_RULE
	 * @model literal="branch_protection_rule"
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_PROTECTION_RULE_VALUE = 0;

	/**
	 * The '<em><b>CHECK RUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_RUN
	 * @model literal="check_run"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_RUN_VALUE = 1;

	/**
	 * The '<em><b>CHECK SUITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_SUITE
	 * @model literal="check_suite"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_SUITE_VALUE = 2;

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model literal="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 3;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model literal="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 4;

	/**
	 * The '<em><b>DEPLOYMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model literal="deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 5;

	/**
	 * The '<em><b>DEPLOYMENT STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_STATUS
	 * @model literal="deployment_status"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_STATUS_VALUE = 6;

	/**
	 * The '<em><b>DISCUSSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION
	 * @model literal="discussion"
	 * @generated
	 * @ordered
	 */
	public static final int DISCUSSION_VALUE = 7;

	/**
	 * The '<em><b>DISCUSSION COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION_COMMENT
	 * @model literal="discussion_comment"
	 * @generated
	 * @ordered
	 */
	public static final int DISCUSSION_COMMENT_VALUE = 8;

	/**
	 * The '<em><b>FORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @model literal="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK_VALUE = 9;

	/**
	 * The '<em><b>GOLLUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLLUM
	 * @model literal="gollum"
	 * @generated
	 * @ordered
	 */
	public static final int GOLLUM_VALUE = 10;

	/**
	 * The '<em><b>ISSUE COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUE_COMMENT
	 * @model literal="issue_comment"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUE_COMMENT_VALUE = 11;

	/**
	 * The '<em><b>ISSUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUES
	 * @model literal="issues"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUES_VALUE = 12;

	/**
	 * The '<em><b>LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model literal="label"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 13;

	/**
	 * The '<em><b>MERGE GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_GROUP
	 * @model literal="merge_group"
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_GROUP_VALUE = 14;

	/**
	 * The '<em><b>MILESTONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONE
	 * @model literal="milestone"
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE_VALUE = 15;

	/**
	 * The '<em><b>PAGE BUILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_BUILD
	 * @model literal="page_build"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_BUILD_VALUE = 16;

	/**
	 * The '<em><b>PROJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT
	 * @model literal="project"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_VALUE = 17;

	/**
	 * The '<em><b>PROJECT CARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_CARD
	 * @model literal="project_card"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_CARD_VALUE = 18;

	/**
	 * The '<em><b>PROJECT COLUMN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_COLUMN
	 * @model literal="project_column"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_COLUMN_VALUE = 19;

	/**
	 * The '<em><b>PUBLIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @model literal="public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 20;

	/**
	 * The '<em><b>PULL REQUEST REVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW
	 * @model literal="pull_request_review"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_REQUEST_REVIEW_VALUE = 21;

	/**
	 * The '<em><b>PULL REQUEST REVIEW COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW_COMMENT
	 * @model literal="pull_request_review_comment"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_REQUEST_REVIEW_COMMENT_VALUE = 22;

	/**
	 * The '<em><b>REGISTRY PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_PACKAGE
	 * @model literal="registry_package"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_PACKAGE_VALUE = 23;

	/**
	 * The '<em><b>RELEASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE
	 * @model literal="release"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_VALUE = 24;

	/**
	 * The '<em><b>REPOSITORY DISPATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_DISPATCH
	 * @model literal="repository_dispatch"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_DISPATCH_VALUE = 25;

	/**
	 * The '<em><b>STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS
	 * @model literal="status"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE = 26;

	/**
	 * The '<em><b>WATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATCH
	 * @model literal="watch"
	 * @generated
	 * @ordered
	 */
	public static final int WATCH_VALUE = 27;

	/**
	 * The '<em><b>BRANCH PROTECTION CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_PROTECTION_CONFIGURATION
	 * @model literal="branch_protection_configuration"
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_PROTECTION_CONFIGURATION_VALUE = 28;

	/**
	 * The '<em><b>CODE SCANNING ALERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SCANNING_ALERT
	 * @model literal="code_scanning_alert"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SCANNING_ALERT_VALUE = 29;

	/**
	 * The '<em><b>COMMIT COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMIT_COMMENT
	 * @model literal="commit_comment"
	 * @generated
	 * @ordered
	 */
	public static final int COMMIT_COMMENT_VALUE = 30;

	/**
	 * The '<em><b>CUSTOM PROPERTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROPERTY
	 * @model literal="custom_property"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_PROPERTY_VALUE = 31;

	/**
	 * The '<em><b>CUSTOM PROPERTY VALUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROPERTY_VALUES
	 * @model literal="custom_property_values"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_PROPERTY_VALUES_VALUE = 32;

	/**
	 * The '<em><b>DEPENDABOT ALERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDABOT_ALERT
	 * @model literal="dependabot_alert"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDABOT_ALERT_VALUE = 33;

	/**
	 * The '<em><b>DEPLOY KEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOY_KEY
	 * @model literal="deploy_key"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOY_KEY_VALUE = 34;

	/**
	 * The '<em><b>DEPLOYMENT PROTECTION RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_PROTECTION_RULE
	 * @model literal="deployment_protection_rule"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_PROTECTION_RULE_VALUE = 35;

	/**
	 * The '<em><b>DEPLOYMENT REVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_REVIEW
	 * @model literal="deployment_review"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_REVIEW_VALUE = 36;

	/**
	 * The '<em><b>GITHUB APP AUTHORIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GITHUB_APP_AUTHORIZATION
	 * @model literal="github_app_authorization"
	 * @generated
	 * @ordered
	 */
	public static final int GITHUB_APP_AUTHORIZATION_VALUE = 38;

	/**
	 * The '<em><b>INSTALLATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION
	 * @model literal="installation"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_VALUE = 39;

	/**
	 * The '<em><b>INSTALLATION REPOSITORIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_REPOSITORIES
	 * @model literal="installation_repositories"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_REPOSITORIES_VALUE = 40;

	/**
	 * The '<em><b>INSTALLATION TARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_TARGET
	 * @model literal="installation_target"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_TARGET_VALUE = 41;

	/**
	 * The '<em><b>MARKETPLACE PURCHASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETPLACE_PURCHASE
	 * @model literal="marketplace_purchase"
	 * @generated
	 * @ordered
	 */
	public static final int MARKETPLACE_PURCHASE_VALUE = 42;

	/**
	 * The '<em><b>MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER
	 * @model literal="member"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_VALUE = 43;

	/**
	 * The '<em><b>MEMBERSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP
	 * @model literal="membership"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_VALUE = 44;

	/**
	 * The '<em><b>META</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META
	 * @model literal="meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 45;

	/**
	 * The '<em><b>ORG BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORG_BLOCK
	 * @model literal="org_block"
	 * @generated
	 * @ordered
	 */
	public static final int ORG_BLOCK_VALUE = 46;

	/**
	 * The '<em><b>ORGANIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION
	 * @model literal="organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 47;

	/**
	 * The '<em><b>PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @model literal="package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_VALUE = 48;

	/**
	 * The '<em><b>PERSONAL ACCESS TOKEN REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACCESS_TOKEN_REQUEST
	 * @model literal="personal_access_token_request"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_ACCESS_TOKEN_REQUEST_VALUE = 50;

	/**
	 * The '<em><b>PING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PING
	 * @model literal="ping"
	 * @generated
	 * @ordered
	 */
	public static final int PING_VALUE = 51;

	/**
	 * The '<em><b>PROJECTS V2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTS_V2
	 * @model literal="projects_v2"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECTS_V2_VALUE = 52;

	/**
	 * The '<em><b>PROJECTS V2 ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTS_V2_ITEM
	 * @model literal="projects_v2_item"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECTS_V2_ITEM_VALUE = 53;

	/**
	 * The '<em><b>PULL REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST
	 * @model literal="pull_request"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_REQUEST_VALUE = 54;

	/**
	 * The '<em><b>PULL REQUEST REVIEW THREAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_REQUEST_REVIEW_THREAD
	 * @model literal="pull_request_review_thread"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_REQUEST_REVIEW_THREAD_VALUE = 55;

	/**
	 * The '<em><b>PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model literal="push"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 56;

	/**
	 * The '<em><b>REPOSITORY ADVISORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_ADVISORY
	 * @model literal="repository_advisory"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_ADVISORY_VALUE = 57;

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY
	 * @model literal="repository"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VALUE = 58;

	/**
	 * The '<em><b>REPOSITORY IMPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_IMPORT
	 * @model literal="repository_import"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_IMPORT_VALUE = 59;

	/**
	 * The '<em><b>REPOSITORY RULESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_RULESET
	 * @model literal="repository_ruleset"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_RULESET_VALUE = 60;

	/**
	 * The '<em><b>REPOSITORY VULNERABILITY ALERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY_VULNERABILITY_ALERT
	 * @model literal="repository_vulnerability_alert"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VULNERABILITY_ALERT_VALUE = 61;

	/**
	 * The '<em><b>SECRET SCANNING ALERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_SCANNING_ALERT
	 * @model literal="secret_scanning_alert"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_SCANNING_ALERT_VALUE = 62;

	/**
	 * The '<em><b>SECRET SCANNING ALERT LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_SCANNING_ALERT_LOCATION
	 * @model literal="secret_scanning_alert_location"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_SCANNING_ALERT_LOCATION_VALUE = 63;

	/**
	 * The '<em><b>SECURITY ADVISORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_ADVISORY
	 * @model literal="security_advisory"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_ADVISORY_VALUE = 64;

	/**
	 * The '<em><b>SECURITY AND ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_AND_ANALYSIS
	 * @model literal="security_and_analysis"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AND_ANALYSIS_VALUE = 65;

	/**
	 * The '<em><b>SPONSORSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONSORSHIP
	 * @model literal="sponsorship"
	 * @generated
	 * @ordered
	 */
	public static final int SPONSORSHIP_VALUE = 66;

	/**
	 * The '<em><b>STAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR
	 * @model literal="star"
	 * @generated
	 * @ordered
	 */
	public static final int STAR_VALUE = 67;

	/**
	 * The '<em><b>TEAM ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM_ADD
	 * @model literal="team_add"
	 * @generated
	 * @ordered
	 */
	public static final int TEAM_ADD_VALUE = 68;

	/**
	 * The '<em><b>TEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM
	 * @model literal="team"
	 * @generated
	 * @ordered
	 */
	public static final int TEAM_VALUE = 69;

	/**
	 * The '<em><b>WORKFLOW JOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_JOB
	 * @model literal="workflow_job"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_JOB_VALUE = 70;

	/**
	 * An array of all the '<em><b>EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EVENTS[] VALUES_ARRAY = new EVENTS[] { BRANCH_PROTECTION_RULE, CHECK_RUN, CHECK_SUITE, CREATE,
			DELETE, DEPLOYMENT, DEPLOYMENT_STATUS, DISCUSSION, DISCUSSION_COMMENT, FORK, GOLLUM, ISSUE_COMMENT, ISSUES,
			LABEL, MERGE_GROUP, MILESTONE, PAGE_BUILD, PROJECT, PROJECT_CARD, PROJECT_COLUMN, PUBLIC,
			PULL_REQUEST_REVIEW, PULL_REQUEST_REVIEW_COMMENT, REGISTRY_PACKAGE, RELEASE, REPOSITORY_DISPATCH, STATUS,
			WATCH, BRANCH_PROTECTION_CONFIGURATION, CODE_SCANNING_ALERT, COMMIT_COMMENT, CUSTOM_PROPERTY,
			CUSTOM_PROPERTY_VALUES, DEPENDABOT_ALERT, DEPLOY_KEY, DEPLOYMENT_PROTECTION_RULE, DEPLOYMENT_REVIEW,
			GITHUB_APP_AUTHORIZATION, INSTALLATION, INSTALLATION_REPOSITORIES, INSTALLATION_TARGET,
			MARKETPLACE_PURCHASE, MEMBER, MEMBERSHIP, META, ORG_BLOCK, ORGANIZATION, PACKAGE,
			PERSONAL_ACCESS_TOKEN_REQUEST, PING, PROJECTS_V2, PROJECTS_V2_ITEM, PULL_REQUEST,
			PULL_REQUEST_REVIEW_THREAD, PUSH, REPOSITORY_ADVISORY, REPOSITORY, REPOSITORY_IMPORT, REPOSITORY_RULESET,
			REPOSITORY_VULNERABILITY_ALERT, SECRET_SCANNING_ALERT, SECRET_SCANNING_ALERT_LOCATION, SECURITY_ADVISORY,
			SECURITY_AND_ANALYSIS, SPONSORSHIP, STAR, TEAM_ADD, TEAM, WORKFLOW_JOB, };

	/**
	 * A public read-only list of all the '<em><b>EVENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EVENTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EVENTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVENTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVENTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVENTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVENTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVENTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVENTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVENTS get(int value) {
		switch (value) {
		case BRANCH_PROTECTION_RULE_VALUE:
			return BRANCH_PROTECTION_RULE;
		case CHECK_RUN_VALUE:
			return CHECK_RUN;
		case CHECK_SUITE_VALUE:
			return CHECK_SUITE;
		case CREATE_VALUE:
			return CREATE;
		case DELETE_VALUE:
			return DELETE;
		case DEPLOYMENT_VALUE:
			return DEPLOYMENT;
		case DEPLOYMENT_STATUS_VALUE:
			return DEPLOYMENT_STATUS;
		case DISCUSSION_VALUE:
			return DISCUSSION;
		case DISCUSSION_COMMENT_VALUE:
			return DISCUSSION_COMMENT;
		case FORK_VALUE:
			return FORK;
		case GOLLUM_VALUE:
			return GOLLUM;
		case ISSUE_COMMENT_VALUE:
			return ISSUE_COMMENT;
		case ISSUES_VALUE:
			return ISSUES;
		case LABEL_VALUE:
			return LABEL;
		case MERGE_GROUP_VALUE:
			return MERGE_GROUP;
		case MILESTONE_VALUE:
			return MILESTONE;
		case PAGE_BUILD_VALUE:
			return PAGE_BUILD;
		case PROJECT_VALUE:
			return PROJECT;
		case PROJECT_CARD_VALUE:
			return PROJECT_CARD;
		case PROJECT_COLUMN_VALUE:
			return PROJECT_COLUMN;
		case PUBLIC_VALUE:
			return PUBLIC;
		case PULL_REQUEST_REVIEW_VALUE:
			return PULL_REQUEST_REVIEW;
		case PULL_REQUEST_REVIEW_COMMENT_VALUE:
			return PULL_REQUEST_REVIEW_COMMENT;
		case REGISTRY_PACKAGE_VALUE:
			return REGISTRY_PACKAGE;
		case RELEASE_VALUE:
			return RELEASE;
		case REPOSITORY_DISPATCH_VALUE:
			return REPOSITORY_DISPATCH;
		case STATUS_VALUE:
			return STATUS;
		case WATCH_VALUE:
			return WATCH;
		case BRANCH_PROTECTION_CONFIGURATION_VALUE:
			return BRANCH_PROTECTION_CONFIGURATION;
		case CODE_SCANNING_ALERT_VALUE:
			return CODE_SCANNING_ALERT;
		case COMMIT_COMMENT_VALUE:
			return COMMIT_COMMENT;
		case CUSTOM_PROPERTY_VALUE:
			return CUSTOM_PROPERTY;
		case CUSTOM_PROPERTY_VALUES_VALUE:
			return CUSTOM_PROPERTY_VALUES;
		case DEPENDABOT_ALERT_VALUE:
			return DEPENDABOT_ALERT;
		case DEPLOY_KEY_VALUE:
			return DEPLOY_KEY;
		case DEPLOYMENT_PROTECTION_RULE_VALUE:
			return DEPLOYMENT_PROTECTION_RULE;
		case DEPLOYMENT_REVIEW_VALUE:
			return DEPLOYMENT_REVIEW;
		case GITHUB_APP_AUTHORIZATION_VALUE:
			return GITHUB_APP_AUTHORIZATION;
		case INSTALLATION_VALUE:
			return INSTALLATION;
		case INSTALLATION_REPOSITORIES_VALUE:
			return INSTALLATION_REPOSITORIES;
		case INSTALLATION_TARGET_VALUE:
			return INSTALLATION_TARGET;
		case MARKETPLACE_PURCHASE_VALUE:
			return MARKETPLACE_PURCHASE;
		case MEMBER_VALUE:
			return MEMBER;
		case MEMBERSHIP_VALUE:
			return MEMBERSHIP;
		case META_VALUE:
			return META;
		case ORG_BLOCK_VALUE:
			return ORG_BLOCK;
		case ORGANIZATION_VALUE:
			return ORGANIZATION;
		case PACKAGE_VALUE:
			return PACKAGE;
		case PERSONAL_ACCESS_TOKEN_REQUEST_VALUE:
			return PERSONAL_ACCESS_TOKEN_REQUEST;
		case PING_VALUE:
			return PING;
		case PROJECTS_V2_VALUE:
			return PROJECTS_V2;
		case PROJECTS_V2_ITEM_VALUE:
			return PROJECTS_V2_ITEM;
		case PULL_REQUEST_VALUE:
			return PULL_REQUEST;
		case PULL_REQUEST_REVIEW_THREAD_VALUE:
			return PULL_REQUEST_REVIEW_THREAD;
		case PUSH_VALUE:
			return PUSH;
		case REPOSITORY_ADVISORY_VALUE:
			return REPOSITORY_ADVISORY;
		case REPOSITORY_VALUE:
			return REPOSITORY;
		case REPOSITORY_IMPORT_VALUE:
			return REPOSITORY_IMPORT;
		case REPOSITORY_RULESET_VALUE:
			return REPOSITORY_RULESET;
		case REPOSITORY_VULNERABILITY_ALERT_VALUE:
			return REPOSITORY_VULNERABILITY_ALERT;
		case SECRET_SCANNING_ALERT_VALUE:
			return SECRET_SCANNING_ALERT;
		case SECRET_SCANNING_ALERT_LOCATION_VALUE:
			return SECRET_SCANNING_ALERT_LOCATION;
		case SECURITY_ADVISORY_VALUE:
			return SECURITY_ADVISORY;
		case SECURITY_AND_ANALYSIS_VALUE:
			return SECURITY_AND_ANALYSIS;
		case SPONSORSHIP_VALUE:
			return SPONSORSHIP;
		case STAR_VALUE:
			return STAR;
		case TEAM_ADD_VALUE:
			return TEAM_ADD;
		case TEAM_VALUE:
			return TEAM;
		case WORKFLOW_JOB_VALUE:
			return WORKFLOW_JOB;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EVENTS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EVENTS
