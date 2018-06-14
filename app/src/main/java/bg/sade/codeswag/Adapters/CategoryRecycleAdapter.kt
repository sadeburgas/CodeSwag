package bg.sade.codeswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import bg.sade.codeswag.Model.Category
import bg.sade.codeswag.R

class CategoryRecycleAdapter (val context: Context, val category: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {

        val view = LayoutInflater.from(context)
                .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return category.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(category[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}