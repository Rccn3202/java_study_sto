package javaMid7.p394;

public class OutterExQ1 {

	void iaM2() {
		for(int i=0;i<4;i++) {   //i=0,1,2,3 ³×ÁÙ
			for(int j=0;j<1+i;j++) {
				System.out.print("*"); //j=0  /0 1 / 0 1 2 /0 1 2 3 
			}
			for(int k=0;k<(5-2*i);k++) {    //k=0 1 2 3 4 /0 1 2 / 0
				System.out.print(" ");  
			}
			for(int l=0;l<1+i;l++) {
				if(i==3 && l==3) break;
				System.out.print("*"); //l=0  /0 1  /0 1 2 / 0 1 2 3
			}
			System.out.println();
		}
	}
	
	
}

//1 00000 000 0
