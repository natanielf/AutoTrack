package com.natanielfarzan.autotrack.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.natanielfarzan.autotrack.ui.theme.AutoTrackTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutoTrackApp() {
    AutoTrackTheme {
        Scaffold(
            topBar = {
                SmallTopAppBar(
                    title = { Text("Expenses") },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Filled.Menu,
                                contentDescription = null)
                        }
                    },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Filled.Favorite,
                                contentDescription = null)
                        }
                    },
                )
            },
            content = {
            }
        )

    }
}