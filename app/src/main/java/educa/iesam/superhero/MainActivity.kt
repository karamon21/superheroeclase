package educa.iesam.superhero

import android.os.Bundle
import android.util.Log
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import educa.iesam.superhero.feature.list.data.UserDataRepository
import edu.iesam.superhero.feature.list.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.list.domain.GetUsersUseCase
import educa.iesam.superhero.feature.list.presentation.ListViewModel
import educa.iesam.superhero.feature.superheroes.list_superheroe.data.SuperHeroDataRepository
import educa.iesam.superhero.feature.superheroes.list_superheroe.data.local.SuperHeroMemLocalDataSource
import educa.iesam.superhero.feature.superheroes.list_superheroe.domain.GetSuperHeroUseCase
import educa.iesam.superhero.feature.superheroes.list_superheroe.presentation.SuperHeroeListViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

       /* val listViewModel = ListViewModel(GetUsersUseCase((UserDataRepository(UserMemLocalDataSource()))))
        Log.d(TAG,"onCreate: ${listViewModel.getUsers()}")


       val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = listViewModel.getUsers().first().name*/
        val superHeroeListViewModel = SuperHeroeListViewModel(GetSuperHeroUseCase(
            SuperHeroDataRepository(SuperHeroMemLocalDataSource())))

        Log.d(TAG,"onCreate: ${superHeroeListViewModel.getSuperheroes()}")
    }
    companion object{
        val TAG = MainActivity::class.java.simpleName
    }
}