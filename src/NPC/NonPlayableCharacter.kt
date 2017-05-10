package NPC

abstract class NonPlayableCharacter {
	abstract var atk: Int
	abstract var def: Int
	
	abstract fun generateNPC()
}