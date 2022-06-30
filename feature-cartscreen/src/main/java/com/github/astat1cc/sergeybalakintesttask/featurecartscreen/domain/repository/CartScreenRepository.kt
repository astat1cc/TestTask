package com.github.astat1cc.sergeybalakintesttask.featurecartscreen.domain.repository

import com.github.astat1cc.sergeybalakintesttask.featurecartscreen.domain.entities.Cart

interface CartScreenRepository {

    suspend fun getCart(): Cart
}