package com.mycompany.project01;


public class Project01 {
    
    /*
    Crea un programa que valide que las cadenas esten conformadas
    por mayúsculas y la cadena SI puede ser vacía.
    */
    
    public static void ejemplo01(){
        String cadenas[] ={
            "SDHFKJSHFKSF",
            "SDJKFHSKFKS",
            "DSASAA",
            "qweqweds",
            "adljsdjl",
            "asdlfjkadlfj",
            "SDDAsdfsfds",
            "aadsfaDADAD",
            "fsdfVsdfdf",
            ""
        };
        //Expresión regular
        // <<*>> todo el conjunto debe contener eso y acepta la cadena vacia
        //<<+>> no incluye la cadena vacía 
        String regex = "[A-Z]*";
        for(String c:cadenas){
            //.matches recibe como parametro una expresión regular
            System.out.println("La cadena '"+c+"' es válida? "+c.matches(regex));
        }
    }
    /*
    Crea un programa que valide los colores HTML para usarlos en CSS.
    */
    
    public static void ejemplo02(){
        String cadenas[] ={
            "AAAAAA",
            "000000",
            "FFFFFF",
            "123456",
            "654321",
            "1a2b3c",
            "1A2B3C",
            "1a2B3c",
            "1a2b3",
            "1A2B",
            "1a2",
            "1a",
            "6543212",
            "1a2b3c33",
            "1A2B3C333",
        };
        //Expresión regular
        // <<{UnNumero}>> indica la cantidad de caracteres
        // <<^>> Especifica con que elemento debe de empezary si se quiere más de uno
        // se coloca ()
        
        String regex = "^#[0-9,a-f,A-F]{6}";
        for(String c:cadenas){
            System.out.println("La cadena '"+c+"' es válida? "+c.matches(regex));
        }
    }
    
    /*
    Validar una contraseña el cual debe contener minusculas, mayusculas y #$%&
    */
    public static void ejemplo03(){
        String cadenas[] ={
            "mu$hyCrown62",
            "no!syNight11",
            "gr@yKick79",
            "spi(yPatch94",
            "d@mpPlant94",
            "cesarMinauro",
            "juanBahena123",
            "12345"
        };
        //Mínimo de 8 carateres
        String regex = "[a-z,A-Z,0-9,#,\\$,\\%,\\&]{8,}";
        for(String c:cadenas){
            System.out.println("La cadena '"+c+"' es válida? "+c.matches(regex));
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        //ejemplo01();
        //ejemplo02();
        ejemplo03();
    }
}
