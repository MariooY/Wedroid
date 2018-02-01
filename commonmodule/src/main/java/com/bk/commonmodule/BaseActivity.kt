package com.bk.commonmodule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.common_module_activity_base)
    }
}
