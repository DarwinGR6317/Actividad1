package com.example.actividad1
import androidx.annotation.StringRes
//class Question{ }
data class  Question(@StringRes val textResId: Int, val answer: Boolean)