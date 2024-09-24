package org.example;

import org.apache.commons.text.WordUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "dupa dupa dupa";
        System.out.println(WordUtils.capitalizeFully(string));
        String[] strArray = string.split(" ");
        for(int i = 0; i < strArray.length; i++){
            strArray[i] = strArray[i].substring(0,1).toUpperCase() + strArray[i].substring(1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArray.length; i++){
            stringBuilder.append(strArray[i]);
            if(i != strArray.length - 1) stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);
    }
}