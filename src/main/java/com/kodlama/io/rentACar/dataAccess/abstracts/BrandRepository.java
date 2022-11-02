package com.kodlama.io.rentACar.dataAccess.abstracts;

import com.kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


//Bu sınıf bir dataAccess nesnesidir
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}


//