package bg.sade.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import bg.sade.codeswag.Adapters.CategoryAdapter
import bg.sade.codeswag.R
import bg.sade.codeswag.Serviices.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
