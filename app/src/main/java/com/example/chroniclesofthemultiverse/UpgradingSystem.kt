package com.example.chroniclesofthemultiverse

class UpgradingSystem {
    fun upgradeCharacter(character: CharacterNFT, equipment: EquipmentNFT): CharacterNFT { // Upgrade character stats using equipment
        // Apply stat boosts from equipment to character
        val upgradedStats = character.copy(
            attack = character.attack + (equipment.statBoost["attack"] ?: 0),
            defense = character.defense + (equipment.statBoost["defense"] ?: 0)
        )
        // Add equipment to character's equipment list
        val updatedEquipment = character.equipment.toMutableList().apply { add(equipment) }
        return upgradedStats.copy(equipment = updatedEquipment)
    }
}
