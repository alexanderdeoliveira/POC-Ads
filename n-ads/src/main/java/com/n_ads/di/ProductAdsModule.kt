package com.n_ads

import com.n_ads.data.datasource.ProductAdsRemoteDatasource
import com.n_ads.data.datasource.ProductAdsRemoteDatasourceImpl
import com.n_ads.data.repository.ProductAdsRepository
import com.n_ads.data.repository.ProductAdsRepositoryImpl
import com.n_ads.domain.GetProductAdsUseCase
import com.n_ads.domain.GetProductAdsUseCaseImpl
import org.koin.dsl.module

internal val productAdsModule = module {
    single<GetProductAdsUseCase> { GetProductAdsUseCaseImpl(get()) }
    single<ProductAdsRepository> { ProductAdsRepositoryImpl(get()) }
    single<ProductAdsRemoteDatasource> { ProductAdsRemoteDatasourceImpl() }
}