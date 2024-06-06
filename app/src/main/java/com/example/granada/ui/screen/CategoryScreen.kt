package com.example.granada.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.granada.model.GranadaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController, viewModel: GranadaViewModel, modifier: Modifier = Modifier) {
    val categories = viewModel.places.map { it.category }.distinct()

    Column(modifier = modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Granada", fontSize = 24.sp, fontWeight = FontWeight.Bold) }
        )
        Divider(thickness = 1.dp, color = androidx.compose.ui.graphics.Color.Gray)
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(categories) { category ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate("placeListScreen/$category") }
                        .padding(vertical = 16.dp)
                ) {
                    Text(
                        text = category,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
                Divider(thickness = 1.dp, color = androidx.compose.ui.graphics.Color.Gray)
            }
        }
    }
}
