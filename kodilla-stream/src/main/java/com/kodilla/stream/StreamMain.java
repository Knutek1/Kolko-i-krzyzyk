package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.ArrayList;
import java.util.List;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        List<String> poemList = new ArrayList<>();
        poemList.add(poemBeautifier.beautify("AAAAaaaaa",string -> "DDDD"+string+"DDDD"));
        poemList.add(poemBeautifier.beautify("AAAAaaaaa",string -> string.toUpperCase()));
        poemList.add(poemBeautifier.beautify("AAAAaaaaa",string -> string.toLowerCase()));
        poemList.add(poemBeautifier.beautify("AAAAaaaaa",string -> string.substring(4,9)));

        System.out.println(poemList);
    }
}