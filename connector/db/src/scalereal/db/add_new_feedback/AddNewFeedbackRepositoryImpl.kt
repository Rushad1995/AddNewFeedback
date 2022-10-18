package scalereal.db.add_new_feedback

import jakarta.inject.Singleton
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import scalereal.core.add_new_feedback.AddNewFeedbackRepository
import scalereal.core.models.NewFeedbackEntity
import scalereal.db.tables.AddNewFeedback

@Singleton
class AddNewFeedbackRepositoryImpl : AddNewFeedbackRepository {
    override fun updateBy(feedback: String, feedbackTo: String, feedbackFrom: String): NewFeedbackEntity =
        transaction {
            AddNewFeedback.insert {
                it[AddNewFeedback.feedback] = feedback
                it[AddNewFeedback.feedbackTo] = feedbackTo
                it[AddNewFeedback.feedbackFrom] = feedbackFrom
            }.let { feedback ->
                NewFeedbackEntity(
                    feedback = feedback[AddNewFeedback.feedback],
                    feedbackTo = feedback[AddNewFeedback.feedbackTo],
                    feedbackFrom = feedback[AddNewFeedback.feedbackFrom]
                )
            }
        }
}
