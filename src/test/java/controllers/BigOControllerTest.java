package controllers;

import entities.Complexity;
import org.junit.Test;

public class BigOControllerTest {

    BigOController bigOController = new BigOController();

    @Test
    public void calculateNwithRespectOfPerforamnce() {
        for (Complexity complexity : Complexity.values()) {
            bigOController.calculateNwithRespectOfPerforamnce(complexity);
        }
    }
}