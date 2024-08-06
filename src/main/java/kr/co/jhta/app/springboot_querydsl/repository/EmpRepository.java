package kr.co.jhta.app.springboot_querydsl.repository;

import kr.co.jhta.app.springboot_querydsl.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Long>, EmpCustom {
    // JPQL(Java Persistence Query Language)
    // findxxxx();

    // 사원 이름으로 검색
    List<Emp> findAllByEnameContainingOrderByEmpnoDesc(String ename);

    @Query(value =
            "select e.empno, e.ename, e.sal, e.job, e.mgr, e.comm, e.hiredate, e.no, e.deptno, d.dname, d.loc, s.grade, s.losal, s.hisal\n" +
            "from emp e\n" +
            "join dept d on e.deptno = d.deptno\n" +
            "join salgrade s on e.no = s.no\n" +
            "where e.empno = :empno", nativeQuery = true)
    public List<Emp> getNativeQuery(@Param("empno") Long empno);

}

