package com.example.firebaseloginkotlin.listener

import com.example.firebaseloginkotlin.model.CartModel

interface ICartLoadListener {
    fun onLoadCartSuccess(cartModelList: List<CartModel>)
    fun onLoadCartFailed(message:String?)

}