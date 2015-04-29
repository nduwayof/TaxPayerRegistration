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
public class NonIndividual_Owners {
    private int ownerId;
    private String tinNumber;
    private String names;
    private String parcentage;
    private int nonIndividualId;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getParcentage() {
        return parcentage;
    }

    public void setParcentage(String parcentage) {
        this.parcentage = parcentage;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Owners(String tinNumber, String names, String parcentage, int nonIndividualId) {
        this.tinNumber = tinNumber;
        this.names = names;
        this.parcentage = parcentage;
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Owners() {
    }
    
    
    public void saveOwners(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_Owners values(id,?,?,?,?)");
        djuma.setString(1, tinNumber);
        djuma.setString(2, names);
        djuma.setDouble(3, Double.parseDouble(parcentage));
        djuma.setInt(4, nonIndividualId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    public static List<NonIndividual_Owners>listNonIndividualOwners(){
    List<NonIndividual_Owners>list=new ArrayList<NonIndividual_Owners>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_Owners ");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        NonIndividual_Owners n=new NonIndividual_Owners();
        n.setOwnerId(rs.getInt(1));
        n.setTinNumber(rs.getString(2));
        n.setNames(rs.getString(3));
        n.setParcentage(rs.getDouble(4)+"");
        n.setNonIndividualId(rs.getInt(5));
        list.add(n);
        }
    }catch(Exception e){}
    return list;
    }
    
    
    public static List<NonIndividual_Owners>listNonIndividuaPerlOwners(int indId){
    List<NonIndividual_Owners>list=new ArrayList<NonIndividual_Owners>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_Owners where NonIndividualId=?");
    djuma.setInt(1, indId);
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        NonIndividual_Owners n=new NonIndividual_Owners();
        n.setOwnerId(rs.getInt(1));
        n.setTinNumber(rs.getString(2));
        n.setNames(rs.getString(3));
        n.setParcentage(rs.getDouble(4)+"");
        n.setNonIndividualId(rs.getInt(5));
        list.add(n);
        }
    }catch(Exception e){}
    return list;
    }
}
