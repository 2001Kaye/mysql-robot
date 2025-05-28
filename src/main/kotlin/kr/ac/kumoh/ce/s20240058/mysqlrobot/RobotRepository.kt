package kr.ac.kumoh.ce.s20240058.mysqlrobot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RobotRepository : JpaRepository<Robot, Int> {
}