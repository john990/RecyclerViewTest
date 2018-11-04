package recyclerview.john.com.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.view.View

class RecyclerViewHoller(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun setIndex(text: Int) {
        (itemView as LifeCycleTextView).setIndex(text)
    }
}