package com.marco.instagram_clone.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marco.instagram_clone.R
import com.marco.instagram_clone.ui.theme.spacingLarge
import com.marco.instagram_clone.ui.theme.spacingMedium

@Composable
fun CloneToolBar() {

    val instagramLabel = stringResource(id = R.string.titulo)

    val imgNotification = R.drawable.ic_notification
    val imgDM = R.drawable.messenger
    val imgNotificationDesc = stringResource(R.string.content_description_notification_icon)
    val imgDMDesc = stringResource(R.string.content_description_message_icon)

    val context = LocalContext.current
    val duration = Toast.LENGTH_SHORT

    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = spacingLarge)
                .height(56.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = instagramLabel,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.headlineLarge
            )

            IconBut(
                img = imgNotification,
                desc = imgNotificationDesc,
                modifier = Modifier
                    .size(32.dp)
                    .padding(end = spacingMedium),
                onClick = {
                    Toast.makeText(context, "Notificação!", duration).show()
                }
            )

            IconBut(
                img = imgDM,
                desc = imgDMDesc,
                modifier = Modifier
                    .size(32.dp)
                    .padding(start = spacingMedium),
                onClick = {
                    Toast.makeText(context, "DM!", duration).show()
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CloneToolBarPreview() {
    CloneToolBar()
}