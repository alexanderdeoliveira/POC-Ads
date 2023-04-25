package com.n_ads.domain

import com.n_ads.data.model.ProductAds
import com.n_ads.data.repository.ProductAdsRepository

internal class GetProductAdsUseCaseImpl(
    private val productAdsRepository: ProductAdsRepository
): GetProductAdsUseCase {
    override suspend fun invoke(listSize: Int): List<ProductAds> {
        return productAdsRepository.getProductAds(listSize)
    }
}