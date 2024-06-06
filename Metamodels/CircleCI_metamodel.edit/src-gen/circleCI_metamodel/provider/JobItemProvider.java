/**
 */
package circleCI_metamodel.provider;

import circleCI_metamodel.CircleCI_metamodelFactory;
import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Job;

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
 * This is the item provider adapter for a {@link circleCI_metamodel.Job} object.
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
			addParallelismPropertyDescriptor(object);
			addReuseExecutorPropertyDescriptor(object);
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
						CircleCI_metamodelPackage.Literals.JOB__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parallelism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelismPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_parallelism_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_parallelism_feature", "_UI_Job_type"),
						CircleCI_metamodelPackage.Literals.JOB__PARALLELISM, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reuse Executor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReuseExecutorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_reuseExecutor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_reuseExecutor_feature",
								"_UI_Job_type"),
						CircleCI_metamodelPackage.Literals.JOB__REUSE_EXECUTOR, true, false, false,
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
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.JOB__ENVIRONMENTS);
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.JOB__STEPS);
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.JOB__PARAMETERS);
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS);
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
		case CircleCI_metamodelPackage.JOB__NAME:
		case CircleCI_metamodelPackage.JOB__PARALLELISM:
		case CircleCI_metamodelPackage.JOB__REUSE_EXECUTOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCI_metamodelPackage.JOB__ENVIRONMENTS:
		case CircleCI_metamodelPackage.JOB__STEPS:
		case CircleCI_metamodelPackage.JOB__PARAMETERS:
		case CircleCI_metamodelPackage.JOB__EXECUTORS:
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

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__ENVIRONMENTS,
				CircleCI_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createRun()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createRestoreCache()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createPersistToWorkspace()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createStoreArtifact()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createStoreTestResults()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createSetupRemoteDocker()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createAddSSHKeys()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createSaveCache()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createAttachWorkspace()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createWhen_Unless()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__STEPS,
				CircleCI_metamodelFactory.eINSTANCE.createCheckout()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__PARAMETERS,
				CircleCI_metamodelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS,
				CircleCI_metamodelFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS,
				CircleCI_metamodelFactory.eINSTANCE.createMacOs()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.JOB__EXECUTORS,
				CircleCI_metamodelFactory.eINSTANCE.createDocker()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CircleCI_metamodelEditPlugin.INSTANCE;
	}

}
