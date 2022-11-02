package com.kodlama.io.rentACar.business.abstracts;

import com.kodlama.io.rentACar.business.requests.CreateBrandRequest;
import com.kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import com.kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
