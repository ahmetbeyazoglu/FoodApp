package com.herpestes.foodapp

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource

@Composable
fun DetaySayfa() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Köfte") },
                backgroundColor = colorResource(id = R.color.anaRenk),
                contentColor = colorResource(id = R.color.white)
            )
        },
        content = {

        }
    )


}
