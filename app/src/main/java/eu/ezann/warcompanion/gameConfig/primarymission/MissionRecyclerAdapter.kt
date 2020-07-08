package eu.ezann.warcompanion.gameConfig.primarymission

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import eu.ezann.warcompanion.R
import kotlinx.android.synthetic.main.mission_row.view.*
import java.lang.IllegalArgumentException

class MissionRecyclerAdapter(val context: Context, private val listMission: List<Mission>)
    :RecyclerView.Adapter<BaseViewHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MissionViewHolder(LayoutInflater.from(context).inflate(
            R.layout.mission_row,parent,false))
    }

    override fun getItemCount(): Int {
        return listMission.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
        is MissionViewHolder ->holder.bind(listMission[position],position)
        else-> throw IllegalArgumentException("Incorrect Viewholder")
        }
    }

    inner class MissionViewHolder(itemView: View):BaseViewHolder<Mission>(itemView){
        override fun bind(item: Mission, position: Int) {
            itemView.mission_title.setText(item.title)
            itemView.mission_size.setText(R.string.size3_tag)
            itemView.mission_type.setText(R.string.eternal_war_tag)
            itemView.mission_minimap.setImageResource(item.map)
        }

    }
}