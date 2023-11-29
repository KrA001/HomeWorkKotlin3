object CharacterCommon {
    fun attack(character: Character) {
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} применив способность ${weaponType.weapon}")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинаие ${weaponType.weapon}")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применив способность ${weaponType.weapon}")
                }
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