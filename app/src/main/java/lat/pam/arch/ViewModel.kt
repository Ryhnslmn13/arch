package lat.pam.arch

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var num = 0
    fun addNum() {
        num++
    }
}