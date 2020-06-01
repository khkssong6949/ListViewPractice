package kr.co.hgney.listviewpractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    //추상메소드
    abstract fun setupEvents()
    abstract fun setValues()

}