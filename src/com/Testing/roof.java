package com.Testing;

public class roof implements art{
    @Override
    public void onArt() {
        System.out.println("стена покрашена");
    }
}

class house implements art{
    @Override
    public void onArt() {
        System.out.println("дом покрашен");
    }
}

class sun implements art{
    @Override
    public void onArt() {
        System.out.println("солнце покрашено");
    }
}

class hand implements art{
    @Override
    public void onArt() {
        System.out.println("рука покрашена");
    }
}

class paper implements art{
    @Override
    public void onArt() {
        System.out.println("листок покрашен");
    }
}
