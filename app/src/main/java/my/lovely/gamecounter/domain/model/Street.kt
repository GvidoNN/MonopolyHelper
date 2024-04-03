package my.lovely.gamecounter.domain.model

import androidx.compose.ui.graphics.Color

data class Street(
    val streetName: String,
    val streetColor: Color,
    val rent: Int,
    val costWithOneHouse: Int,
    val costWithTwoHouse: Int,
    val costWithThreeHouse: Int,
    val costWithFourHouse: Int,
    val costWithHotel: Int,
    val costHotel: Int,
    val costHouse: Int,
    val mortgageValue: Int
)