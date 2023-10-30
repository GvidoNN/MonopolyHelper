package my.lovely.gamecounter.presentation.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp



@Composable
fun MainScreen(){
    Box(modifier = Modifier.fillMaxSize()) {

        val list = listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")

        LazyColumn() {
            items(list.size) {
                Text(fontSize = 50.sp, text = list[it], color = Color.Black)
            }
        }

    }

}