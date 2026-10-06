package edu.iesam.superhero.feature.list.data

import edu.iesam.superhero.feature.list.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.list.domain.User
import edu.iesam.superhero.feature.list.domain.UserRepository

class MockUserDataRepository(private val localDataSource: UserMemLocalDataSource) : UserRepository {
    override fun obtainUsers(): List<User> {
        return localDataSource.getAll()
    }
}