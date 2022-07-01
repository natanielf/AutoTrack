package com.natanielfarzan.autotrack.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = null
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            )
                        }
                    },
                )
            },
            content = { innerPadding ->
                LazyColumn(contentPadding = innerPadding) {
                    items(count = 100) {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                        )
                    }
                }
            }
        )

    }
}

@Preview
@Composable
fun AutoTrackAppPreview() {
    AutoTrackTheme {
       AutoTrackAppBar()
//       AutoTrackFloatingActionButton()
    }
}

@Composable
fun AutoTrackAppBar() {
    SmallTopAppBar(
        title = { Text("Expenses") },
        navigationIcon = {
            IconButton(onClick = { /* TODO: Open navigation drawer */ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = null
                )
            }
        },
    )
}

@Composable
fun AutoTrackFloatingActionButton() {
    SmallFloatingActionButton(onClick = { /* TODO: Create new expense */ }) {
        Icon(Icons.Filled.Add, contentDescription = "Create expense")
    }
}
