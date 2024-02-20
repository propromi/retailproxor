package kz.proxor.retailproxor.repositories;

import kz.proxor.retailproxor.domain.Purch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchRepository extends JpaRepository<Purch, Long> {
}
