package com.example.questtugaslayout_0217.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit

/** Mengambil ukuran font (sp) dari dimens.xml. */
@Composable
fun spResource(id: Int): TextUnit {
    val dp = dimensionResource(id)
    return with(LocalDensity.current) { dp.toSp() }
}
