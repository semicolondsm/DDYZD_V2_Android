package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserResultChatBindingImpl extends ItemUserResultChatBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout3, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserResultChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemUserResultChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.resultBtn.setTag(null);
        this.textView.setTag(null);
        this.textView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUserResult2((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmChattingList((androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUserResult2(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmUserResult2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChattingList(androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> VmChattingList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String vmChattingListPositionTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmUserResult2GetValue = false;
        int vmUserResult2VmVisibleVmGone = 0;
        java.lang.Integer position = mPosition;
        java.util.List<com.semicolon.ddyzd_android.model.ChattingData> vmChattingListGetValue = null;
        int vmVisible = 0;
        int vmGone = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmUserResult2 = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> vmChattingList = null;
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
        com.semicolon.ddyzd_android.model.ChattingData vmChattingListPosition = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        java.lang.Boolean vmUserResult2GetValue = null;
        java.lang.String vmChattingListPositionCreatedAt = null;

        if ((dirtyFlags & 0x1eL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
        }
        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.userResult2
                        vmUserResult2 = vm.getUserResult2();
                    }
                    updateLiveDataRegistration(0, vmUserResult2);


                    if (vmUserResult2 != null) {
                        // read vm.userResult2.getValue()
                        vmUserResult2GetValue = vmUserResult2.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.userResult2.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmUserResult2GetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmUserResult2GetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmUserResult2GetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
            }
            if ((dirtyFlags & 0x1eL) != 0) {

                    if (vm != null) {
                        // read vm.chattingList
                        vmChattingList = vm.getChattingList();
                    }
                    updateLiveDataRegistration(1, vmChattingList);


                    if (vmChattingList != null) {
                        // read vm.chattingList.getValue()
                        vmChattingListGetValue = vmChattingList.getValue();
                    }


                    if (vmChattingListGetValue != null) {
                        // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                        vmChattingListPosition = getFromList(vmChattingListGetValue, androidxDatabindingViewDataBindingSafeUnboxPosition);
                    }


                    if (vmChattingListPosition != null) {
                        // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].title
                        vmChattingListPositionTitle = vmChattingListPosition.getTitle();
                        // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].created_at
                        vmChattingListPositionCreatedAt = vmChattingListPosition.getCreated_at();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (vm != null) {
                    // read vm.visible
                    vmVisible = vm.getVisible();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (vm != null) {
                    // read vm.gone
                    vmGone = vm.getGone();
                }
        }

        if ((dirtyFlags & 0x19L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.userResult2.getValue()) ? vm.visible : vm.gone
                vmUserResult2VmVisibleVmGone = ((androidxDatabindingViewDataBindingSafeUnboxVmUserResult2GetValue) ? (vmVisible) : (vmGone));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.resultBtn.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.resultBtn.setVisibility(vmUserResult2VmVisibleVmGone);
        }
        if ((dirtyFlags & 0x1eL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, vmChattingListPositionCreatedAt);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.timeAdapter(this.textView, vmChattingListPositionCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, vmChattingListPositionTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.helper4();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.userResult2
        flag 1 (0x2L): vm.chattingList
        flag 2 (0x3L): position
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.userResult2.getValue()) ? vm.visible : vm.gone
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.userResult2.getValue()) ? vm.visible : vm.gone
    flag mapping end*/
    //end
}