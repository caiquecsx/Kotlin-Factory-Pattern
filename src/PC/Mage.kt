package PC

import Gear.IGearStats

object Mage : PlayableCharacter() {

	override var name: String = ""
		get() = field
		set(value) {
			field = value
		}
	
	//setted the default stats
	override var atk: Int = 25
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 5
		get() = field
		set(value) {
			field = value
		}
	
	override fun createCharacter(n: String, weapon: IGearStats) {
		println("Mage created")
		name = n
		weaponBonus(weapon)
		showStats()
	}

}