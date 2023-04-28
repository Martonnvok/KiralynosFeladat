package kiralynosfeladat;

import java.util.Random;

public class Tabla {

    private char[][] T;
    private char UresCella;

    //3.feladat Készítse el az osztály konstruktorát
    public Tabla(char uresCella) {
        this.T = new char[8][8];
        this.UresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }

   
    //4.feladat
    public void Megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(this.T[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5. feladat
    public void Elhelyez(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            if (T[x][y] == UresCella) {
                T[x][y] = 'K';
            } else {
                i--;
            }
        }
    }

    Tabla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //6. feladat
    public class Kiralynok {

        public static void main(String[] args) {
            Tabla t = new Tabla('.');
            t.Elhelyez(8);
            t.Megjelenit();
        }
    }
    
    //7.feladat
    public boolean UresOszlop(int oszlop) {
        for (int i = 0; i < 8; i++) {
            if (T[i][oszlop] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean UresSor(int sor) {
        for (int i = 0; i < 8; i++) {
            if (T[sor][i] == 'K') {
                return false;
            }
        }
        return true;
    }
    
    //8.feladat Üres sorok, oszlopok  keresése
    public int getUresOszlopokSzama() {
        int db = 8;
        for (int i = 0; i < 8; i++) {
            if (UresOszlop(i)) {
                db--;
            }
        }
        return db;
    }
    
    public int getUresSorokSzama() {
        int db = 8;
        for (int i = 0; i < 8; i++) {
            if (UresSor(i)) {
                db--;
            }
        }
        return db;
    }
    
    //9. Üres sorok, oszlopok megjelenítése
    public void megjelenitOsz() {
        System.out.println("Üres oszlopok száma: "+getUresOszlopokSzama());
    }
    
    public void megjelenitSor() {
        System.out.println("Üres sorok száma: "+getUresSorokSzama());
    }
}
