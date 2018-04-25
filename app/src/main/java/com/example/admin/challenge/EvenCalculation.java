package com.example.admin.challenge;

import android.widget.Toast;

public class EvenCalculation {

    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void calculation(String value){

       if (value.trim().length() > 0){
           int auxValue = Integer.parseInt(value);
            int  num = auxValue % 2;


           if (num != 0){

               value = String.valueOf(auxValue + "  No es Par" );


               callback.evenResult(value);

           }else{
               value = String.valueOf( auxValue +"  Es Par" );


               callback.evenResult(value);
           }



       }else{
           callback.blankInput();
       }


    }
}
