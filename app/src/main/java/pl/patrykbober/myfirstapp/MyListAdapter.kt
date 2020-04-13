package pl.patrykbober.myfirstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyListAdapter(private val listData: Array<MyListData>) :
    RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val relativeLayout: RelativeLayout = itemView.findViewById(R.id.relativeLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false) as View

        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = listData[position].description
        holder.imageView.setImageResource(listData[position].imgId)
        holder.relativeLayout.setOnClickListener { view ->
            Toast.makeText(
                view.context,
                "click on item: " + listData[position].description,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount() = listData.size
}