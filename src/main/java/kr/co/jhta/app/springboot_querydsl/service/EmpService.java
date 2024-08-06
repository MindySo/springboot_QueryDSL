package kr.co.jhta.app.springboot_querydsl.service;

import kr.co.jhta.app.springboot_querydsl.domain.Emp;
import kr.co.jhta.app.springboot_querydsl.dto.EmpDeptSalgradeDTO;

import java.util.List;

public interface EmpService {
    public List<Emp> findAll();
    public Emp findOne(Long id);
    public List<Emp> getNativeQueryData(Long empno);
    public List<EmpDeptSalgradeDTO> getJoinData(Long empno);
    public List<Emp> getLimitData(int no);
    public List<Emp> getDynamicData(String keyword, int sal);
}
