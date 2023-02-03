package com.blz.dsa.stringpermutation;

public class Permutation {
    public static void main(String[] args)
    {
        System.out.println("Welcome to String Permutations program : ");
        PermutationMethods call = new PermutationMethods();
        String input = call.getinput();
        PermutationMethods.permutateRecursive(input, "");
        PermutationMethods.permutateIterative(input);
        call.displayResult();
    }
}
