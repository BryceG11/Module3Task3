package com.company;

import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> pokemon = new ArrayList<String> ();
        pokemon.add("Bidoof");
        pokemon.add("Charmander");
        pokemon.add("Shuckle");
        pokemon.add("Zigzagoon");
        pokemon.add("Wurmple");
        pokemon.add("Slakoth");
        pokemon.add("Aron");
        System.out.println(pokemon);
        Collections.reverse(pokemon);
        System.out.println(pokemon);

    }
}
