package com.n_ads.data.datasource

import com.n_ads.data.model.ProductAds

internal interface ProductAdsRemoteDatasource {
    suspend fun getProductAds(listSize: Int): List<ProductAds>
}