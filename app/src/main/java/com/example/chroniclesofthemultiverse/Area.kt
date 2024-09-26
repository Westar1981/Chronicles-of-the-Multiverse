package com.example.chroniclesofthemultiverse

data class Area(
    val id: String, // Unique identifier for the area
    val name: String, // Name of the area
    val description: String, // Description of the area
    val resources: List<String> // List of resources available in the area
)
