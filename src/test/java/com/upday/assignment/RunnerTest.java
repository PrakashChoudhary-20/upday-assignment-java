package com.upday.assignment;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features="src/test/resources",
        glue={"com/upday/assignment/steps"}
        )
public class RunnerTest {
}