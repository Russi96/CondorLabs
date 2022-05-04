package com.app.condorlabssoccer.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.condorlabssoccer.R
import com.app.condorlabssoccer.databinding.ItemTeamBinding
import com.app.domain.Team
import com.app.imagemanager.bindImageUrl

class TeamsAdapter : ListAdapter<Team, TeamsAdapter.MyViewHolder>(DiffUtilCallback) {

    class MyViewHolder(private val binding: ItemTeamBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(team: Team) {
            binding.teamItem = team
            binding.ivTeamImage.bindImageUrl(
                team.strTeamBadge,
                R.drawable.logo,
                R.drawable.logo
            )
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemTeamBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }

    }

    private object DiffUtilCallback : DiffUtil.ItemCallback<Team>() {
        override fun areItemsTheSame(
            oldItem: Team,
            newItem: Team
        ): Boolean = oldItem.strAlternate == newItem.strAlternate

        override fun areContentsTheSame(
            oldItem: Team,
            newItem: Team
        ): Boolean = oldItem == newItem

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val teamItem = getItem(position)
        if (teamItem != null) {
            holder.binding(teamItem)
        }
    }
}