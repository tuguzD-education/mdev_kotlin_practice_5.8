package io.github.tuguzd.multipleroomtables

import io.github.tuguzd.multipleroomtables.entities.Director
import io.github.tuguzd.multipleroomtables.entities.School
import io.github.tuguzd.multipleroomtables.entities.Student
import io.github.tuguzd.multipleroomtables.entities.Subject
import io.github.tuguzd.multipleroomtables.entities.relations.StudentSubjectCrossRef

object DataExample {
    val directors = listOf(
        Director("Mike Litoris", "Jake Wharton School"),
        Director("Jack Goff", "Kotlin School"),
        Director("Chris P. Chicken", "JetBrains School"),
    )

    val schools = listOf(
        School("Jake Wharton School"),
        School("Kotlin School"),
        School("JetBrains School"),
    )

    val subjects = listOf(
        Subject("Dating for programmers"),
        Subject("Avoiding depression"),
        Subject("Bug Fix Meditation"),
        Subject("Logcat for Newbies"),
        Subject("How to use Google"),
    )

    val students = listOf(
        Student("Beff Jezos", "Kotlin School"),
        Student("Mark Suckerberg", "Jake Wharton School"),
        Student("Gill Bates", "Kotlin School"),
        Student("Donny Jepp", "Kotlin School"),
        Student("Hom Tanks", "JetBrains School"),
    )

    val studentSubjectRelations = listOf(
        StudentSubjectCrossRef("Beff Jezos", "Dating for programmers"),
        StudentSubjectCrossRef("Beff Jezos", "Avoiding depression"),
        StudentSubjectCrossRef("Beff Jezos", "Bug Fix Meditation"),
        StudentSubjectCrossRef("Beff Jezos", "Logcat for Newbies"),
        StudentSubjectCrossRef("Mark Suckerberg", "Dating for programmers"),
        StudentSubjectCrossRef("Gill Bates", "How to use Google"),
        StudentSubjectCrossRef("Donny Jepp", "Logcat for Newbies"),
        StudentSubjectCrossRef("Hom Tanks", "Avoiding depression"),
        StudentSubjectCrossRef("Hom Tanks", "Dating for programmers"),
    )
}
