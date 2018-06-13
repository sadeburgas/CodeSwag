package bg.sade.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import bg.sade.codeswag.Model.Category
import bg.sade.codeswag.R


class CategoryAdapter(context: Context, category: List<Category>) : BaseAdapter() {

    val context = context
    val category = category

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
        println("Heavy Computing")

        val categoty = category[position]

        val resourceId = context.resources.getIdentifier(categoty.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryName.text = categoty.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return category[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return category.count()
    }
}