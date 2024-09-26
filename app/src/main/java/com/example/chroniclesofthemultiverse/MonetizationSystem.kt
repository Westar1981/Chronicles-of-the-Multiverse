package com.example.chroniclesofthemultiverse

data class InAppPurchase(
    val id: String, // Unique identifier for the in-app purchase
    val name: String, // Name of the in-app purchase
    val description: String, // Description of the in-app purchase
    val price: Double // Price of the in-app purchase
)

class MonetizationSystem {
    private val purchases = mutableListOf<InAppPurchase>()

    fun addInAppPurchase(id: String, name: String, description: String, price: Double): InAppPurchase {
        val purchase = InAppPurchase(id, name, description, price)
        purchases.add(purchase)
        return purchase
    }

    fun getInAppPurchaseById(id: String): InAppPurchase? {
        return purchases.find { it.id == id }
    }

    fun getAllInAppPurchases(): List<InAppPurchase> {
        return purchases
    }
}
