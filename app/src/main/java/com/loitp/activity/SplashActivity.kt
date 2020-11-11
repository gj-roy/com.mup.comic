package com.loitp.activity

import android.annotation.SuppressLint
import android.os.Bundle
import com.annotation.LogTag
import com.core.base.BaseFontActivity
import com.loitp.R

@LogTag("SplashActivity")
class SplashActivity : BaseFontActivity() {

    override fun setLayoutResourceId(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
    }

    @SuppressLint("SetTextI18n")
    private fun setupViews() {

    }
}
