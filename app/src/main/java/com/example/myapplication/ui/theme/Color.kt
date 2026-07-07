package com.example.myapplication.ui.theme

import android.R.color.black
import android.R.color.white
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Main1 = Color(0xFFFFB1B1)

val Main2 = Color(0xFFFFC4C4)

val Main3 = Color(0xFFFFDBB5)

val Black = Color(0xFF201B1B)

val Gray1 = Color(0xFFA3A3A3)

val Gray2 = Color(0xFFC2C2C2)

val White = Color(0xFFFFFFFF)

class KuitColors(
    main1:Color,
    main2:Color,
    main3:Color,
    black:Color,
    gray1:Color,
    gray2:Color,
    white:Color,
    isLightMode:Boolean
){
    var main1 by mutableStateOf(main1)
        private set

    var main2 by mutableStateOf(main2)
        private set

    var main3 by mutableStateOf(main3)
        private set

    var black by mutableStateOf(black)
        private set

    var gray1 by mutableStateOf(gray1)
        private set

    var gray2 by mutableStateOf(gray2)
        private set

    var white by mutableStateOf(white)
        private set

    var isLightMode by mutableStateOf(isLightMode)

    fun copy(
        main1:Color=this.main1,
        main2:Color=this.main2,
        main3:Color=this.main3,
        black:Color=this.black,
        gray1:Color=this.gray1,
        gray2:Color=this.gray2,
        white:Color=this.white,
        isLightMode:Boolean=this.isLightMode
    )= KuitColors(
        main1=main1,
        main2=main2,
        main3=main3,
        black=black,
        gray1=gray1,
        gray2=gray2,
        white=white,
        isLightMode=isLightMode
    )

    fun update(other: KuitColors){
        this.main1=other.main1
        this.main2=other.main2
        this.main3=other.main3
        this.black=other.black
        this.gray1=other.gray1
        this.gray2=other.gray2
        this.white=other.white
        this.isLightMode=other.isLightMode
    }
}

fun lightColors()= KuitColors(
    main1=Main1,
    main2=Main2,
    main3=Main3,
    black=Black,
    gray1=Gray1,
    gray2=Gray2,
    white=White,
    isLightMode=true
)