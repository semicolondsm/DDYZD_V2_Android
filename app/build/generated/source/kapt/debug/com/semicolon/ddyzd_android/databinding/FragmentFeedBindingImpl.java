package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFeedBindingImpl extends FragmentFeedBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.feed_title_tv, 5);
        sViewsWithIds.put(R.id.feed_logo_iv, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.ContentLoadingProgressBar mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFeedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFeedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.feedChatBtn.setTag(null);
        this.feedIsEmpty.setTag(null);
        this.feedRv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.core.widget.ContentLoadingProgressBar) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
            setVm((com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel Vm) {
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
            case 1 :
                return onChangeVmIsEmpty((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
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
    private boolean onChangeVmIsEmpty(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmIsEmpty, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmProgressVisible = null;
        java.lang.Integer vmIsEmptyGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmIsEmpty = null;
        java.lang.Integer vmProgressVisibleGetValue = null;
        androidx.recyclerview.widget.RecyclerView.OnScrollListener vmScrollListener = null;
        com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel vm = mVm;
        com.semicolon.ddyzd_android.adapter.MainFeedAdapter vmFeedAdapter = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue = 0;

        if ((dirtyFlags & 0xfL) != 0) {


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
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.isEmpty
                        vmIsEmpty = vm.isEmpty();
                    }
                    updateLiveDataRegistration(1, vmIsEmpty);


                    if (vmIsEmpty != null) {
                        // read vm.isEmpty.getValue()
                        vmIsEmptyGetValue = vmIsEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isEmpty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmIsEmptyGetValue);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm.scrollListener
                        vmScrollListener = vm.getScrollListener();
                        // read vm.feedAdapter
                        vmFeedAdapter = vm.getFeedAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.feedChatBtn.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.feedIsEmpty.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.mainFeedAdapter(this.feedRv, vmFeedAdapter, vmScrollListener);
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
        com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.onChattingClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.progressVisible
        flag 1 (0x2L): vm.isEmpty
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}