package educa.iesam.superhero.feature.superheroes.list_superheroe.data.local

import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.Superheroe

class SuperHeroMemLocalDataSource {
    val superHeroMemLocalDataSource = mutableListOf<Superheroe>(
        Superheroe("1","A-Bomb","1-a-bomb","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg")
    )
    fun getAllSuperHeroe() = superHeroMemLocalDataSource
}