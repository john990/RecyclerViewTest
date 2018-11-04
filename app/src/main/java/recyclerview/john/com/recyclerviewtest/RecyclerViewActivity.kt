package recyclerview.john.com.recyclerviewtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        decoration.setDrawable(resources.getDrawable(R.drawable.divider_2dp))
        recyclerView.addItemDecoration(decoration)
        recyclerView.adapter = RecyclerAdapter()
        recyclerView.setViewCacheExtension(KViewCacheExtension(recyclerView))
    }
}
