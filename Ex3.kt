package TP4

interface Animaux {
    val nom: String
    fun parler()

    // méthode avec implémentation par défaut
    fun seDéplacer() {
        println("$nom se déplace.")
    }
}

interface Volant {
    fun voler()
}

class Oiseau(override val nom: String) : Animaux, Volant {
    override fun parler() {
        println("L'oiseau chante.")
    }

    override fun seDéplacer() {
        println("$nom saute et marche.")
    }

    override fun voler() {
        println("$nom vole dans le ciel.")
    }
}

class Chien(override val nom: String) : Animaux {
    override fun parler() {
        println("Le chien aboie.")
    }

    override fun seDéplacer() {
        println("$nom court.")
    }
}

class Poisson(override val nom: String) : Animaux {
    override fun parler() {
        println("Le poisson ne fait pas de bruit.")
    }

    override fun seDéplacer() {
        println("$nom nage.")
    }
}

fun main() {
    val oiseau = Oiseau("Tweety")
    val chien = Chien("Rex")
    val poisson = Poisson("Nemo")

    oiseau.parler()
    oiseau.seDéplacer()
    oiseau.voler()

    chien.parler()
    chien.seDéplacer()

    poisson.parler()
    poisson.seDéplacer()
}