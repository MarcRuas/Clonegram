package com.marco.instagram_clone.ui.components

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marco.instagram_clone.R

@Composable
fun BottomNavigationBar() {

    val bottomNavigationIcon = R.drawable.messenger
    val iconContentDesc = "Adicione uma descrição de conteúdo aqui."

    val context = LocalContext.current
    val duration = Toast.LENGTH_SHORT

    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        Row(
            modifier = Modifier.height(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationIcon(icon = bottomNavigationIcon, contentDesc = iconContentDesc) {
                Toast.makeText(context, "Você clicou no item 1!", duration).show()
            }

            NavigationIcon(icon = bottomNavigationIcon, contentDesc = iconContentDesc) {
                Toast.makeText(context, "Você clicou no item 2!", duration).show()
            }

            NavigationIcon(icon = bottomNavigationIcon, contentDesc = iconContentDesc) {
                Toast.makeText(context, "Você clicou no item 3!", duration).show()
            }

            NavigationIcon(icon = bottomNavigationIcon, contentDesc = iconContentDesc) {
                Toast.makeText(context, "Você clicou no item 4!", duration).show()
            }

            NavigationIcon(icon = bottomNavigationIcon, contentDesc = iconContentDesc) {
                Toast.makeText(context, "Você clicou no item 5!", duration).show()
            }
        }
    }
}

@Composable
fun RowScope.NavigationIcon(@DrawableRes icon: Int, contentDesc: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .weight(1f)
            .wrapContentWidth(align = Alignment.CenterHorizontally)
    ) {
        Image(
            painter = painterResource(id = icon),
            modifier = Modifier
                .size(32.dp)
                .clickable { onClick() },
            contentDescription = contentDesc
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar()
}