import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner girdi=new Scanner(System.in);
    double vize=0, finall=0, ortalama=0;
    System.out.println("lütfen vize notu girin");
   vize=girdi.nextDouble();
    System.out.println("lütfen final notu giriniz");
     finall=girdi.nextDouble();
  ortalama= vize*0.4 + finall*0.6;
    System.out.println("ortalama="+ortalama);
    if(ortalama>50)
      System.out.println("geçtiniz");
    else
      System.out.println("kaldınız");
  }    
  }