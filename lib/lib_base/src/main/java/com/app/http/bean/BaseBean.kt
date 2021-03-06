package com.app.http.bean

import java.io.Serializable

data class BaseBean<T>(var code: Int? = -1, var data: T?, var msg: String?) : Serializable {
    fun isSuccess(): Boolean {
        return code == 0
    }
}