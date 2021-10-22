package com.company;

public class Line {
    private int year;
    private int countOfVOS;
    private int countOfVS;
    private int countOfZAK;
    private int countOfSO;
    private int countOfUSO;

    public Line(int year, int countOfVOS, int countOfVS, int countOfZAK, int countOfSO, int countOfUSO) {
        this.year = year;
        this.countOfVOS = countOfVOS;
        this.countOfVS = countOfVS;
        this.countOfZAK = countOfZAK;
        this.countOfSO = countOfSO;
        this.countOfUSO = countOfUSO;
    }

    public double getRatio(String shortcut) {
        double total = getCountOfVOS() + getCountOfVS() + getCountOfZAK() + getCountOfSO() + getCountOfUSO();
        if (shortcut.equals("VOS")) return (getCountOfVOS() / total);
        if (shortcut.equals("VS")) return (getCountOfVS() / total);
        if (shortcut.equals("ZAK"))return (getCountOfZAK() / total);
        if (shortcut.equals("SO")) return (getCountOfSO() / total);
        if (shortcut.equals("USO")) return (getCountOfUSO() / total);
        return 0;
    }

    public int getYear() {
        return year;
    }
    public int getCountOfVOS() {
        return countOfVOS;
    }
    public int getCountOfVS() {
        return countOfVS;
    }
    public int getCountOfZAK() {
        return countOfZAK;
    }
    public int getCountOfSO() {
        return countOfSO;
    }
    public int getCountOfUSO() {
        return countOfUSO;
    }
}
