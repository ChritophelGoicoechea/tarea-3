/*

    APORTE HECHO POR 2019-7786 // S. LIRA.

*/

package negocio.Lista;

public class ClsLista {
    private String idProducto;          // propiedad para el id     de la ClsLista.
    private String nombreProducto;      // propiedad para el nombre de la ClsLista.
    private String codigoProducto;      // propiedad para el codigo de la ClsLista.
    private String vencimientoProducto; // propiedad para el vencimiento de la ClsLista.
    private String descProducto;        // propiedad para el descripcin. de la ClsLista.
    private String categoriaProducto;   // propiedad para el categ  de la ClsLista.
    private Boolean existenciaProducto;  // propiedad para el exist  de la ClsLista.
    private Boolean estadoProducto;      // propiedad para el estado de la ClsLista.
    
    // Getter
  public String getId() { //GET SOLO SIRVE PARA LEER. NO INTENTE PONER VALORES DIRECTOS, ESTO ARRUINARIA EL PROPOSITO DEL ENCAPSILAMIENTO.  
    return idProducto; 
  }                    
  // Setter
  public void setId (String newidProducto) { //Ej. (String idProducto.getText())
    this.idProducto = newidProducto; //reemplazar [newidProducto] por la propiedad name del TextBox ID que se tenga.
                                     //Ej. this.idProducto = idProducto.getText();
                                     
  }
  
  public String getnombreProducto (){
      return nombreProducto;
  }
  
  public void setnombreProducto (String newnombreProducto){
      this.nombreProducto = newnombreProducto;
  }
  
  public String getcodigoProducto (){
      return codigoProducto;
  }
  
  public void setcodigoProducto (String newcodigoProducto){
      this.codigoProducto = newcodigoProducto;
  }
  
  public String getvencimientoProducto (){
      return vencimientoProducto;
  }
  
  public void setvencimientoProducto (String newvencimientoProducto){
      this.vencimientoProducto = newvencimientoProducto;
  }
  
  public String getdescProducto (){
      return descProducto;
  }
  
  public void setdescProducto (String newdescProducto){
      this.descProducto = newdescProducto;
  }
  
  public String getcategoriaProducto (){
      return categoriaProducto;
  }
  
  public void setcategoriaProducto (String newcategoriaProducto){
      this.categoriaProducto = newcategoriaProducto;
  }
  
  public Boolean getexistenciaProducto (){
      return existenciaProducto;
  }
  
  public void setexistenciaProducto (Boolean newexistenciaProducto){
      this.existenciaProducto = newexistenciaProducto;
  }
  
  public Boolean getestadoProducto() {
    return estadoProducto;
  }

  public void setestadoProducto (Boolean newestadoProducto) {
    this.estadoProducto = newestadoProducto;
  }
}
