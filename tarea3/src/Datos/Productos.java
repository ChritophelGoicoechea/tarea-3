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
public class Productos {
    private String nombrep;
    private int id;
    private int cod;
    private int stock;
    private int fecha;
    private String desc;
    private String categoria;

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

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void AgregarLista(){
    List lista = new ArrayList();
    lista.add(this.getNombrep());
    lista.add(this.getId());
    lista.add(this.getCod());
    lista.add(this.getStock());
    lista.add(this.getFecha());
    lista.add(this.getDesc());
    lista.add(this.getCategoria());
    HashMap dicc = new HashMap();
    dicc.put(getId(),lista);
    }
}
