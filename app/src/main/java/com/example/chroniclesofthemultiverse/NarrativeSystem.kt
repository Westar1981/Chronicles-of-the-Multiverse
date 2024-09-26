package com.example.chroniclesofthemultiverse

data class StorySegment(
    val id: String, // Unique identifier for the story segment
    val title: String, // Title of the story segment
    val content: String, // Content of the story segment
    val imageUrl: String // URL to the story segment's image
)

class NarrativeSystem {
    private val storySegments = mutableListOf<StorySegment>()

    fun addStorySegment(id: String, title: String, content: String, imageUrl: String): StorySegment {
        val segment = StorySegment(id, title, content, imageUrl)
        storySegments.add(segment)
        return segment
    }

    fun getStorySegmentById(id: String): StorySegment? {
        return storySegments.find { it.id == id }
    }

    fun getAllStorySegments(): List<StorySegment> {
        return storySegments
    }
}
