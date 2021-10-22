package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] line = input.split("\n");
        ArrayList<Line> lines = new ArrayList<>();
        int year = 0;
        int countOfVOS = 0;
        int countOfVS = 0;
        int countOfZAK = 0;
        int countOfSO = 0;
        int countOfUSO = 0;
        for (int i = 0; i < line.length; i++) {
            String[] firstLine = line[0].split(",");
            String[] rightLine = line[i].split(",");
            int thisYear = Integer.parseInt(firstLine[0]);
            if (thisYear == Integer.parseInt(rightLine[0])) {
                year = thisYear;
                if (rightLine[1].equals("VOS")) countOfVOS = Integer.parseInt(rightLine[3]);
                if (rightLine[1].equals("VS")) countOfVS = Integer.parseInt(rightLine[3]);
                if (rightLine[1].equals("ZAK")) countOfZAK = Integer.parseInt(rightLine[3]);
                if (rightLine[1].equals("SO")) countOfSO = Integer.parseInt(rightLine[3]);
                if (rightLine[1].equals("USO")) countOfUSO = Integer.parseInt(rightLine[3]);
            } else {
                lines.add(new Line(year, countOfVOS, countOfVS, countOfZAK, countOfSO, countOfUSO));
                year = 0;
                countOfVOS = 0;
                countOfVS = 0;
                countOfZAK = 0;
                countOfSO = 0;
                countOfUSO = 0;
            }
        }
        System.out.println("---Year 2006---");
        System.out.println("ZAK: " + lines.get(0).getRatio("ZAK"));
        System.out.println("SO: " + lines.get(0).getRatio("SO"));
        System.out.println("USO: " + lines.get(0).getRatio("USO"));
        System.out.println("VS: " + lines.get(0).getRatio("VS"));
    }

    static String input = "2006,SO,Střední odborné vzdělání,615\n" +
            "2006,USO,Úplné střední odborné vzdělání,6212\n" +
            "2006,VS,Vysokoškolské vzdělání,1520\n" +
            "2006,ZAK,Základní vzdělání,174\n" +
            "2007,SO,Střední odborné vzdělání,614\n" +
            "2007,USO,Úplné střední odborné vzdělání,5976\n" +
            "2007,VOV,Vyšší odborné vzdělání,214\n" +
            "2007,VS,Vysokoškolské vzdělání,1502\n" +
            "2007,ZAK,Základní vzdělání,173\n" +
            "2008,SO,Střední odborné vzdělání,567\n" +
            "2008,USO,Úplné střední odborné vzdělání,5793\n" +
            "2008,VOV,Vyšší odborné vzdělání,197\n" +
            "2008,VS,Vysokoškolské vzdělání,1499\n" +
            "2008,ZAK,Základní vzdělání,163\n" +
            "2009,SO,Střední odborné vzdělání,559\n" +
            "2009,USO,Úplné střední odborné vzdělání,6265\n" +
            "2009,VOV,Vyšší odborné vzdělání,206\n" +
            "2009,VS,Vysokoškolské vzdělání,1731\n" +
            "2009,ZAK,Základní vzdělání,145\n" +
            "2010,SO,Střední odborné vzdělání,525\n" +
            "2010,USO,Úplné střední odborné vzdělání,6069\n" +
            "2010,VOV,Vyšší odborné vzdělání,207\n" +
            "2010,VS,Vysokoškolské vzdělání,1904\n" +
            "2010,ZAK,Základní vzdělání,144\n" +
            "2011,SO,Střední odborné vzdělání,490\n" +
            "2011,USO,Úplné střední odborné vzdělání,5953\n" +
            "2011,VOV,Vyšší odborné vzdělání,206\n" +
            "2011,VS,Vysokoškolské vzdělání,1992\n" +
            "2011,ZAK,Základní vzdělání,131\n" +
            "2012,SO,Střední odborné vzdělání,466\n" +
            "2012,USO,Úplné střední odborné vzdělání,5891\n" +
            "2012,VOV,Vyšší odborné vzdělání,194\n" +
            "2012,VS,Vysokoškolské vzdělání,2153\n" +
            "2012,ZAK,Základní vzdělání,123\n" +
            "2013,SO,Střední odborné vzdělání,454\n" +
            "2013,USO,Úplné střední odborné vzdělání,5816\n" +
            "2013,VOV,Vyšší odborné vzdělání,211\n" +
            "2013,VS,Vysokoškolské vzdělání,2268\n" +
            "2013,ZAK,Základní vzdělání,118\n" +
            "2014,SO,Střední odborné vzdělání,440\n" +
            "2014,USO,Úplné střední odborné vzdělání,5784\n" +
            "2014,VOV,Vyšší odborné vzdělání,228\n" +
            "2014,VS,Vysokoškolské vzdělání,2378\n" +
            "2014,ZAK,Základní vzdělání,118\n" +
            "2015,SO,Střední odborné vzdělání,419\n" +
            "2015,USO,Úplné střední odborné vzdělání,5544\n" +
            "2015,VOV,Vyšší odborné vzdělání,226\n" +
            "2015,VS,Vysokoškolské vzdělání,2399\n" +
            "2015,ZAK,Základní vzdělání,102\n" +
            "2016,SO,Střední odborné vzdělání,389\n" +
            "2016,USO,Úplné střední odborné vzdělání,5409\n" +
            "2016,VOV,Vyšší odborné vzdělání,231\n" +
            "2016,VS,Vysokoškolské vzdělání,2407\n" +
            "2016,ZAK,Základní vzdělání,89\n" +
            "2017,SO,Střední odborné vzdělání,354\n" +
            "2017,USO,Úplné střední odborné vzdělání,5436\n" +
            "2017,VOV,Vyšší odborné vzdělání,238\n" +
            "2017,VS,Vysokoškolské vzdělání,2458\n" +
            "2017,ZAK,Základní vzdělání,80\n" +
            "2018,SO,Střední odborné vzdělání,340\n" +
            "2018,USO,Úplné střední odborné vzdělání,5489\n" +
            "2018,VOV,Vyšší odborné vzdělání,249\n" +
            "2018,VS,Vysokoškolské vzdělání,2572\n" +
            "2018,ZAK,Základní vzdělání,71\n" +
            "2019,SO,Střední odborné vzdělání,332\n" +
            "2019,USO,Úplné střední odborné vzdělání,5397\n" +
            "2019,VOV,Vyšší odborné vzdělání,259\n" +
            "2019,VS,Vysokoškolské vzdělání,2578\n" +
            "2019,ZAK,Základní vzdělání,68\n" +
            "2020,SO,Střední odborné vzdělání,309\n" +
            "2020,USO,Úplné střední odborné vzdělání,5393\n" +
            "2020,VOV,Vyšší odborné vzdělání,269\n" +
            "2020,VS,Vysokoškolské vzdělání,2614\n" +
            "2020,ZAK,Základní vzdělání,59";
}
