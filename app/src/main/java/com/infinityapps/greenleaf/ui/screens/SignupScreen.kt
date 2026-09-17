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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinityapps.greenleaf.R
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
            text = stringResource(R.string.create_account)
        )
        Text(
            text = stringResource(R.string.track_spending_together)
        )
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                state = firstNameState,
                label = { Text(stringResource(R.string.first_name)) },
                modifier = Modifier.weight(1f)
            )
            OutlinedTextField(
                state = lastNameState,
                label = { Text(stringResource(R.string.last_name)) },
                modifier = Modifier.weight(1f)
            )
        }
        OutlinedTextField(
            state = emailState,
            label = { Text(stringResource(R.string.email)) }
        )
        OutlinedTextField(
            state = passwordState,
            label = { Text(stringResource(R.string.password)) }
        )
        Text(
            text = stringResource(R.string.at_least_8_characters)
        )
        OutlinedTextField(
            state = confirmPasswordState,
            label = { Text(stringResource(R.string.confirm_password)) }
        )
        Button(
            onClick = {}
        ) {
            Text(stringResource(R.string.create_account))
        }
        Text(
            text = stringResource(R.string.already_have_an_account)
        )
    }

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true)
@Preview(showBackground = true, device = "spec:width=411dp,height=891dp,dpi=420,orientation=landscape")
@Composable
fun SignupScreenPreview() {
    GreenLeafTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            SignupScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}