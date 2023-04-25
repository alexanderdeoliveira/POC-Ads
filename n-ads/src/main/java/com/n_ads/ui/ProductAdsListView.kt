package com.n_ads.ui

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView
import com.n_ads.data.model.ProductAds
import com.n_ads.productAdsModule
import org.koin.core.context.startKoin

class ProductAdsListView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
): RecyclerView(context, attributeSet, defStyleAttr) {

    private var onScrollListener: ProductAdsScrollListener? = null

    init {
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            modules(productAdsModule)
        }
    }

    fun setAdsPositionList(productAdsPositionList: List<ProductAds>) {
        onScrollListener?.let {
            removeOnScrollListener(it)
        }

        onScrollListener = ProductAdsScrollListener(productList = productAdsPositionList)
        onScrollListener?.let {
            addOnScrollListener(it)
        }
    }
}