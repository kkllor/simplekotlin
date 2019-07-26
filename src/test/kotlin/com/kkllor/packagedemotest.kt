package com.kkllor

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class packageDemoTest {
    @Test
    fun testPackagefun() {
        packagefun()
        val packageDemo = packageDemo()
        packageDemo.packageDemofun()
    }
}

