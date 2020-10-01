/**
 */
package org.architectural.rationale.provider;


import java.util.Collection;
import java.util.List;

import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.RationaleFactory;
import org.architectural.rationale.RationalePackage;

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
 * This is the item provider adapter for a {@link org.architectural.rationale.ArchitecturalRationale} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturalRationaleItemProvider 
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
	public ArchitecturalRationaleItemProvider(AdapterFactory adapterFactory) {
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchitecturalRationale_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchitecturalRationale_Name_feature", "_UI_ArchitecturalRationale_type"),
				 RationalePackage.Literals.ARCHITECTURAL_RATIONALE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_J);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_C);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_R);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_A);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_CQ);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_AD);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_S);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_T);
			childrenFeatures.add(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_P);
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
	 * This returns ArchitecturalRationale.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArchitecturalRationale"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArchitecturalRationale)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArchitecturalRationale_type") :
			getString("_UI_ArchitecturalRationale_type") + " " + label;
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

		switch (notification.getFeatureID(ArchitecturalRationale.class)) {
			case RationalePackage.ARCHITECTURAL_RATIONALE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_J:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_C:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_R:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_A:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_CQ:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_AD:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_S:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_T:
			case RationalePackage.ARCHITECTURAL_RATIONALE__AHAVE_P:
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

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_J,
				 RationaleFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_C,
				 RationaleFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_R,
				 RationaleFactory.eINSTANCE.createRationale()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_A,
				 RationaleFactory.eINSTANCE.createAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_CQ,
				 RationaleFactory.eINSTANCE.createConsequence()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_AD,
				 RationaleFactory.eINSTANCE.createArchitecturalDecision()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_S,
				 RationaleFactory.eINSTANCE.createArchitecturalStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_T,
				 RationaleFactory.eINSTANCE.createArchitecturalTactic()));

		newChildDescriptors.add
			(createChildParameter
				(RationalePackage.Literals.ARCHITECTURAL_RATIONALE__AHAVE_P,
				 RationaleFactory.eINSTANCE.createArchitecturalPattern()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RationaleEditPlugin.INSTANCE;
	}

}
