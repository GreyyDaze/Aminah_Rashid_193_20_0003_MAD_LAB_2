package com.example.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task2() {
    var name by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }

    Row(
        modifier = Modifier.padding(
            10.dp
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            modifier = Modifier.clip(RoundedCornerShape(5.dp)),
            contentDescription = "pic"
        )
        Column(modifier = Modifier.padding(start = 5.dp)) {
            TextField(value = name,
                onValueChange = {
                    name = it
                },
                modifier = Modifier.padding(bottom = 4.dp),
                label = { Text(text = "Name") },
                placeholder = { Text(text = "Enter your name") })
            TextField(
                value = phone,
                onValueChange = {
                    phone = it
                },
                label = { Text(text = "Phone Number") },
                placeholder = { Text(text = "Enter your phone number") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
    }
}