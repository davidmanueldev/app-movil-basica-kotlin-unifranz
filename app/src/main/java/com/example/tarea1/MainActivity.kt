package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener referencia al botón
        val buttonMostrarMensaje: Button = findViewById(R.id.buttonMostrarMensaje)

        // Configurar el listener del botón
        buttonMostrarMensaje.setOnClickListener {
            // Mostrar mensaje Toast al presionar el botón
            Toast.makeText(
                this,
                "Hola Mundo, esta es mi primera app móvil. GAAAAAA",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}