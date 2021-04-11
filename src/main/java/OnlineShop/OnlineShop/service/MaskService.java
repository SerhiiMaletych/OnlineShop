package OnlineShop.OnlineShop.service;

import OnlineShop.OnlineShop.model.Mask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;


public interface MaskService {

    List<Mask> findAll();

    Page<Mask> findAll(Pageable pageable);

    Page<Mask> findByPriceBetween(Integer startingPrice, Integer endingPrice, Pageable pageable);

    Page<Mask> findByManufacturer(String manufacturer, Pageable pageable);

    Page<Mask> findByMaterial(String material, Pageable pageable);

    Page<Mask> findByManufacturerOrMaskTitle(String manufacturer, String maskTitle, Pageable pageable);

    Page<Mask> findByManufacturerIn(List<String> manufacturers, Pageable pageable);


    BigDecimal minPerfumePrice();


    BigDecimal maxPerfumePrice();


    void saveProductInfoById(String maskTitle, String manufacturer, Integer year, String country, String material,
                             String description, String filename, Integer price, String color, Long id);

    Mask save(Mask mask);
}
