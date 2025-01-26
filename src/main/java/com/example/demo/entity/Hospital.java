package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Hospital_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
	@Id
	private int hId;
	private String hName;

    @OneToMany(mappedBy = "hospital")
    private List<Patient> patients;

    @OneToMany(mappedBy = "hospital")
    private List<Department> departments;
}
