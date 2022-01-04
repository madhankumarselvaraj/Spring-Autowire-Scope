/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.autowire.bytype;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class Address {

private String fulladdress;
private String name;

public Address() {
}

public String getFulladdress() {
    return fulladdress;
}

public void setFulladdress(String fulladdress) {
    this.fulladdress = fulladdress;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

}
