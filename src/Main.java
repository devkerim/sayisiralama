import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b,c;
	Scanner intscanner = new Scanner(System.in);


	System.out.print("A Sayısını giriniz: ");
	a = intscanner.nextInt();
	System.out.print("B Sayısını giriniz: ");
	b = intscanner.nextInt();
	System.out.print("C Sayısını giriniz: ");
	c = intscanner.nextInt();

	if(a>b){
	    if(a>c){
	        if(b>c){System.out.println("A>B>C");

            }
            else if(a==b){System.out.println("A=B>C");}
            else{System.out.println("A>C>B");}
        }
	    else if(a==c){System.out.println("A=C>B");}
	    else{System.out.println("C>A>B");}
    }
	else if(b>a){
            if(b>c){
                if(a>c){System.out.println("B>A>C");

                }
                else if(a==c){System.out.println("B>A=C");}
                else{System.out.println("B>C>A");}
            }
            else if(b==c){System.out.println("B=C>A");}
            else{System.out.println("C>B>A");}
        }
	else if(c>b){
            if(c>a){
                if(a>b){System.out.println("C>A>B");

                }
                else if(a==b){System.out.println("C>A=B");}
                else{System.out.println("C>B>A");}

            }
            else if(c==a){System.out.println("C=A>B");}
            else{System.out.println("A>C>B");}
        }
    else if(b>c){
        if(b>a){
            if(a>c){System.out.println("B>A>C");

            }
            else if(a==c){System.out.println("B>A=C");}
            else{System.out.println("B>C>A");}

        }
        else if(b==a){System.out.println("B=A>C");}
        else{System.out.println("A>B>C");}
    }
	else{System.out.println("A=B=C");}


















    }
}
