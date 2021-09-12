package github.hongbeomi.kmm_premierleague.android.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import github.hongbeomi.kmm_premierleague.data.repository.PremierLeagueRepository
import github.hongbeomi.kmm_premierleague.domain.entity.Player
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: PremierLeagueRepository
): ViewModel() {

    private val _playerList: MutableStateFlow<List<Player>> = MutableStateFlow(emptyList())
    val playerList: StateFlow<List<Player>> = _playerList

    init {
        viewModelScope.launch {
            repository.getPlayers {
                _playerList.value = it
            }
        }
    }

}