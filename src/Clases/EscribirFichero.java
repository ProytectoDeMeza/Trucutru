package Clases;
import java.io.*;
import java.util.Scanner;

public class EscribirFichero extends Estructura{
    
    //Constructor
    public EscribirFichero(int m,int nj,int nr,int nrj,int e){
        super(m,nj,nr,nrj,e);
    }

    
    //Metodo para escribir los datos del objeto en un archivo que se recibe como parametro
    public void escribir(File fich){
        try{
            FileWriter fichero = new FileWriter(fich);
            fichero.write("Número de miembros:\r\n");
            fichero.write(m + "\r\n");
            fichero.write("Número de nudos:\r\n");
            fichero.write(nj + "\r\n");
            fichero.write("Número de restricciones de apoyo:\r\n");
            fichero.write(nr + "\r\n");
            fichero.write("Número de nudos restringidos:\r\n");
            fichero.write(nrj + "\r\n");
            fichero.write("Módulo de elasticidad:\r\n");
            fichero.write(e + "\r\n");
            fichero.write("Número grados de libertad:\r\n");
            fichero.write(n + "\r\n");
            fichero.write("Vectores coordenadas en un plano:\r\n");
            fichero.write("X: ");
            for(int i=0;i<x.length;i++){
                fichero.write(x[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Y: ");
            for(int i=0;i<y.length;i++){
                fichero.write(y[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Vectores nudo inicial y final:\r\n");
            fichero.write("jj: ");
            for(int i=0;i<jj.length;i++){
                fichero.write(jj[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("jk: ");
            for(int i=0;i<jk.length;i++){
                fichero.write(jk[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Propiedades de los miembros:\r\n");
            fichero.write("ax: ");
            for(int i=0;i<ax.length;i++){
                fichero.write(ax[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("iz: ");
            for(int i=0;i<iz.length;i++){
                fichero.write(iz[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("rl: ");
            for(int i=0;i<rl.length;i++){
                fichero.write(rl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("crl: ");
            for(int i=0;i<crl.length;i++){
                fichero.write(crl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("l: ");
            for(int i=0;i<l.length;i++){
                fichero.write(l[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cx: ");
            for(int i=0;i<cx.length;i++){
                fichero.write(cx[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cy: ");
            for(int i=0;i<cy.length;i++){
                fichero.write(cy[i] + " ");
            }
            fichero.write("\r\n");
        }catch(IOException e){
            //Mensaje de error
        }
        
    }
    public void leer(){
        int vec[]=new int[100];
        Scanner scanner=null;
        try{
            scanner=new Scanner(new FileReader("Nombre.txt"));
            int i=0;
            while(scanner.hasNext()){
                String palabra = scanner.next();
                while(scanner.hasNextInt()){
                    int temp = scanner.nextInt();
                    vec[i]=temp;
                    i++;
                }
            }
            m=vec[0];
            nj=vec[1];
            nr=vec[2];
            nrj=vec[3];
            e=vec[4];
            n=vec[5];
            for(int j=0;j<nj;j++){
                x[j]=vec[6+j];
            }
            for(int j=0;j<nj;j++){
                y[j]=vec[6+nj+j];
            }
            for(int j=0;j<m;j++){
                jj[j]=vec[6+2*nj+j];
            }
            for(int j=0;j<m;j++){
                jk[j]=vec[6+2*nj+m+j];
            }
            for(int j=0;j<m;j++){
                ax[j]=vec[6+2*nj+2*m+j];
            }
            for(int j=0;j<m;j++){
                iz[j]=vec[6+2*nj+3*m+j];
            }
            for(int j=0;j<3*nj;j++){
                rl[j]=vec[6+2*nj+4*m+j];
            }
            for(int j=0;j<3*nj;j++){
                crl[j]=vec[6+5*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                l[j]=vec[6+8*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                cx[j]=vec[6+8*nj+5*m+j];
            }
            for(int j=0;j<m;j++){
                cy[j]=vec[6+8*nj+6*m+j];
            }
        }catch(FileNotFoundException e){
            System.out.println("Error.");//Mensaje de error
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}

