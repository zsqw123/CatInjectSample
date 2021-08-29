package com.zsqw123.kspsample.ksp

import com.zsqw123.kspsample.IUser

/**
 * Author zsqw123
 * Create by damyjy
 * Date 2021/8/8 16:45
 */
class UserImpl : IUser {
    override fun getName(): String = "my-injected-user"
    override fun getAge(): Int = 1
}

class UserImpl2 : IUser {
    override fun getName(): String = "my-injected-user2"
    override fun getAge(): Int = 2
}

class UserImpl3 : IUser {
    override fun getName(): String = "my-injected3"
    override fun getAge(): Int = 3
}