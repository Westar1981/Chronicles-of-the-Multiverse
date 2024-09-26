package com.example.chroniclesofthemultiverse

data class PlayerContent(
    val id: String, // Unique identifier for the content
    val title: String, // Title of the content
    val description: String, // Description of the content
    val creatorId: String, // User ID of the content creator
    val contentUrl: String // URL to the content
)

class PlayerContentSystem {
    private val contents = mutableListOf<PlayerContent>()

    fun createContent(id: String, title: String, description: String, creatorId: String, contentUrl: String): PlayerContent {
        val content = PlayerContent(id, title, description, creatorId, contentUrl)
        contents.add(content)
        return content
    }

    fun getContentById(id: String): PlayerContent? {
        return contents.find { it.id == id }
    }

    fun getContentsByCreator(creatorId: String): List<PlayerContent> {
        return contents.filter { it.creatorId == creatorId }
    }

    fun getAllContents(): List<PlayerContent> {
        return contents
    }
}
