package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.request.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
