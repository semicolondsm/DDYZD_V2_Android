package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0017J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "feeds", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/semicolon/ddyzd_android/model/MainFeedData;", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;", "(Landroidx/lifecycle/MutableLiveData;Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;)V", "HEADER_FEED_TYPE", "", "IMAGE_FEED_TYPE", "MAIN_FEED_TYPE", "pageAdapter", "Lcom/semicolon/ddyzd_android/adapter/FeedPagerAdapter;", "getPageAdapter", "()Lcom/semicolon/ddyzd_android/adapter/FeedPagerAdapter;", "setPageAdapter", "(Lcom/semicolon/ddyzd_android/adapter/FeedPagerAdapter;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HeaderFeedViewHolder", "ImageFeedViewHolder", "MainFeedViewHolder", "app_debug"})
public final class MainFeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int MAIN_FEED_TYPE = 0;
    private final int IMAGE_FEED_TYPE = 1;
    private final int HEADER_FEED_TYPE = 2;
    public com.semicolon.ddyzd_android.adapter.FeedPagerAdapter pageAdapter;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds = null;
    private final com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.FeedPagerAdapter getPageAdapter() {
        return null;
    }
    
    public final void setPageAdapter(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.adapter.FeedPagerAdapter p0) {
    }
    
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
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public MainFeedAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter$MainFeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemFeedBinding;", "(Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemFeedBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;", "app_debug"})
    public final class MainFeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemFeedBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel viewModel) {
        }
        
        public MainFeedViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemFeedBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter$ImageFeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemImageFeedBinding;", "(Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemImageFeedBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;", "app_debug"})
    public final class ImageFeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel viewModel) {
        }
        
        public ImageFeedViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter$HeaderFeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemFeedHeaderBinding;", "(Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemFeedHeaderBinding;)V", "bind", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;", "app_debug"})
    public final class HeaderFeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemFeedHeaderBinding binding = null;
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel viewModel) {
        }
        
        public HeaderFeedViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemFeedHeaderBinding binding) {
            super(null);
        }
    }
}