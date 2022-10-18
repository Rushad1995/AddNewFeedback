package scalereal.api.add_new_feedback

import scalereal.api.common.Response

interface AddNewFeedbackController {
    fun update(feedback: org.jetbrains.exposed.sql.Column<String>, feedbackTo: String, feedbackFrom: String): Response<Any>
}
