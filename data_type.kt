//belajar tipe data

fun main(args: Array<String>) {

//type data pada kotlin
var language: String = "French"
val score: Int = 95

//cetak
println(language);
println(score);


 //contoh perbedaan "var" dan "val"

 /*
 jika menggunakan "var" maka nilai dapat diubah
 */
 var bahasa: String = "Indonesia"
 bahasa = "jawa"
 println(bahasa);

/*
jika menggunakan "val" maka nilai tidak dapat diubah, pada contoh dibawah ini apabila kita cetak
maka akan menghasilkan pesan error "val cannot be reassigned"
*/
val nilai: Int = 35
nilai = 15
println(nilai);

}