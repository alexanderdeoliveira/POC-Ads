package com.pocads

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.n_ads.databinding.ItemListProductBinding
import com.n_ads.ui.ProductAdsAdapter
import com.n_ads.ui.ProductAdsViewHolder

class ItemAdapter(
    private val context: Context,
    private val initialList: List<ItemListModel>
): ProductAdsAdapter<ItemListProductBinding>() {

    init {
        addItems(initialList)
    }

    override fun getItemBinding() = ItemListProductBinding.inflate(LayoutInflater.from(context))

    override fun onBindViewHolder(
        holder: ProductAdsViewHolder<ItemListProductBinding>,
        position: Int
    ) {
        val item = items[position]
        holder.apply {
            binding.apply {
//                lstGridTitle.text = item.title
//                lstGridPrice.text = item.price.toString()
//                lstGridRating.rating = (item.rating ?: 0).toFloat()
//                loadImage(lstGridImage, item.imageUrl)

                lstItemVerticalTitle.text = item.title
                lstVerticalPrice.text = item.price.toString()
                lstVerticalRatingBar.rating = (item.rating ?: 0).toFloat()
                loadImage(lstVerticalImage, item.imageUrl)
            }

            onBindItem(item) {
                Toast.makeText(binding.root.context, "Clique no item", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadImage(imageView: ImageView, imageUrl: String?) {
        Glide.with(context)
            .load(imageUrl)
            .into(imageView);
    }
}