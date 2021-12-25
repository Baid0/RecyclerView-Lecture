package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class RecyclerViewPersonAdapter(private var list: List<Person>): RecyclerView.Adapter<RecyclerViewPersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageView: ImageView
        val textView: TextView
        val textView2: TextView

        init{
            imageView = itemView.findViewById(R.id.imageView)
            textView = itemView.findViewById(R.id.textView)
            textView2 = itemView.findViewById(R.id.textView2)
        }

        fun setData(person:Person) {
            textView.text = person.title
            textView2.text = person.name

            Glide.with(itemView)
                .load(person.imageUrl)
                .into(imageView)

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false)
        return PersonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = list[position]
        holder.setData(person)
    }

    override fun getItemCount() = list.size
}
