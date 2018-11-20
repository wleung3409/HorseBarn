package com.company;

public class HorseRunner {

    public static void main(String[] args) {
        Main horse1 = new Mustang("Secretariat", 12000);
        Main horse2 = new Mustang("Dusty Trail", 22000);
        Main horse3 = new Mustang("Silver", 12000);

        Main[] horses = new Main[6];

        horses[1] = horse1;
        horses[2] = horse2;
        horses[3] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));
    }
}