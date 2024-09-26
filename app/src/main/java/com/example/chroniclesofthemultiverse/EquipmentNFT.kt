package com.example.chroniclesofthemultiverse

data class EquipmentNFT(
    val id: String, // Unique identifier for the equipment
    val name: String, // Name of the equipment
    val type: String, // Type of equipment (e.g., weapon, armor, accessory)
    val statBoost: Map<String, Int>, // Stat boosts provided by the equipment (e.g., {"attack": 10, "defense": 5})
    val imageUrl: String // URL to the equipment's image
)
