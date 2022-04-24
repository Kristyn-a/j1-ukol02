package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(100, 100);
        nakresliZmrzlinu(zofka);

        nakresliSnehulaka(zofka);

        nakresliMasinku(zofka);

    }

    private void nakresliMasinku(Turtle zofka) {
        zofka.setLocation(1000, 200);
        nakresliObdelnik(zofka, 200,130);
        zofka.setLocation(870, 270);
        nakresliObdelnik(zofka, 130,200);
        zofka.setLocation(670, 300);
        nakresliPravouhlyTrojuhelnik(zofka, 130,183.8);
        zofka.setLocation(715, 400);
        zofka.turnLeft(90);
        koleckoMasinky(zofka, 8.6);
        zofka.setLocation(805, 400);
        koleckoMasinky(zofka, 8.6);
        zofka.setLocation(870, 408.5);
        zofka.turnLeft(90);
        koleckoMasinky(zofka, 17.1);
    }

    private void koleckoMasinky(Turtle zofka, double velikostStrany) {
        for (int i = 0; i < 24; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(15);

        }
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
        private void nakresliObdelnik(Turtle zofka, double delkaStranyY, double delkaStranyX) {
            zofka.move(delkaStranyY);
            zofka.turnRight(90);
            zofka.move(delkaStranyX);
            zofka.turnRight(90);
            zofka.move(delkaStranyY);
            zofka.turnRight(90);
            zofka.move(delkaStranyX);
            zofka.turnRight(90);

        }
            private void nakresliPravouhlyTrojuhelnik(Turtle zofka, double delkaOdvesny, double delkaPrepony) {
            zofka.move(delkaOdvesny);
            zofka.turnRight(90);
            zofka.move(delkaOdvesny);
            zofka.turnRight(135);
            zofka.move(delkaPrepony);
            zofka.turnRight(135);

    }

}
