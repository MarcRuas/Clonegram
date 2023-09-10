package com.marco.instagram_clone.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marco.instagram_clone.data.Story

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        CloneToolBar()

        StoryItem(
            story = Story(
                "rickgrimes",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}