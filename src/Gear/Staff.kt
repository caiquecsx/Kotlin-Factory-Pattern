package Gear

object Staff : IGearStats {
	
		override var atk: Int = 25
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
		print("You have a Staff !")
	}
}