package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUserInfoBindingImpl extends FragmentUserInfoBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_club_title_tv, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView7;
    @NonNull
    private final androidx.core.widget.ContentLoadingProgressBar mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentUserInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (androidx.recyclerview.widget.RecyclerView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (androidx.core.widget.ContentLoadingProgressBar) bindings[9];
        this.mboundView9.setTag(null);
        this.textView14.setTag(null);
        this.userBackBtn.setTag(null);
        this.userEmailTv.setTag(null);
        this.userGcnTv.setTag(null);
        this.userGitNameTv.setTag(null);
        this.userProfileIv.setTag(null);
        this.userProfileNameTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 2);
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
            setVm((com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel Vm) {
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
                return onChangeVmUserInfo((androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData>) object, fieldId);
            case 1 :
                return onChangeVmProgressVisible((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUserInfo(androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> VmUserInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProgressVisible(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmProgressVisible, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue = 0;
        java.lang.String vmUserInfoUserNameLengthInt0VmUserInfoUserNameJavaLangString = null;
        androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> vmUserInfo = null;
        java.lang.Integer vmProgressVisibleGetValue = null;
        java.lang.String vmUserInfoUserId = null;
        com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel vm = mVm;
        java.lang.String vmUserInfoEmail = null;
        com.semicolon.ddyzd_android.model.UserInfoData vmUserInfoGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmProgressVisible = null;
        int vmUserInfoUserNameLength = 0;
        boolean vmUserInfoUserNameLengthInt0 = false;
        java.lang.String vmUserInfoIntroduce = null;
        java.lang.String vmUserInfoImagePath = null;
        java.lang.String vmUserInfoGithub = null;
        java.lang.String vmUserInfoUserName = null;
        com.semicolon.ddyzd_android.adapter.InUserClubsAdapter vmClubAdapter = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.userInfo
                        vmUserInfo = vm.getUserInfo();
                    }
                    updateLiveDataRegistration(0, vmUserInfo);


                    if (vmUserInfo != null) {
                        // read vm.userInfo.getValue()
                        vmUserInfoGetValue = vmUserInfo.getValue();
                    }


                    if (vmUserInfoGetValue != null) {
                        // read vm.userInfo.getValue().userId
                        vmUserInfoUserId = vmUserInfoGetValue.getUserId();
                        // read vm.userInfo.getValue().email
                        vmUserInfoEmail = vmUserInfoGetValue.getEmail();
                        // read vm.userInfo.getValue().introduce
                        vmUserInfoIntroduce = vmUserInfoGetValue.getIntroduce();
                        // read vm.userInfo.getValue().imagePath
                        vmUserInfoImagePath = vmUserInfoGetValue.getImagePath();
                        // read vm.userInfo.getValue().github
                        vmUserInfoGithub = vmUserInfoGetValue.getGithub();
                        // read vm.userInfo.getValue().userName
                        vmUserInfoUserName = vmUserInfoGetValue.getUserName();
                    }


                    if (vmUserInfoUserName != null) {
                        // read vm.userInfo.getValue().userName.length()
                        vmUserInfoUserNameLength = vmUserInfoUserName.length();
                    }


                    // read vm.userInfo.getValue().userName.length() > 0
                    vmUserInfoUserNameLengthInt0 = (vmUserInfoUserNameLength) > (0);
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmUserInfoUserNameLengthInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.progressVisible
                        vmProgressVisible = vm.getProgressVisible();
                    }
                    updateLiveDataRegistration(1, vmProgressVisible);


                    if (vmProgressVisible != null) {
                        // read vm.progressVisible.getValue()
                        vmProgressVisibleGetValue = vmProgressVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.progressVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmProgressVisibleGetValue);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm.clubAdapter
                        vmClubAdapter = vm.getClubAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xdL) != 0) {

                // read vm.userInfo.getValue().userName.length() > 0 ? vm.userInfo.getValue().userName : "로딩실패"
                vmUserInfoUserNameLengthInt0VmUserInfoUserNameJavaLangString = ((vmUserInfoUserNameLengthInt0) ? (vmUserInfoUserName) : ("로딩실패"));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.memberAdapter(this.mboundView7, vmClubAdapter);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView9.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmProgressVisibleGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView14, vmUserInfoIntroduce);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userEmailTv, vmUserInfoEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userGcnTv, vmUserInfoUserId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userGitNameTv, vmUserInfoGithub);
            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadProfileImage(this.userProfileIv, vmUserInfoImagePath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userProfileNameTv, vmUserInfoUserNameLengthInt0VmUserInfoUserNameJavaLangString);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.userBackBtn.setOnClickListener(mCallback3);
            this.userGitNameTv.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.onGithubProfileClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.onBackClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.userInfo
        flag 1 (0x2L): vm.progressVisible
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): vm.userInfo.getValue().userName.length() > 0 ? vm.userInfo.getValue().userName : "로딩실패"
        flag 5 (0x6L): vm.userInfo.getValue().userName.length() > 0 ? vm.userInfo.getValue().userName : "로딩실패"
    flag mapping end*/
    //end
}