package com.example.firebaseloginkotlin.listener

import com.example.firebaseloginkotlin.model.DrinkModel

interface IDrinkLoadListener {
    fun onDrinkLoadSuccess(drinkModelList:List<DrinkModel>?)
       fun onDrinkLoadFailed(message: String?)
}