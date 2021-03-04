package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClubBindingImpl extends ItemClubBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClubBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemClubBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.clubName.setTag(null);
        this.clubname.setTag(null);
        this.example.setTag(null);
        this.image.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ClubListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ClubListViewModel Vm) {
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
        java.lang.Integer position = mPosition;
        java.util.List<com.semicolon.ddyzd_android.model.ClubProfiles> vmProflieList = null;
        com.semicolon.ddyzd_android.model.ClubProfiles vmProflieListPosition = null;
        java.lang.String vmProflieListPositionExample = null;
        com.semicolon.ddyzd_android.viewmodel.ClubListViewModel vm = mVm;
        java.lang.String vmProflieListPositionName = null;
        java.lang.String vmProflieListPositionImage = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                if (vm != null) {
                    // read vm.proflieList
                    vmProflieList = vm.getProflieList();
                }


                if (vmProflieList != null) {
                    // read vm.proflieList[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                    vmProflieListPosition = getFromList(vmProflieList, androidxDatabindingViewDataBindingSafeUnboxPosition);
                }


                if (vmProflieListPosition != null) {
                    // read vm.proflieList[androidx.databinding.ViewDataBinding.safeUnbox(position)].example
                    vmProflieListPositionExample = vmProflieListPosition.getExample();
                    // read vm.proflieList[androidx.databinding.ViewDataBinding.safeUnbox(position)].name
                    vmProflieListPositionName = vmProflieListPosition.getName();
                    // read vm.proflieList[androidx.databinding.ViewDataBinding.safeUnbox(position)].image
                    vmProflieListPositionImage = vmProflieListPosition.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clubName.setOnClickListener(mCallback30);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clubname, vmProflieListPositionName);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.subString(this.example, vmProflieListPositionExample);
            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadImage(this.image, vmProflieListPositionImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ClubListViewModel vm = mVm;
        // vm.proflieList != null
        boolean vmProflieListJavaLangObjectNull = false;
        // position
        java.lang.Integer position = mPosition;
        // vm.proflieList
        java.util.List<com.semicolon.ddyzd_android.model.ClubProfiles> vmProflieList = null;
        // vm.proflieList[position]
        com.semicolon.ddyzd_android.model.ClubProfiles vmProflieListPosition = null;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {




            vmProflieList = vm.getProflieList();

            vmProflieListJavaLangObjectNull = (vmProflieList) != (null);
            if (vmProflieListJavaLangObjectNull) {



                vmProflieListPosition = getFromList(vmProflieList, position);

                vm.onDetailClicked(vmProflieListPosition);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}