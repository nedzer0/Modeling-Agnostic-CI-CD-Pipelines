/**
 */
package gHA_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WEBHOOK ACTIVITY TYPES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gHA_metamodel.GHA_metamodelPackage#getWEBHOOK_ACTIVITY_TYPES()
 * @model
 * @generated
 */
public enum WEBHOOK_ACTIVITY_TYPES implements Enumerator {
	/**
	 * The '<em><b>ASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(0, "ASSIGNED", "assigned"),

	/**
	 * The '<em><b>AUTO MERGE DISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_MERGE_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_MERGE_DISABLED(1, "AUTO_MERGE_DISABLED", "auto_merge_disabled"),

	/**
	 * The '<em><b>AUTO MERGE ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_MERGE_ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_MERGE_ENABLED(2, "AUTO_MERGE_ENABLED", "auto_merge_enabled"),

	/**
	 * The '<em><b>CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(4, "CLOSED", "closed"),

	/**
	 * The '<em><b>CONVERTED TO DRAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERTED_TO_DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERTED_TO_DRAFT(5, "CONVERTED_TO_DRAFT", "converted_to_draft"),

	/**
	 * The '<em><b>EDITED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED_VALUE
	 * @generated
	 * @ordered
	 */
	EDITED(6, "EDITED", "edited"),

	/**
	 * The '<em><b>LABELED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED_VALUE
	 * @generated
	 * @ordered
	 */
	LABELED(7, "LABELED", "labeled"),

	/**
	 * The '<em><b>LOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKED(8, "LOCKED", "locked"),

	/**
	 * The '<em><b>OPENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED_VALUE
	 * @generated
	 * @ordered
	 */
	OPENED(9, "OPENED", "opened"),

	/**
	 * The '<em><b>READY FOR REVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_REVIEW(10, "READY_FOR_REVIEW", "ready_for_review"),

	/**
	 * The '<em><b>REOPENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_VALUE
	 * @generated
	 * @ordered
	 */
	REOPENED(11, "REOPENED", "reopened"),

	/**
	 * The '<em><b>REVIEW REQUEST REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_REQUEST_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW_REQUEST_REMOVED(12, "REVIEW_REQUEST_REMOVED", "review_request_removed"),

	/**
	 * The '<em><b>REVIEW REQUESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW_REQUESTED(13, "REVIEW_REQUESTED", "review_requested"),

	/**
	 * The '<em><b>SYNCHRONIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCHRONIZE(14, "SYNCHRONIZE", "synchronize"),

	/**
	 * The '<em><b>UNASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNASSIGNED(15, "UNASSIGNED", "unassigned"),

	/**
	 * The '<em><b>UNLABELED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLABELED_VALUE
	 * @generated
	 * @ordered
	 */
	UNLABELED(16, "UNLABELED", "unlabeled"),

	/**
	 * The '<em><b>UNLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	UNLOCKED(17, "UNLOCKED", "unlocked"),

	/**
	 * The '<em><b>CREATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(18, "CREATED", "created"),

	/**
	 * The '<em><b>DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(19, "DELETED", "deleted"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(19, "NONE", "none"),

	/**
	 * The '<em><b>DISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(20, "DISABLED", "disabled"),

	/**
	 * The '<em><b>ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLED(21, "ENABLED", "enabled"),

	/**
	 * The '<em><b>COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(22, "COMPLETED", "completed"),

	/**
	 * The '<em><b>REQUESTED ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED_ACTION(23, "REQUESTED_ACTION", "requested_action"),

	/**
	 * The '<em><b>REREQUESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REREQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REREQUESTED(24, "REREQUESTED", "rerequested"),

	/**
	 * The '<em><b>REQUESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED(25, "REQUESTED", "requested"),

	/**
	 * The '<em><b>APPEARED IN BRANCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEARED_IN_BRANCH_VALUE
	 * @generated
	 * @ordered
	 */
	APPEARED_IN_BRANCH(26, "APPEARED_IN_BRANCH", "appeared_in_branch"),

	/**
	 * The '<em><b>CLOSED BY USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_BY_USER_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_BY_USER(27, "CLOSED_BY_USER", "closed_by_user"),

	/**
	 * The '<em><b>FIXED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(28, "FIXED", "fixed"),

	/**
	 * The '<em><b>REOPENED BY USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_BY_USER_VALUE
	 * @generated
	 * @ordered
	 */
	REOPENED_BY_USER(29, "REOPENED_BY_USER", "reopened_by_user"),

	/**
	 * The '<em><b>UPDATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED(30, "UPDATED", "updated"),

	/**
	 * The '<em><b>AUTO DISMISSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_DISMISSED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_DISMISSED(31, "AUTO_DISMISSED", "auto_dismissed"),

	/**
	 * The '<em><b>AUTO REOPENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_REOPENED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_REOPENED(32, "AUTO_REOPENED", "auto_reopened"),

	/**
	 * The '<em><b>DISMISSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMISSED_VALUE
	 * @generated
	 * @ordered
	 */
	DISMISSED(33, "DISMISSED", "dismissed"),

	/**
	 * The '<em><b>REINTRODUCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REINTRODUCED_VALUE
	 * @generated
	 * @ordered
	 */
	REINTRODUCED(34, "REINTRODUCED", "reintroduced"),

	/**
	 * The '<em><b>APPROVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(35, "APPROVED", "approved"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(36, "REJECTED", "rejected"),

	/**
	 * The '<em><b>ANSWERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANSWERED_VALUE
	 * @generated
	 * @ordered
	 */
	ANSWERED(37, "ANSWERED", "answered"),

	/**
	 * The '<em><b>CATEGORY CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORY_CHANGED(38, "CATEGORY_CHANGED", "category_changed"),

	/**
	 * The '<em><b>PINNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINNED_VALUE
	 * @generated
	 * @ordered
	 */
	PINNED(39, "PINNED", "pinned"),

	/**
	 * The '<em><b>TRANSFERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERED_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERED(40, "TRANSFERED", "transfered"),

	/**
	 * The '<em><b>UNANSWERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNANSWERED_VALUE
	 * @generated
	 * @ordered
	 */
	UNANSWERED(41, "UNANSWERED", "unanswered"),

	/**
	 * The '<em><b>UNPINNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPINNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPINNED(42, "UNPINNED", "unpinned"),

	/**
	 * The '<em><b>NEW PERMISSIONS ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_PERMISSIONS_ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_PERMISSIONS_ACCEPTED(43, "NEW_PERMISSIONS_ACCEPTED", "new_permissions_accepted"),

	/**
	 * The '<em><b>SUSPEND UNSUSPEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_UNSUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPEND_UNSUSPEND(44, "SUSPEND_UNSUSPEND", "suspend_unsuspend"),

	/**
	 * The '<em><b>ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED(45, "ADDED", "added"),

	/**
	 * The '<em><b>REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVED(46, "REMOVED", "removed"),

	/**
	 * The '<em><b>DEMILESTONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMILESTONED_VALUE
	 * @generated
	 * @ordered
	 */
	DEMILESTONED(47, "DEMILESTONED", "demilestoned"),

	/**
	 * The '<em><b>MILESTONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONED_VALUE
	 * @generated
	 * @ordered
	 */
	MILESTONED(48, "MILESTONED", "milestoned"),

	/**
	 * The '<em><b>CANCELLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(49, "CANCELLED", "cancelled"),

	/**
	 * The '<em><b>CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGED(50, "CHANGED", "changed"),

	/**
	 * The '<em><b>PENDING CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_CHANGE(51, "PENDING_CHANGE", "pending_change"),

	/**
	 * The '<em><b>PENDING CHANGE CANCELLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CHANGE_CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_CHANGE_CANCELLED(52, "PENDING_CHANGE_CANCELLED", "pending_change_cancelled"),

	/**
	 * The '<em><b>PURCHASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURCHASED_VALUE
	 * @generated
	 * @ordered
	 */
	PURCHASED(53, "PURCHASED", "purchased"),

	/**
	 * The '<em><b>DENIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIED_VALUE
	 * @generated
	 * @ordered
	 */
	DENIED(54, "DENIED", "denied"),

	/**
	 * The '<em><b>CHECKS REQUESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKS_REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKS_REQUESTED(55, "CHECKS_REQUESTED", "checks_requested"),

	/**
	 * The '<em><b>DESTROYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROYED_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROYED(56, "DESTROYED", "destroyed"),

	/**
	 * The '<em><b>BLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED(57, "BLOCKED", "blocked"),

	/**
	 * The '<em><b>MEMBER ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER_ADDED(58, "MEMBER_ADDED", "member_added"),

	/**
	 * The '<em><b>MEMBER INVITED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_INVITED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER_INVITED(59, "MEMBER_INVITED", "member_invited"),

	/**
	 * The '<em><b>MEMBER REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBER_REMOVED(60, "MEMBER_REMOVED", "member_removed"),

	/**
	 * The '<em><b>RENAMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAMED_VALUE
	 * @generated
	 * @ordered
	 */
	RENAMED(61, "RENAMED", "renamed"),

	/**
	 * The '<em><b>PUBLISHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHED(62, "PUBLISHED", "published"),

	/**
	 * The '<em><b>MOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED(64, "MOVED", "moved"),

	/**
	 * The '<em><b>ARCHIVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVED(65, "ARCHIVED", "archived"),

	/**
	 * The '<em><b>CONVERTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERTED(66, "CONVERTED", "converted"),

	/**
	 * The '<em><b>REORDERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	REORDERED(67, "REORDERED", "reordered"),

	/**
	 * The '<em><b>RESTORED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTORED_VALUE
	 * @generated
	 * @ordered
	 */
	RESTORED(68, "RESTORED", "restored"),

	/**
	 * The '<em><b>DEQUEUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEQUEUED_VALUE
	 * @generated
	 * @ordered
	 */
	DEQUEUED(69, "DEQUEUED", "dequeued"),

	/**
	 * The '<em><b>ENQUEUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENQUEUED_VALUE
	 * @generated
	 * @ordered
	 */
	ENQUEUED(70, "ENQUEUED", "enqueued"),

	/**
	 * The '<em><b>SUBMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMITTED(71, "SUBMITTED", "submitted"),

	/**
	 * The '<em><b>RESOLVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(72, "RESOLVED", "resolved"),

	/**
	 * The '<em><b>UNRESOLVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	UNRESOLVED(73, "UNRESOLVED", "unresolved"),

	/**
	 * The '<em><b>PRERELEASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRERELEASED_VALUE
	 * @generated
	 * @ordered
	 */
	PRERELEASED(74, "PRERELEASED", "prereleased"),

	/**
	 * The '<em><b>RELEASED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASED_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASED(75, "RELEASED", "released"),

	/**
	 * The '<em><b>UNPUBLISHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPUBLISHED(76, "UNPUBLISHED", "unpublished"),

	/**
	 * The '<em><b>REPORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTED(77, "REPORTED", "reported"),

	/**
	 * The '<em><b>PRIVATIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATIZED_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATIZED(78, "PRIVATIZED", "privatized"),

	/**
	 * The '<em><b>PUBLICIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICIZED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICIZED(79, "PUBLICIZED", "publicized"),

	/**
	 * The '<em><b>TRANSFERRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERRED(80, "TRANSFERRED", "transferred"),

	/**
	 * The '<em><b>UNARCHIVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARCHIVED_VALUE
	 * @generated
	 * @ordered
	 */
	UNARCHIVED(81, "UNARCHIVED", "unarchived"),

	/**
	 * The '<em><b>DISMISS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMISS_VALUE
	 * @generated
	 * @ordered
	 */
	DISMISS(82, "DISMISS", "dismiss"),

	/**
	 * The '<em><b>REOPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPEN_VALUE
	 * @generated
	 * @ordered
	 */
	REOPEN(83, "REOPEN", "reopen"),

	/**
	 * The '<em><b>RESOLVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVE(84, "RESOLVE", "resolve"),

	/**
	 * The '<em><b>REVOKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVOKED_VALUE
	 * @generated
	 * @ordered
	 */
	REVOKED(85, "REVOKED", "revoked"),

	/**
	 * The '<em><b>VALIDATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATED(86, "VALIDATED", "validated"),

	/**
	 * The '<em><b>WITHDRAWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(87, "WITHDRAWN", "withdrawn"),

	/**
	 * The '<em><b>PENDING CANCELLATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CANCELLATION_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_CANCELLATION(89, "PENDING_CANCELLATION", "pending_cancellation"),

	/**
	 * The '<em><b>PENDING TIER CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_TIER_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_TIER_CHANGE(90, "PENDING_TIER_CHANGE", "pending_tier_change"),

	/**
	 * The '<em><b>TIER CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER_CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	TIER_CHANGED(91, "TIER_CHANGED", "tier_changed"),

	/**
	 * The '<em><b>ADDED TO REPOSITORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_TO_REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED_TO_REPOSITORY(92, "ADDED_TO_REPOSITORY", "added_to_repository"),

	/**
	 * The '<em><b>REMOVED FROM REPOSITORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED_FROM_REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVED_FROM_REPOSITORY(93, "REMOVED_FROM_REPOSITORY", "removed_from_repository"),

	/**
	 * The '<em><b>UNBLOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	UNBLOCKED(94, "UNBLOCKED", "unblocked"),

	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(95, "CREATE", "create"),

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(96, "IN_PROGRESS", "in_progress"),

	/**
	 * The '<em><b>QUEUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUED_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUED(97, "QUEUED", "queued"),

	/**
	 * The '<em><b>WAITING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING(98, "WAITING", "waiting");

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model literal="assigned"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 0;

	/**
	 * The '<em><b>AUTO MERGE DISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_MERGE_DISABLED
	 * @model literal="auto_merge_disabled"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_MERGE_DISABLED_VALUE = 1;

	/**
	 * The '<em><b>AUTO MERGE ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_MERGE_ENABLED
	 * @model literal="auto_merge_enabled"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_MERGE_ENABLED_VALUE = 2;

	/**
	 * The '<em><b>CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model literal="closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 4;

	/**
	 * The '<em><b>CONVERTED TO DRAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERTED_TO_DRAFT
	 * @model literal="converted_to_draft"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERTED_TO_DRAFT_VALUE = 5;

	/**
	 * The '<em><b>EDITED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED
	 * @model literal="edited"
	 * @generated
	 * @ordered
	 */
	public static final int EDITED_VALUE = 6;

	/**
	 * The '<em><b>LABELED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED
	 * @model literal="labeled"
	 * @generated
	 * @ordered
	 */
	public static final int LABELED_VALUE = 7;

	/**
	 * The '<em><b>LOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED
	 * @model literal="locked"
	 * @generated
	 * @ordered
	 */
	public static final int LOCKED_VALUE = 8;

	/**
	 * The '<em><b>OPENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED
	 * @model literal="opened"
	 * @generated
	 * @ordered
	 */
	public static final int OPENED_VALUE = 9;

	/**
	 * The '<em><b>READY FOR REVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_REVIEW
	 * @model literal="ready_for_review"
	 * @generated
	 * @ordered
	 */
	public static final int READY_FOR_REVIEW_VALUE = 10;

	/**
	 * The '<em><b>REOPENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED
	 * @model literal="reopened"
	 * @generated
	 * @ordered
	 */
	public static final int REOPENED_VALUE = 11;

	/**
	 * The '<em><b>REVIEW REQUEST REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_REQUEST_REMOVED
	 * @model literal="review_request_removed"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_REQUEST_REMOVED_VALUE = 12;

	/**
	 * The '<em><b>REVIEW REQUESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_REQUESTED
	 * @model literal="review_requested"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_REQUESTED_VALUE = 13;

	/**
	 * The '<em><b>SYNCHRONIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONIZE
	 * @model literal="synchronize"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONIZE_VALUE = 14;

	/**
	 * The '<em><b>UNASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED
	 * @model literal="unassigned"
	 * @generated
	 * @ordered
	 */
	public static final int UNASSIGNED_VALUE = 15;

	/**
	 * The '<em><b>UNLABELED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLABELED
	 * @model literal="unlabeled"
	 * @generated
	 * @ordered
	 */
	public static final int UNLABELED_VALUE = 16;

	/**
	 * The '<em><b>UNLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCKED
	 * @model literal="unlocked"
	 * @generated
	 * @ordered
	 */
	public static final int UNLOCKED_VALUE = 17;

	/**
	 * The '<em><b>CREATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model literal="created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 18;

	/**
	 * The '<em><b>DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model literal="deleted"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 19;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 19;

	/**
	 * The '<em><b>DISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model literal="disabled"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 20;

	/**
	 * The '<em><b>ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED
	 * @model literal="enabled"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLED_VALUE = 21;

	/**
	 * The '<em><b>COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model literal="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 22;

	/**
	 * The '<em><b>REQUESTED ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_ACTION
	 * @model literal="requested_action"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_ACTION_VALUE = 23;

	/**
	 * The '<em><b>REREQUESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REREQUESTED
	 * @model literal="rerequested"
	 * @generated
	 * @ordered
	 */
	public static final int REREQUESTED_VALUE = 24;

	/**
	 * The '<em><b>REQUESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED
	 * @model literal="requested"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_VALUE = 25;

	/**
	 * The '<em><b>APPEARED IN BRANCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEARED_IN_BRANCH
	 * @model literal="appeared_in_branch"
	 * @generated
	 * @ordered
	 */
	public static final int APPEARED_IN_BRANCH_VALUE = 26;

	/**
	 * The '<em><b>CLOSED BY USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_BY_USER
	 * @model literal="closed_by_user"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_BY_USER_VALUE = 27;

	/**
	 * The '<em><b>FIXED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @model literal="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 28;

	/**
	 * The '<em><b>REOPENED BY USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_BY_USER
	 * @model literal="reopened_by_user"
	 * @generated
	 * @ordered
	 */
	public static final int REOPENED_BY_USER_VALUE = 29;

	/**
	 * The '<em><b>UPDATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED
	 * @model literal="updated"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_VALUE = 30;

	/**
	 * The '<em><b>AUTO DISMISSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_DISMISSED
	 * @model literal="auto_dismissed"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_DISMISSED_VALUE = 31;

	/**
	 * The '<em><b>AUTO REOPENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_REOPENED
	 * @model literal="auto_reopened"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_REOPENED_VALUE = 32;

	/**
	 * The '<em><b>DISMISSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMISSED
	 * @model literal="dismissed"
	 * @generated
	 * @ordered
	 */
	public static final int DISMISSED_VALUE = 33;

	/**
	 * The '<em><b>REINTRODUCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REINTRODUCED
	 * @model literal="reintroduced"
	 * @generated
	 * @ordered
	 */
	public static final int REINTRODUCED_VALUE = 34;

	/**
	 * The '<em><b>APPROVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED
	 * @model literal="approved"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 35;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model literal="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 36;

	/**
	 * The '<em><b>ANSWERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANSWERED
	 * @model literal="answered"
	 * @generated
	 * @ordered
	 */
	public static final int ANSWERED_VALUE = 37;

	/**
	 * The '<em><b>CATEGORY CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_CHANGED
	 * @model literal="category_changed"
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_CHANGED_VALUE = 38;

	/**
	 * The '<em><b>PINNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINNED
	 * @model literal="pinned"
	 * @generated
	 * @ordered
	 */
	public static final int PINNED_VALUE = 39;

	/**
	 * The '<em><b>TRANSFERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERED
	 * @model literal="transfered"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERED_VALUE = 40;

	/**
	 * The '<em><b>UNANSWERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNANSWERED
	 * @model literal="unanswered"
	 * @generated
	 * @ordered
	 */
	public static final int UNANSWERED_VALUE = 41;

	/**
	 * The '<em><b>UNPINNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPINNED
	 * @model literal="unpinned"
	 * @generated
	 * @ordered
	 */
	public static final int UNPINNED_VALUE = 42;

	/**
	 * The '<em><b>NEW PERMISSIONS ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_PERMISSIONS_ACCEPTED
	 * @model literal="new_permissions_accepted"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_PERMISSIONS_ACCEPTED_VALUE = 43;

	/**
	 * The '<em><b>SUSPEND UNSUSPEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_UNSUSPEND
	 * @model literal="suspend_unsuspend"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPEND_UNSUSPEND_VALUE = 44;

	/**
	 * The '<em><b>ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED
	 * @model literal="added"
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_VALUE = 45;

	/**
	 * The '<em><b>REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED
	 * @model literal="removed"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVED_VALUE = 46;

	/**
	 * The '<em><b>DEMILESTONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMILESTONED
	 * @model literal="demilestoned"
	 * @generated
	 * @ordered
	 */
	public static final int DEMILESTONED_VALUE = 47;

	/**
	 * The '<em><b>MILESTONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONED
	 * @model literal="milestoned"
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONED_VALUE = 48;

	/**
	 * The '<em><b>CANCELLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model literal="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 49;

	/**
	 * The '<em><b>CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGED
	 * @model literal="changed"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGED_VALUE = 50;

	/**
	 * The '<em><b>PENDING CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CHANGE
	 * @model literal="pending_change"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CHANGE_VALUE = 51;

	/**
	 * The '<em><b>PENDING CHANGE CANCELLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CHANGE_CANCELLED
	 * @model literal="pending_change_cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CHANGE_CANCELLED_VALUE = 52;

	/**
	 * The '<em><b>PURCHASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURCHASED
	 * @model literal="purchased"
	 * @generated
	 * @ordered
	 */
	public static final int PURCHASED_VALUE = 53;

	/**
	 * The '<em><b>DENIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIED
	 * @model literal="denied"
	 * @generated
	 * @ordered
	 */
	public static final int DENIED_VALUE = 54;

	/**
	 * The '<em><b>CHECKS REQUESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKS_REQUESTED
	 * @model literal="checks_requested"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKS_REQUESTED_VALUE = 55;

	/**
	 * The '<em><b>DESTROYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROYED
	 * @model literal="destroyed"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROYED_VALUE = 56;

	/**
	 * The '<em><b>BLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED
	 * @model literal="blocked"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_VALUE = 57;

	/**
	 * The '<em><b>MEMBER ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_ADDED
	 * @model literal="member_added"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_ADDED_VALUE = 58;

	/**
	 * The '<em><b>MEMBER INVITED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_INVITED
	 * @model literal="member_invited"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_INVITED_VALUE = 59;

	/**
	 * The '<em><b>MEMBER REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBER_REMOVED
	 * @model literal="member_removed"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBER_REMOVED_VALUE = 60;

	/**
	 * The '<em><b>RENAMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAMED
	 * @model literal="renamed"
	 * @generated
	 * @ordered
	 */
	public static final int RENAMED_VALUE = 61;

	/**
	 * The '<em><b>PUBLISHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED
	 * @model literal="published"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHED_VALUE = 62;

	/**
	 * The '<em><b>MOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVED
	 * @model literal="moved"
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_VALUE = 64;

	/**
	 * The '<em><b>ARCHIVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVED
	 * @model literal="archived"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVED_VALUE = 65;

	/**
	 * The '<em><b>CONVERTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERTED
	 * @model literal="converted"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERTED_VALUE = 66;

	/**
	 * The '<em><b>REORDERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REORDERED
	 * @model literal="reordered"
	 * @generated
	 * @ordered
	 */
	public static final int REORDERED_VALUE = 67;

	/**
	 * The '<em><b>RESTORED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTORED
	 * @model literal="restored"
	 * @generated
	 * @ordered
	 */
	public static final int RESTORED_VALUE = 68;

	/**
	 * The '<em><b>DEQUEUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEQUEUED
	 * @model literal="dequeued"
	 * @generated
	 * @ordered
	 */
	public static final int DEQUEUED_VALUE = 69;

	/**
	 * The '<em><b>ENQUEUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENQUEUED
	 * @model literal="enqueued"
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUED_VALUE = 70;

	/**
	 * The '<em><b>SUBMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMITTED
	 * @model literal="submitted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITTED_VALUE = 71;

	/**
	 * The '<em><b>RESOLVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED
	 * @model literal="resolved"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 72;

	/**
	 * The '<em><b>UNRESOLVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESOLVED
	 * @model literal="unresolved"
	 * @generated
	 * @ordered
	 */
	public static final int UNRESOLVED_VALUE = 73;

	/**
	 * The '<em><b>PRERELEASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRERELEASED
	 * @model literal="prereleased"
	 * @generated
	 * @ordered
	 */
	public static final int PRERELEASED_VALUE = 74;

	/**
	 * The '<em><b>RELEASED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASED
	 * @model literal="released"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASED_VALUE = 75;

	/**
	 * The '<em><b>UNPUBLISHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPUBLISHED
	 * @model literal="unpublished"
	 * @generated
	 * @ordered
	 */
	public static final int UNPUBLISHED_VALUE = 76;

	/**
	 * The '<em><b>REPORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED
	 * @model literal="reported"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTED_VALUE = 77;

	/**
	 * The '<em><b>PRIVATIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATIZED
	 * @model literal="privatized"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATIZED_VALUE = 78;

	/**
	 * The '<em><b>PUBLICIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICIZED
	 * @model literal="publicized"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICIZED_VALUE = 79;

	/**
	 * The '<em><b>TRANSFERRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED
	 * @model literal="transferred"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERRED_VALUE = 80;

	/**
	 * The '<em><b>UNARCHIVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARCHIVED
	 * @model literal="unarchived"
	 * @generated
	 * @ordered
	 */
	public static final int UNARCHIVED_VALUE = 81;

	/**
	 * The '<em><b>DISMISS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMISS
	 * @model literal="dismiss"
	 * @generated
	 * @ordered
	 */
	public static final int DISMISS_VALUE = 82;

	/**
	 * The '<em><b>REOPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPEN
	 * @model literal="reopen"
	 * @generated
	 * @ordered
	 */
	public static final int REOPEN_VALUE = 83;

	/**
	 * The '<em><b>RESOLVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVE
	 * @model literal="resolve"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_VALUE = 84;

	/**
	 * The '<em><b>REVOKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVOKED
	 * @model literal="revoked"
	 * @generated
	 * @ordered
	 */
	public static final int REVOKED_VALUE = 85;

	/**
	 * The '<em><b>VALIDATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATED
	 * @model literal="validated"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATED_VALUE = 86;

	/**
	 * The '<em><b>WITHDRAWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN
	 * @model literal="withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 87;

	/**
	 * The '<em><b>PENDING CANCELLATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_CANCELLATION
	 * @model literal="pending_cancellation"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CANCELLATION_VALUE = 89;

	/**
	 * The '<em><b>PENDING TIER CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_TIER_CHANGE
	 * @model literal="pending_tier_change"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_TIER_CHANGE_VALUE = 90;

	/**
	 * The '<em><b>TIER CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIER_CHANGED
	 * @model literal="tier_changed"
	 * @generated
	 * @ordered
	 */
	public static final int TIER_CHANGED_VALUE = 91;

	/**
	 * The '<em><b>ADDED TO REPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_TO_REPOSITORY
	 * @model literal="added_to_repository"
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_TO_REPOSITORY_VALUE = 92;

	/**
	 * The '<em><b>REMOVED FROM REPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED_FROM_REPOSITORY
	 * @model literal="removed_from_repository"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVED_FROM_REPOSITORY_VALUE = 93;

	/**
	 * The '<em><b>UNBLOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBLOCKED
	 * @model literal="unblocked"
	 * @generated
	 * @ordered
	 */
	public static final int UNBLOCKED_VALUE = 94;

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model literal="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 95;

	/**
	 * The '<em><b>IN PROGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @model literal="in_progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 96;

	/**
	 * The '<em><b>QUEUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUED
	 * @model literal="queued"
	 * @generated
	 * @ordered
	 */
	public static final int QUEUED_VALUE = 97;

	/**
	 * The '<em><b>WAITING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING
	 * @model literal="waiting"
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_VALUE = 98;

	/**
	 * An array of all the '<em><b>WEBHOOK ACTIVITY TYPES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WEBHOOK_ACTIVITY_TYPES[] VALUES_ARRAY = new WEBHOOK_ACTIVITY_TYPES[] { ASSIGNED,
			AUTO_MERGE_DISABLED, AUTO_MERGE_ENABLED, CLOSED, CONVERTED_TO_DRAFT, EDITED, LABELED, LOCKED, OPENED,
			READY_FOR_REVIEW, REOPENED, REVIEW_REQUEST_REMOVED, REVIEW_REQUESTED, SYNCHRONIZE, UNASSIGNED, UNLABELED,
			UNLOCKED, CREATED, DELETED, NONE, DISABLED, ENABLED, COMPLETED, REQUESTED_ACTION, REREQUESTED, REQUESTED,
			APPEARED_IN_BRANCH, CLOSED_BY_USER, FIXED, REOPENED_BY_USER, UPDATED, AUTO_DISMISSED, AUTO_REOPENED,
			DISMISSED, REINTRODUCED, APPROVED, REJECTED, ANSWERED, CATEGORY_CHANGED, PINNED, TRANSFERED, UNANSWERED,
			UNPINNED, NEW_PERMISSIONS_ACCEPTED, SUSPEND_UNSUSPEND, ADDED, REMOVED, DEMILESTONED, MILESTONED, CANCELLED,
			CHANGED, PENDING_CHANGE, PENDING_CHANGE_CANCELLED, PURCHASED, DENIED, CHECKS_REQUESTED, DESTROYED, BLOCKED,
			MEMBER_ADDED, MEMBER_INVITED, MEMBER_REMOVED, RENAMED, PUBLISHED, MOVED, ARCHIVED, CONVERTED, REORDERED,
			RESTORED, DEQUEUED, ENQUEUED, SUBMITTED, RESOLVED, UNRESOLVED, PRERELEASED, RELEASED, UNPUBLISHED, REPORTED,
			PRIVATIZED, PUBLICIZED, TRANSFERRED, UNARCHIVED, DISMISS, REOPEN, RESOLVE, REVOKED, VALIDATED, WITHDRAWN,
			PENDING_CANCELLATION, PENDING_TIER_CHANGE, TIER_CHANGED, ADDED_TO_REPOSITORY, REMOVED_FROM_REPOSITORY,
			UNBLOCKED, CREATE, IN_PROGRESS, QUEUED, WAITING, };

	/**
	 * A public read-only list of all the '<em><b>WEBHOOK ACTIVITY TYPES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WEBHOOK_ACTIVITY_TYPES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>WEBHOOK ACTIVITY TYPES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WEBHOOK_ACTIVITY_TYPES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WEBHOOK_ACTIVITY_TYPES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WEBHOOK ACTIVITY TYPES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WEBHOOK_ACTIVITY_TYPES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WEBHOOK_ACTIVITY_TYPES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WEBHOOK ACTIVITY TYPES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WEBHOOK_ACTIVITY_TYPES get(int value) {
		switch (value) {
		case ASSIGNED_VALUE:
			return ASSIGNED;
		case AUTO_MERGE_DISABLED_VALUE:
			return AUTO_MERGE_DISABLED;
		case AUTO_MERGE_ENABLED_VALUE:
			return AUTO_MERGE_ENABLED;
		case CLOSED_VALUE:
			return CLOSED;
		case CONVERTED_TO_DRAFT_VALUE:
			return CONVERTED_TO_DRAFT;
		case EDITED_VALUE:
			return EDITED;
		case LABELED_VALUE:
			return LABELED;
		case LOCKED_VALUE:
			return LOCKED;
		case OPENED_VALUE:
			return OPENED;
		case READY_FOR_REVIEW_VALUE:
			return READY_FOR_REVIEW;
		case REOPENED_VALUE:
			return REOPENED;
		case REVIEW_REQUEST_REMOVED_VALUE:
			return REVIEW_REQUEST_REMOVED;
		case REVIEW_REQUESTED_VALUE:
			return REVIEW_REQUESTED;
		case SYNCHRONIZE_VALUE:
			return SYNCHRONIZE;
		case UNASSIGNED_VALUE:
			return UNASSIGNED;
		case UNLABELED_VALUE:
			return UNLABELED;
		case UNLOCKED_VALUE:
			return UNLOCKED;
		case CREATED_VALUE:
			return CREATED;
		case DELETED_VALUE:
			return DELETED;
		case DISABLED_VALUE:
			return DISABLED;
		case ENABLED_VALUE:
			return ENABLED;
		case COMPLETED_VALUE:
			return COMPLETED;
		case REQUESTED_ACTION_VALUE:
			return REQUESTED_ACTION;
		case REREQUESTED_VALUE:
			return REREQUESTED;
		case REQUESTED_VALUE:
			return REQUESTED;
		case APPEARED_IN_BRANCH_VALUE:
			return APPEARED_IN_BRANCH;
		case CLOSED_BY_USER_VALUE:
			return CLOSED_BY_USER;
		case FIXED_VALUE:
			return FIXED;
		case REOPENED_BY_USER_VALUE:
			return REOPENED_BY_USER;
		case UPDATED_VALUE:
			return UPDATED;
		case AUTO_DISMISSED_VALUE:
			return AUTO_DISMISSED;
		case AUTO_REOPENED_VALUE:
			return AUTO_REOPENED;
		case DISMISSED_VALUE:
			return DISMISSED;
		case REINTRODUCED_VALUE:
			return REINTRODUCED;
		case APPROVED_VALUE:
			return APPROVED;
		case REJECTED_VALUE:
			return REJECTED;
		case ANSWERED_VALUE:
			return ANSWERED;
		case CATEGORY_CHANGED_VALUE:
			return CATEGORY_CHANGED;
		case PINNED_VALUE:
			return PINNED;
		case TRANSFERED_VALUE:
			return TRANSFERED;
		case UNANSWERED_VALUE:
			return UNANSWERED;
		case UNPINNED_VALUE:
			return UNPINNED;
		case NEW_PERMISSIONS_ACCEPTED_VALUE:
			return NEW_PERMISSIONS_ACCEPTED;
		case SUSPEND_UNSUSPEND_VALUE:
			return SUSPEND_UNSUSPEND;
		case ADDED_VALUE:
			return ADDED;
		case REMOVED_VALUE:
			return REMOVED;
		case DEMILESTONED_VALUE:
			return DEMILESTONED;
		case MILESTONED_VALUE:
			return MILESTONED;
		case CANCELLED_VALUE:
			return CANCELLED;
		case CHANGED_VALUE:
			return CHANGED;
		case PENDING_CHANGE_VALUE:
			return PENDING_CHANGE;
		case PENDING_CHANGE_CANCELLED_VALUE:
			return PENDING_CHANGE_CANCELLED;
		case PURCHASED_VALUE:
			return PURCHASED;
		case DENIED_VALUE:
			return DENIED;
		case CHECKS_REQUESTED_VALUE:
			return CHECKS_REQUESTED;
		case DESTROYED_VALUE:
			return DESTROYED;
		case BLOCKED_VALUE:
			return BLOCKED;
		case MEMBER_ADDED_VALUE:
			return MEMBER_ADDED;
		case MEMBER_INVITED_VALUE:
			return MEMBER_INVITED;
		case MEMBER_REMOVED_VALUE:
			return MEMBER_REMOVED;
		case RENAMED_VALUE:
			return RENAMED;
		case PUBLISHED_VALUE:
			return PUBLISHED;
		case MOVED_VALUE:
			return MOVED;
		case ARCHIVED_VALUE:
			return ARCHIVED;
		case CONVERTED_VALUE:
			return CONVERTED;
		case REORDERED_VALUE:
			return REORDERED;
		case RESTORED_VALUE:
			return RESTORED;
		case DEQUEUED_VALUE:
			return DEQUEUED;
		case ENQUEUED_VALUE:
			return ENQUEUED;
		case SUBMITTED_VALUE:
			return SUBMITTED;
		case RESOLVED_VALUE:
			return RESOLVED;
		case UNRESOLVED_VALUE:
			return UNRESOLVED;
		case PRERELEASED_VALUE:
			return PRERELEASED;
		case RELEASED_VALUE:
			return RELEASED;
		case UNPUBLISHED_VALUE:
			return UNPUBLISHED;
		case REPORTED_VALUE:
			return REPORTED;
		case PRIVATIZED_VALUE:
			return PRIVATIZED;
		case PUBLICIZED_VALUE:
			return PUBLICIZED;
		case TRANSFERRED_VALUE:
			return TRANSFERRED;
		case UNARCHIVED_VALUE:
			return UNARCHIVED;
		case DISMISS_VALUE:
			return DISMISS;
		case REOPEN_VALUE:
			return REOPEN;
		case RESOLVE_VALUE:
			return RESOLVE;
		case REVOKED_VALUE:
			return REVOKED;
		case VALIDATED_VALUE:
			return VALIDATED;
		case WITHDRAWN_VALUE:
			return WITHDRAWN;
		case PENDING_CANCELLATION_VALUE:
			return PENDING_CANCELLATION;
		case PENDING_TIER_CHANGE_VALUE:
			return PENDING_TIER_CHANGE;
		case TIER_CHANGED_VALUE:
			return TIER_CHANGED;
		case ADDED_TO_REPOSITORY_VALUE:
			return ADDED_TO_REPOSITORY;
		case REMOVED_FROM_REPOSITORY_VALUE:
			return REMOVED_FROM_REPOSITORY;
		case UNBLOCKED_VALUE:
			return UNBLOCKED;
		case CREATE_VALUE:
			return CREATE;
		case IN_PROGRESS_VALUE:
			return IN_PROGRESS;
		case QUEUED_VALUE:
			return QUEUED;
		case WAITING_VALUE:
			return WAITING;
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
	private WEBHOOK_ACTIVITY_TYPES(int value, String name, String literal) {
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

} //WEBHOOK_ACTIVITY_TYPES
