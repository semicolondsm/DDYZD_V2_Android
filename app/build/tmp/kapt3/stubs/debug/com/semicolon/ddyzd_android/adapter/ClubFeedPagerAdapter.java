package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "images", "", "", "imageBinding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubImageFeedBinding;", "(Ljava/util/List;Lcom/semicolon/ddyzd_android/databinding/ItemClubImageFeedBinding;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ImageViewHolder", "app_debug"})
public final class ClubFeedPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<java.lang.String> images = null;
    private final com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding imageBinding = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public ClubFeedPagerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding imageBinding) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "imageView", "Lcom/semicolon/ddyzd_android/databinding/ItemPageImageBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemPageImageBinding;)V", "bind", "", "position", "", "app_debug"})
    public final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemPageImageBinding imageView = null;
        
        public final void bind(int position) {
        }
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemPageImageBinding imageView) {
            super(null);
        }
    }
}