package com.marco.instagram_clone.ui.components

import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.marco.instagram_clone.R
import com.marco.instagram_clone.ui.theme.Black
import com.marco.instagram_clone.ui.theme.screenSkeleton

@Composable
fun BottomNavigationBar() {

    val context = LocalContext.current
    val duration = Toast.LENGTH_SHORT

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        IconBut(img = R.drawable.ic_home, desc = "", modifier = Modifier.size(22.dp)) {
            Toast
                .makeText(context, "item 1", duration)
                .show()
        }
        IconBut(img = R.drawable.ic_search, desc = "", modifier = Modifier.size(22.dp)) {
            Toast
                .makeText(context, "item 2", duration)
                .show()
        }
        IconBut(img = R.drawable.ic_add, desc = "", modifier = Modifier.size(22.dp)) {
            Toast
                .makeText(context, "item 5", duration)
                .show()
        }
        IconBut(img = R.drawable.ic_ig, desc = "", modifier = Modifier.size(22.dp)) {
            Toast
                .makeText(context, "item 4", duration)
                .show()
        }
        AsyncImage(
            model = "https://projectzomboid.com/blog/content/uploads/2022/10/mapspiffoblog-centred-trans.png",
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .fillMaxSize()
                .clip(CircleShape)
                .border(2.dp, Black, CircleShape)
                .clickable {
                    Toast
                        .makeText(context, "Abrindo perfil...", duration)
                        .show()
                },
            contentScale = ContentScale.Crop,
            placeholder = screenSkeleton
        )
    }
}