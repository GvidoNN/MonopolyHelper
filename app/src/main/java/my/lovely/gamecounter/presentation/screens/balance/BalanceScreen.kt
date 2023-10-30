package my.lovely.gamecounter.presentation.screens.balance

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

        }
        Text(text = "BalanceScreen", color = Color.Black, fontSize = 25.sp)
    }
}

