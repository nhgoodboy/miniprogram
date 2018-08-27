package others;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BorrowBooks {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] books = {"大学英语语法手册", "Java语言程序设计", "Python基础教程", "高性能MySQL", "SaltStack运维实战"};
        System.out.println("欢迎进入借书系统！");
        int choice;
        int serialNum;
        String bookName;
        Scanner input;
        while (true) {
            System.out.println("图书列表：");
            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + "  " + books[i]);
            }
            System.out.print("请选择按图书序号或者书名查找图书：1-图书序号；2-书名；0-退出");
            input = new Scanner(System.in);
            try {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                choice = input.nextInt();
                if (choice == 1) {
                    while (true) {
                        System.out.print("请输入您要查找的图书序号(输入0返回上一层菜单)：");
                        try {
                            serialNum = input.nextInt();
                            if (serialNum == 0) {
                                break;
                            }
                            System.out.println("您已借书：" + books[serialNum - 1]);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            // TODO: handler exception
                            System.out.println("图书不存在，请重新输入！");
                        } catch (InputMismatchException e) {
                            // TODO: handler exception
                            System.out.println("错误命令，请重新输入！");
                        }
                    }
                } else if (choice == 2) {
                    while (true) {
                        System.out.print("请输入您要查找的书名(输入return返回上一层菜单)：");
                        try {
                            bookName = input.nextLine();
                            if (bookName.equals("return")) {
                                break;
                            }
                            boolean result = Arrays.asList(books).contains(bookName);
                            if (result) {
                                System.out.println("您已借书：" + bookName);
                            } else {
                                System.out.println("图书不存在，请重新输入！");
                            }
                        } catch (InputMismatchException e) {
                            // TODO: handler exception
                            System.out.println("错误命令，请重新输入！");
                        }
                    }
                } else if (choice == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                // TODO: handler exception
                System.out.println("错误命令，请重新输入！");
            }
        }
        input.close();
        System.out.println("再见！");
    }

}
