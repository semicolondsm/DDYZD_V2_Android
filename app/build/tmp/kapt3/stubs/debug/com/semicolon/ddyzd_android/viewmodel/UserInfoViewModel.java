package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020#J\b\u0010(\u001a\u00020#H\u0003R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017\u00a8\u0006)"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/UserInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "navigator", "Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;", "gcn", "", "(Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;Ljava/lang/String;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "clubAdapter", "Lcom/semicolon/ddyzd_android/adapter/InUserClubsAdapter;", "getClubAdapter", "()Lcom/semicolon/ddyzd_android/adapter/InUserClubsAdapter;", "getGcn", "()Ljava/lang/String;", "getNavigator", "()Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;", "progressVisible", "Landroidx/lifecycle/MutableLiveData;", "", "getProgressVisible", "()Landroidx/lifecycle/MutableLiveData;", "setToken", "getSetToken", "setSetToken", "(Ljava/lang/String;)V", "userClubs", "", "Lcom/semicolon/ddyzd_android/model/UserClubData;", "userInfo", "Lcom/semicolon/ddyzd_android/model/UserInfoData;", "getUserInfo", "onBackClicked", "", "onClubDetailClicked", "clubId", "onCreate", "onGithubProfileClicked", "readUserInfo", "app_debug"})
public final class UserInfoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> userInfo = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.UserClubData>> userClubs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.InUserClubsAdapter clubAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> progressVisible = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String setToken;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.ClubDetails navigator = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gcn = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.UserInfoData> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.InUserClubsAdapter getClubAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgressVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSetToken() {
        return null;
    }
    
    public final void setSetToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void onCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readUserInfo() {
    }
    
    public final void onBackClicked() {
    }
    
    public final void onClubDetailClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String clubId) {
    }
    
    public final void onGithubProfileClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.ClubDetails getNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGcn() {
        return null;
    }
    
    public UserInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.ClubDetails navigator, @org.jetbrains.annotations.NotNull()
    java.lang.String gcn) {
        super();
    }
}