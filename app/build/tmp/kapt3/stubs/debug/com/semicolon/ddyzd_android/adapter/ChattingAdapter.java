package com.semicolon.ddyzd_android.adapter;

import java.lang.System;

@kotlin.Suppress(names = {"UNREACHABLE_CODE"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\'()*+,-B1\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nH\u0016R\u000e\u0010\u000e\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "chatting", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/semicolon/ddyzd_android/model/ChattingData;", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "index", "", "name", "", "(Landroidx/lifecycle/MutableLiveData;Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;ILjava/lang/String;)V", "CLUB_APPLICATION", "CLUB_RESULT", "MY_CHAT", "SCHEDULE_CHAT", "USER_APPLICATION", "USER_RESULT", "YOUR_CHAT", "getChatting", "()Landroidx/lifecycle/MutableLiveData;", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getViewModel", "()Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClubApplicationChatViewHolder", "ClubResultViewHolder", "MyChatViewHolder", "ScheduleChatViewHolder", "UserApplicationChatViewHolder", "UserResultViewHolder", "YourChatViewHolder", "app_debug"})
public final class ChattingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int MY_CHAT = 0;
    private final int YOUR_CHAT = 1;
    private final int SCHEDULE_CHAT = 2;
    private final int CLUB_APPLICATION = 3;
    private final int USER_APPLICATION = 4;
    private final int CLUB_RESULT = 5;
    private final int USER_RESULT = 6;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> chatting = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel = null;
    private final int index = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> getChatting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel getViewModel() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public ChattingAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> chatting, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel, int index, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$MyChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemMyChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemMyChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class MyChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemMyChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public MyChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemMyChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$YourChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemYourChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemYourChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class YourChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemYourChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public YourChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemYourChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$ScheduleChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemScheduleChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemScheduleChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class ScheduleChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemScheduleChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public ScheduleChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemScheduleChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$ClubApplicationChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubApplicationChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemClubApplicationChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class ClubApplicationChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemClubApplicationChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public ClubApplicationChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubApplicationChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$UserApplicationChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemUserApplicationChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemUserApplicationChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class UserApplicationChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemUserApplicationChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public UserApplicationChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemUserApplicationChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$ClubResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemClubResultChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemClubResultChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class ClubResultViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemClubResultChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public ClubResultViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemClubResultChatBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter$UserResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/semicolon/ddyzd_android/databinding/ItemUserResultChatBinding;", "(Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;Lcom/semicolon/ddyzd_android/databinding/ItemUserResultChatBinding;)V", "bind", "", "position", "", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "app_debug"})
    public final class UserResultViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.semicolon.ddyzd_android.databinding.ItemUserResultChatBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel viewModel) {
        }
        
        public UserResultViewHolder(@org.jetbrains.annotations.NotNull()
        com.semicolon.ddyzd_android.databinding.ItemUserResultChatBinding binding) {
            super(null);
        }
    }
}