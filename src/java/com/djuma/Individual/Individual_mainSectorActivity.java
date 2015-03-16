/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class Individual_mainSectorActivity {
    private int id;
    private int individualId;
    private int sectorId;
    private boolean valid=true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
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

    public Individual_mainSectorActivity() {
    }

    public Individual_mainSectorActivity(int individualId, int sectorId) {
        this.individualId = individualId;
        this.sectorId = sectorId;
    }
    
    public void SaveMainSectorActivity(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_mainSectorActivity values(id,?,?)");
        djuma.setInt(1, individualId);
        djuma.setInt(2, sectorId);
    }catch(Exception e){
    
    }
    }
    
}
