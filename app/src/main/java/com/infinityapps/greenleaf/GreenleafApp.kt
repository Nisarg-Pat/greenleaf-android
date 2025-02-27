package com.infinityapps.greenleaf

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infinityapps.greenleaf.ui.theme.GreenLeafTheme

@Composable
fun GreenleafApp(
    modifier: Modifier = Modifier
) {
    GreenLeafTheme {
        Scaffold(modifier = modifier) { innerPadding ->
            Text(
                text = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreenleafAppPreview() {
    GreenleafApp()
}