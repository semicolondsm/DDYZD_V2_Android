package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMemberListBindingImpl extends ItemMemberListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.member_title, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMemberListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemMemberListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.textView8.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        java.util.List<com.semicolon.ddyzd_android.model.MembersData> vmMembersGetValue = null;
        java.lang.String vmMembersSizeJavaLangString = null;
        com.semicolon.ddyzd_android.adapter.ClubMemberAdapter vmMemberAdapter = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> vmMembers = null;
        int vmMembersSize = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm.memberAdapter
                        vmMemberAdapter = vm.getMemberAdapter();
                    }
            }

                if (vm != null) {
                    // read vm.members
                    vmMembers = vm.getMembers();
                }
                updateLiveDataRegistration(0, vmMembers);


                if (vmMembers != null) {
                    // read vm.members.getValue()
                    vmMembersGetValue = vmMembers.getValue();
                }


                if (vmMembersGetValue != null) {
                    // read vm.members.getValue().size()
                    vmMembersSize = vmMembersGetValue.size();
                }


                // read (vm.members.getValue().size()) + ("명")
                vmMembersSizeJavaLangString = (vmMembersSize) + ("명");
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.memberAdapter(this.mboundView2, vmMemberAdapter);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, vmMembersSizeJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.members
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}