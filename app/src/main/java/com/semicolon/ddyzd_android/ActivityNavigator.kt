package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.ul.activity.ClubDetails
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel
import com.semicolon.ddyzd_android.viewmodel.MyPageViewModel

object ActivityNavigator {
    lateinit var mainActivity: MainActivity
    lateinit var clubDetailActivity:ClubDetails
    lateinit var myPageViewModel:MyPageViewModel
    lateinit var mainFeedViewModel:MainFeedViewModel
    lateinit var clubDetailViewModel:ClubDetailsViewModel
}