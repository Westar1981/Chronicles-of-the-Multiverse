package com.example.chroniclesofthemultiverse

data class ExclusiveArea(
    val id: String, // Unique identifier for the exclusive area
    val name: String, // Name of the exclusive area
    val description: String, // Description of the exclusive area
    val requiredNFTId: String // NFT ID required for access
)

class ExclusiveAreaSystem {
    private val areas = mutableListOf<ExclusiveArea>()

    fun createArea(id: String, name: String, description: String, requiredNFTId: String): ExclusiveArea {
        val area = ExclusiveArea(id, name, description, requiredNFTId)
        areas.add(area)
        return area
    }

    fun canAccessArea(areaId: String, userNFTs: List<String>): Boolean {
        val area = areas.find { it.id == areaId }
        return area?.let {
            userNFTs.contains(it.requiredNFTId)
        } ?: false
    }
}
