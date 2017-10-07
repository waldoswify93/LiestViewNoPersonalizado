package co.jamesfl.apps.liestviewnopersonalizado;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 07/10/2017.
 */

public class methods {

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }
}
