package com.example.composedesignsystem.ui.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedesignsystem.R
import com.example.composedesignsystem.ui.theme.ComposeDesignSystemTheme

@Composable
fun PasswordTextField(
    label: String = stringResource(id = R.string.password),
    passwordText: String,
    onPasswordChange: (String) -> Unit,
    imeAction: ImeAction = ImeAction.Next,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    OutlinedTextField(
        value = passwordText,
        onValueChange = { onPasswordChange(it) },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ).copy(imeAction = imeAction),
        keyboardActions = keyboardActions,
        visualTransformation = PasswordVisualTransformation(),
        maxLines = 1
    )
}

@Preview("PasswordTextField - light mode")
@Composable
fun PreviewPasswordTextFieldLight() {
    ComposeDesignSystemTheme {
        Surface {
            val (passwordText, setPasswordText) = remember { mutableStateOf("") }
            PasswordTextField(
                label = stringResource(id = R.string.password),
                passwordText = passwordText,
                onPasswordChange = setPasswordText
            )
        }
    }
}

@Preview("PasswordTextField - dark mode")
@Composable
fun PreviewPasswordTextFieldDark() {
    ComposeDesignSystemTheme(darkTheme = true) {
        Surface {
            val (passwordText, setPasswordText) = remember { mutableStateOf("") }
            PasswordTextField(
                label = stringResource(id = R.string.password),
                passwordText = passwordText,
                onPasswordChange = setPasswordText
            )
        }
    }
}