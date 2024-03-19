package com.android.fragmentcomkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.fragmentcomkotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.minhaTabela.addOnTabSelectedListener(
            object:TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    //
                    when(tab?.position){
                        0->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.meuFragment, PrimeiroFragment())
                            .commit()
                        1->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.meuFragment, SegundoFragment())
                            .commit()
                        2->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.meuFragment, TerceiroFragment())
                            .commit()
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    //TODO("Not yet implemented")
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    //TODO("Not yet implemented")
                }

            }
        )

    }

}