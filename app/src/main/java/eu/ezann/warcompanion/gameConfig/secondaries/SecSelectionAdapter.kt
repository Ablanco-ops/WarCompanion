package eu.ezann.warcompanion.gameConfig.secondaries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import eu.ezann.warcompanion.R
import kotlinx.android.synthetic.main.secondaries_card.view.*

class SecSelectionAdapter: ListAdapter<Secondary, SecSelectionAdapter.ItemViewHolder>(DiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.secondaries_card, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class DiffCallback : DiffUtil.ItemCallback<Secondary>() {

        override fun areItemsTheSame(oldItem: Secondary, newItem: Secondary): Boolean {
            return oldItem?.secondId == newItem?.secondId
        }

        override fun areContentsTheSame(oldItem: Secondary, newItem: Secondary): Boolean {
            return oldItem == newItem
        }
    }

    class ItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Secondary) = with(itemView) {
            itemView.secondaries_cd_title.setText(item.title)
            itemView.secondaries_cd_category.setText(item.category)
            itemView.secondaries_cd_type.setText(item.type)

            setOnClickListener {
                // TODO: Handle on click
            }
        }
    }


}