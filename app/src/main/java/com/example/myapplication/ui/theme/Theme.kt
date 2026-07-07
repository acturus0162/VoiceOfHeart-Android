package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Main1,
    secondary = Main2,
    tertiary = Main3,
    background = White,
    surface = White,
    surfaceVariant = Gray2,
    outline = Gray1,
    onPrimary = Black,
    onSecondary = Black,
    onTertiary = Black,
    onBackground = Black,
    onSurface = Black,
    onSurfaceVariant = Black
)

private val DarkColorScheme = darkColorScheme(
    primary = Main1,
    secondary = Main2,
    tertiary = Main3,
    background = Black,
    surface = Black,
    surfaceVariant = Gray1,
    outline = Gray2,
    onPrimary = Black,
    onSecondary = Black,
    onTertiary = Black,
    onBackground = White,
    onSurface = White,
    onSurfaceVariant = White
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
