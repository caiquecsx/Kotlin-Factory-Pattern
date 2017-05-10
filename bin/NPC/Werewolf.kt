package NPC

object Werewolf : NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Werewof Created")
	}

	override var atk: Int = 30
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 50
		get() = field
		set(value) {
			field = value
		}

}