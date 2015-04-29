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
public class Sector {
    private int id;
    private int industryId;
    private String name="";
    private String description="";
    private String info;
    private String error;
    private boolean valid=true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
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

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Sector() {
    }
    
    
    public void saveSector(){
    try{
        if(valid){
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into sector values(id,?,?,?)");
        djuma.setString(1, name);
        djuma.setString(2, description);
        djuma.setInt(3, industryId);
        djuma.execute();
        info="New Sector is successfully added";
        }   
    }catch(Exception e){
    error="Try Again";
    valid=false;
    }
    
    
    }
    
    public static List<Sector>listSector(){
    List<Sector>list=new ArrayList<Sector>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from sector");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Sector i=new Sector();
        i.setId(rs.getInt(1));
        i.setName(rs.getString(2));
        i.setDescription(rs.getString(3));
        i.setIndustryId(rs.getInt(4));
        list.add(i);
        }
    }catch(Exception e){
    
    }
    
    return list;
    }
}
