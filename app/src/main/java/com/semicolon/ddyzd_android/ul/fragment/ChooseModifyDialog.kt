package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.SheetChoiceModifyBinding
import com.semicolon.ddyzd_android.viewmodel.MyPageViewModel

class ChooseModifyDialog(private val viewModel:MyPageViewModel): BottomSheetDialogFragment() {
    lateinit var binding:SheetChoiceModifyBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.sheet_choice_modify,container,false)
        binding.vm=viewModel
        return binding.root
    }
}