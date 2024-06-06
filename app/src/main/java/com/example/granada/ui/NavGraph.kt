package com.example.granada.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.granada.ui.screens.CategoryScreen
import com.example.granada.ui.screens.PlaceDetailScreen
import com.example.granada.ui.screens.PlaceListScreen
import com.example.granada.model.GranadaViewModel

@Composable
fun GranadaNavHost(navController: NavHostController, viewModel: GranadaViewModel, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "categoryScreen") {
        composable("categoryScreen") {
            CategoryScreen(navController = navController, viewModel = viewModel)
        }
        composable("placeListScreen/{category}") { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: return@composable
            PlaceListScreen(navController = navController, viewModel = viewModel, category = category)
        }
        composable("placeDetailScreen/{placeId}") { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId")?.toIntOrNull() ?: return@composable
            PlaceDetailScreen(navController = navController, placeId = placeId, viewModel = viewModel)
        }

    }
}
