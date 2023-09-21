package com.marco.instagram_clone.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marco.instagram_clone.data.model.Feed
import com.marco.instagram_clone.data.model.Story
import com.marco.instagram_clone.data.repository.feedList
import com.marco.instagram_clone.data.repository.storyList
import com.marco.instagram_clone.ui.components.BottomNavigationBar
import com.marco.instagram_clone.ui.components.CloneToolBar
import com.marco.instagram_clone.ui.theme.InstagramCloneTheme
import com.marco.instagram_clone.ui.theme.spacingMedium
import com.marco.instagram_clone.ui.theme.spacingSmall

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            CloneToolBar()
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ){paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ){
            StoryList(stories = storyList)

            Divider(color = MaterialTheme.colorScheme.onSurface, thickness = 0.2.dp)

            FeedList(feeds = feedList)

        }

    }
}

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(
        modifier = Modifier.padding(top = spacingMedium)
    ) {
        itemsIndexed(stories) { _, item ->
            StoryItem(story = item)
        }
    }
}

@Composable
fun FeedList(feeds: List<Feed>) {
    LazyColumn(
        modifier = Modifier.padding(top = spacingSmall)
    ){
         itemsIndexed(feeds){_, item ->
             FeedItem(feed = item)
         }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun DarkHomeScreenPreview() {
    InstagramCloneTheme(darkTheme = true) {
        HomeScreen()
    }

}