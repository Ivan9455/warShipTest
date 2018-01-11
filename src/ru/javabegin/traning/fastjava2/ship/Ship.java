package ru.javabegin.traning.fastjava2.ship;

import ru.javabegin.traning.fastjava2.interface_.ShipInterface;
import ru.javabegin.traning.fastjava2.pole.Pole;

import java.util.Arrays;

public class Ship  implements ShipInterface{



    private String[] shipsCords;


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

        int i = COUNT_SHIP;
        while (i!=0){
            int cord = (int) (Math.random() * pole.getSizePole().length);

            if( (getShipsCordsI(cord)!=SHIP_CHAR)&&(getShipsCordsI(cord)!=SHIP_CHAR_LINE)){

                if(cord!=0){setShipsCordsI(cord-1,SHIP_CHAR_LINE);}
                setShipsCordsI(cord,SHIP_CHAR);
                if(cord!=getShipsCords().length){setShipsCordsI(cord+1,SHIP_CHAR_LINE);}
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
