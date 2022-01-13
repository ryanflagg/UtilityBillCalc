/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utilitybillcalc;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author ryanf
 */
public class estimator {
    
    float openingReading;
    float closingReading;
    float tarif;
    

    public estimator(float open, float close, float eTarif) {
        
        openingReading = open;
        closingReading = close;
        tarif = eTarif;
    }
    
    public float getEstimate(){
        float amount = this.estimate();
        return amount;
    }
    
    private float estimate(){
        float estAmount = 0;
        if(closingReading > openingReading){
            
            estAmount = (closingReading - openingReading) * tarif;
            
        }
            
        else{
      
            showMessageDialog(null, "There was an error, please check metre readings!");
        }
              
        return estAmount; 
    }

}
