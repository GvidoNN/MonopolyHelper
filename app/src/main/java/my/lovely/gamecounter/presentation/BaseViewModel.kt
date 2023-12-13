package my.lovely.gamecounter.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.updateAndGet

abstract class BaseViewModel<VS : ViewState>(
    initViewState: VS
) : ViewModel() {

    val reducerScope: CoroutineScope by lazy {
        CoroutineScope(SupervisorJob() + Dispatchers.Default)
    }

    private val _viewState = MutableStateFlow<VS>(initViewState)

    val viewState: MutableStateFlow<VS>
        get() = _viewState

    protected suspend fun updateState(reducer: VS.() -> VS) =
        onUpdateState(_viewState.updateAndGet(reducer))

    protected open suspend fun onUpdateState(newState: VS) {}


}

interface ViewState
