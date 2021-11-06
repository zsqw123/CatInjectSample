package com.zsqw123.kspsample.ksp

import com.zsqw123.inject.CatInject
import com.zsqw123.kspsample.IUser

/**
 * Author zsqw123
 * Create by damyjy
 * Date 2021/8/8 16:45
 */
@CatInject
class UserImpadsasdl : IUser {
    override fun getName(): String = "my-injected-user"
    override fun getAge(): Int = 1
}

@CatInject
class UserImpl2 : IUser {
    override fun getName(): String = "my-injected-user2"
    override fun getAge(): Int = 6666
}

@CatInject
class UserImplsdadsa3 : IUser {
    override fun getName(): String = "my-injected3333"
    override fun getAge(): Int = 3
}