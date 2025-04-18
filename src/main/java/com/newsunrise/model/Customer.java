package com.newsunrise.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter y Setter
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con argumentos
@Entity
//@Table(name="customers", schema="sistemas")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCustomer; // 1,2,3,4,5
	
	@Column(nullable = false, length = 15) //name="documento")
	private String dni; // 70751245, 4631529, 000124557
	
	@Column(nullable=false, length = 100)
	private String lastName;
	
	@Column(nullable = false, length = 100)
	private String firstName;
	
	@Column(nullable = true, length = 200)
	private String address;
	
	@Column(nullable = true, length = 50)
	private String phoneNumber;

	
	//public Customer() {}

	/*
	public Customer(Integer idCustomer, String nombre) {
		this.idCustomer = idCustomer;
		this.nombre = nombre;
	}
	*/
	
	/*
	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
*/
}
