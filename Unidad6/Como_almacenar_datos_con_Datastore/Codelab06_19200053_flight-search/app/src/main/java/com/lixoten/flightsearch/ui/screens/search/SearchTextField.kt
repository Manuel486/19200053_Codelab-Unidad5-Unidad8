package com.lixoten.flightsearch.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchTextField(
    query: String,
    onQueryChange: (String) -> Unit
) {
    val density = LocalDensity.current.density
    val keyboardController = LocalSoftwareKeyboardController.current
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .padding(top = 16.dp, start = 15.dp, end = 15.dp)
            .fillMaxWidth()
            .height(56.dp)
            //.background(MaterialTheme.colors.secondary)
            .border(1.dp, MaterialTheme.colors.primary, CircleShape),
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(
            onClick = {
                // Acción cuando se hace clic en la lupa
            },

            //modifier = Modifier.padding(end = 16.dp)
        ) {
            Icon(Icons.Default.Search, contentDescription = "Search")
        }

        Surface(
            color = Color.Transparent
        ) {
            TextField(
                value = query,
                onValueChange = { onQueryChange(it) },
                placeholder = { Text(text = "Search here") },
                singleLine = true,
                maxLines = 1,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        keyboardController?.hide()
                    }
                ),
                colors = TextFieldDefaults.textFieldColors(
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )
        }

        IconButton(
            onClick = {
                // Acción cuando se hace clic en el micrófono
            },
            modifier = Modifier.padding(end = 16.dp)
        ) {
            Icon(Icons.Default.Settings, contentDescription = "Microphone")
        }
    }
}