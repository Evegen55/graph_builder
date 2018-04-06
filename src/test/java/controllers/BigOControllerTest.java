package controllers;

import entities.Complexity;
import org.junit.Test;

public class BigOControllerTest {

    @Test
    public void calculateNwithRespectOfPerforamnce() {
        for (Complexity complexity : Complexity.values()) {
            BigOController.calculateNwithRespectOfPerforamnce(complexity);
        }
    }
}