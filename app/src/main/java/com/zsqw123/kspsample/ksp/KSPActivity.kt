package com.zsqw123.kspsample.ksp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zsqw123.inject.CatInjects
import com.zsqw123.kspsample.IUser
import com.zsqw123.kspsample.databinding.ActKspBinding

/**
 * Author zsqw123
 * Date 2021/8/8 16:43
 */
class KSPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = CatInjects.getAllInstances<IUser>().first { it.getAge() == 3 }
        ActKspBinding.inflate(layoutInflater).apply {
            setContentView(root)
            val text = "name:${user.getName()}\nage:${user.getAge()}"
            kspTv.text = text
        }
    }
}