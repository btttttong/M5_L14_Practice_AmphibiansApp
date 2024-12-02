package com.supakavadeer.amphibians.data

import com.supakavadeer.amphibians.model.Amphibian

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}