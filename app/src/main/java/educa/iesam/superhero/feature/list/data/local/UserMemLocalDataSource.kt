package edu.iesam.superhero.feature.list.data.local

import edu.iesam.superhero.feature.list.domain.User

class UserMemLocalDataSource {
    private val localUsers = mutableListOf<User>(
        User("John","Doe","12345678A"),
        User("Jane","Smith","87654321B"),
        User("Bob","Johnson","11223344C")
    )
    fun getAll() = localUsers
}