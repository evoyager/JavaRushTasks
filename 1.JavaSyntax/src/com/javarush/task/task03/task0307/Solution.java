package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zergKiller1 = new Zerg();
        zergKiller1.name = "zergKiller1";
        Zerg zergKiller2 = new Zerg();
        zergKiller2.name = "zergKiller2";
        Zerg zergKiller3 = new Zerg();
        zergKiller3.name = "zergKiller3";
        Zerg zergKiller4 = new Zerg();
        zergKiller4.name = "zergKiller4";
        Zerg zergKiller5 = new Zerg();
        zergKiller5.name = "zergKiller5";

        Protoss protoss1 = new Protoss();
        protoss1.name = "protoss1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "protoss2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "protoss3";

        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";
        Terran terran4 = new Terran();
        terran4.name = "terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
