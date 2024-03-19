/**
 */
package devOps.provider;

import devOps.DevOpsFactory;
import devOps.DevOpsPackage;
import devOps.Job;

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
 * This is the item provider adapter for a {@link devOps.Job} object.
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

			addName1PropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addAllow_faillurePropertyDescriptor(object);
			addDescription1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName1PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_Name1_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_Name1_feature", "_UI_Job_type"),
						DevOpsPackage.Literals.JOB__NAME1, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_output_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_output_feature", "_UI_Job_type"),
						DevOpsPackage.Literals.JOB__OUTPUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow faillure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllow_faillurePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_Allow_faillure_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_Allow_faillure_feature",
								"_UI_Job_type"),
						DevOpsPackage.Literals.JOB__ALLOW_FAILLURE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription1PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_Description1_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_Description1_feature", "_UI_Job_type"),
						DevOpsPackage.Literals.JOB__DESCRIPTION1, true, false, false,
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
			childrenFeatures.add(DevOpsPackage.Literals.JOB__TOOL_FRAMEWORK_JOB);
			childrenFeatures.add(DevOpsPackage.Literals.JOB__COMMAND);
			childrenFeatures.add(DevOpsPackage.Literals.JOB__IFTHENELSE);
			childrenFeatures.add(DevOpsPackage.Literals.JOB__INPUT);
			childrenFeatures.add(DevOpsPackage.Literals.JOB__ENVIRONMENT);
			childrenFeatures.add(DevOpsPackage.Literals.JOB__PERMISSION);
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
		String label = ((Job) object).getName1();
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
		case DevOpsPackage.JOB__NAME1:
		case DevOpsPackage.JOB__ALLOW_FAILLURE:
		case DevOpsPackage.JOB__DESCRIPTION1:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DevOpsPackage.JOB__TOOL_FRAMEWORK_JOB:
		case DevOpsPackage.JOB__COMMAND:
		case DevOpsPackage.JOB__IFTHENELSE:
		case DevOpsPackage.JOB__INPUT:
		case DevOpsPackage.JOB__ENVIRONMENT:
		case DevOpsPackage.JOB__PERMISSION:
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

		newChildDescriptors.add(createChildParameter(DevOpsPackage.Literals.JOB__TOOL_FRAMEWORK_JOB,
				DevOpsFactory.eINSTANCE.createTool_Framework()));

		newChildDescriptors.add(
				createChildParameter(DevOpsPackage.Literals.JOB__COMMAND, DevOpsFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(DevOpsPackage.Literals.JOB__IFTHENELSE,
				DevOpsFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors
				.add(createChildParameter(DevOpsPackage.Literals.JOB__INPUT, DevOpsFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(DevOpsPackage.Literals.JOB__ENVIRONMENT,
				DevOpsFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(DevOpsPackage.Literals.JOB__PERMISSION,
				DevOpsFactory.eINSTANCE.createPermission()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DevOpsEditPlugin.INSTANCE;
	}

}
