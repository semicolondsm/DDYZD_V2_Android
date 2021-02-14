package com.semicolon.ddyzd_android.viewmodel

import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class MainFeedViewModel(val navigator: MainActivity):ViewModel() {
    
    fun onChattingClicked(){
        navigator.startChatting()
    }
}