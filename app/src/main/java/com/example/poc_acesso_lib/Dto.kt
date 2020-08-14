package com.example.poc_acesso_lib

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dto(var name: String, var password: String) : Parcelable