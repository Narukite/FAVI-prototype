package com.thelatenightstudio.favi.addfundmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thelatenightstudio.favi.R

class AddFundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_fund)

        //Set the name of activity in top bar
        title = getString(R.string.request_fund)

    }
}