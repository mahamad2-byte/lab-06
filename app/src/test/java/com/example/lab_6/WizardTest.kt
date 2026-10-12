package com.example.lab_6

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals


class WizardTest {
    lateinit var  evilWizard: Wizard
    @Before
    fun setUp(){
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }
    @Test
    fun testSuccessfulExplosion() {
        val damage = evilWizard.castSpell("Explosion")
        assertEquals(30, damage)
        assertEquals(20, evilWizard.mana)
    }
    @Test
    fun testUnsuccessfulExplosion() {
        evilWizard.mana = 5

        val damage = evilWizard.castSpell("Explosion")
        assertEquals(0, damage)
        assertEquals(5, evilWizard.mana)
    }
    @Test
    fun testSuccessfulFrostbite() {
        val damage = evilWizard.castSpell("Frostbite")
        assertEquals(20, damage)
        assertEquals(25, evilWizard.mana)
    }
    @Test
    fun testUnsuccessfulFrostbite() {
        evilWizard.mana = 3
        val damage = evilWizard.castSpell("Frostbite")
        assertEquals(0, damage)
        assertEquals(3, evilWizard.mana)
    }


}