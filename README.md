## Como usar o sdk n-ads?

1. O adapter da lista deve estender ProductAdsAdapter<VB>. Onde **VB** é o view binding da view do item da lista. No exemplo abaixo usamos **ItemListProductBinding**

```kotlin
class ItemAdapter: ProductAdsAdapter<ItemListProductBinding>() {

}
```

2. Depois será necessária a implementação obrigatória dos métodos **getItemBinding()**, onde deverá ser retornado o view biding da view do item da lista, e **onBindViewHolder**. No exemplo abaixo usamos **ItemListProductBinding**

3. Dentro de **onBindViewHolder** deve-se chamar **onBindItem(item)** passando o respectivo item da lista e seu onClickListener

```kotlin
class ItemAdapter: ProductAdsAdapter<ItemListProductBinding>() {

    override fun getItemBinding() = ItemListProductBinding.inflate(LayoutInflater.from(context))

    override fun onBindViewHolder(
        holder: ProductAdsViewHolder<ItemListProductBinding>,
        position: Int
    ) {
        val item = items[position]
        holder.apply {
            binding.apply {
                lstItemVerticalTitle.text = item.title
                lstVerticalPrice.text = item.price.toString()
                lstVerticalRatingBar.rating = (item.rating ?: 0).toFloat()
            }

            onBindItem(item) {
                Toast.makeText(binding.root.context, "Clique no item", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

```

## License

Copyright 2023 Alexander de Oliveira

Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0