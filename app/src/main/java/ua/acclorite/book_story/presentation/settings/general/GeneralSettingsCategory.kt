/*
 * Book's Story — free and open-source Material You eBook reader.
 * Copyright (C) 2024-2025 Acclorite
 * SPDX-License-Identifier: GPL-3.0-only
 */

@file:Suppress("FunctionName")

package ua.acclorite.book_story.presentation.settings.general

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import ua.acclorite.book_story.presentation.settings.general.components.AppLanguageOption
import ua.acclorite.book_story.presentation.settings.general.components.DoublePressExitOption

fun LazyListScope.GeneralSettingsCategory(
    topPadding: Dp = 16.dp,
    bottomPadding: Dp = 16.dp
) {
    item {
        Spacer(modifier = Modifier.height((topPadding - 8.dp).coerceAtLeast(0.dp)))
    }

    item {
        AppLanguageOption()
    }

    item {
        DoublePressExitOption()
    }

    item {
        Spacer(modifier = Modifier.height(bottomPadding))
    }
}