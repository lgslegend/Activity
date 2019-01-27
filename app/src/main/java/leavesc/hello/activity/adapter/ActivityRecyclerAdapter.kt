package leavesc.hello.activity.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import leavesc.hello.activity.R

/**
 * Created by：CZY
 * Time：2019/1/22 16:18
 * Desc：
 */
class ActivityRecyclerAdapter : RecyclerView.Adapter<ActivityRecyclerAdapter.ActivityHolder>() {

    lateinit var activityList: MutableList<String>

    override fun onBindViewHolder(holder: ActivityHolder, p1: Int) {
        holder.tvActivityName.text = activityList[p1]
    }

    override fun getItemCount() = activityList.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ActivityHolder {
        return ActivityHolder(
            LayoutInflater.from(viewGroup.context).inflate(
                R.layout.item_app_activity,
                viewGroup,
                false
            )
        )
    }

    class ActivityHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvActivityName: TextView = itemView.findViewById(R.id.tv_activityName)

    }

}