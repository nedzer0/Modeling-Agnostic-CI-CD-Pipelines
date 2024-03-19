/**
 */
package travisCI_metamodel.provider;

import java.util.Collection;
import java.util.List;

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

import travisCI_metamodel.Pipeline;
import travisCI_metamodel.TravisCI_metamodelFactory;
import travisCI_metamodel.TravisCI_metamodelPackage;

/**
 * This is the item provider adapter for a {@link travisCI_metamodel.Pipeline} object.
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
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__INSTALL);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__JOB);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__LANGUAGE);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__PIPELINE_ENVIRONMENT);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__IF);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__BRANCH);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__STAGE);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__SERVICE);
			childrenFeatures.add(TravisCI_metamodelPackage.Literals.PIPELINE__ALLOW_FAILURE);
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
		case TravisCI_metamodelPackage.PIPELINE__INSTALL:
		case TravisCI_metamodelPackage.PIPELINE__JOB:
		case TravisCI_metamodelPackage.PIPELINE__LANGUAGE:
		case TravisCI_metamodelPackage.PIPELINE__PIPELINE_ENVIRONMENT:
		case TravisCI_metamodelPackage.PIPELINE__IF:
		case TravisCI_metamodelPackage.PIPELINE__BRANCH:
		case TravisCI_metamodelPackage.PIPELINE__STAGE:
		case TravisCI_metamodelPackage.PIPELINE__SERVICE:
		case TravisCI_metamodelPackage.PIPELINE__ALLOW_FAILURE:
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

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__INSTALL,
				TravisCI_metamodelFactory.eINSTANCE.createInstall()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__JOB,
				TravisCI_metamodelFactory.eINSTANCE.createJob()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__LANGUAGE,
				TravisCI_metamodelFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__PIPELINE_ENVIRONMENT,
				TravisCI_metamodelFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__IF,
				TravisCI_metamodelFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__BRANCH,
				TravisCI_metamodelFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__STAGE,
				TravisCI_metamodelFactory.eINSTANCE.createStage()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__SERVICE,
				TravisCI_metamodelFactory.eINSTANCE.createService()));

		newChildDescriptors.add(createChildParameter(TravisCI_metamodelPackage.Literals.PIPELINE__ALLOW_FAILURE,
				TravisCI_metamodelFactory.eINSTANCE.createAllow_Failure()));
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
