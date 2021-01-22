package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devsolpes Graphic Beanie", "$18", "hat01"),
        Product("Devsolpes Hat Black", "$20", "hat02"),
        Product("Devsolpes Hat White", "$18", "hat03"),
        Product("Devsolpes Hat Snapback", "$20", "hat04")
    )

    val hoodies = listOf(
        Product("Devsolpes Hoodie Gray", "$28", "hoodie01"),
        Product("Devsolpes Hoodie Red", "$32", "hoodie02"),
        Product("Devsolpes Gray Hoodie", "$28", "hoodie03"),
        Product("Devsolpes Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
        Product("Devsolpes Shirt Black", "$18", "shirt01"),
        Product("Devsolpes Badge Light Gray", "$20", "shirt02"),
        Product("Devsolpes Logo Shirt Red", "$22", "shirt03"),
        Product("Devsolpes Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}