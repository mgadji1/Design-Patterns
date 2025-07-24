package llms.interfaces

import visitors.interfaces.ArtificialIntelligenceVisitor

interface ArtificialIntelligence {
    val name : String
    fun accept(visitor : ArtificialIntelligenceVisitor)
}