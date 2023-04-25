package com.n_ads.data.model

import com.n_ads.util.ProductAdsTypeEnum

open class ProductAds(
    open val imageUrl: String? = null,
    open val title: String? = null,
    open val rating: Int? = null,
    open val price: Double? = null,
    open val type: ProductAdsTypeEnum? = null,
    var visualized: Boolean = false,
    var printed: Boolean = false
)
