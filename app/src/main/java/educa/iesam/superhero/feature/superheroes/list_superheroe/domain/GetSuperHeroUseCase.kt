package educa.iesam.superhero.feature.superheroes.list_superheroe.domain

class GetSuperHeroUseCase(val getSuperHeroRepository: SuperHeroRepository){
    operator fun invoke(): List<Superheroe>{
        return getSuperHeroRepository.obtainSuperHero()
    }
}