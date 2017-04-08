
package metodoburbuja;
import java.io.*;

public class MetodoBurbuja {
    
    public static void main(String[] args) throws IOException {
        //creacion del objeto para leer por teclado    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //Ingreso el tamaño del arreglo
        System.out.println("Ingrese número de datos a ingresar arreglo");
        int tam = Integer.parseInt(in.readLine());//se inserta el elemento desde el teclado
        //creacion del arreglo
        int arr[] = new int[tam];
        System.out.println();//linea blanca de espacio
        //lectura del arreglo
        int j = 0;
        for(int i=0; i<arr.length; i++){//se recorre el arreglo
            j+=1;//numero de posicion dentro del arreglo
            System.out.print("Elemento " +j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        burbuja(arr);//llamando al metodo burbuja, pasando arreglo como parametro.
    }
    static void burbuja(int arreglo[]){  //Metodo burbuja
        for(int i=0; i<arreglo.length -1; i++){//recorre el arreglo desde la primera posicion
            for(int j=0; j<arreglo.length -1; j++){//recorrido arreglo burbuja
                if(arreglo[j] > arreglo[j+1]){//compara la primera posicion con la siguiente
                    int tmp = arreglo[j+1];//el numero menor pasado a la burbuja
                    arreglo[j+1] = arreglo[j];//se mueve el numero mayor a la siguiente posicion
                    arreglo[j] = tmp;//el numero menor pasa a la posicion que tenia el mayor
                }
            }
        }
        for(int i=0; i<arreglo.length; i++){//se recorre el arreglo ordenado
            System.out.print(arreglo[i]+"\n");//muestra el arreglo ordenado
        }
    }
    
}
