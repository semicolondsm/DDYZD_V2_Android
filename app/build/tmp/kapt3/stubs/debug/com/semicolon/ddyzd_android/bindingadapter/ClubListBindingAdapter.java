package com.semicolon.ddyzd_android.bindingadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/semicolon/ddyzd_android/bindingadapter/ClubListBindingAdapter;", "", "()V", "clubListAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/semicolon/ddyzd_android/adapter/ChatListAdapter;", "loadImage", "imageView", "Landroid/widget/ImageView;", "url", "", "memberAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setText", "textView", "Landroid/widget/TextView;", "text", "", "app_debug"})
public final class ClubListBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.bindingadapter.ClubListBindingAdapter INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"verChatListAdapter"})
    public static final void clubListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.adapter.ChatListAdapter adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"chatImageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"members_adapter"})
    public static final void memberAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"textByForce"})
    public static final void setText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    private ClubListBindingAdapter() {
        super();
    }
}