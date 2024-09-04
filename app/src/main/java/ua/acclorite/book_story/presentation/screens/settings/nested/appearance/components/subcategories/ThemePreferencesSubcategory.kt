@file:Suppress("FunctionName")

package ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.subcategories

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import ua.acclorite.book_story.R
import ua.acclorite.book_story.presentation.core.components.CategoryTitle
import ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.settings.AbsoluteDarkSetting
import ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.settings.DarkThemeSetting
import ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.settings.PureDarkSetting
import ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.settings.ThemeContrastSetting
import ua.acclorite.book_story.presentation.screens.settings.nested.appearance.components.settings.ThemeSetting

/**
 * Theme Preferences subcategory.
 * Contains all settings from Theme Preferences.
 */
fun LazyListScope.ThemePreferencesSubcategory(
    titleColor: @Composable () -> Color = { MaterialTheme.colorScheme.primary },
    title: @Composable () -> String = { stringResource(id = R.string.theme_appearance_settings) },
    showTitle: Boolean = true,
    topPadding: Dp,
    bottomPadding: Dp
) {
    item {
        if (showTitle) {
            CategoryTitle(
                title = title.invoke(),
                color = titleColor.invoke(),
                modifier = Modifier
                    .padding(
                        top = topPadding,
                        bottom = 8.dp
                    )
            )
        } else {
            Spacer(
                modifier = Modifier.height((topPadding - 8.dp).coerceAtLeast(0.dp))
            )
        }
    }

    item {
        DarkThemeSetting()
    }

    item {
        ThemeSetting()
    }

    item {
        ThemeContrastSetting()
    }

    item {
        PureDarkSetting()
    }

    item {
        AbsoluteDarkSetting()
    }

    item {
        Spacer(
            modifier = Modifier.height(bottomPadding)
        )
    }
}