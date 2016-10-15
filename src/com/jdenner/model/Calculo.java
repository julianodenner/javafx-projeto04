package com.jdenner.model;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author Juliano
 */
public class Calculo {
    
    private float numero1;
    private float numero2;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero1(String numero) throws ParseException{
        NumberFormat nf = NumberFormat.getNumberInstance();
        setNumero1(nf.parse(numero).floatValue());
    }

    public float getNumero2() {
        return numero2;
    }

     public void setNumero2(String numero) throws ParseException{
        NumberFormat nf = NumberFormat.getNumberInstance();
        setNumero2(nf.parse(numero).floatValue());
    }
     
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public float getResultado(){
        return getNumero1() + getNumero2();
    }
    
}
