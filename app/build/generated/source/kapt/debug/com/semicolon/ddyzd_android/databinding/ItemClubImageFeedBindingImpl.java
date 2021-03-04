package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemClubImageFeedBindingImpl extends ItemClubImageFeedBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 9);
        sViewsWithIds.put(R.id.view2, 10);
        sViewsWithIds.put(R.id.indicator, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemClubImageFeedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemClubImageFeedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.viewpager2.widget.ViewPager2) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.tabs.TabLayout) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (android.view.View) bindings[10]
            );
        this.imageView3.setTag(null);
        this.imageView4.setTag(null);
        this.imageView6.setTag(null);
        this.imageView8.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView2.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
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
                return onChangeVmFeeds((androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmFeeds(androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> VmFeeds, int fieldId) {
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
        java.lang.Integer position = mPosition;
        java.lang.String vmFeedsPositionFlagsJavaLangStringFlags = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> vmFeeds = null;
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
        com.semicolon.ddyzd_android.adapter.ClubFeedPagerAdapter vmDetailAdapterPageAdapter = null;
        java.util.Date vmFeedsPositionUploadAt = null;
        com.semicolon.ddyzd_android.model.MainFeedData vmFeedsPosition = null;
        java.util.List<com.semicolon.ddyzd_android.model.MainFeedData> vmFeedsGetValue = null;
        com.semicolon.ddyzd_android.adapter.ClubDetailAdapter vmDetailAdapter = null;
        int vmFeedsPositionFlags = 0;
        java.lang.String vmFeedsPositionClubName = null;
        java.lang.String vmFeedsPositionProfileImage = null;
        java.lang.String vmFeedsPositionContent = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        boolean vmFeedsPositionFlag = false;

        if ((dirtyFlags & 0xfL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                if (vm != null) {
                    // read vm.feeds
                    vmFeeds = vm.getFeeds();
                }
                updateLiveDataRegistration(0, vmFeeds);


                if (vmFeeds != null) {
                    // read vm.feeds.getValue()
                    vmFeedsGetValue = vmFeeds.getValue();
                }


                if (vmFeedsGetValue != null) {
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                    vmFeedsPosition = getFromList(vmFeedsGetValue, androidxDatabindingViewDataBindingSafeUnboxPosition);
                }


                if (vmFeedsPosition != null) {
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].uploadAt
                    vmFeedsPositionUploadAt = vmFeedsPosition.getUploadAt();
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].flags
                    vmFeedsPositionFlags = vmFeedsPosition.getFlags();
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].clubName
                    vmFeedsPositionClubName = vmFeedsPosition.getClubName();
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].profileImage
                    vmFeedsPositionProfileImage = vmFeedsPosition.getProfileImage();
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].content
                    vmFeedsPositionContent = vmFeedsPosition.getContent();
                    // read vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].flag
                    vmFeedsPositionFlag = vmFeedsPosition.getFlag();
                }


                // read (vm.feeds.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].flags) + ("개의 flags")
                vmFeedsPositionFlagsJavaLangStringFlags = (vmFeedsPositionFlags) + ("개의 flags");
            if ((dirtyFlags & 0xcL) != 0) {

                    if (vm != null) {
                        // read vm.detailAdapter
                        vmDetailAdapter = vm.getDetailAdapter();
                    }


                    if (vmDetailAdapter != null) {
                        // read vm.detailAdapter.pageAdapter
                        vmDetailAdapterPageAdapter = vmDetailAdapter.getPageAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter.loadImage(this.imageView3, vmFeedsPositionProfileImage);
            com.semicolon.ddyzd_android.bindingadapter.FlagBindingAdapter.flag(this.imageView6, vmFeedsPositionFlag);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, vmFeedsPositionClubName);
            com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.timeAdapter(this.textView3, vmFeedsPositionUploadAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, vmFeedsPositionContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, vmFeedsPositionFlagsJavaLangStringFlags);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.pageAdapter(this.imageView4, vmDetailAdapterPageAdapter);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.imageView6.setOnClickListener(mCallback7);
            this.imageView8.setOnClickListener(mCallback8);
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
                // vm.feeds != null
                boolean vmFeedsJavaLangObjectNull = false;
                // position
                java.lang.Integer position = mPosition;
                // vm.feeds.getValue()[position] != null
                boolean vmFeedsPositionJavaLangObjectNull = false;
                // vm.feeds.getValue()[position].feedId
                java.lang.String vmFeedsPositionFeedId = null;
                // vm.feeds
                androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> vmFeeds = null;
                // vm.feeds.getValue() != null
                boolean vmFeedsGetValueJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
                // vm.feeds.getValue()[position].owner
                boolean vmFeedsPositionOwner = false;
                // vm.feeds.getValue()[position]
                com.semicolon.ddyzd_android.model.MainFeedData vmFeedsPosition = null;
                // vm.feeds.getValue()
                java.util.List<com.semicolon.ddyzd_android.model.MainFeedData> vmFeedsGetValue = null;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vmFeeds = vm.getFeeds();

                    vmFeedsJavaLangObjectNull = (vmFeeds) != (null);
                    if (vmFeedsJavaLangObjectNull) {


                        vmFeedsGetValue = vmFeeds.getValue();

                        vmFeedsGetValueJavaLangObjectNull = (vmFeedsGetValue) != (null);
                        if (vmFeedsGetValueJavaLangObjectNull) {



                            vmFeedsPosition = getFromList(vmFeedsGetValue, position);

                            vmFeedsPositionJavaLangObjectNull = (vmFeedsPosition) != (null);
                            if (vmFeedsPositionJavaLangObjectNull) {


                                vmFeedsPositionOwner = vmFeedsPosition.getOwner();









                                vmFeedsPositionFeedId = vmFeedsPosition.getFeedId();

                                vm.onMoreClicked(vmFeedsPositionOwner, vmFeedsPositionFeedId);
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.feeds != null
                boolean vmFeedsJavaLangObjectNull = false;
                // vm
                com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel vm = mVm;
                // position
                java.lang.Integer position = mPosition;
                // vm.feeds.getValue()[position]
                com.semicolon.ddyzd_android.model.MainFeedData vmFeedsPosition = null;
                // vm.feeds.getValue()
                java.util.List<com.semicolon.ddyzd_android.model.MainFeedData> vmFeedsGetValue = null;
                // vm.feeds.getValue()[position] != null
                boolean vmFeedsPositionJavaLangObjectNull = false;
                // vm.feeds.getValue()[position].feedId
                java.lang.String vmFeedsPositionFeedId = null;
                // vm.feeds
                androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> vmFeeds = null;
                // vm.feeds.getValue() != null
                boolean vmFeedsGetValueJavaLangObjectNull = false;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vmFeeds = vm.getFeeds();

                    vmFeedsJavaLangObjectNull = (vmFeeds) != (null);
                    if (vmFeedsJavaLangObjectNull) {


                        vmFeedsGetValue = vmFeeds.getValue();

                        vmFeedsGetValueJavaLangObjectNull = (vmFeedsGetValue) != (null);
                        if (vmFeedsGetValueJavaLangObjectNull) {



                            vmFeedsPosition = getFromList(vmFeedsGetValue, position);

                            vmFeedsPositionJavaLangObjectNull = (vmFeedsPosition) != (null);
                            if (vmFeedsPositionJavaLangObjectNull) {


                                vmFeedsPositionFeedId = vmFeedsPosition.getFeedId();


                                vm.flagClicked(vmFeedsPositionFeedId, position);
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
        flag 0 (0x1L): vm.feeds
        flag 1 (0x2L): position
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}