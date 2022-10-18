package scalereal.api.add_new_feedback

import jakarta.inject.Singleton
import scalereal.api.common.Response
import scalereal.api.common.ResponseType
import scalereal.core.add_new_feedback.AddNewFeedbackService
import scalereal.core.exception.user.UserNotFoundException

@Singleton
class AddNewFeedbackControllerImpl(private val addNewFeedbackService: AddNewFeedbackService) : AddNewFeedbackController {
    override fun update(feedback: org.jetbrains.exposed.sql.Column<String>, feedbackTo: String, feedbackFrom: String): Response<Any> {
        return try {
            Response(
                ResponseType.SUCCESS,
                "",
                body = addNewFeedbackService.update(feedback, feedbackTo, feedbackFrom)
            )
        } catch (e: UserNotFoundException) {
            Response(
                ResponseType.NOT_FOUND,
                e.message.toString()
            )
        }
    }
}
