package com.semicolon.ddyzd_android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006&"}, d2 = {"Lcom/semicolon/ddyzd_android/BaseApi;", "", "()V", "API_URL", "", "getAPI_URL", "()Ljava/lang/String;", "CONNECT_TIMEOUT", "", "getCONNECT_TIMEOUT", "()J", "KotlinRetrofitInterface", "Lcom/semicolon/ddyzd_android/ApiService;", "getKotlinRetrofitInterface", "()Lcom/semicolon/ddyzd_android/ApiService;", "setKotlinRetrofitInterface", "(Lcom/semicolon/ddyzd_android/ApiService;)V", "OKHttpClient", "Lokhttp3/OkHttpClient;", "getOKHttpClient", "()Lokhttp3/OkHttpClient;", "setOKHttpClient", "(Lokhttp3/OkHttpClient;)V", "READ_TIMEOUT", "getREAD_TIMEOUT", "WRITE_TIMEOUT", "getWRITE_TIMEOUT", "club_id", "getClub_id", "setClub_id", "(Ljava/lang/String;)V", "mRetrofit", "Lretrofit2/Retrofit;", "getMRetrofit", "()Lretrofit2/Retrofit;", "setMRetrofit", "(Lretrofit2/Retrofit;)V", "getInstance", "app_debug"})
public final class BaseApi {
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String club_id = "";
    private static final long CONNECT_TIMEOUT = 15L;
    private static final long WRITE_TIMEOUT = 15L;
    private static final long READ_TIMEOUT = 15L;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String API_URL = "https://api.eungyeol.live/";
    @org.jetbrains.annotations.NotNull()
    private static okhttp3.OkHttpClient OKHttpClient;
    @org.jetbrains.annotations.NotNull()
    private static retrofit2.Retrofit mRetrofit;
    @org.jetbrains.annotations.NotNull()
    private static com.semicolon.ddyzd_android.ApiService KotlinRetrofitInterface;
    @org.jetbrains.annotations.NotNull()
    public static final com.semicolon.ddyzd_android.BaseApi INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClub_id() {
        return null;
    }
    
    public final void setClub_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getCONNECT_TIMEOUT() {
        return 0L;
    }
    
    public final long getWRITE_TIMEOUT() {
        return 0L;
    }
    
    public final long getREAD_TIMEOUT() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOKHttpClient() {
        return null;
    }
    
    public final void setOKHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getMRetrofit() {
        return null;
    }
    
    public final void setMRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getKotlinRetrofitInterface() {
        return null;
    }
    
    public final void setKotlinRetrofitInterface(@org.jetbrains.annotations.NotNull()
    com.semicolon.ddyzd_android.ApiService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.semicolon.ddyzd_android.ApiService getInstance() {
        return null;
    }
    
    private BaseApi() {
        super();
    }
}