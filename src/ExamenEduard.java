import java.util.Scanner;
public class ExamenEduard {

	/*Ejercicio 1*/
	public static int SonIguales (int a, int b)
	{	
			Scanner eduard=new Scanner(System.in);
			System.out.println("INgrese A:");
			a=eduard.nextInt();
			System.out.println("INgreese B");
			b=eduard.nextInt();
			System.out.println("SON IGUALES");
			
			if (a==b)
			return a;
			
			else if (b!=a)
			return a;
				
			else 
			return a;	
	}
	
	/*Ingresar 20 numeros desde el teclado.
	Luego imprimir el promedio de todos los numeros. 
	(Sugerencia: hacer uso de arreglos y ciclos)*/
	
	static void Promedio() 
	{
		int n1[]={0,60,98,57,70,69,42,59,87,90,100};
		int n2[]={0,50,100,65,60,72,60,63,77,50,90};
		int n3[]={0,65,85,52,58,70,71,74,69,55,95};
		int s[]=new int[11];
		int Prom[]=new int[11];
		int SN1,SN2,SN3;
		int PN1,PN2,PN3;
		int PC;

		String N[]={"XXXX","Juan  ","Denia ","Oscar ","Mirna ","Gisela","Andres","Martha",
		"Daniel","Jose  ","Sonia "};

		String e[]={"xxx","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO","REPROBADO"};


		s[1]=n1[1]+n2[1]+n3[1];
		s[2]=n1[2]+n2[2]+n3[2];
		s[3]=n1[3]+n2[3]+n3[3];
		s[4]=n1[4]+n2[4]+n3[4];
		s[5]=n1[5]+n2[5]+n3[5];
		s[6]=n1[6]+n2[6]+n3[6];
		s[7]=n1[7]+n2[7]+n3[7];
		s[8]=n1[8]+n2[8]+n3[8];
		s[9]=n1[9]+n2[9]+n3[9];
		s[10]=n1[10]+n2[10]+n3[10];

		Prom[1]=s[1]/3;
		Prom[2]=s[2]/3;
		Prom[3]=s[3]/3;
		Prom[4]=s[4]/3;
		Prom[5]=s[5]/3;
		Prom[6]=s[6]/3;
		Prom[7]=s[7]/3;
		Prom[8]=s[8]/3;
		Prom[9]=s[9]/3;
		Prom[10]=s[10]/3;

		if(Prom[1]>=60) e[1]="APROBADO";
		if(Prom[2]>=60) e[2]="APROBADO";
		if(Prom[3]>=60) e[3]="APROBADO";
		if(Prom[4]>=60) e[4]="APROBADO";
		if(Prom[5]>=60) e[5]="APROBADO";
		if(Prom[6]>=60) e[6]="APROBADO";
		if(Prom[7]>=60) e[7]="APROBADO";
		if(Prom[8]>=60) e[8]="APROBADO";
		if(Prom[9]>=60) e[9]="APROBADO";
		if(Prom[10]>=60)e[10]="APROBADO";

		   SN1=0;
		   SN1 = SN1+n1[1];
		   SN1 = SN1+n1[2];
		   SN1 = SN1+n1[3];
		   SN1 = SN1+n1[4];
		   SN1 = SN1+n1[5];
		   SN1 = SN1+n1[6];
		   SN1 = SN1+n1[7];
		   SN1 = SN1+n1[8];
		   SN1 = SN1+n1[9];
		   SN1 = SN1+n1[10];

		   SN2=0;
		   SN2 = SN2+n2[1];
		   SN2 = SN2+n2[2];
		   SN2 = SN2+n2[3];
		   SN2 = SN2+n2[4];
		   SN2 = SN2+n2[5];
		   SN2 = SN2+n2[6];
		   SN2 = SN2+n2[7];
		   SN2 = SN2+n2[8];
		   SN2 = SN2+n2[9];
		   SN2 = SN2+n2[10];

		   SN3=0;
		   SN3 = SN3+n3[1];
		   SN3 = SN3+n3[2];
		   SN3 = SN3+n3[3];
		   SN3 = SN3+n3[4];
		   SN3 = SN3+n3[5];
		   SN3 = SN3+n3[6];
		   SN3 = SN3+n3[7];
		   SN3 = SN3+n3[8];
		   SN3 = SN3+n3[9];
		   SN3 = SN3+n3[10];

		   PN1=SN1/10;
		   PN2=SN2/10;
		   PN3=SN3/10;

		   PC=(PN1+PN2+PN3)/3;

		System.out.println("NL"+"\t"+"Nombre"+"\t"+"Nota1"+"\t"+"Nota2"+"\t"+"Nota3"+"\t"+"Suma"+"\t"+"Prom"+"\t"+"Estado");
		System.out.println("=============================================================================================");

		System.out.println("1"+"\t"+N[1]+"\t"+n1[1]+"\t"+n2[1]+"\t"+n3[1]+"\t"+s[1]+"\t"+Prom[1]+"\t"+e[1]);
		System.out.println("2"+"\t"+N[2]+"\t"+n1[2]+"\t"+n2[2]+"\t"+n3[2]+"\t"+s[2]+"\t"+Prom[2]+"\t"+e[2]);
		System.out.println("3"+"\t"+N[3]+"\t"+n1[3]+"\t"+n2[3]+"\t"+n3[3]+"\t"+s[3]+"\t"+Prom[3]+"\t"+e[3]);
		System.out.println("4"+"\t"+N[4]+"\t"+n1[4]+"\t"+n2[4]+"\t"+n3[4]+"\t"+s[4]+"\t"+Prom[4]+"\t"+e[4]);
		System.out.println("5"+"\t"+N[5]+"\t"+n1[5]+"\t"+n2[5]+"\t"+n3[5]+"\t"+s[5]+"\t"+Prom[5]+"\t"+e[5]);
		System.out.println("6"+"\t"+N[6]+"\t"+n1[6]+"\t"+n2[6]+"\t"+n3[6]+"\t"+s[6]+"\t"+Prom[6]+"\t"+e[6]);
		System.out.println("7"+"\t"+N[7]+"\t"+n1[7]+"\t"+n2[7]+"\t"+n3[7]+"\t"+s[7]+"\t"+Prom[7]+"\t"+e[7]);
		System.out.println("8"+"\t"+N[8]+"\t"+n1[8]+"\t"+n2[8]+"\t"+n3[8]+"\t"+s[8]+"\t"+Prom[8]+"\t"+e[8]);
		System.out.println("9"+"\t"+N[9]+"\t"+n1[9]+"\t"+n2[9]+"\t"+n3[9]+"\t"+s[9]+"\t"+Prom[9]+"\t"+e[9]);
		System.out.println("10"+"\t"+N[10]+"\t"+n1[10]+"\t"+n2[10]+"\t"+n3[10]+"\t"+s[10]+"\t"+Prom[10]+"\t"+e[10]);

		System.out.println("=================================================================");
		System.out.println("\t"+"Total"+"\t"+SN1+"\t"+SN2+"\t"+SN3);
		System.out.println("=================================================================");
		System.out.println("\t"+"Promedio"+"\t"+PN1+"\t"+PN2+"\t"+PN3+"\t\t"+PC);

		
	}
		
		
	public static void main(String[] args) {
		SonIguales(10,10);
		Promedio();
	}

}
