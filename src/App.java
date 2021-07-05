public class App {

    private String minombre;
    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        // tipos de datos y operadores
        String res = "Hola";
        int resultado = 15 + 32;
        int resultado3 = 125 - 32;
        double resultado2 = 25 / 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;
        //operadores unarios
        resultado++; // resultado = resultado + 1
        resultado--; // resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        resultado += resultado; //resultado = resultado + resultado;
        //operadores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
     //   respuesta = 12 < 5 && 4 > 1;
     //   respuesta = 14 < 25 || 1 > 5;
        //operadores bit a bit
        // &
        // ^
        // |
        //Estructuras de control
        if (respuesta) {
            //bloque de codigo
        }
        if (respuesta) {
            //bloque de codigo si se cumple
        } else if(respuesta){
            //bloque de codigo si no se cumple
        }
        
    }
}
/* MANEJO DE GITHUB 
git init
git remote add origin https://github.com/manuelguancha/minticc2.git
git add .
git remote remove https://github.com/manuelguancha/minticc2.git
git commit -m "first commit"

git config user.email "manuelguancha@gmail.com"
git config user.name "manuelguancha"

git status
git commit -m "first commit" 
git push -u origin master
Select an authentication method for 'https://github.com/':
  1. Web browser (default)
  2. Personal access token
option (enter for default): 1
https://github.com/manuelguancha/minticc2.git

----------------------------------------------------------------
1. git init
2. git add .
3. git config user.email "manuelguancha@gmail.com"
4. git config user.name "manuelguancha"
5. git status
6. git commit -m "3er commit" 
7. git push -u origin master

UNA VEZ INICIADO Y DADO EL PRIMER PUSH PASO 1 A 7
ojo LUEGO SOLO 
2. git add . 
6. git commit -m "Actualizacion" 
7. git push origin master

*/