package com.marco.instagram_clone.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

//Cores
val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)
val StoryCircleColor = Brush.horizontalGradient(
    listOf(
        Color(0xffff6f00),
        Color(0xffffeb35),
        Color(0xffff6f00),
        Color(0xffff2b99),
        Color(0xffff2bd1),
        Color(0xffff2bd1),
    )
)
val DividerColor = Color(0xFFC9C9C9)
val DarkDividerColor = Color(0xFF343434)
val screenSkeleton = ColorPainter(Color.Gray)