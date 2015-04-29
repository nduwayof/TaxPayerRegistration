/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Sector;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class Sub_Sector {
    private int id;
    private String name;
    private String description="";
    private int sectorId;
    private boolean valid=true;
    private String info;
    private String error;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    

    public Sub_Sector() {
    }
    
    public void saveSubSector(){
    try{
       try{
        if(valid){
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into sub_sector values(id,?,?,?)");
        djuma.setString(1, name);
        djuma.setString(2, description);
        djuma.setInt(3, sectorId);
        djuma.execute();
        info="New Sector is successfully added";
        }   
    }catch(Exception e){
    error="Try Again";
    valid=false;
    }
    
    
    }catch(Exception e){
    
    }
    
    }
    public static List<Sub_Sector>listSubSector(){
    List<Sub_Sector>list=new ArrayList<Sub_Sector>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from sub_sector");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Sub_Sector i=new Sub_Sector();
        i.setId(rs.getInt(1));
        i.setName(rs.getString(2));
        i.setDescription(rs.getString(3));
        i.setSectorId(rs.getInt(4));
        list.add(i);
        }
    }catch(Exception e){
    
    }
    
    return list;
    }
}
