package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//select next_val as id_val from hibernate_sequence for update
//update hibernate_sequence set next_val= ? where next_val=?
//insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)

//generationType.IDENTITY  FOR THIS STRATERGY to work first we have to create a table in bisequeal database and explicitly specify the auto increment(AI)column as checked for the primary key column.In application.property file "spring.jpa.hibernate.ddl-auto = none" this should not be set if it set it should have value as update
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Product {
	//Auto is the default generation type is the strategy which the JPA should use or follow to generate primary key values,the default generation type is auto.when strategy is not specified JPA uses auto strategy
	//When the underline database is mysql GenerationType.AUTO means the JPA will create a hibernate sequence in the database for the generation of primary keys
	@Getter
	@Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long productId;
//	@Column(name="productName")
	private String name;
	private String description;
	private int qty;
	private BigDecimal price;
	
	
	
//	public int getQty() {
//		return qty;
//			}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}

}
