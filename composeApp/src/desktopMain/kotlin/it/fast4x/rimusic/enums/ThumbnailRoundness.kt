package it.fast4x.rimusic.enums

import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

enum class ThumbnailRoundness {
    None,
    Light,
    Medium,
    Heavy;

    fun shape(): Shape {
        return when (this) {
            None -> RectangleShape
            Light, Medium, Heavy -> RectangleShape
        }
    }

}
