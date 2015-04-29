/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_mainsectorActivity values(id,?,?)");
        djuma.setInt(1, nonIndividualId);
        djuma.setInt(2, sectorId);
        djuma.execute();
    }catch(Exception e){
    
    }
    }
    
    public static List<NonIndividual_mainSectorActivity>list(){
    List<NonIndividual_mainSectorActivity>l=new ArrayList<NonIndividual_mainSectorActivity>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonindividual_mainsectorActivity");
    ResultSet rs=djuma.executeQuery();
    while(rs.next()){
    NonIndividual_mainSectorActivity n=new NonIndividual_mainSectorActivity();
    n.setId(rs.getInt(1));
    n.setNonIndividualId(rs.getInt(2));
    n.setSectorId(rs.getInt(3));
    l.add(n);
    }
    }catch(Exception e){
    
    }
    return l;
    }
}
