/**
 */
package jenkins_metamodel.provider;

import java.util.Collection;
import java.util.List;

import jenkins_metamodel.Jenkins_metamodelFactory;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Matrix;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jenkins_metamodel.Matrix} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__AXIS);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__STAGES);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__INPUTS);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__WHEN);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__ENVIRONMENTS);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__TOOLS);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__POST);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.MATRIX__STAGE_OPTIONS);
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
	 * This returns Matrix.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Matrix"));
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
		return getString("_UI_Matrix_type");
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

		switch (notification.getFeatureID(Matrix.class)) {
		case Jenkins_metamodelPackage.MATRIX__AXIS:
		case Jenkins_metamodelPackage.MATRIX__STAGES:
		case Jenkins_metamodelPackage.MATRIX__INPUTS:
		case Jenkins_metamodelPackage.MATRIX__WHEN:
		case Jenkins_metamodelPackage.MATRIX__ENVIRONMENTS:
		case Jenkins_metamodelPackage.MATRIX__AGENTS:
		case Jenkins_metamodelPackage.MATRIX__TOOLS:
		case Jenkins_metamodelPackage.MATRIX__POST:
		case Jenkins_metamodelPackage.MATRIX__STAGE_OPTIONS:
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

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AXIS,
				Jenkins_metamodelFactory.eINSTANCE.createAxis()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__STAGES,
				Jenkins_metamodelFactory.eINSTANCE.createStage()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__INPUTS,
				Jenkins_metamodelFactory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createBuildingTag()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangelog()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createTriggeredBy()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangeSet()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createAnyOf()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createTag()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createWhen_Env()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createAllOf()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__WHEN,
				Jenkins_metamodelFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__ENVIRONMENTS,
				Jenkins_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createAny()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createNone()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createDockerfile()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createDocker()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__AGENTS,
				Jenkins_metamodelFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__TOOLS,
				Jenkins_metamodelFactory.eINSTANCE.createTool()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__POST,
				Jenkins_metamodelFactory.eINSTANCE.createPost()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__STAGE_OPTIONS,
				Jenkins_metamodelFactory.eINSTANCE.createSkipDefaultCheckout()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__STAGE_OPTIONS,
				Jenkins_metamodelFactory.eINSTANCE.createRetry()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__STAGE_OPTIONS,
				Jenkins_metamodelFactory.eINSTANCE.createTimeout()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.MATRIX__STAGE_OPTIONS,
				Jenkins_metamodelFactory.eINSTANCE.createTimestamps()));
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
