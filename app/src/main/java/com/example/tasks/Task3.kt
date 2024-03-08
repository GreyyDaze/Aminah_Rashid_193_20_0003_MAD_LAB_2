package com.example.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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


data class CharacterData(val imageId: Int, val characterName: String, val characterAge: String)


@Composable
fun Task3() {
    val characters = listOf(
        CharacterData(R.drawable.ironman, "Iron Man", "43"),
        CharacterData(R.drawable.hulk, "Hulk", "38"),
        CharacterData(R.drawable.deadpool, "Deadpool", "25"),
        CharacterData(R.drawable.wolverine, "Wolverine", "48"),
        CharacterData(R.drawable.blackwidow, "Black Widow", "30"),
        CharacterData(R.drawable.thor, "Thor", "35")
    )


    Column(verticalArrangement = Arrangement.Center) {
        for (character in characters) {
            Card(
                elevation = CardDefaults.cardElevation(5.dp),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(modifier = Modifier.padding(15.dp)) {
                    Image(
                        painter = painterResource(id = character.imageId),
                        contentDescription = "Character Image",
                        modifier = Modifier
                            .width(70.dp)
                            .height(70.dp)
                    )
                    Column(
                        modifier = Modifier.padding(start = 15.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = character.characterName,
                            fontWeight = FontWeight.Black,
                            fontSize = 25.sp
                        )
                        Text(
                            text = "Age: ${character.characterAge}",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                    }
                }


            }
        }


    }
}