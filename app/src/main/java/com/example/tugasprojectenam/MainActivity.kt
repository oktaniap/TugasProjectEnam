package com.example.tugasprojectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = createData()
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter(show, {data:data->itemclicked(data)})
    }

    private fun itemclicked(data:data){
        val showDetailActivityIntent = Intent(this, MainActivity2::class.java)
        showDetailActivityIntent.putExtra("nama", data.nama)
        showDetailActivityIntent.putExtra("lokasi", data.lokasi)
        showDetailActivityIntent.putExtra("gambar", data.gambar)
        showDetailActivityIntent.putExtra("deskripsi", data.desk)
        startActivity(showDetailActivityIntent)
    }

    private fun createData():List<data>{
        val ListData = ArrayList<data>()
        ListData.add(data("Zangrandi Ice Cream",
            "Jl. Yos Sudarso No. 15, Embong Kaliasin, Kec. Genteng",
            R.drawable.zangrandi,
            "Tempat berkumpul yang nyaman dengan suasana santai yang menyajikan berbagai " +
                    "macam kreasi makanan beku seperti ice cream"))
        ListData.add(data("Xi Bo Ba Merr - Rungkut",
            "Jl. Dr. Ir. H. Soekarno No. 104, Kedung Baruk, Kec. Rungkut",
            R.drawable.xiboba,
            "Minuman kekinian yaitu minuman dengan beragam varian " +
                    "rasa dengan toppping boba atau tepung kanji yang dibuat bulat"))
        ListData.add(data("Be Waffle",
            "Jl. Bkr Pelajar No. 34, Ketabang, Kec. Genteng",
            R.drawable.bewaffle,
            "Menyediakan hidangan pesta dan makanan penutup seperti ice cream, " +
                    "waffle, pancake dan roti bakar"))
        ListData.add(data("Janji Jiwa Petra",
            "Jl. Siwalankerto Timur No. 141D, Siwalankerto, Kec. Wonocolo",
            R.drawable.janjiw,
            "Kedai kekinian yang menyediakan makanan dan minuman seperti kopi dengan " +
                    "tempat yang unik"))
        ListData.add(data("MakMu",
            "Jl. Rungkut Kidul IV No. 32, Rungkut Kidul, Kec Rungkut",
            R.drawable.makmu,
            "Menyediakan makanan dan minuman yang beragam, dari kue yang lucu hingga " +
                    "makanan lengkap, dilengkapi dengan tempat yang cozy"))
        ListData.add(data("Bebini Gelati Cafe",
            "Jl. Dharmahusada No. 183-185, Mojo, Kec Gubeng",
            R. drawable.gelato,
            "Cafe milik chef kondang yaitu chef arnold, menyediakan makanan dan " +
                    "minuman dengan bahan utama yaitu gelato"))
        ListData.add(data("Ngikan",
            "Jl. Ngiden Semolo No. 101, Menur Pumpungan, Kec. Sukolilo",
            R.drawable.ngikan,
            "Tempat makan yang populer karena milik salah satu selebgram yaitu " +
                    "Rachel Venya, menyediakan nasi ayam dengan sambal"))
        ListData.add(data("Surabaya Patata",
            "Jl. Gubeng Masjid No. 35, Pacar Keling, Kec Tambaksari",
            R.drawable.patata,
            "Menyediakan berbagai roti kekinian yang ada di Surabaya"))
        ListData.add(data("Kober Mie Setan",
            "Jl. Khairil Anwar No. 25, Darmo, Kec. Wonokromo",
            R.drawable.kober,
            "Tempat makan dengan menu utama mie yang beragam varian pedasnya"))
        ListData.add(data("Baso Aci Juara",
            "Jl. Simo Gn. No. 59 Putat Jaya, Kec. Sawahan",
            R.drawable.baso,
            "Menyediakan makanan kekinian yaitu baso aci"))
        ListData.add(data("Seblak Bandung",
            "Jl. Pucang Jajar Tengah No. 77, Kertajaya, Kec. Gubeng",
            R.drawable.seblak,
            "Menyediakan makanan kekinian yang pedas yaitu seblak"))
        return ListData
    }
}