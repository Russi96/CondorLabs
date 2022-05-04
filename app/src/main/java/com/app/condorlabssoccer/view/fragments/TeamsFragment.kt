package com.app.condorlabssoccer.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.condorlabssoccer.R
import com.app.condorlabssoccer.adapters.CustomDropDownAdapter
import com.app.condorlabssoccer.adapters.TeamsAdapter
import com.app.condorlabssoccer.databinding.FragmentTeamsBinding
import com.app.condorlabssoccer.utils.Constants.LEAGUE_ENGLAND
import com.app.condorlabssoccer.utils.Constants.LEAGUE_FRANCE
import com.app.condorlabssoccer.utils.Constants.LEAGUE_GERMANY
import com.app.condorlabssoccer.utils.Constants.LEAGUE_ITALY
import com.app.condorlabssoccer.utils.Constants.LEAGUE_SPAIN
import com.app.condorlabssoccer.utils.showSnackBar
import com.app.condorlabssoccer.viewmodel.ViewModel
import com.app.data.utils.NetworkResult
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.lang.Exception

@AndroidEntryPoint
class TeamsFragment : Fragment() {

    private val viewModel by viewModels<ViewModel>()
    private val mAdapterTeams by lazy { TeamsAdapter() }
    private var _binding: FragmentTeamsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTeamsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupTeamsRecyclerView()
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = getString(R.string.leagues)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        val listLeagues = arrayOf(
            R.drawable.spain,
            R.drawable.uk,
            R.drawable.italy,
            R.drawable.germany,
            R.drawable.france
        )


        val spinnerAdapter = CustomDropDownAdapter(requireContext(), listLeagues)
        val spinner: Spinner = view.findViewById(R.id.spLeagues) as Spinner
        spinner.adapter = spinnerAdapter

        spinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {
                        leaguesChoose(LEAGUE_SPAIN)
                    }

                    1 -> {
                        leaguesChoose(LEAGUE_ENGLAND)
                    }

                    2 -> {
                        leaguesChoose(LEAGUE_ITALY)
                    }

                    3 -> {
                        leaguesChoose(LEAGUE_GERMANY)
                    }

                    4 -> {
                        leaguesChoose(LEAGUE_FRANCE)
                    }

                    else -> {
                        leaguesChoose(LEAGUE_SPAIN)
                    }
                }
            } // to close the onItemSelected

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        })

    }


    private fun setupTeamsRecyclerView() {

        binding.rvListTeamsFragmentTeams.adapter = mAdapterTeams
        binding.rvListTeamsFragmentTeams.layoutManager =
            GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)

    }

    private fun leaguesChoose(leagues: String) {
        lifecycleScope.launch {
            viewModel.getTeams(leagues)
                .observe(viewLifecycleOwner) { response ->
                    when (response) {
                        is NetworkResult.Success -> {
                            try {
                                val data = response.data
                                mAdapterTeams.submitList(data?.teams)
                            } catch (e: Exception) {
                                showSnackBar(binding.root, "Teams not found")
                            }
                        }

                        is NetworkResult.Error -> {
                            response.message?.let { showSnackBar(binding.root, it) }
                        }
                    }
                }
        }
    }
}