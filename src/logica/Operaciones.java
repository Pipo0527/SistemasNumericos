/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import static java.lang.Math.pow;
import javax.swing.JTextField;

/**
 *
 * @author Vinni
 */
public class Operaciones {
    public int valor;


    public Operaciones() {
    }

    public Operaciones(int valor) {
        this.valor = valor;
    }
    

    
    
    public String convertirDecimalBinario(int valor){
        int i = 0;
        int res=0;
        int suma=0;
        int[] resultado = new int[100];
        while (valor > 0) {
            resultado[i] = valor % 2;
            valor /= 2;
            i++;
        }

        i--;
        while (i >= 0) {
            res=(int) (pow(10, i) * resultado[i]);
            suma+=res;
            i--;
        }
        return Integer.toString(suma);
    }
    public String convertirDecimalOctal(int valor){
        int i = 0;
        int x = 0;
        int res=0;
        int suma=0;
        int[] resultado = new int[100];
        int[] octal = new int[100];
        while (valor > 0) {
            resultado[i] = valor % 8;
            valor /= 8;
            i++;
            x++;
        }

        i--;
        while (i >= 0) {
            switch(resultado[i]) {
                case 0:
                    octal[i] = 0;
                    break;
                case 1:
                    octal[i] = 1;
                    break;
                case 2:
                    octal[i] = 2;
                    break;
                case 3:
                    octal[i] = 3;
                    break;
                case 4:
                    octal[i] = 4;
                    break;
                case 5:
                    octal[i] = 5;
                    break;
                case 6:
                    octal[i] = 6;
                    break;
                case 7:
                    octal[i] = 7;
                    break;
            }
            i--;
        }
        i = x;
        i--;
        while (i >= 0) {
            res=(int) (pow(10,i)*octal[i]);
            suma+=res;
            i--;
        }
        return Integer.toString(suma);
    }
    public String convertirDecimalHexadecimal(int valor){
        int i = 0;
        int x = 0;
        String suma="";
        int[] resultado = new int[100];
        char hexdec[] = new char[100];
        while (valor > 0) {
            resultado[i] = valor % 16;
            valor /= 16;
            i++;
            x++;
        }

        i--;
        while (i >= 0) {
            switch (resultado[i]) {
                case 0:
                    hexdec[i] = '0';
                    break;
                case 1:
                    hexdec[i] = '1';
                    break;
                case 2:
                    hexdec[i] = '2';
                    break;
                case 3:
                    hexdec[i] = '3';
                    break;
                case 4:
                    hexdec[i] = '4';
                    break;
                case 5:
                    hexdec[i] = '5';
                    break;
                case 6:
                    hexdec[i] = '6';
                    break;
                case 7:
                    hexdec[i] = '7';
                    break;
                case 8:
                    hexdec[i] = '8';
                    break;
                case 9:
                    hexdec[i] = '9';
                    break;
                case 10:
                    hexdec[i] = 'A';
                    break;
                case 11:
                    hexdec[i] = 'B';
                    break;
                case 12:
                    hexdec[i] = 'C';
                    break;
                case 13 :
                    hexdec[i] = 'D';
                    break;
                case 14:
                    hexdec[i] = 'E';
                    break;
                case 15:
                    hexdec[i] = 'F';
                    break;
            }
            i--;
        }
        i = x;
        i--;
        while (i >= 0) {
            suma+=hexdec[i];
            i--;
        }
        return suma;
    }
    public String convertirBinarioDecimal(int valor){
        int i = 0;
        int[] digito = new int[100];
        int resto;
        int decimal = 0;
        while (valor > 0) {
            digito[i] = valor % 10;
            resto = (int) (Math.pow(2, i) * digito[i]);
            decimal += resto;
            valor /= 10;
            i++;
        }
        return Integer.toString(decimal);
    }
    public String convertirBinarioHexadecimal(int valor){
        int i = 0;
        int[] digito = new int[100];
        int resto;
        int decimal = 0;
        while (valor > 0) {
            digito[i] = valor % 10;
            resto = (int) (Math.pow(2, i) * digito[i]);
            decimal += resto;
            valor /= 10;
            i++;
        }
        
        return convertirDecimalHexadecimal(decimal);
    }
    public String convertirBinarioOctal(int valor){
        int i = 0;
        int[] digito = new int[100];
        int resto;
        int decimal = 0;
        while (valor > 0) {
            digito[i] = valor % 10;
            resto = (int) (Math.pow(2, i) * digito[i]);
            decimal += resto;
            valor /= 10;
            i++;
        }
        //convertirBinarioDecimal(decimal);
        
        return convertirDecimalOctal(decimal);
    }
    public String convertirOctalBinario(int valor){
        int x = 0, i = 0;
        int[] resultado = new int[100];
        String res[]=new String[100];
        String suma="";
        while (valor > 0) {
            resultado[i] = valor % 10;
            valor /= 10;
            i++;
            x++;
        }
        i--;
        while (i >= 0) {
            switch (resultado[i]) {
                case 0:
                    res[i]="000";
                    break;
                case 1:
                    res[i]="001";
                    break;
                case 2:
                    res[i]="010";
                    break;
                case 3:
                    res[i]="011";
                    break;
                case 4:
                    res[i]="100";
                    break;
                case 5:
                    res[i]="101";
                    break;
                case 6:
                    res[i]="110";
                    break;
                case 7:
                    res[i]="111";
                    break;
                default:
                    System.out.println("\nNumero Invalido " + resultado[i]);
            }
            suma+=res[i];
            i--;
        }
        return suma;
    }
    public String convertirOctalDecimal(int valor){
        int i = 0;
        int x = 0;
        int[] resultado = new int[100];
        int[] res = new int[100];
        int decimal = 0;
        while (valor > 0) {
            resultado[i] = valor % 10;
            valor /= 10;
            i++;
            x++;
        }
        i--;
        while (i >= 0) {
            switch (resultado[i]) {
                case 0:
                    res[i] = (int) Math.pow(8, i) * 0;
                    break;
                case 1:
                    res[i] = (int) Math.pow(8, i) * 1;
                    break;
                case 2:
                    res[i] = (int) Math.pow(8, i) * 2;
                    break;
                case 3:
                    res[i] = (int) Math.pow(8, i) * 3;
                    break;
                case 4:
                    res[i] = (int) Math.pow(8, i) * 4;
                    break;
                case 5:
                    res[i] = (int) Math.pow(8, i) * 5;
                    break;
                case 6:
                    res[i] = (int) Math.pow(8, i) * 6;
                    break;
                case 7:
                    res[i] = (int) Math.pow(8, i) * 7;
                    break;
                default:
                    System.out.println("\nNumero Invalido " + resultado[i]);
            }
            decimal += res[i];
            i--;
        }
        return Integer.toString(decimal);
    }
    public String convertirOctalHexadecimal(int valor){
        int i = 0;
        int decimal=0;
        int x = 0;
        int[] resultado = new int[100];
        int res = 0;
        while (valor > 0) {
            resultado[i] = valor % 10;
            valor /= 10;
            i++;
            x++;
        }
        i--;
        while (i >= 0) {
            switch (resultado[i]) {
                case 0:
                    res = (int) Math.pow(8, i) * 0;
                    break;
                case 1:
                    res = (int) Math.pow(8, i) * 1;
                    break;
                case 2:
                    res = (int) Math.pow(8, i) * 2;
                    break;
                case 3:
                    res = (int) Math.pow(8, i) * 3;
                    break;
                case 4:
                    res = (int) Math.pow(8, i) * 4;
                    break;
                case 5:
                    res = (int) Math.pow(8, i) * 5;
                    break;
                case 6:
                    res = (int) Math.pow(8, i) * 6;
                    break;
                case 7:
                    res = (int) Math.pow(8, i) * 7;
                    break;
                default:
                    System.out.println("\nNumero Invalido " + resultado[i]);
            }
            decimal += res;
            i--;
        }
        
        return convertirDecimalHexadecimal(decimal);
    }
    public String convertirHexadecimalBinario(String valor){
        char hexdec[] = new char[100];
        String suma="";
        String res[] = new String[100];
        hexdec = valor.toUpperCase().toCharArray();
        int i = 0;
        
        while (valor.length() > i) {

            switch (hexdec[i]) {
                case '0':
                    res[i]="0000";
                    break;
                case '1':
                    res[i]="0001";
                    break;
                case '2':
                    res[i]="0010";
                    break;
                case '3':
                    res[i]="0011";
                    break;
                case '4':
                    res[i]="0100";
                    break;
                case '5':
                    res[i]="0101";
                    break;
                case '6':
                    res[i]="0110";
                    break;
                case '7':
                    res[i]="0111";
                    break;
                case '8':
                    res[i]="1000";
                    break;
                case '9':
                    res[i]="1001";
                    break;
                case 'A':
                    res[i]="1010";
                    break;
                case 'B':
                    res[i]="1011";
                    break;
                case 'C':
                    res[i]="1100";
                    break;
                case 'D':
                    res[i]="1101";
                    break;
                case 'E':
                    res[i]="1110";
                    break;
                case 'F':
                    res[i]="1111";
                    break;
                default:
                    System.out.println("\nNumero Invalido " + hexdec[i]);
            }
            suma+=res[i];
            i++;
        }
        return suma;
    }
    public String convertirHexadecimalDecimal(String valor){
        char hexdec[] = new char[100];
        hexdec = valor.toUpperCase().toCharArray();
        int i = 0;
        int decimal;
        int x = 0;
        int resultado = 0;
        while (valor.length() > i) {
            i++;
            x++;
        }
        i = 0;
        x--;
        while (valor.length() > i) {
            decimal = 0;
            switch (hexdec[i]) {
                case '0':
                    decimal = (int) Math.pow(16, x) * 0;
                    break;
                case '1':
                    decimal = (int) Math.pow(16, x) * 1;
                    break;
                case '2':
                    decimal = (int) Math.pow(16, x) * 2;
                    break;
                case '3':
                    decimal = (int) Math.pow(16, x) * 3;
                    break;
                case '4':
                    decimal = (int) Math.pow(16, x) * 4;
                    break;
                case '5':
                    decimal = (int) Math.pow(16, x) * 5;
                    break;
                case '6':
                    decimal = (int) Math.pow(16, x) * 6;
                    break;
                case '7':
                    decimal = (int) Math.pow(16, x) * 7;
                    break;
                case '8':
                    decimal = (int) Math.pow(16, x) * 8;
                    break;
                case '9':
                    decimal = (int) Math.pow(16, x) * 9;
                    break;
                case 'A':
                    decimal = (int) Math.pow(16, x) * 10;
                    break;
                case 'B':
                    decimal = (int) Math.pow(16, x) * 11;
                    break;
                case 'C':
                    decimal = (int) Math.pow(16, x) * 12;
                    break;
                case 'D':
                    decimal = (int) Math.pow(16, x) * 13;
                    break;
                case 'E':
                    decimal = (int) Math.pow(16, x) * 14;
                    break;
                case 'F':
                    decimal = (int) Math.pow(16, x) * 15;
                    break;
                default:
                    System.out.println("\nNumero Invalido " + hexdec[i]);
            }
            resultado += decimal;
            i++;
            x--;
        }
        return Integer.toString(resultado);
    }
    public String convertirHexadecimalOctal(String valor){
        char hexdec[] = new char[100];
        int[] octal = new int[100];
        String suma="";
        hexdec = valor.toUpperCase().toCharArray();
        int i = 0;
        int decimal=0;
        int x = 0;
        int res= 0;
        int[] resultado = new int[100];
        while (valor.length() > i) {
            i++;
            x++;
        }
        i = 0;
        x--;
        while (valor.length() > i) {
            switch (hexdec[i]) {
                case '0':
                    res = (int) Math.pow(16, x) * 0;
                    break;
                case '1':
                    res = (int) Math.pow(16, x) * 1;
                    break;
                case '2':
                    res = (int) Math.pow(16, x) * 2;
                    break;
                case '3':
                    res = (int) Math.pow(16, x) * 3;
                    break;
                case '4':
                    res = (int) Math.pow(16, x) * 4;
                    break;
                case '5':
                    res = (int) Math.pow(16, x) * 5;
                    break;
                case '6':
                    res = (int) Math.pow(16, x) * 6;
                    break;
                case '7':
                    res = (int) Math.pow(16, x) * 7;
                    break;
                case '8':
                    res = (int) Math.pow(16, x) * 8;
                    break;
                case '9':
                    res = (int) Math.pow(16, x) * 9;
                    break;
                case 'A':
                    res = (int) Math.pow(16, x) * 10;
                    break;
                case 'B':
                    res = (int) Math.pow(16, x) * 11;
                    break;
                case 'C':
                    res = (int) Math.pow(16, x) * 12;
                    break;
                case 'D':
                    res = (int) Math.pow(16, x) * 13;
                    break;
                case 'E':
                    res = (int) Math.pow(16, x) * 14;
                    break;
                case 'F':
                    res = (int) Math.pow(16, x) * 15;
                    break;
                default:
                    System.out.println("\nNumero Invalido " + hexdec[i]);
            }
            decimal += res;
            i++;
            x--;
        }
    i = 0;
    x = 0;
        
        while (decimal > 0) {
            resultado[i] = decimal % 8;
            decimal /= 8;
            i++;
            x++;
        }

        i--;
        while (i >= 0) {
            switch (resultado[i]) {
                case 0:
                    octal[i] = 0;
                    break;
                case 1:
                    octal[i] = 1;
                    break;
                case 2:
                    octal[i] = 2;
                    break;
                case 3:
                    octal[i] = 3;
                    break;
                case 4:
                    octal[i] = 4;
                    break;
                case 5:
                    octal[i] = 5;
                    break;
                case 6:
                    octal[i] = 6;
                    break;
                case 7:
                    octal[i] = 7;
                    break;
            }
            i--;
        }
        i = x;
        i--;
        
        while (i >= 0) {
            suma+=octal[i];
            i--;
        }
        return suma;
    }
}
