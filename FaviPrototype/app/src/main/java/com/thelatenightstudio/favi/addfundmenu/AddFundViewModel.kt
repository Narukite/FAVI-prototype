package com.thelatenightstudio.favi.addfundmenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.thelatenightstudio.favi.core.data.source.remote.network.ApiResponse
import com.thelatenightstudio.favi.core.domain.model.User
import com.thelatenightstudio.favi.core.domain.usecase.FaviUseCase

class AddFundViewModel(private val faviUseCase: FaviUseCase) : ViewModel() {

    suspend fun increaseBalanceOfCurrentUser(requestAmount: Double): LiveData<ApiResponse<Boolean>> =
        faviUseCase.increaseBalanceOfCurrentUser(requestAmount).asLiveData()

    suspend fun getRealtimeUpdatesOfCurrentUser(): LiveData<ApiResponse<User>> =
        faviUseCase.getRealtimeUpdatesOfCurrentUser().asLiveData()

    suspend fun uploadFile(filePath: String): LiveData<ApiResponse<Boolean>> =
        faviUseCase.uploadFile(filePath).asLiveData()

}