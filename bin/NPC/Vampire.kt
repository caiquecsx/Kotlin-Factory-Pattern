package NPC

object Vampire : NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Vampire Created")
	}

	override var atk: Int = 50
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 30
		get() = field
		set(value) {
			field = value
		}
}