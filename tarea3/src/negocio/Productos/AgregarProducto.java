/*

    APORTE HECHO POR 2019-7786 // S. LIRA.

*/

package negocio.Productos;


import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgregarProducto {
    
    int idp;
//    ClsProducto p = new ClsProducto(); //Instanciando el formulario producto del proyecto de Amos.
    DefaultTableModel modelo = new DefaultTableModel();
  
  
  //Esta es la función que agregara el producto. Solo necesita ser llamada cuando la vayan a utilizar. Esta se utiliza en la
  //función de jButton3ActionPerformed del codigo de Amos. Formulario Productos.java
   public void agregarProducto(JTable TablaDetalle,String Nomp){  
    int item = 0; //Contador para los datos presentados en la tabla.
                   /*<-- IMPORTANTE -->*/
    modelo = (DefaultTableModel)TablaDetalle.getModel();//Sustituir TablaDetalle por el nombre de la tabla. Descomentar cuando se tenga la tabla.
                  
//    item =  item + 1; //elevar a uno el contador.
//    idp = Integer.parseInt(p.getId());
   
    //Ahora vamos a capturar los valores que se encuentran actualmente insertados en la ventana.

    String nomp = Nomp; //Esto se puede modificar en txtProducto.getText(). Si se quiere usar p.getnombreProducto()
                                         //Hay que sustituir los valores indicados en la ClsProducto. Y así para todos los demás.
//    String codigop = p.getcodigoProducto();
//    String descp = p.getdescProducto();
//    String vencp = p.getvencimientoProducto();
//    String categp = p.getcategoriaProducto();
//    Boolean estadop = p.getestadoProducto();
    ArrayList list = new ArrayList();
//    list.add(item);
//    list.add(idp);
    list.add(nomp);
//    list.add(codigop);
//    list.add(descp);
//    list.add(vencp);
//    list.add(categp);
//    list.add(estadop);
    //Entrar los valores a una lista.
    Object[] ob = new Object[0];
    ob[0] = list.get(0);
//    Object[] ob = new Object[8];
//      for (int i = 0; i < ob.length - 1; i++) {
//          ob[i] = list.get(i);
//      }
    //Añadir los valores a la tabla.
      modelo.addRow(ob);
      TablaDetalle.setModel(modelo); //Descomentar esta parte cuando se tenga la clase TablaDetalle.
    //NombreDeTabla que se encuentra en el archivo.
    //NombreDetabla.SetModel(modelo);
      
  }
}
