package com.formation.ereservation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//# Run tests which tagged with `integration, slow, feature-168`
//$ mvn -Dgroups="integration, fast, feature-168"

//# Exclude tests which tagged with 'slow'
//$ mvn -DexcludedGroups="slow"

@Tag("branch-20")
public class TagMethodTest {

    @Test
    @Tag("feature-168")
    void test1Plus1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("integration")
    @Tag("fast")
    void testFastAndIntegration() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("slow")
    void testSlow() {
        assertEquals(2, 1 + 1);
    }

}