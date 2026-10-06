package edu.iesam.superhero.feature.list.domain

interface UserRepository {
    fun obtainUsers(): List<User>
}