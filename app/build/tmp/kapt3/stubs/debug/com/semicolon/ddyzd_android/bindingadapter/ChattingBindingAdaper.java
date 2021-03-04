package com.semicolon.ddyzd_android.bindingadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/semicolon/ddyzd_android/bindingadapter/ChattingBindingAdaper;", "", "()V", "chattingListAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;", "loadImage", "imageView", "Landroid/widget/ImageView;", "url", "", "spinnerAdapter", "spinner", "Landroid/widget/Spinner;", "Landroid/widget/SpinnerAdapter;", "spinnerSelect", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChatListViewModel;", "subString", "textView", "Landroid/widget/TextView;", "string", "timeAdapter", "time", "app_debug"})
public final class ChattingBindingAdaper {
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.bindingadapter.ChattingBindingAdaper INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"verChattingAdapter"})
    public static final void chattingListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.adapter.ChattingAdapter adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"chattingImageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"spinner_adapter"})
    public static final void spinnerAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner, @org.jetbrains.annotations.Nullable()
    android.widget.SpinnerAdapter adapter) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @androidx.databinding.BindingAdapter(value = {"spinner_select"})
    public static final void spinnerSelect(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ChatListViewModel viewModel) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @androidx.databinding.BindingAdapter(value = {"string_time_adapter"})
    public static final void timeAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sub_string"})
    public static final void subString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String string) {
    }
    
    private ChattingBindingAdaper() {
        super();
    }
}