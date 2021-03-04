package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyChatBindingImpl extends ItemMyChatBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemMyChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView19.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmChattingList((androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmChattingList(androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> VmChattingList, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> vmChattingList = null;
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
        java.lang.String vmChattingListPositionMsg = null;
        java.lang.Integer position = mPosition;
        java.util.List<com.semicolon.ddyzd_android.model.ChattingData> vmChattingListGetValue = null;
        com.semicolon.ddyzd_android.model.ChattingData vmChattingListPosition = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;

        if ((dirtyFlags & 0xfL) != 0) {



                if (vm != null) {
                    // read vm.chattingList
                    vmChattingList = vm.getChattingList();
                }
                updateLiveDataRegistration(0, vmChattingList);
                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);


                if (vmChattingList != null) {
                    // read vm.chattingList.getValue()
                    vmChattingListGetValue = vmChattingList.getValue();
                }


                if (vmChattingListGetValue != null) {
                    // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                    vmChattingListPosition = getFromList(vmChattingListGetValue, androidxDatabindingViewDataBindingSafeUnboxPosition);
                }


                if (vmChattingListPosition != null) {
                    // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].msg
                    vmChattingListPositionMsg = vmChattingListPosition.getMsg();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView19, vmChattingListPositionMsg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.chattingList
        flag 1 (0x2L): vm
        flag 2 (0x3L): position
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}