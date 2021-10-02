package com.example.ciclovidajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es
 */


public class MainActivity extends AppCompatActivity {
//AppCompatActivity hereda de Activity y añade funcionalidades

    TextView tv; // Declaramos la caja de texto que hay en el layout
    StringBuilder sb;

    /**
     * Método que añade una línea al TextView y además escribe una línea en el Logcat
     */
    private void addLinea(String linea) {
        sb.append(linea +"\n"); // Añade la línea recibida por parámetro al Stringbuilder
        tv.setText(sb.toString()); // Setea el contenido del TextView con el contenido actualizado del StringBuilder
        Log.i("CicloDeVida", linea); // Log.i con "i" de info, podría ser w(arning), e(rror)...
    }

    @Override // Sobreescribimos los métodos de Activity
    protected void onCreate(Bundle savedInstanceState) { // Se lanza cuando se crea la Actividad
        super.onCreate(savedInstanceState); // Invoca al onCreate de la clase padre

        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv1); // Busca el elemento con id "tv1" en la clase R (generada automáticamente a partir de los xml)
        sb = new StringBuilder(""); // Inicializa el StringBuilder para empezar a añadir contenido

        addLinea("onCreate");

    }


    // Resto de métodos del ciclo de vida:

    @Override protected void onStart() { super.onStart(); addLinea("onStart"); }
    @Override protected void onRestart() { super.onRestart(); addLinea("onRestart"); }
    @Override protected void onResume() { super.onResume(); addLinea("onResume"); }
    @Override protected void onPause() { super.onPause(); addLinea("onPause"); }
    @Override protected void onStop() { super.onStop(); addLinea("onStop"); }
    @Override protected void onDestroy() { super.onDestroy(); addLinea("onDestroy"); }



}