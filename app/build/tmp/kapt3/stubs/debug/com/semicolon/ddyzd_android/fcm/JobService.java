package com.semicolon.ddyzd_android.fcm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/semicolon/ddyzd_android/fcm/JobService;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "onStartJob", "", "job", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "app_debug"})
public final class JobService extends com.firebase.jobdispatcher.JobService {
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.Nullable()
    com.firebase.jobdispatcher.JobParameters job) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.Nullable()
    com.firebase.jobdispatcher.JobParameters job) {
        return false;
    }
    
    public JobService() {
        super();
    }
}