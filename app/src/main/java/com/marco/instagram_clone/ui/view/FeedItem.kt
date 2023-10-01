package com.marco.instagram_clone.ui.view

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.marco.instagram_clone.R
import com.marco.instagram_clone.data.model.Feed
import com.marco.instagram_clone.ui.components.IconBut
import com.marco.instagram_clone.ui.components.IconTog
import com.marco.instagram_clone.ui.theme.StoryCircleColor
import com.marco.instagram_clone.ui.theme.screenSkeleton
import com.marco.instagram_clone.ui.theme.spacingLarge
import com.marco.instagram_clone.ui.theme.spacingMedium
import com.marco.instagram_clone.ui.theme.spacingSmall
import kotlinx.coroutines.delay

@Composable
fun FeedItem(feed: Feed) {

    //Ícones
    val likeIcon = R.drawable.ic_notification
    val messageIcon = R.drawable.ic_share
    val commentIcon = R.drawable.ic_comment
    val bookmarkIcon = R.drawable.ic_bookmark
    val likedImage = R.drawable.ic_liked
    val book = ImageVector.vectorResource(id = R.drawable.ic_booktrue)
    //Desc
    val userAvatarContent = stringResource(R.string.content_description_feed_avatar)
    val feedImageContentDesc = stringResource(R.string.content_description_feed_image)
    val likeContestDesc = stringResource(R.string.button_like_description)
    val messageContestDesc = stringResource(R.string.button_message_description)
    val commentContestDesc = stringResource(R.string.button_content_description)
    val bookmarkContestDesc = stringResource(R.string.button_bookmark_description)

    //Mensagens de toque
    val context = LocalContext.current
    val duration = Toast.LENGTH_SHORT

    var checkedLike by rememberSaveable {
        mutableStateOf(false)
    }

    var isAnimationVisible by rememberSaveable { mutableStateOf(false) }

    LaunchedEffect(isAnimationVisible) {
        if (isAnimationVisible) {
            delay(2000)
            isAnimationVisible = false
        }
    }

    if (isAnimationVisible) {
        checkedLike = true
    }


    var checkedMessenge by rememberSaveable {
        mutableStateOf(false)
    }

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
                    .clip(CircleShape)
                    .border(2.dp, StoryCircleColor, CircleShape)
                    .clickable {
                        Toast
                            .makeText(context, "Abrindo story...", duration)
                            .show()
                    },
                contentScale = ContentScale.Crop,
                placeholder = screenSkeleton
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {
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

            IconButton(
                onClick = {
                    Toast.makeText(context, "Abrindo Menu...", duration).show()
                },
                modifier = Modifier.size(36.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Menu",
                    modifier = Modifier
                        .wrapContentWidth(Alignment.End),
                    tint = Gray
                )
            }

        }

        Box(
            modifier = Modifier.pointerInput(Unit) {
                detectTapGestures(
                    onDoubleTap = {
                        isAnimationVisible = true
                    }
                )
            }, contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = feed.imageUrl,
                contentDescription = feedImageContentDesc,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = spacingMedium)
                    .height(256.dp),
                contentScale = ContentScale.Crop,
                placeholder = screenSkeleton
            )

            this@Column.AnimatedVisibility(
                visible = isAnimationVisible,
                enter = scaleIn(
                    spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ), exit = scaleOut()
            ) {
                Image(
                    painter = painterResource(id = likedImage),
                    contentDescription = "Animação de curtida",
                    modifier = Modifier.size(100.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(start = spacingMedium, top = spacingLarge)
        ) {

            IconTog(
                imgIconTogTrue = Icons.Filled.Favorite,
                imgIconTogFalse = likeIcon,
                descTog = likeContestDesc,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge),
                tint = Color.Red,
                checked = checkedLike,
                onCheckedChange = { newChanged ->
                    checkedLike = newChanged
                }
            )

            IconBut(
                img = messageIcon,
                desc = messageContestDesc,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
            ) {
                Toast.makeText(context, "Compartilhar!", duration).show()
            }

            IconBut(
                img = commentIcon,
                desc = commentContestDesc,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
            ) {
                Toast.makeText(context, "Comentar!", duration).show()
            }

            IconTog(
                imgIconTogTrue = book,
                imgIconTogFalse = bookmarkIcon,
                descTog = bookmarkContestDesc,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = spacingLarge)
                    .weight(1f)
                    .wrapContentWidth(align = Alignment.End),
                tint = MaterialTheme.colorScheme.onBackground,
                checked = checkedMessenge,
                onCheckedChange = { newChanged ->
                    checkedMessenge = newChanged
                }
            )

        }

        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .padding(top = spacingMedium)
        ) {

            val description = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(feed.userNickname)
                }
                append(" ")
                append(feed.description)
            }

            Text(text = "${feed.contLikes} curtidas")
            Text(
                text = description,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start
            )
            Text(text = "Ver todos os ${feed.comentLikes} comentários", color = Gray)
            Text(text = feed.postedAgo, maxLines = 1, color = Gray, textAlign = TextAlign.Start)

        }
    }
}