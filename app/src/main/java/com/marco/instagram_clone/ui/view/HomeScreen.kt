package com.marco.instagram_clone.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marco.instagram_clone.data.Story
import com.marco.instagram_clone.ui.theme.spacingMedium

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        CloneToolBar()

        val list: MutableList<Story> = mutableListOf(
            Story(
                userNickName = "Daryl",
                userAvatar = "https://i.pinimg.com/236x/e7/16/84/e71684c11b2bf7ae5ddfa7c75c736d09.jpg"
            ),

            Story(
                userNickName = "rickgrimes",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            ),

            Story(
                userNickName = "rickgrimes",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            ),

            Story(
                userNickName = "rickgrimes",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            ),

            Story(
                userNickName = "rickgrimes",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            ),

            Story(
                userNickName = "rickgrimes",
                userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
            )
        )
        
        StoryList(stories = list)
    }
}

@Composable
fun StoryList(stories:List<Story>) {
    LazyRow(
        modifier = Modifier.padding(top = spacingMedium)
    ){
        itemsIndexed(stories){_,item ->
            StoryItem(story = item)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}