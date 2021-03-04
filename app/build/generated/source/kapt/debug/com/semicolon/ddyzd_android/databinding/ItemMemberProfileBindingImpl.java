package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMemberProfileBindingImpl extends ItemMemberProfileBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMemberProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemMemberProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.captainTv.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameTv.setTag(null);
        this.profileImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmMembers((androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmMembers(androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> VmMembers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int vmInvisible = 0;
        java.util.List<com.semicolon.ddyzd_android.model.MembersData> vmMembersGetValue = null;
        java.lang.String vmMembersPositionName = null;
        java.lang.Integer position = mPosition;
        int vmVisible = 0;
        java.lang.String vmMembersPositionImageUrl = null;
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        int positionInt0VmVisibleVmInvisible = 0;
        boolean positionInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        com.semicolon.ddyzd_android.model.MembersData vmMembersPosition = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> vmMembers = null;

        if ((dirtyFlags & 0xfL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                if (vm != null) {
                    // read vm.members
                    vmMembers = vm.getMembers();
                }
                updateLiveDataRegistration(0, vmMembers);

            if ((dirtyFlags & 0xeL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(position) == 0
                    positionInt0 = (androidxDatabindingViewDataBindingSafeUnboxPosition) == (0);
                if((dirtyFlags & 0xeL) != 0) {
                    if(positionInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }

                if (vmMembers != null) {
                    // read vm.members.getValue()
                    vmMembersGetValue = vmMembers.getValue();
                }


                if (vmMembersGetValue != null) {
                    // read vm.members.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                    vmMembersPosition = getFromList(vmMembersGetValue, androidxDatabindingViewDataBindingSafeUnboxPosition);
                }


                if (vmMembersPosition != null) {
                    // read vm.members.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].name
                    vmMembersPositionName = vmMembersPosition.getName();
                    // read vm.members.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].imageUrl
                    vmMembersPositionImageUrl = vmMembersPosition.getImageUrl();
                }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (vm != null) {
                    // read vm.invisible
                    vmInvisible = vm.getInvisible();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (vm != null) {
                    // read vm.visible
                    vmVisible = vm.getVisible();
                }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(position) == 0 ? vm.visible : vm.invisible
                positionInt0VmVisibleVmInvisible = ((positionInt0) ? (vmVisible) : (vmInvisible));
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.captainTv.setVisibility(positionInt0VmVisibleVmInvisible);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback25);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, vmMembersPositionName);
            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadProfileImage(this.profileImage, vmMembersPositionImageUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm.members.getValue()[position] != null
        boolean vmMembersPositionJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        // vm.members.getValue()[position].gcn
        java.lang.String vmMembersPositionGcn = null;
        // vm.members.getValue()
        java.util.List<com.semicolon.ddyzd_android.model.MembersData> vmMembersGetValue = null;
        // position
        java.lang.Integer position = mPosition;
        // vm.members != null
        boolean vmMembersJavaLangObjectNull = false;
        // vm.members.getValue()[position]
        com.semicolon.ddyzd_android.model.MembersData vmMembersPosition = null;
        // vm.members.getValue() != null
        boolean vmMembersGetValueJavaLangObjectNull = false;
        // vm.members
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> vmMembers = null;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {




            vmMembers = vm.getMembers();

            vmMembersJavaLangObjectNull = (vmMembers) != (null);
            if (vmMembersJavaLangObjectNull) {


                vmMembersGetValue = vmMembers.getValue();

                vmMembersGetValueJavaLangObjectNull = (vmMembersGetValue) != (null);
                if (vmMembersGetValueJavaLangObjectNull) {



                    vmMembersPosition = getFromList(vmMembersGetValue, position);

                    vmMembersPositionJavaLangObjectNull = (vmMembersPosition) != (null);
                    if (vmMembersPositionJavaLangObjectNull) {


                        vmMembersPositionGcn = vmMembersPosition.getGcn();

                        vm.gotoUserInfo(vmMembersPositionGcn);
                    }
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.members
        flag 1 (0x2L): position
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(position) == 0 ? vm.visible : vm.invisible
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(position) == 0 ? vm.visible : vm.invisible
    flag mapping end*/
    //end
}