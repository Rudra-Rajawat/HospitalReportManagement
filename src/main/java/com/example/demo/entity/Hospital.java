package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Patient_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
	private int hId;
	private String hName;
}
