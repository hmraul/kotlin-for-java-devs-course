package week2

@JvmOverloads // To make posible to call to this function overloading params
fun sum (a:Int = 0, b:Int = 0, c:Int = 0) = a + b + c

// I. E on overloading in afile.java
//private void getSum(int a, int b) {
//    sum(a, b);
//}