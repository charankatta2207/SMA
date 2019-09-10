package com.geekbadi.store_management_application.models;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name="products")
@Embeddable
public class Product implements Serializable
{
    @Id
    @Column(name="id")
    int id;
    @NotEmpty
    @Column(name="name")
    String name;
    @Column(name="quantity")
    int quantity;
    @Column(name="unitprice")
    int unitPrice;
    @NotEmpty
    @Column(name="expiredate")
    String expireDate;
    public Product(){};
    public Product(int id,String name,int quantity,int unitPrice,String expireDate)
    {
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
        this.expireDate=expireDate;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public int getUnitPrice()
    {
        return this.unitPrice;
    }
    public String getExpireDate()
    {
        return this.expireDate;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void setUnitPrice(int unitPrice)
    {
        this.unitPrice=unitPrice;
    }
    public void setExpireDate(String expireDate)
    {
        this.expireDate=expireDate;
    }





}