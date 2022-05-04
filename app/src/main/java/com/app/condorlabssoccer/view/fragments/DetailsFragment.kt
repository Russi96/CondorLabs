package com.app.condorlabssoccer.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.navArgs
import com.app.condorlabssoccer.R
import com.app.condorlabssoccer.databinding.FragmentDetailsBinding
import com.app.condorlabssoccer.databinding.FragmentTeamsBinding
import com.app.imagemanager.bindImageUrl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = getString(R.string.details)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)
        binding.team = args.team

        binding.ivJerseyTeam.bindImageUrl(
            args.team.strTeamJersey,
            R.drawable.jersey,
            R.drawable.jersey
        )

        binding.ivBadgeTeam.bindImageUrl(
            args.team.strTeamBadge,
            R.drawable.logo,
            R.drawable.logo
        )
    }


}