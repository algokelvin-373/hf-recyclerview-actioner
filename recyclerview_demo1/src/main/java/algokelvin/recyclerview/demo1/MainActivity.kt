package algokelvin.recyclerview.demo1

import algokelvin.actioner.recyclerview.body.RecyclerViewBody
import algokelvin.recyclerview.demo1.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.item_visitor.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val data = DataSample.setData()
        RecyclerViewBody(this,
            mainBinding.rvItem, data.size, R.layout.item_visitor
        ) { view, position ->
            view.date_visitor.text = data[position].date
            view.name_visitor.text = data[position].name
            view.address_visitor.text = data[position].address
        }

    }
}