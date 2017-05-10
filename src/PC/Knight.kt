package PC

import Gear.IGearStats

object Knight: PlayableCharacter() {

	override var name: String = ""
		get() = field
		set(value) {
			field = value
		}
	
	//setted the default stats
	override var atk: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override fun createCharacter(n: String, weapon: IGearStats) {
		println("Knight created")
		name = n
		weaponBonus(weapon)
		showStats()
	}

}