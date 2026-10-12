package com.example.lab_6
/**
 * Represents a wizard that can cast spell using mana
 *
 * A wizard has a name, mana, and spell power.
 * Mana is needed  to cast spells.
 * Spell power determines the damage.
 *
 * @property name the wizard's name
 * @property mana the available magic energy
 * @property spellPower the power of the wizrd's spell
 */
class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    /**
     * Casts a spell and returns the damage dealt
     * Supported spells:
     * Explosion costs 10 mana and deals 3 times spellPower damage.
     * Frostbite costs 5 mana and deals 2 times spellPower damage.
     * Returns 0 if there is not enough mana or the spell is invalid.
     * @param spell the name of the spell to cast
     * @return the damage dealt, or 0 if the spell fails
     *
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else {
                    return 0
                }
            }
                "Frostbite" -> {
                    if (mana >= 5) {
                        mana -= 5
                        return spellPower * 2
                    }
                    else  {
                        return 0
                    }
                }
                else -> {
                    return 0
                }
            }


            }


        }


