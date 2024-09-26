package com.example.chroniclesofthemultiverse

data class NFTAvatar(
    val id: String, // Unique identifier for the avatar
    val name: String, // Name of the avatar
    val imageUrl: String, // URL to the avatar's image
    val ownerId: String // User ID of the owner
)

class NFTAvatarSystem {
    private val avatars = mutableListOf<NFTAvatar>()

    fun createAvatar(id: String, name: String, imageUrl: String, ownerId: String): NFTAvatar {
        val avatar = NFTAvatar(id, name, imageUrl, ownerId)
        avatars.add(avatar)
        return avatar
    }

    fun getAvatarById(id: String): NFTAvatar? {
        return avatars.find { it.id == id }
    }

    fun getAvatarsByOwner(ownerId: String): List<NFTAvatar> {
        return avatars.filter { it.ownerId == ownerId }
    }
}
