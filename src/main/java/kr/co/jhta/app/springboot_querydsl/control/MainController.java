package kr.co.jhta.app.springboot_querydsl.control;

import jakarta.transaction.Transactional;
import kr.co.jhta.app.springboot_querydsl.domain.Emp;
import kr.co.jhta.app.springboot_querydsl.dto.EmpDeptSalgradeDTO;
import kr.co.jhta.app.springboot_querydsl.service.EmpService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {
    private final EmpService empService;

    @GetMapping("/main")    // 사원 전체 데이터를 가져오기
    public ResponseEntity joinTest(){
        List<Emp> list = empService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/main/{empno}")
    public ResponseEntity joinTest(@PathVariable("empno") Long empno){
        Emp e = empService.findOne(empno);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/main2/{empno}")
    public ResponseEntity joinTest2(@PathVariable("empno") Long empno){
        List<Emp> nativeQueryData = empService.getNativeQueryData(empno);
        return ResponseEntity.ok(nativeQueryData);
    }

    @GetMapping("/main3/{empno}")
    public ResponseEntity joinTest3(@PathVariable("empno") Long empno){
        List<EmpDeptSalgradeDTO> joinData = empService.getJoinData(empno);
        return ResponseEntity.ok(joinData);
    }

    @GetMapping("/main4/{no}")
    public ResponseEntity getLimitTest(@PathVariable("no") int no){
        List<Emp> limitData = empService.getLimitData(no);
        return ResponseEntity.ok(limitData);
    }

    @Transactional
    @GetMapping("/main5/{keyword}/{sal}")
    public ResponseEntity getDynamicSql(@PathVariable("keyword") String keyword, @PathVariable("sal") int sal){
        List<Emp> dynamicData = empService.getDynamicData(keyword, sal);
        return ResponseEntity.ok(dynamicData);
    }

}
