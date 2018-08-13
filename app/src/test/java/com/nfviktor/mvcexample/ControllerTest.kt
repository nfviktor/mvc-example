package com.nfviktor.mvcexample

import org.junit.Test

import org.junit.Assert.*

class ControllerTest {

    val model = Model()
    val input: String = "something"
    val expected: String = "something"

    @Test
    fun getModel() {
        assertNotNull(model)
    }

    @Test
    fun setModel() {
    }

    @Test
    fun addItem() {
        model.addToList(input)
        assertEquals("Is not equal",expected, model.arrayList[0])
    }

    @Test
    fun returnSize() {
        model.addToList(input)
        val expetedSize:Int = 1
        assertEquals("Is not equal",expetedSize, model.arrayList.size)
    }
    
}