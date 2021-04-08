package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClubDetailHeaderBindingImpl extends ItemClubDetailHeaderBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClubDetailHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemClubDetailHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            );
        this.backImage.setTag(null);
        this.button3.setTag(null);
        this.categoryTv.setTag(null);
        this.clubNameTv.setTag(null);
        this.descriptionTv.setTag(null);
        this.followBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.profileImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback33 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 2);
        mCallback32 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmClubDetail((androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData>) object, fieldId);
            case 1 :
                return onChangeVmChatBtnText((androidx.lifecycle.MutableLiveData<java.lang.CharSequence>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmClubDetail(androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData> VmClubDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChatBtnText(androidx.lifecycle.MutableLiveData<java.lang.CharSequence> VmChatBtnText, int fieldId) {
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
        java.lang.String vmClubDetailClubimage = null;
        boolean vmClubDetailRecruitment = false;
        java.lang.CharSequence vmChatBtnTextGetValue = null;
        java.lang.String vmClubDetailDescription = null;
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData> vmClubDetail = null;
        java.lang.String vmClubDetailClubtagToString = null;
        boolean vmClubDetailFollow = false;
        java.lang.String vmClubDetailBackimage = null;
        android.graphics.drawable.Drawable vmClubDetailRecruitmentButton3AndroidDrawableFollowBtnBackgroundButton3AndroidDrawableChattingBtnBacground = null;
        java.lang.String vmClubDetailClubname = null;
        android.graphics.drawable.Drawable vmClubDetailFollowFollowBtnAndroidDrawableChattingBtnBacgroundFollowBtnAndroidDrawableFollowBtnBackground = null;
        com.semicolon.ddyzd_android.model.ClubInDetailData vmClubDetailGetValue = null;
        java.util.List<java.lang.String> vmClubDetailClubtag = null;
        java.lang.String vmClubDetailFollowJavaLangStringJavaLangString = null;
        androidx.lifecycle.MutableLiveData<java.lang.CharSequence> vmChatBtnText = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.clubDetail
                        vmClubDetail = vm.getClubDetail();
                    }
                    updateLiveDataRegistration(0, vmClubDetail);


                    if (vmClubDetail != null) {
                        // read vm.clubDetail.getValue()
                        vmClubDetailGetValue = vmClubDetail.getValue();
                    }


                    if (vmClubDetailGetValue != null) {
                        // read vm.clubDetail.getValue().clubimage
                        vmClubDetailClubimage = vmClubDetailGetValue.getClubimage();
                        // read vm.clubDetail.getValue().recruitment
                        vmClubDetailRecruitment = vmClubDetailGetValue.getRecruitment();
                        // read vm.clubDetail.getValue().description
                        vmClubDetailDescription = vmClubDetailGetValue.getDescription();
                        // read vm.clubDetail.getValue().follow
                        vmClubDetailFollow = vmClubDetailGetValue.getFollow();
                        // read vm.clubDetail.getValue().backimage
                        vmClubDetailBackimage = vmClubDetailGetValue.getBackimage();
                        // read vm.clubDetail.getValue().clubname
                        vmClubDetailClubname = vmClubDetailGetValue.getClubname();
                        // read vm.clubDetail.getValue().clubtag
                        vmClubDetailClubtag = vmClubDetailGetValue.getClubtag();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmClubDetailRecruitment) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmClubDetailFollow) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read vm.clubDetail.getValue().recruitment ? @android:drawable/follow_btn_background : @android:drawable/chatting_btn_bacground
                    vmClubDetailRecruitmentButton3AndroidDrawableFollowBtnBackgroundButton3AndroidDrawableChattingBtnBacground = ((vmClubDetailRecruitment) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(button3.getContext(), R.drawable.follow_btn_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(button3.getContext(), R.drawable.chatting_btn_bacground)));
                    // read vm.clubDetail.getValue().follow ? @android:drawable/chatting_btn_bacground : @android:drawable/follow_btn_background
                    vmClubDetailFollowFollowBtnAndroidDrawableChattingBtnBacgroundFollowBtnAndroidDrawableFollowBtnBackground = ((vmClubDetailFollow) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(followBtn.getContext(), R.drawable.chatting_btn_bacground)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(followBtn.getContext(), R.drawable.follow_btn_background)));
                    // read vm.clubDetail.getValue().follow ? "팔로우 취소" : "팔로우"
                    vmClubDetailFollowJavaLangStringJavaLangString = ((vmClubDetailFollow) ? ("팔로우 취소") : ("팔로우"));
                    if (vmClubDetailClubtag != null) {
                        // read vm.clubDetail.getValue().clubtag.toString()
                        vmClubDetailClubtagToString = vmClubDetailClubtag.toString();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.chatBtnText
                        vmChatBtnText = vm.getChatBtnText();
                    }
                    updateLiveDataRegistration(1, vmChatBtnText);


                    if (vmChatBtnText != null) {
                        // read vm.chatBtnText.getValue()
                        vmChatBtnTextGetValue = vmChatBtnText.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadSlideImage(this.backImage, vmClubDetailBackimage);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.button3, vmClubDetailRecruitmentButton3AndroidDrawableFollowBtnBackgroundButton3AndroidDrawableChattingBtnBacground);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.categoryTv, vmClubDetailClubtagToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clubNameTv, vmClubDetailClubname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionTv, vmClubDetailDescription);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.followBtn, vmClubDetailFollowFollowBtnAndroidDrawableChattingBtnBacgroundFollowBtnAndroidDrawableFollowBtnBackground);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.followBtn, vmClubDetailFollowJavaLangStringJavaLangString);
            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadImage(this.profileImage, vmClubDetailClubimage);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.button3.setOnClickListener(mCallback33);
            this.followBtn.setOnClickListener(mCallback32);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.setText(this.button3, vmChatBtnTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.startChatting();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
                // vm.clubDetail
                androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData> vmClubDetail = null;
                // vm.clubDetail.getValue()
                com.semicolon.ddyzd_android.model.ClubInDetailData vmClubDetailGetValue = null;
                // vm.clubDetail != null
                boolean vmClubDetailJavaLangObjectNull = false;
                // vm.clubDetail.getValue() != null
                boolean vmClubDetailGetValueJavaLangObjectNull = false;
                // vm.clubDetail.getValue().follow
                boolean vmClubDetailFollow = false;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vmClubDetail = vm.getClubDetail();

                    vmClubDetailJavaLangObjectNull = (vmClubDetail) != (null);
                    if (vmClubDetailJavaLangObjectNull) {


                        vmClubDetailGetValue = vmClubDetail.getValue();

                        vmClubDetailGetValueJavaLangObjectNull = (vmClubDetailGetValue) != (null);
                        if (vmClubDetailGetValueJavaLangObjectNull) {


                            vmClubDetailFollow = vmClubDetailGetValue.getFollow();
                            if (vmClubDetailFollow) {




                                vm.unFollow();
                            }
                            else {




                                vm.startFollow();
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.clubDetail
        flag 1 (0x2L): vm.chatBtnText
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
        flag 4 (0x5L): vm.clubDetail.getValue().recruitment ? @android:drawable/follow_btn_background : @android:drawable/chatting_btn_bacground
        flag 5 (0x6L): vm.clubDetail.getValue().recruitment ? @android:drawable/follow_btn_background : @android:drawable/chatting_btn_bacground
        flag 6 (0x7L): vm.clubDetail.getValue().follow ? @android:drawable/chatting_btn_bacground : @android:drawable/follow_btn_background
        flag 7 (0x8L): vm.clubDetail.getValue().follow ? @android:drawable/chatting_btn_bacground : @android:drawable/follow_btn_background
        flag 8 (0x9L): vm.clubDetail.getValue().follow ? "팔로우 취소" : "팔로우"
        flag 9 (0xaL): vm.clubDetail.getValue().follow ? "팔로우 취소" : "팔로우"
    flag mapping end*/
    //end
}