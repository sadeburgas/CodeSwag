package bg.sade.codeswag.Serviices

import bg.sade.codeswag.Model.Category
import bg.sade.codeswag.Model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("digital", "digitalgoodsimage")
            )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat Snapback", "$22","hat04")

    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red","$32","hoodie02"),
            Product("Devslopes Gray Hoodie","$28","hoodie03"),
            Product("Devslopes Black Hoodie","$32","hoodie04")
    )
    val shirts = listOf(
            Product("Devslopes Shirt black","$18","shirt01"),
            Product("Devslopes Badge Light Gray","$20","shirt02"),
            Product("Devslopes Logo Shirt Red","$22","shirt02"),
            Product("Devslopes Hustle","$22","shirt04"),
            Product("Devslopes Studio","$32","shirt05")
    )
}