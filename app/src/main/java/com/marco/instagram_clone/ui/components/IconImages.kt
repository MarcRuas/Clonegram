package com.marco.instagram_clone.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

@Composable
fun IconBut(img: Int, desc: String, modifier: Modifier, onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(id = img),
            contentDescription = desc,
            tint = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
fun IconTog(
    imgIconTogTrue: ImageVector,
    imgIconTogFalse: Int,
    descTog: String,
    modifier: Modifier,
    tint: Color
) {
    var checked by rememberSaveable {
        mutableStateOf(false)
    }

    IconToggleButton(
        checked = checked,
        onCheckedChange = { checked = it },
        modifier = modifier
    )
    {
        if (checked) {
            Icon(imageVector = imgIconTogTrue, contentDescription = descTog, tint = tint)
        } else {
            Icon(painter = painterResource(imgIconTogFalse), contentDescription = descTog)
        }
    }

}
