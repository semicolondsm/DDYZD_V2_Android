package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserClubBindingImpl extends ItemUserClubBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserClubBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemUserClubBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.imageView12.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView16.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
        if (BR.club == variableId) {
            setClub((com.semicolon.ddyzd_android.model.UserClubData) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.MyPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClub(@Nullable com.semicolon.ddyzd_android.model.UserClubData Club) {
        this.mClub = Club;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.club);
        super.requestRebind();
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
        com.semicolon.ddyzd_android.model.UserClubData club = mClub;
        com.semicolon.ddyzd_android.viewmodel.MyPageViewModel vm = mVm;
        java.lang.String clubClubName = null;
        java.lang.String clubClubImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (club != null) {
                    // read club.clubName
                    clubClubName = club.getClubName();
                    // read club.clubImage
                    clubClubImage = club.getClubImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imageView12.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadImage(this.imageView12, clubClubImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView16, clubClubName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // club
        com.semicolon.ddyzd_android.model.UserClubData club = mClub;
        // vm
        com.semicolon.ddyzd_android.viewmodel.MyPageViewModel vm = mVm;
        // club != null
        boolean clubJavaLangObjectNull = false;
        // club.clubId
        java.lang.String clubClubId = null;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            clubJavaLangObjectNull = (club) != (null);
            if (clubJavaLangObjectNull) {


                clubClubId = club.getClubId();

                vm.onClubDetailClicked(clubClubId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): club
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}