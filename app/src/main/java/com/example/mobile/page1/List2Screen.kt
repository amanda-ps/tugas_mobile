package com.example.mobile.page1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile.R

@Composable
fun List2Screen() {
    val movies = listOf(
        Movie(R.drawable.avatar, "Avatar: The Way of Water"),
    Movie(R.drawable.bolehkah, "Bolehkah Sekali Saja Kumenangis"),
    Movie(R.drawable.deadpool, "Deadpool & Wolvarine"),
    Movie(R.drawable.drstrange, "Doctor Strange in The Multiverse of Madness"),
    Movie(R.drawable.dreadout, "DreadOut"),
    Movie(R.drawable.endgame, "Avengers Endgame"),
    Movie(R.drawable.guardian, "Guardians of the Galaxy Vol 3"),
    Movie(R.drawable.insideout2, "Inside Out 2"),
    Movie(R.drawable.it, "IT"),
    Movie(R.drawable.lalaland, "La La Land")
    )


    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies) { movie ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = movie.imageResId),
                    contentDescription = "Gambar ${movie.title}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = movie.title,
                    fontSize = 14.sp,
                    color = Color.Black
                )
            }
        }
    }
}


