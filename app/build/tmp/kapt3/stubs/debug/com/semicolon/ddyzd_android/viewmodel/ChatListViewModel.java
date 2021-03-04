package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010?\u001a\u00020@2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u000e\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020%J\u0006\u0010C\u001a\u00020@J\u0006\u0010D\u001a\u00020@J\u0006\u0010E\u001a\u00020@J\u0006\u0010F\u001a\u00020@J\u0006\u0010G\u001a\u00020@J\u000e\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\"R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020%0*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001f\u00105\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\"0\"06\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\"0$\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0013\u00a8\u0006J"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/ChatListViewModel;", "Landroidx/lifecycle/ViewModel;", "navigater", "Lcom/semicolon/ddyzd_android/ul/activity/ChatList;", "(Lcom/semicolon/ddyzd_android/ul/activity/ChatList;)V", "alarm", "Lio/socket/emitter/Emitter$Listener;", "getAlarm", "()Lio/socket/emitter/Emitter$Listener;", "allList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/semicolon/ddyzd_android/model/ChatListData;", "getAllList", "()Landroidx/lifecycle/MutableLiveData;", "apiAdapter", "Lcom/semicolon/ddyzd_android/ApiService;", "black", "", "getBlack", "()I", "clubListAdapter", "Lcom/semicolon/ddyzd_android/adapter/ChatListAdapter;", "getClubListAdapter", "()Lcom/semicolon/ddyzd_android/adapter/ChatListAdapter;", "event", "getEvent", "gray", "getGray", "inVisibility", "getInVisibility", "index", "getIndex", "initList", "Ljava/util/ArrayList;", "", "list", "", "Lcom/semicolon/ddyzd_android/model/RoomData;", "getList", "getNavigater", "()Lcom/semicolon/ddyzd_android/ul/activity/ChatList;", "readChatList", "", "section", "getSection", "setSection", "(Landroidx/lifecycle/MutableLiveData;)V", "socket", "Lio/socket/client/Socket;", "getSocket", "()Lio/socket/client/Socket;", "setSocket", "(Lio/socket/client/Socket;)V", "spinnerAdapter", "Landroid/widget/ArrayAdapter;", "kotlin.jvm.PlatformType", "getSpinnerAdapter", "()Landroid/widget/ArrayAdapter;", "value", "getValue", "()Ljava/util/List;", "visibilty", "getVisibilty", "callChatList", "", "goChatting", "data", "leaveRoom", "onBackClicked", "onCreate", "onDestroy", "selectPeople", "startSocket", "accessToken", "app_debug"})
public final class ChatListViewModel extends androidx.lifecycle.ViewModel {
    private final com.semicolon.ddyzd_android.ApiService apiAdapter = null;
    private java.util.List<com.semicolon.ddyzd_android.model.RoomData> readChatList;
    private final int visibilty = android.view.View.VISIBLE;
    private final int inVisibility = android.view.View.INVISIBLE;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ChatListData> allList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.ChatListAdapter clubListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> value = null;
    private final int gray = android.graphics.Color.GRAY;
    private final int black = android.graphics.Color.BLACK;
    private java.util.ArrayList<java.lang.String> initList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> section;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ArrayAdapter<java.lang.String> spinnerAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> index = null;
    public io.socket.client.Socket socket;
    @org.jetbrains.annotations.NotNull()
    private final io.socket.emitter.Emitter.Listener event = null;
    @org.jetbrains.annotations.NotNull()
    private final io.socket.emitter.Emitter.Listener alarm = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.ChatList navigater = null;
    
    public final int getVisibilty() {
        return 0;
    }
    
    public final int getInVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.semicolon.ddyzd_android.model.ChatListData> getAllList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.RoomData>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.ChatListAdapter getClubListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getValue() {
        return null;
    }
    
    public final int getGray() {
        return 0;
    }
    
    public final int getBlack() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getSection() {
        return null;
    }
    
    public final void setSection(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ArrayAdapter<java.lang.String> getSpinnerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.client.Socket getSocket() {
        return null;
    }
    
    public final void setSocket(@org.jetbrains.annotations.NotNull()
    io.socket.client.Socket p0) {
    }
    
    public final void onDestroy() {
    }
    
    public final void onCreate() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void callChatList(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.ChatList navigater) {
    }
    
    public final void selectPeople() {
    }
    
    public final void goChatting(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.model.RoomData data) {
    }
    
    public final void leaveRoom() {
    }
    
    public final void startSocket(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.emitter.Emitter.Listener getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.emitter.Emitter.Listener getAlarm() {
        return null;
    }
    
    public final void onBackClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.ChatList getNavigater() {
        return null;
    }
    
    public ChatListViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.ChatList navigater) {
        super();
    }
}