package kr.ac.kumoh.ce.s20240058.mysqlrobot

import org.springframework.stereotype.Service

@Service
// val repo: Robot -> 타입만 알아서 지정해주면 의존성 주입 알아서 해줌
class RobotService(val repository: RobotRepository) {
    // findall jpaRepo가 만들어줌
//    fun getAllRobots(): List<Robot> { return repository.findAll() }
    fun getAllRobots(): List<Robot> = repository.findAll()
    fun getRobotWithWeapons(): List<EquipmentDto> = repository.findAllEquipment()
}