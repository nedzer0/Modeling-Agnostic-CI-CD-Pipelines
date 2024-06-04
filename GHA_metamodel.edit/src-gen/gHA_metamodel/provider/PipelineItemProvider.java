/**
 */
package gHA_metamodel.provider;

import gHA_metamodel.GHA_metamodelFactory;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.Pipeline;

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
 * This is the item provider adapter for a {@link gHA_metamodel.Pipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineItemProvider(AdapterFactory adapterFactory) {
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
			addRun_namePropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Pipeline_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_name_feature",
								"_UI_Pipeline_type"),
						GHA_metamodelPackage.Literals.PIPELINE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Run name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRun_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Pipeline_run_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_run_name_feature",
								"_UI_Pipeline_type"),
						GHA_metamodelPackage.Literals.PIPELINE__RUN_NAME, true, false, false,
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
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__JOBS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__PERMISSIONS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__CONCURRENCY);
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__ENVS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.PIPELINE__DEFAULTSETTING);
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
	 * This returns Pipeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pipeline"));
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
		String label = ((Pipeline) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Pipeline_type")
				: getString("_UI_Pipeline_type") + " " + label;
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

		switch (notification.getFeatureID(Pipeline.class)) {
		case GHA_metamodelPackage.PIPELINE__NAME:
		case GHA_metamodelPackage.PIPELINE__RUN_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHA_metamodelPackage.PIPELINE__TRIGGERS:
		case GHA_metamodelPackage.PIPELINE__JOBS:
		case GHA_metamodelPackage.PIPELINE__PERMISSIONS:
		case GHA_metamodelPackage.PIPELINE__CONCURRENCY:
		case GHA_metamodelPackage.PIPELINE__ENVS:
		case GHA_metamodelPackage.PIPELINE__DEFAULTSETTING:
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

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createScheduleTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createPushTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createPullTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createStandardEventTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createWorkflowCallTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createWorkflowDispatchTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createWorkflowRunTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__TRIGGERS,
				GHA_metamodelFactory.eINSTANCE.createPullTargetTrigger()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__JOBS,
				GHA_metamodelFactory.eINSTANCE.createJob()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__PERMISSIONS,
				GHA_metamodelFactory.eINSTANCE.createPermission()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__CONCURRENCY,
				GHA_metamodelFactory.eINSTANCE.createConcurrency()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__ENVS,
				GHA_metamodelFactory.eINSTANCE.createEnv()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.PIPELINE__DEFAULTSETTING,
				GHA_metamodelFactory.eINSTANCE.createDefaultSetting()));
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
