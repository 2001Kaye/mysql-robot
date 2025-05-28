package kr.ac.kumoh.ce.s20240058.mysqlrobot

import jakarta.persistence.*

@Entity
@Table(name = "Mechanic") // 파일명과 table 명 같으면 지정 안해줘도 됨
data class Robot(
    @Id
    // 자동으로 id 생성
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int, // 타입일 땐 콜론을 띄우지 않고 붙이기
    var name: String,
    var model: String,
    var manufacturer: String,
    @Column(name = "class") // db에 class로 되어 있음 원래는 class:로 쓰고 싶었는데 키워드라서 못 썽...
    var robotClass: String,
    // db에 스네이크 케이스, 여기엔 카멜 케이스로 써도 동일함
)

// 이름이 동일하면 따로 지정하지 않아도 됨
@Entity
data class Weapon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val type: String,
    val damage: Int,
    val ability: String,
)

@Entity
data class Equipment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var mechanicId: Int,
    var weaponId: Int,
    val location: String,
    val quantity: Int
)
