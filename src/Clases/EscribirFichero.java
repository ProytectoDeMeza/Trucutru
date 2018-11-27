package Clases;
import java.io.*;
import java.util.Scanner;

public class EscribirFichero extends Estructura{
    
    //Constructor
    public EscribirFichero(int m,int nj,int nr,int nrj,long e){
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
            fichero.write("Número de elementos:\r\n");
            fichero.write(nlm + "\r\n");
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
            fichero.write("Matriz de Rigidez: ");
            fichero.write("\r\n");
            fichero.write("SMD: ");
            fichero.write("\r\n");
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    fichero.write(smd[i][j] + " ");
                }
                fichero.write("\r\n");
            }
            fichero.write("\r\n");
            fichero.write("S: ");
            fichero.write("\r\n");
            for(int i=0;i<s.length;i++){
                for(int j=0;j<s.length;j++){
                    fichero.write(s[i][j] + " ");
                }
                fichero.write("\r\n");
            }
            fichero.write("\r\n");
            fichero.write("Acciones aplicadas en nudos: ");
            fichero.write("\r\n");
            for(int i=0;i<a.length;i++){
                if(i%3==0){
                    fichero.write("\r\n");
                }
                fichero.write(a[i] + " ");
            }
            fichero.write("\r\n");
            //
            fichero.write("Acciones en extremos de miembros:");
            fichero.write("\r\n");
            for(int i=0;i<m;i++){
                for(int j=0;j<6;j++){
                    if(j%3==0){
                        fichero.write("\r\n");
                    }
                    fichero.write(aml[i][j] + " ");
                }
            }
            fichero.write("\r\n");
            //
            fichero.write("Condiciones de carga: ");
            fichero.write("\r\n");
            fichero.write(css+"\r\n");
            fichero.write("Acciones de métodos: ");
            fichero.write("\r\n");
            fichero.write("ae: ");
            for(int i=0;i<3*nj;i++){
                fichero.write(ae[i]+ " ");
            }
            fichero.write("\r\n");
            fichero.write("ac: ");
            for(int i=0;i<3*nj;i++){
                fichero.write(ac[i]+ " ");
            }
            fichero.write("\r\n");
            fichero.write("Vector de racciones en apoyos:");
            fichero.write("\r\n");
            for(int i=0;i<3*nj;i++){
                if(i%3==0){
                    fichero.write("\r\n");
                }
                fichero.write(ar[i]+ " ");
            }
            fichero.write("\r\n");
            fichero.write("Vector de desplazamientos en nudos:");
            fichero.write("\r\n");
            for(int i=0;i<3*nj;i++){
                if(i%3==0){
                    fichero.write("\r\n");
                }
                fichero.write(d[i]+ " ");
            }
            fichero.write("\r\n");
            fichero.write("Vector de acciones de extremo finales:");
            fichero.write("\r\n");
            for(int i=0;i<m;i++){
                for(int j=0;j<6;j++){
                    fichero.write(am[i][j]+ " ");
                }
                fichero.write("\r\n");
            }
        }catch(IOException e){
            //Mensaje de error
        }
        
    }
    public void leer(){
        double vec[]=new double[1000];
        Scanner scanner=null;
        try{
            scanner=new Scanner(new FileReader("Nombre.txt"));
            int i=0;
            while(scanner.hasNext()){
                String palabra = scanner.next();
                while(scanner.hasNextDouble()){
                    Double temp = scanner.nextDouble();
                    vec[i]=temp;
                    i++;
                }
            }
            m=(int)vec[0];
            nj=(int)vec[1];
            nr=(int)vec[2];
            nrj=(int)vec[3];
            e=(int)vec[4];
            n=(int)vec[5];
            nlm=(int)vec[6];
            for(int j=0;j<nj;j++){
                x[j]=vec[7+j];
            }
            for(int j=0;j<nj;j++){
                y[j]=vec[7+nj+j];
            }
            for(int j=0;j<m;j++){
                jj[j]=(int)vec[7+2*nj+j];
            }
            for(int j=0;j<m;j++){
                jk[j]=(int)vec[7+2*nj+m+j];
            }
            for(int j=0;j<m;j++){
                ax[j]=vec[7+2*nj+2*m+j];
            }
            for(int j=0;j<m;j++){
                iz[j]=vec[7+2*nj+3*m+j];
            }
            for(int j=0;j<3*nj;j++){
                rl[j]=(int)vec[7+2*nj+4*m+j];
            }
            for(int j=0;j<3*nj;j++){
                crl[j]=(int)vec[7+5*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                l[j]=vec[7+8*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                cx[j]=vec[7+8*nj+5*m+j];
            }
            for(int j=0;j<m;j++){
                cy[j]=vec[7+8*nj+6*m+j];
            }
            for(int j=0;j<6;j++){
                for(int k=0;k<6;k++){
                    smd[j][k]=vec[7+8*nj+7*m+(6*j+k)];
                }
            }
            for(int j=0;j<3*nj;j++){
                for(int k=0;k<3*nj;k++){
                    s[j][k]=vec[43+8*nj+7*m+((3*nj)*j+k)];
                }
            }
            for(int j=0;j<3*nj;j++){
                a[j]=vec[((3*nj)*(3*nj))+43+8*nj+7*m+j];
            }
            for(int j=0;j<m;j++){
                for(int k=0;k<6;k++){
                    aml[j][k]=vec[((3*nj)*(3*nj))+43+11*nj+7*m+(m*j+k)];
                }
            }
            for(int j=0;j<3*nj;j++){
                ae[j]=vec[((3*nj)*(3*nj))+43+11*nj+13*m+j];
            }
            for(int j=0;j<3*nj;j++){
                ac[j]=vec[((3*nj)*(3*nj))+43+14*nj+13*m+j];
            }
            for(int j=0;j<3*nj;j++){
                ar[j]=vec[((3*nj)*(3*nj))+43+17*nj+13*m+j];
            }
            for(int j=0;j<3*nj;j++){
                d[j]=vec[((3*nj)*(3*nj))+43+20*nj+13*m+j];
            }
            for(int j=0;j<m;j++){
                for(int k=0;k<6;k++){
                    am[j][k]=vec[((3*nj)*(3*nj))+43+23*nj+13*m+(m*j+k)];
                }
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

