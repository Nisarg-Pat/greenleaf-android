package com.infinityapps.greenleaf.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SignupScreen(
    onSignupClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(text = "Signup Screen")
    Button(
        onClick = onSignupClick
    ) {
        Text("Signup")
    }
}