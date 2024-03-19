/**
 */
package travisCI_metamodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import travisCI_metamodel.Job;
import travisCI_metamodel.TravisCI_metamodelFactory;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * This is the item provider adapter for a {@link travisCI_metamodel.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addFast_finishPropertyDescriptor(object);
			addStage_typePropertyDescriptor(object);
			addJob_typePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_name_feature", "_UI_Job_type"),
						TravisCI_metamodelPackage.Literals.JOB__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fast finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFast_finishPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_fast_finish_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_fast_finish_feature", "_UI_Job_type"),
						TravisCI_metamodelPackage.Literals.JOB__FAST_FINISH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stage type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStage_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_stage_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_stage_type_feature", "_UI_Job_type"),
						TravisCI_metamodelPackage.Literals.JOB__STAGE_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Job type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJob_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_job_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_job_type_feature", "_UI_Job_type"),
						TravisCI_metamodelPackage.Literals.JOB__JOB_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__SERVICE);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__ARTIFACT);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__ENVIRONMENT);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__DEPLOY);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__IF);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__LANGUAGE);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.JOB__SCRIPT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Job.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Job"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Job) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Job_type")
				: getString("_UI_Job_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Job.class)) {
		case TravisCI_metamodelPackage.JOB__NAME:
		case TravisCI_metamodelPackage.JOB__FAST_FINISH:
		case TravisCI_metamodelPackage.JOB__STAGE_TYPE:
		case TravisCI_metamodelPackage.JOB__JOB_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TravisCI_metamodelPackage.JOB__SERVICE:
		case TravisCI_metamodelPackage.JOB__ARTIFACT:
		case TravisCI_metamodelPackage.JOB__ENVIRONMENT:
		case TravisCI_metamodelPackage.JOB__DEPLOY:
		case TravisCI_metamodelPackage.JOB__IF:
		case TravisCI_metamodelPackage.JOB__LANGUAGE:
		case TravisCI_metamodelPackage.JOB__SCRIPT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__SERVICE,
				TravisCI_metamodelFactory.eINSTANCE.createService()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__ARTIFACT,
				TravisCI_metamodelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__ENVIRONMENT,
				TravisCI_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__DEPLOY,
				TravisCI_metamodelFactory.eINSTANCE.createRubygems()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__DEPLOY,
				TravisCI_metamodelFactory.eINSTANCE.createGitHub()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__DEPLOY,
				TravisCI_metamodelFactory.eINSTANCE.createHeroku()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__DEPLOY,
				TravisCI_metamodelFactory.eINSTANCE.createNpm()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__IF,
				TravisCI_metamodelFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__LANGUAGE,
				TravisCI_metamodelFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.JOB__SCRIPT,
				TravisCI_metamodelFactory.eINSTANCE.createScript()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TravisCI_metamodelEditPlugin.INSTANCE;
	}

}
