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
            return oldItem?.id == newItem?.id
        }

        override fun areContentsTheSame(oldItem: Secondary, newItem: Secondary): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Secondary) = with(itemView) {
            secondaries_cd_title.setText(item.title)
            when (item.category){
                1->secondaries_cd_category.setText(R.string.sec_category_1)
                2->secondaries_cd_category.setText(R.string.sec_category_2)
                3->secondaries_cd_category.setText(R.string.sec_category_3)
                4->secondaries_cd_category.setText(R.string.sec_category_4)
                5->secondaries_cd_category.setText(R.string.sec_category_5)
                else->secondaries_cd_category.setText(R.string.sec_category_6)
            }
            when(item.type){
                0->secondaries_cd_type.setText(R.string.sec_type_0)
                1->secondaries_cd_type.setText(R.string.sec_type_1)
                else->secondaries_cd_type.setText(R.string.sec_type_2)
            }


            setOnClickListener {
                // TODO: Handle on click
            }
        }
    }


}