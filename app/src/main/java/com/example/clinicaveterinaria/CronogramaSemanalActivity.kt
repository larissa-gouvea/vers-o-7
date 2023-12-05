package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.clinicaveterinaria.databinding.ActivityCronogramaSemanalBinding
import com.example.clinicaveterinaria.fragments.PetFragment

lateinit var cronogramaBtnRetornar: Button



class CronogramaSemanalActivity : AppCompatActivity() {
    private val binding by lazy { ActivityCronogramaSemanalBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.i("ciclo","ACTIVITY OnCreate")

        val consultasFragment = PetFragment()
        binding.btnPets.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMain, consultasFragment)
                .commit()
        }

        cronogramaBtnRetornar = findViewById(R.id.cronograma_btn_retornar)


        cronogramaBtnRetornar.setOnClickListener {
            val intent = Intent(this, TipoComidaActivity::class.java)
            startActivity(intent)
        }

    }
}