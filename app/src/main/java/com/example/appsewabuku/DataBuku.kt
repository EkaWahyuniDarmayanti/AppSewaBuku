package com.example.appsewabuku

object DataBuku {
    private val NamaBuku = arrayOf("Internasional Business",
        "Pemrograman Mobile",
        "Pemrograman Web",
        "Algoritma Pemrograman",
        "Ekonomi Islam",
        "Kakas Pengembangan Perangkat Lunak",
        "Sistem Pendukung keputusan")

    private val DetailBuku = arrayOf("Harga Sewa Rp.20.000/Bulan, Pemakaian 4 Bulsn, Semua halaman masih utuh. kertas robek bagian hslsmsn 120",
        "Harga Sewa Rp.50.000/Bulan, Pemakaian 2 Bulan, Semua halaman masih utuh. kertas robek bagian halaman 10",
        "Harga Sewa Rp.30.000/Bulan, Pemakaian 9 Bulan, Semua halaman masih utuh. kertas robek bagian halaman 10",
        "Harga Sewa Rp.100.000/Bulan, Pemakaian 7 Bulan, Semua halaman masih utuh. kertas robek bagian halaman 10")

    private val GambarBuku = intArrayOf(R.drawable.buku1,
        R.drawable.buku2)

    val listData: ArrayList<buku>
        get() {
            val list = arrayListOf<buku>()
            for (position in NamaBuku.indices) {
                val buku = buku()
                buku.name = NamaBuku[position]
                buku.detail = DetailBuku[position]
                buku.photo = GambarBuku[position]
                list.add(buku)
            }
            return list
        }
}