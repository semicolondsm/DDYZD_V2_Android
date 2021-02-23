package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.SheetGitEditBinding
import com.semicolon.ddyzd_android.viewmodel.MyPageViewModel

class GitSheetDialog(val viewModel:MyPageViewModel):BottomSheetDialogFragment() {
    lateinit var binding:SheetGitEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.ModifyIntroStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.sheet_git_edit,container,false)
        binding.vm=viewModel
        return binding.root
    }
}