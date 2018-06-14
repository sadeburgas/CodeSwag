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


class CategoryAdapter(val context: Context, val category: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else { //reusing
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val categoty = category[position]

        val resourceId = context.resources.getIdentifier(categoty.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = categoty.title

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
    private class ViewHolder {
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }
}