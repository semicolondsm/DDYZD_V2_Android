package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SheetGitEditBindingImpl extends SheetGitEditBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextTextPersonName2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.modifyGit.getValue()
            //         is vm.modifyGit.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextTextPersonName2);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.modifyGit != null
            boolean vmModifyGitJavaLangObjectNull = false;
            // vm
            com.semicolon.ddyzd_android.viewmodel.MyPageViewModel vm = mVm;
            // vm.modifyGit.getValue()
            java.lang.String vmModifyGitGetValue = null;
            // vm.modifyGit
            androidx.lifecycle.MutableLiveData<java.lang.String> vmModifyGit = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmModifyGit = vm.getModifyGit();

                vmModifyGitJavaLangObjectNull = (vmModifyGit) != (null);
                if (vmModifyGitJavaLangObjectNull) {




                    vmModifyGit.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public SheetGitEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SheetGitEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.button6.setTag(null);
        this.editTextTextPersonName2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback38 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
            setVm((com.semicolon.ddyzd_android.viewmodel.MyPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.MyPageViewModel Vm) {
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
                return onChangeVmModifyGit((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmModifyGit(androidx.lifecycle.MutableLiveData<java.lang.String> VmModifyGit, int fieldId) {
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
        com.semicolon.ddyzd_android.viewmodel.MyPageViewModel vm = mVm;
        java.lang.String vmModifyGitGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmModifyGit = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.modifyGit
                    vmModifyGit = vm.getModifyGit();
                }
                updateLiveDataRegistration(0, vmModifyGit);


                if (vmModifyGit != null) {
                    // read vm.modifyGit.getValue()
                    vmModifyGitGetValue = vmModifyGit.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.button6.setOnClickListener(mCallback38);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextTextPersonName2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextTextPersonName2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextTextPersonName2, vmModifyGitGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.MyPageViewModel vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.onGitDoneClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.modifyGit
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}