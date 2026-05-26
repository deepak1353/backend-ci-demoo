package com.deepak.backend_ci_demoo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {

    @Test
    public void sampleTest() {

        System.out.println("Running TestNG Test");

        Assert.assertEquals("CI", "CI");
    }
}