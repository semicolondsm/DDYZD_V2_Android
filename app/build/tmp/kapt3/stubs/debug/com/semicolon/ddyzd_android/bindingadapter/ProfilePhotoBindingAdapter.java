package com.semicolon.ddyzd_android.bindingadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/bindingadapter/ProfilePhotoBindingAdapter;", "", "()V", "loadImage", "", "imageView", "Landroid/widget/ImageView;", "url", "", "loadProfileImage", "loadSlideImage", "app_debug"})
public final class ProfilePhotoBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.bindingadapter.ProfilePhotoBindingAdapter INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"slideImageUrl"})
    public static final void loadSlideImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"profileImage"})
    public static final void loadProfileImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private ProfilePhotoBindingAdapter() {
        super();
    }
}