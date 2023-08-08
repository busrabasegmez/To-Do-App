package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

import androidx.room.Index

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()

}
