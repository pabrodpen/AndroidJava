package com.example.miapppablorodriguezpenhia;

import android.provider.BaseColumns;

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {
    }

    //AQUI PONEMOS LOS ATRIBUTOS DE UN MISMO REGISTRO
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "TABLA_PRUEBA";
        public static final String COLUMN_NAME_NOMBRE = "NOMBRE";
        public static final String COLUMN_NAME_TIPO = "TIPO";
        public static final String COLUMN_NAME_DIRECCION = "DIRECCION";
        public static final String COLUMN_NAME_TFNO = "TELEFONO";  // Columna TELEFONO en la definición de la tabla

        public static final String COLUMN_NAME_URL = "URL";
    }
}