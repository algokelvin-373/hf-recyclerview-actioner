package algokelvin.recyclerview.demo1

import algokelvin.actioner.recyclerview.controller.DataAdapter
import algokelvin.recyclerview.demo1.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_visitor.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val data = DataSample.setData()
        mainBinding.rvItem.layoutManager = LinearLayoutManager(this)
        val dataAdapter = DataAdapter(data.size, R.layout.item_visitor) { view, position ->
            view.date_visitor.text = data[position].date
            view.name_visitor.text = data[position].name
            view.address_visitor.text = data[position].address
        }
        mainBinding.rvItem.adapter = dataAdapter
        dataAdapter.notifyDataSetChanged()

    }
}