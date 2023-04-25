package com.n_ads.data.repository

import com.n_ads.data.datasource.ProductAdsRemoteDatasource
import com.n_ads.data.model.ProductAds

internal class ProductAdsRepositoryImpl(
    private val productAdsRemoteDatasource: ProductAdsRemoteDatasource
): ProductAdsRepository {
    override suspend fun getProductAds(listSize: Int): List<ProductAds> {
        return productAdsRemoteDatasource.getProductAds(listSize)
    }
}