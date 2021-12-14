package algokelvin.recyclerview.demo2

import algokelvin.actioner.recyclerview.header.RecyclerViewHeader
import algokelvin.recyclerview.demo2.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.item_visitor.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var dataBool: Array<Boolean?>
    private lateinit var dataHeader: Array<String?>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val visitor = DataSample.setData2()
        dataBool = arrayOfNulls(visitor.size)
        Arrays.fill(dataBool, false)

        dataHeader = arrayOfNulls(visitor.size)
        for (x in visitor.indices) {
            dataHeader[x] = visitor[x].date
        }

        RecyclerViewHeader(this, binding.rvItem, visitor.size, R.layout.item_visitor,
            dataBool, dataHeader, R.id.date_visitor)
        { view, position ->
            view.name_visitor.text = ("${position + 1} Name: ${visitor[position].name}")
            view.address_visitor.text = (visitor[position].address + " " + visitor[position].date)
        }

    }
}