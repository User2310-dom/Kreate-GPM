package it.fast4x.rimusic.ui.styling

import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

data class Appearance(
    val colorPalette: ColorPalette,
    val typography: Typography,
    val thumbnailShape: Shape
) {
    companion object : Saver<Appearance, List<Any>> {
        @Suppress("UNCHECKED_CAST")
        override fun restore(value: List<Any>): Appearance {
            return Appearance(
                colorPalette = ColorPalette.restore(value[0] as List<Any>),
                typography = Typography.restore(value[1] as List<Any>),
                thumbnailShape = RectangleShape
            )
        }

        override fun SaverScope.save(value: Appearance): List<Any> {
            return listOf(
                with(ColorPalette.Companion) { save(value.colorPalette) },
                with(Typography.Companion) { save(value.typography) },
                0

            )
        }
    }
}

val LocalAppearance = staticCompositionLocalOf<Appearance> { TODO() }
