package com.zsqw123.kspsample

import com.zsqw123.inject.CatInject


/**
 * Author zsqw123
 * Create by damyjy
 * Date 2021/8/8 16:44
 */
@CatInject
interface IUser {
    fun getName(): String
    fun getAge(): Int
}