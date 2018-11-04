package recyclerview.john.com.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup

class RecyclerAdapter : RecyclerView.Adapter<RecyclerViewHoller>() {
    private val TYPE_HEADER = 0
    private val TYPE_NORMAL = 1

    private val TAG = "RecyclerAdapter"
    private val datas = IntArray(100, { it })

    private var createdViewHolderCount = 0
    private var bindedViewHolderCount = 0

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHoller {
        createdViewHolderCount++
        Log.v(TAG, "created:$createdViewHolderCount")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview_item, parent, false)
        return RecyclerViewHoller(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHoller, position: Int) {
        bindedViewHolderCount++
        Log.v(TAG, "binded:$bindedViewHolderCount")
        holder.setIndex(datas[position])
    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            return TYPE_HEADER
        }
        return TYPE_NORMAL
    }
}