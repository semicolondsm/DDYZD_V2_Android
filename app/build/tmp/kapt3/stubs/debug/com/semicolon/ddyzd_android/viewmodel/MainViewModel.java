package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "navigator", "Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;", "(Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "getNavigator", "()Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;", "onCreate", "", "readAccessToken", "refreshToken", "", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.MainActivity navigator = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> accessToken = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> refreshToken = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> userGcn = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readAccessToken(java.lang.String refreshToken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.MainActivity getNavigator() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.MainActivity navigator) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/MainViewModel$Companion;", "", "()V", "accessToken", "Landroidx/lifecycle/MutableLiveData;", "", "getAccessToken", "()Landroidx/lifecycle/MutableLiveData;", "refreshToken", "getRefreshToken", "userGcn", "getUserGcn", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getAccessToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getRefreshToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserGcn() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}