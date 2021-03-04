package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nH\u0007J\u0018\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020,2\u0006\u0010-\u001a\u00020\nH\u0007J\u0006\u0010.\u001a\u00020)J\u0006\u0010/\u001a\u00020)J\u0016\u00100\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u0010*\u001a\u00020,J\b\u00103\u001a\u00020)H\u0003J\b\u00104\u001a\u00020)H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00065"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/MainFeedViewModel;", "Landroidx/lifecycle/ViewModel;", "navigator", "Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;", "(Lcom/semicolon/ddyzd_android/ul/activity/MainActivity;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "callApi", "", "getCallApi", "()I", "setCallApi", "(I)V", "feedAdapter", "Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;", "getFeedAdapter", "()Lcom/semicolon/ddyzd_android/adapter/MainFeedAdapter;", "feeds", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/semicolon/ddyzd_android/model/MainFeedData;", "getFeeds", "()Landroidx/lifecycle/MutableLiveData;", "isEmpty", "progressVisible", "getProgressVisible", "readFeed", "Ljava/util/ArrayList;", "getReadFeed", "()Ljava/util/ArrayList;", "setReadFeed", "(Ljava/util/ArrayList;)V", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "setScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V", "deleteFeed", "", "id", "flagClicked", "", "position", "onChattingClicked", "onCreate", "onMoreClicked", "owner", "", "readFeeds", "startLogin", "app_debug"})
public final class MainFeedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.semicolon.ddyzd_android.model.MainFeedData> readFeed;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.MainFeedAdapter feedAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> isEmpty = null;
    private int callApi = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> progressVisible = null;
    private final com.semicolon.ddyzd_android.ul.activity.MainActivity navigator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.semicolon.ddyzd_android.model.MainFeedData> getReadFeed() {
        return null;
    }
    
    public final void setReadFeed(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.semicolon.ddyzd_android.model.MainFeedData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> getFeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.MainFeedAdapter getFeedAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isEmpty() {
        return null;
    }
    
    public final int getCallApi() {
        return 0;
    }
    
    public final void setCallApi(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getScrollListener() {
        return null;
    }
    
    public final void setScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.OnScrollListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgressVisible() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void flagClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int position) {
    }
    
    private final void startLogin() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readFeeds() {
    }
    
    public final void onMoreClicked(boolean owner, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void onChattingClicked() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void deleteFeed(int id) {
    }
    
    public MainFeedViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.MainActivity navigator) {
        super();
    }
}