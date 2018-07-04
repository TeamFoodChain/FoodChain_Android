package com.team.foodchain

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v){
            page_store_btn->{
                clearSelected()
                page_store_btn.isSelected = true
                replaceFragment(StoreTab())
            }
            page_ref_btn->{
                clearSelected()
                page_ref_btn.isSelected = true
                replaceFragment(RefTab())
            }
            page_alarm_btn->{
                clearSelected()
                page_alarm_btn.isSelected = true
                replaceFragment(AlarmTab())
            }
            page_setting_btn->{
                clearSelected()
                page_setting_btn.isSelected = true
                replaceFragment(SetTab())
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }



    /*fun addFragment(fragment:Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.main_frame, fragment)
        transaction.commit()
    }*/

    fun replaceFragment(fragment: Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.main_frame,fragment)
        transaction.addToBackStack(null) //backbutton시 전 fragment로
        transaction.commit()
    }

    fun clearSelected(){
        page_store_btn.isSelected = false
        page_ref_btn.isSelected = false
        page_alarm_btn.isSelected = false
        page_setting_btn.isSelected = false
    }
}
