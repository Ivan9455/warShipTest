package ru.javabegin.traning.fastjava2.ship;

import ru.javabegin.traning.fastjava2.pole.Pole;

import java.util.Arrays;

public class Ship  {
    private int countShip = 2;


    private String[] shipsCords;


    public int getCountShip() {
        return countShip;
    }

    public void setCountShip(int countShip) {
        this.countShip = countShip;
    }

    public String[] getShipsCords() {
        return shipsCords;
    }
    public String getShipsCordsI(int i) {
        return shipsCords[i];
    }
    public void setShipsCordsI(int i ,String shipsCords) {//добавление по элементно
        this.shipsCords[i] = shipsCords;
    }
    public void setShipsCords(String[] shipsCords) {// добавление массива
        this.shipsCords = shipsCords;
    }
    public Ship(Pole pole){
            setShipsCords(pole.getSizePole());
    }
    public void shipGenerate(Pole pole){

        int i = getCountShip();
        while (i!=0){
            int cord = (int) (Math.random() * pole.getSizePole().length);

            if( (getShipsCordsI(cord)!="к")&&(getShipsCordsI(cord)!="р")){

                if(cord!=0){setShipsCordsI(cord-1,"р");}
                setShipsCordsI(cord,"к");
                if(cord!=getShipsCords().length){setShipsCordsI(cord+1,"р");}
                i--;
            }
            else {
                System.out.println("error!");
            }
            //System.out.println(Arrays.toString(getShipsCords()) + "work? " + i);
        }
        //System.out.println(Arrays.toString(getShipsCords()));
        System.out.println("успешно?");
    }


}
