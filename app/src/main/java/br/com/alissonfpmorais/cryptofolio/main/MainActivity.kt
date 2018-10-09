package br.com.alissonfpmorais.cryptofolio.main

import android.os.Bundle
import br.com.alissonfpmorais.cryptofolio.R
import com.airbnb.mvrx.BaseMvRxActivity

class MainActivity : BaseMvRxActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
