package scalereal.core.add_new_feedback

import jakarta.inject.Singleton
import scalereal.core.exception.user.UserNotFoundException
import scalereal.core.models.NewFeedbackEntity

@Singleton
class AddNewFeedbackService(private val repository: AddNewFeedbackRepository) {
    fun update(feedback: String, feedbackTo: String, feedbackFrom: String): NewFeedbackEntity =
        repository.updateBy(feedback, feedbackTo, feedbackFrom) ?: throw UserNotFoundException("User not found with user id")
}
