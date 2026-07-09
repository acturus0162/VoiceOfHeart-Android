package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private fun kuitLightColorScheme(colors: KuitColors) = lightColorScheme(
    primary = colors.main1,
    secondary = colors.main2,
    tertiary = colors.main3,
    background = colors.white,
    surface = colors.white,
    surfaceVariant = colors.gray2,
    outline = colors.gray1,
    onPrimary = colors.black,
    onSecondary = colors.black,
    onTertiary = colors.black,
    onBackground = colors.black,
    onSurface = colors.black,
    onSurfaceVariant = colors.black
)

private fun kuitDarkColorScheme(colors: KuitColors) = darkColorScheme(
    primary = colors.main1,
    secondary = colors.main2,
    tertiary = colors.main3,
    background = colors.black,
    surface = colors.black,
    surfaceVariant = colors.gray1,
    outline = colors.gray2,
    onPrimary = colors.black,
    onSecondary = colors.black,
    onTertiary = colors.black,
    onBackground = colors.white,
    onSurface = colors.white,
    onSurfaceVariant = colors.white
)

val LocalColors = staticCompositionLocalOf { lightColors() }
val LocalTypography = staticCompositionLocalOf { KuitTypography() }

object KuitTheme {
    val colors: KuitColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: KuitTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

@Composable
fun MyApplicationTheme(
    colors: KuitColors = lightColors(),
    typography: KuitTypography = KuitTypography(),
    darkColors: KuitColors? = null,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val currentColors = if (darkColors != null && darkTheme) darkColors else colors
    val rememberedColors = remember { currentColors.copy() }.apply {
        update(currentColors)
    }
    val colorScheme = if (rememberedColors.isLightMode) {
        kuitLightColorScheme(rememberedColors)
    } else {
        kuitDarkColorScheme(rememberedColors)
    }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = typography.toMaterialTypography()
        ) {
            ProvideTextStyle(
                value = typography.R_16,
                content = content
            )
        }
    }
}
