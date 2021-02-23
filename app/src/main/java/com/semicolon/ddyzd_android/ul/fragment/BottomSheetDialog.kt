package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FeedSheetBinding
import com.semicolon.ddyzd_android.databinding.SheetClubFeedBinding
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel
import kotlin.properties.Delegates

open class BottomSheetDialog(private val viewModel:MainFeedViewModel): BottomSheetDialogFragment() {
    lateinit var binding:FeedSheetBinding
    var clubId by Delegates.notNull<Int>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.feed_sheet,container,false)
        binding.vm=viewModel
        binding.id=clubId
        return binding.root
    }
}
open class BottomClubSheetDialog(private val viewModel:ClubDetailsViewModel): BottomSheetDialogFragment() {
    lateinit var binding:SheetClubFeedBinding
    var clubId by Delegates.notNull<Int>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.sheet_club_feed,container,false)
        binding.vm=viewModel
        binding.id=clubId
        return binding.root
    }
}