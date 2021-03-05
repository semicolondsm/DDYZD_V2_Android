package com.semicolon.ddyzd_android.fcm

import com.firebase.jobdispatcher.JobParameters
import com.firebase.jobdispatcher.JobService

class JobService :JobService(){
    override fun onStopJob(job: JobParameters?): Boolean {
        return true
    }

    override fun onStartJob(job: JobParameters?): Boolean {
        return true
    }

}