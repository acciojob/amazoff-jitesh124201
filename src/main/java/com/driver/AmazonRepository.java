package com.driver;

import org.springframework.stereotype.Repository;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AmazonRepository {

    HashMap<String,Order> orderMap = new HashMap<>();
    HashMap<String,DeliveryPartner> deliveryPartnerMap = new HashMap<>();

    HashMap<DeliveryPartner,Order> pairboth = new HashMap<>();

   public void addOrderRepo(Order order){
       orderMap.put(order.getId(),order);
   }

    public void addPartnerRepo(DeliveryPartner deliveryPartner){
        deliveryPartnerMap.put(deliveryPartner.getId(),deliveryPartner);
    }

    public Order getorder(String id){
       Order order = orderMap.get(id);
       return order;
    }

    public DeliveryPartner getPartner(String id){
        DeliveryPartner deliveryPartner = deliveryPartnerMap.get(id);
        return deliveryPartner;
    }

    public List<String> allorder(){
       List<String> list =  new ArrayList<>();
       for(Map.Entry<String,Order> entry:orderMap.entrySet()){
           list.add(entry.getKey());
       }
       return list;
    }

    public void pairboth(String orderid,String partnerid){

    }
}
