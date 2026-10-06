package educa.iesam.superhero.feature.list.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.list.domain.GetUsersUseCase

class ListViewModel (private val getUsersUseCase: GetUsersUseCase) : ViewModel() {

    fun  getUsers() = getUsersUseCase.invoke()

}