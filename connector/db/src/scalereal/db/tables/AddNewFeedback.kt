package scalereal.db.tables

import org.jetbrains.exposed.sql.Table

object AddNewFeedback : Table("add_new_feedback") {
    val srNo = long("sr_no").autoIncrement()
    val feedback = varchar("feedback", length = 500)
    val feedbackTo = varchar("feedback_to", length = 50)
    val feedbackFrom = varchar("feedback_from", length = 50)
}
