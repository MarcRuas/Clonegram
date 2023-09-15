package com.marco.instagram_clone.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.marco.instagram_clone.R
import com.marco.instagram_clone.data.model.Feed
import com.marco.instagram_clone.ui.theme.screenSkeleton
import com.marco.instagram_clone.ui.theme.spacingLarge
import com.marco.instagram_clone.ui.theme.spacingMedium
import com.marco.instagram_clone.ui.theme.spacingSmall

@Composable
fun FeedItem(feed: Feed) {
    val userAvatarContent = stringResource(R.string.content_description_feed_avatar)
    val feedImageContentDesc = stringResource(R.string.content_description_feed_image)

    Column(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = spacingSmall)
                .padding(top = spacingLarge)
        ) {

            AsyncImage(
                model = feed.userAvatar,
                contentDescription = userAvatarContent,
                modifier = Modifier
                    .size(36.dp)
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                placeholder = screenSkeleton
            )

            Column {
                Text(
                    text = feed.userNickname,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = feed.localName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = spacingMedium),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )
            }
        }

        AsyncImage(
            model = feed.imageUrl,
            contentDescription = feedImageContentDesc,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = spacingLarge)
                .height(256.dp),
            contentScale = ContentScale.Crop,
            placeholder = screenSkeleton
        )
    }
}