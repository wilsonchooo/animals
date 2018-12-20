package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Arraylist animalArr = new ArrayList(Arrays.asList(
                "cat","mouse","frog","dog","dog"
        ));

        Wordlist animals = new Wordlist(animalArr);

        System.out.println(animals.numWordsofLength(4));
    }
}
