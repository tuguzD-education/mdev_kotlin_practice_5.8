package io.github.tuguzd.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import io.github.tuguzd.multipleroomtables.entities.Director
import io.github.tuguzd.multipleroomtables.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName",
    )
    val director: Director,
)
