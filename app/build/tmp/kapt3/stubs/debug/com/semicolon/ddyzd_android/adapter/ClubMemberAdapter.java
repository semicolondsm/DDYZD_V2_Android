package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubMemberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "members", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/semicolon/ddyzd_android/model/MembersData;", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "(Landroidx/lifecycle/MutableLiveData;Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;)V", "getMembers", "()Landroidx/lifecycle/MutableLiveData;", "getViewModel", "()Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClubMemberViewHolder", "app_debug"})
public final class ClubMemberAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> members = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> getMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel getViewModel() {
        return null;
    }
    
    public ClubMemberAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> members, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ClubMemberAdapter$ClubMemberViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemMemberProfileBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ClubMemberAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemMemberProfileBinding;)V", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ItemMemberProfileBinding;", "bind", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "position", "", "app_debug"})
    public final class ClubMemberViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.semicolon.ddyzd_android.databinding.ItemMemberProfileBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.semicolon.ddyzd_android.databinding.ItemMemberProfileBinding getBinding() {
            return null;
        }
        
        public ClubMemberViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemMemberProfileBinding binding) {
            super(null);
        }
    }
}