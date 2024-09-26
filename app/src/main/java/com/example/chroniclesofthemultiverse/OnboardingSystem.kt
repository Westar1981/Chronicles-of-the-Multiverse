package com.example.chroniclesofthemultiverse

data class TutorialStep(
    val id: String, // Unique identifier for the tutorial step
    val title: String, // Title of the tutorial step
    val description: String, // Description of the tutorial step
    val imageUrl: String // URL to the tutorial step's image
)

class OnboardingSystem {
    private val tutorialSteps = mutableListOf<TutorialStep>()

    fun addTutorialStep(id: String, title: String, description: String, imageUrl: String): TutorialStep {
        val step = TutorialStep(id, title, description, imageUrl)
        tutorialSteps.add(step)
        return step
    }

    fun getTutorialStepById(id: String): TutorialStep? {
        return tutorialSteps.find { it.id == id }
    }

    fun getAllTutorialSteps(): List<TutorialStep> {
        return tutorialSteps
    }
}
