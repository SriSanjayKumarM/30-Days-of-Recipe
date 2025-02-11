package com.example.a30daysofrecipes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30daysofrecipes.MainApp
import com.example.a30daysofrecipes.R
import com.example.a30daysofrecipes.model.Recipes


@Composable
fun DishList(recipes: List<Recipes>, contentPadding: PaddingValues){
    LazyColumn(contentPadding = contentPadding) {
        items(recipes) { recipe ->
            DishItem(recipe)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DishTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name), // App name
                style = MaterialTheme.typography.titleLarge // DisplayLarge style
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color(0xFFFFA726) // Change this to any color
        )
    )
}

@Composable
fun DishItem(recipes: Recipes) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_small)),
        elevation = CardDefaults.cardElevation(defaultElevation = dimensionResource(R.dimen.padding_Xsmall))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small)),
            horizontalAlignment = Alignment.CenterHorizontally // Centers all child elements horizontally
        ) {
            // First Text (Dish Number) - Centered
            Text(
                text = stringResource(recipes.id),
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center // Ensures text is centered
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Second Text (Dish Name) - Left-aligned
            Text(
                text = stringResource(recipes.title),
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold, // Bold
                    fontSize = 18.sp // Slightly bigger
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = dimensionResource(R.dimen.padding_Xsmall)),
                textAlign = TextAlign.Start // Ensures left alignment
            )
            Spacer(modifier = Modifier.height(12.dp))

            // Image - Centered, Bigger, and Clipped
            Image(
                painter = painterResource(recipes.dishImage),
                contentDescription = stringResource(recipes.title),
                modifier = Modifier
                    .size(dimensionResource(R.dimen.image_large)) // Make it bigger
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.image_clip_radius))) // Clip corners
                    .fillMaxWidth(), // Make sure it expands horizontally
                contentScale = ContentScale.Crop // Crop to fit the allocated size
            )
            Spacer(modifier = Modifier.height(12.dp))

            // Description - Centered
            Text(
                text = stringResource(recipes.desc),
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = dimensionResource(R.dimen.padding_Xsmall)),
                textAlign = TextAlign.Center // Centers the description
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


@Preview()
@Composable
fun GreetingDarkThemePreview(darkTheme: Boolean = true) {
    _30DaysOfRecipesTheme {
        MainApp()
    }
}