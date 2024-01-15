package my.lovely.gamecounter.presentation.screens.balance.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import my.lovely.gamecounter.R
import my.lovely.gamecounter.presentation.components.TextWithShadow
import my.lovely.gamecounter.presentation.theme.lightGreen
import my.lovely.gamecounter.presentation.theme.lightRed


private const val MAX_VALUE = "99999"
private const val MIN_VALUE = "-99999"

@Composable
fun Keyboard(
    text: MutableState<String>,
    onPlus: (Int) -> Unit,
    onMinus: (Int) -> Unit
) {

    Box(
        modifier = Modifier
            .background(color = lightGreen)
            .fillMaxWidth()
            .height(490.dp)
            .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    top = 12.dp,
                    start = 12.dp,
                    end = 12.dp,
                    bottom = 10.dp
                )
                .fillMaxSize(),
        ) {

            Row(modifier = Modifier.height(70.dp)) {
                TextWithShadow(
                    text = text.value,
                    fontSize = 32,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(top = 10.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    modifier = Modifier
                        .width(76.dp)
                        .height(64.dp)
                        .background(
                            color = lightRed,
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
                        tint = Color.White,
                        contentDescription = null
                    )
                }
            }

            Spacer(modifier = Modifier.height(9.dp))

            Row() {
                Box(
                    modifier = Modifier
                        .background(color = lightRed, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                        .width(40.dp)
                        .height(285.dp)
                        .clickable {

                        }
                ) {
                    TextWithShadow(
                        text = "Добавить",
                        fontSize = 30,
                        modifier = Modifier
                            .wrapContentHeight()
                            .width(20.dp)
                            .padding(start = 15.dp, top = 5.dp)
                            .clickable {
                                if(text.value.isNotEmpty()){
                                    onPlus(text.value.toInt())
                                }
                            }
                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Row(horizontalArrangement = Arrangement.Center) {
                        BoxNumber(
                            number = "1",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        BoxNumber(
                            number = "2",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        BoxNumber(
                            number = "3",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )
                    }

                    Spacer(modifier = Modifier.height(9.dp))

                    Row() {

                        BoxNumber(
                            number = "4",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        BoxNumber(
                            number = "5",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        BoxNumber(
                            number = "6",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )
                    }

                    Spacer(modifier = Modifier.height(9.dp))

                    Row() {
                        BoxNumber(
                            number = "7",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        BoxNumber(
                            number = "8",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        BoxNumber(
                            number = "9",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )
                    }

                    Spacer(modifier = Modifier.height(9.dp))

                    Row(){
                        EmptyBoxNumber()

                        Spacer(modifier = Modifier.width(6.dp))

                        BoxNumber(
                            number = "0",
                            text = text,
                            maxValue = MAX_VALUE,
                            minValue = MIN_VALUE
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        EmptyBoxNumber()
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                Box(
                    modifier = Modifier
                        .background(color = lightRed, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                        .width(40.dp)
                        .height(285.dp)
                        .clickable {

                        }
                ) {
                    TextWithShadow(
                        text = " Отнять",
                        fontSize = 30,
                        modifier = Modifier
                            .wrapContentHeight()
                            .width(24.dp)
                            .padding(start = 15.dp)
                            .clickable {
                                if(text.value.isNotEmpty()){
                                    onMinus(text.value.toInt())
                                }
                            }
                    )
                }

            }
        }

        Spacer(modifier = Modifier.width(6.dp))
    }
}



@Composable
private fun BoxNumber(
    number: String,
    maxValue: String,
    minValue: String,
    text: MutableState<String>
) {
    Box(
        modifier = Modifier
            .size(89.dp)
            .background(
                color = lightRed,
                shape = RoundedCornerShape(10.dp)
            )
            .clickable {
                if (text.value.length < 5) {
                    text.value = text.value + number
                }

                if (text.value.toFloat() > maxValue.toFloat()) {
                    text.value = maxValue
                }
            },
        contentAlignment = Alignment.Center
    ) {
        TextWithShadow(
            text = number,
            modifier = Modifier,
            fontSize = 33
        )
    }
}

@Composable
private fun EmptyBoxNumber(
) {
    Box(
        modifier = Modifier
            .size(89.dp)
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(10.dp)
            )
    )
}