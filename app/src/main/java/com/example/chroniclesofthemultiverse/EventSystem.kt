package com.example.chroniclesofthemultiverse

data class Event(
    val id: String, // Unique identifier for the event
    val name: String, // Name of the event
    val description: String, // Description of the event
    val startTime: Long, // Start time of the event
    val endTime: Long, // End time of the event
    val participants: MutableList<String> = mutableListOf() // List of user IDs participating in the event
)

class EventSystem {
    private val events = mutableListOf<Event>()

    fun createEvent(id: String, name: String, description: String, startTime: Long, endTime: Long): Event {
        val event = Event(id, name, description, startTime, endTime)
        events.add(event)
        return event
    }

    fun joinEvent(eventId: String, userId: String): Boolean {
        val event = events.find { it.id == eventId }
        return event?.let {
            if (!it.participants.contains(userId)) {
                it.participants.add(userId)
                true
            } else {
                false
            }
        } ?: false
    }

    fun leaveEvent(eventId: String, userId: String): Boolean {
        val event = events.find { it.id == eventId }
        return event?.let {
            it.participants.remove(userId)
        } ?: false
    }

    fun getEventParticipants(eventId: String): List<String>? {
        return events.find { it.id == eventId }?.participants
    }

    fun getAllEvents(): List<Event> {
        return events
    }
}
