package scalereal.core.get_employee

import scalereal.core.models.domain.Employee

interface FeedbackRepository {
    fun finBy(firstName: String): Employee?
    fun finByEmpId(empId: String): Employee?
    fun finById(srNo: Long): Employee?
}
