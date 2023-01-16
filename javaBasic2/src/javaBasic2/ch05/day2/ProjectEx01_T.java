package javaBasic2.ch05.day2;

import java.util.Scanner;

public class ProjectEx01_T {

   public static void main(String[] args) {
      // ������ Ŭ���� ������ �� �ڵ��ϱ� 
       Banchan4 ban1  = new Banchan4();
       inputM(ban1);
       Banchan4 ban2  = new Banchan4();
       inputM(ban2);
       Banchan4 ban3  = new Banchan4();
       inputM(ban3);
       
       ban1.remainFoodM();
       ban2.remainFoodM();
       ban3.remainFoodM();
       
       printM(ban1, ban2, ban3);
       saleBestWestM(ban1, ban2, ban3);
   }
   
   public static void inputM(Banchan4 ban ) {
      Scanner sc = new Scanner(System.in);
      System.out.println("���� >");
      ban.kind = sc.next();
      System.out.println("���� ���� >");
      ban.makeFood = sc.nextInt();
      System.out.println("�Ǹ� ���� >");
      ban.saleFood = sc.nextInt();
   }
   // Banchan b1 = ban1;
   public static void printM(Banchan4 b1,  Banchan4 b2, Banchan4 b3 ) {
         System.out.println(" ===  ���� �������� ������Ȳ ==== "); 
        System.out.println("����   ���簹��   �ǸŰ���   ��������");
        System.out.println(b1.kind + "    " + b1.makeFood + "     " + b1.saleFood + "     " + b1.remainFood );
        System.out.println(b2.kind + "    " + b2.makeFood + "     " + b2.saleFood + "     " + b2.remainFood );
        System.out.println(b3.kind + "    " + b3.makeFood + "     " + b3.saleFood + "     " + b3.remainFood );
   }
   //���� �� �ȸ��� ��, ���� �� �ȸ��� �� �Ǵ��ϴ� �޼ҵ�
   public static void saleBestWestM(Banchan4 b1,  Banchan4 b2, Banchan4 b3) {
      if(b1.perCalc >= b2.perCalc && b1.perCalc >= b3.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b1.kind + " ���� >" + b1.perCalc);
      }else if(b2.perCalc >= b1.perCalc && b2.perCalc >= b3.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b2.kind + " ���� >" + b2.perCalc);
      }else if(b3.perCalc >= b1.perCalc && b3.perCalc >= b1.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b3.kind + " ���� >" + b3.perCalc);   
      }
      
      if(b1.perCalc <= b2.perCalc && b1.perCalc <= b3.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b1.kind + " ���� >" + b1.perCalc);
      }else if(b2.perCalc <= b1.perCalc && b2.perCalc <= b3.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b2.kind + " ���� >" + b2.perCalc);
      }else if(b3.perCalc <= b1.perCalc && b3.perCalc <= b1.perCalc) {
         System.out.println("���� �� �ȸ� ������ >" + b3.kind + " ���� >" + b3.perCalc);   
      }
      
   }   
}

class Banchan4{
   String kind;//����
   int makeFood;//���� ����
   int saleFood;//�Ǹ� ����
    int remainFood;//���� ����
    double perCalc;//���� ������ ���� �����
    
    void remainFoodM() {
       remainFood = makeFood - saleFood;
       perCalc = saleFood / (double) makeFood * 100;
    }
    
    
  /*  ������ 
    �������� ���� 
    ����      ���簹��   �ǸŰ���  ��������
    ������    10         5               5 
    ����       5           3              2
    ������    15        11              4

    ���� �� �ȸ� ����  ����
    ���� �� �ȸ� ����  ������

    ���ȸ� ���� �� ����� 5/10 * 100 */ 
   
}