package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChatListBindingImpl extends ActivityChatListBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.chat_list_title_tv, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.ContentLoadingProgressBar mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityChatListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityChatListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.chatListBackBtn.setTag(null);
        this.chatListRv.setTag(null);
        this.chatListSpin.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.core.widget.ContentLoadingProgressBar) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
        if (BR.positon == variableId) {
            setPositon((java.lang.Integer) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ChatListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPositon(@Nullable java.lang.Integer Positon) {
        this.mPositon = Positon;
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChatListViewModel Vm) {
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
                return onChangeVmProgressVisible((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmProgressVisible(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmProgressVisible, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmProgressVisible = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue = 0;
        java.lang.Integer vmProgressVisibleGetValue = null;
        android.widget.ArrayAdapter<java.lang.String> vmSpinnerAdapter = null;
        com.semicolon.ddyzd_android.viewmodel.ChatListViewModel vm = mVm;
        com.semicolon.ddyzd_android.adapter.ChatListAdapter vmClubListAdapter = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (vm != null) {
                    // read vm.progressVisible
                    vmProgressVisible = vm.getProgressVisible();
                }
                updateLiveDataRegistration(0, vmProgressVisible);


                if (vmProgressVisible != null) {
                    // read vm.progressVisible.getValue()
                    vmProgressVisibleGetValue = vmProgressVisible.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.progressVisible.getValue())
                androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmProgressVisibleGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm.spinnerAdapter
                        vmSpinnerAdapter = vm.getSpinnerAdapter();
                        // read vm.clubListAdapter
                        vmClubListAdapter = vm.getClubListAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.chatListBackBtn.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.clubListAdapter(this.chatListRv, vmClubListAdapter);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.spinnerAdapter(this.chatListSpin, vmSpinnerAdapter);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.spinnerSelect(this.chatListSpin, vm);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ChatListViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.onBackClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.progressVisible
        flag 1 (0x2L): positon
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}