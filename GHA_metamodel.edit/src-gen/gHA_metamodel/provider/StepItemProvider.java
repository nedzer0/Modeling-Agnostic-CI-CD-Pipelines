/**
 */
package gHA_metamodel.provider;

import gHA_metamodel.GHA_metamodelFactory;
import gHA_metamodel.GHA_metamodelPackage;
import gHA_metamodel.Step;

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
 * This is the item provider adapter for a {@link gHA_metamodel.Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StepItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepItemProvider(AdapterFactory adapterFactory) {
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
			addWorking_directoryPropertyDescriptor(object);
			addShellPropertyDescriptor(object);
			addContinue_on_errorPropertyDescriptor(object);
			addTimeout_minutesPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Step_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_name_feature", "_UI_Step_type"),
						GHA_metamodelPackage.Literals.STEP__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Working directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorking_directoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Step_working_directory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_working_directory_feature",
								"_UI_Step_type"),
						GHA_metamodelPackage.Literals.STEP__WORKING_DIRECTORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Shell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShellPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Step_shell_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_shell_feature", "_UI_Step_type"),
						GHA_metamodelPackage.Literals.STEP__SHELL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Step_continue_on_error_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_continue_on_error_feature",
								"_UI_Step_type"),
						GHA_metamodelPackage.Literals.STEP__CONTINUE_ON_ERROR, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Step_timeout_minutes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_timeout_minutes_feature",
								"_UI_Step_type"),
						GHA_metamodelPackage.Literals.STEP__TIMEOUT_MINUTES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(GHA_metamodelPackage.Literals.STEP__COMMANDS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.STEP__PARAMETERS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.STEP__ACTIONS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.STEP__ENVS);
			childrenFeatures.add(GHA_metamodelPackage.Literals.STEP__IF);
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
	 * This returns Step.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Step"));
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
		String label = ((Step) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Step_type")
				: getString("_UI_Step_type") + " " + label;
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

		switch (notification.getFeatureID(Step.class)) {
		case GHA_metamodelPackage.STEP__NAME:
		case GHA_metamodelPackage.STEP__WORKING_DIRECTORY:
		case GHA_metamodelPackage.STEP__SHELL:
		case GHA_metamodelPackage.STEP__CONTINUE_ON_ERROR:
		case GHA_metamodelPackage.STEP__TIMEOUT_MINUTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHA_metamodelPackage.STEP__COMMANDS:
		case GHA_metamodelPackage.STEP__PARAMETERS:
		case GHA_metamodelPackage.STEP__ACTIONS:
		case GHA_metamodelPackage.STEP__ENVS:
		case GHA_metamodelPackage.STEP__IF:
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

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__COMMANDS,
				GHA_metamodelFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__PARAMETERS,
				GHA_metamodelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createDocker()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createRestoreCache()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ACTIONS,
				GHA_metamodelFactory.eINSTANCE.createSaveCache()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__ENVS,
				GHA_metamodelFactory.eINSTANCE.createEnv()));

		newChildDescriptors.add(createChildParameter(GHA_metamodelPackage.Literals.STEP__IF,
				GHA_metamodelFactory.eINSTANCE.createIf()));
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
