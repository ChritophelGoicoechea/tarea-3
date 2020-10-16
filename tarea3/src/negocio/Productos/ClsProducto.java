/*

    APORTE HECHO POR 2019-7786 // S. LIRA.

*/

package negocio.Productos;

public class ClsProducto {
    
    //ACLARACION: PUEDO HACER UNA CLASE ABSTRACTA PARA 
    //LOS OBJETO, UNA VEZ QUE YA LO TENGAMOS LISTOS PARA ASI AHORRAR LINEAS DE CODIGO. —ESTO FUNCIONA DE TODAS FORMAS.
    private String idProducto;      // propiedad para el nombre de la ClsProducto.
    private String nombreProducto;      // propiedad para el nombre de la ClsProducto.
    private String codigoProducto;      // propiedad para el codigo de la ClsProducto.
    private String vencimientoProducto; // propiedad para el vencimiento de la ClsProducto.
    private String descProducto;        // propiedad para el descripcin. de la ClsProducto.
    private String categoriaProducto;   // propiedad para el categ  de la ClsProducto.
    private Boolean estadoProducto;      // propiedad para el estado de la ClsProducto.
  
  public String  getId (){ //GET SOLO SIRVE PARA LEER. NO INTENTE PONER VALORES DIRECTOS, ESTO ARRUINARIA EL PROPOSITO DEL ENCAPSILAMIENTO.  
      return idProducto;
  }
  
  public String  setId (String newidProducto){
      return idProducto = newidProducto;
  }
    
  public String getnombreProducto (){ 
      return nombreProducto;                                               
  }
  
  public String setnombreProducto (String newnombreProducto){
       return this.nombreProducto = newnombreProducto; //reemplazar [newnombreProducto] por la propiedad name del TextBox ID que se tenga.
                                             //Y así para las demás propiedades. El punto es conseguir el valor string del TextBox por estos métodos.
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
  
  public Boolean getestadoProducto() {
    return estadoProducto;
  }

  public void setestadoProducto (Boolean newestadoProducto) {
    this.estadoProducto = newestadoProducto;
  }
}
