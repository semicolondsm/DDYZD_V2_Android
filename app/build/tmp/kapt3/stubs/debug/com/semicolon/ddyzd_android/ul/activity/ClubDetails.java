package com.semicolon.ddyzd_android.ul.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\"\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u001eH\u0014J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\fJ\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\fJ\u0010\u00103\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010\fJ\u0006\u00104\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00065"}, d2 = {"Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "LOGIN_REQUEST", "", "binding", "Lcom/semicolon/ddyzd_android/databinding/ActivityClubDetailsBinding;", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ActivityClubDetailsBinding;", "setBinding", "(Lcom/semicolon/ddyzd_android/databinding/ActivityClubDetailsBinding;)V", "clubId", "", "getClubId", "()Ljava/lang/String;", "setClubId", "(Ljava/lang/String;)V", "showSheet", "Lcom/semicolon/ddyzd_android/ul/fragment/BottomClubSheetDialog;", "getShowSheet", "()Lcom/semicolon/ddyzd_android/ul/fragment/BottomClubSheetDialog;", "setShowSheet", "(Lcom/semicolon/ddyzd_android/ul/fragment/BottomClubSheetDialog;)V", "viewModel", "Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "getViewModel", "()Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "setViewModel", "(Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;)V", "closeSheet", "", "closeUser", "notShowMore", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showMore", "id", "showToast", "message", "showUserInfo", "gcn", "startChatting", "roomId", "startClubDetail", "startGithub", "startLogin", "app_debug"})
public final class ClubDetails extends androidx.appcompat.app.AppCompatActivity {
    private final int LOGIN_REQUEST = 132;
    public com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding binding;
    public java.lang.String clubId;
    public com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel viewModel;
    public com.semicolon.ddyzd_android.ul.fragment.BottomClubSheetDialog showSheet;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubId() {
        return null;
    }
    
    public final void setClubId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.fragment.BottomClubSheetDialog getShowSheet() {
        return null;
    }
    
    public final void setShowSheet(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.fragment.BottomClubSheetDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void startLogin() {
    }
    
    public final void startChatting(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showMore(int id) {
    }
    
    public final void closeSheet() {
    }
    
    public final void notShowMore() {
    }
    
    public final void startClubDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void showUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String gcn) {
    }
    
    public final void closeUser() {
    }
    
    public final void startGithub(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    public ClubDetails() {
        super();
    }
}