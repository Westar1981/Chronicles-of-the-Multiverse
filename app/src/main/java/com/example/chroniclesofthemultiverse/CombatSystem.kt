package com.example.chroniclesofthemultiverse

import com.example.chroniclesofthemultiverse.CharacterNFT

data class Character(
    val nft: CharacterNFT // NFT representing the character
)

class CombatSystem {
    fun attack(attacker: Character, defender: Character) {
        val damage = attacker.attack - defender.defense
        if (damage > 0) {
            defender.health -= damage
        }
    }

    fun isDefeated(character: Character): Boolean {
        return character.health <= 0
    }
}
