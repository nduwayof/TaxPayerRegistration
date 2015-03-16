/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.NonIndividual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual_mainSectorActivity {
    private int id;
    private int nonIndividualId;
    private int sectorId;
    private boolean valid=true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndividualId() {
        return nonIndividualId;
    }

    public void setIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_mainSectorActivity() {
    }

    public NonIndividual_mainSectorActivity(int nonIndividualId, int sectorId) {
        this.nonIndividualId = nonIndividualId;
        this.sectorId = sectorId;
    }

   
    
    public void SaveMainSectorActivity(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_mainSectorActivity values(id,?,?)");
        djuma.setInt(1, nonIndividualId);
        djuma.setInt(2, sectorId);
    }catch(Exception e){
    
    }
    }
}
