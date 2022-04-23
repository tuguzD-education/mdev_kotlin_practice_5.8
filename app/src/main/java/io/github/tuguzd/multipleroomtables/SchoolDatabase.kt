package io.github.tuguzd.multipleroomtables

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.tuguzd.multipleroomtables.entities.Director
import io.github.tuguzd.multipleroomtables.entities.School
import io.github.tuguzd.multipleroomtables.entities.Student
import io.github.tuguzd.multipleroomtables.entities.Subject
import io.github.tuguzd.multipleroomtables.entities.relations.StudentSubjectCrossRef

@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class,
    ],
    version = 1,
)
abstract class SchoolDatabase : RoomDatabase() {
    abstract val schoolDao: SchoolDao
}
