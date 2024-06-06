/**
 */
package jenkins_metamodel.provider;

import java.util.Collection;
import java.util.List;

import jenkins_metamodel.Dockerfile;
import jenkins_metamodel.Jenkins_metamodelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jenkins_metamodel.Dockerfile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfileItemProvider extends AgentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfileItemProvider(AdapterFactory adapterFactory) {
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

			addDirPropertyDescriptor(object);
			addAdditionalBuildArgsPropertyDescriptor(object);
			addRegistryUrlPropertyDescriptor(object);
			addRegistryCredentialsIdPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addCustomWorkspacePropertyDescriptor(object);
			addReuseNodePropertyDescriptor(object);
			addArgsPropertyDescriptor(object);
			addFilenamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_dir_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_dir_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__DIR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Build Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalBuildArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Dockerfile_additionalBuildArgs_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_additionalBuildArgs_feature",
						"_UI_Dockerfile_type"),
				Jenkins_metamodelPackage.Literals.DOCKERFILE__ADDITIONAL_BUILD_ARGS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Registry Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistryUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_registryUrl_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_registryUrl_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__REGISTRY_URL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Registry Credentials Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistryCredentialsIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Dockerfile_registryCredentialsId_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_registryCredentialsId_feature",
						"_UI_Dockerfile_type"),
				Jenkins_metamodelPackage.Literals.DOCKERFILE__REGISTRY_CREDENTIALS_ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_label_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__LABEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custom Workspace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomWorkspacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_customWorkspace_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_customWorkspace_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__CUSTOM_WORKSPACE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reuse Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReuseNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_reuseNode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_reuseNode_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__REUSE_NODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_args_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_args_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__ARGS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_filename_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_filename_feature",
								"_UI_Dockerfile_type"),
						Jenkins_metamodelPackage.Literals.DOCKERFILE__FILENAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Dockerfile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dockerfile"));
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
		String label = ((Dockerfile) object).getFilename();
		return label == null || label.length() == 0 ? getString("_UI_Dockerfile_type")
				: getString("_UI_Dockerfile_type") + " " + label;
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

		switch (notification.getFeatureID(Dockerfile.class)) {
		case Jenkins_metamodelPackage.DOCKERFILE__DIR:
		case Jenkins_metamodelPackage.DOCKERFILE__ADDITIONAL_BUILD_ARGS:
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_URL:
		case Jenkins_metamodelPackage.DOCKERFILE__REGISTRY_CREDENTIALS_ID:
		case Jenkins_metamodelPackage.DOCKERFILE__LABEL:
		case Jenkins_metamodelPackage.DOCKERFILE__CUSTOM_WORKSPACE:
		case Jenkins_metamodelPackage.DOCKERFILE__REUSE_NODE:
		case Jenkins_metamodelPackage.DOCKERFILE__ARGS:
		case Jenkins_metamodelPackage.DOCKERFILE__FILENAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
