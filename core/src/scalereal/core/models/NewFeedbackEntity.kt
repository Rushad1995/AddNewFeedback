package scalereal.core.models

data class NewFeedbackEntity(
    val srNo: Long? = null,
    val feedback: String?,
    val feedbackTo: String?,
    val feedbackFrom: String?
)
