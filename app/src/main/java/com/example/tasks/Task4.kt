package com.example.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class CharacterInfo(val imageId: Int, val characterName: String)


@Composable
fun Task4() {
    val characters = listOf(
        CharacterInfo(R.drawable.ironman, "Iron Man"),
        CharacterInfo(R.drawable.hulk, "Hulk"),
        CharacterInfo(R.drawable.deadpool, "Deadpool"),
        CharacterInfo(R.drawable.wolverine, "Wolverine"),
        CharacterInfo(R.drawable.blackwidow, "Black Widow"),
        CharacterInfo(R.drawable.thor, "Thor")
    )
    LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(top = 10.dp)) {
        for (character in characters) {
            item() {
                Card(
                    elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = character.imageId),
                        contentDescription = "Character Image",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Blue),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = character.characterName,
                            fontWeight = FontWeight.Black,
                            fontSize = 22.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 15.dp, top = 10.dp, bottom = 10.dp)

                        )
                    }
                }
            }

        }
    }
}