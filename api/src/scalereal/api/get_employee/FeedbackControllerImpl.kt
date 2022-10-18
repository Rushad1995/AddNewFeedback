package scalereal.api.get_employee

import jakarta.inject.Singleton
import scalereal.api.common.Response
import scalereal.api.common.ResponseType
import scalereal.core.exception.user.UserNotFoundException
import scalereal.core.get_employee.FeedbackService

@Singleton
class FeedbackControllerImpl(private val feedbackService: FeedbackService) : FeedbackController {
    override fun get(srNo: Long): Response<Any> {
        return try {
            Response(
                ResponseType.SUCCESS,
                "",
                body = feedbackService.get(srNo)
            )
        } catch (e: UserNotFoundException) {
            Response(
                ResponseType.NOT_FOUND,
                e.message.toString()
            )
        }
    }

    override fun getByEmpId(empId: String): Response<Any> {
        return try {
            Response(
                ResponseType.SUCCESS,
                "",
                body = feedbackService.getByEmpId(empId)
            )
        } catch (e: UserNotFoundException) {
            Response(
                ResponseType.NOT_FOUND,
                e.message.toString()
            )
        }
    }

    override fun getByFirstName(firstName: String): Response<Any> {
        return try {
            Response(
                ResponseType.SUCCESS,
                "",
                body = feedbackService.getByFirstName(firstName)
            )
        } catch (e: UserNotFoundException) {
            Response(
                ResponseType.NOT_FOUND,
                e.message.toString()
            )
        }
    }
}
