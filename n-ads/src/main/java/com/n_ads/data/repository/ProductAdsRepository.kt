package com.n_ads.data.repository

import com.n_ads.data.model.ProductAds

internal interface ProductAdsRepository {
    suspend fun getProductAds(listSize: Int): List<ProductAds>
}