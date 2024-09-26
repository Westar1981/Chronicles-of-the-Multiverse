import json

# Define the structure for CharacterNFT
class CharacterNFT:
    def __init__(self, id, name, health, attack, defense, imageUrl, description):
        self.id = id
        self.name = name
        self.health = health
        self.attack = attack
        self.defense = defense
        self.imageUrl = imageUrl
        self.description = description

# Generate Enchanted Echoes NFTs
def generate_enchanted_echoes_nfts():
    nfts = [
        CharacterNFT("char_1", "The Whispering Woods Sentinel", 100, 20, 30, "url_to_woods_sentinel_image", "A majestic, ancient tree spirit emerges from the heart of an enchanted forest, its bark etched with glowing runes and its branches adorned with shimmering crystals. Its eyes, deep pools of emerald light, hold the wisdom of countless ages.").__dict__,
        CharacterNFT("char_2", "The Celestial Dragonrider", 120, 40, 20, "url_to_dragonrider_image", "A valiant warrior soars through the heavens atop a magnificent dragon, its scales gleaming like polished metal and its breath a swirling vortex of fire and lightning. The rider's armor, forged in the heart of a dying star, reflects the brilliance of the cosmos.").__dict__,
        CharacterNFT("char_3", "The Mystical Spellweaver", 80, 50, 10, "url_to_spellweaver_image", "A graceful sorceress, cloaked in shimmering silks and adorned with intricate jewelry, weaves a tapestry of arcane energy with her delicate hands. The air crackles with magical power as her incantations summon ethereal creatures and bend the fabric of reality.").__dict__,
        CharacterNFT("char_4", "The Fearless Treasure Hunter", 90, 30, 20, "url_to_treasure_hunter_image", "A rugged adventurer, weathered by countless expeditions, emerges from the depths of a forgotten tomb, clutching a priceless artifact. His eyes, alight with triumph, tell tales of daring escapes and battles against ancient guardians.").__dict__,
        CharacterNFT("char_5", "The Ethereal Guardian Spirit", 110, 25, 35, "url_to_guardian_spirit_image", "A translucent, spectral figure hovers protectively over a sacred grove, its form shimmering with celestial light. Its outstretched arms, adorned with flowing ribbons of energy, ward off malevolent forces and preserve the harmony of the natural world.").__dict__
    ]
    return nfts

# Save NFTs to a file
def save_nfts_to_file(nfts, filename):
    with open(filename, 'w') as f:
        json.dump(nfts, f, indent=4)

if __name__ == "__main__":
    nfts = generate_enchanted_echoes_nfts()
    save_nfts_to_file(nfts, "enchanted_echoes_nfts.json")
    print("Enchanted Echoes NFTs generated and saved to enchanted_echoes_nfts.json")
