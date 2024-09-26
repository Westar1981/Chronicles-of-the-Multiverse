package com.example.chroniclesofthemultiverse

import com.example.chroniclesofthemultiverse.TokenRewardSystem

class Marketplace(private val tokenRewardSystem: TokenRewardSystem) {
    private val listedNFTs = mutableMapOf<String, Double>() // Map of NFT ID to price

    fun listNFT(nftId: String, price: Double): Boolean {
        return if (!listedNFTs.containsKey(nftId)) {
            listedNFTs[nftId] = price
            true
        } else {
            false
        }
    }

    fun buyNFT(nftId: String): Double? {
        val price = listedNFTs.remove(nftId)
        price?.let {
            tokenRewardSystem.rewardTokens("buyer_user_id", it) // Reward tokens to the buyer
        }
        return price
    }

    fun getListedNFTs(): Map<String, Double> {
        return listedNFTs
    }
}
