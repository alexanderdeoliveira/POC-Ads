package com.n_ads.ui

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.n_ads.data.model.ProductAds
import com.n_ads.util.ProductAdsTypeEnum
import kotlinx.coroutines.*

internal class ProductAdsScrollListener(
    private val productList: List<ProductAds>
): RecyclerView.OnScrollListener() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)
        GlobalScope.launch {
            val index = (recyclerView.layoutManager as LinearLayoutManager).findLastCompletelyVisibleItemPosition()
            if (index > 0) {
                val product = productList[index]
                if (product.type == ProductAdsTypeEnum.ADS && !product.visualized) {
                    product.visualized = true
                    withContext(Dispatchers.Main) {
                        Toast.makeText(recyclerView.context, "Anúncio visualizado - ${product.title}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}