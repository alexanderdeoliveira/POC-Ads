package com.n_ads.data.datasource

import com.n_ads.data.model.ProductAds
import com.n_ads.util.ProductAdsTypeEnum

internal class ProductAdsRemoteDatasourceImpl: ProductAdsRemoteDatasource {
    override suspend fun getProductAds(listSize: Int): List<ProductAds> {
        return listMock.subList(0, listSize)
    }
}

private val listMock = listOf(
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 1", rating =0, price = 139.88),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 2", rating =1, price = 139.89),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 3", rating =2, price = 139.80),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 4", rating =3, price = 139.83),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 5", rating =4, price = 139.84),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 6", rating =5, price = 139.85),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 7", rating =0, price = 139.86),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 8", rating =1, price = 139.87),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 9", rating =2, price = 139.88),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 10",rating = 3,price =  139.89),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 11",rating = 4,price =  139.90),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 12",rating = 5,price =  139.91),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 13",rating = 0,price =  139.92),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 14",rating = 1,price =  139.93),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 15",rating = 2,price =  139.94),
    ProductAds(type = ProductAdsTypeEnum.ADS, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Anúncio - Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 16",rating = 3,price =  139.95)
)