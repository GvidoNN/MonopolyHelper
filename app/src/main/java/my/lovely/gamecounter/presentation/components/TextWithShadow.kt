package my.lovely.gamecounter.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.lovely.gamecounter.R

@Composable
fun TextWithShadow(
    text: String,
    fontSize: Int,
    modifier: Modifier,
    fontFamily: FontFamily = FontFamily(Font(R.font.kabelctt_regular)),
    textAlign: TextAlign = TextAlign.Center
) {
    Box(){
        Text(
            text = text,
            color = Color.Black,
            fontSize = fontSize.sp,
            fontFamily = fontFamily,
            modifier = modifier
                .offset(
                    x = 2.dp,
                    y = 2.dp
                )
                .alpha(0.75f),
            textAlign = textAlign
        )
        Text(
            text = text,
            color = Color.White,
            modifier = modifier,
            fontSize = fontSize.sp,
            fontFamily = fontFamily,
            textAlign = textAlign
        )
    }

}