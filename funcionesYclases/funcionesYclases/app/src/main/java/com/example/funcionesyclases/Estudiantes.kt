package com.example.funcionesyclases

class Estudiantes ( val nombre:String,var edad:Int, val lenguajes:Array<String>) {
 fun codigo(){
   for (lenguajes:String in lenguajes){
       println("los lenguajes de programacion que conoces son $lenguajes")
   }
 }


}