package kr.co.jhta.app.springboot_querydsl.repository;

import kr.co.jhta.app.springboot_querydsl.domain.Salgrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalgradeRepository extends JpaRepository<Salgrade, Long> {
}
