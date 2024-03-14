package Sarcina;

import java.util.List;

public class Review {
    public int sumaArray(int arr[]){
        int s=0;
        for (int i=0; i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
    public int[] oddArr(int nr){
        int arr[] = new int[nr/2];
        for (int i =0; i<nr; i++){
            if(i<nr && i%2!=1){
                arr[i] = i;
            }
        }
        return arr;
    }

    public String invers(String mess){
        String[] newString = new String[mess.length()];
        for (int i = mess.length()-1, j=0; j>=0;i--,j++){
            newString[j]= mess;
        }
        return newString;
    }

    public String descrescator(List numere){
        for (int i=0; i< numere.size(); i++){
            for (int j=0; j< numere.size();j++){
                int TEMP;
                if (numere[i]<numere[j]){
                    TEMP = numere[i];
                    numere[i]= numere[j];
                    numere[j] = TEMP;
                }
            }
        }
    }

}

