package com.example.chroniclesofthemultiverse

data class CrossChainEvent(
    val id: String, // Unique identifier for the event
    val name: String, // Name of the event
    val description: String, // Description of the event
    val participatingChains: List<String>, // List of blockchains participating in the event
    val rewards: Map<String, Double> // Chain to reward mapping
)

class CrossChainEventSystem {
    private val events = mutableListOf<CrossChainEvent>()

    fun createEvent(id: String, name: String, description: String, participatingChains: List<String>, rewards: Map<String, Double>): CrossChainEvent {
        val event = CrossChainEvent(id, name, description, participatingChains, rewards)
        events.add(event)
        return event
    }

    fun getEventById(id: String): CrossChainEvent? {
        return events.find { it.id == id }
    }

    fun getAllEvents(): List<CrossChainEvent> {
        return events
    }

    fun getEventsByChain(chain: String): List<CrossChainEvent> {
        return events.filter { it.participatingChains.contains(chain) }
    }
}
