package com.kodlama.io.rentACar.webApi.controllers;

import com.kodlama.io.rentACar.business.abstracts.BrandService;
import com.kodlama.io.rentACar.business.requests.CreateBrandRequest;
import com.kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import com.kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   //Annotation(anotasyon)
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){

        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

}
