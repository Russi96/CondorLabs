package com.app.condorlabssoccer.utils

import android.view.View
import android.view.animation.Animation
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.navigation.findNavController
import com.app.condorlabssoccer.view.fragments.DetailsFragmentDirections
import com.app.condorlabssoccer.view.fragments.TeamsFragmentDirections
import com.app.domain.Team
import com.google.android.material.card.MaterialCardView

class BindingAdapters {

    companion object {
        @BindingAdapter("android:sendDataDetailsFragment")
        @JvmStatic
        fun sendDataDetailsFragment(view: MaterialCardView, team: Team) {
            view.setOnClickListener {
                val action = TeamsFragmentDirections.actionTeamsFragmentToDetailsFragment(team)
                view.findNavController().navigate(action)
            }
        }

        @BindingAdapter("android:sendUrlWeb")
        @JvmStatic
        fun urlWeb(view: ImageView, url: String) {
            view.setOnClickListener {
                val action = DetailsFragmentDirections.actionDetailsFragmentToWebFragment(url)
                view.findNavController().navigate(action)
            }
        }

        @BindingAdapter("android:logoSplash")
        @JvmStatic
        fun logoAnimatedSplash(view: View, animation: Animation) {
            view.startAnimation(animation)
        }


    }
}