package com.zsqw123.kspsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zsqw123.kspsample.databinding.ActivityMainBinding
import com.zsqw123.kspsample.ksp.CatInjectActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            mainBtCat.setOnClickListener { startAct<CatInjectActivity>() }
        }
    }
}