package scalereal.core.get_employee

import jakarta.inject.Singleton
import scalereal.core.exception.user.UserNotFoundException
import scalereal.core.models.domain.Employee

@Singleton
class FeedbackService(private val repository: FeedbackRepository) {
    fun get(srNo: Long): Employee =
        repository.finById(srNo) ?: throw UserNotFoundException("Employee not found with SrNo $srNo")

    fun getByEmpId(empId: String): Employee =
        repository.finByEmpId(empId) ?: throw UserNotFoundException("Employee not found with empId $empId")

    fun getByFirstName(firstName: String): Employee =
        repository.finBy(firstName) ?: throw UserNotFoundException("Employee not found with Name $firstName")
}
