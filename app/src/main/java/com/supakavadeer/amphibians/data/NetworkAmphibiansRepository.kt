package com.supakavadeer.amphibians.data

import com.supakavadeer.amphibians.model.Amphibian
import com.supakavadeer.amphibians.network.AmphibiansApiService

class NetworkAmphibiansRepository
    (private val amphibiansApiService: AmphibiansApiService) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
