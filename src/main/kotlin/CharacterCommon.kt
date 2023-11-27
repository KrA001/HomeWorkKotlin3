object CharacterCommon {
    fun attack(character: Character) {
        when (character) {
            is Character.Archer -> {
                println("${character.name} ${character.ability} применив способность ${character.weaponType.weapon}")
            }

            is Character.Mage -> {
                println("${character.name} ${character.spell} применил заклинаие ${character.weaponType.weapon}")
            }

            is Character.Warrior -> {
                println("${character.name} ${character.ability} применив способность ${character.weaponType.weapon}")
            }
        }
    }

    fun defend(character: Character) {
        when (character) {
            is Character.Archer -> {
                println("${character.name} ${character.ability} использовав способность Ловкость")
            }

            is Character.Mage -> {
                println("${character.name} ${character.spell} заклинание Темный купол")
            }

            is Character.Warrior -> {
                println("${character.name} ${character.ability} применив способность Отражающий света клинка")
            }
        }
    }
}