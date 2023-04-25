package com.n_ads.ui

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.n_ads.data.model.ProductAds
import com.n_ads.util.ProductAdsTypeEnum

open class ProductAdsViewHolder<VB : ViewBinding>(val binding: VB): RecyclerView.ViewHolder(binding.root) {

    open fun onBindItem(item: ProductAds, onItemClick: (ProductAds) -> Unit) {
        val isAds = item.type == ProductAdsTypeEnum.ADS
        if (isAds && !item.printed) {
            item.printed = true
            Toast.makeText(itemView.context, "Anúncio impresso - ${item.title}", Toast.LENGTH_SHORT).show()
        }

        binding.root.setOnClickListener {
            if (isAds) {
                Toast.makeText(it.context, "Clique no anúncio", Toast.LENGTH_SHORT).show()
            }
            onItemClick.invoke(item)
        }
    }
}