package com.example.mobile.page1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile.R

@Composable
fun AboutScreen() {
    val profileImage = R.drawable.amandaaa
    val name = "Amanda Puspita Sari"
    val email = "ps.amanda04@gmail.com"
    val university = "Institut Teknologi Batam"
    val major = "Sistem Informasi"

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Gambar Profil
            Card(
                modifier = Modifier
                    .size(250.dp)
                    .padding(10.dp),
                shape = CircleShape,
            ) {
                Image(
                    painter = painterResource(id = profileImage),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.fillMaxSize()
                )

            }

            // Nama Lengkap
            Text(
                text = name,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            // Email
            Text(
                text = email,
                fontSize = 18.sp,
                color = Color.Gray
            )

            // Asal Perguruan Tinggi
            Text(
                text = university,
                fontSize = 18.sp,
                color = Color.Gray
            )

            // Jurusan
            Text(
                text = major,
                fontSize = 18.sp,
                color = Color.Gray
            )
        }
    }
}



