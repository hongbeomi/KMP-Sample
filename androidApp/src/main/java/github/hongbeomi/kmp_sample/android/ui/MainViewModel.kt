package github.hongbeomi.kmp_sample.android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import github.hongbeomi.kmp_sample.data.repository.KMMRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: KMMRepository
): ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    init {
        viewModelScope.launch {
            _text.value = repository.getText()
        }
    }

}