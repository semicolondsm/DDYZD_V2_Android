package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClubApplicationChatBindingImpl extends ItemClubApplicationChatBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout3, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClubApplicationChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemClubApplicationChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatButton) bindings[4];
        this.mboundView4.setTag(null);
        this.textView20.setTag(null);
        this.textView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel Vm) {
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
        java.lang.String vmChattingListPositionTitle = null;
        java.lang.Integer position = mPosition;
        java.util.List<com.semicolon.ddyzd_android.model.ChattingData> vmChattingListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> vmChattingList = null;
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
        java.lang.String vmChattingListPositionMsg = null;
        com.semicolon.ddyzd_android.model.ChattingData vmChattingListPosition = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        java.lang.String vmChattingListPositionCreatedAt = null;

        if ((dirtyFlags & 0xfL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                if (vm != null) {
                    // read vm.chattingList
                    vmChattingList = vm.getChattingList();
                }
                updateLiveDataRegistration(0, vmChattingList);


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
                    // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].msg
                    vmChattingListPositionMsg = vmChattingListPosition.getMsg();
                    // read vm.chattingList.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].created_at
                    vmChattingListPositionCreatedAt = vmChattingListPosition.getCreated_at();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.timeAdapter(this.mboundView2, vmChattingListPositionCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView20, vmChattingListPositionMsg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, vmChattingListPositionTitle);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback30);
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


            vm.helper2();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.chattingList
        flag 1 (0x2L): position
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}