package recyclerview.john.com.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.view.View

class KViewCacheExtension(val recyclerView: RecyclerView) : RecyclerView.ViewCacheExtension() {
    private var itemView: View? = null
    override fun getViewForPositionAndType(recycler: RecyclerView.Recycler?, position: Int, type: Int): View? {
        if (position == 0) {
            if (itemView == null) {
                val viewHolder = recyclerView.recycledViewPool.getRecycledView(type)
                itemView = viewHolder?.itemView
            }
            if (itemView?.layoutParams == null) {
                return null
            }
            return itemView
        }
        return null
    }
}