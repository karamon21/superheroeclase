package educa.iesam.superhero.feature.superheroes.list_superheroe.domain

interface SuperHeroRepository {
    fun obtainSuperHero(): List<Superheroe>
}