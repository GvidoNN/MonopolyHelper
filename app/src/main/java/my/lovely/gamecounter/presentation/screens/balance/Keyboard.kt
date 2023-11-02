package my.lovely.gamecounter.presentation.screens.balance

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.lovely.gamecounter.R

@Composable
fun Keyboard(
    keyboardVisible: MutableState<Boolean>,
    text: MutableState<String>,
    maxValue: MutableState<String>,
    minValue: MutableState<String> = mutableStateOf("0")
) {

    val annotatedString = buildAnnotatedString {

        append("Минимальное значение")

        withStyle(
            style = SpanStyle(color = Color.Black)
        ) {
            append("1")
        }

        append("Максимальное значение")

        withStyle(
            style = SpanStyle(color = Color.Black)
        ) {
            append("9999")
        }
    }

    AnimatedVisibility(
        visible = keyboardVisible.value,
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it })
    ) {
        Box(
            modifier = Modifier
                .background(color = Color(0xff150E0C))
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
        ) {

            Column(
                modifier = Modifier.padding(
                    top = 12.dp,
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 10.dp
                )
            ) {
                Text(
                    text = annotatedString,
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.montserrat_400))
                )

                Spacer(modifier = Modifier.height(9.dp))

                Row() {
                    boxNumber(
                        number = "1",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "2",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "3",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "4",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )
                }

                Row(){

                    boxNumber(
                        number = "5",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "6",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "7",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "8",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )
                }

                Row(){

                    boxNumber(
                        number = "9",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "0",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "+",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    boxNumber(
                        number = "-",
                        text = text,
                        maxValue = maxValue,
                        minValue = minValue
                    )

                }

                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(
                            color = MaterialTheme.colors.background_0xff29201E,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable {
                            if(text.value.length < 4 && text.value.isNotEmpty() && langPack(lang).dot !in text.value){
                                text.value = text.value + langPack(lang).dot
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = langPack(lang).dot,
                        color = MaterialTheme.colors.text_0xffA0918B,
                        fontSize = 32.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_400))
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .width(76.dp)
                        .height(64.dp)
                        .background(
                            color = MaterialTheme.colors.background_0xff2E1E12,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable {
                            if (text.value.length == 1) {
                                text.value = ""
                            } else {
                                text.value = text.value.dropLast(1)
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.backspace_icon),
                        tint = MaterialTheme.colors.tint_0xffA0918B,
                        contentDescription = null
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .width(134.dp)
                        .height(64.dp)
                        .background(
                            brush = Brush.linearGradient(
                                listOf(
                                    MaterialTheme.colors.gradient_0xffA33D27,
                                    MaterialTheme.colors.gradient_0xffEA690D
                                )
                            ),
                            shape = RoundedCornerShape(10.dp),
                        )
                        .clickable {
                            keyboardVisible.value = false
                            if(text.value.isEmpty() || text.value.toFloat() < minValue.value.toFloat()){
                                text.value = minValue.value
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = langPack(lang).enter,
                        color = MaterialTheme.colors.text_0xffD9C8BF,
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.montserrat_500))
                    )
                }
            }
        }
    }

}

@Composable
fun boxNumber(
    number: String,
    maxValue: MutableState<String>,
    minValue: MutableState<String>,
    text: MutableState<String>
){
    Box(
        modifier = Modifier
            .size(64.dp)
            .background(
                color = MaterialTheme.colors.background_0xff29201E,
                shape = RoundedCornerShape(10.dp)
            )
            .clickable {
                if(text.value.length < 4){
                    text.value = text.value + number
                }

                if(text.value.toFloat() > maxValue.value.toFloat()){
                    text.value = maxValue.value
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = number,
            color = MaterialTheme.colors.text_0xffA0918B,
            fontSize = 32.sp,
            fontFamily = FontFamily(Font(R.font.montserrat_400))
        )
    }
}