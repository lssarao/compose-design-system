package com.example.composedesignsystem.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedesignsystem.R
import com.example.composedesignsystem.ui.theme.ComposeDesignSystemTheme

@Composable
fun FilledButton(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
    ) {
        Text(
            text = label,
            color = Color.White
        )
    }
}

@Preview("FilledButton - light mode")
@Composable
fun PreviewFilledButtonLight() {
    ComposeDesignSystemTheme {
        Surface {
            FilledButton(label = stringResource(id = R.string.pay), onClick = { })
        }
    }
}

@Preview("FilledButton - dark mode")
@Composable
fun PreviewFilledButtonDark() {
    ComposeDesignSystemTheme(darkTheme = true) {
        Surface {
            FilledButton(label = stringResource(id = R.string.pay), onClick = { })
        }
    }
}