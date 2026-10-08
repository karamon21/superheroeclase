package educa.iesam.superhero

import android.os.Bundle
import android.util.Log
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import educa.iesam.superhero.feature.superheroes.list_superheroe.data.SuperHeroDataRepository
import educa.iesam.superhero.feature.superheroes.list_superheroe.data.local.SuperHeroMemLocalDataSource
import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.GetSuperHeroUseCase
import educa.iesam.superhero.feature.superheroes.list_superheroe.presentation.SuperHeroeListViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val superHeroeListViewModel = SuperHeroeListViewModel(GetSuperHeroUseCase(
            SuperHeroDataRepository(SuperHeroMemLocalDataSource())))
        val superheroes = superHeroeListViewModel.getSuperheroes()
        //Primer superheroe
        val inputName1 = findViewById<TextView>(R.id.input_name1)
        val inputSurname1 = findViewById<TextView>(R.id.input_surname1)
        //Mediante el indice o la posición [0] accedemos el nombre y el slug del primer superheroe
        inputName1.text = superheroes[0].name
        inputSurname1.text = superheroes[0].slug
       //Segundo superheroe
        val inputName2 = findViewById<TextView>(R.id.input_name2)
        val inputSurname2 = findViewById<TextView>(R.id.input_surname2)
        //Mediante el indice o la posición [1] accedemos el nombre y el slug del primer superheroe
        inputName2.text = superheroes[1].name
        inputSurname2.text = superheroes[1].slug
        //Tercer superheroe
        val inputName3 = findViewById<TextView>(R.id.input_name3)
        val inputSurname3 = findViewById<TextView>(R.id.input_surname3)

        inputName3.text = superheroes[2].name
        inputSurname3.text = superheroes[2].slug
     //Teste con Log.d
     Log.d(TAG,"onCreate: ${superHeroeListViewModel.getSuperheroes()}")
    }
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
}