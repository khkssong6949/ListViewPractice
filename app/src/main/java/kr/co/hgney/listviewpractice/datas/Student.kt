package kr.co.hgney.listviewpractice.datas

class Student(val name:String, val birthYear: Int, val isMale:Boolean) {

    fun getKoreanAge(year: Int) : Int {
        return year - this.birthYear + 1
    }

}