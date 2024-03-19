/**
 */
package jenkins_metamodel.provider;

import java.util.Collection;
import java.util.List;

import jenkins_metamodel.Jenkins_metamodelFactory;
import jenkins_metamodel.Jenkins_metamodelPackage;
import jenkins_metamodel.Pipeline;

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
 * This is the item provider adapter for a {@link jenkins_metamodel.Pipeline} object.
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
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__ENVIRONMENT);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__STAGE);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__POST);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__PARAMETER_DIRECTIVE);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__TRIGGER);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__TOOL);
			childrenFeatures.add(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT);
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
		return getString("_UI_Pipeline_type");
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
		case Jenkins_metamodelPackage.PIPELINE__ENVIRONMENT:
		case Jenkins_metamodelPackage.PIPELINE__STAGE:
		case Jenkins_metamodelPackage.PIPELINE__POST:
		case Jenkins_metamodelPackage.PIPELINE__PARAMETER_DIRECTIVE:
		case Jenkins_metamodelPackage.PIPELINE__TRIGGER:
		case Jenkins_metamodelPackage.PIPELINE__TOOL:
		case Jenkins_metamodelPackage.PIPELINE__AGENT:
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

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__ENVIRONMENT,
				Jenkins_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__STAGE,
				Jenkins_metamodelFactory.eINSTANCE.createStage()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__POST,
				Jenkins_metamodelFactory.eINSTANCE.createPost()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__PARAMETER_DIRECTIVE,
				Jenkins_metamodelFactory.eINSTANCE.createParameter_Directive()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__TRIGGER,
				Jenkins_metamodelFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__TOOL,
				Jenkins_metamodelFactory.eINSTANCE.createTool()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createAny()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createNone()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createNode()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createDocker()));

		newChildDescriptors.add(createChildParameter(Jenkins_metamodelPackage.Literals.PIPELINE__AGENT,
				Jenkins_metamodelFactory.eINSTANCE.createDockerfile()));
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
