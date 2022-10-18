package scalereal.api.add_new_feedback

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import scalereal.api.common.ResponseType
import scalereal.db.tables.AddNewFeedback.feedback
import scalereal.db.tables.AddNewFeedback.feedbackFrom
import scalereal.db.tables.AddNewFeedback.feedbackTo

class AddNewFeedbackControllerImplTest (
    private val addNewFeedbackControllerImpl: AddNewFeedbackControllerImpl
): BehaviorSpec({

    given("displaying all feedback") {
        `when`("the feedback API is called /api/feedback") {
//            val result = addNewFeedbackControllerImpl.update(feedback, feedbackTo, feedbackFrom)
            then("display success") {
//                result.status shouldBe ResponseType.SUCCESS
            }
        }
    }})

