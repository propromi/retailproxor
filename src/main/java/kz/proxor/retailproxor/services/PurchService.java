package kz.proxor.retailproxor.services;

import kz.proxor.retailproxor.domain.Purch;
import kz.proxor.retailproxor.repositories.IPurchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PurchService {
    private final IPurchRepository purchRepository;

    public List<Purch> getPurchList(){
        return purchRepository.findAll();
    }

    public void savePurch(Purch purch){
        log.info("Saving new product: {}", purch);
        purchRepository.save(purch);
    }

    public void deletePurch(long id){
        purchRepository.deleteById(id);
    }

    public Purch getPurchById(long id) {
        return purchRepository.findById(id).orElse(null);
    }
}
