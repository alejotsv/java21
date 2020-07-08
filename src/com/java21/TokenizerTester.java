package com.java21;

import java.util.StringTokenizer;

public class TokenizerTester {
    public static void main(String[] args) {
        String example = "Cummins | Nice page title";
        System.out.println(example);
        StringTokenizer tokenizer = new StringTokenizer(example, "|");
        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
