package com.herpestes.foodapp

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetaySayfa(yemek: Yemekler) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Köfte") },
            backgroundColor = colorResource(id = R.color.anaRenk),
            contentColor = colorResource(id = R.color.white)
        )
    }, content = {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val activity = (LocalContext.current as Activity)

            Image(
                bitmap = ImageBitmap.imageResource(
                    id = activity.resources.getIdentifier(
                        yemek.yemek_resim_ai, "drawable", activity.packageName
                    )
                ), contentDescription = "", modifier = Modifier.size(100.dp)
            )
            Text(
                text = "${yemek.yemek_fiyat} ₺", color = Color.Blue, fontSize = 50.sp
            )
        }
        Button(
            onClick = {
                Log.e("Yemek", "${yemek.yemek_adi} sipariş verildi")
            },
                modifier = Modifier.size(250.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(id = R.color.anaRenk),
                contentColor = colorResource(id = R.color.white)
            )
        ) {
            Text(text = "Sipariş ver")
        }
    }
    )
}
