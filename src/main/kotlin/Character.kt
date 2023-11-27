sealed class Character(
    val name: Tex,
    val weaponType: WeaponType
) {
    class Warrior(val ability: String) : Character(NAME1, WeaponType.SWORD)
    class Mage(val spell: String) : Character(NAME2, WeaponType.STICK)
    class Archer(val ability: String) : Character(NAME3, WeaponType.BOW)

    companion object {
        const val NAME1 = "Гендальф"
        const val NAME2 = "Каэль"
        const val NAME3 = "Элейн"
    }
}
