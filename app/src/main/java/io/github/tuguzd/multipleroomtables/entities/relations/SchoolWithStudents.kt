package io.github.tuguzd.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import io.github.tuguzd.multipleroomtables.entities.School
import io.github.tuguzd.multipleroomtables.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName",
    )
    val students: List<Student>,
)
