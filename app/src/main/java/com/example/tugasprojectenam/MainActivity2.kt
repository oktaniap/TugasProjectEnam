package com.example.tugasprojectenam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intentThatStartedThisActivity = getIntent()

        val nama = intentThatStartedThisActivity.getStringExtra("nama")
        val lokasi = intentThatStartedThisActivity.getStringExtra("lokasi")
        val gambar = intentThatStartedThisActivity.getIntExtra("gambar", 0)
        val deskripsi = intentThatStartedThisActivity.getStringExtra("deskripsi")

        val aksi : ActionBar?=supportActionBar
        aksi!!.setDisplayHomeAsUpEnabled(true)
        aksi!!.setDisplayShowHomeEnabled(true)
        aksi.setTitle(nama)
        textView3.text = nama
        textView4.text = lokasi
        imageView.setImageResource(gambar)
        textView5.text = deskripsi
    }
}