package ca.uw.ece.mobileapplication;

import static org.junit.Assert.*;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import ca.uw.ece.mobileapplication.SignupActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class SignupActivityTest {

    @Rule
    public ActivityTestRule<SignupActivity> mActivityRule = new ActivityTestRule<>(SignupActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("ca.uw.ece.mobileapplication", appContext.getPackageName());
    }

    @Test
    public void user_signup() throws InterruptedException {
        onView(withId(R.id.userName)).perform(typeText("tliu"));
        onView(withId(R.id.password)).perform(typeText("tlkwonca"));
        onView(withId(R.id.sign_in_button)).perform(click());
    }


}