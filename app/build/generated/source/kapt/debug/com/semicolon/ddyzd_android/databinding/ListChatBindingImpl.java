package com.semicolon.ddyzd_android.databinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListChatBindingImpl extends ListChatBinding implements com.semicolon.ddyzd_android.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback23;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.circleImageView.setTag(null);
        this.clubname.setTag(null);
        this.example.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.semicolon.ddyzd_android.generated.callback.OnClickListener(this, 1);
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.navi == variableId) {
            setNavi((com.semicolon.ddyzd_android.ul.activity.ChatList) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.semicolon.ddyzd_android.viewmodel.ChatListViewModel) variable);
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
    public void setNavi(@Nullable com.semicolon.ddyzd_android.ul.activity.ChatList Navi) {
        this.mNavi = Navi;
    }
    public void setVm(@Nullable com.semicolon.ddyzd_android.viewmodel.ChatListViewModel Vm) {
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
                return onChangeVmList((androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmList(androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>> VmList, int fieldId) {
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
        java.lang.String vmListPositionImage = null;
        java.lang.String vmListPositionName = null;
        java.lang.Integer position = mPosition;
        int vmBlack = 0;
        com.semicolon.ddyzd_android.viewmodel.ChatListViewModel vm = mVm;
        int vmVisibilty = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>> vmList = null;
        int vmListPositionIsreadVmInVisibilityVmVisibilty = 0;
        int vmInVisibility = 0;
        java.lang.String vmListPositionLastmessage = null;
        int vmGray = 0;
        int vmListPositionIsreadVmGrayVmBlack = 0;
        java.util.List<com.semicolon.ddyzd_android.model.RoomData> vmListGetValue = null;
        com.semicolon.ddyzd_android.model.RoomData vmListPosition = null;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        boolean vmListPositionIsread = false;
        java.lang.String vmListPositionLastdate = null;

        if ((dirtyFlags & 0x1bL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                if (vm != null) {
                    // read vm.list
                    vmList = vm.getList();
                }
                updateLiveDataRegistration(0, vmList);


                if (vmList != null) {
                    // read vm.list.getValue()
                    vmListGetValue = vmList.getValue();
                }


                if (vmListGetValue != null) {
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)]
                    vmListPosition = getFromList(vmListGetValue, androidxDatabindingViewDataBindingSafeUnboxPosition);
                }


                if (vmListPosition != null) {
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].image
                    vmListPositionImage = vmListPosition.getImage();
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].name
                    vmListPositionName = vmListPosition.getName();
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].lastmessage
                    vmListPositionLastmessage = vmListPosition.getLastmessage();
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread
                    vmListPositionIsread = vmListPosition.getIsread();
                    // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].lastdate
                    vmListPositionLastdate = vmListPosition.getLastdate();
                }
            if((dirtyFlags & 0x1bL) != 0) {
                if(vmListPositionIsread) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (vm != null) {
                    // read vm.black
                    vmBlack = vm.getBlack();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (vm != null) {
                    // read vm.visibilty
                    vmVisibilty = vm.getVisibilty();
                }
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (vm != null) {
                    // read vm.inVisibility
                    vmInVisibility = vm.getInVisibility();
                }
        }
        if ((dirtyFlags & 0x100L) != 0) {

                if (vm != null) {
                    // read vm.gray
                    vmGray = vm.getGray();
                }
        }

        if ((dirtyFlags & 0x1bL) != 0) {

                // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.inVisibility : vm.visibilty
                vmListPositionIsreadVmInVisibilityVmVisibilty = ((vmListPositionIsread) ? (vmInVisibility) : (vmVisibilty));
                // read vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.gray : vm.black
                vmListPositionIsreadVmGrayVmBlack = ((vmListPositionIsread) ? (vmGray) : (vmBlack));
        }
        // batch finished
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            this.circleImageView.setVisibility(vmListPositionIsreadVmInVisibilityVmVisibilty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clubname, vmListPositionName);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.subString(this.example, vmListPositionLastmessage);
            this.example.setTextColor(vmListPositionIsreadVmGrayVmBlack);
            com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter.loadImage(this.image, vmListPositionImage);
            com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper.timeAdapter(this.time, vmListPositionLastdate);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback23);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm.list.getValue()[position]
        com.semicolon.ddyzd_android.model.RoomData vmListPosition = null;
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.semicolon.ddyzd_android.viewmodel.ChatListViewModel vm = mVm;
        // position
        java.lang.Integer position = mPosition;
        // vm.list
        androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>> vmList = null;
        // vm.list.getValue()
        java.util.List<com.semicolon.ddyzd_android.model.RoomData> vmListGetValue = null;
        // vm.list != null
        boolean vmListJavaLangObjectNull = false;
        // vm.list.getValue() != null
        boolean vmListGetValueJavaLangObjectNull = false;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {




            vmList = vm.getList();

            vmListJavaLangObjectNull = (vmList) != (null);
            if (vmListJavaLangObjectNull) {


                vmListGetValue = vmList.getValue();

                vmListGetValueJavaLangObjectNull = (vmListGetValue) != (null);
                if (vmListGetValueJavaLangObjectNull) {



                    vmListPosition = getFromList(vmListGetValue, position);

                    vm.goChatting(vmListPosition);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.list
        flag 1 (0x2L): position
        flag 2 (0x3L): navi
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
        flag 5 (0x6L): vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.inVisibility : vm.visibilty
        flag 6 (0x7L): vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.inVisibility : vm.visibilty
        flag 7 (0x8L): vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.gray : vm.black
        flag 8 (0x9L): vm.list.getValue()[androidx.databinding.ViewDataBinding.safeUnbox(position)].isread ? vm.gray : vm.black
    flag mapping end*/
    //end
}