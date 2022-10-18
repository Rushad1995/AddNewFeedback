package scalereal.api.get_employee

import scalereal.api.common.Response

interface FeedbackController {
    fun get(srNo: Long): Response<Any>
    fun getByEmpId(empId: String): Response<Any>
    fun getByFirstName(firstName: String): Response<Any>
}
