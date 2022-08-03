/*
Copyright [2021] [AlgoKelvin]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package algokelvin.actioner.recyclerview.header

import algokelvin.actioner.recyclerview.controller.DataAdapter
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHeader(
    private val context: Context,
    private val recyclerView: RecyclerView,
    private val size: Int,
    private val layoutItem: Int,
    private val dataBool: Array<Boolean?>,
    private val dataHeader: Array<String?>,
    private val headerText: Int,
    private val bindViewHolder : (View, Int) -> Unit
) {
    private var header = "null"
    private var endShow = false
    private var xShow = false
    private var xStart = false

    init {
        setRecyclerView()
    }

    private fun setRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        val dataAdapter = DataAdapter(size, layoutItem) { view, position ->
            val textHeader = view.findViewById<TextView>(headerText)
            header(position, dataBool[position], textHeader, dataHeader[position])
            bindViewHolder(view, position)
            scrollConditional(position, size)
        }
        recyclerView.adapter = dataAdapter
        dataAdapter.notifyDataSetChanged()
    }

    private fun setVisibilityHeader(textView: TextView, visibility: Int, data: String? = null) {
        textView.text = data
        textView.visibility = visibility
    }
    private fun setHeaderData(data: String?) {
        header = data!!
    }
    private fun setBoolData(position: Int, boolean: Boolean) {
        dataBool[position] = boolean
    }
    private fun scrollConditional(position: Int, max: Int) {
        if (position + 1 == max) {
            Log.i("header", "${position} Position is End")
            endShow = true
            xStart = true
        }
        if (position == 0) {
            Log.i("header", "${position} Position is TOP")
            endShow = false
            if (xStart)
                xShow = true
        }
    }
    private fun headerController(dataBool: Boolean?, textView: TextView, data: String?) {
        if (dataBool == true) {
            setVisibilityHeader(textView, View.VISIBLE, data)
            setHeaderData(data)
        } else {
            setVisibilityHeader(textView, View.GONE)
        }
    }
    private fun header(position: Int, dataBool: Boolean?, textView: TextView, data: String?) {
        if (endShow) {
            headerController(dataBool, textView, data)
        } else if (xShow) {
            headerController(dataBool, textView, data)
        } else {
            if (data != header) {
                setVisibilityHeader(textView, View.VISIBLE, data)
                setHeaderData(data)
                setBoolData(position, true)
            } else {
                setVisibilityHeader(textView, View.GONE)
            }
        }
    }
}