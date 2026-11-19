package it.fast4x.rimusic.enums

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import app.kreate.android.R
import me.knighthat.enums.TextView

enum class ThumbnailRoundness(
    val shape: Shape,
    @field:StringRes override val androidTextId: Int
): TextView {

    None( RectangleShape, R.string.none ),

    Light( RectangleShape, R.string.light ),

    Medium( RectangleShape, R.string.medium ),

    Heavy( RectangleShape, R.string.heavy );
}
