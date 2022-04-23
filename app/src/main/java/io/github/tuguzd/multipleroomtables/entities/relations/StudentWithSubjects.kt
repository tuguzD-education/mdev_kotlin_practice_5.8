package io.github.tuguzd.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import io.github.tuguzd.multipleroomtables.entities.Student
import io.github.tuguzd.multipleroomtables.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class),
    )
    val subjects: List<Subject>,
)
