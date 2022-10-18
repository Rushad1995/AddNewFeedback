package scalereal.db.tables

import org.jetbrains.exposed.sql.Table

object Employees : Table("employees") {
    val srNo = long("sr_no").autoIncrement()
    val empId = varchar("emp_id", length = 50)
    val firstName = varchar("first_name", length = 50)
    val lastName = varchar("last_name", length = 50)
}
