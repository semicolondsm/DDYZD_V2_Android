package com.semicolon.ddyzd_android.ul.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\"H\u0014JB\u0010&\u001a\u00020\"28\u0010\'\u001a4\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\"0(H\u0007J7\u0010-\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0/2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\"00J)\u00102\u001a\u00020\"2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u001103\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\"00J)\u00105\u001a\u00020\"2!\u0010\'\u001a\u001d\u0012\u0013\u0012\u001103\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\"00R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e\u00a8\u00066"}, d2 = {"Lcom/semicolon/ddyzd_android/ul/activity/ChattingPage;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/semicolon/ddyzd_android/databinding/ActivityChattingPageBinding;", "getBinding", "()Lcom/semicolon/ddyzd_android/databinding/ActivityChattingPageBinding;", "setBinding", "(Lcom/semicolon/ddyzd_android/databinding/ActivityChattingPageBinding;)V", "clubId", "", "getClubId", "()Ljava/lang/String;", "setClubId", "(Ljava/lang/String;)V", "clubImage", "getClubImage", "setClubImage", "clubName", "getClubName", "setClubName", "index", "", "getIndex", "()I", "setIndex", "(I)V", "roomId", "getRoomId", "setRoomId", "status", "getStatus", "setStatus", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "selectDate", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "date", "place", "selectPart", "items", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "part", "sendClubDialog", "", "result", "sendResultDialog", "app_debug"})
public final class ChattingPage extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String roomId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clubImage = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clubName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clubId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    private int index = 0;
    public com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding binding;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubImage() {
        return null;
    }
    
    public final void setClubImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubName() {
        return null;
    }
    
    public final void setClubName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClubId() {
        return null;
    }
    
    public final void setClubId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 배열을 받아와서 dialog 띄우는 함수
     */
    public final void selectPart(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    /**
     * 면접일정 날짜 dialog 를 뛰워주는 함수
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    public final void selectDate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    /**
     * 합격||불합격 통지하는 dialog
     */
    public final void sendResultDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    /**
     * 동아리 확정하는 dialog
     */
    public final void sendClubDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public ChattingPage() {
        super();
    }
}