package kr.co.jhta.app.springboot_querydsl.repository;

import kr.co.jhta.app.springboot_querydsl.domain.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Long> {

}
