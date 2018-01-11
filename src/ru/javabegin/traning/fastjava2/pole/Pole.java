package ru.javabegin.traning.fastjava2.pole;


import ru.javabegin.traning.fastjava2.interface_.PoleInterface;

public class Pole implements PoleInterface{
    private String[] sizePole = new String[LENGTH_POLE];
    public Pole() {

    }
    public void generatePole(){
        for (int i = 0;i<getSizePole().length;i++){
            this.setSizePole(i,POLE_VACUUM);
        }

    }
    public String[] getSizePole() {
        return sizePole;
    }
    public String getSizePoleI(int i) {
        return sizePole[i];
    }
    public void setSizePole(int i,String sizePole) {
        this.sizePole[i] = sizePole;
    }

}
