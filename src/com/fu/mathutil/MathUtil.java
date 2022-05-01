/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Sydatdeptrai
 */
//CLASS TO PROVIDE METHOD FOR OTHER PALCE USE
//WHEN WE PROVIDE METHOD FOR OTHER PLACE USE, THAT MEAN WE DON NOT
//NEED REMEMBER, STATIC METHOD HELP US
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //Quy uoc: 0! = 1! = 1
    //khong tinh giai thua cho so am
    //20! la vua khop kieu long, kieu long toi da 18 con so 0
    //21! lo kieu long
    //neu dua vao am, 21 giai thua, ta eo tinh, ta dap vao mat ai
    //xai hàm này một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0-20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0...20 òi
        if (n == 0 || n == 1) {
            return 1;//dừng ngay khi n đặc biệt
        }
        //xuống đến đây, n = 2..20 òi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2,i = 3, i = 4, i = n nhồi liên tục i vào tính
        long product = 1; //tính khởi đầu = 1, nhồi 2 3 4 5 6 ..n
        for (int i = 2; i <= n; i++) {
            product *= i;//product = product đang có nhân con i, đập ngược trở lại    
        }
        return product;
    }
}
