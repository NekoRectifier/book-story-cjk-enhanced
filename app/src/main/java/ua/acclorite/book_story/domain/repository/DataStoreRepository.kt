package ua.acclorite.book_story.domain.repository

import androidx.datastore.preferences.core.Preferences
import ua.acclorite.book_story.presentation.data.MainState

interface DataStoreRepository {

    suspend fun <T> putDataToDataStore(
        key: Preferences.Key<T>,
        value: T
    )

    suspend fun getAllSettings(): MainState
}