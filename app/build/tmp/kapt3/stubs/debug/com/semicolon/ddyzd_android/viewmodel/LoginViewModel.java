package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\'\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u0007H\u0003J0\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u0007H\u0003J\u0006\u0010.\u001a\u00020(J\u0006\u0010/\u001a\u00020(R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\r\u00a8\u00060"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "instance", "Lcom/semicolon/dsm_sdk_v1/DsmSdk;", "context", "Lcom/semicolon/ddyzd_android/ul/activity/LoginActivity;", "deviceToken", "", "(Lcom/semicolon/dsm_sdk_v1/DsmSdk;Lcom/semicolon/ddyzd_android/ul/activity/LoginActivity;Ljava/lang/String;)V", "accessToken", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "getContext", "()Lcom/semicolon/ddyzd_android/ul/activity/LoginActivity;", "getInstance", "()Lcom/semicolon/dsm_sdk_v1/DsmSdk;", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "refreshToken", "getRefreshToken", "setRefreshToken", "userEmail", "getUserEmail", "setUserEmail", "userGcn", "getUserGcn", "setUserGcn", "userName", "getUserName", "setUserName", "addDeviceToken", "", "finishLogin", "name", "email", "gcn", "readToken", "startLogin", "startWithoutLogin", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessToken = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String refreshToken = "";
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    public java.lang.String userName;
    public java.lang.String userEmail;
    public java.lang.String userGcn;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.dsm_sdk_v1.DsmSdk instance = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.LoginActivity context = null;
    private final java.lang.String deviceToken = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public final void setRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserGcn() {
        return null;
    }
    
    public final void setUserGcn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLoading() {
        return null;
    }
    
    public final void startLogin() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readToken(java.lang.String accessToken) {
    }
    
    private final void finishLogin(java.lang.String name, java.lang.String email, java.lang.String gcn, java.lang.String refreshToken, java.lang.String accessToken) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void addDeviceToken(java.lang.String accessToken) {
    }
    
    public final void startWithoutLogin() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.dsm_sdk_v1.DsmSdk getInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.LoginActivity getContext() {
        return null;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.dsm_sdk_v1.DsmSdk instance, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.LoginActivity context, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceToken) {
        super();
    }
}