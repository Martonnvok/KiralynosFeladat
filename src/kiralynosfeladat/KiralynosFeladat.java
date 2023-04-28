
package kiralynosfeladat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class KiralynosFeladat {

    
    public static void main(String[] args) throws IOException {
        //4.Hozzon létre egy Tábla típusú osztálypéldányt (objektumot), majd jelenítse meg a mátrixban lévő, üres cellákat jelölő karaktereket a minta szerint! A tábla megjelenítését a Megjelenít() metódussal végezze!
        
        System.out.println("4.feladat: Az Üres tábla:");
        Tabla t=new Tabla('#');
        t.Megjelenit();
        
        System.out.println("");
        System.out.println("6.feladat: A feltöltött tábla:");
        
        t.Elhelyez(8);
        t.Megjelenit();
        
        System.out.println("");
        System.out.println("9.feladat: Üres oszlopok és sorok száma:");
        
        t.megjelenitOsz();
        t.megjelenitSor();
        
       new KiralynosFeladat().feladat();
        
    }
    
    private void feladat() throws IOException {
       
        String kimenet = "x";
        String fajlNeve = "tablak64.txt";
        Path path = Path.of(fajlNeve);
        byte[] bytes = kimenet.getBytes();
        Files.write(path, bytes);
    }
    
}
