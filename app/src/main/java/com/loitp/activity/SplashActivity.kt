package com.loitp.activity

import android.content.Intent
import android.os.Bundle
import com.annotation.LogTag
import com.core.base.BaseFontActivity
import com.core.common.Constants
import com.core.helper.mup.comic.ui.activity.ComicSplashActivity
import com.core.utilities.LActivityUtil
import com.loitp.R

@LogTag("SplashActivity")
class SplashActivity : BaseFontActivity() {

    override fun setLayoutResourceId(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, ComicSplashActivity::class.java)
        intent.putExtra(Constants.COMIC_ADMOB_ID_BANNER, getString(R.string.str_b))
        intent.putExtra(Constants.COMIC_SHOW_DONATION, true)
        startActivity(intent)
        LActivityUtil.transActivityNoAnimation(this)
        finish()
    }
}
