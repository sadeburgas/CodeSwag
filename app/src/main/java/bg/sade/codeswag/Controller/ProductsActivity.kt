package bg.sade.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import bg.sade.codeswag.R
import bg.sade.codeswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType =intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
