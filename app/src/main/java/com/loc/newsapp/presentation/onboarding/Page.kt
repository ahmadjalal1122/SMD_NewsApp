package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "BBC News",
        description = "BBC News an international news broadcaster.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "ABC News",
        description = "ABC News an international news broadcaster.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Aljazeera News",
        description = "Aljazeera News an international news broadcaster.",
        image = R.drawable.onboarding3
    )
)