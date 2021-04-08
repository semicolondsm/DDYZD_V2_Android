package com.semicolon.ddyzd_android.bindingadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/semicolon/ddyzd_android/bindingadapter/MainFeedBindingAdapter;", "", "()V", "mainFeedAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "pageAdapter", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "timeAdapter", "textView", "Landroid/widget/TextView;", "time", "Ljava/util/Date;", "app_debug"})
public final class MainFeedBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"adapter", "scroll"})
    public static final void mainFeedAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.OnScrollListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mainPageAdapter"})
    public static final void pageAdapter(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager2, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"showTimeAdapter"})
    public static final void timeAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.util.Date time) {
    }
    
    private MainFeedBindingAdapter() {
        super();
    }
}