import json
from random import randint, choice

# Define the structure for CharacterNFT and EquipmentNFT
class EquipmentNFT:
    def __init__(self, id, name, type, statBoost, imageUrl):
        self.id = id
        self.name = name
        self.type = type
        self.statBoost = statBoost
        self.imageUrl = imageUrl

class CharacterNFT:
    def __init__(self, id, name, health, attack, defense, imageUrl, equipment):
        self.id = id
        self.name = name
        self.health = health
        self.attack = attack
        self.defense = defense
        self.imageUrl = imageUrl
        self.equipment = equipment

# Generate initial NFTs
def generate_initial_nfts():
    nfts = []
    for i in range(1, 21):
        equipment = [
            EquipmentNFT(f"eq_{i}_1", "Sword", "weapon", {"attack": randint(5, 15)}, "url_to_sword_image").__dict__,
            EquipmentNFT(f"eq_{i}_2", "Shield", "armor", {"defense": randint(5, 15)}, "url_to_shield_image").__dict__
        ]
        character = CharacterNFT(
            f"char_{i}",
            f"Character {i}",
            randint(50, 100),
            randint(10, 20),
            randint(5, 15),
            "url_to_character_image",
            equipment
        ).__dict__
        nfts.append(character)
    return nfts

# Save NFTs to a file
def save_nfts_to_file(nfts, filename):
    with open(filename, 'w') as f:
        json.dump(nfts, f, indent=4)

if __name__ == "__main__":
    nfts = generate_initial_nfts()
    save_nfts_to_file(nfts, "initial_nfts.json")
    print("Initial NFTs generated and saved to initial_nfts.json")
