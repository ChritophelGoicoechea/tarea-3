/*

    APORTE HECHO POR 2019-7786 // S. LIRA.

*/
package negocio.Categorias;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AgregarCategoria {
    
    int idp;
    ClsCategoria categoria = new ClsCategoria(); //Instanciando el formulario Categoria del proyecto de Amos.
    DefaultTableModel modelo = new DefaultTableModel();
  
  
  //Esta es la función que agregara el producto. Solo necesita ser llamada cuando la vayan a utilizar. Esta se utiliza en la
  //función de jButton3ActionPerformed del codigo de Amos. Formulario Categorias.java
  void agregarCategoria(){
    int item = 0; //Contador para los datos presentados en la tabla.
    DefaultTableModel modelo = new DefaultTableModel(); //Instancia de la clase Tabla; o sea, la tabla que se tenga.
    item =  item + 1; //elevar a uno el contador.
    //Ahora vamos a capturar los valores que se encuentran actualmente insertados en la ventana.
    idp = Integer.parseInt(categoria.getId()); 
    String nomp = categoria.getnombreProducto();
    Boolean estadop = categoria.getestadoProducto();
    ArrayList list = new ArrayList();
    list.add(item);
    list.add(idp);
    list.add(nomp);
    list.add(estadop);
    //Entrar los valores a una lista.
    Object[] ob = new Object[4];
      for (int i = 0; i < ob.length - 1; i++) {
          ob[i] = list.get(i);
      }
     //Añadir los valores a la tabla.
      modelo.addRow(ob);
     //IMPORTANTE --->
    //TablaDetalle.SetModel(modelo); Descomentar esta parte cuando se tenga la clase TablaDetalle.
    //NombreDeTabla que se encuentra en el archivo.
    //NombreDetabla.SetModel(modelo);
      
  }
      
}
