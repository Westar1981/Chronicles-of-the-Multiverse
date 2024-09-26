package com.example.chroniclesofthemultiverse

class StakingSystem {
    private val stakedNFTs = mutableMapOf<String, Long>() // Map of NFT ID to staking timestamp

    fun stakeNFT(nftId: String): Boolean {
        return if (!stakedNFTs.containsKey(nftId)) {
            stakedNFTs[nftId] = System.currentTimeMillis()
            true
        } else {
            false
        }
    }

    fun unstakeNFT(nftId: String): Long? {
        return stakedNFTs.remove(nftId)
    }

    fun getStakedDuration(nftId: String): Long? {
        return stakedNFTs[nftId]?.let { System.currentTimeMillis() - it }
    }

    fun calculateRewards(nftId: String, rewardRate: Double): Double? {
        return getStakedDuration(nftId)?.let { duration ->
            (duration / (1000 * 60 * 60 * 24)) * rewardRate // Reward based on days staked
        }
    }
}
