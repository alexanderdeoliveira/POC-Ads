package com.pocads

import com.n_ads.data.model.ProductAds
import com.n_ads.util.ProductAdsTypeEnum

data class ItemListModel(
    val id: Int,
    override val imageUrl: String? = null,
    override val title: String? = null,
    override val rating: Int? = null,
    override val price: Double? = null,
    override val type: ProductAdsTypeEnum? = null,
): ProductAds()
