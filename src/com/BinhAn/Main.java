package com.BinhAn;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời nhập chiều rộng ");
        double width = scanner.nextDouble();
        System.out.print("mời nhập chiều dài");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("chu vi hình chữ nhật: " + rectangle.getPerimeter());

    }
}
