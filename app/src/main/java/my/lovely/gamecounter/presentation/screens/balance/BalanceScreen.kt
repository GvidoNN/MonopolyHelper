package my.lovely.gamecounter.presentation.screens.balance

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun BalanceScreen(
    balanceViewModel: BalanceViewModel
) {
    Box(modifier = Modifier.fillMaxWidth()){

        Column() {
            Box(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .height(100.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "1500", color = Color.Black, fontSize = 25.sp)
            }
            
            Spacer(modifier = Modifier.height(100.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ){
                NumberBox(
                    onClick = {

                    },
                    text = "+500"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-500"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "+100"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-100"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "+50"
                )

                Spacer(modifier = Modifier.width(5.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ){
                NumberBox(
                    onClick = {

                    },
                    text = "-50"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "+20"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-20"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "+10"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-10"
                )

                Spacer(modifier = Modifier.width(5.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ){
                NumberBox(
                    onClick = {

                    },
                    text = "+5"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-5"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "+1"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBox(
                    onClick = {},
                    text = "-1"
                )
            }


        }


    }
}

@Composable
fun NumberBox(
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

