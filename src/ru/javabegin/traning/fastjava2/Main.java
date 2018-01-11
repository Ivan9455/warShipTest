package ru.javabegin.traning.fastjava2;

import ru.javabegin.traning.fastjava2.pole.Pole;
import ru.javabegin.traning.fastjava2.ship.Ship;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pole pole = new Pole();
        pole.generatePole();
        System.out.println( Arrays.toString(pole.getSizePole())+" генерация поля " );
        Pole poleShip = new Pole();
        poleShip.generatePole();
        Ship ship = new Ship(poleShip);
        //System.out.println(Arrays.toString(ship.getShipsCords())+ " генерация кораблей на поле" );
        ship.shipGenerate(poleShip);
        //System.out.println(Arrays.toString(poleShip.getSizePole()) + " shipPole");
        int count = ship.getCountShip();
        while (count!=0){
            System.out.println("xодите");
            String hod = in.nextLine();
            if(poleShip.getSizePoleI(Integer.parseInt(hod))=="к"&&pole.getSizePoleI(Integer.parseInt(hod))!="к"&&pole.getSizePoleI(Integer.parseInt(hod))!="р"){

                if (Integer.parseInt(hod)!=0){
                    pole.setSizePole(Integer.parseInt(hod),"р");
                }
                pole.setSizePole(Integer.parseInt(hod),"к");
                if (Integer.parseInt(hod)!=pole.getSizePole().length){
                    pole.setSizePole(Integer.parseInt(hod),"р");
                }
                System.out.println("попал");
                count--;
                if(count==0){
                    System.out.println("вы потопилевсе корабли");
                    System.out.println("хотите сыграть еще?");
                    String game = in.nextLine();
                    if(game.equals("y"))
                    {
                        pole.generatePole();
                        poleShip.generatePole();
                        ship.shipGenerate(pole);
                        System.out.println("проверка генерации");
                        System.out.println(Arrays.toString(pole.getSizePole()));
                        System.out.println(Arrays.toString(poleShip.getSizePole()));
                        System.out.println(Arrays.toString(ship.getShipsCords()));
                        count=2;
                    }
                    else{
                        System.out.println("wtf?");
                    }
                }
            }
        }
    }
}
