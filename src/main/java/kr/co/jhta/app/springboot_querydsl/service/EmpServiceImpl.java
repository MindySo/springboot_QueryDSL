package kr.co.jhta.app.springboot_querydsl.service;

import kr.co.jhta.app.springboot_querydsl.domain.*;
import kr.co.jhta.app.springboot_querydsl.dto.EmpDeptSalgradeDTO;
import kr.co.jhta.app.springboot_querydsl.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService {
    private final EmpRepository empRepository;
//    private final JPAQueryFactory queryFactory;

    @Override
    public List<Emp> findAll() {
        return empRepository.findAll();
    }

    @Override
    public Emp findOne(Long empno) {
        return empRepository.findById(empno).orElse(null);
    }

    @Override
    public List<Emp> getNativeQueryData(Long empno) {
        return empRepository.getNativeQuery(empno);
    }

    @Override
    public List<EmpDeptSalgradeDTO> getJoinData(Long empno) {
        return empRepository.getJoinDataOne(empno);
    }

    @Override
    public List<Emp> getLimitData(int no) {
        List<Emp> limitData = empRepository.getLimitData(no);
        return limitData;
    }

    @Override
    public List<Emp> getDynamicData(String keyword, int sal) {
        List<Emp> dynamicData = empRepository.getDynamicData(keyword, sal);
        return dynamicData;
    }

}
