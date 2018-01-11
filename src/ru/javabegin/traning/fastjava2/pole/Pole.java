package ru.javabegin.traning.fastjava2.pole;



public class Pole {
    private String[] sizePole = new String[10];
    public Pole() {

    }
    public void generatePole(){
        for (int i = 0;i<getSizePole().length;i++){
            this.setSizePole(i,"о");
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
