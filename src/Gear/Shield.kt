package Gear

object Shield : IGearStats{
	
	override var atk: Int = 5
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 20
		get() = field
		set(value) {
			field = value
		}
	
	override fun getWeapon() {
		println("You have a Shield !")
	}
}