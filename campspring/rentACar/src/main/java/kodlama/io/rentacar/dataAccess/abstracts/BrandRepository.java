package kodlama.io.rentacar.dataAccess.abstracts;


import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {

    List<Brand> getAll();
}
