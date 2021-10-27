package com.example.kitaplaruygulamasi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kitaplaruygulamasi.databinding.KitapCardBinding
import com.example.kitaplaruygulamasi.model.Kitap
import com.squareup.picasso.Picasso

class KitaplarAdapter(private var kitaplarList: ArrayList<Kitap>)
    : RecyclerView.Adapter<KitaplarAdapter.KitapCardDesign>() {

        class KitapCardDesign(val kitapCardBinding: KitapCardBinding)
            : RecyclerView.ViewHolder(kitapCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KitapCardDesign {
        val layoutInflater = LayoutInflater.from(parent.context)
        val kitapCardBinding = KitapCardBinding.inflate(layoutInflater, parent, false)
        return KitapCardDesign(kitapCardBinding)
    }

    override fun onBindViewHolder(holder: KitapCardDesign, position: Int) {
        val kitap = kitaplarList[position]

        holder.kitapCardBinding.apply {
            kitapAdTextView.text = kitap.book_name
            Picasso.get().load(kitap.book_image_url).into(kitapImageView)
        }
    }

    override fun getItemCount(): Int {
        return kitaplarList.size
    }
}