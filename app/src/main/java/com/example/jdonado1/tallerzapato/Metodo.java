package com.example.jdonado1.tallerzapato;

import android.view.View;

import static com.example.jdonado1.tallerzapato.R.id.TxtCantidad;

/**
 * Created by jdonado1 on 03/10/2017.
 */

public class Metodo {

        public static double Texting ( double OpcionGenero, double OpcionTipoZapatilla, double OpcionMarca){

                    double ValorUni=0;

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){

                    ValorUni = 120000;

                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){

                    ValorUni = 140000;

                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){

                    ValorUni = 130000;

                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){

                    ValorUni = 50000;

                }
                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){

                    ValorUni = 80000;

                }
                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){

                    ValorUni = 100000;

                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){

                    ValorUni = 100000;

                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){

                    ValorUni = 130000;

                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){

                    ValorUni = 110000;

                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){

                    ValorUni = 60000;

                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){

                    ValorUni = 60000;

                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){

                    ValorUni = 70000;

                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){

                    ValorUni = 120000;

                }

                return ValorUni;
            }
}
