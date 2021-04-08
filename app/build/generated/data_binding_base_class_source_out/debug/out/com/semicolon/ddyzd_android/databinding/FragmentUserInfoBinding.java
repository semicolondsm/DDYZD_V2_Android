// Generated by data binding compiler. Do not edit!
package com.semicolon.ddyzd_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUserInfoBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView14;

  @NonNull
  public final AppCompatButton userBackBtn;

  @NonNull
  public final TextView userClubTitleTv;

  @NonNull
  public final TextView userEmailTv;

  @NonNull
  public final TextView userGcnTv;

  @NonNull
  public final TextView userGitNameTv;

  @NonNull
  public final CircleImageView userProfileIv;

  @NonNull
  public final TextView userProfileNameTv;

  @Bindable
  protected UserInfoViewModel mVm;

  protected FragmentUserInfoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textView14, AppCompatButton userBackBtn, TextView userClubTitleTv,
      TextView userEmailTv, TextView userGcnTv, TextView userGitNameTv,
      CircleImageView userProfileIv, TextView userProfileNameTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView14 = textView14;
    this.userBackBtn = userBackBtn;
    this.userClubTitleTv = userClubTitleTv;
    this.userEmailTv = userEmailTv;
    this.userGcnTv = userGcnTv;
    this.userGitNameTv = userGitNameTv;
    this.userProfileIv = userProfileIv;
    this.userProfileNameTv = userProfileNameTv;
  }

  public abstract void setVm(@Nullable UserInfoViewModel vm);

  @Nullable
  public UserInfoViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static FragmentUserInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserInfoBinding>inflateInternal(inflater, R.layout.fragment_user_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserInfoBinding>inflateInternal(inflater, R.layout.fragment_user_info, null, false, component);
  }

  public static FragmentUserInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentUserInfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserInfoBinding)bind(component, view, R.layout.fragment_user_info);
  }
}