package com.mobile.intentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name: String?,
    val nim: Long?,
    val jurusan: String?,
    val ipk: Double?,
    val noHp: String?,
) : Parcelable
