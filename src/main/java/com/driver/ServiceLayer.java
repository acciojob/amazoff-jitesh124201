package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
    @Autowired
    AmazonRepository amazonRepository;

    public void addOrder(Order order){
        amazonRepository.addOrderRepo(order);
    }

    public void addPartner(String partnerId){
        DeliveryPartner partner = new DeliveryPartner(partnerId);
        amazonRepository.addPartnerRepo(partner);
    }

    public Order getOrderRepo(String id){
        return amazonRepository.getorder(id);
    }

    public DeliveryPartner getPartnerRepo(String id){
        return amazonRepository.getPartner(id);
    }

    public List<String> alllistOrder(){
        List<String> list = amazonRepository.allorder();
        return list;
    }



}
