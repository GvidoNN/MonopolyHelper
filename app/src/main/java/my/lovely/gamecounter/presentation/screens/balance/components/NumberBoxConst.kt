package my.lovely.gamecounter.presentation.screens.balance.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.lovely.gamecounter.R

@Composable
fun NumberBoxConst(
    onClick: () -> Unit,
    text: String
){
    Box(
        modifier = Modifier
            .width(75.dp)
            .height(40.dp)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = text,
            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.montserrat_700))
        )

    }
}
