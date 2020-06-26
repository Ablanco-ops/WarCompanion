package eu.ezann.warcompanion.gameConfig.mission

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MissionRecyclerAdapter(val context: Context, val listMission:List<Mission>)
    :RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        TODO("Not yet implemented")
    }

    inner class MissionViewHolder(itemView: View):BaseViewHolder<Mission>(itemView){
        override fun bind(item: Mission, position: Int) {
            TODO("Not yet implemented")
        }

    }
}