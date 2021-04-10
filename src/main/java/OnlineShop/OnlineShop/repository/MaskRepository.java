package OnlineShop.OnlineShop.repository;

import OnlineShop.OnlineShop.model.Mask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

public interface MaskRepository extends JpaRepository<Mask, Long> {

    Page<Mask> findAll(Pageable pageable);

    Page<Mask> findByPriceBetween(Integer startingPrice, Integer endingPrice, Pageable pageable);

    Page<Mask> findByManufacturer(String manufacturer, Pageable pageable);

    Page<Mask> findByMaterial(String material, Pageable pageable);

    Page<Mask> findByManufacturerOrMaskTitle(String manufacturer, String maskTitle, Pageable pageable);

    Page<Mask> findByManufacturerIn (List<String> manufacturers, Pageable pageable);

    @Query(value = "SELECT min(price) FROM Mask ")
    BigDecimal minMaskPrice();

    @Query(value = "SELECT max(price) FROM Mask ")
    BigDecimal maxMaskPrice();

    @Modifying
    @Transactional
    @Query("update Mask m set m.maskTitle = ?1, m.manufacturer = ?2, m.year = ?3, m.country = ?4, " +
            "m.material = ?5, m.description = ?6, m.filename = ?7, m.price = ?8, m.color = ?9  where m.id = ?10")
    void saveProductInfoById(String maskTitle, String manufacturer, Integer year, String country, String material,
                             String description, String filename, Integer price, String color,  Long id);
}

