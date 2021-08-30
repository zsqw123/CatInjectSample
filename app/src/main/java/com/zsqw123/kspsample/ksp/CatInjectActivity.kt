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
class CatInjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user0 = CatInjects.getAllInstances<IUser>().first { it.getAge() == 3 }
        val user10 = CatInjects.getAllInstances<IUser>().first { it.getAge() == 1 }
        val user11 = CatInjects.getAllInstances<IUser>().first { it.getAge() == 1 }
        ActKspBinding.inflate(layoutInflater).apply {
            setContentView(root)
            val text = "name:${user0.getName()}\nage:${user0.getAge()}\n" +
                "user10===user11:${user10 === user11}"
            kspTv.text = text
        }
    }
}