package com.example.a30daysofrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofrecipes.model.RecipesRepository
import com.example.a30daysofrecipes.ui.theme.DishList
import com.example.a30daysofrecipes.ui.theme.DishTopAppBar
import com.example.a30daysofrecipes.ui.theme._30DaysOfRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfRecipesTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            DishTopAppBar()
        }
    ) { innerPadding ->

        DishList(
            RecipesRepository.dishes,
            contentPadding = innerPadding
        )
    }
}

@Preview()
@Composable
fun GreetingPreview(darkTheme: Boolean = false) {
    _30DaysOfRecipesTheme {
        MainApp()
    }
}

@Preview()
@Composable
fun GreetingDarkThemePreview(darkTheme: Boolean = true) {
    _30DaysOfRecipesTheme {
        MainApp()
    }
}