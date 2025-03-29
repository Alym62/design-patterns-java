package com.github.alym62.composite;

public class Main {
    public static void main(String[] args) {
        File myFile = new SimpleFile("document.pdf");
        File audio = new SimpleFile("feel-it.mp3");

        Folder folder = new Folder("My folder");
        folder.addFile(myFile);
        folder.addFile(myFile);
        folder.addFile(audio);

        folder.removeFile(myFile);
        folder.show();
    }
}
