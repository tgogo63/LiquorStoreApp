/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.liquorstoreapp;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author K W Tom Jr
 */
public class LiquorSelect {
    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        switch (type) {
            case WINE:
                brands.add("Adrianna Vineyard");
                brands.add(("J. P. Chenet"));
                break;
            case WHISKY:
                brands.add("Glenfiddich");
                brands.add("Johnnie Walker");
                break;
            case BEER:
                brands.add("Corona");
                break;
            default:
                brands.add("No Brand Available");
                break;
        }
    return brands;
}
}
