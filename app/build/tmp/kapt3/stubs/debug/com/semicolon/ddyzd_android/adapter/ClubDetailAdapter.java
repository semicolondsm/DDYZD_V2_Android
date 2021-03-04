package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001f !\"B!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "feeds", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/semicolon/ddyzd_android/model/MainFeedData;", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "(Landroidx/lifecycle/MutableLiveData;Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;)V", "TYPE_FEED", "", "TYPE_HEADER", "TYPE_IMAGE_FEED", "TYPE_MEMBER", "pageAdapter", "Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter;", "getPageAdapter", "()Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter;", "setPageAdapter", "(Lcom/semicolon/ddyzd_android/adapter/ClubFeedPagerAdapter;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClubFeedViewHolder", "ClubImageFeedViewHolder", "HeaderDetailViewHolder", "MembersDetailViewHolder", "app_debug"})
public final class ClubDetailAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int TYPE_HEADER = 0;
    private final int TYPE_MEMBER = 1;
    private final int TYPE_FEED = 2;
    private final int TYPE_IMAGE_FEED = 3;
    public com.semicolon.ddyzd_android.adapter.ClubFeedPagerAdapter pageAdapter;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds = null;
    private final com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.ClubFeedPagerAdapter getPageAdapter() {
        return null;
    }
    
    public final void setPageAdapter(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.adapter.ClubFeedPagerAdapter p0) {
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
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public ClubDetailAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter$HeaderDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubDetailHeaderBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemClubDetailHeaderBinding;)V", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ItemClubDetailHeaderBinding;", "bind", "", "app_debug"})
    public final class HeaderDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBinding binding = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBinding getBinding() {
            return null;
        }
        
        public HeaderDetailViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter$MembersDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemMemberListBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemMemberListBinding;)V", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ItemMemberListBinding;", "bind", "", "app_debug"})
    public final class MembersDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.semicolon.ddyzd_android.databinding.ItemMemberListBinding binding = null;
        
        public final void bind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.semicolon.ddyzd_android.databinding.ItemMemberListBinding getBinding() {
            return null;
        }
        
        public MembersDetailViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemMemberListBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter$ClubFeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubFeedBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemClubFeedBinding;)V", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ItemClubFeedBinding;", "bind", "", "position", "", "app_debug"})
    public final class ClubFeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.semicolon.ddyzd_android.databinding.ItemClubFeedBinding binding = null;
        
        public final void bind(int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.semicolon.ddyzd_android.databinding.ItemClubFeedBinding getBinding() {
            return null;
        }
        
        public ClubFeedViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubFeedBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter$ClubImageFeedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubImageFeedBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemClubImageFeedBinding;)V", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ItemClubImageFeedBinding;", "bind", "", "position", "", "app_debug"})
    public final class ClubImageFeedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding binding = null;
        
        public final void bind(int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding getBinding() {
            return null;
        }
        
        public ClubImageFeedViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding binding) {
            super(null);
        }
    }
}