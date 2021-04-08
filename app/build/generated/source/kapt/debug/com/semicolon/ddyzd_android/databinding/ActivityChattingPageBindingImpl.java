package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChattingPageBindingImpl extends ActivityChattingPageBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.chat_page_send_container, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.chatBody.getValue()
            //         is vm.chatBody.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
            // vm.chatBody != null
            boolean vmChatBodyJavaLangObjectNull = false;
            // vm.chatBody.getValue()
            java.lang.String vmChatBodyGetValue = null;
            // vm.chatBody
            androidx.lifecycle.MutableLiveData<java.lang.String> vmChatBody = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmChatBody = vm.getChatBody();

                vmChatBodyJavaLangObjectNull = (vmChatBody) != (null);
                if (vmChatBodyJavaLangObjectNull) {




                    vmChatBody.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityChattingPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityChattingPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            );
        this.chatPageBcBtn.setTag(null);
        this.chatPageProfileIv.setTag(null);
        this.chatPageRv.setTag(null);
        this.chatPageSupportBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 2);
        mCallback28 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 3);
        mCallback26 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUser((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmUserVisible((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeVmChatBody((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUser(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUserVisible(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmUserVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChatBody(androidx.lifecycle.MutableLiveData<java.lang.String> VmChatBody, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxVmUserGetValue = false;
        java.lang.Boolean vmUserGetValue = null;
        java.lang.String vmUserJavaLangStringJavaLangString = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmUser = null;
        java.lang.String vmClubName = null;
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
        int androidxDatabindingViewDataBindingSafeUnboxVmUserVisibleGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmUserVisible = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmChatBody = null;
        int vmChatBodyLengthInt0MboundView2AndroidColorDesignDefaultColorPrimaryMboundView2AndroidColorGray = 0;
        java.lang.Integer vmUserVisibleGetValue = null;
        int vmChatBodyLength = 0;
        java.lang.String vmClubImage = null;
        boolean vmChatBodyLengthInt0 = false;
        java.lang.String vmChatBodyGetValue = null;
        com.semicolon.ddyzd_android.adapter.ChattingAdapter vmChattingListAdapter = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.user
                        vmUser = vm.getUser();
                    }
                    updateLiveDataRegistration(0, vmUser);


                    if (vmUser != null) {
                        // read vm.user.getValue()
                        vmUserGetValue = vmUser.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.user.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmUserGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmUserGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmUserGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.user.getValue()) ? "지원하기" : "결과보내기"
                    vmUserJavaLangStringJavaLangString = ((androidxDatabindingViewDataBindingSafeUnboxVmUserGetValue) ? ("지원하기") : ("결과보내기"));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (vm != null) {
                        // read vm.clubName
                        vmClubName = vm.getClubName();
                        // read vm.clubImage
                        vmClubImage = vm.getClubImage();
                        // read vm.chattingListAdapter
                        vmChattingListAdapter = vm.getChattingListAdapter();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (vm != null) {
                        // read vm.userVisible
                        vmUserVisible = vm.getUserVisible();
                    }
                    updateLiveDataRegistration(1, vmUserVisible);


                    if (vmUserVisible != null) {
                        // read vm.userVisible.getValue()
                        vmUserVisibleGetValue = vmUserVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.userVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmUserVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmUserVisibleGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.chatBody
                        vmChatBody = vm.getChatBody();
                    }
                    updateLiveDataRegistration(2, vmChatBody);


                    if (vmChatBody != null) {
                        // read vm.chatBody.getValue()
                        vmChatBodyGetValue = vmChatBody.getValue();
                    }


                    if (vmChatBodyGetValue != null) {
                        // read vm.chatBody.getValue().length()
                        vmChatBodyLength = vmChatBodyGetValue.length();
                    }


                    // read vm.chatBody.getValue().length() > 0
                    vmChatBodyLengthInt0 = (vmChatBodyLength) > (0);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(vmChatBodyLengthInt0) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read vm.chatBody.getValue().length() > 0 ? @android:color/design_default_color_primary : @android:color/gray
                    vmChatBodyLengthInt0MboundView2AndroidColorDesignDefaultColorPrimaryMboundView2AndroidColorGray = ((vmChatBodyLengthInt0) ? (getColorFromResource(mboundView2, R.color.design_default_color_primary)) : (getColorFromResource(mboundView2, R.color.gray)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.chatPageBcBtn.setOnClickListener(mCallback28);
            this.chatPageSupportBtn.setOnClickListener(mCallback27);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback26);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.loadImage(this.chatPageProfileIv, vmClubImage);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.chattingListAdapter(this.chatPageRv, vmChattingListAdapter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, vmClubName);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chatPageSupportBtn, vmUserJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.chatPageSupportBtn.setVisibility(androidxDatabindingViewDataBindingSafeUnboxVmUserVisibleGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, vmChatBodyGetValue);
            this.mboundView2.setTextColor(vmChatBodyLengthInt0MboundView2AndroidColorDesignDefaultColorPrimaryMboundView2AndroidColorGray);
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
                com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.chooseHelper();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm.navigater
                com.semicolon.ddyzd_android.ul.activity.ChattingPage vmNavigater = null;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;
                // vm.navigater != null
                boolean vmNavigaterJavaLangObjectNull = false;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vmNavigater = vm.getNavigater();

                    vmNavigaterJavaLangObjectNull = (vmNavigater) != (null);
                    if (vmNavigaterJavaLangObjectNull) {


                        vmNavigater.finish();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.sandChatting();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.user
        flag 1 (0x2L): vm.userVisible
        flag 2 (0x3L): vm.chatBody
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vm.user.getValue()) ? "지원하기" : "결과보내기"
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.user.getValue()) ? "지원하기" : "결과보내기"
        flag 7 (0x8L): vm.chatBody.getValue().length() > 0 ? @android:color/design_default_color_primary : @android:color/gray
        flag 8 (0x9L): vm.chatBody.getValue().length() > 0 ? @android:color/design_default_color_primary : @android:color/gray
    flag mapping end*/
    //end
}