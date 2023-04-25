package com.n_ads.domain

import com.n_ads.data.model.ProductAds

internal interface GetProductAdsUseCase {
    suspend operator fun invoke(listSize: Int): List<ProductAds>
}