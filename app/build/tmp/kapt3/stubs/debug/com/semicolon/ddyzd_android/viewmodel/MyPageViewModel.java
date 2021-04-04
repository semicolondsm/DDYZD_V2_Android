package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0003J\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020!J\u0006\u0010\'\u001a\u00020!J\u0006\u0010(\u001a\u00020!J\u0006\u0010)\u001a\u00020!J\u0006\u0010*\u001a\u00020!J\u0006\u0010+\u001a\u00020!J\u0006\u0010,\u001a\u00020!J\b\u0010-\u001a\u00020!H\u0003J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\u000fH\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/MyPageViewModel;", "Landroidx/lifecycle/ViewModel;", "navigator", "Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;", "(Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "clubAdapter", "Lcom/semicolon/ddyzd_android/adapter/UserClubsAdapter;", "getClubAdapter", "()Lcom/semicolon/ddyzd_android/adapter/UserClubsAdapter;", "modifyGit", "Landroidx/lifecycle/MutableLiveData;", "", "getModifyGit", "()Landroidx/lifecycle/MutableLiveData;", "modifyIntro", "getModifyIntro", "getNavigator", "()Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;", "progressVisible", "", "getProgressVisible", "userClubs", "", "Lcom/semicolon/ddyzd_android/model/UserClubData;", "getUserClubs", "userInfo", "Lcom/semicolon/ddyzd_android/model/UserInfoData;", "getUserInfo", "editGithub", "", "logOut", "onClubDetailClicked", "clubId", "onCreate", "onDoneIntroduceClicked", "onEditProfileClicked", "onGitDoneClicked", "onGitEditClicked", "onGithubProfileClicked", "onLogoutClicked", "onModifyIntroClicked", "readUserInfo", "startModify", "intro", "app_debug"})
public final class MyPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> userInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.UserClubData>> userClubs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.UserClubsAdapter clubAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> modifyIntro = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> modifyGit = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> progressVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.MainActivity navigator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.UserClubData>> getUserClubs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.UserClubsAdapter getClubAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getModifyIntro() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getModifyGit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgressVisible() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    public final void logOut() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readUserInfo() {
    }
    
    public final void onClubDetailClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String clubId) {
    }
    
    /**
     * 수정 선택하는 코드
     */
    public final void onEditProfileClicked() {
    }
    
    /**
     * 깃허브 정보 수정하는 코드
     */
    public final void onGitEditClicked() {
    }
    
    public final void onGitDoneClicked() {
    }
    
    public final void onLogoutClicked() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void editGithub() {
    }
    
    /**
     * 소개 수정 시작,끝내는 코드
     */
    public final void onModifyIntroClicked() {
    }
    
    public final void onDoneIntroduceClicked() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void startModify(@org.jetbrains.annotations.Nullable()
    java.lang.String intro) {
    }
    
    public final void onGithubProfileClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.MainActivity getNavigator() {
        return null;
    }
    
    public MyPageViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.MainActivity navigator) {
        super();
    }
}