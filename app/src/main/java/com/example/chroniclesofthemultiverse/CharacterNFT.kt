package com.example.chroniclesofthemultiverse

data class CharacterNFT(
    val id: String, // Unique identifier for the character
    val name: String, // Name of the character
    var health: Int, // Health points of the character
    val attack: Int, // Attack points of the character
    val defense: Int, // Defense points of the character
    val imageUrl: String, // URL to the character's image
    val equipment: List<EquipmentNFT> // List of equipment NFTs
)
