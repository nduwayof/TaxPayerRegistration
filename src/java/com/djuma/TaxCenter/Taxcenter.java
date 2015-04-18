/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.TaxCenter;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class Taxcenter {
    private long id;
    private String code;
    private String name;
    private String description;
   private boolean deletedStatus=false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Taxcenter() {
    }
   
   public void Save(){
   try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into taxcenter values(id,?,?,?,?)");
       djuma.setString(1, code);
       djuma.setString(2, name);
       djuma.setString(3, description);
       djuma.setBoolean(4, deletedStatus);
       djuma.execute();
   }catch(Exception e){
   
   }
   }
   
   public static List<Taxcenter>listTaxcenter(){
   List<Taxcenter>list=new ArrayList<>();
   
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from taxcenter");
       ResultSet rs=djuma.executeQuery();
       while(rs.next()){
           Taxcenter t=new Taxcenter();
           t.setId(rs.getLong(1));
           t.setCode(rs.getString(2));
           t.setName(rs.getString(3));
           t.setDescription(rs.getString(4));
           t.setDeletedStatus(rs.getBoolean(5));
           list.add(t);
       }
   }catch(Exception e){
   
   }
   return list;
   }
}
