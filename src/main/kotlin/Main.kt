fun main(args: Array<String>) {
    val scanner = Scan(System.`in`)
    println("Выберите действие для персонажа: 1 - атака, 0 - защита")
    println("------------------------")
    print("Пишите здесь:")
//    val mage = Character.Mage("")
//    val warrior = Character.Warrior("")
//    val archer = Character.Archer("")

    val action = scanner.nextInt()
    when (action) {
        0 -> {
            val warrior = Character.Warrior("смог защититься")
            val mage = Character.Mage("защититься используя")
            val archer = Character.Archer("смогла защититься")
            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }
        1 -> {
        val warrior = Character.Warrior("замахнулся Мечем")
        val mage = Character.Mage("используя - Посох")
            val archer = Character.Archer("выстрелила из Лука")
            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)
            val hill = object {
                val name = "Фрея"
                fun hill() {
                    println("$name Вылечила всю команду")
                }
            }
            hill.hill()
        }
    }
}