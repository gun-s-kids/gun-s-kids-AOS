package com.ehyundai.project.club.view.myclub

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentMyClubBinding
import com.ehyundai.project.club.view.Club
import com.ehyundai.project.club.view.ClubAdapter
import com.ehyundai.project.club.view.main.MainActivity

class MyClubFragment : BaseFragment<FragmentMyClubBinding>(R.layout.fragment_my_club) {
    private var parentActivity: MainActivity? = null
    private val viewModel: MyClubViewModel by viewModels()
    override val TAG: String = "MyClubFragment"

    lateinit var context: MainActivity

    /** dummy Data -> API 생성 시 삭제 */

    var groupList = arrayListOf<Club>(
        Club(R.drawable.ic_shinchan, "슛솔랭", "2022.10.10", "안녕하세요"),
        Club(R.drawable.ic_shinchan, "스뚝파", "2022.10.16", "안녕하세요"),
        Club(R.drawable.ic_shinchan, "러닝", "2011.09.10", "안녕하세요"),
        Club(R.drawable.ic_shinchan, "자바락", "2022.11.04", "안녕하세요"),
        Club(R.drawable.ic_shinchan, "밴드", "2022.11.04", "안녕하세요"),
        Club(R.drawable.ic_shinchan, "뀨르", "2022.11.04", "안녕하세요"),
    )

    /** dummy Data -> API 생성 시 삭제 */


    override fun onAttach(context: Context) {
        super.onAttach(context)
        parentActivity = activity as MainActivity
        this.context = context as MainActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ClubAdapter(context, groupList)
        binding.lvClub.adapter = adapter
        binding.viewModel = viewModel
    }

    override fun onDetach() {
        super.onDetach()
        parentActivity = null
    }
}