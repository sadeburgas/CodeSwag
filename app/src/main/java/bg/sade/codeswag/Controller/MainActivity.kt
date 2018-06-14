package bg.sade.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast

import bg.sade.codeswag.Adapters.CategoryAdapter
import bg.sade.codeswag.Adapters.CategoryRecycleAdapter
import bg.sade.codeswag.R
import bg.sade.codeswag.Serviices.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

/*        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You checked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
