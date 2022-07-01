package com.natanielfarzan.autotrack.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.natanielfarzan.autotrack.ui.theme.AutoTrackTheme

@Composable
fun AutoTrackApp() {
    AutoTrackTheme {
        AutoTrackAppPreview()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AutoTrackAppPreview() {
    Scaffold(
        topBar = { AutoTrackAppBar() },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { AutoTrackFloatingActionButton() },
        content = { innerPadding ->
            LazyColumn(contentPadding = innerPadding) {
                items(count = 100) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(10.dp)
                    ) {
                        Text(text = "Item $it")
                    }
                }
            }
        },
        bottomBar = { AutoTrackNavigationBar() }
    )
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
    FloatingActionButton(onClick = { /* TODO: Create new expense */ }) {
        Icon(Icons.Filled.Add, contentDescription = "Create expense")
    }
}

@Composable
fun AutoTrackNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar(modifier) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Expenses") },
            selected = true,
            onClick = { /*TODO*/ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Info, contentDescription = null) },
            label = { Text("Data") },
            selected = false,
            onClick = { /*TODO*/ }
        )
    }
}
