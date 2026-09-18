package com.infinityapps.greenleaf.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinityapps.greenleaf.R
import com.infinityapps.greenleaf.ui.theme.GreenLeafTheme

@Composable
fun SignupScreen(
    modifier: Modifier = Modifier
) {

    val firstNameState = rememberTextFieldState()
    val lastNameState = rememberTextFieldState()
    val emailState = rememberTextFieldState()
    val passwordState = rememberTextFieldState()
    val confirmPasswordState = rememberTextFieldState()

    Column(
        modifier = modifier.fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp)
    ) {
        Text(
            text = stringResource(R.string.create_account),
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.track_spending_together),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth().paddingFromBaseline(top = 32.dp, bottom = 24.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                state = firstNameState,
                label = { Text(stringResource(R.string.first_name)) },
                modifier = Modifier.weight(1f),
            )
            OutlinedTextField(
                state = lastNameState,
                label = { Text(stringResource(R.string.last_name)) },
                modifier = Modifier.weight(1f)
            )
        }
        OutlinedTextField(
            state = emailState,
            label = { Text(stringResource(R.string.email)) },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        )
        OutlinedTextField(
            state = passwordState,
            label = { Text(stringResource(R.string.password)) },
            placeholder = { Text(stringResource(R.string.at_least_8_characters))},
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        )
        OutlinedTextField(
            state = confirmPasswordState,
            label = { Text(stringResource(R.string.confirm_password)) },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        )
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(
                stringResource(R.string.create_account),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
        TextButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
            Text(
                text = stringResource(R.string.already_have_an_account),
                textAlign = TextAlign.Center
            )
        }

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