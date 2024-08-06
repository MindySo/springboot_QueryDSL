package kr.co.jhta.app.springboot_querydsl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDateTime hiredate;
    private Integer sal;
    private Integer comm;

    @ManyToOne
    @JoinColumn(name = "deptno")
    private Dept dept;

    @ManyToOne
    @JoinColumn(name = "no")
    private Salgrade salgrade;

}
