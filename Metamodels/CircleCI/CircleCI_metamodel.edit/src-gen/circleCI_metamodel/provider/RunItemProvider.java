/**
 */
package circleCI_metamodel.provider;

import circleCI_metamodel.CircleCI_metamodelFactory;
import circleCI_metamodel.CircleCI_metamodelPackage;
import circleCI_metamodel.Run;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link circleCI_metamodel.Run} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunItemProvider extends StepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunItemProvider(AdapterFactory adapterFactory) {
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

			addWhenPropertyDescriptor(object);
			addBackgroundPropertyDescriptor(object);
			addWorking_directoryPropertyDescriptor(object);
			addNo_output_timeoutPropertyDescriptor(object);
			addShellPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the When feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Run_when_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Run_when_feature", "_UI_Run_type"),
						CircleCI_metamodelPackage.Literals.RUN__WHEN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Run_background_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Run_background_feature", "_UI_Run_type"),
						CircleCI_metamodelPackage.Literals.RUN__BACKGROUND, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Run_working_directory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Run_working_directory_feature",
								"_UI_Run_type"),
						CircleCI_metamodelPackage.Literals.RUN__WORKING_DIRECTORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No output timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNo_output_timeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Run_no_output_timeout_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Run_no_output_timeout_feature",
								"_UI_Run_type"),
						CircleCI_metamodelPackage.Literals.RUN__NO_OUTPUT_TIMEOUT, true, false, false,
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
						getResourceLocator(), getString("_UI_Run_shell_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Run_shell_feature", "_UI_Run_type"),
						CircleCI_metamodelPackage.Literals.RUN__SHELL, true, false, false,
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
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.RUN__ENVIRONMENTS);
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.RUN__RUN_COMMANDS);
			childrenFeatures.add(CircleCI_metamodelPackage.Literals.RUN__PARAMETERS);
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
	 * This returns Run.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Run"));
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
		String label = ((Run) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Run_type")
				: getString("_UI_Run_type") + " " + label;
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

		switch (notification.getFeatureID(Run.class)) {
		case CircleCI_metamodelPackage.RUN__WHEN:
		case CircleCI_metamodelPackage.RUN__BACKGROUND:
		case CircleCI_metamodelPackage.RUN__WORKING_DIRECTORY:
		case CircleCI_metamodelPackage.RUN__NO_OUTPUT_TIMEOUT:
		case CircleCI_metamodelPackage.RUN__SHELL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCI_metamodelPackage.RUN__ENVIRONMENTS:
		case CircleCI_metamodelPackage.RUN__RUN_COMMANDS:
		case CircleCI_metamodelPackage.RUN__PARAMETERS:
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

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.RUN__ENVIRONMENTS,
				CircleCI_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.RUN__RUN_COMMANDS,
				CircleCI_metamodelFactory.eINSTANCE.createRunCommand()));

		newChildDescriptors.add(createChildParameter(CircleCI_metamodelPackage.Literals.RUN__PARAMETERS,
				CircleCI_metamodelFactory.eINSTANCE.createParameters()));
	}

}
