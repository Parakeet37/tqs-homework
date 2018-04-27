package com.mycompany.homework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean
@ApplicationScoped
public class Coins implements Serializable{

    public String qty;
    public String convertedQty;
    public String convertTo;
    public String convertFrom;
    private final String API_KEY = "";
    private final String BASE_URL = "";
    
    public Coins(){
        qty = "";
        convertedQty = "";
    }
    
    public void setQuantity(String qty){
        this.qty = qty;
    }
    
    public String getQuantity(){
        return qty;
    }
    
    public void setConvertedQuantity(String qty){
        this.convertedQty = qty;
    }
    
    public String getConvertedQuantity(){
        return convertedQty;
    }
    
    public void setConvertTo(String coin){
        this.convertTo = coin;
    }
    
    public String getConvertTo(){
        return convertTo;
    }
    
    public void setConvertFrom(String coin){
        this.convertFrom = coin;
    }
    
    public String getConvertFrom(){
        return convertFrom;
    }
    
    public List<String> getCoinsList(){
        List<String> coinsList = new ArrayList<>();
        coinsList.add("EUR");
        coinsList.add("DOL");
        return coinsList;
    }
    
    public String convert(){
        setQuantity(qty);
        setConvertedQuantity(qty+" "+convertTo);
        return "index.xhtml";
    }
}
