package PC

import Gear.IGearStats

public abstract class PlayableCharacter {
	abstract var name: String
	abstract var atk: Int
	abstract var def: Int
	
	abstract fun createCharacter(n: String, weapon: IGearStats)

	fun showStats(){
		println("\n$name stats: \nATK: $atk \nDEF: $def")
	}
	
	fun weaponBonus(weapon: IGearStats){
		weapon.getWeapon()
		atk += weapon.atk
		def += weapon.def
	}
}