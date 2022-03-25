package com.example.gamergiveawaysapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gamergiveawaysapp.R
import com.example.gamergiveawaysapp.databinding.FragmentDetailsBinding
import com.squareup.picasso.Picasso


class DetailsFragment : BaseFragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding:FragmentDetailsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        bindGiveaway()

        return binding.root
    }

    private fun bindGiveaway() {
        binding.gameTitle.text = giveawaysViewModel.selectedGiveaway.title
        binding.gameDesc.text = giveawaysViewModel.selectedGiveaway.description
        binding.gameCat.text = giveawaysViewModel.selectedGiveaway.platforms

        Picasso.get()
            .load(giveawaysViewModel.selectedGiveaway.image)
            .fit()
            .into(binding.gameImage)
    }
}