package scalereal.api.get_employee

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

@Controller(value = "api/employees")
@Secured(SecurityRule.IS_AUTHENTICATED)
class FeedbackApi(private val feedbackController: FeedbackController) {
    @Produces(MediaType.APPLICATION_JSON)
    @Get("/{srNo}")
    fun get(srNo: Long): HttpResponse<Any> =
        feedbackController.get(srNo).getHttpResponse()

    @Produces(MediaType.APPLICATION_JSON)
    @Get("/empId/{empId}")
    fun getByEmpId(empId: String): HttpResponse<Any> =
        feedbackController.getByEmpId(empId).getHttpResponse()

    @Produces(MediaType.APPLICATION_JSON)
    @Get("/firstName/{firstName}")
    fun getByFirstName(firstName: String): HttpResponse<Any> =
        feedbackController.getByFirstName(firstName).getHttpResponse()
}
