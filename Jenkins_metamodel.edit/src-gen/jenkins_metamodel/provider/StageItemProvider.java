/**
 */
package jenkins_metamodel.provider;

import java.util.Collection;
import java.util.List;

import jenkins_metamodel.Jenkins_metamodelFactory;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Stage;

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
 * This is the item provider adapter for a {@link jenkins_metamodel.Stage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StageItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageItemProvider(AdapterFactory adapterFactory) {
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
			addFailFastPropertyDescriptor(object);
			addParallelPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Stage_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_name_feature", "_UI_Stage_type"),
						Jenkins_metamodelPackage.Literals.STAGE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fail Fast feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailFastPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_failFast_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_failFast_feature", "_UI_Stage_type"),
						Jenkins_metamodelPackage.Literals.STAGE__FAIL_FAST, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parallel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Stage_parallel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Stage_parallel_feature", "_UI_Stage_type"),
						Jenkins_metamodelPackage.Literals.STAGE__PARALLEL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__STAGE);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__AGENT);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__POST);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__STEP);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__ENVIRONMENT);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__TOOL);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__INPUT);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.STAGE__WHEN);
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
	 * This returns Stage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Stage"));
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
		String label = ((Stage) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Stage_type")
				: getString("_UI_Stage_type") + " " + label;
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

		switch (notification.getFeatureID(Stage.class)) {
		case Jenkins_metamodelPackage.STAGE__NAME:
		case Jenkins_metamodelPackage.STAGE__FAIL_FAST:
		case Jenkins_metamodelPackage.STAGE__PARALLEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Jenkins_metamodelPackage.STAGE__STAGE:
		case Jenkins_metamodelPackage.STAGE__AGENT:
		case Jenkins_metamodelPackage.STAGE__POST:
		case Jenkins_metamodelPackage.STAGE__STEP:
		case Jenkins_metamodelPackage.STAGE__ENVIRONMENT:
		case Jenkins_metamodelPackage.STAGE__TOOL:
		case Jenkins_metamodelPackage.STAGE__INPUT:
		case Jenkins_metamodelPackage.STAGE__WHEN:
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

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__STAGE,
				Jenkins_metamodelFactory.eINSTANCE.createStage()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createAny()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createNone()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createDocker()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createDockerfile()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__POST,
				Jenkins_metamodelFactory.eINSTANCE.createPost()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__STEP,
				Jenkins_metamodelFactory.eINSTANCE.createStep()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__ENVIRONMENT,
				Jenkins_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__TOOL,
				Jenkins_metamodelFactory.eINSTANCE.createTool()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__INPUT,
				Jenkins_metamodelFactory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangeSet()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createBuildingTag()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangelog()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createWhen_Env()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createTag()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createAllOf()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createAnyOf()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createTriggeredBy()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.STAGE__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Jenkins_metamodelEditPlugin.INSTANCE;
	}

}
