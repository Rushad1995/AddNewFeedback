package scalereal.api.add_new_feedback

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

@Controller(value = "api/addnewfeedback")
@Secured(SecurityRule.IS_AUTHENTICATED)
class AddNewFeedbackApi(private val addNewFeedbackController: AddNewFeedbackController) {
    @Produces(MediaType.APPLICATION_JSON)
    @Post("/")
    fun post(feedback: String, feedbackTo: String, feedbackFrom: String): HttpResponse<Any> =
        addNewFeedbackController.update(feedback, feedbackTo, feedbackFrom).getHttpResponse()
}
