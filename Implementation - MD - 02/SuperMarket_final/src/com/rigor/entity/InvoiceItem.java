package com.rigor.entity;
/* Entity class for Invoiceitem


 * 
 * Copyright (c) Virtusa Corporation 2016, All Rights Reserved.
 * 
 * This is the entity class for invoiceItem which is used to generate table name and create relevant fields for the table.
 * 
 * @author Madara Dayananda
 * 
 * @version 1.0
 * 
 * @see also InvoiceItemDAO.java,
 * InvoiceItemDAOImpl.java,
 * InvoiceItemService.java,
 * InvoiceItemServiceImpl.java,InvoiceItemController.java classes
 * */


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="invoiceItem")
public class InvoiceItem {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Invoice_ID")
private int invoiceID;

@Column(name="Item_ID")
private int itemID;

@Column(name="Item_Amount")
private double amount;

/*@OneToMany(mappedBy="invoiceItem")
private Set<Product> products;*/


public int getInvoiceID() {
	return invoiceID;
}
public void setInvoiceID(int invoiceID) {
	this.invoiceID = invoiceID;
}
public int getItemID() {
	return itemID;
}
public void setItemID(int itemID) {
	this.itemID = itemID;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}



}
