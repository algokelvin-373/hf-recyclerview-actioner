package algokelvin.actioner.recyclerview.body

import algokelvin.actioner.recyclerview.controller.DataAdapter
import algokelvin.actioner.recyclerview.RecyclerInter
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewBody(
    private val context: Context,
    private val recyclerView: RecyclerView,
    private val size: Int,
    private val layoutItem: Int,
    private val bindViewHolder : (View, Int) -> Unit
): RecyclerInter {

    init {
        setRecyclerView()
    }

    override fun setRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        val dataAdapter = DataAdapter(size, layoutItem) { view, position ->
            bindViewHolder(view, position)
        }
        recyclerView.adapter = dataAdapter
        dataAdapter.notifyDataSetChanged()
    }

}