package Gear

object Sword : IGearStats {
	
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
	
	override fun getWeapon() {
		println("You have a Sword !")
	}
}