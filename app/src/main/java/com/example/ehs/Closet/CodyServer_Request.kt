package com.example.ehs.Closet

import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest



class CodyServer_Request(
    userId : String,
    listener: Response.Listener<String?>?) : StringRequest(Method.POST, URL, listener, null) {

    private val map: MutableMap<String, String>

    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String> {
        return map
    }

    companion object {
        //서버 URL 설정(php 파일 연동)
        private const val URL = "http://54.180.101.123/CodyServer_Request.php"
    }

    init {
        map = HashMap()
        map["userId"] = userId
    }
}

