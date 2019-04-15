package com.company;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            //Inside the loop
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } // out of the loop

        if (numOfHits ==
                locationCells.length) {
            result = "you kilt it";
        }
        System.out.println(result);
            return result;
    } // close method
} // close method