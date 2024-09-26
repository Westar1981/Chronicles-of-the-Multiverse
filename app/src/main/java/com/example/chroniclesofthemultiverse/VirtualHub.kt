package com.example.chroniclesofthemultiverse

data class VirtualHub(
    val id: String, // Unique identifier for the hub
    val name: String, // Name of the hub
    val description: String, // Description of the hub
    val users: MutableList<String> // List of user IDs in the hub
)

class VirtualHubSystem {
    private val hubs = mutableListOf<VirtualHub>()

    fun createHub(id: String, name: String, description: String): VirtualHub {
        val hub = VirtualHub(id, name, description, mutableListOf())
        hubs.add(hub)
        return hub
    }

    fun joinHub(hubId: String, userId: String): Boolean {
        val hub = hubs.find { it.id == hubId }
        return hub?.let {
            if (!it.users.contains(userId)) {
                it.users.add(userId)
                true
            } else {
                false
            }
        } ?: false
    }

    fun leaveHub(hubId: String, userId: String): Boolean {
        val hub = hubs.find { it.id == hubId }
        return hub?.let {
            it.users.remove(userId)
        } ?: false
    }

    fun getHubUsers(hubId: String): List<String>? {
        return hubs.find { it.id == hubId }?.users
    }
}
