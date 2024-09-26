package com.example.chroniclesofthemultiverse

class GovernanceTokenSystem {
    private val tokenBalances = mutableMapOf<String, Double>() // Map of User ID to token balance
    private val proposals = mutableListOf<Proposal>() // List of governance proposals

    data class Proposal(
        val id: String,
        val description: String,
        val votesFor: Double = 0.0,
        val votesAgainst: Double = 0.0
    )

    fun createProposal(id: String, description: String): Proposal {
        val proposal = Proposal(id, description)
        proposals.add(proposal)
        return proposal
    }

    fun vote(proposalId: String, userId: String, amount: Double, support: Boolean): Boolean {
        val proposal = proposals.find { it.id == proposalId }
        return proposal?.let {
            if (tokenBalances.getOrDefault(userId, 0.0) >= amount) {
                if (support) {
                    it.votesFor += amount
                } else {
                    it.votesAgainst += amount
                }
                tokenBalances[userId] = tokenBalances[userId]!! - amount
                true
            } else {
                false
            }
        } ?: false
    }

    fun getProposalResults(proposalId: String): Proposal? {
        return proposals.find { it.id == proposalId }
    }

    fun rewardTokens(userId: String, amount: Double) {
        tokenBalances[userId] = tokenBalances.getOrDefault(userId, 0.0) + amount
    }

    fun getTokenBalance(userId: String): Double {
        return tokenBalances.getOrDefault(userId, 0.0)
    }
}
