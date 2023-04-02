package com.example.composedesignsystem.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedesignsystem.R
import com.example.composedesignsystem.ui.theme.ComposeDesignSystemTheme
import java.util.*

@Composable
fun OutlinedButton(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        border = BorderStroke(1.dp, MaterialTheme.colors.primary),
        shape = RoundedCornerShape(50)
        ) {
        Text(
            text = label,
            color = MaterialTheme.colors.primary
        )
    }
}

@Preview("OutlinedButton - light mode")
@Composable
fun OutlinedButtonLight() {
    ComposeDesignSystemTheme {
        Surface {
            OutlinedButton(label = stringResource(id = R.string.pay), onClick = { })
        }
    }
}

@Preview("OutlinedButton - dark mode")
@Composable
fun OutlinedButtonDark() {
    ComposeDesignSystemTheme(darkTheme = true) {
        Surface {
            OutlinedButton(label = stringResource(id = R.string.pay), onClick = { })
        }
    }
}