package edu.iesam.superhero.feature.list.domain

class GetUsersUseCase(private val userRepository: UserRepository) {

    operator fun invoke(): List<User>{
        return userRepository.obtainUsers()
    }
}