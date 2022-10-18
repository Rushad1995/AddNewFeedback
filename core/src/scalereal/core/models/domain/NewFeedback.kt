package scalereal.core.models.domain

data class NewFeedback(
    val srNo: Long,
    val feedback: String?,
    val feedbackTo: String?,
    val feedbackFrom: String?
)
