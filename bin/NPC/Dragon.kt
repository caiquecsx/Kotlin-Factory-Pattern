package NPC

object Dragon: NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Dragon Created")
	}
	override var atk: Int = 100
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 120
		get() = field
		set(value) {
			field = value
		}
	
	
}