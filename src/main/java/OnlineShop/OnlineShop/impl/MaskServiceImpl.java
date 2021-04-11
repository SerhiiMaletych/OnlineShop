package OnlineShop.OnlineShop.impl;

import OnlineShop.OnlineShop.model.Mask;
import OnlineShop.OnlineShop.repository.MaskRepository;
import OnlineShop.OnlineShop.service.MaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MaskServiceImpl implements MaskService {

    private final MaskRepository maskRepository;

    public MaskServiceImpl(MaskRepository maskRepository) {
        this.maskRepository = maskRepository;
    }

    @Override
    public List<Mask> findAll() {
        return maskRepository.findAll();
    }

    @Override
    public Page<Mask> findAll(Pageable pageable) {
        return maskRepository.findAll(pageable);
    }

    @Override
    public Page<Mask> findByPriceBetween(Integer startingPrice, Integer endingPrice, Pageable pageable) {
        return maskRepository.findByPriceBetween(startingPrice, endingPrice, pageable);
    }

    @Override
    public Page<Mask> findByManufacturer(String manufacturer, Pageable pageable) {
        return maskRepository.findByManufacturer(manufacturer, pageable);
    }

    @Override
    public Page<Mask> findByMaterial(String material, Pageable pageable) {
        return maskRepository.findByMaterial(material, pageable);
    }

    @Override
    public Page<Mask> findByManufacturerOrMaskTitle(String manufacturer, String maskTitle, Pageable pageable) {
        return maskRepository.findByManufacturerOrMaskTitle(manufacturer, maskTitle, pageable);
    }

    @Override
    public Page<Mask> findByManufacturerIn(List<String> manufacturers, Pageable pageable) {
        return maskRepository.findByManufacturerIn(manufacturers, pageable);
    }

    @Override
    public BigDecimal minPerfumePrice() {
        return maskRepository.minMaskPrice();
    }

    @Override
    public BigDecimal maxPerfumePrice() {
        return maskRepository.maxMaskPrice();
    }

    @Override
    public void saveProductInfoById(String maskTitle, String manufacturer, Integer year, String country,
                                    String material, String description, String filename, Integer price,
                                    String color, Long id) {
    maskRepository.saveProductInfoById(maskTitle, manufacturer, year, country, material, description,
            filename, price, color, id);
    }

    @Override
    public Mask save(Mask mask) {
        return maskRepository.save(mask);
    }
}
