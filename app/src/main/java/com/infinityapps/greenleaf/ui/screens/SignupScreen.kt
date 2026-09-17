package com.infinityapps.greenleaf.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import com.infinityapps.greenleaf.ui.theme.GreenLeafTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {

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