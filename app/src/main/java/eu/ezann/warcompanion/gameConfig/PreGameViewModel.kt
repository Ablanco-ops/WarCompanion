package eu.ezann.warcompanion.gameConfig

import androidx.lifecycle.ViewModel

class PreGameViewModel:ViewModel() {

    val factionList = listOf("Heretic Astartes", "Thousand Sons", "Deathguard", "Chaos Knights", "Chaos Daemons",
        "Adeptus Astartes", "Blood Angels", "Dark Angels", "Space Wolves", "Greyknights", "Deathwatch",
        "Astra Militarum", "Adeptus Mechanicus", "Talons of the Emperor", "Imperial Knights",
        "Orks", "Tau", "Asuryani", "Drukhari", "Ynnari", "Necrons", "Tyranids", "Genestealer Cult")
}