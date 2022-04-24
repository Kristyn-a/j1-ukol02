package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(100, 100);
        nakresliZmrzlinu(zofka);

        nakresliSnehulaka(zofka);

        zofka.setLocation(1100, 187.9);

//        zofka.setLocation(109, 59);
//
//        nakresliKolecko(zofka, 10);



//        nakresliCtverec(zofka,50);
//
//        nakresliObdelnik(zofka,50,90);
//
//        nakresliRovnostrannyTrojuhelnik(zofka,100);
//
//        nakresliKolecko(zofka, 7);




    }

    private void nakresliSnehulaka(Turtle zofka) {
        zofka.setLocation(350, 100);
        zofka.turnRight(20);
        nakresliKolecko(zofka,14);
        zofka.setLocation(390.3, 140.3);
        zofka.turnRight(100);
        nakresliKolecko(zofka,20);
        zofka.setLocation(390.3, 255.5);
        nakresliKolecko(zofka,28);
        zofka.setLocation(333.6, 187.9);
        zofka.turnRight(80);
        nakresliKolecko(zofka, 7);
        zofka.setLocation(488.8, 187.9);
        nakresliKolecko(zofka, 7);
    }

    private void nakresliZmrzlinu(Turtle zofka) {
        nakresliKolecko(zofka, 20);
        zofka.turnRight(90);
        kornoutZmrzliny(zofka);
    }

    private void kornoutZmrzliny(Turtle zofka) {
        zofka.move(115.2);
        zofka.turnRight(110);
        zofka.move(168.4);
        zofka.turnRight(140);
        zofka.move(168.4);
    }

    private void nakresliKolecko(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 18; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(20);

        }
    }

    private void nakresliCtverec(Turtle zofka, double delkaStrany) {
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
        zofka.move(delkaStrany);
        zofka.turnRight(90);

    }
        private void nakresliObdelnik(Turtle zofka, double delkaKratsiStrany, double delkaDelsiStrany) {
            zofka.move(delkaKratsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaDelsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaKratsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaDelsiStrany);
            zofka.turnRight(90);

        }
            private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany) {
            zofka.move(delkaStrany);
            zofka.turnRight(120);
            zofka.move(delkaStrany);
            zofka.turnRight(120);
            zofka.move(delkaStrany);
            zofka.turnRight(120);




    }

}
