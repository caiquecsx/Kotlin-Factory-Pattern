package Gear

object Axe : IGearStats {
	
	override var atk: Int = 20
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 5
		get() = field
		set(value) {
			field = value
		}
	
	override fun getWeapon() {
		println("You have an Axe !")
	}
}