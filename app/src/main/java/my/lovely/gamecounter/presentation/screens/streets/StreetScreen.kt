package my.lovely.gamecounter.presentation.screens.streets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.lovely.gamecounter.presentation.screens.streets.components.BasicStreetCard

@Composable
fun StreetScreen() {

    val list = listOf<String>("1","2","3","4","5","6","7","8","9","10")

    Box {

        BasicStreetCard(
            streetName = "УЛ. ЩУСЕВА",
            streetColor = Color.Green,
            rent = 26,
            costWithOneHouse = 150,
            costWithTwoHouse = 300,
            costWithThreeHouse = 450,
            costWithFourHouse = 900,
            costWithHotel = 1200,
            costHotel = 200,
            costHouse = 200,
            mortgageValue = 150
        )

        /*LazyVerticalGrid(
            columns = GridCells.Adaptive(128.dp),
            contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ),
            content = {
                items(list.size) { index ->
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .background(Color.Gray)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = list[index],
                            fontWeight = FontWeight.W400,
                            fontSize = 30.sp,
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        )*/
    }
}