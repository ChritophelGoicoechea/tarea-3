/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author joeln
 */
public class Categorias {
    private String nombrep;
    private int id;
    private int codigo;

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     public void AgregarLista(){
    List lista2 = new ArrayList();
    lista2.add(this.getNombrep());
    lista2.add(this.getId());
    lista2.add(this.getCodigo());
    HashMap dicc2 = new HashMap();
    dicc2.put(getId(),lista2);
    }
}
