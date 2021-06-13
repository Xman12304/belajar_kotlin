//belajar tipe data

fun main(args: Array<String>) {

//type data pada kotlin
var language: String = "French"; //tipe data string
val score: Int = 95; //tipe data integer
var tujuan: Boolean = true; //tipe data boolean
var huruf: Char = 'K' //tipe data char
var angka: Number = 120; //tipe data number
var angka1: Double = 999.5; //tipe data double = double precision 64 bit
var angka2: Float = 19.5F; //tipe data float = single precision 32 bit, diberikan "F" diakhir sebagai penanda kalo ini tipe float
//cetak
println(language);
println(score);
println(tujuan);
println(huruf);
println(angka);
println(angka1);
println(angka2);

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