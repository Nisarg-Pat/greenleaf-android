package com.infinityapps.greenleaf.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinityapps.greenleaf.ui.theme.GreenLeafTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {

    val firstNameState = rememberTextFieldState()
    val lastNameState = rememberTextFieldState()
    val emailState = rememberTextFieldState()
    val passwordState = rememberTextFieldState()
    val confirmPasswordState = rememberTextFieldState()

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Create account"
        )
        Text(
            text = "Track spending together"
        )
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                state = firstNameState,
                label = { Text("First Name") },
                modifier = Modifier.weight(1f)
            )
            OutlinedTextField(
                state = lastNameState,
                label = { Text("Last Name") },
                modifier = Modifier.weight(1f)
            )
        }
        OutlinedTextField(
            state = emailState,
            label = { Text("Email") }
        )
        OutlinedTextField(
            state = passwordState,
            label = { Text("Password") }
        )
        Text(
            text = "At least 8 characters"
        )
        OutlinedTextField(
            state = confirmPasswordState,
            label = { Text("Confirm Password") }
        )
        Button(
            onClick = {}
        ) {
            Text("Create Account")
        }
        Text(
            text = "Already have an account?"
        )
    }

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true)
@Composable
fun SignupScreenPreview() {
    GreenLeafTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            SignupScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}