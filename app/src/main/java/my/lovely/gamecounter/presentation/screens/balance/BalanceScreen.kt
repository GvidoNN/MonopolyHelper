package my.lovely.gamecounter.presentation.screens.balance

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import my.lovely.gamecounter.R
import my.lovely.gamecounter.domain.screens.balance.BalanceViewIntents
import my.lovely.gamecounter.presentation.components.TextWithShadow
import my.lovely.gamecounter.presentation.screens.balance.components.Keyboard
import my.lovely.gamecounter.presentation.screens.balance.components.NumberBoxConst
import my.lovely.gamecounter.presentation.theme.lightGreen
import my.lovely.gamecounter.presentation.theme.lightRed

@SuppressLint("UnrememberedMutableState")
@Composable
fun BalanceScreen(
    balanceViewModel: BalanceViewModel,
) {
    val balanceViewState by balanceViewModel.viewState.collectAsState()

    LaunchedEffect(true) {
        delay(2000)
        Log.d("MyLog", "${balanceViewState.currentMoney}")
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = lightGreen)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .width(300.dp)
                        .background(color = lightRed)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    TextWithShadow(
                        text = balanceViewState.currentMoney.toString(),
                        fontSize = 40,
                        modifier = Modifier,
                        fontFamily = FontFamily(Font(R.font.kabelctt_bold))
                    )
                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = lightGreen)
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 500))
                    },
                    text = "+500"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 500))
                    },
                    text = "-500"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 100))
                    },
                    text = "+100"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 100))
                    },
                    text = "-100"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 50))
                    },
                    text = "+50"
                )

                Spacer(modifier = Modifier.width(5.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 50))
                    },
                    text = "-50"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 20))
                    },
                    text = "+20"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 20))
                    },
                    text = "-20"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 10))
                    },
                    text = "+10"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 10))
                    },
                    text = "-10"
                )

                Spacer(modifier = Modifier.width(5.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 5))
                    },
                    text = "+5"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 5))
                    },
                    text = "-5"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = 1))
                    },
                    text = "+1"
                )

                Spacer(modifier = Modifier.width(5.dp))

                NumberBoxConst(
                    onClick = {
                        balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = 1))
                    },
                    text = "-1"
                )
            }

            Keyboard(
                text = mutableStateOf(""),
                onMinus = {
                    balanceViewModel.obtain(BalanceViewIntents.MinusInBalance(money = it))
                },
                onPlus = {
                    balanceViewModel.obtain(BalanceViewIntents.PlusInBalance(money = it))
                }
            )
        }
    }
}


