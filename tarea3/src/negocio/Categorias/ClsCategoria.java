/*

    APORTE HECHO POR 2019-7786 // S. LIRA.

*/

package negocio.Categorias;

public class ClsCategoria {
    private String idProducto;          // propiedad para el id     de la ClsCategoria.
    private String nombreProducto;      // propiedad para el nombre de la ClsCategoria.
    private Boolean estadoProducto;      // propiedad para el estado de la ClsCategoria.
    
    
  public String  getId (){
      return idProducto;
  }
  
  public String  setId (String newidProducto){
      return idProducto = newidProducto;
  }
    
  public String getnombreProducto (){ //GET SOLO SIRVE PARA LEER. NO INTENTE PONER VALORES DIRECTOS, ESTO ARRUINARIA EL PROPOSITO DEL ENCAPSILAMIENTO.  
      return nombreProducto;          
  }
  
  public void setnombreProducto (String newnombreProducto){
      this.nombreProducto = newnombreProducto; //reemplazar [newnombreProducto] por la propiedad name del TextBox ID que se tenga.
                                               //Y así para las demás propiedades. El punto es conseguir el valor string del TextBox por estos métodos.
  }
  
    public Boolean getestadoProducto() {
    return estadoProducto;
  }

  public void setestadoProducto (Boolean newestadoProducto) {
    this.estadoProducto = newestadoProducto;
  }
}
