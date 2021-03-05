package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FeedNoSheetBinding

class NotSheetDialog: BottomSheetDialogFragment() {
    lateinit var binding: FeedNoSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.feed_no_sheet,container,false)
        return binding.root
    }
}