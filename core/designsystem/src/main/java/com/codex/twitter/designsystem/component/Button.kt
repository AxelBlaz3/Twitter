package com.codex.twitter.designsystem.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codex.twitter.designsystem.theme.TwitterTheme

@Composable
fun TwitterFilledButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit)
{
    Button(onClick = onClick) {
        Text(text = text)
    }
}

@Preview(name = "Light")
@Preview(name = "Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun TwitterFilledButtonPreview() {
    TwitterTheme {
        TwitterFilledButton(text = "Button") {

        }
    }
}
