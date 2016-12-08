package com.redhat.jenkins.plugins.ci;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.recipes.LocalData;

import static org.junit.Assert.assertTrue;

/**
 * Created by shebert on 07/12/16.
 */
public class MigrationTest {

    @Rule
    public final JenkinsRule j = new JenkinsRule();

    @LocalData
    @Test
    public void testConfig() throws Exception {
    }
}

