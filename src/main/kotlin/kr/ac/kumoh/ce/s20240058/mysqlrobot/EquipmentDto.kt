package kr.ac.kumoh.ce.s20240058.mysqlrobot

// 내가 원하는 데이터만 가져오고 싶은 거 저장은 아닌것
// DTO: Data transfer object
data class EquipmentDto(
    // Left outer join이기에 null이 생길 수도 있음   
    // nullable type, 물음표 기호 사용
    val robotName: String,
    val model: String?,
    val robotClass: String?,
    val location: String?,
    val quantity: Int?,
    val weaponName: String?,
    val weaponType: String?,
    val damage: Int?,
    val ability: String?
)
