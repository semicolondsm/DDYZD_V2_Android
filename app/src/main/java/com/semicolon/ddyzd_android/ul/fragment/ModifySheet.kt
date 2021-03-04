package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.SheetModifyIntroBinding

class ModifySheet: BottomSheetDialogFragment() {
    lateinit var binding: SheetModifyIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel=ActivityNavigator.myPageViewModel
        setStyle(DialogFragment.STYLE_NORMAL, R.style.ModifyIntroStyle)
        binding = DataBindingUtil.inflate(inflater, R.layout.sheet_modify_intro, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner=this
        return binding.root
    }
}