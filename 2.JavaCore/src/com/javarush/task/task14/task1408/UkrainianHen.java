package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
