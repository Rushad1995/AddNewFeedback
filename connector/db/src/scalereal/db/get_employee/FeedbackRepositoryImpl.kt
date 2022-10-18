package scalereal.db.get_employee

import jakarta.inject.Singleton
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import scalereal.core.get_employee.FeedbackRepository
import scalereal.core.models.domain.Employee
import scalereal.db.tables.Employees

@Singleton
class FeedbackRepositoryImpl : FeedbackRepository {
    override fun finBy(firstName: String): Employee? {
        return transaction {
            Employees.select { Employees.firstName eq firstName }.firstOrNull()?.let { result ->
                Employee(
                    srNo = result[Employees.srNo],
                    empId = result[Employees.empId],
                    firstName = result[Employees.firstName],
                    lastName = result[Employees.lastName]
                )
            }
        }
    }

    override fun finByEmpId(empId: String): Employee? {
        return transaction {
            Employees.select { Employees.empId eq empId }.firstOrNull()?.let { result ->
                Employee(
                    srNo = result[Employees.srNo],
                    empId = result[Employees.empId],
                    firstName = result[Employees.firstName],
                    lastName = result[Employees.lastName]
                )
            }
        }
    }

    override fun finById(srNo: Long): Employee? {
        return transaction {
            Employees.select { Employees.srNo eq srNo }.firstOrNull()?.let { result ->
                Employee(
                    srNo = result[Employees.srNo],
                    empId = result[Employees.empId],
                    firstName = result[Employees.firstName],
                    lastName = result[Employees.lastName]
                )
            }
        }
    }
}
