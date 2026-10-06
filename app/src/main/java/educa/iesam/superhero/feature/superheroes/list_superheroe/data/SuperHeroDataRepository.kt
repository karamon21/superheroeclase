package educa.iesam.superhero.feature.superheroes.list_superheroe.data

import educa.iesam.superhero.feature.superheroes.list_superheroe.data.local.SuperHeroMemLocalDataSource
import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.SuperHeroRepository
import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.Superheroe

class SuperHeroDataRepository(private val dataSource: SuperHeroMemLocalDataSource) : SuperHeroRepository {
    override fun obtainSuperHero(): List<Superheroe> {
        return dataSource.getAllSuperHeroe()
    }

}