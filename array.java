 import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

       // int[][] arr =new int[<size1>][<size2>];
        int[][] arr= new int[2][2];
    // ask user for two 2X2 matrix and print
    // A+B
    // A-B
    // A*B

// arr[0][0]=2;
// arr[0][1]=3;
// arr[1][0]=4;
// arr[1][1]=5;
System.out.println("enter 2X2 matrix A:");
int[][] arrA= new int[2][2];
for(int i=0; i< 2; i++){
    for(int j=0; j <2; j++){
        //take input and insert to array
        arrA[i][j]= input.nextInt();
    }
}
// take inputs for arrB as well
System.out.println("enter 2X2 matrix B:");

int[][] arrB= new int[2][2];
for(int i=0; i < 2; i++){
    for(int j=0;j< 2;j++){
        arrB[i][j]= input.nextInt();
    }
}

// print arrA
System.out.print("matrix A=\n");
for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){

    System.out.print("\t" + arrA[i][j] );
    }
    System.out.println();
}

// print arrB
System.out.print("matrix B=\n");
for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){

    System.out.print("\t" + arrB[i][j] );
    }
    System.out.println();
}
//sum
int[][] arrC= new int[2][2];

for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){
 for (int k = 0; k<2; k++){
    arrC[i][j]=arrA[i][j]+arrB[i][j];
 }
 }
}
    System.out.println("matrix after addition: ");
//print arrC
System.out.print("matrix C=\n");
for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){

    System.out.print("\t" + arrC[i][j] );
    }
    System.out.println();
}

//sub
int[][] arrD= new int[2][2];

for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){
 for (int k = 0; k<2; k++){
    arrD[i][j]=arrA[i][j]-arrB[i][j];
 }
 }
}
System.out.println("matrix after subtraction: ");
//print arrD
System.out.print("matrix D=\n");
for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){

    System.out.print("\t" +arrD[i][j] );
    }
    System.out.println();
}

//multiply
int[][] arrE= new int[2][2];

for(int i=0; i< 2; i++){
    for(int j=0;j< 2;j++){
 for (int k = 0; k<2; k++){
    arrE[i][j] +=arrA[i][k]*arrB[k][j];
 }
 }
}
System.out.println("matrix after multiplication: ");
//print arrE
printMatrix(arrE)

    }
}