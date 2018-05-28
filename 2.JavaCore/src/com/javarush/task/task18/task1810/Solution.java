package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis;

        while ((fis = new FileInputStream(br.readLine())).available() >= 1000) { }
        br.close();
        fis.close();
        throw  new DownloadException();
    }
    public static class DownloadException extends Exception {

    }
}
