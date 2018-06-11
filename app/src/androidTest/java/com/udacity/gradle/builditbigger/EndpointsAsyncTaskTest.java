package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

/**
 * Created by miltomasz on 07/06/18.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void testExecuteMethod() throws Exception {
        Context context = mainActivityActivityTestRule.getActivity().getApplicationContext();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(context);

        String jokeFromLib = endpointsAsyncTask.get(10, TimeUnit.SECONDS);

        Assert.assertNotNull(jokeFromLib);
        Assert.assertEquals("Joke from Java library :-))", jokeFromLib);
    }
}