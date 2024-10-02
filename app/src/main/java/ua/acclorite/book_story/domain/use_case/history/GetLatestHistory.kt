package ua.acclorite.book_story.domain.use_case.history

import ua.acclorite.book_story.domain.model.History
import ua.acclorite.book_story.domain.repository.HistoryRepository
import javax.inject.Inject

class GetLatestHistory @Inject constructor(
    private val repository: HistoryRepository
) {

    suspend fun execute(bookId: Int): History? {
        return repository.getLatestBookHistory(bookId)
    }
}