package PC

import java.util.Random
import Gear.IGearStats

object Gladiator : PlayableCharacter() {

	override var name: String = ""
		get() = field
		set(value) {
			field = value
		}
	
	//setted the default stats
	override var atk: Int = 20
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 10
		get() = field
		set(value) {
			field = value
		}
	
	override fun createCharacter(n: String, weapon: IGearStats) {
		println("Gladiator created")
		name = n
		weaponBonus(weapon)
		showStats()
	}
	

}