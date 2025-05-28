package kr.ac.kumoh.ce.s20240058.mysqlrobot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/robots")
class RobotController(val service: RobotService) {
//    @GetMapping("/")
//    fun welcome(): String{
//        return "Welcome to Robot Server!"
//    }
//    fun welcome() = "Welcome to Robot Server!"

    @GetMapping
    // 반환값 List<Robot>도 가능, 결과 코드 같이 출력해주고 싶을 떄 감싸주기
    fun getAllRobots(): ResponseEntity<List<Robot>> {
        val robots = service.getAllRobots()
        return ResponseEntity.ok(robots)
    }

    @GetMapping("/with-weapons")
    fun getRobotsWithWeapons(): ResponseEntity<List<EquipmentDto>> {
        return ResponseEntity.ok(service.getRobotWithWeapons())
    }
}