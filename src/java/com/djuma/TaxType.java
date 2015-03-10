/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author SULAIMAN
 */
public class TaxType {
    private int id;
    private String taxType;
    private String description;
    private String error;
    private String info;
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private String doneBy="";
    private boolean deletedStatus=false;
    private boolean valid=true;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public TaxType() {
    }
    
   public void save(){
   try{
       if(valid){
       PreparedStatement st=SetCon.getCon().prepareStatement("insert into taxType values(id,?,?,?,?,?)");
       st.setString(1, taxType);
       st.setString(2, description);
        st.setTimestamp(3, doneAt);
        st.setString(4, doneBy);
        st.setBoolean(5, deletedStatus);
        st.execute();
        info="New TaxPayerType Added";
       }
   }catch(Exception e){
   error="Try Again";
   valid=false;
   }
   }
   public static List<TaxType>listTaxType(){
    List<TaxType>list=new ArrayList<TaxType>();
    
    try{
    PreparedStatement st=SetCon.getCon().prepareStatement("select * from taxType");
        ResultSet rs=st.executeQuery();
        while(rs.next()){
        TaxType t=new TaxType();
        t.setId(rs.getInt(1));
        t.setTaxType(rs.getString(2));
        t.setDescription(rs.getString(3));
        t.setDoneAt(rs.getTimestamp(4));
        t.setDoneBy(rs.getString(5));
        t.setDeletedStatus(rs.getBoolean(6));
        list.add(t);
        }
    }catch(Exception e){
    
    }
    
    return list;
    }
}
