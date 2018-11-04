package recyclerview.john.com.recyclerviewtest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

class LifeCycleTextView(context: Context?, attrs: AttributeSet?) : TextView(context, attrs) {
    private val TAG = "LifeCycleTextView"
    private var index = -1
    private var prvIndex = -1

    fun setIndex(index: Int) {
        text = index.toString()
        prvIndex = this.index
        this.index = index
        Log.d(TAG, "Detached:$index")
        if (index == 0) {
            Log.w(TAG, "Header Object:$this")
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.d(TAG, "Detached:$index")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if(prvIndex != -1){
            Log.w(TAG, "Attached:index:$index     prvIndex:$prvIndex")
        } else {
            Log.d(TAG, "Attached:index:$index")
        }
        if (index == 0) {
            Log.w(TAG, "Header Object:$this")
        }
    }
}