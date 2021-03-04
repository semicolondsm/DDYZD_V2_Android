package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020\fH\u0007J\u0006\u0010F\u001a\u00020AJ\u0018\u0010G\u001a\u00020A2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\fH\u0007J\u000e\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020\u0003J\u0006\u0010K\u001a\u00020AJ\u0016\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020N2\u0006\u0010E\u001a\u00020\u0003J\b\u0010O\u001a\u00020AH\u0003J\b\u0010/\u001a\u00020AH\u0003J\b\u00103\u001a\u00020AH\u0003J\b\u0010P\u001a\u00020AH\u0002J\b\u0010Q\u001a\u00020AH\u0007J\b\u0010R\u001a\u00020AH\u0007J\b\u0010S\u001a\u00020AH\u0002J\b\u0010T\u001a\u00020AH\u0007R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0 0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020!00\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020+00X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u000e\u00a8\u0006U"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/ClubDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "club", "", "navigator", "Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;", "(Ljava/lang/String;Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "callApi", "", "getCallApi", "()I", "setCallApi", "(I)V", "chatBtnText", "Landroidx/lifecycle/MutableLiveData;", "", "getChatBtnText", "()Landroidx/lifecycle/MutableLiveData;", "getClub", "()Ljava/lang/String;", "clubDetail", "Lcom/semicolon/ddyzd_android/model/ClubInDetailData;", "getClubDetail", "detailAdapter", "Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;", "getDetailAdapter", "()Lcom/semicolon/ddyzd_android/adapter/ClubDetailAdapter;", "feeds", "", "Lcom/semicolon/ddyzd_android/model/MainFeedData;", "getFeeds", "invisible", "getInvisible", "isEmpty", "memberAdapter", "Lcom/semicolon/ddyzd_android/adapter/ClubMemberAdapter;", "getMemberAdapter", "()Lcom/semicolon/ddyzd_android/adapter/ClubMemberAdapter;", "members", "Lcom/semicolon/ddyzd_android/model/MembersData;", "getMembers", "getNavigator", "()Lcom/semicolon/ddyzd_android/ul/activity/ClubDetails;", "readFeeds", "Ljava/util/ArrayList;", "getReadFeeds", "()Ljava/util/ArrayList;", "readMembers", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "setScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V", "time", "getTime", "setTime", "(Ljava/lang/String;)V", "visible", "getVisible", "calculateDate", "", "day", "Ljava/util/Date;", "deleteFeed", "id", "finish", "flagClicked", "position", "gotoUserInfo", "userGcn", "onCreate", "onMoreClicked", "owner", "", "readClubInfo", "readTime", "startChatting", "startFollow", "startLogin", "unFollow", "app_debug"})
public final class ClubDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData> clubDetail = null;
    private final java.util.ArrayList<com.semicolon.ddyzd_android.model.MembersData> readMembers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.semicolon.ddyzd_android.model.MainFeedData> readFeeds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> feeds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> members = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.ClubMemberAdapter memberAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.ClubDetailAdapter detailAdapter = null;
    private int callApi = -1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> isEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String time = "";
    private final int visible = android.view.View.VISIBLE;
    private final int invisible = android.view.View.INVISIBLE;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.CharSequence> chatBtnText = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String club = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.ClubDetails navigator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ClubInDetailData> getClubDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.semicolon.ddyzd_android.model.MainFeedData> getReadFeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MainFeedData>> getFeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.MembersData>> getMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.ClubMemberAdapter getMemberAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.ClubDetailAdapter getDetailAdapter() {
        return null;
    }
    
    public final int getCallApi() {
        return 0;
    }
    
    public final void setCallApi(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> isEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getVisible() {
        return 0;
    }
    
    public final int getInvisible() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.CharSequence> getChatBtnText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getScrollListener() {
        return null;
    }
    
    public final void setScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.OnScrollListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    private final void readTime() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readClubInfo() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readMembers() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void readFeeds() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void flagClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int position) {
    }
    
    private final void startLogin() {
    }
    
    public final void finish() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void startChatting() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void startFollow() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void unFollow() {
    }
    
    public final void onMoreClicked(boolean owner, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void deleteFeed(int id) {
    }
    
    private final void calculateDate(java.util.Date day) {
    }
    
    public final void gotoUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String userGcn) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClub() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.ClubDetails getNavigator() {
        return null;
    }
    
    public ClubDetailsViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String club, @org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.ClubDetails navigator) {
        super();
    }
}