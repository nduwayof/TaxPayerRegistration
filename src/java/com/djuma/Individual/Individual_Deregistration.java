/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author SULAIMAN
 */
public class Individual_Deregistration {
 private int deregisterId;
 private String tinNumber;
 private String thereason;
 private String info;
 private String error;
 private Timestamp doneAt= new Timestamp(new Date().getTime());
 private String doneBy="";
 private boolean valid=true;
 private int individualId;

    public int getDeregisterId() {
        return deregisterId;
    }

    public void setDeregisterId(int deregisterId) {
        this.deregisterId = deregisterId;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getThereason() {
        return thereason;
    }

    public void setThereason(String thereason) {
        this.thereason = thereason;
    }

   

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Timestamp getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Timestamp doneAt) {
        this.doneAt = doneAt;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public Individual_Deregistration() {
    }
 
 public void Deregister(){
 try{
     String names="";
     boolean checkTin=false;
     boolean checkAlreadyDeregistered=false;
     for(Individual in: Individual.listIndividual()){
     if(in.getTinNumber().equalsIgnoreCase(tinNumber)&&in.isHasInfo()){
     checkTin=true;
     names=in.getOwnerSurname() +" "+in.getOwnerFirstName();
     individualId=in.getIndividualId();
     }
     }
     if(checkTin){
     for(Individual in: Individual.listIndividual()){
     if(in.getTinNumber().equalsIgnoreCase(tinNumber)&&in.isDeRegistered()&&in.isHasInfo()){
     checkAlreadyDeregistered=true;
     }
     }
     if(checkAlreadyDeregistered==false){
     if(valid){
     PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_deregistration values(id,?,?,?,?)");
     djuma.setInt(1, individualId);
     djuma.setString(2, thereason);
     djuma.setString(3, doneBy);
     djuma.setTimestamp(4, doneAt);
     djuma.execute();     
     PreparedStatement suleiman=SetCon.getCon().prepareStatement("update individual set  deRegistered=? where id=?");
     suleiman.setBoolean(1, true);
     suleiman.setInt(2, individualId);
     suleiman.execute();
     info=names+" is successfully deregistered";
     }
     }else{
     error=""+names+" is already deregistered";
     valid=false;
     }
     }else{
     error="Such TIN doesn't exist.Try Again";
     valid=false;
     }
 }catch(Exception e){
 error="Try Again";
 valid=false;
 }
 }
}
