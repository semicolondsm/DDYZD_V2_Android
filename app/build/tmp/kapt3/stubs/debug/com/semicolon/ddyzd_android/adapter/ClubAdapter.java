package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/semicolon/ddyzd_android/adapter/ClubAdapter$CustomViewHolder;", "clubAdapter", "Ljava/util/ArrayList;", "Lcom/semicolon/ddyzd_android/model/ClubProfiles;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubListViewModel;", "(Ljava/util/ArrayList;Lcom/semicolon/ddyzd_android/viewmodel/ClubListViewModel;)V", "getClubAdapter", "()Ljava/util/ArrayList;", "getViewModel", "()Lcom/semicolon/ddyzd_android/viewmodel/ClubListViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomViewHolder", "app_debug"})
public final class ClubAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.semicolon.ddyzd_android.adapter.ClubAdapter.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.semicolon.ddyzd_android.model.ClubProfiles> clubAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.viewmodel.ClubListViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.semicolon.ddyzd_android.adapter.ClubAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.adapter.ClubAdapter.CustomViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.semicolon.ddyzd_android.model.ClubProfiles> getClubAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.viewmodel.ClubListViewModel getViewModel() {
        return null;
    }
    
    public ClubAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.semicolon.ddyzd_android.model.ClubProfiles> clubAdapter, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ClubListViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubBinding;", "(Lcom/semicolon/ddyzd_android/databinding/ItemClubBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubListViewModel;", "app_debug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemClubBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ClubListViewModel viewModel) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubBinding binding) {
            super(null);
        }
    }
}