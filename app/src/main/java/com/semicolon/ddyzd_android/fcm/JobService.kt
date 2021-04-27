package com.semicolon.ddyzd_android.fcm

import android.app.job.JobParameters
import android.app.job.JobService

class JobService :JobService(){
    override fun onStopJob(job: JobParameters?): Boolean {
        return false
    }

    override fun onStartJob(job: JobParameters?): Boolean {
        return true
    }

}