package com.semicolon.ddyzd_android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010Z\u001a\u00020[J\b\u0010\f\u001a\u00020[H\u0007J\b\u0010 \u001a\u00020[H\u0003J\b\u0010\\\u001a\u00020[H\u0007J\b\u0010E\u001a\u00020[H\u0003J\u0006\u0010]\u001a\u00020[J\b\u0010^\u001a\u00020[H\u0007J\u0006\u0010_\u001a\u00020[J\u0006\u0010`\u001a\u00020[J\u0006\u0010a\u001a\u00020[J\u0006\u0010b\u001a\u00020[J\u0006\u0010c\u001a\u00020[J\u000e\u0010d\u001a\u00020[2\u0006\u0010e\u001a\u00020\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fX\u0086.\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190&0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0011\u0010(\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u00101\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u00103\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0013R\u0014\u00105\u001a\u000206X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00190>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u000e\u0010J\u001a\u00020KX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010.\"\u0004\bN\u0010GR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0017R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0017R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020P0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0017R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u0002060\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0017R\u0014\u0010X\u001a\u000206X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00108\u00a8\u0006f"}, d2 = {"Lcom/semicolon/ddyzd_android/viewmodel/ChattingPageViewModel;", "Landroidx/lifecycle/ViewModel;", "navigater", "Lcom/semicolon/ddyzd_android/ul/activity/ChattingPage;", "(Lcom/semicolon/ddyzd_android/ul/activity/ChattingPage;)V", "adapter", "Lcom/semicolon/ddyzd_android/ApiService;", "getAdapter", "()Lcom/semicolon/ddyzd_android/ApiService;", "applyTag", "Ljava/util/ArrayList;", "", "getApplyTag", "()Ljava/util/ArrayList;", "setApplyTag", "(Ljava/util/ArrayList;)V", "chat", "Lio/socket/emitter/Emitter$Listener;", "getChat", "()Lio/socket/emitter/Emitter$Listener;", "chatBody", "Landroidx/lifecycle/MutableLiveData;", "getChatBody", "()Landroidx/lifecycle/MutableLiveData;", "chatInfo", "Lcom/semicolon/ddyzd_android/model/ChattingData;", "getChatInfo", "()Lcom/semicolon/ddyzd_android/model/ChattingData;", "setChatInfo", "(Lcom/semicolon/ddyzd_android/model/ChattingData;)V", "chatting", "", "getChatting", "()[Ljava/lang/String;", "setChatting", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "chattingList", "", "getChattingList", "chattingListAdapter", "Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;", "getChattingListAdapter", "()Lcom/semicolon/ddyzd_android/adapter/ChattingAdapter;", "clubId", "getClubId", "()Ljava/lang/String;", "clubImage", "getClubImage", "clubName", "getClubName", "connect", "getConnect", "gone", "", "getGone", "()I", "index", "getIndex", "getNavigater", "()Lcom/semicolon/ddyzd_android/ul/activity/ChattingPage;", "possingChat", "", "getPossingChat", "()Ljava/util/List;", "setPossingChat", "(Ljava/util/List;)V", "readChattingList", "roomToken", "getRoomToken", "setRoomToken", "(Ljava/lang/String;)V", "roomid", "getRoomid", "socket", "Lio/socket/client/Socket;", "status", "getStatus", "setStatus", "user", "", "getUser", "userResult", "getUserResult", "userResult2", "getUserResult2", "userVisible", "getUserVisible", "visible", "getVisible", "chooseHelper", "", "getRoomInfo", "helper1", "helper2", "helper3", "helper4", "joinRoom", "onDestroy", "sandChatting", "startSocket", "accessToken", "app_debug"})
public final class ChattingPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> userVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> chattingList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String roomid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clubImage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clubName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clubId = null;
    private final int index = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ApiService adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> chatBody = null;
    private java.util.List<com.semicolon.ddyzd_android.model.ChattingData> readChattingList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.semicolon.ddyzd_android.model.ChattingData> possingChat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String roomToken = "";
    public com.semicolon.ddyzd_android.model.ChattingData chatInfo;
    public java.lang.String[] chatting;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.adapter.ChattingAdapter chattingListAdapter = null;
    private io.socket.client.Socket socket;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> applyTag;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> userResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> userResult2 = null;
    private final int visible = android.view.View.VISIBLE;
    private final int gone = android.view.View.GONE;
    @org.jetbrains.annotations.NotNull()
    private final io.socket.emitter.Emitter.Listener connect = null;
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final io.socket.emitter.Emitter.Listener chat = null;
    @org.jetbrains.annotations.NotNull()
    private final com.semicolon.ddyzd_android.ul.activity.ChattingPage navigater = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.semicolon.ddyzd_android.model.ChattingData>> getChattingList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubId() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getChatBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.semicolon.ddyzd_android.model.ChattingData> getPossingChat() {
        return null;
    }
    
    public final void setPossingChat(@org.jetbrains.annotations.NotNull()
    java.util.List<com.semicolon.ddyzd_android.model.ChattingData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomToken() {
        return null;
    }
    
    public final void setRoomToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.model.ChattingData getChatInfo() {
        return null;
    }
    
    public final void setChatInfo(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.model.ChattingData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getChatting() {
        return null;
    }
    
    public final void setChatting(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.adapter.ChattingAdapter getChattingListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getApplyTag() {
        return null;
    }
    
    public final void setApplyTag(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUserResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUserResult2() {
        return null;
    }
    
    public final int getVisible() {
        return 0;
    }
    
    public final int getGone() {
        return 0;
    }
    
    public final void chooseHelper() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getRoomInfo() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getApplyTag() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void getChatting() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void getRoomToken() {
    }
    
    public final void joinRoom() {
    }
    
    public final void sandChatting() {
    }
    
    public final void helper1() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    public final void helper2() {
    }
    
    public final void helper3() {
    }
    
    public final void helper4() {
    }
    
    public final void startSocket(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.emitter.Emitter.Listener getConnect() {
        return null;
    }
    
    public final void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.socket.emitter.Emitter.Listener getChat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ul.activity.ChattingPage getNavigater() {
        return null;
    }
    
    public ChattingPageViewModel(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ul.activity.ChattingPage navigater) {
        super();
    }
}