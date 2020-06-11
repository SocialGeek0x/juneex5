/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRESLF
 */
public class Producto {
 int id;
 String nome;
 float prezo;
  int idfamilia;

    public Producto() {
    }

    public Producto(int id, String nome, float prezo, int idfamilia) {
        this.id = id;
        this.nome = nome;
        this.prezo = prezo;
        this.idfamilia = idfamilia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(int idfamilia) {
        this.idfamilia = idfamilia;
    }

    @Override
    public String toString() {
        return   " "+ nome + " - " + prezo ;
    }
    
    
    
}
