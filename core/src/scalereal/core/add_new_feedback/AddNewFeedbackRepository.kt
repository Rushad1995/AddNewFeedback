package scalereal.core.add_new_feedback

import scalereal.core.models.NewFeedbackEntity

interface AddNewFeedbackRepository {
    fun updateBy(feedback: String, feedbackTo: String, feedbackFrom: String): NewFeedbackEntity
}
