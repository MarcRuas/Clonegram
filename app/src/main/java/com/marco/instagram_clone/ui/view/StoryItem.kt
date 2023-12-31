package com.marco.instagram_clone.ui.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.marco.instagram_clone.R
import com.marco.instagram_clone.data.model.Story
import com.marco.instagram_clone.ui.theme.StoryCircleColor
import com.marco.instagram_clone.ui.theme.screenSkeleton
import com.marco.instagram_clone.ui.theme.spacingSmall

@Composable
fun StoryItem(story: Story) {

    val avatarContentDesc =
        stringResource(id = R.string.content_description_story, story.userNickName)

    val context = LocalContext.current
    val duration = Toast.LENGTH_SHORT

    Column(
        modifier = Modifier
            .padding(spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ) {

        AsyncImage(
            model = story.userAvatar,
            contentDescription = avatarContentDesc,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .clip(CircleShape)
                .border(2.dp, StoryCircleColor, CircleShape)
                .clickable {
                           Toast.makeText(context, "Abrindo story...", duration).show()
                },
            contentScale = ContentScale.Crop,
            placeholder = screenSkeleton
        )

        Text(
            text = story.userNickName,
            modifier = Modifier.size(width = 72.dp, height = 24.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}