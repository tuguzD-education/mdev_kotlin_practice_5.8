package io.github.tuguzd.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import io.github.tuguzd.multipleroomtables.entities.Student
import io.github.tuguzd.multipleroomtables.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class),
    )
    val students: List<Student>,
)
