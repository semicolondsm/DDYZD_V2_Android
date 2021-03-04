package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentClublistBindingImpl extends FragmentClublistBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.club_tab_layout, 3);
        sViewsWithIds.put(R.id.total, 4);
        sViewsWithIds.put(R.id.web, 5);
        sViewsWithIds.put(R.id.app, 6);
        sViewsWithIds.put(R.id.imbe, 7);
        sViewsWithIds.put(R.id.guitar, 8);
        sViewsWithIds.put(R.id.creative, 9);
        sViewsWithIds.put(R.id.free, 10);
        sViewsWithIds.put(R.id.chairman, 11);
        sViewsWithIds.put(R.id.club_list_rv, 12);
        sViewsWithIds.put(R.id.club_list_title_tv, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.ContentLoadingProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClublistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentClublistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.tabs.TabItem) bindings[6]
            , (com.google.android.material.tabs.TabItem) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (com.google.android.material.tabs.TabLayout) bindings[3]
            , (com.google.android.material.tabs.TabItem) bindings[9]
            , (com.google.android.material.tabs.TabItem) bindings[10]
            , (com.google.android.material.tabs.TabItem) bindings[8]
            , (com.google.android.material.tabs.TabItem) bindings[7]
            , (com.google.android.material.tabs.TabItem) bindings[4]
            , (com.google.android.material.tabs.TabItem) bindings[5]
            );
        this.clubListIsEmpty.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.core.widget.ContentLoadingProgressBar) bindings[2];
        this.mboundView2.setTag(null);
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
            setVm((com.semicolon.ddyzd_android.viewmodel.ClubListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ClubListViewModel Vm) {
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
                return onChangeVmIsEmpty((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeVmProgressView((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
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
    private boolean onChangeVmProgressView(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmProgressView, int fieldId) {
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
        java.lang.Integer vmIsEmptyGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressViewGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmIsEmpty = null;
        java.lang.Integer vmProgressViewGetValue = null;
        com.semicolon.ddyzd_android.viewmodel.ClubListViewModel vm = mVm;
        int androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmProgressView = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

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
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.progressView
                        vmProgressView = vm.getProgressView();
                    }
                    updateLiveDataRegistration(1, vmProgressView);


                    if (vmProgressView != null) {
                        // read vm.progressView.getValue()
                        vmProgressViewGetValue = vmProgressView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.progressView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmProgressViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmProgressViewGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.clubListIsEmpty.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmIsEmptyGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmProgressViewGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isEmpty
        flag 1 (0x2L): vm.progressView
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}