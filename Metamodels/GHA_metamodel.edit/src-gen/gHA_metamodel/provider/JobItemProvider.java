/**
 */
package gHA_metamodel.provider;

import gHA_metamodel.GHA_metamodelFactory;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.Job;

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

/**
 * This is the item provider adapter for a {@link gHA_metamodel.Job} object.
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
			addTimeout_minutesPropertyDescriptor(object);
			addContinue_on_errorPropertyDescriptor(object);
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
						GHA_metamodelPackage.Literals.JOB__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeout_minutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_timeout_minutes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_timeout_minutes_feature",
								"_UI_Job_type"),
						GHA_metamodelPackage.Literals.JOB__TIMEOUT_MINUTES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Continue on error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContinue_on_errorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_continue_on_error_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_continue_on_error_feature",
								"_UI_Job_type"),
						GHA_metamodelPackage.Literals.JOB__CONTINUE_ON_ERROR, true, false, false,
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
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__STEPS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__IF);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__STRATEGY);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__CONCURRENCY);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__ENVIRONMENT);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__DEFAULTSETTING);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__PERMISSIONS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__ENVS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__NEED);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__OUTPUTS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__SERVICES);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__ACTIONS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__SECRETS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__RUNNER);
			childrenFeatures.add(GHA_metamodelPackage.Literals.JOB__CONTAINER);
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
		case GHA_metamodelPackage.JOB__NAME:
		case GHA_metamodelPackage.JOB__TIMEOUT_MINUTES:
		case GHA_metamodelPackage.JOB__CONTINUE_ON_ERROR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHA_metamodelPackage.JOB__STEPS:
		case GHA_metamodelPackage.JOB__IF:
		case GHA_metamodelPackage.JOB__STRATEGY:
		case GHA_metamodelPackage.JOB__CONCURRENCY:
		case GHA_metamodelPackage.JOB__ENVIRONMENT:
		case GHA_metamodelPackage.JOB__DEFAULTSETTING:
		case GHA_metamodelPackage.JOB__PERMISSIONS:
		case GHA_metamodelPackage.JOB__ENVS:
		case GHA_metamodelPackage.JOB__NEED:
		case GHA_metamodelPackage.JOB__OUTPUTS:
		case GHA_metamodelPackage.JOB__SERVICES:
		case GHA_metamodelPackage.JOB__ACTIONS:
		case GHA_metamodelPackage.JOB__SECRETS:
		case GHA_metamodelPackage.JOB__RUNNER:
		case GHA_metamodelPackage.JOB__CONTAINER:
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

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__STEPS,
				GHA_metamodelFactory.eINSTANCE.createStep()));

		newChildDescriptors.add(
				createChildParameter(GHA_metamodelPackage.Literals.JOB__IF, GHA_metamodelFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__STRATEGY,
				GHA_metamodelFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__CONCURRENCY,
				GHA_metamodelFactory.eINSTANCE.createConcurrency()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ENVIRONMENT,
				GHA_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__DEFAULTSETTING,
				GHA_metamodelFactory.eINSTANCE.createDefaultSetting()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__PERMISSIONS,
				GHA_metamodelFactory.eINSTANCE.createPermission()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ENVS,
				GHA_metamodelFactory.eINSTANCE.createEnv()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__NEED,
				GHA_metamodelFactory.eINSTANCE.createNeed()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__OUTPUTS,
				GHA_metamodelFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__SERVICES,
				GHA_metamodelFactory.eINSTANCE.createService()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createDocker()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createRestoreCache()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createSaveCache()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__SECRETS,
				GHA_metamodelFactory.eINSTANCE.createSecret()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__RUNNER,
				GHA_metamodelFactory.eINSTANCE.createRuns_On()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.JOB__CONTAINER,
				GHA_metamodelFactory.eINSTANCE.createContainer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GHA_metamodelEditPlugin.INSTANCE;
	}

}
