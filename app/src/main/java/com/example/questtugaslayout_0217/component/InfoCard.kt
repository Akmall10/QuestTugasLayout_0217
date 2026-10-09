package com.example.questtugaslayout_0217.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.questtugaslayout_0217.R
import com.example.questtugaslayout_0217.ui.theme.spResource

/**
 * Satu-satunya fungsi Card (widget). Dipakai oleh seluruh card di HomeScreen.
 * Semua data (teks, warna, gaya font) dikirim lewat parameter yang
 * nilainya berasal dari Resources, tidak ada hardcode.
 */
@Composable
fun InfoCard(
    name: String,
    address: String,
    cardColorRes: Int,
    nameColorRes: Int,
    addressColorRes: Int,
    modifier: Modifier = Modifier,
    phone: String? = null,
    phoneColorRes: Int = nameColorRes,
    nameFontFamily: FontFamily = FontFamily.Default,
    nameFontWeight: FontWeight = FontWeight.Bold,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)))
            .background(colorResource(cardColorRes))
            .padding(
                horizontal = dimensionResource(R.dimen.card_padding_horizontal),
                vertical = dimensionResource(R.dimen.card_padding_vertical)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_text_spacing))
    ) {
        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(R.string.logo_description),
            modifier = Modifier.size(dimensionResource(R.dimen.card_logo_size))
        )

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_line_spacing))
        ) {
            Text(
                text = name,
                color = colorResource(nameColorRes),
                fontSize = spResource(R.dimen.text_size_name),
                fontFamily = nameFontFamily,
                fontWeight = nameFontWeight
            )
            if (phone != null) {
                Text(
                    text = phone,
                    color = colorResource(phoneColorRes),
                    fontSize = spResource(R.dimen.text_size_detail)
                )
            }
            Text(
                text = address,
                color = colorResource(addressColorRes),
                fontSize = spResource(R.dimen.text_size_detail)
            )
        }

        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(R.string.logo_description),
            modifier = Modifier.size(dimensionResource(R.dimen.card_logo_size))
        )
    }
}
