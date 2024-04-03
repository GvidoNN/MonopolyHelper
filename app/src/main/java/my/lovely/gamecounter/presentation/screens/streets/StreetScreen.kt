package my.lovely.gamecounter.presentation.screens.streets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import my.lovely.gamecounter.data.storage.PropertyStorage
import my.lovely.gamecounter.presentation.screens.streets.components.BasicStreetCard

@Composable
fun StreetScreen() {

    Box {
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(
                start = 12.dp,
                top = 16.dp,
                end = 12.dp,
                bottom = 16.dp
            ),
            content = {
                items(PropertyStorage.streetsList.size) { index ->
                    val data = PropertyStorage.streetsList.get(index)
                    BasicStreetCard(
                        streetName = data.streetName,
                        streetColor = data.streetColor,
                        rent = data.rent,
                        costWithOneHouse = data.costWithOneHouse,
                        costWithTwoHouse = data. costWithTwoHouse,
                        costWithThreeHouse = data.costWithThreeHouse,
                        costWithFourHouse = data.costWithFourHouse,
                        costWithHotel = data.costWithHotel,
                        costHotel = data.costHotel,
                        costHouse = data.costHouse,
                        mortgageValue = data.mortgageValue,
                        isLast = index == PropertyStorage.streetsList.size - 1
                    )
                }
            }
        )
    }
}