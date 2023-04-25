package com.pocads

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.n_ads.util.ProductAdsTypeEnum
import com.pocads.databinding.ActivityMainBinding

class MainActivitySecond: AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.customRecyclerView.apply {
            val mAdapter = ItemAdapter(context, listMock.subList(0, 5))
            mAdapter.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
                override fun onChanged() {
                    setAdsPositionList(mAdapter.items)
                }
            })
            adapter = mAdapter
//            layoutManager = GridLayoutManager(context, 2)
        }
    }
}

private val listMock = listOf(
    ItemListModel(id = 0, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 1", rating = 0, price = 139.80),
    ItemListModel(id = 1, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 2", rating = 1, price = 139.81),
    ItemListModel(id = 2, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 3", rating = 2, price = 139.82),
    ItemListModel(id = 3, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 4", rating = 3, price = 139.83),
    ItemListModel(id = 4, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 5", rating = 4, price = 139.84),
    ItemListModel(id = 5, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 6", rating = 5, price = 139.85),
    ItemListModel(id = 6, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 7", rating = 0, price = 139.86),
    ItemListModel(id = 7, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 8", rating = 1, price = 139.87),
    ItemListModel(id = 8, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 9", rating = 2, price = 139.88),
    ItemListModel(id = 9, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 10",rating =  3,price =  139.89),
    ItemListModel(id = 10, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 11",rating =  4,price =  139.90),
    ItemListModel(id = 11, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 12",rating =  5,price =  139.91),
    ItemListModel(id = 12, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 13",rating =  0,price =  139.92),
    ItemListModel(id = 13, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 14",rating =  1,price =  139.93),
    ItemListModel(id = 14, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 15",rating =  2,price =  139.94),
    ItemListModel(id = 15, type = ProductAdsTypeEnum.COMMON, imageUrl = "https://static.netshoes.com.br/produtos/creatine-turbo-300g-black-skull/01/G54-4177-001/G54-4177-001_detalhe1.jpg?ts=1650625727", title = "Camisa Tottenham Home 19/d sdfd dsf 20º  Torcedor - 16",rating =  3,price =  139.95)
)