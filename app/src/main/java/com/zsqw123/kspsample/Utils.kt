package com.zsqw123.kspsample

import android.app.Activity
import android.content.Intent

/**
 * Author zsqw123
 * Create by damyjy
 * Date 2021/8/8 16:53
 */

inline fun <reified T> Activity.startAct() {
    startActivity(Intent(this, T::class.java))
}