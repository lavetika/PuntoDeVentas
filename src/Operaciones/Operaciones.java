
package Operaciones;

import java.util.List;
import objetoNegocio.Producto;
import static objetoNegocio.rel_productosventas_.precio;

/**
 *
 * @author Estefanía Aguilar
 */
public class Operaciones {
    
    public float subtotal (List<Float> montosTotales){
        float subtotal = 0.0f;
        for (float montoTotal : montosTotales) {
            subtotal = subtotal + montoTotal;
        }
        return subtotal;
    }
    
    public float montoFinal(float total, float descuento){
         return (total - (total*(descuento/100)));
    }
}
