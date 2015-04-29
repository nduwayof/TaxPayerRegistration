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
public class Industry {
    private int id;
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

    public Industry() {
    }
    
    public void saveIndustry(){
    try{
        if(valid){
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into industry values(id,?,?)");
        djuma.setString(1, name);
        djuma.setString(2, description);
        djuma.execute();
        info="new Industry is successfully added";
        }
    }catch(Exception e){
    error="Try Again";
    valid=false;
    }
    
    }
    
    public static List<Industry>listIndistry(){
    List<Industry>list=new ArrayList<Industry>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from industry");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Industry i=new Industry();
        i.setId(rs.getInt(1));
        i.setName(rs.getString(2));
        i.setDescription(rs.getString(3));
        list.add(i);
        }
    }catch(Exception e){
    
    }
    
    return list;
    }
}
