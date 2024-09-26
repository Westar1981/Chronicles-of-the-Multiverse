package com.example.chroniclesofthemultiverse

class CrossChainBridge {
    private val nftTransfers = mutableListOf<NFTTransfer>()

    data class NFTTransfer(
        val nftId: String, // Unique identifier for the NFT
        val fromChain: String, // Blockchain from which the NFT is transferred
        val toChain: String, // Blockchain to which the NFT is transferred
        val timestamp: Long // Timestamp of the transfer
    )

    fun transferNFT(nftId: String, fromChain: String, toChain: String): NFTTransfer {
        val transfer = NFTTransfer(nftId, fromChain, toChain, System.currentTimeMillis())
        nftTransfers.add(transfer)
        return transfer
    }

    fun getTransfersByNFT(nftId: String): List<NFTTransfer> {
        return nftTransfers.filter { it.nftId == nftId }
    }

    fun getTransfersByChain(chain: String): List<NFTTransfer> {
        return nftTransfers.filter { it.fromChain == chain || it.toChain == chain }
    }
}
