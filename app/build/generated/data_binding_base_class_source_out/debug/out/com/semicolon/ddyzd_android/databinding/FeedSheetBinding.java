// Generated by data binding compiler. Do not edit!
package com.semicolon.ddyzd_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.semicolon.ddyzd_android.R;
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FeedSheetBinding extends ViewDataBinding {
  @NonNull
  public final Button deleteBtn;

  @Bindable
  protected MainFeedViewModel mVm;

  @Bindable
  protected Integer mId;

  protected FeedSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button deleteBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteBtn = deleteBtn;
  }

  public abstract void setVm(@Nullable MainFeedViewModel vm);

  @Nullable
  public MainFeedViewModel getVm() {
    return mVm;
  }

  public abstract void setId(@Nullable Integer id);

  @Nullable
  public Integer getId() {
    return mId;
  }

  @NonNull
  public static FeedSheetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.feed_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FeedSheetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FeedSheetBinding>inflateInternal(inflater, R.layout.feed_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static FeedSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.feed_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FeedSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FeedSheetBinding>inflateInternal(inflater, R.layout.feed_sheet, null, false, component);
  }

  public static FeedSheetBinding bind(@NonNull View view) {
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
  public static FeedSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (FeedSheetBinding)bind(component, view, R.layout.feed_sheet);
  }
}