package com.n_ads.ui

import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.n_ads.data.repository.ProductAdsRepository
import com.n_ads.data.model.ProductAds
import com.n_ads.util.ProductAdsTypeEnum
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

abstract class ProductAdsAdapter<VB : ViewBinding>: RecyclerView.Adapter<ProductAdsViewHolder<VB>>(), KoinComponent {

    private val repository: ProductAdsRepository by inject()

    var items = mutableListOf<ProductAds>()

    init {
        getAdsList()
    }

    fun addItems(list: List<ProductAds>) {
        items.addAll(list)
        notifyDataSetChanged()
    }

    var onItemClickListener: ((view: View, item: ProductAds) -> Unit) = { view, item ->
        if (item.type == ProductAdsTypeEnum.ADS) {
            Toast.makeText(view.context, "Clique no anúncio", Toast.LENGTH_SHORT).show()
        }
    }

    abstract fun getItemBinding(): VB

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdsViewHolder<VB> {
        return ProductAdsViewHolder(getItemBinding())
    }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return items[position].type?.type ?: 0
    }

    override fun getItemCount(): Int = items.size

    @OptIn(DelicateCoroutinesApi::class)
    private fun getAdsList() {
        GlobalScope.launch(Dispatchers.IO) {
            repository.getProductAds(4).apply {
                addItems(this)
            }
        }
    }
}