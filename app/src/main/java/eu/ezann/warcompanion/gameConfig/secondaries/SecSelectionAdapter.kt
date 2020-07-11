package eu.ezann.warcompanion.gameConfig.secondaries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.gameConfig.primarymission.BaseViewHolder
import kotlinx.android.synthetic.main.secondaries_card.view.*
import java.lang.IllegalArgumentException

class SecSelectionAdapter(val context: Context, private val listSecondaries:MutableList<Secondary>
):RecyclerView.Adapter<BaseViewHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return SecondariesViewHolder(
            LayoutInflater.from(context).inflate(
            R.layout.secondaries_card,parent,false))
    }

    override fun getItemCount(): Int = listSecondaries.size

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is SecSelectionAdapter.SecondariesViewHolder ->holder.bind(listSecondaries[position],position)
            else-> throw IllegalArgumentException("Incorrect Viewholder")
        }
    }
    inner class SecondariesViewHolder(itemView: View):BaseViewHolder<Secondary>(itemView) {
        override fun bind(item: Secondary, position: Int) {
            itemView.secondaries_cd_title.setText(item.title)
            itemView.secondaries_cd_category.setText(item.category)
            itemView.secondaries_cd_type.setText(item.type)
        }
    }
}