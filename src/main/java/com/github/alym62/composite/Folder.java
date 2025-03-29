package com.github.alym62.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {
    private List<File> files = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        if (files.contains(file)) {
            System.out.println("Removendo arquivo para substituir >>>");
            files.remove(file);

            if (!files.contains(file)) {
                System.out.println("Substituindo arquivo existente >>>");
                files.add(file);
            }
        } else {
            this.files.add(file);
        }
    }

    public void removeFile(File file) {
        if (!files.contains(file)) throw new RuntimeException("Ops! Não existe esse arquivo!");

        files.remove(file);
    }

    @Override
    public void show() {
        System.out.println("Pasta: " + name);
        files.forEach(File::show);
    }
}
