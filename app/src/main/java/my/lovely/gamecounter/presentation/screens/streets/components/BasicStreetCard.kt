package my.lovely.gamecounter.presentation.screens.streets.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.lovely.gamecounter.R


@Composable
fun BasicStreetCard(
    streetName: String,
    streetColor: Color,
    rent: Int,
    costWithOneHouse: Int,
    costWithTwoHouse: Int,
    costWithThreeHouse: Int,
    costWithFourHouse: Int,
    costWithHotel: Int,
    mortgageValue: Int,
    costHotel: Int,
    costHouse: Int,
    isLast: Boolean
) {
    if (isLast) {
        Log.d("MyLogLast","it is")

        Column(modifier = Modifier
            .width(132.dp)
            .height(190.dp)
            .background(color = Color.Red)
        ) {

            Text(text = "asdfasdf")
        }

    } else {
        Column(
            modifier = Modifier
                .width(132.dp)
                .height(190.dp)
                .padding(5.dp)
                .border(width = 1.dp, color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(7.dp))

            Column(
                modifier = Modifier
                    .background(color = streetColor)
                    .width(110.dp)
                    .height(40.dp)
                    .border(width = 1.dp, color = Color.Black),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = streetName,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_bold))
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(id = R.string.rent, rent),
                fontSize = 6.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.kabelctt_bold))
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.with_one_house),
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )

                Text(
                    text = "$costWithOneHouse M",
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.with_two_house),
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )

                Text(
                    text = "$costWithTwoHouse M",
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.with_three_house),
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )

                Text(
                    text = "$costWithThreeHouse M",
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.with_four_house),
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )

                Text(
                    text = "$costWithFourHouse M",
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.with_one_hotel),
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )

                Text(
                    text = "$costWithHotel M",
                    fontSize = 6.sp,
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.kabelctt_regular))
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(id = R.string.mortgage_value, mortgageValue),
                fontSize = 7.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.kabelctt_bold))
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(id = R.string.house_cost, costHouse),
                fontSize = 6.sp
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(id = R.string.hotel_cost, costHotel),
                fontSize = 6.sp,
                modifier = Modifier.height(20.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}