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
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} использовав способность Ловкость")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} заклинание Темный купол")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применив способность Отражающий света клинка")
                }
            }
        }
    }
}