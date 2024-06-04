/**
 */
package org.gemoc.agro.simulation.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.gemoc.agro.simulation.Schedule;
import org.gemoc.agro.simulation.SimulationFactory;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.agro.simulation.Schedule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ScheduleItemProvider(AdapterFactory adapterFactory) {
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

      addExploitationPropertyDescriptor(object);
      addClimateDataPropertyDescriptor(object);
      addSolverSearchSecondsSpentLimitPropertyDescriptor(object);
      addCurrentDayPropertyDescriptor(object);
      addHardScorePropertyDescriptor(object);
      addSoftScorePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Exploitation feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addExploitationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_exploitation_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_exploitation_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__EXPLOITATION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Climate Data feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addClimateDataPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_climateData_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_climateData_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__CLIMATE_DATA,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Solver Search Seconds Spent Limit feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addSolverSearchSecondsSpentLimitPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_solverSearchSecondsSpentLimit_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_solverSearchSecondsSpentLimit_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__SOLVER_SEARCH_SECONDS_SPENT_LIMIT,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Current Day feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addCurrentDayPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_currentDay_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_currentDay_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__CURRENT_DAY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Hard Score feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addHardScorePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_hardScore_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_hardScore_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__HARD_SCORE,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Soft Score feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addSoftScorePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Schedule_softScore_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Schedule_softScore_feature", "_UI_Schedule_type"),
         SimulationPackage.Literals.SCHEDULE__SOFT_SCORE,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This returns Schedule.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Schedule"));
  }

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
    Schedule schedule = (Schedule)object;
    return getString("_UI_Schedule_type") + " " + schedule.getSolverSearchSecondsSpentLimit();
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

    switch (notification.getFeatureID(Schedule.class)) {
      case SimulationPackage.SCHEDULE__WORK_TO_DO:
      case SimulationPackage.SCHEDULE__SOLVER_SEARCH_SECONDS_SPENT_LIMIT:
      case SimulationPackage.SCHEDULE__ALLOCATIONS:
      case SimulationPackage.SCHEDULE__HARD_SCORE:
      case SimulationPackage.SCHEDULE__SOFT_SCORE:
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

    newChildDescriptors.add
      (createChildParameter
        (SimulationPackage.Literals.SCHEDULE__WORK_TO_DO,
         SimulationFactory.eINSTANCE.createActivityWork()));

    newChildDescriptors.add
      (createChildParameter
        (SimulationPackage.Literals.SCHEDULE__ALLOCATIONS,
         SimulationFactory.eINSTANCE.createResourceAllocation()));
  }

	/**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return SimulationEditPlugin.INSTANCE;
  }

}
