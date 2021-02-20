package com.semicolon.ddyzd_android.viewmodel

import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ClubDetailAdapter
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.model.Sub
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ClubDetailsViewModel(val club:ClubProfiles,val feedViewModel: MainFeedViewModel):ViewModel() {
    val detailAdapter=ClubDetailAdapter(feedViewModel.feeds,club,feedViewModel)
}


