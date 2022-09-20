package com.example.funcionesyclases

import android.opengl.GLES10
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // arrays()
        //  seguridadNula()
        //funciones()
        clases()
    }

    fun arrays() {
        val nombre = "carlos"
        val apellido = "jimenez"
        val departamento = "chalatenango"
        val edad = "32"

        //Crear un arreglo
        val miarreglo = arrayListOf<String>()


        //anadir los datos
        miarreglo.add(nombre)
        miarreglo.add(apellido)
        miarreglo.add(departamento)
        miarreglo.add(edad)
        print(miarreglo)


        //anadir cond conjunto de datos

        miarreglo.addAll(listOf("Estudiantes", "Programacion IV"))

        println(miarreglo)

        // acceso a datos
        val miDepartamento = miarreglo[2]
        println(miDepartamento)
        println(miarreglo[5])


        //modificar
        miarreglo[0] = "kemberly"
        println(miarreglo[0])

        //eliminar datos
        miarreglo.removeAt(2)
        println(miarreglo)
        miarreglo.forEach {
            (println(it))

        }
        //otras operaciones
        println(miarreglo.count())
        miarreglo.clear()
    }

    //Seguridad control nulos(null sofety)
    fun seguridadNula() {
        var miString: String = "programacion IV 13/09/2022"
        // miString = null ; Esto no se puede agregar da un error de compilacion
        println(miString)


        //variable, seguridad nulo(null, sofety)
        var miSeguridadNula: String? = "valor de seguridad nula"
        miSeguridadNula = null
        println(miSeguridadNula)

        miSeguridadNula = "le volvemos a dar  un valor"
        println(miSeguridadNula)

        if (miSeguridadNula != null) {
            println(miSeguridadNula.toString()!!)

        } else {
            println(miSeguridadNula.toString())
        }
        println(miSeguridadNula?.length)
        miSeguridadNula?.let {
            println(it.toString())
        }
    }

    fun funciones() {
        decirHola()
        decirHola()
        decirHola()
        decirNombre("alex")
        decirNombreYedad("cristina", 32)
        var sumaresultado = sumardosnumeros(8, 8)
        println(sumaresultado)
        println(sumardosnumeros(3, 3))

        //   println(sumardosnumeros(4,sumardosnumeros(3)))
    }

    //Funcion simple
    fun decirHola() {
        println("Hola Estudiantes")


    }

    //Funcion con parametros de entradas
    fun decirNombre(nombre: String) {
        println("hola, tu nombre es $nombre")

    }

    fun decirNombreYedad(nombre: String, edad: Int) {
        println("hola tu nombre es $nombre y tu edad es $edad anos")
    }

    fun sumardosnumeros(num1: Int, num2: Int) {
        val suma = num1 + num2

    }
    fun clases(){
        val personas1=Estudiantes("Kimberlyn",23, arrayOf("Java","C#"))
        println(personas1.nombre)
        personas1.nombre
    }
}
