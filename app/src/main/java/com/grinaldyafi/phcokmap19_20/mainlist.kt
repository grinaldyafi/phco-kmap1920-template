package com.grinaldyafi.phcokmap19_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mainlist : AppCompatActivity() {
    private lateinit var rvPhco: RecyclerView
    private var list: ArrayList<PHCO> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainlist)
        val actionbar = supportActionBar
       actionbar!!.title= "Profile"

        rvPhco = findViewById(R.id.rv_phco)
        rvPhco.setHasFixedSize(true)

        list.addAll(phcoData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPhco.layoutManager = LinearLayoutManager(this)
        val listKlubAdapter = ListPHCOAdapter(list)
        rvPhco.adapter = listKlubAdapter
    }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.about, menu)
       return super.onCreateOptionsMenu(menu)
    }

   override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
      return super.onOptionsItemSelected(item)
  }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@mainlist, MainActivity::class.java)
                startActivity(iAbout)
            }
        }
    }
}

