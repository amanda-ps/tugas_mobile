package com.example.mobile.page1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mobile.R

@Composable
fun List1Screen(title: Any) {
    val imageResIds = listOf(
        R.drawable.avatar,
        R.drawable.bolehkah,
        R.drawable.deadpool,
        R.drawable.dreadout,
        R.drawable.drstrange,
        R.drawable.endgame,
        R.drawable.guardian,
        R.drawable.insideout2,
        R.drawable.it,
        R.drawable.lalaland
    )

    val titles = listOf(
        "Avatar: The Way of Water", "Bolehkah Sekali Saja Kumenangis", "Deadpool & Wolverine", "Doctor Strange in The Multiverse of Madness", "DreadOut", "Avengers Endgame",
        "Guardians of the Galaxy Vol 3", "Inside Out 2", "IT", "La La Land"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            items(imageResIds) { resId ->
                Image(
                    painter = painterResource(id = resId),
                    contentDescription = "Gambar di LazyRow",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(150.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))



        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
        ) {
            items(imageResIds.zip(titles)) { (resId, title) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = resId),
                        contentDescription = title,
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(150.dp)
                    )
                    Text(
                        text = title,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
