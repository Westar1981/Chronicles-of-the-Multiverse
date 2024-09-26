package com.example.chroniclesofthemultiverse

class TokenRewardSystem {
    private val tokenBalances = mutableMapOf<String, Double>() // Map of User ID to token balance

    fun rewardTokens(userId: String, amount: Double) {
        tokenBalances[userId] = tokenBalances.getOrDefault(userId, 0.0) + amount
    }

    fun getTokenBalance(userId: String): Double {
        return tokenBalances.getOrDefault(userId, 0.0)
    }
}
