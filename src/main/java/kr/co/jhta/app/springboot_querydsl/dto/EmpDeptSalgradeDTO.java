package kr.co.jhta.app.springboot_querydsl.dto;

import kr.co.jhta.app.springboot_querydsl.domain.Dept;
import kr.co.jhta.app.springboot_querydsl.domain.Salgrade;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class EmpDeptSalgradeDTO {
    private Long empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDateTime hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;
    private Long no;

    private String dname;
    private String loc;

    private Integer grade;
    private Integer losal;
    private Integer hisal;

}
