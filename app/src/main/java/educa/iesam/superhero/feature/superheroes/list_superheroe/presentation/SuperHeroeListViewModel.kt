package educa.iesam.superhero.feature.superheroes.list_superheroe.presentation

import androidx.lifecycle.ViewModel
import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.GetSuperHeroUseCase

class SuperHeroeListViewModel(private val getSuperHeroUseCase: GetSuperHeroUseCase) : ViewModel() {
    fun getSuperheroes() = getSuperHeroUseCase.invoke()
}