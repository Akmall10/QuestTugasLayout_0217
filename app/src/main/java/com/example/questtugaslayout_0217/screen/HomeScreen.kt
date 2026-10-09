package com.example.questtugaslayout_0217.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.questtugaslayout_0217.R
import com.example.questtugaslayout_0217.component.InfoCard
import com.example.questtugaslayout_0217.ui.theme.spResource

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(horizontal = dimensionResource(R.dimen.screen_padding_horizontal)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            InfoCard(
                name = stringResource(R.string.name_bambang),
                address = stringResource(R.string.address_bambang),
                cardColorRes = R.color.card_gray,
                nameColorRes = R.color.text_white,
                addressColorRes = R.color.text_yellow,
                nameFontFamily = FontFamily.Cursive,
                nameFontWeight = FontWeight.Normal
            )
            InfoCard(
                name = stringResource(R.string.name_gibran),
                phone = stringResource(R.string.phone_gibran),
                address = stringResource(R.string.address_gibran),
                cardColorRes = R.color.card_purple,
                nameColorRes = R.color.text_white,
                phoneColorRes = R.color.text_cyan,
                addressColorRes = R.color.text_yellow
            )
            InfoCard(
                name = stringResource(R.string.name_zhilal),
                phone = stringResource(R.string.phone_zhilal),
                address = stringResource(R.string.address_zhilal),
                cardColorRes = R.color.card_blue,
                nameColorRes = R.color.text_white,
                phoneColorRes = R.color.text_cyan,
                addressColorRes = R.color.text_white
            )
            InfoCard(
                name = stringResource(R.string.name_ahmad),
                phone = stringResource(R.string.phone_ahmad),
                address = stringResource(R.string.address_ahmad),
                cardColorRes = R.color.card_green,
                nameColorRes = R.color.text_white,
                phoneColorRes = R.color.text_aqua,
                addressColorRes = R.color.text_white
            )
        }

        FooterSection()
    }
}

@Composable
private fun HeaderSection() {
    Spacer(Modifier.height(dimensionResource(R.dimen.header_padding_top)))
    Text(
        text = stringResource(R.string.header_title),
        color = colorResource(R.color.text_title),
        fontSize = spResource(R.dimen.text_size_title),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
    Spacer(Modifier.height(dimensionResource(R.dimen.header_subtitle_spacing)))
    Text(
        text = stringResource(R.string.header_subtitle),
        color = colorResource(R.color.text_subtitle),
        fontSize = spResource(R.dimen.text_size_subtitle),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
    Spacer(Modifier.height(dimensionResource(R.dimen.header_padding_bottom)))
}

@Composable
private fun FooterSection() {
    Text(
        text = stringResource(R.string.footer_copyright),
        color = colorResource(R.color.text_footer),
        fontSize = spResource(R.dimen.text_size_footer),
        modifier = Modifier.padding(
            vertical = dimensionResource(R.dimen.footer_padding_bottom)
        )
    )
}
