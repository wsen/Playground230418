/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.generics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 *
 * @author student
 */
interface CharIterable<E extends Exception> {

    boolean hasNext() throws E;

    char next() throws E;
}

class StringIterable implements CharIterable<RuntimeException> {

    private final String string;
    private int pos;

    public StringIterable(String string) {
        this.string = string;
    }

    @Override
    public boolean hasNext() {
        return pos < string.length();
    }

    @Override
    public char next() {
        return string.charAt(pos++);
    }
}

class WebIterable implements CharIterable<IOException> {

    private final Reader reader;

    public WebIterable(String url) throws IOException {
        reader = new InputStreamReader(new URL(url).openStream());
    }

    @Override
    public boolean hasNext() throws IOException {
        return reader.ready();
    }

    @Override
    public char next() throws IOException {
        return (char) reader.read();
    }
}

class TypeParamasInThrows {

    public static void main(String[] args) {
        StringIterable iter1 = new StringIterable("Shasha");   // try ist unnötig 
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + " ");
        }

        System.out.println();

        try {
            WebIterable iter2 = new WebIterable("http://tutego.de/javabuch/aufgaben/bond.txt");
            while (iter2.hasNext()) {
                System.out.print(iter2.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
