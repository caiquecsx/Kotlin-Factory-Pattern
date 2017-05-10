import Factories.FactoryPC
import PC.Gladiator
import PC.PlayableCharacter
import PC.characterClasses
import java.util.Scanner
import kotlin.properties.Delegates
import Gear.Weapons
import Gear.IGearStats
import Factories.FactoryNPC
import Factories.FactoryWeapon
import NPC.typeNPC
import NPC.NonPlayableCharacter

fun main(args: Array<String>) {
    
	
	val factoryPC = FactoryPC()
	val factoryNPC = FactoryNPC()
	val factoryWeapons = FactoryWeapon()
	
	val scan = Scanner(System.`in`)
	
	var character: PlayableCharacter by Delegates.notNull()
	var weapon: IGearStats by Delegates.notNull()
	var NPC: MutableList<NonPlayableCharacter> = mutableListOf<NonPlayableCharacter>()
	
	print("Please select your character class: \n(1)Gladiator \n(2)Mage \n(3)Knight \nChoose one: ")
	val s1 = scan.nextInt();
	
	when(s1){
		1 -> character = factoryPC.generateCharacter(characterClasses.Gladiator) 
		2 -> character = factoryPC.generateCharacter(characterClasses.Mage)
		3 -> character = factoryPC.generateCharacter(characterClasses.Knight)
	}
	
	println("Choose a name for you new character:")
	val name = scan.next()
	
	print("Please select your weapon: \n(1)Axe \n(2)Staff \n(3)Sword \n(4)Shield \nChoose one: ")
	val s2 = scan.nextInt();
	

	when(s2){
		1 -> weapon = factoryWeapons.generateWeapon(Weapons.Axe)
		2 -> weapon = factoryWeapons.generateWeapon(Weapons.Staff)
		3 -> weapon = factoryWeapons.generateWeapon(Weapons.Sword)
		4 -> weapon = factoryWeapons.generateWeapon(Weapons.Shield)
	}
	
	character.createCharacter(name,weapon)
	
	println("\nFilling game with bots\n")

	for(i in 1..2){
		NPC.add(factoryNPC.getNPC(typeNPC.Dragon))
	}
	
	for(i in NPC.size..NPC.size+15){
		NPC.add(factoryNPC.getNPC(typeNPC.Vampire))
	}
	
	for(i in NPC.size..NPC.size+15){
		NPC.add(factoryNPC.getNPC(typeNPC.Werewolf))
	}
	
	for(i in NPC){
		i.generateNPC()
	}
	
}