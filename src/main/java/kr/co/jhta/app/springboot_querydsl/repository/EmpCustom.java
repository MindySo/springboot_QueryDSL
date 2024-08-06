package kr.co.jhta.app.springboot_querydsl.repository;

import kr.co.jhta.app.springboot_querydsl.domain.Emp;
import kr.co.jhta.app.springboot_querydsl.dto.EmpDeptSalgradeDTO;

import java.util.List;

public interface EmpCustom {
    List<EmpDeptSalgradeDTO> getJoinDataOne(Long empno);
    public List<Emp> getLimitData(int no);
    public List<Emp> getDynamicData(String keyword, int sal);
}
