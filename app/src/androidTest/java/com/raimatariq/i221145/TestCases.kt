package com.raimatariq.i221145

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestCases {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun loginTOHomepage() {
        Thread.sleep(3000)
        onView(withId(R.id.Loginbtn)).perform(click())

        onView(withId(R.id.sbar))
            .check(matches(isDisplayed()))
    }

    @Test
    fun homeToProfile() {
        Thread.sleep(2500) //splash ke liye wait
        onView(withId(R.id.Loginbtn)).perform(click())

        onView(withId(R.id.likes)).perform(click())

        onView(withId(R.id.sbar))
            .check(matches(isDisplayed()))
    }



}