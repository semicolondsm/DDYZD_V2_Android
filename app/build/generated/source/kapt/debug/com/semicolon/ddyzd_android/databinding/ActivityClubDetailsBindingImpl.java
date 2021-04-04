package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityClubDetailsBindingImpl extends ActivityClubDetailsBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClubDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityClubDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.clubContainer.setTag(null);
        this.clubDetailsBcBtn.setTag(null);
        this.clubDetailsRc.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
                return onChangeVmIsEmpty((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsEmpty(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmIsEmpty, int fieldId) {
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
        java.lang.Integer vmIsEmptyGetValue = null;
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        int androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue = 0;
        com.semicolon.ddyzd_android.adapter.ClubDetailAdapter vmDetailAdapter = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmIsEmpty = null;
        androidx.recyclerview.widget.RecyclerView.OnScrollListener vmScrollListener = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (vm != null) {
                        // read vm.detailAdapter
                        vmDetailAdapter = vm.getDetailAdapter();
                        // read vm.scrollListener
                        vmScrollListener = vm.getScrollListener();
                    }
            }

                if (vm != null) {
                    // read vm.isEmpty
                    vmIsEmpty = vm.isEmpty();
                }
                updateLiveDataRegistration(0, vmIsEmpty);


                if (vmIsEmpty != null) {
                    // read vm.isEmpty.getValue()
                    vmIsEmptyGetValue = vmIsEmpty.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isEmpty.getValue())
                androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmIsEmptyGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clubDetailsBcBtn.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.mainFeedAdapter(this.clubDetailsRc, vmDetailAdapter);
            com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.onScrollListener(this.clubDetailsRc, vmScrollListener);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.finish();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isEmpty
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}