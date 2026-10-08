package educa.iesam.superhero.feature.superheroes.list_superheroe.data.local

import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.Superheroe

class SuperHeroMemLocalDataSource {
    val superHeroMemLocalDataSource = mutableListOf<Superheroe>(
        Superheroe("1","A-Bomb","1-a-bomb","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg"),
        Superheroe("2","B-Bomb","2-a-bomb","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg"),
        Superheroe("3","C-Bomb","3-a-bomb","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg")
    )
    fun getAllSuperHeroe() = superHeroMemLocalDataSource
}