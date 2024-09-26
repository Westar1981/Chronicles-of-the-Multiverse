package com.example.chroniclesofthemultiverse

class ExplorationSystem {
    private val areas = mutableListOf<Area>() // List of areas in the exploration system

    fun addArea(area: Area) {
        areas.add(area)
    }

    fun explore(areaId: String): String {
        val area = areas.find { it.id == areaId }
        return area?.let {
            "Exploring ${it.name}: ${it.description}. Resources found: ${it.resources.joinToString(", ")}"
        } ?: "Area not found"
    }
}
